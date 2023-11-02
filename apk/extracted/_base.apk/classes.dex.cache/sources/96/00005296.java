package p439y6;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.C11737d0;
import p439y6.AbstractC13921i;

/* renamed from: y6.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13925j extends AbstractC13921i {

    /* renamed from: n */
    private C13926a f35846n;

    /* renamed from: o */
    private int f35847o;

    /* renamed from: p */
    private boolean f35848p;

    /* renamed from: q */
    private C11737d0.C11741d f35849q;

    /* renamed from: r */
    private C11737d0.C11739b f35850r;

    /* renamed from: y6.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13926a {

        /* renamed from: a */
        public final C11737d0.C11741d f35851a;

        /* renamed from: b */
        public final C11737d0.C11739b f35852b;

        /* renamed from: c */
        public final byte[] f35853c;

        /* renamed from: d */
        public final C11737d0.C11740c[] f35854d;

        /* renamed from: e */
        public final int f35855e;

        public C13926a(C11737d0.C11741d c11741d, C11737d0.C11739b c11739b, byte[] bArr, C11737d0.C11740c[] c11740cArr, int i) {
            this.f35851a = c11741d;
            this.f35852b = c11739b;
            this.f35853c = bArr;
            this.f35854d = c11740cArr;
            this.f35855e = i;
        }
    }

    /* renamed from: n */
    static void m1168n(C9208y c9208y, long j) {
        if (c9208y.m16096b() < c9208y.m16092f() + 4) {
            c9208y.m16102M(Arrays.copyOf(c9208y.m16094d(), c9208y.m16092f() + 4));
        } else {
            c9208y.m16100O(c9208y.m16092f() + 4);
        }
        byte[] m16094d = c9208y.m16094d();
        m16094d[c9208y.m16092f() - 4] = (byte) (j & 255);
        m16094d[c9208y.m16092f() - 3] = (byte) ((j >>> 8) & 255);
        m16094d[c9208y.m16092f() - 2] = (byte) ((j >>> 16) & 255);
        m16094d[c9208y.m16092f() - 1] = (byte) ((j >>> 24) & 255);
    }

    /* renamed from: o */
    private static int m1167o(byte b, C13926a c13926a) {
        if (!c13926a.f35854d[m1166p(b, c13926a.f35855e, 1)].f30598a) {
            return c13926a.f35851a.f30608g;
        }
        return c13926a.f35851a.f30609h;
    }

    /* renamed from: p */
    static int m1166p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: r */
    public static boolean m1164r(C9208y c9208y) {
        try {
            return C11737d0.m7019l(1, c9208y, true);
        } catch (C7402m unused) {
            return false;
        }
    }

    @Override // p439y6.AbstractC13921i
    /* renamed from: e */
    public void mo1172e(long j) {
        boolean z;
        super.mo1172e(j);
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f35848p = z;
        C11737d0.C11741d c11741d = this.f35849q;
        if (c11741d != null) {
            i = c11741d.f30608g;
        }
        this.f35847o = i;
    }

    @Override // p439y6.AbstractC13921i
    /* renamed from: f */
    protected long mo1171f(C9208y c9208y) {
        int i = 0;
        if ((c9208y.m16094d()[0] & 1) == 1) {
            return -1L;
        }
        int m1167o = m1167o(c9208y.m16094d()[0], (C13926a) C9149a.m16445h(this.f35846n));
        if (this.f35848p) {
            i = (this.f35847o + m1167o) / 4;
        }
        long j = i;
        m1168n(c9208y, j);
        this.f35848p = true;
        this.f35847o = m1167o;
        return j;
    }

    @Override // p439y6.AbstractC13921i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: h */
    protected boolean mo1170h(C9208y c9208y, long j, AbstractC13921i.C13923b c13923b) {
        if (this.f35846n != null) {
            C9149a.m16448e(c13923b.f35844a);
            return false;
        }
        C13926a m1165q = m1165q(c9208y);
        this.f35846n = m1165q;
        if (m1165q == null) {
            return true;
        }
        C11737d0.C11741d c11741d = m1165q.f35851a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c11741d.f30611j);
        arrayList.add(m1165q.f35853c);
        c13923b.f35844a = new Format.C4362b().m29883e0("audio/vorbis").m29912G(c11741d.f30606e).m29893Z(c11741d.f30605d).m29911H(c11741d.f30603b).m29881f0(c11741d.f30604c).m29899T(arrayList).m29914E();
        return true;
    }

    @Override // p439y6.AbstractC13921i
    /* renamed from: l */
    public void mo1169l(boolean z) {
        super.mo1169l(z);
        if (z) {
            this.f35846n = null;
            this.f35849q = null;
            this.f35850r = null;
        }
        this.f35847o = 0;
        this.f35848p = false;
    }

    /* renamed from: q */
    C13926a m1165q(C9208y c9208y) {
        C11737d0.C11741d c11741d = this.f35849q;
        if (c11741d == null) {
            this.f35849q = C11737d0.m7021j(c9208y);
            return null;
        }
        C11737d0.C11739b c11739b = this.f35850r;
        if (c11739b == null) {
            this.f35850r = C11737d0.m7023h(c9208y);
            return null;
        }
        byte[] bArr = new byte[c9208y.m16092f()];
        System.arraycopy(c9208y.m16094d(), 0, bArr, 0, c9208y.m16092f());
        C11737d0.C11740c[] m7020k = C11737d0.m7020k(c9208y, c11741d.f30603b);
        return new C13926a(c11741d, c11739b, bArr, m7020k, C11737d0.m7030a(m7020k.length - 1));
    }
}