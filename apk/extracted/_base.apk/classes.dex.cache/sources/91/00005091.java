package p398w6;

import android.util.Pair;
import p151i6.C7390b;
import p152i7.C7431k;
import p195k8.C9191p0;
import p296q6.C11769z;
import p296q6.InterfaceC11766y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w6.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13409c implements InterfaceC13413g {

    /* renamed from: a */
    private final long[] f34499a;

    /* renamed from: b */
    private final long[] f34500b;

    /* renamed from: c */
    private final long f34501c;

    private C13409c(long[] jArr, long[] jArr2, long j) {
        this.f34499a = jArr;
        this.f34500b = jArr2;
        this.f34501c = j == -9223372036854775807L ? C7390b.m20792c(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static C13409c m2623a(long j, C7431k c7431k, long j2) {
        int length = c7431k.f19968n.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += c7431k.f19966l + c7431k.f19968n[i3];
            j3 += c7431k.f19967m + c7431k.f19969o[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C13409c(jArr, jArr2, j2);
    }

    /* renamed from: b */
    private static Pair<Long, Long> m2622b(long j, long[] jArr, long[] jArr2) {
        double d;
        int m16245i = C9191p0.m16245i(jArr, j, true, true);
        long j2 = jArr[m16245i];
        long j3 = jArr2[m16245i];
        int i = m16245i + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // p398w6.InterfaceC13413g
    /* renamed from: c */
    public long mo2599c(long j) {
        return C7390b.m20792c(((Long) m2622b(j, this.f34499a, this.f34500b).second).longValue());
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        Pair<Long, Long> m2622b = m2622b(C7390b.m20791d(C9191p0.m16225s(j, 0L, this.f34501c)), this.f34500b, this.f34499a);
        return new InterfaceC11766y.C11767a(new C11769z(C7390b.m20792c(((Long) m2622b.first).longValue()), ((Long) m2622b.second).longValue()));
    }

    @Override // p398w6.InterfaceC13413g
    /* renamed from: g */
    public long mo2598g() {
        return -1L;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return true;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f34501c;
    }
}