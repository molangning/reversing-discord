package p136hc;

/* renamed from: hc.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC7062h {

    /* renamed from: a */
    private final int f19340a;

    /* renamed from: b */
    private final int f19341b;

    public AbstractC7062h(int i, int i2) {
        this.f19340a = i;
        this.f19341b = i2;
    }

    /* renamed from: a */
    public final int m21469a() {
        return this.f19341b;
    }

    /* renamed from: b */
    public abstract byte[] mo21460b();

    /* renamed from: c */
    public abstract byte[] mo21459c(int i, byte[] bArr);

    /* renamed from: d */
    public final int m21468d() {
        return this.f19340a;
    }

    /* renamed from: e */
    public AbstractC7062h mo21467e() {
        return new C7061g(this);
    }

    /* renamed from: f */
    public boolean mo21466f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC7062h mo21465g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.f19340a;
        byte[] bArr = new byte[i];
        StringBuilder sb2 = new StringBuilder(this.f19341b * (i + 1));
        for (int i2 = 0; i2 < this.f19341b; i2++) {
            bArr = mo21459c(i2, bArr);
            for (int i3 = 0; i3 < this.f19340a; i3++) {
                int i4 = bArr[i3] & 255;
                if (i4 < 64) {
                    c = '#';
                } else if (i4 < 128) {
                    c = '+';
                } else if (i4 < 192) {
                    c = '.';
                } else {
                    c = ' ';
                }
                sb2.append(c);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}