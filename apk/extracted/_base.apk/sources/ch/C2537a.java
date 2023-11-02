package ch;

import gh.InterfaceC6789z;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11921g;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12155g;
import p468zg.C14265y;
import pf.C11577n;
import pf.EnumC11580p;

/* renamed from: ch.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C2537a {

    /* renamed from: ch.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C2538a extends AbstractC9614s implements Function0<C14265y> {

        /* renamed from: j */
        final /* synthetic */ C2548g f6943j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC11921g f6944k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2538a(C2548g c2548g, InterfaceC11921g interfaceC11921g) {
            super(0);
            this.f6943j = c2548g;
            this.f6944k = interfaceC11921g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C14265y invoke() {
            return C2537a.m33054g(this.f6943j, this.f6944k.getAnnotations());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C2539b extends AbstractC9614s implements Function0<C14265y> {

        /* renamed from: j */
        final /* synthetic */ C2548g f6945j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC12155g f6946k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2539b(C2548g c2548g, InterfaceC12155g interfaceC12155g) {
            super(0);
            this.f6945j = c2548g;
            this.f6946k = interfaceC12155g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C14265y invoke() {
            return C2537a.m33054g(this.f6945j, this.f6946k);
        }
    }

    /* renamed from: a */
    public static final C2548g m33060a(C2548g c2548g, InterfaceC2553k typeParameterResolver) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(typeParameterResolver, "typeParameterResolver");
        return new C2548g(c2548g.m33014a(), typeParameterResolver, c2548g.m33012c());
    }

    /* renamed from: b */
    private static final C2548g m33059b(C2548g c2548g, InterfaceC11947m interfaceC11947m, InterfaceC6789z interfaceC6789z, int i, Lazy<C14265y> lazy) {
        InterfaceC2553k m33009f;
        C2540b m33014a = c2548g.m33014a();
        if (interfaceC6789z != null) {
            m33009f = new C2549h(c2548g, interfaceC11947m, interfaceC6789z, i);
        } else {
            m33009f = c2548g.m33009f();
        }
        return new C2548g(m33014a, m33009f, lazy);
    }

    /* renamed from: c */
    public static final C2548g m33058c(C2548g c2548g, InterfaceC11921g containingDeclaration, InterfaceC6789z interfaceC6789z, int i) {
        Lazy m7600b;
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        m7600b = C11577n.m7600b(EnumC11580p.NONE, new C2538a(c2548g, containingDeclaration));
        return m33059b(c2548g, containingDeclaration, interfaceC6789z, i, m7600b);
    }

    /* renamed from: d */
    public static /* synthetic */ C2548g m33057d(C2548g c2548g, InterfaceC11921g interfaceC11921g, InterfaceC6789z interfaceC6789z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC6789z = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m33058c(c2548g, interfaceC11921g, interfaceC6789z, i);
    }

    /* renamed from: e */
    public static final C2548g m33056e(C2548g c2548g, InterfaceC11947m containingDeclaration, InterfaceC6789z typeParameterOwner, int i) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(typeParameterOwner, "typeParameterOwner");
        return m33059b(c2548g, containingDeclaration, typeParameterOwner, i, c2548g.m33012c());
    }

    /* renamed from: f */
    public static /* synthetic */ C2548g m33055f(C2548g c2548g, InterfaceC11947m interfaceC11947m, InterfaceC6789z interfaceC6789z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m33056e(c2548g, interfaceC11947m, interfaceC6789z, i);
    }

    /* renamed from: g */
    public static final C14265y m33054g(C2548g c2548g, InterfaceC12155g additionalAnnotations) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(additionalAnnotations, "additionalAnnotations");
        return c2548g.m33014a().m33049a().m467c(c2548g.m33013b(), additionalAnnotations);
    }

    /* renamed from: h */
    public static final C2548g m33053h(C2548g c2548g, InterfaceC12155g additionalAnnotations) {
        Lazy m7600b;
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(additionalAnnotations, "additionalAnnotations");
        if (!additionalAnnotations.isEmpty()) {
            C2540b m33014a = c2548g.m33014a();
            InterfaceC2553k m33009f = c2548g.m33009f();
            m7600b = C11577n.m7600b(EnumC11580p.NONE, new C2539b(c2548g, additionalAnnotations));
            return new C2548g(m33014a, m33009f, m7600b);
        }
        return c2548g;
    }

    /* renamed from: i */
    public static final C2548g m33052i(C2548g c2548g, C2540b components) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(components, "components");
        return new C2548g(components, c2548g.m33009f(), c2548g.m33012c());
    }
}
