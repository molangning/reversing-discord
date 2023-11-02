package p325rg;

import java.util.List;
import java.util.Map;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.EnumC7336w1;
import p304qf.C11889v;
import p305qg.InterfaceC11928h0;
import p389vh.C13294a;
import p389vh.C13296b;
import p389vh.C13306j;
import p389vh.C13329v;
import pf.C11591x;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;

/* renamed from: rg.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12153f {

    /* renamed from: a */
    private static final C11638f f31597a;

    /* renamed from: b */
    private static final C11638f f31598b;

    /* renamed from: c */
    private static final C11638f f31599c;

    /* renamed from: d */
    private static final C11638f f31600d;

    /* renamed from: e */
    private static final C11638f f31601e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rg.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12154a extends AbstractC9614s implements Function1<InterfaceC11928h0, AbstractC7264g0> {

        /* renamed from: j */
        final /* synthetic */ AbstractC10870h f31602j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12154a(AbstractC10870h abstractC10870h) {
            super(1);
            this.f31602j = abstractC10870h;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(InterfaceC11928h0 module) {
            C9612q.m13917h(module, "module");
            AbstractC7302o0 m9804l = module.mo4194n().m9804l(EnumC7336w1.INVARIANT, this.f31602j.m9829W());
            C9612q.m13918g(m9804l, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return m9804l;
        }
    }

    static {
        C11638f m7422f = C11638f.m7422f("message");
        C9612q.m13918g(m7422f, "identifier(\"message\")");
        f31597a = m7422f;
        C11638f m7422f2 = C11638f.m7422f("replaceWith");
        C9612q.m13918g(m7422f2, "identifier(\"replaceWith\")");
        f31598b = m7422f2;
        C11638f m7422f3 = C11638f.m7422f("level");
        C9612q.m13918g(m7422f3, "identifier(\"level\")");
        f31599c = m7422f3;
        C11638f m7422f4 = C11638f.m7422f("expression");
        C9612q.m13918g(m7422f4, "identifier(\"expression\")");
        f31600d = m7422f4;
        C11638f m7422f5 = C11638f.m7422f("imports");
        C9612q.m13918g(m7422f5, "identifier(\"imports\")");
        f31601e = m7422f5;
    }

    /* renamed from: a */
    public static final InterfaceC12149c m6041a(AbstractC10870h abstractC10870h, String message, String replaceWith, String level) {
        List m14104i;
        Map m6751k;
        Map m6751k2;
        C9612q.m13917h(abstractC10870h, "<this>");
        C9612q.m13917h(message, "message");
        C9612q.m13917h(replaceWith, "replaceWith");
        C9612q.m13917h(level, "level");
        C11633c c11633c = C10884k.C10885a.f28436B;
        C11638f c11638f = f31601e;
        m14104i = C9545j.m14104i();
        m6751k = C11889v.m6751k(C11591x.m7577a(f31600d, new C13329v(replaceWith)), C11591x.m7577a(c11638f, new C13296b(m14104i, new C12154a(abstractC10870h))));
        C12161j c12161j = new C12161j(abstractC10870h, c11633c, m6751k);
        C11633c c11633c2 = C10884k.C10885a.f28518y;
        C11638f c11638f2 = f31599c;
        C11632b m7460m = C11632b.m7460m(C10884k.C10885a.f28434A);
        C9612q.m13918g(m7460m, "topLevel(StandardNames.FqNames.deprecationLevel)");
        C11638f m7422f = C11638f.m7422f(level);
        C9612q.m13918g(m7422f, "identifier(level)");
        m6751k2 = C11889v.m6751k(C11591x.m7577a(f31597a, new C13329v(message)), C11591x.m7577a(f31598b, new C13294a(c12161j)), C11591x.m7577a(c11638f2, new C13306j(m7460m, m7422f)));
        return new C12161j(abstractC10870h, c11633c2, m6751k2);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC12149c m6040b(AbstractC10870h abstractC10870h, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return m6041a(abstractC10870h, str, str2, str3);
    }
}
