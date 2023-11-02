package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.text.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1130u {

    /* renamed from: a */
    private static final Locale f3501a = new Locale("", "");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.text.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1131a {
        /* renamed from: a */
        static int m37844a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    public static int m37845a(Locale locale) {
        return C1131a.m37844a(locale);
    }
}