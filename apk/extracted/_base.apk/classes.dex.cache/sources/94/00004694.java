package okio;

import java.io.Closeable;
import java.io.Flushable;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0007H&¨\u0006\r"}, m14357d2 = {"Lokio/Sink;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokio/Buffer;", "source", "", "byteCount", "", "L", "flush", "Lokio/Timeout;", "timeout", "close", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface Sink extends Closeable, Flushable {
    /* renamed from: L */
    void mo46L(Buffer buffer, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    Timeout timeout();
}