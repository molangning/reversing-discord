package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class SkuDetails {

    /* renamed from: a */
    private final String f7317a;

    /* renamed from: b */
    private final JSONObject f7318b;

    public SkuDetails(String str) {
        this.f7317a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7318b = jSONObject;
        if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
            if (!TextUtils.isEmpty(jSONObject.optString("type"))) {
                return;
            }
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
        throw new IllegalArgumentException("SKU cannot be empty.");
    }

    /* renamed from: a */
    public String m32531a() {
        return this.f7318b.optString("description");
    }

    /* renamed from: b */
    public String m32530b() {
        return this.f7318b.optString("price");
    }

    /* renamed from: c */
    public long m32529c() {
        return this.f7318b.optLong("price_amount_micros");
    }

    /* renamed from: d */
    public String m32528d() {
        return this.f7318b.optString("price_currency_code");
    }

    /* renamed from: e */
    public String m32527e() {
        return this.f7318b.optString("productId");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.f7317a, ((SkuDetails) obj).f7317a);
    }

    /* renamed from: f */
    public String m32526f() {
        return this.f7318b.optString("title");
    }

    /* renamed from: g */
    public String m32525g() {
        return this.f7318b.optString("type");
    }

    /* renamed from: h */
    public int m32524h() {
        return this.f7318b.optInt("offer_type");
    }

    public int hashCode() {
        return this.f7317a.hashCode();
    }

    /* renamed from: i */
    public String m32523i() {
        return this.f7318b.optString("offer_id");
    }

    /* renamed from: j */
    public String m32522j() {
        String optString = this.f7318b.optString("offerIdToken");
        if (optString.isEmpty()) {
            return this.f7318b.optString("offer_id_token");
        }
        return optString;
    }

    /* renamed from: k */
    public final String m32521k() {
        return this.f7318b.optString("packageName");
    }

    /* renamed from: l */
    public String m32520l() {
        return this.f7318b.optString("serializedDocid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final String m32519m() {
        return this.f7318b.optString("skuDetailsToken");
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f7317a));
    }
}
