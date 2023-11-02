package p122gk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import okio.Sink;
import okio.Source;
import okio.Timeout;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\u0004*\u00020\t\"\"\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001c\u0010\u001a\u001a\u00020\n*\u00060\u0016j\u0002`\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m14357d2 = {"Ljava/io/OutputStream;", "Lokio/Sink;", "e", "Ljava/io/InputStream;", "Lokio/Source;", "i", "Ljava/net/Socket;", "f", "j", "Ljava/io/File;", "", "append", "d", "b", "h", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "getLogger$Okio__JvmOkioKt", "()Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "c", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, m14356k = 5, m14355mv = {1, 4, 0}, m14352xs = "okio/Okio")
/* renamed from: gk.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final /* synthetic */ class C6841n {

    /* renamed from: a */
    private static final Logger f19055a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final Sink m21818b(File appendingSink) {
        C9612q.m13917h(appendingSink, "$this$appendingSink");
        return C6840m.m21825h(new FileOutputStream(appendingSink, true));
    }

    /* renamed from: c */
    public static final boolean m21817c(AssertionError isAndroidGetsocknameError) {
        boolean z;
        C9612q.m13917h(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        if (isAndroidGetsocknameError.getCause() == null) {
            return false;
        }
        String message = isAndroidGetsocknameError.getMessage();
        if (message != null) {
            z = C9654p.m13731M(message, "getsockname failed", false, 2, null);
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final Sink m21816d(File sink, boolean z) {
        C9612q.m13917h(sink, "$this$sink");
        return C6840m.m21825h(new FileOutputStream(sink, z));
    }

    /* renamed from: e */
    public static final Sink m21815e(OutputStream sink) {
        C9612q.m13917h(sink, "$this$sink");
        return new C6845q(sink, new Timeout());
    }

    /* renamed from: f */
    public static final Sink m21814f(Socket sink) {
        C9612q.m13917h(sink, "$this$sink");
        C6855x c6855x = new C6855x(sink);
        OutputStream outputStream = sink.getOutputStream();
        C9612q.m13918g(outputStream, "getOutputStream()");
        return c6855x.m8523v(new C6845q(outputStream, c6855x));
    }

    /* renamed from: g */
    public static /* synthetic */ Sink m21813g(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return C6840m.m21826g(file, z);
    }

    /* renamed from: h */
    public static final Source m21812h(File source) {
        C9612q.m13917h(source, "$this$source");
        return C6840m.m21821l(new FileInputStream(source));
    }

    /* renamed from: i */
    public static final Source m21811i(InputStream source) {
        C9612q.m13917h(source, "$this$source");
        return new C6839l(source, new Timeout());
    }

    /* renamed from: j */
    public static final Source m21810j(Socket source) {
        C9612q.m13917h(source, "$this$source");
        C6855x c6855x = new C6855x(source);
        InputStream inputStream = source.getInputStream();
        C9612q.m13918g(inputStream, "getInputStream()");
        return c6855x.m8522w(new C6839l(inputStream, c6855x));
    }
}