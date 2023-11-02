package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.C7896d3;
import io.sentry.C8004k4;
import io.sentry.EnumC8021m4;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SentryInitProvider extends AbstractC7816v0 {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (!SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C7809t c7809t = new C7809t();
        Context context = getContext();
        if (context == null) {
            c7809t.mo18135c(EnumC8021m4.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        } else if (C7726f1.m19865c(context, c7809t)) {
            C7793m1.m19714d(context, c7809t);
            C8004k4.m19025c().m19027a("AutoInit");
            return true;
        } else {
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        C7896d3.m19415j();
    }
}
