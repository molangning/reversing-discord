package com.facebook.react.views.view;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class ReactClippingViewManager<T extends ReactViewGroup> extends ViewGroupManager<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewGroupManager
    public /* bridge */ /* synthetic */ void addView(View view, View view2, int i) {
        addView((ReactClippingViewManager<T>) ((ReactViewGroup) view), view2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewGroupManager
    public /* bridge */ /* synthetic */ View getChildAt(View view, int i) {
        return getChildAt((ReactClippingViewManager<T>) ((ReactViewGroup) view), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewGroupManager
    public /* bridge */ /* synthetic */ int getChildCount(View view) {
        return getChildCount((ReactClippingViewManager<T>) ((ReactViewGroup) view));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void removeAllViews(ViewGroup viewGroup) {
        removeAllViews((ReactClippingViewManager<T>) ((ReactViewGroup) viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewGroupManager
    public /* bridge */ /* synthetic */ void removeViewAt(View view, int i) {
        removeViewAt((ReactClippingViewManager<T>) ((ReactViewGroup) view), i);
    }

    @ReactProp(name = ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)
    public void setRemoveClippedSubviews(T t, boolean z) {
        UiThreadUtil.assertOnUiThread();
        t.setRemoveClippedSubviews(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void addView(ViewGroup viewGroup, View view, int i) {
        addView((ReactClippingViewManager<T>) ((ReactViewGroup) viewGroup), view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ View getChildAt(ViewGroup viewGroup, int i) {
        return getChildAt((ReactClippingViewManager<T>) ((ReactViewGroup) viewGroup), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ int getChildCount(ViewGroup viewGroup) {
        return getChildCount((ReactClippingViewManager<T>) ((ReactViewGroup) viewGroup));
    }

    public void removeAllViews(T t) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.removeAllViewsWithSubviewClippingEnabled();
        } else {
            t.removeAllViews();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void removeViewAt(ViewGroup viewGroup, int i) {
        removeViewAt((ReactClippingViewManager<T>) ((ReactViewGroup) viewGroup), i);
    }

    public void addView(T t, View view, int i) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.addViewWithSubviewClippingEnabled(view, i);
        } else {
            t.addView(view, i);
        }
    }

    public View getChildAt(T t, int i) {
        if (t.getRemoveClippedSubviews()) {
            return t.getChildAtWithSubviewClippingEnabled(i);
        }
        return t.getChildAt(i);
    }

    public int getChildCount(T t) {
        if (t.getRemoveClippedSubviews()) {
            return t.getAllChildrenCount();
        }
        return t.getChildCount();
    }

    public void removeViewAt(T t, int i) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            View childAt = getChildAt((ReactClippingViewManager<T>) t, i);
            if (childAt.getParent() != null) {
                t.removeView(childAt);
            }
            t.removeViewWithSubviewClippingEnabled(childAt);
            return;
        }
        t.removeViewAt(i);
    }
}
