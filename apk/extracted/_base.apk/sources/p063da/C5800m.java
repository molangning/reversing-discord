package p063da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Distance;
import java.util.Locale;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: da.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5800m extends AbstractC2461a implements Distance {
    public static final Parcelable.Creator<C5800m> CREATOR = new C5801n();

    /* renamed from: j */
    final int f16625j;

    /* renamed from: k */
    public final int f16626k;

    /* renamed from: l */
    public final double f16627l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5800m(int i, int i2, double d) {
        this.f16625j = i;
        this.f16626k = i2;
        this.f16627l = d;
    }

    @Override // com.google.android.gms.nearby.messages.Distance
    /* renamed from: T */
    public final double mo24503T() {
        return this.f16627l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5800m)) {
            return false;
        }
        C5800m c5800m = (C5800m) obj;
        if (this.f16626k == c5800m.f16626k && compareTo(c5800m) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(Integer.valueOf(this.f16626k), Double.valueOf(this.f16627l));
    }

    @Override // java.lang.Comparable
    /* renamed from: r */
    public final int compareTo(Distance distance) {
        if (Double.isNaN(this.f16627l) && Double.isNaN(distance.mo24503T())) {
            return 0;
        }
        return Double.compare(this.f16627l, distance.mo24503T());
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.f16627l);
        objArr[1] = this.f16626k != 1 ? "UNKNOWN" : "LOW";
        return String.format(locale, "(%.1fm, %s)", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f16625j);
        C2464c.m33174j(parcel, 2, this.f16626k);
        C2464c.m33177g(parcel, 3, this.f16627l);
        C2464c.m33182b(parcel, m33183a);
    }
}
