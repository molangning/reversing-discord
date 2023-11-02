package net.time4j.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ServiceLoader;

/* renamed from: net.time4j.base.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC10617d {

    /* renamed from: a */
    private static final boolean f27699a;

    /* renamed from: b */
    private static final AbstractC10617d f27700b;

    /* renamed from: c */
    private static final boolean f27701c;

    /* renamed from: net.time4j.base.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10618a extends AbstractC10617d {
        C10618a() {
            if (!AbstractC10617d.f27699a) {
                return;
            }
            throw new IllegalStateException("The module time4j-android is not active. Check your configuration.");
        }

        @Override // net.time4j.base.AbstractC10617d
        /* renamed from: e */
        public InputStream mo11024e(URI uri, boolean z) {
            if (uri != null && !AbstractC10617d.f27701c) {
                try {
                    URL url = uri.toURL();
                    if (z) {
                        URLConnection openConnection = url.openConnection();
                        openConnection.setUseCaches(false);
                        openConnection.connect();
                        return openConnection.getInputStream();
                    }
                    return url.openStream();
                } catch (IOException e) {
                    if (uri.toString().contains(".repository")) {
                        PrintStream printStream = System.err;
                        printStream.println("Warning: Loading of resource " + uri + " failed (" + e.getMessage() + "). Consider setting the system property \"net.time4j.base.useClassloaderOnly\" for reducing overhead.");
                        e.printStackTrace(System.err);
                    }
                }
            }
            return null;
        }

        @Override // net.time4j.base.AbstractC10617d
        /* renamed from: f */
        public URI mo11023f(String str, Class<?> cls, String str2) {
            String str3;
            CodeSource codeSource;
            try {
                try {
                    ProtectionDomain protectionDomain = cls.getProtectionDomain();
                    if (protectionDomain == null) {
                        codeSource = null;
                    } else {
                        codeSource = protectionDomain.getCodeSource();
                    }
                    if (codeSource != null) {
                        String externalForm = codeSource.getLocation().toExternalForm();
                        try {
                            if (externalForm.endsWith(".jar")) {
                                externalForm = "jar:" + externalForm + "!/";
                            }
                            str3 = externalForm + str2;
                            return new URI(str3);
                        } catch (URISyntaxException unused) {
                            System.err.println("Warning: malformed resource path = " + str3);
                            return null;
                        }
                    }
                } catch (URISyntaxException unused2) {
                    str3 = null;
                }
            } catch (SecurityException unused3) {
            }
            return null;
        }

        @Override // net.time4j.base.AbstractC10617d
        /* renamed from: g */
        public <S> Iterable<S> mo11022g(Class<S> cls) {
            return ServiceLoader.load(cls, cls.getClassLoader());
        }
    }

    static {
        boolean z;
        boolean equalsIgnoreCase = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
        f27699a = equalsIgnoreCase;
        if (!equalsIgnoreCase && Boolean.getBoolean("net.time4j.base.useClassloaderOnly")) {
            z = true;
        } else {
            z = false;
        }
        f27701c = z;
        String property = System.getProperty("net.time4j.base.ResourceLoader");
        if (property == null) {
            f27700b = new C10618a();
            return;
        }
        try {
            f27700b = (AbstractC10617d) Class.forName(property).newInstance();
        } catch (Exception e) {
            throw new AssertionError("Wrong configuration of external resource loader: " + e.getMessage());
        }
    }

    /* renamed from: c */
    public static AbstractC10617d m11026c() {
        return f27700b;
    }

    /* renamed from: d */
    public final InputStream m11025d(Class<?> cls, String str, boolean z) {
        if (!f27699a) {
            URL resource = cls.getClassLoader().getResource(str);
            if (resource != null) {
                if (z) {
                    URLConnection openConnection = resource.openConnection();
                    openConnection.setUseCaches(false);
                    openConnection.connect();
                    return openConnection.getInputStream();
                }
                return resource.openStream();
            }
            throw new FileNotFoundException(str);
        }
        throw new FileNotFoundException(str);
    }

    /* renamed from: e */
    public abstract InputStream mo11024e(URI uri, boolean z);

    /* renamed from: f */
    public abstract URI mo11023f(String str, Class<?> cls, String str2);

    /* renamed from: g */
    public abstract <S> Iterable<S> mo11022g(Class<S> cls);
}