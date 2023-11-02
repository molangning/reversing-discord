package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: m9.z0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10431z0 implements Parcelable.Creator<C10403o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10403o createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        C10383g c10383g = null;
        C10380f c10380f = null;
        C10386h c10386h = null;
        C10377e c10377e = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 2:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 3:
                    bArr = C2462b.m33208b(parcel, m33194p);
                    break;
                case 4:
                    c10383g = (C10383g) C2462b.m33206d(parcel, m33194p, C10383g.CREATOR);
                    break;
                case 5:
                    c10380f = (C10380f) C2462b.m33206d(parcel, m33194p, C10380f.CREATOR);
                    break;
                case 6:
                    c10386h = (C10386h) C2462b.m33206d(parcel, m33194p, C10386h.CREATOR);
                    break;
                case 7:
                    c10377e = (C10377e) C2462b.m33206d(parcel, m33194p, C10377e.CREATOR);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10403o(str, str2, bArr, c10383g, c10380f, c10386h, c10377e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10403o[] newArray(int i) {
        return new C10403o[i];
    }
}