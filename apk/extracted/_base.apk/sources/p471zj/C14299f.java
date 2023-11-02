package p471zj;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p031bk.C2370k;
import p390vj.AbstractC13342a;
import p390vj.C13344c;
import p390vj.C13345d;
import p390vj.C13346e;
import p471zj.C14320h;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 º\u00012\u00020\u0001:\u0007»\u0001¼\u0001½\u0001\fB\u0015\b\u0000\u0012\b\u0010·\u0001\u001a\u00030¶\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0002J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010 \u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0014J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!H\u0000¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0014H\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010.\u001a\u00020\rJ\u000e\u0010/\u001a\u00020\r2\u0006\u0010%\u001a\u00020!J\b\u00100\u001a\u00020\rH\u0016J)\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b4\u00105J\u001c\u00109\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u000207H\u0007J\u000e\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0014J\u000f\u0010<\u001a\u00020\rH\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b@\u0010AJ-\u0010C\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0004\bC\u0010DJ/\u0010G\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\bI\u0010$R\u001a\u0010N\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010T\u001a\u00020O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\"\u0010g\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010b\u001a\u0004\bi\u0010d\"\u0004\bj\u0010fR\u0016\u0010m\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010KR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010rR\u0014\u0010w\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010rR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010~\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R\u0018\u0010\u0082\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010}R\u0018\u0010\u0084\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010}R\u0018\u0010\u0086\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010}R\u0018\u0010\u0088\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010}R\u001d\u0010\u008e\u0001\u001a\u00030\u0089\u00018\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0093\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u008b\u0001\u001a\u0006\b\u0090\u0001\u0010\u008d\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u0010\u0098\u0001\u001a\u00020\u00142\u0007\u0010\u0094\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010}\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u009b\u0001\u001a\u00020\u00142\u0007\u0010\u0094\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010}\u001a\u0006\b\u009a\u0001\u0010\u0097\u0001R)\u0010\u009e\u0001\u001a\u00020\u00142\u0007\u0010\u0094\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010}\u001a\u0006\b\u009d\u0001\u0010\u0097\u0001R)\u0010¡\u0001\u001a\u00020\u00142\u0007\u0010\u0094\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010}\u001a\u0006\b \u0001\u0010\u0097\u0001R \u0010§\u0001\u001a\u00030¢\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010¬\u0001\u001a\u00030¨\u00018\u0006¢\u0006\u000f\n\u0005\bb\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R \u0010±\u0001\u001a\u00070\u00ad\u0001R\u00020\u00008\u0006¢\u0006\u000f\n\u0005\b}\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001e\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001¨\u0006¾\u0001"}, m14357d2 = {"Lzj/f;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Lzj/c;", "requestHeaders", "", "out", "Lzj/i;", "H0", "Ljava/io/IOException;", "e", "", "Y", "id", "C0", "streamId", "O0", "(I)Lzj/i;", "", "read", "V0", "(J)V", "I0", "outFinished", "alternating", "X0", "(IZLjava/util/List;)V", "Lokio/Buffer;", "buffer", "byteCount", "W0", "Lzj/b;", "errorCode", "a1", "(ILzj/b;)V", "statusCode", "Z0", "unacknowledgedBytesRead", "b1", "(IJ)V", "reply", "payload1", "payload2", "Y0", "flush", "S0", "close", "connectionCode", "streamCode", "cause", "V", "(Lzj/b;Lzj/b;Ljava/io/IOException;)V", "sendConnectionPreface", "Lvj/e;", "taskRunner", "T0", "nowNs", "G0", "P0", "()V", "N0", "(I)Z", "L0", "(ILjava/util/List;)V", "inFinished", "K0", "(ILjava/util/List;Z)V", "Lokio/BufferedSource;", "source", "J0", "(ILokio/BufferedSource;IZ)V", "M0", "j", "Z", "b0", "()Z", "client", "Lzj/f$d;", "k", "Lzj/f$d;", "t0", "()Lzj/f$d;", "listener", "", "l", "Ljava/util/Map;", "D0", "()Ljava/util/Map;", "streams", "", "m", "Ljava/lang/String;", "e0", "()Ljava/lang/String;", "connectionName", "n", "I", "j0", "()I", "Q0", "(I)V", "lastGoodStreamId", "o", "w0", "setNextStreamId$okhttp", "nextStreamId", "p", "isShutdown", "q", "Lvj/e;", "Lvj/d;", "r", "Lvj/d;", "writerQueue", "s", "pushQueue", "t", "settingsListenerQueue", "Lzj/l;", "u", "Lzj/l;", "pushObserver", "v", "J", "intervalPingsSent", "w", "intervalPongsReceived", "x", "degradedPingsSent", "y", "degradedPongsReceived", "z", "awaitPongsReceived", "A", "degradedPongDeadlineNs", "Lzj/m;", "B", "Lzj/m;", "A0", "()Lzj/m;", "okHttpSettings", "C", "B0", "R0", "(Lzj/m;)V", "peerSettings", "<set-?>", "D", "getReadBytesTotal", "()J", "readBytesTotal", "E", "getReadBytesAcknowledged", "readBytesAcknowledged", "F", "getWriteBytesTotal", "writeBytesTotal", "G", "E0", "writeBytesMaximum", "Ljava/net/Socket;", "H", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "Lzj/j;", "Lzj/j;", "F0", "()Lzj/j;", "writer", "Lzj/f$e;", "Lzj/f$e;", "getReaderRunnable", "()Lzj/f$e;", "readerRunnable", "", "K", "Ljava/util/Set;", "currentPushRequests", "Lzj/f$b;", "builder", "<init>", "(Lzj/f$b;)V", "M", "b", "c", "d", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: zj.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14299f implements Closeable {

    /* renamed from: L */
    private static final C14336m f36744L;

    /* renamed from: M */
    public static final C14302c f36745M = new C14302c(null);

    /* renamed from: A */
    private long f36746A;

    /* renamed from: B */
    private final C14336m f36747B;

    /* renamed from: C */
    private C14336m f36748C;

    /* renamed from: D */
    private long f36749D;

    /* renamed from: E */
    private long f36750E;

    /* renamed from: F */
    private long f36751F;

    /* renamed from: G */
    private long f36752G;

    /* renamed from: H */
    private final Socket f36753H;

    /* renamed from: I */
    private final C14329j f36754I;

    /* renamed from: J */
    private final C14306e f36755J;

    /* renamed from: K */
    private final Set<Integer> f36756K;

    /* renamed from: j */
    private final boolean f36757j;

    /* renamed from: k */
    private final AbstractC14303d f36758k;

    /* renamed from: l */
    private final Map<Integer, C14324i> f36759l;

    /* renamed from: m */
    private final String f36760m;

    /* renamed from: n */
    private int f36761n;

    /* renamed from: o */
    private int f36762o;

    /* renamed from: p */
    private boolean f36763p;

    /* renamed from: q */
    private final C13346e f36764q;

    /* renamed from: r */
    private final C13345d f36765r;

    /* renamed from: s */
    private final C13345d f36766s;

    /* renamed from: t */
    private final C13345d f36767t;

    /* renamed from: u */
    private final InterfaceC14333l f36768u;

    /* renamed from: v */
    private long f36769v;

    /* renamed from: w */
    private long f36770w;

    /* renamed from: x */
    private long f36771x;

    /* renamed from: y */
    private long f36772y;

    /* renamed from: z */
    private long f36773z;

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"zj/f$a", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14300a extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f36774e;

        /* renamed from: f */
        final /* synthetic */ C14299f f36775f;

        /* renamed from: g */
        final /* synthetic */ long f36776g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14300a(String str, String str2, C14299f c14299f, long j) {
            super(str2, false, 2, null);
            this.f36774e = str;
            this.f36775f = c14299f;
            this.f36776g = j;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            boolean z;
            synchronized (this.f36775f) {
                if (this.f36775f.f36770w < this.f36775f.f36769v) {
                    z = true;
                } else {
                    this.f36775f.f36769v++;
                    z = false;
                }
            }
            if (z) {
                this.f36775f.m161Y(null);
                return -1L;
            }
            this.f36775f.m160Y0(false, 1, 0);
            return this.f36776g;
        }
    }

    @Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010?\u001a\u00020:\u0012\u0006\u0010D\u001a\u00020@¢\u0006\u0004\bE\u0010FJ.\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b$\u0010,\"\u0004\b-\u0010.R\"\u00105\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b0\u00102\"\u0004\b3\u00104R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u00106\u001a\u0004\b*\u00107\"\u0004\b8\u00109R\"\u0010?\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010;\u001a\u0004\b\u0018\u0010<\"\u0004\b=\u0010>R\u001a\u0010D\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010A\u001a\u0004\bB\u0010C¨\u0006G"}, m14357d2 = {"Lzj/f$b;", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "sink", "m", "Lzj/f$d;", "listener", "k", "", "pingIntervalMillis", "l", "Lzj/f;", "a", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "connectionName", "Lokio/BufferedSource;", "i", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "d", "Lokio/BufferedSink;", "g", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "e", "Lzj/f$d;", "()Lzj/f$d;", "setListener$okhttp", "(Lzj/f$d;)V", "Lzj/l;", "f", "Lzj/l;", "()Lzj/l;", "setPushObserver$okhttp", "(Lzj/l;)V", "pushObserver", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "", "Z", "()Z", "setClient$okhttp", "(Z)V", "client", "Lvj/e;", "Lvj/e;", "j", "()Lvj/e;", "taskRunner", "<init>", "(ZLvj/e;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14301b {

        /* renamed from: a */
        public Socket f36777a;

        /* renamed from: b */
        public String f36778b;

        /* renamed from: c */
        public BufferedSource f36779c;

        /* renamed from: d */
        public BufferedSink f36780d;

        /* renamed from: e */
        private AbstractC14303d f36781e;

        /* renamed from: f */
        private InterfaceC14333l f36782f;

        /* renamed from: g */
        private int f36783g;

        /* renamed from: h */
        private boolean f36784h;

        /* renamed from: i */
        private final C13346e f36785i;

        public C14301b(boolean z, C13346e taskRunner) {
            C9612q.m13917h(taskRunner, "taskRunner");
            this.f36784h = z;
            this.f36785i = taskRunner;
            this.f36781e = AbstractC14303d.f36786a;
            this.f36782f = InterfaceC14333l.f36916a;
        }

        /* renamed from: a */
        public final C14299f m141a() {
            return new C14299f(this);
        }

        /* renamed from: b */
        public final boolean m140b() {
            return this.f36784h;
        }

        /* renamed from: c */
        public final String m139c() {
            String str = this.f36778b;
            if (str == null) {
                C9612q.m13900y("connectionName");
            }
            return str;
        }

        /* renamed from: d */
        public final AbstractC14303d m138d() {
            return this.f36781e;
        }

        /* renamed from: e */
        public final int m137e() {
            return this.f36783g;
        }

        /* renamed from: f */
        public final InterfaceC14333l m136f() {
            return this.f36782f;
        }

        /* renamed from: g */
        public final BufferedSink m135g() {
            BufferedSink bufferedSink = this.f36780d;
            if (bufferedSink == null) {
                C9612q.m13900y("sink");
            }
            return bufferedSink;
        }

        /* renamed from: h */
        public final Socket m134h() {
            Socket socket = this.f36777a;
            if (socket == null) {
                C9612q.m13900y("socket");
            }
            return socket;
        }

        /* renamed from: i */
        public final BufferedSource m133i() {
            BufferedSource bufferedSource = this.f36779c;
            if (bufferedSource == null) {
                C9612q.m13900y("source");
            }
            return bufferedSource;
        }

        /* renamed from: j */
        public final C13346e m132j() {
            return this.f36785i;
        }

        /* renamed from: k */
        public final C14301b m131k(AbstractC14303d listener) {
            C9612q.m13917h(listener, "listener");
            this.f36781e = listener;
            return this;
        }

        /* renamed from: l */
        public final C14301b m130l(int i) {
            this.f36783g = i;
            return this;
        }

        /* renamed from: m */
        public final C14301b m129m(Socket socket, String peerName, BufferedSource source, BufferedSink sink) {
            String str;
            C9612q.m13917h(socket, "socket");
            C9612q.m13917h(peerName, "peerName");
            C9612q.m13917h(source, "source");
            C9612q.m13917h(sink, "sink");
            this.f36777a = socket;
            if (this.f36784h) {
                str = C12562c.f32616i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            this.f36778b = str;
            this.f36779c = source;
            this.f36780d = sink;
            return this;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, m14357d2 = {"Lzj/f$c;", "", "Lzj/m;", "DEFAULT_SETTINGS", "Lzj/m;", "a", "()Lzj/m;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14302c {
        private C14302c() {
        }

        public /* synthetic */ C14302c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14336m m128a() {
            return C14299f.f36744L;
        }
    }

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, m14357d2 = {"Lzj/f$d;", "", "Lzj/i;", "stream", "", "b", "Lzj/f;", "connection", "Lzj/m;", "settings", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static abstract class AbstractC14303d {

        /* renamed from: b */
        public static final C14305b f36787b = new C14305b(null);

        /* renamed from: a */
        public static final AbstractC14303d f36786a = new C14304a();

        @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"zj/f$d$a", "Lzj/f$d;", "Lzj/i;", "stream", "", "b", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: zj.f$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C14304a extends AbstractC14303d {
            C14304a() {
            }

            @Override // p471zj.C14299f.AbstractC14303d
            /* renamed from: b */
            public void mo126b(C14324i stream) {
                C9612q.m13917h(stream, "stream");
                stream.m69d(EnumC14291b.REFUSED_STREAM, null);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lzj/f$d$b;", "", "Lzj/f$d;", "REFUSE_INCOMING_STREAMS", "Lzj/f$d;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: zj.f$d$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C14305b {
            private C14305b() {
            }

            public /* synthetic */ C14305b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public void mo127a(C14299f connection, C14336m settings) {
            C9612q.m13917h(connection, "connection");
            C9612q.m13917h(settings, "settings");
        }

        /* renamed from: b */
        public abstract void mo126b(C14324i c14324i);
    }

    @Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00101\u001a\u00020-¢\u0006\u0004\b2\u00103J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J \u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0016J(\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0005H\u0016J&\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100¨\u00064"}, m14357d2 = {"Lzj/f$e;", "Lzj/h$c;", "Lkotlin/Function0;", "", "n", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", "length", "j", "associatedStreamId", "", "Lzj/c;", "headerBlock", "a", "Lzj/b;", "errorCode", "g", "clearPrevious", "Lzj/m;", "settings", "i", "m", "e", "ack", "payload1", "payload2", "k", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "d", "", "windowSizeIncrement", "b", "streamDependency", "weight", "exclusive", "l", "promisedStreamId", "requestHeaders", "c", "Lzj/h;", "Lzj/h;", "getReader$okhttp", "()Lzj/h;", "reader", "<init>", "(Lzj/f;Lzj/h;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C14306e implements C14320h.InterfaceC14323c, Function0<Unit> {

        /* renamed from: j */
        private final C14320h f36788j;

        /* renamed from: k */
        final /* synthetic */ C14299f f36789k;

        @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, m14357d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lvj/a;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$synchronized$lambda$1"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: zj.f$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C14307a extends AbstractC13342a {

            /* renamed from: e */
            final /* synthetic */ String f36790e;

            /* renamed from: f */
            final /* synthetic */ boolean f36791f;

            /* renamed from: g */
            final /* synthetic */ C14306e f36792g;

            /* renamed from: h */
            final /* synthetic */ Ref$ObjectRef f36793h;

            /* renamed from: i */
            final /* synthetic */ boolean f36794i;

            /* renamed from: j */
            final /* synthetic */ C14336m f36795j;

            /* renamed from: k */
            final /* synthetic */ Ref$LongRef f36796k;

            /* renamed from: l */
            final /* synthetic */ Ref$ObjectRef f36797l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14307a(String str, boolean z, String str2, boolean z2, C14306e c14306e, Ref$ObjectRef ref$ObjectRef, boolean z3, C14336m c14336m, Ref$LongRef ref$LongRef, Ref$ObjectRef ref$ObjectRef2) {
                super(str2, z2);
                this.f36790e = str;
                this.f36791f = z;
                this.f36792g = c14306e;
                this.f36793h = ref$ObjectRef;
                this.f36794i = z3;
                this.f36795j = c14336m;
                this.f36796k = ref$LongRef;
                this.f36797l = ref$ObjectRef2;
            }

            @Override // p390vj.AbstractC13342a
            /* renamed from: f */
            public long mo123f() {
                this.f36792g.f36789k.m144t0().mo127a(this.f36792g.f36789k, (C14336m) this.f36793h.f25329j);
                return -1L;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, m14357d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lvj/a;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$execute$1"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: zj.f$e$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C14308b extends AbstractC13342a {

            /* renamed from: e */
            final /* synthetic */ String f36798e;

            /* renamed from: f */
            final /* synthetic */ boolean f36799f;

            /* renamed from: g */
            final /* synthetic */ C14324i f36800g;

            /* renamed from: h */
            final /* synthetic */ C14306e f36801h;

            /* renamed from: i */
            final /* synthetic */ C14324i f36802i;

            /* renamed from: j */
            final /* synthetic */ int f36803j;

            /* renamed from: k */
            final /* synthetic */ List f36804k;

            /* renamed from: l */
            final /* synthetic */ boolean f36805l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14308b(String str, boolean z, String str2, boolean z2, C14324i c14324i, C14306e c14306e, C14324i c14324i2, int i, List list, boolean z3) {
                super(str2, z2);
                this.f36798e = str;
                this.f36799f = z;
                this.f36800g = c14324i;
                this.f36801h = c14306e;
                this.f36802i = c14324i2;
                this.f36803j = i;
                this.f36804k = list;
                this.f36805l = z3;
            }

            @Override // p390vj.AbstractC13342a
            /* renamed from: f */
            public long mo123f() {
                try {
                    this.f36801h.f36789k.m144t0().mo126b(this.f36800g);
                    return -1L;
                } catch (IOException e) {
                    C2370k m33588g = C2370k.f6491c.m33588g();
                    m33588g.m33600k("Http2Connection.Listener failure for " + this.f36801h.f36789k.m154e0(), 4, e);
                    try {
                        this.f36800g.m69d(EnumC14291b.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m14357d2 = {"vj/c", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: zj.f$e$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C14309c extends AbstractC13342a {

            /* renamed from: e */
            final /* synthetic */ String f36806e;

            /* renamed from: f */
            final /* synthetic */ boolean f36807f;

            /* renamed from: g */
            final /* synthetic */ C14306e f36808g;

            /* renamed from: h */
            final /* synthetic */ int f36809h;

            /* renamed from: i */
            final /* synthetic */ int f36810i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14309c(String str, boolean z, String str2, boolean z2, C14306e c14306e, int i, int i2) {
                super(str2, z2);
                this.f36806e = str;
                this.f36807f = z;
                this.f36808g = c14306e;
                this.f36809h = i;
                this.f36810i = i2;
            }

            @Override // p390vj.AbstractC13342a
            /* renamed from: f */
            public long mo123f() {
                this.f36808g.f36789k.m160Y0(true, this.f36809h, this.f36810i);
                return -1L;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m14357d2 = {"vj/c", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: zj.f$e$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C14310d extends AbstractC13342a {

            /* renamed from: e */
            final /* synthetic */ String f36811e;

            /* renamed from: f */
            final /* synthetic */ boolean f36812f;

            /* renamed from: g */
            final /* synthetic */ C14306e f36813g;

            /* renamed from: h */
            final /* synthetic */ boolean f36814h;

            /* renamed from: i */
            final /* synthetic */ C14336m f36815i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14310d(String str, boolean z, String str2, boolean z2, C14306e c14306e, boolean z3, C14336m c14336m) {
                super(str2, z2);
                this.f36811e = str;
                this.f36812f = z;
                this.f36813g = c14306e;
                this.f36814h = z3;
                this.f36815i = c14336m;
            }

            @Override // p390vj.AbstractC13342a
            /* renamed from: f */
            public long mo123f() {
                this.f36813g.m125m(this.f36814h, this.f36815i);
                return -1L;
            }
        }

        public C14306e(C14299f c14299f, C14320h reader) {
            C9612q.m13917h(reader, "reader");
            this.f36789k = c14299f;
            this.f36788j = reader;
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: a */
        public void mo87a(boolean z, int i, int i2, List<C14293c> headerBlock) {
            C9612q.m13917h(headerBlock, "headerBlock");
            if (this.f36789k.m177N0(i)) {
                this.f36789k.m180K0(i, headerBlock, z);
                return;
            }
            synchronized (this.f36789k) {
                C14324i m191C0 = this.f36789k.m191C0(i);
                if (m191C0 == null) {
                    if (this.f36789k.f36763p) {
                        return;
                    }
                    if (i <= this.f36789k.m150j0()) {
                        return;
                    }
                    if (i % 2 == this.f36789k.m142w0() % 2) {
                        return;
                    }
                    C14324i c14324i = new C14324i(i, this.f36789k, false, z, C12562c.m4823M(headerBlock));
                    this.f36789k.m173Q0(i);
                    this.f36789k.m189D0().put(Integer.valueOf(i), c14324i);
                    String str = this.f36789k.m154e0() + '[' + i + "] onStream";
                    this.f36789k.f36764q.m2726i().m2740i(new C14308b(str, true, str, true, c14324i, this, m191C0, i, headerBlock, z), 0L);
                    return;
                }
                Unit unit = Unit.f25302a;
                m191C0.m49x(C12562c.m4823M(headerBlock), z);
            }
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: b */
        public void mo86b(int i, long j) {
            if (i == 0) {
                synchronized (this.f36789k) {
                    C14299f c14299f = this.f36789k;
                    c14299f.f36752G = c14299f.m188E0() + j;
                    C14299f c14299f2 = this.f36789k;
                    if (c14299f2 != null) {
                        c14299f2.notifyAll();
                        Unit unit = Unit.f25302a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            C14324i m191C0 = this.f36789k.m191C0(i);
            if (m191C0 != null) {
                synchronized (m191C0) {
                    m191C0.m72a(j);
                    Unit unit2 = Unit.f25302a;
                }
            }
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: c */
        public void mo85c(int i, int i2, List<C14293c> requestHeaders) {
            C9612q.m13917h(requestHeaders, "requestHeaders");
            this.f36789k.m179L0(i2, requestHeaders);
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: d */
        public void mo84d(int i, EnumC14291b errorCode, ByteString debugData) {
            int i2;
            C14324i[] c14324iArr;
            C9612q.m13917h(errorCode, "errorCode");
            C9612q.m13917h(debugData, "debugData");
            debugData.m8551z();
            synchronized (this.f36789k) {
                Object[] array = this.f36789k.m189D0().values().toArray(new C14324i[0]);
                if (array != null) {
                    c14324iArr = (C14324i[]) array;
                    this.f36789k.f36763p = true;
                    Unit unit = Unit.f25302a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C14324i c14324i : c14324iArr) {
                if (c14324i.m63j() > i && c14324i.m53t()) {
                    c14324i.m48y(EnumC14291b.REFUSED_STREAM);
                    this.f36789k.m176O0(c14324i.m63j());
                }
            }
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: e */
        public void mo83e() {
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: g */
        public void mo82g(int i, EnumC14291b errorCode) {
            C9612q.m13917h(errorCode, "errorCode");
            if (this.f36789k.m177N0(i)) {
                this.f36789k.m178M0(i, errorCode);
                return;
            }
            C14324i m176O0 = this.f36789k.m176O0(i);
            if (m176O0 != null) {
                m176O0.m48y(errorCode);
            }
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: i */
        public void mo81i(boolean z, C14336m settings) {
            C9612q.m13917h(settings, "settings");
            String str = this.f36789k.m154e0() + " applyAndAckSettings";
            this.f36789k.f36765r.m2740i(new C14310d(str, true, str, true, this, z, settings), 0L);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m124n();
            return Unit.f25302a;
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: j */
        public void mo80j(boolean z, int i, BufferedSource source, int i2) {
            C9612q.m13917h(source, "source");
            if (this.f36789k.m177N0(i)) {
                this.f36789k.m181J0(i, source, i2, z);
                return;
            }
            C14324i m191C0 = this.f36789k.m191C0(i);
            if (m191C0 == null) {
                this.f36789k.m157a1(i, EnumC14291b.PROTOCOL_ERROR);
                long j = i2;
                this.f36789k.m164V0(j);
                source.skip(j);
                return;
            }
            m191C0.m50w(source, i2);
            if (z) {
                m191C0.m49x(C12562c.f32609b, true);
            }
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: k */
        public void mo79k(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.f36789k) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                this.f36789k.f36773z++;
                                C14299f c14299f = this.f36789k;
                                if (c14299f != null) {
                                    c14299f.notifyAll();
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                            }
                            Unit unit = Unit.f25302a;
                        } else {
                            this.f36789k.f36772y++;
                        }
                    } else {
                        this.f36789k.f36770w++;
                    }
                }
                return;
            }
            String str = this.f36789k.m154e0() + " ping";
            this.f36789k.f36765r.m2740i(new C14309c(str, true, str, true, this, i, i2), 0L);
        }

        @Override // p471zj.C14320h.InterfaceC14323c
        /* renamed from: l */
        public void mo78l(int i, int i2, int i3, boolean z) {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:(2:15|(10:17|18|19|20|21|22|23|24|25|26)(2:51|52))|20|21|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00d6, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00d7, code lost:
            r21.f36789k.m161Y(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, zj.m] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m125m(boolean r22, p471zj.C14336m r23) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p471zj.C14299f.C14306e.m125m(boolean, zj.m):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [zj.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [zj.h, java.io.Closeable] */
        /* renamed from: n */
        public void m124n() {
            EnumC14291b enumC14291b;
            EnumC14291b enumC14291b2;
            EnumC14291b enumC14291b3 = EnumC14291b.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.f36788j.m104i(this);
                    while (this.f36788j.m105h(false, this)) {
                    }
                    enumC14291b2 = EnumC14291b.NO_ERROR;
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    enumC14291b = enumC14291b3;
                    this.f36789k.m165V(enumC14291b, enumC14291b3, e);
                    C12562c.m4801j(this.f36788j);
                    throw th;
                }
                try {
                    this.f36789k.m165V(enumC14291b2, EnumC14291b.CANCEL, null);
                    enumC14291b = enumC14291b2;
                } catch (IOException e3) {
                    e = e3;
                    EnumC14291b enumC14291b4 = EnumC14291b.PROTOCOL_ERROR;
                    C14299f c14299f = this.f36789k;
                    c14299f.m165V(enumC14291b4, enumC14291b4, e);
                    enumC14291b = c14299f;
                    enumC14291b3 = this.f36788j;
                    C12562c.m4801j(enumC14291b3);
                }
                enumC14291b3 = this.f36788j;
                C12562c.m4801j(enumC14291b3);
            } catch (Throwable th3) {
                th = th3;
                this.f36789k.m165V(enumC14291b, enumC14291b3, e);
                C12562c.m4801j(this.f36788j);
                throw th;
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m14357d2 = {"vj/c", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14311f extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f36816e;

        /* renamed from: f */
        final /* synthetic */ boolean f36817f;

        /* renamed from: g */
        final /* synthetic */ C14299f f36818g;

        /* renamed from: h */
        final /* synthetic */ int f36819h;

        /* renamed from: i */
        final /* synthetic */ Buffer f36820i;

        /* renamed from: j */
        final /* synthetic */ int f36821j;

        /* renamed from: k */
        final /* synthetic */ boolean f36822k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14311f(String str, boolean z, String str2, boolean z2, C14299f c14299f, int i, Buffer buffer, int i2, boolean z3) {
            super(str2, z2);
            this.f36816e = str;
            this.f36817f = z;
            this.f36818g = c14299f;
            this.f36819h = i;
            this.f36820i = buffer;
            this.f36821j = i2;
            this.f36822k = z3;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            try {
                boolean mo9d = this.f36818g.f36768u.mo9d(this.f36819h, this.f36820i, this.f36821j, this.f36822k);
                if (mo9d) {
                    this.f36818g.m187F0().m33A(this.f36819h, EnumC14291b.CANCEL);
                }
                if (mo9d || this.f36822k) {
                    synchronized (this.f36818g) {
                        this.f36818g.f36756K.remove(Integer.valueOf(this.f36819h));
                    }
                    return -1L;
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m14357d2 = {"vj/c", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14312g extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f36823e;

        /* renamed from: f */
        final /* synthetic */ boolean f36824f;

        /* renamed from: g */
        final /* synthetic */ C14299f f36825g;

        /* renamed from: h */
        final /* synthetic */ int f36826h;

        /* renamed from: i */
        final /* synthetic */ List f36827i;

        /* renamed from: j */
        final /* synthetic */ boolean f36828j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14312g(String str, boolean z, String str2, boolean z2, C14299f c14299f, int i, List list, boolean z3) {
            super(str2, z2);
            this.f36823e = str;
            this.f36824f = z;
            this.f36825g = c14299f;
            this.f36826h = i;
            this.f36827i = list;
            this.f36828j = z3;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            boolean mo10c = this.f36825g.f36768u.mo10c(this.f36826h, this.f36827i, this.f36828j);
            if (mo10c) {
                try {
                    this.f36825g.m187F0().m33A(this.f36826h, EnumC14291b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (mo10c || this.f36828j) {
                synchronized (this.f36825g) {
                    this.f36825g.f36756K.remove(Integer.valueOf(this.f36826h));
                }
                return -1L;
            }
            return -1L;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m14357d2 = {"vj/c", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14313h extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f36829e;

        /* renamed from: f */
        final /* synthetic */ boolean f36830f;

        /* renamed from: g */
        final /* synthetic */ C14299f f36831g;

        /* renamed from: h */
        final /* synthetic */ int f36832h;

        /* renamed from: i */
        final /* synthetic */ List f36833i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14313h(String str, boolean z, String str2, boolean z2, C14299f c14299f, int i, List list) {
            super(str2, z2);
            this.f36829e = str;
            this.f36830f = z;
            this.f36831g = c14299f;
            this.f36832h = i;
            this.f36833i = list;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            if (this.f36831g.f36768u.mo11b(this.f36832h, this.f36833i)) {
                try {
                    this.f36831g.m187F0().m33A(this.f36832h, EnumC14291b.CANCEL);
                    synchronized (this.f36831g) {
                        this.f36831g.f36756K.remove(Integer.valueOf(this.f36832h));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
            return -1L;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m14357d2 = {"vj/c", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14314i extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f36834e;

        /* renamed from: f */
        final /* synthetic */ boolean f36835f;

        /* renamed from: g */
        final /* synthetic */ C14299f f36836g;

        /* renamed from: h */
        final /* synthetic */ int f36837h;

        /* renamed from: i */
        final /* synthetic */ EnumC14291b f36838i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14314i(String str, boolean z, String str2, boolean z2, C14299f c14299f, int i, EnumC14291b enumC14291b) {
            super(str2, z2);
            this.f36834e = str;
            this.f36835f = z;
            this.f36836g = c14299f;
            this.f36837h = i;
            this.f36838i = enumC14291b;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            this.f36836g.f36768u.mo12a(this.f36837h, this.f36838i);
            synchronized (this.f36836g) {
                this.f36836g.f36756K.remove(Integer.valueOf(this.f36837h));
                Unit unit = Unit.f25302a;
            }
            return -1L;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m14357d2 = {"vj/c", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14315j extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f36839e;

        /* renamed from: f */
        final /* synthetic */ boolean f36840f;

        /* renamed from: g */
        final /* synthetic */ C14299f f36841g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14315j(String str, boolean z, String str2, boolean z2, C14299f c14299f) {
            super(str2, z2);
            this.f36839e = str;
            this.f36840f = z;
            this.f36841g = c14299f;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            this.f36841g.m160Y0(false, 2, 0);
            return -1L;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m14357d2 = {"vj/c", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14316k extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f36842e;

        /* renamed from: f */
        final /* synthetic */ boolean f36843f;

        /* renamed from: g */
        final /* synthetic */ C14299f f36844g;

        /* renamed from: h */
        final /* synthetic */ int f36845h;

        /* renamed from: i */
        final /* synthetic */ EnumC14291b f36846i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14316k(String str, boolean z, String str2, boolean z2, C14299f c14299f, int i, EnumC14291b enumC14291b) {
            super(str2, z2);
            this.f36842e = str;
            this.f36843f = z;
            this.f36844g = c14299f;
            this.f36845h = i;
            this.f36846i = enumC14291b;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            try {
                this.f36844g.m159Z0(this.f36845h, this.f36846i);
                return -1L;
            } catch (IOException e) {
                this.f36844g.m161Y(e);
                return -1L;
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, m14357d2 = {"vj/c", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.f$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14317l extends AbstractC13342a {

        /* renamed from: e */
        final /* synthetic */ String f36847e;

        /* renamed from: f */
        final /* synthetic */ boolean f36848f;

        /* renamed from: g */
        final /* synthetic */ C14299f f36849g;

        /* renamed from: h */
        final /* synthetic */ int f36850h;

        /* renamed from: i */
        final /* synthetic */ long f36851i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14317l(String str, boolean z, String str2, boolean z2, C14299f c14299f, int i, long j) {
            super(str2, z2);
            this.f36847e = str;
            this.f36848f = z;
            this.f36849g = c14299f;
            this.f36850h = i;
            this.f36851i = j;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            try {
                this.f36849g.m187F0().m31H(this.f36850h, this.f36851i);
                return -1L;
            } catch (IOException e) {
                this.f36849g.m161Y(e);
                return -1L;
            }
        }
    }

    static {
        C14336m c14336m = new C14336m();
        c14336m.m1h(7, 65535);
        c14336m.m1h(5, 16384);
        f36744L = c14336m;
    }

    public C14299f(C14301b builder) {
        int i;
        C14336m c14336m;
        C9612q.m13917h(builder, "builder");
        boolean m140b = builder.m140b();
        this.f36757j = m140b;
        this.f36758k = builder.m138d();
        this.f36759l = new LinkedHashMap();
        String m139c = builder.m139c();
        this.f36760m = m139c;
        if (builder.m140b()) {
            i = 3;
        } else {
            i = 2;
        }
        this.f36762o = i;
        C13346e m132j = builder.m132j();
        this.f36764q = m132j;
        C13345d m2726i = m132j.m2726i();
        this.f36765r = m2726i;
        this.f36766s = m132j.m2726i();
        this.f36767t = m132j.m2726i();
        this.f36768u = builder.m136f();
        C14336m c14336m2 = new C14336m();
        if (builder.m140b()) {
            c14336m2.m1h(7, 16777216);
        }
        Unit unit = Unit.f25302a;
        this.f36747B = c14336m2;
        this.f36748C = f36744L;
        this.f36752G = c14336m.m6c();
        this.f36753H = builder.m134h();
        this.f36754I = new C14329j(builder.m135g(), m140b);
        this.f36755J = new C14306e(this, new C14320h(builder.m133i(), m140b));
        this.f36756K = new LinkedHashSet();
        if (builder.m137e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m137e());
            String str = m139c + " ping";
            m2726i.m2740i(new C14300a(str, str, this, nanos), nanos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0048 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:48:0x0006, B:67:0x0053, B:69:0x0056, B:70:0x005c, B:72:0x0061, B:77:0x006f, B:78:0x007a, B:49:0x0007, B:51:0x000e, B:52:0x0013, B:54:0x0017, B:56:0x002a, B:58:0x0032, B:63:0x0042, B:65:0x0048, B:66:0x0051, B:79:0x007b, B:80:0x0080), top: B:87:0x0006 }] */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p471zj.C14324i m184H0(int r11, java.util.List<p471zj.C14293c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            zj.j r7 = r10.f36754I
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L84
            int r0 = r10.f36762o     // Catch: java.lang.Throwable -> L81
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            zj.b r0 = p471zj.EnumC14291b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L81
            r10.m169S0(r0)     // Catch: java.lang.Throwable -> L81
        L13:
            boolean r0 = r10.f36763p     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L7b
            int r8 = r10.f36762o     // Catch: java.lang.Throwable -> L81
            int r0 = r8 + 2
            r10.f36762o = r0     // Catch: java.lang.Throwable -> L81
            zj.i r9 = new zj.i     // Catch: java.lang.Throwable -> L81
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L81
            r0 = 1
            if (r13 == 0) goto L41
            long r1 = r10.f36751F     // Catch: java.lang.Throwable -> L81
            long r3 = r10.f36752G     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L41
            long r1 = r9.m55r()     // Catch: java.lang.Throwable -> L81
            long r3 = r9.m56q()     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L3f
            goto L41
        L3f:
            r13 = 0
            goto L42
        L41:
            r13 = r0
        L42:
            boolean r1 = r9.m52u()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L51
            java.util.Map<java.lang.Integer, zj.i> r1 = r10.f36759l     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L81
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L81
        L51:
            kotlin.Unit r1 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 != 0) goto L5c
            zj.j r11 = r10.f36754I     // Catch: java.lang.Throwable -> L84
            r11.m23q(r6, r8, r12)     // Catch: java.lang.Throwable -> L84
            goto L66
        L5c:
            boolean r1 = r10.f36757j     // Catch: java.lang.Throwable -> L84
            r0 = r0 ^ r1
            if (r0 == 0) goto L6f
            zj.j r0 = r10.f36754I     // Catch: java.lang.Throwable -> L84
            r0.m20v(r11, r8, r12)     // Catch: java.lang.Throwable -> L84
        L66:
            monitor-exit(r7)
            if (r13 == 0) goto L6e
            zj.j r11 = r10.f36754I
            r11.flush()
        L6e:
            return r9
        L6f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L84
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L84
            throw r12     // Catch: java.lang.Throwable -> L84
        L7b:
            zj.a r11 = new zj.a     // Catch: java.lang.Throwable -> L81
            r11.<init>()     // Catch: java.lang.Throwable -> L81
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            throw r11     // Catch: java.lang.Throwable -> L84
        L84:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p471zj.C14299f.m184H0(int, java.util.List, boolean):zj.i");
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m166U0(C14299f c14299f, boolean z, C13346e c13346e, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            c13346e = C13346e.f34428h;
        }
        c14299f.m168T0(z, c13346e);
    }

    /* renamed from: Y */
    public final void m161Y(IOException iOException) {
        EnumC14291b enumC14291b = EnumC14291b.PROTOCOL_ERROR;
        m165V(enumC14291b, enumC14291b, iOException);
    }

    /* renamed from: A0 */
    public final C14336m m193A0() {
        return this.f36747B;
    }

    /* renamed from: B0 */
    public final C14336m m192B0() {
        return this.f36748C;
    }

    /* renamed from: C0 */
    public final synchronized C14324i m191C0(int i) {
        return this.f36759l.get(Integer.valueOf(i));
    }

    /* renamed from: D0 */
    public final Map<Integer, C14324i> m189D0() {
        return this.f36759l;
    }

    /* renamed from: E0 */
    public final long m188E0() {
        return this.f36752G;
    }

    /* renamed from: F0 */
    public final C14329j m187F0() {
        return this.f36754I;
    }

    /* renamed from: G0 */
    public final synchronized boolean m186G0(long j) {
        if (this.f36763p) {
            return false;
        }
        if (this.f36772y < this.f36771x) {
            if (j >= this.f36746A) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I0 */
    public final C14324i m182I0(List<C14293c> requestHeaders, boolean z) {
        C9612q.m13917h(requestHeaders, "requestHeaders");
        return m184H0(0, requestHeaders, z);
    }

    /* renamed from: J0 */
    public final void m181J0(int i, BufferedSource source, int i2, boolean z) {
        C9612q.m13917h(source, "source");
        Buffer buffer = new Buffer();
        long j = i2;
        source.mo8594a0(j);
        source.read(buffer, j);
        String str = this.f36760m + '[' + i + "] onData";
        this.f36766s.m2740i(new C14311f(str, true, str, true, this, i, buffer, i2, z), 0L);
    }

    /* renamed from: K0 */
    public final void m180K0(int i, List<C14293c> requestHeaders, boolean z) {
        C9612q.m13917h(requestHeaders, "requestHeaders");
        String str = this.f36760m + '[' + i + "] onHeaders";
        this.f36766s.m2740i(new C14312g(str, true, str, true, this, i, requestHeaders, z), 0L);
    }

    /* renamed from: L0 */
    public final void m179L0(int i, List<C14293c> requestHeaders) {
        C9612q.m13917h(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f36756K.contains(Integer.valueOf(i))) {
                m157a1(i, EnumC14291b.PROTOCOL_ERROR);
                return;
            }
            this.f36756K.add(Integer.valueOf(i));
            String str = this.f36760m + '[' + i + "] onRequest";
            this.f36766s.m2740i(new C14313h(str, true, str, true, this, i, requestHeaders), 0L);
        }
    }

    /* renamed from: M0 */
    public final void m178M0(int i, EnumC14291b errorCode) {
        C9612q.m13917h(errorCode, "errorCode");
        String str = this.f36760m + '[' + i + "] onReset";
        this.f36766s.m2740i(new C14314i(str, true, str, true, this, i, errorCode), 0L);
    }

    /* renamed from: N0 */
    public final boolean m177N0(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: O0 */
    public final synchronized C14324i m176O0(int i) {
        C14324i remove;
        remove = this.f36759l.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: P0 */
    public final void m175P0() {
        synchronized (this) {
            long j = this.f36772y;
            long j2 = this.f36771x;
            if (j < j2) {
                return;
            }
            this.f36771x = j2 + 1;
            this.f36746A = System.nanoTime() + 1000000000;
            Unit unit = Unit.f25302a;
            String str = this.f36760m + " ping";
            this.f36765r.m2740i(new C14315j(str, true, str, true, this), 0L);
        }
    }

    /* renamed from: Q0 */
    public final void m173Q0(int i) {
        this.f36761n = i;
    }

    /* renamed from: R0 */
    public final void m171R0(C14336m c14336m) {
        C9612q.m13917h(c14336m, "<set-?>");
        this.f36748C = c14336m;
    }

    /* renamed from: S0 */
    public final void m169S0(EnumC14291b statusCode) {
        C9612q.m13917h(statusCode, "statusCode");
        synchronized (this.f36754I) {
            synchronized (this) {
                if (this.f36763p) {
                    return;
                }
                this.f36763p = true;
                int i = this.f36761n;
                Unit unit = Unit.f25302a;
                this.f36754I.m24o(i, statusCode, C12562c.f32608a);
            }
        }
    }

    /* renamed from: T0 */
    public final void m168T0(boolean z, C13346e taskRunner) {
        C9612q.m13917h(taskRunner, "taskRunner");
        if (z) {
            this.f36754I.m28h();
            this.f36754I.m32D(this.f36747B);
            int m6c = this.f36747B.m6c();
            if (m6c != 65535) {
                this.f36754I.m31H(0, m6c - 65535);
            }
        }
        C13345d m2726i = taskRunner.m2726i();
        String str = this.f36760m;
        m2726i.m2740i(new C13344c(this.f36755J, str, true, str, true), 0L);
    }

    /* renamed from: V */
    public final void m165V(EnumC14291b connectionCode, EnumC14291b streamCode, IOException iOException) {
        int i;
        C14324i[] c14324iArr;
        C9612q.m13917h(connectionCode, "connectionCode");
        C9612q.m13917h(streamCode, "streamCode");
        if (C12562c.f32615h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        try {
            m169S0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f36759l.isEmpty()) {
                Object[] array = this.f36759l.values().toArray(new C14324i[0]);
                if (array != null) {
                    c14324iArr = (C14324i[]) array;
                    this.f36759l.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                c14324iArr = null;
            }
            Unit unit = Unit.f25302a;
        }
        if (c14324iArr != null) {
            for (C14324i c14324i : c14324iArr) {
                try {
                    c14324i.m69d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f36754I.close();
        } catch (IOException unused3) {
        }
        try {
            this.f36753H.close();
        } catch (IOException unused4) {
        }
        this.f36765r.m2735n();
        this.f36766s.m2735n();
        this.f36767t.m2735n();
    }

    /* renamed from: V0 */
    public final synchronized void m164V0(long j) {
        long j2 = this.f36749D + j;
        this.f36749D = j2;
        long j3 = j2 - this.f36750E;
        if (j3 >= this.f36747B.m6c() / 2) {
            m155b1(0, j3);
            this.f36750E += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0033, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f36754I.m22s());
        r6 = r2;
        r8.f36751F += r6;
        r4 = kotlin.Unit.f25302a;
     */
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m163W0(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            zj.j r12 = r8.f36754I
            r12.m27i(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6c
            monitor-enter(r8)
        L12:
            long r4 = r8.f36751F     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            long r6 = r8.f36752G     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L32
            java.util.Map<java.lang.Integer, zj.i> r2 = r8.f36759l     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
        L32:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L5b
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L5b
            zj.j r4 = r8.f36754I     // Catch: java.lang.Throwable -> L5b
            int r4 = r4.m22s()     // Catch: java.lang.Throwable -> L5b
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L5b
            long r4 = r8.f36751F     // Catch: java.lang.Throwable -> L5b
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L5b
            long r4 = r4 + r6
            r8.f36751F = r4     // Catch: java.lang.Throwable -> L5b
            kotlin.Unit r4 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r8)
            long r12 = r12 - r6
            zj.j r4 = r8.f36754I
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.m27i(r5, r9, r11, r2)
            goto Ld
        L5b:
            r9 = move-exception
            goto L6a
        L5d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5b
            r9.interrupt()     // Catch: java.lang.Throwable -> L5b
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5b
            r9.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L6a:
            monitor-exit(r8)
            throw r9
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p471zj.C14299f.m163W0(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: X0 */
    public final void m162X0(int i, boolean z, List<C14293c> alternating) {
        C9612q.m13917h(alternating, "alternating");
        this.f36754I.m23q(z, i, alternating);
    }

    /* renamed from: Y0 */
    public final void m160Y0(boolean z, int i, int i2) {
        try {
            this.f36754I.m21t(z, i, i2);
        } catch (IOException e) {
            m161Y(e);
        }
    }

    /* renamed from: Z0 */
    public final void m159Z0(int i, EnumC14291b statusCode) {
        C9612q.m13917h(statusCode, "statusCode");
        this.f36754I.m33A(i, statusCode);
    }

    /* renamed from: a1 */
    public final void m157a1(int i, EnumC14291b errorCode) {
        C9612q.m13917h(errorCode, "errorCode");
        String str = this.f36760m + '[' + i + "] writeSynReset";
        this.f36765r.m2740i(new C14316k(str, true, str, true, this, i, errorCode), 0L);
    }

    /* renamed from: b0 */
    public final boolean m156b0() {
        return this.f36757j;
    }

    /* renamed from: b1 */
    public final void m155b1(int i, long j) {
        String str = this.f36760m + '[' + i + "] windowUpdate";
        this.f36765r.m2740i(new C14317l(str, true, str, true, this, i, j), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m165V(EnumC14291b.NO_ERROR, EnumC14291b.CANCEL, null);
    }

    /* renamed from: e0 */
    public final String m154e0() {
        return this.f36760m;
    }

    public final void flush() {
        this.f36754I.flush();
    }

    /* renamed from: j0 */
    public final int m150j0() {
        return this.f36761n;
    }

    /* renamed from: t0 */
    public final AbstractC14303d m144t0() {
        return this.f36758k;
    }

    /* renamed from: w0 */
    public final int m142w0() {
        return this.f36762o;
    }
}
