package p164j$.time.format;

import p164j$.time.AbstractC8284a;
import p164j$.time.LocalDateTime;
import p164j$.time.ZoneOffset;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.InterfaceC8343k;

/* renamed from: j$.time.format.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8306i implements InterfaceC8304g {
    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        Long m17858e = c8315r.m17858e(EnumC8333a.INSTANT_SECONDS);
        InterfaceC8343k m17859d = c8315r.m17859d();
        EnumC8333a enumC8333a = EnumC8333a.NANO_OF_SECOND;
        Long valueOf = m17859d.mo17804b(enumC8333a) ? Long.valueOf(c8315r.m17859d().mo17803c(enumC8333a)) : null;
        int i = 0;
        if (m17858e == null) {
            return false;
        }
        long longValue = m17858e.longValue();
        int m17824e = enumC8333a.m17824e(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j = (longValue - 315569520000L) + 62167219200L;
            long m17900f = AbstractC8284a.m17900f(j, 315569520000L) + 1;
            LocalDateTime m17914i = LocalDateTime.m17914i(AbstractC8284a.m17901e(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (m17900f > 0) {
                sb2.append('+');
                sb2.append(m17900f);
            }
            sb2.append(m17914i);
            if (m17914i.m17916g() == 0) {
                sb2.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime m17914i2 = LocalDateTime.m17914i(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(m17914i2);
            if (m17914i2.m17916g() == 0) {
                sb2.append(":00");
            }
            if (j3 < 0) {
                if (m17914i2.m17915h() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb2.insert(length, j3);
                } else {
                    sb2.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (m17824e > 0) {
            sb2.append('.');
            int i2 = 100000000;
            while (true) {
                if (m17824e <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = m17824e / i2;
                sb2.append((char) (i3 + 48));
                m17824e -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb2.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}