package p013ah;

import ch.C2548g;
import gh.InterfaceC6760a;
import gh.InterfaceC6766d;
import java.util.Map;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import p069dh.C5846e;
import p304qf.C11889v;
import p325rg.InterfaceC12149c;
import p468zg.C14208b0;
import pf.C11591x;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;

/* renamed from: ah.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C0163c {

    /* renamed from: a */
    public static final C0163c f575a = new C0163c();

    /* renamed from: b */
    private static final C11638f f576b;

    /* renamed from: c */
    private static final C11638f f577c;

    /* renamed from: d */
    private static final C11638f f578d;

    /* renamed from: e */
    private static final Map<C11633c, C11633c> f579e;

    static {
        Map<C11633c, C11633c> m6751k;
        C11638f m7422f = C11638f.m7422f("message");
        C9612q.m13918g(m7422f, "identifier(\"message\")");
        f576b = m7422f;
        C11638f m7422f2 = C11638f.m7422f("allowedTargets");
        C9612q.m13918g(m7422f2, "identifier(\"allowedTargets\")");
        f577c = m7422f2;
        C11638f m7422f3 = C11638f.m7422f("value");
        C9612q.m13918g(m7422f3, "identifier(\"value\")");
        f578d = m7422f3;
        m6751k = C11889v.m6751k(C11591x.m7577a(C10884k.C10885a.f28448H, C14208b0.f36535d), C11591x.m7577a(C10884k.C10885a.f28455L, C14208b0.f36537f), C11591x.m7577a(C10884k.C10885a.f28459P, C14208b0.f36540i));
        f579e = m6751k;
    }

    private C0163c() {
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC12149c m41035f(C0163c c0163c, InterfaceC6760a interfaceC6760a, C2548g c2548g, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c0163c.m41036e(interfaceC6760a, c2548g, z);
    }

    /* renamed from: a */
    public final InterfaceC12149c m41040a(C11633c kotlinName, InterfaceC6766d annotationOwner, C2548g c) {
        InterfaceC6760a mo2159b;
        C9612q.m13917h(kotlinName, "kotlinName");
        C9612q.m13917h(annotationOwner, "annotationOwner");
        C9612q.m13917h(c, "c");
        if (C9612q.m13922c(kotlinName, C10884k.C10885a.f28518y)) {
            C11633c DEPRECATED_ANNOTATION = C14208b0.f36539h;
            C9612q.m13918g(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            InterfaceC6760a mo2159b2 = annotationOwner.mo2159b(DEPRECATED_ANNOTATION);
            if (mo2159b2 != null || annotationOwner.mo2164D()) {
                return new C0166e(mo2159b2, c);
            }
        }
        C11633c c11633c = f579e.get(kotlinName);
        if (c11633c == null || (mo2159b = annotationOwner.mo2159b(c11633c)) == null) {
            return null;
        }
        return m41035f(f575a, mo2159b, c, false, 4, null);
    }

    /* renamed from: b */
    public final C11638f m41039b() {
        return f576b;
    }

    /* renamed from: c */
    public final C11638f m41038c() {
        return f578d;
    }

    /* renamed from: d */
    public final C11638f m41037d() {
        return f577c;
    }

    /* renamed from: e */
    public final InterfaceC12149c m41036e(InterfaceC6760a annotation, C2548g c, boolean z) {
        C9612q.m13917h(annotation, "annotation");
        C9612q.m13917h(c, "c");
        C11632b mo2230n = annotation.mo2230n();
        if (C9612q.m13922c(mo2230n, C11632b.m7460m(C14208b0.f36535d))) {
            return new C0174i(annotation, c);
        }
        if (C9612q.m13922c(mo2230n, C11632b.m7460m(C14208b0.f36537f))) {
            return new C0172h(annotation, c);
        }
        if (C9612q.m13922c(mo2230n, C11632b.m7460m(C14208b0.f36540i))) {
            return new C0161b(c, annotation, C10884k.C10885a.f28459P);
        }
        if (C9612q.m13922c(mo2230n, C11632b.m7460m(C14208b0.f36539h))) {
            return null;
        }
        return new C5846e(c, annotation, z);
    }
}
