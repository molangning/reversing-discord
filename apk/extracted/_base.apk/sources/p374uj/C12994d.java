package p374uj;

import com.discord.nearby.NearbyManager;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import kotlin.text.Regex;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import p015ak.InterfaceC0214a;
import p031bk.C2370k;
import p122gk.AbstractC6833g;
import p122gk.C6840m;
import p390vj.AbstractC13342a;
import p390vj.C13345d;
import p390vj.C13346e;
import p467zf.C14180c;
import pf.C11568i;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t*\u0001Z\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0004qrstB9\b\u0000\u0012\u0006\u0010b\u001a\u00020^\u0012\u0006\u0010f\u001a\u00020/\u0012\u0006\u0010h\u001a\u00020B\u0012\u0006\u0010k\u001a\u00020B\u0012\u0006\u0010.\u001a\u00020\u0016\u0012\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J \u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J#\u0010\u001c\u001a\u00020\u00032\n\u0010\u001a\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010!\u001a\u00020\u000b2\n\u0010 \u001a\u00060\u001fR\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u0006\u0010%\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\u0003R*\u0010.\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00106\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00108\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010)R\u0018\u0010;\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R*\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u001fR\u00020\u00000<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u0015R\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010J\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010FR\"\u0010P\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010FR\u0016\u0010S\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010FR\u0016\u0010U\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010)R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010b\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010f\u001a\u00020/8\u0006¢\u0006\f\n\u0004\bc\u00101\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0015R\u001a\u0010k\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\bi\u0010j¨\u0006u"}, m14357d2 = {"Luj/d;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "", "j0", "Lokio/BufferedSink;", "b0", "", "line", "t0", "e0", "", "Y", "t", "C0", "key", "E0", "V", "w0", "()V", "Luj/d$d;", "I", "", "expectedSequenceNumber", "Luj/d$b;", "D", "editor", "success", "v", "(Luj/d$b;Z)V", "A0", "Luj/d$c;", "entry", "B0", "(Luj/d$c;)Z", "flush", "close", "D0", "A", "value", "j", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "maxSize", "Ljava/io/File;", "k", "Ljava/io/File;", "journalFile", "l", "journalFileTmp", "m", "journalFileBackup", "n", "size", "o", "Lokio/BufferedSink;", "journalWriter", "Ljava/util/LinkedHashMap;", "p", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "", "q", "redundantOpCount", "r", "Z", "hasJournalErrors", "s", "civilizedFileSystem", "initialized", "u", "Q", "()Z", "setClosed$okhttp", "(Z)V", "closed", "mostRecentTrimFailed", "w", "mostRecentRebuildFailed", "x", "nextSequenceNumber", "Lvj/d;", "y", "Lvj/d;", "cleanupQueue", "uj/d$e", "z", "Luj/d$e;", "cleanupTask", "Lak/a;", "Lak/a;", "S", "()Lak/a;", "fileSystem", "B", "R", "()Ljava/io/File;", "directory", "C", "appVersion", "U", "()I", "valueCount", "Lvj/e;", "taskRunner", "<init>", "(Lak/a;Ljava/io/File;IIJLvj/e;)V", "P", "a", "b", "c", "d", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: uj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12994d implements Closeable, Flushable {

    /* renamed from: A */
    private final InterfaceC0214a f33784A;

    /* renamed from: B */
    private final File f33785B;

    /* renamed from: C */
    private final int f33786C;

    /* renamed from: D */
    private final int f33787D;

    /* renamed from: j */
    private long f33788j;

    /* renamed from: k */
    private final File f33789k;

    /* renamed from: l */
    private final File f33790l;

    /* renamed from: m */
    private final File f33791m;

    /* renamed from: n */
    private long f33792n;

    /* renamed from: o */
    private BufferedSink f33793o;

    /* renamed from: p */
    private final LinkedHashMap<String, C12998c> f33794p;

    /* renamed from: q */
    private int f33795q;

    /* renamed from: r */
    private boolean f33796r;

    /* renamed from: s */
    private boolean f33797s;

    /* renamed from: t */
    private boolean f33798t;

    /* renamed from: u */
    private boolean f33799u;

    /* renamed from: v */
    private boolean f33800v;

    /* renamed from: w */
    private boolean f33801w;

    /* renamed from: x */
    private long f33802x;

    /* renamed from: y */
    private final C13345d f33803y;

    /* renamed from: z */
    private final C13001e f33804z;

    /* renamed from: P */
    public static final C12995a f33783P = new C12995a(null);

    /* renamed from: E */
    public static final String f33772E = "journal";

    /* renamed from: F */
    public static final String f33773F = "journal.tmp";

    /* renamed from: G */
    public static final String f33774G = "journal.bkp";

    /* renamed from: H */
    public static final String f33775H = "libcore.io.DiskLruCache";

    /* renamed from: I */
    public static final String f33776I = NearbyManager.PERMISSION_DENIED;

    /* renamed from: J */
    public static final long f33777J = -1;

    /* renamed from: K */
    public static final Regex f33778K = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: L */
    public static final String f33779L = "CLEAN";

    /* renamed from: M */
    public static final String f33780M = "DIRTY";

    /* renamed from: N */
    public static final String f33781N = "REMOVE";

    /* renamed from: O */
    public static final String f33782O = "READ";

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, m14357d2 = {"Luj/d$a;", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: uj.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12995a {
        private C12995a() {
        }

        public /* synthetic */ C12995a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0018\u001a\u00060\u0013R\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001e\u0010\u0018\u001a\u00060\u0013R\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m14357d2 = {"Luj/d$b;", "", "", "c", "()V", "", "index", "Lokio/Sink;", "f", "b", "a", "", "[Z", "e", "()[Z", "written", "", "Z", "done", "Luj/d$c;", "Luj/d;", "Luj/d$c;", "d", "()Luj/d$c;", "entry", "<init>", "(Luj/d;Luj/d$c;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: uj.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C12996b {

        /* renamed from: a */
        private final boolean[] f33805a;

        /* renamed from: b */
        private boolean f33806b;

        /* renamed from: c */
        private final C12998c f33807c;

        /* renamed from: d */
        final /* synthetic */ C12994d f33808d;

        @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m14357d2 = {"Ljava/io/IOException;", "it", "", "a", "(Ljava/io/IOException;)V", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1"}, m14356k = 3, m14355mv = {1, 4, 0})
        /* renamed from: uj.d$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C12997a extends AbstractC9614s implements Function1<IOException, Unit> {

            /* renamed from: k */
            final /* synthetic */ int f33810k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12997a(int i) {
                super(1);
                C12996b.this = r1;
                this.f33810k = i;
            }

            /* renamed from: a */
            public final void m3460a(IOException it) {
                C9612q.m13917h(it, "it");
                synchronized (C12996b.this.f33808d) {
                    C12996b.this.m3464c();
                    Unit unit = Unit.f25302a;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
                m3460a(iOException);
                return Unit.f25302a;
            }
        }

        public C12996b(C12994d c12994d, C12998c entry) {
            boolean[] zArr;
            C9612q.m13917h(entry, "entry");
            this.f33808d = c12994d;
            this.f33807c = entry;
            if (entry.m3453g()) {
                zArr = null;
            } else {
                zArr = new boolean[c12994d.m3484U()];
            }
            this.f33805a = zArr;
        }

        /* renamed from: a */
        public final void m3466a() {
            synchronized (this.f33808d) {
                if (!this.f33806b) {
                    if (C9612q.m13922c(this.f33807c.m3458b(), this)) {
                        this.f33808d.m3468v(this, false);
                    }
                    this.f33806b = true;
                    Unit unit = Unit.f25302a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: b */
        public final void m3465b() {
            synchronized (this.f33808d) {
                if (!this.f33806b) {
                    if (C9612q.m13922c(this.f33807c.m3458b(), this)) {
                        this.f33808d.m3468v(this, true);
                    }
                    this.f33806b = true;
                    Unit unit = Unit.f25302a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        /* renamed from: c */
        public final void m3464c() {
            if (C9612q.m13922c(this.f33807c.m3458b(), this)) {
                if (this.f33808d.f33797s) {
                    this.f33808d.m3468v(this, false);
                } else {
                    this.f33807c.m3443q(true);
                }
            }
        }

        /* renamed from: d */
        public final C12998c m3463d() {
            return this.f33807c;
        }

        /* renamed from: e */
        public final boolean[] m3462e() {
            return this.f33805a;
        }

        /* renamed from: f */
        public final Sink m3461f(int i) {
            synchronized (this.f33808d) {
                if (!this.f33806b) {
                    if (!C9612q.m13922c(this.f33807c.m3458b(), this)) {
                        return C6840m.m21831b();
                    }
                    if (!this.f33807c.m3453g()) {
                        boolean[] zArr = this.f33805a;
                        C9612q.m13920e(zArr);
                        zArr[i] = true;
                    }
                    try {
                        return new C13003e(this.f33808d.m3485S().mo40909f(this.f33807c.m3457c().get(i)), new C12997a(i));
                    } catch (FileNotFoundException unused) {
                        return C6840m.m21831b();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010D\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0018\u00010\u0012R\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010 R\"\u0010+\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010.\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R(\u00105\u001a\b\u0018\u00010/R\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b\u001e\u00102\"\u0004\b3\u00104R\"\u0010:\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u00106\u001a\u0004\b0\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\u001a\u0010D\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010B\u001a\u0004\b%\u0010C¨\u0006G"}, m14357d2 = {"Luj/d$c;", "", "", "", "strings", "", "j", "", "index", "Lokio/Source;", "k", "", "m", "(Ljava/util/List;)V", "Lokio/BufferedSink;", "writer", "s", "(Lokio/BufferedSink;)V", "Luj/d$d;", "Luj/d;", "r", "()Luj/d$d;", "", "a", "[J", "e", "()[J", "lengths", "", "Ljava/io/File;", "b", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "c", "dirtyFiles", "", "d", "Z", "g", "()Z", "o", "(Z)V", "readable", "i", "q", "zombie", "Luj/d$b;", "f", "Luj/d$b;", "()Luj/d$b;", "l", "(Luj/d$b;)V", "currentEditor", "I", "()I", "n", "(I)V", "lockingSourceCount", "", "h", "J", "()J", "p", "(J)V", "sequenceNumber", "Ljava/lang/String;", "()Ljava/lang/String;", "key", "<init>", "(Luj/d;Ljava/lang/String;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: uj.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C12998c {

        /* renamed from: a */
        private final long[] f33811a;

        /* renamed from: b */
        private final List<File> f33812b;

        /* renamed from: c */
        private final List<File> f33813c;

        /* renamed from: d */
        private boolean f33814d;

        /* renamed from: e */
        private boolean f33815e;

        /* renamed from: f */
        private C12996b f33816f;

        /* renamed from: g */
        private int f33817g;

        /* renamed from: h */
        private long f33818h;

        /* renamed from: i */
        private final String f33819i;

        /* renamed from: j */
        final /* synthetic */ C12994d f33820j;

        @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m14357d2 = {"uj/d$c$a", "Lgk/g;", "", "close", "", "j", "Z", "closed", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: uj.d$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C12999a extends AbstractC6833g {

            /* renamed from: j */
            private boolean f33821j;

            /* renamed from: l */
            final /* synthetic */ Source f33823l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12999a(Source source, Source source2) {
                super(source2);
                C12998c.this = r1;
                this.f33823l = source;
            }

            @Override // p122gk.AbstractC6833g, okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (!this.f33821j) {
                    this.f33821j = true;
                    synchronized (C12998c.this.f33820j) {
                        C12998c c12998c = C12998c.this;
                        c12998c.m3446n(c12998c.m3454f() - 1);
                        if (C12998c.this.m3454f() == 0 && C12998c.this.m3451i()) {
                            C12998c c12998c2 = C12998c.this;
                            c12998c2.f33820j.m3494B0(c12998c2);
                        }
                        Unit unit = Unit.f25302a;
                    }
                }
            }
        }

        public C12998c(C12994d c12994d, String key) {
            C9612q.m13917h(key, "key");
            this.f33820j = c12994d;
            this.f33819i = key;
            this.f33811a = new long[c12994d.m3484U()];
            this.f33812b = new ArrayList();
            this.f33813c = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int m3484U = c12994d.m3484U();
            for (int i = 0; i < m3484U; i++) {
                sb2.append(i);
                this.f33812b.add(new File(c12994d.m3486R(), sb2.toString()));
                sb2.append(".tmp");
                this.f33813c.add(new File(c12994d.m3486R(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* renamed from: j */
        private final Void m3450j(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        /* renamed from: k */
        private final Source m3449k(int i) {
            Source mo40910e = this.f33820j.m3485S().mo40910e(this.f33812b.get(i));
            if (this.f33820j.f33797s) {
                return mo40910e;
            }
            this.f33817g++;
            return new C12999a(mo40910e, mo40910e);
        }

        /* renamed from: a */
        public final List<File> m3459a() {
            return this.f33812b;
        }

        /* renamed from: b */
        public final C12996b m3458b() {
            return this.f33816f;
        }

        /* renamed from: c */
        public final List<File> m3457c() {
            return this.f33813c;
        }

        /* renamed from: d */
        public final String m3456d() {
            return this.f33819i;
        }

        /* renamed from: e */
        public final long[] m3455e() {
            return this.f33811a;
        }

        /* renamed from: f */
        public final int m3454f() {
            return this.f33817g;
        }

        /* renamed from: g */
        public final boolean m3453g() {
            return this.f33814d;
        }

        /* renamed from: h */
        public final long m3452h() {
            return this.f33818h;
        }

        /* renamed from: i */
        public final boolean m3451i() {
            return this.f33815e;
        }

        /* renamed from: l */
        public final void m3448l(C12996b c12996b) {
            this.f33816f = c12996b;
        }

        /* renamed from: m */
        public final void m3447m(List<String> strings) {
            C9612q.m13917h(strings, "strings");
            if (strings.size() == this.f33820j.m3484U()) {
                try {
                    int size = strings.size();
                    for (int i = 0; i < size; i++) {
                        this.f33811a[i] = Long.parseLong(strings.get(i));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    m3450j(strings);
                    throw new C11568i();
                }
            }
            m3450j(strings);
            throw new C11568i();
        }

        /* renamed from: n */
        public final void m3446n(int i) {
            this.f33817g = i;
        }

        /* renamed from: o */
        public final void m3445o(boolean z) {
            this.f33814d = z;
        }

        /* renamed from: p */
        public final void m3444p(long j) {
            this.f33818h = j;
        }

        /* renamed from: q */
        public final void m3443q(boolean z) {
            this.f33815e = z;
        }

        /* renamed from: r */
        public final C13000d m3442r() {
            C12994d c12994d = this.f33820j;
            if (C12562c.f32615h && !Thread.holdsLock(c12994d)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9612q.m13918g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST hold lock on ");
                sb2.append(c12994d);
                throw new AssertionError(sb2.toString());
            } else if (!this.f33814d) {
                return null;
            } else {
                if (!this.f33820j.f33797s && (this.f33816f != null || this.f33815e)) {
                    return null;
                }
                ArrayList<Source> arrayList = new ArrayList();
                long[] jArr = (long[]) this.f33811a.clone();
                try {
                    int m3484U = this.f33820j.m3484U();
                    for (int i = 0; i < m3484U; i++) {
                        arrayList.add(m3449k(i));
                    }
                    return new C13000d(this.f33820j, this.f33819i, this.f33818h, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (Source source : arrayList) {
                        C12562c.m4801j(source);
                    }
                    try {
                        this.f33820j.m3494B0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        /* renamed from: s */
        public final void m3441s(BufferedSink writer) {
            C9612q.m13917h(writer, "writer");
            for (long j : this.f33811a) {
                writer.writeByte(32).mo8605c0(j);
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0004\u001a\b\u0018\u00010\u0002R\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m14357d2 = {"Luj/d$d;", "Ljava/io/Closeable;", "Luj/d$b;", "Luj/d;", "a", "", "index", "Lokio/Source;", "h", "", "close", "", "j", "Ljava/lang/String;", "key", "", "k", "J", "sequenceNumber", "", "l", "Ljava/util/List;", "sources", "", "m", "[J", "lengths", "<init>", "(Luj/d;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: uj.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C13000d implements Closeable {

        /* renamed from: j */
        private final String f33824j;

        /* renamed from: k */
        private final long f33825k;

        /* renamed from: l */
        private final List<Source> f33826l;

        /* renamed from: m */
        private final long[] f33827m;

        /* renamed from: n */
        final /* synthetic */ C12994d f33828n;

        /* JADX WARN: Multi-variable type inference failed */
        public C13000d(C12994d c12994d, String key, long j, List<? extends Source> sources, long[] lengths) {
            C9612q.m13917h(key, "key");
            C9612q.m13917h(sources, "sources");
            C9612q.m13917h(lengths, "lengths");
            this.f33828n = c12994d;
            this.f33824j = key;
            this.f33825k = j;
            this.f33826l = sources;
            this.f33827m = lengths;
        }

        /* renamed from: a */
        public final C12996b m3440a() {
            return this.f33828n.m3492D(this.f33824j, this.f33825k);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Source source : this.f33826l) {
                C12562c.m4801j(source);
            }
        }

        /* renamed from: h */
        public final Source m3439h(int i) {
            return this.f33826l.get(i);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"uj/d$e", "Lvj/a;", "", "f", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: uj.d$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13001e extends AbstractC13342a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13001e(String str) {
            super(str, false, 2, null);
            C12994d.this = r3;
        }

        @Override // p390vj.AbstractC13342a
        /* renamed from: f */
        public long mo123f() {
            synchronized (C12994d.this) {
                if (!C12994d.this.f33798t || C12994d.this.m3487Q()) {
                    return -1L;
                }
                try {
                    C12994d.this.m3491D0();
                } catch (IOException unused) {
                    C12994d.this.f33800v = true;
                }
                try {
                    if (C12994d.this.m3482Y()) {
                        C12994d.this.m3467w0();
                        C12994d.this.f33795q = 0;
                    }
                } catch (IOException unused2) {
                    C12994d.this.f33801w = true;
                    C12994d.this.f33793o = C6840m.m21830c(C6840m.m21831b());
                }
                return -1L;
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Ljava/io/IOException;", "it", "", "a", "(Ljava/io/IOException;)V"}, m14356k = 3, m14355mv = {1, 4, 0})
    /* renamed from: uj.d$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13002f extends AbstractC9614s implements Function1<IOException, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13002f() {
            super(1);
            C12994d.this = r1;
        }

        /* renamed from: a */
        public final void m3438a(IOException it) {
            C9612q.m13917h(it, "it");
            C12994d c12994d = C12994d.this;
            if (C12562c.f32615h && !Thread.holdsLock(c12994d)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C9612q.m13918g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST hold lock on ");
                sb2.append(c12994d);
                throw new AssertionError(sb2.toString());
            }
            C12994d.this.f33796r = true;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
            m3438a(iOException);
            return Unit.f25302a;
        }
    }

    public C12994d(InterfaceC0214a fileSystem, File directory, int i, int i2, long j, C13346e taskRunner) {
        boolean z;
        C9612q.m13917h(fileSystem, "fileSystem");
        C9612q.m13917h(directory, "directory");
        C9612q.m13917h(taskRunner, "taskRunner");
        this.f33784A = fileSystem;
        this.f33785B = directory;
        this.f33786C = i;
        this.f33787D = i2;
        this.f33788j = j;
        this.f33794p = new LinkedHashMap<>(0, 0.75f, true);
        this.f33803y = taskRunner.m2726i();
        this.f33804z = new C13001e(C12562c.f32616i + " Cache");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 > 0) {
                this.f33789k = new File(directory, f33772E);
                this.f33790l = new File(directory, f33773F);
                this.f33791m = new File(directory, f33774G);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* renamed from: C0 */
    private final boolean m3493C0() {
        for (C12998c toEvict : this.f33794p.values()) {
            if (!toEvict.m3451i()) {
                C9612q.m13918g(toEvict, "toEvict");
                m3494B0(toEvict);
                return true;
            }
        }
        return false;
    }

    /* renamed from: E0 */
    private final void m3490E0(String str) {
        if (f33778K.m13868g(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* renamed from: H */
    public static /* synthetic */ C12996b m3489H(C12994d c12994d, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = f33777J;
        }
        return c12994d.m3492D(str, j);
    }

    /* renamed from: Y */
    public final boolean m3482Y() {
        int i = this.f33795q;
        return i >= 2000 && i >= this.f33794p.size();
    }

    /* renamed from: b0 */
    private final BufferedSink m3480b0() {
        return C6840m.m21830c(new C13003e(this.f33784A.mo40912c(this.f33789k), new C13002f()));
    }

    /* renamed from: e0 */
    private final void m3479e0() {
        this.f33784A.mo40907h(this.f33790l);
        Iterator<C12998c> it = this.f33794p.values().iterator();
        while (it.hasNext()) {
            C12998c next = it.next();
            C9612q.m13918g(next, "i.next()");
            C12998c c12998c = next;
            int i = 0;
            if (c12998c.m3458b() == null) {
                int i2 = this.f33787D;
                while (i < i2) {
                    this.f33792n += c12998c.m3455e()[i];
                    i++;
                }
            } else {
                c12998c.m3448l(null);
                int i3 = this.f33787D;
                while (i < i3) {
                    this.f33784A.mo40907h(c12998c.m3459a().get(i));
                    this.f33784A.mo40907h(c12998c.m3457c().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: j0 */
    private final void m3475j0() {
        BufferedSource m21829d = C6840m.m21829d(this.f33784A.mo40910e(this.f33789k));
        try {
            String mo8596T = m21829d.mo8596T();
            String mo8596T2 = m21829d.mo8596T();
            String mo8596T3 = m21829d.mo8596T();
            String mo8596T4 = m21829d.mo8596T();
            String mo8596T5 = m21829d.mo8596T();
            boolean z = true;
            if (!(!C9612q.m13922c(f33775H, mo8596T)) && !(!C9612q.m13922c(f33776I, mo8596T2)) && !(!C9612q.m13922c(String.valueOf(this.f33786C), mo8596T3)) && !(!C9612q.m13922c(String.valueOf(this.f33787D), mo8596T4))) {
                int i = 0;
                if (mo8596T5.length() <= 0) {
                    z = false;
                }
                if (!z) {
                    while (true) {
                        try {
                            m3469t0(m21829d.mo8596T());
                            i++;
                        } catch (EOFException unused) {
                            this.f33795q = i - this.f33794p.size();
                            if (!m21829d.mo8589g0()) {
                                m3467w0();
                            } else {
                                this.f33793o = m3480b0();
                            }
                            Unit unit = Unit.f25302a;
                            C14180c.m514a(m21829d, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + mo8596T + ", " + mo8596T2 + ", " + mo8596T4 + ", " + mo8596T5 + ']');
        } finally {
        }
    }

    /* renamed from: t */
    private final synchronized void m3470t() {
        if (!(!this.f33799u)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* renamed from: t0 */
    private final void m3469t0(String str) {
        int m13709Y;
        int m13709Y2;
        String substring;
        boolean m13758H;
        boolean m13758H2;
        boolean m13758H3;
        List<String> m13683y0;
        boolean m13758H4;
        m13709Y = C9654p.m13709Y(str, ' ', 0, false, 6, null);
        if (m13709Y != -1) {
            int i = m13709Y + 1;
            m13709Y2 = C9654p.m13709Y(str, ' ', i, false, 4, null);
            if (m13709Y2 == -1) {
                if (str != null) {
                    substring = str.substring(i);
                    C9612q.m13918g(substring, "(this as java.lang.String).substring(startIndex)");
                    String str2 = f33781N;
                    if (m13709Y == str2.length()) {
                        m13758H4 = C9653o.m13758H(str, str2, false, 2, null);
                        if (m13758H4) {
                            this.f33794p.remove(substring);
                            return;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else if (str != null) {
                substring = str.substring(i, m13709Y2);
                C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            C12998c c12998c = this.f33794p.get(substring);
            if (c12998c == null) {
                c12998c = new C12998c(this, substring);
                this.f33794p.put(substring, c12998c);
            }
            if (m13709Y2 != -1) {
                String str3 = f33779L;
                if (m13709Y == str3.length()) {
                    m13758H3 = C9653o.m13758H(str, str3, false, 2, null);
                    if (m13758H3) {
                        int i2 = m13709Y2 + 1;
                        if (str != null) {
                            String substring2 = str.substring(i2);
                            C9612q.m13918g(substring2, "(this as java.lang.String).substring(startIndex)");
                            m13683y0 = C9654p.m13683y0(substring2, new char[]{' '}, false, 0, 6, null);
                            c12998c.m3445o(true);
                            c12998c.m3448l(null);
                            c12998c.m3447m(m13683y0);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            if (m13709Y2 == -1) {
                String str4 = f33780M;
                if (m13709Y == str4.length()) {
                    m13758H2 = C9653o.m13758H(str, str4, false, 2, null);
                    if (m13758H2) {
                        c12998c.m3448l(new C12996b(this, c12998c));
                        return;
                    }
                }
            }
            if (m13709Y2 == -1) {
                String str5 = f33782O;
                if (m13709Y == str5.length()) {
                    m13758H = C9653o.m13758H(str, str5, false, 2, null);
                    if (m13758H) {
                        return;
                    }
                }
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: A */
    public final void m3496A() {
        close();
        this.f33784A.mo40914a(this.f33785B);
    }

    /* renamed from: A0 */
    public final synchronized boolean m3495A0(String key) {
        C9612q.m13917h(key, "key");
        m3483V();
        m3470t();
        m3490E0(key);
        C12998c c12998c = this.f33794p.get(key);
        if (c12998c == null) {
            return false;
        }
        C9612q.m13918g(c12998c, "lruEntries[key] ?: return false");
        boolean m3494B0 = m3494B0(c12998c);
        if (m3494B0 && this.f33792n <= this.f33788j) {
            this.f33800v = false;
        }
        return m3494B0;
    }

    /* renamed from: B0 */
    public final boolean m3494B0(C12998c entry) {
        BufferedSink bufferedSink;
        C9612q.m13917h(entry, "entry");
        if (!this.f33797s) {
            if (entry.m3454f() > 0 && (bufferedSink = this.f33793o) != null) {
                bufferedSink.mo8608K(f33780M);
                bufferedSink.writeByte(32);
                bufferedSink.mo8608K(entry.m3456d());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.m3454f() > 0 || entry.m3458b() != null) {
                entry.m3443q(true);
                return true;
            }
        }
        C12996b m3458b = entry.m3458b();
        if (m3458b != null) {
            m3458b.m3464c();
        }
        int i = this.f33787D;
        for (int i2 = 0; i2 < i; i2++) {
            this.f33784A.mo40907h(entry.m3459a().get(i2));
            this.f33792n -= entry.m3455e()[i2];
            entry.m3455e()[i2] = 0;
        }
        this.f33795q++;
        BufferedSink bufferedSink2 = this.f33793o;
        if (bufferedSink2 != null) {
            bufferedSink2.mo8608K(f33781N);
            bufferedSink2.writeByte(32);
            bufferedSink2.mo8608K(entry.m3456d());
            bufferedSink2.writeByte(10);
        }
        this.f33794p.remove(entry.m3456d());
        if (m3482Y()) {
            C13345d.m2739j(this.f33803y, this.f33804z, 0L, 2, null);
        }
        return true;
    }

    /* renamed from: D */
    public final synchronized C12996b m3492D(String key, long j) {
        C12996b c12996b;
        C9612q.m13917h(key, "key");
        m3483V();
        m3470t();
        m3490E0(key);
        C12998c c12998c = this.f33794p.get(key);
        if (j != f33777J && (c12998c == null || c12998c.m3452h() != j)) {
            return null;
        }
        if (c12998c != null) {
            c12996b = c12998c.m3458b();
        } else {
            c12996b = null;
        }
        if (c12996b != null) {
            return null;
        }
        if (c12998c != null && c12998c.m3454f() != 0) {
            return null;
        }
        if (!this.f33800v && !this.f33801w) {
            BufferedSink bufferedSink = this.f33793o;
            C9612q.m13920e(bufferedSink);
            bufferedSink.mo8608K(f33780M).writeByte(32).mo8608K(key).writeByte(10);
            bufferedSink.flush();
            if (this.f33796r) {
                return null;
            }
            if (c12998c == null) {
                c12998c = new C12998c(this, key);
                this.f33794p.put(key, c12998c);
            }
            C12996b c12996b2 = new C12996b(this, c12998c);
            c12998c.m3448l(c12996b2);
            return c12996b2;
        }
        C13345d.m2739j(this.f33803y, this.f33804z, 0L, 2, null);
        return null;
    }

    /* renamed from: D0 */
    public final void m3491D0() {
        while (this.f33792n > this.f33788j) {
            if (!m3493C0()) {
                return;
            }
        }
        this.f33800v = false;
    }

    /* renamed from: I */
    public final synchronized C13000d m3488I(String key) {
        C9612q.m13917h(key, "key");
        m3483V();
        m3470t();
        m3490E0(key);
        C12998c c12998c = this.f33794p.get(key);
        if (c12998c == null) {
            return null;
        }
        C9612q.m13918g(c12998c, "lruEntries[key] ?: return null");
        C13000d m3442r = c12998c.m3442r();
        if (m3442r == null) {
            return null;
        }
        this.f33795q++;
        BufferedSink bufferedSink = this.f33793o;
        C9612q.m13920e(bufferedSink);
        bufferedSink.mo8608K(f33782O).writeByte(32).mo8608K(key).writeByte(10);
        if (m3482Y()) {
            C13345d.m2739j(this.f33803y, this.f33804z, 0L, 2, null);
        }
        return m3442r;
    }

    /* renamed from: Q */
    public final boolean m3487Q() {
        return this.f33799u;
    }

    /* renamed from: R */
    public final File m3486R() {
        return this.f33785B;
    }

    /* renamed from: S */
    public final InterfaceC0214a m3485S() {
        return this.f33784A;
    }

    /* renamed from: U */
    public final int m3484U() {
        return this.f33787D;
    }

    /* renamed from: V */
    public final synchronized void m3483V() {
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
        if (this.f33798t) {
            return;
        }
        if (this.f33784A.mo40913b(this.f33791m)) {
            if (this.f33784A.mo40913b(this.f33789k)) {
                this.f33784A.mo40907h(this.f33791m);
            } else {
                this.f33784A.mo40908g(this.f33791m, this.f33789k);
            }
        }
        this.f33797s = C12562c.m4833C(this.f33784A, this.f33791m);
        if (this.f33784A.mo40913b(this.f33789k)) {
            try {
                m3475j0();
                m3479e0();
                this.f33798t = true;
                return;
            } catch (IOException e) {
                C2370k m33588g = C2370k.f6491c.m33588g();
                m33588g.m33600k("DiskLruCache " + this.f33785B + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                m3496A();
                this.f33799u = false;
            }
        }
        m3467w0();
        this.f33798t = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        C12998c[] c12998cArr;
        C12996b m3458b;
        if (this.f33798t && !this.f33799u) {
            Collection<C12998c> values = this.f33794p.values();
            C9612q.m13918g(values, "lruEntries.values");
            Object[] array = values.toArray(new C12998c[0]);
            if (array != null) {
                for (C12998c c12998c : (C12998c[]) array) {
                    if (c12998c.m3458b() != null && (m3458b = c12998c.m3458b()) != null) {
                        m3458b.m3464c();
                    }
                }
                m3491D0();
                BufferedSink bufferedSink = this.f33793o;
                C9612q.m13920e(bufferedSink);
                bufferedSink.close();
                this.f33793o = null;
                this.f33799u = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f33799u = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (!this.f33798t) {
            return;
        }
        m3470t();
        m3491D0();
        BufferedSink bufferedSink = this.f33793o;
        C9612q.m13920e(bufferedSink);
        bufferedSink.flush();
    }

    /* renamed from: v */
    public final synchronized void m3468v(C12996b editor, boolean z) {
        C9612q.m13917h(editor, "editor");
        C12998c m3463d = editor.m3463d();
        if (C9612q.m13922c(m3463d.m3458b(), editor)) {
            if (z && !m3463d.m3453g()) {
                int i = this.f33787D;
                for (int i2 = 0; i2 < i; i2++) {
                    boolean[] m3462e = editor.m3462e();
                    C9612q.m13920e(m3462e);
                    if (m3462e[i2]) {
                        if (!this.f33784A.mo40913b(m3463d.m3457c().get(i2))) {
                            editor.m3466a();
                            return;
                        }
                    } else {
                        editor.m3466a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            int i3 = this.f33787D;
            for (int i4 = 0; i4 < i3; i4++) {
                File file = m3463d.m3457c().get(i4);
                if (z && !m3463d.m3451i()) {
                    if (this.f33784A.mo40913b(file)) {
                        File file2 = m3463d.m3459a().get(i4);
                        this.f33784A.mo40908g(file, file2);
                        long j = m3463d.m3455e()[i4];
                        long mo40911d = this.f33784A.mo40911d(file2);
                        m3463d.m3455e()[i4] = mo40911d;
                        this.f33792n = (this.f33792n - j) + mo40911d;
                    }
                } else {
                    this.f33784A.mo40907h(file);
                }
            }
            m3463d.m3448l(null);
            if (m3463d.m3451i()) {
                m3494B0(m3463d);
                return;
            }
            this.f33795q++;
            BufferedSink bufferedSink = this.f33793o;
            C9612q.m13920e(bufferedSink);
            if (!m3463d.m3453g() && !z) {
                this.f33794p.remove(m3463d.m3456d());
                bufferedSink.mo8608K(f33781N).writeByte(32);
                bufferedSink.mo8608K(m3463d.m3456d());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f33792n <= this.f33788j || m3482Y()) {
                    C13345d.m2739j(this.f33803y, this.f33804z, 0L, 2, null);
                }
                return;
            }
            m3463d.m3445o(true);
            bufferedSink.mo8608K(f33779L).writeByte(32);
            bufferedSink.mo8608K(m3463d.m3456d());
            m3463d.m3441s(bufferedSink);
            bufferedSink.writeByte(10);
            if (z) {
                long j2 = this.f33802x;
                this.f33802x = 1 + j2;
                m3463d.m3444p(j2);
            }
            bufferedSink.flush();
            if (this.f33792n <= this.f33788j) {
            }
            C13345d.m2739j(this.f33803y, this.f33804z, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: w0 */
    public final synchronized void m3467w0() {
        BufferedSink bufferedSink = this.f33793o;
        if (bufferedSink != null) {
            bufferedSink.close();
        }
        BufferedSink m21830c = C6840m.m21830c(this.f33784A.mo40909f(this.f33790l));
        m21830c.mo8608K(f33775H).writeByte(10);
        m21830c.mo8608K(f33776I).writeByte(10);
        m21830c.mo8605c0(this.f33786C).writeByte(10);
        m21830c.mo8605c0(this.f33787D).writeByte(10);
        m21830c.writeByte(10);
        for (C12998c c12998c : this.f33794p.values()) {
            if (c12998c.m3458b() != null) {
                m21830c.mo8608K(f33780M).writeByte(32);
                m21830c.mo8608K(c12998c.m3456d());
                m21830c.writeByte(10);
            } else {
                m21830c.mo8608K(f33779L).writeByte(32);
                m21830c.mo8608K(c12998c.m3456d());
                c12998c.m3441s(m21830c);
                m21830c.writeByte(10);
            }
        }
        Unit unit = Unit.f25302a;
        C14180c.m514a(m21830c, null);
        if (this.f33784A.mo40913b(this.f33789k)) {
            this.f33784A.mo40908g(this.f33789k, this.f33791m);
        }
        this.f33784A.mo40908g(this.f33790l, this.f33789k);
        this.f33784A.mo40907h(this.f33791m);
        this.f33793o = m3480b0();
        this.f33796r = false;
        this.f33801w = false;
    }
}
