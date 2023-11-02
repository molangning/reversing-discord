package p122gk;

import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.BufferedSink;
import okio.Sink;
import okio.Timeout;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, m14357d2 = {"Lgk/e;", "Lokio/Sink;", "", "syncFlush", "", "a", "Lokio/Buffer;", "source", "", "byteCount", "L", "flush", "h", "()V", "close", "Lokio/Timeout;", "timeout", "", "toString", "j", "Z", "closed", "Lokio/BufferedSink;", "k", "Lokio/BufferedSink;", "sink", "Ljava/util/zip/Deflater;", "l", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6831e implements Sink {

    /* renamed from: j */
    private boolean f19036j;

    /* renamed from: k */
    private final BufferedSink f19037k;

    /* renamed from: l */
    private final Deflater f19038l;

    public C6831e(BufferedSink sink, Deflater deflater) {
        C9612q.m13917h(sink, "sink");
        C9612q.m13917h(deflater, "deflater");
        this.f19037k = sink;
        this.f19038l = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    private final void m21845a(boolean z) {
        C6851u m8647B0;
        int deflate;
        Buffer mo8604d = this.f19037k.mo8604d();
        while (true) {
            m8647B0 = mo8604d.m8647B0(1);
            if (z) {
                Deflater deflater = this.f19038l;
                byte[] bArr = m8647B0.f19076a;
                int i = m8647B0.f19078c;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.f19038l;
                byte[] bArr2 = m8647B0.f19076a;
                int i2 = m8647B0.f19078c;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                m8647B0.f19078c += deflate;
                mo8604d.m8615t0(mo8604d.size() + deflate);
                this.f19037k.mo8609C();
            } else if (this.f19038l.needsInput()) {
                break;
            }
        }
        if (m8647B0.f19077b == m8647B0.f19078c) {
            mo8604d.f29470j = m8647B0.m21788b();
            C6853v.m21781b(m8647B0);
        }
    }

    @Override // okio.Sink
    /* renamed from: L */
    public void mo46L(Buffer source, long j) {
        C9612q.m13917h(source, "source");
        C6829c.m21850b(source.size(), 0L, j);
        while (j > 0) {
            C6851u c6851u = source.f29470j;
            C9612q.m13920e(c6851u);
            int min = (int) Math.min(j, c6851u.f19078c - c6851u.f19077b);
            this.f19038l.setInput(c6851u.f19076a, c6851u.f19077b, min);
            m21845a(false);
            long j2 = min;
            source.m8615t0(source.size() - j2);
            int i = c6851u.f19077b + min;
            c6851u.f19077b = i;
            if (i == c6851u.f19078c) {
                source.f29470j = c6851u.m21788b();
                C6853v.m21781b(c6851u);
            }
            j -= j2;
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19036j) {
            return;
        }
        try {
            m21844h();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f19038l.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f19037k.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f19036j = true;
        if (th == null) {
            return;
        }
        throw th;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        m21845a(true);
        this.f19037k.flush();
    }

    /* renamed from: h */
    public final void m21844h() {
        this.f19038l.finish();
        m21845a(false);
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f19037k.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f19037k + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6831e(Sink sink, Deflater deflater) {
        this(C6840m.m21830c(sink), deflater);
        C9612q.m13917h(sink, "sink");
        C9612q.m13917h(deflater, "deflater");
    }
}