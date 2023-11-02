package p008a7;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p195k8.C9183l0;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.AbstractC11723a;
import p296q6.InterfaceC11747j;

/* renamed from: a7.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0080x extends AbstractC11723a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C0082b implements AbstractC11723a.InterfaceC11729f {

        /* renamed from: a */
        private final C9183l0 f393a;

        /* renamed from: b */
        private final C9208y f394b;

        /* renamed from: c */
        private AbstractC11723a.C11728e m41193c(C9208y c9208y, long j, long j2) {
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (c9208y.m16097a() >= 4) {
                if (C0080x.m41194k(c9208y.m16094d(), c9208y.m16093e()) != 442) {
                    c9208y.m16098Q(1);
                } else {
                    c9208y.m16098Q(4);
                    long m41180l = C0083y.m41180l(c9208y);
                    if (m41180l != -9223372036854775807L) {
                        long m16345b = this.f393a.m16345b(m41180l);
                        if (m16345b > j) {
                            if (j3 == -9223372036854775807L) {
                                return AbstractC11723a.C11728e.m7045d(m16345b, j2);
                            }
                            return AbstractC11723a.C11728e.m7044e(j2 + i2);
                        } else if (100000 + m16345b > j) {
                            return AbstractC11723a.C11728e.m7044e(j2 + c9208y.m16093e());
                        } else {
                            i2 = c9208y.m16093e();
                            j3 = m16345b;
                        }
                    }
                    m41192d(c9208y);
                    i = c9208y.m16093e();
                }
            }
            if (j3 != -9223372036854775807L) {
                return AbstractC11723a.C11728e.m7043f(j3, j2 + i);
            }
            return AbstractC11723a.C11728e.f30572d;
        }

        /* renamed from: d */
        private static void m41192d(C9208y c9208y) {
            int m41194k;
            int m16092f = c9208y.m16092f();
            if (c9208y.m16097a() < 10) {
                c9208y.m16099P(m16092f);
                return;
            }
            c9208y.m16098Q(9);
            int m16111D = c9208y.m16111D() & 7;
            if (c9208y.m16097a() < m16111D) {
                c9208y.m16099P(m16092f);
                return;
            }
            c9208y.m16098Q(m16111D);
            if (c9208y.m16097a() < 4) {
                c9208y.m16099P(m16092f);
                return;
            }
            if (C0080x.m41194k(c9208y.m16094d(), c9208y.m16093e()) == 443) {
                c9208y.m16098Q(4);
                int m16105J = c9208y.m16105J();
                if (c9208y.m16097a() < m16105J) {
                    c9208y.m16099P(m16092f);
                    return;
                }
                c9208y.m16098Q(m16105J);
            }
            while (c9208y.m16097a() >= 4 && (m41194k = C0080x.m41194k(c9208y.m16094d(), c9208y.m16093e())) != 442 && m41194k != 441 && (m41194k >>> 8) == 1) {
                c9208y.m16098Q(4);
                if (c9208y.m16097a() < 2) {
                    c9208y.m16099P(m16092f);
                    return;
                }
                c9208y.m16099P(Math.min(c9208y.m16092f(), c9208y.m16093e() + c9208y.m16105J()));
            }
        }

        @Override // p296q6.AbstractC11723a.InterfaceC11729f
        /* renamed from: a */
        public AbstractC11723a.C11728e mo5405a(InterfaceC11747j interfaceC11747j, long j) {
            long position = interfaceC11747j.getPosition();
            int min = (int) Math.min(20000L, interfaceC11747j.getLength() - position);
            this.f394b.m16103L(min);
            interfaceC11747j.mo6963n(this.f394b.m16094d(), 0, min);
            return m41193c(this.f394b, j, position);
        }

        @Override // p296q6.AbstractC11723a.InterfaceC11729f
        /* renamed from: b */
        public void mo5404b() {
            this.f394b.m16102M(C9191p0.f24176f);
        }

        private C0082b(C9183l0 c9183l0) {
            this.f393a = c9183l0;
            this.f394b = new C9208y();
        }
    }

    public C0080x(C9183l0 c9183l0, long j, long j2) {
        super(new AbstractC11723a.C11725b(), new C0082b(c9183l0), j, 0L, j + 1, 0L, j2, 188L, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
    }

    /* renamed from: k */
    public static int m41194k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}