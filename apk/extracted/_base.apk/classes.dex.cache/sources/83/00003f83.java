package p202kj;

import java.math.BigDecimal;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC9503k implements InterfaceC7664p<BigDecimal> {
    FRACTION;

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        return ((BigDecimal) interfaceC7662o.mo10212i(this)).compareTo((BigDecimal) interfaceC7662o2.mo10212i(this));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: c */
    public BigDecimal mo9551e() {
        return BigDecimal.ONE;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: f */
    public BigDecimal mo9554U() {
        return BigDecimal.ZERO;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<BigDecimal> getType() {
        return BigDecimal.class;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }
}