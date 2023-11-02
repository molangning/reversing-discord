package p136hc;

/* renamed from: hc.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7065k extends AbstractC7062h {

    /* renamed from: c */
    private final byte[] f19345c;

    /* renamed from: d */
    private final int f19346d;

    /* renamed from: e */
    private final int f19347e;

    /* renamed from: f */
    private final int f19348f;

    /* renamed from: g */
    private final int f19349g;

    public C7065k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 <= i && i4 + i6 <= i2) {
            this.f19345c = bArr;
            this.f19346d = i;
            this.f19347e = i2;
            this.f19348f = i3;
            this.f19349g = i4;
            if (z) {
                m21458h(i5, i6);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    /* renamed from: h */
    private void m21458h(int i, int i2) {
        byte[] bArr = this.f19345c;
        int i3 = (this.f19349g * this.f19346d) + this.f19348f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f19346d;
        }
    }

    @Override // p136hc.AbstractC7062h
    /* renamed from: b */
    public byte[] mo21460b() {
        int m21468d = m21468d();
        int m21469a = m21469a();
        int i = this.f19346d;
        if (m21468d == i && m21469a == this.f19347e) {
            return this.f19345c;
        }
        int i2 = m21468d * m21469a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f19349g * i) + this.f19348f;
        if (m21468d == i) {
            System.arraycopy(this.f19345c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < m21469a; i4++) {
            System.arraycopy(this.f19345c, i3, bArr, i4 * m21468d, m21468d);
            i3 += this.f19346d;
        }
        return bArr;
    }

    @Override // p136hc.AbstractC7062h
    /* renamed from: c */
    public byte[] mo21459c(int i, byte[] bArr) {
        if (i >= 0 && i < m21469a()) {
            int m21468d = m21468d();
            if (bArr == null || bArr.length < m21468d) {
                bArr = new byte[m21468d];
            }
            System.arraycopy(this.f19345c, ((i + this.f19349g) * this.f19346d) + this.f19348f, bArr, 0, m21468d);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
    }
}
