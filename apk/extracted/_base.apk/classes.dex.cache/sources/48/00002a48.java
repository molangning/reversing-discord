package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SignInAccount extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C4604g();
    @Deprecated

    /* renamed from: j */
    String f12630j;

    /* renamed from: k */
    private GoogleSignInAccount f12631k;
    @Deprecated

    /* renamed from: l */
    String f12632l;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f12631k = googleSignInAccount;
        this.f12630j = C2198p.m33988g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f12632l = C2198p.m33988g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* renamed from: r */
    public final GoogleSignInAccount m28261r() {
        return this.f12631k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 4, this.f12630j, false);
        C2464c.m33170n(parcel, 7, this.f12631k, i, false);
        C2464c.m33168p(parcel, 8, this.f12632l, false);
        C2464c.m33182b(parcel, m33183a);
    }
}