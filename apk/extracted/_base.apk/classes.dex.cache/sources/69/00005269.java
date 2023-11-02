package p437y4;

import android.graphics.Bitmap;
import com.facebook.imageutils.C3874a;
import p004a3.InterfaceC0016c;
import p394w2.C13379j;

/* renamed from: y4.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13880f {

    /* renamed from: a */
    private int f35712a;

    /* renamed from: b */
    private long f35713b;

    /* renamed from: c */
    private final int f35714c;

    /* renamed from: d */
    private final int f35715d;

    /* renamed from: e */
    private final InterfaceC0016c<Bitmap> f35716e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y4.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C13881a implements InterfaceC0016c<Bitmap> {
        C13881a() {
            C13880f.this = r1;
        }

        @Override // p004a3.InterfaceC0016c
        /* renamed from: a */
        public void release(Bitmap bitmap) {
            try {
                C13880f.this.m1324a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public C13880f(int i, int i2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        C13379j.m2682b(Boolean.valueOf(i2 > 0));
        this.f35714c = i;
        this.f35715d = i2;
        this.f35716e = new C13881a();
    }

    /* renamed from: a */
    public synchronized void m1324a(Bitmap bitmap) {
        boolean z;
        boolean z2;
        int m30552e = C3874a.m30552e(bitmap);
        if (this.f35712a > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2681c(z, "No bitmaps registered.");
        long j = m30552e;
        if (j <= this.f35713b) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13379j.m2680d(z2, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(m30552e), Long.valueOf(this.f35713b));
        this.f35713b -= j;
        this.f35712a--;
    }

    /* renamed from: b */
    public synchronized int m1323b() {
        return this.f35712a;
    }

    /* renamed from: c */
    public synchronized int m1322c() {
        return this.f35714c;
    }

    /* renamed from: d */
    public synchronized int m1321d() {
        return this.f35715d;
    }

    /* renamed from: e */
    public InterfaceC0016c<Bitmap> m1320e() {
        return this.f35716e;
    }

    /* renamed from: f */
    public synchronized long m1319f() {
        return this.f35713b;
    }

    /* renamed from: g */
    public synchronized boolean m1318g(Bitmap bitmap) {
        int m30552e = C3874a.m30552e(bitmap);
        int i = this.f35712a;
        if (i < this.f35714c) {
            long j = this.f35713b;
            long j2 = m30552e;
            if (j + j2 <= this.f35715d) {
                this.f35712a = i + 1;
                this.f35713b = j + j2;
                return true;
            }
        }
        return false;
    }
}