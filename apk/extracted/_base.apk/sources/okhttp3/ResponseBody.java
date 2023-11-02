package okhttp3;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9610o;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p355ti.C12785a;
import p467zf.C14180c;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, m14357d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "", "T", "Lkotlin/Function1;", "Lokio/BufferedSource;", "consumer", "", "sizeMapper", "consumeSource", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "source", "", "bytes", "Lokio/ByteString;", "byteString", "Ljava/io/Reader;", "charStream", "", "string", "", "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\"\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¨\u0006\u001a"}, m14357d2 = {"Lokhttp3/ResponseBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "", "h", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/ByteString;", "g", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/BufferedSource;", "", "contentLength", "f", "(Lokio/BufferedSource;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "content", "c", "e", "d", "b", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {

        @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, m14357d2 = {"okhttp3/ResponseBody$Companion$a", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSource;", "source", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: okhttp3.ResponseBody$Companion$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class C11208a extends ResponseBody {

            /* renamed from: j */
            final /* synthetic */ BufferedSource f29455j;

            /* renamed from: k */
            final /* synthetic */ MediaType f29456k;

            /* renamed from: l */
            final /* synthetic */ long f29457l;

            C11208a(BufferedSource bufferedSource, MediaType mediaType, long j) {
                this.f29455j = bufferedSource;
                this.f29456k = mediaType;
                this.f29457l = j;
            }

            @Override // okhttp3.ResponseBody
            public long contentLength() {
                return this.f29457l;
            }

            @Override // okhttp3.ResponseBody
            public MediaType contentType() {
                return this.f29456k;
            }

            @Override // okhttp3.ResponseBody
            public BufferedSource source() {
                return this.f29455j;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ ResponseBody m8662i(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.m8663h(bArr, mediaType);
        }

        /* renamed from: a */
        public final ResponseBody m8670a(String toResponseBody, MediaType mediaType) {
            C9612q.m13917h(toResponseBody, "$this$toResponseBody");
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
            Buffer m8633M0 = new Buffer().m8633M0(toResponseBody, charset);
            return m8665f(m8633M0, mediaType, m8633M0.size());
        }

        /* renamed from: b */
        public final ResponseBody m8669b(MediaType mediaType, long j, BufferedSource content) {
            C9612q.m13917h(content, "content");
            return m8665f(content, mediaType, j);
        }

        /* renamed from: c */
        public final ResponseBody m8668c(MediaType mediaType, String content) {
            C9612q.m13917h(content, "content");
            return m8670a(content, mediaType);
        }

        /* renamed from: d */
        public final ResponseBody m8667d(MediaType mediaType, ByteString content) {
            C9612q.m13917h(content, "content");
            return m8664g(content, mediaType);
        }

        /* renamed from: e */
        public final ResponseBody m8666e(MediaType mediaType, byte[] content) {
            C9612q.m13917h(content, "content");
            return m8663h(content, mediaType);
        }

        /* renamed from: f */
        public final ResponseBody m8665f(BufferedSource asResponseBody, MediaType mediaType, long j) {
            C9612q.m13917h(asResponseBody, "$this$asResponseBody");
            return new C11208a(asResponseBody, mediaType, j);
        }

        /* renamed from: g */
        public final ResponseBody m8664g(ByteString toResponseBody, MediaType mediaType) {
            C9612q.m13917h(toResponseBody, "$this$toResponseBody");
            return m8665f(new Buffer().mo8602q0(toResponseBody), mediaType, toResponseBody.m8551z());
        }

        /* renamed from: h */
        public final ResponseBody m8663h(byte[] toResponseBody, MediaType mediaType) {
            C9612q.m13917h(toResponseBody, "$this$toResponseBody");
            return m8665f(new Buffer().write(toResponseBody), mediaType, toResponseBody.length);
        }
    }

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m14357d2 = {"Lokhttp3/ResponseBody$a;", "Ljava/io/Reader;", "", "cbuf", "", "off", "len", "read", "", "close", "", "j", "Z", "closed", "k", "Ljava/io/Reader;", "delegate", "Lokio/BufferedSource;", "l", "Lokio/BufferedSource;", "source", "Ljava/nio/charset/Charset;", "m", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.ResponseBody$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11209a extends Reader {

        /* renamed from: j */
        private boolean f29458j;

        /* renamed from: k */
        private Reader f29459k;

        /* renamed from: l */
        private final BufferedSource f29460l;

        /* renamed from: m */
        private final Charset f29461m;

        public C11209a(BufferedSource source, Charset charset) {
            C9612q.m13917h(source, "source");
            C9612q.m13917h(charset, "charset");
            this.f29460l = source;
            this.f29461m = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f29458j = true;
            Reader reader = this.f29459k;
            if (reader != null) {
                reader.close();
            } else {
                this.f29460l.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i, int i2) {
            C9612q.m13917h(cbuf, "cbuf");
            if (!this.f29458j) {
                Reader reader = this.f29459k;
                if (reader == null) {
                    reader = new InputStreamReader(this.f29460l.mo8579z0(), C12562c.m4829G(this.f29460l, this.f29461m));
                    this.f29459k = reader;
                }
                return reader.read(cbuf, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private final Charset charset() {
        Charset m8842c;
        MediaType contentType = contentType();
        return (contentType == null || (m8842c = contentType.m8842c(C12785a.f33142b)) == null) ? C12785a.f33142b : m8842c;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(Function1<? super BufferedSource, ? extends T> function1, Function1<? super T, Integer> function12) {
        long contentLength = contentLength();
        if (contentLength <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            BufferedSource source = source();
            try {
                T invoke = function1.invoke(source);
                C9610o.m13925b(1);
                C14180c.m514a(source, null);
                C9610o.m13926a(1);
                int intValue = function12.invoke(invoke).intValue();
                if (contentLength != -1 && contentLength != intValue) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
                }
                return invoke;
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.m8670a(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, BufferedSource bufferedSource) {
        return Companion.m8669b(mediaType, j, bufferedSource);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.m8668c(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.m8667d(mediaType, byteString);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.m8666e(mediaType, bArr);
    }

    public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j) {
        return Companion.m8665f(bufferedSource, mediaType, j);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.m8664g(byteString, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.m8663h(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().mo8579z0();
    }

    public final ByteString byteString() {
        long contentLength = contentLength();
        if (contentLength <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            BufferedSource source = source();
            try {
                ByteString mo8586o0 = source.mo8586o0();
                C14180c.m514a(source, null);
                int m8551z = mo8586o0.m8551z();
                if (contentLength != -1 && contentLength != m8551z) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + m8551z + ") disagree");
                }
                return mo8586o0;
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            BufferedSource source = source();
            try {
                byte[] mo8591f0 = source.mo8591f0();
                C14180c.m514a(source, null);
                int length = mo8591f0.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return mo8591f0;
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            C11209a c11209a = new C11209a(source(), charset());
            this.reader = c11209a;
            return c11209a;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C12562c.m4801j(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() {
        BufferedSource source = source();
        try {
            String mo8587l0 = source.mo8587l0(C12562c.m4829G(source, charset()));
            C14180c.m514a(source, null);
            return mo8587l0;
        } finally {
        }
    }
}
