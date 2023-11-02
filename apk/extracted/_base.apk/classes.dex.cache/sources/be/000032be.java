package p099f8;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import gb.AbstractC6636e0;
import gb.AbstractC6693s;
import gb.C6712x;
import gb.InterfaceC6634d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p099f8.InterfaceC6337h;
import p153i8.InterfaceC7444e;
import p195k8.C9191p0;
import p195k8.InterfaceC9155c;
import p229m7.C10344s0;
import p229m7.InterfaceC10341s;
import p260o7.AbstractC11069m;
import p260o7.InterfaceC11070n;

/* renamed from: f8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6318a extends AbstractC6322c {

    /* renamed from: g */
    private final InterfaceC7444e f17830g;

    /* renamed from: h */
    private final long f17831h;

    /* renamed from: i */
    private final long f17832i;

    /* renamed from: j */
    private final long f17833j;

    /* renamed from: k */
    private final float f17834k;

    /* renamed from: l */
    private final float f17835l;

    /* renamed from: m */
    private final AbstractC6693s<C6319a> f17836m;

    /* renamed from: n */
    private final InterfaceC9155c f17837n;

    /* renamed from: o */
    private float f17838o;

    /* renamed from: p */
    private int f17839p;

    /* renamed from: q */
    private int f17840q;

    /* renamed from: r */
    private long f17841r;

    /* renamed from: s */
    private AbstractC11069m f17842s;

    /* renamed from: f8.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6319a {

        /* renamed from: a */
        public final long f17843a;

        /* renamed from: b */
        public final long f17844b;

        public C6319a(long j, long j2) {
            this.f17843a = j;
            this.f17844b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6319a)) {
                return false;
            }
            C6319a c6319a = (C6319a) obj;
            if (this.f17843a == c6319a.f17843a && this.f17844b == c6319a.f17844b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f17843a) * 31) + ((int) this.f17844b);
        }
    }

    /* renamed from: f8.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6320b implements InterfaceC6337h.InterfaceC6339b {

        /* renamed from: a */
        private final int f17845a;

        /* renamed from: b */
        private final int f17846b;

        /* renamed from: c */
        private final int f17847c;

        /* renamed from: d */
        private final float f17848d;

        /* renamed from: e */
        private final float f17849e;

        /* renamed from: f */
        private final InterfaceC9155c f17850f;

        public C6320b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, InterfaceC9155c.f24108a);
        }

        @Override // p099f8.InterfaceC6337h.InterfaceC6339b
        /* renamed from: a */
        public final InterfaceC6337h[] mo22903a(InterfaceC6337h.C6338a[] c6338aArr, InterfaceC7444e interfaceC7444e, InterfaceC10341s.C10342a c10342a, Timeline timeline) {
            InterfaceC6337h m22980b;
            AbstractC6693s m22981z = C6318a.m22981z(c6338aArr);
            InterfaceC6337h[] interfaceC6337hArr = new InterfaceC6337h[c6338aArr.length];
            for (int i = 0; i < c6338aArr.length; i++) {
                InterfaceC6337h.C6338a c6338a = c6338aArr[i];
                if (c6338a != null) {
                    int[] iArr = c6338a.f17959b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            m22980b = new C6340i(c6338a.f17958a, iArr[0], c6338a.f17960c, c6338a.f17961d);
                        } else {
                            m22980b = m22980b(c6338a.f17958a, interfaceC7444e, iArr, (AbstractC6693s) m22981z.get(i));
                        }
                        interfaceC6337hArr[i] = m22980b;
                    }
                }
            }
            return interfaceC6337hArr;
        }

        /* renamed from: b */
        protected C6318a m22980b(C10344s0 c10344s0, InterfaceC7444e interfaceC7444e, int[] iArr, AbstractC6693s<C6319a> abstractC6693s) {
            return new C6318a(c10344s0, iArr, interfaceC7444e, this.f17845a, this.f17846b, this.f17847c, this.f17848d, this.f17849e, abstractC6693s, this.f17850f);
        }

        public C6320b(int i, int i2, int i3, float f, float f2, InterfaceC9155c interfaceC9155c) {
            this.f17845a = i;
            this.f17846b = i2;
            this.f17847c = i3;
            this.f17848d = f;
            this.f17849e = f2;
            this.f17850f = interfaceC9155c;
        }
    }

    protected C6318a(C10344s0 c10344s0, int[] iArr, InterfaceC7444e interfaceC7444e, long j, long j2, long j3, float f, float f2, List<C6319a> list, InterfaceC9155c interfaceC9155c) {
        super(c10344s0, iArr);
        this.f17830g = interfaceC7444e;
        this.f17831h = j * 1000;
        this.f17832i = j2 * 1000;
        this.f17833j = j3 * 1000;
        this.f17834k = f;
        this.f17835l = f2;
        this.f17836m = AbstractC6693s.m22134u(list);
        this.f17837n = interfaceC9155c;
        this.f17838o = 1.0f;
        this.f17840q = 0;
        this.f17841r = -9223372036854775807L;
    }

    /* renamed from: A */
    private long m22991A() {
        long j;
        long mo20635d = ((float) this.f17830g.mo20635d()) * this.f17834k;
        if (this.f17836m.isEmpty()) {
            return mo20635d;
        }
        int i = 1;
        while (i < this.f17836m.size() - 1 && this.f17836m.get(i).f17843a < mo20635d) {
            i++;
        }
        C6319a c6319a = this.f17836m.get(i - 1);
        C6319a c6319a2 = this.f17836m.get(i);
        long j2 = c6319a.f17843a;
        float f = ((float) (mo20635d - j2)) / ((float) (c6319a2.f17843a - j2));
        return c6319a.f17844b + (f * ((float) (c6319a2.f17844b - j)));
    }

    /* renamed from: C */
    private static long[][] m22989C(InterfaceC6337h.C6338a[] c6338aArr) {
        int[] iArr;
        long[][] jArr = new long[c6338aArr.length];
        for (int i = 0; i < c6338aArr.length; i++) {
            InterfaceC6337h.C6338a c6338a = c6338aArr[i];
            if (c6338a == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[c6338a.f17959b.length];
                int i2 = 0;
                while (true) {
                    if (i2 >= c6338a.f17959b.length) {
                        break;
                    }
                    jArr[i][i2] = c6338a.f17958a.m11721a(iArr[i2]).f11193q;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    /* renamed from: D */
    private static AbstractC6693s<Integer> m22988D(long[][] jArr) {
        double d;
        InterfaceC6634d0 mo22255e = AbstractC6636e0.m22261c().m22258a().mo22255e();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double d2 = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        d2 = Math.log(j);
                    }
                    dArr[i2] = d2;
                    i2++;
                }
                int i3 = length - 1;
                double d3 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d4 = dArr[i4];
                    i4++;
                    double d5 = (d4 + dArr[i4]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    mo22255e.put(Double.valueOf(d), Integer.valueOf(i));
                }
            }
        }
        return AbstractC6693s.m22134u(mo22255e.values());
    }

    /* renamed from: E */
    private long m22987E(long j) {
        boolean z;
        if (j != -9223372036854775807L && j <= this.f17831h) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return ((float) j) * this.f17835l;
        }
        return this.f17831h;
    }

    /* renamed from: w */
    private static void m22984w(List<AbstractC6693s.C6694a<C6319a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            AbstractC6693s.C6694a<C6319a> c6694a = list.get(i);
            if (c6694a != null) {
                c6694a.m22128d(new C6319a(j, jArr[i]));
            }
        }
    }

    /* renamed from: y */
    private int m22982y(long j) {
        long m22991A = m22991A();
        int i = 0;
        for (int i2 = 0; i2 < this.f17852b; i2++) {
            if (j == Long.MIN_VALUE || !m22978t(i2, j)) {
                Format mo22891c = mo22891c(i2);
                if (m22983x(mo22891c, mo22891c.f11193q, this.f17838o, m22991A)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static AbstractC6693s<AbstractC6693s<C6319a>> m22981z(InterfaceC6337h.C6338a[] c6338aArr) {
        AbstractC6693s m22127e;
        long j;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6337h.C6338a c6338a : c6338aArr) {
            if (c6338a != null && c6338a.f17959b.length > 1) {
                AbstractC6693s.C6694a m22136s = AbstractC6693s.m22136s();
                m22136s.m22128d(new C6319a(0L, 0L));
                arrayList.add(m22136s);
            } else {
                arrayList.add(null);
            }
        }
        long[][] m22989C = m22989C(c6338aArr);
        int[] iArr = new int[m22989C.length];
        long[] jArr = new long[m22989C.length];
        for (int i = 0; i < m22989C.length; i++) {
            long[] jArr2 = m22989C[i];
            if (jArr2.length == 0) {
                j = 0;
            } else {
                j = jArr2[0];
            }
            jArr[i] = j;
        }
        m22984w(arrayList, jArr);
        AbstractC6693s<Integer> m22988D = m22988D(m22989C);
        for (int i2 = 0; i2 < m22988D.size(); i2++) {
            int intValue = m22988D.get(i2).intValue();
            int i3 = iArr[intValue] + 1;
            iArr[intValue] = i3;
            jArr[intValue] = m22989C[intValue][i3];
            m22984w(arrayList, jArr);
        }
        for (int i4 = 0; i4 < c6338aArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        m22984w(arrayList, jArr);
        AbstractC6693s.C6694a m22136s2 = AbstractC6693s.m22136s();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            AbstractC6693s.C6694a c6694a = (AbstractC6693s.C6694a) arrayList.get(i5);
            if (c6694a == null) {
                m22127e = AbstractC6693s.m22131x();
            } else {
                m22127e = c6694a.m22127e();
            }
            m22136s2.m22128d(m22127e);
        }
        return m22136s2.m22127e();
    }

    /* renamed from: B */
    protected long m22990B() {
        return this.f17833j;
    }

    /* renamed from: F */
    protected boolean m22986F(long j, List<? extends AbstractC11069m> list) {
        long j2 = this.f17841r;
        if (j2 != -9223372036854775807L && j - j2 < 1000 && (list.isEmpty() || ((AbstractC11069m) C6712x.m22059c(list)).equals(this.f17842s))) {
            return false;
        }
        return true;
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: a */
    public int mo6283a() {
        return this.f17839p;
    }

    @Override // p099f8.AbstractC6322c, p099f8.InterfaceC6337h
    public void disable() {
        this.f17842s = null;
    }

    @Override // p099f8.AbstractC6322c, p099f8.InterfaceC6337h
    /* renamed from: e */
    public void mo22911e(float f) {
        this.f17838o = f;
    }

    @Override // p099f8.AbstractC6322c, p099f8.InterfaceC6337h
    public void enable() {
        this.f17841r = -9223372036854775807L;
        this.f17842s = null;
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: f */
    public Object mo6282f() {
        return null;
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: l */
    public void mo6281l(long j, long j2, long j3, List<? extends AbstractC11069m> list, InterfaceC11070n[] interfaceC11070nArr) {
        int mo22887n;
        long mo16373b = this.f17837n.mo16373b();
        int i = this.f17840q;
        if (i == 0) {
            this.f17840q = 1;
            this.f17839p = m22982y(mo16373b);
            return;
        }
        int i2 = this.f17839p;
        if (list.isEmpty()) {
            mo22887n = -1;
        } else {
            mo22887n = mo22887n(((AbstractC11069m) C6712x.m22059c(list)).f28945d);
        }
        if (mo22887n != -1) {
            i = ((AbstractC11069m) C6712x.m22059c(list)).f28946e;
            i2 = mo22887n;
        }
        int m22982y = m22982y(mo16373b);
        if (!m22978t(i2, mo16373b)) {
            Format mo22891c = mo22891c(i2);
            Format mo22891c2 = mo22891c(m22982y);
            if ((mo22891c2.f11193q > mo22891c.f11193q && j2 < m22987E(j3)) || (mo22891c2.f11193q < mo22891c.f11193q && j2 >= this.f17832i)) {
                m22982y = i2;
            }
        }
        if (m22982y != i2) {
            i = 3;
        }
        this.f17840q = i;
        this.f17839p = m22982y;
    }

    @Override // p099f8.AbstractC6322c, p099f8.InterfaceC6337h
    /* renamed from: m */
    public int mo22907m(long j, List<? extends AbstractC11069m> list) {
        AbstractC11069m abstractC11069m;
        int i;
        int i2;
        long mo16373b = this.f17837n.mo16373b();
        if (!m22986F(mo16373b, list)) {
            return list.size();
        }
        this.f17841r = mo16373b;
        if (list.isEmpty()) {
            abstractC11069m = null;
        } else {
            abstractC11069m = (AbstractC11069m) C6712x.m22059c(list);
        }
        this.f17842s = abstractC11069m;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long m16254d0 = C9191p0.m16254d0(list.get(size - 1).f28948g - j, this.f17838o);
        long m22990B = m22990B();
        if (m16254d0 < m22990B) {
            return size;
        }
        Format mo22891c = mo22891c(m22982y(mo16373b));
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC11069m abstractC11069m2 = list.get(i3);
            Format format = abstractC11069m2.f28945d;
            if (C9191p0.m16254d0(abstractC11069m2.f28948g - j, this.f17838o) >= m22990B && format.f11193q < mo22891c.f11193q && (i = format.f11171A) != -1 && i < 720 && (i2 = format.f11202z) != -1 && i2 < 1280 && i < mo22891c.f11171A) {
                return i3;
            }
        }
        return size;
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: q */
    public int mo6280q() {
        return this.f17840q;
    }

    /* renamed from: x */
    protected boolean m22983x(Format format, int i, float f, long j) {
        return ((long) Math.round(((float) i) * f)) <= j;
    }
}