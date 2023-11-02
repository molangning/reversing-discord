package p398w6;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p151i6.C7390b;
import p152i7.C7425h;
import p152i7.C7431k;
import p152i7.C7435m;
import p193k6.C9103k0;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.C11745h;
import p296q6.C11752n;
import p296q6.C11762u;
import p296q6.C11763v;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p398w6.InterfaceC13413g;

/* renamed from: w6.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13412f implements InterfaceC11746i {

    /* renamed from: u */
    public static final InterfaceC11753o f34502u = new InterfaceC11753o() { // from class: w6.d
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m2610o;
            m2610o = C13412f.m2610o();
            return m2610o;
        }
    };

    /* renamed from: v */
    private static final C7425h.InterfaceC7426a f34503v = new C7425h.InterfaceC7426a() { // from class: w6.e
        @Override // p152i7.C7425h.InterfaceC7426a
        /* renamed from: a */
        public final boolean mo2621a(int i, int i2, int i3, int i4, int i5) {
            boolean m2609p;
            m2609p = C13412f.m2609p(i, i2, i3, i4, i5);
            return m2609p;
        }
    };

    /* renamed from: a */
    private final int f34504a;

    /* renamed from: b */
    private final long f34505b;

    /* renamed from: c */
    private final C9208y f34506c;

    /* renamed from: d */
    private final C9103k0.C9104a f34507d;

    /* renamed from: e */
    private final C11762u f34508e;

    /* renamed from: f */
    private final C11763v f34509f;

    /* renamed from: g */
    private final InterfaceC11732b0 f34510g;

    /* renamed from: h */
    private InterfaceC11748k f34511h;

    /* renamed from: i */
    private InterfaceC11732b0 f34512i;

    /* renamed from: j */
    private InterfaceC11732b0 f34513j;

    /* renamed from: k */
    private int f34514k;

    /* renamed from: l */
    private Metadata f34515l;

    /* renamed from: m */
    private long f34516m;

    /* renamed from: n */
    private long f34517n;

    /* renamed from: o */
    private long f34518o;

    /* renamed from: p */
    private int f34519p;

    /* renamed from: q */
    private InterfaceC13413g f34520q;

    /* renamed from: r */
    private boolean f34521r;

    /* renamed from: s */
    private boolean f34522s;

    /* renamed from: t */
    private long f34523t;

    public C13412f() {
        this(0);
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: g */
    private void m2618g() {
        C9149a.m16445h(this.f34512i);
        C9191p0.m16243j(this.f34511h);
    }

    /* renamed from: h */
    private InterfaceC13413g m2617h(InterfaceC11747j interfaceC11747j) {
        long m2613l;
        long j;
        InterfaceC13413g m2607r = m2607r(interfaceC11747j);
        C13409c m2608q = m2608q(this.f34515l, interfaceC11747j.getPosition());
        if (this.f34521r) {
            return new InterfaceC13413g.C13414a();
        }
        if ((this.f34504a & 2) != 0) {
            if (m2608q != null) {
                m2613l = m2608q.mo1208i();
                j = m2608q.mo2598g();
            } else if (m2607r != null) {
                m2613l = m2607r.mo1208i();
                j = m2607r.mo2598g();
            } else {
                m2613l = m2613l(this.f34515l);
                j = -1;
            }
            m2607r = new C13408b(m2613l, interfaceC11747j.getPosition(), j);
        } else if (m2608q != null) {
            m2607r = m2608q;
        } else if (m2607r == null) {
            m2607r = null;
        }
        if (m2607r == null || (!m2607r.mo1209h() && (this.f34504a & 1) != 0)) {
            return m2614k(interfaceC11747j);
        }
        return m2607r;
    }

    /* renamed from: i */
    private long m2616i(long j) {
        return this.f34516m + ((j * 1000000) / this.f34507d.f23926d);
    }

    /* renamed from: k */
    private InterfaceC13413g m2614k(InterfaceC11747j interfaceC11747j) {
        interfaceC11747j.mo6963n(this.f34506c.m16094d(), 0, 4);
        this.f34506c.m16099P(0);
        this.f34507d.m16646a(this.f34506c.m16084n());
        return new C13407a(interfaceC11747j.getLength(), interfaceC11747j.getPosition(), this.f34507d);
    }

    /* renamed from: l */
    private static long m2613l(Metadata metadata) {
        if (metadata != null) {
            int m29247e = metadata.m29247e();
            for (int i = 0; i < m29247e; i++) {
                Metadata.InterfaceC4429b m29248d = metadata.m29248d(i);
                if (m29248d instanceof C7435m) {
                    C7435m c7435m = (C7435m) m29248d;
                    if (c7435m.f19961j.equals("TLEN")) {
                        return C7390b.m20792c(Long.parseLong(c7435m.f19973l));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    private static int m2612m(C9208y c9208y, int i) {
        if (c9208y.m16092f() >= i + 4) {
            c9208y.m16099P(i);
            int m16084n = c9208y.m16084n();
            if (m16084n == 1483304551 || m16084n == 1231971951) {
                return m16084n;
            }
        }
        if (c9208y.m16092f() >= 40) {
            c9208y.m16099P(36);
            if (c9208y.m16084n() == 1447187017) {
                return 1447187017;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: n */
    private static boolean m2611n(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ InterfaceC11746i[] m2610o() {
        return new InterfaceC11746i[]{new C13412f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ boolean m2609p(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: q */
    private static C13409c m2608q(Metadata metadata, long j) {
        if (metadata != null) {
            int m29247e = metadata.m29247e();
            for (int i = 0; i < m29247e; i++) {
                Metadata.InterfaceC4429b m29248d = metadata.m29248d(i);
                if (m29248d instanceof C7431k) {
                    return C13409c.m2623a(j, (C7431k) m29248d, m2613l(metadata));
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: r */
    private InterfaceC13413g m2607r(InterfaceC11747j interfaceC11747j) {
        C9208y c9208y = new C9208y(this.f34507d.f23925c);
        interfaceC11747j.mo6963n(c9208y.m16094d(), 0, this.f34507d.f23925c);
        C9103k0.C9104a c9104a = this.f34507d;
        int i = 21;
        if ((c9104a.f23923a & 1) != 0) {
            if (c9104a.f23927e != 1) {
                i = 36;
            }
        } else if (c9104a.f23927e == 1) {
            i = 13;
        }
        int i2 = i;
        int m2612m = m2612m(c9208y, i2);
        if (m2612m != 1483304551 && m2612m != 1231971951) {
            if (m2612m == 1447187017) {
                C13415h m2602a = C13415h.m2602a(interfaceC11747j.getLength(), interfaceC11747j.getPosition(), this.f34507d, c9208y);
                interfaceC11747j.mo6965k(this.f34507d.f23925c);
                return m2602a;
            }
            interfaceC11747j.mo6969e();
            return null;
        }
        C13416i m2601a = C13416i.m2601a(interfaceC11747j.getLength(), interfaceC11747j.getPosition(), this.f34507d, c9208y);
        if (m2601a != null && !this.f34508e.m6962a()) {
            interfaceC11747j.mo6969e();
            interfaceC11747j.mo6967i(i2 + 141);
            interfaceC11747j.mo6963n(this.f34506c.m16094d(), 0, 3);
            this.f34506c.m16099P(0);
            this.f34508e.m6959d(this.f34506c.m16108G());
        }
        interfaceC11747j.mo6965k(this.f34507d.f23925c);
        if (m2601a != null && !m2601a.mo1209h() && m2612m == 1231971951) {
            return m2614k(interfaceC11747j);
        }
        return m2601a;
    }

    /* renamed from: s */
    private boolean m2606s(InterfaceC11747j interfaceC11747j) {
        InterfaceC13413g interfaceC13413g = this.f34520q;
        if (interfaceC13413g != null) {
            long mo2598g = interfaceC13413g.mo2598g();
            if (mo2598g != -1 && interfaceC11747j.mo3742h() > mo2598g - 4) {
                return true;
            }
        }
        try {
            return !interfaceC11747j.mo6970c(this.f34506c.m16094d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: t */
    private int m2605t(InterfaceC11747j interfaceC11747j) {
        Metadata metadata;
        if (this.f34514k == 0) {
            try {
                m2603v(interfaceC11747j, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f34520q == null) {
            InterfaceC13413g m2617h = m2617h(interfaceC11747j);
            this.f34520q = m2617h;
            this.f34511h.mo3739i(m2617h);
            InterfaceC11732b0 interfaceC11732b0 = this.f34513j;
            Format.C4362b m29905N = new Format.C4362b().m29883e0(this.f34507d.f23924b).m29896W(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).m29911H(this.f34507d.f23927e).m29881f0(this.f34507d.f23926d).m29906M(this.f34508e.f30661a).m29905N(this.f34508e.f30662b);
            if ((this.f34504a & 4) != 0) {
                metadata = null;
            } else {
                metadata = this.f34515l;
            }
            interfaceC11732b0.mo6168c(m29905N.m29895X(metadata).m29914E());
            this.f34518o = interfaceC11747j.getPosition();
        } else if (this.f34518o != 0) {
            long position = interfaceC11747j.getPosition();
            long j = this.f34518o;
            if (position < j) {
                interfaceC11747j.mo6965k((int) (j - position));
            }
        }
        return m2604u(interfaceC11747j);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    /* renamed from: u */
    private int m2604u(InterfaceC11747j interfaceC11747j) {
        C9103k0.C9104a c9104a;
        if (this.f34519p == 0) {
            interfaceC11747j.mo6969e();
            if (m2606s(interfaceC11747j)) {
                return -1;
            }
            this.f34506c.m16099P(0);
            int m16084n = this.f34506c.m16084n();
            if (m2611n(m16084n, this.f34514k) && C9103k0.m16650j(m16084n) != -1) {
                this.f34507d.m16646a(m16084n);
                if (this.f34516m == -9223372036854775807L) {
                    this.f34516m = this.f34520q.mo2599c(interfaceC11747j.getPosition());
                    if (this.f34505b != -9223372036854775807L) {
                        this.f34516m += this.f34505b - this.f34520q.mo2599c(0L);
                    }
                }
                this.f34519p = this.f34507d.f23925c;
                InterfaceC13413g interfaceC13413g = this.f34520q;
                if (interfaceC13413g instanceof C13408b) {
                    C13408b c13408b = (C13408b) interfaceC13413g;
                    c13408b.m2625b(m2616i(this.f34517n + c9104a.f23929g), interfaceC11747j.getPosition() + this.f34507d.f23925c);
                    if (this.f34522s && c13408b.m2626a(this.f34523t)) {
                        this.f34522s = false;
                        this.f34513j = this.f34512i;
                    }
                }
            } else {
                interfaceC11747j.mo6965k(1);
                this.f34514k = 0;
                return 0;
            }
        }
        int mo6167d = this.f34513j.mo6167d(interfaceC11747j, this.f34519p, true);
        if (mo6167d == -1) {
            return -1;
        }
        int i = this.f34519p - mo6167d;
        this.f34519p = i;
        if (i > 0) {
            return 0;
        }
        this.f34513j.mo6162f(m2616i(this.f34517n), 1, this.f34507d.f23925c, 0, null);
        this.f34517n += this.f34507d.f23929g;
        this.f34519p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
        r12.mo6965k(r1 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
        r12.mo6969e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
        r11.f34514k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
        return true;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2603v(p296q6.InterfaceC11747j r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.mo6969e()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 4
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L41
            int r1 = r11.f34504a
            r1 = r1 & r2
            if (r1 != 0) goto L1f
            r1 = r3
            goto L20
        L1f:
            r1 = r4
        L20:
            if (r1 == 0) goto L24
            r1 = 0
            goto L26
        L24:
            i7.h$a r1 = p398w6.C13412f.f34503v
        L26:
            q6.v r5 = r11.f34509f
            com.google.android.exoplayer2.metadata.Metadata r1 = r5.m6958a(r12, r1)
            r11.f34515l = r1
            if (r1 == 0) goto L35
            q6.u r5 = r11.f34508e
            r5.m6960c(r1)
        L35:
            long r5 = r12.mo3742h()
            int r1 = (int) r5
            if (r13 != 0) goto L3f
            r12.mo6965k(r1)
        L3f:
            r5 = r4
            goto L43
        L41:
            r1 = r4
            r5 = r1
        L43:
            r6 = r5
            r7 = r6
        L45:
            boolean r8 = r11.m2606s(r12)
            if (r8 == 0) goto L54
            if (r6 <= 0) goto L4e
            goto L9d
        L4e:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L54:
            k8.y r8 = r11.f34506c
            r8.m16099P(r4)
            k8.y r8 = r11.f34506c
            int r8 = r8.m16084n()
            if (r5 == 0) goto L68
            long r9 = (long) r5
            boolean r9 = m2611n(r8, r9)
            if (r9 == 0) goto L6f
        L68:
            int r9 = p193k6.C9103k0.m16650j(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L6f:
            int r5 = r7 + 1
            if (r7 != r0) goto L7e
            if (r13 == 0) goto L76
            return r4
        L76:
            i6.m r12 = new i6.m
            java.lang.String r13 = "Searched too many bytes."
            r12.<init>(r13)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.mo6969e()
            int r6 = r1 + r5
            r12.mo6967i(r6)
            goto L8c
        L89:
            r12.mo6965k(r3)
        L8c:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L45
        L90:
            int r6 = r6 + 1
            if (r6 != r3) goto L9b
            k6.k0$a r5 = r11.f34507d
            r5.m16646a(r8)
            r5 = r8
            goto Laa
        L9b:
            if (r6 != r2) goto Laa
        L9d:
            if (r13 == 0) goto La4
            int r1 = r1 + r7
            r12.mo6965k(r1)
            goto La7
        La4:
            r12.mo6969e()
        La7:
            r11.f34514k = r5
            return r3
        Laa:
            int r9 = r9 + (-4)
            r12.mo6967i(r9)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: p398w6.C13412f.m2603v(q6.j, boolean):boolean");
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        this.f34514k = 0;
        this.f34516m = -9223372036854775807L;
        this.f34517n = 0L;
        this.f34519p = 0;
        this.f34523t = j2;
        InterfaceC13413g interfaceC13413g = this.f34520q;
        if ((interfaceC13413g instanceof C13408b) && !((C13408b) interfaceC13413g).m2626a(j2)) {
            this.f34522s = true;
            this.f34513j = this.f34510g;
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f34511h = interfaceC11748k;
        InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(0, 1);
        this.f34512i = mo3740e;
        this.f34513j = mo3740e;
        this.f34511h.mo3738s();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        m2618g();
        int m2605t = m2605t(interfaceC11747j);
        if (m2605t == -1 && (this.f34520q instanceof C13408b)) {
            long m2616i = m2616i(this.f34517n);
            if (this.f34520q.mo1208i() != m2616i) {
                ((C13408b) this.f34520q).m2624d(m2616i);
                this.f34511h.mo3739i(this.f34520q);
            }
        }
        return m2605t;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        return m2603v(interfaceC11747j, true);
    }

    /* renamed from: j */
    public void m2615j() {
        this.f34521r = true;
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }

    public C13412f(int i) {
        this(i, -9223372036854775807L);
    }

    public C13412f(int i, long j) {
        this.f34504a = i;
        this.f34505b = j;
        this.f34506c = new C9208y(10);
        this.f34507d = new C9103k0.C9104a();
        this.f34508e = new C11762u();
        this.f34516m = -9223372036854775807L;
        this.f34509f = new C11763v();
        C11745h c11745h = new C11745h();
        this.f34510g = c11745h;
        this.f34513j = c11745h;
    }
}
