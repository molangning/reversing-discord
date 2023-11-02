package p296q6;

import p195k8.C9149a;

/* renamed from: q6.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11735c0 {

    /* renamed from: a */
    private final byte[] f30580a;

    /* renamed from: b */
    private final int f30581b;

    /* renamed from: c */
    private int f30582c;

    /* renamed from: d */
    private int f30583d;

    public C11735c0(byte[] bArr) {
        this.f30580a = bArr;
        this.f30581b = bArr.length;
    }

    /* renamed from: a */
    private void m7036a() {
        int i;
        int i2 = this.f30582c;
        C9149a.m16447f(i2 >= 0 && (i2 < (i = this.f30581b) || (i2 == i && this.f30583d == 0)));
    }

    /* renamed from: b */
    public int m7035b() {
        return (this.f30582c * 8) + this.f30583d;
    }

    /* renamed from: c */
    public boolean m7034c() {
        boolean z;
        if ((((this.f30580a[this.f30582c] & 255) >> this.f30583d) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        m7032e(1);
        return z;
    }

    /* renamed from: d */
    public int m7033d(int i) {
        int i2 = this.f30582c;
        int min = Math.min(i, 8 - this.f30583d);
        int i3 = i2 + 1;
        int i4 = ((this.f30580a[i2] & 255) >> this.f30583d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f30580a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m7032e(i);
        return i5;
    }

    /* renamed from: e */
    public void m7032e(int i) {
        int i2 = i / 8;
        int i3 = this.f30582c + i2;
        this.f30582c = i3;
        int i4 = this.f30583d + (i - (i2 * 8));
        this.f30583d = i4;
        if (i4 > 7) {
            this.f30582c = i3 + 1;
            this.f30583d = i4 - 8;
        }
        m7036a();
    }
}
