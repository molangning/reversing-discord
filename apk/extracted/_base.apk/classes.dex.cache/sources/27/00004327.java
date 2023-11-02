package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p042c9.C2462b;

/* renamed from: m9.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10373c1 implements Parcelable.Creator<C10412s> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10412s createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        byte[] bArr = null;
        Double d = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        C10426y c10426y = null;
        String str2 = null;
        C10374d c10374d = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 2:
                    bArr = C2462b.m33208b(parcel, m33194p);
                    break;
                case 3:
                    d = C2462b.m33195o(parcel, m33194p);
                    break;
                case 4:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 5:
                    arrayList = C2462b.m33201i(parcel, m33194p, C10408q.CREATOR);
                    break;
                case 6:
                    num = C2462b.m33191s(parcel, m33194p);
                    break;
                case 7:
                    c10426y = (C10426y) C2462b.m33206d(parcel, m33194p, C10426y.CREATOR);
                    break;
                case 8:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 9:
                    c10374d = (C10374d) C2462b.m33206d(parcel, m33194p, C10374d.CREATOR);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10412s(bArr, d, str, arrayList, num, c10426y, str2, c10374d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10412s[] newArray(int i) {
        return new C10412s[i];
    }
}