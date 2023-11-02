package p394w2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: w2.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13368b {

    /* renamed from: a */
    static final Logger f34455a = Logger.getLogger(C13368b.class.getName());

    private C13368b() {
    }

    /* renamed from: a */
    public static void m2700a(Closeable closeable, boolean z) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            if (z) {
                f34455a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                return;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public static void m2699b(InputStream inputStream) {
        try {
            m2700a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
