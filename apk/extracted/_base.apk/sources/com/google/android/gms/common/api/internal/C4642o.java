package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C4609a;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4642o implements ComponentCallbacks2C4609a.InterfaceC4610a {

    /* renamed from: a */
    final /* synthetic */ C4614c f12747a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4642o(C4614c c4614c) {
        this.f12747a = c4614c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C4609a.InterfaceC4610a
    /* renamed from: a */
    public final void mo12280a(boolean z) {
        Handler handler;
        Handler handler2;
        C4614c c4614c = this.f12747a;
        handler = c4614c.f12689y;
        handler2 = c4614c.f12689y;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
