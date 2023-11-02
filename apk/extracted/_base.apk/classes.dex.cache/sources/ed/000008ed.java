package p021b1;

import org.json.JSONObject;

/* renamed from: b1.d1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2029d1 extends C2114z0 {

    /* renamed from: o */
    private String f5607o;

    public C2029d1(C2024c c2024c) {
        this.f5607o = C2043h1.m34515E(c2024c.m34681f());
    }

    /* renamed from: b */
    public C2074o m34655b() {
        if (this.f5952a) {
            return null;
        }
        C2074o c2074o = new C2074o();
        if ("unity".equals(this.f5607o)) {
            String str = this.f5955d;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c2074o.f5802c = str;
            String str3 = this.f5956e;
            if (str3 == null) {
                str3 = "";
            }
            c2074o.f5803d = str3;
            String str4 = this.f5954c;
            if (str4 != null) {
                str2 = str4;
            }
            c2074o.f5801b = str2;
            c2074o.f5800a = this.f5953b;
            JSONObject jSONObject = this.f5957f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            c2074o.f5804e = jSONObject;
        } else {
            c2074o.f5802c = this.f5955d;
            c2074o.f5803d = this.f5956e;
            c2074o.f5801b = this.f5954c;
            c2074o.f5800a = this.f5953b;
            c2074o.f5804e = this.f5957f;
        }
        return c2074o;
    }

    /* renamed from: c */
    public C2076p m34654c() {
        if (!this.f5952a) {
            return null;
        }
        C2076p c2076p = new C2076p();
        if ("unity".equals(this.f5607o)) {
            String str = this.f5955d;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c2076p.f5806b = str;
            String str3 = this.f5956e;
            if (str3 == null) {
                str3 = "";
            }
            c2076p.f5807c = str3;
            String str4 = this.f5954c;
            if (str4 != null) {
                str2 = str4;
            }
            c2076p.f5805a = str2;
            JSONObject jSONObject = this.f5957f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            c2076p.f5808d = jSONObject;
        } else {
            c2076p.f5806b = this.f5955d;
            c2076p.f5807c = this.f5956e;
            c2076p.f5805a = this.f5954c;
            c2076p.f5808d = this.f5957f;
        }
        return c2076p;
    }
}