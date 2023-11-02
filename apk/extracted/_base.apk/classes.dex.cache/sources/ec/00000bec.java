package com.android.billingclient.api;

import p331s1.C12387u;
import p401w9.C13450k;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BillingResult {

    /* renamed from: a */
    private int f7266a;

    /* renamed from: b */
    private String f7267b;

    /* renamed from: com.android.billingclient.api.BillingResult$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2720a {

        /* renamed from: a */
        private int f7268a;

        /* renamed from: b */
        private String f7269b = "";

        /* synthetic */ C2720a(C12387u c12387u) {
        }

        /* renamed from: a */
        public BillingResult m32596a() {
            BillingResult billingResult = new BillingResult();
            billingResult.f7266a = this.f7268a;
            billingResult.f7267b = this.f7269b;
            return billingResult;
        }

        /* renamed from: b */
        public C2720a m32595b(String str) {
            this.f7269b = str;
            return this;
        }

        /* renamed from: c */
        public C2720a m32594c(int i) {
            this.f7268a = i;
            return this;
        }
    }

    /* renamed from: c */
    public static C2720a m32599c() {
        return new C2720a(null);
    }

    /* renamed from: a */
    public String m32601a() {
        return this.f7267b;
    }

    /* renamed from: b */
    public int m32600b() {
        return this.f7266a;
    }

    public String toString() {
        String m2466k = C13450k.m2466k(this.f7266a);
        String str = this.f7267b;
        return "Response Code: " + m2466k + ", Debug Message: " + str;
    }
}