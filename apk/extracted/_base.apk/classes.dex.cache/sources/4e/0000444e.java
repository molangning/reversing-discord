package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.base.C10616c;

/* renamed from: net.time4j.calendar.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C10664o implements Comparable<C10664o>, Serializable {
    private static final long serialVersionUID = -4556668597489844917L;

    /* renamed from: v */
    private static final C10664o[] f27783v;

    /* renamed from: w */
    private static final Map<String, String[]> f27784w;

    /* renamed from: x */
    private static final Map<String, String[]> f27785x;

    /* renamed from: y */
    private static final Set<String> f27786y;
    private final int number;

    /* renamed from: j */
    private static final String[] f27771j = {"jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui"};

    /* renamed from: k */
    private static final String[] f27772k = {"jiǎ", "yǐ", "bǐng", "dīng", "wù", "jǐ", "gēng", "xīn", "rén", "guǐ"};

    /* renamed from: l */
    private static final String[] f27773l = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    /* renamed from: m */
    private static final String[] f27774m = {"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"};

    /* renamed from: n */
    private static final String[] f27775n = {"giáp", "ất", "bính", "đinh", "mậu", "kỷ", "canh", "tân", "nhâm", "quý"};

    /* renamed from: o */
    private static final String[] f27776o = {"Цзя", "И", "Бин", "Дин", "У", "Цзи", "Гэн", "Синь", "Жэнь", "Гуй"};

    /* renamed from: p */
    private static final String[] f27777p = {"zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu", "hai"};

    /* renamed from: q */
    private static final String[] f27778q = {"zǐ", "chǒu", "yín", "mǎo", "chén", "sì", "wǔ", "wèi", "shēn", "yǒu", "xū", "hài"};

    /* renamed from: r */
    private static final String[] f27779r = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

    /* renamed from: s */
    private static final String[] f27780s = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};

    /* renamed from: t */
    private static final String[] f27781t = {"tí", "sửu", "dần", "mão", "thìn", "tị", "ngọ", "mùi", "thân", "dậu", "tuất", "hợi"};

    /* renamed from: u */
    private static final String[] f27782u = {"Цзы", "Чоу", "Инь", "Мао", "Чэнь", "Сы", "У", "Вэй", "Шэнь", "Ю", "Сюй", "Хай"};

    /* renamed from: net.time4j.calendar.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC10665a {
        ZI_1_RAT,
        CHOU_2_OX,
        YIN_3_TIGER,
        MAO_4_HARE,
        CHEN_5_DRAGON,
        SI_6_SNAKE,
        WU_7_HORSE,
        WEI_8_SHEEP,
        SHEN_9_MONKEY,
        YOU_10_FOWL,
        XU_11_DOG,
        HAI_12_PIG;

        /* renamed from: a */
        public String m10805a(Locale locale) {
            String language = locale.getLanguage();
            Map map = C10664o.f27785x;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = C10664o.f27778q;
            }
            return strArr[ordinal()];
        }
    }

    /* renamed from: net.time4j.calendar.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC10666b {
        JIA_1_WOOD_YANG,
        YI_2_WOOD_YIN,
        BING_3_FIRE_YANG,
        DING_4_FIRE_YIN,
        WU_5_EARTH_YANG,
        JI_6_EARTH_YIN,
        GENG_7_METAL_YANG,
        XIN_8_METAL_YIN,
        REN_9_WATER_YANG,
        GUI_10_WATER_YIN;

        /* renamed from: a */
        public String m10804a(Locale locale) {
            String language = locale.getLanguage();
            Map map = C10664o.f27784w;
            if (language.isEmpty()) {
                language = "root";
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = C10664o.f27772k;
            }
            return strArr[ordinal()];
        }
    }

    static {
        C10664o[] c10664oArr = new C10664o[60];
        int i = 0;
        while (i < 60) {
            int i2 = i + 1;
            c10664oArr[i] = new C10664o(i2);
            i = i2;
        }
        f27783v = c10664oArr;
        HashMap hashMap = new HashMap();
        hashMap.put("root", f27771j);
        String[] strArr = f27773l;
        hashMap.put("zh", strArr);
        hashMap.put("ja", strArr);
        hashMap.put("ko", f27774m);
        hashMap.put("vi", f27775n);
        hashMap.put("ru", f27776o);
        f27784w = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("root", f27777p);
        String[] strArr2 = f27779r;
        hashMap2.put("zh", strArr2);
        hashMap2.put("ja", strArr2);
        hashMap2.put("ko", f27780s);
        hashMap2.put("vi", f27781t);
        hashMap2.put("ru", f27782u);
        f27785x = Collections.unmodifiableMap(hashMap2);
        HashSet hashSet = new HashSet();
        hashSet.add("zh");
        hashSet.add("ja");
        hashSet.add("ko");
        f27786y = Collections.unmodifiableSet(hashSet);
    }

    public C10664o(int i) {
        this.number = i;
    }

    /* renamed from: i */
    public static C10664o m10809i(int i) {
        if (i >= 1 && i <= 60) {
            return f27783v[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    /* renamed from: k */
    public static C10664o m10808k(EnumC10666b enumC10666b, EnumC10665a enumC10665a) {
        int ordinal = enumC10666b.ordinal();
        C10664o m10809i = m10809i(ordinal + 1 + C10616c.m11039c((enumC10665a.ordinal() - ordinal) * 25, 60));
        if (m10809i.m10810h() == enumC10666b && m10809i.m10812f() == enumC10665a) {
            return m10809i;
        }
        throw new IllegalArgumentException("Invalid combination of stem and branch.");
    }

    /* renamed from: l */
    public static C10664o m10807l(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z) {
        EnumC10666b enumC10666b;
        EnumC10665a enumC10665a;
        int i;
        EnumC10666b[] enumC10666bArr;
        Locale locale2 = locale;
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        boolean isEmpty = locale.getLanguage().isEmpty();
        int i2 = index + 1;
        if (i2 < length && index >= 0) {
            if (f27786y.contains(locale.getLanguage())) {
                EnumC10666b[] values = EnumC10666b.values();
                int length2 = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        enumC10666b = values[i3];
                        if (enumC10666b.m10804a(locale2).charAt(0) == charSequence.charAt(index)) {
                            break;
                        }
                        i3++;
                    } else {
                        enumC10666b = null;
                        break;
                    }
                }
                if (enumC10666b != null) {
                    EnumC10665a[] values2 = EnumC10665a.values();
                    int length3 = values2.length;
                    for (int i4 = 0; i4 < length3; i4++) {
                        enumC10665a = values2[i4];
                        if (enumC10665a.m10805a(locale2).charAt(0) == charSequence.charAt(i2)) {
                            index += 2;
                            break;
                        }
                    }
                }
                enumC10665a = null;
            } else {
                while (true) {
                    if (i2 < length) {
                        if (charSequence.charAt(i2) == '-') {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 == -1) {
                    parsePosition.setErrorIndex(index);
                    return null;
                }
                EnumC10666b[] values3 = EnumC10666b.values();
                int length4 = values3.length;
                enumC10666b = null;
                int i5 = 0;
                while (i5 < length4) {
                    EnumC10666b enumC10666b2 = values3[i5];
                    String m10804a = enumC10666b2.m10804a(locale2);
                    int i6 = index;
                    while (true) {
                        if (i6 < i2) {
                            int i7 = i6 - index;
                            char charAt = charSequence.charAt(i6);
                            if (isEmpty) {
                                charAt = m10806m(charAt);
                            }
                            char c = charAt;
                            enumC10666bArr = values3;
                            if (i7 < m10804a.length() && m10804a.charAt(i7) == c) {
                                if (i7 + 1 == m10804a.length()) {
                                    enumC10666b = enumC10666b2;
                                    break;
                                }
                                i6++;
                                values3 = enumC10666bArr;
                            }
                        } else {
                            enumC10666bArr = values3;
                            break;
                        }
                    }
                    i5++;
                    values3 = enumC10666bArr;
                }
                if (enumC10666b == null) {
                    if (z && !isEmpty && i2 + 1 < length) {
                        return m10807l(charSequence, parsePosition, Locale.ROOT, true);
                    }
                    parsePosition.setErrorIndex(index);
                    return null;
                }
                EnumC10665a[] values4 = EnumC10665a.values();
                int length5 = values4.length;
                int i8 = 0;
                enumC10665a = null;
                while (i8 < length5) {
                    EnumC10665a enumC10665a2 = values4[i8];
                    String m10805a = enumC10665a2.m10805a(locale2);
                    int i9 = i2 + 1;
                    while (true) {
                        if (i9 < length) {
                            int i10 = (i9 - i2) - 1;
                            char charAt2 = charSequence.charAt(i9);
                            if (isEmpty) {
                                charAt2 = m10806m(charAt2);
                            }
                            char c2 = charAt2;
                            i = index;
                            if (i10 >= m10805a.length() || m10805a.charAt(i10) != c2) {
                                break;
                            } else if (i10 + 1 == m10805a.length()) {
                                index = i9 + 1;
                                enumC10665a = enumC10665a2;
                                break;
                            } else {
                                i9++;
                                index = i;
                            }
                        } else {
                            i = index;
                            break;
                        }
                    }
                    index = i;
                    i8++;
                    locale2 = locale;
                }
            }
            if (enumC10666b != null && enumC10665a != null) {
                parsePosition.setIndex(index);
                return m10808k(enumC10666b, enumC10665a);
            } else if (z && !isEmpty) {
                return m10807l(charSequence, parsePosition, Locale.ROOT, true);
            } else {
                parsePosition.setErrorIndex(index);
                return null;
            }
        }
        parsePosition.setErrorIndex(index);
        return null;
    }

    /* renamed from: m */
    private static char m10806m(char c) {
        if (c != 224) {
            if (c != 249) {
                if (c != 275) {
                    if (c != 299) {
                        if (c != 363) {
                            if (c != 462) {
                                if (c != 464) {
                                    if (c != 466) {
                                        if (c == 232 || c == 233) {
                                            return 'e';
                                        }
                                        if (c == 236 || c == 237) {
                                            return 'i';
                                        }
                                        return c;
                                    }
                                    return 'o';
                                }
                                return 'i';
                            }
                            return 'a';
                        }
                        return 'u';
                    }
                    return 'i';
                }
                return 'e';
            }
            return 'u';
        }
        return 'a';
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(C10664o c10664o) {
        if (getClass().equals(c10664o.getClass())) {
            return this.number - ((C10664o) C10664o.class.cast(c10664o)).number;
        }
        throw new ClassCastException("Cannot compare different types.");
    }

    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass()) || this.number != ((C10664o) obj).number) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public EnumC10665a m10812f() {
        int i = 12;
        int i2 = this.number % 12;
        if (i2 != 0) {
            i = i2;
        }
        return EnumC10665a.values()[i - 1];
    }

    /* renamed from: g */
    public String m10811g(Locale locale) {
        String str;
        EnumC10666b m10810h = m10810h();
        EnumC10665a m10812f = m10812f();
        if (f27786y.contains(locale.getLanguage())) {
            str = "";
        } else {
            str = "-";
        }
        return m10810h.m10804a(locale) + str + m10812f.m10805a(locale);
    }

    public int getNumber() {
        return this.number;
    }

    /* renamed from: h */
    public EnumC10666b m10810h() {
        int i = 10;
        int i2 = this.number % 10;
        if (i2 != 0) {
            i = i2;
        }
        return EnumC10666b.values()[i - 1];
    }

    public int hashCode() {
        return this.number;
    }

    Object readResolve() {
        return m10809i(this.number);
    }

    public String toString() {
        return m10811g(Locale.ROOT) + "(" + String.valueOf(this.number) + ")";
    }
}