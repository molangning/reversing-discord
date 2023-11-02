package p063da;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.C4679d0;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import p042c9.C2462b;

/* renamed from: da.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5799l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
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
                    iBinder2 = C2462b.m33193q(parcel, m33194p);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C2462b.m33206d(parcel, m33194p, PendingIntent.CREATOR);
                    break;
                case 5:
                    i2 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 6:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 7:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 8:
                    z = C2462b.m33198l(parcel, m33194p);
                    break;
                case 9:
                    clientAppContext = (ClientAppContext) C2462b.m33206d(parcel, m33194p, ClientAppContext.CREATOR);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C4679d0(i, iBinder, iBinder2, pendingIntent, i2, str, str2, z, clientAppContext);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C4679d0[i];
    }
}