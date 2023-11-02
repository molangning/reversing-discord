package p326rh;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: rh.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12181f {

    /* renamed from: a */
    private final byte[] f31713a;

    /* renamed from: b */
    private final int f31714b;

    /* renamed from: e */
    private final OutputStream f31717e;

    /* renamed from: d */
    private int f31716d = 0;

    /* renamed from: c */
    private int f31715c = 0;

    /* renamed from: rh.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12182a extends IOException {
        C12182a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C12181f(OutputStream outputStream, byte[] bArr) {
        this.f31717e = outputStream;
        this.f31713a = bArr;
        this.f31714b = bArr.length;
    }

    /* renamed from: A */
    public static int m5946A(int i, long j) {
        return m5943D(i) + m5945B(j);
    }

    /* renamed from: B */
    public static int m5945B(long j) {
        return m5876w(m5939H(j));
    }

    /* renamed from: C */
    public static int m5944C(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m5878v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: D */
    public static int m5943D(int i) {
        return m5878v(C12234z.m5679c(i, 0));
    }

    /* renamed from: E */
    public static int m5942E(int i) {
        return m5878v(i);
    }

    /* renamed from: F */
    public static int m5941F(long j) {
        return m5876w(j);
    }

    /* renamed from: G */
    public static int m5940G(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: H */
    public static long m5939H(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: J */
    public static C12181f m5937J(OutputStream outputStream, int i) {
        return new C12181f(outputStream, new byte[i]);
    }

    /* renamed from: K */
    private void m5936K() {
        OutputStream outputStream = this.f31717e;
        if (outputStream != null) {
            outputStream.write(this.f31713a, 0, this.f31715c);
            this.f31715c = 0;
            return;
        }
        throw new C12182a();
    }

    /* renamed from: a */
    public static int m5920a(int i, boolean z) {
        return m5943D(i) + m5918b(z);
    }

    /* renamed from: b */
    public static int m5918b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m5916c(byte[] bArr) {
        return m5878v(bArr.length) + bArr.length;
    }

    /* renamed from: d */
    public static int m5914d(int i, AbstractC12177d abstractC12177d) {
        return m5943D(i) + m5912e(abstractC12177d);
    }

    /* renamed from: e */
    public static int m5912e(AbstractC12177d abstractC12177d) {
        return m5878v(abstractC12177d.size()) + abstractC12177d.size();
    }

    /* renamed from: f */
    public static int m5910f(int i, double d) {
        return m5943D(i) + m5908g(d);
    }

    /* renamed from: g */
    public static int m5908g(double d) {
        return 8;
    }

    /* renamed from: h */
    public static int m5906h(int i, int i2) {
        return m5943D(i) + m5904i(i2);
    }

    /* renamed from: i */
    public static int m5904i(int i) {
        return m5890p(i);
    }

    /* renamed from: j */
    public static int m5902j(int i) {
        return 4;
    }

    /* renamed from: k */
    public static int m5900k(long j) {
        return 8;
    }

    /* renamed from: l */
    public static int m5898l(int i, float f) {
        return m5943D(i) + m5896m(f);
    }

    /* renamed from: m */
    public static int m5896m(float f) {
        return 4;
    }

    /* renamed from: n */
    public static int m5894n(InterfaceC12210q interfaceC12210q) {
        return interfaceC12210q.mo5767c();
    }

    /* renamed from: o */
    public static int m5892o(int i, int i2) {
        return m5943D(i) + m5890p(i2);
    }

    /* renamed from: p */
    public static int m5890p(int i) {
        if (i >= 0) {
            return m5878v(i);
        }
        return 10;
    }

    /* renamed from: q */
    public static int m5888q(long j) {
        return m5876w(j);
    }

    /* renamed from: r */
    public static int m5886r(C12204m c12204m) {
        int m5782b = c12204m.m5782b();
        return m5878v(m5782b) + m5782b;
    }

    /* renamed from: s */
    public static int m5884s(int i, InterfaceC12210q interfaceC12210q) {
        return m5943D(i) + m5882t(interfaceC12210q);
    }

    /* renamed from: t */
    public static int m5882t(InterfaceC12210q interfaceC12210q) {
        int mo5767c = interfaceC12210q.mo5767c();
        return m5878v(mo5767c) + mo5767c;
    }

    /* renamed from: u */
    public static int m5880u(int i) {
        return i > 4096 ? RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT : i;
    }

    /* renamed from: v */
    public static int m5878v(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: w */
    public static int m5876w(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: x */
    public static int m5874x(int i) {
        return 4;
    }

    /* renamed from: y */
    public static int m5872y(long j) {
        return 8;
    }

    /* renamed from: z */
    public static int m5870z(int i) {
        return m5878v(m5940G(i));
    }

    /* renamed from: I */
    public void m5938I() {
        if (this.f31717e != null) {
            m5936K();
        }
    }

    /* renamed from: L */
    public void m5935L(int i, boolean z) {
        m5875w0(i, 0);
        m5934M(z);
    }

    /* renamed from: M */
    public void m5934M(boolean z) {
        m5905h0(z ? 1 : 0);
    }

    /* renamed from: N */
    public void m5933N(byte[] bArr) {
        m5891o0(bArr.length);
        m5899k0(bArr);
    }

    /* renamed from: O */
    public void m5932O(int i, AbstractC12177d abstractC12177d) {
        m5875w0(i, 2);
        m5931P(abstractC12177d);
    }

    /* renamed from: P */
    public void m5931P(AbstractC12177d abstractC12177d) {
        m5891o0(abstractC12177d.size());
        m5903i0(abstractC12177d);
    }

    /* renamed from: Q */
    public void m5930Q(int i, double d) {
        m5875w0(i, 1);
        m5929R(d);
    }

    /* renamed from: R */
    public void m5929R(double d) {
        m5893n0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: S */
    public void m5928S(int i, int i2) {
        m5875w0(i, 0);
        m5927T(i2);
    }

    /* renamed from: T */
    public void m5927T(int i) {
        m5917b0(i);
    }

    /* renamed from: U */
    public void m5926U(int i) {
        m5895m0(i);
    }

    /* renamed from: V */
    public void m5925V(long j) {
        m5893n0(j);
    }

    /* renamed from: W */
    public void m5924W(int i, float f) {
        m5875w0(i, 5);
        m5923X(f);
    }

    /* renamed from: X */
    public void m5923X(float f) {
        m5895m0(Float.floatToRawIntBits(f));
    }

    /* renamed from: Y */
    public void m5922Y(int i, InterfaceC12210q interfaceC12210q) {
        m5875w0(i, 3);
        m5921Z(interfaceC12210q);
        m5875w0(i, 4);
    }

    /* renamed from: Z */
    public void m5921Z(InterfaceC12210q interfaceC12210q) {
        interfaceC12210q.mo5766d(this);
    }

    /* renamed from: a0 */
    public void m5919a0(int i, int i2) {
        m5875w0(i, 0);
        m5917b0(i2);
    }

    /* renamed from: b0 */
    public void m5917b0(int i) {
        if (i >= 0) {
            m5891o0(i);
        } else {
            m5889p0(i);
        }
    }

    /* renamed from: c0 */
    public void m5915c0(long j) {
        m5889p0(j);
    }

    /* renamed from: d0 */
    public void m5913d0(int i, InterfaceC12210q interfaceC12210q) {
        m5875w0(i, 2);
        m5911e0(interfaceC12210q);
    }

    /* renamed from: e0 */
    public void m5911e0(InterfaceC12210q interfaceC12210q) {
        m5891o0(interfaceC12210q.mo5767c());
        interfaceC12210q.mo5766d(this);
    }

    /* renamed from: f0 */
    public void m5909f0(int i, InterfaceC12210q interfaceC12210q) {
        m5875w0(1, 3);
        m5873x0(2, i);
        m5913d0(3, interfaceC12210q);
        m5875w0(1, 4);
    }

    /* renamed from: g0 */
    public void m5907g0(byte b) {
        if (this.f31715c == this.f31714b) {
            m5936K();
        }
        byte[] bArr = this.f31713a;
        int i = this.f31715c;
        this.f31715c = i + 1;
        bArr[i] = b;
        this.f31716d++;
    }

    /* renamed from: h0 */
    public void m5905h0(int i) {
        m5907g0((byte) i);
    }

    /* renamed from: i0 */
    public void m5903i0(AbstractC12177d abstractC12177d) {
        m5901j0(abstractC12177d, 0, abstractC12177d.size());
    }

    /* renamed from: j0 */
    public void m5901j0(AbstractC12177d abstractC12177d, int i, int i2) {
        int i3 = this.f31714b;
        int i4 = this.f31715c;
        if (i3 - i4 >= i2) {
            abstractC12177d.m5998o(this.f31713a, i, i4, i2);
            this.f31715c += i2;
            this.f31716d += i2;
            return;
        }
        int i5 = i3 - i4;
        abstractC12177d.m5998o(this.f31713a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f31715c = this.f31714b;
        this.f31716d += i5;
        m5936K();
        if (i7 <= this.f31714b) {
            abstractC12177d.m5998o(this.f31713a, i6, 0, i7);
            this.f31715c = i7;
        } else {
            abstractC12177d.m6005D(this.f31717e, i6, i7);
        }
        this.f31716d += i7;
    }

    /* renamed from: k0 */
    public void m5899k0(byte[] bArr) {
        m5897l0(bArr, 0, bArr.length);
    }

    /* renamed from: l0 */
    public void m5897l0(byte[] bArr, int i, int i2) {
        int i3 = this.f31714b;
        int i4 = this.f31715c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f31713a, i4, i2);
            this.f31715c += i2;
            this.f31716d += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f31713a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f31715c = this.f31714b;
        this.f31716d += i5;
        m5936K();
        if (i7 <= this.f31714b) {
            System.arraycopy(bArr, i6, this.f31713a, 0, i7);
            this.f31715c = i7;
        } else {
            this.f31717e.write(bArr, i6, i7);
        }
        this.f31716d += i7;
    }

    /* renamed from: m0 */
    public void m5895m0(int i) {
        m5905h0(i & 255);
        m5905h0((i >> 8) & 255);
        m5905h0((i >> 16) & 255);
        m5905h0((i >> 24) & 255);
    }

    /* renamed from: n0 */
    public void m5893n0(long j) {
        m5905h0(((int) j) & 255);
        m5905h0(((int) (j >> 8)) & 255);
        m5905h0(((int) (j >> 16)) & 255);
        m5905h0(((int) (j >> 24)) & 255);
        m5905h0(((int) (j >> 32)) & 255);
        m5905h0(((int) (j >> 40)) & 255);
        m5905h0(((int) (j >> 48)) & 255);
        m5905h0(((int) (j >> 56)) & 255);
    }

    /* renamed from: o0 */
    public void m5891o0(int i) {
        while ((i & (-128)) != 0) {
            m5905h0((i & 127) | 128);
            i >>>= 7;
        }
        m5905h0(i);
    }

    /* renamed from: p0 */
    public void m5889p0(long j) {
        while (((-128) & j) != 0) {
            m5905h0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m5905h0((int) j);
    }

    /* renamed from: q0 */
    public void m5887q0(int i) {
        m5895m0(i);
    }

    /* renamed from: r0 */
    public void m5885r0(long j) {
        m5893n0(j);
    }

    /* renamed from: s0 */
    public void m5883s0(int i) {
        m5891o0(m5940G(i));
    }

    /* renamed from: t0 */
    public void m5881t0(int i, long j) {
        m5875w0(i, 0);
        m5879u0(j);
    }

    /* renamed from: u0 */
    public void m5879u0(long j) {
        m5889p0(m5939H(j));
    }

    /* renamed from: v0 */
    public void m5877v0(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m5891o0(bytes.length);
        m5899k0(bytes);
    }

    /* renamed from: w0 */
    public void m5875w0(int i, int i2) {
        m5891o0(C12234z.m5679c(i, i2));
    }

    /* renamed from: x0 */
    public void m5873x0(int i, int i2) {
        m5875w0(i, 0);
        m5871y0(i2);
    }

    /* renamed from: y0 */
    public void m5871y0(int i) {
        m5891o0(i);
    }

    /* renamed from: z0 */
    public void m5869z0(long j) {
        m5889p0(j);
    }
}