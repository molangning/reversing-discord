package androidx.core.p018os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: androidx.core.os.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1059g {

    /* renamed from: androidx.core.os.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1060a {
        /* renamed from: a */
        static LocaleList m37970a(Configuration configuration) {
            LocaleList locales;
            locales = configuration.getLocales();
            return locales;
        }
    }

    /* renamed from: a */
    public static LocaleListCompat m37971a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleListCompat.m37997i(C1060a.m37970a(configuration));
        }
        return LocaleListCompat.m38005a(configuration.locale);
    }
}
