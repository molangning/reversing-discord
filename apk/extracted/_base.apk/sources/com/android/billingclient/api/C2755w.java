package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import p331s1.InterfaceC12366h;
import p331s1.InterfaceC12375k0;
import p331s1.InterfaceC12390x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2755w {

    /* renamed from: a */
    private final Context f7417a;

    /* renamed from: b */
    private final C2754v f7418b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2755w(Context context, InterfaceC12390x interfaceC12390x) {
        this.f7417a = context;
        this.f7418b = new C2754v(this, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC12390x m32444b() {
        C2754v.m32449a(this.f7418b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final InterfaceC12366h m32443c() {
        return C2754v.m32448b(this.f7418b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m32442d() {
        this.f7418b.m32446d(this.f7417a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m32441e() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f7418b.m32447c(this.f7417a, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2755w(Context context, InterfaceC12366h interfaceC12366h, InterfaceC12375k0 interfaceC12375k0) {
        this.f7417a = context;
        this.f7418b = new C2754v(this, interfaceC12366h, interfaceC12375k0, null);
    }
}
