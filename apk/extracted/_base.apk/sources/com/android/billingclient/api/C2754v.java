package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p331s1.C12377l0;
import p331s1.InterfaceC12366h;
import p331s1.InterfaceC12375k0;
import p331s1.InterfaceC12390x;
import p401w9.AbstractC13436b0;
import p401w9.C13450k;

/* renamed from: com.android.billingclient.api.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2754v extends BroadcastReceiver {

    /* renamed from: a */
    private final InterfaceC12366h f7414a;

    /* renamed from: b */
    private boolean f7415b;

    /* renamed from: c */
    final /* synthetic */ C2755w f7416c;

    public /* synthetic */ C2754v(C2755w c2755w, InterfaceC12390x interfaceC12390x, C12377l0 c12377l0) {
        this.f7416c = c2755w;
        this.f7414a = null;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ InterfaceC12390x m32449a(C2754v c2754v) {
        c2754v.getClass();
        return null;
    }

    /* renamed from: c */
    public final void m32447c(Context context, IntentFilter intentFilter) {
        C2754v c2754v;
        if (this.f7415b) {
            return;
        }
        c2754v = this.f7416c.f7418b;
        context.registerReceiver(c2754v, intentFilter);
        this.f7415b = true;
    }

    /* renamed from: d */
    public final void m32446d(Context context) {
        C2754v c2754v;
        if (this.f7415b) {
            c2754v = this.f7416c.f7418b;
            context.unregisterReceiver(c2754v);
            this.f7415b = false;
            return;
        }
        C13450k.m2463n("BillingBroadcastManager", "Receiver is not registered.");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C13450k.m2463n("BillingBroadcastManager", "Bundle is null.");
            InterfaceC12366h interfaceC12366h = this.f7414a;
            if (interfaceC12366h != null) {
                interfaceC12366h.onPurchasesUpdated(C2748p.f7395j, null);
                return;
            }
            return;
        }
        BillingResult m2468i = C13450k.m2468i(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            if (!extras.getBoolean("IS_FIRST_PARTY_PURCHASE", false) && this.f7414a != null) {
                this.f7414a.onPurchasesUpdated(m2468i, C13450k.m2465l(extras));
                return;
            }
            C13450k.m2463n("BillingBroadcastManager", "Received purchase and no valid listener registered.");
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (m2468i.m32600b() != 0) {
                this.f7414a.onPurchasesUpdated(m2468i, AbstractC13436b0.m2492u());
                return;
            }
            C13450k.m2463n("BillingBroadcastManager", "AlternativeBillingListener is null.");
            this.f7414a.onPurchasesUpdated(C2748p.f7395j, AbstractC13436b0.m2492u());
        }
    }

    public /* synthetic */ C2754v(C2755w c2755w, InterfaceC12366h interfaceC12366h, InterfaceC12375k0 interfaceC12375k0, C12377l0 c12377l0) {
        this.f7416c = c2755w;
        this.f7414a = interfaceC12366h;
    }
}
