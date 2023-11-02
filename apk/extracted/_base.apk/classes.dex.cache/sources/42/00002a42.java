package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: com.google.android.gms.auth.api.credentials.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4595d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
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
                            i2 = C2462b.m33192r(parcel, m33194p);
                        }
                    } else {
                        z3 = C2462b.m33198l(parcel, m33194p);
                    }
                } else {
                    z2 = C2462b.m33198l(parcel, m33194p);
                }
            } else {
                z = C2462b.m33198l(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}