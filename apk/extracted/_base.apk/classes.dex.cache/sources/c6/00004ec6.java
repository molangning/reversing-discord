package p368uc;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.C10119a;
import mc.C10434a;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;
import p136hc.InterfaceC7070p;
import tc.AbstractC12648k;

/* renamed from: uc.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12950e extends AbstractC12946a {

    /* renamed from: i */
    private static final int[] f33665i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    private static final int[] f33666j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f33667k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f33668l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f33669m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f33670n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f33671o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<C12949d> f33672g = new ArrayList();

    /* renamed from: h */
    private final List<C12949d> f33673h = new ArrayList();

    /* renamed from: q */
    private static void m3616q(Collection<C12949d> collection, C12949d c12949d) {
        boolean z;
        if (c12949d == null) {
            return;
        }
        Iterator<C12949d> it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                C12949d next = it.next();
                if (next.m3623b() == c12949d.m3623b()) {
                    next.m3617e();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            collection.add(c12949d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x003f, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0041, code lost:
        r2 = true;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0026, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3615r(boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p368uc.C12950e.m3615r(boolean, int):void");
    }

    /* renamed from: s */
    private static boolean m3614s(C12949d c12949d, C12949d c12949d2) {
        int m3624a = (c12949d.m3624a() + (c12949d2.m3624a() * 16)) % 79;
        int m3620c = (c12949d.m3618d().m3620c() * 9) + c12949d2.m3618d().m3620c();
        if (m3620c > 72) {
            m3620c--;
        }
        if (m3620c > 8) {
            m3620c--;
        }
        if (m3624a == m3620c) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private static Result m3613t(C12949d c12949d, C12949d c12949d2) {
        String valueOf = String.valueOf((c12949d.m3623b() * 4537077) + c12949d2.m3623b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb2.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb2.append(i3);
        C7069o[] m3622a = c12949d.m3618d().m3622a();
        C7069o[] m3622a2 = c12949d2.m3618d().m3622a();
        return new Result(sb2.toString(), null, new C7069o[]{m3622a[0], m3622a[1], m3622a2[0], m3622a2[1]}, EnumC7055a.RSS_14);
    }

    /* renamed from: u */
    private C12947b m3612u(C10119a c10119a, C12948c c12948c, boolean z) {
        int i;
        int[] m3633h = m3633h();
        for (int i2 = 0; i2 < m3633h.length; i2++) {
            m3633h[i2] = 0;
        }
        if (z) {
            AbstractC12648k.m4628f(c10119a, c12948c.m3621b()[0], m3633h);
        } else {
            AbstractC12648k.m4629e(c10119a, c12948c.m3621b()[1] + 1, m3633h);
            int i3 = 0;
            for (int length = m3633h.length - 1; i3 < length; length--) {
                int i4 = m3633h[i3];
                m3633h[i3] = m3633h[length];
                m3633h[length] = i4;
                i3++;
            }
        }
        if (z) {
            i = 16;
        } else {
            i = 15;
        }
        float m11568d = C10434a.m11568d(m3633h) / i;
        int[] m3629l = m3629l();
        int[] m3631j = m3631j();
        float[] m3628m = m3628m();
        float[] m3630k = m3630k();
        for (int i5 = 0; i5 < m3633h.length; i5++) {
            float f = m3633h[i5] / m11568d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                m3629l[i7] = i6;
                m3628m[i7] = f - i6;
            } else {
                m3631j[i7] = i6;
                m3630k[i7] = f - i6;
            }
        }
        m3615r(z, i);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = m3629l.length - 1; length2 >= 0; length2--) {
            int i10 = m3629l[length2];
            i8 = (i8 * 9) + i10;
            i9 += i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = m3631j.length - 1; length3 >= 0; length3--) {
            int i13 = m3631j[length3];
            i11 = (i11 * 9) + i13;
            i12 += i13;
        }
        int i14 = i8 + (i11 * 3);
        if (z) {
            if ((i9 & 1) == 0 && i9 <= 12 && i9 >= 4) {
                int i15 = (12 - i9) / 2;
                int i16 = f33669m[i15];
                int i17 = 9 - i16;
                return new C12947b((C12951f.m3607b(m3629l, i16, false) * f33665i[i15]) + C12951f.m3607b(m3631j, i17, true) + f33667k[i15], i14);
            }
            throw C7064j.m21461a();
        } else if ((i12 & 1) == 0 && i12 <= 10 && i12 >= 4) {
            int i18 = (10 - i12) / 2;
            int i19 = f33670n[i18];
            return new C12947b((C12951f.m3607b(m3631j, 9 - i19, false) * f33666j[i18]) + C12951f.m3607b(m3629l, i19, true) + f33668l[i18], i14);
        } else {
            throw C7064j.m21461a();
        }
    }

    /* renamed from: v */
    private C12949d m3611v(C10119a c10119a, boolean z, int i, Map<EnumC7059e, ?> map) {
        int[] m3610w;
        InterfaceC7070p interfaceC7070p;
        try {
            C12948c m3609x = m3609x(c10119a, i, z, m3610w(c10119a, z));
            if (map == null) {
                interfaceC7070p = null;
            } else {
                interfaceC7070p = (InterfaceC7070p) map.get(EnumC7059e.NEED_RESULT_POINT_CALLBACK);
            }
            if (interfaceC7070p != null) {
                float f = (m3610w[0] + m3610w[1]) / 2.0f;
                if (z) {
                    f = (c10119a.m12261j() - 1) - f;
                }
                interfaceC7070p.m21452a(new C7069o(f, i));
            }
            C12947b m3612u = m3612u(c10119a, m3609x, true);
            C12947b m3612u2 = m3612u(c10119a, m3609x, false);
            return new C12949d((m3612u.m3623b() * 1597) + m3612u2.m3623b(), m3612u.m3624a() + (m3612u2.m3624a() * 4), m3609x);
        } catch (C7064j unused) {
            return null;
        }
    }

    /* renamed from: w */
    private int[] m3610w(C10119a c10119a, boolean z) {
        int[] m3632i = m3632i();
        m3632i[0] = 0;
        m3632i[1] = 0;
        m3632i[2] = 0;
        m3632i[3] = 0;
        int m12261j = c10119a.m12261j();
        int i = 0;
        boolean z2 = false;
        while (i < m12261j) {
            z2 = !c10119a.m12265d(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < m12261j) {
            if (c10119a.m12265d(i) != z2) {
                m3632i[i2] = m3632i[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (AbstractC12946a.m3626o(m3632i)) {
                        return new int[]{i3, i};
                    }
                    i3 += m3632i[0] + m3632i[1];
                    m3632i[0] = m3632i[2];
                    m3632i[1] = m3632i[3];
                    m3632i[2] = 0;
                    m3632i[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                m3632i[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: x */
    private C12948c m3609x(C10119a c10119a, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean m12265d = c10119a.m12265d(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && m12265d != c10119a.m12265d(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] m3632i = m3632i();
        System.arraycopy(m3632i, 0, m3632i, 1, m3632i.length - 1);
        m3632i[0] = iArr[0] - i5;
        int m3625p = AbstractC12946a.m3625p(m3632i, f33671o);
        int i6 = iArr[1];
        if (z) {
            i2 = (c10119a.m12261j() - 1) - i6;
            i3 = (c10119a.m12261j() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C12948c(m3625p, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    @Override // tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        m3616q(this.f33672g, m3611v(c10119a, false, i, map));
        c10119a.m12258m();
        m3616q(this.f33673h, m3611v(c10119a, true, i, map));
        c10119a.m12258m();
        for (C12949d c12949d : this.f33672g) {
            if (c12949d.m3619c() > 1) {
                for (C12949d c12949d2 : this.f33673h) {
                    if (c12949d2.m3619c() > 1 && m3614s(c12949d, c12949d2)) {
                        return m3613t(c12949d, c12949d2);
                    }
                }
                continue;
            }
        }
        throw C7064j.m21461a();
    }

    @Override // tc.AbstractC12648k, p136hc.InterfaceC7066l
    public void reset() {
        this.f33672g.clear();
        this.f33673h.clear();
    }
}