package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.internal.debugmeta.InterfaceC7977a;
import io.sentry.util.C8213c;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/* renamed from: io.sentry.android.core.internal.debugmeta.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7738a implements InterfaceC7977a {

    /* renamed from: a */
    private final Context f21204a;

    /* renamed from: b */
    private final InterfaceC8040o0 f21205b;

    public C7738a(Context context, InterfaceC8040o0 interfaceC8040o0) {
        this.f21204a = context;
        this.f21205b = interfaceC8040o0;
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC7977a
    /* renamed from: a */
    public Properties mo19108a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f21204a.getAssets().open(C8213c.f22142a));
            Properties properties = new Properties();
            properties.load(bufferedInputStream);
            bufferedInputStream.close();
            return properties;
        } catch (FileNotFoundException e) {
            this.f21205b.mo18137a(EnumC8021m4.INFO, e, "%s file was not found.", C8213c.f22142a);
            return null;
        } catch (IOException e2) {
            this.f21205b.mo18136b(EnumC8021m4.ERROR, "Error getting Proguard UUIDs.", e2);
            return null;
        } catch (RuntimeException e3) {
            this.f21205b.mo18137a(EnumC8021m4.ERROR, e3, "%s file is malformed.", C8213c.f22142a);
            return null;
        }
    }
}
