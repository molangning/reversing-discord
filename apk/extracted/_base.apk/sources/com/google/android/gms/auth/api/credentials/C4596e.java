package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: com.google.android.gms.auth.api.credentials.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4596e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1000) {
                switch (m33199k) {
                    case 1:
                        z = C2462b.m33198l(parcel, m33194p);
                        continue;
                    case 2:
                        strArr = C2462b.m33204f(parcel, m33194p);
                        continue;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) C2462b.m33206d(parcel, m33194p, CredentialPickerConfig.CREATOR);
                        continue;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) C2462b.m33206d(parcel, m33194p, CredentialPickerConfig.CREATOR);
                        continue;
                    case 5:
                        z2 = C2462b.m33198l(parcel, m33194p);
                        continue;
                    case 6:
                        str = C2462b.m33205e(parcel, m33194p);
                        continue;
                    case 7:
                        str2 = C2462b.m33205e(parcel, m33194p);
                        continue;
                    case 8:
                        z3 = C2462b.m33198l(parcel, m33194p);
                        continue;
                    default:
                        C2462b.m33187w(parcel, m33194p);
                        continue;
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C4591a(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C4591a[i];
    }
}
