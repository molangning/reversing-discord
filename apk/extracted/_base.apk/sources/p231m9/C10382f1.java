package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.f1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10382f1 implements Parcelable.Creator<C10420v> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10420v createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 2) {
                if (m33199k != 3) {
                    if (m33199k != 4) {
                        if (m33199k != 5) {
                            C2462b.m33187w(parcel, m33194p);
                        } else {
                            str3 = C2462b.m33205e(parcel, m33194p);
                        }
                    } else {
                        str2 = C2462b.m33205e(parcel, m33194p);
                    }
                } else {
                    str = C2462b.m33205e(parcel, m33194p);
                }
            } else {
                bArr = C2462b.m33208b(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10420v(bArr, str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10420v[] newArray(int i) {
        return new C10420v[i];
    }
}
