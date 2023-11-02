package okhttp3;

import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okio.BufferedSink;
import okio.ByteString;
import okio.Source;
import p122gk.C6840m;
import p355ti.C12785a;
import p467zf.C14180c;
import sj.C12562c;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, m14357d2 = {"Lokhttp3/RequestBody;", "", "()V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "isDuplex", "", "isOneShot", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0007J.\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0011H\u0007¨\u0006\u001c"}, m14357d2 = {"Lokhttp3/RequestBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "b", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "Lokio/ByteString;", "g", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "h", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "a", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "content", "d", "e", "f", JSStackTrace.FILE_KEY, "c", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {

        @Metadata(m14358d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, m14357d2 = {"okhttp3/RequestBody$Companion$a", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: okhttp3.RequestBody$Companion$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C11204a extends RequestBody {

            /* renamed from: a */
            final /* synthetic */ File f29420a;

            /* renamed from: b */
            final /* synthetic */ MediaType f29421b;

            C11204a(File file, MediaType mediaType) {
                this.f29420a = file;
                this.f29421b = mediaType;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f29420a.length();
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return this.f29421b;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink sink) {
                C9612q.m13917h(sink, "sink");
                Source m21822k = C6840m.m21822k(this.f29420a);
                try {
                    sink.mo8606O(m21822k);
                    C14180c.m514a(m21822k, null);
                } finally {
                }
            }
        }

        @Metadata(m14358d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, m14357d2 = {"okhttp3/RequestBody$Companion$b", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: okhttp3.RequestBody$Companion$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C11205b extends RequestBody {

            /* renamed from: a */
            final /* synthetic */ ByteString f29422a;

            /* renamed from: b */
            final /* synthetic */ MediaType f29423b;

            C11205b(ByteString byteString, MediaType mediaType) {
                this.f29422a = byteString;
                this.f29423b = mediaType;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f29422a.m8551z();
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return this.f29423b;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink sink) {
                C9612q.m13917h(sink, "sink");
                sink.mo8602q0(this.f29422a);
            }
        }

        @Metadata(m14358d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, m14357d2 = {"okhttp3/RequestBody$Companion$c", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: okhttp3.RequestBody$Companion$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C11206c extends RequestBody {

            /* renamed from: a */
            final /* synthetic */ byte[] f29424a;

            /* renamed from: b */
            final /* synthetic */ MediaType f29425b;

            /* renamed from: c */
            final /* synthetic */ int f29426c;

            /* renamed from: d */
            final /* synthetic */ int f29427d;

            C11206c(byte[] bArr, MediaType mediaType, int i, int i2) {
                this.f29424a = bArr;
                this.f29425b = mediaType;
                this.f29426c = i;
                this.f29427d = i2;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f29426c;
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return this.f29425b;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink sink) {
                C9612q.m13917h(sink, "sink");
                sink.write(this.f29424a, this.f29427d, this.f29426c);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ RequestBody m8712i(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.m8715f(mediaType, bArr, i, i2);
        }

        /* renamed from: j */
        public static /* synthetic */ RequestBody m8711j(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.m8713h(bArr, mediaType, i, i2);
        }

        /* renamed from: a */
        public final RequestBody m8720a(File asRequestBody, MediaType mediaType) {
            C9612q.m13917h(asRequestBody, "$this$asRequestBody");
            return new C11204a(asRequestBody, mediaType);
        }

        /* renamed from: b */
        public final RequestBody m8719b(String toRequestBody, MediaType mediaType) {
            C9612q.m13917h(toRequestBody, "$this$toRequestBody");
            Charset charset = C12785a.f33142b;
            if (mediaType != null) {
                Charset m8841d = MediaType.m8841d(mediaType, null, 1, null);
                if (m8841d == null) {
                    MediaType.C11199a c11199a = MediaType.f29321g;
                    mediaType = c11199a.m8836b(mediaType + "; charset=utf-8");
                } else {
                    charset = m8841d;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            C9612q.m13918g(bytes, "(this as java.lang.String).getBytes(charset)");
            return m8713h(bytes, mediaType, 0, bytes.length);
        }

        /* renamed from: c */
        public final RequestBody m8718c(MediaType mediaType, File file) {
            C9612q.m13917h(file, "file");
            return m8720a(file, mediaType);
        }

        /* renamed from: d */
        public final RequestBody m8717d(MediaType mediaType, String content) {
            C9612q.m13917h(content, "content");
            return m8719b(content, mediaType);
        }

        /* renamed from: e */
        public final RequestBody m8716e(MediaType mediaType, ByteString content) {
            C9612q.m13917h(content, "content");
            return m8714g(content, mediaType);
        }

        /* renamed from: f */
        public final RequestBody m8715f(MediaType mediaType, byte[] content, int i, int i2) {
            C9612q.m13917h(content, "content");
            return m8713h(content, mediaType, i, i2);
        }

        /* renamed from: g */
        public final RequestBody m8714g(ByteString toRequestBody, MediaType mediaType) {
            C9612q.m13917h(toRequestBody, "$this$toRequestBody");
            return new C11205b(toRequestBody, mediaType);
        }

        /* renamed from: h */
        public final RequestBody m8713h(byte[] toRequestBody, MediaType mediaType, int i, int i2) {
            C9612q.m13917h(toRequestBody, "$this$toRequestBody");
            C12562c.m4802i(toRequestBody.length, i, i2);
            return new C11206c(toRequestBody, mediaType, i2, i);
        }
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.m8720a(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.m8719b(str, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.m8718c(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.m8717d(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return Companion.m8716e(mediaType, byteString);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.m8712i(Companion, mediaType, bArr, 0, 0, 12, null);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        return Companion.m8712i(Companion, mediaType, bArr, i, 0, 8, null);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        return Companion.m8715f(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return Companion.m8714g(byteString, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.m8711j(Companion, bArr, null, 0, 0, 7, null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.m8711j(Companion, bArr, mediaType, 0, 0, 6, null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        return Companion.m8711j(Companion, bArr, mediaType, i, 0, 4, null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        return Companion.m8713h(bArr, mediaType, i, i2);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);
}