package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1103b {

    /* renamed from: a */
    private static Method f3488a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.text.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1104a {
        /* renamed from: a */
        static String m37870a(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.text.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1105b {
        /* renamed from: a */
        static ULocale m37869a(Object obj) {
            ULocale addLikelySubtags;
            addLikelySubtags = ULocale.addLikelySubtags((ULocale) obj);
            return addLikelySubtags;
        }

        /* renamed from: b */
        static ULocale m37868b(Locale locale) {
            ULocale forLocale;
            forLocale = ULocale.forLocale(locale);
            return forLocale;
        }

        /* renamed from: c */
        static String m37867c(Object obj) {
            String script;
            script = ((ULocale) obj).getScript();
            return script;
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f3488a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    public static String m37871a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1105b.m37867c(C1105b.m37869a(C1105b.m37868b(locale)));
        }
        try {
            return C1104a.m37870a((Locale) f3488a.invoke(null, locale));
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
            return C1104a.m37870a(locale);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
            return C1104a.m37870a(locale);
        }
    }
}