package io.sentry.config;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8211a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* renamed from: io.sentry.config.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7882b {

    /* renamed from: a */
    private final String f21495a;

    /* renamed from: b */
    private final ClassLoader f21496b;

    /* renamed from: c */
    private final InterfaceC8040o0 f21497c;

    public C7882b(String str, ClassLoader classLoader, InterfaceC8040o0 interfaceC8040o0) {
        this.f21495a = str;
        this.f21496b = C8211a.m18240a(classLoader);
        this.f21497c = interfaceC8040o0;
    }

    /* renamed from: a */
    public Properties m19470a() {
        try {
            InputStream resourceAsStream = this.f21496b.getResourceAsStream(this.f21495a);
            if (resourceAsStream != null) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return null;
        } catch (IOException e) {
            this.f21497c.mo18137a(EnumC8021m4.ERROR, e, "Failed to load Sentry configuration from classpath resource: %s", this.f21495a);
            return null;
        }
    }

    public C7882b(InterfaceC8040o0 interfaceC8040o0) {
        this("sentry.properties", C7882b.class.getClassLoader(), interfaceC8040o0);
    }
}