package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
enum EnumC5233n0 {
    None(ViewProps.NONE),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");
    

    /* renamed from: p */
    private static final Map<String, EnumC5233n0> f14784p = new HashMap();

    /* renamed from: j */
    private final String f14786j;

    static {
        EnumC5233n0[] values;
        for (EnumC5233n0 enumC5233n0 : values()) {
            f14784p.put(enumC5233n0.f14786j, enumC5233n0);
        }
    }

    EnumC5233n0(String str) {
        this.f14786j = str;
    }

    /* renamed from: a */
    public static EnumC5233n0 m25797a(String str) {
        Map<String, EnumC5233n0> map = f14784p;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14786j;
    }
}