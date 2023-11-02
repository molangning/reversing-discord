package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4606a implements Parcelable.Creator<Scope> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Scope createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
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
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new Scope(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i) {
        return new Scope[i];
    }
}