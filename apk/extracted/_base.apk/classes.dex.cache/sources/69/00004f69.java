package p382v6;

import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p151i6.C7402m;
import p195k8.C9149a;
import p296q6.InterfaceC11747j;

/* renamed from: v6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13113a implements InterfaceC13117c {

    /* renamed from: a */
    private final byte[] f33961a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C13115b> f33962b = new ArrayDeque<>();

    /* renamed from: c */
    private final C13125g f33963c = new C13125g();

    /* renamed from: d */
    private InterfaceC13116b f33964d;

    /* renamed from: e */
    private int f33965e;

    /* renamed from: f */
    private int f33966f;

    /* renamed from: g */
    private long f33967g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13115b {

        /* renamed from: a */
        private final int f33968a;

        /* renamed from: b */
        private final long f33969b;

        private C13115b(int i, long j) {
            this.f33968a = i;
            this.f33969b = j;
        }
    }

    @RequiresNonNull({"processor"})
    /* renamed from: c */
    private long m3233c(InterfaceC11747j interfaceC11747j) {
        interfaceC11747j.mo6969e();
        while (true) {
            interfaceC11747j.mo6963n(this.f33961a, 0, 4);
            int m3162c = C13125g.m3162c(this.f33961a[0]);
            if (m3162c != -1 && m3162c <= 4) {
                int m3164a = (int) C13125g.m3164a(this.f33961a, m3162c, false);
                if (this.f33964d.mo3187e(m3164a)) {
                    interfaceC11747j.mo6965k(m3162c);
                    return m3164a;
                }
            }
            interfaceC11747j.mo6965k(1);
        }
    }

    /* renamed from: d */
    private double m3232d(InterfaceC11747j interfaceC11747j, int i) {
        long m3231e = m3231e(interfaceC11747j, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) m3231e);
        }
        return Double.longBitsToDouble(m3231e);
    }

    /* renamed from: e */
    private long m3231e(InterfaceC11747j interfaceC11747j, int i) {
        interfaceC11747j.readFully(this.f33961a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f33961a[i2] & 255);
        }
        return j;
    }

    /* renamed from: f */
    private static String m3230f(InterfaceC11747j interfaceC11747j, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        interfaceC11747j.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // p382v6.InterfaceC13117c
    /* renamed from: a */
    public boolean mo3227a(InterfaceC11747j interfaceC11747j) {
        C9149a.m16445h(this.f33964d);
        while (true) {
            C13115b peek = this.f33962b.peek();
            if (peek != null && interfaceC11747j.getPosition() >= peek.f33969b) {
                this.f33964d.mo3191a(this.f33962b.pop().f33968a);
                return true;
            }
            if (this.f33965e == 0) {
                long m3161d = this.f33963c.m3161d(interfaceC11747j, true, false, 4);
                if (m3161d == -2) {
                    m3161d = m3233c(interfaceC11747j);
                }
                if (m3161d == -1) {
                    return false;
                }
                this.f33966f = (int) m3161d;
                this.f33965e = 1;
            }
            if (this.f33965e == 1) {
                this.f33967g = this.f33963c.m3161d(interfaceC11747j, false, true, 8);
                this.f33965e = 2;
            }
            int mo3188d = this.f33964d.mo3188d(this.f33966f);
            if (mo3188d != 0) {
                if (mo3188d != 1) {
                    if (mo3188d != 2) {
                        if (mo3188d != 3) {
                            if (mo3188d != 4) {
                                if (mo3188d == 5) {
                                    long j = this.f33967g;
                                    if (j != 4 && j != 8) {
                                        throw new C7402m("Invalid float size: " + this.f33967g);
                                    }
                                    this.f33964d.mo3190b(this.f33966f, m3232d(interfaceC11747j, (int) j));
                                    this.f33965e = 0;
                                    return true;
                                }
                                throw new C7402m("Invalid element type " + mo3188d);
                            }
                            this.f33964d.mo3186f(this.f33966f, (int) this.f33967g, interfaceC11747j);
                            this.f33965e = 0;
                            return true;
                        }
                        long j2 = this.f33967g;
                        if (j2 <= 2147483647L) {
                            this.f33964d.mo3185g(this.f33966f, m3230f(interfaceC11747j, (int) j2));
                            this.f33965e = 0;
                            return true;
                        }
                        throw new C7402m("String element size: " + this.f33967g);
                    }
                    long j3 = this.f33967g;
                    if (j3 <= 8) {
                        this.f33964d.mo3189c(this.f33966f, m3231e(interfaceC11747j, (int) j3));
                        this.f33965e = 0;
                        return true;
                    }
                    throw new C7402m("Invalid integer size: " + this.f33967g);
                }
                long position = interfaceC11747j.getPosition();
                this.f33962b.push(new C13115b(this.f33966f, this.f33967g + position));
                this.f33964d.mo3184h(this.f33966f, position, this.f33967g);
                this.f33965e = 0;
                return true;
            }
            interfaceC11747j.mo6965k((int) this.f33967g);
            this.f33965e = 0;
        }
    }

    @Override // p382v6.InterfaceC13117c
    /* renamed from: b */
    public void mo3226b(InterfaceC13116b interfaceC13116b) {
        this.f33964d = interfaceC13116b;
    }

    @Override // p382v6.InterfaceC13117c
    public void reset() {
        this.f33965e = 0;
        this.f33962b.clear();
        this.f33963c.m3160e();
    }
}