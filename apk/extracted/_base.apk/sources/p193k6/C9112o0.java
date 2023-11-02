package p193k6;

import com.facebook.react.views.text.TypefaceStyle;
import java.nio.ShortBuffer;
import java.util.Arrays;
import p195k8.C9149a;

/* renamed from: k6.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C9112o0 {

    /* renamed from: a */
    private final int f23952a;

    /* renamed from: b */
    private final int f23953b;

    /* renamed from: c */
    private final float f23954c;

    /* renamed from: d */
    private final float f23955d;

    /* renamed from: e */
    private final float f23956e;

    /* renamed from: f */
    private final int f23957f;

    /* renamed from: g */
    private final int f23958g;

    /* renamed from: h */
    private final int f23959h;

    /* renamed from: i */
    private final short[] f23960i;

    /* renamed from: j */
    private short[] f23961j;

    /* renamed from: k */
    private int f23962k;

    /* renamed from: l */
    private short[] f23963l;

    /* renamed from: m */
    private int f23964m;

    /* renamed from: n */
    private short[] f23965n;

    /* renamed from: o */
    private int f23966o;

    /* renamed from: p */
    private int f23967p;

    /* renamed from: q */
    private int f23968q;

    /* renamed from: r */
    private int f23969r;

    /* renamed from: s */
    private int f23970s;

    /* renamed from: t */
    private int f23971t;

    /* renamed from: u */
    private int f23972u;

    /* renamed from: v */
    private int f23973v;

    public C9112o0(int i, int i2, float f, float f2, int i3) {
        this.f23952a = i;
        this.f23953b = i2;
        this.f23954c = f;
        this.f23955d = f2;
        this.f23956e = i / i3;
        this.f23957f = i / TypefaceStyle.NORMAL;
        int i4 = i / 65;
        this.f23958g = i4;
        int i5 = i4 * 2;
        this.f23959h = i5;
        this.f23960i = new short[i5];
        this.f23961j = new short[i5 * i2];
        this.f23963l = new short[i5 * i2];
        this.f23965n = new short[i5 * i2];
    }

    /* renamed from: a */
    private void m16629a(float f, int i) {
        int i2;
        int i3;
        if (this.f23964m == i) {
            return;
        }
        int i4 = this.f23952a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        m16615o(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f23966o;
            boolean z = true;
            if (i6 < i7 - 1) {
                while (true) {
                    i2 = this.f23967p;
                    int i8 = (i2 + 1) * i5;
                    i3 = this.f23968q;
                    if (i8 <= i3 * i4) {
                        break;
                    }
                    this.f23963l = m16624f(this.f23963l, this.f23964m, 1);
                    int i9 = 0;
                    while (true) {
                        int i10 = this.f23953b;
                        if (i9 < i10) {
                            this.f23963l[(this.f23964m * i10) + i9] = m16616n(this.f23965n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                    }
                    this.f23968q++;
                    this.f23964m++;
                }
                int i11 = i2 + 1;
                this.f23967p = i11;
                if (i11 == i4) {
                    this.f23967p = 0;
                    if (i3 != i5) {
                        z = false;
                    }
                    C9149a.m16447f(z);
                    this.f23968q = 0;
                }
                i6++;
            } else {
                m16609u(i7 - 1);
                return;
            }
        }
    }

    /* renamed from: b */
    private void m16628b(float f) {
        int m16617m;
        int i = this.f23962k;
        if (i < this.f23959h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f23969r > 0) {
                m16617m = m16627c(i2);
            } else {
                int m16623g = m16623g(this.f23961j, i2);
                if (f > 1.0d) {
                    m16617m = m16623g + m16607w(this.f23961j, i2, f, m16623g);
                } else {
                    m16617m = m16617m(this.f23961j, i2, f, m16623g);
                }
            }
            i2 += m16617m;
        } while (this.f23959h + i2 <= i);
        m16608v(i2);
    }

    /* renamed from: c */
    private int m16627c(int i) {
        int min = Math.min(this.f23959h, this.f23969r);
        m16626d(this.f23961j, i, min);
        this.f23969r -= min;
        return min;
    }

    /* renamed from: d */
    private void m16626d(short[] sArr, int i, int i2) {
        short[] m16624f = m16624f(this.f23963l, this.f23964m, i2);
        this.f23963l = m16624f;
        int i3 = this.f23953b;
        System.arraycopy(sArr, i * i3, m16624f, this.f23964m * i3, i3 * i2);
        this.f23964m += i2;
    }

    /* renamed from: e */
    private void m16625e(short[] sArr, int i, int i2) {
        int i3 = this.f23959h / i2;
        int i4 = this.f23953b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f23960i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    private short[] m16624f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f23953b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    private int m16623g(short[] sArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.f23952a;
        if (i5 > 4000) {
            i2 = i5 / 4000;
        } else {
            i2 = 1;
        }
        if (this.f23953b == 1 && i2 == 1) {
            i3 = m16622h(sArr, i, this.f23957f, this.f23958g);
        } else {
            m16625e(sArr, i, i2);
            int m16622h = m16622h(this.f23960i, 0, this.f23957f / i2, this.f23958g / i2);
            if (i2 != 1) {
                int i6 = m16622h * i2;
                int i7 = i2 * 4;
                int i8 = i6 - i7;
                int i9 = i6 + i7;
                int i10 = this.f23957f;
                if (i8 < i10) {
                    i8 = i10;
                }
                int i11 = this.f23958g;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (this.f23953b == 1) {
                    i3 = m16622h(sArr, i, i8, i9);
                } else {
                    m16625e(sArr, i, 1);
                    i3 = m16622h(this.f23960i, 0, i8, i9);
                }
            } else {
                i3 = m16622h;
            }
        }
        if (m16613q(this.f23972u, this.f23973v)) {
            i4 = this.f23970s;
        } else {
            i4 = i3;
        }
        this.f23971t = this.f23972u;
        this.f23970s = i3;
        return i4;
    }

    /* renamed from: h */
    private int m16622h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f23953b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f23972u = i6 / i7;
        this.f23973v = i8 / i5;
        return i7;
    }

    /* renamed from: m */
    private int m16617m(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f23969r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] m16624f = m16624f(this.f23963l, this.f23964m, i4);
        this.f23963l = m16624f;
        int i5 = this.f23953b;
        System.arraycopy(sArr, i * i5, m16624f, this.f23964m * i5, i5 * i2);
        m16614p(i3, this.f23953b, this.f23963l, this.f23964m + i2, sArr, i + i2, sArr, i);
        this.f23964m += i4;
        return i3;
    }

    /* renamed from: n */
    private short m16616n(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f23953b];
        int i4 = this.f23968q * i2;
        int i5 = this.f23967p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: o */
    private void m16615o(int i) {
        int i2 = this.f23964m - i;
        short[] m16624f = m16624f(this.f23965n, this.f23966o, i2);
        this.f23965n = m16624f;
        short[] sArr = this.f23963l;
        int i3 = this.f23953b;
        System.arraycopy(sArr, i * i3, m16624f, this.f23966o * i3, i3 * i2);
        this.f23964m = i;
        this.f23966o += i2;
    }

    /* renamed from: p */
    private static void m16614p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: q */
    private boolean m16613q(int i, int i2) {
        if (i == 0 || this.f23970s == 0 || i2 > i * 3 || i * 2 <= this.f23971t * 3) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private void m16612r() {
        int i = this.f23964m;
        float f = this.f23954c;
        float f2 = this.f23955d;
        float f3 = f / f2;
        float f4 = this.f23956e * f2;
        double d = f3;
        if (d <= 1.00001d && d >= 0.99999d) {
            m16626d(this.f23961j, 0, this.f23962k);
            this.f23962k = 0;
        } else {
            m16628b(f3);
        }
        if (f4 != 1.0f) {
            m16629a(f4, i);
        }
    }

    /* renamed from: u */
    private void m16609u(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f23965n;
        int i2 = this.f23953b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f23966o - i) * i2);
        this.f23966o -= i;
    }

    /* renamed from: v */
    private void m16608v(int i) {
        int i2 = this.f23962k - i;
        short[] sArr = this.f23961j;
        int i3 = this.f23953b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f23962k = i2;
    }

    /* renamed from: w */
    private int m16607w(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f23969r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] m16624f = m16624f(this.f23963l, this.f23964m, i3);
        this.f23963l = m16624f;
        m16614p(i3, this.f23953b, m16624f, this.f23964m, sArr, i, sArr, i + i2);
        this.f23964m += i3;
        return i3;
    }

    /* renamed from: i */
    public void m16621i() {
        this.f23962k = 0;
        this.f23964m = 0;
        this.f23966o = 0;
        this.f23967p = 0;
        this.f23968q = 0;
        this.f23969r = 0;
        this.f23970s = 0;
        this.f23971t = 0;
        this.f23972u = 0;
        this.f23973v = 0;
    }

    /* renamed from: j */
    public void m16620j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f23953b, this.f23964m);
        shortBuffer.put(this.f23963l, 0, this.f23953b * min);
        int i = this.f23964m - min;
        this.f23964m = i;
        short[] sArr = this.f23963l;
        int i2 = this.f23953b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: k */
    public int m16619k() {
        return this.f23964m * this.f23953b * 2;
    }

    /* renamed from: l */
    public int m16618l() {
        return this.f23962k * this.f23953b * 2;
    }

    /* renamed from: s */
    public void m16611s() {
        int i;
        int i2 = this.f23962k;
        float f = this.f23954c;
        float f2 = this.f23955d;
        int i3 = this.f23964m + ((int) ((((i2 / (f / f2)) + this.f23966o) / (this.f23956e * f2)) + 0.5f));
        this.f23961j = m16624f(this.f23961j, i2, (this.f23959h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f23959h;
            int i5 = this.f23953b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f23961j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f23962k += i * 2;
        m16612r();
        if (this.f23964m > i3) {
            this.f23964m = i3;
        }
        this.f23962k = 0;
        this.f23969r = 0;
        this.f23966o = 0;
    }

    /* renamed from: t */
    public void m16610t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f23953b;
        int i2 = remaining / i;
        short[] m16624f = m16624f(this.f23961j, this.f23962k, i2);
        this.f23961j = m16624f;
        shortBuffer.get(m16624f, this.f23962k * this.f23953b, ((i * i2) * 2) / 2);
        this.f23962k += i2;
        m16612r();
    }
}
