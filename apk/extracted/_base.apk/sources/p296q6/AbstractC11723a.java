package p296q6;

import p195k8.C9149a;
import p195k8.C9191p0;
import p296q6.InterfaceC11766y;

/* renamed from: q6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11723a {

    /* renamed from: a */
    protected final C11724a f30553a;

    /* renamed from: b */
    protected final InterfaceC11729f f30554b;

    /* renamed from: c */
    protected C11726c f30555c;

    /* renamed from: d */
    private final int f30556d;

    /* renamed from: q6.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11724a implements InterfaceC11766y {

        /* renamed from: a */
        private final InterfaceC11727d f30557a;

        /* renamed from: b */
        private final long f30558b;

        /* renamed from: c */
        private final long f30559c;

        /* renamed from: d */
        private final long f30560d;

        /* renamed from: e */
        private final long f30561e;

        /* renamed from: f */
        private final long f30562f;

        /* renamed from: g */
        private final long f30563g;

        public C11724a(InterfaceC11727d interfaceC11727d, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f30557a = interfaceC11727d;
            this.f30558b = j;
            this.f30559c = j2;
            this.f30560d = j3;
            this.f30561e = j4;
            this.f30562f = j5;
            this.f30563g = j6;
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: f */
        public InterfaceC11766y.C11767a mo1210f(long j) {
            return new InterfaceC11766y.C11767a(new C11769z(j, C11726c.m7057h(this.f30557a.mo5406a(j), this.f30559c, this.f30560d, this.f30561e, this.f30562f, this.f30563g)));
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: h */
        public boolean mo1209h() {
            return true;
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: i */
        public long mo1208i() {
            return this.f30558b;
        }

        /* renamed from: k */
        public long m7065k(long j) {
            return this.f30557a.mo5406a(j);
        }
    }

    /* renamed from: q6.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11725b implements InterfaceC11727d {
        @Override // p296q6.AbstractC11723a.InterfaceC11727d
        /* renamed from: a */
        public long mo5406a(long j) {
            return j;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q6.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11726c {

        /* renamed from: a */
        private final long f30564a;

        /* renamed from: b */
        private final long f30565b;

        /* renamed from: c */
        private final long f30566c;

        /* renamed from: d */
        private long f30567d;

        /* renamed from: e */
        private long f30568e;

        /* renamed from: f */
        private long f30569f;

        /* renamed from: g */
        private long f30570g;

        /* renamed from: h */
        private long f30571h;

        protected C11726c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f30564a = j;
            this.f30565b = j2;
            this.f30567d = j3;
            this.f30568e = j4;
            this.f30569f = j5;
            this.f30570g = j6;
            this.f30566c = j7;
            this.f30571h = m7057h(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: h */
        protected static long m7057h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 < j5 && j2 + 1 < j3) {
                long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
                return C9191p0.m16225s(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
            }
            return j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public long m7056i() {
            return this.f30570g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public long m7055j() {
            return this.f30569f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public long m7054k() {
            return this.f30571h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public long m7053l() {
            return this.f30564a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public long m7052m() {
            return this.f30565b;
        }

        /* renamed from: n */
        private void m7051n() {
            this.f30571h = m7057h(this.f30565b, this.f30567d, this.f30568e, this.f30569f, this.f30570g, this.f30566c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public void m7050o(long j, long j2) {
            this.f30568e = j;
            this.f30570g = j2;
            m7051n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public void m7049p(long j, long j2) {
            this.f30567d = j;
            this.f30569f = j2;
            m7051n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q6.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11727d {
        /* renamed from: a */
        long mo5406a(long j);
    }

    /* renamed from: q6.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11728e {

        /* renamed from: d */
        public static final C11728e f30572d = new C11728e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        private final int f30573a;

        /* renamed from: b */
        private final long f30574b;

        /* renamed from: c */
        private final long f30575c;

        private C11728e(int i, long j, long j2) {
            this.f30573a = i;
            this.f30574b = j;
            this.f30575c = j2;
        }

        /* renamed from: d */
        public static C11728e m7045d(long j, long j2) {
            return new C11728e(-1, j, j2);
        }

        /* renamed from: e */
        public static C11728e m7044e(long j) {
            return new C11728e(0, -9223372036854775807L, j);
        }

        /* renamed from: f */
        public static C11728e m7043f(long j, long j2) {
            return new C11728e(-2, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q6.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11729f {
        /* renamed from: a */
        C11728e mo5405a(InterfaceC11747j interfaceC11747j, long j);

        /* renamed from: b */
        void mo5404b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11723a(InterfaceC11727d interfaceC11727d, InterfaceC11729f interfaceC11729f, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f30554b = interfaceC11729f;
        this.f30556d = i;
        this.f30553a = new C11724a(interfaceC11727d, j, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    protected C11726c m7079a(long j) {
        return new C11726c(j, this.f30553a.m7065k(j), this.f30553a.f30559c, this.f30553a.f30560d, this.f30553a.f30561e, this.f30553a.f30562f, this.f30553a.f30563g);
    }

    /* renamed from: b */
    public final InterfaceC11766y m7078b() {
        return this.f30553a;
    }

    /* renamed from: c */
    public int m7077c(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        while (true) {
            C11726c c11726c = (C11726c) C9149a.m16445h(this.f30555c);
            long m7055j = c11726c.m7055j();
            long m7056i = c11726c.m7056i();
            long m7054k = c11726c.m7054k();
            if (m7056i - m7055j <= this.f30556d) {
                m7075e(false, m7055j);
                return m7073g(interfaceC11747j, m7055j, c11765x);
            } else if (!m7071i(interfaceC11747j, m7054k)) {
                return m7073g(interfaceC11747j, m7054k, c11765x);
            } else {
                interfaceC11747j.mo6969e();
                C11728e mo5405a = this.f30554b.mo5405a(interfaceC11747j, c11726c.m7052m());
                int i = mo5405a.f30573a;
                if (i != -3) {
                    if (i != -2) {
                        if (i != -1) {
                            if (i == 0) {
                                m7071i(interfaceC11747j, mo5405a.f30575c);
                                m7075e(true, mo5405a.f30575c);
                                return m7073g(interfaceC11747j, mo5405a.f30575c, c11765x);
                            }
                            throw new IllegalStateException("Invalid case");
                        }
                        c11726c.m7050o(mo5405a.f30574b, mo5405a.f30575c);
                    } else {
                        c11726c.m7049p(mo5405a.f30574b, mo5405a.f30575c);
                    }
                } else {
                    m7075e(false, m7054k);
                    return m7073g(interfaceC11747j, m7054k, c11765x);
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean m7076d() {
        return this.f30555c != null;
    }

    /* renamed from: e */
    protected final void m7075e(boolean z, long j) {
        this.f30555c = null;
        this.f30554b.mo5404b();
        m7074f(z, j);
    }

    /* renamed from: f */
    protected void m7074f(boolean z, long j) {
    }

    /* renamed from: g */
    protected final int m7073g(InterfaceC11747j interfaceC11747j, long j, C11765x c11765x) {
        if (j == interfaceC11747j.getPosition()) {
            return 0;
        }
        c11765x.f30668a = j;
        return 1;
    }

    /* renamed from: h */
    public final void m7072h(long j) {
        C11726c c11726c = this.f30555c;
        if (c11726c != null && c11726c.m7053l() == j) {
            return;
        }
        this.f30555c = m7079a(j);
    }

    /* renamed from: i */
    protected final boolean m7071i(InterfaceC11747j interfaceC11747j, long j) {
        long position = j - interfaceC11747j.getPosition();
        if (position >= 0 && position <= 262144) {
            interfaceC11747j.mo6965k((int) position);
            return true;
        }
        return false;
    }
}
