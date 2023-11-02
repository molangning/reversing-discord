package p021b1;

import java.io.ObjectStreamField;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: b1.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2036g implements Serializable {

    /* renamed from: u */
    private static final ObjectStreamField[] f5623u = {new ObjectStreamField("trackerToken", String.class), new ObjectStreamField("trackerName", String.class), new ObjectStreamField("network", String.class), new ObjectStreamField("campaign", String.class), new ObjectStreamField("adgroup", String.class), new ObjectStreamField("creative", String.class), new ObjectStreamField("clickLabel", String.class), new ObjectStreamField("adid", String.class), new ObjectStreamField("costType", String.class), new ObjectStreamField("costAmount", Double.class), new ObjectStreamField("costCurrency", String.class)};

    /* renamed from: j */
    public String f5624j;

    /* renamed from: k */
    public String f5625k;

    /* renamed from: l */
    public String f5626l;

    /* renamed from: m */
    public String f5627m;

    /* renamed from: n */
    public String f5628n;

    /* renamed from: o */
    public String f5629o;

    /* renamed from: p */
    public String f5630p;

    /* renamed from: q */
    public String f5631q;

    /* renamed from: r */
    public String f5632r;

    /* renamed from: s */
    public Double f5633s;

    /* renamed from: t */
    public String f5634t;

    /* renamed from: a */
    public static C2036g m34571a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return null;
        }
        C2036g c2036g = new C2036g();
        if ("unity".equals(str2)) {
            c2036g.f5624j = jSONObject.optString("tracker_token", "");
            c2036g.f5625k = jSONObject.optString("tracker_name", "");
            c2036g.f5626l = jSONObject.optString("network", "");
            c2036g.f5627m = jSONObject.optString("campaign", "");
            c2036g.f5628n = jSONObject.optString("adgroup", "");
            c2036g.f5629o = jSONObject.optString("creative", "");
            c2036g.f5630p = jSONObject.optString("click_label", "");
            if (str == null) {
                str = "";
            }
            c2036g.f5631q = str;
            c2036g.f5632r = jSONObject.optString("cost_type", "");
            c2036g.f5633s = Double.valueOf(jSONObject.optDouble("cost_amount", 0.0d));
            c2036g.f5634t = jSONObject.optString("cost_currency", "");
        } else {
            c2036g.f5624j = jSONObject.optString("tracker_token");
            c2036g.f5625k = jSONObject.optString("tracker_name");
            c2036g.f5626l = jSONObject.optString("network");
            c2036g.f5627m = jSONObject.optString("campaign");
            c2036g.f5628n = jSONObject.optString("adgroup");
            c2036g.f5629o = jSONObject.optString("creative");
            c2036g.f5630p = jSONObject.optString("click_label");
            c2036g.f5631q = str;
            c2036g.f5632r = jSONObject.optString("cost_type");
            c2036g.f5633s = Double.valueOf(jSONObject.optDouble("cost_amount"));
            c2036g.f5634t = jSONObject.optString("cost_currency");
        }
        return c2036g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2036g c2036g = (C2036g) obj;
        if (C2043h1.m34476j(this.f5624j, c2036g.f5624j) && C2043h1.m34476j(this.f5625k, c2036g.f5625k) && C2043h1.m34476j(this.f5626l, c2036g.f5626l) && C2043h1.m34476j(this.f5627m, c2036g.f5627m) && C2043h1.m34476j(this.f5628n, c2036g.f5628n) && C2043h1.m34476j(this.f5629o, c2036g.f5629o) && C2043h1.m34476j(this.f5630p, c2036g.f5630p) && C2043h1.m34476j(this.f5631q, c2036g.f5631q) && C2043h1.m34476j(this.f5632r, c2036g.f5632r) && C2043h1.m34475k(this.f5633s, c2036g.f5633s) && C2043h1.m34476j(this.f5634t, c2036g.f5634t)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((629 + C2043h1.m34504P(this.f5624j)) * 37) + C2043h1.m34504P(this.f5625k)) * 37) + C2043h1.m34504P(this.f5626l)) * 37) + C2043h1.m34504P(this.f5627m)) * 37) + C2043h1.m34504P(this.f5628n)) * 37) + C2043h1.m34504P(this.f5629o)) * 37) + C2043h1.m34504P(this.f5630p)) * 37) + C2043h1.m34504P(this.f5631q)) * 37) + C2043h1.m34504P(this.f5632r)) * 37) + C2043h1.m34508L(this.f5633s)) * 37) + C2043h1.m34504P(this.f5634t);
    }

    public String toString() {
        return C2043h1.m34474l("tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s adid:%s ct:%s ca:%.2f cc:%s", this.f5624j, this.f5625k, this.f5626l, this.f5627m, this.f5628n, this.f5629o, this.f5630p, this.f5631q, this.f5632r, this.f5633s, this.f5634t);
    }
}