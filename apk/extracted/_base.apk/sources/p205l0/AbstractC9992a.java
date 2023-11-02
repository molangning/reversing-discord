package p205l0;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.util.C1140h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: l0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC9992a<D> extends C9994b<D> {

    /* renamed from: i */
    private final Executor f25914i;

    /* renamed from: j */
    volatile AbstractC9992a<D>.RunnableC9993a f25915j;

    /* renamed from: k */
    volatile AbstractC9992a<D>.RunnableC9993a f25916k;

    /* renamed from: l */
    long f25917l;

    /* renamed from: m */
    long f25918m;

    /* renamed from: n */
    Handler f25919n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class RunnableC9993a extends AbstractC9996c<Void, Void, D> implements Runnable {

        /* renamed from: t */
        private final CountDownLatch f25920t = new CountDownLatch(1);

        /* renamed from: u */
        boolean f25921u;

        RunnableC9993a() {
        }

        @Override // p205l0.AbstractC9996c
        /* renamed from: h */
        protected void mo12629h(D d) {
            try {
                AbstractC9992a.this.m12662x(this, d);
            } finally {
                this.f25920t.countDown();
            }
        }

        @Override // p205l0.AbstractC9996c
        /* renamed from: i */
        protected void mo12628i(D d) {
            try {
                AbstractC9992a.this.m12661y(this, d);
            } finally {
                this.f25920t.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p205l0.AbstractC9996c
        /* renamed from: n */
        public D mo12635b(Void... voidArr) {
            return (D) AbstractC9992a.this.m12664C();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25921u = false;
            AbstractC9992a.this.m12660z();
        }
    }

    public AbstractC9992a(Context context) {
        this(context, AbstractC9996c.f25933q);
    }

    /* renamed from: A */
    public abstract D mo3092A();

    /* renamed from: B */
    public void m12665B(D d) {
    }

    /* renamed from: C */
    protected D m12664C() {
        return mo3092A();
    }

    @Override // p205l0.C9994b
    @Deprecated
    /* renamed from: g */
    public void mo12652g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo12652g(str, fileDescriptor, printWriter, strArr);
        if (this.f25915j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f25915j);
            printWriter.print(" waiting=");
            printWriter.println(this.f25915j.f25921u);
        }
        if (this.f25916k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f25916k);
            printWriter.print(" waiting=");
            printWriter.println(this.f25916k.f25921u);
        }
        if (this.f25917l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C1140h.m37818c(this.f25917l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C1140h.m37819b(this.f25918m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p205l0.C9994b
    /* renamed from: k */
    protected boolean mo12648k() {
        if (this.f25915j == null) {
            return false;
        }
        if (!this.f25926d) {
            this.f25929g = true;
        }
        if (this.f25916k != null) {
            if (this.f25915j.f25921u) {
                this.f25915j.f25921u = false;
                this.f25919n.removeCallbacks(this.f25915j);
            }
            this.f25915j = null;
            return false;
        } else if (this.f25915j.f25921u) {
            this.f25915j.f25921u = false;
            this.f25919n.removeCallbacks(this.f25915j);
            this.f25915j = null;
            return false;
        } else {
            boolean m12636a = this.f25915j.m12636a(false);
            if (m12636a) {
                this.f25916k = this.f25915j;
                m12663w();
            }
            this.f25915j = null;
            return m12636a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p205l0.C9994b
    /* renamed from: m */
    public void mo12646m() {
        super.mo12646m();
        m12657b();
        this.f25915j = new RunnableC9993a();
        m12660z();
    }

    /* renamed from: w */
    public void m12663w() {
    }

    /* renamed from: x */
    void m12662x(AbstractC9992a<D>.RunnableC9993a runnableC9993a, D d) {
        m12665B(d);
        if (this.f25916k == runnableC9993a) {
            m12641s();
            this.f25918m = SystemClock.uptimeMillis();
            this.f25916k = null;
            m12654e();
            m12660z();
        }
    }

    /* renamed from: y */
    void m12661y(AbstractC9992a<D>.RunnableC9993a runnableC9993a, D d) {
        if (this.f25915j != runnableC9993a) {
            m12662x(runnableC9993a, d);
        } else if (m12650i()) {
            m12665B(d);
        } else {
            m12656c();
            this.f25918m = SystemClock.uptimeMillis();
            this.f25915j = null;
            m12653f(d);
        }
    }

    /* renamed from: z */
    void m12660z() {
        if (this.f25916k == null && this.f25915j != null) {
            if (this.f25915j.f25921u) {
                this.f25915j.f25921u = false;
                this.f25919n.removeCallbacks(this.f25915j);
            }
            if (this.f25917l > 0 && SystemClock.uptimeMillis() < this.f25918m + this.f25917l) {
                this.f25915j.f25921u = true;
                this.f25919n.postAtTime(this.f25915j, this.f25918m + this.f25917l);
                return;
            }
            this.f25915j.m12634c(this.f25914i, null);
        }
    }

    private AbstractC9992a(Context context, Executor executor) {
        super(context);
        this.f25918m = -10000L;
        this.f25914i = executor;
    }
}
