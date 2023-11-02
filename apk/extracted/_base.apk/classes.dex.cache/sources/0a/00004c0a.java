package p327ri;

import kotlin.jvm.internal.C9612q;

/* renamed from: ri.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12250c {
    /* renamed from: a */
    public static final boolean m5660a(Throwable th2) {
        C9612q.m13917h(th2, "<this>");
        Class<?> cls = th2.getClass();
        while (!C9612q.m13922c(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final RuntimeException m5659b(Throwable e) {
        C9612q.m13917h(e, "e");
        throw e;
    }
}