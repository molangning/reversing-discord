package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p380v4.C13065e;
import p396w4.C13388a;

/* renamed from: com.facebook.imagepipeline.producers.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3859y {

    /* renamed from: a */
    private final Executor f10843a;

    /* renamed from: b */
    private final InterfaceC3863d f10844b;

    /* renamed from: e */
    private final int f10847e;

    /* renamed from: c */
    private final Runnable f10845c = new RunnableC3860a();

    /* renamed from: d */
    private final Runnable f10846d = new RunnableC3861b();

    /* renamed from: f */
    C13065e f10848f = null;

    /* renamed from: g */
    int f10849g = 0;

    /* renamed from: h */
    EnumC3865f f10850h = EnumC3865f.IDLE;

    /* renamed from: i */
    long f10851i = 0;

    /* renamed from: j */
    long f10852j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC3860a implements Runnable {
        RunnableC3860a() {
            C3859y.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3859y.this.m30620d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.y$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC3861b implements Runnable {
        RunnableC3861b() {
            C3859y.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3859y.this.m30614j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.y$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C3862c {

        /* renamed from: a */
        static final /* synthetic */ int[] f10855a;

        static {
            int[] iArr = new int[EnumC3865f.values().length];
            f10855a = iArr;
            try {
                iArr[EnumC3865f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10855a[EnumC3865f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10855a[EnumC3865f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10855a[EnumC3865f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.y$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC3863d {
        /* renamed from: a */
        void mo30612a(C13065e c13065e, int i);
    }

    /* renamed from: com.facebook.imagepipeline.producers.y$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3864e {

        /* renamed from: a */
        private static ScheduledExecutorService f10856a;

        /* renamed from: a */
        static ScheduledExecutorService m30611a() {
            if (f10856a == null) {
                f10856a = Executors.newSingleThreadScheduledExecutor();
            }
            return f10856a;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.y$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3865f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public C3859y(Executor executor, InterfaceC3863d interfaceC3863d, int i) {
        this.f10843a = executor;
        this.f10844b = interfaceC3863d;
        this.f10847e = i;
    }

    /* renamed from: d */
    public void m30620d() {
        C13065e c13065e;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            c13065e = this.f10848f;
            i = this.f10849g;
            this.f10848f = null;
            this.f10849g = 0;
            this.f10850h = EnumC3865f.RUNNING;
            this.f10852j = uptimeMillis;
        }
        try {
            if (m30615i(c13065e, i)) {
                this.f10844b.mo30612a(c13065e, i);
            }
        } finally {
            C13065e.m3335i(c13065e);
            m30617g();
        }
    }

    /* renamed from: e */
    private void m30619e(long j) {
        Runnable m2663a = C13388a.m2663a(this.f10846d, "JobScheduler_enqueueJob");
        if (j > 0) {
            C3864e.m30611a().schedule(m2663a, j, TimeUnit.MILLISECONDS);
        } else {
            m2663a.run();
        }
    }

    /* renamed from: g */
    private void m30617g() {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f10850h == EnumC3865f.RUNNING_AND_PENDING) {
                j = Math.max(this.f10852j + this.f10847e, uptimeMillis);
                this.f10851i = uptimeMillis;
                this.f10850h = EnumC3865f.QUEUED;
                z = true;
            } else {
                this.f10850h = EnumC3865f.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            m30619e(j - uptimeMillis);
        }
    }

    /* renamed from: i */
    private static boolean m30615i(C13065e c13065e, int i) {
        if (!AbstractC3761b.m30889d(i) && !AbstractC3761b.m30884m(i, 4) && !C13065e.m3333j0(c13065e)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void m30614j() {
        this.f10843a.execute(C13388a.m2663a(this.f10845c, "JobScheduler_submitJob"));
    }

    /* renamed from: c */
    public void m30621c() {
        C13065e c13065e;
        synchronized (this) {
            c13065e = this.f10848f;
            this.f10848f = null;
            this.f10849g = 0;
        }
        C13065e.m3335i(c13065e);
    }

    /* renamed from: f */
    public synchronized long m30618f() {
        return this.f10852j - this.f10851i;
    }

    /* renamed from: h */
    public boolean m30616h() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z = false;
            if (!m30615i(this.f10848f, this.f10849g)) {
                return false;
            }
            int i = C3862c.f10855a[this.f10850h.ordinal()];
            if (i != 1) {
                if (i == 3) {
                    this.f10850h = EnumC3865f.RUNNING_AND_PENDING;
                }
                max = 0;
            } else {
                max = Math.max(this.f10852j + this.f10847e, uptimeMillis);
                this.f10851i = uptimeMillis;
                this.f10850h = EnumC3865f.QUEUED;
                z = true;
            }
            if (z) {
                m30619e(max - uptimeMillis);
            }
            return true;
        }
    }

    /* renamed from: k */
    public boolean m30613k(C13065e c13065e, int i) {
        C13065e c13065e2;
        if (!m30615i(c13065e, i)) {
            return false;
        }
        synchronized (this) {
            c13065e2 = this.f10848f;
            this.f10848f = C13065e.m3336h(c13065e);
            this.f10849g = i;
        }
        C13065e.m3335i(c13065e2);
        return true;
    }
}