package p195k8;

import java.nio.charset.Charset;
import java.util.Arrays;
import p102fb.C6374d;

/* renamed from: k8.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9208y {

    /* renamed from: a */
    private byte[] f24234a;

    /* renamed from: b */
    private int f24235b;

    /* renamed from: c */
    private int f24236c;

    public C9208y() {
        this.f24234a = C9191p0.f24176f;
    }

    /* renamed from: A */
    public String m16114A(int i) {
        return m16113B(i, C6374d.f18023c);
    }

    /* renamed from: B */
    public String m16113B(int i, Charset charset) {
        String str = new String(this.f24234a, this.f24235b, i, charset);
        this.f24235b += i;
        return str;
    }

    /* renamed from: C */
    public int m16112C() {
        return (m16111D() << 21) | (m16111D() << 14) | (m16111D() << 7) | m16111D();
    }

    /* renamed from: D */
    public int m16111D() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        this.f24235b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: E */
    public int m16110E() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f24235b = i2 + 1 + 2;
        return i3;
    }

    /* renamed from: F */
    public long m16109F() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f24235b = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (bArr[i4] & 255);
    }

    /* renamed from: G */
    public int m16108G() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f24235b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: H */
    public int m16107H() {
        int m16084n = m16084n();
        if (m16084n >= 0) {
            return m16084n;
        }
        throw new IllegalStateException("Top bit not zero: " + m16084n);
    }

    /* renamed from: I */
    public long m16106I() {
        long m16075w = m16075w();
        if (m16075w >= 0) {
            return m16075w;
        }
        throw new IllegalStateException("Top bit not zero: " + m16075w);
    }

    /* renamed from: J */
    public int m16105J() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        this.f24235b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: K */
    public long m16104K() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.f24234a[this.f24235b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.f24234a[this.f24235b + i] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f24235b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: L */
    public void m16103L(int i) {
        m16101N(m16096b() < i ? new byte[i] : this.f24234a, i);
    }

    /* renamed from: M */
    public void m16102M(byte[] bArr) {
        m16101N(bArr, bArr.length);
    }

    /* renamed from: N */
    public void m16101N(byte[] bArr, int i) {
        this.f24234a = bArr;
        this.f24236c = i;
        this.f24235b = 0;
    }

    /* renamed from: O */
    public void m16100O(int i) {
        boolean z;
        if (i >= 0 && i <= this.f24234a.length) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f24236c = i;
    }

    /* renamed from: P */
    public void m16099P(int i) {
        boolean z;
        if (i >= 0 && i <= this.f24236c) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f24235b = i;
    }

    /* renamed from: Q */
    public void m16098Q(int i) {
        m16099P(this.f24235b + i);
    }

    /* renamed from: a */
    public int m16097a() {
        return this.f24236c - this.f24235b;
    }

    /* renamed from: b */
    public int m16096b() {
        return this.f24234a.length;
    }

    /* renamed from: c */
    public void m16095c(int i) {
        if (i > m16096b()) {
            this.f24234a = Arrays.copyOf(this.f24234a, i);
        }
    }

    /* renamed from: d */
    public byte[] m16094d() {
        return this.f24234a;
    }

    /* renamed from: e */
    public int m16093e() {
        return this.f24235b;
    }

    /* renamed from: f */
    public int m16092f() {
        return this.f24236c;
    }

    /* renamed from: g */
    public char m16091g() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: h */
    public int m16090h() {
        return this.f24234a[this.f24235b] & 255;
    }

    /* renamed from: i */
    public void m16089i(C9207x c9207x, int i) {
        m16088j(c9207x.f24230a, 0, i);
        c9207x.m16118p(0);
    }

    /* renamed from: j */
    public void m16088j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f24234a, this.f24235b, bArr, i, i2);
        this.f24235b += i2;
    }

    /* renamed from: k */
    public String m16087k(char c) {
        if (m16097a() == 0) {
            return null;
        }
        int i = this.f24235b;
        while (i < this.f24236c && this.f24234a[i] != c) {
            i++;
        }
        byte[] bArr = this.f24234a;
        int i2 = this.f24235b;
        String m16303F = C9191p0.m16303F(bArr, i2, i - i2);
        this.f24235b = i;
        if (i < this.f24236c) {
            this.f24235b = i + 1;
        }
        return m16303F;
    }

    /* renamed from: l */
    public double m16086l() {
        return Double.longBitsToDouble(m16075w());
    }

    /* renamed from: m */
    public float m16085m() {
        return Float.intBitsToFloat(m16084n());
    }

    /* renamed from: n */
    public int m16084n() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f24235b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    /* renamed from: o */
    public int m16083o() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f24235b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: p */
    public String m16082p() {
        if (m16097a() == 0) {
            return null;
        }
        int i = this.f24235b;
        while (i < this.f24236c && !C9191p0.m16228q0(this.f24234a[i])) {
            i++;
        }
        int i2 = this.f24235b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f24234a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f24235b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f24234a;
        int i3 = this.f24235b;
        String m16303F = C9191p0.m16303F(bArr2, i3, i - i3);
        this.f24235b = i;
        int i4 = this.f24236c;
        if (i == i4) {
            return m16303F;
        }
        byte[] bArr3 = this.f24234a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f24235b = i5;
            if (i5 == i4) {
                return m16303F;
            }
        }
        int i6 = this.f24235b;
        if (bArr3[i6] == 10) {
            this.f24235b = i6 + 1;
        }
        return m16303F;
    }

    /* renamed from: q */
    public int m16081q() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.f24235b = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    /* renamed from: r */
    public long m16080r() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f24235b = i8 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48) | ((bArr[i8] & 255) << 56);
    }

    /* renamed from: s */
    public short m16079s() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        this.f24235b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: t */
    public long m16078t() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f24235b = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    /* renamed from: u */
    public int m16077u() {
        int m16081q = m16081q();
        if (m16081q >= 0) {
            return m16081q;
        }
        throw new IllegalStateException("Top bit not zero: " + m16081q);
    }

    /* renamed from: v */
    public int m16076v() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        this.f24235b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: w */
    public long m16075w() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f24235b = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
    }

    /* renamed from: x */
    public String m16074x() {
        return m16087k((char) 0);
    }

    /* renamed from: y */
    public String m16073y(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.f24235b;
        int i4 = (i3 + i) - 1;
        if (i4 < this.f24236c && this.f24234a[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        String m16303F = C9191p0.m16303F(this.f24234a, i3, i2);
        this.f24235b += i;
        return m16303F;
    }

    /* renamed from: z */
    public short m16072z() {
        byte[] bArr = this.f24234a;
        int i = this.f24235b;
        int i2 = i + 1;
        this.f24235b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public C9208y(int i) {
        this.f24234a = new byte[i];
        this.f24236c = i;
    }

    public C9208y(byte[] bArr) {
        this.f24234a = bArr;
        this.f24236c = bArr.length;
    }

    public C9208y(byte[] bArr, int i) {
        this.f24234a = bArr;
        this.f24236c = i;
    }
}
