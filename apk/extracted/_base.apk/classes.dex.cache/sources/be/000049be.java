package p289q;

import java.util.Arrays;
import java.util.Comparator;
import p289q.C11654b;

/* renamed from: q.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11662g extends C11654b {

    /* renamed from: g */
    private int f30383g;

    /* renamed from: h */
    private C11665h[] f30384h;

    /* renamed from: i */
    private C11665h[] f30385i;

    /* renamed from: j */
    private int f30386j;

    /* renamed from: k */
    C11664b f30387k;

    /* renamed from: l */
    C11656c f30388l;

    /* renamed from: q.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C11663a implements Comparator<C11665h> {
        C11663a() {
            C11662g.this = r1;
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C11665h c11665h, C11665h c11665h2) {
            return c11665h.f30396c - c11665h2.f30396c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C11664b implements Comparable {

        /* renamed from: j */
        C11665h f30390j;

        /* renamed from: k */
        C11662g f30391k;

        public C11664b(C11662g c11662g) {
            C11662g.this = r1;
            this.f30391k = c11662g;
        }

        /* renamed from: a */
        public boolean m7281a(C11665h c11665h, float f) {
            boolean z = true;
            if (this.f30390j.f30394a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f30390j.f30402i;
                    float f2 = fArr[i] + (c11665h.f30402i[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.f30390j.f30402i[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C11662g.this.m7285G(this.f30390j);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = c11665h.f30402i[i2];
                if (f3 != 0.0f) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.f30390j.f30402i[i2] = f4;
                } else {
                    this.f30390j.f30402i[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void m7280b(C11665h c11665h) {
            this.f30390j = c11665h;
        }

        /* renamed from: c */
        public final boolean m7279c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f30390j.f30402i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f30390j.f30396c - ((C11665h) obj).f30396c;
        }

        /* renamed from: d */
        public final boolean m7278d(C11665h c11665h) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = c11665h.f30402i[i];
                float f2 = this.f30390j.f30402i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m7277e() {
            Arrays.fill(this.f30390j.f30402i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f30390j != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f30390j.f30402i[i] + " ";
                }
            }
            return str + "] " + this.f30390j;
        }
    }

    public C11662g(C11656c c11656c) {
        super(c11656c);
        this.f30383g = 128;
        this.f30384h = new C11665h[128];
        this.f30385i = new C11665h[128];
        this.f30386j = 0;
        this.f30387k = new C11664b(this);
        this.f30388l = c11656c;
    }

    /* renamed from: F */
    private final void m7286F(C11665h c11665h) {
        int i;
        int i2 = this.f30386j + 1;
        C11665h[] c11665hArr = this.f30384h;
        if (i2 > c11665hArr.length) {
            C11665h[] c11665hArr2 = (C11665h[]) Arrays.copyOf(c11665hArr, c11665hArr.length * 2);
            this.f30384h = c11665hArr2;
            this.f30385i = (C11665h[]) Arrays.copyOf(c11665hArr2, c11665hArr2.length * 2);
        }
        C11665h[] c11665hArr3 = this.f30384h;
        int i3 = this.f30386j;
        c11665hArr3[i3] = c11665h;
        int i4 = i3 + 1;
        this.f30386j = i4;
        if (i4 > 1 && c11665hArr3[i4 - 1].f30396c > c11665h.f30396c) {
            int i5 = 0;
            while (true) {
                i = this.f30386j;
                if (i5 >= i) {
                    break;
                }
                this.f30385i[i5] = this.f30384h[i5];
                i5++;
            }
            Arrays.sort(this.f30385i, 0, i, new C11663a());
            for (int i6 = 0; i6 < this.f30386j; i6++) {
                this.f30384h[i6] = this.f30385i[i6];
            }
        }
        c11665h.f30394a = true;
        c11665h.m7276a(this);
    }

    /* renamed from: G */
    public final void m7285G(C11665h c11665h) {
        int i = 0;
        while (i < this.f30386j) {
            if (this.f30384h[i] == c11665h) {
                while (true) {
                    int i2 = this.f30386j;
                    if (i < i2 - 1) {
                        C11665h[] c11665hArr = this.f30384h;
                        int i3 = i + 1;
                        c11665hArr[i] = c11665hArr[i3];
                        i = i3;
                    } else {
                        this.f30386j = i2 - 1;
                        c11665h.f30394a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p289q.C11654b
    /* renamed from: C */
    public void mo7288C(C11654b c11654b, boolean z) {
        C11665h c11665h = c11654b.f30349a;
        if (c11665h == null) {
            return;
        }
        C11654b.InterfaceC11655a interfaceC11655a = c11654b.f30353e;
        int mo7264f = interfaceC11655a.mo7264f();
        for (int i = 0; i < mo7264f; i++) {
            C11665h mo7268b = interfaceC11655a.mo7268b(i);
            float mo7261i = interfaceC11655a.mo7261i(i);
            this.f30387k.m7280b(mo7268b);
            if (this.f30387k.m7281a(c11665h, mo7261i)) {
                m7286F(mo7268b);
            }
            this.f30350b += c11654b.f30350b * mo7261i;
        }
        m7285G(c11665h);
    }

    @Override // p289q.C11654b, p289q.C11657d.InterfaceC11658a
    /* renamed from: b */
    public void mo7284b(C11665h c11665h) {
        this.f30387k.m7280b(c11665h);
        this.f30387k.m7277e();
        c11665h.f30402i[c11665h.f30398e] = 1.0f;
        m7286F(c11665h);
    }

    @Override // p289q.C11654b, p289q.C11657d.InterfaceC11658a
    /* renamed from: c */
    public C11665h mo7283c(C11657d c11657d, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f30386j; i2++) {
            C11665h c11665h = this.f30384h[i2];
            if (!zArr[c11665h.f30396c]) {
                this.f30387k.m7280b(c11665h);
                if (i == -1) {
                    if (!this.f30387k.m7279c()) {
                    }
                    i = i2;
                } else {
                    if (!this.f30387k.m7278d(this.f30384h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f30384h[i];
    }

    @Override // p289q.C11654b, p289q.C11657d.InterfaceC11658a
    public void clear() {
        this.f30386j = 0;
        this.f30350b = 0.0f;
    }

    @Override // p289q.C11654b
    public String toString() {
        String str = " goal -> (" + this.f30350b + ") : ";
        for (int i = 0; i < this.f30386j; i++) {
            this.f30387k.m7280b(this.f30384h[i]);
            str = str + this.f30387k + " ";
        }
        return str;
    }
}