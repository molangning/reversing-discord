package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10404o0 implements Parcelable.Creator<C10383g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10383g createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
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
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10383g(bArr, bArr2, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10383g[] newArray(int i) {
        return new C10383g[i];
    }
}
