package lb;

import android.content.Context;
import android.text.TextUtils;
import p029b9.C2190n;
import p029b9.C2198p;
import p029b9.C2207s;
import p119g9.C6589l;

/* renamed from: lb.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10118k {

    /* renamed from: a */
    private final String f26354a;

    /* renamed from: b */
    private final String f26355b;

    /* renamed from: c */
    private final String f26356c;

    /* renamed from: d */
    private final String f26357d;

    /* renamed from: e */
    private final String f26358e;

    /* renamed from: f */
    private final String f26359f;

    /* renamed from: g */
    private final String f26360g;

    private C10118k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2198p.m33982m(!C6589l.m22355a(str), "ApplicationId must be set.");
        this.f26355b = str;
        this.f26354a = str2;
        this.f26356c = str3;
        this.f26357d = str4;
        this.f26358e = str5;
        this.f26359f = str6;
        this.f26360g = str7;
    }

    /* renamed from: a */
    public static C10118k m12272a(Context context) {
        C2207s c2207s = new C2207s(context);
        String m33966a = c2207s.m33966a("google_app_id");
        if (TextUtils.isEmpty(m33966a)) {
            return null;
        }
        return new C10118k(m33966a, c2207s.m33966a("google_api_key"), c2207s.m33966a("firebase_database_url"), c2207s.m33966a("ga_trackingId"), c2207s.m33966a("gcm_defaultSenderId"), c2207s.m33966a("google_storage_bucket"), c2207s.m33966a("project_id"));
    }

    /* renamed from: b */
    public String m12271b() {
        return this.f26354a;
    }

    /* renamed from: c */
    public String m12270c() {
        return this.f26355b;
    }

    /* renamed from: d */
    public String m12269d() {
        return this.f26358e;
    }

    /* renamed from: e */
    public String m12268e() {
        return this.f26360g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10118k)) {
            return false;
        }
        C10118k c10118k = (C10118k) obj;
        if (!C2190n.m34004b(this.f26355b, c10118k.f26355b) || !C2190n.m34004b(this.f26354a, c10118k.f26354a) || !C2190n.m34004b(this.f26356c, c10118k.f26356c) || !C2190n.m34004b(this.f26357d, c10118k.f26357d) || !C2190n.m34004b(this.f26358e, c10118k.f26358e) || !C2190n.m34004b(this.f26359f, c10118k.f26359f) || !C2190n.m34004b(this.f26360g, c10118k.f26360g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f26355b, this.f26354a, this.f26356c, this.f26357d, this.f26358e, this.f26359f, this.f26360g);
    }

    public String toString() {
        return C2190n.m34002d(this).m34001a("applicationId", this.f26355b).m34001a("apiKey", this.f26354a).m34001a("databaseUrl", this.f26356c).m34001a("gcmSenderId", this.f26358e).m34001a("storageBucket", this.f26359f).m34001a("projectId", this.f26360g).toString();
    }
}