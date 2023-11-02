package com.android.billingclient.api;

import android.text.TextUtils;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p401w9.AbstractC13436b0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ProductDetails {

    /* renamed from: a */
    private final String f7270a;

    /* renamed from: b */
    private final JSONObject f7271b;

    /* renamed from: c */
    private final String f7272c;

    /* renamed from: d */
    private final String f7273d;

    /* renamed from: e */
    private final String f7274e;

    /* renamed from: f */
    private final String f7275f;

    /* renamed from: g */
    private final String f7276g;

    /* renamed from: h */
    private final String f7277h;

    /* renamed from: i */
    private final String f7278i;

    /* renamed from: j */
    private final List f7279j;

    /* renamed from: k */
    private final List f7280k;

    /* renamed from: l */
    private final C2750r f7281l;

    /* renamed from: com.android.billingclient.api.ProductDetails$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2721a {

        /* renamed from: a */
        private final String f7282a;

        /* renamed from: b */
        private final long f7283b;

        /* renamed from: c */
        private final String f7284c;

        /* renamed from: d */
        private final String f7285d;

        /* renamed from: e */
        private final String f7286e;

        /* renamed from: f */
        private final AbstractC13436b0 f7287f;

        C2721a(JSONObject jSONObject) {
            this.f7282a = jSONObject.optString("formattedPrice");
            this.f7283b = jSONObject.optLong("priceAmountMicros");
            this.f7284c = jSONObject.optString("priceCurrencyCode");
            this.f7285d = jSONObject.optString("offerIdToken");
            this.f7286e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.f7287f = AbstractC13436b0.m2493t(arrayList);
        }

        /* renamed from: a */
        public String m32583a() {
            return this.f7282a;
        }

        /* renamed from: b */
        public long m32582b() {
            return this.f7283b;
        }

        /* renamed from: c */
        public String m32581c() {
            return this.f7284c;
        }

        /* renamed from: d */
        public final String m32580d() {
            return this.f7285d;
        }
    }

    /* renamed from: com.android.billingclient.api.ProductDetails$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2722b {

        /* renamed from: a */
        private final String f7288a;

        /* renamed from: b */
        private final long f7289b;

        /* renamed from: c */
        private final String f7290c;

        /* renamed from: d */
        private final String f7291d;

        /* renamed from: e */
        private final int f7292e;

        /* renamed from: f */
        private final int f7293f;

        C2722b(JSONObject jSONObject) {
            this.f7291d = jSONObject.optString("billingPeriod");
            this.f7290c = jSONObject.optString("priceCurrencyCode");
            this.f7288a = jSONObject.optString("formattedPrice");
            this.f7289b = jSONObject.optLong("priceAmountMicros");
            this.f7293f = jSONObject.optInt("recurrenceMode");
            this.f7292e = jSONObject.optInt("billingCycleCount");
        }

        /* renamed from: a */
        public int m32579a() {
            return this.f7292e;
        }

        /* renamed from: b */
        public String m32578b() {
            return this.f7291d;
        }

        /* renamed from: c */
        public String m32577c() {
            return this.f7288a;
        }

        /* renamed from: d */
        public long m32576d() {
            return this.f7289b;
        }

        /* renamed from: e */
        public String m32575e() {
            return this.f7290c;
        }

        /* renamed from: f */
        public int m32574f() {
            return this.f7293f;
        }
    }

    /* renamed from: com.android.billingclient.api.ProductDetails$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2723c {

        /* renamed from: a */
        private final List<C2722b> f7294a;

        C2723c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new C2722b(optJSONObject));
                    }
                }
            }
            this.f7294a = arrayList;
        }

        /* renamed from: a */
        public List<C2722b> m32573a() {
            return this.f7294a;
        }
    }

    /* renamed from: com.android.billingclient.api.ProductDetails$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2724d {

        /* renamed from: a */
        private final String f7295a;

        /* renamed from: b */
        private final String f7296b;

        /* renamed from: c */
        private final String f7297c;

        /* renamed from: d */
        private final C2723c f7298d;

        /* renamed from: e */
        private final List f7299e;

        /* renamed from: f */
        private final C2749q f7300f;

        C2724d(JSONObject jSONObject) {
            this.f7295a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.f7296b = true == optString.isEmpty() ? null : optString;
            this.f7297c = jSONObject.getString("offerIdToken");
            this.f7298d = new C2723c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f7300f = optJSONObject != null ? new C2749q(optJSONObject) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.f7299e = arrayList;
        }

        /* renamed from: a */
        public String m32572a() {
            return this.f7296b;
        }

        /* renamed from: b */
        public List<String> m32571b() {
            return this.f7299e;
        }

        /* renamed from: c */
        public String m32570c() {
            return this.f7297c;
        }

        /* renamed from: d */
        public C2723c m32569d() {
            return this.f7298d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProductDetails(String str) {
        ArrayList arrayList;
        this.f7270a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7271b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f7272c = optString;
        String optString2 = jSONObject.optString("type");
        this.f7273d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f7274e = jSONObject.optString("title");
                this.f7275f = jSONObject.optString(ZeroconfModule.KEY_SERVICE_NAME);
                this.f7276g = jSONObject.optString("description");
                this.f7277h = jSONObject.optString("skuDetailsToken");
                this.f7278i = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList2.add(new C2724d(optJSONArray.getJSONObject(i)));
                    }
                    this.f7279j = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.f7279j = arrayList;
                }
                JSONObject optJSONObject = this.f7271b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f7271b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList3.add(new C2721a(optJSONArray2.getJSONObject(i2)));
                    }
                    this.f7280k = arrayList3;
                } else if (optJSONObject != null) {
                    arrayList3.add(new C2721a(optJSONObject));
                    this.f7280k = arrayList3;
                } else {
                    this.f7280k = null;
                }
                JSONObject optJSONObject2 = this.f7271b.optJSONObject("limitedQuantityInfo");
                if (optJSONObject2 != null) {
                    this.f7281l = new C2750r(optJSONObject2);
                    return;
                } else {
                    this.f7281l = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    /* renamed from: a */
    public String m32593a() {
        return this.f7276g;
    }

    /* renamed from: b */
    public String m32592b() {
        return this.f7275f;
    }

    /* renamed from: c */
    public C2721a m32591c() {
        List list = this.f7280k;
        if (list != null && !list.isEmpty()) {
            return (C2721a) this.f7280k.get(0);
        }
        return null;
    }

    /* renamed from: d */
    public String m32590d() {
        return this.f7272c;
    }

    /* renamed from: e */
    public String m32589e() {
        return this.f7273d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetails)) {
            return false;
        }
        return TextUtils.equals(this.f7270a, ((ProductDetails) obj).f7270a);
    }

    /* renamed from: f */
    public List<C2724d> m32588f() {
        return this.f7279j;
    }

    /* renamed from: g */
    public String m32587g() {
        return this.f7274e;
    }

    /* renamed from: h */
    public final String m32586h() {
        return this.f7271b.optString("packageName");
    }

    public int hashCode() {
        return this.f7270a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final String m32585i() {
        return this.f7277h;
    }

    /* renamed from: j */
    public String m32584j() {
        return this.f7278i;
    }

    public String toString() {
        String str = this.f7270a;
        String obj = this.f7271b.toString();
        String str2 = this.f7272c;
        String str3 = this.f7273d;
        String str4 = this.f7274e;
        String str5 = this.f7277h;
        String valueOf = String.valueOf(this.f7279j);
        return "ProductDetails{jsonString='" + str + "', parsedJson=" + obj + ", productId='" + str2 + "', productType='" + str3 + "', title='" + str4 + "', productDetailsToken='" + str5 + "', subscriptionOfferDetails=" + valueOf + "}";
    }
}
