package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.transition.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1849a {
    /* renamed from: a */
    public static void m35205a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    public static void m35204b(Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    public static void m35203c(Animator animator) {
        animator.resume();
    }
}