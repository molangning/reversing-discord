package com.reactnativecommunity.webview;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ThemedReactContext;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p414x2.C13677a;

/* renamed from: com.reactnativecommunity.webview.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5423b extends FrameLayout {

    /* renamed from: j */
    public int f15379j;

    /* renamed from: k */
    private RNCWebViewManager.C5410f f15380k;

    /* renamed from: com.reactnativecommunity.webview.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class ViewGroup$OnHierarchyChangeListenerC5424a implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC5424a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(C5423b.this.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C5423b.this.getMeasuredHeight(), 1073741824));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }

    /* renamed from: com.reactnativecommunity.webview.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5425b {
        /* renamed from: a */
        void mo25165a(RNCWebViewManager.C5410f c5410f);
    }

    public C5423b(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f15379j = 0;
        setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC5424a());
    }

    /* renamed from: c */
    public static int m25172c(WebView webView) {
        Integer num = C5427b1.f15383a.m25168b().get(Integer.valueOf(webView.getId()));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public void m25174a(RNCWebViewManager.C5410f c5410f) {
        this.f15380k = c5410f;
        if (c5410f.getParent() == null) {
            addView(c5410f, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        throw new IllegalArgumentException("WebView with key: " + c5410f.f15336o + " parent is non null. Cannot re-attach webview.");
    }

    /* renamed from: b */
    public RNCWebViewManager.C5410f m25173b() {
        if (this.f15380k != null) {
            m25170e();
            RNCWebViewManager.C5410f c5410f = this.f15380k;
            this.f15380k = null;
            return c5410f;
        }
        throw new IllegalStateException("Webview is null");
    }

    /* renamed from: d */
    public void m25171d(InterfaceC5425b interfaceC5425b) {
        RNCWebViewManager.C5410f c5410f = this.f15380k;
        if (c5410f != null) {
            interfaceC5425b.mo25165a(c5410f);
        } else {
            C13677a.m1851m("RNCWebViewContainer", new Throwable(), "Internal WebView is null", new Object[0]);
        }
    }

    /* renamed from: e */
    public void m25170e() {
        RNCWebViewManager.C5410f c5410f = this.f15380k;
        if (c5410f != null) {
            endViewTransition(c5410f);
            removeView(this.f15380k);
        }
    }

    public RNCWebViewManager.C5410f getWebView() {
        return this.f15380k;
    }
}
