package p122gk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0010\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m14357d2 = {"Lgk/f;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "L", "flush", "Lokio/Timeout;", "timeout", "close", "", "toString", "j", "Lokio/Sink;", "delegate", "()Lokio/Sink;", "<init>", "(Lokio/Sink;)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC6832f implements Sink {

    /* renamed from: j */
    private final Sink f19039j;

    public AbstractC6832f(Sink delegate) {
        C9612q.m13917h(delegate, "delegate");
        this.f19039j = delegate;
    }

    @Override // okio.Sink
    /* renamed from: L */
    public void mo46L(Buffer source, long j) {
        C9612q.m13917h(source, "source");
        this.f19039j.mo46L(source, j);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19039j.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f19039j.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f19039j.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f19039j + ')';
    }
}