package p401w9;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w9.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13462w {
    /* renamed from: a */
    public static void m2435a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Objects.toString(obj2);
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}