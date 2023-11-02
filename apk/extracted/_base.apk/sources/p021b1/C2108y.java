package p021b1;

import org.json.JSONObject;

/* renamed from: b1.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2108y extends C2114z0 {

    /* renamed from: o */
    private String f5943o;

    /* renamed from: p */
    private String f5944p;

    /* renamed from: q */
    private String f5945q;

    public C2108y(C2024c c2024c) {
        this.f5943o = c2024c.m34674m().get("event_token");
        this.f5944p = c2024c.m34674m().get("event_callback_id");
        this.f5945q = C2043h1.m34515E(c2024c.m34681f());
    }

    /* renamed from: b */
    public C2051j m34199b() {
        if (this.f5952a) {
            return null;
        }
        C2051j c2051j = new C2051j();
        if ("unity".equals(this.f5945q)) {
            String str = this.f5943o;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c2051j.f5708e = str;
            String str3 = this.f5955d;
            if (str3 == null) {
                str3 = "";
            }
            c2051j.f5706c = str3;
            String str4 = this.f5956e;
            if (str4 == null) {
                str4 = "";
            }
            c2051j.f5707d = str4;
            String str5 = this.f5954c;
            if (str5 == null) {
                str5 = "";
            }
            c2051j.f5705b = str5;
            String str6 = this.f5944p;
            if (str6 != null) {
                str2 = str6;
            }
            c2051j.f5709f = str2;
            c2051j.f5704a = this.f5953b;
            JSONObject jSONObject = this.f5957f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            c2051j.f5710g = jSONObject;
        } else {
            c2051j.f5708e = this.f5943o;
            c2051j.f5706c = this.f5955d;
            c2051j.f5707d = this.f5956e;
            c2051j.f5705b = this.f5954c;
            c2051j.f5709f = this.f5944p;
            c2051j.f5704a = this.f5953b;
            c2051j.f5710g = this.f5957f;
        }
        return c2051j;
    }

    /* renamed from: c */
    public C2053k m34198c() {
        if (!this.f5952a) {
            return null;
        }
        C2053k c2053k = new C2053k();
        if ("unity".equals(this.f5945q)) {
            String str = this.f5943o;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c2053k.f5723d = str;
            String str3 = this.f5955d;
            if (str3 == null) {
                str3 = "";
            }
            c2053k.f5721b = str3;
            String str4 = this.f5956e;
            if (str4 == null) {
                str4 = "";
            }
            c2053k.f5722c = str4;
            String str5 = this.f5954c;
            if (str5 == null) {
                str5 = "";
            }
            c2053k.f5720a = str5;
            String str6 = this.f5944p;
            if (str6 != null) {
                str2 = str6;
            }
            c2053k.f5724e = str2;
            JSONObject jSONObject = this.f5957f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            c2053k.f5725f = jSONObject;
        } else {
            c2053k.f5723d = this.f5943o;
            c2053k.f5721b = this.f5955d;
            c2053k.f5722c = this.f5956e;
            c2053k.f5720a = this.f5954c;
            c2053k.f5724e = this.f5944p;
            c2053k.f5725f = this.f5957f;
        }
        return c2053k;
    }
}
