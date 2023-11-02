package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p153i8.InterfaceC7467t;
import p195k8.C9149a;
import p195k8.C9185m0;
import p195k8.C9191p0;
import p195k8.C9197r;

/* renamed from: com.google.android.exoplayer2.upstream.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4550h implements InterfaceC7467t {

    /* renamed from: d */
    public static final C4553c f12385d = m28621h(false, -9223372036854775807L);

    /* renamed from: e */
    public static final C4553c f12386e = m28621h(true, -9223372036854775807L);

    /* renamed from: f */
    public static final C4553c f12387f = new C4553c(2, -9223372036854775807L);

    /* renamed from: g */
    public static final C4553c f12388g = new C4553c(3, -9223372036854775807L);

    /* renamed from: a */
    private final ExecutorService f12389a;

    /* renamed from: b */
    private HandlerC4554d<? extends InterfaceC4555e> f12390b;

    /* renamed from: c */
    private IOException f12391c;

    /* renamed from: com.google.android.exoplayer2.upstream.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4552b<T extends InterfaceC4555e> {
        /* renamed from: j */
        void mo5356j(T t, long j, long j2, boolean z);

        /* renamed from: k */
        void mo5355k(T t, long j, long j2);

        /* renamed from: o */
        C4553c mo5351o(T t, long j, long j2, IOException iOException, int i);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4553c {

        /* renamed from: a */
        private final int f12392a;

        /* renamed from: b */
        private final long f12393b;

        /* renamed from: c */
        public boolean m28612c() {
            int i = this.f12392a;
            return i == 0 || i == 1;
        }

        private C4553c(int i, long j) {
            this.f12392a = i;
            this.f12393b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.h$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class HandlerC4554d<T extends InterfaceC4555e> extends Handler implements Runnable {

        /* renamed from: j */
        public final int f12394j;

        /* renamed from: k */
        private final T f12395k;

        /* renamed from: l */
        private final long f12396l;

        /* renamed from: m */
        private InterfaceC4552b<T> f12397m;

        /* renamed from: n */
        private IOException f12398n;

        /* renamed from: o */
        private int f12399o;

        /* renamed from: p */
        private Thread f12400p;

        /* renamed from: q */
        private boolean f12401q;

        /* renamed from: r */
        private volatile boolean f12402r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC4554d(Looper looper, T t, InterfaceC4552b<T> interfaceC4552b, int i, long j) {
            super(looper);
            C4550h.this = r1;
            this.f12395k = t;
            this.f12397m = interfaceC4552b;
            this.f12394j = i;
            this.f12396l = j;
        }

        /* renamed from: b */
        private void m28610b() {
            this.f12398n = null;
            C4550h.this.f12389a.execute((Runnable) C9149a.m16448e(C4550h.this.f12390b));
        }

        /* renamed from: c */
        private void m28609c() {
            C4550h.this.f12390b = null;
        }

        /* renamed from: d */
        private long m28608d() {
            return Math.min((this.f12399o - 1) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 5000);
        }

        /* renamed from: a */
        public void m28611a(boolean z) {
            this.f12402r = z;
            this.f12398n = null;
            if (hasMessages(0)) {
                this.f12401q = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f12401q = true;
                    this.f12395k.mo6276c();
                    Thread thread = this.f12400p;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                m28609c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((InterfaceC4552b) C9149a.m16448e(this.f12397m)).mo5356j(this.f12395k, elapsedRealtime, elapsedRealtime - this.f12396l, true);
                this.f12397m = null;
            }
        }

        /* renamed from: e */
        public void m28607e(int i) {
            IOException iOException = this.f12398n;
            if (iOException != null && this.f12399o > i) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void m28606f(long j) {
            boolean z;
            if (C4550h.this.f12390b == null) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16447f(z);
            C4550h.this.f12390b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m28610b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long m28608d;
            if (this.f12402r) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                m28610b();
            } else if (i != 3) {
                m28609c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f12396l;
                InterfaceC4552b interfaceC4552b = (InterfaceC4552b) C9149a.m16448e(this.f12397m);
                if (this.f12401q) {
                    interfaceC4552b.mo5356j(this.f12395k, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f12398n = iOException;
                        int i3 = this.f12399o + 1;
                        this.f12399o = i3;
                        C4553c mo5351o = interfaceC4552b.mo5351o(this.f12395k, elapsedRealtime, j, iOException, i3);
                        if (mo5351o.f12392a == 3) {
                            C4550h.this.f12391c = this.f12398n;
                            return;
                        } else if (mo5351o.f12392a != 2) {
                            if (mo5351o.f12392a == 1) {
                                this.f12399o = 1;
                            }
                            if (mo5351o.f12393b != -9223372036854775807L) {
                                m28608d = mo5351o.f12393b;
                            } else {
                                m28608d = m28608d();
                            }
                            m28606f(m28608d);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    interfaceC4552b.mo5355k(this.f12395k, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    C9197r.m16182d("LoadTask", "Unexpected exception handling load completed", e);
                    C4550h.this.f12391c = new C4558h(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    if (!this.f12401q) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f12400p = Thread.currentThread();
                }
                if (z) {
                    C9185m0.m16326a("load:" + this.f12395k.getClass().getSimpleName());
                    try {
                        this.f12395k.mo6277a();
                        C9185m0.m16324c();
                    } catch (Throwable th2) {
                        C9185m0.m16324c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f12400p = null;
                    Thread.interrupted();
                }
                if (!this.f12402r) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f12402r) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                C9197r.m16182d("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f12402r) {
                    obtainMessage(2, new C4558h(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                C9197r.m16182d("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f12402r) {
                    obtainMessage(2, new C4558h(e3)).sendToTarget();
                }
            } catch (Error e4) {
                C9197r.m16182d("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f12402r) {
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.h$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4555e {
        /* renamed from: a */
        void mo6277a();

        /* renamed from: c */
        void mo6276c();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.h$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4556f {
        /* renamed from: p */
        void mo6182p();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.h$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class RunnableC4557g implements Runnable {

        /* renamed from: j */
        private final InterfaceC4556f f12404j;

        public RunnableC4557g(InterfaceC4556f interfaceC4556f) {
            this.f12404j = interfaceC4556f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12404j.mo6182p();
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.h$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4558h extends IOException {
        public C4558h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public C4550h(String str) {
        this.f12389a = C9191p0.m16214x0(str);
    }

    /* renamed from: h */
    public static C4553c m28621h(boolean z, long j) {
        return new C4553c(z ? 1 : 0, j);
    }

    @Override // p153i8.InterfaceC7467t
    /* renamed from: a */
    public void mo20615a() {
        m28618k(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public void m28623f() {
        ((HandlerC4554d) C9149a.m16445h(this.f12390b)).m28611a(false);
    }

    /* renamed from: g */
    public void m28622g() {
        this.f12391c = null;
    }

    /* renamed from: i */
    public boolean m28620i() {
        return this.f12391c != null;
    }

    /* renamed from: j */
    public boolean m28619j() {
        return this.f12390b != null;
    }

    /* renamed from: k */
    public void m28618k(int i) {
        IOException iOException = this.f12391c;
        if (iOException == null) {
            HandlerC4554d<? extends InterfaceC4555e> handlerC4554d = this.f12390b;
            if (handlerC4554d != null) {
                if (i == Integer.MIN_VALUE) {
                    i = handlerC4554d.f12394j;
                }
                handlerC4554d.m28607e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: l */
    public void m28617l() {
        m28616m(null);
    }

    /* renamed from: m */
    public void m28616m(InterfaceC4556f interfaceC4556f) {
        HandlerC4554d<? extends InterfaceC4555e> handlerC4554d = this.f12390b;
        if (handlerC4554d != null) {
            handlerC4554d.m28611a(true);
        }
        if (interfaceC4556f != null) {
            this.f12389a.execute(new RunnableC4557g(interfaceC4556f));
        }
        this.f12389a.shutdown();
    }

    /* renamed from: n */
    public <T extends InterfaceC4555e> long m28615n(T t, InterfaceC4552b<T> interfaceC4552b, int i) {
        this.f12391c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC4554d((Looper) C9149a.m16445h(Looper.myLooper()), t, interfaceC4552b, i, elapsedRealtime).m28606f(0L);
        return elapsedRealtime;
    }
}