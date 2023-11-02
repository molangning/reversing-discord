package p418x6;

import p195k8.C9208y;
import p296q6.InterfaceC11747j;

/* renamed from: x6.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13719n {

    /* renamed from: a */
    private static final int[] f35349a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    private static boolean m1650a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f35349a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m1649b(InterfaceC11747j interfaceC11747j) {
        return m1648c(interfaceC11747j, true, false);
    }

    /* renamed from: c */
    private static boolean m1648c(InterfaceC11747j interfaceC11747j, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        long length = interfaceC11747j.getLength();
        long j = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && length <= 4096) {
            j2 = length;
        }
        int i3 = (int) j2;
        C9208y c9208y = new C9208y(64);
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        while (i4 < i3) {
            c9208y.m16103L(8);
            if (!interfaceC11747j.mo6970c(c9208y.m16094d(), z8 ? 1 : 0, 8, true)) {
                break;
            }
            long m16109F = c9208y.m16109F();
            int m16084n = c9208y.m16084n();
            if (m16109F == 1) {
                interfaceC11747j.mo6963n(c9208y.m16094d(), 8, 8);
                c9208y.m16100O(16);
                i = 16;
                m16109F = c9208y.m16075w();
            } else {
                if (m16109F == 0) {
                    long length2 = interfaceC11747j.getLength();
                    if (length2 != j) {
                        m16109F = (length2 - interfaceC11747j.mo3742h()) + 8;
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (m16109F < j3) {
                return z8;
            }
            i4 += i;
            if (m16084n == 1836019574) {
                i3 += (int) m16109F;
                if (i2 != 0 && i3 > length) {
                    i3 = (int) length;
                }
            } else if (m16084n != 1836019558 && m16084n != 1836475768) {
                int i5 = i2;
                if ((i4 + m16109F) - j3 >= i3) {
                    z3 = false;
                    z4 = true;
                    break;
                }
                int i6 = (int) (m16109F - j3);
                i4 += i6;
                if (m16084n == 1718909296) {
                    if (i6 < 8) {
                        return false;
                    }
                    c9208y.m16103L(i6);
                    interfaceC11747j.mo6963n(c9208y.m16094d(), 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            z7 = z9;
                            break;
                        }
                        if (i8 == 1) {
                            c9208y.m16098Q(4);
                        } else if (m1650a(c9208y.m16084n(), z2)) {
                            z7 = true;
                            break;
                        }
                        i8++;
                    }
                    if (!z7) {
                        return false;
                    }
                    z6 = false;
                    z9 = z7;
                } else {
                    z6 = false;
                    z9 = z9;
                    if (i6 != 0) {
                        interfaceC11747j.mo6967i(i6);
                        z9 = z9;
                    }
                }
                z8 = z6;
                i2 = i5;
            } else {
                z3 = z8 ? 1 : 0;
                z4 = true;
                z5 = true;
                break;
            }
            j = -1;
            z9 = z9;
        }
        z3 = z8 ? 1 : 0;
        z4 = true;
        z5 = z3;
        if (!z9 || z != z5) {
            return z3;
        }
        return z4;
    }

    /* renamed from: d */
    public static boolean m1647d(InterfaceC11747j interfaceC11747j, boolean z) {
        return m1648c(interfaceC11747j, false, z);
    }
}