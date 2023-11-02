package mc;

import lc.C10120b;
import p136hc.C7064j;
import p136hc.C7069o;

/* renamed from: mc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10435b {

    /* renamed from: a */
    private final C10120b f27253a;

    /* renamed from: b */
    private final int f27254b;

    /* renamed from: c */
    private final int f27255c;

    /* renamed from: d */
    private final int f27256d;

    /* renamed from: e */
    private final int f27257e;

    /* renamed from: f */
    private final int f27258f;

    /* renamed from: g */
    private final int f27259g;

    public C10435b(C10120b c10120b) {
        this(c10120b, 10, c10120b.m12246m() / 2, c10120b.m12249j() / 2);
    }

    /* renamed from: a */
    private C7069o[] m11567a(C7069o c7069o, C7069o c7069o2, C7069o c7069o3, C7069o c7069o4) {
        float m21455c = c7069o.m21455c();
        float m21454d = c7069o.m21454d();
        float m21455c2 = c7069o2.m21455c();
        float m21454d2 = c7069o2.m21454d();
        float m21455c3 = c7069o3.m21455c();
        float m21454d3 = c7069o3.m21454d();
        float m21455c4 = c7069o4.m21455c();
        float m21454d4 = c7069o4.m21454d();
        return m21455c < ((float) this.f27255c) / 2.0f ? new C7069o[]{new C7069o(m21455c4 - 1.0f, m21454d4 + 1.0f), new C7069o(m21455c2 + 1.0f, m21454d2 + 1.0f), new C7069o(m21455c3 - 1.0f, m21454d3 - 1.0f), new C7069o(m21455c + 1.0f, m21454d - 1.0f)} : new C7069o[]{new C7069o(m21455c4 + 1.0f, m21454d4 + 1.0f), new C7069o(m21455c2 + 1.0f, m21454d2 - 1.0f), new C7069o(m21455c3 - 1.0f, m21454d3 + 1.0f), new C7069o(m21455c - 1.0f, m21454d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m11566b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f27253a.m12252e(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f27253a.m12252e(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C7069o m11564d(float f, float f2, float f3, float f4) {
        int m11569c = C10434a.m11569c(C10434a.m11571a(f, f2, f3, f4));
        float f5 = m11569c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < m11569c; i++) {
            float f8 = i;
            int m11569c2 = C10434a.m11569c((f8 * f6) + f);
            int m11569c3 = C10434a.m11569c((f8 * f7) + f2);
            if (this.f27253a.m12252e(m11569c2, m11569c3)) {
                return new C7069o(m11569c2, m11569c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C7069o[] m11565c() {
        int i = this.f27256d;
        int i2 = this.f27257e;
        int i3 = this.f27259g;
        int i4 = this.f27258f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            boolean z8 = false;
            boolean z9 = true;
            while (true) {
                if ((z9 || !z2) && i2 < this.f27255c) {
                    z9 = m11566b(i3, i4, i2, false);
                    if (z9) {
                        i2++;
                        z2 = true;
                        z8 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f27255c) {
                boolean z10 = true;
                while (true) {
                    if ((z10 || !z3) && i4 < this.f27254b) {
                        z10 = m11566b(i, i2, i4, true);
                        if (z10) {
                            i4++;
                            z3 = true;
                            z8 = true;
                        } else if (!z3) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f27254b) {
                    boolean z11 = true;
                    while (true) {
                        if ((z11 || !z4) && i >= 0) {
                            z11 = m11566b(i3, i4, i, false);
                            if (z11) {
                                i--;
                                z4 = true;
                                z8 = true;
                            } else if (!z4) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z7 = z8;
                        boolean z12 = true;
                        while (true) {
                            if ((z12 || !z6) && i3 >= 0) {
                                z12 = m11566b(i, i2, i3, true);
                                if (z12) {
                                    i3--;
                                    z7 = true;
                                    z6 = true;
                                } else if (!z6) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 >= 0) {
                            if (z7) {
                                z5 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (!z && z5) {
            int i5 = i2 - i;
            C7069o c7069o = null;
            C7069o c7069o2 = null;
            for (int i6 = 1; c7069o2 == null && i6 < i5; i6++) {
                c7069o2 = m11564d(i, i4 - i6, i + i6, i4);
            }
            if (c7069o2 != null) {
                C7069o c7069o3 = null;
                for (int i7 = 1; c7069o3 == null && i7 < i5; i7++) {
                    c7069o3 = m11564d(i, i3 + i7, i + i7, i3);
                }
                if (c7069o3 != null) {
                    C7069o c7069o4 = null;
                    for (int i8 = 1; c7069o4 == null && i8 < i5; i8++) {
                        c7069o4 = m11564d(i2, i3 + i8, i2 - i8, i3);
                    }
                    if (c7069o4 != null) {
                        for (int i9 = 1; c7069o == null && i9 < i5; i9++) {
                            c7069o = m11564d(i2, i4 - i9, i2 - i9, i4);
                        }
                        if (c7069o != null) {
                            return m11567a(c7069o, c7069o2, c7069o4, c7069o3);
                        }
                        throw C7064j.m21461a();
                    }
                    throw C7064j.m21461a();
                }
                throw C7064j.m21461a();
            }
            throw C7064j.m21461a();
        }
        throw C7064j.m21461a();
    }

    public C10435b(C10120b c10120b, int i, int i2, int i3) {
        this.f27253a = c10120b;
        int m12249j = c10120b.m12249j();
        this.f27254b = m12249j;
        int m12246m = c10120b.m12246m();
        this.f27255c = m12246m;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f27256d = i5;
        int i6 = i2 + i4;
        this.f27257e = i6;
        int i7 = i3 - i4;
        this.f27259g = i7;
        int i8 = i3 + i4;
        this.f27258f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= m12249j || i6 >= m12246m) {
            throw C7064j.m21461a();
        }
    }
}
