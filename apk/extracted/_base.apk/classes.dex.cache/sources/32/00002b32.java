package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: com.google.android.gms.nearby.messages.internal.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4683f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    i = C2462b.m33192r(parcel, m33194p);
                    break;
                case 2:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 3:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 4:
                    z = C2462b.m33198l(parcel, m33194p);
                    break;
                case 5:
                    i2 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 6:
                    str3 = C2462b.m33205e(parcel, m33194p);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new ClientAppContext(i, str, str2, z, i2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientAppContext[i];
    }
}