package p122gk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, m14357d2 = {"Lgk/k;", "Lokio/Source;", "", "i", "Lokio/Buffer;", "sink", "", "byteCount", "read", "a", "", "h", "Lokio/Timeout;", "timeout", "close", "", "j", "I", "bufferBytesHeldByInflater", "k", "Z", "closed", "Lokio/BufferedSource;", "l", "Lokio/BufferedSource;", "source", "Ljava/util/zip/Inflater;", "m", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6838k implements Source {

    /* renamed from: j */
    private int f19049j;

    /* renamed from: k */
    private boolean f19050k;

    /* renamed from: l */
    private final BufferedSource f19051l;

    /* renamed from: m */
    private final Inflater f19052m;

    public C6838k(BufferedSource source, Inflater inflater) {
        C9612q.m13917h(source, "source");
        C9612q.m13917h(inflater, "inflater");
        this.f19051l = source;
        this.f19052m = inflater;
    }

    /* renamed from: i */
    private final void m21833i() {
        int i = this.f19049j;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f19052m.getRemaining();
        this.f19049j -= remaining;
        this.f19051l.skip(remaining);
    }

    /* renamed from: a */
    public final long m21835a(Buffer sink, long j) {
        boolean z;
        C9612q.m13917h(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.f19050k) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    C6851u m8647B0 = sink.m8647B0(1);
                    m21834h();
                    int inflate = this.f19052m.inflate(m8647B0.f19076a, m8647B0.f19078c, (int) Math.min(j, 8192 - m8647B0.f19078c));
                    m21833i();
                    if (inflate > 0) {
                        m8647B0.f19078c += inflate;
                        long j2 = inflate;
                        sink.m8615t0(sink.size() + j2);
                        return j2;
                    }
                    if (m8647B0.f19077b == m8647B0.f19078c) {
                        sink.f29470j = m8647B0.m21788b();
                        C6853v.m21781b(m8647B0);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19050k) {
            return;
        }
        this.f19052m.end();
        this.f19050k = true;
        this.f19051l.close();
    }

    /* renamed from: h */
    public final boolean m21834h() {
        if (!this.f19052m.needsInput()) {
            return false;
        }
        if (this.f19051l.mo8589g0()) {
            return true;
        }
        C6851u c6851u = this.f19051l.mo8593d().f29470j;
        C9612q.m13920e(c6851u);
        int i = c6851u.f19078c;
        int i2 = c6851u.f19077b;
        int i3 = i - i2;
        this.f19049j = i3;
        this.f19052m.setInput(c6851u.f19076a, i2, i3);
        return false;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        C9612q.m13917h(sink, "sink");
        do {
            long m21835a = m21835a(sink, j);
            if (m21835a > 0) {
                return m21835a;
            }
            if (this.f19052m.finished() || this.f19052m.needsDictionary()) {
                return -1L;
            }
        } while (!this.f19051l.mo8589g0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f19051l.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6838k(Source source, Inflater inflater) {
        this(C6840m.m21829d(source), inflater);
        C9612q.m13917h(source, "source");
        C9612q.m13917h(inflater, "inflater");
    }
}