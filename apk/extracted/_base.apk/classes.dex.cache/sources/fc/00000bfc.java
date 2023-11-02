package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import p331s1.C12367h0;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class SkuDetailsParams {

    /* renamed from: a */
    private String f7319a;

    /* renamed from: b */
    private List f7320b;

    /* renamed from: com.android.billingclient.api.SkuDetailsParams$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2728a {

        /* renamed from: a */
        private String f7321a;

        /* renamed from: b */
        private List f7322b;

        /* synthetic */ C2728a(C12367h0 c12367h0) {
        }

        /* renamed from: a */
        public SkuDetailsParams m32513a() {
            String str = this.f7321a;
            if (str != null) {
                if (this.f7322b != null) {
                    SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
                    skuDetailsParams.f7319a = str;
                    skuDetailsParams.f7320b = this.f7322b;
                    return skuDetailsParams;
                }
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
            throw new IllegalArgumentException("SKU type must be set");
        }

        /* renamed from: b */
        public C2728a m32512b(List<String> list) {
            this.f7322b = new ArrayList(list);
            return this;
        }

        /* renamed from: c */
        public C2728a m32511c(String str) {
            this.f7321a = str;
            return this;
        }
    }

    /* renamed from: c */
    public static C2728a m32516c() {
        return new C2728a(null);
    }

    /* renamed from: a */
    public String m32518a() {
        return this.f7319a;
    }

    /* renamed from: b */
    public List<String> m32517b() {
        return this.f7320b;
    }
}