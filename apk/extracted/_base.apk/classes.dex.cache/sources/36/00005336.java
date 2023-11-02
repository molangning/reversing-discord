package p456z3;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.references.CloseableReference;
import p226m4.C10253c;
import p380v4.AbstractC13063c;
import p380v4.C13064d;
import p380v4.C13068h;
import p394w2.C13379j;
import p414x2.C13677a;
import p436y3.InterfaceC13872b;

/* renamed from: z3.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14085b implements InterfaceC13872b {

    /* renamed from: e */
    private static final Class<?> f36239e = C14085b.class;

    /* renamed from: a */
    private final C10253c f36240a;

    /* renamed from: b */
    private final boolean f36241b;

    /* renamed from: c */
    private final SparseArray<CloseableReference<AbstractC13063c>> f36242c = new SparseArray<>();

    /* renamed from: d */
    private CloseableReference<AbstractC13063c> f36243d;

    public C14085b(C10253c c10253c, boolean z) {
        this.f36240a = c10253c;
        this.f36241b = z;
    }

    /* renamed from: f */
    static CloseableReference<Bitmap> m711f(CloseableReference<AbstractC13063c> closeableReference) {
        C13064d c13064d;
        try {
            if (CloseableReference.m31727Q(closeableReference) && (closeableReference.m31730D() instanceof C13064d) && (c13064d = (C13064d) closeableReference.m31730D()) != null) {
                return c13064d.m3362q();
            }
            CloseableReference.m31715v(closeableReference);
            return null;
        } finally {
            CloseableReference.m31715v(closeableReference);
        }
    }

    /* renamed from: g */
    private static CloseableReference<AbstractC13063c> m710g(CloseableReference<Bitmap> closeableReference) {
        return CloseableReference.m31726R(new C13064d(closeableReference, C13068h.f33869d, 0));
    }

    /* renamed from: h */
    private synchronized void m709h(int i) {
        CloseableReference<AbstractC13063c> closeableReference = this.f36242c.get(i);
        if (closeableReference != null) {
            this.f36242c.delete(i);
            CloseableReference.m31715v(closeableReference);
            C13677a.m1839y(f36239e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.f36242c);
        }
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: a */
    public synchronized void mo707a(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        CloseableReference<AbstractC13063c> closeableReference2;
        C13379j.m2677g(closeableReference);
        try {
            closeableReference2 = m710g(closeableReference);
            if (closeableReference2 == null) {
                CloseableReference.m31715v(closeableReference2);
                return;
            }
            try {
                CloseableReference<AbstractC13063c> m12013a = this.f36240a.m12013a(i, closeableReference2);
                if (CloseableReference.m31727Q(m12013a)) {
                    CloseableReference.m31715v(this.f36242c.get(i));
                    this.f36242c.put(i, m12013a);
                    C13677a.m1839y(f36239e, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), this.f36242c);
                }
                CloseableReference.m31715v(closeableReference2);
            } catch (Throwable th2) {
                th = th2;
                CloseableReference.m31715v(closeableReference2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeableReference2 = null;
        }
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: b */
    public synchronized void mo706b(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        CloseableReference<AbstractC13063c> closeableReference2;
        C13379j.m2677g(closeableReference);
        m709h(i);
        try {
            closeableReference2 = m710g(closeableReference);
            if (closeableReference2 != null) {
                try {
                    CloseableReference.m31715v(this.f36243d);
                    this.f36243d = this.f36240a.m12013a(i, closeableReference2);
                } catch (Throwable th2) {
                    th = th2;
                    CloseableReference.m31715v(closeableReference2);
                    throw th;
                }
            }
            CloseableReference.m31715v(closeableReference2);
        } catch (Throwable th3) {
            th = th3;
            closeableReference2 = null;
        }
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: c */
    public synchronized CloseableReference<Bitmap> mo705c(int i) {
        return m711f(CloseableReference.m31717s(this.f36243d));
    }

    @Override // p436y3.InterfaceC13872b
    public synchronized void clear() {
        CloseableReference.m31715v(this.f36243d);
        this.f36243d = null;
        for (int i = 0; i < this.f36242c.size(); i++) {
            CloseableReference.m31715v(this.f36242c.valueAt(i));
        }
        this.f36242c.clear();
    }

    @Override // p436y3.InterfaceC13872b
    public synchronized boolean contains(int i) {
        return this.f36240a.m12012b(i);
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: d */
    public synchronized CloseableReference<Bitmap> mo704d(int i, int i2, int i3) {
        if (!this.f36241b) {
            return null;
        }
        return m711f(this.f36240a.m12010d());
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: e */
    public synchronized CloseableReference<Bitmap> mo703e(int i) {
        return m711f(this.f36240a.m12011c(i));
    }
}