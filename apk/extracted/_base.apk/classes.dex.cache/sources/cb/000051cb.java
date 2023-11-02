package p418x6;

import p195k8.C9149a;
import p195k8.C9191p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x6.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13723r {

    /* renamed from: a */
    public final C13720o f35385a;

    /* renamed from: b */
    public final int f35386b;

    /* renamed from: c */
    public final long[] f35387c;

    /* renamed from: d */
    public final int[] f35388d;

    /* renamed from: e */
    public final int f35389e;

    /* renamed from: f */
    public final long[] f35390f;

    /* renamed from: g */
    public final int[] f35391g;

    /* renamed from: h */
    public final long f35392h;

    public C13723r(C13720o c13720o, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9149a.m16452a(z2);
        C9149a.m16452a(iArr2.length == jArr2.length);
        this.f35385a = c13720o;
        this.f35387c = jArr;
        this.f35388d = iArr;
        this.f35389e = i;
        this.f35390f = jArr2;
        this.f35391g = iArr2;
        this.f35392h = j;
        this.f35386b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int m1637a(long j) {
        for (int m16245i = C9191p0.m16245i(this.f35390f, j, true, false); m16245i >= 0; m16245i--) {
            if ((this.f35391g[m16245i] & 1) != 0) {
                return m16245i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m1636b(long j) {
        for (int m16253e = C9191p0.m16253e(this.f35390f, j, true, false); m16253e < this.f35390f.length; m16253e++) {
            if ((this.f35391g[m16253e] & 1) != 0) {
                return m16253e;
            }
        }
        return -1;
    }
}