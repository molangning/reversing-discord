package p128h4;

import android.icu.text.NumberingSystem;
import android.icu.text.RuleBasedCollator;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h4.p3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6971p3 {

    /* renamed from: a */
    public static String f19186a = "calendar";

    /* renamed from: b */
    public static String f19187b = "ca";

    /* renamed from: c */
    public static String f19188c = "numbers";

    /* renamed from: d */
    public static String f19189d = "nu";

    /* renamed from: e */
    public static String f19190e = "hours";

    /* renamed from: f */
    public static String f19191f = "hc";

    /* renamed from: g */
    public static String f19192g = "collation";

    /* renamed from: h */
    public static String f19193h = "co";

    /* renamed from: i */
    public static String f19194i = "colnumeric";

    /* renamed from: j */
    public static String f19195j = "kn";

    /* renamed from: k */
    public static String f19196k = "colcasefirst";

    /* renamed from: l */
    public static String f19197l = "kf";

    /* renamed from: m */
    private static HashMap<String, String> f19198m = new C6972a();

    /* renamed from: n */
    private static HashMap<String, String> f19199n = new C6973b();

    /* renamed from: o */
    private static final Map<String, String> f19200o = new C6974c();

    /* renamed from: p */
    private static Map<String, String> f19201p = new C6975d();

    /* renamed from: q */
    private static Map<String, String> f19202q = new C6976e();

    /* renamed from: r */
    private static Map<String, String[]> f19203r = new C6977f();

    /* renamed from: h4.p3$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6972a extends HashMap<String, String> {
        C6972a() {
            put(C6971p3.f19187b, C6971p3.f19186a);
            put(C6971p3.f19189d, C6971p3.f19188c);
            put(C6971p3.f19191f, C6971p3.f19190e);
            put(C6971p3.f19193h, C6971p3.f19192g);
            put(C6971p3.f19195j, C6971p3.f19194i);
            put(C6971p3.f19197l, C6971p3.f19196k);
        }
    }

    /* renamed from: h4.p3$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6973b extends HashMap<String, String> {
        C6973b() {
            put(C6971p3.f19186a, C6971p3.f19187b);
            put(C6971p3.f19188c, C6971p3.f19189d);
            put(C6971p3.f19190e, C6971p3.f19191f);
            put(C6971p3.f19192g, C6971p3.f19193h);
            put(C6971p3.f19194i, C6971p3.f19195j);
            put(C6971p3.f19196k, C6971p3.f19197l);
        }
    }

    /* renamed from: h4.p3$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6974c extends HashMap<String, String> {
        C6974c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    /* renamed from: h4.p3$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6975d extends HashMap<String, String> {
        C6975d() {
            put("gregorian", "gregory");
        }
    }

    /* renamed from: h4.p3$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6976e extends HashMap<String, String> {
        C6976e() {
            put("traditional", "traditio");
        }
    }

    /* renamed from: h4.p3$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6977f extends HashMap<String, String[]> {
        C6977f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    /* renamed from: a */
    public static String m21594a(String str) {
        return f19198m.containsKey(str) ? f19198m.get(str) : str;
    }

    /* renamed from: b */
    public static String m21593b(String str) {
        return f19199n.containsKey(str) ? f19199n.get(str) : str;
    }

    /* renamed from: c */
    public static boolean m21592c(String str, String str2, InterfaceC6895b interfaceC6895b) {
        if (Build.VERSION.SDK_INT >= 24) {
            ULocale uLocale = (ULocale) interfaceC6895b.mo21544h();
            String[] strArr = new String[0];
            if (str.equals("co")) {
                if (str2.equals("standard") || str2.equals("search")) {
                    return false;
                }
                strArr = RuleBasedCollator.getKeywordValuesForLocale("co", uLocale, false);
            } else if (str.equals("ca")) {
                strArr = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
            } else if (str.equals("nu")) {
                strArr = NumberingSystem.getAvailableNames();
            }
            if (strArr.length == 0) {
                return true;
            }
            return Arrays.asList(strArr).contains(str2);
        } else if (!f19203r.containsKey(str)) {
            return true;
        } else {
            return Arrays.asList(f19203r.get(str)).contains(str2);
        }
    }

    /* renamed from: d */
    public static String m21591d(String str) {
        if (!f19201p.containsKey(str)) {
            return str;
        }
        return f19201p.get(str);
    }

    /* renamed from: e */
    public static String m21590e(String str) {
        Map<String, String> map = f19200o;
        if (!map.containsKey(str)) {
            return str;
        }
        return map.get(str);
    }

    /* renamed from: f */
    public static Object m21589f(String str, Object obj) {
        if (str.equals("ca") && C6935j.m21632m(obj)) {
            return m21591d((String) obj);
        }
        if (str.equals("nu") && C6935j.m21632m(obj)) {
            return m21588g((String) obj);
        }
        if (str.equals("co") && C6935j.m21632m(obj)) {
            return m21590e((String) obj);
        }
        if (str.equals("kn") && C6935j.m21632m(obj) && obj.equals("yes")) {
            return C6935j.m21627r("true");
        }
        if ((str.equals("kn") || str.equals("kf")) && C6935j.m21632m(obj) && obj.equals("no")) {
            return C6935j.m21627r("false");
        }
        return obj;
    }

    /* renamed from: g */
    public static String m21588g(String str) {
        if (!f19202q.containsKey(str)) {
            return str;
        }
        return f19202q.get(str);
    }
}
