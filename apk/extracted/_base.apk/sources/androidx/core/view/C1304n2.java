package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.n2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1304n2 {

    /* renamed from: a */
    private final WeakReference<View> f3651a;

    /* renamed from: b */
    Runnable f3652b = null;

    /* renamed from: c */
    Runnable f3653c = null;

    /* renamed from: d */
    int f3654d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.n2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1305a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1311o2 f3655a;

        /* renamed from: b */
        final /* synthetic */ View f3656b;

        C1305a(InterfaceC1311o2 interfaceC1311o2, View view) {
            this.f3655a = interfaceC1311o2;
            this.f3656b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3655a.mo37350a(this.f3656b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3655a.mo37354b(this.f3656b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3655a.mo37349c(this.f3656b);
        }
    }

    /* renamed from: androidx.core.view.n2$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1306b {
        /* renamed from: a */
        static ViewPropertyAnimator m37358a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1304n2(View view) {
        this.f3651a = new WeakReference<>(view);
    }

    /* renamed from: i */
    private void m37363i(View view, InterfaceC1311o2 interfaceC1311o2) {
        if (interfaceC1311o2 != null) {
            view.animate().setListener(new C1305a(interfaceC1311o2, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: b */
    public C1304n2 m37370b(float f) {
        View view = this.f3651a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void m37369c() {
        View view = this.f3651a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m37368d() {
        View view = this.f3651a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public C1304n2 m37366f(long j) {
        View view = this.f3651a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public C1304n2 m37365g(Interpolator interpolator) {
        View view = this.f3651a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C1304n2 m37364h(InterfaceC1311o2 interfaceC1311o2) {
        View view = this.f3651a.get();
        if (view != null) {
            m37363i(view, interfaceC1311o2);
        }
        return this;
    }

    /* renamed from: j */
    public C1304n2 m37362j(long j) {
        View view = this.f3651a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public C1304n2 m37361k(final InterfaceC1321q2 interfaceC1321q2) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = this.f3651a.get();
        if (view != null) {
            if (interfaceC1321q2 != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.m2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        InterfaceC1321q2.this.mo37345a(view);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            C1306b.m37358a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    /* renamed from: l */
    public void m37360l() {
        View view = this.f3651a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C1304n2 m37359m(float f) {
        View view = this.f3651a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
