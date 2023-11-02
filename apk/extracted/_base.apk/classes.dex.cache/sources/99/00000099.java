package af;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import bf.C2277c;
import bf.InterfaceC2276b;
import java.util.concurrent.TimeUnit;
import nf.C10859a;
import ye.AbstractC14015g;

/* renamed from: af.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C0153b extends AbstractC14015g {

    /* renamed from: b */
    private final Handler f555b;

    /* renamed from: c */
    private final boolean f556c;

    /* renamed from: af.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C0154a extends AbstractC14015g.AbstractC14016a {

        /* renamed from: j */
        private final Handler f557j;

        /* renamed from: k */
        private final boolean f558k;

        /* renamed from: l */
        private volatile boolean f559l;

        C0154a(Handler handler, boolean z) {
            this.f557j = handler;
            this.f558k = z;
        }

        @Override // bf.InterfaceC2276b
        /* renamed from: b */
        public boolean mo16034b() {
            return this.f559l;
        }

        @Override // ye.AbstractC14015g.AbstractC14016a
        @SuppressLint({"NewApi"})
        /* renamed from: d */
        public InterfaceC2276b mo900d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable != null) {
                if (timeUnit != null) {
                    if (this.f559l) {
                        return C2277c.m33684a();
                    }
                    RunnableC0155b runnableC0155b = new RunnableC0155b(this.f557j, C10859a.m9885l(runnable));
                    Message obtain = Message.obtain(this.f557j, runnableC0155b);
                    obtain.obj = this;
                    if (this.f558k) {
                        obtain.setAsynchronous(true);
                    }
                    this.f557j.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                    if (this.f559l) {
                        this.f557j.removeCallbacks(runnableC0155b);
                        return C2277c.m33684a();
                    }
                    return runnableC0155b;
                }
                throw new NullPointerException("unit == null");
            }
            throw new NullPointerException("run == null");
        }

        @Override // bf.InterfaceC2276b
        public void dispose() {
            this.f559l = true;
            this.f557j.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: af.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class RunnableC0155b implements Runnable, InterfaceC2276b {

        /* renamed from: j */
        private final Handler f560j;

        /* renamed from: k */
        private final Runnable f561k;

        /* renamed from: l */
        private volatile boolean f562l;

        RunnableC0155b(Handler handler, Runnable runnable) {
            this.f560j = handler;
            this.f561k = runnable;
        }

        @Override // bf.InterfaceC2276b
        /* renamed from: b */
        public boolean mo16034b() {
            return this.f562l;
        }

        @Override // bf.InterfaceC2276b
        public void dispose() {
            this.f560j.removeCallbacks(this);
            this.f562l = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f561k.run();
            } catch (Throwable th2) {
                C10859a.m9887j(th2);
            }
        }
    }

    public C0153b(Handler handler, boolean z) {
        this.f555b = handler;
        this.f556c = z;
    }

    @Override // ye.AbstractC14015g
    /* renamed from: a */
    public AbstractC14015g.AbstractC14016a mo903a() {
        return new C0154a(this.f555b, this.f556c);
    }
}