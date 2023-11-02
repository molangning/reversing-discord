package p164j$.time;

import java.io.Serializable;
import p164j$.time.chrono.C8294h;
import p164j$.time.chrono.InterfaceC8288b;
import p164j$.time.chrono.InterfaceC8289c;
import p164j$.time.format.DateTimeFormatter;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.EnumC8334b;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;

/* renamed from: j$.time.LocalDateTime */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class LocalDateTime implements InterfaceC8343k, InterfaceC8289c, Serializable {

    /* renamed from: c */
    public static final LocalDateTime f22278c;

    /* renamed from: d */
    public static final LocalDateTime f22279d;

    /* renamed from: a */
    private final C8323i f22280a;

    /* renamed from: b */
    private final C8325k f22281b;

    static {
        C8323i c8323i = C8323i.f22355d;
        C8325k c8325k = C8325k.f22362e;
        if (c8323i == null) {
            throw new NullPointerException("date");
        }
        if (c8325k == null) {
            throw new NullPointerException("time");
        }
        f22278c = new LocalDateTime(c8323i, c8325k);
        C8323i c8323i2 = C8323i.f22356e;
        C8325k c8325k2 = C8325k.f22363f;
        if (c8323i2 == null) {
            throw new NullPointerException("date");
        }
        if (c8325k2 == null) {
            throw new NullPointerException("time");
        }
        f22279d = new LocalDateTime(c8323i2, c8325k2);
    }

    private LocalDateTime(C8323i c8323i, C8325k c8325k) {
        this.f22280a = c8323i;
        this.f22281b = c8325k;
    }

    /* renamed from: i */
    public static LocalDateTime m17914i(long j, int i, ZoneOffset zoneOffset) {
        long m17907g;
        if (zoneOffset != null) {
            long j2 = i;
            EnumC8333a.NANO_OF_SECOND.m17823f(j2);
            return new LocalDateTime(C8323i.m17845o(AbstractC8284a.m17900f(j + zoneOffset.m17907g(), 86400L)), C8325k.m17837j((((int) AbstractC8284a.m17901e(m17907g, 86400L)) * 1000000000) + j2));
        }
        throw new NullPointerException("offset");
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        if (interfaceC8344l instanceof EnumC8333a) {
            if (((EnumC8333a) interfaceC8344l).isTimeBased()) {
                C8325k c8325k = this.f22281b;
                c8325k.getClass();
                return AbstractC8342j.m17813c(c8325k, interfaceC8344l);
            }
            return this.f22280a.mo17805a(interfaceC8344l);
        }
        return interfaceC8344l.mo17799b(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: b */
    public final boolean mo17804b(InterfaceC8344l interfaceC8344l) {
        if (!(interfaceC8344l instanceof EnumC8333a)) {
            return interfaceC8344l != null && interfaceC8344l.mo17800a(this);
        }
        EnumC8333a enumC8333a = (EnumC8333a) interfaceC8344l;
        return enumC8333a.isDateBased() || enumC8333a.isTimeBased();
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: c */
    public final long mo17803c(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? ((EnumC8333a) interfaceC8344l).isTimeBased() ? this.f22281b.mo17803c(interfaceC8344l) : this.f22280a.mo17803c(interfaceC8344l) : interfaceC8344l.mo17797d(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: d */
    public final Object mo17802d(InterfaceC8346n interfaceC8346n) {
        if (interfaceC8346n == AbstractC8342j.m17811e()) {
            return this.f22280a;
        }
        if (interfaceC8346n == AbstractC8342j.m17806j() || interfaceC8346n == AbstractC8342j.m17807i() || interfaceC8346n == AbstractC8342j.m17809g()) {
            return null;
        }
        if (interfaceC8346n == AbstractC8342j.m17810f()) {
            return this.f22281b;
        }
        if (interfaceC8346n != AbstractC8342j.m17812d()) {
            return interfaceC8346n == AbstractC8342j.m17808h() ? EnumC8334b.NANOS : interfaceC8346n.mo17796a(this);
        }
        ((C8323i) m17911l()).getClass();
        return C8294h.f22292a;
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final int mo17801e(EnumC8333a enumC8333a) {
        return enumC8333a instanceof EnumC8333a ? enumC8333a.isTimeBased() ? this.f22281b.mo17801e(enumC8333a) : this.f22280a.mo17801e(enumC8333a) : AbstractC8342j.m17815a(this, enumC8333a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.f22280a.equals(localDateTime.f22280a) && this.f22281b.equals(localDateTime.f22281b);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(InterfaceC8289c interfaceC8289c) {
        boolean z = interfaceC8289c instanceof LocalDateTime;
        C8325k c8325k = this.f22281b;
        C8323i c8323i = this.f22280a;
        if (z) {
            LocalDateTime localDateTime = (LocalDateTime) interfaceC8289c;
            int m17853g = c8323i.m17853g(localDateTime.f22280a);
            return m17853g == 0 ? c8325k.compareTo(localDateTime.f22281b) : m17853g;
        }
        LocalDateTime localDateTime2 = (LocalDateTime) interfaceC8289c;
        int compareTo = c8323i.compareTo(localDateTime2.f22280a);
        if (compareTo == 0) {
            int compareTo2 = c8325k.compareTo(localDateTime2.f22281b);
            if (compareTo2 == 0) {
                ((C8323i) m17911l()).getClass();
                C8294h c8294h = C8294h.f22292a;
                ((C8323i) localDateTime2.m17911l()).getClass();
                c8294h.getClass();
                c8294h.getClass();
                return 0;
            }
            return compareTo2;
        }
        return compareTo;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.m17893a(this);
        }
        throw new NullPointerException("formatter");
    }

    /* renamed from: g */
    public final int m17916g() {
        return this.f22281b.m17838i();
    }

    /* renamed from: h */
    public final int m17915h() {
        return this.f22280a.m17848l();
    }

    public final int hashCode() {
        return this.f22280a.hashCode() ^ this.f22281b.hashCode();
    }

    /* renamed from: j */
    public final long m17913j(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return ((((C8323i) m17911l()).m17843q() * 86400) + m17910m().m17835l()) - zoneOffset.m17907g();
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: k */
    public final C8323i m17912k() {
        return this.f22280a;
    }

    /* renamed from: l */
    public final InterfaceC8288b m17911l() {
        return this.f22280a;
    }

    /* renamed from: m */
    public final C8325k m17910m() {
        return this.f22281b;
    }

    public final String toString() {
        return this.f22280a.toString() + 'T' + this.f22281b.toString();
    }
}