package p143hj;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import net.time4j.C10582a0;
import net.time4j.C10697f0;
import net.time4j.base.C10616c;
import p162ij.EnumC7627a0;
import p288pj.C11648d;
import p288pj.EnumC11651f;

/* renamed from: hj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7350c implements Serializable {
    private static final long serialVersionUID = 486345450973062467L;
    private final EnumC11651f scale;
    private final double value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hj.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C7351a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19802a;

        static {
            int[] iArr = new int[EnumC11651f.values().length];
            f19802a = iArr;
            try {
                iArr[EnumC11651f.UT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19802a[EnumC11651f.TT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19802a[EnumC11651f.POSIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C7350c(double d, EnumC11651f enumC11651f) {
        m20890a(d, enumC11651f);
        this.value = d;
        this.scale = enumC11651f;
    }

    /* renamed from: a */
    private static void m20890a(double d, EnumC11651f enumC11651f) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            int i = C7351a.f19802a[enumC11651f.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalArgumentException("Unsupported time scale: " + enumC11651f);
            } else if (Double.compare(990575.0d, d) <= 0 && Double.compare(d, 2817152.0d) <= 0) {
                return;
            } else {
                throw new IllegalArgumentException("Out of range: " + d);
            }
        }
        throw new IllegalArgumentException("Value is not finite: " + d);
    }

    /* renamed from: d */
    static double m20887d(C10582a0 c10582a0, EnumC11651f enumC11651f) {
        return ((c10582a0.mo7349e(enumC11651f) + m20886e(enumC11651f)) + (c10582a0.mo7348g(enumC11651f) / 1.0E9d)) / 86400.0d;
    }

    /* renamed from: e */
    private static long m20886e(EnumC11651f enumC11651f) {
        int i = C7351a.f19802a[enumC11651f.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return 210866760000L;
            }
            throw new UnsupportedOperationException(enumC11651f.name());
        }
        return 210929832000L;
    }

    /* renamed from: f */
    public static C7350c m20885f(double d) {
        return new C7350c(d, EnumC11651f.TT);
    }

    /* renamed from: g */
    public static C7350c m20884g(C10582a0 c10582a0) {
        EnumC11651f enumC11651f = EnumC11651f.TT;
        return new C7350c(m20887d(c10582a0, enumC11651f), enumC11651f);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            m20890a(this.value, this.scale);
        } catch (ClassNotFoundException unused) {
            throw new StreamCorruptedException();
        } catch (IllegalArgumentException unused2) {
            throw new StreamCorruptedException();
        }
    }

    /* renamed from: b */
    public double m20889b() {
        return this.value - 2400000.5d;
    }

    /* renamed from: c */
    public double m20888c() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7350c)) {
            return false;
        }
        C7350c c7350c = (C7350c) obj;
        if (this.value == c7350c.value && this.scale == c7350c.scale) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public C10582a0 m20883h() {
        EnumC11651f enumC11651f;
        double d = this.value * 86400.0d;
        EnumC11651f enumC11651f2 = this.scale;
        if (!C11648d.m7361w().m7373C() && enumC11651f2 != (enumC11651f = EnumC11651f.POSIX)) {
            if (enumC11651f2 == EnumC11651f.TT) {
                C10697f0 m10707R0 = C10697f0.m10707R0((long) Math.floor(m20889b()), EnumC7627a0.MODIFIED_JULIAN_DATE);
                d -= EnumC11651f.m7351b(m10707R0.mo10482o(), m10707R0.mo10481p());
            }
            d += 6.3072E7d;
            enumC11651f2 = enumC11651f;
        }
        return C10582a0.m11146p0(C10616c.m11029m((long) d, m20886e(enumC11651f2)), (int) ((d - Math.floor(d)) * 1.0E9d), enumC11651f2);
    }

    public int hashCode() {
        return C7347a.m20898a(this.value) ^ this.scale.hashCode();
    }

    public String toString() {
        return "JD(" + this.scale.name() + ')' + this.value;
    }
}
