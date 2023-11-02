package p027b7;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p151i6.C7402m;
import p193k6.C9123r0;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;

/* renamed from: b7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2134b implements InterfaceC11746i {

    /* renamed from: f */
    public static final InterfaceC11753o f5998f = new InterfaceC11753o() { // from class: b7.a
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m34142g;
            m34142g = C2134b.m34142g();
            return m34142g;
        }
    };

    /* renamed from: a */
    private InterfaceC11748k f5999a;

    /* renamed from: b */
    private InterfaceC11732b0 f6000b;

    /* renamed from: c */
    private InterfaceC2136b f6001c;

    /* renamed from: d */
    private int f6002d = -1;

    /* renamed from: e */
    private long f6003e = -1;

    /* renamed from: b7.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C2135a implements InterfaceC2136b {

        /* renamed from: m */
        private static final int[] f6004m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f6005n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final InterfaceC11748k f6006a;

        /* renamed from: b */
        private final InterfaceC11732b0 f6007b;

        /* renamed from: c */
        private final C2138c f6008c;

        /* renamed from: d */
        private final int f6009d;

        /* renamed from: e */
        private final byte[] f6010e;

        /* renamed from: f */
        private final C9208y f6011f;

        /* renamed from: g */
        private final int f6012g;

        /* renamed from: h */
        private final Format f6013h;

        /* renamed from: i */
        private int f6014i;

        /* renamed from: j */
        private long f6015j;

        /* renamed from: k */
        private int f6016k;

        /* renamed from: l */
        private long f6017l;

        public C2135a(InterfaceC11748k interfaceC11748k, InterfaceC11732b0 interfaceC11732b0, C2138c c2138c) {
            this.f6006a = interfaceC11748k;
            this.f6007b = interfaceC11732b0;
            this.f6008c = c2138c;
            int max = Math.max(1, c2138c.f6028c / 10);
            this.f6012g = max;
            C9208y c9208y = new C9208y(c2138c.f6032g);
            c9208y.m16076v();
            int m16076v = c9208y.m16076v();
            this.f6009d = m16076v;
            int i = c2138c.f6027b;
            int i2 = (((c2138c.f6030e - (i * 4)) * 8) / (c2138c.f6031f * i)) + 1;
            if (m16076v == i2) {
                int m16239l = C9191p0.m16239l(max, m16076v);
                this.f6010e = new byte[c2138c.f6030e * m16239l];
                this.f6011f = new C9208y(m16239l * m34137h(m16076v, i));
                int i3 = ((c2138c.f6028c * c2138c.f6030e) * 8) / m16076v;
                this.f6013h = new Format.C4362b().m29883e0("audio/raw").m29912G(i3).m29893Z(i3).m29896W(m34137h(max, i)).m29911H(c2138c.f6027b).m29881f0(c2138c.f6028c).m29894Y(2).m29914E();
                return;
            }
            throw new C7402m("Expected frames per block: " + i2 + "; got: " + m16076v);
        }

        /* renamed from: d */
        private void m34141d(byte[] bArr, int i, C9208y c9208y) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f6008c.f6027b; i3++) {
                    m34140e(bArr, i2, i3, c9208y.m16094d());
                }
            }
            int m34138g = m34138g(this.f6009d * i);
            c9208y.m16099P(0);
            c9208y.m16100O(m34138g);
        }

        /* renamed from: e */
        private void m34140e(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3;
            C2138c c2138c = this.f6008c;
            int i4 = c2138c.f6030e;
            int i5 = c2138c.f6027b;
            int i6 = (i * i4) + (i2 * 4);
            int i7 = (i5 * 4) + i6;
            int i8 = (i4 / i5) - 4;
            int i9 = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
            int min = Math.min(bArr[i6 + 2] & 255, 88);
            int i10 = f6005n[min];
            int i11 = ((i * this.f6009d * i5) + i2) * 2;
            bArr2[i11] = (byte) (i9 & 255);
            bArr2[i11 + 1] = (byte) (i9 >> 8);
            for (int i12 = 0; i12 < i8 * 2; i12++) {
                int i13 = bArr[((i12 / 8) * i5 * 4) + i7 + ((i12 / 2) % 4)] & 255;
                if (i12 % 2 == 0) {
                    i3 = i13 & 15;
                } else {
                    i3 = i13 >> 4;
                }
                int i14 = ((((i3 & 7) * 2) + 1) * i10) >> 3;
                if ((i3 & 8) != 0) {
                    i14 = -i14;
                }
                i9 = C9191p0.m16227r(i9 + i14, -32768, 32767);
                i11 += i5 * 2;
                bArr2[i11] = (byte) (i9 & 255);
                bArr2[i11 + 1] = (byte) (i9 >> 8);
                int i15 = min + f6004m[i3];
                int[] iArr = f6005n;
                min = C9191p0.m16227r(i15, 0, iArr.length - 1);
                i10 = iArr[min];
            }
        }

        /* renamed from: f */
        private int m34139f(int i) {
            return i / (this.f6008c.f6027b * 2);
        }

        /* renamed from: g */
        private int m34138g(int i) {
            return m34137h(i, this.f6008c.f6027b);
        }

        /* renamed from: h */
        private static int m34137h(int i, int i2) {
            return i * 2 * i2;
        }

        /* renamed from: i */
        private void m34136i(int i) {
            long m16296I0 = this.f6015j + C9191p0.m16296I0(this.f6017l, 1000000L, this.f6008c.f6028c);
            int m34138g = m34138g(i);
            this.f6007b.mo6162f(m16296I0, 1, m34138g, this.f6016k - m34138g, null);
            this.f6017l += i;
            this.f6016k -= m34138g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please submit an issue!!! */
        @Override // p027b7.C2134b.InterfaceC2136b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo34135a(p296q6.InterfaceC11747j r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f6012g
                int r1 = r6.f6016k
                int r1 = r6.m34139f(r1)
                int r0 = r0 - r1
                int r1 = r6.f6009d
                int r0 = p195k8.C9191p0.m16239l(r0, r1)
                b7.c r1 = r6.f6008c
                int r1 = r1.f6030e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f6014i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f6010e
                int r5 = r6.f6014i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f6014i
                int r4 = r4 + r3
                r6.f6014i = r4
                goto L1e
            L3e:
                int r7 = r6.f6014i
                b7.c r8 = r6.f6008c
                int r8 = r8.f6030e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f6010e
                k8.y r9 = r6.f6011f
                r6.m34141d(r8, r7, r9)
                int r8 = r6.f6014i
                b7.c r9 = r6.f6008c
                int r9 = r9.f6030e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f6014i = r8
                k8.y r7 = r6.f6011f
                int r7 = r7.m16092f()
                q6.b0 r8 = r6.f6007b
                k8.y r9 = r6.f6011f
                r8.mo6170a(r9, r7)
                int r8 = r6.f6016k
                int r8 = r8 + r7
                r6.f6016k = r8
                int r7 = r6.m34139f(r8)
                int r8 = r6.f6012g
                if (r7 < r8) goto L75
                r6.m34136i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f6016k
                int r7 = r6.m34139f(r7)
                if (r7 <= 0) goto L82
                r6.m34136i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p027b7.C2134b.C2135a.mo34135a(q6.j, long):boolean");
        }

        @Override // p027b7.C2134b.InterfaceC2136b
        /* renamed from: b */
        public void mo34134b(int i, long j) {
            this.f6006a.mo3739i(new C2141e(this.f6008c, this.f6009d, i, j));
            this.f6007b.mo6168c(this.f6013h);
        }

        @Override // p027b7.C2134b.InterfaceC2136b
        /* renamed from: c */
        public void mo34133c(long j) {
            this.f6014i = 0;
            this.f6015j = j;
            this.f6016k = 0;
            this.f6017l = 0L;
        }
    }

    /* renamed from: b7.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private interface InterfaceC2136b {
        /* renamed from: a */
        boolean mo34135a(InterfaceC11747j interfaceC11747j, long j);

        /* renamed from: b */
        void mo34134b(int i, long j);

        /* renamed from: c */
        void mo34133c(long j);
    }

    /* renamed from: b7.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C2137c implements InterfaceC2136b {

        /* renamed from: a */
        private final InterfaceC11748k f6018a;

        /* renamed from: b */
        private final InterfaceC11732b0 f6019b;

        /* renamed from: c */
        private final C2138c f6020c;

        /* renamed from: d */
        private final Format f6021d;

        /* renamed from: e */
        private final int f6022e;

        /* renamed from: f */
        private long f6023f;

        /* renamed from: g */
        private int f6024g;

        /* renamed from: h */
        private long f6025h;

        public C2137c(InterfaceC11748k interfaceC11748k, InterfaceC11732b0 interfaceC11732b0, C2138c c2138c, String str, int i) {
            this.f6018a = interfaceC11748k;
            this.f6019b = interfaceC11732b0;
            this.f6020c = c2138c;
            int i2 = (c2138c.f6027b * c2138c.f6031f) / 8;
            if (c2138c.f6030e == i2) {
                int i3 = c2138c.f6028c;
                int i4 = i3 * i2 * 8;
                int max = Math.max(i2, (i3 * i2) / 10);
                this.f6022e = max;
                this.f6021d = new Format.C4362b().m29883e0(str).m29912G(i4).m29893Z(i4).m29896W(max).m29911H(c2138c.f6027b).m29881f0(c2138c.f6028c).m29894Y(i).m29914E();
                return;
            }
            throw new C7402m("Expected block size: " + i2 + "; got: " + c2138c.f6030e);
        }

        @Override // p027b7.C2134b.InterfaceC2136b
        /* renamed from: a */
        public boolean mo34135a(InterfaceC11747j interfaceC11747j, long j) {
            int i;
            C2138c c2138c;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i <= 0 || (i2 = this.f6024g) >= (i3 = this.f6022e)) {
                    break;
                }
                int mo6167d = this.f6019b.mo6167d(interfaceC11747j, (int) Math.min(i3 - i2, j2), true);
                if (mo6167d == -1) {
                    j2 = 0;
                } else {
                    this.f6024g += mo6167d;
                    j2 -= mo6167d;
                }
            }
            int i4 = this.f6020c.f6030e;
            int i5 = this.f6024g / i4;
            if (i5 > 0) {
                int i6 = i5 * i4;
                int i7 = this.f6024g - i6;
                this.f6019b.mo6162f(this.f6023f + C9191p0.m16296I0(this.f6025h, 1000000L, c2138c.f6028c), 1, i6, i7, null);
                this.f6025h += i5;
                this.f6024g = i7;
            }
            if (i <= 0) {
                return true;
            }
            return false;
        }

        @Override // p027b7.C2134b.InterfaceC2136b
        /* renamed from: b */
        public void mo34134b(int i, long j) {
            this.f6018a.mo3739i(new C2141e(this.f6020c, 1, i, j));
            this.f6019b.mo6168c(this.f6021d);
        }

        @Override // p027b7.C2134b.InterfaceC2136b
        /* renamed from: c */
        public void mo34133c(long j) {
            this.f6023f = j;
            this.f6024g = 0;
            this.f6025h = 0L;
        }
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* renamed from: f */
    private void m34143f() {
        C9149a.m16445h(this.f6000b);
        C9191p0.m16243j(this.f5999a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ InterfaceC11746i[] m34142g() {
        return new InterfaceC11746i[]{new C2134b()};
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        InterfaceC2136b interfaceC2136b = this.f6001c;
        if (interfaceC2136b != null) {
            interfaceC2136b.mo34133c(j2);
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f5999a = interfaceC11748k;
        this.f6000b = interfaceC11748k.mo3740e(0, 1);
        interfaceC11748k.mo3738s();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        boolean z;
        m34143f();
        if (this.f6001c == null) {
            C2138c m34132a = C2139d.m34132a(interfaceC11747j);
            if (m34132a != null) {
                int i = m34132a.f6026a;
                if (i == 17) {
                    this.f6001c = new C2135a(this.f5999a, this.f6000b, m34132a);
                } else if (i == 6) {
                    this.f6001c = new C2137c(this.f5999a, this.f6000b, m34132a, "audio/g711-alaw", -1);
                } else if (i == 7) {
                    this.f6001c = new C2137c(this.f5999a, this.f6000b, m34132a, "audio/g711-mlaw", -1);
                } else {
                    int m16535a = C9123r0.m16535a(i, m34132a.f6031f);
                    if (m16535a != 0) {
                        this.f6001c = new C2137c(this.f5999a, this.f6000b, m34132a, "audio/raw", m16535a);
                    } else {
                        throw new C7402m("Unsupported WAV format type: " + m34132a.f6026a);
                    }
                }
            } else {
                throw new C7402m("Unsupported or unrecognized wav header.");
            }
        }
        if (this.f6002d == -1) {
            Pair<Long, Long> m34131b = C2139d.m34131b(interfaceC11747j);
            this.f6002d = ((Long) m34131b.first).intValue();
            long longValue = ((Long) m34131b.second).longValue();
            this.f6003e = longValue;
            this.f6001c.mo34134b(this.f6002d, longValue);
        } else if (interfaceC11747j.getPosition() == 0) {
            interfaceC11747j.mo6965k(this.f6002d);
        }
        if (this.f6003e != -1) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (this.f6001c.mo34135a(interfaceC11747j, this.f6003e - interfaceC11747j.getPosition())) {
            return -1;
        }
        return 0;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        return C2139d.m34132a(interfaceC11747j) != null;
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }
}
