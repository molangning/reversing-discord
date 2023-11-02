package p164j$.time;

import java.io.Serializable;
import p164j$.time.chrono.C8294h;
import p164j$.time.chrono.InterfaceC8288b;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8348p;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.EnumC8334b;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;

/* renamed from: j$.time.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8323i implements InterfaceC8343k, InterfaceC8288b, Serializable {

    /* renamed from: d */
    public static final C8323i f22355d = m17846n(-999999999, 1, 1);

    /* renamed from: e */
    public static final C8323i f22356e = m17846n(999999999, 12, 31);

    /* renamed from: a */
    private final int f22357a;

    /* renamed from: b */
    private final short f22358b;

    /* renamed from: c */
    private final short f22359c;

    private C8323i(int i, int i2, int i3) {
        this.f22357a = i;
        this.f22358b = (short) i2;
        this.f22359c = (short) i3;
    }

    /* renamed from: h */
    public static C8323i m17852h(InterfaceC8343k interfaceC8343k) {
        if (interfaceC8343k != null) {
            C8323i c8323i = (C8323i) interfaceC8343k.mo17802d(AbstractC8342j.m17811e());
            if (c8323i != null) {
                return c8323i;
            }
            throw new C8295d("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC8343k + " of type " + interfaceC8343k.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    /* renamed from: i */
    private int m17851i(InterfaceC8344l interfaceC8344l) {
        int i;
        int m17849k;
        int i2 = AbstractC8322h.f22353a[((EnumC8333a) interfaceC8344l).ordinal()];
        int i3 = this.f22357a;
        short s = this.f22359c;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return m17849k();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return m17850j().ordinal() + 1;
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                m17849k = (m17849k() - 1) % 7;
                return m17849k + 1;
            case 8:
                throw new C8348p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                m17849k = (m17849k() - 1) / 7;
                return m17849k + 1;
            case 10:
                return this.f22358b;
            case 11:
                throw new C8348p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new C8348p("Unsupported field: " + interfaceC8344l);
        }
    }

    /* renamed from: n */
    public static C8323i m17846n(int i, int i2, int i3) {
        long j = i;
        EnumC8333a.YEAR.m17823f(j);
        EnumC8333a.MONTH_OF_YEAR.m17823f(i2);
        EnumC8333a.DAY_OF_MONTH.m17823f(i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                C8294h.f22292a.getClass();
                if (C8294h.m17898a(j)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C8295d("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C8295d("Invalid date '" + EnumC8327m.m17833g(i2).name() + " " + i3 + "'");
            }
        }
        return new C8323i(i, i2, i3);
    }

    /* renamed from: o */
    public static C8323i m17845o(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new C8323i(EnumC8333a.YEAR.m17824e(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        int i;
        if (interfaceC8344l instanceof EnumC8333a) {
            EnumC8333a enumC8333a = (EnumC8333a) interfaceC8344l;
            if (!enumC8333a.isDateBased()) {
                throw new C8348p("Unsupported field: " + interfaceC8344l);
            }
            int i2 = AbstractC8322h.f22353a[enumC8333a.ordinal()];
            short s = this.f22358b;
            if (i2 == 1) {
                i = s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : m17847m() ? 29 : 28;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    return C8349q.m17787i(1L, (EnumC8327m.m17833g(s) != EnumC8327m.FEBRUARY || m17847m()) ? 5L : 4L);
                } else if (i2 != 4) {
                    return interfaceC8344l.mo17798c();
                } else {
                    return C8349q.m17787i(1L, this.f22357a <= 0 ? 1000000000L : 999999999L);
                }
            } else {
                i = m17847m() ? 366 : 365;
            }
            return C8349q.m17787i(1L, i);
        }
        return interfaceC8344l.mo17799b(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: b */
    public final boolean mo17804b(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? interfaceC8344l.isDateBased() : interfaceC8344l != null && interfaceC8344l.mo17800a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: c */
    public final long mo17803c(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? interfaceC8344l == EnumC8333a.EPOCH_DAY ? m17843q() : interfaceC8344l == EnumC8333a.PROLEPTIC_MONTH ? ((this.f22357a * 12) + this.f22358b) - 1 : m17851i(interfaceC8344l) : interfaceC8344l.mo17797d(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: d */
    public final Object mo17802d(InterfaceC8346n interfaceC8346n) {
        if (interfaceC8346n == AbstractC8342j.m17811e()) {
            return this;
        }
        if (interfaceC8346n == AbstractC8342j.m17806j() || interfaceC8346n == AbstractC8342j.m17807i() || interfaceC8346n == AbstractC8342j.m17809g() || interfaceC8346n == AbstractC8342j.m17810f()) {
            return null;
        }
        return interfaceC8346n == AbstractC8342j.m17812d() ? C8294h.f22292a : interfaceC8346n == AbstractC8342j.m17808h() ? EnumC8334b.DAYS : interfaceC8346n.mo17796a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final int mo17801e(EnumC8333a enumC8333a) {
        return enumC8333a instanceof EnumC8333a ? m17851i(enumC8333a) : AbstractC8342j.m17815a(this, enumC8333a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8323i) && m17853g((C8323i) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(InterfaceC8288b interfaceC8288b) {
        if (interfaceC8288b instanceof C8323i) {
            return m17853g((C8323i) interfaceC8288b);
        }
        int compare = Long.compare(m17843q(), ((C8323i) interfaceC8288b).m17843q());
        if (compare == 0) {
            C8294h.f22292a.getClass();
            return 0;
        }
        return compare;
    }

    /* renamed from: g */
    public final int m17853g(C8323i c8323i) {
        int i = this.f22357a - c8323i.f22357a;
        if (i == 0) {
            int i2 = this.f22358b - c8323i.f22358b;
            return i2 == 0 ? this.f22359c - c8323i.f22359c : i2;
        }
        return i;
    }

    public final int hashCode() {
        int i = this.f22357a;
        return (((i << 11) + (this.f22358b << 6)) + this.f22359c) ^ (i & (-2048));
    }

    /* renamed from: j */
    public final EnumC8296e m17850j() {
        return EnumC8296e.m17897f(((int) AbstractC8284a.m17901e(m17843q() + 3, 7L)) + 1);
    }

    /* renamed from: k */
    public final int m17849k() {
        return (EnumC8327m.m17833g(this.f22358b).m17834f(m17847m()) + this.f22359c) - 1;
    }

    /* renamed from: l */
    public final int m17848l() {
        return this.f22357a;
    }

    /* renamed from: m */
    public final boolean m17847m() {
        C8294h.f22292a.getClass();
        return C8294h.m17898a(this.f22357a);
    }

    /* renamed from: p */
    public final C8323i m17844p(long j) {
        int i;
        if (j == 0) {
            return this;
        }
        int m17824e = EnumC8333a.YEAR.m17824e(this.f22357a + j);
        short s = this.f22358b;
        int i2 = this.f22359c;
        if (s != 2) {
            if (s == 4 || s == 6 || s == 9 || s == 11) {
                i = 30;
            }
            return new C8323i(m17824e, s, i2);
        }
        C8294h.f22292a.getClass();
        i = C8294h.m17898a((long) m17824e) ? 29 : 28;
        i2 = Math.min(i2, i);
        return new C8323i(m17824e, s, i2);
    }

    /* renamed from: q */
    public final long m17843q() {
        long j;
        long j2 = this.f22357a;
        long j3 = this.f22358b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + (this.f22359c - 1);
        if (j3 > 2) {
            j5--;
            if (!m17847m()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* renamed from: r */
    public final C8323i m17842r() {
        if (m17849k() == 180) {
            return this;
        }
        EnumC8333a enumC8333a = EnumC8333a.YEAR;
        int i = this.f22357a;
        long j = i;
        enumC8333a.m17823f(j);
        EnumC8333a.DAY_OF_YEAR.m17823f(180);
        C8294h.f22292a.getClass();
        boolean m17898a = C8294h.m17898a(j);
        EnumC8327m m17833g = EnumC8327m.m17833g(6);
        int m17834f = m17833g.m17834f(m17898a);
        int i2 = AbstractC8326l.f22369a[m17833g.ordinal()];
        if (180 > (m17834f + (i2 != 1 ? (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31 : m17898a ? 29 : 28)) - 1) {
            m17833g = m17833g.m17832h();
        }
        return new C8323i(i, m17833g.ordinal() + 1, (180 - m17833g.m17834f(m17898a)) + 1);
    }

    public final String toString() {
        int i;
        int i2 = this.f22357a;
        int abs = Math.abs(i2);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb2.append(i2 - 10000);
                i = 1;
            } else {
                sb2.append(i2 + 10000);
                i = 0;
            }
            sb2.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb2.append('+');
            }
            sb2.append(i2);
        }
        short s = this.f22358b;
        sb2.append(s < 10 ? "-0" : "-");
        sb2.append((int) s);
        short s2 = this.f22359c;
        sb2.append(s2 >= 10 ? "-" : "-0");
        sb2.append((int) s2);
        return sb2.toString();
    }
}