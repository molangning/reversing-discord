package p008a7;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.C11742e;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* renamed from: a7.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0047h implements InterfaceC11746i {

    /* renamed from: m */
    public static final InterfaceC11753o f115m = new InterfaceC11753o() { // from class: a7.g
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m41333i;
            m41333i = C0047h.m41333i();
            return m41333i;
        }
    };

    /* renamed from: a */
    private final int f116a;

    /* renamed from: b */
    private final C0051i f117b;

    /* renamed from: c */
    private final C9208y f118c;

    /* renamed from: d */
    private final C9208y f119d;

    /* renamed from: e */
    private final C9207x f120e;

    /* renamed from: f */
    private InterfaceC11748k f121f;

    /* renamed from: g */
    private long f122g;

    /* renamed from: h */
    private long f123h;

    /* renamed from: i */
    private int f124i;

    /* renamed from: j */
    private boolean f125j;

    /* renamed from: k */
    private boolean f126k;

    /* renamed from: l */
    private boolean f127l;

    public C0047h() {
        this(0);
    }

    /* renamed from: f */
    private void m41336f(InterfaceC11747j interfaceC11747j) {
        int m16126h;
        if (this.f125j) {
            return;
        }
        this.f124i = -1;
        interfaceC11747j.mo6969e();
        long j = 0;
        if (interfaceC11747j.getPosition() == 0) {
            m41331k(interfaceC11747j);
        }
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (!interfaceC11747j.mo6970c(this.f119d.m16094d(), 0, 2, true)) {
                    break;
                }
                this.f119d.m16099P(0);
                if (!C0051i.m41300m(this.f119d.m16105J())) {
                    break;
                } else if (!interfaceC11747j.mo6970c(this.f119d.m16094d(), 0, 4, true)) {
                    break;
                } else {
                    this.f120e.m16118p(14);
                    m16126h = this.f120e.m16126h(13);
                    if (m16126h > 6) {
                        j += m16126h;
                        i2++;
                        if (i2 == 1000) {
                            break;
                        }
                    } else {
                        this.f125j = true;
                        throw new C7402m("Malformed ADTS stream");
                    }
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC11747j.mo6964l(m16126h - 6, true));
        i = i2;
        interfaceC11747j.mo6969e();
        if (i > 0) {
            this.f124i = (int) (j / i);
        } else {
            this.f124i = -1;
        }
        this.f125j = true;
    }

    /* renamed from: g */
    private static int m41335g(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    /* renamed from: h */
    private InterfaceC11766y m41334h(long j) {
        return new C11742e(j, this.f123h, m41335g(this.f124i, this.f117b.m41302k()), this.f124i);
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC11746i[] m41333i() {
        return new InterfaceC11746i[]{new C0047h()};
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: j */
    private void m41332j(long j, boolean z, boolean z2) {
        boolean z3;
        if (this.f127l) {
            return;
        }
        if (z && this.f124i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && this.f117b.m41302k() == -9223372036854775807L && !z2) {
            return;
        }
        if (z3 && this.f117b.m41302k() != -9223372036854775807L) {
            this.f121f.mo3739i(m41334h(j));
        } else {
            this.f121f.mo3739i(new InterfaceC11766y.C11768b(-9223372036854775807L));
        }
        this.f127l = true;
    }

    /* renamed from: k */
    private int m41331k(InterfaceC11747j interfaceC11747j) {
        int i = 0;
        while (true) {
            interfaceC11747j.mo6963n(this.f119d.m16094d(), 0, 10);
            this.f119d.m16099P(0);
            if (this.f119d.m16108G() != 4801587) {
                break;
            }
            this.f119d.m16098Q(3);
            int m16112C = this.f119d.m16112C();
            i += m16112C + 10;
            interfaceC11747j.mo6967i(m16112C);
        }
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6967i(i);
        if (this.f123h == -1) {
            this.f123h = i;
        }
        return i;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        this.f126k = false;
        this.f117b.mo41216c();
        this.f122g = j2;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f121f = interfaceC11748k;
        this.f117b.mo41214e(interfaceC11748k, new InterfaceC0052i0.C0056d(0, 1));
        interfaceC11748k.mo3738s();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        boolean z;
        boolean z2;
        C9149a.m16445h(this.f121f);
        long length = interfaceC11747j.getLength();
        if ((this.f116a & 1) != 0 && length != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m41336f(interfaceC11747j);
        }
        int read = interfaceC11747j.read(this.f118c.m16094d(), 0, RecyclerView.ItemAnimator.FLAG_MOVED);
        if (read == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        m41332j(length, z, z2);
        if (z2) {
            return -1;
        }
        this.f118c.m16099P(0);
        this.f118c.m16100O(read);
        if (!this.f126k) {
            this.f117b.mo41213f(this.f122g, 4);
            this.f126k = true;
        }
        this.f117b.mo41218a(this.f118c);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0023, code lost:
        r9.mo6969e();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
        if ((r3 - r0) < 8192) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
        return false;
     */
    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo659e(p296q6.InterfaceC11747j r9) {
        /*
            r8 = this;
            int r0 = r8.m41331k(r9)
            r1 = 0
            r3 = r0
        L6:
            r2 = r1
            r4 = r2
        L8:
            k8.y r5 = r8.f119d
            byte[] r5 = r5.m16094d()
            r6 = 2
            r9.mo6963n(r5, r1, r6)
            k8.y r5 = r8.f119d
            r5.m16099P(r1)
            k8.y r5 = r8.f119d
            int r5 = r5.m16105J()
            boolean r5 = p008a7.C0051i.m41300m(r5)
            if (r5 != 0) goto L33
            r9.mo6969e()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L2f
            return r1
        L2f:
            r9.mo6967i(r3)
            goto L6
        L33:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L3d
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L3d
            return r5
        L3d:
            k8.y r5 = r8.f119d
            byte[] r5 = r5.m16094d()
            r9.mo6963n(r5, r1, r6)
            k8.x r5 = r8.f120e
            r6 = 14
            r5.m16118p(r6)
            k8.x r5 = r8.f120e
            r6 = 13
            int r5 = r5.m16126h(r6)
            r6 = 6
            if (r5 > r6) goto L59
            return r1
        L59:
            int r6 = r5 + (-6)
            r9.mo6967i(r6)
            int r4 = r4 + r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a7.C0047h.mo659e(q6.j):boolean");
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }

    public C0047h(int i) {
        this.f116a = i;
        this.f117b = new C0051i(true);
        this.f118c = new C9208y((int) RecyclerView.ItemAnimator.FLAG_MOVED);
        this.f124i = -1;
        this.f123h = -1L;
        C9208y c9208y = new C9208y(10);
        this.f119d = c9208y;
        this.f120e = new C9207x(c9208y.m16094d());
    }
}