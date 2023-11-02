package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.horcrux.svg.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC5222i0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom(ViewProps.BOTTOM),
    center("center"),
    top(ViewProps.TOP),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");
    

    /* renamed from: A */
    private static final Map<String, EnumC5222i0> f14672A = new HashMap();

    /* renamed from: j */
    private final String f14690j;

    static {
        EnumC5222i0[] values;
        for (EnumC5222i0 enumC5222i0 : values()) {
            f14672A.put(enumC5222i0.f14690j, enumC5222i0);
        }
    }

    EnumC5222i0(String str) {
        this.f14690j = str;
    }

    /* renamed from: a */
    public static EnumC5222i0 m25859a(String str) {
        Map<String, EnumC5222i0> map = f14672A;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14690j;
    }
}