package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, LayoutShadowNode> implements IViewGroupManager<T> {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i) {
        mZIndexHash.put(view, Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.IViewGroupManager
    public /* bridge */ /* synthetic */ void addView(View view, View view2, int i) {
        addView((ViewGroupManager<T>) ((ViewGroup) view), view2, i);
    }

    public void addViews(T t, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addView((ViewGroupManager<T>) t, list.get(i), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.IViewGroupManager
    public /* bridge */ /* synthetic */ View getChildAt(View view, int i) {
        return getChildAt((ViewGroupManager<T>) ((ViewGroup) view), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.IViewGroupManager
    public /* bridge */ /* synthetic */ int getChildCount(View view) {
        return getChildCount((ViewGroupManager<T>) ((ViewGroup) view));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void removeAllViews(T t) {
        UiThreadUtil.assertOnUiThread();
        for (int childCount = getChildCount((ViewGroupManager<T>) t) - 1; childCount >= 0; childCount--) {
            removeViewAt((ViewGroupManager<T>) t, childCount);
        }
    }

    public void removeView(T t, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < getChildCount((ViewGroupManager<T>) t); i++) {
            if (getChildAt((ViewGroupManager<T>) t, i) == view) {
                removeViewAt((ViewGroupManager<T>) t, i);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.IViewGroupManager
    public /* bridge */ /* synthetic */ void removeViewAt(View view, int i) {
        removeViewAt((ViewGroupManager<T>) ((ViewGroup) view), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        updateExtraData((ViewGroupManager<T>) ((ViewGroup) view), obj);
    }

    public void updateExtraData(T t, Object obj) {
    }

    public void addView(T t, View view, int i) {
        t.addView(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    public View getChildAt(T t, int i) {
        return t.getChildAt(i);
    }

    public int getChildCount(T t) {
        return t.getChildCount();
    }

    public void removeViewAt(T t, int i) {
        UiThreadUtil.assertOnUiThread();
        t.removeViewAt(i);
    }
}