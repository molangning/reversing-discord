package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p042c9.C2462b;

/* renamed from: com.google.android.gms.auth.api.signin.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4600c implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
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
                    str3 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 5:
                    str4 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 6:
                    uri = (Uri) C2462b.m33206d(parcel, m33194p, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 8:
                    j = C2462b.m33190t(parcel, m33194p);
                    break;
                case 9:
                    str6 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 10:
                    arrayList = C2462b.m33201i(parcel, m33194p, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 12:
                    str8 = C2462b.m33205e(parcel, m33194p);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
