package okio;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH&J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\tH&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tH&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rH&J\b\u0010\u001f\u001a\u00020\u001eH&J\b\u0010 \u001a\u00020\u0000H&J\b\u0010!\u001a\u00020\u0000H&J\b\u0010#\u001a\u00020\"H&R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m14357d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/ByteString;", "byteString", "q0", "", "source", "write", "", "offset", "byteCount", "Lokio/Source;", "", "O", "", "string", "K", "beginIndex", "endIndex", "N", "b", "writeByte", "s", "writeShort", "i", "writeInt", "v", "c0", "n0", "", "flush", "r", "C", "Ljava/io/OutputStream;", "x0", "Lokio/Buffer;", "d", "()Lokio/Buffer;", "buffer", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    /* renamed from: C */
    BufferedSink mo8609C();

    /* renamed from: K */
    BufferedSink mo8608K(String str);

    /* renamed from: N */
    BufferedSink mo8607N(String str, int i, int i2);

    /* renamed from: O */
    long mo8606O(Source source);

    /* renamed from: c0 */
    BufferedSink mo8605c0(long j);

    /* renamed from: d */
    Buffer mo8604d();

    @Override // okio.Sink, java.io.Flushable
    void flush();

    /* renamed from: n0 */
    BufferedSink mo8603n0(long j);

    /* renamed from: q0 */
    BufferedSink mo8602q0(ByteString byteString);

    /* renamed from: r */
    BufferedSink mo8601r();

    BufferedSink write(byte[] bArr);

    BufferedSink write(byte[] bArr, int i, int i2);

    BufferedSink writeByte(int i);

    BufferedSink writeInt(int i);

    BufferedSink writeShort(int i);

    /* renamed from: x0 */
    OutputStream mo8600x0();
}
