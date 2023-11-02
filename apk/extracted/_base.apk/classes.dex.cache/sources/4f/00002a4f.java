package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: com.google.android.gms.auth.api.signin.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4604g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 4) {
                if (m33199k != 7) {
                    if (m33199k != 8) {
                        C2462b.m33187w(parcel, m33194p);
                    } else {
                        str2 = C2462b.m33205e(parcel, m33194p);
                    }
                } else {
                    googleSignInAccount = (GoogleSignInAccount) C2462b.m33206d(parcel, m33194p, GoogleSignInAccount.CREATOR);
                }
            } else {
                str = C2462b.m33205e(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}