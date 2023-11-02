package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10377e extends AbstractC2461a {
    public static final Parcelable.Creator<C10377e> CREATOR = new C10397l0();

    /* renamed from: j */
    private C10364a0 f27125j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10377e(C10364a0 c10364a0) {
        this.f27125j = c10364a0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10377e)) {
            return false;
        }
        return C2190n.m34004b(this.f27125j, ((C10377e) obj).f27125j);
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27125j);
    }

    /* renamed from: r */
    public C10364a0 m11648r() {
        return this.f27125j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33170n(parcel, 1, m11648r(), i, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
