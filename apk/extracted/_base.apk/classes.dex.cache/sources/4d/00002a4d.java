package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p042c9.C2462b;
import p384v8.C13142a;

/* renamed from: com.google.android.gms.auth.api.signin.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4602e implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    i = C2462b.m33192r(parcel, m33194p);
                    break;
                case 2:
                    arrayList = C2462b.m33201i(parcel, m33194p, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C2462b.m33206d(parcel, m33194p, Account.CREATOR);
                    break;
                case 4:
                    z = C2462b.m33198l(parcel, m33194p);
                    break;
                case 5:
                    z2 = C2462b.m33198l(parcel, m33194p);
                    break;
                case 6:
                    z3 = C2462b.m33198l(parcel, m33194p);
                    break;
                case 7:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 8:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 9:
                    arrayList2 = C2462b.m33201i(parcel, m33194p, C13142a.CREATOR);
                    break;
                case 10:
                    str3 = C2462b.m33205e(parcel, m33194p);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}