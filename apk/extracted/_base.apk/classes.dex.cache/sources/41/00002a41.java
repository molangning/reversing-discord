package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p042c9.C2462b;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4594c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 2:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 3:
                    uri = (Uri) C2462b.m33206d(parcel, m33194p, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = C2462b.m33201i(parcel, m33194p, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 6:
                    str4 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 7:
                case 8:
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
                case 9:
                    str5 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 10:
                    str6 = C2462b.m33205e(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}