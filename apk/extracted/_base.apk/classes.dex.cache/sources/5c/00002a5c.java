package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;
import p441y8.C13930a;

/* renamed from: com.google.android.gms.common.api.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4607b implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        C13930a c13930a = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            if (m33199k != 1000) {
                                C2462b.m33187w(parcel, m33194p);
                            } else {
                                i = C2462b.m33192r(parcel, m33194p);
                            }
                        } else {
                            c13930a = (C13930a) C2462b.m33206d(parcel, m33194p, C13930a.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) C2462b.m33206d(parcel, m33194p, PendingIntent.CREATOR);
                    }
                } else {
                    str = C2462b.m33205e(parcel, m33194p);
                }
            } else {
                i2 = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new Status(i, i2, str, pendingIntent, c13930a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}