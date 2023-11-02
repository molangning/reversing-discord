package p385v9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: v9.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13188h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            if (C2462b.m33199k(m33194p) != 1) {
                C2462b.m33187w(parcel, m33194p);
            } else {
                str = C2462b.m33205e(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C13185g0(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C13185g0[i];
    }
}
