package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5244t0 extends C5227l {

    /* renamed from: l */
    SVGLength f14844l;

    /* renamed from: m */
    SVGLength f14845m;

    /* renamed from: n */
    private String f14846n;

    /* renamed from: o */
    EnumC5235o0 f14847o;

    /* renamed from: p */
    private EnumC5222i0 f14848p;

    /* renamed from: q */
    private ArrayList<SVGLength> f14849q;

    /* renamed from: r */
    private ArrayList<SVGLength> f14850r;

    /* renamed from: s */
    private ArrayList<SVGLength> f14851s;

    /* renamed from: t */
    private ArrayList<SVGLength> f14852t;

    /* renamed from: u */
    private ArrayList<SVGLength> f14853u;

    /* renamed from: v */
    double f14854v;

    public C5244t0(ReactContext reactContext) {
        super(reactContext);
        this.f14844l = null;
        this.f14845m = null;
        this.f14846n = null;
        this.f14847o = EnumC5235o0.spacing;
        this.f14854v = Double.NaN;
    }

    /* renamed from: A */
    public void m25723A(String str) {
        this.f14844l = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: B */
    public void m25722B(String str) {
        this.f14847o = EnumC5235o0.valueOf(str);
        invalidate();
    }

    /* renamed from: C */
    public void mo25721C(String str) {
        this.f14848p = EnumC5222i0.m25859a(str);
        invalidate();
    }

    /* renamed from: D */
    public void m25720D(Dynamic dynamic) {
        this.f14849q = SVGLength.m26000a(dynamic);
        invalidate();
    }

    /* renamed from: E */
    public void m25719E(ReadableArray readableArray) {
        this.f14849q = SVGLength.m25999b(readableArray);
        invalidate();
    }

    /* renamed from: F */
    public void m25718F(Dynamic dynamic) {
        this.f14850r = SVGLength.m26000a(dynamic);
        invalidate();
    }

    /* renamed from: G */
    public void m25717G(ReadableArray readableArray) {
        this.f14850r = SVGLength.m25999b(readableArray);
        invalidate();
    }

    /* renamed from: H */
    public void m25716H(Dynamic dynamic) {
        this.f14851s = SVGLength.m26000a(dynamic);
        invalidate();
    }

    /* renamed from: I */
    public void m25715I(ReadableArray readableArray) {
        this.f14851s = SVGLength.m25999b(readableArray);
        invalidate();
    }

    /* renamed from: J */
    public void m25714J(Dynamic dynamic) {
        this.f14845m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: K */
    public void m25713K(Double d) {
        this.f14845m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: L */
    public void m25712L(String str) {
        this.f14845m = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: M */
    public void m25711M(String str) {
        if (str != null) {
            String trim = str.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.f14848p = EnumC5222i0.m25859a(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f14848p = EnumC5222i0.baseline;
            }
            try {
                this.f14846n = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f14846n = null;
            }
        } else {
            this.f14848p = EnumC5222i0.baseline;
            this.f14846n = null;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.f14854v = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        m25830k(canvas);
        clip(canvas, paint);
        m25706n(canvas, paint);
        mo25709h();
        mo25837b(canvas, paint, f);
        mo25833g();
    }

    @Override // com.horcrux.svg.C5227l
    /* renamed from: e */
    public Path mo25710e(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        m25830k(canvas);
        return m25706n(canvas, paint);
    }

    @Override // com.horcrux.svg.C5227l
    /* renamed from: h */
    public void mo25709h() {
        boolean z;
        if (!(this instanceof C5220h0) && !(this instanceof C5216g0)) {
            z = true;
        } else {
            z = false;
        }
        m25834f().m25843p(z, this, this.f14742j, this.f14849q, this.f14850r, this.f14852t, this.f14853u, this.f14851s);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (((VirtualView) this).mPath == null) {
            return;
        }
        super.invalidate();
        m25703q().clearChildCache();
    }

    /* renamed from: l */
    public EnumC5222i0 m25708l() {
        EnumC5222i0 enumC5222i0;
        if (this.f14848p == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof C5244t0) && (enumC5222i0 = ((C5244t0) parent).f14848p) != null) {
                    this.f14848p = enumC5222i0;
                    return enumC5222i0;
                }
            }
        }
        if (this.f14848p == null) {
            this.f14848p = EnumC5222i0.baseline;
        }
        return this.f14848p;
    }

    /* renamed from: m */
    public String m25707m() {
        String str;
        if (this.f14846n == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof C5244t0) && (str = ((C5244t0) parent).f14846n) != null) {
                    this.f14846n = str;
                    return str;
                }
            }
        }
        return this.f14846n;
    }

    /* renamed from: n */
    public Path m25706n(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        mo25709h();
        ((VirtualView) this).mPath = super.getPath(canvas, paint);
        mo25833g();
        return ((VirtualView) this).mPath;
    }

    /* renamed from: o */
    public double mo25705o(Paint paint) {
        if (!Double.isNaN(this.f14854v)) {
            return this.f14854v;
        }
        double d = 0.0d;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C5244t0) {
                d += ((C5244t0) childAt).mo25705o(paint);
            }
        }
        this.f14854v = d;
        return d;
    }

    /* renamed from: p */
    public C5244t0 m25704p() {
        ArrayList<C5218h> arrayList = m25834f().f14706a;
        ViewParent parent = getParent();
        C5244t0 c5244t0 = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof C5244t0) && arrayList.get(size).f14652j != EnumC5231m0.start && c5244t0.f14849q == null; size--) {
            c5244t0 = (C5244t0) parent;
            parent = c5244t0.getParent();
        }
        return c5244t0;
    }

    /* renamed from: q */
    public C5244t0 m25703q() {
        ViewParent parent = getParent();
        C5244t0 c5244t0 = this;
        while (parent instanceof C5244t0) {
            c5244t0 = (C5244t0) parent;
            parent = c5244t0.getParent();
        }
        return c5244t0;
    }

    /* renamed from: r */
    public void m25702r(Dynamic dynamic) {
        this.f14846n = SVGLength.m25995f(dynamic);
        invalidate();
    }

    /* renamed from: s */
    public void m25701s(Double d) {
        this.f14846n = String.valueOf(d);
        invalidate();
    }

    /* renamed from: t */
    public void m25700t(String str) {
        this.f14846n = str;
        invalidate();
    }

    /* renamed from: u */
    public void m25699u(Dynamic dynamic) {
        this.f14852t = SVGLength.m26000a(dynamic);
        invalidate();
    }

    /* renamed from: v */
    public void m25698v(ReadableArray readableArray) {
        this.f14852t = SVGLength.m25999b(readableArray);
        invalidate();
    }

    /* renamed from: w */
    public void m25697w(Dynamic dynamic) {
        this.f14853u = SVGLength.m26000a(dynamic);
        invalidate();
    }

    /* renamed from: x */
    public void m25696x(ReadableArray readableArray) {
        this.f14853u = SVGLength.m25999b(readableArray);
        invalidate();
    }

    /* renamed from: y */
    public void m25695y(Dynamic dynamic) {
        this.f14844l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: z */
    public void m25694z(Double d) {
        this.f14844l = SVGLength.m25997d(d);
        invalidate();
    }
}