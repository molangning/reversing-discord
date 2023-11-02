package com.horcrux.svg;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5206b0 extends RenderableView {

    /* renamed from: j */
    private SVGLength f14608j;

    /* renamed from: k */
    private SVGLength f14609k;

    /* renamed from: l */
    private SVGLength f14610l;

    /* renamed from: m */
    private SVGLength f14611m;

    /* renamed from: n */
    private SVGLength f14612n;

    /* renamed from: o */
    private SVGLength f14613o;

    public C5206b0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: b */
    public void m25932b(Dynamic dynamic) {
        this.f14611m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: c */
    public void m25931c(Double d) {
        this.f14611m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: d */
    public void m25930d(String str) {
        this.f14611m = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: e */
    public void m25929e(Dynamic dynamic) {
        this.f14612n = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: f */
    public void m25928f(Double d) {
        this.f14612n = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: g */
    public void m25927g(String str) {
        this.f14612n = SVGLength.m25996e(str);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Path getPath(android.graphics.Canvas r20, android.graphics.Paint r21) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5206b0.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    /* renamed from: h */
    public void m25926h(Dynamic dynamic) {
        this.f14613o = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: i */
    public void m25925i(Double d) {
        this.f14613o = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: j */
    public void m25924j(String str) {
        this.f14613o = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: k */
    public void m25923k(Dynamic dynamic) {
        this.f14610l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: l */
    public void m25922l(Double d) {
        this.f14610l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: m */
    public void m25921m(String str) {
        this.f14610l = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: n */
    public void m25920n(Dynamic dynamic) {
        this.f14608j = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: o */
    public void m25919o(Double d) {
        this.f14608j = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: p */
    public void m25918p(String str) {
        this.f14608j = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: q */
    public void m25917q(Dynamic dynamic) {
        this.f14609k = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: r */
    public void m25916r(Double d) {
        this.f14609k = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: s */
    public void m25915s(String str) {
        this.f14609k = SVGLength.m25996e(str);
        invalidate();
    }
}
