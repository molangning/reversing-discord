package io.sentry.internal.debugmeta;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8211a;
import io.sentry.util.C8213c;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* renamed from: io.sentry.internal.debugmeta.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7979c implements InterfaceC7977a {

    /* renamed from: a */
    private final InterfaceC8040o0 f21649a;

    /* renamed from: b */
    private final ClassLoader f21650b;

    public C7979c(InterfaceC8040o0 interfaceC8040o0) {
        this(interfaceC8040o0, C7979c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC7977a
    /* renamed from: a */
    public Properties mo19108a() {
        InputStream resourceAsStream = this.f21650b.getResourceAsStream(C8213c.f22142a);
        if (resourceAsStream == null) {
            this.f21649a.mo18135c(EnumC8021m4.INFO, "%s file was not found.", C8213c.f22142a);
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e) {
            this.f21649a.mo18137a(EnumC8021m4.ERROR, e, "Failed to load %s", C8213c.f22142a);
            return null;
        } catch (RuntimeException e2) {
            this.f21649a.mo18137a(EnumC8021m4.ERROR, e2, "%s file is malformed.", C8213c.f22142a);
            return null;
        }
    }

    C7979c(InterfaceC8040o0 interfaceC8040o0, ClassLoader classLoader) {
        this.f21649a = interfaceC8040o0;
        this.f21650b = C8211a.m18240a(classLoader);
    }
}
