package p213l8;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p195k8.C9149a;
import p195k8.C9182l;
import p195k8.C9197r;
import p195k8.RunnableC9173i;

/* renamed from: l8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10067d extends Surface {

    /* renamed from: m */
    private static int f26173m;

    /* renamed from: n */
    private static boolean f26174n;

    /* renamed from: j */
    public final boolean f26175j;

    /* renamed from: k */
    private final HandlerThreadC10069b f26176k;

    /* renamed from: l */
    private boolean f26177l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l8.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class HandlerThreadC10069b extends HandlerThread implements Handler.Callback {

        /* renamed from: j */
        private RunnableC9173i f26178j;

        /* renamed from: k */
        private Handler f26179k;

        /* renamed from: l */
        private Error f26180l;

        /* renamed from: m */
        private RuntimeException f26181m;

        /* renamed from: n */
        private C10067d f26182n;

        public HandlerThreadC10069b() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: b */
        private void m12425b(int i) {
            boolean z;
            C9149a.m16448e(this.f26178j);
            this.f26178j.m16376h(i);
            SurfaceTexture m16377g = this.f26178j.m16377g();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f26182n = new C10067d(this, m16377g, z);
        }

        /* renamed from: d */
        private void m12423d() {
            C9149a.m16448e(this.f26178j);
            this.f26178j.m16375i();
        }

        /* renamed from: a */
        public C10067d m12426a(int i) {
            boolean z;
            start();
            this.f26179k = new Handler(getLooper(), this);
            this.f26178j = new RunnableC9173i(this.f26179k);
            synchronized (this) {
                z = false;
                this.f26179k.obtainMessage(1, i, 0).sendToTarget();
                while (this.f26182n == null && this.f26181m == null && this.f26180l == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f26181m;
            if (runtimeException == null) {
                Error error = this.f26180l;
                if (error == null) {
                    return (C10067d) C9149a.m16448e(this.f26182n);
                }
                throw error;
            }
            throw runtimeException;
        }

        /* renamed from: c */
        public void m12424c() {
            C9149a.m16448e(this.f26179k);
            this.f26179k.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        m12423d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m12425b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    C9197r.m16182d("DummySurface", "Failed to initialize dummy surface", e);
                    this.f26180l = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    C9197r.m16182d("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f26181m = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m12429a(Context context) {
        if (C9182l.m16349h(context)) {
            if (C9182l.m16348i()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: b */
    public static synchronized boolean m12428b(Context context) {
        boolean z;
        synchronized (C10067d.class) {
            z = true;
            if (!f26174n) {
                f26173m = m12429a(context);
                f26174n = true;
            }
            if (f26173m == 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    public static C10067d m12427d(Context context, boolean z) {
        boolean z2;
        int i = 0;
        if (z && !m12428b(context)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C9149a.m16447f(z2);
        HandlerThreadC10069b handlerThreadC10069b = new HandlerThreadC10069b();
        if (z) {
            i = f26173m;
        }
        return handlerThreadC10069b.m12426a(i);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f26176k) {
            if (!this.f26177l) {
                this.f26176k.m12424c();
                this.f26177l = true;
            }
        }
    }

    private C10067d(HandlerThreadC10069b handlerThreadC10069b, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f26176k = handlerThreadC10069b;
        this.f26175j = z;
    }
}
