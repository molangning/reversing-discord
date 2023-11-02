package p101fa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p042c9.C2462b;

/* renamed from: fa.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6360i implements Parcelable.Creator<C6359h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C6359h createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    C2462b.m33187w(parcel, m33194p);
                } else {
                    str = C2462b.m33205e(parcel, m33194p);
                }
            } else {
                arrayList = C2462b.m33203g(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C6359h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6359h[] newArray(int i) {
        return new C6359h[i];
    }
}
