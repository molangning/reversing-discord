package p260o7;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import p153i8.InterfaceC7451h;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9208y;
import p260o7.InterfaceC11059f;
import p296q6.C11730a0;
import p296q6.C11736d;
import p296q6.C11745h;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11766y;

/* renamed from: o7.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11056d implements InterfaceC11748k, InterfaceC11059f {

    /* renamed from: s */
    private static final C11765x f28925s = new C11765x();

    /* renamed from: j */
    private final InterfaceC11746i f28926j;

    /* renamed from: k */
    private final int f28927k;

    /* renamed from: l */
    private final Format f28928l;

    /* renamed from: m */
    private final SparseArray<C11057a> f28929m = new SparseArray<>();

    /* renamed from: n */
    private boolean f28930n;

    /* renamed from: o */
    private InterfaceC11059f.InterfaceC11060a f28931o;

    /* renamed from: p */
    private long f28932p;

    /* renamed from: q */
    private InterfaceC11766y f28933q;

    /* renamed from: r */
    private Format[] f28934r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o7.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11057a implements InterfaceC11732b0 {

        /* renamed from: a */
        private final int f28935a;

        /* renamed from: b */
        private final int f28936b;

        /* renamed from: c */
        private final Format f28937c;

        /* renamed from: d */
        private final C11745h f28938d = new C11745h();

        /* renamed from: e */
        public Format f28939e;

        /* renamed from: f */
        private InterfaceC11732b0 f28940f;

        /* renamed from: g */
        private long f28941g;

        public C11057a(int i, int i2, Format format) {
            this.f28935a = i;
            this.f28936b = i2;
            this.f28937c = format;
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: a */
        public /* synthetic */ void mo6170a(C9208y c9208y, int i) {
            C11730a0.m7041b(this, c9208y, i);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: b */
        public void mo6169b(C9208y c9208y, int i, int i2) {
            ((InterfaceC11732b0) C9191p0.m16243j(this.f28940f)).mo6170a(c9208y, i);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: c */
        public void mo6168c(Format format) {
            Format format2 = this.f28937c;
            if (format2 != null) {
                format = format.m29921j(format2);
            }
            this.f28939e = format;
            ((InterfaceC11732b0) C9191p0.m16243j(this.f28940f)).mo6168c(this.f28939e);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: d */
        public /* synthetic */ int mo6167d(InterfaceC7451h interfaceC7451h, int i, boolean z) {
            return C11730a0.m7042a(this, interfaceC7451h, i, z);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: e */
        public int mo6166e(InterfaceC7451h interfaceC7451h, int i, boolean z, int i2) {
            return ((InterfaceC11732b0) C9191p0.m16243j(this.f28940f)).mo6167d(interfaceC7451h, i, z);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: f */
        public void mo6162f(long j, int i, int i2, int i3, InterfaceC11732b0.C11733a c11733a) {
            long j2 = this.f28941g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f28940f = this.f28938d;
            }
            ((InterfaceC11732b0) C9191p0.m16243j(this.f28940f)).mo6162f(j, i, i2, i3, c11733a);
        }

        /* renamed from: g */
        public void m9247g(InterfaceC11059f.InterfaceC11060a interfaceC11060a, long j) {
            if (interfaceC11060a == null) {
                this.f28940f = this.f28938d;
                return;
            }
            this.f28941g = j;
            InterfaceC11732b0 mo9238e = interfaceC11060a.mo9238e(this.f28935a, this.f28936b);
            this.f28940f = mo9238e;
            Format format = this.f28939e;
            if (format != null) {
                mo9238e.mo6168c(format);
            }
        }
    }

    public C11056d(InterfaceC11746i interfaceC11746i, int i, Format format) {
        this.f28926j = interfaceC11746i;
        this.f28927k = i;
        this.f28928l = format;
    }

    @Override // p260o7.InterfaceC11059f
    /* renamed from: a */
    public boolean mo9242a(InterfaceC11747j interfaceC11747j) {
        boolean z;
        int mo660d = this.f28926j.mo660d(interfaceC11747j, f28925s);
        if (mo660d != 1) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (mo660d != 0) {
            return false;
        }
        return true;
    }

    @Override // p260o7.InterfaceC11059f
    /* renamed from: b */
    public C11736d mo9241b() {
        InterfaceC11766y interfaceC11766y = this.f28933q;
        if (interfaceC11766y instanceof C11736d) {
            return (C11736d) interfaceC11766y;
        }
        return null;
    }

    @Override // p260o7.InterfaceC11059f
    /* renamed from: c */
    public void mo9240c(InterfaceC11059f.InterfaceC11060a interfaceC11060a, long j, long j2) {
        this.f28931o = interfaceC11060a;
        this.f28932p = j2;
        if (!this.f28930n) {
            this.f28926j.mo662b(this);
            if (j != -9223372036854775807L) {
                this.f28926j.mo663a(0L, j);
            }
            this.f28930n = true;
            return;
        }
        InterfaceC11746i interfaceC11746i = this.f28926j;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC11746i.mo663a(0L, j);
        for (int i = 0; i < this.f28929m.size(); i++) {
            this.f28929m.valueAt(i).m9247g(interfaceC11060a, j2);
        }
    }

    @Override // p260o7.InterfaceC11059f
    /* renamed from: d */
    public Format[] mo9239d() {
        return this.f28934r;
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: e */
    public InterfaceC11732b0 mo3740e(int i, int i2) {
        boolean z;
        Format format;
        C11057a c11057a = this.f28929m.get(i);
        if (c11057a == null) {
            if (this.f28934r == null) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16447f(z);
            if (i2 == this.f28927k) {
                format = this.f28928l;
            } else {
                format = null;
            }
            c11057a = new C11057a(i, i2, format);
            c11057a.m9247g(this.f28931o, this.f28932p);
            this.f28929m.put(i, c11057a);
        }
        return c11057a;
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: i */
    public void mo3739i(InterfaceC11766y interfaceC11766y) {
        this.f28933q = interfaceC11766y;
    }

    @Override // p260o7.InterfaceC11059f
    public void release() {
        this.f28926j.release();
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: s */
    public void mo3738s() {
        Format[] formatArr = new Format[this.f28929m.size()];
        for (int i = 0; i < this.f28929m.size(); i++) {
            formatArr[i] = (Format) C9149a.m16445h(this.f28929m.valueAt(i).f28939e);
        }
        this.f28934r = formatArr;
    }
}