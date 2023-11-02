package com.android.billingclient.api;

import java.util.HashSet;
import java.util.List;
import p331s1.C12352a0;
import p331s1.C12354b0;
import p331s1.C12356c0;
import p331s1.C12392z;
import p401w9.AbstractC13436b0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class QueryProductDetailsParams {

    /* renamed from: a */
    private final AbstractC13436b0 f7311a;

    /* renamed from: com.android.billingclient.api.QueryProductDetailsParams$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2725a {

        /* renamed from: a */
        private AbstractC13436b0 f7312a;

        /* synthetic */ C2725a(C12392z c12392z) {
        }

        /* renamed from: a */
        public QueryProductDetailsParams m32542a() {
            return new QueryProductDetailsParams(this, null);
        }

        /* renamed from: b */
        public C2725a m32541b(List<C2726b> list) {
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (C2726b c2726b : list) {
                    if (!"play_pass_subs".equals(c2726b.m32537c())) {
                        hashSet.add(c2726b.m32537c());
                    }
                }
                if (hashSet.size() <= 1) {
                    this.f7312a = AbstractC13436b0.m2493t(list);
                    return this;
                }
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
    }

    /* renamed from: com.android.billingclient.api.QueryProductDetailsParams$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2726b {

        /* renamed from: a */
        private final String f7313a;

        /* renamed from: b */
        private final String f7314b;

        /* renamed from: com.android.billingclient.api.QueryProductDetailsParams$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C2727a {

            /* renamed from: a */
            private String f7315a;

            /* renamed from: b */
            private String f7316b;

            /* synthetic */ C2727a(C12352a0 c12352a0) {
            }

            /* renamed from: a */
            public C2726b m32536a() {
                if (!"first_party".equals(this.f7316b)) {
                    if (this.f7315a != null) {
                        if (this.f7316b != null) {
                            return new C2726b(this, null);
                        }
                        throw new IllegalArgumentException("Product type must be provided.");
                    }
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }

            /* renamed from: b */
            public C2727a m32535b(String str) {
                this.f7315a = str;
                return this;
            }

            /* renamed from: c */
            public C2727a m32534c(String str) {
                this.f7316b = str;
                return this;
            }
        }

        /* synthetic */ C2726b(C2727a c2727a, C12354b0 c12354b0) {
            this.f7313a = c2727a.f7315a;
            this.f7314b = c2727a.f7316b;
        }

        /* renamed from: a */
        public static C2727a m32539a() {
            return new C2727a(null);
        }

        /* renamed from: b */
        public final String m32538b() {
            return this.f7313a;
        }

        /* renamed from: c */
        public final String m32537c() {
            return this.f7314b;
        }
    }

    /* synthetic */ QueryProductDetailsParams(C2725a c2725a, C12356c0 c12356c0) {
        this.f7311a = c2725a.f7312a;
    }

    /* renamed from: a */
    public static C2725a m32545a() {
        return new C2725a(null);
    }

    /* renamed from: b */
    public final AbstractC13436b0 m32544b() {
        return this.f7311a;
    }

    /* renamed from: c */
    public final String m32543c() {
        return ((C2726b) this.f7311a.get(0)).m32537c();
    }
}