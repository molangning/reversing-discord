package com.discord.logging;

import ag.C0156a;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import timber.log.C12799a;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\u000b\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\f\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/logging/Log;", "", "()V", "d", "", "tag", "", "message", "exception", "", "Lkotlin/reflect/KClass;", "e", "i", "w", "logging_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class Log {
    public static final Log INSTANCE = new Log();

    static {
        C12799a.f33169a.m3894a(new LoggingTree());
    }

    private Log() {
    }

    public static /* synthetic */ void d$default(Log log, String str, String str2, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m31914d(str, str2, th2);
    }

    public static /* synthetic */ void e$default(Log log, String str, String str2, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m31912e(str, str2, th2);
    }

    public static /* synthetic */ void i$default(Log log, String str, String str2, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m31910i(str, str2, th2);
    }

    public static /* synthetic */ void w$default(Log log, String str, String str2, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m31908w(str, str2, th2);
    }

    /* renamed from: d */
    public final void m31914d(String tag, String message, Throwable th2) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        C12799a.C12802b c12802b = C12799a.f33169a;
        c12802b.m3893b(tag);
        c12802b.mo3890d(th2, message, new Object[0]);
    }

    /* renamed from: e */
    public final void m31912e(String tag, String message, Throwable th2) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        C12799a.C12802b c12802b = C12799a.f33169a;
        c12802b.m3893b(tag);
        c12802b.mo3887e(th2, message, new Object[0]);
    }

    /* renamed from: i */
    public final void m31910i(String tag, String message, Throwable th2) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        C12799a.C12802b c12802b = C12799a.f33169a;
        c12802b.m3893b(tag);
        c12802b.mo3884i(th2, message, new Object[0]);
    }

    /* renamed from: w */
    public final void m31908w(String tag, String message, Throwable th2) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        C12799a.C12802b c12802b = C12799a.f33169a;
        c12802b.m3893b(tag);
        c12802b.mo3878w(th2, message, new Object[0]);
    }

    public static /* synthetic */ void d$default(Log log, KClass kClass, String str, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m31913d(kClass, str, th2);
    }

    public static /* synthetic */ void e$default(Log log, KClass kClass, String str, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m31911e(kClass, str, th2);
    }

    public static /* synthetic */ void i$default(Log log, KClass kClass, String str, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m31909i(kClass, str, th2);
    }

    public static /* synthetic */ void w$default(Log log, KClass kClass, String str, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m31907w(kClass, str, th2);
    }

    /* renamed from: d */
    public final void m31913d(KClass<?> tag, String message, Throwable th2) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        String simpleName = C0156a.m41055b(tag).getSimpleName();
        C9612q.m13918g(simpleName, "tag.java.simpleName");
        m31914d(simpleName, message, th2);
    }

    /* renamed from: e */
    public final void m31911e(KClass<?> tag, String message, Throwable th2) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        String simpleName = C0156a.m41055b(tag).getSimpleName();
        C9612q.m13918g(simpleName, "tag.java.simpleName");
        m31912e(simpleName, message, th2);
    }

    /* renamed from: i */
    public final void m31909i(KClass<?> tag, String message, Throwable th2) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        String simpleName = C0156a.m41055b(tag).getSimpleName();
        C9612q.m13918g(simpleName, "tag.java.simpleName");
        m31910i(simpleName, message, th2);
    }

    /* renamed from: w */
    public final void m31907w(KClass<?> tag, String message, Throwable th2) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(message, "message");
        String simpleName = C0156a.m41055b(tag).getSimpleName();
        C9612q.m13918g(simpleName, "tag.java.simpleName");
        m31908w(simpleName, message, th2);
    }
}
