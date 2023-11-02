package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C2477i;
import p042c9.C2462b;
import p063da.C5793f;

/* renamed from: com.google.android.gms.nearby.messages.internal.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4710y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        C5793f c5793f = null;
        C2477i c2477i = null;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
        IBinder iBinder2 = null;
        ClientAppContext clientAppContext = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    i = C2462b.m33192r(parcel, m33194p);
                    break;
                case 2:
                    c5793f = (C5793f) C2462b.m33206d(parcel, m33194p, C5793f.CREATOR);
                    break;
                case 3:
                    c2477i = (C2477i) C2462b.m33206d(parcel, m33194p, C2477i.CREATOR);
                    break;
                case 4:
                    iBinder = C2462b.m33193q(parcel, m33194p);
                    break;
                case 5:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 6:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 7:
                    z = C2462b.m33198l(parcel, m33194p);
                    break;
                case 8:
                    iBinder2 = C2462b.m33193q(parcel, m33194p);
                    break;
                case 9:
                    z2 = C2462b.m33198l(parcel, m33194p);
                    break;
                case 10:
                    clientAppContext = (ClientAppContext) C2462b.m33206d(parcel, m33194p, ClientAppContext.CREATOR);
                    break;
                case 11:
                    i2 = C2462b.m33192r(parcel, m33194p);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C4709x(i, c5793f, c2477i, iBinder, str, str2, z, iBinder2, z2, clientAppContext, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C4709x[i];
    }
}
