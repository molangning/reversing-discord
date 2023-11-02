package p418x6;

import p195k8.C9208y;
import p296q6.InterfaceC11747j;

/* renamed from: x6.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13722q {

    /* renamed from: a */
    public C13701c f35366a;

    /* renamed from: b */
    public long f35367b;

    /* renamed from: c */
    public long f35368c;

    /* renamed from: d */
    public long f35369d;

    /* renamed from: e */
    public int f35370e;

    /* renamed from: f */
    public int f35371f;

    /* renamed from: m */
    public boolean f35378m;

    /* renamed from: o */
    public C13721p f35380o;

    /* renamed from: q */
    public boolean f35382q;

    /* renamed from: r */
    public long f35383r;

    /* renamed from: s */
    public boolean f35384s;

    /* renamed from: g */
    public long[] f35372g = new long[0];

    /* renamed from: h */
    public int[] f35373h = new int[0];

    /* renamed from: i */
    public int[] f35374i = new int[0];

    /* renamed from: j */
    public int[] f35375j = new int[0];

    /* renamed from: k */
    public long[] f35376k = new long[0];

    /* renamed from: l */
    public boolean[] f35377l = new boolean[0];

    /* renamed from: n */
    public boolean[] f35379n = new boolean[0];

    /* renamed from: p */
    public final C9208y f35381p = new C9208y();

    /* renamed from: a */
    public void m1644a(C9208y c9208y) {
        c9208y.m16088j(this.f35381p.m16094d(), 0, this.f35381p.m16092f());
        this.f35381p.m16099P(0);
        this.f35382q = false;
    }

    /* renamed from: b */
    public void m1643b(InterfaceC11747j interfaceC11747j) {
        interfaceC11747j.readFully(this.f35381p.m16094d(), 0, this.f35381p.m16092f());
        this.f35381p.m16099P(0);
        this.f35382q = false;
    }

    /* renamed from: c */
    public long m1642c(int i) {
        return this.f35376k[i] + this.f35375j[i];
    }

    /* renamed from: d */
    public void m1641d(int i) {
        this.f35381p.m16103L(i);
        this.f35378m = true;
        this.f35382q = true;
    }

    /* renamed from: e */
    public void m1640e(int i, int i2) {
        this.f35370e = i;
        this.f35371f = i2;
        if (this.f35373h.length < i) {
            this.f35372g = new long[i];
            this.f35373h = new int[i];
        }
        if (this.f35374i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f35374i = new int[i3];
            this.f35375j = new int[i3];
            this.f35376k = new long[i3];
            this.f35377l = new boolean[i3];
            this.f35379n = new boolean[i3];
        }
    }

    /* renamed from: f */
    public void m1639f() {
        this.f35370e = 0;
        this.f35383r = 0L;
        this.f35384s = false;
        this.f35378m = false;
        this.f35382q = false;
        this.f35380o = null;
    }

    /* renamed from: g */
    public boolean m1638g(int i) {
        return this.f35378m && this.f35379n[i];
    }
}
