package p139hf;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lk.InterfaceC10219a;
import lk.InterfaceC10220b;
import lk.InterfaceC10221c;
import p217lf.EnumC10143e;
import p233mf.C10448b;
import ye.AbstractC14010b;
import ye.AbstractC14015g;
import ye.InterfaceC14013e;

/* renamed from: hf.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7125l<T> extends AbstractC7095a<T, T> {

    /* renamed from: l */
    final AbstractC14015g f19479l;

    /* renamed from: m */
    final boolean f19480m;

    /* renamed from: hf.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class RunnableC7126a<T> extends AtomicReference<Thread> implements InterfaceC14013e<T>, InterfaceC10221c, Runnable {

        /* renamed from: j */
        final InterfaceC10220b<? super T> f19481j;

        /* renamed from: k */
        final AbstractC14015g.AbstractC14016a f19482k;

        /* renamed from: l */
        final AtomicReference<InterfaceC10221c> f19483l = new AtomicReference<>();

        /* renamed from: m */
        final AtomicLong f19484m = new AtomicLong();

        /* renamed from: n */
        final boolean f19485n;

        /* renamed from: o */
        InterfaceC10219a<T> f19486o;

        /* renamed from: hf.l$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class RunnableC7127a implements Runnable {

            /* renamed from: j */
            final InterfaceC10221c f19487j;

            /* renamed from: k */
            final long f19488k;

            RunnableC7127a(InterfaceC10221c interfaceC10221c, long j) {
                this.f19487j = interfaceC10221c;
                this.f19488k = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19487j.mo12120g(this.f19488k);
            }
        }

        RunnableC7126a(InterfaceC10220b<? super T> interfaceC10220b, AbstractC14015g.AbstractC14016a abstractC14016a, InterfaceC10219a<T> interfaceC10219a, boolean z) {
            this.f19481j = interfaceC10220b;
            this.f19482k = abstractC14016a;
            this.f19486o = interfaceC10219a;
            this.f19485n = !z;
        }

        @Override // ye.InterfaceC14013e, lk.InterfaceC10220b
        /* renamed from: a */
        public void mo905a(InterfaceC10221c interfaceC10221c) {
            if (EnumC10143e.m12179e(this.f19483l, interfaceC10221c)) {
                long andSet = this.f19484m.getAndSet(0L);
                if (andSet != 0) {
                    m21387b(andSet, interfaceC10221c);
                }
            }
        }

        /* renamed from: b */
        void m21387b(long j, InterfaceC10221c interfaceC10221c) {
            if (!this.f19485n && Thread.currentThread() != get()) {
                this.f19482k.mo901c(new RunnableC7127a(interfaceC10221c, j));
            } else {
                interfaceC10221c.mo12120g(j);
            }
        }

        @Override // lk.InterfaceC10221c
        public void cancel() {
            EnumC10143e.m12183a(this.f19483l);
            this.f19482k.dispose();
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: d */
        public void mo12122d() {
            this.f19481j.mo12122d();
            this.f19482k.dispose();
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: f */
        public void mo12121f(T t) {
            this.f19481j.mo12121f(t);
        }

        @Override // lk.InterfaceC10221c
        /* renamed from: g */
        public void mo12120g(long j) {
            if (EnumC10143e.m12178f(j)) {
                InterfaceC10221c interfaceC10221c = this.f19483l.get();
                if (interfaceC10221c != null) {
                    m21387b(j, interfaceC10221c);
                    return;
                }
                C10448b.m11528a(this.f19484m, j);
                InterfaceC10221c interfaceC10221c2 = this.f19483l.get();
                if (interfaceC10221c2 != null) {
                    long andSet = this.f19484m.getAndSet(0L);
                    if (andSet != 0) {
                        m21387b(andSet, interfaceC10221c2);
                    }
                }
            }
        }

        @Override // lk.InterfaceC10220b
        public void onError(Throwable th2) {
            this.f19481j.onError(th2);
            this.f19482k.dispose();
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            InterfaceC10219a<T> interfaceC10219a = this.f19486o;
            this.f19486o = null;
            interfaceC10219a.mo928a(this);
        }
    }

    public C7125l(AbstractC14010b<T> abstractC14010b, AbstractC14015g abstractC14015g, boolean z) {
        super(abstractC14010b);
        this.f19479l = abstractC14015g;
        this.f19480m = z;
    }

    @Override // ye.AbstractC14010b
    /* renamed from: t */
    public void mo909t(InterfaceC10220b<? super T> interfaceC10220b) {
        AbstractC14015g.AbstractC14016a mo903a = this.f19479l.mo903a();
        RunnableC7126a runnableC7126a = new RunnableC7126a(interfaceC10220b, mo903a, this.f19391k, this.f19480m);
        interfaceC10220b.mo905a(runnableC7126a);
        mo903a.mo901c(runnableC7126a);
    }
}