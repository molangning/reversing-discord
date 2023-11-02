package p041c8;

import android.text.Layout;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c8.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2459g {

    /* renamed from: a */
    private String f6785a;

    /* renamed from: b */
    private int f6786b;

    /* renamed from: c */
    private boolean f6787c;

    /* renamed from: d */
    private int f6788d;

    /* renamed from: e */
    private boolean f6789e;

    /* renamed from: k */
    private float f6795k;

    /* renamed from: l */
    private String f6796l;

    /* renamed from: o */
    private Layout.Alignment f6799o;

    /* renamed from: q */
    private C2451b f6801q;

    /* renamed from: f */
    private int f6790f = -1;

    /* renamed from: g */
    private int f6791g = -1;

    /* renamed from: h */
    private int f6792h = -1;

    /* renamed from: i */
    private int f6793i = -1;

    /* renamed from: j */
    private int f6794j = -1;

    /* renamed from: m */
    private int f6797m = -1;

    /* renamed from: n */
    private int f6798n = -1;

    /* renamed from: p */
    private int f6800p = -1;

    /* renamed from: r */
    private float f6802r = Float.MAX_VALUE;

    /* renamed from: q */
    private C2459g m33219q(C2459g c2459g, boolean z) {
        int i;
        Layout.Alignment alignment;
        String str;
        if (c2459g != null) {
            if (!this.f6787c && c2459g.f6787c) {
                m33214v(c2459g.f6786b);
            }
            if (this.f6792h == -1) {
                this.f6792h = c2459g.f6792h;
            }
            if (this.f6793i == -1) {
                this.f6793i = c2459g.f6793i;
            }
            if (this.f6785a == null && (str = c2459g.f6785a) != null) {
                this.f6785a = str;
            }
            if (this.f6790f == -1) {
                this.f6790f = c2459g.f6790f;
            }
            if (this.f6791g == -1) {
                this.f6791g = c2459g.f6791g;
            }
            if (this.f6798n == -1) {
                this.f6798n = c2459g.f6798n;
            }
            if (this.f6799o == null && (alignment = c2459g.f6799o) != null) {
                this.f6799o = alignment;
            }
            if (this.f6800p == -1) {
                this.f6800p = c2459g.f6800p;
            }
            if (this.f6794j == -1) {
                this.f6794j = c2459g.f6794j;
                this.f6795k = c2459g.f6795k;
            }
            if (this.f6801q == null) {
                this.f6801q = c2459g.f6801q;
            }
            if (this.f6802r == Float.MAX_VALUE) {
                this.f6802r = c2459g.f6802r;
            }
            if (z && !this.f6789e && c2459g.f6789e) {
                m33216t(c2459g.f6788d);
            }
            if (z && this.f6797m == -1 && (i = c2459g.f6797m) != -1) {
                this.f6797m = i;
            }
        }
        return this;
    }

    /* renamed from: A */
    public C2459g m33244A(boolean z) {
        this.f6793i = z ? 1 : 0;
        return this;
    }

    /* renamed from: B */
    public C2459g m33243B(boolean z) {
        this.f6790f = z ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public C2459g m33242C(int i) {
        this.f6798n = i;
        return this;
    }

    /* renamed from: D */
    public C2459g m33241D(int i) {
        this.f6797m = i;
        return this;
    }

    /* renamed from: E */
    public C2459g m33240E(float f) {
        this.f6802r = f;
        return this;
    }

    /* renamed from: F */
    public C2459g m33239F(Layout.Alignment alignment) {
        this.f6799o = alignment;
        return this;
    }

    /* renamed from: G */
    public C2459g m33238G(boolean z) {
        this.f6800p = z ? 1 : 0;
        return this;
    }

    /* renamed from: H */
    public C2459g m33237H(C2451b c2451b) {
        this.f6801q = c2451b;
        return this;
    }

    /* renamed from: I */
    public C2459g m33236I(boolean z) {
        this.f6791g = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C2459g m33235a(C2459g c2459g) {
        return m33219q(c2459g, true);
    }

    /* renamed from: b */
    public int m33234b() {
        if (this.f6789e) {
            return this.f6788d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int m33233c() {
        if (this.f6787c) {
            return this.f6786b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String m33232d() {
        return this.f6785a;
    }

    /* renamed from: e */
    public float m33231e() {
        return this.f6795k;
    }

    /* renamed from: f */
    public int m33230f() {
        return this.f6794j;
    }

    /* renamed from: g */
    public String m33229g() {
        return this.f6796l;
    }

    /* renamed from: h */
    public int m33228h() {
        return this.f6798n;
    }

    /* renamed from: i */
    public int m33227i() {
        return this.f6797m;
    }

    /* renamed from: j */
    public float m33226j() {
        return this.f6802r;
    }

    /* renamed from: k */
    public int m33225k() {
        int i;
        int i2 = this.f6792h;
        if (i2 == -1 && this.f6793i == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f6793i == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    /* renamed from: l */
    public Layout.Alignment m33224l() {
        return this.f6799o;
    }

    /* renamed from: m */
    public boolean m33223m() {
        return this.f6800p == 1;
    }

    /* renamed from: n */
    public C2451b m33222n() {
        return this.f6801q;
    }

    /* renamed from: o */
    public boolean m33221o() {
        return this.f6789e;
    }

    /* renamed from: p */
    public boolean m33220p() {
        return this.f6787c;
    }

    /* renamed from: r */
    public boolean m33218r() {
        return this.f6790f == 1;
    }

    /* renamed from: s */
    public boolean m33217s() {
        return this.f6791g == 1;
    }

    /* renamed from: t */
    public C2459g m33216t(int i) {
        this.f6788d = i;
        this.f6789e = true;
        return this;
    }

    /* renamed from: u */
    public C2459g m33215u(boolean z) {
        this.f6792h = z ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public C2459g m33214v(int i) {
        this.f6786b = i;
        this.f6787c = true;
        return this;
    }

    /* renamed from: w */
    public C2459g m33213w(String str) {
        this.f6785a = str;
        return this;
    }

    /* renamed from: x */
    public C2459g m33212x(float f) {
        this.f6795k = f;
        return this;
    }

    /* renamed from: y */
    public C2459g m33211y(int i) {
        this.f6794j = i;
        return this;
    }

    /* renamed from: z */
    public C2459g m33210z(String str) {
        this.f6796l = str;
        return this;
    }
}