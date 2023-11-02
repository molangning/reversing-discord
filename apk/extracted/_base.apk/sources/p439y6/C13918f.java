package p439y6;

import java.io.EOFException;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.InterfaceC11747j;

/* renamed from: y6.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13918f {

    /* renamed from: a */
    public int f35818a;

    /* renamed from: b */
    public int f35819b;

    /* renamed from: c */
    public long f35820c;

    /* renamed from: d */
    public long f35821d;

    /* renamed from: e */
    public long f35822e;

    /* renamed from: f */
    public long f35823f;

    /* renamed from: g */
    public int f35824g;

    /* renamed from: h */
    public int f35825h;

    /* renamed from: i */
    public int f35826i;

    /* renamed from: j */
    public final int[] f35827j = new int[255];

    /* renamed from: k */
    private final C9208y f35828k = new C9208y(255);

    /* renamed from: a */
    private static boolean m1191a(InterfaceC11747j interfaceC11747j, byte[] bArr, int i, int i2, boolean z) {
        try {
            return interfaceC11747j.mo6970c(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public boolean m1190b(InterfaceC11747j interfaceC11747j, boolean z) {
        m1189c();
        this.f35828k.m16103L(27);
        if (!m1191a(interfaceC11747j, this.f35828k.m16094d(), 0, 27, z) || this.f35828k.m16109F() != 1332176723) {
            return false;
        }
        int m16111D = this.f35828k.m16111D();
        this.f35818a = m16111D;
        if (m16111D != 0) {
            if (z) {
                return false;
            }
            throw new C7402m("unsupported bit stream revision");
        }
        this.f35819b = this.f35828k.m16111D();
        this.f35820c = this.f35828k.m16080r();
        this.f35821d = this.f35828k.m16078t();
        this.f35822e = this.f35828k.m16078t();
        this.f35823f = this.f35828k.m16078t();
        int m16111D2 = this.f35828k.m16111D();
        this.f35824g = m16111D2;
        this.f35825h = m16111D2 + 27;
        this.f35828k.m16103L(m16111D2);
        interfaceC11747j.mo6963n(this.f35828k.m16094d(), 0, this.f35824g);
        for (int i = 0; i < this.f35824g; i++) {
            this.f35827j[i] = this.f35828k.m16111D();
            this.f35826i += this.f35827j[i];
        }
        return true;
    }

    /* renamed from: c */
    public void m1189c() {
        this.f35818a = 0;
        this.f35819b = 0;
        this.f35820c = 0L;
        this.f35821d = 0L;
        this.f35822e = 0L;
        this.f35823f = 0L;
        this.f35824g = 0;
        this.f35825h = 0;
        this.f35826i = 0;
    }

    /* renamed from: d */
    public boolean m1188d(InterfaceC11747j interfaceC11747j) {
        return m1187e(interfaceC11747j, -1L);
    }

    /* renamed from: e */
    public boolean m1187e(InterfaceC11747j interfaceC11747j, long j) {
        boolean z;
        int i;
        if (interfaceC11747j.getPosition() == interfaceC11747j.mo3742h()) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f35828k.m16103L(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || interfaceC11747j.getPosition() + 4 < j) && m1191a(interfaceC11747j, this.f35828k.m16094d(), 0, 4, true)) {
                this.f35828k.m16099P(0);
                if (this.f35828k.m16109F() == 1332176723) {
                    interfaceC11747j.mo6969e();
                    return true;
                }
                interfaceC11747j.mo6965k(1);
            }
        }
        do {
            if (i != 0 && interfaceC11747j.getPosition() >= j) {
                break;
            }
        } while (interfaceC11747j.mo6971a(1) != -1);
        return false;
    }
}
