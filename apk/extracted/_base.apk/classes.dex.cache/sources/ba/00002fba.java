package com.swmansion.reanimated.layoutReanimation;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.reanimated.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SharedTransitionManager {
    private final AnimationsManager mAnimationsManager;
    private boolean mIsSharedTransitionActive;
    private NativeMethodsHolder mNativeMethodsHolder;
    private View mTransitionContainer;
    private final List<View> mAddedSharedViews = new ArrayList();
    private final Map<Integer, View> mSharedTransitionParent = new HashMap();
    private final Map<Integer, Integer> mSharedTransitionInParentIndex = new HashMap();
    private final Map<Integer, Snapshot> mSnapshotRegistry = new HashMap();
    private final Map<Integer, View> mCurrentSharedTransitionViews = new HashMap();
    private final List<View> mRemovedSharedViews = new ArrayList();
    private final Set<Integer> mViewTagsToHide = new HashSet();
    private final Map<Integer, Integer> mDisableCleaningForViewTag = new HashMap();
    private List<SharedElement> mSharedElements = new ArrayList();
    private Map<Integer, SharedElement> mSharedElementsLookup = new HashMap();
    private final List<SharedElement> mSharedElementsWithProgress = new ArrayList();
    private final List<SharedElement> mSharedElementsWithAnimation = new ArrayList();
    private final Map<Integer, View> mViewsWithCanceledAnimation = new HashMap();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class ConfigCleanerTreeVisitor implements TreeVisitor {
        ConfigCleanerTreeVisitor() {
            SharedTransitionManager.this = r1;
        }

        @Override // com.swmansion.reanimated.layoutReanimation.SharedTransitionManager.TreeVisitor
        public void run(View view) {
            SharedTransitionManager.this.mNativeMethodsHolder.clearAnimationConfig(view.getId());
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class SnapshotTreeVisitor implements TreeVisitor {
        SnapshotTreeVisitor() {
            SharedTransitionManager.this = r1;
        }

        @Override // com.swmansion.reanimated.layoutReanimation.SharedTransitionManager.TreeVisitor
        public void run(View view) {
            if (SharedTransitionManager.this.mAnimationsManager.hasAnimationForTag(view.getId(), 4)) {
                SharedTransitionManager.this.mRemovedSharedViews.add(view);
                SharedTransitionManager.this.makeSnapshot(view);
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface TreeVisitor {
        void run(View view);
    }

    public SharedTransitionManager(AnimationsManager animationsManager) {
        this.mAnimationsManager = animationsManager;
    }

    private void cancelAnimation(View view) {
        this.mNativeMethodsHolder.cancelAnimation(view.getId());
    }

    private void clearAllSharedConfigsForView(View view) {
        int id2 = view.getId();
        this.mSnapshotRegistry.remove(Integer.valueOf(id2));
        this.mNativeMethodsHolder.clearAnimationConfig(id2);
    }

    private void disableCleaningForViewTag(int i) {
        Integer num = this.mDisableCleaningForViewTag.get(Integer.valueOf(i));
        if (num != null) {
            this.mDisableCleaningForViewTag.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
        } else {
            this.mDisableCleaningForViewTag.put(Integer.valueOf(i), 1);
        }
    }

    private void enableCleaningForViewTag(int i) {
        Integer num = this.mDisableCleaningForViewTag.get(Integer.valueOf(i));
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            this.mDisableCleaningForViewTag.remove(Integer.valueOf(i));
        } else {
            this.mDisableCleaningForViewTag.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    private View findScreen(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getSimpleName().equals("Screen")) {
                return (View) parent;
            }
        }
        return null;
    }

    private View findStack(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getSimpleName().equals("ScreenStack")) {
                return (View) parent;
            }
        }
        return null;
    }

    private List<SharedElement> getSharedElementsForCurrentTransition(List<View> list, boolean z) {
        boolean z2;
        View resolveView;
        ViewGroup viewGroup;
        ViewGroupManager viewGroupManager;
        int childCount;
        boolean z3;
        ArrayList<View> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (!z) {
            for (View view : list) {
                hashSet.add(Integer.valueOf(view.getId()));
            }
        }
        ArrayList<SharedElement> arrayList2 = new ArrayList();
        ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager = this.mAnimationsManager.getReanimatedNativeHierarchyManager();
        for (View view2 : list) {
            int findPrecedingViewTagForTransition = this.mNativeMethodsHolder.findPrecedingViewTagForTransition(view2.getId());
            if (!z && hashSet.contains(Integer.valueOf(findPrecedingViewTagForTransition))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (findPrecedingViewTagForTransition >= 0) {
                if (z) {
                    View resolveView2 = reanimatedNativeHierarchyManager.resolveView(findPrecedingViewTagForTransition);
                    resolveView = view2;
                    view2 = resolveView2;
                } else {
                    resolveView = reanimatedNativeHierarchyManager.resolveView(findPrecedingViewTagForTransition);
                }
                if (z2) {
                    clearAllSharedConfigsForView(view2);
                    clearAllSharedConfigsForView(resolveView);
                } else {
                    boolean containsKey = this.mCurrentSharedTransitionViews.containsKey(Integer.valueOf(view2.getId()));
                    boolean containsKey2 = this.mCurrentSharedTransitionViews.containsKey(Integer.valueOf(resolveView.getId()));
                    if (!containsKey && !containsKey2) {
                        View findScreen = findScreen(view2);
                        View findScreen2 = findScreen(resolveView);
                        if (findScreen != null && findScreen2 != null && (viewGroup = (ViewGroup) findStack(findScreen)) != null && (childCount = (viewGroupManager = (ViewGroupManager) reanimatedNativeHierarchyManager.resolveViewManager(viewGroup.getId())).getChildCount((ViewGroupManager) viewGroup)) >= 2) {
                            View childAt = viewGroupManager.getChildAt((ViewGroupManager) viewGroup, childCount - 1);
                            View childAt2 = viewGroupManager.getChildAt((ViewGroupManager) viewGroup, childCount - 2);
                            if (!z ? !(childAt.getId() != findScreen.getId() || childAt2.getId() != findScreen2.getId()) : !(childAt2.getId() != findScreen.getId() || childAt.getId() != findScreen2.getId())) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                            }
                        }
                    }
                    Snapshot snapshot = null;
                    if (z) {
                        this.mViewTagsToHide.add(Integer.valueOf(view2.getId()));
                        if (containsKey) {
                            snapshot = new Snapshot(view2);
                        } else {
                            makeSnapshot(view2);
                        }
                        makeSnapshot(resolveView);
                    } else if (containsKey) {
                        makeSnapshot(view2);
                    }
                    if (snapshot == null) {
                        snapshot = this.mSnapshotRegistry.get(Integer.valueOf(view2.getId()));
                    }
                    arrayList.add(view2);
                    arrayList.add(resolveView);
                    arrayList2.add(new SharedElement(view2, snapshot, resolveView, this.mSnapshotRegistry.get(Integer.valueOf(resolveView.getId()))));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (View view3 : this.mCurrentSharedTransitionViews.values()) {
                if (arrayList.contains(view3)) {
                    disableCleaningForViewTag(view3.getId());
                } else {
                    this.mViewsWithCanceledAnimation.put(Integer.valueOf(view3.getId()), view3);
                }
            }
            this.mCurrentSharedTransitionViews.clear();
            for (View view4 : arrayList) {
                this.mCurrentSharedTransitionViews.put(Integer.valueOf(view4.getId()), view4);
            }
            for (View view5 : new ArrayList(this.mViewsWithCanceledAnimation.values())) {
                cancelAnimation(view5);
                finishSharedAnimation(view5.getId());
            }
        }
        this.mSharedElements = arrayList2;
        for (SharedElement sharedElement : arrayList2) {
            this.mSharedElementsLookup.put(Integer.valueOf(sharedElement.sourceView.getId()), sharedElement);
        }
        return arrayList2;
    }

    private boolean isViewChildParentWithTag(View view, int i) {
        Object obj = this.mSharedTransitionParent.get(Integer.valueOf(view.getId()));
        while (true) {
            View view2 = (View) obj;
            if (view2 == null) {
                return false;
            }
            if (view2.getId() == i) {
                return true;
            }
            if (view2.getClass().getSimpleName().equals("Screen")) {
                return false;
            }
            obj = view2.getParent();
        }
    }

    public /* synthetic */ void lambda$finishSharedAnimation$1(ViewParent viewParent) {
        ((ViewGroup) viewParent).removeView(this.mTransitionContainer);
        this.mTransitionContainer.setVisibility(0);
    }

    public static /* synthetic */ int lambda$sortViewsByTags$0(View view, View view2) {
        return Integer.compare(view2.getId(), view.getId());
    }

    private void maybeRestartAnimationWithNewLayout(View view) {
        View view2 = this.mCurrentSharedTransitionViews.get(Integer.valueOf(view.getId()));
        if (view2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SharedElement sharedElement : this.mSharedElements) {
            if (sharedElement.targetView == view2) {
                arrayList.add(sharedElement);
                View view3 = sharedElement.sourceView;
                View view4 = sharedElement.targetView;
                Snapshot snapshot = new Snapshot(view3);
                Snapshot snapshot2 = this.mSnapshotRegistry.get(Integer.valueOf(view4.getId()));
                Snapshot snapshot3 = new Snapshot(view4);
                int i = (snapshot2.originX - snapshot2.originXByParent) + snapshot3.originX;
                int i2 = (snapshot2.originY - snapshot2.originYByParent) + snapshot3.originY;
                snapshot2.originX = i;
                snapshot2.originY = i2;
                snapshot2.globalOriginX = i;
                snapshot2.globalOriginY = i2;
                snapshot2.originXByParent = snapshot3.originXByParent;
                snapshot2.originYByParent = snapshot3.originYByParent;
                snapshot2.height = snapshot3.height;
                snapshot2.width = snapshot3.width;
                sharedElement.sourceViewSnapshot = snapshot;
                sharedElement.targetViewSnapshot = snapshot2;
                disableCleaningForViewTag(view3.getId());
                disableCleaningForViewTag(view4.getId());
            }
        }
        startSharedTransition(arrayList, 4);
    }

    private void reparentSharedViewsForCurrentTransition(List<SharedElement> list) {
        for (SharedElement sharedElement : list) {
            View view = sharedElement.sourceView;
            if (!this.mSharedTransitionParent.containsKey(Integer.valueOf(view.getId()))) {
                this.mSharedTransitionParent.put(Integer.valueOf(view.getId()), (View) view.getParent());
                this.mSharedTransitionInParentIndex.put(Integer.valueOf(view.getId()), Integer.valueOf(((ViewGroup) view.getParent()).indexOfChild(view)));
                ((ViewGroup) view.getParent()).removeView(view);
                ((ViewGroup) this.mTransitionContainer).addView(view);
            }
        }
    }

    private void setupTransitionContainer() {
        if (!this.mIsSharedTransitionActive) {
            this.mIsSharedTransitionActive = true;
            ReactContext context = this.mAnimationsManager.getContext();
            Activity currentActivity = context.getCurrentActivity();
            if (currentActivity == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView().getRootView();
            if (this.mTransitionContainer == null) {
                this.mTransitionContainer = new ReactViewGroup(context);
            }
            viewGroup.addView(this.mTransitionContainer);
            this.mTransitionContainer.bringToFront();
        }
    }

    private void sortViewsByTags(List<View> list) {
        Collections.sort(list, new Comparator() { // from class: com.swmansion.reanimated.layoutReanimation.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortViewsByTags$0;
                lambda$sortViewsByTags$0 = SharedTransitionManager.lambda$sortViewsByTags$0((View) obj, (View) obj2);
                return lambda$sortViewsByTags$0;
            }
        });
    }

    private void startSharedAnimationForView(View view, Snapshot snapshot, Snapshot snapshot2, int i) {
        HashMap<String, Object> targetMap = snapshot2.toTargetMap();
        HashMap<String, Object> prepareDataForAnimationWorklet = this.mAnimationsManager.prepareDataForAnimationWorklet(snapshot.toCurrentMap(), false, true);
        HashMap<String, Object> hashMap = new HashMap<>(this.mAnimationsManager.prepareDataForAnimationWorklet(targetMap, true, true));
        hashMap.putAll(prepareDataForAnimationWorklet);
        this.mNativeMethodsHolder.startAnimation(view.getId(), i, hashMap);
    }

    private void startSharedTransition(List<SharedElement> list, int i) {
        for (SharedElement sharedElement : list) {
            startSharedAnimationForView(sharedElement.sourceView, sharedElement.sourceViewSnapshot, sharedElement.targetViewSnapshot, i);
            sharedElement.targetView.setVisibility(4);
        }
    }

    private boolean tryStartSharedTransitionForViews(List<View> list, boolean z) {
        if (list.isEmpty()) {
            return false;
        }
        sortViewsByTags(list);
        List<SharedElement> sharedElementsForCurrentTransition = getSharedElementsForCurrentTransition(list, z);
        if (sharedElementsForCurrentTransition.isEmpty()) {
            return false;
        }
        setupTransitionContainer();
        reparentSharedViewsForCurrentTransition(sharedElementsForCurrentTransition);
        orderByAnimationTypes(sharedElementsForCurrentTransition);
        startSharedTransition(this.mSharedElementsWithAnimation, 4);
        startSharedTransition(this.mSharedElementsWithProgress, 5);
        return true;
    }

    private void visitTree(View view, TreeVisitor treeVisitor) {
        ViewGroupManager viewGroupManager;
        int id2 = view.getId();
        if (id2 == -1) {
            return;
        }
        ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager = this.mAnimationsManager.getReanimatedNativeHierarchyManager();
        try {
            treeVisitor.run(view);
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            ViewManager resolveViewManager = reanimatedNativeHierarchyManager.resolveViewManager(id2);
            if (resolveViewManager instanceof ViewGroupManager) {
                viewGroupManager = (ViewGroupManager) resolveViewManager;
            } else {
                viewGroupManager = null;
            }
            if (viewGroupManager == null) {
                return;
            }
            for (int i = 0; i < viewGroupManager.getChildCount((ViewGroupManager) viewGroup); i++) {
                visitTree(viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i), treeVisitor);
            }
        } catch (IllegalViewOperationException unused) {
        }
    }

    public void doSnapshotForTopScreenViews(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof ViewGroup) {
                visitNativeTreeAndMakeSnapshot(((ViewGroup) childAt).getChildAt(0));
            } else {
                Log.e("[Reanimated]", "Unable to recognize screen on stack.");
            }
        }
    }

    public void finishSharedAnimation(int i) {
        final ViewParent parent;
        if (this.mDisableCleaningForViewTag.containsKey(Integer.valueOf(i))) {
            enableCleaningForViewTag(i);
            return;
        }
        View view = this.mCurrentSharedTransitionViews.get(Integer.valueOf(i));
        if (view == null && (view = this.mViewsWithCanceledAnimation.get(Integer.valueOf(i))) != null) {
            this.mViewsWithCanceledAnimation.remove(Integer.valueOf(view.getId()));
        }
        if (view != null) {
            int id2 = view.getId();
            ((ViewGroup) this.mTransitionContainer).removeView(view);
            int intValue = this.mSharedTransitionInParentIndex.get(Integer.valueOf(id2)).intValue();
            ViewGroup viewGroup = (ViewGroup) this.mSharedTransitionParent.get(Integer.valueOf(id2));
            if (intValue <= viewGroup.getChildCount()) {
                viewGroup.addView(view, intValue);
            } else {
                viewGroup.addView(view);
            }
            Snapshot snapshot = this.mSnapshotRegistry.get(Integer.valueOf(id2));
            if (snapshot != null) {
                int i2 = snapshot.originY;
                if (findStack(view) == null) {
                    snapshot.originY = snapshot.originYByParent;
                }
                HashMap<String, Object> basicMap = snapshot.toBasicMap();
                HashMap hashMap = new HashMap();
                for (String str : basicMap.keySet()) {
                    Object obj = basicMap.get(str);
                    if (str.equals(Snapshot.TRANSFORM_MATRIX)) {
                        hashMap.put(str, obj);
                    } else {
                        hashMap.put(str, Double.valueOf(PixelUtil.toDIPFromPixel(Utils.convertToFloat(obj))));
                    }
                }
                this.mAnimationsManager.progressLayoutAnimation(id2, hashMap, true);
                snapshot.originY = i2;
            }
            if (this.mViewTagsToHide.contains(Integer.valueOf(i))) {
                view.setVisibility(4);
            }
            SharedElement sharedElement = this.mSharedElementsLookup.get(Integer.valueOf(id2));
            if (sharedElement != null) {
                View view2 = sharedElement.targetView;
                Integer valueOf = Integer.valueOf(view2.getId());
                view2.setVisibility(0);
                this.mCurrentSharedTransitionViews.remove(valueOf);
                this.mViewsWithCanceledAnimation.remove(valueOf);
            }
            this.mCurrentSharedTransitionViews.remove(Integer.valueOf(id2));
            this.mSharedTransitionParent.remove(Integer.valueOf(id2));
            this.mSharedTransitionInParentIndex.remove(Integer.valueOf(id2));
            if (this.mRemovedSharedViews.contains(view)) {
                this.mNativeMethodsHolder.clearAnimationConfig(view.getId());
                this.mRemovedSharedViews.remove(view);
            }
        }
        if (this.mCurrentSharedTransitionViews.isEmpty()) {
            View view3 = this.mTransitionContainer;
            if (view3 != null && (parent = view3.getParent()) != null) {
                this.mTransitionContainer.setVisibility(4);
                this.mTransitionContainer.post(new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedTransitionManager.this.lambda$finishSharedAnimation$1(parent);
                    }
                });
            }
            this.mSharedElements.clear();
            this.mSharedElementsLookup.clear();
            this.mSharedElementsWithProgress.clear();
            this.mSharedElementsWithAnimation.clear();
            this.mRemovedSharedViews.clear();
            this.mViewTagsToHide.clear();
            this.mIsSharedTransitionActive = false;
        }
    }

    public View getTransitioningView(int i) {
        return this.mCurrentSharedTransitionViews.get(Integer.valueOf(i));
    }

    public void makeSnapshot(View view) {
        this.mSnapshotRegistry.put(Integer.valueOf(view.getId()), new Snapshot(view));
    }

    public void notifyAboutNewView(View view) {
        this.mAddedSharedViews.add(view);
    }

    public void notifyAboutRemovedView(View view) {
        this.mRemovedSharedViews.add(view);
    }

    public void onViewsRemoval(int[] iArr) {
        if (iArr == null) {
            return;
        }
        visitTreeForTags(iArr, new SnapshotTreeVisitor());
        if (this.mRemovedSharedViews.size() > 0) {
            if (!tryStartSharedTransitionForViews(this.mRemovedSharedViews, false)) {
                this.mRemovedSharedViews.clear();
            }
            visitTreeForTags(iArr, new ConfigCleanerTreeVisitor());
        } else if (this.mCurrentSharedTransitionViews.size() > 0) {
            ArrayList<View> arrayList = new ArrayList();
            for (View view : this.mCurrentSharedTransitionViews.values()) {
                for (int i : iArr) {
                    if (isViewChildParentWithTag(view, i)) {
                        arrayList.add(view);
                    }
                }
            }
            tryStartSharedTransitionForViews(arrayList, false);
            for (View view2 : arrayList) {
                clearAllSharedConfigsForView(view2);
            }
        }
    }

    void orderByAnimationTypes(List<SharedElement> list) {
        this.mSharedElementsWithProgress.clear();
        this.mSharedElementsWithAnimation.clear();
        for (SharedElement sharedElement : list) {
            if (this.mAnimationsManager.hasAnimationForTag(sharedElement.sourceView.getId(), 5)) {
                this.mSharedElementsWithProgress.add(sharedElement);
            } else {
                this.mSharedElementsWithAnimation.add(sharedElement);
            }
        }
    }

    public void screenDidLayout() {
        tryStartSharedTransitionForViews(this.mAddedSharedViews, true);
        this.mAddedSharedViews.clear();
    }

    public void setNativeMethods(NativeMethodsHolder nativeMethodsHolder) {
        this.mNativeMethodsHolder = nativeMethodsHolder;
    }

    public void viewDidLayout(View view) {
        maybeRestartAnimationWithNewLayout(view);
    }

    void visitNativeTreeAndMakeSnapshot(View view) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (this.mAnimationsManager.hasAnimationForTag(view.getId(), 4)) {
            makeSnapshot(view);
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            visitNativeTreeAndMakeSnapshot(viewGroup.getChildAt(i));
        }
    }

    protected void visitTreeForTags(int[] iArr, TreeVisitor treeVisitor) {
        if (iArr == null) {
            return;
        }
        ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager = this.mAnimationsManager.getReanimatedNativeHierarchyManager();
        for (int i : iArr) {
            visitTree(reanimatedNativeHierarchyManager.resolveView(i), treeVisitor);
        }
    }
}