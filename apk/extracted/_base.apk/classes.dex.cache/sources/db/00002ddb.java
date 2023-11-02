package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5232n extends RenderableView {

    /* renamed from: j */
    private SVGLength f14775j;

    /* renamed from: k */
    private SVGLength f14776k;

    /* renamed from: l */
    private SVGLength f14777l;

    /* renamed from: m */
    private SVGLength f14778m;

    public C5232n(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: b */
    public void m25809b(Dynamic dynamic) {
        this.f14775j = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: c */
    public void m25808c(Double d) {
        this.f14775j = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: d */
    public void m25807d(String str) {
        this.f14775j = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: e */
    public void m25806e(Dynamic dynamic) {
        this.f14777l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: f */
    public void m25805f(Double d) {
        this.f14777l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: g */
    public void m25804g(String str) {
        this.f14777l = SVGLength.m25996e(str);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f14775j);
        double relativeOnHeight = relativeOnHeight(this.f14776k);
        double relativeOnWidth2 = relativeOnWidth(this.f14777l);
        double relativeOnHeight2 = relativeOnHeight(this.f14778m);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        ArrayList<C5241s> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C5241s(EnumC5213f.kCGPathElementMoveToPoint, new C5249w[]{new C5249w(relativeOnWidth, relativeOnHeight)}));
        this.elements.add(new C5241s(EnumC5213f.kCGPathElementAddLineToPoint, new C5249w[]{new C5249w(relativeOnWidth2, relativeOnHeight2)}));
        return path;
    }

    /* renamed from: h */
    public void m25803h(Dynamic dynamic) {
        this.f14776k = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: i */
    public void m25802i(Double d) {
        this.f14776k = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: j */
    public void m25801j(String str) {
        this.f14776k = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: k */
    public void m25800k(Dynamic dynamic) {
        this.f14778m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: l */
    public void m25799l(Double d) {
        this.f14778m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: m */
    public void m25798m(String str) {
        this.f14778m = SVGLength.m25996e(str);
        invalidate();
    }
}