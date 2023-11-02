package androidx.core.p018os;

import android.os.Build;
import android.os.LocaleList;
import androidx.core.text.C1103b;
import java.util.Locale;

/* renamed from: androidx.core.os.LocaleListCompat */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class LocaleListCompat {

    /* renamed from: b */
    private static final LocaleListCompat f3382b = m38005a(new Locale[0]);

    /* renamed from: a */
    private final InterfaceC1064k f3383a;

    /* renamed from: androidx.core.os.LocaleListCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1047a {

        /* renamed from: a */
        private static final Locale[] f3384a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* renamed from: a */
        static Locale m37996a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        private static boolean m37995b(Locale locale) {
            for (Locale locale2 : f3384a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        static boolean m37994c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m37995b(locale) || m37995b(locale2)) {
                return false;
            }
            String m37871a = C1103b.m37871a(locale);
            if (m37871a.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
                return false;
            }
            return m37871a.equals(C1103b.m37871a(locale2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.os.LocaleListCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1048b {
        /* renamed from: a */
        static LocaleList m37993a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        static LocaleList m37992b() {
            LocaleList adjustedDefault;
            adjustedDefault = LocaleList.getAdjustedDefault();
            return adjustedDefault;
        }

        /* renamed from: c */
        static LocaleList m37991c() {
            LocaleList localeList;
            localeList = LocaleList.getDefault();
            return localeList;
        }
    }

    private LocaleListCompat(InterfaceC1064k interfaceC1064k) {
        this.f3383a = interfaceC1064k;
    }

    /* renamed from: a */
    public static LocaleListCompat m38005a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m37997i(C1048b.m37993a(localeArr));
        }
        return new LocaleListCompat(new C1063j(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Locale m38004b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: c */
    public static LocaleListCompat m38003c(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = C1047a.m37996a(split[i]);
            }
            return m38005a(localeArr);
        }
        return m38001e();
    }

    /* renamed from: e */
    public static LocaleListCompat m38001e() {
        return f3382b;
    }

    /* renamed from: i */
    public static LocaleListCompat m37997i(LocaleList localeList) {
        return new LocaleListCompat(new C1070q(localeList));
    }

    /* renamed from: d */
    public Locale m38002d(int i) {
        return this.f3383a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof LocaleListCompat) && this.f3383a.equals(((LocaleListCompat) obj).f3383a);
    }

    /* renamed from: f */
    public boolean m38000f() {
        return this.f3383a.isEmpty();
    }

    /* renamed from: g */
    public int m37999g() {
        return this.f3383a.size();
    }

    /* renamed from: h */
    public String m37998h() {
        return this.f3383a.mo37961a();
    }

    public int hashCode() {
        return this.f3383a.hashCode();
    }

    public String toString() {
        return this.f3383a.toString();
    }
}
