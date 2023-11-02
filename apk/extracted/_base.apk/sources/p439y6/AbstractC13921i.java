package p439y6;

import com.google.android.exoplayer2.Format;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11766y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y6.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13921i {

    /* renamed from: b */
    private InterfaceC11732b0 f35832b;

    /* renamed from: c */
    private InterfaceC11748k f35833c;

    /* renamed from: d */
    private InterfaceC13919g f35834d;

    /* renamed from: e */
    private long f35835e;

    /* renamed from: f */
    private long f35836f;

    /* renamed from: g */
    private long f35837g;

    /* renamed from: h */
    private int f35838h;

    /* renamed from: i */
    private int f35839i;

    /* renamed from: k */
    private long f35841k;

    /* renamed from: l */
    private boolean f35842l;

    /* renamed from: m */
    private boolean f35843m;

    /* renamed from: a */
    private final C13917e f35831a = new C13917e();

    /* renamed from: j */
    private C13923b f35840j = new C13923b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y6.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13923b {

        /* renamed from: a */
        Format f35844a;

        /* renamed from: b */
        InterfaceC13919g f35845b;

        C13923b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y6.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13924c implements InterfaceC13919g {
        private C13924c() {
        }

        @Override // p439y6.InterfaceC13919g
        /* renamed from: a */
        public long mo1175a(InterfaceC11747j interfaceC11747j) {
            return -1L;
        }

        @Override // p439y6.InterfaceC13919g
        /* renamed from: b */
        public InterfaceC11766y mo1174b() {
            return new InterfaceC11766y.C11768b(-9223372036854775807L);
        }

        @Override // p439y6.InterfaceC13919g
        /* renamed from: c */
        public void mo1173c(long j) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    /* renamed from: a */
    private void m1184a() {
        C9149a.m16445h(this.f35832b);
        C9191p0.m16243j(this.f35833c);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    /* renamed from: i */
    private boolean m1179i(InterfaceC11747j interfaceC11747j) {
        while (this.f35831a.m1194d(interfaceC11747j)) {
            this.f35841k = interfaceC11747j.getPosition() - this.f35836f;
            if (mo1170h(this.f35831a.m1195c(), this.f35836f, this.f35840j)) {
                this.f35836f = interfaceC11747j.getPosition();
            } else {
                return true;
            }
        }
        this.f35838h = 3;
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: j */
    private int m1178j(InterfaceC11747j interfaceC11747j) {
        boolean z;
        if (!m1179i(interfaceC11747j)) {
            return -1;
        }
        Format format = this.f35840j.f35844a;
        this.f35839i = format.f11179I;
        if (!this.f35843m) {
            this.f35832b.mo6168c(format);
            this.f35843m = true;
        }
        InterfaceC13919g interfaceC13919g = this.f35840j.f35845b;
        if (interfaceC13919g != null) {
            this.f35834d = interfaceC13919g;
        } else if (interfaceC11747j.getLength() == -1) {
            this.f35834d = new C13924c();
        } else {
            C13918f m1196b = this.f35831a.m1196b();
            if ((m1196b.f35819b & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f35834d = new C13910a(this, this.f35836f, interfaceC11747j.getLength(), m1196b.f35825h + m1196b.f35826i, m1196b.f35820c, z);
        }
        this.f35838h = 2;
        this.f35831a.m1192f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /* renamed from: k */
    private int m1177k(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        long mo1175a = this.f35834d.mo1175a(interfaceC11747j);
        if (mo1175a >= 0) {
            c11765x.f30668a = mo1175a;
            return 1;
        }
        if (mo1175a < -1) {
            mo1172e(-(mo1175a + 2));
        }
        if (!this.f35842l) {
            this.f35833c.mo3739i((InterfaceC11766y) C9149a.m16445h(this.f35834d.mo1174b()));
            this.f35842l = true;
        }
        if (this.f35841k <= 0 && !this.f35831a.m1194d(interfaceC11747j)) {
            this.f35838h = 3;
            return -1;
        }
        this.f35841k = 0L;
        C9208y m1195c = this.f35831a.m1195c();
        long mo1171f = mo1171f(m1195c);
        if (mo1171f >= 0) {
            long j = this.f35837g;
            if (j + mo1171f >= this.f35835e) {
                long m1183b = m1183b(j);
                this.f35832b.mo6170a(m1195c, m1195c.m16092f());
                this.f35832b.mo6162f(m1183b, 1, m1195c.m16092f(), 0, null);
                this.f35835e = -1L;
            }
        }
        this.f35837g += mo1171f;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public long m1183b(long j) {
        return (j * 1000000) / this.f35839i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public long m1182c(long j) {
        return (this.f35839i * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m1181d(InterfaceC11748k interfaceC11748k, InterfaceC11732b0 interfaceC11732b0) {
        this.f35833c = interfaceC11748k;
        this.f35832b = interfaceC11732b0;
        mo1169l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1172e(long j) {
        this.f35837g = j;
    }

    /* renamed from: f */
    protected abstract long mo1171f(C9208y c9208y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final int m1180g(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        m1184a();
        int i = this.f35838h;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                C9191p0.m16243j(this.f35834d);
                return m1177k(interfaceC11747j, c11765x);
            }
            interfaceC11747j.mo6965k((int) this.f35836f);
            this.f35838h = 2;
            return 0;
        }
        return m1178j(interfaceC11747j);
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: h */
    protected abstract boolean mo1170h(C9208y c9208y, long j, C13923b c13923b);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void mo1169l(boolean z) {
        if (z) {
            this.f35840j = new C13923b();
            this.f35836f = 0L;
            this.f35838h = 0;
        } else {
            this.f35838h = 1;
        }
        this.f35835e = -1L;
        this.f35837g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m1176m(long j, long j2) {
        this.f35831a.m1193e();
        if (j == 0) {
            mo1169l(!this.f35842l);
        } else if (this.f35838h != 0) {
            this.f35835e = m1182c(j2);
            ((InterfaceC13919g) C9191p0.m16243j(this.f35834d)).mo1173c(this.f35835e);
            this.f35838h = 2;
        }
    }
}
