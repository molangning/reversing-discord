package p289q;

import java.util.Arrays;
import p289q.C11654b;

/* renamed from: q.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11653a implements C11654b.InterfaceC11655a {

    /* renamed from: l */
    private static float f30337l = 0.001f;

    /* renamed from: b */
    private final C11654b f30339b;

    /* renamed from: c */
    protected final C11656c f30340c;

    /* renamed from: a */
    int f30338a = 0;

    /* renamed from: d */
    private int f30341d = 8;

    /* renamed from: e */
    private C11665h f30342e = null;

    /* renamed from: f */
    private int[] f30343f = new int[8];

    /* renamed from: g */
    private int[] f30344g = new int[8];

    /* renamed from: h */
    private float[] f30345h = new float[8];

    /* renamed from: i */
    private int f30346i = -1;

    /* renamed from: j */
    private int f30347j = -1;

    /* renamed from: k */
    private boolean f30348k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11653a(C11654b c11654b, C11656c c11656c) {
        this.f30339b = c11654b;
        this.f30340c = c11656c;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: a */
    public final void mo7269a(C11665h c11665h, float f) {
        if (f == 0.0f) {
            mo7263g(c11665h, true);
            return;
        }
        int i = this.f30346i;
        if (i == -1) {
            this.f30346i = 0;
            this.f30345h[0] = f;
            this.f30343f[0] = c11665h.f30396c;
            this.f30344g[0] = -1;
            c11665h.f30406m++;
            c11665h.m7276a(this.f30339b);
            this.f30338a++;
            if (!this.f30348k) {
                int i2 = this.f30347j + 1;
                this.f30347j = i2;
                int[] iArr = this.f30343f;
                if (i2 >= iArr.length) {
                    this.f30348k = true;
                    this.f30347j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f30338a; i4++) {
            int i5 = this.f30343f[i];
            int i6 = c11665h.f30396c;
            if (i5 == i6) {
                this.f30345h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f30344g[i];
        }
        int i7 = this.f30347j;
        int i8 = i7 + 1;
        if (this.f30348k) {
            int[] iArr2 = this.f30343f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f30343f;
        if (i7 >= iArr3.length && this.f30338a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f30343f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f30343f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f30341d * 2;
            this.f30341d = i10;
            this.f30348k = false;
            this.f30347j = i7 - 1;
            this.f30345h = Arrays.copyOf(this.f30345h, i10);
            this.f30343f = Arrays.copyOf(this.f30343f, this.f30341d);
            this.f30344g = Arrays.copyOf(this.f30344g, this.f30341d);
        }
        this.f30343f[i7] = c11665h.f30396c;
        this.f30345h[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f30344g;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f30344g[i7] = this.f30346i;
            this.f30346i = i7;
        }
        c11665h.f30406m++;
        c11665h.m7276a(this.f30339b);
        int i11 = this.f30338a + 1;
        this.f30338a = i11;
        if (!this.f30348k) {
            this.f30347j++;
        }
        int[] iArr7 = this.f30343f;
        if (i11 >= iArr7.length) {
            this.f30348k = true;
        }
        if (this.f30347j >= iArr7.length) {
            this.f30348k = true;
            this.f30347j = iArr7.length - 1;
        }
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: b */
    public C11665h mo7268b(int i) {
        int i2 = this.f30346i;
        for (int i3 = 0; i2 != -1 && i3 < this.f30338a; i3++) {
            if (i3 == i) {
                return this.f30340c.f30358d[this.f30343f[i2]];
            }
            i2 = this.f30344g[i2];
        }
        return null;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: c */
    public void mo7267c() {
        int i = this.f30346i;
        for (int i2 = 0; i != -1 && i2 < this.f30338a; i2++) {
            float[] fArr = this.f30345h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f30344g[i];
        }
    }

    @Override // p289q.C11654b.InterfaceC11655a
    public final void clear() {
        int i = this.f30346i;
        for (int i2 = 0; i != -1 && i2 < this.f30338a; i2++) {
            C11665h c11665h = this.f30340c.f30358d[this.f30343f[i]];
            if (c11665h != null) {
                c11665h.m7274c(this.f30339b);
            }
            i = this.f30344g[i];
        }
        this.f30346i = -1;
        this.f30347j = -1;
        this.f30348k = false;
        this.f30338a = 0;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: d */
    public final float mo7266d(C11665h c11665h) {
        int i = this.f30346i;
        for (int i2 = 0; i != -1 && i2 < this.f30338a; i2++) {
            if (this.f30343f[i] == c11665h.f30396c) {
                return this.f30345h[i];
            }
            i = this.f30344g[i];
        }
        return 0.0f;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: e */
    public float mo7265e(C11654b c11654b, boolean z) {
        float mo7266d = mo7266d(c11654b.f30349a);
        mo7263g(c11654b.f30349a, z);
        C11654b.InterfaceC11655a interfaceC11655a = c11654b.f30353e;
        int mo7264f = interfaceC11655a.mo7264f();
        for (int i = 0; i < mo7264f; i++) {
            C11665h mo7268b = interfaceC11655a.mo7268b(i);
            mo7260j(mo7268b, interfaceC11655a.mo7266d(mo7268b) * mo7266d, z);
        }
        return mo7266d;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: f */
    public int mo7264f() {
        return this.f30338a;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: g */
    public final float mo7263g(C11665h c11665h, boolean z) {
        if (this.f30342e == c11665h) {
            this.f30342e = null;
        }
        int i = this.f30346i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f30338a) {
            if (this.f30343f[i] == c11665h.f30396c) {
                if (i == this.f30346i) {
                    this.f30346i = this.f30344g[i];
                } else {
                    int[] iArr = this.f30344g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c11665h.m7274c(this.f30339b);
                }
                c11665h.f30406m--;
                this.f30338a--;
                this.f30343f[i] = -1;
                if (this.f30348k) {
                    this.f30347j = i;
                }
                return this.f30345h[i];
            }
            i2++;
            i3 = i;
            i = this.f30344g[i];
        }
        return 0.0f;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: h */
    public boolean mo7262h(C11665h c11665h) {
        int i = this.f30346i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f30338a; i2++) {
            if (this.f30343f[i] == c11665h.f30396c) {
                return true;
            }
            i = this.f30344g[i];
        }
        return false;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: i */
    public float mo7261i(int i) {
        int i2 = this.f30346i;
        for (int i3 = 0; i2 != -1 && i3 < this.f30338a; i3++) {
            if (i3 == i) {
                return this.f30345h[i2];
            }
            i2 = this.f30344g[i2];
        }
        return 0.0f;
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: j */
    public void mo7260j(C11665h c11665h, float f, boolean z) {
        float f2 = f30337l;
        if (f > (-f2) && f < f2) {
            return;
        }
        int i = this.f30346i;
        if (i == -1) {
            this.f30346i = 0;
            this.f30345h[0] = f;
            this.f30343f[0] = c11665h.f30396c;
            this.f30344g[0] = -1;
            c11665h.f30406m++;
            c11665h.m7276a(this.f30339b);
            this.f30338a++;
            if (!this.f30348k) {
                int i2 = this.f30347j + 1;
                this.f30347j = i2;
                int[] iArr = this.f30343f;
                if (i2 >= iArr.length) {
                    this.f30348k = true;
                    this.f30347j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f30338a; i4++) {
            int i5 = this.f30343f[i];
            int i6 = c11665h.f30396c;
            if (i5 == i6) {
                float[] fArr = this.f30345h;
                float f3 = fArr[i] + f;
                float f4 = f30337l;
                if (f3 > (-f4) && f3 < f4) {
                    f3 = 0.0f;
                }
                fArr[i] = f3;
                if (f3 == 0.0f) {
                    if (i == this.f30346i) {
                        this.f30346i = this.f30344g[i];
                    } else {
                        int[] iArr2 = this.f30344g;
                        iArr2[i3] = iArr2[i];
                    }
                    if (z) {
                        c11665h.m7274c(this.f30339b);
                    }
                    if (this.f30348k) {
                        this.f30347j = i;
                    }
                    c11665h.f30406m--;
                    this.f30338a--;
                    return;
                }
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f30344g[i];
        }
        int i7 = this.f30347j;
        int i8 = i7 + 1;
        if (this.f30348k) {
            int[] iArr3 = this.f30343f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f30343f;
        if (i7 >= iArr4.length && this.f30338a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f30343f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f30343f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f30341d * 2;
            this.f30341d = i10;
            this.f30348k = false;
            this.f30347j = i7 - 1;
            this.f30345h = Arrays.copyOf(this.f30345h, i10);
            this.f30343f = Arrays.copyOf(this.f30343f, this.f30341d);
            this.f30344g = Arrays.copyOf(this.f30344g, this.f30341d);
        }
        this.f30343f[i7] = c11665h.f30396c;
        this.f30345h[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.f30344g;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.f30344g[i7] = this.f30346i;
            this.f30346i = i7;
        }
        c11665h.f30406m++;
        c11665h.m7276a(this.f30339b);
        this.f30338a++;
        if (!this.f30348k) {
            this.f30347j++;
        }
        int i11 = this.f30347j;
        int[] iArr8 = this.f30343f;
        if (i11 >= iArr8.length) {
            this.f30348k = true;
            this.f30347j = iArr8.length - 1;
        }
    }

    @Override // p289q.C11654b.InterfaceC11655a
    /* renamed from: k */
    public void mo7259k(float f) {
        int i = this.f30346i;
        for (int i2 = 0; i != -1 && i2 < this.f30338a; i2++) {
            float[] fArr = this.f30345h;
            fArr[i] = fArr[i] / f;
            i = this.f30344g[i];
        }
    }

    public String toString() {
        int i = this.f30346i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f30338a; i2++) {
            str = ((str + " -> ") + this.f30345h[i] + " : ") + this.f30340c.f30358d[this.f30343f[i]];
            i = this.f30344g[i];
        }
        return str;
    }
}
