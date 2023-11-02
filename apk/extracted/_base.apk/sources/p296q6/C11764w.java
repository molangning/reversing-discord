package p296q6;

import p195k8.C9149a;
import p195k8.C9191p0;
import p296q6.InterfaceC11766y;

/* renamed from: q6.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11764w implements InterfaceC11766y {

    /* renamed from: a */
    private final long[] f30664a;

    /* renamed from: b */
    private final long[] f30665b;

    /* renamed from: c */
    private final long f30666c;

    /* renamed from: d */
    private final boolean f30667d;

    public C11764w(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f30667d = z2;
        if (z2 && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f30664a = jArr3;
            long[] jArr4 = new long[i];
            this.f30665b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f30664a = jArr;
            this.f30665b = jArr2;
        }
        this.f30666c = j;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        if (!this.f30667d) {
            return new InterfaceC11766y.C11767a(C11769z.f30673c);
        }
        int m16245i = C9191p0.m16245i(this.f30665b, j, true, true);
        C11769z c11769z = new C11769z(this.f30665b[m16245i], this.f30664a[m16245i]);
        if (c11769z.f30674a != j && m16245i != this.f30665b.length - 1) {
            int i = m16245i + 1;
            return new InterfaceC11766y.C11767a(c11769z, new C11769z(this.f30665b[i], this.f30664a[i]));
        }
        return new InterfaceC11766y.C11767a(c11769z);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return this.f30667d;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f30666c;
    }
}
