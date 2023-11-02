package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p042c9.C2462b;

/* renamed from: m9.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10429y0 implements Parcelable.Creator<C10405p> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10405p createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        C10415t c10415t = null;
        C10420v c10420v = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        C10390j c10390j = null;
        Integer num = null;
        C10426y c10426y = null;
        String str = null;
        C10374d c10374d = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 2:
                    c10415t = (C10415t) C2462b.m33206d(parcel, m33194p, C10415t.CREATOR);
                    break;
                case 3:
                    c10420v = (C10420v) C2462b.m33206d(parcel, m33194p, C10420v.CREATOR);
                    break;
                case 4:
                    bArr = C2462b.m33208b(parcel, m33194p);
                    break;
                case 5:
                    arrayList = C2462b.m33201i(parcel, m33194p, C10410r.CREATOR);
                    break;
                case 6:
                    d = C2462b.m33195o(parcel, m33194p);
                    break;
                case 7:
                    arrayList2 = C2462b.m33201i(parcel, m33194p, C10408q.CREATOR);
                    break;
                case 8:
                    c10390j = (C10390j) C2462b.m33206d(parcel, m33194p, C10390j.CREATOR);
                    break;
                case 9:
                    num = C2462b.m33191s(parcel, m33194p);
                    break;
                case 10:
                    c10426y = (C10426y) C2462b.m33206d(parcel, m33194p, C10426y.CREATOR);
                    break;
                case 11:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 12:
                    c10374d = (C10374d) C2462b.m33206d(parcel, m33194p, C10374d.CREATOR);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10405p(c10415t, c10420v, bArr, arrayList, d, arrayList2, c10390j, num, c10426y, str, c10374d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10405p[] newArray(int i) {
        return new C10405p[i];
    }
}