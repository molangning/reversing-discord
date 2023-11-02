package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.List;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Credential extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C4594c();

    /* renamed from: j */
    private final String f12547j;

    /* renamed from: k */
    private final String f12548k;

    /* renamed from: l */
    private final Uri f12549l;

    /* renamed from: m */
    private final List f12550m;

    /* renamed from: n */
    private final String f12551n;

    /* renamed from: o */
    private final String f12552o;

    /* renamed from: p */
    private final String f12553p;

    /* renamed from: q */
    private final String f12554q;

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4589a {

        /* renamed from: a */
        private final String f12555a;

        /* renamed from: b */
        private String f12556b;

        /* renamed from: c */
        private Uri f12557c;

        /* renamed from: d */
        private List f12558d;

        /* renamed from: e */
        private String f12559e;

        /* renamed from: f */
        private String f12560f;

        /* renamed from: g */
        private String f12561g;

        /* renamed from: h */
        private String f12562h;

        public C4589a(String str) {
            this.f12555a = str;
        }

        /* renamed from: a */
        public Credential m28324a() {
            return new Credential(this.f12555a, this.f12556b, this.f12557c, this.f12558d, this.f12559e, this.f12560f, this.f12561g, this.f12562h);
        }

        /* renamed from: b */
        public C4589a m28323b(String str) {
            this.f12556b = str;
            return this;
        }

        /* renamed from: c */
        public C4589a m28322c(String str) {
            this.f12559e = str;
            return this;
        }

        /* renamed from: d */
        public C4589a m28321d(Uri uri) {
            this.f12557c = uri;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List unmodifiableList;
        Boolean bool;
        String trim = ((String) C2198p.m33984k(str, "credential identifier cannot be null")).trim();
        C2198p.m33988g(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                bool = Boolean.FALSE;
            } else {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority())) {
                    boolean z = true;
                    if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = Boolean.FALSE;
                }
            }
            if (!bool.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f12548k = str2;
        this.f12549l = uri;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f12550m = unmodifiableList;
        this.f12547j = trim;
        this.f12551n = str3;
        this.f12552o = str4;
        this.f12553p = str5;
        this.f12554q = str6;
    }

    /* renamed from: A */
    public String m28331A() {
        return this.f12553p;
    }

    /* renamed from: G */
    public List<IdToken> m28330G() {
        return this.f12550m;
    }

    /* renamed from: H */
    public String m28329H() {
        return this.f12548k;
    }

    /* renamed from: J */
    public String m28328J() {
        return this.f12551n;
    }

    /* renamed from: M */
    public Uri m28327M() {
        return this.f12549l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (TextUtils.equals(this.f12547j, credential.f12547j) && TextUtils.equals(this.f12548k, credential.f12548k) && C2190n.m34004b(this.f12549l, credential.f12549l) && TextUtils.equals(this.f12551n, credential.f12551n) && TextUtils.equals(this.f12552o, credential.f12552o)) {
            return true;
        }
        return false;
    }

    public String getId() {
        return this.f12547j;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f12547j, this.f12548k, this.f12549l, this.f12551n, this.f12552o);
    }

    /* renamed from: r */
    public String m28326r() {
        return this.f12552o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 1, getId(), false);
        C2464c.m33168p(parcel, 2, m28329H(), false);
        C2464c.m33170n(parcel, 3, m28327M(), i, false);
        C2464c.m33164t(parcel, 4, m28330G(), false);
        C2464c.m33168p(parcel, 5, m28328J(), false);
        C2464c.m33168p(parcel, 6, m28326r(), false);
        C2464c.m33168p(parcel, 9, m28331A(), false);
        C2464c.m33168p(parcel, 10, m28325z(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m28325z() {
        return this.f12554q;
    }
}
