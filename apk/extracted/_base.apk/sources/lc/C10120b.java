package lc;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Arrays;

/* renamed from: lc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10120b implements Cloneable {

    /* renamed from: j */
    private final int f26363j;

    /* renamed from: k */
    private final int f26364k;

    /* renamed from: l */
    private final int f26365l;

    /* renamed from: m */
    private final int[] f26366m;

    public C10120b(int i) {
        this(i, i);
    }

    /* renamed from: b */
    private String m12255b(String str, String str2, String str3) {
        String str4;
        StringBuilder sb2 = new StringBuilder(this.f26364k * (this.f26363j + 1));
        for (int i = 0; i < this.f26364k; i++) {
            for (int i2 = 0; i2 < this.f26363j; i2++) {
                if (m12252e(i2, i)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb2.append(str4);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public C10120b clone() {
        return new C10120b(this.f26363j, this.f26364k, this.f26365l, (int[]) this.f26366m.clone());
    }

    /* renamed from: d */
    public void m12253d(int i, int i2) {
        int i3 = (i2 * this.f26365l) + (i / 32);
        int[] iArr = this.f26366m;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: e */
    public boolean m12252e(int i, int i2) {
        if (((this.f26366m[(i2 * this.f26365l) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10120b)) {
            return false;
        }
        C10120b c10120b = (C10120b) obj;
        if (this.f26363j != c10120b.f26363j || this.f26364k != c10120b.f26364k || this.f26365l != c10120b.f26365l || !Arrays.equals(this.f26366m, c10120b.f26366m)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int[] m12251f() {
        int length = this.f26366m.length - 1;
        while (length >= 0 && this.f26366m[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f26365l;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f26366m[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: g */
    public int[] m12250g() {
        int i = this.f26363j;
        int i2 = this.f26364k;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f26364k; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f26365l;
                if (i6 < i7) {
                    int i8 = this.f26366m[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int hashCode() {
        int i = this.f26363j;
        return (((((((i * 31) + i) * 31) + this.f26364k) * 31) + this.f26365l) * 31) + Arrays.hashCode(this.f26366m);
    }

    /* renamed from: j */
    public int m12249j() {
        return this.f26364k;
    }

    /* renamed from: k */
    public C10119a m12248k(int i, C10119a c10119a) {
        if (c10119a != null && c10119a.m12261j() >= this.f26363j) {
            c10119a.m12267b();
        } else {
            c10119a = new C10119a(this.f26363j);
        }
        int i2 = i * this.f26365l;
        for (int i3 = 0; i3 < this.f26365l; i3++) {
            c10119a.m12256p(i3 << 5, this.f26366m[i2 + i3]);
        }
        return c10119a;
    }

    /* renamed from: l */
    public int[] m12247l() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f26366m;
            if (i >= iArr.length || iArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f26365l;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: m */
    public int m12246m() {
        return this.f26363j;
    }

    /* renamed from: n */
    public void m12245n() {
        int m12246m = m12246m();
        int m12249j = m12249j();
        C10119a c10119a = new C10119a(m12246m);
        C10119a c10119a2 = new C10119a(m12246m);
        for (int i = 0; i < (m12249j + 1) / 2; i++) {
            c10119a = m12248k(i, c10119a);
            int i2 = (m12249j - 1) - i;
            c10119a2 = m12248k(i2, c10119a2);
            c10119a.m12258m();
            c10119a2.m12258m();
            m12242r(i, c10119a2);
            m12242r(i2, c10119a);
        }
    }

    /* renamed from: p */
    public void m12244p(int i, int i2) {
        int i3 = (i2 * this.f26365l) + (i / 32);
        int[] iArr = this.f26366m;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: q */
    public void m12243q(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i >= 0) {
            if (i4 > 0 && i3 > 0) {
                int i5 = i3 + i;
                int i6 = i4 + i2;
                if (i6 <= this.f26364k && i5 <= this.f26363j) {
                    while (i2 < i6) {
                        int i7 = this.f26365l * i2;
                        for (int i8 = i; i8 < i5; i8++) {
                            int[] iArr = this.f26366m;
                            int i9 = (i8 / 32) + i7;
                            iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                        }
                        i2++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    /* renamed from: r */
    public void m12242r(int i, C10119a c10119a) {
        int[] m12264e = c10119a.m12264e();
        int[] iArr = this.f26366m;
        int i2 = this.f26365l;
        System.arraycopy(m12264e, 0, iArr, i * i2, i2);
    }

    /* renamed from: s */
    public String m12241s(String str, String str2) {
        return m12255b(str, str2, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    public String toString() {
        return m12241s("X ", "  ");
    }

    public C10120b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f26363j = i;
            this.f26364k = i2;
            int i3 = (i + 31) / 32;
            this.f26365l = i3;
            this.f26366m = new int[i3 * i2];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    private C10120b(int i, int i2, int i3, int[] iArr) {
        this.f26363j = i;
        this.f26364k = i2;
        this.f26365l = i3;
        this.f26366m = iArr;
    }
}
