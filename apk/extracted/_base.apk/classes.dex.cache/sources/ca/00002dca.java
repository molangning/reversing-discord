package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5215g extends RenderableView {

    /* renamed from: j */
    private SVGLength f14629j;

    /* renamed from: k */
    private SVGLength f14630k;

    /* renamed from: l */
    private SVGLength f14631l;

    /* renamed from: m */
    private SVGLength f14632m;

    public C5215g(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: b */
    public void m25911b(Dynamic dynamic) {
        this.f14629j = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: c */
    public void m25910c(Double d) {
        this.f14629j = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: d */
    public void m25909d(String str) {
        this.f14629j = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: e */
    public void m25908e(Dynamic dynamic) {
        this.f14630k = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: f */
    public void m25907f(Double d) {
        this.f14630k = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: g */
    public void m25906g(String str) {
        this.f14630k = SVGLength.m25996e(str);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f14629j);
        double relativeOnHeight = relativeOnHeight(this.f14630k);
        double relativeOnWidth2 = relativeOnWidth(this.f14631l);
        double relativeOnHeight2 = relativeOnHeight(this.f14632m);
        double d = relativeOnWidth - relativeOnWidth2;
        double d2 = relativeOnHeight - relativeOnHeight2;
        double d3 = relativeOnWidth2 + relativeOnWidth;
        double d4 = relativeOnHeight2 + relativeOnHeight;
        path.addOval(new RectF((float) d, (float) d2, (float) d3, (float) d4), Path.Direction.CW);
        ArrayList<C5241s> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C5241s(EnumC5213f.kCGPathElementMoveToPoint, new C5249w[]{new C5249w(relativeOnWidth, d2)}));
        ArrayList<C5241s> arrayList2 = this.elements;
        EnumC5213f enumC5213f = EnumC5213f.kCGPathElementAddLineToPoint;
        arrayList2.add(new C5241s(enumC5213f, new C5249w[]{new C5249w(relativeOnWidth, d2), new C5249w(d3, relativeOnHeight)}));
        this.elements.add(new C5241s(enumC5213f, new C5249w[]{new C5249w(d3, relativeOnHeight), new C5249w(relativeOnWidth, d4)}));
        this.elements.add(new C5241s(enumC5213f, new C5249w[]{new C5249w(relativeOnWidth, d4), new C5249w(d, relativeOnHeight)}));
        this.elements.add(new C5241s(enumC5213f, new C5249w[]{new C5249w(d, relativeOnHeight), new C5249w(relativeOnWidth, d2)}));
        return path;
    }

    /* renamed from: h */
    public void m25905h(Dynamic dynamic) {
        this.f14631l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: i */
    public void m25904i(Double d) {
        this.f14631l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: j */
    public void m25903j(String str) {
        this.f14631l = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: k */
    public void m25902k(Dynamic dynamic) {
        this.f14632m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: l */
    public void m25901l(Double d) {
        this.f14632m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: m */
    public void m25900m(String str) {
        this.f14632m = SVGLength.m25996e(str);
        invalidate();
    }
}