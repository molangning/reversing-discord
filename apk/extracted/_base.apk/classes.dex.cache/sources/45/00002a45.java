package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p384v8.C13142a;
import p384v8.C13143b;
import p461z8.C14107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class GoogleSignInOptions extends AbstractC2461a implements C14107a.InterfaceC14111d, ReflectedParcelable {

    /* renamed from: A */
    public static final Scope f12602A;

    /* renamed from: B */
    private static Comparator<Scope> f12603B;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: u */
    public static final GoogleSignInOptions f12604u;

    /* renamed from: v */
    public static final GoogleSignInOptions f12605v;

    /* renamed from: w */
    public static final Scope f12606w = new Scope("profile");

    /* renamed from: x */
    public static final Scope f12607x = new Scope("email");

    /* renamed from: y */
    public static final Scope f12608y = new Scope("openid");

    /* renamed from: z */
    public static final Scope f12609z;

    /* renamed from: j */
    final int f12610j;

    /* renamed from: k */
    private final ArrayList<Scope> f12611k;

    /* renamed from: l */
    private Account f12612l;

    /* renamed from: m */
    private boolean f12613m;

    /* renamed from: n */
    private final boolean f12614n;

    /* renamed from: o */
    private final boolean f12615o;

    /* renamed from: p */
    private String f12616p;

    /* renamed from: q */
    private String f12617q;

    /* renamed from: r */
    private ArrayList<C13142a> f12618r;

    /* renamed from: s */
    private String f12619s;

    /* renamed from: t */
    private Map<Integer, C13142a> f12620t;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f12609z = scope;
        f12602A = new Scope("https://www.googleapis.com/auth/games");
        C4597a c4597a = new C4597a();
        c4597a.m28265b();
        c4597a.m28264c();
        f12604u = c4597a.m28266a();
        C4597a c4597a2 = new C4597a();
        c4597a2.m28263d(scope, new Scope[0]);
        f12605v = c4597a2.m28266a();
        CREATOR = new C4602e();
        f12603B = new C4601d();
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<C13142a> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m28270f0(arrayList2), str3);
    }

    /* renamed from: U */
    public static GoogleSignInOptions m28281U(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, str3, str4, new HashMap(), (String) null);
    }

    /* renamed from: f0 */
    public static Map<Integer, C13142a> m28270f0(List<C13142a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (C13142a c13142a : list) {
            hashMap.put(Integer.valueOf(c13142a.m3106r()), c13142a);
        }
        return hashMap;
    }

    /* renamed from: A */
    public ArrayList<Scope> m28287A() {
        return new ArrayList<>(this.f12611k);
    }

    /* renamed from: G */
    public String m28286G() {
        return this.f12616p;
    }

    /* renamed from: H */
    public boolean m28285H() {
        return this.f12615o;
    }

    /* renamed from: J */
    public boolean m28284J() {
        return this.f12613m;
    }

    /* renamed from: M */
    public boolean m28283M() {
        return this.f12614n;
    }

    /* renamed from: Y */
    public final String m28277Y() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f12611k, f12603B);
            Iterator<Scope> it = this.f12611k.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m28243r());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f12612l;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f12613m);
            jSONObject.put("forceCodeForRefreshToken", this.f12615o);
            jSONObject.put("serverAuthRequested", this.f12614n);
            if (!TextUtils.isEmpty(this.f12616p)) {
                jSONObject.put("serverClientId", this.f12616p);
            }
            if (!TextUtils.isEmpty(this.f12617q)) {
                jSONObject.put("hostedDomain", this.f12617q);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0048, code lost:
        if (r1.equals(r4.m28269k()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList<v8.a> r1 = r3.f12618r     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList<v8.a> r1 = r4.f12618r     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f12611k     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m28287A()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f12611k     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m28287A()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f12612l     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.m28269k()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.m28269k()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f12616p     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.m28286G()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f12616p     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.m28286G()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f12615o     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m28285H()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f12613m     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m28284J()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f12614n     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m28283M()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f12619s     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.m28267z()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f12611k;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).m28243r());
        }
        Collections.sort(arrayList);
        C13143b c13143b = new C13143b();
        c13143b.m3105a(arrayList);
        c13143b.m3105a(this.f12612l);
        c13143b.m3105a(this.f12616p);
        c13143b.m3103c(this.f12615o);
        c13143b.m3103c(this.f12613m);
        c13143b.m3103c(this.f12614n);
        c13143b.m3105a(this.f12619s);
        return c13143b.m3104b();
    }

    /* renamed from: k */
    public Account m28269k() {
        return this.f12612l;
    }

    /* renamed from: r */
    public ArrayList<C13142a> m28268r() {
        return this.f12618r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12610j);
        C2464c.m33164t(parcel, 2, m28287A(), false);
        C2464c.m33170n(parcel, 3, m28269k(), i, false);
        C2464c.m33181c(parcel, 4, m28284J());
        C2464c.m33181c(parcel, 5, m28283M());
        C2464c.m33181c(parcel, 6, m28285H());
        C2464c.m33168p(parcel, 7, m28286G(), false);
        C2464c.m33168p(parcel, 8, this.f12617q, false);
        C2464c.m33164t(parcel, 9, m28268r(), false);
        C2464c.m33168p(parcel, 10, m28267z(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m28267z() {
        return this.f12619s;
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4597a {

        /* renamed from: a */
        private Set<Scope> f12621a;

        /* renamed from: b */
        private boolean f12622b;

        /* renamed from: c */
        private boolean f12623c;

        /* renamed from: d */
        private boolean f12624d;

        /* renamed from: e */
        private String f12625e;

        /* renamed from: f */
        private Account f12626f;

        /* renamed from: g */
        private String f12627g;

        /* renamed from: h */
        private Map<Integer, C13142a> f12628h;

        /* renamed from: i */
        private String f12629i;

        public C4597a() {
            this.f12621a = new HashSet();
            this.f12628h = new HashMap();
        }

        /* renamed from: a */
        public GoogleSignInOptions m28266a() {
            if (this.f12621a.contains(GoogleSignInOptions.f12602A)) {
                Set<Scope> set = this.f12621a;
                Scope scope = GoogleSignInOptions.f12609z;
                if (set.contains(scope)) {
                    this.f12621a.remove(scope);
                }
            }
            if (this.f12624d && (this.f12626f == null || !this.f12621a.isEmpty())) {
                m28265b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f12621a), this.f12626f, this.f12624d, this.f12622b, this.f12623c, this.f12625e, this.f12627g, this.f12628h, this.f12629i);
        }

        /* renamed from: b */
        public C4597a m28265b() {
            this.f12621a.add(GoogleSignInOptions.f12608y);
            return this;
        }

        /* renamed from: c */
        public C4597a m28264c() {
            this.f12621a.add(GoogleSignInOptions.f12606w);
            return this;
        }

        /* renamed from: d */
        public C4597a m28263d(Scope scope, Scope... scopeArr) {
            this.f12621a.add(scope);
            this.f12621a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: e */
        public C4597a m28262e(String str) {
            this.f12629i = str;
            return this;
        }

        public C4597a(GoogleSignInOptions googleSignInOptions) {
            this.f12621a = new HashSet();
            this.f12628h = new HashMap();
            C2198p.m33985j(googleSignInOptions);
            this.f12621a = new HashSet(googleSignInOptions.f12611k);
            this.f12622b = googleSignInOptions.f12614n;
            this.f12623c = googleSignInOptions.f12615o;
            this.f12624d = googleSignInOptions.f12613m;
            this.f12625e = googleSignInOptions.f12616p;
            this.f12626f = googleSignInOptions.f12612l;
            this.f12627g = googleSignInOptions.f12617q;
            this.f12628h = GoogleSignInOptions.m28270f0(googleSignInOptions.f12618r);
            this.f12629i = googleSignInOptions.f12619s;
        }
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, C13142a> map, String str3) {
        this.f12610j = i;
        this.f12611k = arrayList;
        this.f12612l = account;
        this.f12613m = z;
        this.f12614n = z2;
        this.f12615o = z3;
        this.f12616p = str;
        this.f12617q = str2;
        this.f12618r = new ArrayList<>(map.values());
        this.f12620t = map;
        this.f12619s = str3;
    }
}