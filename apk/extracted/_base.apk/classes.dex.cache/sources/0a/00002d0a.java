package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;
import p042c9.C2464c;

/* renamed from: com.google.firebase.messaging.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5099m0 implements Parcelable.Creator<RemoteMessage> {
    /* renamed from: c */
    public static void m26203c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33179e(parcel, 2, remoteMessage.f14287j, false);
        C2464c.m33182b(parcel, m33183a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            if (C2462b.m33199k(m33194p) != 2) {
                C2462b.m33187w(parcel, m33194p);
            } else {
                bundle = C2462b.m33209a(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}