package net.time4j.history;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: net.time4j.history.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class EnumC10751n {

    /* renamed from: j */
    public static final EnumC10751n f28068j;

    /* renamed from: k */
    public static final EnumC10751n f28069k;

    /* renamed from: l */
    public static final EnumC10751n f28070l;

    /* renamed from: m */
    public static final EnumC10751n f28071m;

    /* renamed from: n */
    public static final EnumC10751n f28072n;

    /* renamed from: o */
    public static final EnumC10751n f28073o;

    /* renamed from: p */
    public static final EnumC10751n f28074p;

    /* renamed from: q */
    public static final EnumC10751n f28075q;

    /* renamed from: r */
    public static final EnumC10751n f28076r;

    /* renamed from: s */
    private static final /* synthetic */ EnumC10751n[] f28077s;

    /* renamed from: net.time4j.history.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    enum C10752a extends EnumC10751n {
        C10752a(String str, int i) {
            super(str, i, null);
        }

        @Override // net.time4j.history.EnumC10751n
        /* renamed from: a */
        int mo10325a(C10761o c10761o, C10741h c10741h) {
            return c10741h.m10381e();
        }

        @Override // net.time4j.history.EnumC10751n
        /* renamed from: b */
        C10741h mo10323b(EnumC10744j enumC10744j, int i) {
            return C10741h.m10379g(enumC10744j, i, 1, 1);
        }
    }

    static {
        C10752a c10752a = new C10752a("BEGIN_OF_JANUARY", 0);
        f28068j = c10752a;
        EnumC10751n enumC10751n = new EnumC10751n("BEGIN_OF_MARCH", 1) { // from class: net.time4j.history.n.b
            @Override // net.time4j.history.EnumC10751n
            /* renamed from: b */
            C10741h mo10323b(EnumC10744j enumC10744j, int i) {
                return C10741h.m10379g(enumC10744j, i, 3, 1);
            }
        };
        f28069k = enumC10751n;
        EnumC10751n enumC10751n2 = new EnumC10751n("BEGIN_OF_SEPTEMBER", 2) { // from class: net.time4j.history.n.c
            @Override // net.time4j.history.EnumC10751n
            /* renamed from: a */
            int mo10325a(C10761o c10761o, C10741h c10741h) {
                EnumC10744j m10383c = c10741h.m10383c();
                int m10381e = c10741h.m10381e();
                int i = m10381e + 1;
                if (c10741h.compareTo(c10761o.m10319d(m10383c, i)) >= 0) {
                    return i;
                }
                return m10381e;
            }

            @Override // net.time4j.history.EnumC10751n
            /* renamed from: b */
            C10741h mo10323b(EnumC10744j enumC10744j, int i) {
                return C10741h.m10379g(enumC10744j, i - 1, 9, 1);
            }
        };
        f28070l = enumC10751n2;
        EnumC10751n enumC10751n3 = new EnumC10751n("CHRISTMAS_STYLE", 3) { // from class: net.time4j.history.n.d
            @Override // net.time4j.history.EnumC10751n
            /* renamed from: a */
            int mo10325a(C10761o c10761o, C10741h c10741h) {
                int m10381e = c10741h.m10381e();
                int i = m10381e + 1;
                if (c10741h.compareTo(c10761o.m10319d(c10741h.m10383c(), i)) >= 0) {
                    return i;
                }
                return m10381e;
            }

            @Override // net.time4j.history.EnumC10751n
            /* renamed from: b */
            C10741h mo10323b(EnumC10744j enumC10744j, int i) {
                return C10741h.m10379g(enumC10744j, i - 1, 12, 25);
            }
        };
        f28071m = enumC10751n3;
        EnumC10751n enumC10751n4 = new EnumC10751n("EASTER_STYLE", 4) { // from class: net.time4j.history.n.e
            @Override // net.time4j.history.EnumC10751n
            /* renamed from: b */
            C10741h mo10323b(EnumC10744j enumC10744j, int i) {
                int i2;
                int m10394a = EnumC10738e.EASTERN.m10394a(enumC10744j.m10367a(i)) - 1;
                if (m10394a > 31) {
                    m10394a -= 31;
                    i2 = 4;
                } else {
                    i2 = 3;
                }
                return C10741h.m10379g(enumC10744j, i, i2, m10394a);
            }
        };
        f28072n = enumC10751n4;
        EnumC10751n enumC10751n5 = new EnumC10751n("GOOD_FRIDAY", 5) { // from class: net.time4j.history.n.f
            @Override // net.time4j.history.EnumC10751n
            /* renamed from: b */
            C10741h mo10323b(EnumC10744j enumC10744j, int i) {
                int i2;
                int m10394a = EnumC10738e.EASTERN.m10394a(enumC10744j.m10367a(i)) - 2;
                if (m10394a > 31) {
                    m10394a -= 31;
                    i2 = 4;
                } else {
                    i2 = 3;
                }
                return C10741h.m10379g(enumC10744j, i, i2, m10394a);
            }
        };
        f28073o = enumC10751n5;
        EnumC10751n enumC10751n6 = new EnumC10751n("MARIA_ANUNCIATA", 6) { // from class: net.time4j.history.n.g
            @Override // net.time4j.history.EnumC10751n
            /* renamed from: b */
            C10741h mo10323b(EnumC10744j enumC10744j, int i) {
                return C10741h.m10379g(enumC10744j, i, 3, 25);
            }
        };
        f28074p = enumC10751n6;
        EnumC10751n enumC10751n7 = new EnumC10751n("CALCULUS_PISANUS", 7) { // from class: net.time4j.history.n.h
            @Override // net.time4j.history.EnumC10751n
            /* renamed from: a */
            int mo10325a(C10761o c10761o, C10741h c10741h) {
                int m10381e = c10741h.m10381e() - 1;
                if (c10741h.compareTo(mo10323b(c10741h.m10383c(), m10381e)) < 0) {
                    return m10381e - 1;
                }
                return m10381e;
            }

            @Override // net.time4j.history.EnumC10751n
            /* renamed from: b */
            C10741h mo10323b(EnumC10744j enumC10744j, int i) {
                return EnumC10751n.f28074p.mo10323b(enumC10744j, i + 1);
            }

            @Override // net.time4j.history.EnumC10751n
            /* renamed from: c */
            int mo10324c(boolean z, C10761o c10761o, EnumC10744j enumC10744j, int i, int i2, int i3) {
                return EnumC10751n.f28074p.mo10324c(z, c10761o, enumC10744j, i + 1, i2, i3);
            }
        };
        f28075q = enumC10751n7;
        EnumC10751n enumC10751n8 = new EnumC10751n("EPIPHANY", 8) { // from class: net.time4j.history.n.i
            @Override // net.time4j.history.EnumC10751n
            /* renamed from: b */
            C10741h mo10323b(EnumC10744j enumC10744j, int i) {
                return C10741h.m10379g(enumC10744j, i, 1, 6);
            }
        };
        f28076r = enumC10751n8;
        f28077s = new EnumC10751n[]{c10752a, enumC10751n, enumC10751n2, enumC10751n3, enumC10751n4, enumC10751n5, enumC10751n6, enumC10751n7, enumC10751n8};
    }

    private EnumC10751n(String str, int i) {
    }

    public static EnumC10751n valueOf(String str) {
        return (EnumC10751n) Enum.valueOf(EnumC10751n.class, str);
    }

    public static EnumC10751n[] values() {
        return (EnumC10751n[]) f28077s.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10325a(C10761o c10761o, C10741h c10741h) {
        int m10381e = c10741h.m10381e();
        if (c10741h.compareTo(mo10323b(c10741h.m10383c(), m10381e)) < 0) {
            return m10381e - 1;
        }
        return m10381e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C10741h mo10323b(EnumC10744j enumC10744j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r7.m10385a(r6) >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r2.m10385a(r6) >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r9 > r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r5 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        throw new java.lang.IllegalArgumentException("Invalid date due to changing new year rule (year too short to cover month and day-of-month): " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return r8;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo10324c(boolean r5, net.time4j.history.C10761o r6, net.time4j.history.EnumC10744j r7, int r8, int r9, int r10) {
        /*
            r4 = this;
            r0 = 5
            if (r9 < r0) goto L8
            r0 = 8
            if (r9 > r0) goto L8
            return r8
        L8:
            net.time4j.history.h r0 = r4.mo10323b(r7, r8)
            int r1 = r8 + 1
            net.time4j.history.h r6 = r6.m10319d(r7, r1)
            net.time4j.history.h r2 = net.time4j.history.C10741h.m10379g(r7, r8, r9, r10)
            r3 = 4
            if (r9 > r3) goto L2f
            net.time4j.history.h r7 = net.time4j.history.C10741h.m10379g(r7, r1, r9, r10)
            int r9 = r2.compareTo(r0)
            if (r9 < 0) goto L25
            r9 = r8
            goto L26
        L25:
            r9 = r1
        L26:
            int r6 = r7.compareTo(r6)
            if (r6 < 0) goto L2d
            goto L45
        L2d:
            r8 = r1
            goto L45
        L2f:
            int r1 = r8 + (-1)
            net.time4j.history.h r7 = net.time4j.history.C10741h.m10379g(r7, r1, r9, r10)
            int r7 = r7.compareTo(r0)
            if (r7 < 0) goto L3d
            r9 = r1
            goto L3e
        L3d:
            r9 = r8
        L3e:
            int r6 = r2.compareTo(r6)
            if (r6 < 0) goto L45
            goto L2d
        L45:
            if (r9 > r8) goto L4b
            if (r5 == 0) goto L4a
            r8 = r9
        L4a:
            return r8
        L4b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Invalid date due to changing new year rule (year too short to cover month and day-of-month): "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.history.EnumC10751n.mo10324c(boolean, net.time4j.history.o, net.time4j.history.j, int, int, int):int");
    }

    /* renamed from: d */
    public C10761o m10326d(int i) {
        if (i > 567) {
            C10761o c10761o = new C10761o(this, i);
            EnumC10751n enumC10751n = f28068j;
            if (this != enumC10751n) {
                return new C10761o(enumC10751n, 567).m10321b(c10761o);
            }
            return c10761o;
        }
        throw new IllegalArgumentException("Defining New-Year-strategy is not supported before Council of Tours in AD 567.");
    }

    /* synthetic */ EnumC10751n(String str, int i, C10752a c10752a) {
        this(str, i);
    }
}
