package p316r6;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9191p0;
import p296q6.C11742e;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* renamed from: r6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12071b implements InterfaceC11746i {

    /* renamed from: r */
    private static final int[] f31221r;

    /* renamed from: u */
    private static final int f31224u;

    /* renamed from: a */
    private final byte[] f31225a;

    /* renamed from: b */
    private final int f31226b;

    /* renamed from: c */
    private boolean f31227c;

    /* renamed from: d */
    private long f31228d;

    /* renamed from: e */
    private int f31229e;

    /* renamed from: f */
    private int f31230f;

    /* renamed from: g */
    private boolean f31231g;

    /* renamed from: h */
    private long f31232h;

    /* renamed from: i */
    private int f31233i;

    /* renamed from: j */
    private int f31234j;

    /* renamed from: k */
    private long f31235k;

    /* renamed from: l */
    private InterfaceC11748k f31236l;

    /* renamed from: m */
    private InterfaceC11732b0 f31237m;

    /* renamed from: n */
    private InterfaceC11766y f31238n;

    /* renamed from: o */
    private boolean f31239o;

    /* renamed from: p */
    public static final InterfaceC11753o f31219p = new InterfaceC11753o() { // from class: r6.a
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m6329m;
            m6329m = C12071b.m6329m();
            return m6329m;
        }
    };

    /* renamed from: q */
    private static final int[] f31220q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    private static final byte[] f31222s = C9191p0.m16238l0("#!AMR\n");

    /* renamed from: t */
    private static final byte[] f31223t = C9191p0.m16238l0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f31221r = iArr;
        f31224u = iArr[8];
    }

    public C12071b() {
        this(0);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* renamed from: f */
    private void m6336f() {
        C9149a.m16445h(this.f31237m);
        C9191p0.m16243j(this.f31236l);
    }

    /* renamed from: g */
    private static int m6335g(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    /* renamed from: h */
    private InterfaceC11766y m6334h(long j) {
        return new C11742e(j, this.f31232h, m6335g(this.f31233i, 20000L), this.f31233i);
    }

    /* renamed from: i */
    private int m6333i(int i) {
        String str;
        if (!m6331k(i)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal AMR ");
            if (this.f31227c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i);
            throw new C7402m(sb2.toString());
        } else if (this.f31227c) {
            return f31221r[i];
        } else {
            return f31220q[i];
        }
    }

    /* renamed from: j */
    private boolean m6332j(int i) {
        return !this.f31227c && (i < 12 || i > 14);
    }

    /* renamed from: k */
    private boolean m6331k(int i) {
        return i >= 0 && i <= 15 && (m6330l(i) || m6332j(i));
    }

    /* renamed from: l */
    private boolean m6330l(int i) {
        return this.f31227c && (i < 10 || i > 13);
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC11746i[] m6329m() {
        return new InterfaceC11746i[]{new C12071b()};
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: n */
    private void m6328n() {
        String str;
        int i;
        if (!this.f31239o) {
            this.f31239o = true;
            boolean z = this.f31227c;
            if (z) {
                str = "audio/amr-wb";
            } else {
                str = "audio/3gpp";
            }
            if (z) {
                i = 16000;
            } else {
                i = 8000;
            }
            this.f31237m.mo6168c(new Format.C4362b().m29883e0(str).m29896W(f31224u).m29911H(1).m29881f0(i).m29914E());
        }
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: o */
    private void m6327o(long j, int i) {
        int i2;
        if (this.f31231g) {
            return;
        }
        if ((this.f31226b & 1) != 0 && j != -1 && ((i2 = this.f31233i) == -1 || i2 == this.f31229e)) {
            if (this.f31234j >= 20 || i == -1) {
                InterfaceC11766y m6334h = m6334h(j);
                this.f31238n = m6334h;
                this.f31236l.mo3739i(m6334h);
                this.f31231g = true;
                return;
            }
            return;
        }
        InterfaceC11766y.C11768b c11768b = new InterfaceC11766y.C11768b(-9223372036854775807L);
        this.f31238n = c11768b;
        this.f31236l.mo3739i(c11768b);
        this.f31231g = true;
    }

    /* renamed from: p */
    private static boolean m6326p(InterfaceC11747j interfaceC11747j, byte[] bArr) {
        interfaceC11747j.mo6969e();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC11747j.mo6963n(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: q */
    private int m6325q(InterfaceC11747j interfaceC11747j) {
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6963n(this.f31225a, 0, 1);
        byte b = this.f31225a[0];
        if ((b & 131) <= 0) {
            return m6333i((b >> 3) & 15);
        }
        throw new C7402m("Invalid padding bits for frame header " + ((int) b));
    }

    /* renamed from: r */
    private boolean m6324r(InterfaceC11747j interfaceC11747j) {
        byte[] bArr = f31222s;
        if (m6326p(interfaceC11747j, bArr)) {
            this.f31227c = false;
            interfaceC11747j.mo6965k(bArr.length);
            return true;
        }
        byte[] bArr2 = f31223t;
        if (!m6326p(interfaceC11747j, bArr2)) {
            return false;
        }
        this.f31227c = true;
        interfaceC11747j.mo6965k(bArr2.length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: s */
    private int m6323s(InterfaceC11747j interfaceC11747j) {
        if (this.f31230f == 0) {
            try {
                int m6325q = m6325q(interfaceC11747j);
                this.f31229e = m6325q;
                this.f31230f = m6325q;
                if (this.f31233i == -1) {
                    this.f31232h = interfaceC11747j.getPosition();
                    this.f31233i = this.f31229e;
                }
                if (this.f31233i == this.f31229e) {
                    this.f31234j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int mo6167d = this.f31237m.mo6167d(interfaceC11747j, this.f31230f, true);
        if (mo6167d == -1) {
            return -1;
        }
        int i = this.f31230f - mo6167d;
        this.f31230f = i;
        if (i > 0) {
            return 0;
        }
        this.f31237m.mo6162f(this.f31235k + this.f31228d, 1, this.f31229e, 0, null);
        this.f31228d += 20000;
        return 0;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        this.f31228d = 0L;
        this.f31229e = 0;
        this.f31230f = 0;
        if (j != 0) {
            InterfaceC11766y interfaceC11766y = this.f31238n;
            if (interfaceC11766y instanceof C11742e) {
                this.f31235k = ((C11742e) interfaceC11766y).m7017b(j);
                return;
            }
        }
        this.f31235k = 0L;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f31236l = interfaceC11748k;
        this.f31237m = interfaceC11748k.mo3740e(0, 1);
        interfaceC11748k.mo3738s();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        m6336f();
        if (interfaceC11747j.getPosition() == 0 && !m6324r(interfaceC11747j)) {
            throw new C7402m("Could not find AMR header.");
        }
        m6328n();
        int m6323s = m6323s(interfaceC11747j);
        m6327o(interfaceC11747j.getLength(), m6323s);
        return m6323s;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        return m6324r(interfaceC11747j);
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }

    public C12071b(int i) {
        this.f31226b = i;
        this.f31225a = new byte[1];
        this.f31233i = -1;
    }
}