package com.google.android.gms.common.api.internal;

import android.os.Handler;
import p029b9.AbstractC2150c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4648s implements AbstractC2150c.InterfaceC2155e {

    /* renamed from: a */
    final /* synthetic */ C4649t f12753a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4648s(C4649t c4649t) {
        this.f12753a = c4649t;
    }

    @Override // p029b9.AbstractC2150c.InterfaceC2155e
    /* renamed from: a */
    public final void mo28113a() {
        Handler handler;
        handler = this.f12753a.f12766o.f12689y;
        handler.post(new RunnableC4647r(this));
    }
}
