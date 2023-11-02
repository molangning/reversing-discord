package p135hb;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import p102fb.C6378h;
import p156ib.C7490a;

/* renamed from: hb.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7052a {

    /* renamed from: a */
    private static final OutputStream f19300a = new C7053a();

    /* renamed from: hb.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C7053a extends OutputStream {
        C7053a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C6378h.m22834j(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C6378h.m22834j(bArr);
        }
    }

    /* renamed from: a */
    private static byte[] m21485a(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i2, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    /* renamed from: b */
    public static InputStream m21484b(InputStream inputStream, long j) {
        return new C7054b(inputStream, j);
    }

    /* renamed from: c */
    public static byte[] m21483c(InputStream inputStream) {
        C6378h.m22834j(inputStream);
        return m21482d(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: d */
    private static byte[] m21482d(InputStream inputStream, Deque<byte[]> deque, int i) {
        int i2 = 8192;
        while (i < 2147483639) {
            int min = Math.min(i2, 2147483639 - i);
            byte[] bArr = new byte[min];
            deque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m21485a(deque, i);
                }
                i3 += read;
                i += read;
            }
            i2 = C7490a.m20596a(i2, 2);
        }
        if (inputStream.read() == -1) {
            return m21485a(deque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: hb.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C7054b extends FilterInputStream {

        /* renamed from: j */
        private long f19301j;

        /* renamed from: k */
        private long f19302k;

        C7054b(InputStream inputStream, long j) {
            super(inputStream);
            boolean z;
            this.f19302k = -1L;
            C6378h.m22834j(inputStream);
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C6378h.m22839e(z, "limit must be non-negative");
            this.f19301j = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f19301j);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f19302k = this.f19301j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f19301j == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f19301j--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f19302k != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f19301j = this.f19302k;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f19301j));
            this.f19301j -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            long j = this.f19301j;
            if (j == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (read != -1) {
                this.f19301j -= read;
            }
            return read;
        }
    }
}
