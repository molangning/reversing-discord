package fk;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.reactnativecommunity.webview.RNCWebViewManager;
import fk.C6501g;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.jvm.internal.C9589e0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C9653o;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p328rj.AbstractC12302m;
import p328rj.AbstractC12317s;
import p328rj.EnumC12312p;
import p328rj.InterfaceC12283d;
import p390vj.AbstractC13342a;
import p390vj.C13345d;
import p390vj.C13346e;
import p410wj.C13634c;
import p410wj.C13638e;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0005(' \u001e\"BA\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u0010^\u001a\u00020\\\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010e\u001a\u00020c\u0012\u0006\u0010f\u001a\u00020*\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010i\u001a\u00020*¢\u0006\u0004\bl\u0010mJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0017H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010,\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010+\u001a\u00020*J\u000f\u0010-\u001a\u00020\u0004H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0000¢\u0006\u0004\b/\u00100J\u001c\u00103\u001a\u00020\u000b2\n\u0010\"\u001a\u000601j\u0002`22\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\u0014\u00105\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010CR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00104R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010HR\u0016\u0010O\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00104R\u0016\u0010V\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010QR\u0016\u0010W\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010SR\u0016\u0010X\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010SR\u0016\u0010Z\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010SR\u0016\u0010[\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010QR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010]R\u001a\u0010b\u001a\u00020_8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010`\u001a\u0004\bY\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010dR\u0014\u0010f\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010NR\u0018\u0010h\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010gR\u0016\u0010i\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010N¨\u0006o"}, m14357d2 = {"Lfk/d;", "Lokhttp3/WebSocket;", "Lfk/g$a;", "Lfk/e;", "", "t", "Lokio/ByteString;", "data", "", "formatOpcode", "w", "", "v", "m", "Lokhttp3/OkHttpClient;", "client", "p", "Lokhttp3/Response;", "response", "Lwj/c;", "exchange", "n", "(Lokhttp3/Response;Lwj/c;)V", "", ZeroconfModule.KEY_SERVICE_NAME, "Lfk/d$d;", "streams", "s", "u", "text", "d", "bytes", "c", "payload", "e", "f", "code", "reason", "h", "b", "a", "g", "", "cancelAfterCloseMillis", "o", "x", "()Z", "y", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "q", "Ljava/lang/String;", "key", "Lokhttp3/Call;", "Lokhttp3/Call;", "call", "Lvj/a;", "Lvj/a;", "writerTask", "Lfk/g;", "Lfk/g;", "reader", "Lfk/h;", "Lfk/h;", "writer", "Lvj/d;", "Lvj/d;", "taskQueue", "Lfk/d$d;", "Ljava/util/ArrayDeque;", "i", "Ljava/util/ArrayDeque;", "pongQueue", "", "j", "messageAndCloseQueue", "k", "J", "queueSize", "l", "Z", "enqueuedClose", "I", "receivedCloseCode", "receivedCloseReason", "failed", "sentPingCount", "receivedPingCount", "r", "receivedPongCount", "awaitingPong", "Lokhttp3/Request;", "Lokhttp3/Request;", "originalRequest", "Lrj/s;", "Lrj/s;", "()Lrj/s;", "listener", "Ljava/util/Random;", "Ljava/util/Random;", "random", "pingIntervalMillis", "Lfk/e;", "extensions", "minimumDeflateSize", "Lvj/e;", "taskRunner", "<init>", "(Lvj/e;Lokhttp3/Request;Lrj/s;Ljava/util/Random;JLfk/e;J)V", "A", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: fk.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6489d implements WebSocket, C6501g.InterfaceC6502a {

    /* renamed from: A */
    public static final C6491b f18219A = new C6491b(null);

    /* renamed from: z */
    private static final List<EnumC12312p> f18220z;

    /* renamed from: a */
    private final String f18221a;

    /* renamed from: b */
    private Call f18222b;

    /* renamed from: c */
    private AbstractC13342a f18223c;

    /* renamed from: d */
    private C6501g f18224d;

    /* renamed from: e */
    private C6503h f18225e;

    /* renamed from: f */
    private C13345d f18226f;

    /* renamed from: g */
    private String f18227g;

    /* renamed from: h */
    private AbstractC6493d f18228h;

    /* renamed from: i */
    private final ArrayDeque<ByteString> f18229i;

    /* renamed from: j */
    private final ArrayDeque<Object> f18230j;

    /* renamed from: k */
    private long f18231k;

    /* renamed from: l */
    private boolean f18232l;

    /* renamed from: m */
    private int f18233m;

    /* renamed from: n */
    private String f18234n;

    /* renamed from: o */
    private boolean f18235o;

    /* renamed from: p */
    private int f18236p;

    /* renamed from: q */
    private int f18237q;

    /* renamed from: r */
    private int f18238r;

    /* renamed from: s */
    private boolean f18239s;

    /* renamed from: t */
    private final Request f18240t;

    /* renamed from: u */
    private final AbstractC12317s f18241u;

    /* renamed from: v */
    private final Random f18242v;

    /* renamed from: w */
    private final long f18243w;

    /* renamed from: x */
    private C6498e f18244x;

    /* renamed from: y */
    private long f18245y;

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Lfk/d$a;", "", "", "a", "I", "b", "()I", "code", "Lokio/ByteString;", "Lokio/ByteString;", "c", "()Lokio/ByteString;", "reason", "", "J", "()J", "cancelAfterCloseMillis", "<init>", "(ILokio/ByteString;J)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6490a {

        /* renamed from: a */
        private final int f18246a;

        /* renamed from: b */
        private final ByteString f18247b;

        /* renamed from: c */
        private final long f18248c;

        public C6490a(int i, ByteString byteString, long j) {
            this.f18246a = i;
            this.f18247b = byteString;
            this.f18248c = j;
        }

        /* renamed from: a */
        public final long m22585a() {
            return this.f18248c;
        }

        /* renamed from: b */
        public final int m22584b() {
            return this.f18246a;
        }

        /* renamed from: c */
        public final ByteString m22583c() {
            return this.f18247b;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m14357d2 = {"Lfk/d$b;", "", "", "CANCEL_AFTER_CLOSE_MILLIS", "J", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "", "Lrj/p;", "ONLY_HTTP1", "Ljava/util/List;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6491b {
        private C6491b() {
        }

        public /* synthetic */ C6491b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, m14357d2 = {"Lfk/d$c;", "", "", "a", "I", "b", "()I", "formatOpcode", "Lokio/ByteString;", "Lokio/ByteString;", "()Lokio/ByteString;", "data", "<init>", "(ILokio/ByteString;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6492c {

        /* renamed from: a */
        private final int f18249a;

        /* renamed from: b */
        private final ByteString f18250b;

        public C6492c(int i, ByteString data) {
            C9612q.m13917h(data, "data");
            this.f18249a = i;
            this.f18250b = data;
        }

        /* renamed from: a */
        public final ByteString m22582a() {
            return this.f18250b;
        }

        /* renamed from: b */
        public final int m22581b() {
            return this.f18249a;
        }
    }

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m14357d2 = {"Lfk/d$d;", "Ljava/io/Closeable;", "", "j", "Z", "a", "()Z", "client", "Lokio/BufferedSource;", "k", "Lokio/BufferedSource;", "i", "()Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "l", "Lokio/BufferedSink;", "h", "()Lokio/BufferedSink;", "sink", "<init>", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static abstract class AbstractC6493d implements Closeable {

        /* renamed from: j */
        private final boolean f18251j;

        /* renamed from: k */
        private final BufferedSource f18252k;

        /* renamed from: l */
        private final BufferedSink f18253l;

        public AbstractC6493d(boolean z, BufferedSource source, BufferedSink sink) {
            C9612q.m13917h(source, "source");
            C9612q.m13917h(sink, "sink");
            this.f18251j = z;
            this.f18252k = source;
            this.f18253l = sink;
        }

        /* renamed from: a */
        public final boolean m22580a() {
            return this.f18251j;
        }

        /* renamed from: h */
        public final BufferedSink m22579h() {
            return this.f18253l;
        }

        /* renamed from: i */
        public final BufferedSource m22578i() {
            return this.f18252k;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"Lfk/d$e;", "Lvj/a;", "", "f", "<init>", "(Lfk/d;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.d$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C6494e extends AbstractC13342a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6494e() {
            super(r4.f18227g + " writer", false, 2, null);
            C6489d.this = r4;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            try {
                if (C6489d.this.m22587x()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e) {
                C6489d.this.m22594q(e, null);
                return -1L;
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m14357d2 = {"fk/d$f", "Lrj/d;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "", "onResponse", "Ljava/io/IOException;", "e", "onFailure", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.d$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6495f implements InterfaceC12283d {

        /* renamed from: b */
        final /* synthetic */ Request f18256b;

        C6495f(Request request) {
            C6489d.this = r1;
            this.f18256b = request;
        }

        @Override // p328rj.InterfaceC12283d
        public void onFailure(Call call, IOException e) {
            C9612q.m13917h(call, "call");
            C9612q.m13917h(e, "e");
            C6489d.this.m22594q(e, null);
        }

        @Override // p328rj.InterfaceC12283d
        public void onResponse(Call call, Response response) {
            C9612q.m13917h(call, "call");
            C9612q.m13917h(response, "response");
            C13634c m8694o = response.m8694o();
            try {
                C6489d.this.m22597n(response, m8694o);
                C9612q.m13920e(m8694o);
                AbstractC6493d m2025m = m8694o.m2025m();
                C6498e m22576a = C6498e.f18274g.m22576a(response.m8710A());
                C6489d.this.f18244x = m22576a;
                if (!C6489d.this.m22591t(m22576a)) {
                    synchronized (C6489d.this) {
                        C6489d.this.f18230j.clear();
                        C6489d.this.mo8659g(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    C6489d.this.m22592s(C12562c.f32616i + " WebSocket " + this.f18256b.m8734l().m8892o(), m2025m);
                    C6489d.this.m22593r().onOpen(C6489d.this, response);
                    C6489d.this.m22590u();
                } catch (Exception e) {
                    C6489d.this.m22594q(e, null);
                }
            } catch (IOException e2) {
                if (m8694o != null) {
                    m8694o.m2017u();
                }
                C6489d.this.m22594q(e2, response);
                C12562c.m4801j(response);
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, m14357d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lvj/a;", "", "f", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$schedule$1"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.d$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6496g extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f18257e;

        /* renamed from: f */
        final /* synthetic */ long f18258f;

        /* renamed from: g */
        final /* synthetic */ C6489d f18259g;

        /* renamed from: h */
        final /* synthetic */ String f18260h;

        /* renamed from: i */
        final /* synthetic */ AbstractC6493d f18261i;

        /* renamed from: j */
        final /* synthetic */ C6498e f18262j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6496g(String str, String str2, long j, C6489d c6489d, String str3, AbstractC6493d abstractC6493d, C6498e c6498e) {
            super(str2, false, 2, null);
            this.f18257e = str;
            this.f18258f = j;
            this.f18259g = c6489d;
            this.f18260h = str3;
            this.f18261i = abstractC6493d;
            this.f18262j = c6498e;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            this.f18259g.m22586y();
            return this.f18258f;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, m14357d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lvj/a;", "", "f", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$execute$1"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.d$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6497h extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f18263e;

        /* renamed from: f */
        final /* synthetic */ boolean f18264f;

        /* renamed from: g */
        final /* synthetic */ C6489d f18265g;

        /* renamed from: h */
        final /* synthetic */ C6503h f18266h;

        /* renamed from: i */
        final /* synthetic */ ByteString f18267i;

        /* renamed from: j */
        final /* synthetic */ Ref$ObjectRef f18268j;

        /* renamed from: k */
        final /* synthetic */ C9589e0 f18269k;

        /* renamed from: l */
        final /* synthetic */ Ref$ObjectRef f18270l;

        /* renamed from: m */
        final /* synthetic */ Ref$ObjectRef f18271m;

        /* renamed from: n */
        final /* synthetic */ Ref$ObjectRef f18272n;

        /* renamed from: o */
        final /* synthetic */ Ref$ObjectRef f18273o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6497h(String str, boolean z, String str2, boolean z2, C6489d c6489d, C6503h c6503h, ByteString byteString, Ref$ObjectRef ref$ObjectRef, C9589e0 c9589e0, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5) {
            super(str2, z2);
            this.f18263e = str;
            this.f18264f = z;
            this.f18265g = c6489d;
            this.f18266h = c6503h;
            this.f18267i = byteString;
            this.f18268j = ref$ObjectRef;
            this.f18269k = c9589e0;
            this.f18270l = ref$ObjectRef2;
            this.f18271m = ref$ObjectRef3;
            this.f18272n = ref$ObjectRef4;
            this.f18273o = ref$ObjectRef5;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            this.f18265g.m22598m();
            return -1L;
        }
    }

    static {
        List<EnumC12312p> m14109d;
        m14109d = C9544i.m14109d(EnumC12312p.HTTP_1_1);
        f18220z = m14109d;
    }

    public C6489d(C13346e taskRunner, Request originalRequest, AbstractC12317s listener, Random random, long j, C6498e c6498e, long j2) {
        C9612q.m13917h(taskRunner, "taskRunner");
        C9612q.m13917h(originalRequest, "originalRequest");
        C9612q.m13917h(listener, "listener");
        C9612q.m13917h(random, "random");
        this.f18240t = originalRequest;
        this.f18241u = listener;
        this.f18242v = random;
        this.f18243w = j;
        this.f18244x = c6498e;
        this.f18245y = j2;
        this.f18226f = taskRunner.m2726i();
        this.f18229i = new ArrayDeque<>();
        this.f18230j = new ArrayDeque<>();
        this.f18233m = -1;
        if (C9612q.m13922c("GET", originalRequest.m8738h())) {
            ByteString.C11214a c11214a = ByteString.f29482n;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            Unit unit = Unit.f25302a;
            this.f18221a = ByteString.C11214a.m8544g(c11214a, bArr, 0, 0, 3, null).mo8572a();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + originalRequest.m8738h()).toString());
    }

    /* renamed from: t */
    public final boolean m22591t(C6498e c6498e) {
        if (c6498e.f18280f || c6498e.f18276b != null) {
            return false;
        }
        Integer num = c6498e.f18278d;
        if (num != null) {
            int intValue = num.intValue();
            if (8 > intValue || 15 < intValue) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: v */
    private final void m22589v() {
        if (C12562c.f32615h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        AbstractC13342a abstractC13342a = this.f18223c;
        if (abstractC13342a != null) {
            C13345d.m2739j(this.f18226f, abstractC13342a, 0L, 2, null);
        }
    }

    /* renamed from: w */
    private final synchronized boolean m22588w(ByteString byteString, int i) {
        if (!this.f18235o && !this.f18232l) {
            if (this.f18231k + byteString.m8551z() > 16777216) {
                mo8659g(RNCWebViewManager.COMMAND_CLEAR_CACHE, null);
                return false;
            }
            this.f18231k += byteString.m8551z();
            this.f18230j.add(new C6492c(i, byteString));
            m22589v();
            return true;
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    /* renamed from: a */
    public boolean mo8661a(ByteString bytes) {
        C9612q.m13917h(bytes, "bytes");
        return m22588w(bytes, 2);
    }

    @Override // okhttp3.WebSocket
    /* renamed from: b */
    public boolean mo8660b(String text) {
        C9612q.m13917h(text, "text");
        return m22588w(ByteString.f29482n.m8547d(text), 1);
    }

    @Override // fk.C6501g.InterfaceC6502a
    /* renamed from: c */
    public void mo22566c(ByteString bytes) {
        C9612q.m13917h(bytes, "bytes");
        this.f18241u.onMessage(this, bytes);
    }

    @Override // fk.C6501g.InterfaceC6502a
    /* renamed from: d */
    public void mo22565d(String text) {
        C9612q.m13917h(text, "text");
        this.f18241u.onMessage(this, text);
    }

    @Override // fk.C6501g.InterfaceC6502a
    /* renamed from: e */
    public synchronized void mo22564e(ByteString payload) {
        C9612q.m13917h(payload, "payload");
        if (!this.f18235o && (!this.f18232l || !this.f18230j.isEmpty())) {
            this.f18229i.add(payload);
            m22589v();
            this.f18237q++;
        }
    }

    @Override // fk.C6501g.InterfaceC6502a
    /* renamed from: f */
    public synchronized void mo22563f(ByteString payload) {
        C9612q.m13917h(payload, "payload");
        this.f18238r++;
        this.f18239s = false;
    }

    @Override // okhttp3.WebSocket
    /* renamed from: g */
    public boolean mo8659g(int i, String str) {
        return m22596o(i, str, 60000L);
    }

    @Override // fk.C6501g.InterfaceC6502a
    /* renamed from: h */
    public void mo22562h(int i, String reason) {
        boolean z;
        AbstractC6493d abstractC6493d;
        C6501g c6501g;
        C6503h c6503h;
        C9612q.m13917h(reason, "reason");
        boolean z2 = true;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this) {
                if (this.f18233m != -1) {
                    z2 = false;
                }
                if (z2) {
                    this.f18233m = i;
                    this.f18234n = reason;
                    abstractC6493d = null;
                    if (this.f18232l && this.f18230j.isEmpty()) {
                        AbstractC6493d abstractC6493d2 = this.f18228h;
                        this.f18228h = null;
                        c6501g = this.f18224d;
                        this.f18224d = null;
                        c6503h = this.f18225e;
                        this.f18225e = null;
                        this.f18226f.m2735n();
                        abstractC6493d = abstractC6493d2;
                    } else {
                        c6501g = null;
                        c6503h = null;
                    }
                    Unit unit = Unit.f25302a;
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            try {
                this.f18241u.onClosing(this, i, reason);
                if (abstractC6493d != null) {
                    this.f18241u.onClosed(this, i, reason);
                }
                if (c6503h != null) {
                    return;
                }
                return;
            } finally {
                if (abstractC6493d != null) {
                    C12562c.m4801j(abstractC6493d);
                }
                if (c6501g != null) {
                    C12562c.m4801j(c6501g);
                }
                if (c6503h != null) {
                    C12562c.m4801j(c6503h);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: m */
    public void m22598m() {
        Call call = this.f18222b;
        C9612q.m13920e(call);
        call.cancel();
    }

    /* renamed from: n */
    public final void m22597n(Response response, C13634c c13634c) {
        boolean m13754t;
        boolean m13754t2;
        C9612q.m13917h(response, "response");
        if (response.m8695m() == 101) {
            String m8690v = Response.m8690v(response, "Connection", null, 2, null);
            m13754t = C9653o.m13754t("Upgrade", m8690v, true);
            if (m13754t) {
                String m8690v2 = Response.m8690v(response, "Upgrade", null, 2, null);
                m13754t2 = C9653o.m13754t("websocket", m8690v2, true);
                if (m13754t2) {
                    String m8690v3 = Response.m8690v(response, "Sec-WebSocket-Accept", null, 2, null);
                    ByteString.C11214a c11214a = ByteString.f29482n;
                    String mo8572a = c11214a.m8547d(this.f18221a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").m8553v().mo8572a();
                    if (!(!C9612q.m13922c(mo8572a, m8690v3))) {
                        if (c13634c != null) {
                            return;
                        }
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + mo8572a + "' but was '" + m8690v3 + '\'');
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + m8690v2 + '\'');
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + m8690v + '\'');
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.m8695m() + ' ' + response.m8708H() + '\'');
    }

    /* renamed from: o */
    public final synchronized boolean m22596o(int i, String str, long j) {
        ByteString byteString;
        boolean z;
        C6500f.f18281a.m22573c(i);
        if (str != null) {
            byteString = ByteString.f29482n.m8547d(str);
            if (byteString.m8551z() <= 123) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
            }
        } else {
            byteString = null;
        }
        if (!this.f18235o && !this.f18232l) {
            this.f18232l = true;
            this.f18230j.add(new C6490a(i, byteString, j));
            m22589v();
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m22595p(OkHttpClient client) {
        C9612q.m13917h(client, "client");
        if (this.f18240t.m8742d("Sec-WebSocket-Extensions") != null) {
            m22594q(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient m8771c = client.m8825B().m8766h(AbstractC12302m.f32075a).m8776N(f18220z).m8771c();
        Request m8732b = this.f18240t.m8737i().m8729e("Upgrade", "websocket").m8729e("Connection", "Upgrade").m8729e("Sec-WebSocket-Key", this.f18221a).m8729e("Sec-WebSocket-Version", "13").m8729e("Sec-WebSocket-Extensions", "permessage-deflate").m8732b();
        C13638e c13638e = new C13638e(m8771c, m8732b, true);
        this.f18222b = c13638e;
        C9612q.m13920e(c13638e);
        c13638e.mo1994i(new C6495f(m8732b));
    }

    /* renamed from: q */
    public final void m22594q(Exception e, Response response) {
        C9612q.m13917h(e, "e");
        synchronized (this) {
            if (this.f18235o) {
                return;
            }
            this.f18235o = true;
            AbstractC6493d abstractC6493d = this.f18228h;
            this.f18228h = null;
            C6501g c6501g = this.f18224d;
            this.f18224d = null;
            C6503h c6503h = this.f18225e;
            this.f18225e = null;
            this.f18226f.m2735n();
            Unit unit = Unit.f25302a;
            try {
                this.f18241u.onFailure(this, e, response);
            } finally {
                if (abstractC6493d != null) {
                    C12562c.m4801j(abstractC6493d);
                }
                if (c6501g != null) {
                    C12562c.m4801j(c6501g);
                }
                if (c6503h != null) {
                    C12562c.m4801j(c6503h);
                }
            }
        }
    }

    /* renamed from: r */
    public final AbstractC12317s m22593r() {
        return this.f18241u;
    }

    /* renamed from: s */
    public final void m22592s(String name, AbstractC6493d streams) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(streams, "streams");
        C6498e c6498e = this.f18244x;
        C9612q.m13920e(c6498e);
        synchronized (this) {
            this.f18227g = name;
            this.f18228h = streams;
            this.f18225e = new C6503h(streams.m22580a(), streams.m22579h(), this.f18242v, c6498e.f18275a, c6498e.m22577a(streams.m22580a()), this.f18245y);
            this.f18223c = new C6494e();
            long j = this.f18243w;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                String str = name + " ping";
                this.f18226f.m2740i(new C6496g(str, str, nanos, this, name, streams, c6498e), nanos);
            }
            if (!this.f18230j.isEmpty()) {
                m22589v();
            }
            Unit unit = Unit.f25302a;
        }
        this.f18224d = new C6501g(streams.m22580a(), streams.m22578i(), this, c6498e.f18275a, c6498e.m22577a(!streams.m22580a()));
    }

    /* renamed from: u */
    public final void m22590u() {
        while (this.f18233m == -1) {
            C6501g c6501g = this.f18224d;
            C9612q.m13920e(c6501g);
            c6501g.m22572a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00fb A[Catch: all -> 0x01af, TRY_ENTER, TryCatch #4 {all -> 0x01af, blocks: (B:124:0x00fb, B:126:0x0106, B:129:0x0110, B:130:0x0120, B:132:0x012f, B:137:0x0134, B:138:0x013b, B:139:0x013c, B:142:0x0142, B:131:0x0121), top: B:186:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0106 A[Catch: all -> 0x01af, TryCatch #4 {all -> 0x01af, blocks: (B:124:0x00fb, B:126:0x0106, B:129:0x0110, B:130:0x0120, B:132:0x012f, B:137:0x0134, B:138:0x013b, B:139:0x013c, B:142:0x0142, B:131:0x0121), top: B:186:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [fk.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [fk.d$d, T] */
    /* JADX WARN: Type inference failed for: r2v16, types: [fk.g, T] */
    /* JADX WARN: Type inference failed for: r2v17, types: [fk.h, T] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [okio.ByteString] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m22587x() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.C6489d.m22587x():boolean");
    }

    /* renamed from: y */
    public final void m22586y() {
        int i;
        synchronized (this) {
            if (this.f18235o) {
                return;
            }
            C6503h c6503h = this.f18225e;
            if (c6503h != null) {
                if (this.f18239s) {
                    i = this.f18236p;
                } else {
                    i = -1;
                }
                this.f18236p++;
                this.f18239s = true;
                Unit unit = Unit.f25302a;
                if (i != -1) {
                    m22594q(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f18243w + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                    return;
                }
                try {
                    c6503h.m22558j(ByteString.f29481m);
                } catch (IOException e) {
                    m22594q(e, null);
                }
            }
        }
    }
}