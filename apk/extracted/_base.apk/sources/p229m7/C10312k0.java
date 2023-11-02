package p229m7;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p153i8.C7439a;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7451h;
import p195k8.C9191p0;
import p195k8.C9208y;
import p228m6.C10264b;
import p228m6.C10271g;
import p229m7.C10315l0;
import p296q6.InterfaceC11732b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m7.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10312k0 {

    /* renamed from: a */
    private final InterfaceC7440b f26923a;

    /* renamed from: b */
    private final int f26924b;

    /* renamed from: c */
    private final C9208y f26925c;

    /* renamed from: d */
    private C10313a f26926d;

    /* renamed from: e */
    private C10313a f26927e;

    /* renamed from: f */
    private C10313a f26928f;

    /* renamed from: g */
    private long f26929g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7.k0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10313a {

        /* renamed from: a */
        public final long f26930a;

        /* renamed from: b */
        public final long f26931b;

        /* renamed from: c */
        public boolean f26932c;

        /* renamed from: d */
        public C7439a f26933d;

        /* renamed from: e */
        public C10313a f26934e;

        public C10313a(long j, int i) {
            this.f26930a = j;
            this.f26931b = j + i;
        }

        /* renamed from: a */
        public C10313a m11847a() {
            this.f26933d = null;
            C10313a c10313a = this.f26934e;
            this.f26934e = null;
            return c10313a;
        }

        /* renamed from: b */
        public void m11846b(C7439a c7439a, C10313a c10313a) {
            this.f26933d = c7439a;
            this.f26934e = c10313a;
            this.f26932c = true;
        }

        /* renamed from: c */
        public int m11845c(long j) {
            return ((int) (j - this.f26930a)) + this.f26933d.f19977b;
        }
    }

    public C10312k0(InterfaceC7440b interfaceC7440b) {
        this.f26923a = interfaceC7440b;
        int mo20641e = interfaceC7440b.mo20641e();
        this.f26924b = mo20641e;
        this.f26925c = new C9208y(32);
        C10313a c10313a = new C10313a(0L, mo20641e);
        this.f26926d = c10313a;
        this.f26927e = c10313a;
        this.f26928f = c10313a;
    }

    /* renamed from: a */
    private void m11863a(C10313a c10313a) {
        if (!c10313a.f26932c) {
            return;
        }
        C10313a c10313a2 = this.f26928f;
        int i = (c10313a2.f26932c ? 1 : 0) + (((int) (c10313a2.f26930a - c10313a.f26930a)) / this.f26924b);
        C7439a[] c7439aArr = new C7439a[i];
        for (int i2 = 0; i2 < i; i2++) {
            c7439aArr[i2] = c10313a.f26933d;
            c10313a = c10313a.m11847a();
        }
        this.f26923a.mo20642d(c7439aArr);
    }

    /* renamed from: d */
    private static C10313a m11860d(C10313a c10313a, long j) {
        while (j >= c10313a.f26931b) {
            c10313a = c10313a.f26934e;
        }
        return c10313a;
    }

    /* renamed from: f */
    private void m11858f(int i) {
        long j = this.f26929g + i;
        this.f26929g = j;
        C10313a c10313a = this.f26928f;
        if (j == c10313a.f26931b) {
            this.f26928f = c10313a.f26934e;
        }
    }

    /* renamed from: g */
    private int m11857g(int i) {
        C10313a c10313a = this.f26928f;
        if (!c10313a.f26932c) {
            c10313a.m11846b(this.f26923a.mo20645a(), new C10313a(this.f26928f.f26931b, this.f26924b));
        }
        return Math.min(i, (int) (this.f26928f.f26931b - this.f26929g));
    }

    /* renamed from: h */
    private static C10313a m11856h(C10313a c10313a, long j, ByteBuffer byteBuffer, int i) {
        C10313a m11860d = m11860d(c10313a, j);
        while (i > 0) {
            int min = Math.min(i, (int) (m11860d.f26931b - j));
            byteBuffer.put(m11860d.f26933d.f19976a, m11860d.m11845c(j), min);
            i -= min;
            j += min;
            if (j == m11860d.f26931b) {
                m11860d = m11860d.f26934e;
            }
        }
        return m11860d;
    }

    /* renamed from: i */
    private static C10313a m11855i(C10313a c10313a, long j, byte[] bArr, int i) {
        C10313a m11860d = m11860d(c10313a, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (m11860d.f26931b - j));
            System.arraycopy(m11860d.f26933d.f19976a, m11860d.m11845c(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == m11860d.f26931b) {
                m11860d = m11860d.f26934e;
            }
        }
        return m11860d;
    }

    /* renamed from: j */
    private static C10313a m11854j(C10313a c10313a, C10271g c10271g, C10315l0.C10316a c10316a, C9208y c9208y) {
        boolean z;
        long j = c10316a.f26972b;
        int i = 1;
        c9208y.m16103L(1);
        C10313a m11855i = m11855i(c10313a, j, c9208y.m16094d(), 1);
        long j2 = j + 1;
        byte b = c9208y.m16094d()[0];
        if ((b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = b & Byte.MAX_VALUE;
        C10264b c10264b = c10271g.f26742k;
        byte[] bArr = c10264b.f26730a;
        if (bArr == null) {
            c10264b.f26730a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        C10313a m11855i2 = m11855i(m11855i, j2, c10264b.f26730a, i2);
        long j3 = j2 + i2;
        if (z) {
            c9208y.m16103L(2);
            m11855i2 = m11855i(m11855i2, j3, c9208y.m16094d(), 2);
            j3 += 2;
            i = c9208y.m16105J();
        }
        int i3 = i;
        int[] iArr = c10264b.f26733d;
        if (iArr == null || iArr.length < i3) {
            iArr = new int[i3];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c10264b.f26734e;
        if (iArr3 == null || iArr3.length < i3) {
            iArr3 = new int[i3];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i4 = i3 * 6;
            c9208y.m16103L(i4);
            m11855i2 = m11855i(m11855i2, j3, c9208y.m16094d(), i4);
            j3 += i4;
            c9208y.m16099P(0);
            for (int i5 = 0; i5 < i3; i5++) {
                iArr2[i5] = c9208y.m16105J();
                iArr4[i5] = c9208y.m16107H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = c10316a.f26971a - ((int) (j3 - c10316a.f26972b));
        }
        InterfaceC11732b0.C11733a c11733a = (InterfaceC11732b0.C11733a) C9191p0.m16243j(c10316a.f26973c);
        c10264b.m11983c(i3, iArr2, iArr4, c11733a.f30577b, c10264b.f26730a, c11733a.f30576a, c11733a.f30578c, c11733a.f30579d);
        long j4 = c10316a.f26972b;
        int i6 = (int) (j3 - j4);
        c10316a.f26972b = j4 + i6;
        c10316a.f26971a -= i6;
        return m11855i2;
    }

    /* renamed from: k */
    private static C10313a m11853k(C10313a c10313a, C10271g c10271g, C10315l0.C10316a c10316a, C9208y c9208y) {
        if (c10271g.m11975r()) {
            c10313a = m11854j(c10313a, c10271g, c10316a, c9208y);
        }
        if (c10271g.m11990i()) {
            c9208y.m16103L(4);
            C10313a m11855i = m11855i(c10313a, c10316a.f26972b, c9208y.m16094d(), 4);
            int m16107H = c9208y.m16107H();
            c10316a.f26972b += 4;
            c10316a.f26971a -= 4;
            c10271g.m11977p(m16107H);
            C10313a m11856h = m11856h(m11855i, c10316a.f26972b, c10271g.f26743l, m16107H);
            c10316a.f26972b += m16107H;
            int i = c10316a.f26971a - m16107H;
            c10316a.f26971a = i;
            c10271g.m11972v(i);
            return m11856h(m11856h, c10316a.f26972b, c10271g.f26746o, c10316a.f26971a);
        }
        c10271g.m11977p(c10316a.f26971a);
        return m11856h(c10313a, c10316a.f26972b, c10271g.f26743l, c10316a.f26971a);
    }

    /* renamed from: b */
    public void m11862b(long j) {
        C10313a c10313a;
        if (j == -1) {
            return;
        }
        while (true) {
            c10313a = this.f26926d;
            if (j < c10313a.f26931b) {
                break;
            }
            this.f26923a.mo20644b(c10313a.f26933d);
            this.f26926d = this.f26926d.m11847a();
        }
        if (this.f26927e.f26930a < c10313a.f26930a) {
            this.f26927e = c10313a;
        }
    }

    /* renamed from: c */
    public void m11861c(long j) {
        this.f26929g = j;
        if (j != 0) {
            C10313a c10313a = this.f26926d;
            if (j != c10313a.f26930a) {
                while (this.f26929g > c10313a.f26931b) {
                    c10313a = c10313a.f26934e;
                }
                C10313a c10313a2 = c10313a.f26934e;
                m11863a(c10313a2);
                C10313a c10313a3 = new C10313a(c10313a.f26931b, this.f26924b);
                c10313a.f26934e = c10313a3;
                if (this.f26929g == c10313a.f26931b) {
                    c10313a = c10313a3;
                }
                this.f26928f = c10313a;
                if (this.f26927e == c10313a2) {
                    this.f26927e = c10313a3;
                    return;
                }
                return;
            }
        }
        m11863a(this.f26926d);
        C10313a c10313a4 = new C10313a(this.f26929g, this.f26924b);
        this.f26926d = c10313a4;
        this.f26927e = c10313a4;
        this.f26928f = c10313a4;
    }

    /* renamed from: e */
    public long m11859e() {
        return this.f26929g;
    }

    /* renamed from: l */
    public void m11852l(C10271g c10271g, C10315l0.C10316a c10316a) {
        this.f26927e = m11853k(this.f26927e, c10271g, c10316a, this.f26925c);
    }

    /* renamed from: m */
    public void m11851m() {
        m11863a(this.f26926d);
        C10313a c10313a = new C10313a(0L, this.f26924b);
        this.f26926d = c10313a;
        this.f26927e = c10313a;
        this.f26928f = c10313a;
        this.f26929g = 0L;
        this.f26923a.mo20643c();
    }

    /* renamed from: n */
    public void m11850n() {
        this.f26927e = this.f26926d;
    }

    /* renamed from: o */
    public int m11849o(InterfaceC7451h interfaceC7451h, int i, boolean z) {
        int m11857g = m11857g(i);
        C10313a c10313a = this.f26928f;
        int read = interfaceC7451h.read(c10313a.f26933d.f19976a, c10313a.m11845c(this.f26929g), m11857g);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        m11858f(read);
        return read;
    }

    /* renamed from: p */
    public void m11848p(C9208y c9208y, int i) {
        while (i > 0) {
            int m11857g = m11857g(i);
            C10313a c10313a = this.f26928f;
            c9208y.m16088j(c10313a.f26933d.f19976a, c10313a.m11845c(this.f26929g), m11857g);
            i -= m11857g;
            m11858f(m11857g);
        }
    }
}
