package com.google.android.gms.common.api.internal;

import android.util.Log;
import java.util.Map;
import p010a9.C0093b;
import p441y8.C13930a;
import p461z8.C14107a;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC4651v implements Runnable {

    /* renamed from: j */
    final /* synthetic */ C13930a f12769j;

    /* renamed from: k */
    final /* synthetic */ C4652w f12770k;

    public RunnableC4651v(C4652w c4652w, C13930a c13930a) {
        this.f12770k = c4652w;
        this.f12769j = c13930a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C0093b c0093b;
        C14107a.InterfaceC14116f interfaceC14116f;
        C14107a.InterfaceC14116f interfaceC14116f2;
        C14107a.InterfaceC14116f interfaceC14116f3;
        C14107a.InterfaceC14116f interfaceC14116f4;
        C4652w c4652w = this.f12770k;
        map = c4652w.f12776f.f12685u;
        c0093b = c4652w.f12772b;
        C4649t c4649t = (C4649t) map.get(c0093b);
        if (c4649t == null) {
            return;
        }
        if (this.f12769j.m1146H()) {
            this.f12770k.f12775e = true;
            interfaceC14116f = this.f12770k.f12771a;
            if (interfaceC14116f.mo642g()) {
                this.f12770k.m28061h();
                return;
            }
            try {
                C4652w c4652w2 = this.f12770k;
                interfaceC14116f3 = c4652w2.f12771a;
                interfaceC14116f4 = c4652w2.f12771a;
                interfaceC14116f3.mo640j(null, interfaceC14116f4.mo641i());
                return;
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                interfaceC14116f2 = this.f12770k.f12771a;
                interfaceC14116f2.mo647b("Failed to get service from broker.");
                c4649t.m28105H(new C13930a(10), null);
                return;
            }
        }
        c4649t.m28105H(this.f12769j, null);
    }
}