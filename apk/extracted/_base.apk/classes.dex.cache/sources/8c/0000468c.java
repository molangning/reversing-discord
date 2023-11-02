package okio;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import hk.C7358a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;
import p122gk.C6829c;
import p122gk.C6840m;
import p122gk.C6843p;
import p122gk.C6846r;
import p122gk.C6851u;
import p122gk.C6853v;
import p122gk.C6854w;
import p355ti.C12785a;

@Metadata(m14358d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008b\u0001B\t¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\b\u0010\u0005\u001a\u00020\u0000H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010'\u001a\u00020&H\u0016J\u0010\u0010(\u001a\u00020&2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)H\u0016J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020.H\u0016J\b\u00101\u001a\u000200H\u0016J\u0010\u00102\u001a\u0002002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u0002002\u0006\u00104\u001a\u000203H\u0016J\u0018\u00106\u001a\u0002002\u0006\u0010\r\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0016J\b\u00107\u001a\u000200H\u0016J\u0010\u00109\u001a\u0002002\u0006\u00108\u001a\u00020\fH\u0016J\b\u0010;\u001a\u00020:H\u0016J\u0010\u0010<\u001a\u00020:2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010=\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020:H\u0016J \u0010>\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020?H\u0016J\u0006\u0010@\u001a\u00020\u000eJ\u0010\u0010A\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020&H\u0016J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u000200H\u0016J \u0010H\u001a\u00020\u00002\u0006\u0010D\u001a\u0002002\u0006\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u001fH\u0016J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u001fH\u0016J\u0018\u0010K\u001a\u00020\u00002\u0006\u0010D\u001a\u0002002\u0006\u00104\u001a\u000203H\u0016J(\u0010L\u001a\u00020\u00002\u0006\u0010D\u001a\u0002002\u0006\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u001f2\u0006\u00104\u001a\u000203H\u0016J\u0010\u0010N\u001a\u00020\u00002\u0006\u0010M\u001a\u00020:H\u0016J \u0010O\u001a\u00020\u00002\u0006\u0010M\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010P\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020?H\u0016J\u0010\u0010R\u001a\u00020\f2\u0006\u0010M\u001a\u00020QH\u0016J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u001fH\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u001fH\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001fH\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\fH\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\fH\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\fH\u0016J\u0017\u0010^\u001a\u00020]2\u0006\u0010\\\u001a\u00020\u001fH\u0000¢\u0006\u0004\b^\u0010_J\u0018\u0010`\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010>\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010c\u001a\u00020\f2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010a\u001a\u00020\f2\u0006\u0010b\u001a\u00020\fH\u0016J\u0010\u0010e\u001a\u00020\f2\u0006\u0010d\u001a\u00020&H\u0016J\u0018\u0010f\u001a\u00020\f2\u0006\u0010d\u001a\u00020&2\u0006\u0010a\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020\f2\u0006\u0010g\u001a\u00020&H\u0016J\u0018\u0010i\u001a\u00020\f2\u0006\u0010g\u001a\u00020&2\u0006\u0010a\u001a\u00020\fH\u0016J\u0018\u0010j\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010d\u001a\u00020&H\u0016J(\u0010l\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010d\u001a\u00020&2\u0006\u0010k\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\b\u0010m\u001a\u00020\u000eH\u0016J\b\u0010n\u001a\u00020\nH\u0016J\b\u0010o\u001a\u00020\u000eH\u0016J\b\u0010q\u001a\u00020pH\u0016J\u0013\u0010t\u001a\u00020\n2\b\u0010s\u001a\u0004\u0018\u00010rH\u0096\u0002J\b\u0010u\u001a\u00020\u001fH\u0016J\b\u0010v\u001a\u000200H\u0016J\u0006\u0010U\u001a\u00020\u0000J\b\u0010w\u001a\u00020\u0000H\u0016J\u0006\u0010x\u001a\u00020&J\u000e\u0010y\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u001fJ\u0012\u0010|\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020zH\u0007R\u0018\u0010~\u001a\u0004\u0018\u00010]8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b@\u0010}R1\u0010\u0082\u0001\u001a\u00020\f2\u0006\u0010\u007f\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008c\u0001"}, m14357d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "p", "Ljava/io/OutputStream;", "x0", "A", "v", "", "g0", "", "byteCount", "", "a0", "g", "peek", "Ljava/io/InputStream;", "z0", "out", "offset", "t", "q", "", "readByte", "pos", "D", "(J)B", "", "readShort", "", "readInt", "readLong", "b0", "Y", "i0", "y0", "Lokio/ByteString;", "o0", "d0", "Lgk/p;", "options", "E", "sink", "z", "Lokio/Sink;", "u0", "", "p0", "j0", "Ljava/nio/charset/Charset;", "charset", "l0", "e0", "T", "limit", "F", "", "f0", "W", "readFully", "read", "Ljava/nio/ByteBuffer;", "j", "skip", "byteString", "C0", "string", "N0", "beginIndex", "endIndex", "O0", "codePoint", "P0", "M0", "L0", "source", "D0", "E0", "write", "Lokio/Source;", "O", "b", "F0", "s", "K0", "i", "I0", "J0", "G0", "H0", "minimumCapacity", "Lgk/u;", "B0", "(I)Lgk/u;", "L", "fromIndex", "toIndex", "H", "bytes", "w", "I", "targetBytes", "B", "Q", "R", "bytesOffset", "S", "flush", "isOpen", "close", "Lokio/Timeout;", "timeout", "", "other", "equals", "hashCode", "toString", "m", "w0", "A0", "Lokio/Buffer$a;", "unsafeCursor", "U", "Lgk/u;", "head", "<set-?>", "k", "J", "size", "()J", "t0", "(J)V", "d", "()Lokio/Buffer;", "buffer", "<init>", "()V", "a", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* renamed from: j */
    public C6851u f29470j;

    /* renamed from: k */
    private long f29471k;

    @Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006$"}, m14357d2 = {"Lokio/Buffer$a;", "Ljava/io/Closeable;", "", "a", "", "offset", "i", "newSize", "h", "", "close", "Lokio/Buffer;", "j", "Lokio/Buffer;", "buffer", "", "k", "Z", "readWrite", "Lgk/u;", "l", "Lgk/u;", "segment", "m", "J", "", "n", "[B", "data", "o", "I", ViewProps.START, "p", ViewProps.END, "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.Buffer$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11211a implements Closeable {

        /* renamed from: j */
        public Buffer f29472j;

        /* renamed from: k */
        public boolean f29473k;

        /* renamed from: l */
        private C6851u f29474l;

        /* renamed from: n */
        public byte[] f29476n;

        /* renamed from: m */
        public long f29475m = -1;

        /* renamed from: o */
        public int f29477o = -1;

        /* renamed from: p */
        public int f29478p = -1;

        /* renamed from: a */
        public final int m8612a() {
            boolean z;
            long j;
            long j2 = this.f29475m;
            Buffer buffer = this.f29472j;
            C9612q.m13920e(buffer);
            if (j2 != buffer.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j3 = this.f29475m;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + (this.f29478p - this.f29477o);
                }
                return m8610i(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z;
            if (this.f29472j != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f29472j = null;
                this.f29474l = null;
                this.f29475m = -1L;
                this.f29476n = null;
                this.f29477o = -1;
                this.f29478p = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: h */
        public final long m8611h(long j) {
            boolean z;
            Buffer buffer = this.f29472j;
            if (buffer != null) {
                if (this.f29473k) {
                    long size = buffer.size();
                    int i = (j > size ? 1 : (j == size ? 0 : -1));
                    int i2 = 1;
                    if (i <= 0) {
                        if (j >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            long j2 = size - j;
                            while (true) {
                                if (j2 <= 0) {
                                    break;
                                }
                                C6851u c6851u = buffer.f29470j;
                                C9612q.m13920e(c6851u);
                                C6851u c6851u2 = c6851u.f19082g;
                                C9612q.m13920e(c6851u2);
                                int i3 = c6851u2.f19078c;
                                long j3 = i3 - c6851u2.f19077b;
                                if (j3 <= j2) {
                                    buffer.f29470j = c6851u2.m21788b();
                                    C6853v.m21781b(c6851u2);
                                    j2 -= j3;
                                } else {
                                    c6851u2.f19078c = i3 - ((int) j2);
                                    break;
                                }
                            }
                            this.f29474l = null;
                            this.f29475m = j;
                            this.f29476n = null;
                            this.f29477o = -1;
                            this.f29478p = -1;
                        } else {
                            throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                        }
                    } else if (i > 0) {
                        long j4 = j - size;
                        boolean z2 = true;
                        while (j4 > 0) {
                            C6851u m8647B0 = buffer.m8647B0(i2);
                            int min = (int) Math.min(j4, 8192 - m8647B0.f19078c);
                            int i4 = m8647B0.f19078c + min;
                            m8647B0.f19078c = i4;
                            j4 -= min;
                            if (z2) {
                                this.f29474l = m8647B0;
                                this.f29475m = size;
                                this.f29476n = m8647B0.f19076a;
                                this.f29477o = i4 - min;
                                this.f29478p = i4;
                                z2 = false;
                            }
                            i2 = 1;
                        }
                    }
                    buffer.m8615t0(j);
                    return size;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: i */
        public final int m8610i(long j) {
            C6851u c6851u;
            Buffer buffer = this.f29472j;
            if (buffer != null) {
                if (j >= -1 && j <= buffer.size()) {
                    if (j != -1 && j != buffer.size()) {
                        long size = buffer.size();
                        C6851u c6851u2 = buffer.f29470j;
                        C6851u c6851u3 = this.f29474l;
                        long j2 = 0;
                        if (c6851u3 != null) {
                            long j3 = this.f29475m;
                            int i = this.f29477o;
                            C9612q.m13920e(c6851u3);
                            long j4 = j3 - (i - c6851u3.f19077b);
                            if (j4 > j) {
                                c6851u = c6851u2;
                                c6851u2 = this.f29474l;
                                size = j4;
                            } else {
                                c6851u = this.f29474l;
                                j2 = j4;
                            }
                        } else {
                            c6851u = c6851u2;
                        }
                        if (size - j > j - j2) {
                            while (true) {
                                C9612q.m13920e(c6851u);
                                int i2 = c6851u.f19078c;
                                int i3 = c6851u.f19077b;
                                if (j < (i2 - i3) + j2) {
                                    break;
                                }
                                j2 += i2 - i3;
                                c6851u = c6851u.f19081f;
                            }
                        } else {
                            while (size > j) {
                                C9612q.m13920e(c6851u2);
                                c6851u2 = c6851u2.f19082g;
                                C9612q.m13920e(c6851u2);
                                size -= c6851u2.f19078c - c6851u2.f19077b;
                            }
                            j2 = size;
                            c6851u = c6851u2;
                        }
                        if (this.f29473k) {
                            C9612q.m13920e(c6851u);
                            if (c6851u.f19079d) {
                                C6851u m21784f = c6851u.m21784f();
                                if (buffer.f29470j == c6851u) {
                                    buffer.f29470j = m21784f;
                                }
                                c6851u = c6851u.m21787c(m21784f);
                                C6851u c6851u4 = c6851u.f19082g;
                                C9612q.m13920e(c6851u4);
                                c6851u4.m21788b();
                            }
                        }
                        this.f29474l = c6851u;
                        this.f29475m = j;
                        C9612q.m13920e(c6851u);
                        this.f29476n = c6851u.f19076a;
                        int i4 = c6851u.f19077b + ((int) (j - j2));
                        this.f29477o = i4;
                        int i5 = c6851u.f19078c;
                        this.f29478p = i5;
                        return i5 - i4;
                    }
                    this.f29474l = null;
                    this.f29475m = j;
                    this.f29476n = null;
                    this.f29477o = -1;
                    this.f29478p = -1;
                    return -1;
                }
                C9602k0 c9602k0 = C9602k0.f25351a;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(buffer.size())}, 2));
                C9612q.m13918g(format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    @Metadata(m14358d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m14357d2 = {"okio/Buffer$c", "Ljava/io/OutputStream;", "", "b", "", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.Buffer$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11213c extends OutputStream {
        C11213c() {
            Buffer.this = r1;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return Buffer.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            Buffer.this.writeByte(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i, int i2) {
            C9612q.m13917h(data, "data");
            Buffer.this.write(data, i, i2);
        }
    }

    /* renamed from: V */
    public static /* synthetic */ C11211a m8625V(Buffer buffer, C11211a c11211a, int i, Object obj) {
        if ((i & 1) != 0) {
            c11211a = new C11211a();
        }
        return buffer.m8626U(c11211a);
    }

    @Override // okio.BufferedSink
    /* renamed from: A */
    public Buffer mo8609C() {
        return this;
    }

    /* renamed from: A0 */
    public final ByteString m8648A0(int i) {
        if (i == 0) {
            return ByteString.f29481m;
        }
        C6829c.m21850b(size(), 0L, i);
        C6851u c6851u = this.f29470j;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C9612q.m13920e(c6851u);
            int i5 = c6851u.f19078c;
            int i6 = c6851u.f19077b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c6851u = c6851u.f19081f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        C6851u c6851u2 = this.f29470j;
        int i7 = 0;
        while (i2 < i) {
            C9612q.m13920e(c6851u2);
            bArr[i7] = c6851u2.f19076a;
            i2 += c6851u2.f19078c - c6851u2.f19077b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c6851u2.f19077b;
            c6851u2.f19079d = true;
            i7++;
            c6851u2 = c6851u2.f19081f;
        }
        return new C6854w(bArr, iArr);
    }

    @Override // okio.BufferedSource
    /* renamed from: B */
    public long mo8599B(ByteString targetBytes) {
        C9612q.m13917h(targetBytes, "targetBytes");
        return m8629Q(targetBytes, 0L);
    }

    /* renamed from: B0 */
    public final C6851u m8647B0(int i) {
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            C6851u c6851u = this.f29470j;
            if (c6851u == null) {
                C6851u m21780c = C6853v.m21780c();
                this.f29470j = m21780c;
                m21780c.f19082g = m21780c;
                m21780c.f19081f = m21780c;
                return m21780c;
            }
            C9612q.m13920e(c6851u);
            C6851u c6851u2 = c6851u.f19082g;
            C9612q.m13920e(c6851u2);
            if (c6851u2.f19078c + i <= 8192 && c6851u2.f19080e) {
                return c6851u2;
            }
            return c6851u2.m21787c(C6853v.m21780c());
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: C0 */
    public Buffer mo8602q0(ByteString byteString) {
        C9612q.m13917h(byteString, "byteString");
        byteString.mo8573F(this, 0, byteString.m8551z());
        return this;
    }

    /* renamed from: D */
    public final byte m8645D(long j) {
        C6829c.m21850b(size(), j, 1L);
        C6851u c6851u = this.f29470j;
        if (c6851u != null) {
            if (size() - j < j) {
                long size = size();
                while (size > j) {
                    c6851u = c6851u.f19082g;
                    C9612q.m13920e(c6851u);
                    size -= c6851u.f19078c - c6851u.f19077b;
                }
                C9612q.m13920e(c6851u);
                return c6851u.f19076a[(int) ((c6851u.f19077b + j) - size)];
            }
            long j2 = 0;
            while (true) {
                long j3 = (c6851u.f19078c - c6851u.f19077b) + j2;
                if (j3 > j) {
                    C9612q.m13920e(c6851u);
                    return c6851u.f19076a[(int) ((c6851u.f19077b + j) - j2)];
                }
                c6851u = c6851u.f19081f;
                C9612q.m13920e(c6851u);
                j2 = j3;
            }
        } else {
            C9612q.m13920e(null);
            throw null;
        }
    }

    @Override // okio.BufferedSink
    /* renamed from: D0 */
    public Buffer write(byte[] source) {
        C9612q.m13917h(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSource
    /* renamed from: E */
    public int mo8598E(C6843p options) {
        C9612q.m13917h(options, "options");
        int m20846e = C7358a.m20846e(this, options, false, 2, null);
        if (m20846e == -1) {
            return -1;
        }
        skip(options.m21804i()[m20846e].m8551z());
        return m20846e;
    }

    @Override // okio.BufferedSink
    /* renamed from: E0 */
    public Buffer write(byte[] source, int i, int i2) {
        C9612q.m13917h(source, "source");
        long j = i2;
        C6829c.m21850b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C6851u m8647B0 = m8647B0(1);
            int min = Math.min(i3 - i, 8192 - m8647B0.f19078c);
            int i4 = i + min;
            C9536e.m14273e(source, m8647B0.f19076a, m8647B0.f19078c, i, i4);
            m8647B0.f19078c += min;
            i = i4;
        }
        m8615t0(size() + j);
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: F */
    public String mo8597F(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long m8640H = m8640H(b, 0L, j2);
            if (m8640H != -1) {
                return C7358a.m20848c(this, m8640H);
            }
            if (j2 < size() && m8645D(j2 - 1) == ((byte) 13) && m8645D(j2) == b) {
                return C7358a.m20848c(this, j2);
            }
            Buffer buffer = new Buffer();
            m8616t(buffer, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + buffer.mo8586o0().mo8562l() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: F0 */
    public Buffer writeByte(int i) {
        C6851u m8647B0 = m8647B0(1);
        byte[] bArr = m8647B0.f19076a;
        int i2 = m8647B0.f19078c;
        m8647B0.f19078c = i2 + 1;
        bArr[i2] = (byte) i;
        m8615t0(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    /* renamed from: G0 */
    public Buffer mo8605c0(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo8608K("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        C6851u m8647B0 = m8647B0(i2);
        byte[] bArr = m8647B0.f19076a;
        int i3 = m8647B0.f19078c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = C7358a.m20850a()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        m8647B0.f19078c += i2;
        m8615t0(size() + i2);
        return this;
    }

    /* renamed from: H */
    public long m8640H(byte b, long j, long j2) {
        boolean z;
        C6851u c6851u;
        int i;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (c6851u = this.f29470j) == null) {
                return -1L;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    c6851u = c6851u.f19082g;
                    C9612q.m13920e(c6851u);
                    j3 -= c6851u.f19078c - c6851u.f19077b;
                }
                while (j3 < j2) {
                    byte[] bArr = c6851u.f19076a;
                    int min = (int) Math.min(c6851u.f19078c, (c6851u.f19077b + j2) - j3);
                    i = (int) ((c6851u.f19077b + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += c6851u.f19078c - c6851u.f19077b;
                    c6851u = c6851u.f19081f;
                    C9612q.m13920e(c6851u);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (c6851u.f19078c - c6851u.f19077b) + j3;
                if (j4 > j) {
                    break;
                }
                c6851u = c6851u.f19081f;
                C9612q.m13920e(c6851u);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = c6851u.f19076a;
                int min2 = (int) Math.min(c6851u.f19078c, (c6851u.f19077b + j2) - j3);
                i = (int) ((c6851u.f19077b + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i++;
                    }
                }
                j3 += c6851u.f19078c - c6851u.f19077b;
                c6851u = c6851u.f19081f;
                C9612q.m13920e(c6851u);
                j = j3;
            }
            return -1L;
            return (i - c6851u.f19077b) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: H0 */
    public Buffer mo8603n0(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C6851u m8647B0 = m8647B0(i);
        byte[] bArr = m8647B0.f19076a;
        int i2 = m8647B0.f19078c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C7358a.m20850a()[(int) (15 & j)];
            j >>>= 4;
        }
        m8647B0.f19078c += i;
        m8615t0(size() + i);
        return this;
    }

    /* renamed from: I */
    public long m8638I(ByteString bytes, long j) {
        boolean z;
        boolean z2;
        long j2 = j;
        C9612q.m13917h(bytes, "bytes");
        if (bytes.m8551z() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = 0;
            if (j2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C6851u c6851u = this.f29470j;
                if (c6851u != null) {
                    if (size() - j2 < j2) {
                        long size = size();
                        while (size > j2) {
                            c6851u = c6851u.f19082g;
                            C9612q.m13920e(c6851u);
                            size -= c6851u.f19078c - c6851u.f19077b;
                        }
                        byte[] mo8561m = bytes.mo8561m();
                        byte b = mo8561m[0];
                        int m8551z = bytes.m8551z();
                        long size2 = (size() - m8551z) + 1;
                        while (size < size2) {
                            byte[] bArr = c6851u.f19076a;
                            long j4 = size;
                            int min = (int) Math.min(c6851u.f19078c, (c6851u.f19077b + size2) - size);
                            for (int i = (int) ((c6851u.f19077b + j2) - j4); i < min; i++) {
                                if (bArr[i] == b && C7358a.m20849b(c6851u, i + 1, mo8561m, 1, m8551z)) {
                                    return (i - c6851u.f19077b) + j4;
                                }
                            }
                            size = j4 + (c6851u.f19078c - c6851u.f19077b);
                            c6851u = c6851u.f19081f;
                            C9612q.m13920e(c6851u);
                            j2 = size;
                        }
                    } else {
                        while (true) {
                            long j5 = (c6851u.f19078c - c6851u.f19077b) + j3;
                            if (j5 > j2) {
                                break;
                            }
                            c6851u = c6851u.f19081f;
                            C9612q.m13920e(c6851u);
                            j3 = j5;
                        }
                        byte[] mo8561m2 = bytes.mo8561m();
                        byte b2 = mo8561m2[0];
                        int m8551z2 = bytes.m8551z();
                        long size3 = (size() - m8551z2) + 1;
                        while (j3 < size3) {
                            byte[] bArr2 = c6851u.f19076a;
                            long j6 = size3;
                            int min2 = (int) Math.min(c6851u.f19078c, (c6851u.f19077b + size3) - j3);
                            for (int i2 = (int) ((c6851u.f19077b + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2 && C7358a.m20849b(c6851u, i2 + 1, mo8561m2, 1, m8551z2)) {
                                    return (i2 - c6851u.f19077b) + j3;
                                }
                            }
                            j3 += c6851u.f19078c - c6851u.f19077b;
                            c6851u = c6851u.f19081f;
                            C9612q.m13920e(c6851u);
                            j2 = j3;
                            size3 = j6;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: I0 */
    public Buffer writeInt(int i) {
        C6851u m8647B0 = m8647B0(4);
        byte[] bArr = m8647B0.f19076a;
        int i2 = m8647B0.f19078c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        m8647B0.f19078c = i5 + 1;
        m8615t0(size() + 4);
        return this;
    }

    /* renamed from: J0 */
    public Buffer m8636J0(long j) {
        C6851u m8647B0 = m8647B0(8);
        byte[] bArr = m8647B0.f19076a;
        int i = m8647B0.f19078c;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        m8647B0.f19078c = i8 + 1;
        m8615t0(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    /* renamed from: K0 */
    public Buffer writeShort(int i) {
        C6851u m8647B0 = m8647B0(2);
        byte[] bArr = m8647B0.f19076a;
        int i2 = m8647B0.f19078c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        m8647B0.f19078c = i3 + 1;
        m8615t0(size() + 2);
        return this;
    }

    @Override // okio.Sink
    /* renamed from: L */
    public void mo46L(Buffer source, long j) {
        boolean z;
        C6851u c6851u;
        C6851u c6851u2;
        int i;
        C9612q.m13917h(source, "source");
        if (source != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C6829c.m21850b(source.size(), 0L, j);
            while (j > 0) {
                C6851u c6851u3 = source.f29470j;
                C9612q.m13920e(c6851u3);
                int i2 = c6851u3.f19078c;
                C9612q.m13920e(source.f29470j);
                if (j < i2 - c6851u.f19077b) {
                    C6851u c6851u4 = this.f29470j;
                    if (c6851u4 != null) {
                        C9612q.m13920e(c6851u4);
                        c6851u2 = c6851u4.f19082g;
                    } else {
                        c6851u2 = null;
                    }
                    if (c6851u2 != null && c6851u2.f19080e) {
                        long j2 = c6851u2.f19078c + j;
                        if (c6851u2.f19079d) {
                            i = 0;
                        } else {
                            i = c6851u2.f19077b;
                        }
                        if (j2 - i <= 8192) {
                            C6851u c6851u5 = source.f29470j;
                            C9612q.m13920e(c6851u5);
                            c6851u5.m21783g(c6851u2, (int) j);
                            source.m8615t0(source.size() - j);
                            m8615t0(size() + j);
                            return;
                        }
                    }
                    C6851u c6851u6 = source.f29470j;
                    C9612q.m13920e(c6851u6);
                    source.f29470j = c6851u6.m21785e((int) j);
                }
                C6851u c6851u7 = source.f29470j;
                C9612q.m13920e(c6851u7);
                long j3 = c6851u7.f19078c - c6851u7.f19077b;
                source.f29470j = c6851u7.m21788b();
                C6851u c6851u8 = this.f29470j;
                if (c6851u8 == null) {
                    this.f29470j = c6851u7;
                    c6851u7.f19082g = c6851u7;
                    c6851u7.f19081f = c6851u7;
                } else {
                    C9612q.m13920e(c6851u8);
                    C6851u c6851u9 = c6851u8.f19082g;
                    C9612q.m13920e(c6851u9);
                    c6851u9.m21787c(c6851u7).m21789a();
                }
                source.m8615t0(source.size() - j3);
                m8615t0(size() + j3);
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: L0 */
    public Buffer m8634L0(String string, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        C9612q.m13917h(string, "string");
        C9612q.m13917h(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > string.length()) {
                    z3 = false;
                }
                if (z3) {
                    if (C9612q.m13922c(charset, C12785a.f33142b)) {
                        return mo8607N(string, i, i2);
                    }
                    String substring = string.substring(i, i2);
                    C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        C9612q.m13918g(bytes, "(this as java.lang.String).getBytes(charset)");
                        return write(bytes, 0, bytes.length);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: M0 */
    public Buffer m8633M0(String string, Charset charset) {
        C9612q.m13917h(string, "string");
        C9612q.m13917h(charset, "charset");
        return m8634L0(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    /* renamed from: N0 */
    public Buffer mo8608K(String string) {
        C9612q.m13917h(string, "string");
        return mo8607N(string, 0, string.length());
    }

    @Override // okio.BufferedSink
    /* renamed from: O */
    public long mo8606O(Source source) {
        C9612q.m13917h(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // okio.BufferedSink
    /* renamed from: O0 */
    public Buffer mo8607N(String string, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        C9612q.m13917h(string, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= string.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt = string.charAt(i);
                        if (charAt < 128) {
                            C6851u m8647B0 = m8647B0(1);
                            byte[] bArr = m8647B0.f19076a;
                            int i3 = m8647B0.f19078c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = string.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = m8647B0.f19078c;
                            int i6 = (i3 + i4) - i5;
                            m8647B0.f19078c = i5 + i6;
                            m8615t0(size() + i6);
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C6851u m8647B02 = m8647B0(2);
                                byte[] bArr2 = m8647B02.f19076a;
                                int i7 = m8647B02.f19078c;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                m8647B02.f19078c = i7 + 2;
                                m8615t0(size() + 2);
                            } else if (charAt >= 55296 && charAt <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = string.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt <= 56319 && 56320 <= c && 57343 >= c) {
                                    int i9 = (((charAt & 1023) << 10) | (c & 1023)) + 65536;
                                    C6851u m8647B03 = m8647B0(4);
                                    byte[] bArr3 = m8647B03.f19076a;
                                    int i10 = m8647B03.f19078c;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    m8647B03.f19078c = i10 + 4;
                                    m8615t0(size() + 4);
                                    i += 2;
                                } else {
                                    writeByte(63);
                                    i = i8;
                                }
                            } else {
                                C6851u m8647B04 = m8647B0(3);
                                byte[] bArr4 = m8647B04.f19076a;
                                int i11 = m8647B04.f19078c;
                                bArr4[i11] = (byte) ((charAt >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt & '?') | 128);
                                m8647B04.f19078c = i11 + 3;
                                m8615t0(size() + 3);
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: P0 */
    public Buffer m8630P0(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            C6851u m8647B0 = m8647B0(2);
            byte[] bArr = m8647B0.f19076a;
            int i2 = m8647B0.f19078c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            m8647B0.f19078c = i2 + 2;
            m8615t0(size() + 2);
        } else if (55296 <= i && 57343 >= i) {
            writeByte(63);
        } else if (i < 65536) {
            C6851u m8647B02 = m8647B0(3);
            byte[] bArr2 = m8647B02.f19076a;
            int i3 = m8647B02.f19078c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            m8647B02.f19078c = i3 + 3;
            m8615t0(size() + 3);
        } else if (i <= 1114111) {
            C6851u m8647B03 = m8647B0(4);
            byte[] bArr3 = m8647B03.f19076a;
            int i4 = m8647B03.f19078c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            m8647B03.f19078c = i4 + 4;
            m8615t0(size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C6829c.m21846f(i));
        }
        return this;
    }

    /* renamed from: Q */
    public long m8629Q(ByteString targetBytes, long j) {
        boolean z;
        int i;
        int i2;
        C9612q.m13917h(targetBytes, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C6851u c6851u = this.f29470j;
            if (c6851u == null) {
                return -1L;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    c6851u = c6851u.f19082g;
                    C9612q.m13920e(c6851u);
                    j2 -= c6851u.f19078c - c6851u.f19077b;
                }
                if (targetBytes.m8551z() == 2) {
                    byte m8567f = targetBytes.m8567f(0);
                    byte m8567f2 = targetBytes.m8567f(1);
                    while (j2 < size()) {
                        byte[] bArr = c6851u.f19076a;
                        i = (int) ((c6851u.f19077b + j) - j2);
                        int i3 = c6851u.f19078c;
                        while (i < i3) {
                            byte b = bArr[i];
                            if (b != m8567f && b != m8567f2) {
                                i++;
                            }
                            i2 = c6851u.f19077b;
                        }
                        j2 += c6851u.f19078c - c6851u.f19077b;
                        c6851u = c6851u.f19081f;
                        C9612q.m13920e(c6851u);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] mo8561m = targetBytes.mo8561m();
                while (j2 < size()) {
                    byte[] bArr2 = c6851u.f19076a;
                    i = (int) ((c6851u.f19077b + j) - j2);
                    int i4 = c6851u.f19078c;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        for (byte b3 : mo8561m) {
                            if (b2 == b3) {
                                i2 = c6851u.f19077b;
                            }
                        }
                        i++;
                    }
                    j2 += c6851u.f19078c - c6851u.f19077b;
                    c6851u = c6851u.f19081f;
                    C9612q.m13920e(c6851u);
                    j = j2;
                }
                return -1L;
            }
            while (true) {
                long j3 = (c6851u.f19078c - c6851u.f19077b) + j2;
                if (j3 > j) {
                    break;
                }
                c6851u = c6851u.f19081f;
                C9612q.m13920e(c6851u);
                j2 = j3;
            }
            if (targetBytes.m8551z() == 2) {
                byte m8567f3 = targetBytes.m8567f(0);
                byte m8567f4 = targetBytes.m8567f(1);
                while (j2 < size()) {
                    byte[] bArr3 = c6851u.f19076a;
                    i = (int) ((c6851u.f19077b + j) - j2);
                    int i5 = c6851u.f19078c;
                    while (i < i5) {
                        byte b4 = bArr3[i];
                        if (b4 != m8567f3 && b4 != m8567f4) {
                            i++;
                        }
                        i2 = c6851u.f19077b;
                    }
                    j2 += c6851u.f19078c - c6851u.f19077b;
                    c6851u = c6851u.f19081f;
                    C9612q.m13920e(c6851u);
                    j = j2;
                }
                return -1L;
            }
            byte[] mo8561m2 = targetBytes.mo8561m();
            while (j2 < size()) {
                byte[] bArr4 = c6851u.f19076a;
                i = (int) ((c6851u.f19077b + j) - j2);
                int i6 = c6851u.f19078c;
                while (i < i6) {
                    byte b5 = bArr4[i];
                    for (byte b6 : mo8561m2) {
                        if (b5 == b6) {
                            i2 = c6851u.f19077b;
                        }
                    }
                    i++;
                }
                j2 += c6851u.f19078c - c6851u.f19077b;
                c6851u = c6851u.f19081f;
                C9612q.m13920e(c6851u);
                j = j2;
            }
            return -1L;
            return (i - i2) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: R */
    public boolean m8628R(long j, ByteString bytes) {
        C9612q.m13917h(bytes, "bytes");
        return m8627S(j, bytes, 0, bytes.m8551z());
    }

    /* renamed from: S */
    public boolean m8627S(long j, ByteString bytes, int i, int i2) {
        C9612q.m13917h(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || bytes.m8551z() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m8645D(i3 + j) != bytes.m8567f(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    /* renamed from: T */
    public String mo8596T() {
        return mo8597F(Long.MAX_VALUE);
    }

    /* renamed from: U */
    public final C11211a m8626U(C11211a unsafeCursor) {
        boolean z;
        C9612q.m13917h(unsafeCursor, "unsafeCursor");
        if (unsafeCursor.f29472j == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            unsafeCursor.f29472j = this;
            unsafeCursor.f29473k = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: W */
    public byte[] mo8595W(long j) {
        boolean z;
        if (j >= 0 && j <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (size() >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    /* renamed from: Y */
    public int m8624Y() {
        return C6829c.m21849c(readInt());
    }

    @Override // okio.BufferedSource
    /* renamed from: a0 */
    public void mo8594a0(long j) {
        if (this.f29471k < j) {
            throw new EOFException();
        }
    }

    /* renamed from: b0 */
    public short m8623b0() {
        return C6829c.m21848d(readShort());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.BufferedSource
    /* renamed from: d */
    public Buffer mo8593d() {
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: d0 */
    public ByteString mo8592d0(long j) {
        boolean z;
        if (j >= 0 && j <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (size() >= j) {
                if (j >= ((long) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT)) {
                    ByteString m8648A0 = m8648A0((int) j);
                    skip(j);
                    return m8648A0;
                }
                return new ByteString(mo8595W(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    /* renamed from: e0 */
    public String m8622e0(long j, Charset charset) {
        boolean z;
        C9612q.m13917h(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f29471k >= j) {
                if (i == 0) {
                    return "";
                }
                C6851u c6851u = this.f29470j;
                C9612q.m13920e(c6851u);
                int i2 = c6851u.f19077b;
                if (i2 + j > c6851u.f19078c) {
                    return new String(mo8595W(j), charset);
                }
                int i3 = (int) j;
                String str = new String(c6851u.f19076a, i2, i3, charset);
                int i4 = c6851u.f19077b + i3;
                c6851u.f19077b = i4;
                this.f29471k -= j;
                if (i4 == c6851u.f19078c) {
                    this.f29470j = c6851u.m21788b();
                    C6853v.m21781b(c6851u);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                C6851u c6851u = this.f29470j;
                C9612q.m13920e(c6851u);
                C6851u c6851u2 = buffer.f29470j;
                C9612q.m13920e(c6851u2);
                int i = c6851u.f19077b;
                int i2 = c6851u2.f19077b;
                long j = 0;
                while (j < size()) {
                    long min = Math.min(c6851u.f19078c - i, c6851u2.f19078c - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (c6851u.f19076a[i] == c6851u2.f19076a[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == c6851u.f19078c) {
                        c6851u = c6851u.f19081f;
                        C9612q.m13920e(c6851u);
                        i = c6851u.f19077b;
                    }
                    if (i2 == c6851u2.f19078c) {
                        c6851u2 = c6851u2.f19081f;
                        C9612q.m13920e(c6851u2);
                        i2 = c6851u2.f19077b;
                    }
                    j += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // okio.BufferedSource
    /* renamed from: f0 */
    public byte[] mo8591f0() {
        return mo8595W(size());
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource
    /* renamed from: g */
    public boolean mo8590g(long j) {
        return this.f29471k >= j;
    }

    @Override // okio.BufferedSource
    /* renamed from: g0 */
    public boolean mo8589g0() {
        return this.f29471k == 0;
    }

    public int hashCode() {
        C6851u c6851u = this.f29470j;
        if (c6851u != null) {
            int i = 1;
            do {
                int i2 = c6851u.f19078c;
                for (int i3 = c6851u.f19077b; i3 < i2; i3++) {
                    i = (i * 31) + c6851u.f19076a[i3];
                }
                c6851u = c6851u.f19081f;
                C9612q.m13920e(c6851u);
            } while (c6851u != this.f29470j);
            return i;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00b3 A[EDGE_INSN: B:102:0x00b3->B:94:0x00b3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00af  */
    @Override // okio.BufferedSource
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo8588i0() {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc1
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L11:
            gk.u r7 = r15.f29470j
            kotlin.jvm.internal.C9612q.m13920e(r7)
            byte[] r8 = r7.f19076a
            int r9 = r7.f19077b
            int r10 = r7.f19078c
        L1c:
            if (r9 >= r10) goto L9f
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L6f
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L6f
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L42
            if (r13 != 0) goto L3c
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L3c
            goto L42
        L3c:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L7b
        L42:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.mo8605c0(r3)
            okio.Buffer r0 = r0.writeByte(r11)
            if (r1 != 0) goto L54
            r0.readByte()
        L54:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo8584p0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6f:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L80
            if (r0 != 0) goto L80
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L7b:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L1c
        L80:
            if (r0 == 0) goto L84
            r2 = r13
            goto L9f
        L84:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = p122gk.C6829c.m21847e(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            if (r9 != r10) goto Lab
            gk.u r8 = r7.m21788b()
            r15.f29470j = r8
            p122gk.C6853v.m21781b(r7)
            goto Lad
        Lab:
            r7.f19077b = r9
        Lad:
            if (r2 != 0) goto Lb3
            gk.u r7 = r15.f29470j
            if (r7 != 0) goto L11
        Lb3:
            long r5 = r15.size()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.m8615t0(r5)
            if (r1 == 0) goto Lbf
            goto Lc0
        Lbf:
            long r3 = -r3
        Lc0:
            return r3
        Lc1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.mo8588i0():long");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final void m8621j() {
        skip(size());
    }

    /* renamed from: j0 */
    public String m8620j0(long j) {
        return m8622e0(j, C12785a.f33142b);
    }

    @Override // okio.BufferedSource
    /* renamed from: l0 */
    public String mo8587l0(Charset charset) {
        C9612q.m13917h(charset, "charset");
        return m8622e0(this.f29471k, charset);
    }

    /* renamed from: m */
    public Buffer clone() {
        return m8617s();
    }

    @Override // okio.BufferedSource
    /* renamed from: o0 */
    public ByteString mo8586o0() {
        return mo8592d0(size());
    }

    @Override // okio.BufferedSource
    /* renamed from: p */
    public Buffer mo8585p() {
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: p0 */
    public String mo8584p0() {
        return m8622e0(this.f29471k, C12785a.f33142b);
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return C6840m.m21829d(new C6846r(this));
    }

    /* renamed from: q */
    public final long m8618q() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        C6851u c6851u = this.f29470j;
        C9612q.m13920e(c6851u);
        C6851u c6851u2 = c6851u.f19082g;
        C9612q.m13920e(c6851u2);
        int i = c6851u2.f19078c;
        if (i < 8192 && c6851u2.f19080e) {
            size -= i - c6851u2.f19077b;
        }
        return size;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        C9612q.m13917h(sink, "sink");
        C6851u c6851u = this.f29470j;
        if (c6851u != null) {
            int min = Math.min(sink.remaining(), c6851u.f19078c - c6851u.f19077b);
            sink.put(c6851u.f19076a, c6851u.f19077b, min);
            int i = c6851u.f19077b + min;
            c6851u.f19077b = i;
            this.f29471k -= min;
            if (i == c6851u.f19078c) {
                this.f29470j = c6851u.m21788b();
                C6853v.m21781b(c6851u);
            }
            return min;
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        if (size() != 0) {
            C6851u c6851u = this.f29470j;
            C9612q.m13920e(c6851u);
            int i = c6851u.f19077b;
            int i2 = c6851u.f19078c;
            int i3 = i + 1;
            byte b = c6851u.f19076a[i];
            m8615t0(size() - 1);
            if (i3 == i2) {
                this.f29470j = c6851u.m21788b();
                C6853v.m21781b(c6851u);
            } else {
                c6851u.f19077b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) {
        C9612q.m13917h(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.BufferedSource
    public int readInt() {
        if (size() >= 4) {
            C6851u c6851u = this.f29470j;
            C9612q.m13920e(c6851u);
            int i = c6851u.f19077b;
            int i2 = c6851u.f19078c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = c6851u.f19076a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            m8615t0(size() - 4);
            if (i8 == i2) {
                this.f29470j = c6851u.m21788b();
                C6853v.m21781b(c6851u);
            } else {
                c6851u.f19077b = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        if (size() >= 8) {
            C6851u c6851u = this.f29470j;
            C9612q.m13920e(c6851u);
            int i = c6851u.f19077b;
            int i2 = c6851u.f19078c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = c6851u.f19076a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            m8615t0(size() - 8);
            if (i10 == i2) {
                this.f29470j = c6851u.m21788b();
                C6853v.m21781b(c6851u);
            } else {
                c6851u.f19077b = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        if (size() >= 2) {
            C6851u c6851u = this.f29470j;
            C9612q.m13920e(c6851u);
            int i = c6851u.f19077b;
            int i2 = c6851u.f19078c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = c6851u.f19076a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            m8615t0(size() - 2);
            if (i4 == i2) {
                this.f29470j = c6851u.m21788b();
                C6853v.m21781b(c6851u);
            } else {
                c6851u.f19077b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public final Buffer m8617s() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            C6851u c6851u = this.f29470j;
            C9612q.m13920e(c6851u);
            C6851u m21786d = c6851u.m21786d();
            buffer.f29470j = m21786d;
            m21786d.f19082g = m21786d;
            m21786d.f19081f = m21786d;
            for (C6851u c6851u2 = c6851u.f19081f; c6851u2 != c6851u; c6851u2 = c6851u2.f19081f) {
                C6851u c6851u3 = m21786d.f19082g;
                C9612q.m13920e(c6851u3);
                C9612q.m13920e(c6851u2);
                c6851u3.m21787c(c6851u2.m21786d());
            }
            buffer.m8615t0(size());
        }
        return buffer;
    }

    public final long size() {
        return this.f29471k;
    }

    @Override // okio.BufferedSource
    public void skip(long j) {
        while (j > 0) {
            C6851u c6851u = this.f29470j;
            if (c6851u != null) {
                int min = (int) Math.min(j, c6851u.f19078c - c6851u.f19077b);
                long j2 = min;
                m8615t0(size() - j2);
                j -= j2;
                int i = c6851u.f19077b + min;
                c6851u.f19077b = i;
                if (i == c6851u.f19078c) {
                    this.f29470j = c6851u.m21788b();
                    C6853v.m21781b(c6851u);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public final Buffer m8616t(Buffer out, long j, long j2) {
        C9612q.m13917h(out, "out");
        C6829c.m21850b(size(), j, j2);
        if (j2 != 0) {
            out.m8615t0(out.size() + j2);
            C6851u c6851u = this.f29470j;
            while (true) {
                C9612q.m13920e(c6851u);
                int i = c6851u.f19078c;
                int i2 = c6851u.f19077b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                c6851u = c6851u.f19081f;
            }
            while (j2 > 0) {
                C9612q.m13920e(c6851u);
                C6851u m21786d = c6851u.m21786d();
                int i3 = m21786d.f19077b + ((int) j);
                m21786d.f19077b = i3;
                m21786d.f19078c = Math.min(i3 + ((int) j2), m21786d.f19078c);
                C6851u c6851u2 = out.f29470j;
                if (c6851u2 == null) {
                    m21786d.f19082g = m21786d;
                    m21786d.f19081f = m21786d;
                    out.f29470j = m21786d;
                } else {
                    C9612q.m13920e(c6851u2);
                    C6851u c6851u3 = c6851u2.f19082g;
                    C9612q.m13920e(c6851u3);
                    c6851u3.m21787c(m21786d);
                }
                j2 -= m21786d.f19078c - m21786d.f19077b;
                c6851u = c6851u.f19081f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: t0 */
    public final void m8615t0(long j) {
        this.f29471k = j;
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.f29486d;
    }

    public String toString() {
        return m8613w0().toString();
    }

    @Override // okio.BufferedSource
    /* renamed from: u0 */
    public long mo8583u0(Sink sink) {
        C9612q.m13917h(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.mo46L(this, size);
        }
        return size;
    }

    @Override // okio.BufferedSink
    /* renamed from: v */
    public Buffer mo8601r() {
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: w */
    public long mo8582w(ByteString bytes) {
        C9612q.m13917h(bytes, "bytes");
        return m8638I(bytes, 0L);
    }

    /* renamed from: w0 */
    public final ByteString m8613w0() {
        boolean z;
        if (size() <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m8648A0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: x0 */
    public OutputStream mo8600x0() {
        return new C11213c();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ae A[EDGE_INSN: B:90:0x00ae->B:85:0x00ae ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo8581y0() {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            gk.u r6 = r14.f29470j
            kotlin.jvm.internal.C9612q.m13920e(r6)
            byte[] r7 = r6.f19076a
            int r8 = r6.f19077b
            int r9 = r6.f19078c
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.mo8603n0(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo8584p0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = p122gk.C6829c.m21847e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            gk.u r7 = r6.m21788b()
            r14.f29470j = r7
            p122gk.C6853v.m21781b(r6)
            goto La8
        La6:
            r6.f19077b = r8
        La8:
            if (r1 != 0) goto Lae
            gk.u r6 = r14.f29470j
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.m8615t0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.mo8581y0():long");
    }

    @Override // okio.BufferedSource
    /* renamed from: z */
    public void mo8580z(Buffer sink, long j) {
        C9612q.m13917h(sink, "sink");
        if (size() >= j) {
            sink.mo46L(this, j);
        } else {
            sink.mo46L(this, size());
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: z0 */
    public InputStream mo8579z0() {
        return new C11212b();
    }

    @Metadata(m14358d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m14357d2 = {"okio/Buffer$b", "Ljava/io/InputStream;", "", "read", "", "sink", "offset", "byteCount", "available", "", "close", "", "toString", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.Buffer$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11212b extends InputStream {
        C11212b() {
            Buffer.this = r1;
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(Buffer.this.size(), (long) ViewDefaults.NUMBER_OF_LINES);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (Buffer.this.size() > 0) {
                return Buffer.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return Buffer.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i, int i2) {
            C9612q.m13917h(sink, "sink");
            return Buffer.this.read(sink, i, i2);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        C9612q.m13917h(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            C6851u m8647B0 = m8647B0(1);
            int min = Math.min(i, 8192 - m8647B0.f19078c);
            source.get(m8647B0.f19076a, m8647B0.f19078c, min);
            i -= min;
            m8647B0.f19078c += min;
        }
        this.f29471k += remaining;
        return remaining;
    }

    public int read(byte[] sink, int i, int i2) {
        C9612q.m13917h(sink, "sink");
        C6829c.m21850b(sink.length, i, i2);
        C6851u c6851u = this.f29470j;
        if (c6851u != null) {
            int min = Math.min(i2, c6851u.f19078c - c6851u.f19077b);
            byte[] bArr = c6851u.f19076a;
            int i3 = c6851u.f19077b;
            C9536e.m14273e(bArr, sink, i, i3, i3 + min);
            c6851u.f19077b += min;
            m8615t0(size() - min);
            if (c6851u.f19077b == c6851u.f19078c) {
                this.f29470j = c6851u.m21788b();
                C6853v.m21781b(c6851u);
                return min;
            }
            return min;
        }
        return -1;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        C9612q.m13917h(sink, "sink");
        if (j >= 0) {
            if (size() == 0) {
                return -1L;
            }
            if (j > size()) {
                j = size();
            }
            sink.mo46L(this, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }
}