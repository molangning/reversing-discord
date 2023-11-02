package p122gk;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m14357d2 = {"Lgk/q;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "L", "flush", "close", "Lokio/Timeout;", "timeout", "", "toString", "Ljava/io/OutputStream;", "j", "Ljava/io/OutputStream;", "out", "k", "Lokio/Timeout;", "<init>", "(Ljava/io/OutputStream;Lokio/Timeout;)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6845q implements Sink {

    /* renamed from: j */
    private final OutputStream f19059j;

    /* renamed from: k */
    private final Timeout f19060k;

    public C6845q(OutputStream out, Timeout timeout) {
        C9612q.m13917h(out, "out");
        C9612q.m13917h(timeout, "timeout");
        this.f19059j = out;
        this.f19060k = timeout;
    }

    @Override // okio.Sink
    /* renamed from: L */
    public void mo46L(Buffer source, long j) {
        C9612q.m13917h(source, "source");
        C6829c.m21850b(source.size(), 0L, j);
        while (j > 0) {
            this.f19060k.mo8537f();
            C6851u c6851u = source.f29470j;
            C9612q.m13920e(c6851u);
            int min = (int) Math.min(j, c6851u.f19078c - c6851u.f19077b);
            this.f19059j.write(c6851u.f19076a, c6851u.f19077b, min);
            c6851u.f19077b += min;
            long j2 = min;
            j -= j2;
            source.m8615t0(source.size() - j2);
            if (c6851u.f19077b == c6851u.f19078c) {
                source.f29470j = c6851u.m21788b();
                C6853v.m21781b(c6851u);
            }
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19059j.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f19059j.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f19060k;
    }

    public String toString() {
        return "sink(" + this.f19059j + ')';
    }
}
