package p180jf;

import bf.C2277c;
import bf.InterfaceC2276b;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import nf.C10859a;
import p085ef.EnumC6215c;
import p106ff.C6421b;
import ye.AbstractC14015g;

/* renamed from: jf.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8932i extends AbstractC14015g {

    /* renamed from: b */
    private static final C8932i f23372b = new C8932i();

    /* renamed from: jf.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class RunnableC8933a implements Runnable {

        /* renamed from: j */
        private final Runnable f23373j;

        /* renamed from: k */
        private final C8935c f23374k;

        /* renamed from: l */
        private final long f23375l;

        RunnableC8933a(Runnable runnable, C8935c c8935c, long j) {
            this.f23373j = runnable;
            this.f23374k = c8935c;
            this.f23375l = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f23374k.f23383m) {
                long m902a = this.f23374k.m902a(TimeUnit.MILLISECONDS);
                long j = this.f23375l;
                if (j > m902a) {
                    try {
                        Thread.sleep(j - m902a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C10859a.m9887j(e);
                        return;
                    }
                }
                if (!this.f23374k.f23383m) {
                    this.f23373j.run();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jf.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8934b implements Comparable<C8934b> {

        /* renamed from: j */
        final Runnable f23376j;

        /* renamed from: k */
        final long f23377k;

        /* renamed from: l */
        final int f23378l;

        /* renamed from: m */
        volatile boolean f23379m;

        C8934b(Runnable runnable, Long l, int i) {
            this.f23376j = runnable;
            this.f23377k = l.longValue();
            this.f23378l = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C8934b c8934b) {
            int m22785b = C6421b.m22785b(this.f23377k, c8934b.f23377k);
            if (m22785b == 0) {
                return C6421b.m22786a(this.f23378l, c8934b.f23378l);
            }
            return m22785b;
        }
    }

    /* renamed from: jf.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C8935c extends AbstractC14015g.AbstractC14016a {

        /* renamed from: j */
        final PriorityBlockingQueue<C8934b> f23380j = new PriorityBlockingQueue<>();

        /* renamed from: k */
        private final AtomicInteger f23381k = new AtomicInteger();

        /* renamed from: l */
        final AtomicInteger f23382l = new AtomicInteger();

        /* renamed from: m */
        volatile boolean f23383m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: jf.i$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public final class RunnableC8936a implements Runnable {

            /* renamed from: j */
            final C8934b f23384j;

            RunnableC8936a(C8934b c8934b) {
                this.f23384j = c8934b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23384j.f23379m = true;
                C8935c.this.f23380j.remove(this.f23384j);
            }
        }

        C8935c() {
        }

        @Override // bf.InterfaceC2276b
        /* renamed from: b */
        public boolean mo16034b() {
            return this.f23383m;
        }

        @Override // ye.AbstractC14015g.AbstractC14016a
        /* renamed from: c */
        public InterfaceC2276b mo901c(Runnable runnable) {
            return m17027e(runnable, m902a(TimeUnit.MILLISECONDS));
        }

        @Override // ye.AbstractC14015g.AbstractC14016a
        /* renamed from: d */
        public InterfaceC2276b mo900d(Runnable runnable, long j, TimeUnit timeUnit) {
            long m902a = m902a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m17027e(new RunnableC8933a(runnable, this, m902a), m902a);
        }

        @Override // bf.InterfaceC2276b
        public void dispose() {
            this.f23383m = true;
        }

        /* renamed from: e */
        InterfaceC2276b m17027e(Runnable runnable, long j) {
            if (this.f23383m) {
                return EnumC6215c.INSTANCE;
            }
            C8934b c8934b = new C8934b(runnable, Long.valueOf(j), this.f23382l.incrementAndGet());
            this.f23380j.add(c8934b);
            if (this.f23381k.getAndIncrement() == 0) {
                int i = 1;
                while (!this.f23383m) {
                    C8934b poll = this.f23380j.poll();
                    if (poll == null) {
                        i = this.f23381k.addAndGet(-i);
                        if (i == 0) {
                            return EnumC6215c.INSTANCE;
                        }
                    } else if (!poll.f23379m) {
                        poll.f23376j.run();
                    }
                }
                this.f23380j.clear();
                return EnumC6215c.INSTANCE;
            }
            return C2277c.m33683b(new RunnableC8936a(c8934b));
        }
    }

    C8932i() {
    }

    /* renamed from: b */
    public static C8932i m17029b() {
        return f23372b;
    }

    @Override // ye.AbstractC14015g
    /* renamed from: a */
    public AbstractC14015g.AbstractC14016a mo903a() {
        return new C8935c();
    }
}
