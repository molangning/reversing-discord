package p296q6;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p151i6.C7402m;
import p195k8.C9191p0;
import p195k8.C9208y;

/* renamed from: q6.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11754p {

    /* renamed from: q6.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11755a {

        /* renamed from: a */
        public long f30641a;
    }

    /* renamed from: a */
    private static boolean m7004a(C9208y c9208y, C11759s c11759s, int i) {
        int m6995j = m6995j(c9208y, i);
        if (m6995j != -1 && m6995j <= c11759s.f30646b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m7003b(C9208y c9208y, int i) {
        if (c9208y.m16111D() == C9191p0.m16219v(c9208y.m16094d(), i, c9208y.m16093e() - 1, 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m7002c(C9208y c9208y, C11759s c11759s, boolean z, C11755a c11755a) {
        try {
            long m16104K = c9208y.m16104K();
            if (!z) {
                m16104K *= c11759s.f30646b;
            }
            c11755a.f30641a = m16104K;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m7001d(C9208y c9208y, C11759s c11759s, int i, C11755a c11755a) {
        boolean z;
        boolean z2;
        int m16093e = c9208y.m16093e();
        long m16109F = c9208y.m16109F();
        long j = m16109F >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (int) ((m16109F >> 12) & 15);
        int i3 = (int) ((m16109F >> 8) & 15);
        int i4 = (int) ((m16109F >> 4) & 15);
        int i5 = (int) ((m16109F >> 1) & 7);
        if ((m16109F & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!m6998g(i4, c11759s) || !m6999f(i5, c11759s) || z2 || !m7002c(c9208y, c11759s, z, c11755a) || !m7004a(c9208y, c11759s, i2) || !m7000e(c9208y, c11759s, i3) || !m7003b(c9208y, m16093e)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m7000e(C9208y c9208y, C11759s c11759s, int i) {
        int i2 = c11759s.f30649e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            if (i == c11759s.f30650f) {
                return true;
            }
            return false;
        } else if (i == 12) {
            if (c9208y.m16111D() * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == i2) {
                return true;
            }
            return false;
        } else if (i > 14) {
            return false;
        } else {
            int m16105J = c9208y.m16105J();
            if (i == 14) {
                m16105J *= 10;
            }
            if (m16105J == i2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m6999f(int i, C11759s c11759s) {
        return i == 0 || i == c11759s.f30653i;
    }

    /* renamed from: g */
    private static boolean m6998g(int i, C11759s c11759s) {
        if (i <= 7) {
            if (i != c11759s.f30651g - 1) {
                return false;
            }
            return true;
        } else if (i > 10 || c11759s.f30651g != 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m6997h(InterfaceC11747j interfaceC11747j, C11759s c11759s, int i, C11755a c11755a) {
        long mo3742h = interfaceC11747j.mo3742h();
        byte[] bArr = new byte[2];
        interfaceC11747j.mo6963n(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            interfaceC11747j.mo6969e();
            interfaceC11747j.mo6967i((int) (mo3742h - interfaceC11747j.getPosition()));
            return false;
        }
        C9208y c9208y = new C9208y(16);
        System.arraycopy(bArr, 0, c9208y.m16094d(), 0, 2);
        c9208y.m16100O(C11750l.m7007a(interfaceC11747j, c9208y.m16094d(), 2, 14));
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6967i((int) (mo3742h - interfaceC11747j.getPosition()));
        return m7001d(c9208y, c11759s, i, c11755a);
    }

    /* renamed from: i */
    public static long m6996i(InterfaceC11747j interfaceC11747j, C11759s c11759s) {
        int i;
        interfaceC11747j.mo6969e();
        boolean z = true;
        interfaceC11747j.mo6967i(1);
        byte[] bArr = new byte[1];
        interfaceC11747j.mo6963n(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        interfaceC11747j.mo6967i(2);
        if (z) {
            i = 7;
        } else {
            i = 6;
        }
        C9208y c9208y = new C9208y(i);
        c9208y.m16100O(C11750l.m7007a(interfaceC11747j, c9208y.m16094d(), 0, i));
        interfaceC11747j.mo6969e();
        C11755a c11755a = new C11755a();
        if (m7002c(c9208y, c11759s, z, c11755a)) {
            return c11755a.f30641a;
        }
        throw new C7402m();
    }

    /* renamed from: j */
    public static int m6995j(C9208y c9208y, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c9208y.m16111D() + 1;
            case 7:
                return c9208y.m16105J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
