package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10400m0 implements Parcelable.Creator<C10374d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10374d createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        C10401n c10401n = null;
        C10416t0 c10416t0 = null;
        C10430z c10430z = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 2) {
                if (m33199k != 3) {
                    if (m33199k != 4) {
                        C2462b.m33187w(parcel, m33194p);
                    } else {
                        c10430z = (C10430z) C2462b.m33206d(parcel, m33194p, C10430z.CREATOR);
                    }
                } else {
                    c10416t0 = (C10416t0) C2462b.m33206d(parcel, m33194p, C10416t0.CREATOR);
                }
            } else {
                c10401n = (C10401n) C2462b.m33206d(parcel, m33194p, C10401n.CREATOR);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10374d(c10401n, c10416t0, c10430z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10374d[] newArray(int i) {
        return new C10374d[i];
    }
}