package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10419u0 implements Parcelable.Creator<C10414s0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10414s0 createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        long j = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            C2462b.m33187w(parcel, m33194p);
                        } else {
                            bArr3 = C2462b.m33208b(parcel, m33194p);
                        }
                    } else {
                        bArr2 = C2462b.m33208b(parcel, m33194p);
                    }
                } else {
                    bArr = C2462b.m33208b(parcel, m33194p);
                }
            } else {
                j = C2462b.m33190t(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10414s0(j, bArr, bArr2, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10414s0[] newArray(int i) {
        return new C10414s0[i];
    }
}
