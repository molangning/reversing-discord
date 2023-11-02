package p383v7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.AbstractC4399f;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
import p151i6.C7399j;
import p151i6.C7406q;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;

/* renamed from: v7.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13141m extends AbstractC4399f implements Handler.Callback {

    /* renamed from: A */
    private boolean f34141A;

    /* renamed from: B */
    private boolean f34142B;

    /* renamed from: C */
    private int f34143C;

    /* renamed from: D */
    private Format f34144D;

    /* renamed from: E */
    private InterfaceC13134g f34145E;

    /* renamed from: F */
    private C13138j f34146F;

    /* renamed from: G */
    private AbstractC13139k f34147G;

    /* renamed from: H */
    private AbstractC13139k f34148H;

    /* renamed from: I */
    private int f34149I;

    /* renamed from: J */
    private long f34150J;

    /* renamed from: v */
    private final Handler f34151v;

    /* renamed from: w */
    private final InterfaceC13140l f34152w;

    /* renamed from: x */
    private final InterfaceC13136i f34153x;

    /* renamed from: y */
    private final C7399j f34154y;

    /* renamed from: z */
    private boolean f34155z;

    public C13141m(InterfaceC13140l interfaceC13140l, Looper looper) {
        this(interfaceC13140l, looper, InterfaceC13136i.f34137a);
    }

    /* renamed from: M */
    private void m3120M() {
        m3111V(Collections.emptyList());
    }

    /* renamed from: N */
    private long m3119N() {
        if (this.f34149I == -1) {
            return Long.MAX_VALUE;
        }
        C9149a.m16448e(this.f34147G);
        if (this.f34149I >= this.f34147G.mo1149d()) {
            return Long.MAX_VALUE;
        }
        return this.f34147G.mo1150c(this.f34149I);
    }

    /* renamed from: O */
    private void m3118O(C13135h c13135h) {
        C9197r.m16182d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f34144D, c13135h);
        m3120M();
        m3113T();
    }

    /* renamed from: P */
    private void m3117P() {
        this.f34142B = true;
        this.f34145E = this.f34153x.mo3127b((Format) C9149a.m16448e(this.f34144D));
    }

    /* renamed from: Q */
    private void m3116Q(List<C13127b> list) {
        this.f34152w.mo3124n(list);
    }

    /* renamed from: R */
    private void m3115R() {
        this.f34146F = null;
        this.f34149I = -1;
        AbstractC13139k abstractC13139k = this.f34147G;
        if (abstractC13139k != null) {
            abstractC13139k.mo2498o();
            this.f34147G = null;
        }
        AbstractC13139k abstractC13139k2 = this.f34148H;
        if (abstractC13139k2 != null) {
            abstractC13139k2.mo2498o();
            this.f34148H = null;
        }
    }

    /* renamed from: S */
    private void m3114S() {
        m3115R();
        ((InterfaceC13134g) C9149a.m16448e(this.f34145E)).release();
        this.f34145E = null;
        this.f34143C = 0;
    }

    /* renamed from: T */
    private void m3113T() {
        m3114S();
        m3117P();
    }

    /* renamed from: V */
    private void m3111V(List<C13127b> list) {
        Handler handler = this.f34151v;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m3116Q(list);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: D */
    protected void mo3123D() {
        this.f34144D = null;
        this.f34150J = -9223372036854775807L;
        m3120M();
        m3114S();
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: F */
    protected void mo3122F(long j, boolean z) {
        m3120M();
        this.f34155z = false;
        this.f34141A = false;
        this.f34150J = -9223372036854775807L;
        if (this.f34143C != 0) {
            m3113T();
            return;
        }
        m3115R();
        ((InterfaceC13134g) C9149a.m16448e(this.f34145E)).flush();
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: J */
    protected void mo3121J(Format[] formatArr, long j, long j2) {
        this.f34144D = formatArr[0];
        if (this.f34145E != null) {
            this.f34143C = 1;
        } else {
            m3117P();
        }
    }

    /* renamed from: U */
    public void m3112U(long j) {
        C9149a.m16447f(mo28963m());
        this.f34150J = j;
    }

    @Override // p151i6.InterfaceC7407r
    /* renamed from: a */
    public int mo3110a(Format format) {
        int i;
        if (this.f34153x.mo3128a(format)) {
            if (format.f11184N == null) {
                i = 4;
            } else {
                i = 2;
            }
            return C7406q.m20725a(i);
        } else if (C9200u.m16152r(format.f11197u)) {
            return C7406q.m20725a(1);
        } else {
            return C7406q.m20725a(0);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: c */
    public boolean mo3109c() {
        return this.f34141A;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: e */
    public boolean mo3108e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0, p151i6.InterfaceC7407r
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m3116Q((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: r */
    public void mo3107r(long j, long j2) {
        boolean z;
        boolean z2;
        if (mo28963m()) {
            long j3 = this.f34150J;
            if (j3 != -9223372036854775807L && j >= j3) {
                m3115R();
                this.f34141A = true;
            }
        }
        if (this.f34141A) {
            return;
        }
        if (this.f34148H == null) {
            ((InterfaceC13134g) C9149a.m16448e(this.f34145E)).mo2514a(j);
            try {
                this.f34148H = ((InterfaceC13134g) C9149a.m16448e(this.f34145E)).mo2513b();
            } catch (C13135h e) {
                m3118O(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f34147G != null) {
            long m3119N = m3119N();
            z = false;
            while (m3119N <= j) {
                this.f34149I++;
                m3119N = m3119N();
                z = true;
            }
        } else {
            z = false;
        }
        AbstractC13139k abstractC13139k = this.f34148H;
        if (abstractC13139k != null) {
            if (abstractC13139k.m11988l()) {
                if (!z && m3119N() == Long.MAX_VALUE) {
                    if (this.f34143C == 2) {
                        m3113T();
                    } else {
                        m3115R();
                        this.f34141A = true;
                    }
                }
            } else if (abstractC13139k.f26751k <= j) {
                AbstractC13139k abstractC13139k2 = this.f34147G;
                if (abstractC13139k2 != null) {
                    abstractC13139k2.mo2498o();
                }
                this.f34149I = abstractC13139k.mo1152a(j);
                this.f34147G = abstractC13139k;
                this.f34148H = null;
                z = true;
            }
        }
        if (z) {
            C9149a.m16448e(this.f34147G);
            m3111V(this.f34147G.mo1151b(j));
        }
        if (this.f34143C == 2) {
            return;
        }
        while (!this.f34155z) {
            try {
                C13138j c13138j = this.f34146F;
                if (c13138j == null) {
                    c13138j = ((InterfaceC13134g) C9149a.m16448e(this.f34145E)).mo2511d();
                    if (c13138j == null) {
                        return;
                    }
                    this.f34146F = c13138j;
                }
                if (this.f34143C == 1) {
                    c13138j.m11986n(4);
                    ((InterfaceC13134g) C9149a.m16448e(this.f34145E)).mo2512c(c13138j);
                    this.f34146F = null;
                    this.f34143C = 2;
                    return;
                }
                int m29427K = m29427K(this.f34154y, c13138j, false);
                if (m29427K == -4) {
                    if (c13138j.m11988l()) {
                        this.f34155z = true;
                        this.f34142B = false;
                    } else {
                        Format format = this.f34154y.f19920b;
                        if (format == null) {
                            return;
                        }
                        c13138j.f34138r = format.f11201y;
                        c13138j.m11976q();
                        boolean z3 = this.f34142B;
                        if (!c13138j.m11987m()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f34142B = z3 & z2;
                    }
                    if (!this.f34142B) {
                        ((InterfaceC13134g) C9149a.m16448e(this.f34145E)).mo2512c(c13138j);
                        this.f34146F = null;
                    }
                } else if (m29427K == -3) {
                    return;
                }
            } catch (C13135h e2) {
                m3118O(e2);
                return;
            }
        }
    }

    public C13141m(InterfaceC13140l interfaceC13140l, Looper looper, InterfaceC13136i interfaceC13136i) {
        super(3);
        this.f34152w = (InterfaceC13140l) C9149a.m16448e(interfaceC13140l);
        this.f34151v = looper == null ? null : C9191p0.m16217w(looper, this);
        this.f34153x = interfaceC13136i;
        this.f34154y = new C7399j();
        this.f34150J = -9223372036854775807L;
    }
}