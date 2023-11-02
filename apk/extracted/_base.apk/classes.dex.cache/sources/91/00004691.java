package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import p122gk.C6843p;

@Metadata(m14358d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H&J\b\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001cH&J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\"H&J\b\u0010%\u001a\u00020$H&J\b\u0010&\u001a\u00020$H&J\u0010\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0007H&J\u0010\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020)H&J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0016H&J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0016H&J\b\u00100\u001a\u00020\u0000H&J\b\u00102\u001a\u000201H&R\u0014\u00105\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m14357d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/Buffer;", "p", "", "g0", "", "byteCount", "", "a0", "g", "", "readByte", "", "readShort", "", "readInt", "readLong", "i0", "y0", "skip", "Lokio/ByteString;", "o0", "d0", "Lgk/p;", "options", "E", "", "f0", "W", "sink", "readFully", "z", "Lokio/Sink;", "u0", "", "p0", "T", "limit", "F", "Ljava/nio/charset/Charset;", "charset", "l0", "bytes", "w", "targetBytes", "B", "peek", "Ljava/io/InputStream;", "z0", "d", "()Lokio/Buffer;", "buffer", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    /* renamed from: B */
    long mo8599B(ByteString byteString);

    /* renamed from: E */
    int mo8598E(C6843p c6843p);

    /* renamed from: F */
    String mo8597F(long j);

    /* renamed from: T */
    String mo8596T();

    /* renamed from: W */
    byte[] mo8595W(long j);

    /* renamed from: a0 */
    void mo8594a0(long j);

    /* renamed from: d */
    Buffer mo8593d();

    /* renamed from: d0 */
    ByteString mo8592d0(long j);

    /* renamed from: f0 */
    byte[] mo8591f0();

    /* renamed from: g */
    boolean mo8590g(long j);

    /* renamed from: g0 */
    boolean mo8589g0();

    /* renamed from: i0 */
    long mo8588i0();

    /* renamed from: l0 */
    String mo8587l0(Charset charset);

    /* renamed from: o0 */
    ByteString mo8586o0();

    /* renamed from: p */
    Buffer mo8585p();

    /* renamed from: p0 */
    String mo8584p0();

    BufferedSource peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);

    /* renamed from: u0 */
    long mo8583u0(Sink sink);

    /* renamed from: w */
    long mo8582w(ByteString byteString);

    /* renamed from: y0 */
    long mo8581y0();

    /* renamed from: z */
    void mo8580z(Buffer buffer, long j);

    /* renamed from: z0 */
    InputStream mo8579z0();
}