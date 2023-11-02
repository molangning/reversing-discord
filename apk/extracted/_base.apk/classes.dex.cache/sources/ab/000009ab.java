package p029b9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p042c9.C2462b;

/* renamed from: b9.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2219x implements Parcelable.Creator<C2210t> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2210t createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    C2462b.m33187w(parcel, m33194p);
                } else {
                    arrayList = C2462b.m33201i(parcel, m33194p, C2187m.CREATOR);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C2210t(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2210t[] newArray(int i) {
        return new C2210t[i];
    }
}