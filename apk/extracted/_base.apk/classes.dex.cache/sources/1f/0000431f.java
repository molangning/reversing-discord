package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import p042c9.C2462b;

/* renamed from: m9.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10365a1 implements Parcelable.Creator<C10408q> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10408q createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 2) {
                if (m33199k != 3) {
                    if (m33199k != 4) {
                        C2462b.m33187w(parcel, m33194p);
                    } else {
                        arrayList = C2462b.m33201i(parcel, m33194p, Transport.CREATOR);
                    }
                } else {
                    bArr = C2462b.m33208b(parcel, m33194p);
                }
            } else {
                str = C2462b.m33205e(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C10408q(str, bArr, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10408q[] newArray(int i) {
        return new C10408q[i];
    }
}