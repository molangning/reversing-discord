package com.mkuczera;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mkuczera.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5277c {

    /* renamed from: a */
    static Map<String, InterfaceC5276b> f15013a;

    static {
        HashMap hashMap = new HashMap();
        f15013a = hashMap;
        hashMap.put("impactLight", new C5280f(new long[]{0, 20}));
        f15013a.put("impactMedium", new C5280f(new long[]{0, 40}));
        f15013a.put("impactHeavy", new C5280f(new long[]{0, 60}));
        f15013a.put("notificationSuccess", new C5280f(new long[]{0, 40, 60, 20}));
        f15013a.put("notificationWarning", new C5280f(new long[]{0, 20, 60, 40}));
        f15013a.put("notificationError", new C5280f(new long[]{0, 20, 40, 30, 40, 40}));
        f15013a.put("rigid", new C5280f(new long[]{0, 30}));
        f15013a.put("soft", new C5280f(new long[]{0, 10}));
        f15013a.put("clockTick", new C5281g(4));
        f15013a.put("contextClick", new C5281g(6));
        f15013a.put("keyboardPress", new C5281g(3));
        f15013a.put("keyboardRelease", new C5281g(7));
        f15013a.put("keyboardTap", new C5281g(3));
        f15013a.put("longPress", new C5281g(0));
        f15013a.put("textHandleMove", new C5281g(9));
        f15013a.put("virtualKey", new C5281g(1));
        f15013a.put("virtualKeyRelease", new C5281g(8));
        f15013a.put("effectClick", new C5279e(0));
        f15013a.put("effectDoubleClick", new C5279e(1));
        f15013a.put("effectHeavyClick", new C5279e(5));
        f15013a.put("effectTick", new C5279e(2));
    }

    /* renamed from: a */
    public static InterfaceC5276b m25542a(String str) {
        return f15013a.get(str);
    }
}