package p139hf;

import androidx.lifecycle.C1696m;
import bf.InterfaceC2276b;
import cf.C2528b;
import cf.C2529c;
import gf.InterfaceC6742c;
import gf.InterfaceC6744e;
import gf.InterfaceC6745f;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lk.InterfaceC10219a;
import lk.InterfaceC10220b;
import lk.InterfaceC10221c;
import nf.C10859a;
import p067df.InterfaceC5833d;
import p106ff.C6421b;
import p158if.C7507a;
import p158if.C7508b;
import p217lf.EnumC10143e;
import p233mf.C10447a;
import p233mf.C10448b;
import p233mf.C10449c;
import ye.AbstractC14010b;
import ye.InterfaceC14013e;

/* renamed from: hf.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7109e<T, U> extends AbstractC7095a<T, U> {

    /* renamed from: l */
    final InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends U>> f19417l;

    /* renamed from: m */
    final boolean f19418m;

    /* renamed from: n */
    final int f19419n;

    /* renamed from: o */
    final int f19420o;

    /* renamed from: hf.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7110a<T, U> extends AtomicReference<InterfaceC10221c> implements InterfaceC14013e<U>, InterfaceC2276b {

        /* renamed from: j */
        final long f19421j;

        /* renamed from: k */
        final C7111b<T, U> f19422k;

        /* renamed from: l */
        final int f19423l;

        /* renamed from: m */
        final int f19424m;

        /* renamed from: n */
        volatile boolean f19425n;

        /* renamed from: o */
        volatile InterfaceC6745f<U> f19426o;

        /* renamed from: p */
        long f19427p;

        /* renamed from: q */
        int f19428q;

        C7110a(C7111b<T, U> c7111b, long j) {
            this.f19421j = j;
            this.f19422k = c7111b;
            int i = c7111b.f19435n;
            this.f19424m = i;
            this.f19423l = i >> 2;
        }

        @Override // ye.InterfaceC14013e, lk.InterfaceC10220b
        /* renamed from: a */
        public void mo905a(InterfaceC10221c interfaceC10221c) {
            if (EnumC10143e.m12179e(this, interfaceC10221c)) {
                if (interfaceC10221c instanceof InterfaceC6742c) {
                    InterfaceC6742c interfaceC6742c = (InterfaceC6742c) interfaceC10221c;
                    int mo12184c = interfaceC6742c.mo12184c(7);
                    if (mo12184c == 1) {
                        this.f19428q = mo12184c;
                        this.f19426o = interfaceC6742c;
                        this.f19425n = true;
                        this.f19422k.m21405j();
                        return;
                    } else if (mo12184c == 2) {
                        this.f19428q = mo12184c;
                        this.f19426o = interfaceC6742c;
                    }
                }
                interfaceC10221c.mo12120g(this.f19424m);
            }
        }

        @Override // bf.InterfaceC2276b
        /* renamed from: b */
        public boolean mo16034b() {
            return get() == EnumC10143e.CANCELLED;
        }

        /* renamed from: c */
        void m21410c(long j) {
            if (this.f19428q != 1) {
                long j2 = this.f19427p + j;
                if (j2 >= this.f19423l) {
                    this.f19427p = 0L;
                    get().mo12120g(j2);
                    return;
                }
                this.f19427p = j2;
            }
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: d */
        public void mo12122d() {
            this.f19425n = true;
            this.f19422k.m21405j();
        }

        @Override // bf.InterfaceC2276b
        public void dispose() {
            EnumC10143e.m12183a(this);
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: f */
        public void mo12121f(U u) {
            if (this.f19428q != 2) {
                this.f19422k.m21399p(u, this);
            } else {
                this.f19422k.m21405j();
            }
        }

        @Override // lk.InterfaceC10220b
        public void onError(Throwable th2) {
            lazySet(EnumC10143e.CANCELLED);
            this.f19422k.m21401n(this, th2);
        }
    }

    /* renamed from: hf.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7111b<T, U> extends AtomicInteger implements InterfaceC14013e<T>, InterfaceC10221c {

        /* renamed from: A */
        static final C7110a<?, ?>[] f19429A = new C7110a[0];

        /* renamed from: B */
        static final C7110a<?, ?>[] f19430B = new C7110a[0];

        /* renamed from: j */
        final InterfaceC10220b<? super U> f19431j;

        /* renamed from: k */
        final InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends U>> f19432k;

        /* renamed from: l */
        final boolean f19433l;

        /* renamed from: m */
        final int f19434m;

        /* renamed from: n */
        final int f19435n;

        /* renamed from: o */
        volatile InterfaceC6744e<U> f19436o;

        /* renamed from: p */
        volatile boolean f19437p;

        /* renamed from: q */
        final C10447a f19438q = new C10447a();

        /* renamed from: r */
        volatile boolean f19439r;

        /* renamed from: s */
        final AtomicReference<C7110a<?, ?>[]> f19440s;

        /* renamed from: t */
        final AtomicLong f19441t;

        /* renamed from: u */
        InterfaceC10221c f19442u;

        /* renamed from: v */
        long f19443v;

        /* renamed from: w */
        long f19444w;

        /* renamed from: x */
        int f19445x;

        /* renamed from: y */
        int f19446y;

        /* renamed from: z */
        final int f19447z;

        C7111b(InterfaceC10220b<? super U> interfaceC10220b, InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends U>> interfaceC5833d, boolean z, int i, int i2) {
            AtomicReference<C7110a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f19440s = atomicReference;
            this.f19441t = new AtomicLong();
            this.f19431j = interfaceC10220b;
            this.f19432k = interfaceC5833d;
            this.f19433l = z;
            this.f19434m = i;
            this.f19435n = i2;
            this.f19447z = Math.max(1, i >> 1);
            atomicReference.lazySet(f19429A);
        }

        @Override // ye.InterfaceC14013e, lk.InterfaceC10220b
        /* renamed from: a */
        public void mo905a(InterfaceC10221c interfaceC10221c) {
            if (EnumC10143e.m12177h(this.f19442u, interfaceC10221c)) {
                this.f19442u = interfaceC10221c;
                this.f19431j.mo905a(this);
                if (!this.f19439r) {
                    int i = this.f19434m;
                    if (i == Integer.MAX_VALUE) {
                        interfaceC10221c.mo12120g(Long.MAX_VALUE);
                    } else {
                        interfaceC10221c.mo12120g(i);
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m21409b(C7110a<T, U> c7110a) {
            C7110a<?, ?>[] c7110aArr;
            C7110a[] c7110aArr2;
            do {
                c7110aArr = this.f19440s.get();
                if (c7110aArr == f19430B) {
                    c7110a.dispose();
                    return false;
                }
                int length = c7110aArr.length;
                c7110aArr2 = new C7110a[length + 1];
                System.arraycopy(c7110aArr, 0, c7110aArr2, 0, length);
                c7110aArr2[length] = c7110a;
            } while (!C1696m.m36034a(this.f19440s, c7110aArr, c7110aArr2));
            return true;
        }

        /* renamed from: c */
        boolean m21408c() {
            if (this.f19439r) {
                m21407h();
                return true;
            } else if (!this.f19433l && this.f19438q.get() != null) {
                m21407h();
                Throwable m11529b = this.f19438q.m11529b();
                if (m11529b != C10449c.f27286a) {
                    this.f19431j.onError(m11529b);
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // lk.InterfaceC10221c
        public void cancel() {
            InterfaceC6744e<U> interfaceC6744e;
            if (!this.f19439r) {
                this.f19439r = true;
                this.f19442u.cancel();
                m21406i();
                if (getAndIncrement() == 0 && (interfaceC6744e = this.f19436o) != null) {
                    interfaceC6744e.clear();
                }
            }
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: d */
        public void mo12122d() {
            if (this.f19437p) {
                return;
            }
            this.f19437p = true;
            m21405j();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lk.InterfaceC10220b
        /* renamed from: f */
        public void mo12121f(T t) {
            if (this.f19437p) {
                return;
            }
            try {
                InterfaceC10219a interfaceC10219a = (InterfaceC10219a) C6421b.m22784c(this.f19432k.apply(t), "The mapper returned a null Publisher");
                if (interfaceC10219a instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC10219a).call();
                        if (call != null) {
                            m21398q(call);
                            return;
                        } else if (this.f19434m != Integer.MAX_VALUE && !this.f19439r) {
                            int i = this.f19446y + 1;
                            this.f19446y = i;
                            int i2 = this.f19447z;
                            if (i == i2) {
                                this.f19446y = 0;
                                this.f19442u.mo12120g(i2);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        C2528b.m33061b(th2);
                        this.f19438q.m11530a(th2);
                        m21405j();
                        return;
                    }
                }
                long j = this.f19443v;
                this.f19443v = 1 + j;
                C7110a c7110a = new C7110a(this, j);
                if (m21409b(c7110a)) {
                    interfaceC10219a.mo928a(c7110a);
                }
            } catch (Throwable th3) {
                C2528b.m33061b(th3);
                this.f19442u.cancel();
                onError(th3);
            }
        }

        @Override // lk.InterfaceC10221c
        /* renamed from: g */
        public void mo12120g(long j) {
            if (EnumC10143e.m12178f(j)) {
                C10448b.m11528a(this.f19441t, j);
                m21405j();
            }
        }

        /* renamed from: h */
        void m21407h() {
            InterfaceC6744e<U> interfaceC6744e = this.f19436o;
            if (interfaceC6744e != null) {
                interfaceC6744e.clear();
            }
        }

        /* renamed from: i */
        void m21406i() {
            C7110a<?, ?>[] andSet;
            C7110a<?, ?>[] c7110aArr = this.f19440s.get();
            C7110a<?, ?>[] c7110aArr2 = f19430B;
            if (c7110aArr != c7110aArr2 && (andSet = this.f19440s.getAndSet(c7110aArr2)) != c7110aArr2) {
                for (C7110a<?, ?> c7110a : andSet) {
                    c7110a.dispose();
                }
                Throwable m11529b = this.f19438q.m11529b();
                if (m11529b != null && m11529b != C10449c.f27286a) {
                    C10859a.m9887j(m11529b);
                }
            }
        }

        /* renamed from: j */
        void m21405j() {
            if (getAndIncrement() == 0) {
                m21404k();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:261:0x0135, code lost:
            if (r10 == r14) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:262:0x0137, code lost:
            if (r9 != false) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:263:0x0139, code lost:
            r5 = r24.f19441t.addAndGet(-r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:264:0x0141, code lost:
            r5 = Long.MAX_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:265:0x0146, code lost:
            r7.m21410c(r10);
            r10 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:266:0x014c, code lost:
            r10 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:268:0x014f, code lost:
            if (r5 == r10) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x0151, code lost:
            if (r22 != null) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:271:0x0154, code lost:
            r10 = r13;
            r11 = r22;
            r14 = 0;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m21404k() {
            /*
                Method dump skipped, instructions count: 449
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p139hf.C7109e.C7111b.m21404k():void");
        }

        /* renamed from: l */
        InterfaceC6745f<U> m21403l(C7110a<T, U> c7110a) {
            InterfaceC6745f<U> interfaceC6745f = c7110a.f19426o;
            if (interfaceC6745f == null) {
                C7507a c7507a = new C7507a(this.f19435n);
                c7110a.f19426o = c7507a;
                return c7507a;
            }
            return interfaceC6745f;
        }

        /* renamed from: m */
        InterfaceC6745f<U> m21402m() {
            InterfaceC6744e<U> interfaceC6744e = this.f19436o;
            if (interfaceC6744e == null) {
                if (this.f19434m == Integer.MAX_VALUE) {
                    interfaceC6744e = new C7508b<>(this.f19435n);
                } else {
                    interfaceC6744e = new C7507a<>(this.f19434m);
                }
                this.f19436o = interfaceC6744e;
            }
            return interfaceC6744e;
        }

        /* renamed from: n */
        void m21401n(C7110a<T, U> c7110a, Throwable th2) {
            if (this.f19438q.m11530a(th2)) {
                c7110a.f19425n = true;
                if (!this.f19433l) {
                    this.f19442u.cancel();
                    for (C7110a<?, ?> c7110a2 : this.f19440s.getAndSet(f19430B)) {
                        c7110a2.dispose();
                    }
                }
                m21405j();
                return;
            }
            C10859a.m9887j(th2);
        }

        /* renamed from: o */
        void m21400o(C7110a<T, U> c7110a) {
            C7110a<?, ?>[] c7110aArr;
            C7110a<?, ?>[] c7110aArr2;
            do {
                c7110aArr = this.f19440s.get();
                int length = c7110aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c7110aArr[i] == c7110a) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c7110aArr2 = f19429A;
                } else {
                    C7110a<?, ?>[] c7110aArr3 = new C7110a[length - 1];
                    System.arraycopy(c7110aArr, 0, c7110aArr3, 0, i);
                    System.arraycopy(c7110aArr, i + 1, c7110aArr3, i, (length - i) - 1);
                    c7110aArr2 = c7110aArr3;
                }
            } while (!C1696m.m36034a(this.f19440s, c7110aArr, c7110aArr2));
        }

        @Override // lk.InterfaceC10220b
        public void onError(Throwable th2) {
            if (this.f19437p) {
                C10859a.m9887j(th2);
            } else if (this.f19438q.m11530a(th2)) {
                this.f19437p = true;
                if (!this.f19433l) {
                    for (C7110a<?, ?> c7110a : this.f19440s.getAndSet(f19430B)) {
                        c7110a.dispose();
                    }
                }
                m21405j();
            } else {
                C10859a.m9887j(th2);
            }
        }

        /* renamed from: p */
        void m21399p(U u, C7110a<T, U> c7110a) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f19441t.get();
                InterfaceC6745f<U> interfaceC6745f = c7110a.f19426o;
                if (j != 0 && (interfaceC6745f == null || interfaceC6745f.isEmpty())) {
                    this.f19431j.mo12121f(u);
                    if (j != Long.MAX_VALUE) {
                        this.f19441t.decrementAndGet();
                    }
                    c7110a.m21410c(1L);
                } else {
                    if (interfaceC6745f == null) {
                        interfaceC6745f = m21403l(c7110a);
                    }
                    if (!interfaceC6745f.offer(u)) {
                        onError(new C2529c("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC6745f interfaceC6745f2 = c7110a.f19426o;
                if (interfaceC6745f2 == null) {
                    interfaceC6745f2 = new C7507a(this.f19435n);
                    c7110a.f19426o = interfaceC6745f2;
                }
                if (!interfaceC6745f2.offer(u)) {
                    onError(new C2529c("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            m21404k();
        }

        /* renamed from: q */
        void m21398q(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f19441t.get();
                InterfaceC6745f<U> interfaceC6745f = this.f19436o;
                if (j != 0 && (interfaceC6745f == null || interfaceC6745f.isEmpty())) {
                    this.f19431j.mo12121f(u);
                    if (j != Long.MAX_VALUE) {
                        this.f19441t.decrementAndGet();
                    }
                    if (this.f19434m != Integer.MAX_VALUE && !this.f19439r) {
                        int i = this.f19446y + 1;
                        this.f19446y = i;
                        int i2 = this.f19447z;
                        if (i == i2) {
                            this.f19446y = 0;
                            this.f19442u.mo12120g(i2);
                        }
                    }
                } else {
                    if (interfaceC6745f == null) {
                        interfaceC6745f = m21402m();
                    }
                    if (!interfaceC6745f.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!m21402m().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m21404k();
        }
    }

    public C7109e(AbstractC14010b<T> abstractC14010b, InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends U>> interfaceC5833d, boolean z, int i, int i2) {
        super(abstractC14010b);
        this.f19417l = interfaceC5833d;
        this.f19418m = z;
        this.f19419n = i;
        this.f19420o = i2;
    }

    /* renamed from: w */
    public static <T, U> InterfaceC14013e<T> m21411w(InterfaceC10220b<? super U> interfaceC10220b, InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends U>> interfaceC5833d, boolean z, int i, int i2) {
        return new C7111b(interfaceC10220b, interfaceC5833d, z, i, i2);
    }

    @Override // ye.AbstractC14010b
    /* renamed from: t */
    protected void mo909t(InterfaceC10220b<? super U> interfaceC10220b) {
        if (C7123k.m21388b(this.f19391k, interfaceC10220b, this.f19417l)) {
            return;
        }
        this.f19391k.m910s(m21411w(interfaceC10220b, this.f19417l, this.f19418m, this.f19419n, this.f19420o));
    }
}