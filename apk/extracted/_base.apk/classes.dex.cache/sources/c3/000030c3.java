package p066dd;

import p136hc.C7069o;

/* renamed from: dd.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5815d extends C7069o {

    /* renamed from: c */
    private final float f16646c;

    /* renamed from: d */
    private final int f16647d;

    public C5815d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* renamed from: f */
    public boolean m24476f(float f, float f2, float f3) {
        if (Math.abs(f2 - m21454d()) > f || Math.abs(f3 - m21455c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f16646c);
        if (abs > 1.0f && abs > this.f16646c) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public C5815d m24475g(float f, float f2, float f3) {
        int i = this.f16647d;
        int i2 = i + 1;
        float m21455c = (i * m21455c()) + f2;
        float f4 = i2;
        return new C5815d(m21455c / f4, ((this.f16647d * m21454d()) + f) / f4, ((this.f16647d * this.f16646c) + f3) / f4, i2);
    }

    /* renamed from: h */
    public int m24474h() {
        return this.f16647d;
    }

    /* renamed from: i */
    public float m24473i() {
        return this.f16646c;
    }

    private C5815d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f16646c = f3;
        this.f16647d = i;
    }
}