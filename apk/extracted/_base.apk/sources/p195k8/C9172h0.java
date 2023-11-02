package p195k8;

import com.google.android.exoplayer2.PlaybackParameters;
import p151i6.C7390b;

/* renamed from: k8.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9172h0 implements InterfaceC9199t {

    /* renamed from: j */
    private final InterfaceC9155c f24140j;

    /* renamed from: k */
    private boolean f24141k;

    /* renamed from: l */
    private long f24142l;

    /* renamed from: m */
    private long f24143m;

    /* renamed from: n */
    private PlaybackParameters f24144n = PlaybackParameters.f11301d;

    public C9172h0(InterfaceC9155c interfaceC9155c) {
        this.f24140j = interfaceC9155c;
    }

    /* renamed from: a */
    public void m16386a(long j) {
        this.f24142l = j;
        if (this.f24141k) {
            this.f24143m = this.f24140j.mo16373b();
        }
    }

    @Override // p195k8.InterfaceC9199t
    /* renamed from: b */
    public PlaybackParameters mo16172b() {
        return this.f24144n;
    }

    /* renamed from: c */
    public void m16385c() {
        if (!this.f24141k) {
            this.f24143m = this.f24140j.mo16373b();
            this.f24141k = true;
        }
    }

    /* renamed from: d */
    public void m16384d() {
        if (this.f24141k) {
            m16386a(mo16170o());
            this.f24141k = false;
        }
    }

    @Override // p195k8.InterfaceC9199t
    /* renamed from: f */
    public void mo16171f(PlaybackParameters playbackParameters) {
        if (this.f24141k) {
            m16386a(mo16170o());
        }
        this.f24144n = playbackParameters;
    }

    @Override // p195k8.InterfaceC9199t
    /* renamed from: o */
    public long mo16170o() {
        long m29843a;
        long j = this.f24142l;
        if (this.f24141k) {
            long mo16373b = this.f24140j.mo16373b() - this.f24143m;
            PlaybackParameters playbackParameters = this.f24144n;
            if (playbackParameters.f11302a == 1.0f) {
                m29843a = C7390b.m20792c(mo16373b);
            } else {
                m29843a = playbackParameters.m29843a(mo16373b);
            }
            return j + m29843a;
        }
        return j;
    }
}
