package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.material.progressindicator.AbstractC4923b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4937h<S extends AbstractC4923b> {

    /* renamed from: a */
    S f13859a;

    /* renamed from: b */
    protected AbstractC4933g f13860b;

    public AbstractC4937h(S s) {
        this.f13859a = s;
    }

    /* renamed from: a */
    abstract void mo26859a(Canvas canvas, float f);

    /* renamed from: b */
    public abstract void mo26858b(Canvas canvas, Paint paint, float f, float f2, int i);

    /* renamed from: c */
    public abstract void mo26857c(Canvas canvas, Paint paint);

    /* renamed from: d */
    public abstract int mo26856d();

    /* renamed from: e */
    public abstract int mo26855e();

    /* renamed from: f */
    public void m26854f(AbstractC4933g abstractC4933g) {
        this.f13860b = abstractC4933g;
    }

    /* renamed from: g */
    public void m26853g(Canvas canvas, float f) {
        this.f13859a.mo26883e();
        mo26859a(canvas, f);
    }
}