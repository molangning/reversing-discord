package p392w0;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p412x0.C13658a;

/* renamed from: w0.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C13356c {

    /* renamed from: a */
    private final List<C13361e> f34440a;

    /* renamed from: w0.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C13357a implements InterfaceC13360d {

        /* renamed from: a */
        private C13658a f34441a;

        public C13357a(Context context) {
            this.f34441a = new C13658a(context);
        }

        @Override // p392w0.C13356c.InterfaceC13360d
        /* renamed from: a */
        public WebResourceResponse mo2706a(String str) {
            try {
                return new WebResourceResponse(C13658a.m1909f(str), null, this.f34441a.m1907h(str));
            } catch (IOException e) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    /* renamed from: w0.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C13358b {

        /* renamed from: a */
        private boolean f34442a = false;

        /* renamed from: b */
        private String f34443b = "appassets.androidplatform.net";

        /* renamed from: c */
        private List<C13361e> f34444c = new ArrayList();

        /* renamed from: a */
        public C13358b m2713a(String str, InterfaceC13360d interfaceC13360d) {
            this.f34444c.add(new C13361e(this.f34443b, str, this.f34442a, interfaceC13360d));
            return this;
        }

        /* renamed from: b */
        public C13356c m2712b() {
            return new C13356c(this.f34444c);
        }

        /* renamed from: c */
        public C13358b m2711c(String str) {
            this.f34443b = str;
            return this;
        }

        /* renamed from: d */
        public C13358b m2710d(boolean z) {
            this.f34442a = z;
            return this;
        }
    }

    /* renamed from: w0.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C13359c implements InterfaceC13360d {

        /* renamed from: b */
        private static final String[] f34445b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a */
        private final File f34446a;

        public C13359c(Context context, File file) {
            try {
                this.f34446a = new File(C13658a.m1914a(file));
                if (m2709b(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
            }
        }

        /* renamed from: b */
        private boolean m2709b(Context context) {
            String m1914a = C13658a.m1914a(this.f34446a);
            String m1914a2 = C13658a.m1914a(context.getCacheDir());
            String m1914a3 = C13658a.m1914a(C13658a.m1912c(context));
            if ((!m1914a.startsWith(m1914a2) && !m1914a.startsWith(m1914a3)) || m1914a.equals(m1914a2) || m1914a.equals(m1914a3)) {
                return false;
            }
            for (String str : f34445b) {
                if (m1914a.startsWith(m1914a3 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p392w0.C13356c.InterfaceC13360d
        /* renamed from: a */
        public WebResourceResponse mo2706a(String str) {
            File m1913b;
            try {
                m1913b = C13658a.m1913b(this.f34446a, str);
            } catch (IOException e) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e);
            }
            if (m1913b != null) {
                return new WebResourceResponse(C13658a.m1909f(str), null, C13658a.m1906i(m1913b));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f34446a));
            return new WebResourceResponse(null, null, null);
        }
    }

    /* renamed from: w0.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC13360d {
        /* renamed from: a */
        WebResourceResponse mo2706a(String str);
    }

    /* renamed from: w0.c$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C13361e {

        /* renamed from: a */
        final boolean f34447a;

        /* renamed from: b */
        final String f34448b;

        /* renamed from: c */
        final String f34449c;

        /* renamed from: d */
        final InterfaceC13360d f34450d;

        C13361e(String str, String str2, boolean z, InterfaceC13360d interfaceC13360d) {
            if (!str2.isEmpty() && str2.charAt(0) == '/') {
                if (str2.endsWith("/")) {
                    this.f34448b = str;
                    this.f34449c = str2;
                    this.f34447a = z;
                    this.f34450d = interfaceC13360d;
                    return;
                }
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }

        /* renamed from: a */
        public String m2708a(String str) {
            return str.replaceFirst(this.f34449c, "");
        }

        /* renamed from: b */
        public InterfaceC13360d m2707b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f34447a) {
                return null;
            }
            if ((!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) || !uri.getAuthority().equals(this.f34448b) || !uri.getPath().startsWith(this.f34449c)) {
                return null;
            }
            return this.f34450d;
        }
    }

    /* renamed from: w0.c$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C13362f implements InterfaceC13360d {

        /* renamed from: a */
        private C13658a f34451a;

        public C13362f(Context context) {
            this.f34451a = new C13658a(context);
        }

        @Override // p392w0.C13356c.InterfaceC13360d
        /* renamed from: a */
        public WebResourceResponse mo2706a(String str) {
            try {
                return new WebResourceResponse(C13658a.m1909f(str), null, this.f34451a.m1905j(str));
            } catch (Resources.NotFoundException e) {
                Log.e("WebViewAssetLoader", "Resource not found from the path: " + str, e);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e2) {
                Log.e("WebViewAssetLoader", "Error opening resource from the path: " + str, e2);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    C13356c(List<C13361e> list) {
        this.f34440a = list;
    }

    /* renamed from: a */
    public WebResourceResponse m2714a(Uri uri) {
        WebResourceResponse mo2706a;
        for (C13361e c13361e : this.f34440a) {
            InterfaceC13360d m2707b = c13361e.m2707b(uri);
            if (m2707b != null && (mo2706a = m2707b.mo2706a(c13361e.m2708a(uri.getPath()))) != null) {
                return mo2706a;
            }
        }
        return null;
    }
}
