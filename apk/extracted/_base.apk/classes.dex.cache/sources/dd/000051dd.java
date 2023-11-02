package p420x8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: x8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13741d implements Parcelable.Creator<C13735a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13735a createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            if (C2462b.m33199k(m33194p) != 1) {
                C2462b.m33187w(parcel, m33194p);
            } else {
                intent = (Intent) C2462b.m33206d(parcel, m33194p, Intent.CREATOR);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C13735a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C13735a[] newArray(int i) {
        return new C13735a[i];
    }
}