package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p318r8.C12112f;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class IdToken extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C12112f();

    /* renamed from: j */
    private final String f12570j;

    /* renamed from: k */
    private final String f12571k;

    public IdToken(String str, String str2) {
        C2198p.m33993b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C2198p.m33993b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f12570j = str;
        this.f12571k = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (C2190n.m34004b(this.f12570j, idToken.f12570j) && C2190n.m34004b(this.f12571k, idToken.f12571k)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public String m28313r() {
        return this.f12570j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 1, m28313r(), false);
        C2464c.m33168p(parcel, 2, m28312z(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m28312z() {
        return this.f12571k;
    }
}