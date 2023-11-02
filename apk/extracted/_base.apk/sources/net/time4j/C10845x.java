package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7668t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10845x extends AbstractC10611b<Long> implements InterfaceC10773k0<Long, C10711g0> {

    /* renamed from: p */
    static final InterfaceC7664p<Long> f28300p = new C10845x();
    private static final long serialVersionUID = 5930990958663061693L;

    /* renamed from: m */
    private final transient Long f28301m;

    /* renamed from: n */
    private final transient Long f28302n;

    /* renamed from: o */
    private final transient InterfaceC7668t<AbstractC7665q<?>, BigDecimal> f28303o;

    private C10845x() {
        this("DAY_OVERFLOW", Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private Object readResolve() {
        Object m10616H0 = C10711g0.m10616H0(name());
        if (m10616H0 == null) {
            if (name().equals("DAY_OVERFLOW")) {
                return f28300p;
            }
            throw new InvalidObjectException(name());
        }
        return m10616H0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static C10845x m10001x(String str, long j, long j2) {
        return new C10845x(str, j, j2);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: B */
    public Long mo9554U() {
        return this.f28301m;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<Long> getType() {
        return Long.class;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: y */
    public Long mo9551e() {
        return this.f28302n;
    }

    @Override // net.time4j.InterfaceC10773k0
    /* renamed from: z */
    public /* bridge */ /* synthetic */ AbstractC10782o<C10711g0> mo9999z(Long l) {
        return super.m11062w(l);
    }

    private C10845x(String str, long j, long j2) {
        super(str);
        this.f28301m = Long.valueOf(j);
        this.f28302n = Long.valueOf(j2);
        this.f28303o = new C10775l0(this, true);
    }
}
