package okhttp3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0003#\r\u0007B'\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u001e¨\u0006$"}, m14357d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lokio/BufferedSink;", "sink", "", "countBytes", "", "b", "Lokhttp3/MediaType;", "contentType", "contentLength", "", "writeTo", "a", "Lokhttp3/MediaType;", "J", "Lokio/ByteString;", "c", "Lokio/ByteString;", "boundaryByteString", "d", "type", "()Lokhttp3/MediaType;", "", "Lokhttp3/MultipartBody$b;", "e", "Ljava/util/List;", "parts", "()Ljava/util/List;", "", "()Ljava/lang/String;", "boundary", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "n", "Builder", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: f */
    public static final MediaType f29326f;

    /* renamed from: g */
    public static final MediaType f29327g;

    /* renamed from: h */
    public static final MediaType f29328h;

    /* renamed from: i */
    public static final MediaType f29329i;

    /* renamed from: j */
    public static final MediaType f29330j;

    /* renamed from: k */
    private static final byte[] f29331k;

    /* renamed from: l */
    private static final byte[] f29332l;

    /* renamed from: m */
    private static final byte[] f29333m;

    /* renamed from: n */
    public static final C11200a f29334n = new C11200a(null);

    /* renamed from: a */
    private final MediaType f29335a;

    /* renamed from: b */
    private long f29336b;

    /* renamed from: c */
    private final ByteString f29337c;

    /* renamed from: d */
    private final MediaType f29338d;

    /* renamed from: e */
    private final List<C11201b> f29339e;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, m14357d2 = {"Lokhttp3/MultipartBody$a;", "", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.MultipartBody$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11200a {
        private C11200a() {
        }

        public /* synthetic */ C11200a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u001b\b\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, m14357d2 = {"Lokhttp3/MultipartBody$b;", "", "Lokhttp3/Headers;", "a", "Lokhttp3/Headers;", "b", "()Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "Lokhttp3/RequestBody;", "()Lokhttp3/RequestBody;", "body", "<init>", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "c", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.MultipartBody$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11201b {

        /* renamed from: c */
        public static final C11202a f29343c = new C11202a(null);

        /* renamed from: a */
        private final Headers f29344a;

        /* renamed from: b */
        private final RequestBody f29345b;

        @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m14357d2 = {"Lokhttp3/MultipartBody$b$a;", "", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "Lokhttp3/MultipartBody$b;", "a", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: okhttp3.MultipartBody$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C11202a {
            private C11202a() {
            }

            public /* synthetic */ C11202a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C11201b m8827a(Headers headers, RequestBody body) {
                String str;
                boolean z;
                String str2;
                C9612q.m13917h(body, "body");
                if (headers != null) {
                    str = headers.m8929a("Content-Type");
                } else {
                    str = null;
                }
                boolean z2 = true;
                if (str == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (headers != null) {
                        str2 = headers.m8929a("Content-Length");
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        z2 = false;
                    }
                    if (z2) {
                        return new C11201b(headers, body, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }
        }

        private C11201b(Headers headers, RequestBody requestBody) {
            this.f29344a = headers;
            this.f29345b = requestBody;
        }

        /* renamed from: a */
        public final RequestBody m8829a() {
            return this.f29345b;
        }

        /* renamed from: b */
        public final Headers m8828b() {
            return this.f29344a;
        }

        public /* synthetic */ C11201b(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }
    }

    static {
        MediaType.C11199a c11199a = MediaType.f29321g;
        f29326f = c11199a.m8837a("multipart/mixed");
        f29327g = c11199a.m8837a("multipart/alternative");
        f29328h = c11199a.m8837a("multipart/digest");
        f29329i = c11199a.m8837a("multipart/parallel");
        f29330j = c11199a.m8837a("multipart/form-data");
        f29331k = new byte[]{(byte) 58, (byte) 32};
        f29332l = new byte[]{(byte) 13, (byte) 10};
        byte b = (byte) 45;
        f29333m = new byte[]{b, b};
    }

    public MultipartBody(ByteString boundaryByteString, MediaType type, List<C11201b> parts) {
        C9612q.m13917h(boundaryByteString, "boundaryByteString");
        C9612q.m13917h(type, "type");
        C9612q.m13917h(parts, "parts");
        this.f29337c = boundaryByteString;
        this.f29338d = type;
        this.f29339e = parts;
        MediaType.C11199a c11199a = MediaType.f29321g;
        this.f29335a = c11199a.m8837a(type + "; boundary=" + m8835a());
        this.f29336b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final long m8834b(BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        if (z) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f29339e.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C11201b c11201b = this.f29339e.get(i);
            Headers m8828b = c11201b.m8828b();
            RequestBody m8829a = c11201b.m8829a();
            C9612q.m13920e(bufferedSink);
            bufferedSink.write(f29333m);
            bufferedSink.mo8602q0(this.f29337c);
            bufferedSink.write(f29332l);
            if (m8828b != null) {
                int size2 = m8828b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bufferedSink.mo8608K(m8828b.m8928e(i2)).write(f29331k).mo8608K(m8828b.m8924o(i2)).write(f29332l);
                }
            }
            MediaType contentType = m8829a.contentType();
            if (contentType != null) {
                bufferedSink.mo8608K("Content-Type: ").mo8608K(contentType.toString()).write(f29332l);
            }
            long contentLength = m8829a.contentLength();
            if (contentLength != -1) {
                bufferedSink.mo8608K("Content-Length: ").mo8605c0(contentLength).write(f29332l);
            } else if (z) {
                C9612q.m13920e(buffer);
                buffer.m8621j();
                return -1L;
            }
            byte[] bArr = f29332l;
            bufferedSink.write(bArr);
            if (z) {
                j += contentLength;
            } else {
                m8829a.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        C9612q.m13920e(bufferedSink);
        byte[] bArr2 = f29333m;
        bufferedSink.write(bArr2);
        bufferedSink.mo8602q0(this.f29337c);
        bufferedSink.write(bArr2);
        bufferedSink.write(f29332l);
        if (z) {
            C9612q.m13920e(buffer);
            long size3 = j + buffer.size();
            buffer.m8621j();
            return size3;
        }
        return j;
    }

    /* renamed from: a */
    public final String m8835a() {
        return this.f29337c.m8575D();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        long j = this.f29336b;
        if (j == -1) {
            long m8834b = m8834b(null, true);
            this.f29336b = m8834b;
            return m8834b;
        }
        return j;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f29335a;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) {
        C9612q.m13917h(sink, "sink");
        m8834b(sink, false);
    }

    @Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0019"}, m14357d2 = {"Lokhttp3/MultipartBody$Builder;", "", "Lokhttp3/MediaType;", "type", "d", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "a", "Lokhttp3/MultipartBody$b;", "part", "b", "Lokhttp3/MultipartBody;", "c", "Lokio/ByteString;", "Lokio/ByteString;", "boundary", "Lokhttp3/MediaType;", "", "Ljava/util/List;", "parts", "", "<init>", "(Ljava/lang/String;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Builder {

        /* renamed from: a */
        private final ByteString f29340a;

        /* renamed from: b */
        private MediaType f29341b;

        /* renamed from: c */
        private final List<C11201b> f29342c;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(String boundary) {
            C9612q.m13917h(boundary, "boundary");
            this.f29340a = ByteString.f29482n.m8547d(boundary);
            this.f29341b = MultipartBody.f29326f;
            this.f29342c = new ArrayList();
        }

        /* renamed from: a */
        public final Builder m8833a(Headers headers, RequestBody body) {
            C9612q.m13917h(body, "body");
            m8832b(C11201b.f29343c.m8827a(headers, body));
            return this;
        }

        /* renamed from: b */
        public final Builder m8832b(C11201b part) {
            C9612q.m13917h(part, "part");
            this.f29342c.add(part);
            return this;
        }

        /* renamed from: c */
        public final MultipartBody m8831c() {
            if (!this.f29342c.isEmpty()) {
                return new MultipartBody(this.f29340a, this.f29341b, C12562c.m4818R(this.f29342c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: d */
        public final Builder m8830d(MediaType type) {
            C9612q.m13917h(type, "type");
            if (C9612q.m13922c(type.m8838g(), "multipart")) {
                this.f29341b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                kotlin.jvm.internal.C9612q.m13918g(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
