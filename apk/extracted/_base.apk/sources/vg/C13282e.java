package vg;

import kotlin.jvm.internal.C9612q;

/* renamed from: vg.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13282e {
    /* renamed from: a */
    public static final Class<?> m2857a(ClassLoader classLoader, String fqName) {
        C9612q.m13917h(classLoader, "<this>");
        C9612q.m13917h(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
