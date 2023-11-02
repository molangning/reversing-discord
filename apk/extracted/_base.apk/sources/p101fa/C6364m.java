package p101fa;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2202q0;
import p042c9.C2462b;
import p441y8.C13930a;

/* renamed from: fa.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6364m implements Parcelable.Creator<C6363l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C6363l createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        C13930a c13930a = null;
        C2202q0 c2202q0 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        C2462b.m33187w(parcel, m33194p);
                    } else {
                        c2202q0 = (C2202q0) C2462b.m33206d(parcel, m33194p, C2202q0.CREATOR);
                    }
                } else {
                    c13930a = (C13930a) C2462b.m33206d(parcel, m33194p, C13930a.CREATOR);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C6363l(i, c13930a, c2202q0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6363l[] newArray(int i) {
        return new C6363l[i];
    }
}
