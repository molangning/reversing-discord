package io.sentry.config;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: io.sentry.config.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7885e {

    /* renamed from: a */
    private final String f21499a;

    /* renamed from: b */
    private final InterfaceC8040o0 f21500b;

    public C7885e(String str, InterfaceC8040o0 interfaceC8040o0) {
        this.f21499a = str;
        this.f21500b = interfaceC8040o0;
    }

    /* renamed from: a */
    public Properties m19468a() {
        try {
            File file = new File(this.f21499a);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            Properties properties = new Properties();
            properties.load(bufferedInputStream);
            bufferedInputStream.close();
            return properties;
        } catch (IOException e) {
            this.f21500b.mo18137a(EnumC8021m4.ERROR, e, "Failed to load Sentry configuration from file: %s", this.f21499a);
            return null;
        }
    }
}