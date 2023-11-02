package okhttp3;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gg.C6759j;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C9627a;
import kotlin.ranges.IntRange;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import kotlin.text.Regex;
import okio.Buffer;
import sj.C12560a;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0013\u0018\u0000 =2\u00020\u0001:\u0002\u0015\u001aBc\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\u0012\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0+\u0012\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010+\u0012\b\u00101\u001a\u0004\u0018\u00010\b\u0012\u0006\u00102\u001a\u00020\b¢\u0006\u0004\b;\u0010<J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\bJ\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\"\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010%\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0017\u0010*\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001e\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0019\u00101\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0011\u00103\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0011\u00104\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u00105\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\b0+8G¢\u0006\u0006\u001a\u0004\b#\u0010/R\u0013\u00107\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0013\u00109\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b8\u0010\u001dR\u0013\u0010:\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d¨\u0006>"}, m14357d2 = {"Lokhttp3/HttpUrl;", "", "Ljava/net/URL;", "s", "()Ljava/net/URL;", "Ljava/net/URI;", "r", "()Ljava/net/URI;", "", "o", "link", "p", "Lokhttp3/HttpUrl$a;", "j", "k", "other", "", "equals", "", "hashCode", "toString", "a", "Z", "i", "()Z", "isHttps", "b", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "scheme", "c", "username", "d", "password", "e", "h", ZeroconfModule.KEY_SERVICE_HOST, "f", "I", "m", "()I", ZeroconfModule.KEY_SERVICE_PORT, "", "g", "Ljava/util/List;", "pathSegments", "()Ljava/util/List;", "queryNamesAndValues", "fragment", "url", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "n", "query", "encodedFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "l", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class HttpUrl {

    /* renamed from: a */
    private final boolean f29300a;

    /* renamed from: b */
    private final String f29301b;

    /* renamed from: c */
    private final String f29302c;

    /* renamed from: d */
    private final String f29303d;

    /* renamed from: e */
    private final String f29304e;

    /* renamed from: f */
    private final int f29305f;

    /* renamed from: g */
    private final List<String> f29306g;

    /* renamed from: h */
    private final List<String> f29307h;

    /* renamed from: i */
    private final String f29308i;

    /* renamed from: j */
    private final String f29309j;

    /* renamed from: l */
    public static final C11198b f29299l = new C11198b(null);

    /* renamed from: k */
    private static final char[] f29298k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 \u00172\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J\u000f\u0010\u001e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010!\u001a\u00020 J\b\u0010\"\u001a\u00020\u0004H\u0016J!\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b$\u0010%R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010-\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\"\u00100\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\"\u0010\u001a\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b1\u0010;R,\u0010@\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b=\u0010;\"\u0004\b>\u0010?R$\u0010C\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010&\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*¨\u0006F"}, m14357d2 = {"Lokhttp3/HttpUrl$a;", "", "", "b", "", "input", "startPos", "limit", "", "n", "pos", "", "addTrailingSlash", "alreadyEncoded", "l", "f", "g", "j", "scheme", "o", "username", "v", "password", "i", ZeroconfModule.KEY_SERVICE_HOST, "e", ZeroconfModule.KEY_SERVICE_PORT, "k", "encodedQuery", "c", "m", "()Lokhttp3/HttpUrl$a;", "Lokhttp3/HttpUrl;", "a", "toString", "base", "h", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$a;", "Ljava/lang/String;", "getScheme$okhttp", "()Ljava/lang/String;", "u", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "r", "encodedUsername", "getEncodedPassword$okhttp", "q", "encodedPassword", "d", "getHost$okhttp", "s", "I", "getPort$okhttp", "()I", "t", "(I)V", "", "Ljava/util/List;", "()Ljava/util/List;", "encodedPathSegments", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "getEncodedFragment$okhttp", "p", "encodedFragment", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.HttpUrl$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11196a {

        /* renamed from: i */
        public static final C11197a f29310i = new C11197a(null);

        /* renamed from: a */
        private String f29311a;

        /* renamed from: d */
        private String f29314d;

        /* renamed from: f */
        private final List<String> f29316f;

        /* renamed from: g */
        private List<String> f29317g;

        /* renamed from: h */
        private String f29318h;

        /* renamed from: b */
        private String f29312b = "";

        /* renamed from: c */
        private String f29313c = "";

        /* renamed from: e */
        private int f29315e = -1;

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m14357d2 = {"Lokhttp3/HttpUrl$a$a;", "", "", "input", "", "pos", "limit", "g", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: okhttp3.HttpUrl$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C11197a {
            private C11197a() {
            }

            public /* synthetic */ C11197a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public final int m8861e(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(C11198b.m8856b(HttpUrl.f29299l, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 > parseInt || 65535 < parseInt) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public final int m8860f(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != ':') {
                        if (charAt == '[') {
                            do {
                                i++;
                                if (i < i2) {
                                }
                            } while (str.charAt(i) != ']');
                        }
                        i++;
                    } else {
                        return i;
                    }
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g */
            public final int m8859g(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((C9612q.m13915j(charAt, 97) < 0 || C9612q.m13915j(charAt, 122) > 0) && (C9612q.m13915j(charAt, 65) < 0 || C9612q.m13915j(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 != ':') {
                                        return -1;
                                    }
                                    return i;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: h */
            public final int m8858h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public C11196a() {
            ArrayList arrayList = new ArrayList();
            this.f29316f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        private final int m8886b() {
            int i = this.f29315e;
            if (i != -1) {
                return i;
            }
            C11198b c11198b = HttpUrl.f29299l;
            String str = this.f29311a;
            C9612q.m13920e(str);
            return c11198b.m8855c(str);
        }

        /* renamed from: f */
        private final boolean m8882f(String str) {
            boolean m13754t;
            if (C9612q.m13922c(str, ".")) {
                return true;
            }
            m13754t = C9653o.m13754t(str, "%2e", true);
            if (m13754t) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private final boolean m8881g(String str) {
            boolean m13754t;
            boolean m13754t2;
            boolean m13754t3;
            if (C9612q.m13922c(str, "..")) {
                return true;
            }
            m13754t = C9653o.m13754t(str, "%2e.", true);
            if (m13754t) {
                return true;
            }
            m13754t2 = C9653o.m13754t(str, ".%2e", true);
            if (m13754t2) {
                return true;
            }
            m13754t3 = C9653o.m13754t(str, "%2e%2e", true);
            if (m13754t3) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        private final void m8878j() {
            boolean z;
            List<String> list = this.f29316f;
            if (list.remove(list.size() - 1).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!this.f29316f.isEmpty())) {
                List<String> list2 = this.f29316f;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.f29316f.add("");
        }

        /* renamed from: l */
        private final void m8876l(String str, int i, int i2, boolean z, boolean z2) {
            boolean z3;
            String m8856b = C11198b.m8856b(HttpUrl.f29299l, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (m8882f(m8856b)) {
                return;
            }
            if (m8881g(m8856b)) {
                m8878j();
                return;
            }
            List<String> list = this.f29316f;
            if (list.get(list.size() - 1).length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                List<String> list2 = this.f29316f;
                list2.set(list2.size() - 1, m8856b);
            } else {
                this.f29316f.add(m8856b);
            }
            if (z) {
                this.f29316f.add("");
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m8874n(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f29316f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f29316f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f29316f
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = sj.C12562c.m4797n(r11, r12, r6, r13)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m8876l(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.C11196a.m8874n(java.lang.String, int, int):void");
        }

        /* renamed from: a */
        public final HttpUrl m8887a() {
            int m14093t;
            ArrayList arrayList;
            String str;
            int m14093t2;
            String str2;
            String str3 = this.f29311a;
            if (str3 != null) {
                C11198b c11198b = HttpUrl.f29299l;
                String m8850h = C11198b.m8850h(c11198b, this.f29312b, 0, 0, false, 7, null);
                String m8850h2 = C11198b.m8850h(c11198b, this.f29313c, 0, 0, false, 7, null);
                String str4 = this.f29314d;
                if (str4 != null) {
                    int m8886b = m8886b();
                    List<String> list = this.f29316f;
                    m14093t = C9546k.m14093t(list, 10);
                    ArrayList arrayList2 = new ArrayList(m14093t);
                    for (String str5 : list) {
                        arrayList2.add(C11198b.m8850h(HttpUrl.f29299l, str5, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.f29317g;
                    if (list2 != null) {
                        m14093t2 = C9546k.m14093t(list2, 10);
                        arrayList = new ArrayList(m14093t2);
                        for (String str6 : list2) {
                            if (str6 != null) {
                                str2 = C11198b.m8850h(HttpUrl.f29299l, str6, 0, 0, true, 3, null);
                            } else {
                                str2 = null;
                            }
                            arrayList.add(str2);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str7 = this.f29318h;
                    if (str7 != null) {
                        str = C11198b.m8850h(HttpUrl.f29299l, str7, 0, 0, false, 7, null);
                    } else {
                        str = null;
                    }
                    return new HttpUrl(str3, m8850h, m8850h2, str4, m8886b, arrayList2, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: c */
        public final C11196a m8885c(String str) {
            List<String> list;
            if (str != null) {
                C11198b c11198b = HttpUrl.f29299l;
                String m8856b = C11198b.m8856b(c11198b, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (m8856b != null) {
                    list = c11198b.m8848j(m8856b);
                    this.f29317g = list;
                    return this;
                }
            }
            list = null;
            this.f29317g = list;
            return this;
        }

        /* renamed from: d */
        public final List<String> m8884d() {
            return this.f29316f;
        }

        /* renamed from: e */
        public final C11196a m8883e(String host) {
            C9612q.m13917h(host, "host");
            String m4837e = C12560a.m4837e(C11198b.m8850h(HttpUrl.f29299l, host, 0, 0, false, 7, null));
            if (m4837e != null) {
                this.f29314d = m4837e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        /* renamed from: h */
        public final C11196a m8880h(HttpUrl httpUrl, String input) {
            int m4797n;
            char c;
            int i;
            int i2;
            String str;
            boolean z;
            boolean z2;
            boolean z3;
            int i3;
            String str2;
            int i4;
            boolean z4;
            boolean z5;
            boolean m13761E;
            boolean m13761E2;
            C9612q.m13917h(input, "input");
            int m4787x = C12562c.m4787x(input, 0, 0, 3, null);
            int m4785z = C12562c.m4785z(input, m4787x, 0, 2, null);
            C11197a c11197a = f29310i;
            int m8859g = c11197a.m8859g(input, m4787x, m4785z);
            String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            boolean z6 = true;
            char c2 = 65535;
            if (m8859g != -1) {
                m13761E = C9653o.m13761E(input, "https:", m4787x, true);
                if (m13761E) {
                    this.f29311a = "https";
                    m4787x += 6;
                } else {
                    m13761E2 = C9653o.m13761E(input, "http:", m4787x, true);
                    if (m13761E2) {
                        this.f29311a = "http";
                        m4787x += 5;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, m8859g);
                        C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } else if (httpUrl != null) {
                this.f29311a = httpUrl.m8890q();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int m8858h = c11197a.m8858h(input, m4787x, m4785z);
            char c3 = '?';
            char c4 = '#';
            if (m8858h < 2 && httpUrl != null && !(!C9612q.m13922c(httpUrl.m8890q(), this.f29311a))) {
                this.f29312b = httpUrl.m8900g();
                this.f29313c = httpUrl.m8904c();
                this.f29314d = httpUrl.m8899h();
                this.f29315e = httpUrl.m8894m();
                this.f29316f.clear();
                this.f29316f.addAll(httpUrl.m8902e());
                if (m4787x == m4785z || input.charAt(m4787x) == '#') {
                    m8885c(httpUrl.m8901f());
                }
                i = m4785z;
            } else {
                int i5 = m4787x + m8858h;
                boolean z7 = false;
                boolean z8 = false;
                while (true) {
                    m4797n = C12562c.m4797n(input, "@/\\?#", i5, m4785z);
                    if (m4797n != m4785z) {
                        c = input.charAt(m4797n);
                    } else {
                        c = c2;
                    }
                    if (c == c2 || c == c4 || c == '/' || c == '\\' || c == c3) {
                        break;
                    }
                    if (c != '@') {
                        z3 = z6;
                        str2 = str3;
                        i3 = m4785z;
                    } else {
                        if (!z7) {
                            int m4798m = C12562c.m4798m(input, ':', i5, m4797n);
                            C11198b c11198b = HttpUrl.f29299l;
                            z3 = z6;
                            i3 = m4785z;
                            String str4 = str3;
                            String m8856b = C11198b.m8856b(c11198b, input, i5, m4798m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z8) {
                                m8856b = this.f29312b + "%40" + m8856b;
                            }
                            this.f29312b = m8856b;
                            if (m4798m != m4797n) {
                                this.f29313c = C11198b.m8856b(c11198b, input, m4798m + 1, m4797n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z5 = z3;
                            } else {
                                z5 = z7;
                            }
                            z7 = z5;
                            str2 = str4;
                            z4 = z3;
                            i4 = m4797n;
                        } else {
                            z3 = z6;
                            i3 = m4785z;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f29313c);
                            sb3.append("%40");
                            str2 = str3;
                            i4 = m4797n;
                            sb3.append(C11198b.m8856b(HttpUrl.f29299l, input, i5, m4797n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f29313c = sb3.toString();
                            z4 = z8;
                        }
                        i5 = i4 + 1;
                        z8 = z4;
                    }
                    str3 = str2;
                    z6 = z3;
                    m4785z = i3;
                    c4 = '#';
                    c3 = '?';
                    c2 = 65535;
                }
                boolean z9 = z6;
                String str5 = str3;
                i = m4785z;
                C11197a c11197a2 = f29310i;
                int m8860f = c11197a2.m8860f(input, i5, m4797n);
                int i6 = m8860f + 1;
                if (i6 < m4797n) {
                    i2 = i5;
                    this.f29314d = C12560a.m4837e(C11198b.m8850h(HttpUrl.f29299l, input, i5, m8860f, false, 4, null));
                    int m8861e = c11197a2.m8861e(input, i6, m4797n);
                    this.f29315e = m8861e;
                    if (m8861e != -1) {
                        z2 = z9;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str = str5;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = input.substring(i6, m4797n);
                        C9612q.m13918g(substring2, str5);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str = str5;
                    C11198b c11198b2 = HttpUrl.f29299l;
                    this.f29314d = C12560a.m4837e(C11198b.m8850h(c11198b2, input, i2, m8860f, false, 4, null));
                    String str6 = this.f29311a;
                    C9612q.m13920e(str6);
                    this.f29315e = c11198b2.m8855c(str6);
                }
                if (this.f29314d != null) {
                    z = z9;
                } else {
                    z = false;
                }
                if (z) {
                    m4787x = m4797n;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = input.substring(i2, m8860f);
                    C9612q.m13918g(substring3, str);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            }
            int i7 = i;
            int m4797n2 = C12562c.m4797n(input, "?#", m4787x, i7);
            m8874n(input, m4787x, m4797n2);
            if (m4797n2 < i7 && input.charAt(m4797n2) == '?') {
                int m4798m2 = C12562c.m4798m(input, '#', m4797n2, i7);
                C11198b c11198b3 = HttpUrl.f29299l;
                this.f29317g = c11198b3.m8848j(C11198b.m8856b(c11198b3, input, m4797n2 + 1, m4798m2, " \"'<>#", true, false, true, false, null, 208, null));
                m4797n2 = m4798m2;
            }
            if (m4797n2 < i7 && input.charAt(m4797n2) == '#') {
                this.f29318h = C11198b.m8856b(HttpUrl.f29299l, input, m4797n2 + 1, i7, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        /* renamed from: i */
        public final C11196a m8879i(String password) {
            C9612q.m13917h(password, "password");
            this.f29313c = C11198b.m8856b(HttpUrl.f29299l, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* renamed from: k */
        public final C11196a m8877k(int i) {
            boolean z = true;
            if ((1 > i || 65535 < i) ? false : false) {
                this.f29315e = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        /* renamed from: m */
        public final C11196a m8875m() {
            String str;
            String str2;
            String str3 = this.f29314d;
            String str4 = null;
            if (str3 != null) {
                str = new Regex("[\"<>^`{|}]").m13867h(str3, "");
            } else {
                str = null;
            }
            this.f29314d = str;
            int size = this.f29316f.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.f29316f;
                list.set(i, C11198b.m8856b(HttpUrl.f29299l, list.get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f29317g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str5 = list2.get(i2);
                    if (str5 != null) {
                        str2 = C11198b.m8856b(HttpUrl.f29299l, str5, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i2, str2);
                }
            }
            String str6 = this.f29318h;
            if (str6 != null) {
                str4 = C11198b.m8856b(HttpUrl.f29299l, str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null);
            }
            this.f29318h = str4;
            return this;
        }

        /* renamed from: o */
        public final C11196a m8873o(String scheme) {
            boolean m13754t;
            boolean m13754t2;
            C9612q.m13917h(scheme, "scheme");
            m13754t = C9653o.m13754t(scheme, "http", true);
            if (m13754t) {
                this.f29311a = "http";
            } else {
                m13754t2 = C9653o.m13754t(scheme, "https", true);
                if (m13754t2) {
                    this.f29311a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
            }
            return this;
        }

        /* renamed from: p */
        public final void m8872p(String str) {
            this.f29318h = str;
        }

        /* renamed from: q */
        public final void m8871q(String str) {
            C9612q.m13917h(str, "<set-?>");
            this.f29313c = str;
        }

        /* renamed from: r */
        public final void m8870r(String str) {
            C9612q.m13917h(str, "<set-?>");
            this.f29312b = str;
        }

        /* renamed from: s */
        public final void m8869s(String str) {
            this.f29314d = str;
        }

        /* renamed from: t */
        public final void m8868t(int i) {
            this.f29315e = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if (r1 != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
            if (r1 != r3.m8855c(r2)) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f29311a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f29312b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = r2
                goto L24
            L23:
                r1 = r3
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.f29313c
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = r2
                goto L33
            L32:
                r1 = r3
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.f29312b
                r0.append(r1)
                java.lang.String r1 = r6.f29313c
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = r3
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.f29313c
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.f29314d
                if (r1 == 0) goto L77
                kotlin.jvm.internal.C9612q.m13920e(r1)
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.C9642f.m13831L(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f29314d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.f29314d
                r0.append(r1)
            L77:
                int r1 = r6.f29315e
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.f29311a
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.m8886b()
                java.lang.String r2 = r6.f29311a
                if (r2 == 0) goto L93
                okhttp3.HttpUrl$b r3 = okhttp3.HttpUrl.f29299l
                kotlin.jvm.internal.C9612q.m13920e(r2)
                int r2 = r3.m8855c(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                okhttp3.HttpUrl$b r1 = okhttp3.HttpUrl.f29299l
                java.util.List<java.lang.String> r2 = r6.f29316f
                r1.m8849i(r2, r0)
                java.util.List<java.lang.String> r2 = r6.f29317g
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.f29317g
                kotlin.jvm.internal.C9612q.m13920e(r2)
                r1.m8847k(r2, r0)
            Lb1:
                java.lang.String r1 = r6.f29318h
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f29318h
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C9612q.m13918g(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.C11196a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final void m8867u(String str) {
            this.f29311a = str;
        }

        /* renamed from: v */
        public final C11196a m8866v(String username) {
            C9612q.m13917h(username, "username");
            this.f29312b = C11198b.m8856b(HttpUrl.f29299l, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    @Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e*\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010#J1\u0010%\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010&Jc\u0010'\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010*R\u0014\u00101\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010*R\u0014\u00102\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00103\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010*R\u0014\u00104\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00105\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010*R\u0014\u00106\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010*R\u0014\u00107\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010*¨\u0006:"}, m14357d2 = {"Lokhttp3/HttpUrl$b;", "", "Lokio/Buffer;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "", "m", "e", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "l", "scheme", "c", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "i", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "k", "", "j", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/HttpUrl;", "d", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "f", "g", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.HttpUrl$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11198b {
        private C11198b() {
        }

        public /* synthetic */ C11198b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m8856b(C11198b c11198b, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return c11198b.m8857a(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        /* renamed from: e */
        private final boolean m8853e(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 < i2 && str.charAt(i) == '%' && C12562c.m4830F(str.charAt(i + 1)) != -1 && C12562c.m4830F(str.charAt(i3)) != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public static /* synthetic */ String m8850h(C11198b c11198b, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return c11198b.m8851g(str, i, i2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
            if (m8853e(r16, r5, r18) == false) goto L40;
         */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m8846l(okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lc5
                if (r1 == 0) goto Lbc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2b
                r8 = 9
                if (r7 == r8) goto L26
                r8 = 10
                if (r7 == r8) goto L26
                r8 = 12
                if (r7 == r8) goto L26
                r8 = 13
                if (r7 == r8) goto L26
                goto L2b
            L26:
                r8 = r14
                r12 = r19
                goto Lb5
            L2b:
                r8 = 43
                if (r7 != r8) goto L3c
                if (r22 == 0) goto L3c
                if (r20 == 0) goto L36
                java.lang.String r8 = "+"
                goto L38
            L36:
                java.lang.String r8 = "%2B"
            L38:
                r15.mo8608K(r8)
                goto L26
            L3c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6c
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6c
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L4c
                if (r23 == 0) goto L6c
            L4c:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.C9642f.m13831L(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6a
                if (r7 != r9) goto L65
                if (r20 == 0) goto L6a
                if (r21 == 0) goto L65
                r8 = r14
                boolean r10 = r14.m8853e(r1, r5, r2)
                if (r10 != 0) goto L66
                goto L6f
            L65:
                r8 = r14
            L66:
                r15.m8630P0(r7)
                goto Lb5
            L6a:
                r8 = r14
                goto L6f
            L6c:
                r8 = r14
                r12 = r19
            L6f:
                if (r6 != 0) goto L76
                okio.Buffer r6 = new okio.Buffer
                r6.<init>()
            L76:
                if (r3 == 0) goto L8a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C9612q.m13922c(r3, r10)
                if (r10 == 0) goto L81
                goto L8a
            L81:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.m8634L0(r1, r5, r10, r3)
                goto L8d
            L8a:
                r6.m8630P0(r7)
            L8d:
                boolean r10 = r6.mo8589g0()
                if (r10 != 0) goto Lb5
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.HttpUrl.m8906a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.m8906a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8d
            Lb5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbc:
                r8 = r14
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            Lc5:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.C11198b.m8846l(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* renamed from: m */
        private final void m8845m(Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                if (str != null) {
                    int codePointAt = str.codePointAt(i);
                    if (codePointAt == 37 && (i3 = i + 2) < i2) {
                        int m4830F = C12562c.m4830F(str.charAt(i + 1));
                        int m4830F2 = C12562c.m4830F(str.charAt(i3));
                        if (m4830F != -1 && m4830F2 != -1) {
                            buffer.writeByte((m4830F << 4) + m4830F2);
                            i = Character.charCount(codePointAt) + i3;
                        }
                        buffer.m8630P0(codePointAt);
                        i += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            buffer.writeByte(32);
                            i++;
                        }
                        buffer.m8630P0(codePointAt);
                        i += Character.charCount(codePointAt);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        /* renamed from: a */
        public final String m8857a(String canonicalize, int i, int i2, String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            boolean m13733L;
            C9612q.m13917h(canonicalize, "$this$canonicalize");
            C9612q.m13917h(encodeSet, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = canonicalize.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                    m13733L = C9654p.m13733L(encodeSet, (char) codePointAt, false, 2, null);
                    if (!m13733L) {
                        if (codePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!m8853e(canonicalize, i3, i2)) {
                                        Buffer buffer = new Buffer();
                                        buffer.mo8607N(canonicalize, i, i3);
                                        m8846l(buffer, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                        return buffer.mo8584p0();
                                    }
                                    if (codePointAt == 43 || !z3) {
                                        i3 += Character.charCount(codePointAt);
                                    } else {
                                        Buffer buffer2 = new Buffer();
                                        buffer2.mo8607N(canonicalize, i, i3);
                                        m8846l(buffer2, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                        return buffer2.mo8584p0();
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                }
                Buffer buffer22 = new Buffer();
                buffer22.mo8607N(canonicalize, i, i3);
                m8846l(buffer22, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                return buffer22.mo8584p0();
            }
            String substring = canonicalize.substring(i, i2);
            C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: c */
        public final int m8855c(String scheme) {
            C9612q.m13917h(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: d */
        public final HttpUrl m8854d(String toHttpUrl) {
            C9612q.m13917h(toHttpUrl, "$this$toHttpUrl");
            return new C11196a().m8880h(null, toHttpUrl).m8887a();
        }

        /* renamed from: f */
        public final HttpUrl m8852f(String toHttpUrlOrNull) {
            C9612q.m13917h(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return m8854d(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public final String m8851g(String percentDecode, int i, int i2, boolean z) {
            C9612q.m13917h(percentDecode, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = percentDecode.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.mo8607N(percentDecode, i, i3);
                    m8845m(buffer, percentDecode, i3, i2, z);
                    return buffer.mo8584p0();
                }
            }
            String substring = percentDecode.substring(i, i2);
            C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: i */
        public final void m8849i(List<String> toPathString, StringBuilder out) {
            C9612q.m13917h(toPathString, "$this$toPathString");
            C9612q.m13917h(out, "out");
            int size = toPathString.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(toPathString.get(i));
            }
        }

        /* renamed from: j */
        public final List<String> m8848j(String toQueryNamesAndValues) {
            int m13709Y;
            int m13709Y2;
            C9612q.m13917h(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= toQueryNamesAndValues.length()) {
                m13709Y = C9654p.m13709Y(toQueryNamesAndValues, '&', i, false, 4, null);
                if (m13709Y == -1) {
                    m13709Y = toQueryNamesAndValues.length();
                }
                int i2 = m13709Y;
                m13709Y2 = C9654p.m13709Y(toQueryNamesAndValues, '=', i, false, 4, null);
                if (m13709Y2 != -1 && m13709Y2 <= i2) {
                    String substring = toQueryNamesAndValues.substring(i, m13709Y2);
                    C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = toQueryNamesAndValues.substring(m13709Y2 + 1, i2);
                    C9612q.m13918g(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = toQueryNamesAndValues.substring(i, i2);
                    C9612q.m13918g(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void m8847k(List<String> toQueryString, StringBuilder out) {
            IntRange m21916q;
            C9627a m21918o;
            C9612q.m13917h(toQueryString, "$this$toQueryString");
            C9612q.m13917h(out, "out");
            m21916q = C6759j.m21916q(0, toQueryString.size());
            m21918o = C6759j.m21918o(m21916q, 2);
            int m13890a = m21918o.m13890a();
            int m13889e = m21918o.m13889e();
            int m13888h = m21918o.m13888h();
            if (m13888h >= 0) {
                if (m13890a > m13889e) {
                    return;
                }
            } else if (m13890a < m13889e) {
                return;
            }
            while (true) {
                String str = toQueryString.get(m13890a);
                String str2 = toQueryString.get(m13890a + 1);
                if (m13890a > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (m13890a != m13889e) {
                    m13890a += m13888h;
                } else {
                    return;
                }
            }
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i, List<String> pathSegments, List<String> list, String str, String url) {
        C9612q.m13917h(scheme, "scheme");
        C9612q.m13917h(username, "username");
        C9612q.m13917h(password, "password");
        C9612q.m13917h(host, "host");
        C9612q.m13917h(pathSegments, "pathSegments");
        C9612q.m13917h(url, "url");
        this.f29301b = scheme;
        this.f29302c = username;
        this.f29303d = password;
        this.f29304e = host;
        this.f29305f = i;
        this.f29306g = pathSegments;
        this.f29307h = list;
        this.f29308i = str;
        this.f29309j = url;
        this.f29300a = C9612q.m13922c(scheme, "https");
    }

    /* renamed from: l */
    public static final HttpUrl m8895l(String str) {
        return f29299l.m8852f(str);
    }

    /* renamed from: b */
    public final String m8905b() {
        int m13709Y;
        if (this.f29308i == null) {
            return null;
        }
        m13709Y = C9654p.m13709Y(this.f29309j, '#', 0, false, 6, null);
        int i = m13709Y + 1;
        String str = this.f29309j;
        if (str != null) {
            String substring = str.substring(i);
            C9612q.m13918g(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public final String m8904c() {
        boolean z;
        int m13709Y;
        int m13709Y2;
        if (this.f29303d.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        m13709Y = C9654p.m13709Y(this.f29309j, ':', this.f29301b.length() + 3, false, 4, null);
        int i = m13709Y + 1;
        m13709Y2 = C9654p.m13709Y(this.f29309j, '@', 0, false, 6, null);
        String str = this.f29309j;
        if (str != null) {
            String substring = str.substring(i, m13709Y2);
            C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    public final String m8903d() {
        int m13709Y;
        m13709Y = C9654p.m13709Y(this.f29309j, '/', this.f29301b.length() + 3, false, 4, null);
        String str = this.f29309j;
        int m4797n = C12562c.m4797n(str, "?#", m13709Y, str.length());
        String str2 = this.f29309j;
        if (str2 != null) {
            String substring = str2.substring(m13709Y, m4797n);
            C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: e */
    public final List<String> m8902e() {
        int m13709Y;
        m13709Y = C9654p.m13709Y(this.f29309j, '/', this.f29301b.length() + 3, false, 4, null);
        String str = this.f29309j;
        int m4797n = C12562c.m4797n(str, "?#", m13709Y, str.length());
        ArrayList arrayList = new ArrayList();
        while (m13709Y < m4797n) {
            int i = m13709Y + 1;
            int m4798m = C12562c.m4798m(this.f29309j, '/', i, m4797n);
            String str2 = this.f29309j;
            if (str2 != null) {
                String substring = str2.substring(i, m4798m);
                C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                m13709Y = m4798m;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && C9612q.m13922c(((HttpUrl) obj).f29309j, this.f29309j);
    }

    /* renamed from: f */
    public final String m8901f() {
        int m13709Y;
        if (this.f29307h == null) {
            return null;
        }
        m13709Y = C9654p.m13709Y(this.f29309j, '?', 0, false, 6, null);
        int i = m13709Y + 1;
        String str = this.f29309j;
        int m4798m = C12562c.m4798m(str, '#', i, str.length());
        String str2 = this.f29309j;
        if (str2 != null) {
            String substring = str2.substring(i, m4798m);
            C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: g */
    public final String m8900g() {
        boolean z;
        if (this.f29302c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        int length = this.f29301b.length() + 3;
        String str = this.f29309j;
        int m4797n = C12562c.m4797n(str, ":@", length, str.length());
        String str2 = this.f29309j;
        if (str2 != null) {
            String substring = str2.substring(length, m4797n);
            C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: h */
    public final String m8899h() {
        return this.f29304e;
    }

    public int hashCode() {
        return this.f29309j.hashCode();
    }

    /* renamed from: i */
    public final boolean m8898i() {
        return this.f29300a;
    }

    /* renamed from: j */
    public final C11196a m8897j() {
        int i;
        C11196a c11196a = new C11196a();
        c11196a.m8867u(this.f29301b);
        c11196a.m8870r(m8900g());
        c11196a.m8871q(m8904c());
        c11196a.m8869s(this.f29304e);
        if (this.f29305f != f29299l.m8855c(this.f29301b)) {
            i = this.f29305f;
        } else {
            i = -1;
        }
        c11196a.m8868t(i);
        c11196a.m8884d().clear();
        c11196a.m8884d().addAll(m8902e());
        c11196a.m8885c(m8901f());
        c11196a.m8872p(m8905b());
        return c11196a;
    }

    /* renamed from: k */
    public final C11196a m8896k(String link) {
        C9612q.m13917h(link, "link");
        try {
            return new C11196a().m8880h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final int m8894m() {
        return this.f29305f;
    }

    /* renamed from: n */
    public final String m8893n() {
        if (this.f29307h == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f29299l.m8847k(this.f29307h, sb2);
        return sb2.toString();
    }

    /* renamed from: o */
    public final String m8892o() {
        C11196a m8896k = m8896k("/...");
        C9612q.m13920e(m8896k);
        return m8896k.m8866v("").m8879i("").m8887a().toString();
    }

    /* renamed from: p */
    public final HttpUrl m8891p(String link) {
        C9612q.m13917h(link, "link");
        C11196a m8896k = m8896k(link);
        if (m8896k != null) {
            return m8896k.m8887a();
        }
        return null;
    }

    /* renamed from: q */
    public final String m8890q() {
        return this.f29301b;
    }

    /* renamed from: r */
    public final URI m8889r() {
        String c11196a = m8897j().m8875m().toString();
        try {
            return new URI(c11196a);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m13867h(c11196a, ""));
                C9612q.m13918g(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: s */
    public final URL m8888s() {
        try {
            return new URL(this.f29309j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f29309j;
    }
}
