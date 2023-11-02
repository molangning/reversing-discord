package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10392j0 implements Parcelable.Creator<C10368b0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10368b0 createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        short s = 0;
        short s2 = 0;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        C2462b.m33187w(parcel, m33194p);
                    } else {
                        s2 = C2462b.m33189u(parcel, m33194p);
                    }
                } else {
                    s = C2462b.m33189u(parcel, m33194p);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10368b0(i, s, s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10368b0[] newArray(int i) {
        return new C10368b0[i];
    }
}