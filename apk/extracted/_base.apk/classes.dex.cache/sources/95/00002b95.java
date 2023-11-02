package com.google.android.material.bottomappbar;

import bb.C2231f;
import bb.C2247m;

/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4771a extends C2231f implements Cloneable {

    /* renamed from: j */
    private float f13124j;

    /* renamed from: k */
    private float f13125k;

    /* renamed from: l */
    private float f13126l;

    /* renamed from: m */
    private float f13127m;

    /* renamed from: n */
    private float f13128n;

    /* renamed from: o */
    private float f13129o;

    @Override // bb.C2231f
    /* renamed from: c */
    public void mo27773c(float f, float f2, float f3, C2247m c2247m) {
        boolean z;
        float f4;
        float f5;
        float f6 = this.f13126l;
        if (f6 == 0.0f) {
            c2247m.m33788m(f, 0.0f);
            return;
        }
        float f7 = ((this.f13125k * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f13124j;
        float f9 = f2 + this.f13128n;
        float f10 = (this.f13127m * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            c2247m.m33788m(f, 0.0f);
            return;
        }
        float f11 = this.f13129o;
        float f12 = f11 * f3;
        if (f11 != -1.0f && Math.abs((f11 * 2.0f) - f6) >= 0.1f) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (!z2) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f10;
            f5 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        c2247m.m33788m(f15, 0.0f);
        float f18 = f8 * 2.0f;
        c2247m.m33800a(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z2) {
            c2247m.m33800a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f13125k;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            c2247m.m33800a(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f13125k;
            c2247m.m33788m(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f13125k;
            c2247m.m33800a(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        c2247m.m33800a(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        c2247m.m33788m(f, 0.0f);
    }

    /* renamed from: d */
    public float m27772d() {
        return this.f13127m;
    }

    /* renamed from: e */
    public float m27771e() {
        return this.f13129o;
    }

    /* renamed from: f */
    public float m27770f() {
        return this.f13125k;
    }

    /* renamed from: g */
    public float m27769g() {
        return this.f13124j;
    }

    /* renamed from: j */
    public float m27768j() {
        return this.f13126l;
    }

    /* renamed from: k */
    public void m27767k(float f) {
        if (f >= 0.0f) {
            this.f13127m = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: l */
    public void m27766l(float f) {
        this.f13129o = f;
    }

    /* renamed from: m */
    public void m27765m(float f) {
        this.f13125k = f;
    }

    /* renamed from: n */
    public void m27764n(float f) {
        this.f13124j = f;
    }

    /* renamed from: p */
    public void m27763p(float f) {
        this.f13126l = f;
    }

    /* renamed from: q */
    public void m27762q(float f) {
        this.f13128n = f;
    }
}