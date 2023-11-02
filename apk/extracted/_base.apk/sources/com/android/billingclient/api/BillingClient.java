package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import p331s1.C12350a;
import p331s1.C12357d;
import p331s1.C12368i;
import p331s1.C12371j;
import p331s1.C12379m0;
import p331s1.InterfaceC12353b;
import p331s1.InterfaceC12355c;
import p331s1.InterfaceC12360e;
import p331s1.InterfaceC12362f;
import p331s1.InterfaceC12364g;
import p331s1.InterfaceC12366h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class BillingClient {

    /* renamed from: com.android.billingclient.api.BillingClient$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2714a {

        /* renamed from: a */
        private volatile boolean f7241a;

        /* renamed from: b */
        private final Context f7242b;

        /* renamed from: c */
        private volatile InterfaceC12366h f7243c;

        /* synthetic */ C2714a(Context context, C12379m0 c12379m0) {
            this.f7242b = context;
        }

        /* renamed from: a */
        public BillingClient m32647a() {
            if (this.f7242b != null) {
                if (this.f7243c != null) {
                    if (this.f7241a) {
                        if (this.f7243c != null) {
                            return new C2731b(null, this.f7241a, this.f7242b, this.f7243c, null);
                        }
                        return new C2731b(null, this.f7241a, this.f7242b, null);
                    }
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        /* renamed from: b */
        public C2714a m32646b() {
            this.f7241a = true;
            return this;
        }

        /* renamed from: c */
        public C2714a m32645c(InterfaceC12366h interfaceC12366h) {
            this.f7243c = interfaceC12366h;
            return this;
        }
    }

    /* renamed from: g */
    public static C2714a m32648g(Context context) {
        return new C2714a(context, null);
    }

    /* renamed from: a */
    public abstract void mo32484a(C12350a c12350a, InterfaceC12353b interfaceC12353b);

    /* renamed from: b */
    public abstract void mo32483b(C12357d c12357d, InterfaceC12360e interfaceC12360e);

    /* renamed from: c */
    public abstract void mo32482c();

    /* renamed from: d */
    public abstract BillingResult mo32481d(String str);

    /* renamed from: e */
    public abstract boolean mo32480e();

    /* renamed from: f */
    public abstract BillingResult mo32479f(Activity activity, BillingFlowParams billingFlowParams);

    /* renamed from: h */
    public abstract void mo32478h(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener);

    /* renamed from: i */
    public abstract void mo32477i(C12368i c12368i, InterfaceC12362f interfaceC12362f);

    @Deprecated
    /* renamed from: j */
    public abstract void mo32476j(String str, InterfaceC12364g interfaceC12364g);

    /* renamed from: k */
    public abstract void mo32475k(C12371j c12371j, InterfaceC12364g interfaceC12364g);

    @Deprecated
    /* renamed from: l */
    public abstract void mo32474l(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);

    /* renamed from: m */
    public abstract void mo32473m(InterfaceC12355c interfaceC12355c);
}
