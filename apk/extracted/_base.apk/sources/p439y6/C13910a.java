package p439y6;

import java.io.EOFException;
import java.io.IOException;
import p195k8.C9149a;
import p195k8.C9191p0;
import p296q6.C11769z;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11766y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13910a implements InterfaceC13919g {

    /* renamed from: a */
    private final C13918f f35790a;

    /* renamed from: b */
    private final long f35791b;

    /* renamed from: c */
    private final long f35792c;

    /* renamed from: d */
    private final AbstractC13921i f35793d;

    /* renamed from: e */
    private int f35794e;

    /* renamed from: f */
    private long f35795f;

    /* renamed from: g */
    private long f35796g;

    /* renamed from: h */
    private long f35797h;

    /* renamed from: i */
    private long f35798i;

    /* renamed from: j */
    private long f35799j;

    /* renamed from: k */
    private long f35800k;

    /* renamed from: l */
    private long f35801l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y6.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C13912b implements InterfaceC11766y {
        private C13912b() {
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: f */
        public InterfaceC11766y.C11767a mo1210f(long j) {
            return new InterfaceC11766y.C11767a(new C11769z(j, C9191p0.m16225s((C13910a.this.f35791b + ((C13910a.this.f35793d.m1182c(j) * (C13910a.this.f35792c - C13910a.this.f35791b)) / C13910a.this.f35795f)) - 30000, C13910a.this.f35791b, C13910a.this.f35792c - 1)));
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: h */
        public boolean mo1209h() {
            return true;
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: i */
        public long mo1208i() {
            return C13910a.this.f35793d.m1183b(C13910a.this.f35795f);
        }
    }

    public C13910a(AbstractC13921i abstractC13921i, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9149a.m16452a(z2);
        this.f35793d = abstractC13921i;
        this.f35791b = j;
        this.f35792c = j2;
        if (j3 != j2 - j && !z) {
            this.f35794e = 0;
        } else {
            this.f35795f = j4;
            this.f35794e = 4;
        }
        this.f35790a = new C13918f();
    }

    /* renamed from: i */
    private long m1213i(InterfaceC11747j interfaceC11747j) {
        long j;
        if (this.f35798i == this.f35799j) {
            return -1L;
        }
        long position = interfaceC11747j.getPosition();
        if (!this.f35790a.m1187e(interfaceC11747j, this.f35799j)) {
            long j2 = this.f35798i;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f35790a.m1190b(interfaceC11747j, false);
        interfaceC11747j.mo6969e();
        long j3 = this.f35797h;
        C13918f c13918f = this.f35790a;
        long j4 = c13918f.f35820c;
        long j5 = j3 - j4;
        int i = c13918f.f35825h + c13918f.f35826i;
        if (0 <= j5 && j5 < 72000) {
            return -1L;
        }
        int i2 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
        if (i2 < 0) {
            this.f35799j = position;
            this.f35801l = j4;
        } else {
            this.f35798i = interfaceC11747j.getPosition() + i;
            this.f35800k = this.f35790a.f35820c;
        }
        long j6 = this.f35799j;
        long j7 = this.f35798i;
        if (j6 - j7 < 100000) {
            this.f35799j = j7;
            return j7;
        }
        long j8 = i;
        if (i2 <= 0) {
            j = 2;
        } else {
            j = 1;
        }
        long position2 = interfaceC11747j.getPosition() - (j8 * j);
        long j9 = this.f35799j;
        long j10 = this.f35798i;
        return C9191p0.m16225s(position2 + ((j5 * (j9 - j10)) / (this.f35801l - this.f35800k)), j10, j9 - 1);
    }

    /* renamed from: k */
    private void m1211k(InterfaceC11747j interfaceC11747j) {
        while (true) {
            this.f35790a.m1188d(interfaceC11747j);
            this.f35790a.m1190b(interfaceC11747j, false);
            C13918f c13918f = this.f35790a;
            if (c13918f.f35820c > this.f35797h) {
                interfaceC11747j.mo6969e();
                return;
            }
            interfaceC11747j.mo6965k(c13918f.f35825h + c13918f.f35826i);
            this.f35798i = interfaceC11747j.getPosition();
            this.f35800k = this.f35790a.f35820c;
        }
    }

    @Override // p439y6.InterfaceC13919g
    /* renamed from: a */
    public long mo1175a(InterfaceC11747j interfaceC11747j) {
        int i = this.f35794e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1L;
                        }
                        throw new IllegalStateException();
                    }
                } else {
                    long m1213i = m1213i(interfaceC11747j);
                    if (m1213i != -1) {
                        return m1213i;
                    }
                    this.f35794e = 3;
                }
                m1211k(interfaceC11747j);
                this.f35794e = 4;
                return -(this.f35800k + 2);
            }
        } else {
            long position = interfaceC11747j.getPosition();
            this.f35796g = position;
            this.f35794e = 1;
            long j = this.f35792c - 65307;
            if (j > position) {
                return j;
            }
        }
        this.f35795f = m1212j(interfaceC11747j);
        this.f35794e = 4;
        return this.f35796g;
    }

    @Override // p439y6.InterfaceC13919g
    /* renamed from: c */
    public void mo1173c(long j) {
        this.f35797h = C9191p0.m16225s(j, 0L, this.f35795f - 1);
        this.f35794e = 2;
        this.f35798i = this.f35791b;
        this.f35799j = this.f35792c;
        this.f35800k = 0L;
        this.f35801l = this.f35795f;
    }

    @Override // p439y6.InterfaceC13919g
    /* renamed from: h */
    public C13912b mo1174b() {
        if (this.f35795f != 0) {
            return new C13912b();
        }
        return null;
    }

    /* renamed from: j */
    long m1212j(InterfaceC11747j interfaceC11747j) {
        this.f35790a.m1189c();
        if (this.f35790a.m1188d(interfaceC11747j)) {
            do {
                this.f35790a.m1190b(interfaceC11747j, false);
                C13918f c13918f = this.f35790a;
                interfaceC11747j.mo6965k(c13918f.f35825h + c13918f.f35826i);
                C13918f c13918f2 = this.f35790a;
                if ((c13918f2.f35819b & 4) == 4 || !c13918f2.m1188d(interfaceC11747j)) {
                    break;
                }
            } while (interfaceC11747j.getPosition() < this.f35792c);
            return this.f35790a.f35820c;
        }
        throw new EOFException();
    }
}
