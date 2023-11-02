package p228m6;

import java.util.ArrayDeque;
import p195k8.C9149a;
import p228m6.AbstractC10273h;
import p228m6.C10270f;
import p228m6.C10271g;

/* renamed from: m6.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC10275i<I extends C10271g, O extends AbstractC10273h, E extends C10270f> implements InterfaceC10269e<I, O, E> {

    /* renamed from: a */
    private final Thread f26753a;

    /* renamed from: b */
    private final Object f26754b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f26755c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f26756d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f26757e;

    /* renamed from: f */
    private final O[] f26758f;

    /* renamed from: g */
    private int f26759g;

    /* renamed from: h */
    private int f26760h;

    /* renamed from: i */
    private I f26761i;

    /* renamed from: j */
    private E f26762j;

    /* renamed from: k */
    private boolean f26763k;

    /* renamed from: l */
    private boolean f26764l;

    /* renamed from: m */
    private int f26765m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m6.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C10276a extends Thread {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10276a(String str) {
            super(str);
            AbstractC10275i.this = r1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AbstractC10275i.this.m11960t();
        }
    }

    public AbstractC10275i(I[] iArr, O[] oArr) {
        this.f26757e = iArr;
        this.f26759g = iArr.length;
        for (int i = 0; i < this.f26759g; i++) {
            this.f26757e[i] = mo3136g();
        }
        this.f26758f = oArr;
        this.f26760h = oArr.length;
        for (int i2 = 0; i2 < this.f26760h; i2++) {
            this.f26758f[i2] = mo3135h();
        }
        C10276a c10276a = new C10276a("ExoPlayer:SimpleDecoder");
        this.f26753a = c10276a;
        c10276a.start();
    }

    /* renamed from: f */
    private boolean m11970f() {
        return !this.f26755c.isEmpty() && this.f26760h > 0;
    }

    /* renamed from: k */
    private boolean m11969k() {
        E mo3134i;
        synchronized (this.f26754b) {
            while (!this.f26764l && !m11970f()) {
                this.f26754b.wait();
            }
            if (this.f26764l) {
                return false;
            }
            I removeFirst = this.f26755c.removeFirst();
            O[] oArr = this.f26758f;
            int i = this.f26760h - 1;
            this.f26760h = i;
            O o = oArr[i];
            boolean z = this.f26763k;
            this.f26763k = false;
            if (removeFirst.m11988l()) {
                o.m11993e(4);
            } else {
                if (removeFirst.m11989k()) {
                    o.m11993e(Integer.MIN_VALUE);
                }
                try {
                    mo3134i = mo3133j(removeFirst, o, z);
                } catch (OutOfMemoryError e) {
                    mo3134i = mo3134i(e);
                } catch (RuntimeException e2) {
                    mo3134i = mo3134i(e2);
                }
                if (mo3134i != null) {
                    synchronized (this.f26754b) {
                        this.f26762j = mo3134i;
                    }
                    return false;
                }
            }
            synchronized (this.f26754b) {
                if (this.f26763k) {
                    o.mo2498o();
                } else if (o.m11989k()) {
                    this.f26765m++;
                    o.mo2498o();
                } else {
                    o.f26752l = this.f26765m;
                    this.f26765m = 0;
                    this.f26756d.addLast(o);
                }
                m11963q(removeFirst);
            }
            return true;
        }
    }

    /* renamed from: n */
    private void m11966n() {
        if (m11970f()) {
            this.f26754b.notify();
        }
    }

    /* renamed from: o */
    private void m11965o() {
        E e = this.f26762j;
        if (e == null) {
            return;
        }
        throw e;
    }

    /* renamed from: q */
    private void m11963q(I i) {
        i.mo3126f();
        I[] iArr = this.f26757e;
        int i2 = this.f26759g;
        this.f26759g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: s */
    private void m11961s(O o) {
        o.mo3126f();
        O[] oArr = this.f26758f;
        int i = this.f26760h;
        this.f26760h = i + 1;
        oArr[i] = o;
    }

    /* renamed from: t */
    public void m11960t() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m11969k());
    }

    @Override // p228m6.InterfaceC10269e
    public final void flush() {
        synchronized (this.f26754b) {
            this.f26763k = true;
            this.f26765m = 0;
            I i = this.f26761i;
            if (i != null) {
                m11963q(i);
                this.f26761i = null;
            }
            while (!this.f26755c.isEmpty()) {
                m11963q(this.f26755c.removeFirst());
            }
            while (!this.f26756d.isEmpty()) {
                this.f26756d.removeFirst().mo2498o();
            }
        }
    }

    /* renamed from: g */
    protected abstract I mo3136g();

    /* renamed from: h */
    protected abstract O mo3135h();

    /* renamed from: i */
    protected abstract E mo3134i(Throwable th2);

    /* renamed from: j */
    protected abstract E mo3133j(I i, O o, boolean z);

    @Override // p228m6.InterfaceC10269e
    /* renamed from: l */
    public final I mo2511d() {
        boolean z;
        I i;
        synchronized (this.f26754b) {
            m11965o();
            if (this.f26761i == null) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16447f(z);
            int i2 = this.f26759g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f26757e;
                int i3 = i2 - 1;
                this.f26759g = i3;
                i = iArr[i3];
            }
            this.f26761i = i;
        }
        return i;
    }

    @Override // p228m6.InterfaceC10269e
    /* renamed from: m */
    public final O mo2513b() {
        synchronized (this.f26754b) {
            m11965o();
            if (this.f26756d.isEmpty()) {
                return null;
            }
            return this.f26756d.removeFirst();
        }
    }

    @Override // p228m6.InterfaceC10269e
    /* renamed from: p */
    public final void mo2512c(I i) {
        boolean z;
        synchronized (this.f26754b) {
            m11965o();
            if (i == this.f26761i) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16452a(z);
            this.f26755c.addLast(i);
            m11966n();
            this.f26761i = null;
        }
    }

    /* renamed from: r */
    public void m11962r(O o) {
        synchronized (this.f26754b) {
            m11961s(o);
            m11966n();
        }
    }

    @Override // p228m6.InterfaceC10269e
    public void release() {
        synchronized (this.f26754b) {
            this.f26764l = true;
            this.f26754b.notify();
        }
        try {
            this.f26753a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: u */
    public final void m11959u(int i) {
        boolean z;
        if (this.f26759g == this.f26757e.length) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        for (I i2 : this.f26757e) {
            i2.m11977p(i);
        }
    }
}