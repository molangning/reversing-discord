package p122gk;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m14357d2 = {"Lgk/l;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "Lokio/Timeout;", "timeout", "", "toString", "Ljava/io/InputStream;", "j", "Ljava/io/InputStream;", "input", "k", "Lokio/Timeout;", "<init>", "(Ljava/io/InputStream;Lokio/Timeout;)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6839l implements Source {

    /* renamed from: j */
    private final InputStream f19053j;

    /* renamed from: k */
    private final Timeout f19054k;

    public C6839l(InputStream input, Timeout timeout) {
        C9612q.m13917h(input, "input");
        C9612q.m13917h(timeout, "timeout");
        this.f19053j = input;
        this.f19054k = timeout;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19053j.close();
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        boolean z;
        C9612q.m13917h(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f19054k.mo8537f();
                C6851u m8647B0 = sink.m8647B0(1);
                int read = this.f19053j.read(m8647B0.f19076a, m8647B0.f19078c, (int) Math.min(j, 8192 - m8647B0.f19078c));
                if (read == -1) {
                    if (m8647B0.f19077b == m8647B0.f19078c) {
                        sink.f29470j = m8647B0.m21788b();
                        C6853v.m21781b(m8647B0);
                        return -1L;
                    }
                    return -1L;
                }
                m8647B0.f19078c += read;
                long j2 = read;
                sink.m8615t0(sink.size() + j2);
                return j2;
            } catch (AssertionError e) {
                if (C6840m.m21828e(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f19054k;
    }

    public String toString() {
        return "source(" + this.f19053j + ')';
    }
}
