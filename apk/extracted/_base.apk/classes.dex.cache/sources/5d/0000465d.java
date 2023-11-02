package okhttp3;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9654p;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 '2\u00020\u0001:\u0002\u0005\nBs\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0011\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0019\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u001b\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0018\u0010$\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, m14357d2 = {"Lokhttp3/CacheControl;", "", "", "toString", "", "a", "Z", "g", "()Z", "noCache", "b", "h", "noStore", "", "c", "I", "()I", "maxAgeSeconds", "d", "sMaxAgeSeconds", "e", "isPrivate", "f", "isPublic", "mustRevalidate", "maxStaleSeconds", "i", "minFreshSeconds", "j", "onlyIfCached", "k", "noTransform", "l", "immutable", "m", "Ljava/lang/String;", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "p", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class CacheControl {

    /* renamed from: a */
    private final boolean f29242a;

    /* renamed from: b */
    private final boolean f29243b;

    /* renamed from: c */
    private final int f29244c;

    /* renamed from: d */
    private final int f29245d;

    /* renamed from: e */
    private final boolean f29246e;

    /* renamed from: f */
    private final boolean f29247f;

    /* renamed from: g */
    private final boolean f29248g;

    /* renamed from: h */
    private final int f29249h;

    /* renamed from: i */
    private final int f29250i;

    /* renamed from: j */
    private final boolean f29251j;

    /* renamed from: k */
    private final boolean f29252k;

    /* renamed from: l */
    private final boolean f29253l;

    /* renamed from: m */
    private String f29254m;

    /* renamed from: p */
    public static final C11189b f29241p = new C11189b(null);

    /* renamed from: n */
    public static final CacheControl f29239n = new C11188a().m8969d().m8972a();

    /* renamed from: o */
    public static final CacheControl f29240o = new C11188a().m8967f().m8970c(ViewDefaults.NUMBER_OF_LINES, TimeUnit.SECONDS).m8972a();

    @Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0000J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001d"}, m14357d2 = {"Lokhttp3/CacheControl$a;", "", "", "", "b", "d", "e", "maxStale", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "c", "f", "Lokhttp3/CacheControl;", "a", "", "Z", "noCache", "noStore", "I", "maxAgeSeconds", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "g", "noTransform", "h", "immutable", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.CacheControl$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11188a {

        /* renamed from: a */
        private boolean f29255a;

        /* renamed from: b */
        private boolean f29256b;

        /* renamed from: c */
        private int f29257c = -1;

        /* renamed from: d */
        private int f29258d = -1;

        /* renamed from: e */
        private int f29259e = -1;

        /* renamed from: f */
        private boolean f29260f;

        /* renamed from: g */
        private boolean f29261g;

        /* renamed from: h */
        private boolean f29262h;

        /* renamed from: b */
        private final int m8971b(long j) {
            return j > ((long) ViewDefaults.NUMBER_OF_LINES) ? ViewDefaults.NUMBER_OF_LINES : (int) j;
        }

        /* renamed from: a */
        public final CacheControl m8972a() {
            return new CacheControl(this.f29255a, this.f29256b, this.f29257c, -1, false, false, false, this.f29258d, this.f29259e, this.f29260f, this.f29261g, this.f29262h, null, null);
        }

        /* renamed from: c */
        public final C11188a m8970c(int i, TimeUnit timeUnit) {
            boolean z;
            C9612q.m13917h(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f29258d = m8971b(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        /* renamed from: d */
        public final C11188a m8969d() {
            this.f29255a = true;
            return this;
        }

        /* renamed from: e */
        public final C11188a m8968e() {
            this.f29256b = true;
            return this;
        }

        /* renamed from: f */
        public final C11188a m8967f() {
            this.f29260f = true;
            return this;
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lokhttp3/CacheControl$b;", "", "", "characters", "", "startIndex", "a", "Lokhttp3/Headers;", "headers", "Lokhttp3/CacheControl;", "b", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.CacheControl$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11189b {
        private C11189b() {
        }

        public /* synthetic */ C11189b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final int m8966a(String str, String str2, int i) {
            boolean m13733L;
            int length = str.length();
            while (i < length) {
                m13733L = C9654p.m13733L(str2, str.charAt(i), false, 2, null);
                if (m13733L) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x00e1  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl m8965b(okhttp3.Headers r32) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.C11189b.m8965b(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f29242a = z;
        this.f29243b = z2;
        this.f29244c = i;
        this.f29245d = i2;
        this.f29246e = z3;
        this.f29247f = z4;
        this.f29248g = z5;
        this.f29249h = i3;
        this.f29250i = i4;
        this.f29251j = z6;
        this.f29252k = z7;
        this.f29253l = z8;
        this.f29254m = str;
    }

    /* renamed from: a */
    public final boolean m8981a() {
        return this.f29246e;
    }

    /* renamed from: b */
    public final boolean m8980b() {
        return this.f29247f;
    }

    /* renamed from: c */
    public final int m8979c() {
        return this.f29244c;
    }

    /* renamed from: d */
    public final int m8978d() {
        return this.f29249h;
    }

    /* renamed from: e */
    public final int m8977e() {
        return this.f29250i;
    }

    /* renamed from: f */
    public final boolean m8976f() {
        return this.f29248g;
    }

    /* renamed from: g */
    public final boolean m8975g() {
        return this.f29242a;
    }

    /* renamed from: h */
    public final boolean m8974h() {
        return this.f29243b;
    }

    /* renamed from: i */
    public final boolean m8973i() {
        return this.f29251j;
    }

    public String toString() {
        boolean z;
        String str = this.f29254m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f29242a) {
                sb2.append("no-cache, ");
            }
            if (this.f29243b) {
                sb2.append("no-store, ");
            }
            if (this.f29244c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f29244c);
                sb2.append(", ");
            }
            if (this.f29245d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.f29245d);
                sb2.append(", ");
            }
            if (this.f29246e) {
                sb2.append("private, ");
            }
            if (this.f29247f) {
                sb2.append("public, ");
            }
            if (this.f29248g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f29249h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f29249h);
                sb2.append(", ");
            }
            if (this.f29250i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f29250i);
                sb2.append(", ");
            }
            if (this.f29251j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f29252k) {
                sb2.append("no-transform, ");
            }
            if (this.f29253l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
            this.f29254m = sb3;
            return sb3;
        }
        return str;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}