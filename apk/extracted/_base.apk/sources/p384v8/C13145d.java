package p384v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: v8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13145d implements Parcelable.Creator<C13142a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13142a createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        C2462b.m33187w(parcel, m33194p);
                    } else {
                        bundle = C2462b.m33209a(parcel, m33194p);
                    }
                } else {
                    i2 = C2462b.m33192r(parcel, m33194p);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C13142a(i, i2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C13142a[] newArray(int i) {
        return new C13142a[i];
    }
}
