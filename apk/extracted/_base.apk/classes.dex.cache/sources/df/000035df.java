package p139hf;

import cf.C2528b;
import cf.C2529c;
import gf.InterfaceC6740a;
import gf.InterfaceC6742c;
import gf.InterfaceC6745f;
import java.util.concurrent.atomic.AtomicLong;
import lk.InterfaceC10220b;
import lk.InterfaceC10221c;
import nf.C10859a;
import p158if.C7507a;
import p217lf.AbstractC10139a;
import p217lf.EnumC10143e;
import p233mf.C10448b;
import ye.AbstractC14010b;
import ye.AbstractC14015g;
import ye.InterfaceC14013e;

/* renamed from: hf.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7119j<T> extends AbstractC7095a<T, T> {

    /* renamed from: l */
    final AbstractC14015g f19458l;

    /* renamed from: m */
    final boolean f19459m;

    /* renamed from: n */
    final int f19460n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractRunnableC7120a<T> extends AbstractC10139a<T> implements InterfaceC14013e<T>, Runnable {

        /* renamed from: j */
        final AbstractC14015g.AbstractC14016a f19461j;

        /* renamed from: k */
        final boolean f19462k;

        /* renamed from: l */
        final int f19463l;

        /* renamed from: m */
        final int f19464m;

        /* renamed from: n */
        final AtomicLong f19465n = new AtomicLong();

        /* renamed from: o */
        InterfaceC10221c f19466o;

        /* renamed from: p */
        InterfaceC6745f<T> f19467p;

        /* renamed from: q */
        volatile boolean f19468q;

        /* renamed from: r */
        volatile boolean f19469r;

        /* renamed from: s */
        Throwable f19470s;

        /* renamed from: t */
        int f19471t;

        /* renamed from: u */
        long f19472u;

        /* renamed from: v */
        boolean f19473v;

        AbstractRunnableC7120a(AbstractC14015g.AbstractC14016a abstractC14016a, boolean z, int i) {
            this.f19461j = abstractC14016a;
            this.f19462k = z;
            this.f19463l = i;
            this.f19464m = i - (i >> 2);
        }

        /* renamed from: b */
        final boolean m21394b(boolean z, boolean z2, InterfaceC10220b<?> interfaceC10220b) {
            if (this.f19468q) {
                clear();
                return true;
            } else if (z) {
                if (this.f19462k) {
                    if (z2) {
                        this.f19468q = true;
                        Throwable th2 = this.f19470s;
                        if (th2 != null) {
                            interfaceC10220b.onError(th2);
                        } else {
                            interfaceC10220b.mo12122d();
                        }
                        this.f19461j.dispose();
                        return true;
                    }
                    return false;
                }
                Throwable th3 = this.f19470s;
                if (th3 != null) {
                    this.f19468q = true;
                    clear();
                    interfaceC10220b.onError(th3);
                    this.f19461j.dispose();
                    return true;
                } else if (z2) {
                    this.f19468q = true;
                    interfaceC10220b.mo12122d();
                    this.f19461j.dispose();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // gf.InterfaceC6741b
        /* renamed from: c */
        public final int mo12184c(int i) {
            if ((i & 2) != 0) {
                this.f19473v = true;
                return 2;
            }
            return 0;
        }

        @Override // lk.InterfaceC10221c
        public final void cancel() {
            if (this.f19468q) {
                return;
            }
            this.f19468q = true;
            this.f19466o.cancel();
            this.f19461j.dispose();
            if (!this.f19473v && getAndIncrement() == 0) {
                this.f19467p.clear();
            }
        }

        @Override // gf.InterfaceC6745f
        public final void clear() {
            this.f19467p.clear();
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: d */
        public final void mo12122d() {
            if (!this.f19469r) {
                this.f19469r = true;
                m21393k();
            }
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: f */
        public final void mo12121f(T t) {
            if (this.f19469r) {
                return;
            }
            if (this.f19471t == 2) {
                m21393k();
                return;
            }
            if (!this.f19467p.offer(t)) {
                this.f19466o.cancel();
                this.f19470s = new C2529c("Queue is full?!");
                this.f19469r = true;
            }
            m21393k();
        }

        @Override // lk.InterfaceC10221c
        /* renamed from: g */
        public final void mo12120g(long j) {
            if (EnumC10143e.m12178f(j)) {
                C10448b.m11528a(this.f19465n, j);
                m21393k();
            }
        }

        /* renamed from: h */
        abstract void mo21392h();

        /* renamed from: i */
        abstract void mo21391i();

        @Override // gf.InterfaceC6745f
        public final boolean isEmpty() {
            return this.f19467p.isEmpty();
        }

        /* renamed from: j */
        abstract void mo21390j();

        /* renamed from: k */
        final void m21393k() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f19461j.mo901c(this);
        }

        @Override // lk.InterfaceC10220b
        public final void onError(Throwable th2) {
            if (this.f19469r) {
                C10859a.m9887j(th2);
                return;
            }
            this.f19470s = th2;
            this.f19469r = true;
            m21393k();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f19473v) {
                mo21391i();
            } else if (this.f19471t == 1) {
                mo21390j();
            } else {
                mo21392h();
            }
        }
    }

    /* renamed from: hf.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7121b<T> extends AbstractRunnableC7120a<T> {

        /* renamed from: w */
        final InterfaceC6740a<? super T> f19474w;

        /* renamed from: x */
        long f19475x;

        C7121b(InterfaceC6740a<? super T> interfaceC6740a, AbstractC14015g.AbstractC14016a abstractC14016a, boolean z, int i) {
            super(abstractC14016a, z, i);
            this.f19474w = interfaceC6740a;
        }

        @Override // ye.InterfaceC14013e, lk.InterfaceC10220b
        /* renamed from: a */
        public void mo905a(InterfaceC10221c interfaceC10221c) {
            if (EnumC10143e.m12177h(this.f19466o, interfaceC10221c)) {
                this.f19466o = interfaceC10221c;
                if (interfaceC10221c instanceof InterfaceC6742c) {
                    InterfaceC6742c interfaceC6742c = (InterfaceC6742c) interfaceC10221c;
                    int mo12184c = interfaceC6742c.mo12184c(7);
                    if (mo12184c == 1) {
                        this.f19471t = 1;
                        this.f19467p = interfaceC6742c;
                        this.f19469r = true;
                        this.f19474w.mo905a(this);
                        return;
                    } else if (mo12184c == 2) {
                        this.f19471t = 2;
                        this.f19467p = interfaceC6742c;
                        this.f19474w.mo905a(this);
                        interfaceC10221c.mo12120g(this.f19463l);
                        return;
                    }
                }
                this.f19467p = new C7507a(this.f19463l);
                this.f19474w.mo905a(this);
                interfaceC10221c.mo12120g(this.f19463l);
            }
        }

        @Override // p139hf.C7119j.AbstractRunnableC7120a
        /* renamed from: h */
        void mo21392h() {
            int i;
            boolean z;
            InterfaceC6740a<? super T> interfaceC6740a = this.f19474w;
            InterfaceC6745f<T> interfaceC6745f = this.f19467p;
            long j = this.f19472u;
            long j2 = this.f19475x;
            int i2 = 1;
            while (true) {
                long j3 = this.f19465n.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f19469r;
                    try {
                        Object obj = (T) interfaceC6745f.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m21394b(z2, z, interfaceC6740a)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        if (interfaceC6740a.mo21413e(obj)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f19464m) {
                            this.f19466o.mo12120g(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th2) {
                        C2528b.m33061b(th2);
                        this.f19468q = true;
                        this.f19466o.cancel();
                        interfaceC6745f.clear();
                        interfaceC6740a.onError(th2);
                        this.f19461j.dispose();
                        return;
                    }
                }
                if (i == 0 && m21394b(this.f19469r, interfaceC6745f.isEmpty(), interfaceC6740a)) {
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.f19472u = j;
                    this.f19475x = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // p139hf.C7119j.AbstractRunnableC7120a
        /* renamed from: i */
        void mo21391i() {
            int i = 1;
            while (!this.f19468q) {
                boolean z = this.f19469r;
                this.f19474w.mo12121f(null);
                if (z) {
                    this.f19468q = true;
                    Throwable th2 = this.f19470s;
                    if (th2 != null) {
                        this.f19474w.onError(th2);
                    } else {
                        this.f19474w.mo12122d();
                    }
                    this.f19461j.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // p139hf.C7119j.AbstractRunnableC7120a
        /* renamed from: j */
        void mo21390j() {
            InterfaceC6740a<? super T> interfaceC6740a = this.f19474w;
            InterfaceC6745f<T> interfaceC6745f = this.f19467p;
            long j = this.f19472u;
            int i = 1;
            while (true) {
                long j2 = this.f19465n.get();
                while (j != j2) {
                    try {
                        Object obj = (T) interfaceC6745f.poll();
                        if (this.f19468q) {
                            return;
                        }
                        if (obj == null) {
                            this.f19468q = true;
                            interfaceC6740a.mo12122d();
                            this.f19461j.dispose();
                            return;
                        } else if (interfaceC6740a.mo21413e(obj)) {
                            j++;
                        }
                    } catch (Throwable th2) {
                        C2528b.m33061b(th2);
                        this.f19468q = true;
                        this.f19466o.cancel();
                        interfaceC6740a.onError(th2);
                        this.f19461j.dispose();
                        return;
                    }
                }
                if (this.f19468q) {
                    return;
                }
                if (interfaceC6745f.isEmpty()) {
                    this.f19468q = true;
                    interfaceC6740a.mo12122d();
                    this.f19461j.dispose();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.f19472u = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // gf.InterfaceC6745f
        public T poll() {
            T poll = this.f19467p.poll();
            if (poll != null && this.f19471t != 1) {
                long j = this.f19475x + 1;
                if (j == this.f19464m) {
                    this.f19475x = 0L;
                    this.f19466o.mo12120g(j);
                } else {
                    this.f19475x = j;
                }
            }
            return poll;
        }
    }

    /* renamed from: hf.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7122c<T> extends AbstractRunnableC7120a<T> {

        /* renamed from: w */
        final InterfaceC10220b<? super T> f19476w;

        C7122c(InterfaceC10220b<? super T> interfaceC10220b, AbstractC14015g.AbstractC14016a abstractC14016a, boolean z, int i) {
            super(abstractC14016a, z, i);
            this.f19476w = interfaceC10220b;
        }

        @Override // ye.InterfaceC14013e, lk.InterfaceC10220b
        /* renamed from: a */
        public void mo905a(InterfaceC10221c interfaceC10221c) {
            if (EnumC10143e.m12177h(this.f19466o, interfaceC10221c)) {
                this.f19466o = interfaceC10221c;
                if (interfaceC10221c instanceof InterfaceC6742c) {
                    InterfaceC6742c interfaceC6742c = (InterfaceC6742c) interfaceC10221c;
                    int mo12184c = interfaceC6742c.mo12184c(7);
                    if (mo12184c == 1) {
                        this.f19471t = 1;
                        this.f19467p = interfaceC6742c;
                        this.f19469r = true;
                        this.f19476w.mo905a(this);
                        return;
                    } else if (mo12184c == 2) {
                        this.f19471t = 2;
                        this.f19467p = interfaceC6742c;
                        this.f19476w.mo905a(this);
                        interfaceC10221c.mo12120g(this.f19463l);
                        return;
                    }
                }
                this.f19467p = new C7507a(this.f19463l);
                this.f19476w.mo905a(this);
                interfaceC10221c.mo12120g(this.f19463l);
            }
        }

        @Override // p139hf.C7119j.AbstractRunnableC7120a
        /* renamed from: h */
        void mo21392h() {
            int i;
            boolean z;
            InterfaceC10220b<? super T> interfaceC10220b = this.f19476w;
            InterfaceC6745f<T> interfaceC6745f = this.f19467p;
            long j = this.f19472u;
            int i2 = 1;
            while (true) {
                long j2 = this.f19465n.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f19469r;
                    try {
                        Object obj = (T) interfaceC6745f.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m21394b(z2, z, interfaceC10220b)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        interfaceC10220b.mo12121f(obj);
                        j++;
                        if (j == this.f19464m) {
                            if (j2 != Long.MAX_VALUE) {
                                j2 = this.f19465n.addAndGet(-j);
                            }
                            this.f19466o.mo12120g(j);
                            j = 0;
                        }
                    } catch (Throwable th2) {
                        C2528b.m33061b(th2);
                        this.f19468q = true;
                        this.f19466o.cancel();
                        interfaceC6745f.clear();
                        interfaceC10220b.onError(th2);
                        this.f19461j.dispose();
                        return;
                    }
                }
                if (i == 0 && m21394b(this.f19469r, interfaceC6745f.isEmpty(), interfaceC10220b)) {
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.f19472u = j;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // p139hf.C7119j.AbstractRunnableC7120a
        /* renamed from: i */
        void mo21391i() {
            int i = 1;
            while (!this.f19468q) {
                boolean z = this.f19469r;
                this.f19476w.mo12121f(null);
                if (z) {
                    this.f19468q = true;
                    Throwable th2 = this.f19470s;
                    if (th2 != null) {
                        this.f19476w.onError(th2);
                    } else {
                        this.f19476w.mo12122d();
                    }
                    this.f19461j.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // p139hf.C7119j.AbstractRunnableC7120a
        /* renamed from: j */
        void mo21390j() {
            InterfaceC10220b<? super T> interfaceC10220b = this.f19476w;
            InterfaceC6745f<T> interfaceC6745f = this.f19467p;
            long j = this.f19472u;
            int i = 1;
            while (true) {
                long j2 = this.f19465n.get();
                while (j != j2) {
                    try {
                        Object obj = (T) interfaceC6745f.poll();
                        if (this.f19468q) {
                            return;
                        }
                        if (obj == null) {
                            this.f19468q = true;
                            interfaceC10220b.mo12122d();
                            this.f19461j.dispose();
                            return;
                        }
                        interfaceC10220b.mo12121f(obj);
                        j++;
                    } catch (Throwable th2) {
                        C2528b.m33061b(th2);
                        this.f19468q = true;
                        this.f19466o.cancel();
                        interfaceC10220b.onError(th2);
                        this.f19461j.dispose();
                        return;
                    }
                }
                if (this.f19468q) {
                    return;
                }
                if (interfaceC6745f.isEmpty()) {
                    this.f19468q = true;
                    interfaceC10220b.mo12122d();
                    this.f19461j.dispose();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.f19472u = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // gf.InterfaceC6745f
        public T poll() {
            T poll = this.f19467p.poll();
            if (poll != null && this.f19471t != 1) {
                long j = this.f19472u + 1;
                if (j == this.f19464m) {
                    this.f19472u = 0L;
                    this.f19466o.mo12120g(j);
                } else {
                    this.f19472u = j;
                }
            }
            return poll;
        }
    }

    public C7119j(AbstractC14010b<T> abstractC14010b, AbstractC14015g abstractC14015g, boolean z, int i) {
        super(abstractC14010b);
        this.f19458l = abstractC14015g;
        this.f19459m = z;
        this.f19460n = i;
    }

    @Override // ye.AbstractC14010b
    /* renamed from: t */
    public void mo909t(InterfaceC10220b<? super T> interfaceC10220b) {
        AbstractC14015g.AbstractC14016a mo903a = this.f19458l.mo903a();
        if (interfaceC10220b instanceof InterfaceC6740a) {
            this.f19391k.m910s(new C7121b((InterfaceC6740a) interfaceC10220b, mo903a, this.f19459m, this.f19460n));
        } else {
            this.f19391k.m910s(new C7122c(interfaceC10220b, mo903a, this.f19459m, this.f19460n));
        }
    }
}