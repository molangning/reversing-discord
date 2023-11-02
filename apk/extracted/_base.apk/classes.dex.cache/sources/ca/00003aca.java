package p164j$.time.temporal;

import p164j$.time.C8323i;
import p164j$.time.EnumC8296e;
import p164j$.time.chrono.AbstractC8287a;
import p164j$.time.chrono.C8294h;
import p164j$.time.chrono.InterfaceC8293g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.temporal.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class EnumC8339g implements InterfaceC8344l {
    public static final EnumC8339g DAY_OF_QUARTER;
    public static final EnumC8339g QUARTER_OF_YEAR;
    public static final EnumC8339g WEEK_BASED_YEAR;
    public static final EnumC8339g WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a */
    private static final int[] f22382a;

    /* renamed from: b */
    private static final /* synthetic */ EnumC8339g[] f22383b;

    static {
        EnumC8339g enumC8339g = new EnumC8339g() { // from class: j$.time.temporal.c
            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: a */
            public final boolean mo17800a(InterfaceC8343k interfaceC8343k) {
                return interfaceC8343k.mo17804b(EnumC8333a.DAY_OF_YEAR) && interfaceC8343k.mo17804b(EnumC8333a.MONTH_OF_YEAR) && interfaceC8343k.mo17804b(EnumC8333a.YEAR) && EnumC8339g.m17822e(interfaceC8343k);
            }

            @Override // p164j$.time.temporal.EnumC8339g, p164j$.time.temporal.InterfaceC8344l
            /* renamed from: b */
            public final C8349q mo17799b(InterfaceC8343k interfaceC8343k) {
                if (mo17800a(interfaceC8343k)) {
                    long mo17803c = interfaceC8343k.mo17803c(EnumC8339g.QUARTER_OF_YEAR);
                    if (mo17803c != 1) {
                        return mo17803c == 2 ? C8349q.m17787i(1L, 91L) : (mo17803c == 3 || mo17803c == 4) ? C8349q.m17787i(1L, 92L) : mo17798c();
                    }
                    long mo17803c2 = interfaceC8343k.mo17803c(EnumC8333a.YEAR);
                    C8294h.f22292a.getClass();
                    return C8294h.m17898a(mo17803c2) ? C8349q.m17787i(1L, 91L) : C8349q.m17787i(1L, 90L);
                }
                throw new C8348p("Unsupported field: DayOfQuarter");
            }

            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: c */
            public final C8349q mo17798c() {
                return C8349q.m17786j(90L, 92L);
            }

            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: d */
            public final long mo17797d(InterfaceC8343k interfaceC8343k) {
                int[] iArr;
                if (mo17800a(interfaceC8343k)) {
                    int mo17801e = interfaceC8343k.mo17801e(EnumC8333a.DAY_OF_YEAR);
                    int mo17801e2 = interfaceC8343k.mo17801e(EnumC8333a.MONTH_OF_YEAR);
                    long mo17803c = interfaceC8343k.mo17803c(EnumC8333a.YEAR);
                    iArr = EnumC8339g.f22382a;
                    int i = (mo17801e2 - 1) / 3;
                    C8294h.f22292a.getClass();
                    return mo17801e - iArr[i + (C8294h.m17898a(mo17803c) ? 4 : 0)];
                }
                throw new C8348p("Unsupported field: DayOfQuarter");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = enumC8339g;
        EnumC8339g enumC8339g2 = new EnumC8339g() { // from class: j$.time.temporal.d
            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: a */
            public final boolean mo17800a(InterfaceC8343k interfaceC8343k) {
                return interfaceC8343k.mo17804b(EnumC8333a.MONTH_OF_YEAR) && EnumC8339g.m17822e(interfaceC8343k);
            }

            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: c */
            public final C8349q mo17798c() {
                return C8349q.m17787i(1L, 4L);
            }

            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: d */
            public final long mo17797d(InterfaceC8343k interfaceC8343k) {
                if (mo17800a(interfaceC8343k)) {
                    return (interfaceC8343k.mo17803c(EnumC8333a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new C8348p("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = enumC8339g2;
        EnumC8339g enumC8339g3 = new EnumC8339g() { // from class: j$.time.temporal.e
            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: a */
            public final boolean mo17800a(InterfaceC8343k interfaceC8343k) {
                return interfaceC8343k.mo17804b(EnumC8333a.EPOCH_DAY) && EnumC8339g.m17822e(interfaceC8343k);
            }

            @Override // p164j$.time.temporal.EnumC8339g, p164j$.time.temporal.InterfaceC8344l
            /* renamed from: b */
            public final C8349q mo17799b(InterfaceC8343k interfaceC8343k) {
                C8349q m17816k;
                if (mo17800a(interfaceC8343k)) {
                    m17816k = EnumC8339g.m17816k(C8323i.m17852h(interfaceC8343k));
                    return m17816k;
                }
                throw new C8348p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: c */
            public final C8349q mo17798c() {
                return C8349q.m17786j(52L, 53L);
            }

            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: d */
            public final long mo17797d(InterfaceC8343k interfaceC8343k) {
                if (mo17800a(interfaceC8343k)) {
                    return EnumC8339g.m17819h(C8323i.m17852h(interfaceC8343k));
                }
                throw new C8348p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC8339g3;
        EnumC8339g enumC8339g4 = new EnumC8339g() { // from class: j$.time.temporal.f
            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: a */
            public final boolean mo17800a(InterfaceC8343k interfaceC8343k) {
                return interfaceC8343k.mo17804b(EnumC8333a.EPOCH_DAY) && EnumC8339g.m17822e(interfaceC8343k);
            }

            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: c */
            public final C8349q mo17798c() {
                return EnumC8333a.YEAR.mo17798c();
            }

            @Override // p164j$.time.temporal.InterfaceC8344l
            /* renamed from: d */
            public final long mo17797d(InterfaceC8343k interfaceC8343k) {
                int m17817j;
                if (mo17800a(interfaceC8343k)) {
                    m17817j = EnumC8339g.m17817j(C8323i.m17852h(interfaceC8343k));
                    return m17817j;
                }
                throw new C8348p("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = enumC8339g4;
        f22383b = new EnumC8339g[]{enumC8339g, enumC8339g2, enumC8339g3, enumC8339g4};
        f22382a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public EnumC8339g(String str, int i) {
        super(str, i);
    }

    /* renamed from: e */
    public static boolean m17822e(InterfaceC8343k interfaceC8343k) {
        if (interfaceC8343k != null) {
            Object obj = (InterfaceC8293g) interfaceC8343k.mo17802d(AbstractC8342j.f22390b);
            if (obj == null) {
                obj = C8294h.f22292a;
            }
            return ((AbstractC8287a) obj).equals(C8294h.f22292a);
        }
        throw new NullPointerException("temporal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.m17847m())) == false) goto L17;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m17819h(p164j$.time.C8323i r5) {
        /*
            j$.time.e r0 = r5.m17850j()
            int r0 = r0.ordinal()
            int r1 = r5.m17849k()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L1c
            int r0 = r0 + 7
        L1c:
            if (r1 >= r0) goto L32
            j$.time.i r5 = r5.m17842r()
            r0 = -1
            j$.time.i r5 = r5.m17844p(r0)
            j$.time.temporal.q r5 = m17816k(r5)
            long r0 = r5.m17792d()
            int r5 = (int) r0
            goto L4e
        L32:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L4c
            if (r0 == r3) goto L48
            r3 = -2
            if (r0 != r3) goto L46
            boolean r5 = r5.m17847m()
            if (r5 == 0) goto L46
            goto L48
        L46:
            r5 = 0
            goto L49
        L48:
            r5 = r2
        L49:
            if (r5 != 0) goto L4c
            goto L4d
        L4c:
            r2 = r1
        L4d:
            r5 = r2
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.time.temporal.EnumC8339g.m17819h(j$.time.i):int");
    }

    /* renamed from: j */
    public static int m17817j(C8323i c8323i) {
        int m17848l = c8323i.m17848l();
        int m17849k = c8323i.m17849k();
        if (m17849k <= 3) {
            return m17849k - c8323i.m17850j().ordinal() < -2 ? m17848l - 1 : m17848l;
        } else if (m17849k >= 363) {
            return ((m17849k - 363) - (c8323i.m17847m() ? 1 : 0)) - c8323i.m17850j().ordinal() >= 0 ? m17848l + 1 : m17848l;
        } else {
            return m17848l;
        }
    }

    /* renamed from: k */
    public static C8349q m17816k(C8323i c8323i) {
        C8323i m17846n = C8323i.m17846n(m17817j(c8323i), 1, 1);
        return C8349q.m17787i(1L, (m17846n.m17850j() == EnumC8296e.THURSDAY || (m17846n.m17850j() == EnumC8296e.WEDNESDAY && m17846n.m17847m())) ? 53 : 52);
    }

    public static EnumC8339g valueOf(String str) {
        return (EnumC8339g) Enum.valueOf(EnumC8339g.class, str);
    }

    public static EnumC8339g[] values() {
        return (EnumC8339g[]) f22383b.clone();
    }

    /* renamed from: b */
    public C8349q mo17799b(InterfaceC8343k interfaceC8343k) {
        return mo17798c();
    }

    @Override // p164j$.time.temporal.InterfaceC8344l
    public final boolean isDateBased() {
        return true;
    }

    @Override // p164j$.time.temporal.InterfaceC8344l
    public final boolean isTimeBased() {
        return false;
    }
}