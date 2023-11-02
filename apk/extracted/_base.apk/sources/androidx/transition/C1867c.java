package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1365w0;

/* renamed from: androidx.transition.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1867c extends AbstractC1850a0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1868a extends C1880i {

        /* renamed from: a */
        final /* synthetic */ View f5163a;

        C1868a(View view) {
            this.f5163a = view;
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionEnd(Transition transition) {
            C1895t.m35095g(this.f5163a, 1.0f);
            C1895t.m35101a(this.f5163a);
            transition.mo35142S(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1869b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f5165a;

        /* renamed from: b */
        private boolean f5166b = false;

        C1869b(View view) {
            this.f5165a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1895t.m35095g(this.f5165a, 1.0f);
            if (this.f5166b) {
                this.f5165a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C1365w0.m37228Q(this.f5165a) && this.f5165a.getLayerType() == 0) {
                this.f5166b = true;
                this.f5165a.setLayerType(2, null);
            }
        }
    }

    public C1867c(int i) {
        m35197l0(i);
    }

    /* renamed from: m0 */
    private Animator m35173m0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1895t.m35095g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1895t.f5213b, f2);
        ofFloat.addListener(new C1869b(view));
        mo35134b(new C1868a(view));
        return ofFloat;
    }

    /* renamed from: n0 */
    private static float m35172n0(C1888m c1888m, float f) {
        Float f2;
        if (c1888m != null && (f2 = (Float) c1888m.f5202a.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    @Override // androidx.transition.AbstractC1850a0
    /* renamed from: h0 */
    public Animator mo35175h0(ViewGroup viewGroup, View view, C1888m c1888m, C1888m c1888m2) {
        float f = 0.0f;
        float m35172n0 = m35172n0(c1888m, 0.0f);
        if (m35172n0 != 1.0f) {
            f = m35172n0;
        }
        return m35173m0(view, f, 1.0f);
    }

    @Override // androidx.transition.AbstractC1850a0
    /* renamed from: j0 */
    public Animator mo35174j0(ViewGroup viewGroup, View view, C1888m c1888m, C1888m c1888m2) {
        C1895t.m35097e(view);
        return m35173m0(view, m35172n0(c1888m, 1.0f), 0.0f);
    }

    @Override // androidx.transition.AbstractC1850a0, androidx.transition.Transition
    /* renamed from: l */
    public void mo35121l(C1888m c1888m) {
        super.mo35121l(c1888m);
        c1888m.f5202a.put("android:fade:transitionAlpha", Float.valueOf(C1895t.m35099c(c1888m.f5203b)));
    }

    public C1867c() {
    }
}
