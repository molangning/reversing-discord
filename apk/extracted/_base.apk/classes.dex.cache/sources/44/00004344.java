package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10402n0 implements Parcelable.Creator<C10380f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10380f createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 2) {
                if (m33199k != 3) {
                    if (m33199k != 4) {
                        if (m33199k != 5) {
                            if (m33199k != 6) {
                                C2462b.m33187w(parcel, m33194p);
                            } else {
                                bArr5 = C2462b.m33208b(parcel, m33194p);
                            }
                        } else {
                            bArr4 = C2462b.m33208b(parcel, m33194p);
                        }
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
        return new C10380f(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10380f[] newArray(int i) {
        return new C10380f[i];
    }
}