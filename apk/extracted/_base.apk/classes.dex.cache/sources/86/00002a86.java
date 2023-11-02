package com.google.android.gms.common.api.internal;

import p461z8.C14107a;

/* renamed from: com.google.android.gms.common.api.internal.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC4647r implements Runnable {

    /* renamed from: j */
    final /* synthetic */ C4648s f12752j;

    public RunnableC4647r(C4648s c4648s) {
        this.f12752j = c4648s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14107a.InterfaceC14116f interfaceC14116f;
        C14107a.InterfaceC14116f interfaceC14116f2;
        C4649t c4649t = this.f12752j.f12753a;
        interfaceC14116f = c4649t.f12755d;
        interfaceC14116f2 = c4649t.f12755d;
        interfaceC14116f.mo647b(interfaceC14116f2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}