package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Message;
import p042c9.C2462b;
import p063da.C5788a;
import p063da.C5800m;
import p385v9.C13218v0;

/* renamed from: com.google.android.gms.nearby.messages.internal.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4681e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        int i2 = 0;
        Message message = null;
        C5800m c5800m = null;
        C5788a c5788a = null;
        C13218v0 c13218v0 = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    i = C2462b.m33192r(parcel, m33194p);
                    break;
                case 2:
                    i2 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 3:
                    message = (Message) C2462b.m33206d(parcel, m33194p, Message.CREATOR);
                    break;
                case 4:
                    c5800m = (C5800m) C2462b.m33206d(parcel, m33194p, C5800m.CREATOR);
                    break;
                case 5:
                    c5788a = (C5788a) C2462b.m33206d(parcel, m33194p, C5788a.CREATOR);
                    break;
                case 6:
                    c13218v0 = (C13218v0) C2462b.m33206d(parcel, m33194p, C13218v0.CREATOR);
                    break;
                case 7:
                    bArr = C2462b.m33208b(parcel, m33194p);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new Update(i, i2, message, c5800m, c5788a, c13218v0, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Update[i];
    }
}