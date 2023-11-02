package p445yc;

import java.util.Formatter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yc.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13979f {

    /* renamed from: a */
    private final C13972a f35977a;

    /* renamed from: b */
    private final C13980g[] f35978b;

    /* renamed from: c */
    private C13974c f35979c;

    /* renamed from: d */
    private final int f35980d;

    public C13979f(C13972a c13972a, C13974c c13974c) {
        this.f35977a = c13972a;
        int m1051a = c13972a.m1051a();
        this.f35980d = m1051a;
        this.f35979c = c13974c;
        this.f35978b = new C13980g[m1051a + 2];
    }

    /* renamed from: a */
    private void m1017a(C13980g c13980g) {
        if (c13980g != null) {
            ((C13981h) c13980g).m994g(this.f35977a);
        }
    }

    /* renamed from: b */
    private static boolean m1016b(C13975d c13975d, C13975d c13975d2) {
        if (c13975d2 == null || !c13975d2.m1028g() || c13975d2.m1034a() != c13975d.m1034a()) {
            return false;
        }
        c13975d.m1026i(c13975d2.m1032c());
        return true;
    }

    /* renamed from: c */
    private static int m1015c(int i, int i2, C13975d c13975d) {
        if (c13975d == null) {
            return i2;
        }
        if (!c13975d.m1028g()) {
            if (c13975d.m1027h(i)) {
                c13975d.m1026i(i);
                return 0;
            }
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: d */
    private int m1014d() {
        int m1012f = m1012f();
        if (m1012f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f35980d + 1; i++) {
            C13975d[] m997d = this.f35978b[i].m997d();
            for (int i2 = 0; i2 < m997d.length; i2++) {
                C13975d c13975d = m997d[i2];
                if (c13975d != null && !c13975d.m1028g()) {
                    m1013e(i, i2, m997d);
                }
            }
        }
        return m1012f;
    }

    /* renamed from: e */
    private void m1013e(int i, int i2, C13975d[] c13975dArr) {
        C13975d[] c13975dArr2;
        C13975d c13975d = c13975dArr[i2];
        C13975d[] m997d = this.f35978b[i - 1].m997d();
        C13980g c13980g = this.f35978b[i + 1];
        if (c13980g != null) {
            c13975dArr2 = c13980g.m997d();
        } else {
            c13975dArr2 = m997d;
        }
        C13975d[] c13975dArr3 = new C13975d[14];
        c13975dArr3[2] = m997d[i2];
        c13975dArr3[3] = c13975dArr2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            c13975dArr3[0] = c13975dArr[i3];
            c13975dArr3[4] = m997d[i3];
            c13975dArr3[5] = c13975dArr2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            c13975dArr3[8] = c13975dArr[i4];
            c13975dArr3[10] = m997d[i4];
            c13975dArr3[11] = c13975dArr2[i4];
        }
        if (i2 < c13975dArr.length - 1) {
            int i5 = i2 + 1;
            c13975dArr3[1] = c13975dArr[i5];
            c13975dArr3[6] = m997d[i5];
            c13975dArr3[7] = c13975dArr2[i5];
        }
        if (i2 < c13975dArr.length - 2) {
            int i6 = i2 + 2;
            c13975dArr3[9] = c13975dArr[i6];
            c13975dArr3[12] = m997d[i6];
            c13975dArr3[13] = c13975dArr2[i6];
        }
        for (int i7 = 0; i7 < 14 && !m1016b(c13975d, c13975dArr3[i7]); i7++) {
        }
    }

    /* renamed from: f */
    private int m1012f() {
        m1011g();
        return m1010h() + m1009i();
    }

    /* renamed from: g */
    private void m1011g() {
        C13980g[] c13980gArr = this.f35978b;
        C13980g c13980g = c13980gArr[0];
        if (c13980g != null && c13980gArr[this.f35980d + 1] != null) {
            C13975d[] m997d = c13980g.m997d();
            C13975d[] m997d2 = this.f35978b[this.f35980d + 1].m997d();
            for (int i = 0; i < m997d.length; i++) {
                C13975d c13975d = m997d[i];
                if (c13975d != null && m997d2[i] != null && c13975d.m1032c() == m997d2[i].m1032c()) {
                    for (int i2 = 1; i2 <= this.f35980d; i2++) {
                        C13975d c13975d2 = this.f35978b[i2].m997d()[i];
                        if (c13975d2 != null) {
                            c13975d2.m1026i(m997d[i].m1032c());
                            if (!c13975d2.m1028g()) {
                                this.f35978b[i2].m997d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m1010h() {
        C13980g c13980g = this.f35978b[0];
        if (c13980g == null) {
            return 0;
        }
        C13975d[] m997d = c13980g.m997d();
        int i = 0;
        for (int i2 = 0; i2 < m997d.length; i2++) {
            C13975d c13975d = m997d[i2];
            if (c13975d != null) {
                int m1032c = c13975d.m1032c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f35980d + 1 && i3 < 2; i4++) {
                    C13975d c13975d2 = this.f35978b[i4].m997d()[i2];
                    if (c13975d2 != null) {
                        i3 = m1015c(m1032c, i3, c13975d2);
                        if (!c13975d2.m1028g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m1009i() {
        C13980g[] c13980gArr = this.f35978b;
        int i = this.f35980d;
        if (c13980gArr[i + 1] == null) {
            return 0;
        }
        C13975d[] m997d = c13980gArr[i + 1].m997d();
        int i2 = 0;
        for (int i3 = 0; i3 < m997d.length; i3++) {
            C13975d c13975d = m997d[i3];
            if (c13975d != null) {
                int m1032c = c13975d.m1032c();
                int i4 = 0;
                for (int i5 = this.f35980d + 1; i5 > 0 && i4 < 2; i5--) {
                    C13975d c13975d2 = this.f35978b[i5].m997d()[i3];
                    if (c13975d2 != null) {
                        i4 = m1015c(m1032c, i4, c13975d2);
                        if (!c13975d2.m1028g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: j */
    public int m1008j() {
        return this.f35980d;
    }

    /* renamed from: k */
    public int m1007k() {
        return this.f35977a.m1050b();
    }

    /* renamed from: l */
    public int m1006l() {
        return this.f35977a.m1049c();
    }

    /* renamed from: m */
    public C13974c m1005m() {
        return this.f35979c;
    }

    /* renamed from: n */
    public C13980g m1004n(int i) {
        return this.f35978b[i];
    }

    /* renamed from: o */
    public C13980g[] m1003o() {
        m1017a(this.f35978b[0]);
        m1017a(this.f35978b[this.f35980d + 1]);
        int i = 928;
        while (true) {
            int m1014d = m1014d();
            if (m1014d <= 0 || m1014d >= i) {
                break;
            }
            i = m1014d;
        }
        return this.f35978b;
    }

    /* renamed from: p */
    public void m1002p(C13974c c13974c) {
        this.f35979c = c13974c;
    }

    /* renamed from: q */
    public void m1001q(int i, C13980g c13980g) {
        this.f35978b[i] = c13980g;
    }

    public String toString() {
        C13980g[] c13980gArr = this.f35978b;
        C13980g c13980g = c13980gArr[0];
        if (c13980g == null) {
            c13980g = c13980gArr[this.f35980d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < c13980g.m997d().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.f35980d + 2; i2++) {
                    C13980g c13980g2 = this.f35978b[i2];
                    if (c13980g2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C13975d c13975d = c13980g2.m997d()[i];
                        if (c13975d == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(c13975d.m1032c()), Integer.valueOf(c13975d.m1030e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}