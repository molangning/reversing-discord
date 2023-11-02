package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4899i {

    /* renamed from: a */
    private final ArrayList<C4901b> f13749a = new ArrayList<>();

    /* renamed from: b */
    private C4901b f13750b = null;

    /* renamed from: c */
    ValueAnimator f13751c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f13752d = new C4900a();

    /* renamed from: com.google.android.material.internal.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4900a extends AnimatorListenerAdapter {
        C4900a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4899i c4899i = C4899i.this;
            if (c4899i.f13751c == animator) {
                c4899i.f13751c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C4901b {

        /* renamed from: a */
        final int[] f13754a;

        /* renamed from: b */
        final ValueAnimator f13755b;

        C4901b(int[] iArr, ValueAnimator valueAnimator) {
            this.f13754a = iArr;
            this.f13755b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void m26973a(int[] iArr, ValueAnimator valueAnimator) {
        C4901b c4901b = new C4901b(iArr, valueAnimator);
        valueAnimator.addListener(this.f13752d);
        this.f13749a.add(c4901b);
    }
}
