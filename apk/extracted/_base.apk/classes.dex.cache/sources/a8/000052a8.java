package p441y8;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: y8.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13943n implements Parcelable.Creator<C13932c> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13932c createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        C2462b.m33187w(parcel, m33194p);
                    } else {
                        j = C2462b.m33190t(parcel, m33194p);
                    }
                } else {
                    i = C2462b.m33192r(parcel, m33194p);
                }
            } else {
                str = C2462b.m33205e(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C13932c(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13932c[] newArray(int i) {
        return new C13932c[i];
    }
}