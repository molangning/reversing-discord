package p308qj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10617d;
import net.time4j.p249tz.EnumC10801d;
import net.time4j.p249tz.InterfaceC10838s;
import p164j$.util.concurrent.ConcurrentHashMap;
import p272oj.C11180e;

/* renamed from: qj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C12009b implements InterfaceC10838s {

    /* renamed from: a */
    private static final ConcurrentMap<Locale, Map<String, Map<EnumC10801d, String>>> f31003a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final Set<String> f31004b;

    /* renamed from: c */
    private static final Map<String, Set<String>> f31005c;

    /* renamed from: d */
    private static final Map<String, String> f31006d;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("Z");
        hashSet.add("GMT");
        hashSet.add("GMT0");
        hashSet.add("Greenwich");
        hashSet.add("UCT");
        hashSet.add("UTC");
        hashSet.add("UTC0");
        hashSet.add("Universal");
        hashSet.add("Zulu");
        f31004b = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        m6617f(hashMap, "data/zone1970.tab");
        f31005c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        m6622a(hashMap2, "CL", "America/Santiago");
        m6622a(hashMap2, "CN", "Asia/Shanghai");
        m6622a(hashMap2, "DE", "Europe/Berlin");
        m6622a(hashMap2, "EC", "America/Guayaquil");
        m6622a(hashMap2, "ES", "Europe/Madrid");
        m6622a(hashMap2, "MH", "Pacific/Majuro");
        m6622a(hashMap2, "MY", "Asia/Kuala_Lumpur");
        m6622a(hashMap2, "NZ", "Pacific/Auckland");
        m6622a(hashMap2, "PT", "Europe/Lisbon");
        m6622a(hashMap2, "UA", "Europe/Kiev");
        m6622a(hashMap2, "UZ", "Asia/Tashkent");
        f31006d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m6622a(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    /* renamed from: b */
    private static void m6621b(Map<String, Set<String>> map, String str, String str2) {
        Set<String> set = map.get(str);
        if (set == null) {
            set = new LinkedHashSet<>();
            map.put(str, set);
        }
        set.add(str2);
    }

    /* renamed from: d */
    private static C11180e m6619d(Locale locale) {
        return C11180e.m9040h("olson/zones/tzname", locale);
    }

    /* renamed from: f */
    static void m6617f(Map<String, Set<String>> map, String str) {
        InputStream mo11024e = AbstractC10617d.m11026c().mo11024e(AbstractC10617d.m11026c().mo11023f("olson", C12009b.class, str), true);
        if (mo11024e == null) {
            mo11024e = C12009b.class.getClassLoader().getResourceAsStream(str);
        }
        try {
            if (mo11024e != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(mo11024e, "UTF-8"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (!readLine.startsWith("#") && !readLine.isEmpty()) {
                                String[] split = readLine.split("\t");
                                if (split.length >= 3) {
                                    for (String str2 : split[0].split(",")) {
                                        m6621b(map, str2, split[2]);
                                    }
                                }
                            }
                        } else {
                            try {
                                mo11024e.close();
                                return;
                            } catch (IOException e) {
                                e.printStackTrace(System.err);
                                return;
                            }
                        }
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                } catch (IOException e3) {
                    throw new IllegalStateException(e3);
                }
            } else {
                System.err.println("Warning: File \"" + str + "\" not found.");
            }
        } catch (Throwable th2) {
            try {
                mo11024e.close();
            } catch (IOException e4) {
                e4.printStackTrace(System.err);
            }
            throw th2;
        }
    }

    @Override // net.time4j.p249tz.InterfaceC10838s
    /* renamed from: c */
    public Set<String> mo6620c(Locale locale, boolean z) {
        String country = locale.getCountry();
        if (z) {
            if (country.equals("US")) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add("America/New_York");
                linkedHashSet.add("America/Chicago");
                linkedHashSet.add("America/Denver");
                linkedHashSet.add("America/Los_Angeles");
                linkedHashSet.add("America/Anchorage");
                linkedHashSet.add("Pacific/Honolulu");
                return Collections.unmodifiableSet(linkedHashSet);
            }
            String str = f31006d.get(country);
            if (str != null) {
                return Collections.singleton(str);
            }
        }
        Set<String> set = f31005c.get(country);
        if (set == null) {
            return Collections.emptySet();
        }
        return set;
    }

    @Override // net.time4j.p249tz.InterfaceC10838s
    /* renamed from: e */
    public String mo6618e(boolean z, Locale locale) {
        return m6619d(locale).m9042f(z ? "utc-literal" : "offset-pattern");
    }

    @Override // net.time4j.p249tz.InterfaceC10838s
    /* renamed from: g */
    public String mo6616g(String str, EnumC10801d enumC10801d, Locale locale) {
        if (f31004b.contains(str)) {
            return "";
        }
        Map<String, Map<EnumC10801d, String>> map = f31003a.get(locale);
        if (map == null) {
            String[][] zoneStrings = DateFormatSymbols.getInstance(locale).getZoneStrings();
            HashMap hashMap = new HashMap();
            for (String[] strArr : zoneStrings) {
                EnumMap enumMap = new EnumMap(EnumC10801d.class);
                enumMap.put((EnumMap) EnumC10801d.LONG_STANDARD_TIME, (EnumC10801d) strArr[1]);
                enumMap.put((EnumMap) EnumC10801d.SHORT_STANDARD_TIME, (EnumC10801d) strArr[2]);
                enumMap.put((EnumMap) EnumC10801d.LONG_DAYLIGHT_TIME, (EnumC10801d) strArr[3]);
                enumMap.put((EnumMap) EnumC10801d.SHORT_DAYLIGHT_TIME, (EnumC10801d) strArr[4]);
                hashMap.put(strArr[0], enumMap);
            }
            map = f31003a.putIfAbsent(locale, hashMap);
            if (map == null) {
                map = hashMap;
            }
        }
        Map<EnumC10801d, String> map2 = map.get(str);
        if (map2 == null) {
            return "";
        }
        return map2.get(enumC10801d);
    }
}