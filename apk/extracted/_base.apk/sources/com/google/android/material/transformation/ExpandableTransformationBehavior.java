package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    private AnimatorSet f14195b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5037a extends AnimatorListenerAdapter {
        C5037a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f14195b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo26453H(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.f14195b;
        if (animatorSet != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet mo26456J = mo26456J(view, view2, z, z3);
        this.f14195b = mo26456J;
        mo26456J.addListener(new C5037a());
        this.f14195b.start();
        if (!z2) {
            this.f14195b.end();
        }
        return true;
    }

    /* renamed from: J */
    protected abstract AnimatorSet mo26456J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
