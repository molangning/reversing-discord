package com.swmansion.reanimated.layoutReanimation;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.IViewManagerWithChildren;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.swmansion.reanimated.AndroidUIScheduler;
import com.swmansion.reanimated.Utils;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AnimationsManager implements ViewHierarchyObserver {
    private ReactContext mContext;
    private NativeMethodsHolder mNativeMethodsHolder;
    private ReanimatedNativeHierarchyManager mReanimatedNativeHierarchyManager;
    private UIManagerModule mUIManager;
    private WeakReference<AndroidUIScheduler> mWeakAndroidUIScheduler;
    private HashSet<Integer> mEnteringViews = new HashSet<>();
    private HashMap<Integer, Rect> mEnteringViewTargetValues = new HashMap<>();
    private HashMap<Integer, View> mExitingViews = new HashMap<>();
    private HashMap<Integer, Integer> mExitingSubviewCountMap = new HashMap<>();
    private HashSet<Integer> mAncestorsToRemove = new HashSet<>();
    private HashMap<Integer, Runnable> mCallbacks = new HashMap<>();
    private boolean isCatalystInstanceDestroyed = false;
    private SharedTransitionManager mSharedTransitionManager = new SharedTransitionManager(this);

    public AnimationsManager(ReactContext reactContext, UIManagerModule uIManagerModule) {
        this.mContext = reactContext;
        this.mUIManager = uIManagerModule;
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
        } else if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof ReadableArray) {
            writableMap.putArray(str, (ReadableArray) obj);
        } else if (obj instanceof ReadableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
        } else {
            throw new IllegalStateException("[Reanimated] Unknown type of animated value for Layout Animations.");
        }
    }

    private void checkDuplicateSharedTag(View view) {
        int id2 = view.getId();
        ViewParent parent = view.getParent();
        while (parent != null && !parent.getClass().getSimpleName().equals("Screen")) {
            parent = parent.getParent();
        }
        if (parent != null) {
            this.mNativeMethodsHolder.checkDuplicateSharedTag(id2, ((View) parent).getId());
        }
    }

    private static Point convertScreenLocationToViewCoordinates(Point point, View view) {
        int[] iArr = {0, 0};
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return new Point(point.x - iArr[0], point.y - iArr[1]);
    }

    private void maybeDropAncestors(View view) {
        int i;
        if (!(view.getParent() instanceof View)) {
            return;
        }
        View view2 = (View) view.getParent();
        while (view2 != null && !(view2 instanceof RootView)) {
            View view3 = (View) view2.getParent();
            int id2 = view2.getId();
            Integer num = this.mExitingSubviewCountMap.get(Integer.valueOf(id2));
            if (num != null) {
                i = num.intValue() - 1;
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() <= 0) {
                if (this.mAncestorsToRemove.contains(Integer.valueOf(id2))) {
                    this.mAncestorsToRemove.remove(Integer.valueOf(id2));
                    if (!this.mExitingViews.containsKey(Integer.valueOf(id2))) {
                        removeView(view2, (ViewGroup) view3);
                    }
                }
                this.mExitingSubviewCountMap.remove(Integer.valueOf(id2));
            } else {
                this.mExitingSubviewCountMap.put(Integer.valueOf(id2), valueOf);
            }
            view2 = view3;
        }
    }

    private void registerExitingAncestors(View view) {
        for (View view2 = (View) view.getParent(); view2 != null && !(view2 instanceof RootView); view2 = (View) view2.getParent()) {
            int id2 = view2.getId();
            Integer num = this.mExitingSubviewCountMap.get(Integer.valueOf(id2));
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            this.mExitingSubviewCountMap.put(Integer.valueOf(id2), Integer.valueOf(i));
        }
    }

    private boolean removeOrAnimateExitRecursive(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int id2 = view.getId();
        ViewManager resolveViewManager = resolveViewManager(id2);
        if (resolveViewManager != null) {
            String name = resolveViewManager.getName();
            if (name.equals(ReactModalHostManager.REACT_CLASS) || name.equals(ScreenViewManager.REACT_CLASS) || name.equals(ScreenStackViewManager.REACT_CLASS)) {
                cancelAnimationsRecursive(view);
                return false;
            }
        }
        if (!hasAnimationForTag(id2, 2) && !this.mExitingViews.containsKey(Integer.valueOf(id2))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (hasAnimationForTag(id2, 4)) {
            this.mSharedTransitionManager.notifyAboutRemovedView(view);
            this.mSharedTransitionManager.makeSnapshot(view);
        }
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            z4 = false;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (removeOrAnimateExitRecursive(childAt, z3)) {
                    z4 = true;
                } else if (z3 && childAt.getId() != -1) {
                    arrayList.add(childAt);
                }
            }
        } else {
            z4 = false;
        }
        if (!z2 && !z4) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z2) {
            HashMap<String, Object> prepareDataForAnimationWorklet = prepareDataForAnimationWorklet(new Snapshot(view, this.mReanimatedNativeHierarchyManager).toCurrentMap(), false);
            if (!this.mExitingViews.containsKey(Integer.valueOf(id2))) {
                this.mExitingViews.put(Integer.valueOf(id2), view);
                registerExitingAncestors(view);
                this.mNativeMethodsHolder.startAnimation(id2, 2, prepareDataForAnimationWorklet);
            }
        }
        this.mNativeMethodsHolder.clearAnimationConfig(id2);
        if (!z5) {
            return false;
        }
        if (z4) {
            if (id2 == -1) {
                cancelAnimationsRecursive(view);
                return false;
            }
            this.mAncestorsToRemove.add(Integer.valueOf(id2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((View) it.next(), (ViewGroup) view);
        }
        return true;
    }

    private void removeView(View view, ViewGroup viewGroup) {
        int id2 = view.getId();
        if (this.mCallbacks.containsKey(Integer.valueOf(id2))) {
            Runnable runnable = this.mCallbacks.get(Integer.valueOf(id2));
            this.mCallbacks.remove(Integer.valueOf(id2));
            if (runnable != null) {
                runnable.run();
            }
        } else {
            this.mReanimatedNativeHierarchyManager.publicDropView(view);
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    private View resolveView(int i) {
        if (this.mExitingViews.containsKey(Integer.valueOf(i))) {
            return this.mExitingViews.get(Integer.valueOf(i));
        }
        View transitioningView = this.mSharedTransitionManager.getTransitioningView(i);
        if (transitioningView != null) {
            return transitioningView;
        }
        try {
            return this.mUIManager.resolveView(i);
        } catch (IllegalViewOperationException unused) {
            return null;
        }
    }

    private ViewManager resolveViewManager(int i) {
        try {
            return this.mReanimatedNativeHierarchyManager.resolveViewManager(i);
        } catch (Exception unused) {
            return null;
        }
    }

    public void cancelAnimationsInSubviews(View view) {
        cancelAnimationsRecursive(view);
        clearAnimationConfigRecursive(view);
    }

    public void cancelAnimationsRecursive(View view) {
        if (this.mExitingViews.containsKey(Integer.valueOf(view.getId()))) {
            endLayoutAnimation(view.getId(), true);
        } else if ((view instanceof ViewGroup) && this.mExitingSubviewCountMap.containsKey(Integer.valueOf(view.getId()))) {
            cancelAnimationsInSubviews((ViewGroup) view);
        }
    }

    public void clearAnimationConfigRecursive(View view) {
        this.mNativeMethodsHolder.clearAnimationConfig(view.getId());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                clearAnimationConfigRecursive(viewGroup.getChildAt(i));
            }
        }
    }

    public void endLayoutAnimation(int i, boolean z) {
        View resolveView = resolveView(i);
        if (resolveView == null) {
            return;
        }
        Rect rect = this.mEnteringViewTargetValues.get(Integer.valueOf(i));
        if (!z && this.mEnteringViews.contains(Integer.valueOf(i)) && rect != null) {
            resolveView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        this.mEnteringViews.remove(Integer.valueOf(i));
        this.mEnteringViewTargetValues.remove(Integer.valueOf(i));
        if (z) {
            if ((resolveView instanceof ViewGroup) && this.mAncestorsToRemove.contains(Integer.valueOf(i))) {
                cancelAnimationsInSubviews((ViewGroup) resolveView);
            }
            this.mExitingViews.remove(Integer.valueOf(i));
            maybeDropAncestors(resolveView);
            removeView(resolveView, (ViewGroup) resolveView.getParent());
        }
        this.mSharedTransitionManager.finishSharedAnimation(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReactContext getContext() {
        return this.mContext;
    }

    public ReanimatedNativeHierarchyManager getReanimatedNativeHierarchyManager() {
        return this.mReanimatedNativeHierarchyManager;
    }

    public boolean hasAnimationForTag(int i, int i2) {
        return this.mNativeMethodsHolder.hasAnimation(i, i2);
    }

    public boolean isLayoutAnimationEnabled() {
        NativeMethodsHolder nativeMethodsHolder = this.mNativeMethodsHolder;
        return nativeMethodsHolder != null && nativeMethodsHolder.isLayoutAnimationEnabled();
    }

    public void makeSnapshotOfTopScreenViews(ViewGroup viewGroup) {
        this.mSharedTransitionManager.doSnapshotForTopScreenViews(viewGroup);
    }

    public void maybeRegisterSharedView(View view) {
        if (hasAnimationForTag(view.getId(), 4)) {
            this.mSharedTransitionManager.notifyAboutNewView(view);
        }
    }

    public void notifyAboutViewsRemoval(int[] iArr) {
        this.mSharedTransitionManager.onViewsRemoval(iArr);
    }

    public void onCatalystInstanceDestroy() {
        this.isCatalystInstanceDestroyed = true;
        this.mNativeMethodsHolder = null;
        this.mContext = null;
        this.mUIManager = null;
        this.mExitingViews = null;
        this.mExitingSubviewCountMap = null;
        this.mAncestorsToRemove = null;
        this.mCallbacks = null;
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewCreate(View view, ViewGroup viewGroup, Snapshot snapshot) {
        if (this.isCatalystInstanceDestroyed) {
            return;
        }
        maybeRegisterSharedView(view);
        if (!hasAnimationForTag(view.getId(), 1)) {
            return;
        }
        AndroidUIScheduler androidUIScheduler = this.mWeakAndroidUIScheduler.get();
        if (androidUIScheduler != null) {
            androidUIScheduler.triggerUI();
        }
        int id2 = view.getId();
        HashMap<String, Object> targetMap = snapshot.toTargetMap();
        if (targetMap != null) {
            this.mNativeMethodsHolder.startAnimation(id2, 1, prepareDataForAnimationWorklet(targetMap, true));
            this.mEnteringViews.add(Integer.valueOf(id2));
        }
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewRemoval(View view, ViewGroup viewGroup, Runnable runnable) {
        if (this.isCatalystInstanceDestroyed) {
            return;
        }
        this.mCallbacks.put(Integer.valueOf(view.getId()), runnable);
        if (!removeOrAnimateExitRecursive(view, true)) {
            removeView(view, viewGroup);
        }
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewUpdate(View view, Snapshot snapshot, Snapshot snapshot2) {
        if (this.isCatalystInstanceDestroyed) {
            return;
        }
        int id2 = view.getId();
        if (!hasAnimationForTag(id2, 3)) {
            if (this.mEnteringViews.contains(Integer.valueOf(id2))) {
                HashMap<Integer, Rect> hashMap = this.mEnteringViewTargetValues;
                Integer valueOf = Integer.valueOf(id2);
                int i = snapshot2.originX;
                int i2 = snapshot2.originY;
                hashMap.put(valueOf, new Rect(i, i2, snapshot2.width + i, snapshot2.height + i2));
                int i3 = snapshot.originX;
                int i4 = snapshot.originY;
                view.layout(i3, i4, snapshot.width + i3, snapshot.height + i4);
                return;
            }
            return;
        }
        HashMap<String, Object> currentMap = snapshot.toCurrentMap();
        HashMap<String, Object> targetMap = snapshot2.toTargetMap();
        boolean z = true;
        for (int i5 = 0; i5 < Snapshot.targetKeysToTransform.size(); i5++) {
            if (((Number) currentMap.get(Snapshot.currentKeysToTransform.get(i5))).doubleValue() != ((Number) targetMap.get(Snapshot.targetKeysToTransform.get(i5))).doubleValue()) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        HashMap<String, Object> prepareDataForAnimationWorklet = prepareDataForAnimationWorklet(currentMap, false);
        HashMap<String, Object> hashMap2 = new HashMap<>(prepareDataForAnimationWorklet(targetMap, true));
        for (String str : prepareDataForAnimationWorklet.keySet()) {
            hashMap2.put(str, prepareDataForAnimationWorklet.get(str));
        }
        this.mNativeMethodsHolder.startAnimation(id2, 3, hashMap2);
    }

    public HashMap<String, Object> prepareDataForAnimationWorklet(HashMap<String, Object> hashMap, boolean z) {
        return prepareDataForAnimationWorklet(hashMap, z, false);
    }

    public void printSubTree(View view, int i) {
        if (i == 0) {
            Log.v("rea", "----------------------");
        }
        if (view == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb2.append("+");
        }
        sb2.append(" TAG:");
        sb2.append(view.getId());
        sb2.append(" CLASS:");
        sb2.append(view.getClass().getSimpleName());
        Log.v("rea", sb2.toString());
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i2 < viewGroup.getChildCount()) {
                printSubTree(viewGroup.getChildAt(i2), i + 1);
                i2++;
            } else {
                return;
            }
        }
    }

    public void progressLayoutAnimation(int i, Map<String, Object> map, boolean z) {
        ViewGroup viewGroup;
        View resolveView = resolveView(i);
        if (resolveView == null || (viewGroup = (ViewGroup) resolveView.getParent()) == null) {
            return;
        }
        ViewManager resolveViewManager = resolveViewManager(i);
        ViewManager resolveViewManager2 = resolveViewManager(viewGroup.getId());
        if (resolveViewManager == null) {
            return;
        }
        setNewProps(map, resolveView, resolveViewManager, resolveViewManager2, Integer.valueOf(viewGroup.getId()), z);
    }

    public void screenDidLayout() {
        this.mSharedTransitionManager.screenDidLayout();
    }

    public void setAndroidUIScheduler(AndroidUIScheduler androidUIScheduler) {
        this.mWeakAndroidUIScheduler = new WeakReference<>(androidUIScheduler);
    }

    public void setNativeMethods(NativeMethodsHolder nativeMethodsHolder) {
        this.mNativeMethodsHolder = nativeMethodsHolder;
        this.mSharedTransitionManager.setNativeMethods(nativeMethodsHolder);
    }

    public void setNewProps(Map<String, Object> map, View view, ViewManager viewManager, ViewManager viewManager2, Integer num, boolean z) {
        float dIPFromPixel;
        float dIPFromPixel2;
        float dIPFromPixel3;
        float dIPFromPixel4;
        if (map.get(Snapshot.ORIGIN_X) != null) {
            dIPFromPixel = ((Double) map.get(Snapshot.ORIGIN_X)).floatValue();
        } else {
            dIPFromPixel = PixelUtil.toDIPFromPixel(view.getLeft());
        }
        float f = dIPFromPixel;
        if (map.get(Snapshot.ORIGIN_Y) != null) {
            dIPFromPixel2 = ((Double) map.get(Snapshot.ORIGIN_Y)).floatValue();
        } else {
            dIPFromPixel2 = PixelUtil.toDIPFromPixel(view.getTop());
        }
        float f2 = dIPFromPixel2;
        if (map.get("width") != null) {
            dIPFromPixel3 = ((Double) map.get("width")).floatValue();
        } else {
            dIPFromPixel3 = PixelUtil.toDIPFromPixel(view.getWidth());
        }
        float f3 = dIPFromPixel3;
        if (map.get("height") != null) {
            dIPFromPixel4 = ((Double) map.get("height")).floatValue();
        } else {
            dIPFromPixel4 = PixelUtil.toDIPFromPixel(view.getHeight());
        }
        float f4 = dIPFromPixel4;
        if (map.containsKey(Snapshot.TRANSFORM_MATRIX)) {
            float[] fArr = new float[9];
            if (map.get(Snapshot.TRANSFORM_MATRIX) instanceof ReadableNativeArray) {
                ReadableNativeArray readableNativeArray = (ReadableNativeArray) map.get(Snapshot.TRANSFORM_MATRIX);
                for (int i = 0; i < 9; i++) {
                    fArr[i] = Double.valueOf(readableNativeArray.getDouble(i)).floatValue();
                }
            } else {
                ArrayList arrayList = (ArrayList) map.get(Snapshot.TRANSFORM_MATRIX);
                for (int i2 = 0; i2 < 9; i2++) {
                    fArr[i2] = ((Float) arrayList.get(i2)).floatValue();
                }
            }
            view.setScaleX(fArr[0]);
            view.setScaleY(fArr[4]);
            map.remove(Snapshot.TRANSFORM_MATRIX);
        }
        updateLayout(view, viewManager2, num.intValue(), f, f2, f3, f4, z);
        map.remove(Snapshot.ORIGIN_X);
        map.remove(Snapshot.ORIGIN_Y);
        map.remove(Snapshot.GLOBAL_ORIGIN_X);
        map.remove(Snapshot.GLOBAL_ORIGIN_Y);
        map.remove("width");
        map.remove("height");
        if (map.size() == 0) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (String str : map.keySet()) {
            addProp(javaOnlyMap, str, map.get(str));
        }
        viewManager.updateProperties(view, new ReactStylesDiffMap(javaOnlyMap));
    }

    public void setReanimatedNativeHierarchyManager(ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager) {
        this.mReanimatedNativeHierarchyManager = reanimatedNativeHierarchyManager;
    }

    public void updateLayout(View view, ViewManager viewManager, int i, float f, float f2, float f3, float f4, boolean z) {
        int round = Math.round(PixelUtil.toPixelFromDIP(f));
        int round2 = Math.round(PixelUtil.toPixelFromDIP(f2));
        int round3 = Math.round(PixelUtil.toPixelFromDIP(f3));
        int round4 = Math.round(PixelUtil.toPixelFromDIP(f4));
        view.measure(View.MeasureSpec.makeMeasureSpec(round3, 1073741824), View.MeasureSpec.makeMeasureSpec(round4, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof RootView) {
            parent.requestLayout();
        }
        if (i % 10 == 1 && viewManager != null) {
            if (viewManager instanceof IViewManagerWithChildren) {
                if (!((IViewManagerWithChildren) viewManager).needsCustomLayoutForChildren()) {
                    view.layout(round, round2, round3 + round, round4 + round2);
                    return;
                }
                return;
            }
            throw new IllegalViewOperationException("[Reanimated] Trying to use view with tag " + i + " as a parent, but its Manager doesn't implement IViewManagerWithChildren.");
        }
        if (z) {
            Point convertScreenLocationToViewCoordinates = convertScreenLocationToViewCoordinates(new Point(round, round2), (View) view.getParent());
            round = convertScreenLocationToViewCoordinates.x;
            round2 = convertScreenLocationToViewCoordinates.y;
        }
        view.layout(round, round2, round3 + round, round4 + round2);
    }

    public void viewDidLayout(View view) {
        this.mSharedTransitionManager.viewDidLayout(view);
    }

    public HashMap<String, Object> prepareDataForAnimationWorklet(HashMap<String, Object> hashMap, boolean z, boolean z2) {
        ArrayList<String> arrayList;
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (z) {
            arrayList = Snapshot.targetKeysToTransform;
        } else {
            arrayList = Snapshot.currentKeysToTransform;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            hashMap2.put(next, Float.valueOf(PixelUtil.toDIPFromPixel(Utils.convertToFloat(hashMap.get(next)))));
        }
        if (z2) {
            String str = z ? Snapshot.TARGET_TRANSFORM_MATRIX : Snapshot.CURRENT_TRANSFORM_MATRIX;
            hashMap2.put(str, hashMap.get(str));
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            hashMap2.put("windowWidth", Float.valueOf(PixelUtil.toDIPFromPixel(displayMetrics.widthPixels)));
            hashMap2.put("windowHeight", Float.valueOf(PixelUtil.toDIPFromPixel(i)));
        } else {
            hashMap2.put("windowWidth", Float.valueOf(PixelUtil.toDIPFromPixel(0.0f)));
            hashMap2.put("windowHeight", Float.valueOf(PixelUtil.toDIPFromPixel(0.0f)));
        }
        return hashMap2;
    }

    private void cancelAnimationsInSubviews(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt != null) {
                if (this.mExitingViews.containsKey(Integer.valueOf(childAt.getId()))) {
                    endLayoutAnimation(childAt.getId(), true);
                } else if ((childAt instanceof ViewGroup) && this.mExitingSubviewCountMap.containsKey(Integer.valueOf(childAt.getId()))) {
                    cancelAnimationsInSubviews((ViewGroup) childAt);
                }
            }
        }
    }
}
