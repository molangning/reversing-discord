package p464zc;

/* renamed from: zc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14147c {

    /* renamed from: a */
    private final C14146b f36394a;

    /* renamed from: b */
    private final int[] f36395b;

    public C14147c(C14146b c14146b, int[] iArr) {
        if (iArr.length != 0) {
            this.f36394a = c14146b;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f36395b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f36395b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f36395b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C14147c m573a(C14147c c14147c) {
        if (this.f36394a.equals(c14147c.f36394a)) {
            if (m569e()) {
                return c14147c;
            }
            if (c14147c.m569e()) {
                return this;
            }
            int[] iArr = this.f36395b;
            int[] iArr2 = c14147c.f36395b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.f36394a.m583a(iArr2[i - length], iArr[i]);
            }
            return new C14147c(this.f36394a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* renamed from: b */
    public int m572b(int i) {
        if (i == 0) {
            return m571c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f36395b) {
                i2 = this.f36394a.m583a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f36395b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            C14146b c14146b = this.f36394a;
            i4 = c14146b.m583a(c14146b.m575i(i, i4), this.f36395b[i5]);
        }
        return i4;
    }

    /* renamed from: c */
    public int m571c(int i) {
        int[] iArr = this.f36395b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int m570d() {
        return this.f36395b.length - 1;
    }

    /* renamed from: e */
    public boolean m569e() {
        return this.f36395b[0] == 0;
    }

    /* renamed from: f */
    public C14147c m568f(int i) {
        if (i == 0) {
            return this.f36394a.m578f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f36395b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f36394a.m575i(this.f36395b[i2], i);
        }
        return new C14147c(this.f36394a, iArr);
    }

    /* renamed from: g */
    public C14147c m567g(C14147c c14147c) {
        if (this.f36394a.equals(c14147c.f36394a)) {
            if (!m569e() && !c14147c.m569e()) {
                int[] iArr = this.f36395b;
                int length = iArr.length;
                int[] iArr2 = c14147c.f36395b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        C14146b c14146b = this.f36394a;
                        iArr3[i4] = c14146b.m583a(iArr3[i4], c14146b.m575i(i2, iArr2[i3]));
                    }
                }
                return new C14147c(this.f36394a, iArr3);
            }
            return this.f36394a.m578f();
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* renamed from: h */
    public C14147c m566h(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f36394a.m578f();
            }
            int length = this.f36395b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f36394a.m575i(this.f36395b[i3], i2);
            }
            return new C14147c(this.f36394a, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public C14147c m565i() {
        int length = this.f36395b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f36394a.m574j(0, this.f36395b[i]);
        }
        return new C14147c(this.f36394a, iArr);
    }

    /* renamed from: j */
    public C14147c m564j(C14147c c14147c) {
        if (this.f36394a.equals(c14147c.f36394a)) {
            if (c14147c.m569e()) {
                return this;
            }
            return m573a(c14147c.m565i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m570d() * 8);
        for (int m570d = m570d(); m570d >= 0; m570d--) {
            int m571c = m571c(m570d);
            if (m571c != 0) {
                if (m571c < 0) {
                    sb2.append(" - ");
                    m571c = -m571c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m570d == 0 || m571c != 1) {
                    sb2.append(m571c);
                }
                if (m570d != 0) {
                    if (m570d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m570d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}