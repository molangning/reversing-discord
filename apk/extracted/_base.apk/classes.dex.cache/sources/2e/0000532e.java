package p455z2;

import java.io.IOException;
import java.io.InputStream;
import p004a3.InterfaceC0016c;
import p394w2.C13379j;
import p414x2.C13677a;

/* renamed from: z2.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14077f extends InputStream {

    /* renamed from: j */
    private final InputStream f36226j;

    /* renamed from: k */
    private final byte[] f36227k;

    /* renamed from: l */
    private final InterfaceC0016c<byte[]> f36228l;

    /* renamed from: m */
    private int f36229m = 0;

    /* renamed from: n */
    private int f36230n = 0;

    /* renamed from: o */
    private boolean f36231o = false;

    public C14077f(InputStream inputStream, byte[] bArr, InterfaceC0016c<byte[]> interfaceC0016c) {
        this.f36226j = (InputStream) C13379j.m2677g(inputStream);
        this.f36227k = (byte[]) C13379j.m2677g(bArr);
        this.f36228l = (InterfaceC0016c) C13379j.m2677g(interfaceC0016c);
    }

    /* renamed from: a */
    private boolean m727a() {
        if (this.f36230n < this.f36229m) {
            return true;
        }
        int read = this.f36226j.read(this.f36227k);
        if (read <= 0) {
            return false;
        }
        this.f36229m = read;
        this.f36230n = 0;
        return true;
    }

    /* renamed from: h */
    private void m726h() {
        if (!this.f36231o) {
            return;
        }
        throw new IOException("stream already closed");
    }

    @Override // java.io.InputStream
    public int available() {
        boolean z;
        if (this.f36230n <= this.f36229m) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        m726h();
        return (this.f36229m - this.f36230n) + this.f36226j.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f36231o) {
            this.f36231o = true;
            this.f36228l.release(this.f36227k);
            super.close();
        }
    }

    protected void finalize() {
        if (!this.f36231o) {
            C13677a.m1854j("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() {
        C13379j.m2675i(this.f36230n <= this.f36229m);
        m726h();
        if (m727a()) {
            byte[] bArr = this.f36227k;
            int i = this.f36230n;
            this.f36230n = i + 1;
            return bArr[i] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        boolean z;
        if (this.f36230n <= this.f36229m) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        m726h();
        int i = this.f36229m;
        int i2 = this.f36230n;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f36230n = (int) (i2 + j);
            return j;
        }
        this.f36230n = i;
        return j2 + this.f36226j.skip(j - j2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C13379j.m2675i(this.f36230n <= this.f36229m);
        m726h();
        if (m727a()) {
            int min = Math.min(this.f36229m - this.f36230n, i2);
            System.arraycopy(this.f36227k, this.f36230n, bArr, i, min);
            this.f36230n += min;
            return min;
        }
        return -1;
    }
}