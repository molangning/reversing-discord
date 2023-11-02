package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p176ja.C8878a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0682c<V> {

    /* renamed from: a */
    private int f13061a;

    /* renamed from: b */
    private int f13062b;

    /* renamed from: c */
    private int f13063c;

    /* renamed from: d */
    private ViewPropertyAnimator f13064d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4755a extends AnimatorListenerAdapter {
        C4755a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f13064d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f13061a = 0;
        this.f13062b = 2;
        this.f13063c = 0;
    }

    /* renamed from: F */
    private void m27842F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f13064d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C4755a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: A */
    public boolean mo27761A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public boolean m27841G() {
        return this.f13062b == 1;
    }

    /* renamed from: H */
    public boolean m27840H() {
        return this.f13062b == 2;
    }

    /* renamed from: I */
    public void m27839I(V v, int i) {
        this.f13063c = i;
        if (this.f13062b == 1) {
            v.setTranslationY(this.f13061a + i);
        }
    }

    /* renamed from: J */
    public void m27838J(V v) {
        m27837K(v, true);
    }

    /* renamed from: K */
    public void m27837K(V v, boolean z) {
        if (m27841G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f13064d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f13062b = 1;
        int i = this.f13061a + this.f13063c;
        if (z) {
            m27842F(v, i, 175L, C8878a.f23262c);
        } else {
            v.setTranslationY(i);
        }
    }

    /* renamed from: L */
    public void m27836L(V v) {
        m27835M(v, true);
    }

    /* renamed from: M */
    public void m27835M(V v, boolean z) {
        if (m27840H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f13064d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f13062b = 2;
        if (z) {
            m27842F(v, 0, 225L, C8878a.f23263d);
        } else {
            v.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: l */
    public boolean mo26481l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f13061a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo26481l(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: t */
    public void mo27700t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            m27838J(v);
        } else if (i2 < 0) {
            m27836L(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13061a = 0;
        this.f13062b = 2;
        this.f13063c = 0;
    }
}
