package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10397l0 implements Parcelable.Creator<C10377e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10377e createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        C10364a0 c10364a0 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            if (C2462b.m33199k(m33194p) != 1) {
                C2462b.m33187w(parcel, m33194p);
            } else {
                c10364a0 = (C10364a0) C2462b.m33206d(parcel, m33194p, C10364a0.CREATOR);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10377e(c10364a0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10377e[] newArray(int i) {
        return new C10377e[i];
    }
}
