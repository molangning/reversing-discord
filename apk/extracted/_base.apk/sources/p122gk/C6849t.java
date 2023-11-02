package p122gk;

import com.facebook.react.uimanager.ViewDefaults;
import hk.C7358a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9637b;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;

@Metadata(m14358d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010J\u001a\u00020G¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\rH\u0016J \u00103\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000fH\u0016J\u0018\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0010\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000fH\u0016J\u0018\u00109\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020\u0001H\u0016J\b\u0010<\u001a\u00020;H\u0016J\b\u0010=\u001a\u00020\bH\u0016J\b\u0010>\u001a\u00020\nH\u0016J\b\u0010@\u001a\u00020?H\u0016J\b\u0010A\u001a\u00020\u001eH\u0016R\u0014\u0010C\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010BR\u0016\u0010F\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bM\u0010N\u001a\u0004\bK\u0010L¨\u0006R"}, m14357d2 = {"Lgk/t;", "Lokio/BufferedSource;", "Lokio/Buffer;", "p", "sink", "", "byteCount", "read", "", "g0", "", "a0", "g", "", "readByte", "Lokio/ByteString;", "o0", "d0", "Lgk/p;", "options", "", "E", "", "f0", "W", "readFully", "Ljava/nio/ByteBuffer;", "z", "Lokio/Sink;", "u0", "", "p0", "Ljava/nio/charset/Charset;", "charset", "l0", "T", "limit", "F", "", "readShort", "o", "readInt", "m", "readLong", "i0", "y0", "skip", "b", "a", "fromIndex", "toIndex", "h", "bytes", "w", "i", "targetBytes", "B", "j", "peek", "Ljava/io/InputStream;", "z0", "isOpen", "close", "Lokio/Timeout;", "timeout", "toString", "Lokio/Buffer;", "bufferField", "k", "Z", "closed", "Lokio/Source;", "l", "Lokio/Source;", "source", "d", "()Lokio/Buffer;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Lokio/Source;)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6849t implements BufferedSource {

    /* renamed from: j */
    public final Buffer f19071j;

    /* renamed from: k */
    public boolean f19072k;

    /* renamed from: l */
    public final Source f19073l;

    public C6849t(Source source) {
        C9612q.m13917h(source, "source");
        this.f19073l = source;
        this.f19071j = new Buffer();
    }

    @Override // okio.BufferedSource
    /* renamed from: B */
    public long mo8599B(ByteString targetBytes) {
        C9612q.m13917h(targetBytes, "targetBytes");
        return m21792j(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    /* renamed from: E */
    public int mo8598E(C6843p options) {
        C9612q.m13917h(options, "options");
        if (!this.f19072k) {
            while (true) {
                int m20847d = C7358a.m20847d(this.f19071j, options, true);
                if (m20847d != -2) {
                    if (m20847d != -1) {
                        this.f19071j.skip(options.m21804i()[m20847d].m8551z());
                        return m20847d;
                    }
                } else if (this.f19073l.read(this.f19071j, 8192) == -1) {
                    break;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: F */
    public String mo8597F(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long m21794h = m21794h(b, 0L, j2);
            if (m21794h != -1) {
                return C7358a.m20848c(this.f19071j, m21794h);
            }
            if (j2 < Long.MAX_VALUE && mo8590g(j2) && this.f19071j.m8645D(j2 - 1) == ((byte) 13) && mo8590g(1 + j2) && this.f19071j.m8645D(j2) == b) {
                return C7358a.m20848c(this.f19071j, j2);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.f19071j;
            buffer2.m8616t(buffer, 0L, Math.min(32, buffer2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f19071j.size(), j) + " content=" + buffer.mo8586o0().mo8562l() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: T */
    public String mo8596T() {
        return mo8597F(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    /* renamed from: W */
    public byte[] mo8595W(long j) {
        mo8594a0(j);
        return this.f19071j.mo8595W(j);
    }

    /* renamed from: a */
    public long m21795a(byte b) {
        return m21794h(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    /* renamed from: a0 */
    public void mo8594a0(long j) {
        if (!mo8590g(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f19072k) {
            this.f19072k = true;
            this.f19073l.close();
            this.f19071j.m8621j();
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: d */
    public Buffer mo8593d() {
        return this.f19071j;
    }

    @Override // okio.BufferedSource
    /* renamed from: d0 */
    public ByteString mo8592d0(long j) {
        mo8594a0(j);
        return this.f19071j.mo8592d0(j);
    }

    @Override // okio.BufferedSource
    /* renamed from: f0 */
    public byte[] mo8591f0() {
        this.f19071j.mo8606O(this.f19073l);
        return this.f19071j.mo8591f0();
    }

    @Override // okio.BufferedSource
    /* renamed from: g */
    public boolean mo8590g(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.f19072k) {
                while (this.f19071j.size() < j) {
                    if (this.f19073l.read(this.f19071j, 8192) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: g0 */
    public boolean mo8589g0() {
        if (!this.f19072k) {
            if (this.f19071j.mo8589g0() && this.f19073l.read(this.f19071j, 8192) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: h */
    public long m21794h(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f19072k) {
            if ((0 > j || j2 < j) ? false : false) {
                while (j < j2) {
                    long m8640H = this.f19071j.m8640H(b, j, j2);
                    if (m8640H != -1) {
                        return m8640H;
                    }
                    long size = this.f19071j.size();
                    if (size >= j2 || this.f19073l.read(this.f19071j, 8192) == -1) {
                        return -1L;
                    }
                    j = Math.max(j, size);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: i */
    public long m21793i(ByteString bytes, long j) {
        C9612q.m13917h(bytes, "bytes");
        if (!(!this.f19072k)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long m8638I = this.f19071j.m8638I(bytes, j);
            if (m8638I == -1) {
                long size = this.f19071j.size();
                if (this.f19073l.read(this.f19071j, 8192) == -1) {
                    return -1L;
                }
                j = Math.max(j, (size - bytes.m8551z()) + 1);
            } else {
                return m8638I;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9] or '-' character but was 0x");
        r2 = kotlin.text.C9637b.m13854a(16);
        r2 = kotlin.text.C9637b.m13854a(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        kotlin.jvm.internal.C9612q.m13918g(r2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.BufferedSource
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo8588i0() {
        /*
            r10 = this;
            r0 = 1
            r10.mo8594a0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.mo8590g(r6)
            if (r8 == 0) goto L59
            okio.Buffer r8 = r10.f19071j
            byte r8 = r8.m8645D(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L59
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = kotlin.text.C9636a.m13858a(r2)
            int r2 = kotlin.text.C9636a.m13858a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.C9612q.m13918g(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L59:
            okio.Buffer r0 = r10.f19071j
            long r0 = r0.mo8588i0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p122gk.C6849t.mo8588i0():long");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f19072k;
    }

    /* renamed from: j */
    public long m21792j(ByteString targetBytes, long j) {
        C9612q.m13917h(targetBytes, "targetBytes");
        if (!(!this.f19072k)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long m8629Q = this.f19071j.m8629Q(targetBytes, j);
            if (m8629Q == -1) {
                long size = this.f19071j.size();
                if (this.f19073l.read(this.f19071j, 8192) == -1) {
                    return -1L;
                }
                j = Math.max(j, size);
            } else {
                return m8629Q;
            }
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: l0 */
    public String mo8587l0(Charset charset) {
        C9612q.m13917h(charset, "charset");
        this.f19071j.mo8606O(this.f19073l);
        return this.f19071j.mo8587l0(charset);
    }

    /* renamed from: m */
    public int m21791m() {
        mo8594a0(4L);
        return this.f19071j.m8624Y();
    }

    /* renamed from: o */
    public short m21790o() {
        mo8594a0(2L);
        return this.f19071j.m8623b0();
    }

    @Override // okio.BufferedSource
    /* renamed from: o0 */
    public ByteString mo8586o0() {
        this.f19071j.mo8606O(this.f19073l);
        return this.f19071j.mo8586o0();
    }

    @Override // okio.BufferedSource
    /* renamed from: p */
    public Buffer mo8585p() {
        return this.f19071j;
    }

    @Override // okio.BufferedSource
    /* renamed from: p0 */
    public String mo8584p0() {
        this.f19071j.mo8606O(this.f19073l);
        return this.f19071j.mo8584p0();
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return C6840m.m21829d(new C6846r(this));
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        C9612q.m13917h(sink, "sink");
        if (j >= 0) {
            if (!this.f19072k) {
                if (this.f19071j.size() == 0 && this.f19073l.read(this.f19071j, 8192) == -1) {
                    return -1L;
                }
                return this.f19071j.read(sink, Math.min(j, this.f19071j.size()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        mo8594a0(1L);
        return this.f19071j.readByte();
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) {
        C9612q.m13917h(sink, "sink");
        try {
            mo8594a0(sink.length);
            this.f19071j.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (this.f19071j.size() > 0) {
                Buffer buffer = this.f19071j;
                int read = buffer.read(sink, i, (int) buffer.size());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public int readInt() {
        mo8594a0(4L);
        return this.f19071j.readInt();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        mo8594a0(8L);
        return this.f19071j.readLong();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        mo8594a0(2L);
        return this.f19071j.readShort();
    }

    @Override // okio.BufferedSource
    public void skip(long j) {
        if (!this.f19072k) {
            while (j > 0) {
                if (this.f19071j.size() == 0 && this.f19073l.read(this.f19071j, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f19071j.size());
                this.f19071j.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f19073l.timeout();
    }

    public String toString() {
        return "buffer(" + this.f19073l + ')';
    }

    @Override // okio.BufferedSource
    /* renamed from: u0 */
    public long mo8583u0(Sink sink) {
        C9612q.m13917h(sink, "sink");
        long j = 0;
        while (this.f19073l.read(this.f19071j, 8192) != -1) {
            long m8618q = this.f19071j.m8618q();
            if (m8618q > 0) {
                j += m8618q;
                sink.mo46L(this.f19071j, m8618q);
            }
        }
        if (this.f19071j.size() > 0) {
            long size = j + this.f19071j.size();
            Buffer buffer = this.f19071j;
            sink.mo46L(buffer, buffer.size());
            return size;
        }
        return j;
    }

    @Override // okio.BufferedSource
    /* renamed from: w */
    public long mo8582w(ByteString bytes) {
        C9612q.m13917h(bytes, "bytes");
        return m21793i(bytes, 0L);
    }

    @Override // okio.BufferedSource
    /* renamed from: y0 */
    public long mo8581y0() {
        byte m8645D;
        int m13854a;
        int m13854a2;
        mo8594a0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo8590g(i2)) {
                break;
            }
            m8645D = this.f19071j.m8645D(i);
            if ((m8645D < ((byte) 48) || m8645D > ((byte) 57)) && ((m8645D < ((byte) 97) || m8645D > ((byte) 102)) && (m8645D < ((byte) 65) || m8645D > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            m13854a = C9637b.m13854a(16);
            m13854a2 = C9637b.m13854a(m13854a);
            String num = Integer.toString(m8645D, m13854a2);
            C9612q.m13918g(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f19071j.mo8581y0();
    }

    @Override // okio.BufferedSource
    /* renamed from: z */
    public void mo8580z(Buffer sink, long j) {
        C9612q.m13917h(sink, "sink");
        try {
            mo8594a0(j);
            this.f19071j.mo8580z(sink, j);
        } catch (EOFException e) {
            sink.mo8606O(this.f19071j);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: z0 */
    public InputStream mo8579z0() {
        return new C6850a();
    }

    @Metadata(m14358d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m14357d2 = {"gk/t$a", "Ljava/io/InputStream;", "", "read", "", "data", "offset", "byteCount", "available", "", "close", "", "toString", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: gk.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6850a extends InputStream {
        C6850a() {
        }

        @Override // java.io.InputStream
        public int available() {
            C6849t c6849t = C6849t.this;
            if (!c6849t.f19072k) {
                return (int) Math.min(c6849t.f19071j.size(), (long) ViewDefaults.NUMBER_OF_LINES);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C6849t.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            C6849t c6849t = C6849t.this;
            if (!c6849t.f19072k) {
                if (c6849t.f19071j.size() == 0) {
                    C6849t c6849t2 = C6849t.this;
                    if (c6849t2.f19073l.read(c6849t2.f19071j, 8192) == -1) {
                        return -1;
                    }
                }
                return C6849t.this.f19071j.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return C6849t.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i, int i2) {
            C9612q.m13917h(data, "data");
            if (!C6849t.this.f19072k) {
                C6829c.m21850b(data.length, i, i2);
                if (C6849t.this.f19071j.size() == 0) {
                    C6849t c6849t = C6849t.this;
                    if (c6849t.f19073l.read(c6849t.f19071j, 8192) == -1) {
                        return -1;
                    }
                }
                return C6849t.this.f19071j.read(data, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        C9612q.m13917h(sink, "sink");
        if (this.f19071j.size() == 0 && this.f19073l.read(this.f19071j, 8192) == -1) {
            return -1;
        }
        return this.f19071j.read(sink);
    }
}
