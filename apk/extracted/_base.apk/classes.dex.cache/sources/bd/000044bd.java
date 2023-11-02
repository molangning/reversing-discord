package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import p162ij.AbstractC7635e;

/* renamed from: net.time4j.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C10774l extends AbstractC7635e<BigDecimal> implements InterfaceC10624c1<BigDecimal> {
    private static final long serialVersionUID = -4837430960549551204L;

    /* renamed from: j */
    private final transient BigDecimal f28118j;

    public C10774l(String str, BigDecimal bigDecimal) {
        super(str);
        this.f28118j = bigDecimal;
    }

    private Object readResolve() {
        Object m10616H0 = C10711g0.m10616H0(name());
        if (m10616H0 != null) {
            return m10616H0;
        }
        throw new InvalidObjectException(name());
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
    public Class<BigDecimal> getType() {
        return BigDecimal.class;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: v */
    protected boolean mo9550v() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: w */
    public BigDecimal mo9551e() {
        return this.f28118j;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: x */
    public BigDecimal mo9554U() {
        return BigDecimal.ZERO;
    }
}