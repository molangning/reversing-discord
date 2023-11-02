package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.AbstractC1905b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4938i<T extends Animator> {

    /* renamed from: a */
    protected C4939j f13861a;

    /* renamed from: b */
    protected final float[] f13862b;

    /* renamed from: c */
    protected final int[] f13863c;

    public AbstractC4938i(int i) {
        this.f13862b = new float[i * 2];
        this.f13863c = new int[i];
    }

    /* renamed from: a */
    public abstract void mo26852a();

    /* renamed from: b */
    public float m26851b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    /* renamed from: c */
    public abstract void mo26850c();

    /* renamed from: d */
    public abstract void mo26849d(AbstractC1905b abstractC1905b);

    /* renamed from: e */
    public void m26848e(C4939j c4939j) {
        this.f13861a = c4939j;
    }

    /* renamed from: f */
    public abstract void mo26847f();

    /* renamed from: g */
    public abstract void mo26846g();

    /* renamed from: h */
    public abstract void mo26845h();
}