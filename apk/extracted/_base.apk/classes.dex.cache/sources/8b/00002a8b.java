package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Map;
import java.util.Set;
import p010a9.C0093b;
import p010a9.InterfaceC0098d0;
import p029b9.AbstractC2150c;
import p029b9.InterfaceC2177j;
import p441y8.C13930a;
import p461z8.C14107a;

/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4652w implements AbstractC2150c.InterfaceC2153c, InterfaceC0098d0 {

    /* renamed from: a */
    private final C14107a.InterfaceC14116f f12771a;

    /* renamed from: b */
    private final C0093b<?> f12772b;

    /* renamed from: c */
    private InterfaceC2177j f12773c = null;

    /* renamed from: d */
    private Set<Scope> f12774d = null;

    /* renamed from: e */
    private boolean f12775e = false;

    /* renamed from: f */
    final /* synthetic */ C4614c f12776f;

    public C4652w(C4614c c4614c, C14107a.InterfaceC14116f interfaceC14116f, C0093b<?> c0093b) {
        this.f12776f = c4614c;
        this.f12771a = interfaceC14116f;
        this.f12772b = c0093b;
    }

    /* renamed from: h */
    public final void m28061h() {
        InterfaceC2177j interfaceC2177j;
        if (!this.f12775e || (interfaceC2177j = this.f12773c) == null) {
            return;
        }
        this.f12771a.mo640j(interfaceC2177j, this.f12774d);
    }

    @Override // p029b9.AbstractC2150c.InterfaceC2153c
    /* renamed from: a */
    public final void mo28068a(C13930a c13930a) {
        Handler handler;
        handler = this.f12776f.f12689y;
        handler.post(new RunnableC4651v(this, c13930a));
    }

    @Override // p010a9.InterfaceC0098d0
    /* renamed from: b */
    public final void mo28067b(C13930a c13930a) {
        Map map;
        map = this.f12776f.f12685u;
        C4649t c4649t = (C4649t) map.get(this.f12772b);
        if (c4649t != null) {
            c4649t.m28104I(c13930a);
        }
    }

    @Override // p010a9.InterfaceC0098d0
    /* renamed from: c */
    public final void mo28066c(InterfaceC2177j interfaceC2177j, Set<Scope> set) {
        if (interfaceC2177j != null && set != null) {
            this.f12773c = interfaceC2177j;
            this.f12774d = set;
            m28061h();
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        mo28067b(new C13930a(4));
    }
}