package io.sentry.android.ndk;

import io.sentry.C8132r4;
import io.sentry.android.core.InterfaceC7821x0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.C8229o;

/* renamed from: io.sentry.android.ndk.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7826a implements InterfaceC7821x0 {

    /* renamed from: c */
    private static final Object f21392c = new Object();

    /* renamed from: a */
    private final C8132r4 f21393a;

    /* renamed from: b */
    private final NativeModuleListLoader f21394b;

    public C7826a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.f21393a = (C8132r4) C8229o.m18169c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f21394b = (NativeModuleListLoader) C8229o.m18169c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}