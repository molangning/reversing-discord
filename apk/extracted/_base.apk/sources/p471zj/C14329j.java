package p471zj;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.BufferedSink;
import p471zj.C14295d;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010@\u001a\u00020\u0016¢\u0006\u0004\bA\u0010BJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%J\u0016\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004J&\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010-\u001a\u00020\u0006H\u0016J$\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u00101\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u0007R\u0016\u00106\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0017\u0010;\u001a\u0002078\u0006¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00105¨\u0006C"}, m14357d2 = {"Lzj/j;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "", "I", "h", "Lzj/m;", "peerSettings", "a", "promisedStreamId", "", "Lzj/c;", "requestHeaders", "v", "flush", "Lzj/b;", "errorCode", "A", "s", "", "outFinished", "Lokio/Buffer;", "source", "i", "flags", "buffer", "j", "settings", "D", "ack", "payload1", "payload2", "t", "lastGoodStreamId", "", "debugData", "o", "windowSizeIncrement", "H", "length", "type", "m", "close", "headerBlock", "q", "Lokio/Buffer;", "hpackBuffer", "k", "maxFrameSize", "l", "Z", "closed", "Lzj/d$b;", "Lzj/d$b;", "getHpackWriter", "()Lzj/d$b;", "hpackWriter", "Lokio/BufferedSink;", "n", "Lokio/BufferedSink;", "sink", "client", "<init>", "(Lokio/BufferedSink;Z)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: zj.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14329j implements Closeable {

    /* renamed from: j */
    private final Buffer f36903j;

    /* renamed from: k */
    private int f36904k;

    /* renamed from: l */
    private boolean f36905l;

    /* renamed from: m */
    private final C14295d.C14297b f36906m;

    /* renamed from: n */
    private final BufferedSink f36907n;

    /* renamed from: o */
    private final boolean f36908o;

    /* renamed from: q */
    public static final C14330a f36902q = new C14330a(null);

    /* renamed from: p */
    private static final Logger f36901p = Logger.getLogger(C14298e.class.getName());

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m14357d2 = {"Lzj/j$a;", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14330a {
        private C14330a() {
        }

        public /* synthetic */ C14330a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14329j(BufferedSink sink, boolean z) {
        C9612q.m13917h(sink, "sink");
        this.f36907n = sink;
        this.f36908o = z;
        Buffer buffer = new Buffer();
        this.f36903j = buffer;
        this.f36904k = 16384;
        this.f36906m = new C14295d.C14297b(0, false, buffer, 3, null);
    }

    /* renamed from: I */
    private final void m30I(int i, long j) {
        int i2;
        while (j > 0) {
            long min = Math.min(this.f36904k, j);
            j -= min;
            int i3 = (int) min;
            if (j == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            m25m(i, i3, 9, i2);
            this.f36907n.mo46L(this.f36903j, min);
        }
    }

    /* renamed from: A */
    public final synchronized void m33A(int i, EnumC14291b errorCode) {
        boolean z;
        C9612q.m13917h(errorCode, "errorCode");
        if (!this.f36905l) {
            if (errorCode.m230a() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m25m(i, 4, 3, 0);
                this.f36907n.writeInt(errorCode.m230a());
                this.f36907n.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: D */
    public final synchronized void m32D(C14336m settings) {
        int i;
        C9612q.m13917h(settings, "settings");
        if (!this.f36905l) {
            m25m(0, settings.m0i() * 6, 4, 0);
            for (int i2 = 0; i2 < 10; i2++) {
                if (settings.m3f(i2)) {
                    if (i2 != 4) {
                        if (i2 != 7) {
                            i = i2;
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                    this.f36907n.writeShort(i);
                    this.f36907n.writeInt(settings.m8a(i2));
                }
            }
            this.f36907n.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: H */
    public final synchronized void m31H(int i, long j) {
        boolean z;
        if (!this.f36905l) {
            if (j != 0 && j <= 2147483647L) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m25m(i, 4, 8, 0);
                this.f36907n.writeInt((int) j);
                this.f36907n.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void m29a(C14336m peerSettings) {
        C9612q.m13917h(peerSettings, "peerSettings");
        if (!this.f36905l) {
            this.f36904k = peerSettings.m4e(this.f36904k);
            if (peerSettings.m7b() != -1) {
                this.f36906m.m201e(peerSettings.m7b());
            }
            m25m(0, 0, 4, 1);
            this.f36907n.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f36905l = true;
        this.f36907n.close();
    }

    public final synchronized void flush() {
        if (!this.f36905l) {
            this.f36907n.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: h */
    public final synchronized void m28h() {
        if (!this.f36905l) {
            if (!this.f36908o) {
                return;
            }
            Logger logger = f36901p;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C12562c.m4794q(">> CONNECTION " + C14298e.f36739a.mo8562l(), new Object[0]));
            }
            this.f36907n.mo8602q0(C14298e.f36739a);
            this.f36907n.flush();
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: i */
    public final synchronized void m27i(boolean z, int i, Buffer buffer, int i2) {
        if (!this.f36905l) {
            m26j(i, z ? 1 : 0, buffer, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: j */
    public final void m26j(int i, int i2, Buffer buffer, int i3) {
        m25m(i, i3, 0, i2);
        if (i3 > 0) {
            BufferedSink bufferedSink = this.f36907n;
            C9612q.m13920e(buffer);
            bufferedSink.mo46L(buffer, i3);
        }
    }

    /* renamed from: m */
    public final void m25m(int i, int i2, int i3, int i4) {
        boolean z;
        Logger logger = f36901p;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C14298e.f36743e.m195c(false, i, i2, i3, i4));
        }
        boolean z2 = true;
        if (i2 <= this.f36904k) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((((int) 2147483648L) & i) != 0) {
                z2 = false;
            }
            if (z2) {
                C12562c.m4811Y(this.f36907n, i2);
                this.f36907n.writeByte(i3 & 255);
                this.f36907n.writeByte(i4 & 255);
                this.f36907n.writeInt(i & ViewDefaults.NUMBER_OF_LINES);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f36904k + ": " + i2).toString());
    }

    /* renamed from: o */
    public final synchronized void m24o(int i, EnumC14291b errorCode, byte[] debugData) {
        boolean z;
        C9612q.m13917h(errorCode, "errorCode");
        C9612q.m13917h(debugData, "debugData");
        if (!this.f36905l) {
            boolean z2 = false;
            if (errorCode.m230a() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m25m(0, debugData.length + 8, 7, 0);
                this.f36907n.writeInt(i);
                this.f36907n.writeInt(errorCode.m230a());
                if (debugData.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    this.f36907n.write(debugData);
                }
                this.f36907n.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: q */
    public final synchronized void m23q(boolean z, int i, List<C14293c> headerBlock) {
        int i2;
        C9612q.m13917h(headerBlock, "headerBlock");
        if (!this.f36905l) {
            this.f36906m.m199g(headerBlock);
            long size = this.f36903j.size();
            long min = Math.min(this.f36904k, size);
            int i3 = (size > min ? 1 : (size == min ? 0 : -1));
            if (i3 == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            m25m(i, (int) min, 1, i2);
            this.f36907n.mo46L(this.f36903j, min);
            if (i3 > 0) {
                m30I(i, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: s */
    public final int m22s() {
        return this.f36904k;
    }

    /* renamed from: t */
    public final synchronized void m21t(boolean z, int i, int i2) {
        int i3;
        if (!this.f36905l) {
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            m25m(0, 8, 6, i3);
            this.f36907n.writeInt(i);
            this.f36907n.writeInt(i2);
            this.f36907n.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: v */
    public final synchronized void m20v(int i, int i2, List<C14293c> requestHeaders) {
        int i3;
        C9612q.m13917h(requestHeaders, "requestHeaders");
        if (!this.f36905l) {
            this.f36906m.m199g(requestHeaders);
            long size = this.f36903j.size();
            int min = (int) Math.min(this.f36904k - 4, size);
            int i4 = min + 4;
            long j = min;
            int i5 = (size > j ? 1 : (size == j ? 0 : -1));
            if (i5 == 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            m25m(i, i4, 5, i3);
            this.f36907n.writeInt(i2 & ViewDefaults.NUMBER_OF_LINES);
            this.f36907n.mo46L(this.f36903j, j);
            if (i5 > 0) {
                m30I(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
