package io.sentry.util;

import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import java.util.Properties;

/* renamed from: io.sentry.util.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8213c {

    /* renamed from: a */
    public static String f22142a = "sentry-debug-meta.properties";

    /* renamed from: a */
    private static void m18235a(C8132r4 c8132r4, Properties properties) {
        if (c8132r4.getBundleIds().isEmpty()) {
            String property = properties.getProperty("io.sentry.bundle-ids");
            c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "Bundle IDs found: %s", property);
            if (property != null) {
                for (String str : property.split(",", -1)) {
                    c8132r4.addBundleId(str);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m18234b(C8132r4 c8132r4, Properties properties) {
        if (c8132r4.getProguardUuid() == null) {
            String property = properties.getProperty("io.sentry.ProguardUuids");
            c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "Proguard UUID found: %s", property);
            c8132r4.setProguardUuid(property);
        }
    }

    /* renamed from: c */
    public static void m18233c(C8132r4 c8132r4, Properties properties) {
        if (properties != null) {
            m18234b(c8132r4, properties);
            m18235a(c8132r4, properties);
        }
    }
}