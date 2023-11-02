package net.time4j;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7668t;

/* renamed from: net.time4j.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10775l0 implements InterfaceC7668t<AbstractC7665q<?>, BigDecimal> {

    /* renamed from: a */
    private final InterfaceC7664p<? extends Number> f28119a;

    /* renamed from: b */
    private final boolean f28120b;

    public C10775l0(InterfaceC7664p<? extends Number> interfaceC7664p, boolean z) {
        this.f28119a = interfaceC7664p;
        this.f28120b = z;
    }

    @Override // p162ij.InterfaceC7668t
    /* renamed from: a */
    public BigDecimal apply(AbstractC7665q<?> abstractC7665q) {
        long longValue = ((Number) abstractC7665q.mo10212i(this.f28119a)).longValue();
        long longValue2 = ((Number) abstractC7665q.mo10215f(this.f28119a)).longValue();
        long longValue3 = ((Number) abstractC7665q.mo10211l(this.f28119a)).longValue();
        if (longValue > longValue3) {
            longValue = longValue3;
        }
        if (longValue == longValue2) {
            return BigDecimal.ZERO;
        }
        if (this.f28120b && (abstractC7665q instanceof C10711g0) && !((C10711g0) C10711g0.class.cast(abstractC7665q)).m10623A0(this.f28119a)) {
            if (longValue == longValue3) {
                return BigDecimal.ONE;
            }
            longValue3--;
        }
        return new BigDecimal(longValue - longValue2).setScale(15).divide(new BigDecimal((longValue3 - longValue2) + 1), RoundingMode.HALF_UP).stripTrailingZeros();
    }
}