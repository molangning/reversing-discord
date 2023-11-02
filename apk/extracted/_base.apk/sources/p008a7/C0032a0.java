package p008a7;

import android.net.Uri;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p008a7.InterfaceC0052i0;
import p195k8.C9149a;
import p195k8.C9183l0;
import p195k8.C9207x;
import p195k8.C9208y;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* renamed from: a7.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0032a0 implements InterfaceC11746i {

    /* renamed from: l */
    public static final InterfaceC11753o f41l = new InterfaceC11753o() { // from class: a7.z
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m41365f;
            m41365f = C0032a0.m41365f();
            return m41365f;
        }
    };

    /* renamed from: a */
    private final C9183l0 f42a;

    /* renamed from: b */
    private final SparseArray<C0033a> f43b;

    /* renamed from: c */
    private final C9208y f44c;

    /* renamed from: d */
    private final C0083y f45d;

    /* renamed from: e */
    private boolean f46e;

    /* renamed from: f */
    private boolean f47f;

    /* renamed from: g */
    private boolean f48g;

    /* renamed from: h */
    private long f49h;

    /* renamed from: i */
    private C0080x f50i;

    /* renamed from: j */
    private InterfaceC11748k f51j;

    /* renamed from: k */
    private boolean f52k;

    /* renamed from: a7.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C0033a {

        /* renamed from: a */
        private final InterfaceC0062m f53a;

        /* renamed from: b */
        private final C9183l0 f54b;

        /* renamed from: c */
        private final C9207x f55c = new C9207x(new byte[64]);

        /* renamed from: d */
        private boolean f56d;

        /* renamed from: e */
        private boolean f57e;

        /* renamed from: f */
        private boolean f58f;

        /* renamed from: g */
        private int f59g;

        /* renamed from: h */
        private long f60h;

        public C0033a(InterfaceC0062m interfaceC0062m, C9183l0 c9183l0) {
            this.f53a = interfaceC0062m;
            this.f54b = c9183l0;
        }

        /* renamed from: b */
        private void m41362b() {
            this.f55c.m16116r(8);
            this.f56d = this.f55c.m16127g();
            this.f57e = this.f55c.m16127g();
            this.f55c.m16116r(6);
            this.f59g = this.f55c.m16126h(8);
        }

        /* renamed from: c */
        private void m41361c() {
            this.f60h = 0L;
            if (this.f56d) {
                this.f55c.m16116r(4);
                this.f55c.m16116r(1);
                this.f55c.m16116r(1);
                long m16126h = (this.f55c.m16126h(3) << 30) | (this.f55c.m16126h(15) << 15) | this.f55c.m16126h(15);
                this.f55c.m16116r(1);
                if (!this.f58f && this.f57e) {
                    this.f55c.m16116r(4);
                    this.f55c.m16116r(1);
                    this.f55c.m16116r(1);
                    this.f55c.m16116r(1);
                    this.f54b.m16345b((this.f55c.m16126h(3) << 30) | (this.f55c.m16126h(15) << 15) | this.f55c.m16126h(15));
                    this.f58f = true;
                }
                this.f60h = this.f54b.m16345b(m16126h);
            }
        }

        /* renamed from: a */
        public void m41363a(C9208y c9208y) {
            c9208y.m16088j(this.f55c.f24230a, 0, 3);
            this.f55c.m16118p(0);
            m41362b();
            c9208y.m16088j(this.f55c.f24230a, 0, this.f59g);
            this.f55c.m16118p(0);
            m41361c();
            this.f53a.mo41213f(this.f60h, 4);
            this.f53a.mo41218a(c9208y);
            this.f53a.mo41215d();
        }

        /* renamed from: d */
        public void m41360d() {
            this.f58f = false;
            this.f53a.mo41216c();
        }
    }

    public C0032a0() {
        this(new C9183l0(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ InterfaceC11746i[] m41365f() {
        return new InterfaceC11746i[]{new C0032a0()};
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m41364g(long j) {
        if (!this.f52k) {
            this.f52k = true;
            if (this.f45d.m41189c() != -9223372036854775807L) {
                C0080x c0080x = new C0080x(this.f45d.m41188d(), this.f45d.m41189c(), j);
                this.f50i = c0080x;
                this.f51j.mo3739i(c0080x.m7078b());
                return;
            }
            this.f51j.mo3739i(new InterfaceC11766y.C11768b(this.f45d.m41189c()));
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        boolean z;
        if (this.f42a.m16342e() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f42a.m16344c() != 0 && this.f42a.m16344c() != j2)) {
            this.f42a.m16340g(j2);
        }
        C0080x c0080x = this.f50i;
        if (c0080x != null) {
            c0080x.m7072h(j2);
        }
        for (int i = 0; i < this.f43b.size(); i++) {
            this.f43b.valueAt(i).m41360d();
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f51j = interfaceC11748k;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        boolean z;
        long j;
        long j2;
        InterfaceC0062m interfaceC0062m;
        C9149a.m16445h(this.f51j);
        long length = interfaceC11747j.getLength();
        int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f45d.m41187e()) {
            return this.f45d.m41185g(interfaceC11747j, c11765x);
        }
        m41364g(length);
        C0080x c0080x = this.f50i;
        if (c0080x != null && c0080x.m7076d()) {
            return this.f50i.m7077c(interfaceC11747j, c11765x);
        }
        interfaceC11747j.mo6969e();
        if (i != 0) {
            j = length - interfaceC11747j.mo3742h();
        } else {
            j = -1;
        }
        if ((j != -1 && j < 4) || !interfaceC11747j.mo6970c(this.f44c.m16094d(), 0, 4, true)) {
            return -1;
        }
        this.f44c.m16099P(0);
        int m16084n = this.f44c.m16084n();
        if (m16084n == 441) {
            return -1;
        }
        if (m16084n == 442) {
            interfaceC11747j.mo6963n(this.f44c.m16094d(), 0, 10);
            this.f44c.m16099P(9);
            interfaceC11747j.mo6965k((this.f44c.m16111D() & 7) + 14);
            return 0;
        } else if (m16084n == 443) {
            interfaceC11747j.mo6963n(this.f44c.m16094d(), 0, 2);
            this.f44c.m16099P(0);
            interfaceC11747j.mo6965k(this.f44c.m16105J() + 6);
            return 0;
        } else if (((m16084n & (-256)) >> 8) != 1) {
            interfaceC11747j.mo6965k(1);
            return 0;
        } else {
            int i2 = m16084n & 255;
            C0033a c0033a = this.f43b.get(i2);
            if (!this.f46e) {
                if (c0033a == null) {
                    if (i2 == 189) {
                        interfaceC0062m = new C0036c();
                        this.f47f = true;
                        this.f49h = interfaceC11747j.getPosition();
                    } else if ((i2 & 224) == 192) {
                        interfaceC0062m = new C0076t();
                        this.f47f = true;
                        this.f49h = interfaceC11747j.getPosition();
                    } else if ((i2 & 240) == 224) {
                        interfaceC0062m = new C0063n();
                        this.f48g = true;
                        this.f49h = interfaceC11747j.getPosition();
                    } else {
                        interfaceC0062m = null;
                    }
                    if (interfaceC0062m != null) {
                        interfaceC0062m.mo41214e(this.f51j, new InterfaceC0052i0.C0056d(i2, 256));
                        c0033a = new C0033a(interfaceC0062m, this.f42a);
                        this.f43b.put(i2, c0033a);
                    }
                }
                if (this.f47f && this.f48g) {
                    j2 = this.f49h + 8192;
                } else {
                    j2 = 1048576;
                }
                if (interfaceC11747j.getPosition() > j2) {
                    this.f46e = true;
                    this.f51j.mo3738s();
                }
            }
            interfaceC11747j.mo6963n(this.f44c.m16094d(), 0, 2);
            this.f44c.m16099P(0);
            int m16105J = this.f44c.m16105J() + 6;
            if (c0033a == null) {
                interfaceC11747j.mo6965k(m16105J);
            } else {
                this.f44c.m16103L(m16105J);
                interfaceC11747j.readFully(this.f44c.m16094d(), 0, m16105J);
                this.f44c.m16099P(6);
                c0033a.m41363a(this.f44c);
                C9208y c9208y = this.f44c;
                c9208y.m16100O(c9208y.m16096b());
            }
            return 0;
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        byte[] bArr = new byte[14];
        interfaceC11747j.mo6963n(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC11747j.mo6967i(bArr[13] & 7);
        interfaceC11747j.mo6963n(bArr, 0, 3);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }

    public C0032a0(C9183l0 c9183l0) {
        this.f42a = c9183l0;
        this.f44c = new C9208y((int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        this.f43b = new SparseArray<>();
        this.f45d = new C0083y();
    }
}
