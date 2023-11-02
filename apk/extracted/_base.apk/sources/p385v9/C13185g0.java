package p385v9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: v9.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13185g0 extends AbstractC2461a {
    public static final Parcelable.Creator<C13185g0> CREATOR = new C13188h0();

    /* renamed from: j */
    private String f34198j;

    private C13185g0() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13185g0) {
            return C2190n.m34004b(this.f34198j, ((C13185g0) obj).f34198j);
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f34198j);
    }

    /* renamed from: r */
    public final String m3051r() {
        return this.f34198j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 1, this.f34198j, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13185g0(String str) {
        this.f34198j = str;
    }
}
