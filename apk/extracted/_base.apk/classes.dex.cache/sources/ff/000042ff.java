package p229m7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.C4550h;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p099f8.InterfaceC6337h;
import p151i6.C7390b;
import p151i6.C7399j;
import p151i6.C7410u;
import p153i8.C7470v;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;
import p228m6.C10271g;
import p229m7.InterfaceC10329p;
import p229m7.InterfaceC10353z;

/* renamed from: m7.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10333q0 implements InterfaceC10329p, C4550h.InterfaceC4552b<C10336c> {

    /* renamed from: j */
    private final C4515a f27021j;

    /* renamed from: k */
    private final DataSource.Factory f27022k;

    /* renamed from: l */
    private final InterfaceC7472x f27023l;

    /* renamed from: m */
    private final InterfaceC4548g f27024m;

    /* renamed from: n */
    private final InterfaceC10353z.C10354a f27025n;

    /* renamed from: o */
    private final TrackGroupArray f27026o;

    /* renamed from: q */
    private final long f27028q;

    /* renamed from: s */
    final Format f27030s;

    /* renamed from: t */
    final boolean f27031t;

    /* renamed from: u */
    boolean f27032u;

    /* renamed from: v */
    byte[] f27033v;

    /* renamed from: w */
    int f27034w;

    /* renamed from: p */
    private final ArrayList<C10335b> f27027p = new ArrayList<>();

    /* renamed from: r */
    final C4550h f27029r = new C4550h("Loader:SingleSampleMediaPeriod");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7.q0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C10335b implements InterfaceC10320m0 {

        /* renamed from: j */
        private int f27035j;

        /* renamed from: k */
        private boolean f27036k;

        private C10335b() {
            C10333q0.this = r1;
        }

        /* renamed from: b */
        private void m11745b() {
            if (!this.f27036k) {
                C10333q0.this.f27025n.m11697i(C9200u.m16158l(C10333q0.this.f27030s.f11197u), C10333q0.this.f27030s, 0, null, 0L);
                this.f27036k = true;
            }
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: a */
        public void mo6236a() {
            C10333q0 c10333q0 = C10333q0.this;
            if (!c10333q0.f27031t) {
                c10333q0.f27029r.mo20615a();
            }
        }

        /* renamed from: c */
        public void m11744c() {
            if (this.f27035j == 2) {
                this.f27035j = 1;
            }
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: e */
        public boolean mo6232e() {
            return C10333q0.this.f27032u;
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: i */
        public int mo6231i(C7399j c7399j, C10271g c10271g, boolean z) {
            m11745b();
            int i = this.f27035j;
            if (i == 2) {
                c10271g.m11993e(4);
                return -4;
            } else if (!z && i != 0) {
                C10333q0 c10333q0 = C10333q0.this;
                if (c10333q0.f27032u) {
                    if (c10333q0.f27033v != null) {
                        c10271g.m11993e(1);
                        c10271g.f26745n = 0L;
                        if (c10271g.m11974s()) {
                            return -4;
                        }
                        c10271g.m11977p(C10333q0.this.f27034w);
                        ByteBuffer byteBuffer = c10271g.f26743l;
                        C10333q0 c10333q02 = C10333q0.this;
                        byteBuffer.put(c10333q02.f27033v, 0, c10333q02.f27034w);
                    } else {
                        c10271g.m11993e(4);
                    }
                    this.f27035j = 2;
                    return -4;
                }
                return -3;
            } else {
                c7399j.f19920b = C10333q0.this.f27030s;
                this.f27035j = 1;
                return -5;
            }
        }

        @Override // p229m7.InterfaceC10320m0
        /* renamed from: s */
        public int mo6230s(long j) {
            m11745b();
            if (j > 0 && this.f27035j != 2) {
                this.f27035j = 2;
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: m7.q0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10336c implements C4550h.InterfaceC4555e {

        /* renamed from: a */
        public final long f27038a = LoadEventInfo.m29145a();

        /* renamed from: b */
        public final C4515a f27039b;

        /* renamed from: c */
        private final C7470v f27040c;

        /* renamed from: d */
        private byte[] f27041d;

        public C10336c(C4515a c4515a, DataSource dataSource) {
            this.f27039b = c4515a;
            this.f27040c = new C7470v(dataSource);
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
        /* renamed from: a */
        public void mo6277a() {
            this.f27040c.m20611r();
            try {
                this.f27040c.mo6322b(this.f27039b);
                int i = 0;
                while (i != -1) {
                    int m20614o = (int) this.f27040c.m20614o();
                    byte[] bArr = this.f27041d;
                    if (bArr == null) {
                        this.f27041d = new byte[1024];
                    } else if (m20614o == bArr.length) {
                        this.f27041d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C7470v c7470v = this.f27040c;
                    byte[] bArr2 = this.f27041d;
                    i = c7470v.read(bArr2, m20614o, bArr2.length - m20614o);
                }
            } finally {
                C9191p0.m16235n(this.f27040c);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
        /* renamed from: c */
        public void mo6276c() {
        }
    }

    public C10333q0(C4515a c4515a, DataSource.Factory factory, InterfaceC7472x interfaceC7472x, Format format, long j, InterfaceC4548g interfaceC4548g, InterfaceC10353z.C10354a c10354a, boolean z) {
        this.f27021j = c4515a;
        this.f27022k = factory;
        this.f27023l = interfaceC7472x;
        this.f27030s = format;
        this.f27028q = j;
        this.f27024m = interfaceC4548g;
        this.f27025n = c10354a;
        this.f27031t = z;
        this.f27026o = new TrackGroupArray(new C10344s0(format));
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: b */
    public long mo6201b() {
        return (this.f27032u || this.f27029r.m28619j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        return this.f27029r.m28619j();
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        if (!this.f27032u && !this.f27029r.m28619j() && !this.f27029r.m28620i()) {
            DataSource createDataSource = this.f27022k.createDataSource();
            InterfaceC7472x interfaceC7472x = this.f27023l;
            if (interfaceC7472x != null) {
                createDataSource.mo6320f(interfaceC7472x);
            }
            C10336c c10336c = new C10336c(this.f27021j, createDataSource);
            this.f27025n.m11711A(new LoadEventInfo(c10336c.f27038a, this.f27021j, this.f27029r.m28615n(c10336c, this, this.f27024m.mo28629c(1))), 1, -1, this.f27030s, 0, null, 0L, this.f27028q);
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: e */
    public void mo5356j(C10336c c10336c, long j, long j2, boolean z) {
        C7470v c7470v = c10336c.f27040c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(c10336c.f27038a, c10336c.f27039b, c7470v.m20613p(), c7470v.m20612q(), j, j2, c7470v.m20614o());
        this.f27024m.mo28628d(c10336c.f27038a);
        this.f27025n.m11688r(loadEventInfo, 1, -1, null, 0, null, 0L, this.f27028q);
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: f */
    public long mo6194f() {
        return this.f27032u ? Long.MIN_VALUE : 0L;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: g */
    public long mo6252g(long j, C7410u c7410u) {
        return j;
    }

    @Override // p229m7.InterfaceC10329p, p229m7.InterfaceC10322n0
    /* renamed from: h */
    public void mo6191h(long j) {
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: i */
    public void mo5355k(C10336c c10336c, long j, long j2) {
        this.f27034w = (int) c10336c.f27040c.m20614o();
        this.f27033v = (byte[]) C9149a.m16448e(c10336c.f27041d);
        this.f27032u = true;
        C7470v c7470v = c10336c.f27040c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(c10336c.f27038a, c10336c.f27039b, c7470v.m20613p(), c7470v.m20612q(), j, j2, this.f27034w);
        this.f27024m.mo28628d(c10336c.f27038a);
        this.f27025n.m11685u(loadEventInfo, 1, -1, this.f27030s, 0, null, 0L, this.f27028q);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: l */
    public long mo6250l(long j) {
        for (int i = 0; i < this.f27027p.size(); i++) {
            this.f27027p.get(i).m11744c();
        }
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: m */
    public void mo6249m(InterfaceC10329p.InterfaceC10330a interfaceC10330a, long j) {
        interfaceC10330a.mo11759j(this);
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: n */
    public long mo6248n() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4552b
    /* renamed from: p */
    public C4550h.C4553c mo5351o(C10336c c10336c, long j, long j2, IOException iOException, int i) {
        boolean z;
        C4550h.C4553c c4553c;
        C7470v c7470v = c10336c.f27040c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(c10336c.f27038a, c10336c.f27039b, c7470v.m20613p(), c7470v.m20612q(), j, j2, c7470v.m20614o());
        long mo28631a = this.f27024m.mo28631a(new InterfaceC4548g.C4549a(loadEventInfo, new MediaLoadData(1, -1, this.f27030s, 0, null, 0L, C7390b.m20791d(this.f27028q)), iOException, i));
        int i2 = (mo28631a > (-9223372036854775807L) ? 1 : (mo28631a == (-9223372036854775807L) ? 0 : -1));
        if (i2 != 0 && i < this.f27024m.mo28629c(1)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f27031t && z) {
            C9197r.m16177i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f27032u = true;
            c4553c = C4550h.f12387f;
        } else if (i2 != 0) {
            c4553c = C4550h.m28621h(false, mo28631a);
        } else {
            c4553c = C4550h.f12388g;
        }
        C4550h.C4553c c4553c2 = c4553c;
        boolean z2 = !c4553c2.m28612c();
        this.f27025n.m11683w(loadEventInfo, 1, -1, this.f27030s, 0, null, 0L, this.f27028q, iOException, z2);
        if (z2) {
            this.f27024m.mo28628d(c10336c.f27038a);
        }
        return c4553c2;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: q */
    public long mo6246q(InterfaceC6337h[] interfaceC6337hArr, boolean[] zArr, InterfaceC10320m0[] interfaceC10320m0Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC6337hArr.length; i++) {
            InterfaceC10320m0 interfaceC10320m0 = interfaceC10320m0Arr[i];
            if (interfaceC10320m0 != null && (interfaceC6337hArr[i] == null || !zArr[i])) {
                this.f27027p.remove(interfaceC10320m0);
                interfaceC10320m0Arr[i] = null;
            }
            if (interfaceC10320m0Arr[i] == null && interfaceC6337hArr[i] != null) {
                C10335b c10335b = new C10335b();
                this.f27027p.add(c10335b);
                interfaceC10320m0Arr[i] = c10335b;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: r */
    public void mo6245r() {
    }

    /* renamed from: s */
    public void m11746s() {
        this.f27029r.m28617l();
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: t */
    public TrackGroupArray mo6243t() {
        return this.f27026o;
    }

    @Override // p229m7.InterfaceC10329p
    /* renamed from: u */
    public void mo6242u(long j, boolean z) {
    }
}