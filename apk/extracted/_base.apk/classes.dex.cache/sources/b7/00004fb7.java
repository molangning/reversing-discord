package p385v9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: v9.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13191i0 extends AbstractC2461a {
    public static final Parcelable.Creator<C13191i0> CREATOR = new C13194j0();

    /* renamed from: j */
    private int f34202j;

    private C13191i0() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13191i0) {
            return C2190n.m34004b(Integer.valueOf(this.f34202j), Integer.valueOf(((C13191i0) obj).f34202j));
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(Integer.valueOf(this.f34202j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f34202j);
        C2464c.m33182b(parcel, m33183a);
    }

    public C13191i0(int i) {
        this.f34202j = i;
    }
}