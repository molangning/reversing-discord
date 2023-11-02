package p213l8;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import p195k8.C9149a;
import p195k8.C9191p0;
import p213l8.InterfaceC10062a0;

/* renamed from: l8.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC10062a0 {

    /* renamed from: l8.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10063a {

        /* renamed from: a */
        private final Handler f26163a;

        /* renamed from: b */
        private final InterfaceC10062a0 f26164b;

        public C10063a(Handler handler, InterfaceC10062a0 interfaceC10062a0) {
            Handler handler2;
            if (interfaceC10062a0 != null) {
                handler2 = (Handler) C9149a.m16448e(handler);
            } else {
                handler2 = null;
            }
            this.f26163a = handler2;
            this.f26164b = interfaceC10062a0;
        }

        /* renamed from: p */
        public /* synthetic */ void m12443p(String str, long j, long j2) {
            ((InterfaceC10062a0) C9191p0.m16243j(this.f26164b)).mo12465h(str, j, j2);
        }

        /* renamed from: q */
        public /* synthetic */ void m12442q(String str) {
            ((InterfaceC10062a0) C9191p0.m16243j(this.f26164b)).mo12466f(str);
        }

        /* renamed from: r */
        public /* synthetic */ void m12441r(DecoderCounters decoderCounters) {
            decoderCounters.m29540c();
            ((InterfaceC10062a0) C9191p0.m16243j(this.f26164b)).mo12462r(decoderCounters);
        }

        /* renamed from: s */
        public /* synthetic */ void m12440s(int i, long j) {
            ((InterfaceC10062a0) C9191p0.m16243j(this.f26164b)).mo12461w(i, j);
        }

        /* renamed from: t */
        public /* synthetic */ void m12439t(DecoderCounters decoderCounters) {
            ((InterfaceC10062a0) C9191p0.m16243j(this.f26164b)).mo12460y(decoderCounters);
        }

        /* renamed from: u */
        public /* synthetic */ void m12438u(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((InterfaceC10062a0) C9191p0.m16243j(this.f26164b)).mo12463p(format, decoderReuseEvaluation);
        }

        /* renamed from: v */
        public /* synthetic */ void m12437v(Surface surface) {
            ((InterfaceC10062a0) C9191p0.m16243j(this.f26164b)).mo12464j(surface);
        }

        /* renamed from: w */
        public /* synthetic */ void m12436w(long j, int i) {
            ((InterfaceC10062a0) C9191p0.m16243j(this.f26164b)).mo12468E(j, i);
        }

        /* renamed from: x */
        public /* synthetic */ void m12435x(int i, int i2, int i3, float f) {
            ((InterfaceC10062a0) C9191p0.m16243j(this.f26164b)).mo12467d(i, i2, i3, f);
        }

        /* renamed from: A */
        public void m12459A(final int i, final int i2, final int i3, final float f) {
            Handler handler = this.f26163a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10062a0.C10063a.this.m12435x(i, i2, i3, f);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m12449j(final String str, final long j, final long j2) {
            Handler handler = this.f26163a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10062a0.C10063a.this.m12443p(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m12448k(final String str) {
            Handler handler = this.f26163a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10062a0.C10063a.this.m12442q(str);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m12447l(final DecoderCounters decoderCounters) {
            decoderCounters.m29540c();
            Handler handler = this.f26163a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10062a0.C10063a.this.m12441r(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m12446m(final int i, final long j) {
            Handler handler = this.f26163a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10062a0.C10063a.this.m12440s(i, j);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m12445n(final DecoderCounters decoderCounters) {
            Handler handler = this.f26163a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10062a0.C10063a.this.m12439t(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m12444o(final Format format, final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.f26163a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10062a0.C10063a.this.m12438u(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        /* renamed from: y */
        public void m12434y(final Surface surface) {
            Handler handler = this.f26163a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10062a0.C10063a.this.m12437v(surface);
                    }
                });
            }
        }

        /* renamed from: z */
        public void m12433z(final long j, final int i) {
            Handler handler = this.f26163a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l8.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC10062a0.C10063a.this.m12436w(j, i);
                    }
                });
            }
        }
    }

    /* renamed from: E */
    void mo12468E(long j, int i);

    /* renamed from: d */
    void mo12467d(int i, int i2, int i3, float f);

    /* renamed from: f */
    void mo12466f(String str);

    /* renamed from: h */
    void mo12465h(String str, long j, long j2);

    /* renamed from: j */
    void mo12464j(Surface surface);

    /* renamed from: p */
    void mo12463p(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    /* renamed from: r */
    void mo12462r(DecoderCounters decoderCounters);

    /* renamed from: w */
    void mo12461w(int i, long j);

    /* renamed from: y */
    void mo12460y(DecoderCounters decoderCounters);
}