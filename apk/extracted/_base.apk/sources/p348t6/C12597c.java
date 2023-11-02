package p348t6;

import android.net.Uri;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* renamed from: t6.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12597c implements InterfaceC11746i {

    /* renamed from: q */
    public static final InterfaceC11753o f32669q = new InterfaceC11753o() { // from class: t6.b
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m4746h;
            m4746h = C12597c.m4746h();
            return m4746h;
        }
    };

    /* renamed from: f */
    private InterfaceC11748k f32675f;

    /* renamed from: h */
    private boolean f32677h;

    /* renamed from: i */
    private long f32678i;

    /* renamed from: j */
    private int f32679j;

    /* renamed from: k */
    private int f32680k;

    /* renamed from: l */
    private int f32681l;

    /* renamed from: m */
    private long f32682m;

    /* renamed from: n */
    private boolean f32683n;

    /* renamed from: o */
    private C12595a f32684o;

    /* renamed from: p */
    private C12601f f32685p;

    /* renamed from: a */
    private final C9208y f32670a = new C9208y(4);

    /* renamed from: b */
    private final C9208y f32671b = new C9208y(9);

    /* renamed from: c */
    private final C9208y f32672c = new C9208y(11);

    /* renamed from: d */
    private final C9208y f32673d = new C9208y();

    /* renamed from: e */
    private final C12598d f32674e = new C12598d();

    /* renamed from: g */
    private int f32676g = 1;

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: f */
    private void m4748f() {
        if (!this.f32683n) {
            this.f32675f.mo3739i(new InterfaceC11766y.C11768b(-9223372036854775807L));
            this.f32683n = true;
        }
    }

    /* renamed from: g */
    private long m4747g() {
        if (this.f32677h) {
            return this.f32678i + this.f32682m;
        }
        if (this.f32674e.m4740d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f32682m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ InterfaceC11746i[] m4746h() {
        return new InterfaceC11746i[]{new C12597c()};
    }

    /* renamed from: i */
    private C9208y m4745i(InterfaceC11747j interfaceC11747j) {
        if (this.f32681l > this.f32673d.m16096b()) {
            C9208y c9208y = this.f32673d;
            c9208y.m16101N(new byte[Math.max(c9208y.m16096b() * 2, this.f32681l)], 0);
        } else {
            this.f32673d.m16099P(0);
        }
        this.f32673d.m16100O(this.f32681l);
        interfaceC11747j.readFully(this.f32673d.m16094d(), 0, this.f32681l);
        return this.f32673d;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: j */
    private boolean m4744j(InterfaceC11747j interfaceC11747j) {
        boolean z;
        boolean z2 = false;
        if (!interfaceC11747j.mo6968g(this.f32671b.m16094d(), 0, 9, true)) {
            return false;
        }
        this.f32671b.m16099P(0);
        this.f32671b.m16098Q(4);
        int m16111D = this.f32671b.m16111D();
        if ((m16111D & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((m16111D & 1) != 0) {
            z2 = true;
        }
        if (z && this.f32684o == null) {
            this.f32684o = new C12595a(this.f32675f.mo3740e(8, 1));
        }
        if (z2 && this.f32685p == null) {
            this.f32685p = new C12601f(this.f32675f.mo3740e(9, 2));
        }
        this.f32675f.mo3738s();
        this.f32679j = (this.f32671b.m16084n() - 9) + 4;
        this.f32676g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m4743k(p296q6.InterfaceC11747j r10) {
        /*
            r9 = this;
            long r0 = r9.m4747g()
            int r2 = r9.f32680k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            t6.a r3 = r9.f32684o
            if (r3 == 0) goto L23
            r9.m4748f()
            t6.a r2 = r9.f32684o
            k8.y r10 = r9.m4745i(r10)
            boolean r10 = r2.m4728a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            t6.f r3 = r9.f32685p
            if (r3 == 0) goto L39
            r9.m4748f()
            t6.f r2 = r9.f32685p
            k8.y r10 = r9.m4745i(r10)
            boolean r10 = r2.m4728a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f32683n
            if (r2 != 0) goto L6e
            t6.d r2 = r9.f32674e
            k8.y r10 = r9.m4745i(r10)
            boolean r10 = r2.m4728a(r10, r0)
            t6.d r0 = r9.f32674e
            long r0 = r0.m4740d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            q6.k r2 = r9.f32675f
            q6.w r3 = new q6.w
            t6.d r7 = r9.f32674e
            long[] r7 = r7.m4739e()
            t6.d r8 = r9.f32674e
            long[] r8 = r8.m4738f()
            r3.<init>(r7, r8, r0)
            r2.mo3739i(r3)
            r9.f32683n = r6
            goto L21
        L6e:
            int r0 = r9.f32681l
            r10.mo6965k(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f32677h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f32677h = r6
            t6.d r10 = r9.f32674e
            long r1 = r10.m4740d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f32682m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f32678i = r1
        L8f:
            r10 = 4
            r9.f32679j = r10
            r10 = 2
            r9.f32676g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p348t6.C12597c.m4743k(q6.j):boolean");
    }

    /* renamed from: l */
    private boolean m4742l(InterfaceC11747j interfaceC11747j) {
        if (!interfaceC11747j.mo6968g(this.f32672c.m16094d(), 0, 11, true)) {
            return false;
        }
        this.f32672c.m16099P(0);
        this.f32680k = this.f32672c.m16111D();
        this.f32681l = this.f32672c.m16108G();
        this.f32682m = this.f32672c.m16108G();
        this.f32682m = ((this.f32672c.m16111D() << 24) | this.f32682m) * 1000;
        this.f32672c.m16098Q(3);
        this.f32676g = 4;
        return true;
    }

    /* renamed from: m */
    private void m4741m(InterfaceC11747j interfaceC11747j) {
        interfaceC11747j.mo6965k(this.f32679j);
        this.f32679j = 0;
        this.f32676g = 3;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        if (j == 0) {
            this.f32676g = 1;
            this.f32677h = false;
        } else {
            this.f32676g = 3;
        }
        this.f32679j = 0;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f32675f = interfaceC11748k;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        C9149a.m16445h(this.f32675f);
        while (true) {
            int i = this.f32676g;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (m4743k(interfaceC11747j)) {
                                return 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (!m4742l(interfaceC11747j)) {
                        return -1;
                    }
                } else {
                    m4741m(interfaceC11747j);
                }
            } else if (!m4744j(interfaceC11747j)) {
                return -1;
            }
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        interfaceC11747j.mo6963n(this.f32670a.m16094d(), 0, 3);
        this.f32670a.m16099P(0);
        if (this.f32670a.m16108G() != 4607062) {
            return false;
        }
        interfaceC11747j.mo6963n(this.f32670a.m16094d(), 0, 2);
        this.f32670a.m16099P(0);
        if ((this.f32670a.m16105J() & ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        interfaceC11747j.mo6963n(this.f32670a.m16094d(), 0, 4);
        this.f32670a.m16099P(0);
        int m16084n = this.f32670a.m16084n();
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6967i(m16084n);
        interfaceC11747j.mo6963n(this.f32670a.m16094d(), 0, 4);
        this.f32670a.m16099P(0);
        if (this.f32670a.m16084n() != 0) {
            return false;
        }
        return true;
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }
}
