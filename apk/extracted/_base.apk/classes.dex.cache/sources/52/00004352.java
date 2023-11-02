package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10416t0 extends AbstractC2461a {
    public static final Parcelable.Creator<C10416t0> CREATOR = new C10421v0();

    /* renamed from: j */
    private final List<C10414s0> f27225j;

    public C10416t0(List<C10414s0> list) {
        this.f27225j = (List) C2198p.m33985j(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10416t0)) {
            return false;
        }
        C10416t0 c10416t0 = (C10416t0) obj;
        if (!this.f27225j.containsAll(c10416t0.f27225j) || !c10416t0.f27225j.containsAll(this.f27225j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C2190n.m34003c(new HashSet(this.f27225j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33164t(parcel, 1, this.f27225j, false);
        C2464c.m33182b(parcel, m33183a);
    }
}