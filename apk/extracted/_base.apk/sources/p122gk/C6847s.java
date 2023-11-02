package p122gk;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;

@Metadata(m14358d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00105\u001a\u000202¢\u0006\u0004\b;\u0010<J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0001H\u0016J\b\u0010\"\u001a\u00020\u0001H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020\u000bH\u0016R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107¨\u0006="}, m14357d2 = {"Lgk/s;", "Lokio/BufferedSink;", "Lokio/Buffer;", "source", "", "byteCount", "", "L", "Lokio/ByteString;", "byteString", "q0", "", "string", "K", "", "beginIndex", "endIndex", "N", "", "write", "offset", "Ljava/nio/ByteBuffer;", "Lokio/Source;", "O", "b", "writeByte", "s", "writeShort", "i", "writeInt", "v", "c0", "n0", "C", "r", "Ljava/io/OutputStream;", "x0", "flush", "", "isOpen", "close", "Lokio/Timeout;", "timeout", "toString", "j", "Lokio/Buffer;", "bufferField", "k", "Z", "closed", "Lokio/Sink;", "l", "Lokio/Sink;", "sink", "d", "()Lokio/Buffer;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Lokio/Sink;)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6847s implements BufferedSink {

    /* renamed from: j */
    public final Buffer f19067j;

    /* renamed from: k */
    public boolean f19068k;

    /* renamed from: l */
    public final Sink f19069l;

    public C6847s(Sink sink) {
        C9612q.m13917h(sink, "sink");
        this.f19069l = sink;
        this.f19067j = new Buffer();
    }

    @Override // okio.BufferedSink
    /* renamed from: C */
    public BufferedSink mo8609C() {
        if (!this.f19068k) {
            long m8618q = this.f19067j.m8618q();
            if (m8618q > 0) {
                this.f19069l.mo46L(this.f19067j, m8618q);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: K */
    public BufferedSink mo8608K(String string) {
        C9612q.m13917h(string, "string");
        if (!this.f19068k) {
            this.f19067j.mo8608K(string);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.Sink
    /* renamed from: L */
    public void mo46L(Buffer source, long j) {
        C9612q.m13917h(source, "source");
        if (!this.f19068k) {
            this.f19067j.mo46L(source, j);
            mo8609C();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: N */
    public BufferedSink mo8607N(String string, int i, int i2) {
        C9612q.m13917h(string, "string");
        if (!this.f19068k) {
            this.f19067j.mo8607N(string, i, i2);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: O */
    public long mo8606O(Source source) {
        C9612q.m13917h(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this.f19067j, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo8609C();
        }
    }

    @Override // okio.BufferedSink
    /* renamed from: c0 */
    public BufferedSink mo8605c0(long j) {
        if (!this.f19068k) {
            this.f19067j.mo8605c0(j);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f19068k) {
            try {
                if (this.f19067j.size() > 0) {
                    Sink sink = this.f19069l;
                    Buffer buffer = this.f19067j;
                    sink.mo46L(buffer, buffer.size());
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f19069l.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f19068k = true;
            if (th == null) {
                return;
            }
            throw th;
        }
    }

    @Override // okio.BufferedSink
    /* renamed from: d */
    public Buffer mo8604d() {
        return this.f19067j;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (!this.f19068k) {
            if (this.f19067j.size() > 0) {
                Sink sink = this.f19069l;
                Buffer buffer = this.f19067j;
                sink.mo46L(buffer, buffer.size());
            }
            this.f19069l.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f19068k;
    }

    @Override // okio.BufferedSink
    /* renamed from: n0 */
    public BufferedSink mo8603n0(long j) {
        if (!this.f19068k) {
            this.f19067j.mo8603n0(j);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: q0 */
    public BufferedSink mo8602q0(ByteString byteString) {
        C9612q.m13917h(byteString, "byteString");
        if (!this.f19068k) {
            this.f19067j.mo8602q0(byteString);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: r */
    public BufferedSink mo8601r() {
        if (!this.f19068k) {
            long size = this.f19067j.size();
            if (size > 0) {
                this.f19069l.mo46L(this.f19067j, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f19069l.timeout();
    }

    public String toString() {
        return "buffer(" + this.f19069l + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        C9612q.m13917h(source, "source");
        if (!this.f19068k) {
            int write = this.f19067j.write(source);
            mo8609C();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeByte(int i) {
        if (!this.f19068k) {
            this.f19067j.writeByte(i);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeInt(int i) {
        if (!this.f19068k) {
            this.f19067j.writeInt(i);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink writeShort(int i) {
        if (!this.f19068k) {
            this.f19067j.writeShort(i);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: x0 */
    public OutputStream mo8600x0() {
        return new C6848a();
    }

    @Metadata(m14358d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m14357d2 = {"gk/s$a", "Ljava/io/OutputStream;", "", "b", "", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: gk.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6848a extends OutputStream {
        C6848a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C6847s.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            C6847s c6847s = C6847s.this;
            if (!c6847s.f19068k) {
                c6847s.flush();
            }
        }

        public String toString() {
            return C6847s.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C6847s c6847s = C6847s.this;
            if (!c6847s.f19068k) {
                c6847s.f19067j.writeByte((byte) i);
                C6847s.this.mo8609C();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i, int i2) {
            C9612q.m13917h(data, "data");
            C6847s c6847s = C6847s.this;
            if (!c6847s.f19068k) {
                c6847s.f19067j.write(data, i, i2);
                C6847s.this.mo8609C();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] source) {
        C9612q.m13917h(source, "source");
        if (!this.f19068k) {
            this.f19067j.write(source);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] source, int i, int i2) {
        C9612q.m13917h(source, "source");
        if (!this.f19068k) {
            this.f19067j.write(source, i, i2);
            return mo8609C();
        }
        throw new IllegalStateException("closed".toString());
    }
}
