package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10409q0 implements Parcelable.Creator<C10390j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10390j createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 2) {
                if (m33199k != 3) {
                    if (m33199k != 4) {
                        C2462b.m33187w(parcel, m33194p);
                    } else {
                        str2 = C2462b.m33205e(parcel, m33194p);
                    }
                } else {
                    bool = C2462b.m33197m(parcel, m33194p);
                }
            } else {
                str = C2462b.m33205e(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10390j(str, bool, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10390j[] newArray(int i) {
        return new C10390j[i];
    }
}