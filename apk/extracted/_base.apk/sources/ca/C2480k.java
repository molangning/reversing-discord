package ca;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p042c9.C2462b;
import p063da.C5791d;
import p385v9.C13212s0;
import p385v9.C13222x0;

/* renamed from: ca.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2480k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            if (m33199k != 5) {
                                if (m33199k != 1000) {
                                    C2462b.m33187w(parcel, m33194p);
                                } else {
                                    i = C2462b.m33192r(parcel, m33194p);
                                }
                            } else {
                                i2 = C2462b.m33192r(parcel, m33194p);
                            }
                        } else {
                            arrayList3 = C2462b.m33201i(parcel, m33194p, C13212s0.CREATOR);
                        }
                    } else {
                        z = C2462b.m33198l(parcel, m33194p);
                    }
                } else {
                    arrayList2 = C2462b.m33201i(parcel, m33194p, C13222x0.CREATOR);
                }
            } else {
                arrayList = C2462b.m33201i(parcel, m33194p, C5791d.CREATOR);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C2467a(i, arrayList, arrayList2, z, arrayList3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2467a[i];
    }
}
