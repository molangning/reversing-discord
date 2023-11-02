package p183ji;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9559v;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p234mi.C10472a;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import ph.C11638f;

/* renamed from: ji.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C8967k {

    /* renamed from: a */
    public static final C8967k f23554a = new C8967k();

    /* renamed from: b */
    private static final InterfaceC11928h0 f23555b = C8960d.f23436j;

    /* renamed from: c */
    private static final C8956a f23556c;

    /* renamed from: d */
    private static final AbstractC7264g0 f23557d;

    /* renamed from: e */
    private static final AbstractC7264g0 f23558e;

    /* renamed from: f */
    private static final InterfaceC11989u0 f23559f;

    /* renamed from: g */
    private static final Set<InterfaceC11989u0> f23560g;

    static {
        Set<InterfaceC11989u0> m14008c;
        String format = String.format(EnumC8957b.ERROR_CLASS.m16962b(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C9612q.m13918g(format, "format(this, *args)");
        C11638f m7419i = C11638f.m7419i(format);
        C9612q.m13918g(m7419i, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f23556c = new C8956a(m7419i);
        f23557d = m16945d(EnumC8966j.CYCLIC_SUPERTYPES, new String[0]);
        f23558e = m16945d(EnumC8966j.ERROR_PROPERTY_TYPE, new String[0]);
        C8961e c8961e = new C8961e();
        f23559f = c8961e;
        m14008c = C9559v.m14008c(c8961e);
        f23560g = m14008c;
    }

    private C8967k() {
    }

    /* renamed from: a */
    public static final C8962f m16948a(EnumC8963g kind, boolean z, String... formatParams) {
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(formatParams, "formatParams");
        if (z) {
            return new C8968l(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        return new C8962f(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: b */
    public static final C8962f m16947b(EnumC8963g kind, String... formatParams) {
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(formatParams, "formatParams");
        return m16948a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: d */
    public static final C8964h m16945d(EnumC8966j kind, String... formatParams) {
        List<? extends InterfaceC7288k1> m14104i;
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(formatParams, "formatParams");
        C8967k c8967k = f23554a;
        m14104i = C9545j.m14104i();
        return c8967k.m16942g(kind, m14104i, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: m */
    public static final boolean m16936m(InterfaceC11947m interfaceC11947m) {
        if (interfaceC11947m != null) {
            C8967k c8967k = f23554a;
            if (c8967k.m16935n(interfaceC11947m) || c8967k.m16935n(interfaceC11947m.mo4163b()) || interfaceC11947m == f23555b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m16935n(InterfaceC11947m interfaceC11947m) {
        return interfaceC11947m instanceof C8956a;
    }

    /* renamed from: o */
    public static final boolean m16934o(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            return false;
        }
        InterfaceC7265g1 mo3564N0 = abstractC7264g0.mo3564N0();
        if (!(mo3564N0 instanceof C8965i) || ((C8965i) mo3564N0).m16953c() != EnumC8966j.UNINFERRED_TYPE_VARIABLE) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final C8964h m16946c(EnumC8966j kind, InterfaceC7265g1 typeConstructor, String... formatParams) {
        List<? extends InterfaceC7288k1> m14104i;
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(typeConstructor, "typeConstructor");
        C9612q.m13917h(formatParams, "formatParams");
        m14104i = C9545j.m14104i();
        return m16943f(kind, m14104i, typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: e */
    public final C8965i m16944e(EnumC8966j kind, String... formatParams) {
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(formatParams, "formatParams");
        return new C8965i(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: f */
    public final C8964h m16943f(EnumC8966j kind, List<? extends InterfaceC7288k1> arguments, InterfaceC7265g1 typeConstructor, String... formatParams) {
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(arguments, "arguments");
        C9612q.m13917h(typeConstructor, "typeConstructor");
        C9612q.m13917h(formatParams, "formatParams");
        return new C8964h(typeConstructor, m16947b(EnumC8963g.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: g */
    public final C8964h m16942g(EnumC8966j kind, List<? extends InterfaceC7288k1> arguments, String... formatParams) {
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(arguments, "arguments");
        C9612q.m13917h(formatParams, "formatParams");
        return m16943f(kind, arguments, m16944e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    /* renamed from: h */
    public final C8956a m16941h() {
        return f23556c;
    }

    /* renamed from: i */
    public final InterfaceC11928h0 m16940i() {
        return f23555b;
    }

    /* renamed from: j */
    public final Set<InterfaceC11989u0> m16939j() {
        return f23560g;
    }

    /* renamed from: k */
    public final AbstractC7264g0 m16938k() {
        return f23558e;
    }

    /* renamed from: l */
    public final AbstractC7264g0 m16937l() {
        return f23557d;
    }

    /* renamed from: p */
    public final String m16933p(AbstractC7264g0 type) {
        C9612q.m13917h(type, "type");
        C10472a.m11439s(type);
        InterfaceC7265g1 mo3564N0 = type.mo3564N0();
        if (mo3564N0 != null) {
            return ((C8965i) mo3564N0).m16952d(0);
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
    }
}
