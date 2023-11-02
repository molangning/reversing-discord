package p101fa;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2196o0;
import p042c9.C2462b;

/* renamed from: fa.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6362k implements Parcelable.Creator<C6361j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C6361j createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        C2196o0 c2196o0 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    C2462b.m33187w(parcel, m33194p);
                } else {
                    c2196o0 = (C2196o0) C2462b.m33206d(parcel, m33194p, C2196o0.CREATOR);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C6361j(i, c2196o0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6361j[] newArray(int i) {
        return new C6361j[i];
    }
}
