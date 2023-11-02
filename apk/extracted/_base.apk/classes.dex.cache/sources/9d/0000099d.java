package p029b9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;
import p441y8.C13930a;

/* renamed from: b9.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2205r0 implements Parcelable.Creator<C2202q0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2202q0 createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        C13930a c13930a = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            if (m33199k != 5) {
                                C2462b.m33187w(parcel, m33194p);
                            } else {
                                z2 = C2462b.m33198l(parcel, m33194p);
                            }
                        } else {
                            z = C2462b.m33198l(parcel, m33194p);
                        }
                    } else {
                        c13930a = (C13930a) C2462b.m33206d(parcel, m33194p, C13930a.CREATOR);
                    }
                } else {
                    iBinder = C2462b.m33193q(parcel, m33194p);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C2202q0(i, iBinder, c13930a, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2202q0[] newArray(int i) {
        return new C2202q0[i];
    }
}