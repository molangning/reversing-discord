package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import p331s1.C12350a;
import p331s1.C12357d;
import p331s1.C12368i;
import p331s1.C12371j;
import p331s1.C12391y;
import p331s1.InterfaceC12353b;
import p331s1.InterfaceC12355c;
import p331s1.InterfaceC12360e;
import p331s1.InterfaceC12362f;
import p331s1.InterfaceC12364g;
import p331s1.InterfaceC12366h;
import p331s1.InterfaceC12375k0;
import p331s1.InterfaceC12390x;
import p343t1.C12570a;
import p401w9.AbstractC13436b0;
import p401w9.C13450k;
import p401w9.InterfaceC13453n;

/* renamed from: com.android.billingclient.api.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2731b extends BillingClient {

    /* renamed from: a */
    private volatile int f7328a;

    /* renamed from: b */
    private final String f7329b;

    /* renamed from: c */
    private final Handler f7330c;

    /* renamed from: d */
    private volatile C2755w f7331d;

    /* renamed from: e */
    private Context f7332e;

    /* renamed from: f */
    private volatile InterfaceC13453n f7333f;

    /* renamed from: g */
    private volatile ServiceConnectionC2746n f7334g;

    /* renamed from: h */
    private boolean f7335h;

    /* renamed from: i */
    private boolean f7336i;

    /* renamed from: j */
    private int f7337j;

    /* renamed from: k */
    private boolean f7338k;

    /* renamed from: l */
    private boolean f7339l;

    /* renamed from: m */
    private boolean f7340m;

    /* renamed from: n */
    private boolean f7341n;

    /* renamed from: o */
    private boolean f7342o;

    /* renamed from: p */
    private boolean f7343p;

    /* renamed from: q */
    private boolean f7344q;

    /* renamed from: r */
    private boolean f7345r;

    /* renamed from: s */
    private boolean f7346s;

    /* renamed from: t */
    private boolean f7347t;

    /* renamed from: u */
    private boolean f7348u;

    /* renamed from: v */
    private ExecutorService f7349v;

    private C2731b(Context context, boolean z, InterfaceC12366h interfaceC12366h, String str, String str2, InterfaceC12375k0 interfaceC12375k0) {
        this.f7328a = 0;
        this.f7330c = new Handler(Looper.getMainLooper());
        this.f7337j = 0;
        this.f7329b = str;
        m32472n(context, interfaceC12366h, z, null);
    }

    /* renamed from: F */
    public static /* bridge */ /* synthetic */ C2747o m32503F(C2731b c2731b, String str) {
        C13450k.m2464m("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle m2469h = C13450k.m2469h(c2731b.f7340m, c2731b.f7347t, c2731b.f7329b);
        String str2 = null;
        while (c2731b.f7338k) {
            try {
                Bundle mo2455K = c2731b.f7333f.mo2455K(6, c2731b.f7332e.getPackageName(), str, str2, m2469h);
                BillingResult m32453a = C2751s.m32453a(mo2455K, "BillingClient", "getPurchaseHistory()");
                if (m32453a != C2748p.f7397l) {
                    return new C2747o(m32453a, null);
                }
                ArrayList<String> stringArrayList = mo2455K.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = mo2455K.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = mo2455K.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    C13450k.m2464m("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.m32548e())) {
                            C13450k.m2463n("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e) {
                        C13450k.m2462o("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new C2747o(C2748p.f7395j, null);
                    }
                }
                str2 = mo2455K.getString("INAPP_CONTINUATION_TOKEN");
                C13450k.m2464m("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new C2747o(C2748p.f7397l, arrayList);
                }
            } catch (RemoteException e2) {
                C13450k.m2462o("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                return new C2747o(C2748p.f7398m, null);
            }
        }
        C13450k.m2463n("BillingClient", "getPurchaseHistory is not supported on current device");
        return new C2747o(C2748p.f7402q, null);
    }

    /* renamed from: H */
    public static /* bridge */ /* synthetic */ C12391y m32501H(C2731b c2731b, String str) {
        Bundle mo2449p;
        C13450k.m2464m("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle m2469h = C13450k.m2469h(c2731b.f7340m, c2731b.f7347t, c2731b.f7329b);
        String str2 = null;
        do {
            try {
                if (c2731b.f7340m) {
                    mo2449p = c2731b.f7333f.mo2458B(9, c2731b.f7332e.getPackageName(), str, str2, m2469h);
                } else {
                    mo2449p = c2731b.f7333f.mo2449p(3, c2731b.f7332e.getPackageName(), str, str2);
                }
                BillingResult m32453a = C2751s.m32453a(mo2449p, "BillingClient", "getPurchase()");
                if (m32453a != C2748p.f7397l) {
                    return new C12391y(m32453a, null);
                }
                ArrayList<String> stringArrayList = mo2449p.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = mo2449p.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = mo2449p.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    C13450k.m2464m("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.m32558i())) {
                            C13450k.m2463n("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        C13450k.m2462o("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new C12391y(C2748p.f7395j, null);
                    }
                }
                str2 = mo2449p.getString("INAPP_CONTINUATION_TOKEN");
                C13450k.m2464m("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (Exception e2) {
                C13450k.m2462o("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new C12391y(C2748p.f7398m, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new C12391y(C2748p.f7397l, arrayList);
    }

    /* renamed from: n */
    private void m32472n(Context context, InterfaceC12366h interfaceC12366h, boolean z, InterfaceC12375k0 interfaceC12375k0) {
        boolean z2;
        this.f7332e = context.getApplicationContext();
        if (interfaceC12366h == null) {
            C13450k.m2463n("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f7331d = new C2755w(this.f7332e, interfaceC12366h, interfaceC12375k0);
        this.f7347t = z;
        if (interfaceC12375k0 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f7348u = z2;
    }

    /* renamed from: t */
    public final Handler m32466t() {
        return Looper.myLooper() == null ? this.f7330c : new Handler(Looper.myLooper());
    }

    /* renamed from: u */
    private final BillingResult m32465u(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.f7330c.post(new Runnable() { // from class: com.android.billingclient.api.h
            @Override // java.lang.Runnable
            public final void run() {
                C2731b.this.m32467s(billingResult);
            }
        });
        return billingResult;
    }

    /* renamed from: v */
    public final BillingResult m32464v() {
        if (this.f7328a != 0 && this.f7328a != 3) {
            return C2748p.f7395j;
        }
        return C2748p.f7398m;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: w */
    private static String m32463w() {
        try {
            return (String) C12570a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "5.1.0";
        }
    }

    /* renamed from: x */
    public final Future m32462x(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.f7349v == null) {
            this.f7349v = Executors.newFixedThreadPool(C13450k.f34695a, new ThreadFactoryC2743k(this));
        }
        try {
            final Future submit = this.f7349v.submit(callable);
            handler.postDelayed(new Runnable() { // from class: s1.l
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (!future.isDone() && !future.isCancelled()) {
                        future.cancel(true);
                        C13450k.m2463n("BillingClient", "Async task is taking too long, cancel it!");
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            C13450k.m2462o("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* renamed from: y */
    private final void m32461y(String str, final InterfaceC12362f interfaceC12362f) {
        if (!mo32480e()) {
            interfaceC12362f.mo5427a(C2748p.f7398m, null);
        } else if (m32462x(new CallableC2742j(this, str, interfaceC12362f), 30000L, new Runnable() { // from class: com.android.billingclient.api.c0
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC12362f.this.mo5427a(C2748p.f7399n, null);
            }
        }, m32466t()) == null) {
            interfaceC12362f.mo5427a(m32464v(), null);
        }
    }

    /* renamed from: z */
    private final void m32460z(String str, final InterfaceC12364g interfaceC12364g) {
        if (!mo32480e()) {
            interfaceC12364g.mo5426a(C2748p.f7398m, AbstractC13436b0.m2492u());
        } else if (TextUtils.isEmpty(str)) {
            C13450k.m2463n("BillingClient", "Please provide a valid product type.");
            interfaceC12364g.mo5426a(C2748p.f7392g, AbstractC13436b0.m2492u());
        } else if (m32462x(new CallableC2741i(this, str, interfaceC12364g), 30000L, new Runnable() { // from class: com.android.billingclient.api.g
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC12364g.this.mo5426a(C2748p.f7399n, AbstractC13436b0.m2492u());
            }
        }, m32466t()) == null) {
            interfaceC12364g.mo5426a(m32464v(), AbstractC13436b0.m2492u());
        }
    }

    /* renamed from: C */
    public final /* synthetic */ Bundle m32506C(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) {
        return this.f7333f.mo2448u(i, this.f7332e.getPackageName(), str, str2, null, bundle);
    }

    /* renamed from: D */
    public final /* synthetic */ Bundle m32505D(String str, String str2) {
        return this.f7333f.mo2454N(3, this.f7332e.getPackageName(), str, str2, null);
    }

    /* renamed from: J */
    public final /* synthetic */ Object m32499J(C12350a c12350a, InterfaceC12353b interfaceC12353b) {
        try {
            Bundle mo2452c0 = this.f7333f.mo2452c0(9, this.f7332e.getPackageName(), c12350a.m5439a(), C13450k.m2474c(c12350a, this.f7329b));
            int m2475b = C13450k.m2475b(mo2452c0, "BillingClient");
            String m2467j = C13450k.m2467j(mo2452c0, "BillingClient");
            BillingResult.C2720a m32599c = BillingResult.m32599c();
            m32599c.m32594c(m2475b);
            m32599c.m32595b(m2467j);
            interfaceC12353b.mo5434a(m32599c.m32596a());
            return null;
        } catch (Exception e) {
            C13450k.m2462o("BillingClient", "Error acknowledge purchase!", e);
            interfaceC12353b.mo5434a(C2748p.f7398m);
            return null;
        }
    }

    /* renamed from: K */
    public final /* synthetic */ Object m32498K(C12357d c12357d, InterfaceC12360e interfaceC12360e) {
        int mo2450h;
        String str;
        String m5433a = c12357d.m5433a();
        try {
            C13450k.m2464m("BillingClient", "Consuming purchase with token: " + m5433a);
            if (this.f7340m) {
                Bundle mo2456J = this.f7333f.mo2456J(9, this.f7332e.getPackageName(), m5433a, C13450k.m2473d(c12357d, this.f7340m, this.f7329b));
                mo2450h = mo2456J.getInt("RESPONSE_CODE");
                str = C13450k.m2467j(mo2456J, "BillingClient");
            } else {
                mo2450h = this.f7333f.mo2450h(3, this.f7332e.getPackageName(), m5433a);
                str = "";
            }
            BillingResult.C2720a m32599c = BillingResult.m32599c();
            m32599c.m32594c(mo2450h);
            m32599c.m32595b(str);
            BillingResult m32596a = m32599c.m32596a();
            if (mo2450h == 0) {
                C13450k.m2464m("BillingClient", "Successfully consumed purchase.");
                interfaceC12360e.mo5428a(m32596a, m5433a);
                return null;
            }
            C13450k.m2463n("BillingClient", "Error consuming purchase with token. Response code: " + mo2450h);
            interfaceC12360e.mo5428a(m32596a, m5433a);
            return null;
        } catch (Exception e) {
            C13450k.m2462o("BillingClient", "Error consuming purchase!", e);
            interfaceC12360e.mo5428a(C2748p.f7398m, m5433a);
            return null;
        }
    }

    /* renamed from: L */
    public final /* synthetic */ Object m32497L(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        String m32543c = queryProductDetailsParams.m32543c();
        AbstractC13436b0 m32544b = queryProductDetailsParams.m32544b();
        int size = m32544b.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                int i4 = i3 + 20;
                if (i4 > size) {
                    i = size;
                } else {
                    i = i4;
                }
                ArrayList arrayList2 = new ArrayList(m32544b.subList(i3, i));
                ArrayList<String> arrayList3 = new ArrayList<>();
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList3.add(((QueryProductDetailsParams.C2726b) arrayList2.get(i5)).m32538b());
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                bundle.putString("playBillingLibraryVersion", this.f7329b);
                try {
                    Bundle mo2457I = this.f7333f.mo2457I(17, this.f7332e.getPackageName(), m32543c, bundle, C13450k.m2470g(this.f7329b, arrayList2, null));
                    str = "Item is unavailable for purchase.";
                    if (mo2457I == null) {
                        C13450k.m2463n("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        break;
                    } else if (!mo2457I.containsKey("DETAILS_LIST")) {
                        i2 = C13450k.m2475b(mo2457I, "BillingClient");
                        str = C13450k.m2467j(mo2457I, "BillingClient");
                        if (i2 != 0) {
                            C13450k.m2463n("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i2);
                        } else {
                            C13450k.m2463n("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                        }
                    } else {
                        ArrayList<String> stringArrayList = mo2457I.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            C13450k.m2463n("BillingClient", "queryProductDetailsAsync got null response list");
                            break;
                        }
                        for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                            try {
                                ProductDetails productDetails = new ProductDetails(stringArrayList.get(i6));
                                C13450k.m2464m("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                arrayList.add(productDetails);
                            } catch (JSONException e) {
                                C13450k.m2462o("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                str = "Error trying to decode SkuDetails.";
                                i2 = 6;
                                BillingResult.C2720a m32599c = BillingResult.m32599c();
                                m32599c.m32594c(i2);
                                m32599c.m32595b(str);
                                productDetailsResponseListener.mo31774a(m32599c.m32596a(), arrayList);
                                return null;
                            }
                        }
                        i3 = i4;
                    }
                } catch (Exception e2) {
                    C13450k.m2462o("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                    str = "An internal error occurred.";
                }
            } else {
                str = "";
                break;
            }
        }
        i2 = 4;
        BillingResult.C2720a m32599c2 = BillingResult.m32599c();
        m32599c2.m32594c(i2);
        m32599c2.m32595b(str);
        productDetailsResponseListener.mo31774a(m32599c2.m32596a(), arrayList);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x008d, code lost:
        r0 = null;
        r4 = 4;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object m32496M(java.lang.String r19, java.util.List r20, java.lang.String r21, com.android.billingclient.api.SkuDetailsResponseListener r22) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C2731b.m32496M(java.lang.String, java.util.List, java.lang.String, com.android.billingclient.api.SkuDetailsResponseListener):java.lang.Object");
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: a */
    public final void mo32484a(final C12350a c12350a, final InterfaceC12353b interfaceC12353b) {
        if (!mo32480e()) {
            interfaceC12353b.mo5434a(C2748p.f7398m);
        } else if (TextUtils.isEmpty(c12350a.m5439a())) {
            C13450k.m2463n("BillingClient", "Please provide a valid purchase token.");
            interfaceC12353b.mo5434a(C2748p.f7394i);
        } else if (!this.f7340m) {
            interfaceC12353b.mo5434a(C2748p.f7387b);
        } else if (m32462x(new Callable() { // from class: com.android.billingclient.api.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2731b.this.m32499J(c12350a, interfaceC12353b);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.d
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC12353b.this.mo5434a(C2748p.f7399n);
            }
        }, m32466t()) == null) {
            interfaceC12353b.mo5434a(m32464v());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: b */
    public final void mo32483b(final C12357d c12357d, final InterfaceC12360e interfaceC12360e) {
        if (!mo32480e()) {
            interfaceC12360e.mo5428a(C2748p.f7398m, c12357d.m5433a());
        } else if (m32462x(new Callable() { // from class: com.android.billingclient.api.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2731b.this.m32498K(c12357d, interfaceC12360e);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.b0
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC12360e.this.mo5428a(C2748p.f7399n, c12357d.m5433a());
            }
        }, m32466t()) == null) {
            interfaceC12360e.mo5428a(m32464v(), c12357d.m5433a());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: c */
    public final void mo32482c() {
        try {
            this.f7331d.m32442d();
            if (this.f7334g != null) {
                this.f7334g.m32457c();
            }
            if (this.f7334g != null && this.f7333f != null) {
                C13450k.m2464m("BillingClient", "Unbinding from service.");
                this.f7332e.unbindService(this.f7334g);
                this.f7334g = null;
            }
            this.f7333f = null;
            ExecutorService executorService = this.f7349v;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f7349v = null;
            }
        } catch (Exception e) {
            C13450k.m2462o("BillingClient", "There was an exception while ending connection!", e);
        } finally {
            this.f7328a = 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: d */
    public final BillingResult mo32481d(String str) {
        char c;
        if (!mo32480e()) {
            return C2748p.f7398m;
        }
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97314:
                if (str.equals("bbb")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 101286:
                if (str.equals("fff")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 102279:
                if (str.equals("ggg")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (this.f7335h) {
                    return C2748p.f7397l;
                }
                return C2748p.f7400o;
            case 1:
                if (this.f7336i) {
                    return C2748p.f7397l;
                }
                return C2748p.f7401p;
            case 2:
                if (this.f7339l) {
                    return C2748p.f7397l;
                }
                return C2748p.f7403r;
            case 3:
                if (this.f7342o) {
                    return C2748p.f7397l;
                }
                return C2748p.f7408w;
            case 4:
                if (this.f7344q) {
                    return C2748p.f7397l;
                }
                return C2748p.f7404s;
            case 5:
                if (this.f7343p) {
                    return C2748p.f7397l;
                }
                return C2748p.f7406u;
            case 6:
            case 7:
                if (this.f7345r) {
                    return C2748p.f7397l;
                }
                return C2748p.f7405t;
            case '\b':
                if (this.f7346s) {
                    return C2748p.f7397l;
                }
                return C2748p.f7407v;
            case '\t':
                if (this.f7346s) {
                    return C2748p.f7397l;
                }
                return C2748p.f7411z;
            default:
                C13450k.m2463n("BillingClient", "Unsupported feature: ".concat(str));
                return C2748p.f7410y;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: e */
    public final boolean mo32480e() {
        return (this.f7328a != 2 || this.f7333f == null || this.f7334g == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0325 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x037a A[Catch: Exception -> 0x03ba, CancellationException -> 0x03c6, TimeoutException -> 0x03c8, TryCatch #4 {CancellationException -> 0x03c6, TimeoutException -> 0x03c8, Exception -> 0x03ba, blocks: (B:312:0x0366, B:314:0x037a, B:316:0x03a0), top: B:332:0x0366 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x03a0 A[Catch: Exception -> 0x03ba, CancellationException -> 0x03c6, TimeoutException -> 0x03c8, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x03c6, TimeoutException -> 0x03c8, Exception -> 0x03ba, blocks: (B:312:0x0366, B:314:0x037a, B:316:0x03a0), top: B:332:0x0366 }] */
    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult mo32479f(android.app.Activity r32, final com.android.billingclient.api.BillingFlowParams r33) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C2731b.mo32479f(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: h */
    public void mo32478h(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!mo32480e()) {
            productDetailsResponseListener.mo31774a(C2748p.f7398m, new ArrayList());
        } else if (!this.f7346s) {
            C13450k.m2463n("BillingClient", "Querying product details is not supported.");
            productDetailsResponseListener.mo31774a(C2748p.f7407v, new ArrayList());
        } else if (m32462x(new Callable() { // from class: com.android.billingclient.api.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2731b.this.m32497L(queryProductDetailsParams, productDetailsResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.z
            @Override // java.lang.Runnable
            public final void run() {
                ProductDetailsResponseListener.this.mo31774a(C2748p.f7399n, new ArrayList());
            }
        }, m32466t()) == null) {
            productDetailsResponseListener.mo31774a(m32464v(), new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: i */
    public void mo32477i(C12368i c12368i, InterfaceC12362f interfaceC12362f) {
        m32461y(c12368i.m5424b(), interfaceC12362f);
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: j */
    public void mo32476j(String str, InterfaceC12364g interfaceC12364g) {
        m32460z(str, interfaceC12364g);
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: k */
    public void mo32475k(C12371j c12371j, InterfaceC12364g interfaceC12364g) {
        m32460z(c12371j.m5419b(), interfaceC12364g);
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: l */
    public final void mo32474l(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!mo32480e()) {
            skuDetailsResponseListener.mo32109a(C2748p.f7398m, null);
            return;
        }
        String m32518a = skuDetailsParams.m32518a();
        List<String> m32517b = skuDetailsParams.m32517b();
        if (!TextUtils.isEmpty(m32518a)) {
            if (m32517b != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : m32517b) {
                    C2752t c2752t = new C2752t(null);
                    c2752t.m32452a(str);
                    arrayList.add(c2752t.m32451b());
                }
                if (m32462x(new Callable(m32518a, arrayList, null, skuDetailsResponseListener) { // from class: com.android.billingclient.api.x

                    /* renamed from: k */
                    public final /* synthetic */ String f7420k;

                    /* renamed from: l */
                    public final /* synthetic */ List f7421l;

                    /* renamed from: m */
                    public final /* synthetic */ SkuDetailsResponseListener f7422m;

                    {
                        this.f7422m = skuDetailsResponseListener;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C2731b.this.m32496M(this.f7420k, this.f7421l, null, this.f7422m);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SkuDetailsResponseListener.this.mo32109a(C2748p.f7399n, null);
                    }
                }, m32466t()) == null) {
                    skuDetailsResponseListener.mo32109a(m32464v(), null);
                    return;
                }
                return;
            }
            C13450k.m2463n("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            skuDetailsResponseListener.mo32109a(C2748p.f7390e, null);
            return;
        }
        C13450k.m2463n("BillingClient", "Please fix the input params. SKU type can't be empty.");
        skuDetailsResponseListener.mo32109a(C2748p.f7391f, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    /* renamed from: m */
    public final void mo32473m(InterfaceC12355c interfaceC12355c) {
        ServiceInfo serviceInfo;
        if (mo32480e()) {
            C13450k.m2464m("BillingClient", "Service connection is valid. No need to re-initialize.");
            interfaceC12355c.onBillingSetupFinished(C2748p.f7397l);
        } else if (this.f7328a == 1) {
            C13450k.m2463n("BillingClient", "Client is already in the process of connecting to billing service.");
            interfaceC12355c.onBillingSetupFinished(C2748p.f7389d);
        } else if (this.f7328a == 3) {
            C13450k.m2463n("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            interfaceC12355c.onBillingSetupFinished(C2748p.f7398m);
        } else {
            this.f7328a = 1;
            this.f7331d.m32441e();
            C13450k.m2464m("BillingClient", "Starting in-app billing setup.");
            this.f7334g = new ServiceConnectionC2746n(this, interfaceC12355c, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f7332e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f7329b);
                    if (this.f7332e.bindService(intent2, this.f7334g, 1)) {
                        C13450k.m2464m("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    C13450k.m2463n("BillingClient", "Connection to Billing service is blocked.");
                } else {
                    C13450k.m2463n("BillingClient", "The device doesn't have valid Play Store.");
                }
            }
            this.f7328a = 0;
            C13450k.m2464m("BillingClient", "Billing service unavailable on device.");
            interfaceC12355c.onBillingSetupFinished(C2748p.f7388c);
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void m32467s(BillingResult billingResult) {
        if (this.f7331d.m32443c() != null) {
            this.f7331d.m32443c().onPurchasesUpdated(billingResult, null);
            return;
        }
        this.f7331d.m32444b();
        C13450k.m2463n("BillingClient", "No valid listener is set in BroadcastManager");
    }

    public C2731b(String str, boolean z, Context context, InterfaceC12390x interfaceC12390x) {
        this.f7328a = 0;
        this.f7330c = new Handler(Looper.getMainLooper());
        this.f7337j = 0;
        this.f7329b = m32463w();
        this.f7332e = context.getApplicationContext();
        C13450k.m2463n("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f7331d = new C2755w(this.f7332e, null);
        this.f7347t = z;
    }

    public C2731b(String str, boolean z, Context context, InterfaceC12366h interfaceC12366h, InterfaceC12375k0 interfaceC12375k0) {
        this(context, z, interfaceC12366h, m32463w(), null, null);
    }
}
