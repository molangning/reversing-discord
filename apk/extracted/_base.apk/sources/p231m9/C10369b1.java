package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.b1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10369b1 implements Parcelable.Creator<C10410r> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10410r createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 2) {
                if (m33199k != 3) {
                    C2462b.m33187w(parcel, m33194p);
                } else {
                    num = C2462b.m33191s(parcel, m33194p);
                }
            } else {
                str = C2462b.m33205e(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10410r(str, num.intValue());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10410r[] newArray(int i) {
        return new C10410r[i];
    }
}
