package com.google.android.exoplayer2;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import p195k8.C9149a;
import p195k8.InterfaceC9155c;

/* renamed from: com.google.android.exoplayer2.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4446s0 {

    /* renamed from: a */
    private final InterfaceC4448b f11734a;

    /* renamed from: b */
    private final InterfaceC4447a f11735b;

    /* renamed from: c */
    private final InterfaceC9155c f11736c;

    /* renamed from: d */
    private final Timeline f11737d;

    /* renamed from: e */
    private int f11738e;

    /* renamed from: f */
    private Object f11739f;

    /* renamed from: g */
    private Looper f11740g;

    /* renamed from: h */
    private int f11741h;

    /* renamed from: i */
    private long f11742i = -9223372036854775807L;

    /* renamed from: j */
    private boolean f11743j = true;

    /* renamed from: k */
    private boolean f11744k;

    /* renamed from: l */
    private boolean f11745l;

    /* renamed from: m */
    private boolean f11746m;

    /* renamed from: n */
    private boolean f11747n;

    /* renamed from: com.google.android.exoplayer2.s0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4447a {
        /* renamed from: d */
        void mo29146d(C4446s0 c4446s0);
    }

    /* renamed from: com.google.android.exoplayer2.s0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4448b {
        /* renamed from: j */
        void mo11675j(int i, Object obj);
    }

    public C4446s0(InterfaceC4447a interfaceC4447a, InterfaceC4448b interfaceC4448b, Timeline timeline, int i, InterfaceC9155c interfaceC9155c, Looper looper) {
        this.f11735b = interfaceC4447a;
        this.f11734a = interfaceC4448b;
        this.f11737d = timeline;
        this.f11740g = looper;
        this.f11736c = interfaceC9155c;
        this.f11741h = i;
    }

    /* renamed from: a */
    public synchronized boolean m29160a(long j) {
        boolean z;
        boolean z2;
        C9149a.m16447f(this.f11744k);
        if (this.f11740g.getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        long mo16373b = this.f11736c.mo16373b() + j;
        while (true) {
            z2 = this.f11746m;
            if (z2 || j <= 0) {
                break;
            }
            wait(j);
            j = mo16373b - this.f11736c.mo16373b();
        }
        if (z2) {
        } else {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f11745l;
    }

    /* renamed from: b */
    public boolean m29159b() {
        return this.f11743j;
    }

    /* renamed from: c */
    public Looper m29158c() {
        return this.f11740g;
    }

    /* renamed from: d */
    public Object m29157d() {
        return this.f11739f;
    }

    /* renamed from: e */
    public long m29156e() {
        return this.f11742i;
    }

    /* renamed from: f */
    public InterfaceC4448b m29155f() {
        return this.f11734a;
    }

    /* renamed from: g */
    public Timeline m29154g() {
        return this.f11737d;
    }

    /* renamed from: h */
    public int m29153h() {
        return this.f11738e;
    }

    /* renamed from: i */
    public int m29152i() {
        return this.f11741h;
    }

    /* renamed from: j */
    public synchronized boolean m29151j() {
        return this.f11747n;
    }

    /* renamed from: k */
    public synchronized void m29150k(boolean z) {
        this.f11745l = z | this.f11745l;
        this.f11746m = true;
        notifyAll();
    }

    /* renamed from: l */
    public C4446s0 m29149l() {
        C9149a.m16447f(!this.f11744k);
        if (this.f11742i == -9223372036854775807L) {
            C9149a.m16452a(this.f11743j);
        }
        this.f11744k = true;
        this.f11735b.mo29146d(this);
        return this;
    }

    /* renamed from: m */
    public C4446s0 m29148m(Object obj) {
        C9149a.m16447f(!this.f11744k);
        this.f11739f = obj;
        return this;
    }

    /* renamed from: n */
    public C4446s0 m29147n(int i) {
        C9149a.m16447f(!this.f11744k);
        this.f11738e = i;
        return this;
    }
}
