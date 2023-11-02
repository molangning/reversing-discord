package p439y6;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.C11754p;
import p296q6.C11756q;
import p296q6.C11758r;
import p296q6.C11759s;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11766y;
import p439y6.AbstractC13921i;

/* renamed from: y6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13913b extends AbstractC13921i {

    /* renamed from: n */
    private C11759s f35803n;

    /* renamed from: o */
    private C13914a f35804o;

    /* renamed from: y6.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C13914a implements InterfaceC13919g {

        /* renamed from: a */
        private C11759s f35805a;

        /* renamed from: b */
        private C11759s.C11760a f35806b;

        /* renamed from: c */
        private long f35807c = -1;

        /* renamed from: d */
        private long f35808d = -1;

        public C13914a(C11759s c11759s, C11759s.C11760a c11760a) {
            this.f35805a = c11759s;
            this.f35806b = c11760a;
        }

        @Override // p439y6.InterfaceC13919g
        /* renamed from: a */
        public long mo1175a(InterfaceC11747j interfaceC11747j) {
            long j = this.f35808d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f35808d = -1L;
            return j2;
        }

        @Override // p439y6.InterfaceC13919g
        /* renamed from: b */
        public InterfaceC11766y mo1174b() {
            boolean z;
            if (this.f35807c != -1) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16447f(z);
            return new C11758r(this.f35805a, this.f35807c);
        }

        @Override // p439y6.InterfaceC13919g
        /* renamed from: c */
        public void mo1173c(long j) {
            long[] jArr = this.f35806b.f30657a;
            this.f35808d = jArr[C9191p0.m16245i(jArr, j, true, true)];
        }

        /* renamed from: d */
        public void m1204d(long j) {
            this.f35807c = j;
        }
    }

    /* renamed from: n */
    private int m1207n(C9208y c9208y) {
        int i = (c9208y.m16094d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c9208y.m16098Q(4);
            c9208y.m16104K();
        }
        int m6995j = C11754p.m6995j(c9208y, i);
        c9208y.m16099P(0);
        return m6995j;
    }

    /* renamed from: o */
    private static boolean m1206o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: p */
    public static boolean m1205p(C9208y c9208y) {
        if (c9208y.m16097a() >= 5 && c9208y.m16111D() == 127 && c9208y.m16109F() == 1179402563) {
            return true;
        }
        return false;
    }

    @Override // p439y6.AbstractC13921i
    /* renamed from: f */
    protected long mo1171f(C9208y c9208y) {
        if (!m1206o(c9208y.m16094d())) {
            return -1L;
        }
        return m1207n(c9208y);
    }

    @Override // p439y6.AbstractC13921i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: h */
    protected boolean mo1170h(C9208y c9208y, long j, AbstractC13921i.C13923b c13923b) {
        byte[] m16094d = c9208y.m16094d();
        C11759s c11759s = this.f35803n;
        if (c11759s == null) {
            C11759s c11759s2 = new C11759s(m16094d, 17);
            this.f35803n = c11759s2;
            c13923b.f35844a = c11759s2.m6975h(Arrays.copyOfRange(m16094d, 9, c9208y.m16092f()), null);
            return true;
        } else if ((m16094d[0] & Byte.MAX_VALUE) == 3) {
            C11759s.C11760a m6988g = C11756q.m6988g(c9208y);
            C11759s m6980c = c11759s.m6980c(m6988g);
            this.f35803n = m6980c;
            this.f35804o = new C13914a(m6980c, m6988g);
            return true;
        } else if (!m1206o(m16094d)) {
            return true;
        } else {
            C13914a c13914a = this.f35804o;
            if (c13914a != null) {
                c13914a.m1204d(j);
                c13923b.f35845b = this.f35804o;
            }
            C9149a.m16448e(c13923b.f35844a);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y6.AbstractC13921i
    /* renamed from: l */
    public void mo1169l(boolean z) {
        super.mo1169l(z);
        if (z) {
            this.f35803n = null;
            this.f35804o = null;
        }
    }
}
