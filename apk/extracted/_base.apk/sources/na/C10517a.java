package na;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import na.InterfaceC10521d;

/* renamed from: na.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10517a {

    /* renamed from: na.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C10518a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10521d f27495a;

        C10518a(InterfaceC10521d interfaceC10521d) {
            this.f27495a = interfaceC10521d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f27495a.mo9193b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f27495a.mo9194a();
        }
    }

    /* renamed from: a */
    public static Animator m11328a(InterfaceC10521d interfaceC10521d, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC10521d, (Property<InterfaceC10521d, V>) InterfaceC10521d.C10524c.f27499a, (TypeEvaluator) InterfaceC10521d.C10523b.f27497b, (Object[]) new InterfaceC10521d.C10526e[]{new InterfaceC10521d.C10526e(f, f2, f3)});
        InterfaceC10521d.C10526e revealInfo = interfaceC10521d.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC10521d, (int) f, (int) f2, revealInfo.f27503c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m11327b(InterfaceC10521d interfaceC10521d) {
        return new C10518a(interfaceC10521d);
    }
}
