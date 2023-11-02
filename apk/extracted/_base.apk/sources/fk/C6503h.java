package fk;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010&\u001a\u00020\u0016\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u00104\u001a\u00020\u0016\u0012\u0006\u00106\u001a\u00020\u0016\u0012\u0006\u0010:\u001a\u000207¢\u0006\u0004\b;\u0010<J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u0014\u00106\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0018R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, m14357d2 = {"Lfk/h;", "Ljava/io/Closeable;", "", "opcode", "Lokio/ByteString;", "payload", "", "h", "j", "m", "code", "reason", "a", "formatOpcode", "data", "i", "close", "Lokio/Buffer;", "Lokio/Buffer;", "messageBuffer", "k", "sinkBuffer", "", "l", "Z", "writerClosed", "Lfk/a;", "Lfk/a;", "messageDeflater", "", "n", "[B", "maskKey", "Lokio/Buffer$a;", "o", "Lokio/Buffer$a;", "maskCursor", "p", "isClient", "Lokio/BufferedSink;", "q", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "sink", "Ljava/util/Random;", "r", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "random", "s", "perMessageDeflate", "t", "noContextTakeover", "", "u", "J", "minimumDeflateSize", "<init>", "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: fk.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6503h implements Closeable {

    /* renamed from: j */
    private final Buffer f18298j;

    /* renamed from: k */
    private final Buffer f18299k;

    /* renamed from: l */
    private boolean f18300l;

    /* renamed from: m */
    private C6486a f18301m;

    /* renamed from: n */
    private final byte[] f18302n;

    /* renamed from: o */
    private final Buffer.C11211a f18303o;

    /* renamed from: p */
    private final boolean f18304p;

    /* renamed from: q */
    private final BufferedSink f18305q;

    /* renamed from: r */
    private final Random f18306r;

    /* renamed from: s */
    private final boolean f18307s;

    /* renamed from: t */
    private final boolean f18308t;

    /* renamed from: u */
    private final long f18309u;

    public C6503h(boolean z, BufferedSink sink, Random random, boolean z2, boolean z3, long j) {
        byte[] bArr;
        C9612q.m13917h(sink, "sink");
        C9612q.m13917h(random, "random");
        this.f18304p = z;
        this.f18305q = sink;
        this.f18306r = random;
        this.f18307s = z2;
        this.f18308t = z3;
        this.f18309u = j;
        this.f18298j = new Buffer();
        this.f18299k = sink.mo8604d();
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.f18302n = bArr;
        this.f18303o = z ? new Buffer.C11211a() : null;
    }

    /* renamed from: h */
    private final void m22560h(int i, ByteString byteString) {
        boolean z;
        if (!this.f18300l) {
            int m8551z = byteString.m8551z();
            if (m8551z <= 125) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f18299k.writeByte(i | 128);
                if (this.f18304p) {
                    this.f18299k.writeByte(m8551z | 128);
                    Random random = this.f18306r;
                    byte[] bArr = this.f18302n;
                    C9612q.m13920e(bArr);
                    random.nextBytes(bArr);
                    this.f18299k.write(this.f18302n);
                    if (m8551z > 0) {
                        long size = this.f18299k.size();
                        this.f18299k.mo8602q0(byteString);
                        Buffer buffer = this.f18299k;
                        Buffer.C11211a c11211a = this.f18303o;
                        C9612q.m13920e(c11211a);
                        buffer.m8626U(c11211a);
                        this.f18303o.m8610i(size);
                        C6500f.f18281a.m22574b(this.f18303o, this.f18302n);
                        this.f18303o.close();
                    }
                } else {
                    this.f18299k.writeByte(m8551z);
                    this.f18299k.mo8602q0(byteString);
                }
                this.f18305q.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    /* renamed from: a */
    public final void m22561a(int i, ByteString byteString) {
        ByteString byteString2 = ByteString.f29481m;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                C6500f.f18281a.m22573c(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.mo8602q0(byteString);
            }
            byteString2 = buffer.mo8586o0();
        }
        try {
            m22560h(8, byteString2);
        } finally {
            this.f18300l = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C6486a c6486a = this.f18301m;
        if (c6486a != null) {
            c6486a.close();
        }
    }

    /* renamed from: i */
    public final void m22559i(int i, ByteString data) {
        C9612q.m13917h(data, "data");
        if (!this.f18300l) {
            this.f18298j.mo8602q0(data);
            int i2 = 128;
            int i3 = i | 128;
            if (this.f18307s && data.m8551z() >= this.f18309u) {
                C6486a c6486a = this.f18301m;
                if (c6486a == null) {
                    c6486a = new C6486a(this.f18308t);
                    this.f18301m = c6486a;
                }
                c6486a.m22606a(this.f18298j);
                i3 |= 64;
            }
            long size = this.f18298j.size();
            this.f18299k.writeByte(i3);
            if (!this.f18304p) {
                i2 = 0;
            }
            if (size <= 125) {
                this.f18299k.writeByte(((int) size) | i2);
            } else if (size <= 65535) {
                this.f18299k.writeByte(i2 | 126);
                this.f18299k.writeShort((int) size);
            } else {
                this.f18299k.writeByte(i2 | 127);
                this.f18299k.m8636J0(size);
            }
            if (this.f18304p) {
                Random random = this.f18306r;
                byte[] bArr = this.f18302n;
                C9612q.m13920e(bArr);
                random.nextBytes(bArr);
                this.f18299k.write(this.f18302n);
                if (size > 0) {
                    Buffer buffer = this.f18298j;
                    Buffer.C11211a c11211a = this.f18303o;
                    C9612q.m13920e(c11211a);
                    buffer.m8626U(c11211a);
                    this.f18303o.m8610i(0L);
                    C6500f.f18281a.m22574b(this.f18303o, this.f18302n);
                    this.f18303o.close();
                }
            }
            this.f18299k.mo46L(this.f18298j, size);
            this.f18305q.mo8601r();
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: j */
    public final void m22558j(ByteString payload) {
        C9612q.m13917h(payload, "payload");
        m22560h(9, payload);
    }

    /* renamed from: m */
    public final void m22557m(ByteString payload) {
        C9612q.m13917h(payload, "payload");
        m22560h(10, payload);
    }
}
