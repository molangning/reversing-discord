package p164j$.time;

import java.io.Serializable;
import p164j$.time.chrono.AbstractC8290d;
import p164j$.time.chrono.C8294h;
import p164j$.time.chrono.InterfaceC8292f;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8348p;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.EnumC8334b;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;
import p164j$.time.zone.C8352c;

/* renamed from: j$.time.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8332r implements InterfaceC8343k, InterfaceC8292f, Serializable {

    /* renamed from: a */
    private final LocalDateTime f22374a;

    /* renamed from: b */
    private final ZoneOffset f22375b;

    /* renamed from: c */
    private final AbstractC8329o f22376c;

    private C8332r(LocalDateTime localDateTime, ZoneOffset zoneOffset, AbstractC8329o abstractC8329o) {
        this.f22374a = localDateTime;
        this.f22375b = zoneOffset;
        this.f22376c = abstractC8329o;
    }

    /* renamed from: g */
    public static C8332r m17829g(Instant instant, AbstractC8329o abstractC8329o) {
        if (instant != null) {
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            ZoneOffset m17782a = C8352c.m17780c((ZoneOffset) abstractC8329o).m17782a(Instant.m17918i(epochSecond, nano));
            return new C8332r(LocalDateTime.m17914i(epochSecond, nano, m17782a), m17782a, abstractC8329o);
        }
        throw new NullPointerException("instant");
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? (interfaceC8344l == EnumC8333a.INSTANT_SECONDS || interfaceC8344l == EnumC8333a.OFFSET_SECONDS) ? interfaceC8344l.mo17798c() : this.f22374a.mo17805a(interfaceC8344l) : interfaceC8344l.mo17799b(this);
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
            int i = AbstractC8331q.f22373a[((EnumC8333a) interfaceC8344l).ordinal()];
            return i != 1 ? i != 2 ? this.f22374a.mo17803c(interfaceC8344l) : this.f22375b.m17907g() : m17828h();
        }
        return interfaceC8344l.mo17797d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8332r c8332r = (C8332r) ((InterfaceC8292f) obj);
        int compare = Long.compare(m17828h(), c8332r.m17828h());
        if (compare == 0) {
            int m17839h = m17825k().m17839h() - c8332r.m17825k().m17839h();
            if (m17839h == 0) {
                int compareTo = this.f22374a.compareTo(c8332r.f22374a);
                if (compareTo == 0) {
                    int compareTo2 = this.f22376c.mo17831f().compareTo(c8332r.f22376c.mo17831f());
                    if (compareTo2 == 0) {
                        m17827i().getClass();
                        C8294h c8294h = C8294h.f22292a;
                        c8332r.m17827i().getClass();
                        c8294h.getClass();
                        c8294h.getClass();
                        return 0;
                    }
                    return compareTo2;
                }
                return compareTo;
            }
            return m17839h;
        }
        return compare;
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: d */
    public final Object mo17802d(InterfaceC8346n interfaceC8346n) {
        if (interfaceC8346n == AbstractC8342j.m17811e()) {
            return m17827i();
        }
        if (interfaceC8346n == AbstractC8342j.m17807i() || interfaceC8346n == AbstractC8342j.m17806j()) {
            return this.f22376c;
        }
        if (interfaceC8346n == AbstractC8342j.m17809g()) {
            return this.f22375b;
        }
        if (interfaceC8346n == AbstractC8342j.m17810f()) {
            return m17825k();
        }
        if (interfaceC8346n != AbstractC8342j.m17812d()) {
            return interfaceC8346n == AbstractC8342j.m17808h() ? EnumC8334b.NANOS : interfaceC8346n.mo17796a(this);
        }
        m17827i().getClass();
        return C8294h.f22292a;
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final int mo17801e(EnumC8333a enumC8333a) {
        if (enumC8333a instanceof EnumC8333a) {
            int i = AbstractC8331q.f22373a[enumC8333a.ordinal()];
            if (i != 1) {
                return i != 2 ? this.f22374a.mo17801e(enumC8333a) : this.f22375b.m17907g();
            }
            throw new C8348p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC8290d.m17899a(this, enumC8333a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8332r) {
            C8332r c8332r = (C8332r) obj;
            return this.f22374a.equals(c8332r.f22374a) && this.f22375b.equals(c8332r.f22375b) && this.f22376c.equals(c8332r.f22376c);
        }
        return false;
    }

    /* renamed from: f */
    public final ZoneOffset m17830f() {
        return this.f22375b;
    }

    /* renamed from: h */
    public final long m17828h() {
        return ((m17827i().m17843q() * 86400) + m17825k().m17835l()) - m17830f().m17907g();
    }

    public final int hashCode() {
        return (this.f22374a.hashCode() ^ this.f22375b.hashCode()) ^ Integer.rotateLeft(this.f22376c.hashCode(), 3);
    }

    /* renamed from: i */
    public final C8323i m17827i() {
        return this.f22374a.m17912k();
    }

    /* renamed from: j */
    public final LocalDateTime m17826j() {
        return this.f22374a;
    }

    /* renamed from: k */
    public final C8325k m17825k() {
        return this.f22374a.m17910m();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22374a.toString());
        ZoneOffset zoneOffset = this.f22375b;
        sb2.append(zoneOffset.toString());
        String sb3 = sb2.toString();
        AbstractC8329o abstractC8329o = this.f22376c;
        if (zoneOffset != abstractC8329o) {
            return sb3 + '[' + abstractC8329o.toString() + ']';
        }
        return sb3;
    }
}