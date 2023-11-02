package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.C7687a1;
import io.sentry.C7830b;
import io.sentry.C7831b0;
import io.sentry.C7923f4;
import io.sentry.C7991j;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.cache.C7717b;
import io.sentry.android.core.internal.threaddump.C7756b;
import io.sentry.android.core.internal.threaddump.C7757c;
import io.sentry.cache.C7850e;
import io.sentry.cache.InterfaceC7851f;
import io.sentry.hints.AbstractC7947e;
import io.sentry.hints.C7943a;
import io.sentry.hints.InterfaceC7944b;
import io.sentry.hints.InterfaceC7946d;
import io.sentry.protocol.C8086j;
import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8112w;
import io.sentry.transport.C8187m;
import io.sentry.transport.InterfaceC8189o;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressLint({"NewApi"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AnrV2Integration implements Integration, Closeable {

    /* renamed from: m */
    static final long f21045m = TimeUnit.DAYS.toMillis(91);

    /* renamed from: j */
    private final Context f21046j;

    /* renamed from: k */
    private final InterfaceC8189o f21047k;

    /* renamed from: l */
    private SentryAndroidOptions f21048l;

    /* renamed from: io.sentry.android.core.AnrV2Integration$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class RunnableC7693a implements Runnable {

        /* renamed from: j */
        private final Context f21049j;

        /* renamed from: k */
        private final InterfaceC8025n0 f21050k;

        /* renamed from: l */
        private final SentryAndroidOptions f21051l;

        /* renamed from: m */
        private final long f21052m;

        RunnableC7693a(Context context, InterfaceC8025n0 interfaceC8025n0, SentryAndroidOptions sentryAndroidOptions, InterfaceC8189o interfaceC8189o) {
            this.f21049j = context;
            this.f21050k = interfaceC8025n0;
            this.f21051l = sentryAndroidOptions;
            this.f21052m = interfaceC8189o.mo18303a() - AnrV2Integration.f21045m;
        }

        /* renamed from: a */
        private byte[] m19992a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        /* renamed from: b */
        private C7695c m19991b(ApplicationExitInfo applicationExitInfo, boolean z) {
            InputStream traceInputStream;
            byte[] bArr;
            try {
                traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream == null) {
                    return new C7695c(C7695c.EnumC7696a.NO_DUMP);
                }
                try {
                    bArr = m19992a(traceInputStream);
                } catch (Throwable th2) {
                    this.f21051l.getLogger().mo18136b(EnumC8021m4.WARNING, "Failed to convert ANR thread dump to byte array", th2);
                    bArr = null;
                }
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr)));
                    List<C8112w> m19782f = new C7757c(this.f21051l, z).m19782f(C7756b.m19789c(bufferedReader));
                    if (m19782f.isEmpty()) {
                        C7695c c7695c = new C7695c(C7695c.EnumC7696a.ERROR, bArr);
                        bufferedReader.close();
                        return c7695c;
                    }
                    C7695c c7695c2 = new C7695c(C7695c.EnumC7696a.DUMP, bArr, m19782f);
                    bufferedReader.close();
                    return c7695c2;
                } catch (Throwable th3) {
                    this.f21051l.getLogger().mo18136b(EnumC8021m4.WARNING, "Failed to parse ANR thread dump", th3);
                    return new C7695c(C7695c.EnumC7696a.ERROR, bArr);
                }
            } catch (Throwable th4) {
                this.f21051l.getLogger().mo18136b(EnumC8021m4.WARNING, "Failed to read ANR thread dump", th4);
                return new C7695c(C7695c.EnumC7696a.NO_DUMP);
            }
        }

        /* renamed from: c */
        private void m19990c(ApplicationExitInfo applicationExitInfo, boolean z) {
            long timestamp;
            int importance;
            boolean z2;
            byte[] bArr;
            String applicationExitInfo2;
            timestamp = applicationExitInfo.getTimestamp();
            importance = applicationExitInfo.getImportance();
            if (importance != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7695c m19991b = m19991b(applicationExitInfo, z2);
            if (m19991b.f21056a == C7695c.EnumC7696a.NO_DUMP) {
                InterfaceC8040o0 logger = this.f21051l.getLogger();
                EnumC8021m4 enumC8021m4 = EnumC8021m4.WARNING;
                applicationExitInfo2 = applicationExitInfo.toString();
                logger.mo18135c(enumC8021m4, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo2);
                return;
            }
            C7694b c7694b = new C7694b(this.f21051l.getFlushTimeoutMillis(), this.f21051l.getLogger(), timestamp, z, z2);
            C7831b0 m18225e = C8220j.m18225e(c7694b);
            C7923f4 c7923f4 = new C7923f4();
            C7695c.EnumC7696a enumC7696a = m19991b.f21056a;
            if (enumC7696a == C7695c.EnumC7696a.ERROR) {
                C8086j c8086j = new C8086j();
                c8086j.m18653d("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                c7923f4.m19213A0(c8086j);
            } else if (enumC7696a == C7695c.EnumC7696a.DUMP) {
                c7923f4.m19211C0(m19991b.f21058c);
            }
            c7923f4.m19187z0(EnumC8021m4.FATAL);
            c7923f4.m19210D0(C7991j.m19087d(timestamp));
            if (this.f21051l.isAttachAnrThreadDump() && (bArr = m19991b.f21057b) != null) {
                m18225e.m19590l(C7830b.m19610b(bArr));
            }
            if (!this.f21050k.mo18257o(c7923f4, m18225e).equals(C8100q.f21957k) && !c7694b.mo18899e()) {
                this.f21051l.getLogger().mo18135c(EnumC8021m4.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", c7923f4.m19266G());
            }
        }

        /* renamed from: d */
        private void m19989d(List<ApplicationExitInfo> list, Long l) {
            int reason;
            long timestamp;
            long timestamp2;
            Collections.reverse(list);
            for (ApplicationExitInfo applicationExitInfo : list) {
                reason = applicationExitInfo.getReason();
                if (reason == 6) {
                    timestamp = applicationExitInfo.getTimestamp();
                    if (timestamp < this.f21052m) {
                        this.f21051l.getLogger().mo18135c(EnumC8021m4.DEBUG, "ANR happened too long ago %s.", applicationExitInfo);
                    } else {
                        if (l != null) {
                            timestamp2 = applicationExitInfo.getTimestamp();
                            if (timestamp2 <= l.longValue()) {
                                this.f21051l.getLogger().mo18135c(EnumC8021m4.DEBUG, "ANR has already been reported %s.", applicationExitInfo);
                            }
                        }
                        m19990c(applicationExitInfo, false);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            List historicalProcessExitReasons;
            long timestamp;
            long timestamp2;
            int reason;
            ApplicationExitInfo applicationExitInfo = null;
            historicalProcessExitReasons = ((ActivityManager) this.f21049j.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f21051l.getLogger().mo18135c(EnumC8021m4.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            InterfaceC7851f envelopeDiskCache = this.f21051l.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof C7850e) && this.f21051l.isEnableAutoSessionTracking()) {
                C7850e c7850e = (C7850e) envelopeDiskCache;
                if (!c7850e.m19541H()) {
                    this.f21051l.getLogger().mo18135c(EnumC8021m4.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    c7850e.m19548A();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long m19910O = C7717b.m19910O(this.f21051l);
            Iterator<ApplicationExitInfo> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationExitInfo next = it.next();
                reason = next.getReason();
                if (reason == 6) {
                    arrayList.remove(next);
                    applicationExitInfo = next;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f21051l.getLogger().mo18135c(EnumC8021m4.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            timestamp = applicationExitInfo.getTimestamp();
            if (timestamp < this.f21052m) {
                this.f21051l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (m19910O != null) {
                timestamp2 = applicationExitInfo.getTimestamp();
                if (timestamp2 <= m19910O.longValue()) {
                    this.f21051l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                    return;
                }
            }
            if (this.f21051l.isReportHistoricalAnrs()) {
                m19989d(arrayList, m19910O);
            }
            m19990c(applicationExitInfo, true);
        }
    }

    /* renamed from: io.sentry.android.core.AnrV2Integration$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7694b extends AbstractC7947e implements InterfaceC7946d, InterfaceC7944b {

        /* renamed from: d */
        private final long f21053d;

        /* renamed from: e */
        private final boolean f21054e;

        /* renamed from: f */
        private final boolean f21055f;

        public C7694b(long j, InterfaceC8040o0 interfaceC8040o0, long j2, boolean z, boolean z2) {
            super(j, interfaceC8040o0);
            this.f21053d = j2;
            this.f21054e = z;
            this.f21055f = z2;
        }

        @Override // io.sentry.hints.InterfaceC7946d
        /* renamed from: a */
        public boolean mo19151a() {
            return this.f21054e;
        }

        @Override // io.sentry.hints.InterfaceC7944b
        /* renamed from: c */
        public Long mo19154c() {
            return Long.valueOf(this.f21053d);
        }

        @Override // io.sentry.hints.InterfaceC7944b
        /* renamed from: d */
        public /* synthetic */ boolean mo19153d() {
            return C7943a.m19156a(this);
        }

        @Override // io.sentry.hints.InterfaceC7944b
        /* renamed from: f */
        public String mo19152f() {
            return this.f21055f ? "anr_background" : "anr_foreground";
        }
    }

    public AnrV2Integration(Context context) {
        this(context, C8187m.m18313b());
    }

    @Override // io.sentry.Integration
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        SentryAndroidOptions sentryAndroidOptions;
        if (c8132r4 instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) c8132r4;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21048l = sentryAndroidOptions2;
        sentryAndroidOptions2.getLogger().mo18135c(EnumC8021m4.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f21048l.isAnrEnabled()));
        if (this.f21048l.getCacheDirPath() == null) {
            this.f21048l.getLogger().mo18135c(EnumC8021m4.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
        } else if (this.f21048l.isAnrEnabled()) {
            try {
                c8132r4.getExecutorService().submit(new RunnableC7693a(this.f21046j, interfaceC8025n0, this.f21048l, this.f21047k));
            } catch (Throwable th2) {
                c8132r4.getLogger().mo18136b(EnumC8021m4.DEBUG, "Failed to start AnrProcessor.", th2);
            }
            c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "AnrV2Integration installed.", new Object[0]);
            m19993i();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f21048l;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m19993i() {
        C7687a1.m20046a(this);
    }

    AnrV2Integration(Context context, InterfaceC8189o interfaceC8189o) {
        this.f21046j = context;
        this.f21047k = interfaceC8189o;
    }

    /* renamed from: io.sentry.android.core.AnrV2Integration$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7695c {

        /* renamed from: a */
        final EnumC7696a f21056a;

        /* renamed from: b */
        final byte[] f21057b;

        /* renamed from: c */
        final List<C8112w> f21058c;

        /* renamed from: io.sentry.android.core.AnrV2Integration$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public enum EnumC7696a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        C7695c(EnumC7696a enumC7696a) {
            this.f21056a = enumC7696a;
            this.f21057b = null;
            this.f21058c = null;
        }

        C7695c(EnumC7696a enumC7696a, byte[] bArr) {
            this.f21056a = enumC7696a;
            this.f21057b = bArr;
            this.f21058c = null;
        }

        C7695c(EnumC7696a enumC7696a, byte[] bArr, List<C8112w> list) {
            this.f21056a = enumC7696a;
            this.f21057b = bArr;
            this.f21058c = list;
        }
    }
}