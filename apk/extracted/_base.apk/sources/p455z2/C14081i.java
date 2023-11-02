package p455z2;

import java.io.InputStream;
import p394w2.C13379j;

/* renamed from: z2.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14081i extends InputStream {

    /* renamed from: j */
    final InterfaceC14078g f36232j;

    /* renamed from: k */
    int f36233k;

    /* renamed from: l */
    int f36234l;

    public C14081i(InterfaceC14078g interfaceC14078g) {
        C13379j.m2682b(Boolean.valueOf(!interfaceC14078g.isClosed()));
        this.f36232j = (InterfaceC14078g) C13379j.m2677g(interfaceC14078g);
        this.f36233k = 0;
        this.f36234l = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f36232j.size() - this.f36233k;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f36234l = this.f36233k;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        InterfaceC14078g interfaceC14078g = this.f36232j;
        int i = this.f36233k;
        this.f36233k = i + 1;
        return interfaceC14078g.mo723k(i) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f36233k = this.f36234l;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        int min = Math.min((int) j, available());
        this.f36233k += min;
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int available = available();
            if (available <= 0) {
                return -1;
            }
            if (i2 <= 0) {
                return 0;
            }
            int min = Math.min(available, i2);
            this.f36232j.mo725e(this.f36233k, bArr, i, min);
            this.f36233k += min;
            return min;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
    }
}
