package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.AbstractC8003k3;
import io.sentry.C7896d3;
import io.sentry.C7929g2;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.internal.util.C7760c;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: io.sentry.android.core.m1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7793m1 {

    /* renamed from: a */
    private static final AbstractC8003k3 f21320a = C7807s.m19678a();

    /* renamed from: b */
    private static final long f21321b = SystemClock.uptimeMillis();

    /* renamed from: c */
    private static void m19715c(C8132r4 c8132r4, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Integration integration : c8132r4.getIntegrations()) {
            if (z && (integration instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(integration);
            }
            if (z2 && (integration instanceof SentryTimberIntegration)) {
                arrayList.add(integration);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                c8132r4.getIntegrations().remove((Integration) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                c8132r4.getIntegrations().remove((Integration) arrayList.get(i2));
            }
        }
    }

    /* renamed from: d */
    public static void m19714d(Context context, InterfaceC8040o0 interfaceC8040o0) {
        m19713e(context, interfaceC8040o0, new C7896d3.InterfaceC7897a() { // from class: io.sentry.android.core.k1
            @Override // io.sentry.C7896d3.InterfaceC7897a
            /* renamed from: a */
            public final void mo18435a(C8132r4 c8132r4) {
                C7793m1.m19711g((SentryAndroidOptions) c8132r4);
            }
        });
    }

    /* renamed from: e */
    public static synchronized void m19713e(final Context context, final InterfaceC8040o0 interfaceC8040o0, final C7896d3.InterfaceC7897a<SentryAndroidOptions> interfaceC7897a) {
        synchronized (C7793m1.class) {
            C7792m0.m19723e().m19719i(f21321b, f21320a);
            try {
                try {
                    C7896d3.m19409p(C7929g2.m19183a(SentryAndroidOptions.class), new C7896d3.InterfaceC7897a() { // from class: io.sentry.android.core.l1
                        @Override // io.sentry.C7896d3.InterfaceC7897a
                        /* renamed from: a */
                        public final void mo18435a(C8132r4 c8132r4) {
                            C7793m1.m19710h(InterfaceC8040o0.this, context, interfaceC7897a, (SentryAndroidOptions) c8132r4);
                        }
                    }, true);
                    InterfaceC8025n0 m19410o = C7896d3.m19410o();
                    if (m19410o.mo18262j().isEnableAutoSessionTracking() && C7803q0.m19687m(context)) {
                        m19410o.mo18269c(C7760c.m19776a("session.start"));
                        m19410o.mo18248x();
                    }
                } catch (IllegalAccessException e) {
                    interfaceC8040o0.mo18136b(EnumC8021m4.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                } catch (NoSuchMethodException e2) {
                    interfaceC8040o0.mo18136b(EnumC8021m4.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                }
            } catch (InstantiationException e3) {
                interfaceC8040o0.mo18136b(EnumC8021m4.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (InvocationTargetException e4) {
                interfaceC8040o0.mo18136b(EnumC8021m4.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        }
    }

    /* renamed from: f */
    public static void m19712f(Context context, C7896d3.InterfaceC7897a<SentryAndroidOptions> interfaceC7897a) {
        m19713e(context, new C7809t(), interfaceC7897a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m19711g(SentryAndroidOptions sentryAndroidOptions) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m19710h(InterfaceC8040o0 interfaceC8040o0, Context context, C7896d3.InterfaceC7897a interfaceC7897a, SentryAndroidOptions sentryAndroidOptions) {
        boolean z;
        C7720d1 c7720d1 = new C7720d1();
        boolean m19905b = c7720d1.m19905b("timber.log.Timber", sentryAndroidOptions);
        boolean z2 = true;
        if (c7720d1.m19905b("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && c7720d1.m19905b("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions)) {
            z = true;
        } else {
            z = false;
        }
        if (!m19905b || !c7720d1.m19905b("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions)) {
            z2 = false;
        }
        C7798o0 c7798o0 = new C7798o0(interfaceC8040o0);
        C7720d1 c7720d12 = new C7720d1();
        C7730h c7730h = new C7730h(c7720d12, sentryAndroidOptions);
        C7822y.m19622l(sentryAndroidOptions, context, interfaceC8040o0, c7798o0);
        C7822y.m19627g(context, sentryAndroidOptions, c7798o0, c7720d12, c7730h, z, z2);
        interfaceC7897a.mo18435a(sentryAndroidOptions);
        C7822y.m19628f(sentryAndroidOptions, context, c7798o0, c7720d12, c7730h);
        m19715c(sentryAndroidOptions, z, z2);
    }
}
