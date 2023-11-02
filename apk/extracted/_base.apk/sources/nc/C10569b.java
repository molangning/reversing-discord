package nc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: nc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10569b {

    /* renamed from: a */
    private final C10568a f27586a;

    /* renamed from: b */
    private final int[] f27587b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10569b(C10568a c10568a, int[] iArr) {
        if (iArr.length != 0) {
            this.f27586a = c10568a;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f27587b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f27587b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f27587b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C10569b m11211a(C10569b c10569b) {
        if (this.f27586a.equals(c10569b.f27586a)) {
            if (m11207e()) {
                return c10569b;
            }
            if (c10569b.m11207e()) {
                return this;
            }
            int[] iArr = this.f27587b;
            int[] iArr2 = c10569b.f27587b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = C10568a.m11221a(iArr2[i - length], iArr[i]);
            }
            return new C10569b(this.f27586a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m11210b(int i) {
        if (i == 0) {
            return m11209c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f27587b) {
                i2 = C10568a.m11221a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f27587b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = C10568a.m11221a(this.f27586a.m11212j(i, i4), this.f27587b[i5]);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m11209c(int i) {
        int[] iArr = this.f27587b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m11208d() {
        return this.f27587b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m11207e() {
        return this.f27587b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C10569b m11206f(int i) {
        if (i == 0) {
            return this.f27586a.m11215g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f27587b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f27586a.m11212j(this.f27587b[i2], i);
        }
        return new C10569b(this.f27586a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C10569b m11205g(C10569b c10569b) {
        if (this.f27586a.equals(c10569b.f27586a)) {
            if (!m11207e() && !c10569b.m11207e()) {
                int[] iArr = this.f27587b;
                int length = iArr.length;
                int[] iArr2 = c10569b.f27587b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = C10568a.m11221a(iArr3[i4], this.f27586a.m11212j(i2, iArr2[i3]));
                    }
                }
                return new C10569b(this.f27586a, iArr3);
            }
            return this.f27586a.m11215g();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C10569b m11204h(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f27586a.m11215g();
            }
            int length = this.f27587b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f27586a.m11212j(this.f27587b[i3], i2);
            }
            return new C10569b(this.f27586a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m11208d() * 8);
        for (int m11208d = m11208d(); m11208d >= 0; m11208d--) {
            int m11209c = m11209c(m11208d);
            if (m11209c != 0) {
                if (m11209c < 0) {
                    sb2.append(" - ");
                    m11209c = -m11209c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m11208d == 0 || m11209c != 1) {
                    int m11213i = this.f27586a.m11213i(m11209c);
                    if (m11213i == 0) {
                        sb2.append('1');
                    } else if (m11213i == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(m11213i);
                    }
                }
                if (m11208d != 0) {
                    if (m11208d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m11208d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
