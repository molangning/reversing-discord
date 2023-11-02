package io.sentry.android.ndk;

import io.sentry.protocol.DebugImage;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class NativeModuleListLoader {
    public static native void nativeClearModuleList();

    public static native DebugImage[] nativeLoadModuleList();
}
