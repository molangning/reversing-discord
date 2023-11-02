package p122gk;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;

@Metadata(m14358d1 = {"gk/n", "gk/o"}, m14357d2 = {}, m14356k = 4, m14355mv = {1, 4, 0})
/* renamed from: gk.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6840m {
    /* renamed from: a */
    public static final Sink m21832a(File file) {
        return C6841n.m21818b(file);
    }

    /* renamed from: b */
    public static final Sink m21831b() {
        return C6842o.m21809a();
    }

    /* renamed from: c */
    public static final BufferedSink m21830c(Sink sink) {
        return C6842o.m21808b(sink);
    }

    /* renamed from: d */
    public static final BufferedSource m21829d(Source source) {
        return C6842o.m21807c(source);
    }

    /* renamed from: e */
    public static final boolean m21828e(AssertionError assertionError) {
        return C6841n.m21817c(assertionError);
    }

    /* renamed from: f */
    public static final Sink m21827f(File file) {
        return C6841n.m21813g(file, false, 1, null);
    }

    /* renamed from: g */
    public static final Sink m21826g(File file, boolean z) {
        return C6841n.m21816d(file, z);
    }

    /* renamed from: h */
    public static final Sink m21825h(OutputStream outputStream) {
        return C6841n.m21815e(outputStream);
    }

    /* renamed from: i */
    public static final Sink m21824i(Socket socket) {
        return C6841n.m21814f(socket);
    }

    /* renamed from: k */
    public static final Source m21822k(File file) {
        return C6841n.m21812h(file);
    }

    /* renamed from: l */
    public static final Source m21821l(InputStream inputStream) {
        return C6841n.m21811i(inputStream);
    }

    /* renamed from: m */
    public static final Source m21820m(Socket socket) {
        return C6841n.m21810j(socket);
    }
}
