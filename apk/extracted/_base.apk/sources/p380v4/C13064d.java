package p380v4;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageutils.C3874a;
import p004a3.InterfaceC0014a;
import p004a3.InterfaceC0016c;
import p394w2.C13379j;

/* renamed from: v4.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13064d extends AbstractC13062b implements InterfaceC0014a {

    /* renamed from: l */
    private CloseableReference<Bitmap> f33845l;

    /* renamed from: m */
    private volatile Bitmap f33846m;

    /* renamed from: n */
    private final InterfaceC13069i f33847n;

    /* renamed from: o */
    private final int f33848o;

    /* renamed from: p */
    private final int f33849p;

    public C13064d(Bitmap bitmap, InterfaceC0016c<Bitmap> interfaceC0016c, InterfaceC13069i interfaceC13069i, int i) {
        this(bitmap, interfaceC0016c, interfaceC13069i, i, 0);
    }

    /* renamed from: s */
    private synchronized CloseableReference<Bitmap> m3361s() {
        CloseableReference<Bitmap> closeableReference;
        closeableReference = this.f33845l;
        this.f33845l = null;
        this.f33846m = null;
        return closeableReference;
    }

    /* renamed from: t */
    private static int m3360t(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* renamed from: v */
    private static int m3359v(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: A */
    public int m3367A() {
        return this.f33849p;
    }

    /* renamed from: D */
    public int m3366D() {
        return this.f33848o;
    }

    @Override // p380v4.AbstractC13063c
    /* renamed from: a */
    public InterfaceC13069i mo3365a() {
        return this.f33847n;
    }

    @Override // p380v4.AbstractC13063c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseableReference<Bitmap> m3361s = m3361s();
        if (m3361s != null) {
            m3361s.close();
        }
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public int getHeight() {
        int i;
        if (this.f33848o % 180 == 0 && (i = this.f33849p) != 5 && i != 7) {
            return m3360t(this.f33846m);
        }
        return m3359v(this.f33846m);
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public int getWidth() {
        int i;
        if (this.f33848o % 180 == 0 && (i = this.f33849p) != 5 && i != 7) {
            return m3359v(this.f33846m);
        }
        return m3360t(this.f33846m);
    }

    @Override // p380v4.AbstractC13063c
    /* renamed from: h */
    public int mo3364h() {
        return C3874a.m30552e(this.f33846m);
    }

    @Override // p380v4.AbstractC13063c
    public synchronized boolean isClosed() {
        boolean z;
        if (this.f33845l == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // p380v4.AbstractC13062b
    /* renamed from: o */
    public Bitmap mo3363o() {
        return this.f33846m;
    }

    /* renamed from: q */
    public synchronized CloseableReference<Bitmap> m3362q() {
        return CloseableReference.m31717s(this.f33845l);
    }

    public C13064d(Bitmap bitmap, InterfaceC0016c<Bitmap> interfaceC0016c, InterfaceC13069i interfaceC13069i, int i, int i2) {
        this.f33846m = (Bitmap) C13379j.m2677g(bitmap);
        this.f33845l = CloseableReference.m31724U(this.f33846m, (InterfaceC0016c) C13379j.m2677g(interfaceC0016c));
        this.f33847n = interfaceC13069i;
        this.f33848o = i;
        this.f33849p = i2;
    }

    public C13064d(CloseableReference<Bitmap> closeableReference, InterfaceC13069i interfaceC13069i, int i) {
        this(closeableReference, interfaceC13069i, i, 0);
    }

    public C13064d(CloseableReference<Bitmap> closeableReference, InterfaceC13069i interfaceC13069i, int i, int i2) {
        CloseableReference<Bitmap> closeableReference2 = (CloseableReference) C13379j.m2677g(closeableReference.m31718q());
        this.f33845l = closeableReference2;
        this.f33846m = closeableReference2.m31730D();
        this.f33847n = interfaceC13069i;
        this.f33848o = i;
        this.f33849p = i2;
    }
}
