package p013ah;

import gh.InterfaceC6762b;
import gh.InterfaceC6776m;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9546k;
import kotlin.collections.C9550o;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p304qf.C11889v;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11936j1;
import p325rg.EnumC12167m;
import p325rg.EnumC12168n;
import p389vh.AbstractC13301g;
import p389vh.C13296b;
import p389vh.C13306j;
import pf.C11591x;
import ph.C11632b;
import ph.C11638f;

/* renamed from: ah.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C0164d {

    /* renamed from: a */
    public static final C0164d f580a = new C0164d();

    /* renamed from: b */
    private static final Map<String, EnumSet<EnumC12168n>> f581b;

    /* renamed from: c */
    private static final Map<String, EnumC12167m> f582c;

    /* renamed from: ah.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C0165a extends AbstractC9614s implements Function1<InterfaceC11928h0, AbstractC7264g0> {

        /* renamed from: j */
        public static final C0165a f583j = new C0165a();

        C0165a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(InterfaceC11928h0 module) {
            AbstractC7264g0 abstractC7264g0;
            C9612q.m13917h(module, "module");
            InterfaceC11936j1 m41050b = C0158a.m41050b(C0163c.f575a.m41037d(), module.mo4194n().m9798o(C10884k.C10885a.f28448H));
            if (m41050b != null) {
                abstractC7264g0 = m41050b.getType();
            } else {
                abstractC7264g0 = null;
            }
            if (abstractC7264g0 == null) {
                return C8967k.m16945d(EnumC8966j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]);
            }
            return abstractC7264g0;
        }
    }

    static {
        Map<String, EnumSet<EnumC12168n>> m6751k;
        Map<String, EnumC12167m> m6751k2;
        m6751k = C11889v.m6751k(C11591x.m7577a("PACKAGE", EnumSet.noneOf(EnumC12168n.class)), C11591x.m7577a("TYPE", EnumSet.of(EnumC12168n.CLASS, EnumC12168n.FILE)), C11591x.m7577a("ANNOTATION_TYPE", EnumSet.of(EnumC12168n.ANNOTATION_CLASS)), C11591x.m7577a("TYPE_PARAMETER", EnumSet.of(EnumC12168n.TYPE_PARAMETER)), C11591x.m7577a("FIELD", EnumSet.of(EnumC12168n.FIELD)), C11591x.m7577a("LOCAL_VARIABLE", EnumSet.of(EnumC12168n.LOCAL_VARIABLE)), C11591x.m7577a("PARAMETER", EnumSet.of(EnumC12168n.VALUE_PARAMETER)), C11591x.m7577a("CONSTRUCTOR", EnumSet.of(EnumC12168n.CONSTRUCTOR)), C11591x.m7577a("METHOD", EnumSet.of(EnumC12168n.FUNCTION, EnumC12168n.PROPERTY_GETTER, EnumC12168n.PROPERTY_SETTER)), C11591x.m7577a("TYPE_USE", EnumSet.of(EnumC12168n.TYPE)));
        f581b = m6751k;
        m6751k2 = C11889v.m6751k(C11591x.m7577a("RUNTIME", EnumC12167m.RUNTIME), C11591x.m7577a("CLASS", EnumC12167m.BINARY), C11591x.m7577a("SOURCE", EnumC12167m.SOURCE));
        f582c = m6751k2;
    }

    private C0164d() {
    }

    /* renamed from: a */
    public final AbstractC13301g<?> m41034a(InterfaceC6762b interfaceC6762b) {
        InterfaceC6776m interfaceC6776m;
        String str;
        if (interfaceC6762b instanceof InterfaceC6776m) {
            interfaceC6776m = (InterfaceC6776m) interfaceC6762b;
        } else {
            interfaceC6776m = null;
        }
        if (interfaceC6776m == null) {
            return null;
        }
        Map<String, EnumC12167m> map = f582c;
        C11638f mo2182e = interfaceC6776m.mo2182e();
        if (mo2182e != null) {
            str = mo2182e.m7426b();
        } else {
            str = null;
        }
        EnumC12167m enumC12167m = map.get(str);
        if (enumC12167m == null) {
            return null;
        }
        C11632b m7460m = C11632b.m7460m(C10884k.C10885a.f28454K);
        C9612q.m13918g(m7460m, "topLevel(StandardNames.F…ames.annotationRetention)");
        C11638f m7422f = C11638f.m7422f(enumC12167m.name());
        C9612q.m13918g(m7422f, "identifier(retention.name)");
        return new C13306j(m7460m, m7422f);
    }

    /* renamed from: b */
    public final Set<EnumC12168n> m41033b(String str) {
        Set<EnumC12168n> m14007d;
        EnumSet<EnumC12168n> enumSet = f581b.get(str);
        if (enumSet != null) {
            return enumSet;
        }
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    /* renamed from: c */
    public final AbstractC13301g<?> m41032c(List<? extends InterfaceC6762b> arguments) {
        int m14093t;
        String str;
        C9612q.m13917h(arguments, "arguments");
        ArrayList<InterfaceC6776m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof InterfaceC6776m) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC12168n> arrayList2 = new ArrayList();
        for (InterfaceC6776m interfaceC6776m : arrayList) {
            C0164d c0164d = f580a;
            C11638f mo2182e = interfaceC6776m.mo2182e();
            if (mo2182e != null) {
                str = mo2182e.m7426b();
            } else {
                str = null;
            }
            C9550o.m14085y(arrayList2, c0164d.m41033b(str));
        }
        m14093t = C9546k.m14093t(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(m14093t);
        for (EnumC12168n enumC12168n : arrayList2) {
            C11632b m7460m = C11632b.m7460m(C10884k.C10885a.f28452J);
            C9612q.m13918g(m7460m, "topLevel(StandardNames.FqNames.annotationTarget)");
            C11638f m7422f = C11638f.m7422f(enumC12168n.name());
            C9612q.m13918g(m7422f, "identifier(kotlinTarget.name)");
            arrayList3.add(new C13306j(m7460m, m7422f));
        }
        return new C13296b(arrayList3, C0165a.f583j);
    }
}