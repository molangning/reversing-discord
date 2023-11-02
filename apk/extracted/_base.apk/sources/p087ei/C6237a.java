package p087ei;

import ci.C2555a;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import ph.C11633c;

/* renamed from: ei.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6237a extends C2555a {

    /* renamed from: n */
    public static final C6237a f17663n = new C6237a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C6237a() {
        /*
            r14 = this;
            rh.g r1 = p326rh.C12183g.m5865d()
            p219lh.C10190b.m12134a(r1)
            java.lang.String r0 = "newInstance().apply(Buil…f::registerAllExtensions)"
            kotlin.jvm.internal.C9612q.m13918g(r1, r0)
            rh.i$f<kh.l, java.lang.Integer> r2 = p219lh.C10190b.f26498a
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.C9612q.m13918g(r2, r0)
            rh.i$f<kh.d, java.util.List<kh.b>> r3 = p219lh.C10190b.f26500c
            java.lang.String r0 = "constructorAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r3, r0)
            rh.i$f<kh.c, java.util.List<kh.b>> r4 = p219lh.C10190b.f26499b
            java.lang.String r0 = "classAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r4, r0)
            rh.i$f<kh.i, java.util.List<kh.b>> r5 = p219lh.C10190b.f26501d
            java.lang.String r0 = "functionAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r5, r0)
            rh.i$f<kh.n, java.util.List<kh.b>> r6 = p219lh.C10190b.f26502e
            java.lang.String r0 = "propertyAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r6, r0)
            rh.i$f<kh.n, java.util.List<kh.b>> r7 = p219lh.C10190b.f26503f
            java.lang.String r0 = "propertyGetterAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r7, r0)
            rh.i$f<kh.n, java.util.List<kh.b>> r8 = p219lh.C10190b.f26504g
            java.lang.String r0 = "propertySetterAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r8, r0)
            rh.i$f<kh.g, java.util.List<kh.b>> r9 = p219lh.C10190b.f26506i
            java.lang.String r0 = "enumEntryAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r9, r0)
            rh.i$f<kh.n, kh.b$b$c> r10 = p219lh.C10190b.f26505h
            java.lang.String r0 = "compileTimeValue"
            kotlin.jvm.internal.C9612q.m13918g(r10, r0)
            rh.i$f<kh.u, java.util.List<kh.b>> r11 = p219lh.C10190b.f26507j
            java.lang.String r0 = "parameterAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r11, r0)
            rh.i$f<kh.q, java.util.List<kh.b>> r12 = p219lh.C10190b.f26508k
            java.lang.String r0 = "typeAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r12, r0)
            rh.i$f<kh.s, java.util.List<kh.b>> r13 = p219lh.C10190b.f26509l
            java.lang.String r0 = "typeParameterAnnotation"
            kotlin.jvm.internal.C9612q.m13918g(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087ei.C6237a.<init>():void");
    }

    /* renamed from: o */
    private final String m23176o(C11633c c11633c) {
        if (c11633c.m7456d()) {
            return "default-package";
        }
        String m7426b = c11633c.m7453g().m7426b();
        C9612q.m13918g(m7426b, "fqName.shortName().asString()");
        return m7426b;
    }

    /* renamed from: m */
    public final String m23178m(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        return m23176o(fqName) + ".kotlin_builtins";
    }

    /* renamed from: n */
    public final String m23177n(C11633c fqName) {
        String m13763C;
        C9612q.m13917h(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String m7458b = fqName.m7458b();
        C9612q.m13918g(m7458b, "fqName.asString()");
        m13763C = C9653o.m13763C(m7458b, '.', '/', false, 4, null);
        sb2.append(m13763C);
        sb2.append('/');
        sb2.append(m23178m(fqName));
        return sb2.toString();
    }
}
