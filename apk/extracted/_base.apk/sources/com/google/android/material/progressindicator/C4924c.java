package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import pa.C11487a;

/* renamed from: com.google.android.material.progressindicator.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4924c extends AbstractC4937h<C4930e> {

    /* renamed from: c */
    private int f13814c;

    /* renamed from: d */
    private float f13815d;

    /* renamed from: e */
    private float f13816e;

    /* renamed from: f */
    private float f13817f;

    public C4924c(C4930e c4930e) {
        super(c4930e);
        this.f13814c = 1;
    }

    /* renamed from: h */
    private void m26903h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f13817f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: i */
    private int m26902i() {
        S s = this.f13859a;
        return ((C4930e) s).f13833g + (((C4930e) s).f13834h * 2);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4937h
    /* renamed from: a */
    public void mo26859a(Canvas canvas, float f) {
        S s;
        int i;
        S s2 = this.f13859a;
        float f2 = (((C4930e) s2).f13833g / 2.0f) + ((C4930e) s2).f13834h;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        if (((C4930e) this.f13859a).f13835i == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f13814c = i;
        this.f13815d = ((C4930e) s).f13808a * f;
        this.f13816e = ((C4930e) s).f13809b * f;
        this.f13817f = (((C4930e) s).f13833g - ((C4930e) s).f13808a) / 2.0f;
        if ((this.f13860b.mo26842j() && ((C4930e) this.f13859a).f13812e == 2) || (this.f13860b.mo26843i() && ((C4930e) this.f13859a).f13813f == 1)) {
            this.f13817f += ((1.0f - f) * ((C4930e) this.f13859a).f13808a) / 2.0f;
        } else if ((this.f13860b.mo26842j() && ((C4930e) this.f13859a).f13812e == 1) || (this.f13860b.mo26843i() && ((C4930e) this.f13859a).f13813f == 2)) {
            this.f13817f -= ((1.0f - f) * ((C4930e) this.f13859a).f13808a) / 2.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC4937h
    /* renamed from: b */
    public void mo26858b(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f13815d);
        int i2 = this.f13814c;
        float f4 = f * 360.0f * i2;
        if (f2 >= f) {
            f3 = f2 - f;
        } else {
            f3 = (1.0f + f2) - f;
        }
        float f5 = f3 * 360.0f * i2;
        float f6 = this.f13817f;
        canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
        if (this.f13816e > 0.0f && Math.abs(f5) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            m26903h(canvas, paint, this.f13815d, this.f13816e, f4);
            m26903h(canvas, paint, this.f13815d, this.f13816e, f4 + f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC4937h
    /* renamed from: c */
    public void mo26857c(Canvas canvas, Paint paint) {
        int m8019a = C11487a.m8019a(((C4930e) this.f13859a).f13811d, this.f13860b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(m8019a);
        paint.setStrokeWidth(this.f13815d);
        float f = this.f13817f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4937h
    /* renamed from: d */
    public int mo26856d() {
        return m26902i();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4937h
    /* renamed from: e */
    public int mo26855e() {
        return m26902i();
    }
}
