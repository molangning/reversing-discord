package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10378e0 implements Parcelable.Creator<C10430z> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10430z createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        boolean z = false;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            if (C2462b.m33199k(m33194p) != 1) {
                C2462b.m33187w(parcel, m33194p);
            } else {
                z = C2462b.m33198l(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10430z(z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10430z[] newArray(int i) {
        return new C10430z[i];
    }
}