package p008a7;

import p195k8.C9183l0;
import p195k8.C9191p0;
import p195k8.C9208y;
import p296q6.C11765x;
import p296q6.InterfaceC11747j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a7.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0044f0 {

    /* renamed from: a */
    private final int f106a;

    /* renamed from: d */
    private boolean f109d;

    /* renamed from: e */
    private boolean f110e;

    /* renamed from: f */
    private boolean f111f;

    /* renamed from: b */
    private final C9183l0 f107b = new C9183l0(0);

    /* renamed from: g */
    private long f112g = -9223372036854775807L;

    /* renamed from: h */
    private long f113h = -9223372036854775807L;

    /* renamed from: i */
    private long f114i = -9223372036854775807L;

    /* renamed from: c */
    private final C9208y f108c = new C9208y();

    public C0044f0(int i) {
        this.f106a = i;
    }

    /* renamed from: a */
    private int m41346a(InterfaceC11747j interfaceC11747j) {
        this.f108c.m16102M(C9191p0.f24176f);
        this.f109d = true;
        interfaceC11747j.mo6969e();
        return 0;
    }

    /* renamed from: f */
    private int m41341f(InterfaceC11747j interfaceC11747j, C11765x c11765x, int i) {
        int min = (int) Math.min(this.f106a, interfaceC11747j.getLength());
        long j = 0;
        if (interfaceC11747j.getPosition() != j) {
            c11765x.f30668a = j;
            return 1;
        }
        this.f108c.m16103L(min);
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6963n(this.f108c.m16094d(), 0, min);
        this.f112g = m41340g(this.f108c, i);
        this.f110e = true;
        return 0;
    }

    /* renamed from: g */
    private long m41340g(C9208y c9208y, int i) {
        int m16092f = c9208y.m16092f();
        for (int m16093e = c9208y.m16093e(); m16093e < m16092f; m16093e++) {
            if (c9208y.m16094d()[m16093e] == 71) {
                long m41278b = C0058j0.m41278b(c9208y, m16093e, i);
                if (m41278b != -9223372036854775807L) {
                    return m41278b;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    private int m41339h(InterfaceC11747j interfaceC11747j, C11765x c11765x, int i) {
        long length = interfaceC11747j.getLength();
        int min = (int) Math.min(this.f106a, length);
        long j = length - min;
        if (interfaceC11747j.getPosition() != j) {
            c11765x.f30668a = j;
            return 1;
        }
        this.f108c.m16103L(min);
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6963n(this.f108c.m16094d(), 0, min);
        this.f113h = m41338i(this.f108c, i);
        this.f111f = true;
        return 0;
    }

    /* renamed from: i */
    private long m41338i(C9208y c9208y, int i) {
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        while (true) {
            m16092f--;
            if (m16092f < m16093e) {
                return -9223372036854775807L;
            }
            if (c9208y.m16094d()[m16092f] == 71) {
                long m41278b = C0058j0.m41278b(c9208y, m16092f, i);
                if (m41278b != -9223372036854775807L) {
                    return m41278b;
                }
            }
        }
    }

    /* renamed from: b */
    public long m41345b() {
        return this.f114i;
    }

    /* renamed from: c */
    public C9183l0 m41344c() {
        return this.f107b;
    }

    /* renamed from: d */
    public boolean m41343d() {
        return this.f109d;
    }

    /* renamed from: e */
    public int m41342e(InterfaceC11747j interfaceC11747j, C11765x c11765x, int i) {
        if (i <= 0) {
            return m41346a(interfaceC11747j);
        }
        if (!this.f111f) {
            return m41339h(interfaceC11747j, c11765x, i);
        }
        if (this.f113h == -9223372036854775807L) {
            return m41346a(interfaceC11747j);
        }
        if (!this.f110e) {
            return m41341f(interfaceC11747j, c11765x, i);
        }
        long j = this.f112g;
        if (j == -9223372036854775807L) {
            return m41346a(interfaceC11747j);
        }
        this.f114i = this.f107b.m16345b(this.f113h) - this.f107b.m16345b(j);
        return m41346a(interfaceC11747j);
    }
}