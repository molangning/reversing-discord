package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5210d0 extends C5227l {

    /* renamed from: l */
    private float f14617l;

    /* renamed from: m */
    private float f14618m;

    /* renamed from: n */
    private float f14619n;

    /* renamed from: o */
    private float f14620o;

    /* renamed from: p */
    private String f14621p;

    /* renamed from: q */
    private int f14622q;

    public C5210d0(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    /* renamed from: l */
    public void m25914l(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.f14621p != null) {
            float f4 = this.f14617l;
            float f5 = this.mScale;
            float f6 = this.f14618m;
            canvas.concat(C5248v0.m25664a(new RectF(f4 * f5, f6 * f5, (f4 + this.f14619n) * f5, (f6 + this.f14620o) * f5), new RectF(0.0f, 0.0f, f2, f3), this.f14621p, this.f14622q));
            super.draw(canvas, paint, f);
        }
    }

    public void setAlign(String str) {
        this.f14621p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.f14622q = i;
        invalidate();
    }

    public void setMinX(float f) {
        this.f14617l = f;
        invalidate();
    }

    public void setMinY(float f) {
        this.f14618m = f;
        invalidate();
    }

    public void setVbHeight(float f) {
        this.f14620o = f;
        invalidate();
    }

    public void setVbWidth(float f) {
        this.f14619n = f;
        invalidate();
    }
}