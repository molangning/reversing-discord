package p036c3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2390a extends FilterInputStream {

    /* renamed from: j */
    private int f6529j;

    /* renamed from: k */
    private int f6530k;

    public C2390a(InputStream inputStream, int i) {
        super(inputStream);
        inputStream.getClass();
        if (i >= 0) {
            this.f6529j = i;
            this.f6530k = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f6529j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.f6530k = this.f6529j;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f6529j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f6529j--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f6530k != -1) {
                ((FilterInputStream) this).in.reset();
                this.f6529j = this.f6530k;
                return;
            }
            throw new IOException("mark not set");
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f6529j));
        this.f6529j = (int) (this.f6529j - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f6529j;
        if (i3 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.f6529j -= read;
        }
        return read;
    }
}