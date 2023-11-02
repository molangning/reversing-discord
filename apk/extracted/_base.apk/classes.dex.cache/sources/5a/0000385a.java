package io.sentry.android.core;

import android.content.Context;
import android.os.Bundle;
import io.sentry.C8004k4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8096o;
import io.sentry.util.C8229o;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.f1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7726f1 {
    /* renamed from: a */
    public static void m19867a(Context context, SentryAndroidOptions sentryAndroidOptions, C7798o0 c7798o0) {
        C8229o.m18169c(context, "The application context is required.");
        C8229o.m18169c(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle m19866b = m19866b(context, sentryAndroidOptions.getLogger(), c7798o0);
            InterfaceC8040o0 logger = sentryAndroidOptions.getLogger();
            if (m19866b != null) {
                sentryAndroidOptions.setDebug(m19864d(m19866b, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String name = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String m19859i = m19859i(m19866b, logger, "io.sentry.debug.level", name.toLowerCase(locale));
                    if (m19859i != null) {
                        sentryAndroidOptions.setDiagnosticLevel(EnumC8021m4.valueOf(m19859i.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(m19864d(m19866b, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(m19864d(m19866b, logger, "io.sentry.auto-session-tracking.enable", m19864d(m19866b, logger, "io.sentry.session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking())));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    Double m19862f = m19862f(m19866b, logger, "io.sentry.sample-rate");
                    if (m19862f.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setSampleRate(m19862f);
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(m19864d(m19866b, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(m19860h(m19866b, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                String m19859i2 = m19859i(m19866b, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                if (m19859i2 == null) {
                    sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                } else if (m19859i2.isEmpty()) {
                    sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "DSN is empty, disabling sentry-android", new Object[0]);
                }
                sentryAndroidOptions.setDsn(m19859i2);
                sentryAndroidOptions.setEnableNdk(m19864d(m19866b, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(m19864d(m19866b, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(m19859i(m19866b, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(m19859i(m19866b, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(m19860h(m19866b, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(m19864d(m19866b, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(m19864d(m19866b, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(m19864d(m19866b, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(m19864d(m19866b, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(m19864d(m19866b, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(m19864d(m19866b, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(m19864d(m19866b, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(m19864d(m19866b, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(m19864d(m19866b, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(m19864d(m19866b, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(m19864d(m19866b, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                sentryAndroidOptions.setCollectAdditionalContext(m19864d(m19866b, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getEnableTracing() == null) {
                    sentryAndroidOptions.setEnableTracing(m19863e(m19866b, logger, "io.sentry.traces.enable", null));
                }
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    Double m19862f2 = m19862f(m19866b, logger, "io.sentry.traces.sample-rate");
                    if (m19862f2.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(m19862f2);
                    }
                }
                sentryAndroidOptions.setTraceSampling(m19864d(m19866b, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(m19864d(m19866b, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(m19864d(m19866b, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                sentryAndroidOptions.setProfilingEnabled(m19864d(m19866b, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    Double m19862f3 = m19862f(m19866b, logger, "io.sentry.traces.profiling.sample-rate");
                    if (m19862f3.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(m19862f3);
                    }
                }
                sentryAndroidOptions.setEnableUserInteractionTracing(m19864d(m19866b, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(m19864d(m19866b, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long m19860h = m19860h(m19866b, logger, "io.sentry.traces.idle-timeout", -1L);
                if (m19860h != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(m19860h));
                }
                List<String> m19861g = m19861g(m19866b, logger, "io.sentry.traces.trace-propagation-targets");
                if (!m19866b.containsKey("io.sentry.traces.trace-propagation-targets") && (m19861g == null || m19861g.isEmpty())) {
                    m19861g = m19861g(m19866b, logger, "io.sentry.traces.tracing-origins");
                }
                if ((m19866b.containsKey("io.sentry.traces.trace-propagation-targets") || m19866b.containsKey("io.sentry.traces.tracing-origins")) && m19861g == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.emptyList());
                } else if (m19861g != null) {
                    sentryAndroidOptions.setTracePropagationTargets(m19861g);
                }
                sentryAndroidOptions.setEnableFramesTracking(m19864d(m19866b, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(m19859i(m19866b, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                C8096o sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new C8096o("", "");
                }
                sdkVersion.m18599k(m19858j(m19866b, logger, "io.sentry.sdk.name", sdkVersion.m18603g()));
                sdkVersion.m18597m(m19858j(m19866b, logger, "io.sentry.sdk.version", sdkVersion.m18600j()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(m19864d(m19866b, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List<String> m19861g2 = m19861g(m19866b, logger, "io.sentry.gradle-plugin-integrations");
                if (m19861g2 != null) {
                    for (String str : m19861g2) {
                        C8004k4.m19025c().m19027a(str);
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(m19864d(m19866b, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
            }
            sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to read configuration from android manifest metadata.", th2);
        }
    }

    /* renamed from: b */
    private static Bundle m19866b(Context context, InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0) {
        if (c7798o0 == null) {
            c7798o0 = new C7798o0(interfaceC8040o0);
        }
        return C7803q0.m19699a(context, 128L, c7798o0).metaData;
    }

    /* renamed from: c */
    public static boolean m19865c(Context context, InterfaceC8040o0 interfaceC8040o0) {
        C8229o.m18169c(context, "The application context is required.");
        boolean z = true;
        try {
            Bundle m19866b = m19866b(context, interfaceC8040o0, null);
            if (m19866b != null) {
                z = m19864d(m19866b, interfaceC8040o0, "io.sentry.auto-init", true);
            }
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "Retrieving auto-init from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Failed to read auto-init from android manifest metadata.", th2);
        }
        return z;
    }

    /* renamed from: d */
    private static boolean m19864d(Bundle bundle, InterfaceC8040o0 interfaceC8040o0, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "%s read: %s", str, Boolean.valueOf(z2));
        return z2;
    }

    /* renamed from: e */
    private static Boolean m19863e(Bundle bundle, InterfaceC8040o0 interfaceC8040o0, String str, Boolean bool) {
        boolean z;
        if (bundle.getSerializable(str) != null) {
            if (bool == null) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = bundle.getBoolean(str, z);
            interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "%s read: %s", str, Boolean.valueOf(z2));
            return Boolean.valueOf(z2);
        }
        interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "%s used default %s", str, bool);
        return bool;
    }

    /* renamed from: f */
    private static Double m19862f(Bundle bundle, InterfaceC8040o0 interfaceC8040o0, String str) {
        Double valueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "%s read: %s", str, valueOf);
        return valueOf;
    }

    /* renamed from: g */
    private static List<String> m19861g(Bundle bundle, InterfaceC8040o0 interfaceC8040o0, String str) {
        String string = bundle.getString(str);
        interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    /* renamed from: h */
    private static long m19860h(Bundle bundle, InterfaceC8040o0 interfaceC8040o0, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "%s read: %s", str, Long.valueOf(j2));
        return j2;
    }

    /* renamed from: i */
    private static String m19859i(Bundle bundle, InterfaceC8040o0 interfaceC8040o0, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "%s read: %s", str, string);
        return string;
    }

    /* renamed from: j */
    private static String m19858j(Bundle bundle, InterfaceC8040o0 interfaceC8040o0, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "%s read: %s", str, string);
        return string;
    }
}