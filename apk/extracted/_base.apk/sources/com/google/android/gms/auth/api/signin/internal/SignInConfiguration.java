package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p384v8.C13143b;
import p384v8.C13164w;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SignInConfiguration extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C13164w();

    /* renamed from: j */
    private final String f12635j;

    /* renamed from: k */
    private GoogleSignInOptions f12636k;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f12635j = C2198p.m33989f(str);
        this.f12636k = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f12635j.equals(signInConfiguration.f12635j)) {
            GoogleSignInOptions googleSignInOptions = this.f12636k;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f12636k;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C13143b().m3105a(this.f12635j).m3105a(this.f12636k).m3104b();
    }

    /* renamed from: r */
    public final GoogleSignInOptions m28255r() {
        return this.f12636k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 2, this.f12635j, false);
        C2464c.m33170n(parcel, 5, this.f12636k, i, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
