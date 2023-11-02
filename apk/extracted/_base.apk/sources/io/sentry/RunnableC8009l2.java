package io.sentry;

import io.sentry.C7836b5;
import io.sentry.cache.C7850e;
import io.sentry.cache.InterfaceC7851f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* renamed from: io.sentry.l2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC8009l2 implements Runnable {

    /* renamed from: l */
    private static final Charset f21695l = Charset.forName("UTF-8");

    /* renamed from: j */
    private final C8132r4 f21696j;

    /* renamed from: k */
    private final InterfaceC8025n0 f21697k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC8009l2(C8132r4 c8132r4, InterfaceC8025n0 interfaceC8025n0) {
        this.f21696j = c8132r4;
        this.f21697k = interfaceC8025n0;
    }

    /* renamed from: a */
    private Date m19009a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f21695l));
            String readLine = bufferedReader.readLine();
            this.f21696j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Crash marker file has %s timestamp.", readLine);
            Date m19086e = C7991j.m19086e(readLine);
            bufferedReader.close();
            return m19086e;
        } catch (IOException e) {
            this.f21696j.getLogger().mo18136b(EnumC8021m4.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            this.f21696j.getLogger().mo18137a(EnumC8021m4.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f21696j.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f21696j.getLogger().mo18135c(EnumC8021m4.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
        } else if (!this.f21696j.isEnableAutoSessionTracking()) {
            this.f21696j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
        } else {
            InterfaceC7851f envelopeDiskCache = this.f21696j.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof C7850e) && !((C7850e) envelopeDiskCache).m19541H()) {
                this.f21696j.getLogger().mo18135c(EnumC8021m4.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
                return;
            }
            File m19545D = C7850e.m19545D(cacheDirPath);
            InterfaceC8243v0 serializer = this.f21696j.getSerializer();
            if (m19545D.exists()) {
                this.f21696j.getLogger().mo18135c(EnumC8021m4.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(m19545D), f21695l));
                    C7836b5 c7836b5 = (C7836b5) serializer.mo17982c(bufferedReader, C7836b5.class);
                    if (c7836b5 == null) {
                        this.f21696j.getLogger().mo18135c(EnumC8021m4.ERROR, "Stream from path %s resulted in a null envelope.", m19545D.getAbsolutePath());
                    } else {
                        File file = new File(this.f21696j.getCacheDirPath(), ".sentry-native/last_crash");
                        Date date = null;
                        if (file.exists()) {
                            this.f21696j.getLogger().mo18135c(EnumC8021m4.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date m19009a = m19009a(file);
                            if (!file.delete()) {
                                this.f21696j.getLogger().mo18135c(EnumC8021m4.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            c7836b5.m19571p(C7836b5.EnumC7838b.Crashed, null, true);
                            date = m19009a;
                        }
                        if (c7836b5.m19581f() == null) {
                            c7836b5.m19583d(date);
                        }
                        this.f21697k.mo18258n(C8020m3.m18988a(serializer, c7836b5, this.f21696j.getSdkVersion()));
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    this.f21696j.getLogger().mo18136b(EnumC8021m4.ERROR, "Error processing previous session.", th2);
                }
                if (!m19545D.delete()) {
                    this.f21696j.getLogger().mo18135c(EnumC8021m4.WARNING, "Failed to delete the previous session file.", new Object[0]);
                }
            }
        }
    }
}
