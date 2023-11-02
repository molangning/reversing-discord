package p063da;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C2467a;
import ca.C2477i;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import p042c9.C2462b;

/* renamed from: da.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5798k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        IBinder iBinder = null;
        C2477i c2477i = null;
        IBinder iBinder2 = null;
        C2467a c2467a = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder3 = null;
        ClientAppContext clientAppContext = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    i = C2462b.m33192r(parcel, m33194p);
                    break;
                case 2:
                    iBinder = C2462b.m33193q(parcel, m33194p);
                    break;
                case 3:
                    c2477i = (C2477i) C2462b.m33206d(parcel, m33194p, C2477i.CREATOR);
                    break;
                case 4:
                    iBinder2 = C2462b.m33193q(parcel, m33194p);
                    break;
                case 5:
                    c2467a = (C2467a) C2462b.m33206d(parcel, m33194p, C2467a.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) C2462b.m33206d(parcel, m33194p, PendingIntent.CREATOR);
                    break;
                case 7:
                    i2 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 8:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 9:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 10:
                    bArr = C2462b.m33208b(parcel, m33194p);
                    break;
                case 11:
                    z = C2462b.m33198l(parcel, m33194p);
                    break;
                case 12:
                    iBinder3 = C2462b.m33193q(parcel, m33194p);
                    break;
                case 13:
                    z2 = C2462b.m33198l(parcel, m33194p);
                    break;
                case 14:
                    clientAppContext = (ClientAppContext) C2462b.m33206d(parcel, m33194p, ClientAppContext.CREATOR);
                    break;
                case 15:
                    z3 = C2462b.m33198l(parcel, m33194p);
                    break;
                case 16:
                    i3 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 17:
                    i4 = C2462b.m33192r(parcel, m33194p);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new SubscribeRequest(i, iBinder, c2477i, iBinder2, c2467a, pendingIntent, i2, str, str2, bArr, z, iBinder3, z2, clientAppContext, z3, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SubscribeRequest[i];
    }
}