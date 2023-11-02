package lc;

/* renamed from: lc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10121c {

    /* renamed from: a */
    private final byte[] f26367a;

    /* renamed from: b */
    private int f26368b;

    /* renamed from: c */
    private int f26369c;

    public C10121c(byte[] bArr) {
        this.f26367a = bArr;
    }

    /* renamed from: a */
    public int m12240a() {
        return ((this.f26367a.length - this.f26368b) * 8) - this.f26369c;
    }

    /* renamed from: b */
    public int m12239b() {
        return this.f26369c;
    }

    /* renamed from: c */
    public int m12238c() {
        return this.f26368b;
    }

    /* renamed from: d */
    public int m12237d(int i) {
        int i2;
        if (i > 0 && i <= 32 && i <= m12240a()) {
            int i3 = this.f26369c;
            int i4 = 0;
            if (i3 > 0) {
                int i5 = 8 - i3;
                if (i < i5) {
                    i2 = i;
                } else {
                    i2 = i5;
                }
                int i6 = i5 - i2;
                byte[] bArr = this.f26367a;
                int i7 = this.f26368b;
                int i8 = (((255 >> (8 - i2)) << i6) & bArr[i7]) >> i6;
                i -= i2;
                int i9 = i3 + i2;
                this.f26369c = i9;
                if (i9 == 8) {
                    this.f26369c = 0;
                    this.f26368b = i7 + 1;
                }
                i4 = i8;
            }
            if (i > 0) {
                while (i >= 8) {
                    int i10 = i4 << 8;
                    byte[] bArr2 = this.f26367a;
                    int i11 = this.f26368b;
                    i4 = (bArr2[i11] & 255) | i10;
                    this.f26368b = i11 + 1;
                    i -= 8;
                }
                if (i > 0) {
                    int i12 = 8 - i;
                    int i13 = (i4 << i) | ((((255 >> i12) << i12) & this.f26367a[this.f26368b]) >> i12);
                    this.f26369c += i;
                    return i13;
                }
                return i4;
            }
            return i4;
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }
}