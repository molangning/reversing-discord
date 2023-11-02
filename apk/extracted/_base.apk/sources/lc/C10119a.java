package lc;

import java.util.Arrays;

/* renamed from: lc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10119a implements Cloneable {

    /* renamed from: j */
    private int[] f26361j;

    /* renamed from: k */
    private int f26362k;

    public C10119a() {
        this.f26362k = 0;
        this.f26361j = new int[1];
    }

    /* renamed from: l */
    private static int[] m12259l(int i) {
        return new int[(i + 31) / 32];
    }

    /* renamed from: b */
    public void m12267b() {
        int length = this.f26361j.length;
        for (int i = 0; i < length; i++) {
            this.f26361j[i] = 0;
        }
    }

    /* renamed from: c */
    public C10119a clone() {
        return new C10119a((int[]) this.f26361j.clone(), this.f26362k);
    }

    /* renamed from: d */
    public boolean m12265d(int i) {
        return ((1 << (i & 31)) & this.f26361j[i / 32]) != 0;
    }

    /* renamed from: e */
    public int[] m12264e() {
        return this.f26361j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10119a)) {
            return false;
        }
        C10119a c10119a = (C10119a) obj;
        if (this.f26362k != c10119a.f26362k || !Arrays.equals(this.f26361j, c10119a.f26361j)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int m12263f(int i) {
        int i2 = this.f26362k;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f26361j[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f26361j;
            if (i3 == iArr.length) {
                return this.f26362k;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f26362k;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    /* renamed from: g */
    public int m12262g(int i) {
        int i2 = this.f26362k;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f26361j[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f26361j;
            if (i3 == iArr.length) {
                return this.f26362k;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f26362k;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    public int hashCode() {
        return (this.f26362k * 31) + Arrays.hashCode(this.f26361j);
    }

    /* renamed from: j */
    public int m12261j() {
        return this.f26362k;
    }

    /* renamed from: k */
    public boolean m12260k(int i, int i2, boolean z) {
        int i3;
        if (i2 >= i && i >= 0 && i2 <= this.f26362k) {
            if (i2 == i) {
                return true;
            }
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i9 = (2 << i8) - (1 << i3);
                int i10 = this.f26361j[i7] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public void m12258m() {
        int[] iArr = new int[this.f26361j.length];
        int i = (this.f26362k - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f26361j[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f26362k;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f26361j = iArr;
    }

    /* renamed from: n */
    public void m12257n(int i) {
        int[] iArr = this.f26361j;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: p */
    public void m12256p(int i, int i2) {
        this.f26361j[i / 32] = i2;
    }

    public String toString() {
        char c;
        int i = this.f26362k;
        StringBuilder sb2 = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f26362k; i2++) {
            if ((i2 & 7) == 0) {
                sb2.append(' ');
            }
            if (m12265d(i2)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb2.append(c);
        }
        return sb2.toString();
    }

    public C10119a(int i) {
        this.f26362k = i;
        this.f26361j = m12259l(i);
    }

    C10119a(int[] iArr, int i) {
        this.f26361j = iArr;
        this.f26362k = i;
    }
}
