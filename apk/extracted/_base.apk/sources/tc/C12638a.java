package tc;

import com.facebook.react.uimanager.ViewDefaults;
import com.google.zxing.Result;
import java.util.Arrays;
import java.util.Map;
import lc.C10119a;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;

/* renamed from: tc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12638a extends AbstractC12648k {

    /* renamed from: d */
    static final char[] f32749d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f32750e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f32751f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f32752a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f32753b = new int[80];

    /* renamed from: c */
    private int f32754c = 0;

    /* renamed from: g */
    static boolean m4660g(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m4659h(int i) {
        int[] iArr = this.f32753b;
        int i2 = this.f32754c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f32754c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[i3 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f32753b = iArr2;
        }
    }

    /* renamed from: i */
    private int m4658i() {
        for (int i = 1; i < this.f32754c; i += 2) {
            int m4656k = m4656k(i);
            if (m4656k != -1 && m4660g(f32751f, f32749d[m4656k])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f32753b[i3];
                }
                if (i == 1 || this.f32753b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw C7064j.m21461a();
    }

    /* renamed from: j */
    private void m4657j(C10119a c10119a) {
        int i = 0;
        this.f32754c = 0;
        int m12262g = c10119a.m12262g(0);
        int m12261j = c10119a.m12261j();
        if (m12262g < m12261j) {
            boolean z = true;
            while (m12262g < m12261j) {
                if (c10119a.m12265d(m12262g) != z) {
                    i++;
                } else {
                    m4659h(i);
                    z = !z;
                    i = 1;
                }
                m12262g++;
            }
            m4659h(i);
            return;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: k */
    private int m4656k(int i) {
        int i2;
        int i3 = i + 7;
        if (i3 >= this.f32754c) {
            return -1;
        }
        int[] iArr = this.f32753b;
        int i4 = ViewDefaults.NUMBER_OF_LINES;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = i; i8 < i3; i8 += 2) {
            int i9 = iArr[i8];
            if (i9 < i6) {
                i6 = i9;
            }
            if (i9 > i7) {
                i7 = i9;
            }
        }
        int i10 = (i6 + i7) / 2;
        int i11 = 0;
        for (int i12 = i + 1; i12 < i3; i12 += 2) {
            int i13 = iArr[i12];
            if (i13 < i4) {
                i4 = i13;
            }
            if (i13 > i11) {
                i11 = i13;
            }
        }
        int i14 = (i4 + i11) / 2;
        int i15 = 128;
        int i16 = 0;
        for (int i17 = 0; i17 < 7; i17++) {
            if ((i17 & 1) == 0) {
                i2 = i10;
            } else {
                i2 = i14;
            }
            i15 >>= 1;
            if (iArr[i + i17] > i2) {
                i16 |= i15;
            }
        }
        while (true) {
            int[] iArr2 = f32750e;
            if (i5 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i5] == i16) {
                return i5;
            }
            i5++;
        }
    }

    /* renamed from: l */
    private void m4655l(int i) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f32752a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f32750e[this.f32752a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f32753b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            int i10 = iArr[i9];
            int i11 = iArr2[i9];
            float f = ((iArr[i8] / iArr2[i8]) + (i10 / i11)) / 2.0f;
            fArr2[i9] = f;
            fArr[i8] = f;
            fArr[i9] = ((i10 * 2.0f) + 1.5f) / i11;
        }
        loop3: while (true) {
            int i12 = f32750e[this.f32752a.charAt(i2)];
            for (int i13 = 6; i13 >= 0; i13--) {
                int i14 = (i13 & 1) + ((i12 & 1) << 1);
                float f2 = this.f32753b[i + i13];
                if (f2 < fArr2[i14] || f2 > fArr[i14]) {
                    break loop3;
                }
                i12 >>= 1;
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw C7064j.m21461a();
    }

    @Override // tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        Arrays.fill(this.f32753b, 0);
        m4657j(c10119a);
        int m4658i = m4658i();
        this.f32752a.setLength(0);
        int i2 = m4658i;
        do {
            int m4656k = m4656k(i2);
            if (m4656k != -1) {
                this.f32752a.append((char) m4656k);
                i2 += 8;
                if (this.f32752a.length() > 1 && m4660g(f32751f, f32749d[m4656k])) {
                    break;
                }
            } else {
                throw C7064j.m21461a();
            }
        } while (i2 < this.f32754c);
        int i3 = i2 - 1;
        int i4 = this.f32753b[i3];
        int i5 = 0;
        for (int i6 = -8; i6 < -1; i6++) {
            i5 += this.f32753b[i2 + i6];
        }
        if (i2 < this.f32754c && i4 < i5 / 2) {
            throw C7064j.m21461a();
        }
        m4655l(m4658i);
        for (int i7 = 0; i7 < this.f32752a.length(); i7++) {
            StringBuilder sb2 = this.f32752a;
            sb2.setCharAt(i7, f32749d[sb2.charAt(i7)]);
        }
        char charAt = this.f32752a.charAt(0);
        char[] cArr = f32751f;
        if (m4660g(cArr, charAt)) {
            StringBuilder sb3 = this.f32752a;
            if (m4660g(cArr, sb3.charAt(sb3.length() - 1))) {
                if (this.f32752a.length() > 3) {
                    if (map == null || !map.containsKey(EnumC7059e.RETURN_CODABAR_START_END)) {
                        StringBuilder sb4 = this.f32752a;
                        sb4.deleteCharAt(sb4.length() - 1);
                        this.f32752a.deleteCharAt(0);
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < m4658i; i9++) {
                        i8 += this.f32753b[i9];
                    }
                    float f = i8;
                    while (m4658i < i3) {
                        i8 += this.f32753b[m4658i];
                        m4658i++;
                    }
                    float f2 = i;
                    return new Result(this.f32752a.toString(), null, new C7069o[]{new C7069o(f, f2), new C7069o(i8, f2)}, EnumC7055a.CODABAR);
                }
                throw C7064j.m21461a();
            }
            throw C7064j.m21461a();
        }
        throw C7064j.m21461a();
    }
}
