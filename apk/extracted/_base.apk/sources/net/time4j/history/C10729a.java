package net.time4j.history;

import java.util.Arrays;

/* renamed from: net.time4j.history.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10729a {

    /* renamed from: c */
    private static final int[] f28000c;

    /* renamed from: d */
    private static final C10741h f28001d = C10741h.m10379g(EnumC10744j.AD, 8, 1, 1);

    /* renamed from: e */
    private static final C10741h f28002e = C10741h.m10379g(EnumC10744j.BC, 45, 1, 1);

    /* renamed from: f */
    public static final C10729a f28003f;

    /* renamed from: a */
    private final int[] f28004a;

    /* renamed from: b */
    private final InterfaceC10731b f28005b;

    /* renamed from: net.time4j.history.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    class C10730a implements InterfaceC10731b {
        C10730a() {
        }

        /* renamed from: e */
        private int m10442e(int i, int i2) {
            switch (i2) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    if (m10440g(i)) {
                        return 29;
                    }
                    return 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    throw new IllegalArgumentException("Invalid month: " + i2);
            }
        }

        /* renamed from: f */
        private int m10441f(C10741h c10741h) {
            return c10741h.m10383c().m10367a(c10741h.m10381e());
        }

        /* renamed from: g */
        private boolean m10440g(int i) {
            return Arrays.binarySearch(C10729a.this.f28004a, i) >= 0;
        }

        @Override // net.time4j.history.InterfaceC10731b
        /* renamed from: a */
        public long mo10437a(C10741h c10741h) {
            long j;
            if (c10741h.compareTo(C10729a.f28001d) >= 0) {
                return EnumC10732c.f28008k.mo10437a(c10741h);
            }
            if (c10741h.compareTo(C10729a.f28002e) >= 0) {
                int m10441f = m10441f(c10741h);
                long j2 = -676021;
                for (int i = 7; i >= m10441f; i--) {
                    if (m10440g(i)) {
                        j = 366;
                    } else {
                        j = 365;
                    }
                    j2 -= j;
                }
                for (int i2 = 1; i2 < c10741h.m10382d(); i2++) {
                    j2 += m10442e(m10441f, i2);
                }
                return (j2 + c10741h.m10384b()) - 1;
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + c10741h);
        }

        @Override // net.time4j.history.InterfaceC10731b
        /* renamed from: b */
        public int mo10436b(C10741h c10741h) {
            if (c10741h.compareTo(C10729a.f28001d) >= 0) {
                return EnumC10732c.f28008k.mo10436b(c10741h);
            }
            if (c10741h.compareTo(C10729a.f28002e) >= 0) {
                return m10442e(m10441f(c10741h), c10741h.m10382d());
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + c10741h);
        }

        @Override // net.time4j.history.InterfaceC10731b
        /* renamed from: c */
        public C10741h mo10435c(long j) {
            long j2;
            EnumC10744j enumC10744j;
            long j3 = -676021;
            if (j >= -676021) {
                return EnumC10732c.f28008k.mo10435c(j);
            }
            int i = 7;
            while (i >= -44) {
                if (m10440g(i)) {
                    j2 = 366;
                } else {
                    j2 = 365;
                }
                j3 -= j2;
                if (j3 <= j) {
                    int i2 = 1;
                    while (i2 <= 12) {
                        long m10442e = m10442e(i, i2) + j3;
                        if (m10442e > j) {
                            if (i <= 0) {
                                enumC10744j = EnumC10744j.BC;
                            } else {
                                enumC10744j = EnumC10744j.AD;
                            }
                            if (i <= 0) {
                                i = 1 - i;
                            }
                            return C10741h.m10379g(enumC10744j, i, i2, (int) ((j - j3) + 1));
                        }
                        i2++;
                        j3 = m10442e;
                    }
                    continue;
                }
                i--;
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + j);
        }

        @Override // net.time4j.history.InterfaceC10731b
        /* renamed from: d */
        public boolean mo10434d(C10741h c10741h) {
            int m10441f;
            if (c10741h == null || (m10441f = m10441f(c10741h)) < -44) {
                return false;
            }
            if (m10441f >= 8) {
                return EnumC10732c.f28008k.mo10434d(c10741h);
            }
            if (c10741h.m10384b() > m10442e(m10441f, c10741h.m10382d())) {
                return false;
            }
            return true;
        }
    }

    static {
        int[] iArr = {42, 39, 36, 33, 30, 27, 24, 21, 18, 15, 12, 9};
        f28000c = iArr;
        f28003f = new C10729a(iArr);
    }

    private C10729a(int... iArr) {
        int i;
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= iArr.length) {
                break;
            }
            iArr2[i2] = 1 - iArr[i2];
            i2++;
        }
        Arrays.sort(iArr2);
        this.f28004a = iArr2;
        if (iArr2.length != 0) {
            int i3 = iArr2[0];
            if (i3 >= -44 && iArr2[iArr2.length - 1] < 8) {
                while (i < iArr.length) {
                    int i4 = iArr2[i];
                    if (i4 != i3) {
                        i++;
                        i3 = i4;
                    } else {
                        throw new IllegalArgumentException("Contains duplicates: " + Arrays.toString(iArr));
                    }
                }
                this.f28005b = new C10730a();
                return;
            }
            throw new IllegalArgumentException("Out of range: " + Arrays.toString(iArr));
        }
        throw new IllegalArgumentException("Missing leap years.");
    }

    /* renamed from: f */
    public static C10729a m10443f(int... iArr) {
        if (Arrays.equals(iArr, f28000c)) {
            return f28003f;
        }
        return new C10729a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC10731b m10445d() {
        return this.f28005b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m10444e() {
        return this.f28004a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C10729a) && this.f28004a == ((C10729a) obj).f28004a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f28004a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < this.f28004a.length; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            int i2 = 1 - this.f28004a[i];
            if (i2 > 0) {
                sb2.append("BC ");
                sb2.append(i2);
            } else {
                sb2.append("AD ");
                sb2.append(this.f28004a[i]);
            }
        }
        return sb2.toString();
    }
}
