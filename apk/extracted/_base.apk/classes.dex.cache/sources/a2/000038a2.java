package io.sentry.android.core;

import android.os.Build;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8229o;

/* renamed from: io.sentry.android.core.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7798o0 {

    /* renamed from: a */
    final InterfaceC8040o0 f21331a;

    public C7798o0(InterfaceC8040o0 interfaceC8040o0) {
        this.f21331a = (InterfaceC8040o0) C8229o.m18169c(interfaceC8040o0, "The ILogger object is required.");
    }

    /* renamed from: a */
    public String m19706a() {
        return Build.TAGS;
    }

    /* renamed from: b */
    public String m19705b() {
        return Build.MANUFACTURER;
    }

    /* renamed from: c */
    public String m19704c() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public int m19703d() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: e */
    public String m19702e() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: f */
    public Boolean m19701f() {
        boolean z;
        try {
            if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
                String str = Build.FINGERPRINT;
                if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                    String str2 = Build.HARDWARE;
                    if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                        String str3 = Build.MODEL;
                        if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                            String str4 = Build.PRODUCT;
                            if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                                z = false;
                                return Boolean.valueOf(z);
                            }
                        }
                    }
                }
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (Throwable th2) {
            this.f21331a.mo18136b(EnumC8021m4.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }
}