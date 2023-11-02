package com.android.billingclient.api;

import java.util.concurrent.Callable;
import p331s1.C12391y;
import p331s1.InterfaceC12364g;
import p401w9.AbstractC13436b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class CallableC2741i implements Callable {

    /* renamed from: j */
    final /* synthetic */ String f7370j;

    /* renamed from: k */
    final /* synthetic */ InterfaceC12364g f7371k;

    /* renamed from: l */
    final /* synthetic */ C2731b f7372l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2741i(C2731b c2731b, String str, InterfaceC12364g interfaceC12364g) {
        this.f7372l = c2731b;
        this.f7370j = str;
        this.f7371k = interfaceC12364g;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C12391y m32501H = C2731b.m32501H(this.f7372l, this.f7370j);
        if (m32501H.m5414b() != null) {
            this.f7371k.mo5426a(m32501H.m5415a(), m32501H.m5414b());
            return null;
        }
        this.f7371k.mo5426a(m32501H.m5415a(), AbstractC13436b0.m2492u());
        return null;
    }
}
