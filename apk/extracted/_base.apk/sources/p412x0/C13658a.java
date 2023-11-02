package p412x0;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* renamed from: x0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13658a {

    /* renamed from: a */
    private Context f35131a;

    public C13658a(Context context) {
        this.f35131a = context;
    }

    /* renamed from: a */
    public static String m1914a(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith("/")) {
            return canonicalPath + "/";
        }
        return canonicalPath;
    }

    /* renamed from: b */
    public static File m1913b(File file, String str) {
        String m1914a = m1914a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(m1914a)) {
            return new File(canonicalPath);
        }
        return null;
    }

    /* renamed from: c */
    public static File m1912c(Context context) {
        File dataDir;
        if (Build.VERSION.SDK_INT >= 24) {
            dataDir = context.getDataDir();
            return dataDir;
        }
        return context.getCacheDir().getParentFile();
    }

    /* renamed from: d */
    private int m1911d(String str, String str2) {
        return this.f35131a.getResources().getIdentifier(str2, str, this.f35131a.getPackageName());
    }

    /* renamed from: e */
    private int m1910e(int i) {
        TypedValue typedValue = new TypedValue();
        this.f35131a.getResources().getValue(i, typedValue, true);
        return typedValue.type;
    }

    /* renamed from: f */
    public static String m1909f(String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return guessContentTypeFromName == null ? "text/plain" : guessContentTypeFromName;
    }

    /* renamed from: g */
    private static InputStream m1908g(String str, InputStream inputStream) {
        if (str.endsWith(".svgz")) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: i */
    public static InputStream m1906i(File file) {
        return m1908g(file.getPath(), new FileInputStream(file));
    }

    /* renamed from: k */
    private static String m1904k(String str) {
        if (str.length() > 1 && str.charAt(0) == '/') {
            return str.substring(1);
        }
        return str;
    }

    /* renamed from: h */
    public InputStream m1907h(String str) {
        String m1904k = m1904k(str);
        return m1908g(m1904k, this.f35131a.getAssets().open(m1904k, 2));
    }

    /* renamed from: j */
    public InputStream m1905j(String str) {
        String m1904k = m1904k(str);
        String[] split = m1904k.split("/", -1);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            int lastIndexOf = str3.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str3.substring(0, lastIndexOf);
            }
            int m1911d = m1911d(str2, str3);
            int m1910e = m1910e(m1911d);
            if (m1910e == 3) {
                return m1908g(m1904k, this.f35131a.getResources().openRawResource(m1911d));
            }
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", m1904k, Integer.valueOf(m1910e)));
        }
        throw new IllegalArgumentException("Incorrect resource path: " + m1904k);
    }
}
