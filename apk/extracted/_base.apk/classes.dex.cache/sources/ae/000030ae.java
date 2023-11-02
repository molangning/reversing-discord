package p063da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Message;
import p042c9.C2462b;

/* renamed from: da.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5794g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        Message message = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 1000) {
                    C2462b.m33187w(parcel, m33194p);
                } else {
                    i = C2462b.m33192r(parcel, m33194p);
                }
            } else {
                message = (Message) C2462b.m33206d(parcel, m33194p, Message.CREATOR);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C5793f(i, message);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C5793f[i];
    }
}