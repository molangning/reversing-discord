package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1134c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.util.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1135a {
        /* renamed from: a */
        static boolean m37831a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m37830b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m37835a(Object obj, Object obj2) {
        return C1135a.m37831a(obj, obj2);
    }

    /* renamed from: b */
    public static int m37834b(Object... objArr) {
        return C1135a.m37830b(objArr);
    }

    /* renamed from: c */
    public static <T> T m37833c(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: d */
    public static <T> T m37832d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}