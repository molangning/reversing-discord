package com.horcrux.svg;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.C5201a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5238q extends C5227l {

    /* renamed from: l */
    SVGLength f14814l;

    /* renamed from: m */
    SVGLength f14815m;

    /* renamed from: n */
    SVGLength f14816n;

    /* renamed from: o */
    SVGLength f14817o;

    /* renamed from: p */
    private C5201a.EnumC5203b f14818p;

    /* renamed from: q */
    private C5201a.EnumC5203b f14819q;

    public C5238q(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: l */
    public void m25766l(Dynamic dynamic) {
        this.f14817o = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: m */
    public void m25765m(Double d) {
        this.f14817o = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: n */
    public void m25764n(String str) {
        this.f14817o = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: o */
    public void m25763o(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f14819q = C5201a.EnumC5203b.USER_SPACE_ON_USE;
            }
        } else {
            this.f14819q = C5201a.EnumC5203b.OBJECT_BOUNDING_BOX;
        }
        invalidate();
    }

    /* renamed from: p */
    public void m25762p(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f14818p = C5201a.EnumC5203b.USER_SPACE_ON_USE;
            }
        } else {
            this.f14818p = C5201a.EnumC5203b.OBJECT_BOUNDING_BOX;
        }
        invalidate();
    }

    /* renamed from: q */
    public void m25761q(Dynamic dynamic) {
        this.f14816n = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: r */
    public void m25760r(Double d) {
        this.f14816n = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: s */
    public void m25759s(String str) {
        this.f14816n = SVGLength.m25996e(str);
        invalidate();
    }

    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    /* renamed from: t */
    public void m25758t(Dynamic dynamic) {
        this.f14814l = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: u */
    public void m25757u(Double d) {
        this.f14814l = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: v */
    public void m25756v(String str) {
        this.f14814l = SVGLength.m25996e(str);
        invalidate();
    }

    /* renamed from: w */
    public void m25755w(Dynamic dynamic) {
        this.f14815m = SVGLength.m25998c(dynamic);
        invalidate();
    }

    /* renamed from: x */
    public void m25754x(Double d) {
        this.f14815m = SVGLength.m25997d(d);
        invalidate();
    }

    /* renamed from: y */
    public void m25753y(String str) {
        this.f14815m = SVGLength.m25996e(str);
        invalidate();
    }
}
