package p036c3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c3.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2391b extends FilterInputStream {

    /* renamed from: j */
    private final byte[] f6531j;

    /* renamed from: k */
    private int f6532k;

    /* renamed from: l */
    private int f6533l;

    public C2391b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f6531j = bArr;
    }

    /* renamed from: a */
    private int m33531a() {
        int i = this.f6532k;
        byte[] bArr = this.f6531j;
        if (i >= bArr.length) {
            return -1;
        }
        this.f6532k = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.f6533l = this.f6532k;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : m33531a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.f6532k = this.f6533l;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int m33531a = m33531a();
            if (m33531a == -1) {
                break;
            }
            bArr[i + i3] = (byte) m33531a;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
