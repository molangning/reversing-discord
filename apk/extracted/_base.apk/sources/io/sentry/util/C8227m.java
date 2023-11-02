package io.sentry.util;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;

/* renamed from: io.sentry.util.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8227m {
    /* renamed from: a */
    public static void m18202a(Class<?> cls, Object obj, InterfaceC8040o0 interfaceC8040o0) {
        String str;
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        Object[] objArr = new Object[2];
        if (obj != null) {
            str = obj.getClass().getCanonicalName();
        } else {
            str = "Hint";
        }
        objArr[0] = str;
        objArr[1] = cls.getCanonicalName();
        interfaceC8040o0.mo18135c(enumC8021m4, "%s is not %s", objArr);
    }
}
