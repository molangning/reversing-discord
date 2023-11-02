package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Purchase {

    /* renamed from: a */
    private final String f7305a;

    /* renamed from: b */
    private final String f7306b;

    /* renamed from: c */
    private final JSONObject f7307c;

    public Purchase(String str, String str2) {
        this.f7305a = str;
        this.f7306b = str2;
        this.f7307c = new JSONObject(str);
    }

    /* renamed from: n */
    private final ArrayList m32553n() {
        ArrayList arrayList = new ArrayList();
        if (this.f7307c.has("productIds")) {
            JSONArray optJSONArray = this.f7307c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.f7307c.has("productId")) {
            arrayList.add(this.f7307c.optString("productId"));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C2729a m32566a() {
        String optString = this.f7307c.optString("obfuscatedAccountId");
        String optString2 = this.f7307c.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new C2729a(optString, optString2);
    }

    /* renamed from: b */
    public String m32565b() {
        return this.f7307c.optString("developerPayload");
    }

    /* renamed from: c */
    public String m32564c() {
        return this.f7307c.optString("orderId");
    }

    /* renamed from: d */
    public String m32563d() {
        return this.f7305a;
    }

    /* renamed from: e */
    public String m32562e() {
        return this.f7307c.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (TextUtils.equals(this.f7305a, purchase.m32563d()) && TextUtils.equals(this.f7306b, purchase.m32557j())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<String> m32561f() {
        return m32553n();
    }

    /* renamed from: g */
    public int m32560g() {
        return this.f7307c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    /* renamed from: h */
    public long m32559h() {
        return this.f7307c.optLong("purchaseTime");
    }

    public int hashCode() {
        return this.f7305a.hashCode();
    }

    /* renamed from: i */
    public String m32558i() {
        JSONObject jSONObject = this.f7307c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: j */
    public String m32557j() {
        return this.f7306b;
    }

    @Deprecated
    /* renamed from: k */
    public ArrayList<String> m32556k() {
        return m32553n();
    }

    /* renamed from: l */
    public boolean m32555l() {
        return this.f7307c.optBoolean("acknowledged", true);
    }

    /* renamed from: m */
    public boolean m32554m() {
        return this.f7307c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f7305a));
    }
}
