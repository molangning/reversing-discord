package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p331s1.C12380n;
import p331s1.C12381o;
import p331s1.C12382p;
import p331s1.C12383q;
import p331s1.C12384r;
import p331s1.C12386t;
import p401w9.AbstractC13436b0;
import p401w9.C13459t;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class BillingFlowParams {

    /* renamed from: a */
    private boolean f7244a;

    /* renamed from: b */
    private String f7245b;

    /* renamed from: c */
    private String f7246c;

    /* renamed from: d */
    private C2718c f7247d;

    /* renamed from: e */
    private AbstractC13436b0 f7248e;

    /* renamed from: f */
    private ArrayList f7249f;

    /* renamed from: g */
    private boolean f7250g;

    /* renamed from: com.android.billingclient.api.BillingFlowParams$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2715a {

        /* renamed from: a */
        private String f7251a;

        /* renamed from: b */
        private String f7252b;

        /* renamed from: c */
        private List f7253c;

        /* renamed from: d */
        private ArrayList f7254d;

        /* renamed from: e */
        private boolean f7255e;

        /* renamed from: f */
        private C2718c.C2719a f7256f;

        /* synthetic */ C2715a(C12380n c12380n) {
            C2718c.C2719a m32613a = C2718c.m32613a();
            C2718c.C2719a.m32602f(m32613a);
            this.f7256f = m32613a;
        }

        /* renamed from: a */
        public BillingFlowParams m32628a() {
            boolean z;
            boolean z2;
            ArrayList arrayList;
            AbstractC13436b0 m2492u;
            ArrayList arrayList2 = this.f7254d;
            boolean z3 = true;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            List list = this.f7253c;
            if (list != null && !list.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z && z2) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (z) {
                if (!this.f7254d.contains(null)) {
                    if (this.f7254d.size() > 1) {
                        SkuDetails skuDetails = (SkuDetails) this.f7254d.get(0);
                        String m32525g = skuDetails.m32525g();
                        ArrayList arrayList3 = this.f7254d;
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i);
                            if (!m32525g.equals("play_pass_subs") && !skuDetails2.m32525g().equals("play_pass_subs") && !m32525g.equals(skuDetails2.m32525g())) {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String m32521k = skuDetails.m32521k();
                        ArrayList arrayList4 = this.f7254d;
                        int size2 = arrayList4.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i2);
                            if (!m32525g.equals("play_pass_subs") && !skuDetails3.m32525g().equals("play_pass_subs") && !m32521k.equals(skuDetails3.m32521k())) {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            } else {
                C2716b c2716b = (C2716b) this.f7253c.get(0);
                for (int i3 = 0; i3 < this.f7253c.size(); i3++) {
                    C2716b c2716b2 = (C2716b) this.f7253c.get(i3);
                    if (c2716b2 != null) {
                        if (i3 != 0 && !c2716b2.m32620b().m32589e().equals(c2716b.m32620b().m32589e()) && !c2716b2.m32620b().m32589e().equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    } else {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
                String m32586h = c2716b.m32620b().m32586h();
                for (C2716b c2716b3 : this.f7253c) {
                    if (!c2716b.m32620b().m32589e().equals("play_pass_subs") && !c2716b3.m32620b().m32589e().equals("play_pass_subs") && !m32586h.equals(c2716b3.m32620b().m32586h())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams(null);
            if ((!z || ((SkuDetails) this.f7254d.get(0)).m32521k().isEmpty()) && (!z2 || ((C2716b) this.f7253c.get(0)).m32620b().m32586h().isEmpty())) {
                z3 = false;
            }
            billingFlowParams.f7244a = z3;
            billingFlowParams.f7245b = this.f7251a;
            billingFlowParams.f7246c = this.f7252b;
            billingFlowParams.f7247d = this.f7256f.m32607a();
            ArrayList arrayList5 = this.f7254d;
            if (arrayList5 != null) {
                arrayList = new ArrayList(arrayList5);
            } else {
                arrayList = new ArrayList();
            }
            billingFlowParams.f7249f = arrayList;
            billingFlowParams.f7250g = this.f7255e;
            List list2 = this.f7253c;
            if (list2 != null) {
                m2492u = AbstractC13436b0.m2493t(list2);
            } else {
                m2492u = AbstractC13436b0.m2492u();
            }
            billingFlowParams.f7248e = m2492u;
            return billingFlowParams;
        }

        /* renamed from: b */
        public C2715a m32627b(boolean z) {
            this.f7255e = z;
            return this;
        }

        /* renamed from: c */
        public C2715a m32626c(String str) {
            this.f7251a = str;
            return this;
        }

        /* renamed from: d */
        public C2715a m32625d(String str) {
            this.f7252b = str;
            return this;
        }

        /* renamed from: e */
        public C2715a m32624e(List<C2716b> list) {
            this.f7253c = new ArrayList(list);
            return this;
        }

        @Deprecated
        /* renamed from: f */
        public C2715a m32623f(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f7254d = arrayList;
            return this;
        }

        /* renamed from: g */
        public C2715a m32622g(C2718c c2718c) {
            this.f7256f = C2718c.m32611c(c2718c);
            return this;
        }
    }

    /* renamed from: com.android.billingclient.api.BillingFlowParams$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2716b {

        /* renamed from: a */
        private final ProductDetails f7257a;

        /* renamed from: b */
        private final String f7258b;

        /* renamed from: com.android.billingclient.api.BillingFlowParams$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C2717a {

            /* renamed from: a */
            private ProductDetails f7259a;

            /* renamed from: b */
            private String f7260b;

            /* synthetic */ C2717a(C12381o c12381o) {
            }

            /* renamed from: a */
            public C2716b m32618a() {
                C13459t.m2439c(this.f7259a, "ProductDetails is required for constructing ProductDetailsParams.");
                C13459t.m2439c(this.f7260b, "offerToken is required for constructing ProductDetailsParams.");
                return new C2716b(this, null);
            }

            /* renamed from: b */
            public C2717a m32617b(String str) {
                this.f7260b = str;
                return this;
            }

            /* renamed from: c */
            public C2717a m32616c(ProductDetails productDetails) {
                this.f7259a = productDetails;
                if (productDetails.m32591c() != null) {
                    productDetails.m32591c().getClass();
                    this.f7260b = productDetails.m32591c().m32580d();
                }
                return this;
            }
        }

        /* synthetic */ C2716b(C2717a c2717a, C12382p c12382p) {
            this.f7257a = c2717a.f7259a;
            this.f7258b = c2717a.f7260b;
        }

        /* renamed from: a */
        public static C2717a m32621a() {
            return new C2717a(null);
        }

        /* renamed from: b */
        public final ProductDetails m32620b() {
            return this.f7257a;
        }

        /* renamed from: c */
        public final String m32619c() {
            return this.f7258b;
        }
    }

    /* renamed from: com.android.billingclient.api.BillingFlowParams$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2718c {

        /* renamed from: a */
        private String f7261a;

        /* renamed from: b */
        private int f7262b = 0;

        /* renamed from: com.android.billingclient.api.BillingFlowParams$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C2719a {

            /* renamed from: a */
            private String f7263a;

            /* renamed from: b */
            private boolean f7264b;

            /* renamed from: c */
            private int f7265c = 0;

            /* synthetic */ C2719a(C12383q c12383q) {
            }

            /* renamed from: f */
            static /* synthetic */ C2719a m32602f(C2719a c2719a) {
                c2719a.f7264b = true;
                return c2719a;
            }

            /* renamed from: a */
            public C2718c m32607a() {
                boolean z;
                if (TextUtils.isEmpty(this.f7263a) && TextUtils.isEmpty(null)) {
                    z = false;
                } else {
                    z = true;
                }
                boolean isEmpty = true ^ TextUtils.isEmpty(null);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f7264b && !z && !isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C2718c c2718c = new C2718c(null);
                c2718c.f7261a = this.f7263a;
                c2718c.f7262b = this.f7265c;
                return c2718c;
            }

            /* renamed from: b */
            public C2719a m32606b(String str) {
                this.f7263a = str;
                return this;
            }

            @Deprecated
            /* renamed from: c */
            public C2719a m32605c(String str) {
                this.f7263a = str;
                return this;
            }

            /* renamed from: d */
            public C2719a m32604d(int i) {
                this.f7265c = i;
                return this;
            }

            @Deprecated
            /* renamed from: e */
            public C2719a m32603e(int i) {
                this.f7265c = i;
                return this;
            }
        }

        /* synthetic */ C2718c(C12384r c12384r) {
        }

        /* renamed from: a */
        public static C2719a m32613a() {
            return new C2719a(null);
        }

        /* renamed from: c */
        static /* bridge */ /* synthetic */ C2719a m32611c(C2718c c2718c) {
            C2719a m32613a = m32613a();
            m32613a.m32605c(c2718c.f7261a);
            m32613a.m32603e(c2718c.f7262b);
            return m32613a;
        }

        /* renamed from: b */
        final int m32612b() {
            return this.f7262b;
        }

        /* renamed from: d */
        final String m32610d() {
            return this.f7261a;
        }
    }

    private BillingFlowParams() {
    }

    /* synthetic */ BillingFlowParams(C12386t c12386t) {
    }

    /* renamed from: a */
    public static C2715a m32644a() {
        return new C2715a(null);
    }

    /* renamed from: b */
    public final int m32643b() {
        return this.f7247d.m32612b();
    }

    /* renamed from: c */
    public final String m32642c() {
        return this.f7245b;
    }

    /* renamed from: d */
    public final String m32641d() {
        return this.f7246c;
    }

    /* renamed from: e */
    public final String m32640e() {
        return this.f7247d.m32610d();
    }

    /* renamed from: f */
    public final ArrayList m32639f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f7249f);
        return arrayList;
    }

    /* renamed from: g */
    public final List m32638g() {
        return this.f7248e;
    }

    /* renamed from: o */
    public final boolean m32630o() {
        return this.f7250g;
    }

    /* renamed from: p */
    public final boolean m32629p() {
        return (this.f7245b == null && this.f7246c == null && this.f7247d.m32612b() == 0 && !this.f7244a && !this.f7250g) ? false : true;
    }
}