package p153i8;

import java.util.Arrays;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: i8.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7457n implements InterfaceC7440b {

    /* renamed from: a */
    private final boolean f20012a;

    /* renamed from: b */
    private final int f20013b;

    /* renamed from: c */
    private final byte[] f20014c;

    /* renamed from: d */
    private final C7439a[] f20015d;

    /* renamed from: e */
    private int f20016e;

    /* renamed from: f */
    private int f20017f;

    /* renamed from: g */
    private int f20018g;

    /* renamed from: h */
    private C7439a[] f20019h;

    public C7457n(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // p153i8.InterfaceC7440b
    /* renamed from: a */
    public synchronized C7439a mo20645a() {
        C7439a c7439a;
        this.f20017f++;
        int i = this.f20018g;
        if (i > 0) {
            C7439a[] c7439aArr = this.f20019h;
            int i2 = i - 1;
            this.f20018g = i2;
            c7439a = (C7439a) C9149a.m16448e(c7439aArr[i2]);
            this.f20019h[this.f20018g] = null;
        } else {
            c7439a = new C7439a(new byte[this.f20013b], 0);
        }
        return c7439a;
    }

    @Override // p153i8.InterfaceC7440b
    /* renamed from: b */
    public synchronized void mo20644b(C7439a c7439a) {
        C7439a[] c7439aArr = this.f20015d;
        c7439aArr[0] = c7439a;
        mo20642d(c7439aArr);
    }

    @Override // p153i8.InterfaceC7440b
    /* renamed from: c */
    public synchronized void mo20643c() {
        int i = 0;
        int max = Math.max(0, C9191p0.m16239l(this.f20016e, this.f20013b) - this.f20017f);
        int i2 = this.f20018g;
        if (max >= i2) {
            return;
        }
        if (this.f20014c != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                C7439a c7439a = (C7439a) C9149a.m16448e(this.f20019h[i]);
                if (c7439a.f19976a == this.f20014c) {
                    i++;
                } else {
                    C7439a c7439a2 = (C7439a) C9149a.m16448e(this.f20019h[i3]);
                    if (c7439a2.f19976a != this.f20014c) {
                        i3--;
                    } else {
                        C7439a[] c7439aArr = this.f20019h;
                        c7439aArr[i] = c7439a2;
                        c7439aArr[i3] = c7439a;
                        i3--;
                        i++;
                    }
                }
            }
            max = Math.max(max, i);
            if (max >= this.f20018g) {
                return;
            }
        }
        Arrays.fill(this.f20019h, max, this.f20018g, (Object) null);
        this.f20018g = max;
    }

    @Override // p153i8.InterfaceC7440b
    /* renamed from: d */
    public synchronized void mo20642d(C7439a[] c7439aArr) {
        int i = this.f20018g;
        int length = c7439aArr.length + i;
        C7439a[] c7439aArr2 = this.f20019h;
        if (length >= c7439aArr2.length) {
            this.f20019h = (C7439a[]) Arrays.copyOf(c7439aArr2, Math.max(c7439aArr2.length * 2, i + c7439aArr.length));
        }
        for (C7439a c7439a : c7439aArr) {
            C7439a[] c7439aArr3 = this.f20019h;
            int i2 = this.f20018g;
            this.f20018g = i2 + 1;
            c7439aArr3[i2] = c7439a;
        }
        this.f20017f -= c7439aArr.length;
        notifyAll();
    }

    @Override // p153i8.InterfaceC7440b
    /* renamed from: e */
    public int mo20641e() {
        return this.f20013b;
    }

    /* renamed from: f */
    public synchronized int m20640f() {
        return this.f20017f * this.f20013b;
    }

    /* renamed from: g */
    public synchronized void m20639g() {
        if (this.f20012a) {
            m20638h(0);
        }
    }

    /* renamed from: h */
    public synchronized void m20638h(int i) {
        boolean z;
        if (i < this.f20016e) {
            z = true;
        } else {
            z = false;
        }
        this.f20016e = i;
        if (z) {
            mo20643c();
        }
    }

    public C7457n(boolean z, int i, int i2) {
        C9149a.m16452a(i > 0);
        C9149a.m16452a(i2 >= 0);
        this.f20012a = z;
        this.f20013b = i;
        this.f20018g = i2;
        this.f20019h = new C7439a[i2 + 100];
        if (i2 > 0) {
            this.f20014c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f20019h[i3] = new C7439a(this.f20014c, i3 * i);
            }
        } else {
            this.f20014c = null;
        }
        this.f20015d = new C7439a[1];
    }
}