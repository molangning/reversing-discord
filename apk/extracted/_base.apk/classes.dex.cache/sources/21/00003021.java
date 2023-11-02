package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\b\u0010\u0006\u001a\u00020\u0003H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0016J.\u0010\u000e\u001a\u00020\u00032&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tj\u0004\u0018\u0001`\fR6\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "b", "onAttachedToWindow", "onDetachedFromWindow", "", "onPreDraw", "Lkotlin/Function3;", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "Lcom/th3rdwave/safeareacontext/Rect;", "Lcom/th3rdwave/safeareacontext/OnInsetsChangeHandler;", "handler", "setOnInsetsChangeHandler", "j", "Lkotlin/jvm/functions/Function3;", "mInsetsChangeHandler", "k", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "mLastInsets", "l", "Lcom/th3rdwave/safeareacontext/Rect;", "mLastFrame", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SafeAreaProvider extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: j */
    private Function3<? super SafeAreaProvider, ? super EdgeInsets, ? super Rect, Unit> f15830j;

    /* renamed from: k */
    private EdgeInsets f15831k;

    /* renamed from: l */
    private Rect f15832l;

    public SafeAreaProvider(Context context) {
        super(context);
    }

    /* renamed from: b */
    private final void m24785b() {
        EdgeInsets m24775e;
        Function3<? super SafeAreaProvider, ? super EdgeInsets, ? super Rect, Unit> function3 = this.f15830j;
        if (function3 == null || (m24775e = C5671e.m24775e(this)) == null) {
            return;
        }
        View rootView = getRootView();
        C9612q.m13919f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        Rect m24779a = C5671e.m24779a((ViewGroup) rootView, this);
        if (m24779a == null) {
            return;
        }
        if (!C9612q.m13922c(this.f15831k, m24775e) || !C9612q.m13922c(this.f15832l, m24779a)) {
            function3.invoke(this, m24775e, m24779a);
            this.f15831k = m24775e;
            this.f15832l = m24779a;
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        m24785b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m24785b();
        return true;
    }

    public final void setOnInsetsChangeHandler(Function3<? super SafeAreaProvider, ? super EdgeInsets, ? super Rect, Unit> function3) {
        this.f15830j = function3;
        m24785b();
    }
}