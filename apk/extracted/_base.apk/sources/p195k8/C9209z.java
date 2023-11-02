package p195k8;

/* renamed from: k8.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9209z {

    /* renamed from: a */
    private byte[] f24237a;

    /* renamed from: b */
    private int f24238b;

    /* renamed from: c */
    private int f24239c;

    /* renamed from: d */
    private int f24240d;

    public C9209z(byte[] bArr, int i, int i2) {
        m16063i(bArr, i, i2);
    }

    /* renamed from: a */
    private void m16071a() {
        int i;
        int i2 = this.f24239c;
        C9149a.m16447f(i2 >= 0 && (i2 < (i = this.f24238b) || (i2 == i && this.f24240d == 0)));
    }

    /* renamed from: f */
    private int m16066f() {
        int i = 0;
        int i2 = 0;
        while (!m16068d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = m16067e(i2);
        }
        return i3 + i;
    }

    /* renamed from: j */
    private boolean m16062j(int i) {
        if (2 <= i && i < this.f24238b) {
            byte[] bArr = this.f24237a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m16070b(int i) {
        int i2 = this.f24239c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f24240d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f24238b) {
                break;
            } else if (m16062j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f24238b;
        if (i4 < i6) {
            return true;
        }
        if (i4 == i6 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m16069c() {
        boolean z;
        int i = this.f24239c;
        int i2 = this.f24240d;
        int i3 = 0;
        while (this.f24239c < this.f24238b && !m16068d()) {
            i3++;
        }
        if (this.f24239c == this.f24238b) {
            z = true;
        } else {
            z = false;
        }
        this.f24239c = i;
        this.f24240d = i2;
        if (z || !m16070b((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m16068d() {
        boolean z;
        if ((this.f24237a[this.f24239c] & (128 >> this.f24240d)) != 0) {
            z = true;
        } else {
            z = false;
        }
        m16061k();
        return z;
    }

    /* renamed from: e */
    public int m16067e(int i) {
        int i2;
        int i3;
        this.f24240d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f24240d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f24240d = i5;
            byte[] bArr = this.f24237a;
            int i6 = this.f24239c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m16062j(i6 + 1)) {
                i3 = 1;
            }
            this.f24239c = i6 + i3;
        }
        byte[] bArr2 = this.f24237a;
        int i7 = this.f24239c;
        int i8 = ((-1) >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f24240d = 0;
            if (!m16062j(i7 + 1)) {
                i3 = 1;
            }
            this.f24239c = i7 + i3;
        }
        m16071a();
        return i8;
    }

    /* renamed from: g */
    public int m16065g() {
        int i;
        int m16066f = m16066f();
        if (m16066f % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return i * ((m16066f + 1) / 2);
    }

    /* renamed from: h */
    public int m16064h() {
        return m16066f();
    }

    /* renamed from: i */
    public void m16063i(byte[] bArr, int i, int i2) {
        this.f24237a = bArr;
        this.f24239c = i;
        this.f24238b = i2;
        this.f24240d = 0;
        m16071a();
    }

    /* renamed from: k */
    public void m16061k() {
        int i = 1;
        int i2 = this.f24240d + 1;
        this.f24240d = i2;
        if (i2 == 8) {
            this.f24240d = 0;
            int i3 = this.f24239c;
            if (m16062j(i3 + 1)) {
                i = 2;
            }
            this.f24239c = i3 + i;
        }
        m16071a();
    }

    /* renamed from: l */
    public void m16060l(int i) {
        int i2 = this.f24239c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f24239c = i4;
        int i5 = this.f24240d + (i - (i3 * 8));
        this.f24240d = i5;
        if (i5 > 7) {
            this.f24239c = i4 + 1;
            this.f24240d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.f24239c) {
                if (m16062j(i2)) {
                    this.f24239c++;
                    i2 += 2;
                }
            } else {
                m16071a();
                return;
            }
        }
    }
}
