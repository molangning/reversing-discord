package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2748p {

    /* renamed from: a */
    static final BillingResult f7386a;

    /* renamed from: b */
    static final BillingResult f7387b;

    /* renamed from: c */
    static final BillingResult f7388c;

    /* renamed from: d */
    static final BillingResult f7389d;

    /* renamed from: e */
    static final BillingResult f7390e;

    /* renamed from: f */
    static final BillingResult f7391f;

    /* renamed from: g */
    static final BillingResult f7392g;

    /* renamed from: h */
    static final BillingResult f7393h;

    /* renamed from: i */
    static final BillingResult f7394i;

    /* renamed from: j */
    static final BillingResult f7395j;

    /* renamed from: k */
    static final BillingResult f7396k;

    /* renamed from: l */
    static final BillingResult f7397l;

    /* renamed from: m */
    static final BillingResult f7398m;

    /* renamed from: n */
    static final BillingResult f7399n;

    /* renamed from: o */
    static final BillingResult f7400o;

    /* renamed from: p */
    static final BillingResult f7401p;

    /* renamed from: q */
    static final BillingResult f7402q;

    /* renamed from: r */
    static final BillingResult f7403r;

    /* renamed from: s */
    static final BillingResult f7404s;

    /* renamed from: t */
    static final BillingResult f7405t;

    /* renamed from: u */
    static final BillingResult f7406u;

    /* renamed from: v */
    static final BillingResult f7407v;

    /* renamed from: w */
    static final BillingResult f7408w;

    /* renamed from: x */
    static final BillingResult f7409x;

    /* renamed from: y */
    static final BillingResult f7410y;

    /* renamed from: z */
    static final BillingResult f7411z;

    static {
        BillingResult.C2720a m32599c = BillingResult.m32599c();
        m32599c.m32594c(3);
        m32599c.m32595b("Google Play In-app Billing API version is less than 3");
        f7386a = m32599c.m32596a();
        BillingResult.C2720a m32599c2 = BillingResult.m32599c();
        m32599c2.m32594c(3);
        m32599c2.m32595b("Google Play In-app Billing API version is less than 9");
        f7387b = m32599c2.m32596a();
        BillingResult.C2720a m32599c3 = BillingResult.m32599c();
        m32599c3.m32594c(3);
        m32599c3.m32595b("Billing service unavailable on device.");
        f7388c = m32599c3.m32596a();
        BillingResult.C2720a m32599c4 = BillingResult.m32599c();
        m32599c4.m32594c(5);
        m32599c4.m32595b("Client is already in the process of connecting to billing service.");
        f7389d = m32599c4.m32596a();
        BillingResult.C2720a m32599c5 = BillingResult.m32599c();
        m32599c5.m32594c(5);
        m32599c5.m32595b("The list of SKUs can't be empty.");
        f7390e = m32599c5.m32596a();
        BillingResult.C2720a m32599c6 = BillingResult.m32599c();
        m32599c6.m32594c(5);
        m32599c6.m32595b("SKU type can't be empty.");
        f7391f = m32599c6.m32596a();
        BillingResult.C2720a m32599c7 = BillingResult.m32599c();
        m32599c7.m32594c(5);
        m32599c7.m32595b("Product type can't be empty.");
        f7392g = m32599c7.m32596a();
        BillingResult.C2720a m32599c8 = BillingResult.m32599c();
        m32599c8.m32594c(-2);
        m32599c8.m32595b("Client does not support extra params.");
        f7393h = m32599c8.m32596a();
        BillingResult.C2720a m32599c9 = BillingResult.m32599c();
        m32599c9.m32594c(5);
        m32599c9.m32595b("Invalid purchase token.");
        f7394i = m32599c9.m32596a();
        BillingResult.C2720a m32599c10 = BillingResult.m32599c();
        m32599c10.m32594c(6);
        m32599c10.m32595b("An internal error occurred.");
        f7395j = m32599c10.m32596a();
        BillingResult.C2720a m32599c11 = BillingResult.m32599c();
        m32599c11.m32594c(5);
        m32599c11.m32595b("SKU can't be null.");
        f7396k = m32599c11.m32596a();
        BillingResult.C2720a m32599c12 = BillingResult.m32599c();
        m32599c12.m32594c(0);
        f7397l = m32599c12.m32596a();
        BillingResult.C2720a m32599c13 = BillingResult.m32599c();
        m32599c13.m32594c(-1);
        m32599c13.m32595b("Service connection is disconnected.");
        f7398m = m32599c13.m32596a();
        BillingResult.C2720a m32599c14 = BillingResult.m32599c();
        m32599c14.m32594c(-3);
        m32599c14.m32595b("Timeout communicating with service.");
        f7399n = m32599c14.m32596a();
        BillingResult.C2720a m32599c15 = BillingResult.m32599c();
        m32599c15.m32594c(-2);
        m32599c15.m32595b("Client does not support subscriptions.");
        f7400o = m32599c15.m32596a();
        BillingResult.C2720a m32599c16 = BillingResult.m32599c();
        m32599c16.m32594c(-2);
        m32599c16.m32595b("Client does not support subscriptions update.");
        f7401p = m32599c16.m32596a();
        BillingResult.C2720a m32599c17 = BillingResult.m32599c();
        m32599c17.m32594c(-2);
        m32599c17.m32595b("Client does not support get purchase history.");
        f7402q = m32599c17.m32596a();
        BillingResult.C2720a m32599c18 = BillingResult.m32599c();
        m32599c18.m32594c(-2);
        m32599c18.m32595b("Client does not support price change confirmation.");
        f7403r = m32599c18.m32596a();
        BillingResult.C2720a m32599c19 = BillingResult.m32599c();
        m32599c19.m32594c(-2);
        m32599c19.m32595b("Play Store version installed does not support cross selling products.");
        f7404s = m32599c19.m32596a();
        BillingResult.C2720a m32599c20 = BillingResult.m32599c();
        m32599c20.m32594c(-2);
        m32599c20.m32595b("Client does not support multi-item purchases.");
        f7405t = m32599c20.m32596a();
        BillingResult.C2720a m32599c21 = BillingResult.m32599c();
        m32599c21.m32594c(-2);
        m32599c21.m32595b("Client does not support offer_id_token.");
        f7406u = m32599c21.m32596a();
        BillingResult.C2720a m32599c22 = BillingResult.m32599c();
        m32599c22.m32594c(-2);
        m32599c22.m32595b("Client does not support ProductDetails.");
        f7407v = m32599c22.m32596a();
        BillingResult.C2720a m32599c23 = BillingResult.m32599c();
        m32599c23.m32594c(-2);
        m32599c23.m32595b("Client does not support in-app messages.");
        f7408w = m32599c23.m32596a();
        BillingResult.C2720a m32599c24 = BillingResult.m32599c();
        m32599c24.m32594c(-2);
        m32599c24.m32595b("Client does not support alternative billing.");
        f7409x = m32599c24.m32596a();
        BillingResult.C2720a m32599c25 = BillingResult.m32599c();
        m32599c25.m32594c(5);
        m32599c25.m32595b("Unknown feature");
        f7410y = m32599c25.m32596a();
        BillingResult.C2720a m32599c26 = BillingResult.m32599c();
        m32599c26.m32594c(-2);
        m32599c26.m32595b("Play Store version installed does not support get billing config.");
        f7411z = m32599c26.m32596a();
    }
}
