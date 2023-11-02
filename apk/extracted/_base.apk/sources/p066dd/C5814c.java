package p066dd;

import cd.C2507j;
import java.util.Map;
import lc.AbstractC10127i;
import lc.C10120b;
import lc.C10125g;
import lc.C10129k;
import mc.C10434a;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7059e;
import p136hc.InterfaceC7070p;

/* renamed from: dd.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5814c {

    /* renamed from: a */
    private final C10120b f16644a;

    /* renamed from: b */
    private InterfaceC7070p f16645b;

    public C5814c(C10120b c10120b) {
        this.f16644a = c10120b;
    }

    /* renamed from: b */
    private float m24485b(C7069o c7069o, C7069o c7069o2) {
        float m24477j = m24477j((int) c7069o.m21455c(), (int) c7069o.m21454d(), (int) c7069o2.m21455c(), (int) c7069o2.m21454d());
        float m24477j2 = m24477j((int) c7069o2.m21455c(), (int) c7069o2.m21454d(), (int) c7069o.m21455c(), (int) c7069o.m21454d());
        if (Float.isNaN(m24477j)) {
            return m24477j2 / 7.0f;
        }
        if (Float.isNaN(m24477j2)) {
            return m24477j / 7.0f;
        }
        return (m24477j + m24477j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m24484c(C7069o c7069o, C7069o c7069o2, C7069o c7069o3, float f) {
        int m11569c = ((C10434a.m11569c(C7069o.m21456b(c7069o, c7069o2) / f) + C10434a.m11569c(C7069o.m21456b(c7069o, c7069o3) / f)) / 2) + 7;
        int i = m11569c & 3;
        if (i != 0) {
            if (i != 2) {
                if (i == 3) {
                    throw C7064j.m21461a();
                }
                return m11569c;
            }
            return m11569c - 1;
        }
        return m11569c + 1;
    }

    /* renamed from: d */
    private static C10129k m24483d(C7069o c7069o, C7069o c7069o2, C7069o c7069o3, C7069o c7069o4, int i) {
        float m21455c;
        float m21454d;
        float f;
        float f2 = i - 3.5f;
        if (c7069o4 != null) {
            m21455c = c7069o4.m21455c();
            m21454d = c7069o4.m21454d();
            f = f2 - 3.0f;
        } else {
            m21455c = (c7069o2.m21455c() - c7069o.m21455c()) + c7069o3.m21455c();
            m21454d = (c7069o2.m21454d() - c7069o.m21454d()) + c7069o3.m21454d();
            f = f2;
        }
        return C10129k.m12206b(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, c7069o.m21455c(), c7069o.m21454d(), c7069o2.m21455c(), c7069o2.m21454d(), m21455c, m21454d, c7069o3.m21455c(), c7069o3.m21454d());
    }

    /* renamed from: h */
    private static C10120b m24479h(C10120b c10120b, C10129k c10129k, int i) {
        return AbstractC10127i.m12216b().mo12214d(c10120b, i, i, c10129k);
    }

    /* renamed from: i */
    private float m24478i(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C5814c c5814c;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i14 = 2;
        int i15 = (-abs) / 2;
        int i16 = -1;
        if (i5 < i7) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i6 < i8) {
            i16 = 1;
        }
        int i17 = i7 + i9;
        int i18 = i5;
        int i19 = i6;
        int i20 = 0;
        while (true) {
            if (i18 != i17) {
                if (z) {
                    i12 = i19;
                } else {
                    i12 = i18;
                }
                if (z) {
                    i13 = i18;
                } else {
                    i13 = i19;
                }
                if (i20 == z4) {
                    z2 = z;
                    z3 = z4;
                    i10 = i17;
                    c5814c = this;
                } else {
                    c5814c = this;
                    z2 = z;
                    i10 = i17;
                    z3 = false;
                }
                if (z3 == c5814c.f16644a.m12252e(i12, i13)) {
                    if (i20 == 2) {
                        return C10434a.m11570b(i18, i19, i5, i6);
                    }
                    i20++;
                }
                i15 += abs2;
                if (i15 > 0) {
                    if (i19 != i8) {
                        i19 += i16;
                        i15 -= abs;
                    } else {
                        i11 = 2;
                        break;
                    }
                }
                i18 += i9;
                i17 = i10;
                z = z2;
                z4 = true;
                i14 = 2;
            } else {
                i10 = i17;
                i11 = i14;
                break;
            }
        }
        if (i20 == i11) {
            return C10434a.m11570b(i10, i8, i5, i6);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m24477j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float m24478i = m24478i(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.f16644a.m12246m()) {
            f = ((this.f16644a.m12246m() - 1) - i) / (i5 - i);
            i5 = this.f16644a.m12246m() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.f16644a.m12249j()) {
            f2 = ((this.f16644a.m12249j() - 1) - i2) / (i7 - i2);
            i6 = this.f16644a.m12249j() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (m24478i + m24478i(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }

    /* renamed from: a */
    protected final float m24486a(C7069o c7069o, C7069o c7069o2, C7069o c7069o3) {
        return (m24485b(c7069o, c7069o2) + m24485b(c7069o, c7069o3)) / 2.0f;
    }

    /* renamed from: e */
    public final C10125g m24482e(Map<EnumC7059e, ?> map) {
        InterfaceC7070p interfaceC7070p;
        if (map == null) {
            interfaceC7070p = null;
        } else {
            interfaceC7070p = (InterfaceC7070p) map.get(EnumC7059e.NEED_RESULT_POINT_CALLBACK);
        }
        this.f16645b = interfaceC7070p;
        return m24480g(new C5816e(this.f16644a, interfaceC7070p).m24467f(map));
    }

    /* renamed from: f */
    protected final C5812a m24481f(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f16644a.m12246m() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f16644a.m12249j() - 1, i2 + i3) - max2;
            if (min2 >= f3) {
                return new C5813b(this.f16644a, max, max2, min, min2, f, this.f16645b).m24489c();
            }
            throw C7064j.m21461a();
        }
        throw C7064j.m21461a();
    }

    /* renamed from: g */
    protected final C10125g m24480g(C5820f c5820f) {
        C5812a c5812a;
        C5815d m24455b = c5820f.m24455b();
        C5815d m24454c = c5820f.m24454c();
        C5815d m24456a = c5820f.m24456a();
        float m24486a = m24486a(m24455b, m24454c, m24456a);
        if (m24486a >= 1.0f) {
            int m24484c = m24484c(m24455b, m24454c, m24456a, m24486a);
            C2507j m33104g = C2507j.m33104g(m24484c);
            int m33106e = m33104g.m33106e() - 7;
            if (m33104g.m33107d().length > 0) {
                float m21455c = (m24454c.m21455c() - m24455b.m21455c()) + m24456a.m21455c();
                float m21454d = (m24454c.m21454d() - m24455b.m21454d()) + m24456a.m21454d();
                float f = 1.0f - (3.0f / m33106e);
                int m21455c2 = (int) (m24455b.m21455c() + ((m21455c - m24455b.m21455c()) * f));
                int m21454d2 = (int) (m24455b.m21454d() + (f * (m21454d - m24455b.m21454d())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        c5812a = m24481f(m24486a, m21455c2, m21454d2, i);
                        break;
                    } catch (C7064j unused) {
                    }
                }
            }
            c5812a = null;
            return new C10125g(m24479h(this.f16644a, m24483d(m24455b, m24454c, m24456a, c5812a, m24484c), m24484c), c5812a == null ? new C7069o[]{m24456a, m24455b, m24454c} : new C7069o[]{m24456a, m24455b, m24454c, c5812a});
        }
        throw C7064j.m21461a();
    }
}
