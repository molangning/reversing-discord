package com.facebook.common.references;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p004a3.C0017d;
import p004a3.InterfaceC0014a;
import p004a3.InterfaceC0016c;
import p394w2.C13368b;
import p394w2.C13379j;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class CloseableReference<T> implements Cloneable, Closeable {

    /* renamed from: o */
    private static int f9696o;

    /* renamed from: j */
    protected boolean f9699j = false;

    /* renamed from: k */
    protected final C0017d<T> f9700k;

    /* renamed from: l */
    protected final InterfaceC3564c f9701l;

    /* renamed from: m */
    protected final Throwable f9702m;

    /* renamed from: n */
    private static Class<CloseableReference> f9695n = CloseableReference.class;

    /* renamed from: p */
    private static final InterfaceC0016c<Closeable> f9697p = new C3562a();

    /* renamed from: q */
    private static final InterfaceC3564c f9698q = new C3563b();

    /* renamed from: com.facebook.common.references.CloseableReference$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C3562a implements InterfaceC0016c<Closeable> {
        C3562a() {
        }

        @Override // p004a3.InterfaceC0016c
        /* renamed from: a */
        public void release(Closeable closeable) {
            try {
                C13368b.m2700a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: com.facebook.common.references.CloseableReference$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C3563b implements InterfaceC3564c {
        C3563b() {
        }

        @Override // com.facebook.common.references.CloseableReference.InterfaceC3564c
        /* renamed from: a */
        public void mo6464a(C0017d<Object> c0017d, Throwable th2) {
            String name;
            Object m41392f = c0017d.m41392f();
            Class cls = CloseableReference.f9695n;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = Integer.valueOf(System.identityHashCode(c0017d));
            if (m41392f == null) {
                name = null;
            } else {
                name = m41392f.getClass().getName();
            }
            objArr[2] = name;
            C13677a.m1872F(cls, "Finalized without closing: %x %x (type = %s)", objArr);
        }

        @Override // com.facebook.common.references.CloseableReference.InterfaceC3564c
        /* renamed from: b */
        public boolean mo6463b() {
            return false;
        }
    }

    /* renamed from: com.facebook.common.references.CloseableReference$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC3564c {
        /* renamed from: a */
        void mo6464a(C0017d<Object> c0017d, Throwable th2);

        /* renamed from: b */
        boolean mo6463b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CloseableReference(C0017d<T> c0017d, InterfaceC3564c interfaceC3564c, Throwable th2) {
        this.f9700k = (C0017d) C13379j.m2677g(c0017d);
        c0017d.m41396b();
        this.f9701l = interfaceC3564c;
        this.f9702m = th2;
    }

    /* renamed from: A */
    public static void m31731A(Iterable<? extends CloseableReference<?>> iterable) {
        if (iterable != null) {
            for (CloseableReference<?> closeableReference : iterable) {
                m31715v(closeableReference);
            }
        }
    }

    /* renamed from: Q */
    public static boolean m31727Q(CloseableReference<?> closeableReference) {
        return closeableReference != null && closeableReference.m31728I();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lcom/facebook/common/references/CloseableReference<TT;>; */
    /* renamed from: R */
    public static CloseableReference m31726R(Closeable closeable) {
        return m31724U(closeable, f9697p);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Lcom/facebook/common/references/CloseableReference$c;)Lcom/facebook/common/references/CloseableReference<TT;>; */
    /* renamed from: S */
    public static CloseableReference m31725S(Closeable closeable, InterfaceC3564c interfaceC3564c) {
        Throwable th2 = null;
        if (closeable == null) {
            return null;
        }
        InterfaceC0016c<Closeable> interfaceC0016c = f9697p;
        if (interfaceC3564c.mo6463b()) {
            th2 = new Throwable();
        }
        return m31722Y(closeable, interfaceC0016c, interfaceC3564c, th2);
    }

    /* renamed from: U */
    public static <T> CloseableReference<T> m31724U(T t, InterfaceC0016c<T> interfaceC0016c) {
        return m31723V(t, interfaceC0016c, f9698q);
    }

    /* renamed from: V */
    public static <T> CloseableReference<T> m31723V(T t, InterfaceC0016c<T> interfaceC0016c, InterfaceC3564c interfaceC3564c) {
        Throwable th2 = null;
        if (t == null) {
            return null;
        }
        if (interfaceC3564c.mo6463b()) {
            th2 = new Throwable();
        }
        return m31722Y(t, interfaceC0016c, interfaceC3564c, th2);
    }

    /* renamed from: Y */
    public static <T> CloseableReference<T> m31722Y(T t, InterfaceC0016c<T> interfaceC0016c, InterfaceC3564c interfaceC3564c, Throwable th2) {
        if (t == null) {
            return null;
        }
        if ((t instanceof Bitmap) || (t instanceof InterfaceC0014a)) {
            int i = f9696o;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new C3567c(t, interfaceC0016c, interfaceC3564c, th2);
                    }
                } else {
                    return new C3568d(t, interfaceC0016c, interfaceC3564c, th2);
                }
            } else {
                return new C3566b(t, interfaceC0016c, interfaceC3564c, th2);
            }
        }
        return new C3565a(t, interfaceC0016c, interfaceC3564c, th2);
    }

    /* renamed from: b0 */
    public static void m31721b0(int i) {
        f9696o = i;
    }

    /* renamed from: e0 */
    public static boolean m31720e0() {
        return f9696o == 3;
    }

    /* renamed from: s */
    public static <T> CloseableReference<T> m31717s(CloseableReference<T> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.m31718q();
        }
        return null;
    }

    /* renamed from: t */
    public static <T> List<CloseableReference<T>> m31716t(Collection<CloseableReference<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (CloseableReference<T> closeableReference : collection) {
            arrayList.add(m31717s(closeableReference));
        }
        return arrayList;
    }

    /* renamed from: v */
    public static void m31715v(CloseableReference<?> closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    /* renamed from: D */
    public synchronized T m31730D() {
        boolean z;
        if (!this.f9699j) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        return (T) C13379j.m2677g(this.f9700k.m41392f());
    }

    /* renamed from: H */
    public int m31729H() {
        if (m31728I()) {
            return System.identityHashCode(this.f9700k.m41392f());
        }
        return 0;
    }

    /* renamed from: I */
    public synchronized boolean m31728I() {
        return !this.f9699j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f9699j) {
                return;
            }
            this.f9699j = true;
            this.f9700k.m41394d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (this.f9699j) {
                    return;
                }
                this.f9701l.mo6464a(this.f9700k, this.f9702m);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // 
    /* renamed from: m */
    public abstract CloseableReference<T> clone();

    /* renamed from: q */
    public synchronized CloseableReference<T> m31718q() {
        if (m31728I()) {
            return clone();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CloseableReference(T t, InterfaceC0016c<T> interfaceC0016c, InterfaceC3564c interfaceC3564c, Throwable th2) {
        this.f9700k = new C0017d<>(t, interfaceC0016c);
        this.f9701l = interfaceC3564c;
        this.f9702m = th2;
    }
}
