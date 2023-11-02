package p193k6;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import p193k6.InterfaceC9115q;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: k6.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC9115q {

    /* renamed from: k6.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9116a {

        /* renamed from: a */
        private final Handler f23993a;

        /* renamed from: b */
        private final InterfaceC9115q f23994b;

        public C9116a(Handler handler, InterfaceC9115q interfaceC9115q) {
            Handler handler2;
            if (interfaceC9115q != null) {
                handler2 = (Handler) C9149a.m16448e(handler);
            } else {
                handler2 = null;
            }
            this.f23993a = handler2;
            this.f23994b = interfaceC9115q;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m16578p(Exception exc) {
            ((InterfaceC9115q) C9191p0.m16243j(this.f23994b)).mo16601c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m16577q(String str, long j, long j2) {
            ((InterfaceC9115q) C9191p0.m16243j(this.f23994b)).mo16598m(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m16576r(String str) {
            ((InterfaceC9115q) C9191p0.m16243j(this.f23994b)).mo16599l(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m16575s(DecoderCounters decoderCounters) {
            decoderCounters.m29540c();
            ((InterfaceC9115q) C9191p0.m16243j(this.f23994b)).mo16596s(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m16574t(DecoderCounters decoderCounters) {
            ((InterfaceC9115q) C9191p0.m16243j(this.f23994b)).mo16600g(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m16573u(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((InterfaceC9115q) C9191p0.m16243j(this.f23994b)).mo16595x(format, decoderReuseEvaluation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m16572v(long j) {
            ((InterfaceC9115q) C9191p0.m16243j(this.f23994b)).mo16597q(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m16571w(boolean z) {
            ((InterfaceC9115q) C9191p0.m16243j(this.f23994b)).mo16602a(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m16570x(int i, long j, long j2) {
            ((InterfaceC9115q) C9191p0.m16243j(this.f23994b)).mo16603C(i, j, j2);
        }

        /* renamed from: A */
        public void m16594A(final int i, final long j, final long j2) {
            Handler handler = this.f23993a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k6.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9115q.C9116a.this.m16570x(i, j, j2);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m16584j(final Exception exc) {
            Handler handler = this.f23993a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k6.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9115q.C9116a.this.m16578p(exc);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m16583k(final String str, final long j, final long j2) {
            Handler handler = this.f23993a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k6.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9115q.C9116a.this.m16577q(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m16582l(final String str) {
            Handler handler = this.f23993a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k6.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9115q.C9116a.this.m16576r(str);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m16581m(final DecoderCounters decoderCounters) {
            decoderCounters.m29540c();
            Handler handler = this.f23993a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9115q.C9116a.this.m16575s(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m16580n(final DecoderCounters decoderCounters) {
            Handler handler = this.f23993a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k6.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9115q.C9116a.this.m16574t(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m16579o(final Format format, final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.f23993a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k6.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9115q.C9116a.this.m16573u(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        /* renamed from: y */
        public void m16569y(final long j) {
            Handler handler = this.f23993a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k6.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9115q.C9116a.this.m16572v(j);
                    }
                });
            }
        }

        /* renamed from: z */
        public void m16568z(final boolean z) {
            Handler handler = this.f23993a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k6.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9115q.C9116a.this.m16571w(z);
                    }
                });
            }
        }
    }

    /* renamed from: C */
    void mo16603C(int i, long j, long j2);

    /* renamed from: a */
    void mo16602a(boolean z);

    /* renamed from: c */
    void mo16601c(Exception exc);

    /* renamed from: g */
    void mo16600g(DecoderCounters decoderCounters);

    /* renamed from: l */
    void mo16599l(String str);

    /* renamed from: m */
    void mo16598m(String str, long j, long j2);

    /* renamed from: q */
    void mo16597q(long j);

    /* renamed from: s */
    void mo16596s(DecoderCounters decoderCounters);

    /* renamed from: x */
    void mo16595x(Format format, DecoderReuseEvaluation decoderReuseEvaluation);
}
