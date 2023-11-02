package p164j$.time;

import java.io.Serializable;
import p164j$.time.chrono.C8294h;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8345m;
import p164j$.time.temporal.C8348p;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.EnumC8334b;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;
import p164j$.time.zone.C8352c;

/* renamed from: j$.time.OffsetDateTime */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class OffsetDateTime implements InterfaceC8343k, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f22282a;

    /* renamed from: b */
    private final ZoneOffset f22283b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f22278c;
        ZoneOffset zoneOffset = ZoneOffset.f22287f;
        localDateTime.getClass();
        m17909f(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f22279d;
        ZoneOffset zoneOffset2 = ZoneOffset.f22286e;
        localDateTime2.getClass();
        m17909f(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f22282a = localDateTime;
        if (zoneOffset == null) {
            throw new NullPointerException("offset");
        }
        this.f22283b = zoneOffset;
    }

    /* renamed from: f */
    public static OffsetDateTime m17909f(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    /* renamed from: g */
    public static OffsetDateTime m17908g(Instant instant, AbstractC8329o abstractC8329o) {
        if (instant != null) {
            if (abstractC8329o != null) {
                ZoneOffset m17782a = C8352c.m17780c((ZoneOffset) abstractC8329o).m17782a(instant);
                return new OffsetDateTime(LocalDateTime.m17914i(instant.getEpochSecond(), instant.getNano(), m17782a), m17782a);
            }
            throw new NullPointerException("zone");
        }
        throw new NullPointerException("instant");
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? (interfaceC8344l == EnumC8333a.INSTANT_SECONDS || interfaceC8344l == EnumC8333a.OFFSET_SECONDS) ? interfaceC8344l.mo17798c() : this.f22282a.mo17805a(interfaceC8344l) : interfaceC8344l.mo17799b(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: b */
    public final boolean mo17804b(InterfaceC8344l interfaceC8344l) {
        return (interfaceC8344l instanceof EnumC8333a) || (interfaceC8344l != null && interfaceC8344l.mo17800a(this));
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: c */
    public final long mo17803c(InterfaceC8344l interfaceC8344l) {
        if (interfaceC8344l instanceof EnumC8333a) {
            int i = AbstractC8328n.f22372a[((EnumC8333a) interfaceC8344l).ordinal()];
            ZoneOffset zoneOffset = this.f22283b;
            LocalDateTime localDateTime = this.f22282a;
            return i != 1 ? i != 2 ? localDateTime.mo17803c(interfaceC8344l) : zoneOffset.m17907g() : localDateTime.m17913j(zoneOffset);
        }
        return interfaceC8344l.mo17797d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int m17839h;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f22283b;
        ZoneOffset zoneOffset2 = this.f22283b;
        if (zoneOffset2.equals(zoneOffset)) {
            m17839h = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f22282a;
            long m17913j = localDateTime.m17913j(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.f22283b;
            LocalDateTime localDateTime2 = offsetDateTime2.f22282a;
            int compare = Long.compare(m17913j, localDateTime2.m17913j(zoneOffset3));
            m17839h = compare == 0 ? localDateTime.m17910m().m17839h() - localDateTime2.m17910m().m17839h() : compare;
        }
        return m17839h == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : m17839h;
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: d */
    public final Object mo17802d(InterfaceC8346n interfaceC8346n) {
        if (interfaceC8346n == AbstractC8342j.m17809g() || interfaceC8346n == AbstractC8342j.m17807i()) {
            return this.f22283b;
        }
        if (interfaceC8346n == AbstractC8342j.m17806j()) {
            return null;
        }
        C8345m m17811e = AbstractC8342j.m17811e();
        LocalDateTime localDateTime = this.f22282a;
        return interfaceC8346n == m17811e ? localDateTime.m17912k() : interfaceC8346n == AbstractC8342j.m17810f() ? localDateTime.m17910m() : interfaceC8346n == AbstractC8342j.m17812d() ? C8294h.f22292a : interfaceC8346n == AbstractC8342j.m17808h() ? EnumC8334b.NANOS : interfaceC8346n.mo17796a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final int mo17801e(EnumC8333a enumC8333a) {
        if (enumC8333a instanceof EnumC8333a) {
            int i = AbstractC8328n.f22372a[enumC8333a.ordinal()];
            if (i != 1) {
                return i != 2 ? this.f22282a.mo17801e(enumC8333a) : this.f22283b.m17907g();
            }
            throw new C8348p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC8342j.m17815a(this, enumC8333a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            return this.f22282a.equals(offsetDateTime.f22282a) && this.f22283b.equals(offsetDateTime.f22283b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22282a.hashCode() ^ this.f22283b.hashCode();
    }

    public LocalDateTime toLocalDateTime() {
        return this.f22282a;
    }

    public final String toString() {
        return this.f22282a.toString() + this.f22283b.toString();
    }
}
