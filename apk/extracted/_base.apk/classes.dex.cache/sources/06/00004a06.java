package p296q6;

import p195k8.C9197r;
import p195k8.C9208y;

/* renamed from: q6.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11734c {
    /* renamed from: a */
    public static void m7039a(long j, C9208y c9208y, InterfaceC11732b0[] interfaceC11732b0Arr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (c9208y.m16097a() > 1) {
                int m7037c = m7037c(c9208y);
                int m7037c2 = m7037c(c9208y);
                int m16093e = c9208y.m16093e() + m7037c2;
                if (m7037c2 != -1 && m7037c2 <= c9208y.m16097a()) {
                    if (m7037c == 4 && m7037c2 >= 8) {
                        int m16111D = c9208y.m16111D();
                        int m16105J = c9208y.m16105J();
                        if (m16105J == 49) {
                            i = c9208y.m16084n();
                        } else {
                            i = 0;
                        }
                        int m16111D2 = c9208y.m16111D();
                        if (m16105J == 47) {
                            c9208y.m16098Q(1);
                        }
                        if (m16111D == 181 && ((m16105J == 49 || m16105J == 47) && m16111D2 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m16105J == 49) {
                            if (i != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            m7038b(j, c9208y, interfaceC11732b0Arr);
                        }
                    }
                } else {
                    C9197r.m16178h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    m16093e = c9208y.m16092f();
                }
                c9208y.m16099P(m16093e);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m7038b(long j, C9208y c9208y, InterfaceC11732b0[] interfaceC11732b0Arr) {
        boolean z;
        int m16111D = c9208y.m16111D();
        if ((m16111D & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        c9208y.m16098Q(1);
        int i = (m16111D & 31) * 3;
        int m16093e = c9208y.m16093e();
        for (InterfaceC11732b0 interfaceC11732b0 : interfaceC11732b0Arr) {
            c9208y.m16099P(m16093e);
            interfaceC11732b0.mo6170a(c9208y, i);
            interfaceC11732b0.mo6162f(j, 1, i, 0, null);
        }
    }

    /* renamed from: c */
    private static int m7037c(C9208y c9208y) {
        int i = 0;
        while (c9208y.m16097a() != 0) {
            int m16111D = c9208y.m16111D();
            i += m16111D;
            if (m16111D != 255) {
                return i;
            }
        }
        return -1;
    }
}