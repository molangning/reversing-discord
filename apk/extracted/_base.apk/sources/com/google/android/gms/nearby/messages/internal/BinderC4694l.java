package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.C4616d;

/* renamed from: com.google.android.gms.nearby.messages.internal.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class BinderC4694l extends BinderC4703r {

    /* renamed from: e */
    final /* synthetic */ C4616d f12893e;

    /* renamed from: f */
    final /* synthetic */ C4706u f12894f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4694l(C4706u c4706u, C4616d c4616d, C4616d c4616d2) {
        super(c4616d);
        this.f12894f = c4706u;
        this.f12893e = c4616d2;
    }

    @Override // com.google.android.gms.nearby.messages.internal.BinderC4703r, p063da.InterfaceC5807t
    /* renamed from: a */
    public final void mo24501a() {
        C4616d.C4617a<?> m28183b = this.f12893e.m28183b();
        if (m28183b != null) {
            this.f12894f.m623n(m28183b);
        }
        super.mo24501a();
    }
}
