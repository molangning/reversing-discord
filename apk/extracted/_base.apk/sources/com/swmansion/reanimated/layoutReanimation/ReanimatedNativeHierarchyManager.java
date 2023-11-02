package com.swmansion.reanimated.layoutReanimation;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.ViewAtIndex;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReanimatedNativeHierarchyManager extends NativeViewHierarchyManager {
    private final HashMap<Integer, Runnable> cleanerCallback;
    private boolean initOk;
    private final HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final ReaLayoutAnimator mReaLayoutAnimator;
    private final HashMap<Integer, ArrayList<View>> toBeRemoved;

    public ReanimatedNativeHierarchyManager(ViewManagerRegistry viewManagerRegistry, ReactApplicationContext reactApplicationContext) {
        super(viewManagerRegistry);
        this.toBeRemoved = new HashMap<>();
        this.cleanerCallback = new HashMap<>();
        this.mPendingDeletionsForTag = new HashMap<>();
        this.initOk = true;
        this.mReaLayoutAnimator = new ReaLayoutAnimator(reactApplicationContext, this);
        Class<? super Object> superclass = getClass().getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve super class of ReanimatedNativeHierarchyManager");
            return;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mLayoutAnimator");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
            }
            declaredField.set(this, this.mReaLayoutAnimator);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            this.initOk = false;
            e2.printStackTrace();
        }
        try {
            Field declaredField3 = superclass.getDeclaredField("mPendingDeletionsForTag");
            declaredField3.setAccessible(true);
            try {
                Field declaredField4 = Field.class.getDeclaredField("accessFlags");
                declaredField4.setAccessible(true);
                declaredField4.setInt(declaredField3, declaredField3.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e3) {
                e3.printStackTrace();
            }
            declaredField3.set(this, this.mPendingDeletionsForTag);
        } catch (IllegalAccessException | NoSuchFieldException e4) {
            this.initOk = false;
            e4.printStackTrace();
        }
        if (this.initOk) {
            setLayoutAnimationEnabled(true);
        }
    }

    private boolean checkIfTopScreenHasHeader(ViewGroup viewGroup) {
        try {
            View childAt = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            Field declaredField = childAt.getClass().getDeclaredField("mIsHidden");
            declaredField.setAccessible(true);
            return !declaredField.getBoolean(childAt);
        } catch (IllegalAccessException | NoSuchFieldException | NullPointerException unused) {
            return false;
        }
    }

    private boolean isLayoutAnimationDisabled() {
        return (this.initOk && this.mReaLayoutAnimator.isLayoutAnimationEnabled()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$manageChildren$0(ArrayList arrayList, View view, ViewGroupManager viewGroupManager, ViewGroup viewGroup) {
        arrayList.remove(view);
        viewGroupManager.removeView(viewGroup, view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public synchronized void dropView(View view) {
        if (isLayoutAnimationDisabled()) {
            super.dropView(view);
            return;
        }
        if (this.toBeRemoved.containsKey(Integer.valueOf(view.getId()))) {
            this.toBeRemoved.remove(Integer.valueOf(view.getId()));
        }
        if (this.cleanerCallback.containsKey(Integer.valueOf(view.getId()))) {
            this.cleanerCallback.remove(Integer.valueOf(view.getId()));
            this.cleanerCallback.get(Integer.valueOf(view.getId())).run();
        }
        super.dropView(view);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public synchronized void manageChildren(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        Set<Integer> set;
        if (isLayoutAnimationDisabled()) {
            super.manageChildren(i, iArr, viewAtIndexArr, iArr2);
            return;
        }
        try {
            final ViewGroup viewGroup = (ViewGroup) resolveView(i);
            final ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
            AnimationsManager animationsManager = this.mReaLayoutAnimator.getAnimationsManager();
            int i2 = 0;
            if (viewGroupManager.getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                if (iArr2 == null) {
                    animationsManager.makeSnapshotOfTopScreenViews(viewGroup);
                } else {
                    animationsManager.notifyAboutViewsRemoval(iArr2);
                }
                if (iArr != null && (this.mReaLayoutAnimator instanceof ReaLayoutAnimator)) {
                    int length = iArr.length;
                    while (i2 < length) {
                        this.mReaLayoutAnimator.getAnimationsManager().cancelAnimationsInSubviews(viewGroupManager.getChildAt((ViewGroupManager) viewGroup, iArr[i2]));
                        i2++;
                    }
                }
                super.manageChildren(i, iArr, viewAtIndexArr, iArr2);
                return;
            }
            if (this.toBeRemoved.containsKey(Integer.valueOf(i))) {
                HashSet hashSet = new HashSet();
                Iterator<View> it = this.toBeRemoved.get(Integer.valueOf(i)).iterator();
                while (it.hasNext()) {
                    hashSet.add(Integer.valueOf(it.next().getId()));
                }
                while (viewGroupManager.getChildCount((ViewGroupManager) viewGroup) != 0 && hashSet.contains(Integer.valueOf(viewGroupManager.getChildAt((ViewGroupManager) viewGroup, viewGroupManager.getChildCount((ViewGroupManager) viewGroup) - 1).getId()))) {
                    viewGroupManager.removeViewAt((ViewGroupManager) viewGroup, viewGroupManager.getChildCount((ViewGroupManager) viewGroup) - 1);
                }
            }
            if (iArr2 != null) {
                if (!this.toBeRemoved.containsKey(Integer.valueOf(i))) {
                    this.toBeRemoved.put(Integer.valueOf(i), new ArrayList<>());
                }
                final ArrayList<View> arrayList = this.toBeRemoved.get(Integer.valueOf(i));
                int length2 = iArr2.length;
                while (i2 < length2) {
                    try {
                        final View resolveView = resolveView(Integer.valueOf(iArr2[i2]).intValue());
                        arrayList.add(resolveView);
                        this.cleanerCallback.put(Integer.valueOf(resolveView.getId()), new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                ReanimatedNativeHierarchyManager.lambda$manageChildren$0(arrayList, resolveView, viewGroupManager, viewGroup);
                            }
                        });
                    } catch (IllegalViewOperationException e) {
                        e.printStackTrace();
                    }
                    i2++;
                }
            }
            HashMap<Integer, Set<Integer>> hashMap = this.mPendingDeletionsForTag;
            if (hashMap != null && (set = hashMap.get(Integer.valueOf(i))) != null) {
                set.clear();
            }
            animationsManager.notifyAboutViewsRemoval(iArr2);
            super.manageChildren(i, iArr, viewAtIndexArr, null);
            if (this.toBeRemoved.containsKey(Integer.valueOf(i))) {
                Iterator<View> it2 = this.toBeRemoved.get(Integer.valueOf(i)).iterator();
                while (it2.hasNext()) {
                    viewGroupManager.addView((ViewGroupManager) viewGroup, it2.next(), viewGroupManager.getChildCount((ViewGroupManager) viewGroup));
                }
            }
            super.manageChildren(i, null, null, iArr2);
        } catch (IllegalViewOperationException e2) {
            e2.printStackTrace();
            super.manageChildren(i, iArr, viewAtIndexArr, iArr2);
        }
    }

    public void publicDropView(View view) {
        dropView(view);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public synchronized void updateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        ReaLayoutAnimator reaLayoutAnimator;
        super.updateLayout(i, i2, i3, i4, i5, i6);
        if (isLayoutAnimationDisabled()) {
            return;
        }
        try {
            String name = resolveViewManager(i2).getName();
            View resolveView = resolveView(i);
            if (resolveView != null && name.equals(ScreenViewManager.REACT_CLASS) && this.mReaLayoutAnimator != null && (!checkIfTopScreenHasHeader((ViewGroup) resolveView) || !resolveView.isLayoutRequested())) {
                this.mReaLayoutAnimator.getAnimationsManager().screenDidLayout();
            }
            View resolveView2 = resolveView(i2);
            if (resolveView2 != null && (reaLayoutAnimator = this.mReaLayoutAnimator) != null) {
                reaLayoutAnimator.getAnimationsManager().viewDidLayout(resolveView2);
            }
        } catch (IllegalViewOperationException e) {
            e.printStackTrace();
        }
    }
}
