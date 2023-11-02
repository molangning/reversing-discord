package p456z3;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import p436y3.InterfaceC13872b;

/* renamed from: z3.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14086c implements InterfaceC13872b {

    /* renamed from: a */
    private int f36244a = -1;

    /* renamed from: b */
    private CloseableReference<Bitmap> f36245b;

    /* renamed from: f */
    private synchronized void m708f() {
        CloseableReference.m31715v(this.f36245b);
        this.f36245b = null;
        this.f36244a = -1;
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: a */
    public void mo707a(int i, CloseableReference<Bitmap> closeableReference, int i2) {
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: b */
    public synchronized void mo706b(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        if (closeableReference != null) {
            if (this.f36245b != null && closeableReference.m31730D().equals(this.f36245b.m31730D())) {
                return;
            }
        }
        CloseableReference.m31715v(this.f36245b);
        this.f36245b = CloseableReference.m31717s(closeableReference);
        this.f36244a = i;
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: c */
    public synchronized CloseableReference<Bitmap> mo705c(int i) {
        return CloseableReference.m31717s(this.f36245b);
    }

    @Override // p436y3.InterfaceC13872b
    public synchronized void clear() {
        m708f();
    }

    @Override // p436y3.InterfaceC13872b
    public synchronized boolean contains(int i) {
        boolean z;
        if (i == this.f36244a) {
            if (CloseableReference.m31727Q(this.f36245b)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: d */
    public synchronized CloseableReference<Bitmap> mo704d(int i, int i2, int i3) {
        CloseableReference<Bitmap> m31717s;
        m31717s = CloseableReference.m31717s(this.f36245b);
        m708f();
        return m31717s;
    }

    @Override // p436y3.InterfaceC13872b
    /* renamed from: e */
    public synchronized CloseableReference<Bitmap> mo703e(int i) {
        if (this.f36244a == i) {
            return CloseableReference.m31717s(this.f36245b);
        }
        return null;
    }
}