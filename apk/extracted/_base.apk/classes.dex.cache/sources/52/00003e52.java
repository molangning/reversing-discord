package p195k8;

import java.util.Arrays;

/* renamed from: k8.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9198s {

    /* renamed from: a */
    private int f24200a;

    /* renamed from: b */
    private long[] f24201b;

    public C9198s() {
        this(32);
    }

    /* renamed from: a */
    public void m16176a(long j) {
        int i = this.f24200a;
        long[] jArr = this.f24201b;
        if (i == jArr.length) {
            this.f24201b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f24201b;
        int i2 = this.f24200a;
        this.f24200a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long m16175b(int i) {
        if (i >= 0 && i < this.f24200a) {
            return this.f24201b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f24200a);
    }

    /* renamed from: c */
    public int m16174c() {
        return this.f24200a;
    }

    /* renamed from: d */
    public long[] m16173d() {
        return Arrays.copyOf(this.f24201b, this.f24200a);
    }

    public C9198s(int i) {
        this.f24201b = new long[i];
    }
}