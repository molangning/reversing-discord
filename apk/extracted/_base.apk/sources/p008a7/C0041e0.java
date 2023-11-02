package p008a7;

import p195k8.C9183l0;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.AbstractC11723a;
import p296q6.InterfaceC11747j;

/* renamed from: a7.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C0041e0 extends AbstractC11723a {

    /* renamed from: a7.e0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C0042a implements AbstractC11723a.InterfaceC11729f {

        /* renamed from: a */
        private final C9183l0 f89a;

        /* renamed from: b */
        private final C9208y f90b = new C9208y();

        /* renamed from: c */
        private final int f91c;

        /* renamed from: d */
        private final int f92d;

        public C0042a(int i, C9183l0 c9183l0, int i2) {
            this.f91c = i;
            this.f89a = c9183l0;
            this.f92d = i2;
        }

        /* renamed from: c */
        private AbstractC11723a.C11728e m41350c(C9208y c9208y, long j, long j2) {
            int m41279a;
            int m41279a2;
            int m16092f = c9208y.m16092f();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (c9208y.m16097a() >= 188 && (m41279a2 = (m41279a = C0058j0.m41279a(c9208y.m16094d(), c9208y.m16093e(), m16092f)) + 188) <= m16092f) {
                long m41278b = C0058j0.m41278b(c9208y, m41279a, this.f91c);
                if (m41278b != -9223372036854775807L) {
                    long m16345b = this.f89a.m16345b(m41278b);
                    if (m16345b > j) {
                        if (j5 == -9223372036854775807L) {
                            return AbstractC11723a.C11728e.m7045d(m16345b, j2);
                        }
                        return AbstractC11723a.C11728e.m7044e(j2 + j4);
                    } else if (100000 + m16345b > j) {
                        return AbstractC11723a.C11728e.m7044e(j2 + m41279a);
                    } else {
                        j4 = m41279a;
                        j5 = m16345b;
                    }
                }
                c9208y.m16099P(m41279a2);
                j3 = m41279a2;
            }
            if (j5 != -9223372036854775807L) {
                return AbstractC11723a.C11728e.m7043f(j5, j2 + j3);
            }
            return AbstractC11723a.C11728e.f30572d;
        }

        @Override // p296q6.AbstractC11723a.InterfaceC11729f
        /* renamed from: a */
        public AbstractC11723a.C11728e mo5405a(InterfaceC11747j interfaceC11747j, long j) {
            long position = interfaceC11747j.getPosition();
            int min = (int) Math.min(this.f92d, interfaceC11747j.getLength() - position);
            this.f90b.m16103L(min);
            interfaceC11747j.mo6963n(this.f90b.m16094d(), 0, min);
            return m41350c(this.f90b, j, position);
        }

        @Override // p296q6.AbstractC11723a.InterfaceC11729f
        /* renamed from: b */
        public void mo5404b() {
            this.f90b.m16102M(C9191p0.f24176f);
        }
    }

    public C0041e0(C9183l0 c9183l0, long j, long j2, int i, int i2) {
        super(new AbstractC11723a.C11725b(), new C0042a(i, c9183l0, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
