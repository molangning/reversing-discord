package p164j$.time.format;

import java.util.Locale;
import p164j$.time.AbstractC8329o;
import p164j$.time.C8295d;
import p164j$.time.C8323i;
import p164j$.time.C8332r;
import p164j$.time.Instant;
import p164j$.time.ZoneOffset;
import p164j$.time.chrono.C8294h;
import p164j$.time.chrono.InterfaceC8293g;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;
import p164j$.time.zone.C8352c;
import p164j$.util.AbstractC8516n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8315r {

    /* renamed from: a */
    private InterfaceC8343k f22343a;

    /* renamed from: b */
    private DateTimeFormatter f22344b;

    /* renamed from: c */
    private int f22345c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8315r(InterfaceC8343k interfaceC8343k, DateTimeFormatter dateTimeFormatter) {
        EnumC8333a[] values;
        Instant m17918i;
        InterfaceC8293g m17892b = dateTimeFormatter.m17892b();
        AbstractC8329o m17889e = dateTimeFormatter.m17889e();
        if (m17892b != null || m17889e != null) {
            InterfaceC8293g interfaceC8293g = (InterfaceC8293g) interfaceC8343k.mo17802d(AbstractC8342j.m17812d());
            AbstractC8329o abstractC8329o = (AbstractC8329o) interfaceC8343k.mo17802d(AbstractC8342j.m17806j());
            C8323i c8323i = null;
            m17892b = AbstractC8516n.m17601o(m17892b, interfaceC8293g) ? null : m17892b;
            m17889e = AbstractC8516n.m17601o(m17889e, abstractC8329o) ? null : m17889e;
            if (m17892b != null || m17889e != null) {
                InterfaceC8293g interfaceC8293g2 = m17892b != null ? m17892b : interfaceC8293g;
                if (m17889e != null) {
                    EnumC8333a enumC8333a = EnumC8333a.INSTANT_SECONDS;
                    if (interfaceC8343k.mo17804b(enumC8333a)) {
                        interfaceC8293g2 = interfaceC8293g2 == null ? C8294h.f22292a : interfaceC8293g2;
                        Instant instant = Instant.f22275c;
                        if (interfaceC8343k instanceof Instant) {
                            m17918i = (Instant) interfaceC8343k;
                        } else {
                            try {
                                m17918i = Instant.m17918i(interfaceC8343k.mo17803c(enumC8333a), interfaceC8343k.mo17801e(EnumC8333a.NANO_OF_SECOND));
                            } catch (C8295d e) {
                                throw new C8295d("Unable to obtain Instant from TemporalAccessor: " + interfaceC8343k + " of type " + interfaceC8343k.getClass().getName(), e);
                            }
                        }
                        ((C8294h) interfaceC8293g2).getClass();
                        interfaceC8343k = C8332r.m17829g(m17918i, m17889e);
                    } else {
                        ZoneOffset zoneOffset = (ZoneOffset) m17889e;
                        C8352c m17780c = C8352c.m17780c(zoneOffset);
                        if ((m17780c.m17781b() ? m17780c.m17782a(Instant.f22275c) : m17889e) instanceof ZoneOffset) {
                            EnumC8333a enumC8333a2 = EnumC8333a.OFFSET_SECONDS;
                            if (interfaceC8343k.mo17804b(enumC8333a2) && interfaceC8343k.mo17801e(enumC8333a2) != C8352c.m17780c(zoneOffset).m17782a(Instant.f22275c).m17907g()) {
                                throw new C8295d("Unable to apply override zone '" + m17889e + "' because the temporal object being formatted has a different offset but does not represent an instant: " + interfaceC8343k);
                            }
                        }
                    }
                }
                abstractC8329o = m17889e != null ? m17889e : abstractC8329o;
                if (m17892b != null) {
                    if (interfaceC8343k.mo17804b(EnumC8333a.EPOCH_DAY)) {
                        ((C8294h) interfaceC8293g2).getClass();
                        c8323i = C8323i.m17852h(interfaceC8343k);
                    } else if (m17892b != C8294h.f22292a || interfaceC8293g != null) {
                        for (EnumC8333a enumC8333a3 : EnumC8333a.values()) {
                            if (enumC8333a3.isDateBased() && interfaceC8343k.mo17804b(enumC8333a3)) {
                                throw new C8295d("Unable to apply override chronology '" + m17892b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + interfaceC8343k);
                            }
                        }
                    }
                }
                interfaceC8343k = new C8314q(c8323i, interfaceC8343k, interfaceC8293g2, abstractC8329o);
            }
        }
        this.f22343a = interfaceC8343k;
        this.f22344b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m17862a() {
        this.f22345c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C8317t m17861b() {
        return this.f22344b.m17891c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Locale m17860c() {
        return this.f22344b.m17890d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final InterfaceC8343k m17859d() {
        return this.f22343a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final Long m17858e(InterfaceC8344l interfaceC8344l) {
        try {
            return Long.valueOf(this.f22343a.mo17803c(interfaceC8344l));
        } catch (C8295d e) {
            if (this.f22345c > 0) {
                return null;
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object m17857f(InterfaceC8346n interfaceC8346n) {
        Object mo17802d = this.f22343a.mo17802d(interfaceC8346n);
        if (mo17802d == null && this.f22345c == 0) {
            throw new C8295d("Unable to extract value: " + this.f22343a.getClass());
        }
        return mo17802d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m17856g() {
        this.f22345c++;
    }

    public final String toString() {
        return this.f22343a.toString();
    }
}
