package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p119g9.C6582e;
import p119g9.InterfaceC6581d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class GoogleSignInAccount extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C4600c();

    /* renamed from: w */
    public static InterfaceC6581d f12588w = C6582e.m22380c();

    /* renamed from: j */
    final int f12589j;

    /* renamed from: k */
    private String f12590k;

    /* renamed from: l */
    private String f12591l;

    /* renamed from: m */
    private String f12592m;

    /* renamed from: n */
    private String f12593n;

    /* renamed from: o */
    private Uri f12594o;

    /* renamed from: p */
    private String f12595p;

    /* renamed from: q */
    private long f12596q;

    /* renamed from: r */
    private String f12597r;

    /* renamed from: s */
    List<Scope> f12598s;

    /* renamed from: t */
    private String f12599t;

    /* renamed from: u */
    private String f12600u;

    /* renamed from: v */
    private Set<Scope> f12601v = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f12589j = i;
        this.f12590k = str;
        this.f12591l = str2;
        this.f12592m = str3;
        this.f12593n = str4;
        this.f12594o = uri;
        this.f12595p = str5;
        this.f12596q = j;
        this.f12597r = str6;
        this.f12598s = list;
        this.f12599t = str7;
        this.f12600u = str8;
    }

    /* renamed from: U */
    public static GoogleSignInAccount m28294U(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), C2198p.m33989f(str7), new ArrayList((Collection) C2198p.m33985j(set)), str5, str6);
    }

    /* renamed from: V */
    public static GoogleSignInAccount m28293V(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount m28294U = m28294U(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        m28294U.f12595p = str7;
        return m28294U;
    }

    /* renamed from: A */
    public String m28300A() {
        return this.f12600u;
    }

    /* renamed from: G */
    public String m28299G() {
        return this.f12599t;
    }

    /* renamed from: H */
    public String m28298H() {
        return this.f12591l;
    }

    /* renamed from: J */
    public Uri m28297J() {
        return this.f12594o;
    }

    /* renamed from: M */
    public Set<Scope> m28296M() {
        HashSet hashSet = new HashSet(this.f12598s);
        hashSet.addAll(this.f12601v);
        return hashSet;
    }

    /* renamed from: Q */
    public String m28295Q() {
        return this.f12595p;
    }

    /* renamed from: W */
    public final String m28292W() {
        return this.f12597r;
    }

    /* renamed from: X */
    public final String m28291X() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (m28298H() != null) {
                jSONObject.put("tokenId", m28298H());
            }
            if (m28288z() != null) {
                jSONObject.put("email", m28288z());
            }
            if (m28289r() != null) {
                jSONObject.put("displayName", m28289r());
            }
            if (m28299G() != null) {
                jSONObject.put("givenName", m28299G());
            }
            if (m28300A() != null) {
                jSONObject.put("familyName", m28300A());
            }
            Uri m28297J = m28297J();
            if (m28297J != null) {
                jSONObject.put("photoUrl", m28297J.toString());
            }
            if (m28295Q() != null) {
                jSONObject.put("serverAuthCode", m28295Q());
            }
            jSONObject.put("expirationTime", this.f12596q);
            jSONObject.put("obfuscatedIdentifier", this.f12597r);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f12598s;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: u8.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).m28243r().compareTo(((Scope) obj2).m28243r());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m28243r());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f12597r.equals(this.f12597r) || !googleSignInAccount.m28296M().equals(m28296M())) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f12590k;
    }

    public int hashCode() {
        return ((this.f12597r.hashCode() + 527) * 31) + m28296M().hashCode();
    }

    /* renamed from: k */
    public Account m28290k() {
        String str = this.f12592m;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    /* renamed from: r */
    public String m28289r() {
        return this.f12593n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12589j);
        C2464c.m33168p(parcel, 2, getId(), false);
        C2464c.m33168p(parcel, 3, m28298H(), false);
        C2464c.m33168p(parcel, 4, m28288z(), false);
        C2464c.m33168p(parcel, 5, m28289r(), false);
        C2464c.m33170n(parcel, 6, m28297J(), i, false);
        C2464c.m33168p(parcel, 7, m28295Q(), false);
        C2464c.m33171m(parcel, 8, this.f12596q);
        C2464c.m33168p(parcel, 9, this.f12597r, false);
        C2464c.m33164t(parcel, 10, this.f12598s, false);
        C2464c.m33168p(parcel, 11, m28299G(), false);
        C2464c.m33168p(parcel, 12, m28300A(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m28288z() {
        return this.f12592m;
    }
}
