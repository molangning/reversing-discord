package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C8002k2;
import io.sentry.C8156s1;
import io.sentry.InterfaceC7992j0;

/* renamed from: io.sentry.android.core.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7812u implements InterfaceC7992j0 {
    @Override // io.sentry.InterfaceC7992j0
    /* renamed from: a */
    public void mo19075a() {
    }

    @Override // io.sentry.InterfaceC7992j0
    /* renamed from: b */
    public void mo19074b(C8002k2 c8002k2) {
        c8002k2.m19032b(new C8156s1(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize()));
    }
}