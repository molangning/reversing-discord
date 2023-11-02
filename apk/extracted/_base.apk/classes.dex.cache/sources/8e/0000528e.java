package p439y6;

import java.util.Arrays;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.InterfaceC11747j;

/* renamed from: y6.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13917e {

    /* renamed from: a */
    private final C13918f f35813a = new C13918f();

    /* renamed from: b */
    private final C9208y f35814b = new C9208y(new byte[65025], 0);

    /* renamed from: c */
    private int f35815c = -1;

    /* renamed from: d */
    private int f35816d;

    /* renamed from: e */
    private boolean f35817e;

    /* renamed from: a */
    private int m1197a(int i) {
        int i2;
        int i3 = 0;
        this.f35816d = 0;
        do {
            int i4 = this.f35816d;
            int i5 = i + i4;
            C13918f c13918f = this.f35813a;
            if (i5 >= c13918f.f35824g) {
                break;
            }
            int[] iArr = c13918f.f35827j;
            this.f35816d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public C13918f m1196b() {
        return this.f35813a;
    }

    /* renamed from: c */
    public C9208y m1195c() {
        return this.f35814b;
    }

    /* renamed from: d */
    public boolean m1194d(InterfaceC11747j interfaceC11747j) {
        boolean z;
        boolean z2;
        int i;
        if (interfaceC11747j != null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (this.f35817e) {
            this.f35817e = false;
            this.f35814b.m16103L(0);
        }
        while (!this.f35817e) {
            if (this.f35815c < 0) {
                if (!this.f35813a.m1188d(interfaceC11747j) || !this.f35813a.m1190b(interfaceC11747j, true)) {
                    return false;
                }
                C13918f c13918f = this.f35813a;
                int i2 = c13918f.f35825h;
                if ((c13918f.f35819b & 1) == 1 && this.f35814b.m16092f() == 0) {
                    i2 += m1197a(0);
                    i = this.f35816d + 0;
                } else {
                    i = 0;
                }
                interfaceC11747j.mo6965k(i2);
                this.f35815c = i;
            }
            int m1197a = m1197a(this.f35815c);
            int i3 = this.f35815c + this.f35816d;
            if (m1197a > 0) {
                C9208y c9208y = this.f35814b;
                c9208y.m16095c(c9208y.m16092f() + m1197a);
                interfaceC11747j.readFully(this.f35814b.m16094d(), this.f35814b.m16092f(), m1197a);
                C9208y c9208y2 = this.f35814b;
                c9208y2.m16100O(c9208y2.m16092f() + m1197a);
                if (this.f35813a.f35827j[i3 - 1] != 255) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f35817e = z2;
            }
            if (i3 == this.f35813a.f35824g) {
                i3 = -1;
            }
            this.f35815c = i3;
        }
        return true;
    }

    /* renamed from: e */
    public void m1193e() {
        this.f35813a.m1189c();
        this.f35814b.m16103L(0);
        this.f35815c = -1;
        this.f35817e = false;
    }

    /* renamed from: f */
    public void m1192f() {
        if (this.f35814b.m16094d().length == 65025) {
            return;
        }
        C9208y c9208y = this.f35814b;
        c9208y.m16101N(Arrays.copyOf(c9208y.m16094d(), Math.max(65025, this.f35814b.m16092f())), this.f35814b.m16092f());
    }
}