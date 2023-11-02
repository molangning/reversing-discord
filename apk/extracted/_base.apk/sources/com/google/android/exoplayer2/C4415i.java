package com.google.android.exoplayer2;

import p195k8.C9149a;
import p195k8.C9172h0;
import p195k8.InterfaceC9155c;
import p195k8.InterfaceC9199t;

/* renamed from: com.google.android.exoplayer2.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4415i implements InterfaceC9199t {

    /* renamed from: j */
    private final C9172h0 f11618j;

    /* renamed from: k */
    private final InterfaceC4416a f11619k;

    /* renamed from: l */
    private InterfaceC4483u0 f11620l;

    /* renamed from: m */
    private InterfaceC9199t f11621m;

    /* renamed from: n */
    private boolean f11622n = true;

    /* renamed from: o */
    private boolean f11623o;

    /* renamed from: com.google.android.exoplayer2.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4416a {
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);
    }

    public C4415i(InterfaceC4416a interfaceC4416a, InterfaceC9155c interfaceC9155c) {
        this.f11619k = interfaceC4416a;
        this.f11618j = new C9172h0(interfaceC9155c);
    }

    /* renamed from: e */
    private boolean m29289e(boolean z) {
        InterfaceC4483u0 interfaceC4483u0 = this.f11620l;
        if (interfaceC4483u0 != null && !interfaceC4483u0.mo3109c() && (this.f11620l.mo3108e() || (!z && !this.f11620l.mo28968g()))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m29285j(boolean z) {
        if (m29289e(z)) {
            this.f11622n = true;
            if (this.f11623o) {
                this.f11618j.m16385c();
                return;
            }
            return;
        }
        InterfaceC9199t interfaceC9199t = (InterfaceC9199t) C9149a.m16448e(this.f11621m);
        long mo16170o = interfaceC9199t.mo16170o();
        if (this.f11622n) {
            if (mo16170o < this.f11618j.mo16170o()) {
                this.f11618j.m16384d();
                return;
            }
            this.f11622n = false;
            if (this.f11623o) {
                this.f11618j.m16385c();
            }
        }
        this.f11618j.m16386a(mo16170o);
        PlaybackParameters mo16172b = interfaceC9199t.mo16172b();
        if (!mo16172b.equals(this.f11618j.mo16172b())) {
            this.f11618j.mo16171f(mo16172b);
            this.f11619k.onPlaybackParametersChanged(mo16172b);
        }
    }

    /* renamed from: a */
    public void m29292a(InterfaceC4483u0 interfaceC4483u0) {
        if (interfaceC4483u0 == this.f11620l) {
            this.f11621m = null;
            this.f11620l = null;
            this.f11622n = true;
        }
    }

    @Override // p195k8.InterfaceC9199t
    /* renamed from: b */
    public PlaybackParameters mo16172b() {
        InterfaceC9199t interfaceC9199t = this.f11621m;
        if (interfaceC9199t != null) {
            return interfaceC9199t.mo16172b();
        }
        return this.f11618j.mo16172b();
    }

    /* renamed from: c */
    public void m29291c(InterfaceC4483u0 interfaceC4483u0) {
        InterfaceC9199t interfaceC9199t;
        InterfaceC9199t mo16660v = interfaceC4483u0.mo16660v();
        if (mo16660v != null && mo16660v != (interfaceC9199t = this.f11621m)) {
            if (interfaceC9199t == null) {
                this.f11621m = mo16660v;
                this.f11620l = interfaceC4483u0;
                mo16660v.mo16171f(this.f11618j.mo16172b());
                return;
            }
            throw ExoPlaybackException.m29930e(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: d */
    public void m29290d(long j) {
        this.f11618j.m16386a(j);
    }

    @Override // p195k8.InterfaceC9199t
    /* renamed from: f */
    public void mo16171f(PlaybackParameters playbackParameters) {
        InterfaceC9199t interfaceC9199t = this.f11621m;
        if (interfaceC9199t != null) {
            interfaceC9199t.mo16171f(playbackParameters);
            playbackParameters = this.f11621m.mo16172b();
        }
        this.f11618j.mo16171f(playbackParameters);
    }

    /* renamed from: g */
    public void m29288g() {
        this.f11623o = true;
        this.f11618j.m16385c();
    }

    /* renamed from: h */
    public void m29287h() {
        this.f11623o = false;
        this.f11618j.m16384d();
    }

    /* renamed from: i */
    public long m29286i(boolean z) {
        m29285j(z);
        return mo16170o();
    }

    @Override // p195k8.InterfaceC9199t
    /* renamed from: o */
    public long mo16170o() {
        if (this.f11622n) {
            return this.f11618j.mo16170o();
        }
        return ((InterfaceC9199t) C9149a.m16448e(this.f11621m)).mo16170o();
    }
}
