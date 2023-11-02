package p005a4;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.concurrent.ExecutorService;
import p414x2.C13677a;
import p415x3.InterfaceC13680a;
import p436y3.InterfaceC13872b;
import p436y3.InterfaceC13873c;

/* renamed from: a4.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0021c implements InterfaceC0020b {

    /* renamed from: f */
    private static final Class<?> f26f = C0021c.class;

    /* renamed from: a */
    private final PlatformBitmapFactory f27a;

    /* renamed from: b */
    private final InterfaceC13873c f28b;

    /* renamed from: c */
    private final Bitmap.Config f29c;

    /* renamed from: d */
    private final ExecutorService f30d;

    /* renamed from: e */
    private final SparseArray<Runnable> f31e = new SparseArray<>();

    /* renamed from: a4.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class RunnableC0022a implements Runnable {

        /* renamed from: j */
        private final InterfaceC13872b f32j;

        /* renamed from: k */
        private final InterfaceC13680a f33k;

        /* renamed from: l */
        private final int f34l;

        /* renamed from: m */
        private final int f35m;

        public RunnableC0022a(InterfaceC13680a interfaceC13680a, InterfaceC13872b interfaceC13872b, int i, int i2) {
            C0021c.this = r1;
            this.f33k = interfaceC13680a;
            this.f32j = interfaceC13872b;
            this.f34l = i;
            this.f35m = i2;
        }

        /* renamed from: a */
        private boolean m41381a(int i, int i2) {
            CloseableReference<Bitmap> mo704d;
            int i3 = 2;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return false;
                    }
                    mo704d = C0021c.this.f27a.m31202b(this.f33k.mo1343e(), this.f33k.mo1345c(), C0021c.this.f29c);
                    i3 = -1;
                } else {
                    mo704d = this.f32j.mo704d(i, this.f33k.mo1343e(), this.f33k.mo1345c());
                }
                boolean m41380b = m41380b(i, mo704d, i2);
                CloseableReference.m31715v(mo704d);
                if (!m41380b && i3 != -1) {
                    return m41381a(i, i3);
                }
                return m41380b;
            } catch (RuntimeException e) {
                C13677a.m1873E(C0021c.f26f, "Failed to create frame bitmap", e);
                return false;
            } finally {
                CloseableReference.m31715v(null);
            }
        }

        /* renamed from: b */
        private boolean m41380b(int i, CloseableReference<Bitmap> closeableReference, int i2) {
            if (!CloseableReference.m31727Q(closeableReference) || !C0021c.this.f28b.mo1333a(i, closeableReference.m31730D())) {
                return false;
            }
            C13677a.m1840x(C0021c.f26f, "Frame %d ready.", Integer.valueOf(this.f34l));
            synchronized (C0021c.this.f31e) {
                this.f32j.mo707a(this.f34l, closeableReference, i2);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f32j.contains(this.f34l)) {
                    C13677a.m1840x(C0021c.f26f, "Frame %d is cached already.", Integer.valueOf(this.f34l));
                    synchronized (C0021c.this.f31e) {
                        C0021c.this.f31e.remove(this.f35m);
                    }
                    return;
                }
                if (m41381a(this.f34l, 1)) {
                    C13677a.m1840x(C0021c.f26f, "Prepared frame frame %d.", Integer.valueOf(this.f34l));
                } else {
                    C13677a.m1856h(C0021c.f26f, "Could not prepare frame %d.", Integer.valueOf(this.f34l));
                }
                synchronized (C0021c.this.f31e) {
                    C0021c.this.f31e.remove(this.f35m);
                }
            } catch (Throwable th2) {
                synchronized (C0021c.this.f31e) {
                    C0021c.this.f31e.remove(this.f35m);
                    throw th2;
                }
            }
        }
    }

    public C0021c(PlatformBitmapFactory platformBitmapFactory, InterfaceC13873c interfaceC13873c, Bitmap.Config config, ExecutorService executorService) {
        this.f27a = platformBitmapFactory;
        this.f28b = interfaceC13873c;
        this.f29c = config;
        this.f30d = executorService;
    }

    /* renamed from: g */
    private static int m41382g(InterfaceC13680a interfaceC13680a, int i) {
        return (interfaceC13680a.hashCode() * 31) + i;
    }

    @Override // p005a4.InterfaceC0020b
    /* renamed from: a */
    public boolean mo41388a(InterfaceC13872b interfaceC13872b, InterfaceC13680a interfaceC13680a, int i) {
        int m41382g = m41382g(interfaceC13680a, i);
        synchronized (this.f31e) {
            if (this.f31e.get(m41382g) != null) {
                C13677a.m1840x(f26f, "Already scheduled decode job for frame %d", Integer.valueOf(i));
                return true;
            } else if (interfaceC13872b.contains(i)) {
                C13677a.m1840x(f26f, "Frame %d is cached already.", Integer.valueOf(i));
                return true;
            } else {
                RunnableC0022a runnableC0022a = new RunnableC0022a(interfaceC13680a, interfaceC13872b, i, m41382g);
                this.f31e.put(m41382g, runnableC0022a);
                this.f30d.execute(runnableC0022a);
                return true;
            }
        }
    }
}