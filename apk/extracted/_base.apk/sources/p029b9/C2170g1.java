package p029b9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: b9.g1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2170g1 implements Parcelable.Creator<C2162e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2162e createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        C2204r c2204r = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    c2204r = (C2204r) C2462b.m33206d(parcel, m33194p, C2204r.CREATOR);
                    break;
                case 2:
                    z = C2462b.m33198l(parcel, m33194p);
                    break;
                case 3:
                    z2 = C2462b.m33198l(parcel, m33194p);
                    break;
                case 4:
                    iArr = C2462b.m33207c(parcel, m33194p);
                    break;
                case 5:
                    i = C2462b.m33192r(parcel, m33194p);
                    break;
                case 6:
                    iArr2 = C2462b.m33207c(parcel, m33194p);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C2162e(c2204r, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2162e[] newArray(int i) {
        return new C2162e[i];
    }
}
