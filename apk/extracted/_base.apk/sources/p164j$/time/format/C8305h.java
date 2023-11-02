package p164j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.InterfaceC8344l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8305h implements InterfaceC8304g {

    /* renamed from: a */
    private final InterfaceC8344l f22311a;

    /* renamed from: b */
    private final int f22312b;

    /* renamed from: c */
    private final int f22313c;

    /* renamed from: d */
    private final boolean f22314d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8305h(EnumC8333a enumC8333a) {
        if (enumC8333a == null) {
            throw new NullPointerException("field");
        }
        if (!enumC8333a.mo17798c().m17790f()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + enumC8333a);
        }
        this.f22311a = enumC8333a;
        this.f22312b = 0;
        this.f22313c = 9;
        this.f22314d = true;
    }

    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        InterfaceC8344l interfaceC8344l = this.f22311a;
        Long m17858e = c8315r.m17858e(interfaceC8344l);
        if (m17858e == null) {
            return false;
        }
        C8317t m17861b = c8315r.m17861b();
        long longValue = m17858e.longValue();
        C8349q mo17798c = interfaceC8344l.mo17798c();
        mo17798c.m17794b(longValue, interfaceC8344l);
        BigDecimal valueOf = BigDecimal.valueOf(mo17798c.m17791e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(mo17798c.m17792d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        int scale = stripTrailingZeros.scale();
        boolean z = this.f22314d;
        int i = this.f22312b;
        if (scale != 0) {
            String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), i), this.f22313c), RoundingMode.FLOOR).toPlainString().substring(2);
            m17861b.getClass();
            if (z) {
                sb2.append('.');
            }
            sb2.append(substring);
            return true;
        } else if (i > 0) {
            if (z) {
                m17861b.getClass();
                sb2.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                m17861b.getClass();
                sb2.append('0');
            }
            return true;
        } else {
            return true;
        }
    }

    public final String toString() {
        String str = this.f22314d ? ",DecimalPoint" : "";
        return "Fraction(" + this.f22311a + "," + this.f22312b + "," + this.f22313c + str + ")";
    }
}
