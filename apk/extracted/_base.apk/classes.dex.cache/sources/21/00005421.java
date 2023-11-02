package p471zj;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C9627a;
import kotlin.ranges.IntRange;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p471zj.C14295d;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \r2\u00020\u0001:\u0003+,-B\u0017\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\bH\u0016R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'¨\u0006."}, m14357d2 = {"Lzj/h;", "Ljava/io/Closeable;", "Lzj/h$c;", "handler", "", "length", "flags", "streamId", "", "q", ViewProps.PADDING, "", "Lzj/c;", "o", "j", "v", "t", "D", "H", "A", "s", "m", "I", "i", "", "requireSettings", "h", "close", "Lzj/h$b;", "Lzj/h$b;", "continuation", "Lzj/d$a;", "k", "Lzj/d$a;", "hpackReader", "Lokio/BufferedSource;", "l", "Lokio/BufferedSource;", "source", "Z", "client", "<init>", "(Lokio/BufferedSource;Z)V", "a", "b", "c", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: zj.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14320h implements Closeable {

    /* renamed from: n */
    private static final Logger f36861n;

    /* renamed from: o */
    public static final C14321a f36862o = new C14321a(null);

    /* renamed from: j */
    private final C14322b f36863j;

    /* renamed from: k */
    private final C14295d.C14296a f36864k;

    /* renamed from: l */
    private final BufferedSource f36865l;

    /* renamed from: m */
    private final boolean f36866m;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m14357d2 = {"Lzj/h$a;", "", "", "length", "flags", ViewProps.PADDING, "b", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14321a {
        private C14321a() {
        }

        public /* synthetic */ C14321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m96a() {
            return C14320h.f36861n;
        }

        /* renamed from: b */
        public final int m95b(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\r\u0010\u0012R\"\u0010!\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#¨\u0006'"}, m14357d2 = {"Lzj/h$b;", "Lokio/Source;", "", "h", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "close", "", "j", "I", "getLength", "()I", "m", "(I)V", "length", "k", "getFlags", "i", "flags", "l", "getStreamId", "q", "streamId", "a", ViewProps.LEFT, "n", "getPadding", "o", ViewProps.PADDING, "Lokio/BufferedSource;", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14322b implements Source {

        /* renamed from: j */
        private int f36867j;

        /* renamed from: k */
        private int f36868k;

        /* renamed from: l */
        private int f36869l;

        /* renamed from: m */
        private int f36870m;

        /* renamed from: n */
        private int f36871n;

        /* renamed from: o */
        private final BufferedSource f36872o;

        public C14322b(BufferedSource source) {
            C9612q.m13917h(source, "source");
            this.f36872o = source;
        }

        /* renamed from: h */
        private final void m93h() {
            int i = this.f36869l;
            int m4828H = C12562c.m4828H(this.f36872o);
            this.f36870m = m4828H;
            this.f36867j = m4828H;
            int m4809b = C12562c.m4809b(this.f36872o.readByte(), 255);
            this.f36868k = C12562c.m4809b(this.f36872o.readByte(), 255);
            C14321a c14321a = C14320h.f36862o;
            if (c14321a.m96a().isLoggable(Level.FINE)) {
                c14321a.m96a().fine(C14298e.f36743e.m195c(true, this.f36869l, this.f36867j, m4809b, this.f36868k));
            }
            int readInt = this.f36872o.readInt() & ViewDefaults.NUMBER_OF_LINES;
            this.f36869l = readInt;
            if (m4809b == 9) {
                if (readInt == i) {
                    return;
                }
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
            throw new IOException(m4809b + " != TYPE_CONTINUATION");
        }

        /* renamed from: a */
        public final int m94a() {
            return this.f36870m;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: i */
        public final void m92i(int i) {
            this.f36868k = i;
        }

        /* renamed from: j */
        public final void m91j(int i) {
            this.f36870m = i;
        }

        /* renamed from: m */
        public final void m90m(int i) {
            this.f36867j = i;
        }

        /* renamed from: o */
        public final void m89o(int i) {
            this.f36871n = i;
        }

        /* renamed from: q */
        public final void m88q(int i) {
            this.f36869l = i;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            C9612q.m13917h(sink, "sink");
            while (true) {
                int i = this.f36870m;
                if (i == 0) {
                    this.f36872o.skip(this.f36871n);
                    this.f36871n = 0;
                    if ((this.f36868k & 4) != 0) {
                        return -1L;
                    }
                    m93h();
                } else {
                    long read = this.f36872o.read(sink, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f36870m -= (int) read;
                    return read;
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f36872o.timeout();
        }
    }

    @Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\tH&J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&J(\u0010&\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H&J&\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006*"}, m14357d2 = {"Lzj/h$c;", "", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", "length", "", "j", "associatedStreamId", "", "Lzj/c;", "headerBlock", "a", "Lzj/b;", "errorCode", "g", "clearPrevious", "Lzj/m;", "settings", "i", "e", "ack", "payload1", "payload2", "k", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "d", "", "windowSizeIncrement", "b", "streamDependency", "weight", "exclusive", "l", "promisedStreamId", "requestHeaders", "c", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface InterfaceC14323c {
        /* renamed from: a */
        void mo87a(boolean z, int i, int i2, List<C14293c> list);

        /* renamed from: b */
        void mo86b(int i, long j);

        /* renamed from: c */
        void mo85c(int i, int i2, List<C14293c> list);

        /* renamed from: d */
        void mo84d(int i, EnumC14291b enumC14291b, ByteString byteString);

        /* renamed from: e */
        void mo83e();

        /* renamed from: g */
        void mo82g(int i, EnumC14291b enumC14291b);

        /* renamed from: i */
        void mo81i(boolean z, C14336m c14336m);

        /* renamed from: j */
        void mo80j(boolean z, int i, BufferedSource bufferedSource, int i2);

        /* renamed from: k */
        void mo79k(boolean z, int i, int i2);

        /* renamed from: l */
        void mo78l(int i, int i2, int i3, boolean z);
    }

    static {
        Logger logger = Logger.getLogger(C14298e.class.getName());
        C9612q.m13918g(logger, "Logger.getLogger(Http2::class.java.name)");
        f36861n = logger;
    }

    public C14320h(BufferedSource source, boolean z) {
        C9612q.m13917h(source, "source");
        this.f36865l = source;
        this.f36866m = z;
        C14322b c14322b = new C14322b(source);
        this.f36863j = c14322b;
        this.f36864k = new C14295d.C14296a(c14322b, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 4, null);
    }

    /* renamed from: A */
    private final void m110A(InterfaceC14323c interfaceC14323c, int i, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                i4 = C12562c.m4809b(this.f36865l.readByte(), 255);
            } else {
                i4 = 0;
            }
            interfaceC14323c.mo85c(i3, this.f36865l.readInt() & ViewDefaults.NUMBER_OF_LINES, m101o(f36862o.m95b(i - 4, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    /* renamed from: D */
    private final void m109D(InterfaceC14323c interfaceC14323c, int i, int i2, int i3) {
        if (i == 4) {
            if (i3 != 0) {
                int readInt = this.f36865l.readInt();
                EnumC14291b m229a = EnumC14291b.f36706z.m229a(readInt);
                if (m229a != null) {
                    interfaceC14323c.mo82g(i3, m229a);
                    return;
                }
                throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
            }
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
    }

    /* renamed from: H */
    private final void m108H(InterfaceC14323c interfaceC14323c, int i, int i2, int i3) {
        IntRange m21916q;
        C9627a m21918o;
        int readInt;
        if (i3 == 0) {
            if ((i2 & 1) != 0) {
                if (i == 0) {
                    interfaceC14323c.mo83e();
                    return;
                }
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            } else if (i % 6 == 0) {
                C14336m c14336m = new C14336m();
                m21916q = C6759j.m21916q(0, i);
                m21918o = C6759j.m21918o(m21916q, 6);
                int m13890a = m21918o.m13890a();
                int m13889e = m21918o.m13889e();
                int m13888h = m21918o.m13888h();
                if (m13888h < 0 ? m13890a >= m13889e : m13890a <= m13889e) {
                    while (true) {
                        int m4808c = C12562c.m4808c(this.f36865l.readShort(), 65535);
                        readInt = this.f36865l.readInt();
                        if (m4808c != 2) {
                            if (m4808c != 3) {
                                if (m4808c != 4) {
                                    if (m4808c == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        break;
                                    }
                                } else if (readInt >= 0) {
                                    m4808c = 7;
                                } else {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else {
                                m4808c = 4;
                            }
                        } else if (readInt != 0 && readInt != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        c14336m.m1h(m4808c, readInt);
                        if (m13890a == m13889e) {
                            break;
                        }
                        m13890a += m13888h;
                    }
                    throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
                }
                interfaceC14323c.mo81i(false, c14336m);
                return;
            } else {
                throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
            }
        }
        throw new IOException("TYPE_SETTINGS streamId != 0");
    }

    /* renamed from: I */
    private final void m107I(InterfaceC14323c interfaceC14323c, int i, int i2, int i3) {
        if (i == 4) {
            long m4807d = C12562c.m4807d(this.f36865l.readInt(), 2147483647L);
            if (m4807d != 0) {
                interfaceC14323c.mo86b(i3, m4807d);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
    }

    /* renamed from: j */
    private final void m103j(InterfaceC14323c interfaceC14323c, int i, int i2, int i3) {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            boolean z2 = true;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 32) == 0) {
                z2 = false;
            }
            if (!z2) {
                if ((i2 & 8) != 0) {
                    i4 = C12562c.m4809b(this.f36865l.readByte(), 255);
                }
                interfaceC14323c.mo80j(z, i3, this.f36865l, f36862o.m95b(i, i2, i4));
                this.f36865l.skip(i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* renamed from: m */
    private final void m102m(InterfaceC14323c interfaceC14323c, int i, int i2, int i3) {
        if (i >= 8) {
            if (i3 == 0) {
                int readInt = this.f36865l.readInt();
                int readInt2 = this.f36865l.readInt();
                int i4 = i - 8;
                EnumC14291b m229a = EnumC14291b.f36706z.m229a(readInt2);
                if (m229a != null) {
                    ByteString byteString = ByteString.f29481m;
                    if (i4 > 0) {
                        byteString = this.f36865l.mo8592d0(i4);
                    }
                    interfaceC14323c.mo84d(readInt, m229a, byteString);
                    return;
                }
                throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException("TYPE_GOAWAY length < 8: " + i);
    }

    /* renamed from: o */
    private final List<C14293c> m101o(int i, int i2, int i3, int i4) {
        this.f36863j.m91j(i);
        C14322b c14322b = this.f36863j;
        c14322b.m90m(c14322b.m94a());
        this.f36863j.m89o(i2);
        this.f36863j.m92i(i3);
        this.f36863j.m88q(i4);
        this.f36864k.m212k();
        return this.f36864k.m218e();
    }

    /* renamed from: q */
    private final void m100q(InterfaceC14323c interfaceC14323c, int i, int i2, int i3) {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 8) != 0) {
                i4 = C12562c.m4809b(this.f36865l.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                m98t(interfaceC14323c, i3);
                i -= 5;
            }
            interfaceC14323c.mo87a(z, i3, -1, m101o(f36862o.m95b(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: s */
    private final void m99s(InterfaceC14323c interfaceC14323c, int i, int i2, int i3) {
        if (i == 8) {
            if (i3 == 0) {
                int readInt = this.f36865l.readInt();
                int readInt2 = this.f36865l.readInt();
                boolean z = true;
                if ((i2 & 1) == 0) {
                    z = false;
                }
                interfaceC14323c.mo79k(z, readInt, readInt2);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException("TYPE_PING length != 8: " + i);
    }

    /* renamed from: t */
    private final void m98t(InterfaceC14323c interfaceC14323c, int i) {
        boolean z;
        int readInt = this.f36865l.readInt();
        if ((((int) 2147483648L) & readInt) != 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC14323c.mo78l(i, readInt & ViewDefaults.NUMBER_OF_LINES, C12562c.m4809b(this.f36865l.readByte(), 255) + 1, z);
    }

    /* renamed from: v */
    private final void m97v(InterfaceC14323c interfaceC14323c, int i, int i2, int i3) {
        if (i == 5) {
            if (i3 != 0) {
                m98t(interfaceC14323c, i3);
                return;
            }
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36865l.close();
    }

    /* renamed from: h */
    public final boolean m105h(boolean z, InterfaceC14323c handler) {
        C9612q.m13917h(handler, "handler");
        try {
            this.f36865l.mo8594a0(9L);
            int m4828H = C12562c.m4828H(this.f36865l);
            if (m4828H <= 16384) {
                int m4809b = C12562c.m4809b(this.f36865l.readByte(), 255);
                int m4809b2 = C12562c.m4809b(this.f36865l.readByte(), 255);
                int readInt = this.f36865l.readInt() & ViewDefaults.NUMBER_OF_LINES;
                Logger logger = f36861n;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C14298e.f36743e.m195c(true, readInt, m4828H, m4809b, m4809b2));
                }
                if (z && m4809b != 4) {
                    throw new IOException("Expected a SETTINGS frame but was " + C14298e.f36743e.m196b(m4809b));
                }
                switch (m4809b) {
                    case 0:
                        m103j(handler, m4828H, m4809b2, readInt);
                        return true;
                    case 1:
                        m100q(handler, m4828H, m4809b2, readInt);
                        return true;
                    case 2:
                        m97v(handler, m4828H, m4809b2, readInt);
                        return true;
                    case 3:
                        m109D(handler, m4828H, m4809b2, readInt);
                        return true;
                    case 4:
                        m108H(handler, m4828H, m4809b2, readInt);
                        return true;
                    case 5:
                        m110A(handler, m4828H, m4809b2, readInt);
                        return true;
                    case 6:
                        m99s(handler, m4828H, m4809b2, readInt);
                        return true;
                    case 7:
                        m102m(handler, m4828H, m4809b2, readInt);
                        return true;
                    case 8:
                        m107I(handler, m4828H, m4809b2, readInt);
                        return true;
                    default:
                        this.f36865l.skip(m4828H);
                        return true;
                }
            }
            throw new IOException("FRAME_SIZE_ERROR: " + m4828H);
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public final void m104i(InterfaceC14323c handler) {
        C9612q.m13917h(handler, "handler");
        if (this.f36866m) {
            if (!m105h(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.f36865l;
        ByteString byteString = C14298e.f36739a;
        ByteString mo8592d0 = bufferedSource.mo8592d0(byteString.m8551z());
        Logger logger = f36861n;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C12562c.m4794q("<< CONNECTION " + mo8592d0.mo8562l(), new Object[0]));
        }
        if (!(!C9612q.m13922c(byteString, mo8592d0))) {
            return;
        }
        throw new IOException("Expected a connection header but was " + mo8592d0.m8575D());
    }
}