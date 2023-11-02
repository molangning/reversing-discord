package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import p012ab.InterfaceC0138b;
import za.C14143b;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4881b extends C4867a {
    public C4881b(FloatingActionButton floatingActionButton, InterfaceC0138b interfaceC0138b) {
        super(floatingActionButton, interfaceC0138b);
    }

    /* renamed from: f0 */
    private Animator m27089f0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f13605v, ViewProps.ELEVATION, f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f13605v, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C4867a.f13575C);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: A */
    public void mo27096A() {
        m27125c0();
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: C */
    public void mo27095C(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: D */
    void mo27094D(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C4867a.f13576D, m27089f0(f, f3));
        stateListAnimator.addState(C4867a.f13577E, m27089f0(f, f2));
        stateListAnimator.addState(C4867a.f13578F, m27089f0(f, f2));
        stateListAnimator.addState(C4867a.f13579G, m27089f0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f13605v, ViewProps.ELEVATION, f).setDuration(0L));
        if (i <= 24) {
            FloatingActionButton floatingActionButton = this.f13605v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f13605v, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C4867a.f13575C);
        stateListAnimator.addState(C4867a.f13580H, animatorSet);
        stateListAnimator.addState(C4867a.f13581I, m27089f0(0.0f, 0.0f));
        this.f13605v.setStateListAnimator(stateListAnimator);
        if (mo27091W()) {
            m27125c0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: I */
    boolean mo27093I() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: S */
    public void mo27092S(ColorStateList colorStateList) {
        Drawable drawable = this.f13586c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C14143b.m590a(colorStateList));
        } else {
            super.mo27092S(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: W */
    boolean mo27091W() {
        return this.f13606w.mo27150c() || !m27131Y();
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: a0 */
    void mo27090a0() {
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: m */
    public float mo27088m() {
        return this.f13605v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: r */
    public void mo27087r(Rect rect) {
        if (this.f13606w.mo27150c()) {
            super.mo27087r(rect);
        } else if (!m27131Y()) {
            int sizeDimension = (this.f13593j - this.f13605v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4867a
    /* renamed from: y */
    public void mo27086y() {
    }
}