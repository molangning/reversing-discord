package p011aa;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: aa.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0135g extends AbstractC2461a {
    public static final Parcelable.Creator<C0135g> CREATOR = new C0136h();

    /* renamed from: j */
    private int f505j;

    /* renamed from: k */
    private int f506k;

    /* renamed from: l */
    private int f507l;

    /* renamed from: m */
    private boolean f508m;

    private C0135g() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0135g) {
            C0135g c0135g = (C0135g) obj;
            if (C2190n.m34004b(Integer.valueOf(this.f505j), Integer.valueOf(c0135g.f505j)) && C2190n.m34004b(Integer.valueOf(this.f506k), Integer.valueOf(c0135g.f506k)) && C2190n.m34004b(Integer.valueOf(this.f507l), Integer.valueOf(c0135g.f507l)) && C2190n.m34004b(Boolean.valueOf(this.f508m), Boolean.valueOf(c0135g.f508m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(Integer.valueOf(this.f505j), Integer.valueOf(this.f506k), Integer.valueOf(this.f507l), Boolean.valueOf(this.f508m));
    }

    public final String toString() {
        int i = this.f505j;
        int i2 = this.f506k;
        int i3 = this.f507l;
        boolean z = this.f508m;
        return "UwbRangingData{rawDistance=" + i + ", rawAngleOfArrivalAzimuth=" + i2 + ", rawAngleOfArrivalPolar=" + i3 + ", isValidAngleOfArrivalData=" + z + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f505j);
        C2464c.m33174j(parcel, 2, this.f506k);
        C2464c.m33174j(parcel, 3, this.f507l);
        C2464c.m33181c(parcel, 4, this.f508m);
        C2464c.m33182b(parcel, m33183a);
    }

    public C0135g(int i, int i2, int i3, boolean z) {
        this.f505j = i;
        this.f506k = i2;
        this.f507l = i3;
        this.f508m = z;
    }
}