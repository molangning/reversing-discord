package fk;

import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.ByteString;
import okio.Sink;
import p122gk.C6831e;
import p467zf.C14180c;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m14357d2 = {"Lfk/a;", "Ljava/io/Closeable;", "Lokio/Buffer;", "Lokio/ByteString;", "suffix", "", "h", "buffer", "", "a", "close", "j", "Lokio/Buffer;", "deflatedBytes", "Ljava/util/zip/Deflater;", "k", "Ljava/util/zip/Deflater;", "deflater", "Lgk/e;", "l", "Lgk/e;", "deflaterSink", "m", "Z", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: fk.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6486a implements Closeable {

    /* renamed from: j */
    private final Buffer f18210j;

    /* renamed from: k */
    private final Deflater f18211k;

    /* renamed from: l */
    private final C6831e f18212l;

    /* renamed from: m */
    private final boolean f18213m;

    public C6486a(boolean z) {
        this.f18213m = z;
        Buffer buffer = new Buffer();
        this.f18210j = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.f18211k = deflater;
        this.f18212l = new C6831e((Sink) buffer, deflater);
    }

    /* renamed from: h */
    private final boolean m22605h(Buffer buffer, ByteString byteString) {
        return buffer.m8628R(buffer.size() - byteString.m8551z(), byteString);
    }

    /* renamed from: a */
    public final void m22606a(Buffer buffer) {
        boolean z;
        ByteString byteString;
        C9612q.m13917h(buffer, "buffer");
        if (this.f18210j.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f18213m) {
                this.f18211k.reset();
            }
            this.f18212l.mo46L(buffer, buffer.size());
            this.f18212l.flush();
            Buffer buffer2 = this.f18210j;
            byteString = C6487b.f18214a;
            if (m22605h(buffer2, byteString)) {
                long size = this.f18210j.size() - 4;
                Buffer.C11211a m8625V = Buffer.m8625V(this.f18210j, null, 1, null);
                try {
                    m8625V.m8611h(size);
                    C14180c.m514a(m8625V, null);
                } finally {
                }
            } else {
                this.f18210j.writeByte(0);
            }
            Buffer buffer3 = this.f18210j;
            buffer.mo46L(buffer3, buffer3.size());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18212l.close();
    }
}
