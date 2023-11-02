package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5205b extends RenderableView {

    /* renamed from: j */
    private SVGLength f14605j;

    /* renamed from: k */
    private SVGLength f14606k;

    /* renamed from: l */
    private SVGLength f14607l;

    public C5205b(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: b */
    public void m25941b(Dynamic dynamic) {
        this.f14605j = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: c */
    public void m25940c(Double d) {
        this.f14605j = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: d */
    public void m25939d(String str) {
        this.f14605j = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: e */
    public void m25938e(Dynamic dynamic) {
        this.f14606k = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: f */
    public void m25937f(Double d) {
        this.f14606k = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: g */
    public void m25936g(String str) {
        this.f14606k = SVGLength.m25996e(str);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f14605j);
        double relativeOnHeight = relativeOnHeight(this.f14606k);
        double relativeOnOther = relativeOnOther(this.f14607l);
        path.addCircle((float) relativeOnWidth, (float) relativeOnHeight, (float) relativeOnOther, Path.Direction.CW);
        ArrayList<C5241s> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d = relativeOnHeight - relativeOnOther;
        arrayList.add(new C5241s(EnumC5213f.kCGPathElementMoveToPoint, new C5249w[]{new C5249w(relativeOnWidth, d)}));
        ArrayList<C5241s> arrayList2 = this.elements;
        EnumC5213f enumC5213f = EnumC5213f.kCGPathElementAddLineToPoint;
        double d2 = relativeOnWidth + relativeOnOther;
        arrayList2.add(new C5241s(enumC5213f, new C5249w[]{new C5249w(relativeOnWidth, d), new C5249w(d2, relativeOnHeight)}));
        double d3 = relativeOnHeight + relativeOnOther;
        this.elements.add(new C5241s(enumC5213f, new C5249w[]{new C5249w(d2, relativeOnHeight), new C5249w(relativeOnWidth, d3)}));
        double d4 = relativeOnWidth - relativeOnOther;
        this.elements.add(new C5241s(enumC5213f, new C5249w[]{new C5249w(relativeOnWidth, d3), new C5249w(d4, relativeOnHeight)}));
        this.elements.add(new C5241s(enumC5213f, new C5249w[]{new C5249w(d4, relativeOnHeight), new C5249w(relativeOnWidth, d)}));
        return path;
    }

    /* renamed from: h */
    public void m25935h(Dynamic dynamic) {
        this.f14607l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: i */
    public void m25934i(Double d) {
        this.f14607l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: j */
    public void m25933j(String str) {
        this.f14607l = SVGLength.m25996e(str);
        invalidate();
    }
}
