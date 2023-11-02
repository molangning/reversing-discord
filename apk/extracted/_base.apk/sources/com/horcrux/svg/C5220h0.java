package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5220h0 extends C5244t0 {

    /* renamed from: A */
    private EnumC5237p0 f14660A;

    /* renamed from: B */
    private EnumC5242s0 f14661B;

    /* renamed from: w */
    private String f14662w;

    /* renamed from: x */
    private EnumC5240r0 f14663x;

    /* renamed from: y */
    private EnumC5239q0 f14664y;

    /* renamed from: z */
    private SVGLength f14665z;

    public C5220h0(ReactContext reactContext) {
        super(reactContext);
        this.f14660A = EnumC5237p0.align;
        this.f14661B = EnumC5242s0.exact;
    }

    @Override // com.horcrux.svg.C5244t0
    /* renamed from: C */
    public void mo25721C(String str) {
        this.f14660A = EnumC5237p0.valueOf(str);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public EnumC5239q0 m25882N() {
        return this.f14664y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public EnumC5240r0 m25881O() {
        return this.f14663x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public SVGLength m25880P() {
        return this.f14665z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public Path m25879Q(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f14662w);
        if (!(definedTemplate instanceof RenderableView)) {
            return null;
        }
        return ((RenderableView) definedTemplate).getPath(canvas, paint);
    }

    /* renamed from: R */
    public void m25878R(String str) {
        this.f14662w = str;
        invalidate();
    }

    /* renamed from: S */
    public void m25877S(String str) {
        this.f14664y = EnumC5239q0.valueOf(str);
        invalidate();
    }

    /* renamed from: T */
    public void m25876T(String str) {
        this.f14663x = EnumC5240r0.valueOf(str);
        invalidate();
    }

    /* renamed from: U */
    public void m25875U(String str) {
        this.f14661B = EnumC5242s0.valueOf(str);
        invalidate();
    }

    /* renamed from: V */
    public void m25874V(Dynamic dynamic) {
        this.f14665z = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: W */
    public void m25873W(Double d) {
        this.f14665z = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: X */
    public void m25872X(String str) {
        this.f14665z = SVGLength.m25996e(str);
        invalidate();
    }

    @Override // com.horcrux.svg.C5244t0, com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f) {
        mo25837b(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5227l
    /* renamed from: g */
    public void mo25833g() {
    }

    @Override // com.horcrux.svg.C5244t0, com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return m25706n(canvas, paint);
    }

    @Override // com.horcrux.svg.C5244t0, com.horcrux.svg.C5227l
    /* renamed from: h */
    void mo25709h() {
    }
}
