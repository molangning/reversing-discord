package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;
import p385v9.C13218v0;

/* renamed from: com.google.android.gms.nearby.messages.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4671a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        C13218v0[] c13218v0Arr = null;
        long j = 0;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            if (m33199k != 5) {
                                if (m33199k != 1000) {
                                    C2462b.m33187w(parcel, m33194p);
                                } else {
                                    i = C2462b.m33192r(parcel, m33194p);
                                }
                            } else {
                                j = C2462b.m33190t(parcel, m33194p);
                            }
                        } else {
                            c13218v0Arr = (C13218v0[]) C2462b.m33202h(parcel, m33194p, C13218v0.CREATOR);
                        }
                    } else {
                        str = C2462b.m33205e(parcel, m33194p);
                    }
                } else {
                    str2 = C2462b.m33205e(parcel, m33194p);
                }
            } else {
                bArr = C2462b.m33208b(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new Message(i, bArr, str, str2, c13218v0Arr, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Message[i];
    }
}
