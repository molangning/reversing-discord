package p296q6;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p102fb.C6374d;
import p117g7.C6561a;
import p151i6.C7402m;
import p152i7.C7425h;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.C11759s;

/* renamed from: q6.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11756q {

    /* renamed from: q6.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11757a {

        /* renamed from: a */
        public C11759s f30642a;

        public C11757a(C11759s c11759s) {
            this.f30642a = c11759s;
        }
    }

    /* renamed from: a */
    public static boolean m6994a(InterfaceC11747j interfaceC11747j) {
        C9208y c9208y = new C9208y(4);
        interfaceC11747j.mo6963n(c9208y.m16094d(), 0, 4);
        if (c9208y.m16109F() != 1716281667) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m6993b(InterfaceC11747j interfaceC11747j) {
        interfaceC11747j.mo6969e();
        C9208y c9208y = new C9208y(2);
        interfaceC11747j.mo6963n(c9208y.m16094d(), 0, 2);
        int m16105J = c9208y.m16105J();
        if ((m16105J >> 2) == 16382) {
            interfaceC11747j.mo6969e();
            return m16105J;
        }
        interfaceC11747j.mo6969e();
        throw new C7402m("First frame does not start with sync code.");
    }

    /* renamed from: c */
    public static Metadata m6992c(InterfaceC11747j interfaceC11747j, boolean z) {
        C7425h.InterfaceC7426a interfaceC7426a;
        if (z) {
            interfaceC7426a = null;
        } else {
            interfaceC7426a = C7425h.f19956b;
        }
        Metadata m6958a = new C11763v().m6958a(interfaceC11747j, interfaceC7426a);
        if (m6958a == null || m6958a.m29247e() == 0) {
            return null;
        }
        return m6958a;
    }

    /* renamed from: d */
    public static Metadata m6991d(InterfaceC11747j interfaceC11747j, boolean z) {
        interfaceC11747j.mo6969e();
        long mo3742h = interfaceC11747j.mo3742h();
        Metadata m6992c = m6992c(interfaceC11747j, z);
        interfaceC11747j.mo6965k((int) (interfaceC11747j.mo3742h() - mo3742h));
        return m6992c;
    }

    /* renamed from: e */
    public static boolean m6990e(InterfaceC11747j interfaceC11747j, C11757a c11757a) {
        interfaceC11747j.mo6969e();
        C9207x c9207x = new C9207x(new byte[4]);
        interfaceC11747j.mo6963n(c9207x.f24230a, 0, 4);
        boolean m16127g = c9207x.m16127g();
        int m16126h = c9207x.m16126h(7);
        int m16126h2 = c9207x.m16126h(24) + 4;
        if (m16126h == 0) {
            c11757a.f30642a = m6986i(interfaceC11747j);
        } else {
            C11759s c11759s = c11757a.f30642a;
            if (c11759s != null) {
                if (m16126h == 3) {
                    c11757a.f30642a = c11759s.m6980c(m6987h(interfaceC11747j, m16126h2));
                } else if (m16126h == 4) {
                    c11757a.f30642a = c11759s.m6979d(m6984k(interfaceC11747j, m16126h2));
                } else if (m16126h == 6) {
                    c11757a.f30642a = c11759s.m6981b(Collections.singletonList(m6989f(interfaceC11747j, m16126h2)));
                } else {
                    interfaceC11747j.mo6965k(m16126h2);
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return m16127g;
    }

    /* renamed from: f */
    private static C6561a m6989f(InterfaceC11747j interfaceC11747j, int i) {
        C9208y c9208y = new C9208y(i);
        interfaceC11747j.readFully(c9208y.m16094d(), 0, i);
        c9208y.m16098Q(4);
        int m16084n = c9208y.m16084n();
        String m16113B = c9208y.m16113B(c9208y.m16084n(), C6374d.f18021a);
        String m16114A = c9208y.m16114A(c9208y.m16084n());
        int m16084n2 = c9208y.m16084n();
        int m16084n3 = c9208y.m16084n();
        int m16084n4 = c9208y.m16084n();
        int m16084n5 = c9208y.m16084n();
        int m16084n6 = c9208y.m16084n();
        byte[] bArr = new byte[m16084n6];
        c9208y.m16088j(bArr, 0, m16084n6);
        return new C6561a(m16084n, m16113B, m16114A, m16084n2, m16084n3, m16084n4, m16084n5, bArr);
    }

    /* renamed from: g */
    public static C11759s.C11760a m6988g(C9208y c9208y) {
        c9208y.m16098Q(1);
        int m16108G = c9208y.m16108G();
        long m16093e = c9208y.m16093e() + m16108G;
        int i = m16108G / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long m16075w = c9208y.m16075w();
            if (m16075w == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = m16075w;
            jArr2[i2] = c9208y.m16075w();
            c9208y.m16098Q(2);
            i2++;
        }
        c9208y.m16098Q((int) (m16093e - c9208y.m16093e()));
        return new C11759s.C11760a(jArr, jArr2);
    }

    /* renamed from: h */
    private static C11759s.C11760a m6987h(InterfaceC11747j interfaceC11747j, int i) {
        C9208y c9208y = new C9208y(i);
        interfaceC11747j.readFully(c9208y.m16094d(), 0, i);
        return m6988g(c9208y);
    }

    /* renamed from: i */
    private static C11759s m6986i(InterfaceC11747j interfaceC11747j) {
        byte[] bArr = new byte[38];
        interfaceC11747j.readFully(bArr, 0, 38);
        return new C11759s(bArr, 4);
    }

    /* renamed from: j */
    public static void m6985j(InterfaceC11747j interfaceC11747j) {
        C9208y c9208y = new C9208y(4);
        interfaceC11747j.readFully(c9208y.m16094d(), 0, 4);
        if (c9208y.m16109F() == 1716281667) {
            return;
        }
        throw new C7402m("Failed to read FLAC stream marker.");
    }

    /* renamed from: k */
    private static List<String> m6984k(InterfaceC11747j interfaceC11747j, int i) {
        C9208y c9208y = new C9208y(i);
        interfaceC11747j.readFully(c9208y.m16094d(), 0, i);
        c9208y.m16098Q(4);
        return Arrays.asList(C11737d0.m7022i(c9208y, false, false).f30596b);
    }
}