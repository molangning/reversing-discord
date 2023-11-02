package net.time4j.calendar.service;

import net.time4j.C10852z0;
import net.time4j.EnumC10846x0;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7662o;

/* renamed from: net.time4j.calendar.service.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C10681g<T extends AbstractC7665q<T>> extends C10679e<EnumC10846x0, T> {
    private static final long serialVersionUID = -84764920511581480L;

    /* renamed from: q */
    private final transient C10852z0 f27868q;

    public C10681g(Class<T> cls, C10852z0 c10852z0) {
        super("DAY_OF_WEEK", cls, EnumC10846x0.class, 'E');
        this.f27868q = c10852z0;
    }

    @Override // net.time4j.calendar.service.C10679e, p162ij.InterfaceC7664p
    /* renamed from: R */
    public EnumC10846x0 mo9551e() {
        return this.f27868q.m9973f().m9995d(6);
    }

    @Override // net.time4j.calendar.service.C10679e, p162ij.InterfaceC7664p
    /* renamed from: S */
    public EnumC10846x0 mo9554U() {
        return this.f27868q.m9973f();
    }

    @Override // net.time4j.calendar.service.C10679e
    /* renamed from: T */
    public int mo10743N(EnumC10846x0 enumC10846x0) {
        return enumC10846x0.m9996c(this.f27868q);
    }

    @Override // p162ij.AbstractC7635e, java.util.Comparator
    /* renamed from: j */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        int m9996c = ((EnumC10846x0) interfaceC7662o.mo10212i(this)).m9996c(this.f27868q);
        int m9996c2 = ((EnumC10846x0) interfaceC7662o2.mo10212i(this)).m9996c(this.f27868q);
        if (m9996c < m9996c2) {
            return -1;
        }
        if (m9996c == m9996c2) {
            return 0;
        }
        return 1;
    }
}