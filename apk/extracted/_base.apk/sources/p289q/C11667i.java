package p289q;

import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import p289q.C11654b;

/* renamed from: q.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11667i implements C11654b.InterfaceC11655a {

    /* renamed from: n */
    private static float f30414n = 0.001f;

    /* renamed from: a */
    private final int f30415a = -1;

    /* renamed from: b */
    private int f30416b = 16;

    /* renamed from: c */
    private int f30417c = 16;

    /* renamed from: d */
    int[] f30418d = new int[16];

    /* renamed from: e */
    int[] f30419e = new int[16];

    /* renamed from: f */
    int[] f30420f = new int[16];

    /* renamed from: g */
    float[] f30421g = new float[16];

    /* renamed from: h */
    int[] f30422h = new int[16];

    /* renamed from: i */
    int[] f30423i = new int[16];

    /* renamed from: j */
    int f30424j = 0;

    /* renamed from: k */
    int f30425k = -1;

    /* renamed from: l */
    private final C11654b f30426l;

    /* renamed from: m */
    protected final C11656c f30427m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11667i(C11654b c11654b, C11656c c11656c) {
        this.f30426l = c11654b;
        this.f30427m = c11656c;
        clear();
    }

    /* renamed from: l */
    private void m7258l(C11665h c11665h, int i) {
        int[] iArr;
        int i2 = c11665h.f30396c % this.f30417c;
        int[] iArr2 = this.f30418d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f30419e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.f30419e[i] = -1;
    }

    /* renamed from: m */
    private void m7257m(int i, C11665h c11665h, float f) {
        this.f30420f[i] = c11665h.f30396c;
        this.f30421g[i] = f;
        this.f30422h[i] = -1;
        this.f30423i[i] = -1;
        c11665h.m7276a(this.f30426l);
        c11665h.f30406m++;
        this.f30424j++;
    }

    /* renamed from: n */
    private int m7256n() {
        for (int i = 0; i < this.f30416b; i++) {
            if (this.f30420f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m7255o() {
        int i = this.f30416b * 2;
        this.f30420f = Arrays.copyOf(this.f30420f, i);
        this.f30421g = Arrays.copyOf(this.f30421g, i);
        this.f30422h = Arrays.copyOf(this.f30422h, i);
        this.f30423i = Arrays.copyOf(this.f30423i, i);
        this.f30419e = Arrays.copyOf(this.f30419e, i);
        for (int i2 = this.f30416b; i2 < i; i2++) {
            this.f30420f[i2] = -1;
            this.f30419e[i2] = -1;
        }
        this.f30416b = i;
    }

    /* renamed from: q */
    private void m7253q(int i, C11665h c11665h, float f) {
        int m7256n = m7256n();
        m7257m(m7256n, c11665h, f);
        if (i != -1) {
            this.f30422h[m7256n] = i;
            int[] iArr = this.f30423i;
            iArr[m7256n] = iArr[i];
            iArr[i] = m7256n;
        } else {
            this.f30422h[m7256n] = -1;
            if (this.f30424j > 0) {
                this.f30423i[m7256n] = this.f30425k;
                this.f30425k = m7256n;
            } else {
                this.f30423i[m7256n] = -1;
            }
        }
        int i2 = this.f30423i[m7256n];
        if (i2 != -1) {
            this.f30422h[i2] = m7256n;
        }
        m7258l(c11665h, m7256n);
    }

    /* renamed from: r */
    private void m7252r(C11665h c11665h) {
        int[] iArr;
        int i;
        int i2 = c11665h.f30396c;
        int i3 = i2 % this.f30417c;
        int[] iArr2 = this.f30418d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f30420f[i4] == i2) {
            int[] iArr3 = this.f30419e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f30419e;
            i = iArr[i4];
            if (i == -1 || this.f30420f[i] == i2) {
                break;
            }
            i4 = i;
        }
        if (i != -1 && this.f30420f[i] == i2) {
            iArr[i4] = iArr[i];
            iArr[i] = -1;
        }
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: a */
    public void mo7269a(C11665h c11665h, float f) {
        float f2 = f30414n;
        if (f > (-f2) && f < f2) {
            mo7263g(c11665h, true);
            return;
        }
        if (this.f30424j == 0) {
            m7257m(0, c11665h, f);
            m7258l(c11665h, 0);
            this.f30425k = 0;
            return;
        }
        int m7254p = m7254p(c11665h);
        if (m7254p != -1) {
            this.f30421g[m7254p] = f;
            return;
        }
        if (this.f30424j + 1 >= this.f30416b) {
            m7255o();
        }
        int i = this.f30424j;
        int i2 = this.f30425k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f30420f[i2];
            int i6 = c11665h.f30396c;
            if (i5 == i6) {
                this.f30421g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.f30423i[i2];
            if (i2 == -1) {
                break;
            }
        }
        m7253q(i3, c11665h, f);
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: b */
    public C11665h mo7268b(int i) {
        int i2 = this.f30424j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f30425k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f30427m.f30358d[this.f30420f[i3]];
            }
            i3 = this.f30423i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: c */
    public void mo7267c() {
        int i = this.f30424j;
        int i2 = this.f30425k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f30421g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f30423i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p289q.C11654b.InterfaceC11655a
    public void clear() {
        int i = this.f30424j;
        for (int i2 = 0; i2 < i; i2++) {
            C11665h mo7268b = mo7268b(i2);
            if (mo7268b != null) {
                mo7268b.m7274c(this.f30426l);
            }
        }
        for (int i3 = 0; i3 < this.f30416b; i3++) {
            this.f30420f[i3] = -1;
            this.f30419e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f30417c; i4++) {
            this.f30418d[i4] = -1;
        }
        this.f30424j = 0;
        this.f30425k = -1;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: d */
    public float mo7266d(C11665h c11665h) {
        int m7254p = m7254p(c11665h);
        if (m7254p != -1) {
            return this.f30421g[m7254p];
        }
        return 0.0f;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: e */
    public float mo7265e(C11654b c11654b, boolean z) {
        float mo7266d = mo7266d(c11654b.f30349a);
        mo7263g(c11654b.f30349a, z);
        C11667i c11667i = (C11667i) c11654b.f30353e;
        int mo7264f = c11667i.mo7264f();
        int i = 0;
        int i2 = 0;
        while (i < mo7264f) {
            int i3 = c11667i.f30420f[i2];
            if (i3 != -1) {
                mo7260j(this.f30427m.f30358d[i3], c11667i.f30421g[i2] * mo7266d, z);
                i++;
            }
            i2++;
        }
        return mo7266d;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: f */
    public int mo7264f() {
        return this.f30424j;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: g */
    public float mo7263g(C11665h c11665h, boolean z) {
        int m7254p = m7254p(c11665h);
        if (m7254p == -1) {
            return 0.0f;
        }
        m7252r(c11665h);
        float f = this.f30421g[m7254p];
        if (this.f30425k == m7254p) {
            this.f30425k = this.f30423i[m7254p];
        }
        this.f30420f[m7254p] = -1;
        int[] iArr = this.f30422h;
        int i = iArr[m7254p];
        if (i != -1) {
            int[] iArr2 = this.f30423i;
            iArr2[i] = iArr2[m7254p];
        }
        int i2 = this.f30423i[m7254p];
        if (i2 != -1) {
            iArr[i2] = iArr[m7254p];
        }
        this.f30424j--;
        c11665h.f30406m--;
        if (z) {
            c11665h.m7274c(this.f30426l);
        }
        return f;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: h */
    public boolean mo7262h(C11665h c11665h) {
        return m7254p(c11665h) != -1;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: i */
    public float mo7261i(int i) {
        int i2 = this.f30424j;
        int i3 = this.f30425k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f30421g[i3];
            }
            i3 = this.f30423i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: j */
    public void mo7260j(C11665h c11665h, float f, boolean z) {
        float f2 = f30414n;
        if (f > (-f2) && f < f2) {
            return;
        }
        int m7254p = m7254p(c11665h);
        if (m7254p == -1) {
            mo7269a(c11665h, f);
            return;
        }
        float[] fArr = this.f30421g;
        float f3 = fArr[m7254p] + f;
        fArr[m7254p] = f3;
        float f4 = f30414n;
        if (f3 > (-f4) && f3 < f4) {
            fArr[m7254p] = 0.0f;
            mo7263g(c11665h, z);
        }
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: k */
    public void mo7259k(float f) {
        int i = this.f30424j;
        int i2 = this.f30425k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f30421g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f30423i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    /* renamed from: p */
    public int m7254p(C11665h c11665h) {
        if (this.f30424j == 0) {
            return -1;
        }
        int i = c11665h.f30396c;
        int i2 = this.f30418d[i % this.f30417c];
        if (i2 == -1) {
            return -1;
        }
        if (this.f30420f[i2] == i) {
            return i2;
        }
        do {
            i2 = this.f30419e[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.f30420f[i2] != i);
        if (i2 == -1 || this.f30420f[i2] != i) {
            return -1;
        }
        return i2;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f30424j;
        for (int i2 = 0; i2 < i; i2++) {
            C11665h mo7268b = mo7268b(i2);
            if (mo7268b != null) {
                String str4 = str3 + mo7268b + " = " + mo7261i(i2) + " ";
                int m7254p = m7254p(mo7268b);
                String str5 = str4 + "[p: ";
                if (this.f30422h[m7254p] != -1) {
                    str = str5 + this.f30427m.f30358d[this.f30420f[this.f30422h[m7254p]]];
                } else {
                    str = str5 + ViewProps.NONE;
                }
                String str6 = str + ", n: ";
                if (this.f30423i[m7254p] != -1) {
                    str2 = str6 + this.f30427m.f30358d[this.f30420f[this.f30423i[m7254p]]];
                } else {
                    str2 = str6 + ViewProps.NONE;
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
