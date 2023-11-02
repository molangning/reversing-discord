package p195k8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p102fb.InterfaceC6386l;
import p195k8.C9203v;

/* renamed from: k8.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9192q<T, E extends C9203v> {

    /* renamed from: a */
    private final InterfaceC9155c f24186a;

    /* renamed from: b */
    private final InterfaceC9184m f24187b;

    /* renamed from: c */
    private final InterfaceC6386l<E> f24188c;

    /* renamed from: d */
    private final InterfaceC9194b<T, E> f24189d;

    /* renamed from: e */
    private final CopyOnWriteArraySet<C9195c<T, E>> f24190e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f24191f;

    /* renamed from: g */
    private final ArrayDeque<Runnable> f24192g;

    /* renamed from: h */
    private boolean f24193h;

    /* renamed from: k8.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9193a<T> {
        void invoke(T t);
    }

    /* renamed from: k8.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9194b<T, E extends C9203v> {
        /* renamed from: a */
        void mo16197a(T t, E e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k8.q$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9195c<T, E extends C9203v> {

        /* renamed from: a */
        public final T f24194a;

        /* renamed from: b */
        private E f24195b;

        /* renamed from: c */
        private boolean f24196c;

        /* renamed from: d */
        private boolean f24197d;

        public C9195c(T t, InterfaceC6386l<E> interfaceC6386l) {
            this.f24194a = t;
            this.f24195b = interfaceC6386l.get();
        }

        /* renamed from: a */
        public void m16196a(int i, InterfaceC9193a<T> interfaceC9193a) {
            if (!this.f24197d) {
                if (i != -1) {
                    this.f24195b.m16149a(i);
                }
                this.f24196c = true;
                interfaceC9193a.invoke(this.f24194a);
            }
        }

        /* renamed from: b */
        public void m16195b(InterfaceC6386l<E> interfaceC6386l, InterfaceC9194b<T, E> interfaceC9194b) {
            if (!this.f24197d && this.f24196c) {
                E e = this.f24195b;
                this.f24195b = interfaceC6386l.get();
                this.f24196c = false;
                interfaceC9194b.mo16197a(this.f24194a, e);
            }
        }

        /* renamed from: c */
        public void m16194c(InterfaceC9194b<T, E> interfaceC9194b) {
            this.f24197d = true;
            if (this.f24196c) {
                interfaceC9194b.mo16197a(this.f24194a, this.f24195b);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C9195c.class == obj.getClass()) {
                return this.f24194a.equals(((C9195c) obj).f24194a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24194a.hashCode();
        }
    }

    public C9192q(Looper looper, InterfaceC9155c interfaceC9155c, InterfaceC6386l<E> interfaceC6386l, InterfaceC9194b<T, E> interfaceC9194b) {
        this(new CopyOnWriteArraySet(), looper, interfaceC9155c, interfaceC6386l, interfaceC9194b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m16204f(Message message) {
        int i = message.what;
        if (i == 0) {
            Iterator<C9195c<T, E>> it = this.f24190e.iterator();
            while (it.hasNext()) {
                it.next().m16195b(this.f24188c, this.f24189d);
                if (this.f24187b.mo16334c(0)) {
                    break;
                }
            }
        } else if (i == 1) {
            m16198l(message.arg1, (InterfaceC9193a) message.obj);
            m16200j();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m16203g(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC9193a interfaceC9193a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C9195c) it.next()).m16196a(i, interfaceC9193a);
        }
    }

    /* renamed from: c */
    public void m16207c(T t) {
        if (this.f24193h) {
            return;
        }
        C9149a.m16448e(t);
        this.f24190e.add(new C9195c<>(t, this.f24188c));
    }

    /* renamed from: d */
    public C9192q<T, E> m16206d(Looper looper, InterfaceC9194b<T, E> interfaceC9194b) {
        return new C9192q<>(this.f24190e, looper, this.f24186a, this.f24188c, interfaceC9194b);
    }

    /* renamed from: e */
    public void m16205e() {
        if (this.f24192g.isEmpty()) {
            return;
        }
        if (!this.f24187b.mo16334c(0)) {
            this.f24187b.mo16335b(0).sendToTarget();
        }
        boolean z = !this.f24191f.isEmpty();
        this.f24191f.addAll(this.f24192g);
        this.f24192g.clear();
        if (z) {
            return;
        }
        while (!this.f24191f.isEmpty()) {
            this.f24191f.peekFirst().run();
            this.f24191f.removeFirst();
        }
    }

    /* renamed from: h */
    public void m16202h(int i, InterfaceC9193a<T> interfaceC9193a) {
        this.f24187b.mo16333d(1, i, 0, interfaceC9193a).sendToTarget();
    }

    /* renamed from: i */
    public void m16201i(final int i, final InterfaceC9193a<T> interfaceC9193a) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f24190e);
        this.f24192g.add(new Runnable() { // from class: k8.p
            @Override // java.lang.Runnable
            public final void run() {
                C9192q.m16203g(copyOnWriteArraySet, i, interfaceC9193a);
            }
        });
    }

    /* renamed from: j */
    public void m16200j() {
        Iterator<C9195c<T, E>> it = this.f24190e.iterator();
        while (it.hasNext()) {
            it.next().m16194c(this.f24189d);
        }
        this.f24190e.clear();
        this.f24193h = true;
    }

    /* renamed from: k */
    public void m16199k(T t) {
        Iterator<C9195c<T, E>> it = this.f24190e.iterator();
        while (it.hasNext()) {
            C9195c<T, E> next = it.next();
            if (next.f24194a.equals(t)) {
                next.m16194c(this.f24189d);
                this.f24190e.remove(next);
            }
        }
    }

    /* renamed from: l */
    public void m16198l(int i, InterfaceC9193a<T> interfaceC9193a) {
        m16201i(i, interfaceC9193a);
        m16205e();
    }

    private C9192q(CopyOnWriteArraySet<C9195c<T, E>> copyOnWriteArraySet, Looper looper, InterfaceC9155c interfaceC9155c, InterfaceC6386l<E> interfaceC6386l, InterfaceC9194b<T, E> interfaceC9194b) {
        this.f24186a = interfaceC9155c;
        this.f24190e = copyOnWriteArraySet;
        this.f24188c = interfaceC6386l;
        this.f24189d = interfaceC9194b;
        this.f24191f = new ArrayDeque<>();
        this.f24192g = new ArrayDeque<>();
        this.f24187b = interfaceC9155c.mo16372c(looper, new Handler.Callback() { // from class: k8.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m16204f;
                m16204f = C9192q.this.m16204f(message);
                return m16204f;
            }
        });
    }
}
