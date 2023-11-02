package p385v9;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: v9.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13214t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        int i2 = 0;
        ParcelUuid parcelUuid = null;
        ParcelUuid parcelUuid2 = null;
        ParcelUuid parcelUuid3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                switch (m33199k) {
                    case 4:
                        parcelUuid = (ParcelUuid) C2462b.m33206d(parcel, m33194p, ParcelUuid.CREATOR);
                        continue;
                    case 5:
                        parcelUuid2 = (ParcelUuid) C2462b.m33206d(parcel, m33194p, ParcelUuid.CREATOR);
                        continue;
                    case 6:
                        parcelUuid3 = (ParcelUuid) C2462b.m33206d(parcel, m33194p, ParcelUuid.CREATOR);
                        continue;
                    case 7:
                        bArr = C2462b.m33208b(parcel, m33194p);
                        continue;
                    case 8:
                        bArr2 = C2462b.m33208b(parcel, m33194p);
                        continue;
                    case 9:
                        i2 = C2462b.m33192r(parcel, m33194p);
                        continue;
                    case 10:
                        bArr3 = C2462b.m33208b(parcel, m33194p);
                        continue;
                    case 11:
                        bArr4 = C2462b.m33208b(parcel, m33194p);
                        continue;
                    default:
                        C2462b.m33187w(parcel, m33194p);
                        continue;
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C13212s0(i, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i2, bArr3, bArr4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C13212s0[i];
    }
}
