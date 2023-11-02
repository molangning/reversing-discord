package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.C7689a3;
import io.sentry.C7999k;
import io.sentry.C8014m;
import io.sentry.C8279z2;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.InterfaceC8245v2;
import io.sentry.android.core.cache.C7717b;
import io.sentry.android.core.internal.debugmeta.C7738a;
import io.sentry.android.core.internal.gestures.C7739a;
import io.sentry.android.core.internal.modules.C7754a;
import io.sentry.android.core.internal.util.C7759b;
import io.sentry.android.core.internal.util.C7777r;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.cache.C7859n;
import io.sentry.cache.C7869x;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.transport.C8192r;
import io.sentry.util.C8225l;
import io.sentry.util.C8229o;
import java.io.File;
import java.util.ArrayList;

/* renamed from: io.sentry.android.core.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7822y {
    /* renamed from: d */
    private static String m19630d(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    /* renamed from: e */
    private static void m19629e(Context context, SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setCacheDirPath(new File(context.getCacheDir(), "sentry").getAbsolutePath());
    }

    /* renamed from: f */
    public static void m19628f(SentryAndroidOptions sentryAndroidOptions, Context context, C7798o0 c7798o0, C7720d1 c7720d1, C7730h c7730h) {
        boolean z;
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C8192r)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new C7717b(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new C7999k(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C7811t0(context, c7798o0, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C7737i1(sentryAndroidOptions, c7730h));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c7798o0));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C7725f0(context, sentryAndroidOptions, c7798o0));
        sentryAndroidOptions.setTransportGate(new C7713c0(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setTransactionProfiler(new C7708b0(context, sentryAndroidOptions, c7798o0, new C7777r(context, sentryAndroidOptions, c7798o0)));
        sentryAndroidOptions.setModulesLoader(new C7754a(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setDebugMetaLoader(new C7738a(context, sentryAndroidOptions.getLogger()));
        boolean m19905b = c7720d1.m19905b("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean m19905b2 = c7720d1.m19905b("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new C7739a(m19905b));
            if (m19905b2 && c7720d1.m19905b("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && m19905b2 && c7720d1.m19905b("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(C7759b.m19778d());
        if (sentryAndroidOptions.getCollectors().isEmpty()) {
            sentryAndroidOptions.addCollector(new C7812u());
            sentryAndroidOptions.addCollector(new C7805r(sentryAndroidOptions.getLogger(), c7798o0));
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new C8014m(sentryAndroidOptions));
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new C7869x(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new C7859n(sentryAndroidOptions));
        }
    }

    /* renamed from: g */
    public static void m19627g(Context context, final SentryAndroidOptions sentryAndroidOptions, C7798o0 c7798o0, C7720d1 c7720d1, C7730h c7730h, boolean z, boolean z2) {
        Class<?> cls;
        C8225l c8225l = new C8225l(new C8225l.InterfaceC8226a() { // from class: io.sentry.android.core.v
            @Override // io.sentry.util.C8225l.InterfaceC8226a
            /* renamed from: a */
            public final Object mo18203a() {
                Boolean m19625i;
                m19625i = C7822y.m19625i(SentryAndroidOptions.this);
                return m19625i;
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C8279z2(new InterfaceC8245v2() { // from class: io.sentry.android.core.w
            @Override // io.sentry.InterfaceC8245v2
            /* renamed from: a */
            public final String mo18132a() {
                String cacheDirPath;
                cacheDirPath = SentryAndroidOptions.this.getCacheDirPath();
                return cacheDirPath;
            }
        }), c8225l));
        if (m19626h(c7798o0)) {
            cls = c7720d1.m19904c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger());
        } else {
            cls = null;
        }
        sentryAndroidOptions.addIntegration(new NdkIntegration(cls));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.m19976i());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C7689a3(new InterfaceC8245v2() { // from class: io.sentry.android.core.x
            @Override // io.sentry.InterfaceC8245v2
            /* renamed from: a */
            public final String mo18132a() {
                String outboxPath;
                outboxPath = SentryAndroidOptions.this.getOutboxPath();
                return outboxPath;
            }
        }), c8225l));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(C7722e0.m19903a(context, c7798o0));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, c7798o0, c7730h));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, c7720d1));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, c7798o0, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
    }

    /* renamed from: h */
    private static boolean m19626h(C7798o0 c7798o0) {
        return c7798o0.m19703d() >= 16;
    }

    /* renamed from: i */
    public static /* synthetic */ Boolean m19625i(SentryAndroidOptions sentryAndroidOptions) {
        return Boolean.valueOf(C7717b.m19912M(sentryAndroidOptions));
    }

    /* renamed from: l */
    public static void m19622l(SentryAndroidOptions sentryAndroidOptions, Context context, InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0) {
        C8229o.m18169c(context, "The context is required.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        C8229o.m18169c(sentryAndroidOptions, "The options object is required.");
        C8229o.m18169c(interfaceC8040o0, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(interfaceC8040o0);
        sentryAndroidOptions.setDateProvider(new C7796n1());
        C7726f1.m19867a(context, sentryAndroidOptions, c7798o0);
        m19629e(context, sentryAndroidOptions);
        m19621m(sentryAndroidOptions, context, c7798o0);
    }

    /* renamed from: m */
    private static void m19621m(SentryAndroidOptions sentryAndroidOptions, Context context, C7798o0 c7798o0) {
        PackageInfo m19690j = C7803q0.m19690j(context, sentryAndroidOptions.getLogger(), c7798o0);
        if (m19690j != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(m19630d(m19690j, C7803q0.m19689k(m19690j, c7798o0)));
            }
            String str = m19690j.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(C7823y0.m19620a(context));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().mo18136b(EnumC8021m4.ERROR, "Could not generate distinct Id.", e);
            }
        }
    }
}