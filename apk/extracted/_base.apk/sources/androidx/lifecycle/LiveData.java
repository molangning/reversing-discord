package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import p144i.C7365a;
import p165j.C8771b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f4406k = new Object();

    /* renamed from: a */
    final Object f4407a = new Object();

    /* renamed from: b */
    private C8771b<Observer<? super T>, LiveData<T>.AbstractC1656c> f4408b = new C8771b<>();

    /* renamed from: c */
    int f4409c = 0;

    /* renamed from: d */
    private boolean f4410d;

    /* renamed from: e */
    private volatile Object f4411e;

    /* renamed from: f */
    volatile Object f4412f;

    /* renamed from: g */
    private int f4413g;

    /* renamed from: h */
    private boolean f4414h;

    /* renamed from: i */
    private boolean f4415i;

    /* renamed from: j */
    private final Runnable f4416j;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.AbstractC1656c implements InterfaceC1695l {

        /* renamed from: n */
        final LifecycleOwner f4417n;

        LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.f4417n = lifecycleOwner;
        }

        @Override // androidx.lifecycle.InterfaceC1695l
        /* renamed from: a */
        public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
            Lifecycle.State mo36124b = this.f4417n.getLifecycle().mo36124b();
            if (mo36124b == Lifecycle.State.DESTROYED) {
                LiveData.this.mo35986m(this.f4421j);
                return;
            }
            Lifecycle.State state = null;
            while (state != mo36124b) {
                m36100b(mo36097e());
                state = mo36124b;
                mo36124b = this.f4417n.getLifecycle().mo36124b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1656c
        /* renamed from: c */
        void mo36099c() {
            this.f4417n.getLifecycle().mo36123c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1656c
        /* renamed from: d */
        boolean mo36098d(LifecycleOwner lifecycleOwner) {
            return this.f4417n == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1656c
        /* renamed from: e */
        boolean mo36097e() {
            return this.f4417n.getLifecycle().mo36124b().m36132a(Lifecycle.State.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1654a implements Runnable {
        RunnableC1654a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4407a) {
                obj = LiveData.this.f4412f;
                LiveData.this.f4412f = LiveData.f4406k;
            }
            LiveData.this.mo35985n(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C1655b extends LiveData<T>.AbstractC1656c {
        C1655b(Observer<? super T> observer) {
            super(observer);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1656c
        /* renamed from: e */
        boolean mo36097e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public abstract class AbstractC1656c {

        /* renamed from: j */
        final Observer<? super T> f4421j;

        /* renamed from: k */
        boolean f4422k;

        /* renamed from: l */
        int f4423l = -1;

        AbstractC1656c(Observer<? super T> observer) {
            this.f4421j = observer;
        }

        /* renamed from: b */
        void m36100b(boolean z) {
            int i;
            if (z == this.f4422k) {
                return;
            }
            this.f4422k = z;
            LiveData liveData = LiveData.this;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            liveData.m36107c(i);
            if (this.f4422k) {
                LiveData.this.m36105e(this);
            }
        }

        /* renamed from: c */
        void mo36099c() {
        }

        /* renamed from: d */
        boolean mo36098d(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* renamed from: e */
        abstract boolean mo36097e();
    }

    public LiveData() {
        Object obj = f4406k;
        this.f4412f = obj;
        this.f4416j = new RunnableC1654a();
        this.f4411e = obj;
        this.f4413g = -1;
    }

    /* renamed from: b */
    static void m36108b(String str) {
        if (C7365a.m20832d().mo20828b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: d */
    private void m36106d(LiveData<T>.AbstractC1656c abstractC1656c) {
        if (!abstractC1656c.f4422k) {
            return;
        }
        if (!abstractC1656c.mo36097e()) {
            abstractC1656c.m36100b(false);
            return;
        }
        int i = abstractC1656c.f4423l;
        int i2 = this.f4413g;
        if (i >= i2) {
            return;
        }
        abstractC1656c.f4423l = i2;
        abstractC1656c.f4421j.mo35979a((Object) this.f4411e);
    }

    /* renamed from: c */
    void m36107c(int i) {
        boolean z;
        boolean z2;
        int i2 = this.f4409c;
        this.f4409c = i + i2;
        if (this.f4410d) {
            return;
        }
        this.f4410d = true;
        while (true) {
            try {
                int i3 = this.f4409c;
                if (i2 != i3) {
                    if (i2 == 0 && i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 > 0 && i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        mo35988j();
                    } else if (z2) {
                        mo35987k();
                    }
                    i2 = i3;
                } else {
                    return;
                }
            } finally {
                this.f4410d = false;
            }
        }
    }

    /* renamed from: e */
    void m36105e(LiveData<T>.AbstractC1656c abstractC1656c) {
        if (this.f4414h) {
            this.f4415i = true;
            return;
        }
        this.f4414h = true;
        do {
            this.f4415i = false;
            if (abstractC1656c != null) {
                m36106d(abstractC1656c);
                abstractC1656c = null;
            } else {
                C8771b<Observer<? super T>, LiveData<T>.AbstractC1656c>.C8775d m17286e = this.f4408b.m17286e();
                while (m17286e.hasNext()) {
                    m36106d((AbstractC1656c) m17286e.next().getValue());
                    if (this.f4415i) {
                        break;
                    }
                }
            }
        } while (this.f4415i);
        this.f4414h = false;
    }

    /* renamed from: f */
    public T m36104f() {
        T t = (T) this.f4411e;
        if (t != f4406k) {
            return t;
        }
        return null;
    }

    /* renamed from: g */
    public boolean m36103g() {
        return this.f4409c > 0;
    }

    /* renamed from: h */
    public void m36102h(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        m36108b("observe");
        if (lifecycleOwner.getLifecycle().mo36124b() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        LiveData<T>.AbstractC1656c mo17283k = this.f4408b.mo17283k(observer, lifecycleBoundObserver);
        if (mo17283k != null && !mo17283k.mo36098d(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo17283k != null) {
            return;
        }
        lifecycleOwner.getLifecycle().mo36125a(lifecycleBoundObserver);
    }

    /* renamed from: i */
    public void m36101i(Observer<? super T> observer) {
        m36108b("observeForever");
        C1655b c1655b = new C1655b(observer);
        LiveData<T>.AbstractC1656c mo17283k = this.f4408b.mo17283k(observer, c1655b);
        if (!(mo17283k instanceof LifecycleBoundObserver)) {
            if (mo17283k != null) {
                return;
            }
            c1655b.m36100b(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    /* renamed from: j */
    protected void mo35988j() {
    }

    /* renamed from: k */
    protected void mo35987k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void mo36096l(T t) {
        boolean z;
        synchronized (this.f4407a) {
            if (this.f4412f == f4406k) {
                z = true;
            } else {
                z = false;
            }
            this.f4412f = t;
        }
        if (!z) {
            return;
        }
        C7365a.m20832d().mo20827c(this.f4416j);
    }

    /* renamed from: m */
    public void mo35986m(Observer<? super T> observer) {
        m36108b("removeObserver");
        LiveData<T>.AbstractC1656c mo17282o = this.f4408b.mo17282o(observer);
        if (mo17282o == null) {
            return;
        }
        mo17282o.mo36099c();
        mo17282o.m36100b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void mo35985n(T t) {
        m36108b("setValue");
        this.f4413g++;
        this.f4411e = t;
        m36105e(null);
    }
}
