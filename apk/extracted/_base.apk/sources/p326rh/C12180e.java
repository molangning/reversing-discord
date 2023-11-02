package p326rh;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import java.io.InputStream;
import java.util.ArrayList;
import p326rh.InterfaceC12210q;

/* renamed from: rh.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12180e {

    /* renamed from: a */
    private final byte[] f31700a;

    /* renamed from: b */
    private final boolean f31701b;

    /* renamed from: c */
    private int f31702c;

    /* renamed from: d */
    private int f31703d;

    /* renamed from: e */
    private int f31704e;

    /* renamed from: f */
    private final InputStream f31705f;

    /* renamed from: g */
    private int f31706g;

    /* renamed from: h */
    private boolean f31707h;

    /* renamed from: i */
    private int f31708i;

    /* renamed from: j */
    private int f31709j;

    /* renamed from: k */
    private int f31710k;

    /* renamed from: l */
    private int f31711l;

    /* renamed from: m */
    private int f31712m;

    private C12180e(InputStream inputStream) {
        this.f31707h = false;
        this.f31709j = ViewDefaults.NUMBER_OF_LINES;
        this.f31711l = 64;
        this.f31712m = 67108864;
        this.f31700a = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f31702c = 0;
        this.f31704e = 0;
        this.f31708i = 0;
        this.f31705f = inputStream;
        this.f31701b = false;
    }

    /* renamed from: B */
    public static int m5991B(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C12199k.m5786k();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                if ((read2 & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C12199k.m5786k();
            }
        }
        throw C12199k.m5791f();
    }

    /* renamed from: N */
    private void m5979N() {
        int i = this.f31702c + this.f31703d;
        this.f31702c = i;
        int i2 = this.f31708i + i;
        int i3 = this.f31709j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f31703d = i4;
            this.f31702c = i - i4;
            return;
        }
        this.f31703d = 0;
    }

    /* renamed from: O */
    private void m5978O(int i) {
        if (m5973T(i)) {
            return;
        }
        throw C12199k.m5786k();
    }

    /* renamed from: S */
    private void m5974S(int i) {
        if (i >= 0) {
            int i2 = this.f31708i;
            int i3 = this.f31704e;
            int i4 = i2 + i3 + i;
            int i5 = this.f31709j;
            if (i4 <= i5) {
                int i6 = this.f31702c;
                int i7 = i6 - i3;
                this.f31704e = i6;
                m5978O(1);
                while (true) {
                    int i8 = i - i7;
                    int i9 = this.f31702c;
                    if (i8 > i9) {
                        i7 += i9;
                        this.f31704e = i9;
                        m5978O(1);
                    } else {
                        this.f31704e = i8;
                        return;
                    }
                }
            } else {
                m5975R((i5 - i2) - i3);
                throw C12199k.m5786k();
            }
        } else {
            throw C12199k.m5790g();
        }
    }

    /* renamed from: T */
    private boolean m5973T(int i) {
        int i2 = this.f31704e;
        int i3 = i2 + i;
        int i4 = this.f31702c;
        if (i3 > i4) {
            if (this.f31708i + i2 + i <= this.f31709j && this.f31705f != null) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f31700a;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f31708i += i2;
                    this.f31702c -= i2;
                    this.f31704e = 0;
                }
                InputStream inputStream = this.f31705f;
                byte[] bArr2 = this.f31700a;
                int i5 = this.f31702c;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read != 0 && read >= -1 && read <= this.f31700a.length) {
                    if (read > 0) {
                        this.f31702c += read;
                        if ((this.f31708i + i) - this.f31712m <= 0) {
                            m5979N();
                            if (this.f31702c >= i) {
                                return true;
                            }
                            return m5973T(i);
                        }
                        throw C12199k.m5787j();
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            return false;
        }
        StringBuilder sb3 = new StringBuilder(77);
        sb3.append("refillBuffer() called when ");
        sb3.append(i);
        sb3.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: b */
    public static int m5971b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m5970c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: d */
    private void m5969d(int i) {
        if (this.f31702c - this.f31704e < i) {
            m5978O(i);
        }
    }

    /* renamed from: g */
    public static C12180e m5966g(InputStream inputStream) {
        return new C12180e(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C12180e m5965h(C12207p c12207p) {
        C12180e c12180e = new C12180e(c12207p);
        try {
            c12180e.m5963j(c12207p.size());
            return c12180e;
        } catch (C12199k e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: x */
    private byte[] m5949x(int i) {
        int read;
        if (i <= 0) {
            if (i == 0) {
                return C12196j.f31748a;
            }
            throw C12199k.m5790g();
        }
        int i2 = this.f31708i;
        int i3 = this.f31704e;
        int i4 = i2 + i3 + i;
        int i5 = this.f31709j;
        if (i4 <= i5) {
            if (i < 4096) {
                byte[] bArr = new byte[i];
                int i6 = this.f31702c - i3;
                System.arraycopy(this.f31700a, i3, bArr, 0, i6);
                this.f31704e = this.f31702c;
                int i7 = i - i6;
                m5969d(i7);
                System.arraycopy(this.f31700a, 0, bArr, i6, i7);
                this.f31704e = i7;
                return bArr;
            }
            int i8 = this.f31702c;
            this.f31708i = i2 + i8;
            this.f31704e = 0;
            this.f31702c = 0;
            int i9 = i8 - i3;
            int i10 = i - i9;
            ArrayList<byte[]> arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, (int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                byte[] bArr2 = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    InputStream inputStream = this.f31705f;
                    if (inputStream == null) {
                        read = -1;
                    } else {
                        read = inputStream.read(bArr2, i11, min - i11);
                    }
                    if (read != -1) {
                        this.f31708i += read;
                        i11 += read;
                    } else {
                        throw C12199k.m5786k();
                    }
                }
                i10 -= min;
                arrayList.add(bArr2);
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.f31700a, i3, bArr3, 0, i9);
            for (byte[] bArr4 : arrayList) {
                System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
                i9 += bArr4.length;
            }
            return bArr3;
        }
        m5975R((i5 - i2) - i3);
        throw C12199k.m5786k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        if (r2[r3] < 0) goto L35;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m5992A() {
        /*
            r9 = this;
            int r0 = r9.f31704e
            int r1 = r9.f31702c
            if (r1 != r0) goto L8
            goto L7c
        L8:
            byte[] r2 = r9.f31700a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.f31704e = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7c
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L82
        L2d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3d:
            r1 = r3
            goto L82
        L3f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L82
        L7c:
            long r0 = r9.m5989D()
            int r0 = (int) r0
            return r0
        L82:
            r9.f31704e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p326rh.C12180e.m5992A():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (r2[r0] < 0) goto L41;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m5990C() {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p326rh.C12180e.m5990C():long");
    }

    /* renamed from: D */
    long m5989D() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m5950w = m5950w();
            j |= (m5950w & Byte.MAX_VALUE) << i;
            if ((m5950w & 128) == 0) {
                return j;
            }
        }
        throw C12199k.m5791f();
    }

    /* renamed from: E */
    public int m5988E() {
        return m5948y();
    }

    /* renamed from: F */
    public long m5987F() {
        return m5947z();
    }

    /* renamed from: G */
    public int m5986G() {
        return m5971b(m5992A());
    }

    /* renamed from: H */
    public long m5985H() {
        return m5970c(m5990C());
    }

    /* renamed from: I */
    public String m5984I() {
        int m5992A = m5992A();
        int i = this.f31702c;
        int i2 = this.f31704e;
        if (m5992A <= i - i2 && m5992A > 0) {
            String str = new String(this.f31700a, i2, m5992A, "UTF-8");
            this.f31704e += m5992A;
            return str;
        } else if (m5992A == 0) {
            return "";
        } else {
            return new String(m5949x(m5992A), "UTF-8");
        }
    }

    /* renamed from: J */
    public String m5983J() {
        byte[] m5949x;
        int m5992A = m5992A();
        int i = this.f31704e;
        if (m5992A <= this.f31702c - i && m5992A > 0) {
            m5949x = this.f31700a;
            this.f31704e = i + m5992A;
        } else if (m5992A == 0) {
            return "";
        } else {
            m5949x = m5949x(m5992A);
            i = 0;
        }
        if (C12233y.m5685f(m5949x, i, i + m5992A)) {
            return new String(m5949x, i, m5992A, "UTF-8");
        }
        throw C12199k.m5793d();
    }

    /* renamed from: K */
    public int m5982K() {
        if (m5967f()) {
            this.f31706g = 0;
            return 0;
        }
        int m5992A = m5992A();
        this.f31706g = m5992A;
        if (C12234z.m5681a(m5992A) != 0) {
            return this.f31706g;
        }
        throw C12199k.m5794c();
    }

    /* renamed from: L */
    public int m5981L() {
        return m5992A();
    }

    /* renamed from: M */
    public long m5980M() {
        return m5990C();
    }

    /* renamed from: P */
    public boolean m5977P(int i, C12181f c12181f) {
        int m5680b = C12234z.m5680b(i);
        if (m5680b != 0) {
            if (m5680b != 1) {
                if (m5680b != 2) {
                    if (m5680b != 3) {
                        if (m5680b != 4) {
                            if (m5680b == 5) {
                                int m5948y = m5948y();
                                c12181f.m5891o0(i);
                                c12181f.m5926U(m5948y);
                                return true;
                            }
                            throw C12199k.m5792e();
                        }
                        return false;
                    }
                    c12181f.m5891o0(i);
                    m5976Q(c12181f);
                    int m5679c = C12234z.m5679c(C12234z.m5681a(i), 4);
                    m5972a(m5679c);
                    c12181f.m5891o0(m5679c);
                    return true;
                }
                AbstractC12177d m5961l = m5961l();
                c12181f.m5891o0(i);
                c12181f.m5931P(m5961l);
                return true;
            }
            long m5947z = m5947z();
            c12181f.m5891o0(i);
            c12181f.m5925V(m5947z);
            return true;
        }
        long m5953t = m5953t();
        c12181f.m5891o0(i);
        c12181f.m5869z0(m5953t);
        return true;
    }

    /* renamed from: Q */
    public void m5976Q(C12181f c12181f) {
        int m5982K;
        do {
            m5982K = m5982K();
            if (m5982K == 0) {
                return;
            }
        } while (m5977P(m5982K, c12181f));
    }

    /* renamed from: R */
    public void m5975R(int i) {
        int i2 = this.f31702c;
        int i3 = this.f31704e;
        if (i <= i2 - i3 && i >= 0) {
            this.f31704e = i3 + i;
        } else {
            m5974S(i);
        }
    }

    /* renamed from: a */
    public void m5972a(int i) {
        if (this.f31706g == i) {
            return;
        }
        throw C12199k.m5795b();
    }

    /* renamed from: e */
    public int m5968e() {
        int i = this.f31709j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f31708i + this.f31704e);
    }

    /* renamed from: f */
    public boolean m5967f() {
        return this.f31704e == this.f31702c && !m5973T(1);
    }

    /* renamed from: i */
    public void m5964i(int i) {
        this.f31709j = i;
        m5979N();
    }

    /* renamed from: j */
    public int m5963j(int i) {
        if (i >= 0) {
            int i2 = i + this.f31708i + this.f31704e;
            int i3 = this.f31709j;
            if (i2 <= i3) {
                this.f31709j = i2;
                m5979N();
                return i3;
            }
            throw C12199k.m5786k();
        }
        throw C12199k.m5790g();
    }

    /* renamed from: k */
    public boolean m5962k() {
        return m5990C() != 0;
    }

    /* renamed from: l */
    public AbstractC12177d m5961l() {
        AbstractC12177d m6000i;
        int m5992A = m5992A();
        int i = this.f31702c;
        int i2 = this.f31704e;
        if (m5992A <= i - i2 && m5992A > 0) {
            if (this.f31701b && this.f31707h) {
                m6000i = new C12174c(this.f31700a, this.f31704e, m5992A);
            } else {
                m6000i = AbstractC12177d.m6000i(this.f31700a, i2, m5992A);
            }
            this.f31704e += m5992A;
            return m6000i;
        } else if (m5992A == 0) {
            return AbstractC12177d.f31693j;
        } else {
            return new C12207p(m5949x(m5992A));
        }
    }

    /* renamed from: m */
    public double m5960m() {
        return Double.longBitsToDouble(m5947z());
    }

    /* renamed from: n */
    public int m5959n() {
        return m5992A();
    }

    /* renamed from: o */
    public int m5958o() {
        return m5948y();
    }

    /* renamed from: p */
    public long m5957p() {
        return m5947z();
    }

    /* renamed from: q */
    public float m5956q() {
        return Float.intBitsToFloat(m5948y());
    }

    /* renamed from: r */
    public void m5955r(int i, InterfaceC12210q.InterfaceC12211a interfaceC12211a, C12183g c12183g) {
        int i2 = this.f31710k;
        if (i2 < this.f31711l) {
            this.f31710k = i2 + 1;
            interfaceC12211a.mo5763h(this, c12183g);
            m5972a(C12234z.m5679c(i, 4));
            this.f31710k--;
            return;
        }
        throw C12199k.m5789h();
    }

    /* renamed from: s */
    public int m5954s() {
        return m5992A();
    }

    /* renamed from: t */
    public long m5953t() {
        return m5990C();
    }

    /* renamed from: u */
    public <T extends InterfaceC12210q> T m5952u(InterfaceC12213s<T> interfaceC12213s, C12183g c12183g) {
        int m5992A = m5992A();
        if (this.f31710k < this.f31711l) {
            int m5963j = m5963j(m5992A);
            this.f31710k++;
            T mo5759b = interfaceC12213s.mo5759b(this, c12183g);
            m5972a(0);
            this.f31710k--;
            m5964i(m5963j);
            return mo5759b;
        }
        throw C12199k.m5789h();
    }

    /* renamed from: v */
    public void m5951v(InterfaceC12210q.InterfaceC12211a interfaceC12211a, C12183g c12183g) {
        int m5992A = m5992A();
        if (this.f31710k < this.f31711l) {
            int m5963j = m5963j(m5992A);
            this.f31710k++;
            interfaceC12211a.mo5763h(this, c12183g);
            m5972a(0);
            this.f31710k--;
            m5964i(m5963j);
            return;
        }
        throw C12199k.m5789h();
    }

    /* renamed from: w */
    public byte m5950w() {
        if (this.f31704e == this.f31702c) {
            m5978O(1);
        }
        byte[] bArr = this.f31700a;
        int i = this.f31704e;
        this.f31704e = i + 1;
        return bArr[i];
    }

    /* renamed from: y */
    public int m5948y() {
        int i = this.f31704e;
        if (this.f31702c - i < 4) {
            m5978O(4);
            i = this.f31704e;
        }
        byte[] bArr = this.f31700a;
        this.f31704e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: z */
    public long m5947z() {
        int i = this.f31704e;
        if (this.f31702c - i < 8) {
            m5978O(8);
            i = this.f31704e;
        }
        byte[] bArr = this.f31700a;
        this.f31704e = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private C12180e(C12207p c12207p) {
        this.f31707h = false;
        this.f31709j = ViewDefaults.NUMBER_OF_LINES;
        this.f31711l = 64;
        this.f31712m = 67108864;
        this.f31700a = c12207p.f31760k;
        int mo5771H = c12207p.mo5771H();
        this.f31704e = mo5771H;
        this.f31702c = mo5771H + c12207p.size();
        this.f31708i = -this.f31704e;
        this.f31705f = null;
        this.f31701b = true;
    }
}
