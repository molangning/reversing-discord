package p437y4;

import com.facebook.common.references.CloseableReference;
import java.nio.ByteBuffer;
import p394w2.C13379j;
import p455z2.InterfaceC14078g;

/* renamed from: y4.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13897t implements InterfaceC14078g {

    /* renamed from: j */
    private final int f35738j;

    /* renamed from: k */
    CloseableReference<InterfaceC13896s> f35739k;

    public C13897t(CloseableReference<InterfaceC13896s> closeableReference, int i) {
        boolean z;
        C13379j.m2677g(closeableReference);
        if (i >= 0 && i <= closeableReference.m31730D().getSize()) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        this.f35739k = closeableReference.clone();
        this.f35738j = i;
    }

    /* renamed from: a */
    synchronized void m1280a() {
        if (isClosed()) {
            throw new InterfaceC14078g.C14079a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        CloseableReference.m31715v(this.f35739k);
        this.f35739k = null;
    }

    @Override // p455z2.InterfaceC14078g
    /* renamed from: e */
    public synchronized int mo725e(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        m1280a();
        if (i + i3 <= this.f35738j) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        return this.f35739k.m31730D().mo1287e(i, bArr, i2, i3);
    }

    @Override // p455z2.InterfaceC14078g
    /* renamed from: f */
    public synchronized ByteBuffer mo724f() {
        return this.f35739k.m31730D().mo1286f();
    }

    @Override // p455z2.InterfaceC14078g
    public synchronized boolean isClosed() {
        return !CloseableReference.m31727Q(this.f35739k);
    }

    @Override // p455z2.InterfaceC14078g
    /* renamed from: k */
    public synchronized byte mo723k(int i) {
        boolean z;
        m1280a();
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        if (i >= this.f35738j) {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        return this.f35739k.m31730D().mo1285k(i);
    }

    @Override // p455z2.InterfaceC14078g
    /* renamed from: l */
    public synchronized long mo722l() {
        m1280a();
        return this.f35739k.m31730D().mo1284l();
    }

    @Override // p455z2.InterfaceC14078g
    public synchronized int size() {
        m1280a();
        return this.f35738j;
    }
}
