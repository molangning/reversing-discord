package p101fa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: fa.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6354c implements Parcelable.Creator<C6353b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C6353b createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        C2462b.m33187w(parcel, m33194p);
                    } else {
                        intent = (Intent) C2462b.m33206d(parcel, m33194p, Intent.CREATOR);
                    }
                } else {
                    i2 = C2462b.m33192r(parcel, m33194p);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C6353b(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6353b[] newArray(int i) {
        return new C6353b[i];
    }
}
