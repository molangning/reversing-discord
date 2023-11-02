package com.facebook.drawee.generic;

import java.util.Arrays;
import p394w2.C13379j;

/* renamed from: com.facebook.drawee.generic.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3628a {

    /* renamed from: a */
    private EnumC3629a f9985a = EnumC3629a.BITMAP_ONLY;

    /* renamed from: b */
    private boolean f9986b = false;

    /* renamed from: c */
    private float[] f9987c = null;

    /* renamed from: d */
    private int f9988d = 0;

    /* renamed from: e */
    private float f9989e = 0.0f;

    /* renamed from: f */
    private int f9990f = 0;

    /* renamed from: g */
    private float f9991g = 0.0f;

    /* renamed from: h */
    private boolean f9992h = false;

    /* renamed from: i */
    private boolean f9993i = false;

    /* renamed from: com.facebook.drawee.generic.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3629a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: a */
    public static C3628a m31421a(float f) {
        return new C3628a().m31406p(f);
    }

    /* renamed from: e */
    private float[] m31417e() {
        if (this.f9987c == null) {
            this.f9987c = new float[8];
        }
        return this.f9987c;
    }

    /* renamed from: b */
    public int m31420b() {
        return this.f9990f;
    }

    /* renamed from: c */
    public float m31419c() {
        return this.f9989e;
    }

    /* renamed from: d */
    public float[] m31418d() {
        return this.f9987c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3628a c3628a = (C3628a) obj;
        if (this.f9986b != c3628a.f9986b || this.f9988d != c3628a.f9988d || Float.compare(c3628a.f9989e, this.f9989e) != 0 || this.f9990f != c3628a.f9990f || Float.compare(c3628a.f9991g, this.f9991g) != 0 || this.f9985a != c3628a.f9985a || this.f9992h != c3628a.f9992h || this.f9993i != c3628a.f9993i) {
            return false;
        }
        return Arrays.equals(this.f9987c, c3628a.f9987c);
    }

    /* renamed from: f */
    public int m31416f() {
        return this.f9988d;
    }

    /* renamed from: g */
    public float m31415g() {
        return this.f9991g;
    }

    /* renamed from: h */
    public boolean m31414h() {
        return this.f9993i;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        EnumC3629a enumC3629a = this.f9985a;
        int i4 = 0;
        if (enumC3629a != null) {
            i = enumC3629a.hashCode();
        } else {
            i = 0;
        }
        int i5 = ((i * 31) + (this.f9986b ? 1 : 0)) * 31;
        float[] fArr = this.f9987c;
        if (fArr != null) {
            i2 = Arrays.hashCode(fArr);
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.f9988d) * 31;
        float f = this.f9989e;
        if (f != 0.0f) {
            i3 = Float.floatToIntBits(f);
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.f9990f) * 31;
        float f2 = this.f9991g;
        if (f2 != 0.0f) {
            i4 = Float.floatToIntBits(f2);
        }
        return ((((i7 + i4) * 31) + (this.f9992h ? 1 : 0)) * 31) + (this.f9993i ? 1 : 0);
    }

    /* renamed from: i */
    public boolean m31413i() {
        return this.f9986b;
    }

    /* renamed from: j */
    public EnumC3629a m31412j() {
        return this.f9985a;
    }

    /* renamed from: k */
    public boolean m31411k() {
        return this.f9992h;
    }

    /* renamed from: l */
    public C3628a m31410l(int i, float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2681c(z, "the border width cannot be < 0");
        this.f9989e = f;
        this.f9990f = i;
        return this;
    }

    /* renamed from: m */
    public C3628a m31409m(int i) {
        this.f9990f = i;
        return this;
    }

    /* renamed from: n */
    public C3628a m31408n(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2681c(z, "the border width cannot be < 0");
        this.f9989e = f;
        return this;
    }

    /* renamed from: o */
    public C3628a m31407o(float f, float f2, float f3, float f4) {
        float[] m31417e = m31417e();
        m31417e[1] = f;
        m31417e[0] = f;
        m31417e[3] = f2;
        m31417e[2] = f2;
        m31417e[5] = f3;
        m31417e[4] = f3;
        m31417e[7] = f4;
        m31417e[6] = f4;
        return this;
    }

    /* renamed from: p */
    public C3628a m31406p(float f) {
        Arrays.fill(m31417e(), f);
        return this;
    }

    /* renamed from: q */
    public C3628a m31405q(int i) {
        this.f9988d = i;
        this.f9985a = EnumC3629a.OVERLAY_COLOR;
        return this;
    }

    /* renamed from: r */
    public C3628a m31404r(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2681c(z, "the padding cannot be < 0");
        this.f9991g = f;
        return this;
    }

    /* renamed from: s */
    public C3628a m31403s(boolean z) {
        this.f9993i = z;
        return this;
    }

    /* renamed from: t */
    public C3628a m31402t(boolean z) {
        this.f9986b = z;
        return this;
    }

    /* renamed from: u */
    public C3628a m31401u(EnumC3629a enumC3629a) {
        this.f9985a = enumC3629a;
        return this;
    }
}
