package p441y8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: y8.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13942m implements Parcelable.Creator<C13930a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13930a createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            C2462b.m33187w(parcel, m33194p);
                        } else {
                            str = C2462b.m33205e(parcel, m33194p);
                        }
                    } else {
                        pendingIntent = (PendingIntent) C2462b.m33206d(parcel, m33194p, PendingIntent.CREATOR);
                    }
                } else {
                    i2 = C2462b.m33192r(parcel, m33194p);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C13930a(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13930a[] newArray(int i) {
        return new C13930a[i];
    }
}
