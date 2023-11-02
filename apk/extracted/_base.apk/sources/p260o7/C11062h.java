package p260o7;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.C4550h;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p151i6.C7399j;
import p151i6.C7410u;
import p153i8.InterfaceC7440b;
import p195k8.C9149a;
import p195k8.C9191p0;
import p228m6.C10271g;
import p229m7.C10315l0;
import p229m7.InterfaceC10320m0;
import p229m7.InterfaceC10322n0;
import p229m7.InterfaceC10353z;
import p259o6.InterfaceC11045v;
import p259o6.InterfaceC11049x;
import p260o7.InterfaceC11065i;

/* renamed from: o7.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11062h<T extends InterfaceC11065i> implements InterfaceC10320m0, InterfaceC10322n0, C4550h.InterfaceC4552b<AbstractC11058e>, C4550h.InterfaceC4556f {

    /* renamed from: A */
    private InterfaceC11064b<T> f28953A;

    /* renamed from: B */
    private long f28954B;

    /* renamed from: C */
    private long f28955C;

    /* renamed from: D */
    private int f28956D;

    /* renamed from: E */
    private AbstractC11053a f28957E;

    /* renamed from: F */
    boolean f28958F;

    /* renamed from: j */
    public final int f28959j;

    /* renamed from: k */
    private final int[] f28960k;

    /* renamed from: l */
    private final Format[] f28961l;

    /* renamed from: m */
    private final boolean[] f28962m;

    /* renamed from: n */
    private final T f28963n;

    /* renamed from: o */
    private final InterfaceC10322n0.InterfaceC10323a<C11062h<T>> f28964o;

    /* renamed from: p */
    private final InterfaceC10353z.C10354a f28965p;

    /* renamed from: q */
    private final InterfaceC4548g f28966q;

    /* renamed from: r */
    private final C4550h f28967r;

    /* renamed from: s */
    private final C11061g f28968s;

    /* renamed from: t */
    private final ArrayList<AbstractC11053a> f28969t;

    /* renamed from: u */
    private final List<AbstractC11053a> f28970u;

    /* renamed from: v */
    private final C10315l0 f28971v;

    /* renamed from: w */
    private final C10315l0[] f28972w;

    /* renamed from: x */
    private final C11055c f28973x;

    /* renamed from: y */
    private AbstractC11058e f28974y;

    /* renamed from: z */
    private Format f28975z;

    /* renamed from: o7.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C11063a implements InterfaceC10320m0 {

        /* renamed from: j */
        public final C11062h<T> f28976j;

        /* renamed from: k */
        private final C10315l0 f28977k;

        /* renamed from: l */
        private final int f28978l;

        /* renamed from: m */
        private boolean f28979m;

        public C11063a(C11062h<T> c11062h, C10315l0 c10315l0, int i) {
            this.f28976j = c11062h;
            this.f28977k = c10315l0;
            this.f28978l = i;
        }

        /* renamed from: b */
        private void m9209b() {
            if (!this.f28979m) {
                C11062h.this.f28965p.m11697i(C11062h.this.f28960k[this.f28978l], C11062h.this.f28961l[this.f28978l], 0, null, C11062h.this.f28955C);
                this.f28979m = true;
            }
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: a */
        public void mo6236a() {
        }

        /* renamed from: c */
        public void m9208c() {
            C9149a.m16447f(C11062h.this.f28962m[this.f28978l]);
            C11062h.this.f28962m[this.f28978l] = false;
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: e */
        public boolean mo6232e() {
            return !C11062h.this.m9228I() && this.f28977k.m11831J(C11062h.this.f28958F);
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: i */
        public int mo6231i(C7399j c7399j, C10271g c10271g, boolean z) {
            if (C11062h.this.m9228I()) {
                return -3;
            }
            if (C11062h.this.f28957E != null && C11062h.this.f28957E.m9253i(this.f28978l + 1) <= this.f28977k.m11839B()) {
                return -3;
            }
            m9209b();
            return this.f28977k.m11824Q(c7399j, c10271g, z, C11062h.this.f28958F);
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: s */
        public int mo6230s(long j) {
            if (C11062h.this.m9228I()) {
                return 0;
            }
            int m11837D = this.f28977k.m11837D(j, C11062h.this.f28958F);
            if (C11062h.this.f28957E != null) {
                m11837D = Math.min(m11837D, C11062h.this.f28957E.m9253i(this.f28978l + 1) - this.f28977k.m11839B());
            }
            this.f28977k.m11812c0(m11837D);
            if (m11837D > 0) {
                m9209b();
            }
            return m11837D;
        }
    }

    /* renamed from: o7.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11064b<T extends InterfaceC11065i> {
        /* renamed from: e */
        void mo9207e(C11062h<T> c11062h);
    }

    public C11062h(int i, int[] iArr, Format[] formatArr, T t, InterfaceC10322n0.InterfaceC10323a<C11062h<T>> interfaceC10323a, InterfaceC7440b interfaceC7440b, long j, InterfaceC11049x interfaceC11049x, InterfaceC11045v.C11046a c11046a, InterfaceC4548g interfaceC4548g, InterfaceC10353z.C10354a c10354a) {
        this.f28959j = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f28960k = iArr;
        this.f28961l = formatArr == null ? new Format[0] : formatArr;
        this.f28963n = t;
        this.f28964o = interfaceC10323a;
        this.f28965p = c10354a;
        this.f28966q = interfaceC4548g;
        this.f28967r = new C4550h("Loader:ChunkSampleStream");
        this.f28968s = new C11061g();
        ArrayList<AbstractC11053a> arrayList = new ArrayList<>();
        this.f28969t = arrayList;
        this.f28970u = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f28972w = new C10315l0[length];
        this.f28962m = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C10315l0[] c10315l0Arr = new C10315l0[i3];
        C10315l0 m11806j = C10315l0.m11806j(interfaceC7440b, (Looper) C9149a.m16448e(Looper.myLooper()), interfaceC11049x, c11046a);
        this.f28971v = m11806j;
        iArr2[0] = i;
        c10315l0Arr[0] = m11806j;
        while (i2 < length) {
            C10315l0 m11805k = C10315l0.m11805k(interfaceC7440b);
            this.f28972w[i2] = m11805k;
            int i4 = i2 + 1;
            c10315l0Arr[i4] = m11805k;
            iArr2[i4] = this.f28960k[i2];
            i2 = i4;
        }
        this.f28973x = new C11055c(iArr2, c10315l0Arr);
        this.f28954B = j;
        this.f28955C = j;
    }

    /* renamed from: B */
    private void m9235B(int i) {
        int min = Math.min(m9222O(i, 0), this.f28956D);
        if (min > 0) {
            C9191p0.m16298H0(this.f28969t, 0, min);
            this.f28956D -= min;
        }
    }

    /* renamed from: C */
    private void m9234C(int i) {
        C9149a.m16447f(!this.f28967r.m28619j());
        int size = this.f28969t.size();
        while (true) {
            if (i < size) {
                if (!m9230G(i)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m9231F().f28949h;
        AbstractC11053a m9233D = m9233D(i);
        if (this.f28969t.isEmpty()) {
            this.f28954B = this.f28955C;
        }
        this.f28958F = false;
        this.f28965p.m11708D(this.f28959j, m9233D.f28948g, j);
    }

    /* renamed from: D */
    private AbstractC11053a m9233D(int i) {
        AbstractC11053a abstractC11053a = this.f28969t.get(i);
        ArrayList<AbstractC11053a> arrayList = this.f28969t;
        C9191p0.m16298H0(arrayList, i, arrayList.size());
        this.f28956D = Math.max(this.f28956D, this.f28969t.size());
        int i2 = 0;
        this.f28971v.m11796t(abstractC11053a.m9253i(0));
        while (true) {
            C10315l0[] c10315l0Arr = this.f28972w;
            if (i2 < c10315l0Arr.length) {
                C10315l0 c10315l0 = c10315l0Arr[i2];
                i2++;
                c10315l0.m11796t(abstractC11053a.m9253i(i2));
            } else {
                return abstractC11053a;
            }
        }
    }

    /* renamed from: F */
    private AbstractC11053a m9231F() {
        ArrayList<AbstractC11053a> arrayList = this.f28969t;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: G */
    private boolean m9230G(int i) {
        int m11839B;
        AbstractC11053a abstractC11053a = this.f28969t.get(i);
        if (this.f28971v.m11839B() > abstractC11053a.m9253i(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C10315l0[] c10315l0Arr = this.f28972w;
            if (i2 >= c10315l0Arr.length) {
                return false;
            }
            m11839B = c10315l0Arr[i2].m11839B();
            i2++;
        } while (m11839B <= abstractC11053a.m9253i(i2));
        return true;
    }

    /* renamed from: H */
    private boolean m9229H(AbstractC11058e abstractC11058e) {
        return abstractC11058e instanceof AbstractC11053a;
    }

    /* renamed from: J */
    private void m9227J() {
        int m9222O = m9222O(this.f28971v.m11839B(), this.f28956D - 1);
        while (true) {
            int i = this.f28956D;
            if (i <= m9222O) {
                this.f28956D = i + 1;
                m9226K(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: K */
    private void m9226K(int i) {
        AbstractC11053a abstractC11053a = this.f28969t.get(i);
        Format format = abstractC11053a.f28945d;
        if (!format.equals(this.f28975z)) {
            this.f28965p.m11697i(this.f28959j, format, abstractC11053a.f28946e, abstractC11053a.f28947f, abstractC11053a.f28948g);
        }
        this.f28975z = format;
    }

    /* renamed from: O */
    private int m9222O(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f28969t.size()) {
                return this.f28969t.size() - 1;
            }
        } while (this.f28969t.get(i2).m9253i(0) <= i);
        return i2 - 1;
    }

    /* renamed from: R */
    private void m9219R() {
        this.f28971v.m11821T();
        for (C10315l0 c10315l0 : this.f28972w) {
            c10315l0.m11821T();
        }
    }

    /* renamed from: E */
    public T m9232E() {
        return this.f28963n;
    }

    /* renamed from: I */
    boolean m9228I() {
        return this.f28954B != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: L */
    public void mo5356j(AbstractC11058e abstractC11058e, long j, long j2, boolean z) {
        this.f28974y = null;
        this.f28957E = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(abstractC11058e.f28942a, abstractC11058e.f28943b, abstractC11058e.m9243f(), abstractC11058e.m9244e(), j, j2, abstractC11058e.m9246b());
        this.f28966q.mo28628d(abstractC11058e.f28942a);
        this.f28965p.m11688r(loadEventInfo, abstractC11058e.f28944c, this.f28959j, abstractC11058e.f28945d, abstractC11058e.f28946e, abstractC11058e.f28947f, abstractC11058e.f28948g, abstractC11058e.f28949h);
        if (!z) {
            if (m9228I()) {
                m9219R();
            } else if (m9229H(abstractC11058e)) {
                m9233D(this.f28969t.size() - 1);
                if (this.f28969t.isEmpty()) {
                    this.f28954B = this.f28955C;
                }
            }
            this.f28964o.mo6251k(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: M */
    public void mo5355k(AbstractC11058e abstractC11058e, long j, long j2) {
        this.f28974y = null;
        this.f28963n.mo9204f(abstractC11058e);
        LoadEventInfo loadEventInfo = new LoadEventInfo(abstractC11058e.f28942a, abstractC11058e.f28943b, abstractC11058e.m9243f(), abstractC11058e.m9244e(), j, j2, abstractC11058e.m9246b());
        this.f28966q.mo28628d(abstractC11058e.f28942a);
        this.f28965p.m11685u(loadEventInfo, abstractC11058e.f28944c, this.f28959j, abstractC11058e.f28945d, abstractC11058e.f28946e, abstractC11058e.f28947f, abstractC11058e.f28948g, abstractC11058e.f28949h);
        this.f28964o.mo6251k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.upstream.C4550h.C4553c mo5351o(p260o7.AbstractC11058e r37, long r38, long r40, java.io.IOException r42, int r43) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o7.C11062h.mo5351o(o7.e, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.h$c");
    }

    /* renamed from: P */
    public void m9221P() {
        m9220Q(null);
    }

    /* renamed from: Q */
    public void m9220Q(InterfaceC11064b<T> interfaceC11064b) {
        this.f28953A = interfaceC11064b;
        this.f28971v.m11825P();
        for (C10315l0 c10315l0 : this.f28972w) {
            c10315l0.m11825P();
        }
        this.f28967r.m28616m(this);
    }

    /* renamed from: S */
    public void m9218S(long j) {
        AbstractC11053a abstractC11053a;
        boolean z;
        boolean m11817X;
        this.f28955C = j;
        if (m9228I()) {
            this.f28954B = j;
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f28969t.size(); i2++) {
            abstractC11053a = this.f28969t.get(i2);
            int i3 = (abstractC11053a.f28948g > j ? 1 : (abstractC11053a.f28948g == j ? 0 : -1));
            if (i3 == 0 && abstractC11053a.f28916k == -9223372036854775807L) {
                break;
            } else if (i3 > 0) {
                break;
            }
        }
        abstractC11053a = null;
        if (abstractC11053a != null) {
            m11817X = this.f28971v.m11818W(abstractC11053a.m9253i(0));
        } else {
            C10315l0 c10315l0 = this.f28971v;
            if (j < mo6201b()) {
                z = true;
            } else {
                z = false;
            }
            m11817X = c10315l0.m11817X(j, z);
        }
        if (m11817X) {
            this.f28956D = m9222O(this.f28971v.m11839B(), 0);
            C10315l0[] c10315l0Arr = this.f28972w;
            int length = c10315l0Arr.length;
            while (i < length) {
                c10315l0Arr[i].m11817X(j, true);
                i++;
            }
            return;
        }
        this.f28954B = j;
        this.f28958F = false;
        this.f28969t.clear();
        this.f28956D = 0;
        if (this.f28967r.m28619j()) {
            this.f28971v.m11799q();
            C10315l0[] c10315l0Arr2 = this.f28972w;
            int length2 = c10315l0Arr2.length;
            while (i < length2) {
                c10315l0Arr2[i].m11799q();
                i++;
            }
            this.f28967r.m28623f();
            return;
        }
        this.f28967r.m28622g();
        m9219R();
    }

    /* renamed from: T */
    public C11062h<T>.C11063a m9217T(long j, int i) {
        for (int i2 = 0; i2 < this.f28972w.length; i2++) {
            if (this.f28960k[i2] == i) {
                C9149a.m16447f(!this.f28962m[i2]);
                this.f28962m[i2] = true;
                this.f28972w[i2].m11817X(j, true);
                return new C11063a(this, this.f28972w[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: a */
    public void mo6236a() {
        this.f28967r.mo20615a();
        this.f28971v.m11829L();
        if (!this.f28967r.m28619j()) {
            this.f28963n.mo9206a();
        }
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        if (m9228I()) {
            return this.f28954B;
        }
        if (this.f28958F) {
            return Long.MIN_VALUE;
        }
        return m9231F().f28949h;
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        return this.f28967r.m28619j();
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        List<AbstractC11053a> list;
        long j2;
        if (this.f28958F || this.f28967r.m28619j() || this.f28967r.m28620i()) {
            return false;
        }
        boolean m9228I = m9228I();
        if (m9228I) {
            list = Collections.emptyList();
            j2 = this.f28954B;
        } else {
            list = this.f28970u;
            j2 = m9231F().f28949h;
        }
        this.f28963n.mo9200j(j, j2, list, this.f28968s);
        C11061g c11061g = this.f28968s;
        boolean z = c11061g.f28952b;
        AbstractC11058e abstractC11058e = c11061g.f28951a;
        c11061g.m9237a();
        if (z) {
            this.f28954B = -9223372036854775807L;
            this.f28958F = true;
            return true;
        } else if (abstractC11058e == null) {
            return false;
        } else {
            this.f28974y = abstractC11058e;
            if (m9229H(abstractC11058e)) {
                AbstractC11053a abstractC11053a = (AbstractC11053a) abstractC11058e;
                if (m9228I) {
                    long j3 = abstractC11053a.f28948g;
                    long j4 = this.f28954B;
                    if (j3 != j4) {
                        this.f28971v.m11815Z(j4);
                        for (C10315l0 c10315l0 : this.f28972w) {
                            c10315l0.m11815Z(this.f28954B);
                        }
                    }
                    this.f28954B = -9223372036854775807L;
                }
                abstractC11053a.m9251k(this.f28973x);
                this.f28969t.add(abstractC11053a);
            } else if (abstractC11058e instanceof C11068l) {
                ((C11068l) abstractC11058e).m9196g(this.f28973x);
            }
            this.f28965p.m11711A(new LoadEventInfo(abstractC11058e.f28942a, abstractC11058e.f28943b, this.f28967r.m28615n(abstractC11058e, this, this.f28966q.mo28629c(abstractC11058e.f28944c))), abstractC11058e.f28944c, this.f28959j, abstractC11058e.f28945d, abstractC11058e.f28946e, abstractC11058e.f28947f, abstractC11058e.f28948g, abstractC11058e.f28949h);
            return true;
        }
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: e */
    public boolean mo6232e() {
        return !m9228I() && this.f28971v.m11831J(this.f28958F);
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        if (this.f28958F) {
            return Long.MIN_VALUE;
        }
        if (m9228I()) {
            return this.f28954B;
        }
        long j = this.f28955C;
        AbstractC11053a m9231F = m9231F();
        if (!m9231F.mo6275h()) {
            if (this.f28969t.size() > 1) {
                ArrayList<AbstractC11053a> arrayList = this.f28969t;
                m9231F = arrayList.get(arrayList.size() - 2);
            } else {
                m9231F = null;
            }
        }
        if (m9231F != null) {
            j = Math.max(j, m9231F.f28949h);
        }
        return Math.max(j, this.f28971v.m11792y());
    }

    /* renamed from: g */
    public long m9216g(long j, C7410u c7410u) {
        return this.f28963n.mo9203g(j, c7410u);
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
        if (!this.f28967r.m28620i() && !m9228I()) {
            if (this.f28967r.m28619j()) {
                AbstractC11058e abstractC11058e = (AbstractC11058e) C9149a.m16448e(this.f28974y);
                if ((!m9229H(abstractC11058e) || !m9230G(this.f28969t.size() - 1)) && this.f28963n.mo9202h(j, abstractC11058e, this.f28970u)) {
                    this.f28967r.m28623f();
                    if (m9229H(abstractC11058e)) {
                        this.f28957E = (AbstractC11053a) abstractC11058e;
                        return;
                    }
                    return;
                }
                return;
            }
            int mo9201i = this.f28963n.mo9201i(j, this.f28970u);
            if (mo9201i < this.f28969t.size()) {
                m9234C(mo9201i);
            }
        }
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: i */
    public int mo6231i(C7399j c7399j, C10271g c10271g, boolean z) {
        if (m9228I()) {
            return -3;
        }
        AbstractC11053a abstractC11053a = this.f28957E;
        if (abstractC11053a != null && abstractC11053a.m9253i(0) <= this.f28971v.m11839B()) {
            return -3;
        }
        m9227J();
        return this.f28971v.m11824Q(c7399j, c10271g, z, this.f28958F);
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4556f
    /* renamed from: p */
    public void mo6182p() {
        this.f28971v.m11823R();
        for (C10315l0 c10315l0 : this.f28972w) {
            c10315l0.m11823R();
        }
        this.f28963n.release();
        InterfaceC11064b<T> interfaceC11064b = this.f28953A;
        if (interfaceC11064b != null) {
            interfaceC11064b.mo9207e(this);
        }
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: s */
    public int mo6230s(long j) {
        if (m9228I()) {
            return 0;
        }
        int m11837D = this.f28971v.m11837D(j, this.f28958F);
        AbstractC11053a abstractC11053a = this.f28957E;
        if (abstractC11053a != null) {
            m11837D = Math.min(m11837D, abstractC11053a.m9253i(0) - this.f28971v.m11839B());
        }
        this.f28971v.m11812c0(m11837D);
        m9227J();
        return m11837D;
    }

    /* renamed from: u */
    public void m9215u(long j, boolean z) {
        if (m9228I()) {
            return;
        }
        int m11794w = this.f28971v.m11794w();
        this.f28971v.m11800p(j, z, true);
        int m11794w2 = this.f28971v.m11794w();
        if (m11794w2 > m11794w) {
            long m11793x = this.f28971v.m11793x();
            int i = 0;
            while (true) {
                C10315l0[] c10315l0Arr = this.f28972w;
                if (i >= c10315l0Arr.length) {
                    break;
                }
                c10315l0Arr[i].m11800p(m11793x, z, this.f28962m[i]);
                i++;
            }
        }
        m9235B(m11794w2);
    }
}
