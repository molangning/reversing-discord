package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10364a0 extends AbstractC2461a {
    public static final Parcelable.Creator<C10364a0> CREATOR = new C10389i0();

    /* renamed from: j */
    private final List<C10368b0> f27109j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10364a0(List<C10368b0> list) {
        this.f27109j = list;
    }

    public boolean equals(Object obj) {
        List<C10368b0> list;
        if (!(obj instanceof C10364a0)) {
            return false;
        }
        C10364a0 c10364a0 = (C10364a0) obj;
        List<C10368b0> list2 = this.f27109j;
        if (list2 != null || c10364a0.f27109j != null) {
            if (list2 == null || (list = c10364a0.f27109j) == null || !list2.containsAll(list) || !c10364a0.f27109j.containsAll(this.f27109j)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(new HashSet(this.f27109j));
    }

    /* renamed from: r */
    public List<C10368b0> m11657r() {
        return this.f27109j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33164t(parcel, 1, m11657r(), false);
        C2464c.m33182b(parcel, m33183a);
    }
}
