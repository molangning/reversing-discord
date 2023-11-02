package p164j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8512j {

    /* renamed from: c */
    private static final C8512j f22626c = new C8512j();

    /* renamed from: a */
    private final boolean f22627a;

    /* renamed from: b */
    private final double f22628b;

    private C8512j() {
        this.f22627a = false;
        this.f22628b = Double.NaN;
    }

    private C8512j(double d) {
        this.f22627a = true;
        this.f22628b = d;
    }

    /* renamed from: a */
    public static C8512j m17621a() {
        return f22626c;
    }

    /* renamed from: d */
    public static C8512j m17618d(double d) {
        return new C8512j(d);
    }

    /* renamed from: b */
    public final double m17620b() {
        if (this.f22627a) {
            return this.f22628b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m17619c() {
        return this.f22627a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8512j) {
            C8512j c8512j = (C8512j) obj;
            boolean z = this.f22627a;
            if (z && c8512j.f22627a) {
                if (Double.compare(this.f22628b, c8512j.f22628b) == 0) {
                    return true;
                }
            } else if (z == c8512j.f22627a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f22627a) {
            long doubleToLongBits = Double.doubleToLongBits(this.f22628b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f22627a ? String.format("OptionalDouble[%s]", Double.valueOf(this.f22628b)) : "OptionalDouble.empty";
    }
}
