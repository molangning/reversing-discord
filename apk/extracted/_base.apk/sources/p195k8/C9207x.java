package p195k8;

import java.nio.charset.Charset;

/* renamed from: k8.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9207x {

    /* renamed from: a */
    public byte[] f24230a;

    /* renamed from: b */
    private int f24231b;

    /* renamed from: c */
    private int f24232c;

    /* renamed from: d */
    private int f24233d;

    public C9207x() {
        this.f24230a = C9191p0.f24176f;
    }

    /* renamed from: a */
    private void m16133a() {
        int i;
        int i2 = this.f24231b;
        C9149a.m16447f(i2 >= 0 && (i2 < (i = this.f24233d) || (i2 == i && this.f24232c == 0)));
    }

    /* renamed from: b */
    public int m16132b() {
        return ((this.f24233d - this.f24231b) * 8) - this.f24232c;
    }

    /* renamed from: c */
    public void m16131c() {
        if (this.f24232c == 0) {
            return;
        }
        this.f24232c = 0;
        this.f24231b++;
        m16133a();
    }

    /* renamed from: d */
    public int m16130d() {
        boolean z;
        if (this.f24232c == 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        return this.f24231b;
    }

    /* renamed from: e */
    public int m16129e() {
        return (this.f24231b * 8) + this.f24232c;
    }

    /* renamed from: f */
    public void m16128f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f24232c, i2);
        int i3 = this.f24232c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f24230a;
        int i5 = this.f24231b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - min;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f24230a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f24230a;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
        m16116r(i2);
        m16133a();
    }

    /* renamed from: g */
    public boolean m16127g() {
        boolean z;
        if ((this.f24230a[this.f24231b] & (128 >> this.f24232c)) != 0) {
            z = true;
        } else {
            z = false;
        }
        m16117q();
        return z;
    }

    /* renamed from: h */
    public int m16126h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f24232c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f24232c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f24232c = i4;
            byte[] bArr = this.f24230a;
            int i5 = this.f24231b;
            this.f24231b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f24230a;
        int i6 = this.f24231b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f24232c = 0;
            this.f24231b = i6 + 1;
        }
        m16133a();
        return i7;
    }

    /* renamed from: i */
    public void m16125i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f24230a;
            int i4 = this.f24231b;
            int i5 = i4 + 1;
            this.f24231b = i5;
            byte b = bArr2[i4];
            int i6 = this.f24232c;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i7));
        bArr[i3] = b3;
        int i8 = this.f24232c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f24230a;
            int i9 = this.f24231b;
            this.f24231b = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f24232c = i8 - 8;
        }
        int i10 = this.f24232c + i7;
        this.f24232c = i10;
        byte[] bArr4 = this.f24230a;
        int i11 = this.f24231b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.f24232c = 0;
            this.f24231b = i11 + 1;
        }
        m16133a();
    }

    /* renamed from: j */
    public long m16124j(int i) {
        if (i <= 32) {
            return C9191p0.m16270V0(m16126h(i));
        }
        return C9191p0.m16274T0(m16126h(i - 32), m16126h(32));
    }

    /* renamed from: k */
    public void m16123k(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.f24232c == 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        System.arraycopy(this.f24230a, this.f24231b, bArr, i, i2);
        this.f24231b += i2;
        m16133a();
    }

    /* renamed from: l */
    public String m16122l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        m16123k(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void m16121m(C9208y c9208y) {
        m16119o(c9208y.m16094d(), c9208y.m16092f());
        m16118p(c9208y.m16093e() * 8);
    }

    /* renamed from: n */
    public void m16120n(byte[] bArr) {
        m16119o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void m16119o(byte[] bArr, int i) {
        this.f24230a = bArr;
        this.f24231b = 0;
        this.f24232c = 0;
        this.f24233d = i;
    }

    /* renamed from: p */
    public void m16118p(int i) {
        int i2 = i / 8;
        this.f24231b = i2;
        this.f24232c = i - (i2 * 8);
        m16133a();
    }

    /* renamed from: q */
    public void m16117q() {
        int i = this.f24232c + 1;
        this.f24232c = i;
        if (i == 8) {
            this.f24232c = 0;
            this.f24231b++;
        }
        m16133a();
    }

    /* renamed from: r */
    public void m16116r(int i) {
        int i2 = i / 8;
        int i3 = this.f24231b + i2;
        this.f24231b = i3;
        int i4 = this.f24232c + (i - (i2 * 8));
        this.f24232c = i4;
        if (i4 > 7) {
            this.f24231b = i3 + 1;
            this.f24232c = i4 - 8;
        }
        m16133a();
    }

    /* renamed from: s */
    public void m16115s(int i) {
        boolean z;
        if (this.f24232c == 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        this.f24231b += i;
        m16133a();
    }

    public C9207x(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C9207x(byte[] bArr, int i) {
        this.f24230a = bArr;
        this.f24233d = i;
    }
}
