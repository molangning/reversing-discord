package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p176ja.C8879b;
import p176ja.C8886i;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C8886i f14216c;

    /* renamed from: d */
    private final C8886i f14217d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5043a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f14218a;

        /* renamed from: b */
        final /* synthetic */ View f14219b;

        C5043a(boolean z, View view) {
            this.f14218a = z;
            this.f14219b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f14218a) {
                this.f14219b.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f14218a) {
                this.f14219b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f14216c = new C8886i(75L, 150L);
        this.f14217d = new C8886i(0L, 150L);
    }

    /* renamed from: K */
    private void m26455K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        C8886i c8886i;
        ObjectAnimator ofFloat;
        if (z) {
            c8886i = this.f14216c;
        } else {
            c8886i = this.f14217d;
        }
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        c8886i.m17090a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: D */
    public boolean mo26457D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo26457D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo26456J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m26455K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C8879b.m17109a(animatorSet, arrayList);
        animatorSet.addListener(new C5043a(z, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: e */
    public boolean mo26454e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14216c = new C8886i(75L, 150L);
        this.f14217d = new C8886i(0L, 150L);
    }
}
