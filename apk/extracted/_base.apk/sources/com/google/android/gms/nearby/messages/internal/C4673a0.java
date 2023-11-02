package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: com.google.android.gms.nearby.messages.internal.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4673a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        boolean z = false;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
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
                    z = C2462b.m33198l(parcel, m33194p);
                    break;
                case 5:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 6:
                    clientAppContext = (ClientAppContext) C2462b.m33206d(parcel, m33194p, ClientAppContext.CREATOR);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C4711z(i, iBinder, iBinder2, z, str, clientAppContext);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C4711z[i];
    }
}
