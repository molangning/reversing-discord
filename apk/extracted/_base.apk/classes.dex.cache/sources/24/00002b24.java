package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Locale;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ClientAppContext extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new C4683f0();

    /* renamed from: j */
    final int f12823j;

    /* renamed from: k */
    public final String f12824k;

    /* renamed from: l */
    public final String f12825l;

    /* renamed from: m */
    public final boolean f12826m;
    @Deprecated

    /* renamed from: n */
    public final int f12827n;

    /* renamed from: o */
    public final String f12828o;

    public ClientAppContext(int i, String str, String str2, boolean z, int i2, String str3) {
        this.f12823j = i;
        this.f12824k = (String) C2198p.m33985j(str);
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", str2, "0p:"));
            str2 = "0p:".concat(str2);
        }
        this.f12825l = str2;
        this.f12826m = z;
        this.f12827n = i2;
        this.f12828o = str3;
    }

    /* renamed from: r */
    public static final ClientAppContext m28047r(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(1, str, str2, z, 0, null);
    }

    /* renamed from: z */
    private static boolean m28046z(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        if (m28046z(this.f12824k, clientAppContext.f12824k) && m28046z(this.f12825l, clientAppContext.f12825l) && this.f12826m == clientAppContext.f12826m && m28046z(this.f12828o, clientAppContext.f12828o) && this.f12827n == clientAppContext.f12827n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f12824k, this.f12825l, Boolean.valueOf(this.f12826m), this.f12828o, Integer.valueOf(this.f12827n));
    }

    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", this.f12824k, this.f12825l, Boolean.valueOf(this.f12826m), this.f12828o, Integer.valueOf(this.f12827n));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12823j);
        C2464c.m33168p(parcel, 2, this.f12824k, false);
        C2464c.m33168p(parcel, 3, this.f12825l, false);
        C2464c.m33181c(parcel, 4, this.f12826m);
        C2464c.m33174j(parcel, 5, this.f12827n);
        C2464c.m33168p(parcel, 6, this.f12828o, false);
        C2464c.m33182b(parcel, m33183a);
    }
}