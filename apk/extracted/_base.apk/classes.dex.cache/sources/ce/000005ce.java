package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.view.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC1354u0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: j */
    private final View f3694j;

    /* renamed from: k */
    private ViewTreeObserver f3695k;

    /* renamed from: l */
    private final Runnable f3696l;

    private ViewTreeObserver$OnPreDrawListenerC1354u0(View view, Runnable runnable) {
        this.f3694j = view;
        this.f3695k = view.getViewTreeObserver();
        this.f3696l = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC1354u0 m37280a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserver$OnPreDrawListenerC1354u0 viewTreeObserver$OnPreDrawListenerC1354u0 = new ViewTreeObserver$OnPreDrawListenerC1354u0(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC1354u0);
                view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC1354u0);
                return viewTreeObserver$OnPreDrawListenerC1354u0;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: b */
    public void m37279b() {
        if (this.f3695k.isAlive()) {
            this.f3695k.removeOnPreDrawListener(this);
        } else {
            this.f3694j.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3694j.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m37279b();
        this.f3696l.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3695k = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m37279b();
    }
}