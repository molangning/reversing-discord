package p029b9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;
import p441y8.C13932c;

/* renamed from: b9.f1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2167f1 implements Parcelable.Creator<C2164e1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2164e1 createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        Bundle bundle = null;
        C2162e c2162e = null;
        int i = 0;
        C13932c[] c13932cArr = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            C2462b.m33187w(parcel, m33194p);
                        } else {
                            c2162e = (C2162e) C2462b.m33206d(parcel, m33194p, C2162e.CREATOR);
                        }
                    } else {
                        i = C2462b.m33192r(parcel, m33194p);
                    }
                } else {
                    c13932cArr = (C13932c[]) C2462b.m33202h(parcel, m33194p, C13932c.CREATOR);
                }
            } else {
                bundle = C2462b.m33209a(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C2164e1(bundle, c13932cArr, i, c2162e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2164e1[] newArray(int i) {
        return new C2164e1[i];
    }
}
