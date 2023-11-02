package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class PurchaseHistoryRecord {

    /* renamed from: a */
    private final String f7308a;

    /* renamed from: b */
    private final String f7309b;

    /* renamed from: c */
    private final JSONObject f7310c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f7308a = str;
        this.f7309b = str2;
        this.f7310c = new JSONObject(str);
    }

    /* renamed from: g */
    private final ArrayList m32546g() {
        ArrayList arrayList = new ArrayList();
        if (this.f7310c.has("productIds")) {
            JSONArray optJSONArray = this.f7310c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.f7310c.has("productId")) {
            arrayList.add(this.f7310c.optString("productId"));
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m32552a() {
        return this.f7310c.optString("developerPayload");
    }

    /* renamed from: b */
    public String m32551b() {
        return this.f7308a;
    }

    /* renamed from: c */
    public List<String> m32550c() {
        return m32546g();
    }

    /* renamed from: d */
    public long m32549d() {
        return this.f7310c.optLong("purchaseTime");
    }

    /* renamed from: e */
    public String m32548e() {
        JSONObject jSONObject = this.f7310c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        if (TextUtils.equals(this.f7308a, purchaseHistoryRecord.m32551b()) && TextUtils.equals(this.f7309b, purchaseHistoryRecord.m32547f())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m32547f() {
        return this.f7309b;
    }

    public int hashCode() {
        return this.f7308a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f7308a));
    }
}