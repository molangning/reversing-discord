package io.sentry.util;

import io.sentry.C7831b0;
import io.sentry.InterfaceC8040o0;
import io.sentry.hints.EnumC7950h;
import io.sentry.hints.InterfaceC7945c;
import io.sentry.hints.InterfaceC7946d;
import io.sentry.hints.InterfaceC7948f;
import io.sentry.util.C8220j;

/* renamed from: io.sentry.util.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8220j {

    @FunctionalInterface
    /* renamed from: io.sentry.util.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC8221a<T> {
        void accept(T t);
    }

    @FunctionalInterface
    /* renamed from: io.sentry.util.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC8222b {
        /* renamed from: a */
        void mo18208a(Object obj, Class<?> cls);
    }

    @FunctionalInterface
    /* renamed from: io.sentry.util.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC8223c<T> {
        void accept(T t);
    }

    /* renamed from: e */
    public static C7831b0 m18225e(Object obj) {
        C7831b0 c7831b0 = new C7831b0();
        m18210t(c7831b0, obj);
        return c7831b0;
    }

    /* renamed from: f */
    public static EnumC7950h m18224f(C7831b0 c7831b0) {
        return (EnumC7950h) c7831b0.m19598d("sentry:eventDropReason", EnumC7950h.class);
    }

    /* renamed from: g */
    public static Object m18223g(C7831b0 c7831b0) {
        return c7831b0.m19599c("sentry:typeCheckHint");
    }

    /* renamed from: h */
    public static boolean m18222h(C7831b0 c7831b0, Class<?> cls) {
        return cls.isInstance(m18223g(c7831b0));
    }

    /* renamed from: i */
    public static boolean m18221i(C7831b0 c7831b0) {
        return Boolean.TRUE.equals(c7831b0.m19598d("sentry:isFromHybridSdk", Boolean.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m18220j(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m18218l(Object obj, Class cls) {
    }

    /* renamed from: n */
    public static <T> void m18216n(C7831b0 c7831b0, Class<T> cls, final InterfaceC8223c<Object> interfaceC8223c) {
        m18214p(c7831b0, cls, new InterfaceC8221a() { // from class: io.sentry.util.g
            @Override // io.sentry.util.C8220j.InterfaceC8221a
            public final void accept(Object obj) {
                C8220j.m18220j(obj);
            }
        }, new InterfaceC8222b() { // from class: io.sentry.util.h
            @Override // io.sentry.util.C8220j.InterfaceC8222b
            /* renamed from: a */
            public final void mo18208a(Object obj, Class cls2) {
                C8220j.InterfaceC8223c.this.accept(obj);
            }
        });
    }

    /* renamed from: o */
    public static <T> void m18215o(C7831b0 c7831b0, Class<T> cls, InterfaceC8221a<T> interfaceC8221a) {
        m18214p(c7831b0, cls, interfaceC8221a, new InterfaceC8222b() { // from class: io.sentry.util.f
            @Override // io.sentry.util.C8220j.InterfaceC8222b
            /* renamed from: a */
            public final void mo18208a(Object obj, Class cls2) {
                C8220j.m18218l(obj, cls2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static <T> void m18214p(C7831b0 c7831b0, Class<T> cls, InterfaceC8221a<T> interfaceC8221a, InterfaceC8222b interfaceC8222b) {
        Object m18223g = m18223g(c7831b0);
        if (m18222h(c7831b0, cls) && m18223g != null) {
            interfaceC8221a.accept(m18223g);
        } else {
            interfaceC8222b.mo18208a(m18223g, cls);
        }
    }

    /* renamed from: q */
    public static <T> void m18213q(C7831b0 c7831b0, Class<T> cls, final InterfaceC8040o0 interfaceC8040o0, InterfaceC8221a<T> interfaceC8221a) {
        m18214p(c7831b0, cls, interfaceC8221a, new InterfaceC8222b() { // from class: io.sentry.util.i
            @Override // io.sentry.util.C8220j.InterfaceC8222b
            /* renamed from: a */
            public final void mo18208a(Object obj, Class cls2) {
                C8227m.m18202a(cls2, obj, InterfaceC8040o0.this);
            }
        });
    }

    /* renamed from: r */
    public static void m18212r(C7831b0 c7831b0, EnumC7950h enumC7950h) {
        c7831b0.m19592j("sentry:eventDropReason", enumC7950h);
    }

    /* renamed from: s */
    public static void m18211s(C7831b0 c7831b0, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            c7831b0.m19592j("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    /* renamed from: t */
    public static void m18210t(C7831b0 c7831b0, Object obj) {
        c7831b0.m19592j("sentry:typeCheckHint", obj);
    }

    /* renamed from: u */
    public static boolean m18209u(C7831b0 c7831b0) {
        if ((!m18222h(c7831b0, InterfaceC7948f.class) && !m18222h(c7831b0, InterfaceC7946d.class)) || m18222h(c7831b0, InterfaceC7945c.class)) {
            return true;
        }
        return false;
    }
}
