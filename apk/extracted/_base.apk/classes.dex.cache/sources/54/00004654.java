package p272oj;

import java.util.Locale;

/* renamed from: oj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC11179d {
    tl("fil"),
    no("nb"),
    in("id"),
    iw("he");
    

    /* renamed from: n */
    static final EnumC11179d[] f29216n = values();
    private final String alias;

    EnumC11179d(String str) {
        this.alias = str;
    }

    /* renamed from: a */
    public static String m9048a(Locale locale) {
        EnumC11179d[] enumC11179dArr;
        String language = locale.getLanguage();
        if (language.equals("no") && locale.getVariant().equals("NY") && locale.getCountry().equals("NO")) {
            return "nn";
        }
        for (EnumC11179d enumC11179d : f29216n) {
            if (language.equals(enumC11179d.name())) {
                return enumC11179d.alias;
            }
        }
        return language;
    }
}