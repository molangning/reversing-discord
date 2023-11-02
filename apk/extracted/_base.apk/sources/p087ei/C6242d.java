package p087ei;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.C9612q;

/* renamed from: ei.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6242d {
    /* renamed from: a */
    public final InputStream m23172a(String path) {
        C9612q.m13917h(path, "path");
        ClassLoader classLoader = C6242d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(path);
        }
        URL resource = classLoader.getResource(path);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
