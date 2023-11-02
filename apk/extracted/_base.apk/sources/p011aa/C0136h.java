package p011aa;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: aa.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0136h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            C2462b.m33187w(parcel, m33194p);
                        } else {
                            z = C2462b.m33198l(parcel, m33194p);
                        }
                    } else {
                        i3 = C2462b.m33192r(parcel, m33194p);
                    }
                } else {
                    i2 = C2462b.m33192r(parcel, m33194p);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C0135g(i, i2, i3, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0135g[i];
    }
}
