package com.android.billingclient.api;

import java.util.concurrent.Callable;
import p331s1.InterfaceC12362f;

/* renamed from: com.android.billingclient.api.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class CallableC2742j implements Callable {

    /* renamed from: j */
    final /* synthetic */ String f7373j;

    /* renamed from: k */
    final /* synthetic */ InterfaceC12362f f7374k;

    /* renamed from: l */
    final /* synthetic */ C2731b f7375l;

    public CallableC2742j(C2731b c2731b, String str, InterfaceC12362f interfaceC12362f) {
        this.f7375l = c2731b;
        this.f7373j = str;
        this.f7374k = interfaceC12362f;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2747o m32503F = C2731b.m32503F(this.f7375l, this.f7373j);
        this.f7374k.mo5427a(m32503F.m32455a(), m32503F.m32454b());
        return null;
    }
}