package io.sentry.android.core.cache;

import io.sentry.C7831b0;
import io.sentry.C8020m3;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.C7792m0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C7758a;
import io.sentry.cache.C7850e;
import io.sentry.transport.InterfaceC8189o;
import io.sentry.util.C8215e;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: io.sentry.android.core.cache.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7717b extends C7850e {

    /* renamed from: q */
    private final InterfaceC8189o f21172q;

    public C7717b(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, C7758a.m19779b());
    }

    /* renamed from: M */
    public static boolean m19912M(C8132r4 c8132r4) {
        String outboxPath = c8132r4.getOutboxPath();
        if (outboxPath == null) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean exists = file.exists();
            if (exists && !file.delete()) {
                c8132r4.getLogger().mo18135c(EnumC8021m4.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            }
            return exists;
        } catch (Throwable th2) {
            c8132r4.getLogger().mo18136b(EnumC8021m4.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            return false;
        }
    }

    /* renamed from: N */
    public /* synthetic */ void m19911N(SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.C7694b c7694b) {
        Long mo19154c = c7694b.mo19154c();
        sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "Writing last reported ANR marker with timestamp %d", mo19154c);
        m19909P(mo19154c);
    }

    /* renamed from: O */
    public static Long m19910O(C8132r4 c8132r4) {
        File file = new File((String) C8229o.m18169c(c8132r4.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
        } catch (Throwable th2) {
            c8132r4.getLogger().mo18136b(EnumC8021m4.ERROR, "Error reading last ANR marker", th2);
        }
        if (file.exists() && file.canRead()) {
            String m18230b = C8215e.m18230b(file);
            if (m18230b.equals("null")) {
                return null;
            }
            return Long.valueOf(Long.parseLong(m18230b.trim()));
        }
        c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
        return null;
    }

    /* renamed from: P */
    private void m19909P(Long l) {
        String cacheDirPath = this.f21440j.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            fileOutputStream.write(String.valueOf(l).getBytes(f21439n));
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, "Error writing the ANR marker to the disk", th2);
        }
    }

    /* renamed from: Q */
    private void m19908Q() {
        String outboxPath = this.f21440j.getOutboxPath();
        if (outboxPath == null) {
            this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th2) {
            this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, "Error writing the startup crash marker file to the disk", th2);
        }
    }

    @Override // io.sentry.cache.C7850e, io.sentry.cache.InterfaceC7851f
    /* renamed from: m */
    public void mo18300m(C8020m3 c8020m3, C7831b0 c7831b0) {
        super.mo18300m(c8020m3, c7831b0);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f21440j;
        Long m19725c = C7792m0.m19723e().m19725c();
        if (C8220j.m18222h(c7831b0, UncaughtExceptionHandlerIntegration.C7683a.class) && m19725c != null) {
            long mo18303a = this.f21172q.mo18303a() - m19725c.longValue();
            if (mo18303a <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(mo18303a));
                m19908Q();
            }
        }
        C8220j.m18215o(c7831b0, AnrV2Integration.C7694b.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.util.C8220j.InterfaceC8221a
            public final void accept(Object obj) {
                C7717b.this.m19911N(sentryAndroidOptions, (AnrV2Integration.C7694b) obj);
            }
        });
    }

    C7717b(SentryAndroidOptions sentryAndroidOptions, InterfaceC8189o interfaceC8189o) {
        super(sentryAndroidOptions, (String) C8229o.m18169c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f21172q = interfaceC8189o;
    }
}