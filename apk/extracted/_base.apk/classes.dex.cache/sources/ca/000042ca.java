package p229m7;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import p099f8.InterfaceC6337h;
import p151i6.C7399j;
import p151i6.C7410u;
import p195k8.C9149a;
import p228m6.C10271g;
import p229m7.InterfaceC10329p;

/* renamed from: m7.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C10280b0 implements InterfaceC10329p, InterfaceC10329p.InterfaceC10330a {

    /* renamed from: j */
    private final InterfaceC10329p[] f26773j;

    /* renamed from: l */
    private final InterfaceC10298h f26775l;

    /* renamed from: n */
    private InterfaceC10329p.InterfaceC10330a f26777n;

    /* renamed from: o */
    private TrackGroupArray f26778o;

    /* renamed from: q */
    private InterfaceC10322n0 f26780q;

    /* renamed from: m */
    private final ArrayList<InterfaceC10329p> f26776m = new ArrayList<>();

    /* renamed from: k */
    private final IdentityHashMap<InterfaceC10320m0, Integer> f26774k = new IdentityHashMap<>();

    /* renamed from: p */
    private InterfaceC10329p[] f26779p = new InterfaceC10329p[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10281a implements InterfaceC10329p, InterfaceC10329p.InterfaceC10330a {

        /* renamed from: j */
        private final InterfaceC10329p f26781j;

        /* renamed from: k */
        private final long f26782k;

        /* renamed from: l */
        private InterfaceC10329p.InterfaceC10330a f26783l;

        public C10281a(InterfaceC10329p interfaceC10329p, long j) {
            this.f26781j = interfaceC10329p;
            this.f26782k = j;
        }

        @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
        /* renamed from: b */
        public long mo6201b() {
            long mo6201b = this.f26781j.mo6201b();
            if (mo6201b == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f26782k + mo6201b;
        }

        @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
        /* renamed from: c */
        public boolean mo6199c() {
            return this.f26781j.mo6199c();
        }

        @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
        /* renamed from: d */
        public boolean mo6197d(long j) {
            return this.f26781j.mo6197d(j - this.f26782k);
        }

        @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
        /* renamed from: f */
        public long mo6194f() {
            long mo6194f = this.f26781j.mo6194f();
            if (mo6194f == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f26782k + mo6194f;
        }

        @Override // p229m7.InterfaceC10329p
        /* renamed from: g */
        public long mo6252g(long j, C7410u c7410u) {
            return this.f26781j.mo6252g(j - this.f26782k, c7410u) + this.f26782k;
        }

        @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
        /* renamed from: h */
        public void mo6191h(long j) {
            this.f26781j.mo6191h(j - this.f26782k);
        }

        @Override // p229m7.InterfaceC10322n0.InterfaceC10323a
        /* renamed from: i */
        public void mo6251k(InterfaceC10329p interfaceC10329p) {
            ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26783l)).mo6251k(this);
        }

        @Override // p229m7.InterfaceC10329p.InterfaceC10330a
        /* renamed from: j */
        public void mo11759j(InterfaceC10329p interfaceC10329p) {
            ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26783l)).mo11759j(this);
        }

        @Override // p229m7.InterfaceC10329p
        /* renamed from: l */
        public long mo6250l(long j) {
            return this.f26781j.mo6250l(j - this.f26782k) + this.f26782k;
        }

        @Override // p229m7.InterfaceC10329p
        /* renamed from: m */
        public void mo6249m(InterfaceC10329p.InterfaceC10330a interfaceC10330a, long j) {
            this.f26783l = interfaceC10330a;
            this.f26781j.mo6249m(this, j - this.f26782k);
        }

        @Override // p229m7.InterfaceC10329p
        /* renamed from: n */
        public long mo6248n() {
            long mo6248n = this.f26781j.mo6248n();
            if (mo6248n == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f26782k + mo6248n;
        }

        @Override // p229m7.InterfaceC10329p
        /* renamed from: q */
        public long mo6246q(InterfaceC6337h[] interfaceC6337hArr, boolean[] zArr, InterfaceC10320m0[] interfaceC10320m0Arr, boolean[] zArr2, long j) {
            InterfaceC10320m0[] interfaceC10320m0Arr2 = new InterfaceC10320m0[interfaceC10320m0Arr.length];
            int i = 0;
            while (true) {
                InterfaceC10320m0 interfaceC10320m0 = null;
                if (i >= interfaceC10320m0Arr.length) {
                    break;
                }
                C10282b c10282b = (C10282b) interfaceC10320m0Arr[i];
                if (c10282b != null) {
                    interfaceC10320m0 = c10282b.m11947b();
                }
                interfaceC10320m0Arr2[i] = interfaceC10320m0;
                i++;
            }
            long mo6246q = this.f26781j.mo6246q(interfaceC6337hArr, zArr, interfaceC10320m0Arr2, zArr2, j - this.f26782k);
            for (int i2 = 0; i2 < interfaceC10320m0Arr.length; i2++) {
                InterfaceC10320m0 interfaceC10320m02 = interfaceC10320m0Arr2[i2];
                if (interfaceC10320m02 == null) {
                    interfaceC10320m0Arr[i2] = null;
                } else {
                    InterfaceC10320m0 interfaceC10320m03 = interfaceC10320m0Arr[i2];
                    if (interfaceC10320m03 == null || ((C10282b) interfaceC10320m03).m11947b() != interfaceC10320m02) {
                        interfaceC10320m0Arr[i2] = new C10282b(interfaceC10320m02, this.f26782k);
                    }
                }
            }
            return mo6246q + this.f26782k;
        }

        @Override // p229m7.InterfaceC10329p
        /* renamed from: r */
        public void mo6245r() {
            this.f26781j.mo6245r();
        }

        @Override // p229m7.InterfaceC10329p
        /* renamed from: t */
        public TrackGroupArray mo6243t() {
            return this.f26781j.mo6243t();
        }

        @Override // p229m7.InterfaceC10329p
        /* renamed from: u */
        public void mo6242u(long j, boolean z) {
            this.f26781j.mo6242u(j - this.f26782k, z);
        }
    }

    /* renamed from: m7.b0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C10282b implements InterfaceC10320m0 {

        /* renamed from: j */
        private final InterfaceC10320m0 f26784j;

        /* renamed from: k */
        private final long f26785k;

        public C10282b(InterfaceC10320m0 interfaceC10320m0, long j) {
            this.f26784j = interfaceC10320m0;
            this.f26785k = j;
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: a */
        public void mo6236a() {
            this.f26784j.mo6236a();
        }

        /* renamed from: b */
        public InterfaceC10320m0 m11947b() {
            return this.f26784j;
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: e */
        public boolean mo6232e() {
            return this.f26784j.mo6232e();
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: i */
        public int mo6231i(C7399j c7399j, C10271g c10271g, boolean z) {
            int mo6231i = this.f26784j.mo6231i(c7399j, c10271g, z);
            if (mo6231i == -4) {
                c10271g.f26745n = Math.max(0L, c10271g.f26745n + this.f26785k);
            }
            return mo6231i;
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: s */
        public int mo6230s(long j) {
            return this.f26784j.mo6230s(j - this.f26785k);
        }
    }

    public C10280b0(InterfaceC10298h interfaceC10298h, long[] jArr, InterfaceC10329p... interfaceC10329pArr) {
        this.f26775l = interfaceC10298h;
        this.f26773j = interfaceC10329pArr;
        this.f26780q = interfaceC10298h.mo11874a(new InterfaceC10322n0[0]);
        for (int i = 0; i < interfaceC10329pArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f26773j[i] = new C10281a(interfaceC10329pArr[i], j);
            }
        }
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        return this.f26780q.mo6201b();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        return this.f26780q.mo6199c();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        if (!this.f26776m.isEmpty()) {
            int size = this.f26776m.size();
            for (int i = 0; i < size; i++) {
                this.f26776m.get(i).mo6197d(j);
            }
            return false;
        }
        return this.f26780q.mo6197d(j);
    }

    /* renamed from: e */
    public InterfaceC10329p m11951e(int i) {
        InterfaceC10329p interfaceC10329p = this.f26773j[i];
        if (interfaceC10329p instanceof C10281a) {
            return ((C10281a) interfaceC10329p).f26781j;
        }
        return interfaceC10329p;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        return this.f26780q.mo6194f();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: g */
    public long mo6252g(long j, C7410u c7410u) {
        InterfaceC10329p interfaceC10329p;
        InterfaceC10329p[] interfaceC10329pArr = this.f26779p;
        if (interfaceC10329pArr.length > 0) {
            interfaceC10329p = interfaceC10329pArr[0];
        } else {
            interfaceC10329p = this.f26773j[0];
        }
        return interfaceC10329p.mo6252g(j, c7410u);
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
        this.f26780q.mo6191h(j);
    }

    @Override // p229m7.InterfaceC10322n0.InterfaceC10323a
    /* renamed from: i */
    public void mo6251k(InterfaceC10329p interfaceC10329p) {
        ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26777n)).mo6251k(this);
    }

    @Override // p229m7.InterfaceC10329p.InterfaceC10330a
    /* renamed from: j */
    public void mo11759j(InterfaceC10329p interfaceC10329p) {
        this.f26776m.remove(interfaceC10329p);
        if (!this.f26776m.isEmpty()) {
            return;
        }
        int i = 0;
        for (InterfaceC10329p interfaceC10329p2 : this.f26773j) {
            i += interfaceC10329p2.mo6243t().f11764j;
        }
        C10344s0[] c10344s0Arr = new C10344s0[i];
        int i2 = 0;
        for (InterfaceC10329p interfaceC10329p3 : this.f26773j) {
            TrackGroupArray mo6243t = interfaceC10329p3.mo6243t();
            int i3 = mo6243t.f11764j;
            int i4 = 0;
            while (i4 < i3) {
                c10344s0Arr[i2] = mo6243t.m29144a(i4);
                i4++;
                i2++;
            }
        }
        this.f26778o = new TrackGroupArray(c10344s0Arr);
        ((InterfaceC10329p.InterfaceC10330a) C9149a.m16448e(this.f26777n)).mo11759j(this);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: l */
    public long mo6250l(long j) {
        long mo6250l = this.f26779p[0].mo6250l(j);
        int i = 1;
        while (true) {
            InterfaceC10329p[] interfaceC10329pArr = this.f26779p;
            if (i < interfaceC10329pArr.length) {
                if (interfaceC10329pArr[i].mo6250l(mo6250l) == mo6250l) {
                    i++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return mo6250l;
            }
        }
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: m */
    public void mo6249m(InterfaceC10329p.InterfaceC10330a interfaceC10330a, long j) {
        this.f26777n = interfaceC10330a;
        Collections.addAll(this.f26776m, this.f26773j);
        for (InterfaceC10329p interfaceC10329p : this.f26773j) {
            interfaceC10329p.mo6249m(this, j);
        }
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: n */
    public long mo6248n() {
        InterfaceC10329p[] interfaceC10329pArr;
        InterfaceC10329p[] interfaceC10329pArr2;
        long j = -9223372036854775807L;
        for (InterfaceC10329p interfaceC10329p : this.f26779p) {
            long mo6248n = interfaceC10329p.mo6248n();
            if (mo6248n != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (InterfaceC10329p interfaceC10329p2 : this.f26779p) {
                        if (interfaceC10329p2 == interfaceC10329p) {
                            break;
                        } else if (interfaceC10329p2.mo6250l(mo6248n) != mo6248n) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = mo6248n;
                } else if (mo6248n != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && interfaceC10329p.mo6250l(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: q */
    public long mo6246q(InterfaceC6337h[] interfaceC6337hArr, boolean[] zArr, InterfaceC10320m0[] interfaceC10320m0Arr, boolean[] zArr2, long j) {
        InterfaceC10320m0 interfaceC10320m0;
        InterfaceC6337h interfaceC6337h;
        Integer num;
        int intValue;
        int[] iArr = new int[interfaceC6337hArr.length];
        int[] iArr2 = new int[interfaceC6337hArr.length];
        for (int i = 0; i < interfaceC6337hArr.length; i++) {
            InterfaceC10320m0 interfaceC10320m02 = interfaceC10320m0Arr[i];
            if (interfaceC10320m02 == null) {
                num = null;
            } else {
                num = this.f26774k.get(interfaceC10320m02);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i] = intValue;
            iArr2[i] = -1;
            InterfaceC6337h interfaceC6337h2 = interfaceC6337hArr[i];
            if (interfaceC6337h2 != null) {
                C10344s0 mo22888i = interfaceC6337h2.mo22888i();
                int i2 = 0;
                while (true) {
                    InterfaceC10329p[] interfaceC10329pArr = this.f26773j;
                    if (i2 >= interfaceC10329pArr.length) {
                        break;
                    } else if (interfaceC10329pArr[i2].mo6243t().m29143b(mo22888i) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f26774k.clear();
        int length = interfaceC6337hArr.length;
        InterfaceC10320m0[] interfaceC10320m0Arr2 = new InterfaceC10320m0[length];
        InterfaceC10320m0[] interfaceC10320m0Arr3 = new InterfaceC10320m0[interfaceC6337hArr.length];
        InterfaceC6337h[] interfaceC6337hArr2 = new InterfaceC6337h[interfaceC6337hArr.length];
        ArrayList arrayList = new ArrayList(this.f26773j.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f26773j.length) {
            for (int i4 = 0; i4 < interfaceC6337hArr.length; i4++) {
                if (iArr[i4] == i3) {
                    interfaceC10320m0 = interfaceC10320m0Arr[i4];
                } else {
                    interfaceC10320m0 = null;
                }
                interfaceC10320m0Arr3[i4] = interfaceC10320m0;
                if (iArr2[i4] == i3) {
                    interfaceC6337h = interfaceC6337hArr[i4];
                } else {
                    interfaceC6337h = null;
                }
                interfaceC6337hArr2[i4] = interfaceC6337h;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            InterfaceC6337h[] interfaceC6337hArr3 = interfaceC6337hArr2;
            long mo6246q = this.f26773j[i3].mo6246q(interfaceC6337hArr2, zArr, interfaceC10320m0Arr3, zArr2, j2);
            if (i5 == 0) {
                j2 = mo6246q;
            } else if (mo6246q != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < interfaceC6337hArr.length; i6++) {
                boolean z2 = true;
                if (iArr2[i6] == i5) {
                    interfaceC10320m0Arr2[i6] = interfaceC10320m0Arr3[i6];
                    this.f26774k.put((InterfaceC10320m0) C9149a.m16448e(interfaceC10320m0Arr3[i6]), Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    if (interfaceC10320m0Arr3[i6] != null) {
                        z2 = false;
                    }
                    C9149a.m16447f(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f26773j[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            interfaceC6337hArr2 = interfaceC6337hArr3;
        }
        System.arraycopy(interfaceC10320m0Arr2, 0, interfaceC10320m0Arr, 0, length);
        InterfaceC10329p[] interfaceC10329pArr2 = (InterfaceC10329p[]) arrayList.toArray(new InterfaceC10329p[0]);
        this.f26779p = interfaceC10329pArr2;
        this.f26780q = this.f26775l.mo11874a(interfaceC10329pArr2);
        return j2;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: r */
    public void mo6245r() {
        for (InterfaceC10329p interfaceC10329p : this.f26773j) {
            interfaceC10329p.mo6245r();
        }
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: t */
    public TrackGroupArray mo6243t() {
        return (TrackGroupArray) C9149a.m16448e(this.f26778o);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: u */
    public void mo6242u(long j, boolean z) {
        for (InterfaceC10329p interfaceC10329p : this.f26779p) {
            interfaceC10329p.mo6242u(j, z);
        }
    }
}