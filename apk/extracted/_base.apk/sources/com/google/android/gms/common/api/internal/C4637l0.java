package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import p010a9.AbstractC0120r;

/* renamed from: com.google.android.gms.common.api.internal.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4637l0 extends AbstractC0120r {

    /* renamed from: a */
    final /* synthetic */ Dialog f12735a;

    /* renamed from: b */
    final /* synthetic */ RunnableC4639m0 f12736b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4637l0(RunnableC4639m0 runnableC4639m0, Dialog dialog) {
        this.f12736b = runnableC4639m0;
        this.f12735a = dialog;
    }

    @Override // p010a9.AbstractC0120r
    /* renamed from: a */
    public final void mo28133a() {
        this.f12736b.f12740k.m28118o();
        if (this.f12735a.isShowing()) {
            this.f12735a.dismiss();
        }
    }
}
