package p139hf;

import cf.C2528b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lk.InterfaceC10220b;
import lk.InterfaceC10221c;
import nf.C10859a;
import p085ef.C6217e;
import p158if.C7508b;
import p217lf.EnumC10143e;
import p233mf.C10448b;
import ye.AbstractC14010b;
import ye.EnumC14009a;
import ye.InterfaceC14011c;
import ye.InterfaceC14012d;

/* renamed from: hf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7096b<T> extends AbstractC14010b<T> {

    /* renamed from: k */
    final InterfaceC14012d<T> f19392k;

    /* renamed from: l */
    final EnumC14009a f19393l;

    /* renamed from: hf.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C7097a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19394a;

        static {
            int[] iArr = new int[EnumC14009a.values().length];
            f19394a = iArr;
            try {
                iArr[EnumC14009a.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19394a[EnumC14009a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19394a[EnumC14009a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19394a[EnumC14009a.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC7098b<T> extends AtomicLong implements InterfaceC14011c<T>, InterfaceC10221c {

        /* renamed from: j */
        final InterfaceC10220b<? super T> f19395j;

        /* renamed from: k */
        final C6217e f19396k = new C6217e();

        AbstractC7098b(InterfaceC10220b<? super T> interfaceC10220b) {
            this.f19395j = interfaceC10220b;
        }

        /* renamed from: a */
        protected void m21422a() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f19395j.mo12122d();
            } finally {
                this.f19396k.dispose();
            }
        }

        /* renamed from: b */
        protected boolean m21421b(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f19395j.onError(th2);
                this.f19396k.dispose();
                return true;
            } catch (Throwable th3) {
                this.f19396k.dispose();
                throw th3;
            }
        }

        /* renamed from: c */
        public final void m21420c(Throwable th2) {
            if (!mo21416f(th2)) {
                C10859a.m9887j(th2);
            }
        }

        @Override // lk.InterfaceC10221c
        public final void cancel() {
            this.f19396k.dispose();
            mo21417e();
        }

        /* renamed from: d */
        void mo21418d() {
        }

        /* renamed from: e */
        void mo21417e() {
        }

        /* renamed from: f */
        public boolean mo21416f(Throwable th2) {
            return m21421b(th2);
        }

        @Override // lk.InterfaceC10221c
        /* renamed from: g */
        public final void mo12120g(long j) {
            if (EnumC10143e.m12178f(j)) {
                C10448b.m11528a(this, j);
                mo21418d();
            }
        }

        @Override // ye.InterfaceC14011c
        public final boolean isCancelled() {
            return this.f19396k.mo16034b();
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* renamed from: hf.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7099c<T> extends AbstractC7098b<T> {

        /* renamed from: l */
        final C7508b<T> f19397l;

        /* renamed from: m */
        Throwable f19398m;

        /* renamed from: n */
        volatile boolean f19399n;

        /* renamed from: o */
        final AtomicInteger f19400o;

        C7099c(InterfaceC10220b<? super T> interfaceC10220b, int i) {
            super(interfaceC10220b);
            this.f19397l = new C7508b<>(i);
            this.f19400o = new AtomicInteger();
        }

        @Override // p139hf.C7096b.AbstractC7098b
        /* renamed from: d */
        void mo21418d() {
            m21419h();
        }

        @Override // p139hf.C7096b.AbstractC7098b
        /* renamed from: e */
        void mo21417e() {
            if (this.f19400o.getAndIncrement() == 0) {
                this.f19397l.clear();
            }
        }

        @Override // p139hf.C7096b.AbstractC7098b
        /* renamed from: f */
        public boolean mo21416f(Throwable th2) {
            if (!this.f19399n && !isCancelled()) {
                if (th2 == null) {
                    th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                this.f19398m = th2;
                this.f19399n = true;
                m21419h();
                return true;
            }
            return false;
        }

        /* renamed from: h */
        void m21419h() {
            int i;
            boolean z;
            if (this.f19400o.getAndIncrement() != 0) {
                return;
            }
            InterfaceC10220b<? super T> interfaceC10220b = this.f19395j;
            C7508b<T> c7508b = this.f19397l;
            int i2 = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (isCancelled()) {
                        c7508b.clear();
                        return;
                    } else {
                        boolean z2 = this.f19399n;
                        Object obj = (T) c7508b.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            Throwable th2 = this.f19398m;
                            if (th2 != null) {
                                m21421b(th2);
                                return;
                            } else {
                                m21422a();
                                return;
                            }
                        } else if (z) {
                            break;
                        } else {
                            interfaceC10220b.mo12121f(obj);
                            j2++;
                        }
                    }
                }
                if (i == 0) {
                    if (isCancelled()) {
                        c7508b.clear();
                        return;
                    }
                    boolean z3 = this.f19399n;
                    boolean isEmpty = c7508b.isEmpty();
                    if (z3 && isEmpty) {
                        Throwable th3 = this.f19398m;
                        if (th3 != null) {
                            m21421b(th3);
                            return;
                        } else {
                            m21422a();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    C10448b.m11526c(this, j2);
                }
                i2 = this.f19400o.addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    /* renamed from: hf.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7100d<T> extends AbstractC7104h<T> {
        C7100d(InterfaceC10220b<? super T> interfaceC10220b) {
            super(interfaceC10220b);
        }
    }

    /* renamed from: hf.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7101e<T> extends AbstractC7104h<T> {
        C7101e(InterfaceC10220b<? super T> interfaceC10220b) {
            super(interfaceC10220b);
        }
    }

    /* renamed from: hf.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7102f<T> extends AbstractC7098b<T> {

        /* renamed from: l */
        final AtomicReference<T> f19401l;

        /* renamed from: m */
        Throwable f19402m;

        /* renamed from: n */
        volatile boolean f19403n;

        /* renamed from: o */
        final AtomicInteger f19404o;

        C7102f(InterfaceC10220b<? super T> interfaceC10220b) {
            super(interfaceC10220b);
            this.f19401l = new AtomicReference<>();
            this.f19404o = new AtomicInteger();
        }

        @Override // p139hf.C7096b.AbstractC7098b
        /* renamed from: d */
        void mo21418d() {
            m21415h();
        }

        @Override // p139hf.C7096b.AbstractC7098b
        /* renamed from: e */
        void mo21417e() {
            if (this.f19404o.getAndIncrement() == 0) {
                this.f19401l.lazySet(null);
            }
        }

        @Override // p139hf.C7096b.AbstractC7098b
        /* renamed from: f */
        public boolean mo21416f(Throwable th2) {
            if (!this.f19403n && !isCancelled()) {
                if (th2 == null) {
                    m21420c(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
                }
                this.f19402m = th2;
                this.f19403n = true;
                m21415h();
                return true;
            }
            return false;
        }

        /* renamed from: h */
        void m21415h() {
            int i;
            boolean z;
            boolean z2;
            if (this.f19404o.getAndIncrement() != 0) {
                return;
            }
            InterfaceC10220b<? super T> interfaceC10220b = this.f19395j;
            AtomicReference<T> atomicReference = this.f19401l;
            int i2 = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    z = false;
                    if (i == 0) {
                        break;
                    } else if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    } else {
                        boolean z3 = this.f19403n;
                        Object obj = (T) atomicReference.getAndSet(null);
                        if (obj == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z3 && z2) {
                            Throwable th2 = this.f19402m;
                            if (th2 != null) {
                                m21421b(th2);
                                return;
                            } else {
                                m21422a();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            interfaceC10220b.mo12121f(obj);
                            j2++;
                        }
                    }
                }
                if (i == 0) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z4 = this.f19403n;
                    if (atomicReference.get() == null) {
                        z = true;
                    }
                    if (z4 && z) {
                        Throwable th3 = this.f19402m;
                        if (th3 != null) {
                            m21421b(th3);
                            return;
                        } else {
                            m21422a();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    C10448b.m11526c(this, j2);
                }
                i2 = this.f19404o.addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    /* renamed from: hf.b$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7103g<T> extends AbstractC7098b<T> {
        C7103g(InterfaceC10220b<? super T> interfaceC10220b) {
            super(interfaceC10220b);
        }
    }

    /* renamed from: hf.b$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static abstract class AbstractC7104h<T> extends AbstractC7098b<T> {
        AbstractC7104h(InterfaceC10220b<? super T> interfaceC10220b) {
            super(interfaceC10220b);
        }
    }

    public C7096b(InterfaceC14012d<T> interfaceC14012d, EnumC14009a enumC14009a) {
        this.f19392k = interfaceC14012d;
        this.f19393l = enumC14009a;
    }

    @Override // ye.AbstractC14010b
    /* renamed from: t */
    public void mo909t(InterfaceC10220b<? super T> interfaceC10220b) {
        AbstractC7098b c7103g;
        int i = C7097a.f19394a[this.f19393l.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        c7103g = new C7099c(interfaceC10220b, AbstractC14010b.m927b());
                    } else {
                        c7103g = new C7102f(interfaceC10220b);
                    }
                } else {
                    c7103g = new C7100d(interfaceC10220b);
                }
            } else {
                c7103g = new C7101e(interfaceC10220b);
            }
        } else {
            c7103g = new C7103g(interfaceC10220b);
        }
        interfaceC10220b.mo905a(c7103g);
        try {
            this.f19392k.mo906a(c7103g);
        } catch (Throwable th2) {
            C2528b.m33061b(th2);
            c7103g.m21420c(th2);
        }
    }
}
