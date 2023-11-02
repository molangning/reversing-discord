package p471zj;

import androidx.recyclerview.widget.RecyclerView;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.uimanager.ViewDefaults;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import p122gk.C6840m;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\u000eB\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, m14357d2 = {"Lzj/d;", "", "", "Lokio/ByteString;", "", "d", ZeroconfModule.KEY_SERVICE_NAME, "a", "", "Lzj/c;", "[Lzj/c;", "c", "()[Lzj/c;", "STATIC_HEADER_TABLE", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: zj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14295d {

    /* renamed from: a */
    private static final C14293c[] f36718a;

    /* renamed from: b */
    private static final Map<ByteString, Integer> f36719b;

    /* renamed from: c */
    public static final C14295d f36720c;

    static {
        C14295d c14295d = new C14295d();
        f36720c = c14295d;
        ByteString byteString = C14293c.f36710f;
        ByteString byteString2 = C14293c.f36711g;
        ByteString byteString3 = C14293c.f36712h;
        ByteString byteString4 = C14293c.f36709e;
        f36718a = new C14293c[]{new C14293c(C14293c.f36713i, ""), new C14293c(byteString, "GET"), new C14293c(byteString, "POST"), new C14293c(byteString2, "/"), new C14293c(byteString2, "/index.html"), new C14293c(byteString3, "http"), new C14293c(byteString3, "https"), new C14293c(byteString4, "200"), new C14293c(byteString4, "204"), new C14293c(byteString4, "206"), new C14293c(byteString4, "304"), new C14293c(byteString4, "400"), new C14293c(byteString4, "404"), new C14293c(byteString4, "500"), new C14293c("accept-charset", ""), new C14293c("accept-encoding", "gzip, deflate"), new C14293c("accept-language", ""), new C14293c("accept-ranges", ""), new C14293c("accept", ""), new C14293c("access-control-allow-origin", ""), new C14293c("age", ""), new C14293c("allow", ""), new C14293c("authorization", ""), new C14293c("cache-control", ""), new C14293c("content-disposition", ""), new C14293c("content-encoding", ""), new C14293c("content-language", ""), new C14293c("content-length", ""), new C14293c("content-location", ""), new C14293c("content-range", ""), new C14293c("content-type", ""), new C14293c("cookie", ""), new C14293c("date", ""), new C14293c("etag", ""), new C14293c("expect", ""), new C14293c("expires", ""), new C14293c("from", ""), new C14293c(ZeroconfModule.KEY_SERVICE_HOST, ""), new C14293c("if-match", ""), new C14293c("if-modified-since", ""), new C14293c("if-none-match", ""), new C14293c("if-range", ""), new C14293c("if-unmodified-since", ""), new C14293c("last-modified", ""), new C14293c("link", ""), new C14293c("location", ""), new C14293c("max-forwards", ""), new C14293c("proxy-authenticate", ""), new C14293c("proxy-authorization", ""), new C14293c("range", ""), new C14293c("referer", ""), new C14293c("refresh", ""), new C14293c("retry-after", ""), new C14293c("server", ""), new C14293c("set-cookie", ""), new C14293c("strict-transport-security", ""), new C14293c("transfer-encoding", ""), new C14293c("user-agent", ""), new C14293c("vary", ""), new C14293c("via", ""), new C14293c("www-authenticate", "")};
        f36719b = c14295d.m223d();
    }

    private C14295d() {
    }

    /* renamed from: d */
    private final Map<ByteString, Integer> m223d() {
        C14293c[] c14293cArr = f36718a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c14293cArr.length);
        int length = c14293cArr.length;
        for (int i = 0; i < length; i++) {
            C14293c[] c14293cArr2 = f36718a;
            if (!linkedHashMap.containsKey(c14293cArr2[i].f36716b)) {
                linkedHashMap.put(c14293cArr2[i].f36716b, Integer.valueOf(i));
            }
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C9612q.m13918g(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public final ByteString m226a(ByteString name) {
        C9612q.m13917h(name, "name");
        int m8551z = name.m8551z();
        for (int i = 0; i < m8551z; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte m8567f = name.m8567f(i);
            if (b <= m8567f && b2 >= m8567f) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.m8575D());
            }
        }
        return name;
    }

    /* renamed from: b */
    public final Map<ByteString, Integer> m225b() {
        return f36719b;
    }

    /* renamed from: c */
    public final C14293c[] m224c() {
        return f36718a;
    }

    @Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010$\u001a\u00020.\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\b\b\u0002\u0010-\u001a\u00020\u0005¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0002J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0010R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010*\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0016\u0010+\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010,\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(¨\u00061"}, m14357d2 = {"Lzj/d$a;", "", "", "a", "b", "", "bytesToRecover", "d", "index", "l", "c", "p", "q", "nameIndex", "n", "o", "Lokio/ByteString;", "f", "", "h", "Lzj/c;", "entry", "g", "i", "", "e", "k", "firstByte", "prefixMask", "m", "j", "", "Ljava/util/List;", "headerList", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "source", "", "[Lzj/c;", "dynamicTable", "I", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "headerTableSizeSetting", "maxDynamicTableByteCount", "Lokio/Source;", "<init>", "(Lokio/Source;II)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14296a {

        /* renamed from: a */
        private final List<C14293c> f36721a;

        /* renamed from: b */
        private final BufferedSource f36722b;

        /* renamed from: c */
        public C14293c[] f36723c;

        /* renamed from: d */
        private int f36724d;

        /* renamed from: e */
        public int f36725e;

        /* renamed from: f */
        public int f36726f;

        /* renamed from: g */
        private final int f36727g;

        /* renamed from: h */
        private int f36728h;

        public C14296a(Source source, int i, int i2) {
            C9612q.m13917h(source, "source");
            this.f36727g = i;
            this.f36728h = i2;
            this.f36721a = new ArrayList();
            this.f36722b = C6840m.m21829d(source);
            C14293c[] c14293cArr = new C14293c[8];
            this.f36723c = c14293cArr;
            this.f36724d = c14293cArr.length - 1;
        }

        /* renamed from: a */
        private final void m222a() {
            int i = this.f36728h;
            int i2 = this.f36726f;
            if (i < i2) {
                if (i == 0) {
                    m221b();
                } else {
                    m219d(i2 - i);
                }
            }
        }

        /* renamed from: b */
        private final void m221b() {
            C9536e.m14265m(this.f36723c, null, 0, 0, 6, null);
            this.f36724d = this.f36723c.length - 1;
            this.f36725e = 0;
            this.f36726f = 0;
        }

        /* renamed from: c */
        private final int m220c(int i) {
            return this.f36724d + 1 + i;
        }

        /* renamed from: d */
        private final int m219d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f36723c.length;
                while (true) {
                    length--;
                    i2 = this.f36724d;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C14293c c14293c = this.f36723c[length];
                    C9612q.m13920e(c14293c);
                    int i4 = c14293c.f36715a;
                    i -= i4;
                    this.f36726f -= i4;
                    this.f36725e--;
                    i3++;
                }
                C14293c[] c14293cArr = this.f36723c;
                System.arraycopy(c14293cArr, i2 + 1, c14293cArr, i2 + 1 + i3, this.f36725e);
                this.f36724d += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private final ByteString m217f(int i) {
            if (m215h(i)) {
                return C14295d.f36720c.m224c()[i].f36716b;
            }
            int m220c = m220c(i - C14295d.f36720c.m224c().length);
            if (m220c >= 0) {
                C14293c[] c14293cArr = this.f36723c;
                if (m220c < c14293cArr.length) {
                    C14293c c14293c = c14293cArr[m220c];
                    C9612q.m13920e(c14293c);
                    return c14293c.f36716b;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: g */
        private final void m216g(int i, C14293c c14293c) {
            this.f36721a.add(c14293c);
            int i2 = c14293c.f36715a;
            if (i != -1) {
                C14293c c14293c2 = this.f36723c[m220c(i)];
                C9612q.m13920e(c14293c2);
                i2 -= c14293c2.f36715a;
            }
            int i3 = this.f36728h;
            if (i2 > i3) {
                m221b();
                return;
            }
            int m219d = m219d((this.f36726f + i2) - i3);
            if (i == -1) {
                int i4 = this.f36725e + 1;
                C14293c[] c14293cArr = this.f36723c;
                if (i4 > c14293cArr.length) {
                    C14293c[] c14293cArr2 = new C14293c[c14293cArr.length * 2];
                    System.arraycopy(c14293cArr, 0, c14293cArr2, c14293cArr.length, c14293cArr.length);
                    this.f36724d = this.f36723c.length - 1;
                    this.f36723c = c14293cArr2;
                }
                int i5 = this.f36724d;
                this.f36724d = i5 - 1;
                this.f36723c[i5] = c14293c;
                this.f36725e++;
            } else {
                this.f36723c[i + m220c(i) + m219d] = c14293c;
            }
            this.f36726f += i2;
        }

        /* renamed from: h */
        private final boolean m215h(int i) {
            return i >= 0 && i <= C14295d.f36720c.m224c().length - 1;
        }

        /* renamed from: i */
        private final int m214i() {
            return C12562c.m4809b(this.f36722b.readByte(), 255);
        }

        /* renamed from: l */
        private final void m211l(int i) {
            if (m215h(i)) {
                this.f36721a.add(C14295d.f36720c.m224c()[i]);
                return;
            }
            int m220c = m220c(i - C14295d.f36720c.m224c().length);
            if (m220c >= 0) {
                C14293c[] c14293cArr = this.f36723c;
                if (m220c < c14293cArr.length) {
                    List<C14293c> list = this.f36721a;
                    C14293c c14293c = c14293cArr[m220c];
                    C9612q.m13920e(c14293c);
                    list.add(c14293c);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        private final void m209n(int i) {
            m216g(-1, new C14293c(m217f(i), m213j()));
        }

        /* renamed from: o */
        private final void m208o() {
            m216g(-1, new C14293c(C14295d.f36720c.m226a(m213j()), m213j()));
        }

        /* renamed from: p */
        private final void m207p(int i) {
            this.f36721a.add(new C14293c(m217f(i), m213j()));
        }

        /* renamed from: q */
        private final void m206q() {
            this.f36721a.add(new C14293c(C14295d.f36720c.m226a(m213j()), m213j()));
        }

        /* renamed from: e */
        public final List<C14293c> m218e() {
            List<C14293c> m14075C0;
            m14075C0 = C9553r.m14075C0(this.f36721a);
            this.f36721a.clear();
            return m14075C0;
        }

        /* renamed from: j */
        public final ByteString m213j() {
            boolean z;
            int m214i = m214i();
            if ((m214i & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            long m210m = m210m(m214i, 127);
            if (z) {
                Buffer buffer = new Buffer();
                C14331k.f36912d.m18b(this.f36722b, m210m, buffer);
                return buffer.mo8586o0();
            }
            return this.f36722b.mo8592d0(m210m);
        }

        /* renamed from: k */
        public final void m212k() {
            while (!this.f36722b.mo8589g0()) {
                int m4809b = C12562c.m4809b(this.f36722b.readByte(), 255);
                if (m4809b != 128) {
                    if ((m4809b & 128) == 128) {
                        m211l(m210m(m4809b, 127) - 1);
                    } else if (m4809b == 64) {
                        m208o();
                    } else if ((m4809b & 64) == 64) {
                        m209n(m210m(m4809b, 63) - 1);
                    } else if ((m4809b & 32) == 32) {
                        int m210m = m210m(m4809b, 31);
                        this.f36728h = m210m;
                        if (m210m >= 0 && m210m <= this.f36727g) {
                            m222a();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.f36728h);
                        }
                    } else if (m4809b != 16 && m4809b != 0) {
                        m207p(m210m(m4809b, 15) - 1);
                    } else {
                        m206q();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        /* renamed from: m */
        public final int m210m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int m214i = m214i();
                if ((m214i & 128) == 0) {
                    return i2 + (m214i << i4);
                }
                i2 += (m214i & 127) << i4;
                i4 += 7;
            }
        }

        public /* synthetic */ C14296a(Source source, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    @Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m14357d2 = {"Lzj/d$b;", "", "", "b", "", "bytesToRecover", "c", "Lzj/c;", "entry", "d", "a", "", "headerBlock", "g", "value", "prefixMask", "bits", "h", "Lokio/ByteString;", "data", "f", "headerTableSizeSetting", "e", "I", "smallestHeaderTableSizeSetting", "", "Z", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[Lzj/c;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "i", "useCompression", "Lokio/Buffer;", "j", "Lokio/Buffer;", "out", "<init>", "(IZLokio/Buffer;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: zj.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C14297b {

        /* renamed from: a */
        private int f36729a;

        /* renamed from: b */
        private boolean f36730b;

        /* renamed from: c */
        public int f36731c;

        /* renamed from: d */
        public C14293c[] f36732d;

        /* renamed from: e */
        private int f36733e;

        /* renamed from: f */
        public int f36734f;

        /* renamed from: g */
        public int f36735g;

        /* renamed from: h */
        public int f36736h;

        /* renamed from: i */
        private final boolean f36737i;

        /* renamed from: j */
        private final Buffer f36738j;

        public C14297b(int i, boolean z, Buffer out) {
            C9612q.m13917h(out, "out");
            this.f36736h = i;
            this.f36737i = z;
            this.f36738j = out;
            this.f36729a = ViewDefaults.NUMBER_OF_LINES;
            this.f36731c = i;
            C14293c[] c14293cArr = new C14293c[8];
            this.f36732d = c14293cArr;
            this.f36733e = c14293cArr.length - 1;
        }

        /* renamed from: a */
        private final void m205a() {
            int i = this.f36731c;
            int i2 = this.f36735g;
            if (i < i2) {
                if (i == 0) {
                    m204b();
                } else {
                    m203c(i2 - i);
                }
            }
        }

        /* renamed from: b */
        private final void m204b() {
            C9536e.m14265m(this.f36732d, null, 0, 0, 6, null);
            this.f36733e = this.f36732d.length - 1;
            this.f36734f = 0;
            this.f36735g = 0;
        }

        /* renamed from: c */
        private final int m203c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f36732d.length;
                while (true) {
                    length--;
                    i2 = this.f36733e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C14293c c14293c = this.f36732d[length];
                    C9612q.m13920e(c14293c);
                    i -= c14293c.f36715a;
                    int i4 = this.f36735g;
                    C14293c c14293c2 = this.f36732d[length];
                    C9612q.m13920e(c14293c2);
                    this.f36735g = i4 - c14293c2.f36715a;
                    this.f36734f--;
                    i3++;
                }
                C14293c[] c14293cArr = this.f36732d;
                System.arraycopy(c14293cArr, i2 + 1, c14293cArr, i2 + 1 + i3, this.f36734f);
                C14293c[] c14293cArr2 = this.f36732d;
                int i5 = this.f36733e;
                Arrays.fill(c14293cArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f36733e += i3;
            }
            return i3;
        }

        /* renamed from: d */
        private final void m202d(C14293c c14293c) {
            int i = c14293c.f36715a;
            int i2 = this.f36731c;
            if (i > i2) {
                m204b();
                return;
            }
            m203c((this.f36735g + i) - i2);
            int i3 = this.f36734f + 1;
            C14293c[] c14293cArr = this.f36732d;
            if (i3 > c14293cArr.length) {
                C14293c[] c14293cArr2 = new C14293c[c14293cArr.length * 2];
                System.arraycopy(c14293cArr, 0, c14293cArr2, c14293cArr.length, c14293cArr.length);
                this.f36733e = this.f36732d.length - 1;
                this.f36732d = c14293cArr2;
            }
            int i4 = this.f36733e;
            this.f36733e = i4 - 1;
            this.f36732d[i4] = c14293c;
            this.f36734f++;
            this.f36735g += i;
        }

        /* renamed from: e */
        public final void m201e(int i) {
            this.f36736h = i;
            int min = Math.min(i, 16384);
            int i2 = this.f36731c;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.f36729a = Math.min(this.f36729a, min);
            }
            this.f36730b = true;
            this.f36731c = min;
            m205a();
        }

        /* renamed from: f */
        public final void m200f(ByteString data) {
            C9612q.m13917h(data, "data");
            if (this.f36737i) {
                C14331k c14331k = C14331k.f36912d;
                if (c14331k.m16d(data) < data.m8551z()) {
                    Buffer buffer = new Buffer();
                    c14331k.m17c(data, buffer);
                    ByteString mo8586o0 = buffer.mo8586o0();
                    m198h(mo8586o0.m8551z(), 127, 128);
                    this.f36738j.mo8602q0(mo8586o0);
                    return;
                }
            }
            m198h(data.m8551z(), 127, 0);
            this.f36738j.mo8602q0(data);
        }

        /* renamed from: g */
        public final void m199g(List<C14293c> headerBlock) {
            int i;
            int i2;
            C9612q.m13917h(headerBlock, "headerBlock");
            if (this.f36730b) {
                int i3 = this.f36729a;
                if (i3 < this.f36731c) {
                    m198h(i3, 31, 32);
                }
                this.f36730b = false;
                this.f36729a = ViewDefaults.NUMBER_OF_LINES;
                m198h(this.f36731c, 31, 32);
            }
            int size = headerBlock.size();
            for (int i4 = 0; i4 < size; i4++) {
                C14293c c14293c = headerBlock.get(i4);
                ByteString mo8577B = c14293c.f36716b.mo8577B();
                ByteString byteString = c14293c.f36717c;
                C14295d c14295d = C14295d.f36720c;
                Integer num = c14295d.m225b().get(mo8577B);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (2 <= i2 && 7 >= i2) {
                        if (C9612q.m13922c(c14295d.m224c()[i2 - 1].f36717c, byteString)) {
                            i = i2;
                        } else if (C9612q.m13922c(c14295d.m224c()[i2].f36717c, byteString)) {
                            i2++;
                            i = i2;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f36733e + 1;
                    int length = this.f36732d.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        C14293c c14293c2 = this.f36732d[i5];
                        C9612q.m13920e(c14293c2);
                        if (C9612q.m13922c(c14293c2.f36716b, mo8577B)) {
                            C14293c c14293c3 = this.f36732d[i5];
                            C9612q.m13920e(c14293c3);
                            if (C9612q.m13922c(c14293c3.f36717c, byteString)) {
                                i2 = C14295d.f36720c.m224c().length + (i5 - this.f36733e);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f36733e) + C14295d.f36720c.m224c().length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    m198h(i2, 127, 128);
                } else if (i == -1) {
                    this.f36738j.writeByte(64);
                    m200f(mo8577B);
                    m200f(byteString);
                    m202d(c14293c);
                } else if (mo8577B.m8578A(C14293c.f36708d) && (!C9612q.m13922c(C14293c.f36713i, mo8577B))) {
                    m198h(i, 15, 0);
                    m200f(byteString);
                } else {
                    m198h(i, 63, 64);
                    m200f(byteString);
                    m202d(c14293c);
                }
            }
        }

        /* renamed from: h */
        public final void m198h(int i, int i2, int i3) {
            if (i < i2) {
                this.f36738j.writeByte(i | i3);
                return;
            }
            this.f36738j.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f36738j.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f36738j.writeByte(i4);
        }

        public /* synthetic */ C14297b(int i, boolean z, Buffer buffer, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT : i, (i2 & 2) != 0 ? true : z, buffer);
        }
    }
}
