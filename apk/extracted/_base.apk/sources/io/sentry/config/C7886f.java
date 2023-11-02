package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: io.sentry.config.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final /* synthetic */ class C7886f {
    /* renamed from: a */
    public static Boolean m19467a(InterfaceC7887g interfaceC7887g, String str) {
        String property = interfaceC7887g.getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    /* renamed from: b */
    public static Double m19466b(InterfaceC7887g interfaceC7887g, String str) {
        String property = interfaceC7887g.getProperty(str);
        if (property != null) {
            try {
                return Double.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public static List m19465c(InterfaceC7887g interfaceC7887g, String str) {
        String property = interfaceC7887g.getProperty(str);
        if (property != null) {
            return Arrays.asList(property.split(","));
        }
        return Collections.emptyList();
    }

    /* renamed from: d */
    public static Long m19464d(InterfaceC7887g interfaceC7887g, String str) {
        String property = interfaceC7887g.getProperty(str);
        if (property != null) {
            try {
                return Long.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m19463e(InterfaceC7887g interfaceC7887g, String str, String str2) {
        String property = interfaceC7887g.getProperty(str);
        return property != null ? property : str2;
    }
}
