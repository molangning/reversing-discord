package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SentryNdk {
    static {
        System.loadLibrary("log");
        System.loadLibrary("sentry");
        System.loadLibrary("sentry-android");
    }

    private SentryNdk() {
    }

    public static void close() {
        shutdown();
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        C7829d.m19612a(sentryAndroidOptions.getSdkVersion());
        initSentryNative(sentryAndroidOptions);
        if (sentryAndroidOptions.isEnableScopeSync()) {
            sentryAndroidOptions.addScopeObserver(new C7828c(sentryAndroidOptions));
        }
        sentryAndroidOptions.setDebugImagesLoader(new C7826a(sentryAndroidOptions, new NativeModuleListLoader()));
    }

    private static native void initSentryNative(SentryAndroidOptions sentryAndroidOptions);

    private static native void shutdown();
}
