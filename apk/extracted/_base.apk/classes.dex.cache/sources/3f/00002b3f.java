package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.C4616d;

/* renamed from: com.google.android.gms.nearby.messages.internal.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class BinderC4696m extends BinderC4705t {

    /* renamed from: e */
    final /* synthetic */ C4616d f12895e;

    /* renamed from: f */
    final /* synthetic */ C4706u f12896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4696m(C4706u c4706u, C4616d c4616d, C4616d c4616d2) {
        super(c4616d);
        this.f12896f = c4706u;
        this.f12895e = c4616d2;
    }

    @Override // com.google.android.gms.nearby.messages.internal.BinderC4705t, p063da.InterfaceC5790c
    /* renamed from: a */
    public final void mo24505a() {
        C4616d.C4617a<?> m28183b = this.f12895e.m28183b();
        if (m28183b != null) {
            this.f12896f.m623n(m28183b);
        }
        super.mo24505a();
    }
}