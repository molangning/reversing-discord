package androidx.appcompat.app;

import androidx.core.p018os.LocaleListCompat;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0345v {
    /* renamed from: a */
    private static LocaleListCompat m40534a(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        Locale m38002d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < localeListCompat.m37999g() + localeListCompat2.m37999g(); i++) {
            if (i < localeListCompat.m37999g()) {
                m38002d = localeListCompat.m38002d(i);
            } else {
                m38002d = localeListCompat2.m38002d(i - localeListCompat.m37999g());
            }
            if (m38002d != null) {
                linkedHashSet.add(m38002d);
            }
        }
        return LocaleListCompat.m38005a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* renamed from: b */
    public static LocaleListCompat m40533b(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        if (localeListCompat != null && !localeListCompat.m38000f()) {
            return m40534a(localeListCompat, localeListCompat2);
        }
        return LocaleListCompat.m38001e();
    }
}