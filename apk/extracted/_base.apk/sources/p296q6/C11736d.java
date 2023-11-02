package p296q6;

import java.util.Arrays;
import p195k8.C9191p0;
import p296q6.InterfaceC11766y;

/* renamed from: q6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11736d implements InterfaceC11766y {

    /* renamed from: a */
    public final int f30584a;

    /* renamed from: b */
    public final int[] f30585b;

    /* renamed from: c */
    public final long[] f30586c;

    /* renamed from: d */
    public final long[] f30587d;

    /* renamed from: e */
    public final long[] f30588e;

    /* renamed from: f */
    private final long f30589f;

    public C11736d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f30585b = iArr;
        this.f30586c = jArr;
        this.f30587d = jArr2;
        this.f30588e = jArr3;
        int length = iArr.length;
        this.f30584a = length;
        if (length > 0) {
            this.f30589f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f30589f = 0L;
        }
    }

    /* renamed from: a */
    public int m7031a(long j) {
        return C9191p0.m16245i(this.f30588e, j, true, true);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        int m7031a = m7031a(j);
        C11769z c11769z = new C11769z(this.f30588e[m7031a], this.f30586c[m7031a]);
        if (c11769z.f30674a < j && m7031a != this.f30584a - 1) {
            int i = m7031a + 1;
            return new InterfaceC11766y.C11767a(c11769z, new C11769z(this.f30588e[i], this.f30586c[i]));
        }
        return new InterfaceC11766y.C11767a(c11769z);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return true;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f30589f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f30584a + ", sizes=" + Arrays.toString(this.f30585b) + ", offsets=" + Arrays.toString(this.f30586c) + ", timeUs=" + Arrays.toString(this.f30588e) + ", durationsUs=" + Arrays.toString(this.f30587d) + ")";
    }
}
