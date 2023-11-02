package ca;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: ca.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2483n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1000) {
                switch (m33199k) {
                    case 1:
                        i2 = C2462b.m33192r(parcel, m33194p);
                        continue;
                    case 2:
                        i3 = C2462b.m33192r(parcel, m33194p);
                        continue;
                    case 3:
                        i4 = C2462b.m33192r(parcel, m33194p);
                        continue;
                    case 4:
                        z = C2462b.m33198l(parcel, m33194p);
                        continue;
                    case 5:
                        i5 = C2462b.m33192r(parcel, m33194p);
                        continue;
                    case 6:
                        i6 = C2462b.m33192r(parcel, m33194p);
                        continue;
                    case 7:
                        i7 = C2462b.m33192r(parcel, m33194p);
                        continue;
                    default:
                        C2462b.m33187w(parcel, m33194p);
                        continue;
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C2477i(i, i2, i3, i4, z, i5, i6, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2477i[i];
    }
}
