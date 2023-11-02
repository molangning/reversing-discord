package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
enum EnumC5228l0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");
    

    /* renamed from: x */
    private static final Map<String, EnumC5228l0> f14757x = new HashMap();

    /* renamed from: j */
    private final String f14759j;

    static {
        EnumC5228l0[] values;
        for (EnumC5228l0 enumC5228l0 : values()) {
            f14757x.put(enumC5228l0.f14759j, enumC5228l0);
        }
    }

    EnumC5228l0(String str) {
        this.f14759j = str;
    }

    /* renamed from: a */
    public static EnumC5228l0 m25829a(String str) {
        return f14757x.get(str);
    }

    /* renamed from: b */
    public static boolean m25828b(String str) {
        return f14757x.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14759j;
    }
}