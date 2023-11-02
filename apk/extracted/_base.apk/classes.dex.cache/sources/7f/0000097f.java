package p029b9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: b9.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2175i0 implements Parcelable.Creator<C2187m> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2187m createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        int i5 = -1;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    i = C2462b.m33192r(parcel, m33194p);
                    break;
                case 2:
                    i2 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 3:
                    i3 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 4:
                    j = C2462b.m33190t(parcel, m33194p);
                    break;
                case 5:
                    j2 = C2462b.m33190t(parcel, m33194p);
                    break;
                case 6:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 7:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 8:
                    i4 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 9:
                    i5 = C2462b.m33192r(parcel, m33194p);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C2187m(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2187m[] newArray(int i) {
        return new C2187m[i];
    }
}