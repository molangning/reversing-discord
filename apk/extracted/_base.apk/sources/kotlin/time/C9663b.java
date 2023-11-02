package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p373ui.EnumC12982c;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001\u001a \u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¨\u0006\t"}, m14357d2 = {"", "value", "Lui/c;", "sourceUnit", "targetUnit", "a", "", "c", "b", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/time/DurationUnitKt")
/* renamed from: kotlin.time.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C9663b {
    /* renamed from: a */
    public static final double m13602a(double d, EnumC12982c sourceUnit, EnumC12982c targetUnit) {
        C9612q.m13917h(sourceUnit, "sourceUnit");
        C9612q.m13917h(targetUnit, "targetUnit");
        long convert = targetUnit.m3535b().convert(1L, sourceUnit.m3535b());
        if (convert > 0) {
            return d * convert;
        }
        return d / sourceUnit.m3535b().convert(1L, targetUnit.m3535b());
    }

    /* renamed from: b */
    public static final long m13601b(long j, EnumC12982c sourceUnit, EnumC12982c targetUnit) {
        C9612q.m13917h(sourceUnit, "sourceUnit");
        C9612q.m13917h(targetUnit, "targetUnit");
        return targetUnit.m3535b().convert(j, sourceUnit.m3535b());
    }

    /* renamed from: c */
    public static final long m13600c(long j, EnumC12982c sourceUnit, EnumC12982c targetUnit) {
        C9612q.m13917h(sourceUnit, "sourceUnit");
        C9612q.m13917h(targetUnit, "targetUnit");
        return targetUnit.m3535b().convert(j, sourceUnit.m3535b());
    }
}
