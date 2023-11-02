package lc;

import java.util.HashMap;
import java.util.Map;
import p136hc.C7060f;

/* renamed from: lc.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10122d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    

    /* renamed from: M */
    private static final Map<Integer, EnumC10122d> f26382M = new HashMap();

    /* renamed from: N */
    private static final Map<String, EnumC10122d> f26383N = new HashMap();

    /* renamed from: j */
    private final int[] f26400j;

    /* renamed from: k */
    private final String[] f26401k;

    static {
        EnumC10122d[] values;
        for (EnumC10122d enumC10122d : values()) {
            for (int i : enumC10122d.f26400j) {
                f26382M.put(Integer.valueOf(i), enumC10122d);
            }
            f26383N.put(enumC10122d.name(), enumC10122d);
            for (String str : enumC10122d.f26401k) {
                f26383N.put(str, enumC10122d);
            }
        }
    }

    EnumC10122d(int i) {
        this(new int[]{i}, new String[0]);
    }

    /* renamed from: a */
    public static EnumC10122d m12236a(int i) {
        if (i >= 0 && i < 900) {
            return f26382M.get(Integer.valueOf(i));
        }
        throw C7060f.m21471a();
    }

    EnumC10122d(int i, String... strArr) {
        this.f26400j = new int[]{i};
        this.f26401k = strArr;
    }

    EnumC10122d(int[] iArr, String... strArr) {
        this.f26400j = iArr;
        this.f26401k = strArr;
    }
}
