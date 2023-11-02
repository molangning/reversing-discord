package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p042c9.C2462b;

/* renamed from: m9.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10421v0 implements Parcelable.Creator<C10416t0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10416t0 createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            if (C2462b.m33199k(m33194p) != 1) {
                C2462b.m33187w(parcel, m33194p);
            } else {
                arrayList = C2462b.m33201i(parcel, m33194p, C10414s0.CREATOR);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10416t0(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10416t0[] newArray(int i) {
        return new C10416t0[i];
    }
}
