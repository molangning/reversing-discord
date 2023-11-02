package p054d1;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p021b1.C2055l;

/* renamed from: d1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C5722d implements InterfaceC5732h {

    /* renamed from: a */
    private final List<Runnable> f16482a = new ArrayList();

    /* renamed from: b */
    private boolean f16483b = false;

    /* renamed from: c */
    private boolean f16484c = false;

    /* renamed from: d */
    private ThreadPoolExecutor f16485d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d1.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RejectedExecutionHandlerC5723a implements RejectedExecutionHandler {

        /* renamed from: a */
        final /* synthetic */ String f16486a;

        RejectedExecutionHandlerC5723a(String str) {
            C5722d.this = r1;
            this.f16486a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C2055l.m34422j().mo34445a("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f16486a);
        }
    }

    /* renamed from: d1.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC5724b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ long f16488j;

        /* renamed from: k */
        final /* synthetic */ Runnable f16489k;

        RunnableC5724b(long j, Runnable runnable) {
            C5722d.this = r1;
            this.f16488j = j;
            this.f16489k = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(this.f16488j);
            } catch (InterruptedException e) {
                C2055l.m34422j().mo34445a("Sleep delay exception: %s", e.getMessage());
            }
            C5722d.this.submit(this.f16489k);
        }
    }

    /* renamed from: d1.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC5725c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Runnable f16491j;

        RunnableC5725c(Runnable runnable) {
            C5722d.this = r1;
            this.f16491j = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable;
            C5722d.this.m24615h(this.f16491j);
            while (true) {
                synchronized (C5722d.this.f16482a) {
                    if (C5722d.this.f16484c) {
                        return;
                    }
                    if (C5722d.this.f16482a.isEmpty()) {
                        C5722d.this.f16483b = false;
                        return;
                    } else {
                        runnable = (Runnable) C5722d.this.f16482a.get(0);
                        C5722d.this.f16482a.remove(0);
                    }
                }
                C5722d.this.m24615h(runnable);
            }
        }
    }

    public C5722d(String str) {
        this.f16485d = new ThreadPoolExecutor(0, ViewDefaults.NUMBER_OF_LINES, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC5730g(str), new RejectedExecutionHandlerC5723a(str));
    }

    /* renamed from: g */
    private void m24616g(Runnable runnable) {
        this.f16485d.submit(new RunnableC5725c(runnable));
    }

    /* renamed from: h */
    public void m24615h(Runnable runnable) {
        try {
            if (this.f16484c) {
                return;
            }
            runnable.run();
        } catch (Throwable th2) {
            C2055l.m34422j().mo34445a("Execution failed: %s", th2.getMessage());
        }
    }

    @Override // p054d1.InterfaceC5729f
    /* renamed from: a */
    public void mo24610a() {
        synchronized (this.f16482a) {
            this.f16484c = true;
            this.f16482a.clear();
            this.f16485d.shutdown();
        }
    }

    @Override // p054d1.InterfaceC5732h
    /* renamed from: b */
    public void mo24609b(Runnable runnable, long j) {
        synchronized (this.f16482a) {
            if (this.f16484c) {
                return;
            }
            this.f16485d.submit(new RunnableC5724b(j, runnable));
        }
    }

    @Override // p054d1.InterfaceC5729f
    public void submit(Runnable runnable) {
        synchronized (this.f16482a) {
            if (this.f16484c) {
                return;
            }
            if (!this.f16483b) {
                this.f16483b = true;
                m24616g(runnable);
            } else {
                this.f16482a.add(runnable);
            }
        }
    }
}