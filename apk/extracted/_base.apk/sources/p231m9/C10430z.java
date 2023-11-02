package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10430z extends AbstractC2461a {
    public static final Parcelable.Creator<C10430z> CREATOR = new C10378e0();

    /* renamed from: j */
    private final boolean f27252j;

    public C10430z(boolean z) {
        this.f27252j = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10430z) || this.f27252j != ((C10430z) obj).f27252j) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(Boolean.valueOf(this.f27252j));
    }

    /* renamed from: r */
    public boolean m11575r() {
        return this.f27252j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33181c(parcel, 1, m11575r());
        C2464c.m33182b(parcel, m33183a);
    }
}
