package ng;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.C9544i;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.C7327u0;
import p287pi.C11644a;
import p305qg.C11938k0;
import p305qg.C11994x;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p448yg.EnumC14023d;
import pf.C11577n;
import pf.EnumC11580p;
import ph.C11632b;
import ph.C11638f;

/* renamed from: ng.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10880j {

    /* renamed from: a */
    private final C11938k0 f28395a;

    /* renamed from: b */
    private final Lazy f28396b;

    /* renamed from: c */
    private final C10881a f28397c;

    /* renamed from: d */
    private final C10881a f28398d;

    /* renamed from: e */
    private final C10881a f28399e;

    /* renamed from: f */
    private final C10881a f28400f;

    /* renamed from: g */
    private final C10881a f28401g;

    /* renamed from: h */
    private final C10881a f28402h;

    /* renamed from: i */
    private final C10881a f28403i;

    /* renamed from: j */
    private final C10881a f28404j;

    /* renamed from: l */
    static final /* synthetic */ KProperty<Object>[] f28394l = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C10880j.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C10880j.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C10880j.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C10880j.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C10880j.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C10880j.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C10880j.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C10880j.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: k */
    public static final C10882b f28393k = new C10882b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ng.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10881a {

        /* renamed from: a */
        private final int f28405a;

        public C10881a(int i) {
            this.f28405a = i;
        }

        /* renamed from: a */
        public final InterfaceC11914e m9759a(C10880j types, KProperty<?> property) {
            C9612q.m13917h(types, "types");
            C9612q.m13917h(property, "property");
            return types.m9762b(C11644a.m7380a(property.getName()), this.f28405a);
        }
    }

    /* renamed from: ng.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10882b {
        private C10882b() {
        }

        public /* synthetic */ C10882b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7264g0 m9758a(InterfaceC11928h0 module) {
            Object m14033q0;
            List m14109d;
            C9612q.m13917h(module, "module");
            InterfaceC11914e m6652a = C11994x.m6652a(module, C10884k.C10885a.f28507s0);
            if (m6652a == null) {
                return null;
            }
            C7226c1 m21197h = C7226c1.f19622k.m21197h();
            List<InterfaceC11920f1> parameters = m6652a.mo4173k().getParameters();
            C9612q.m13918g(parameters, "kPropertyClass.typeConstructor.parameters");
            m14033q0 = C9553r.m14033q0(parameters);
            C9612q.m13918g(m14033q0, "kPropertyClass.typeConstructor.parameters.single()");
            m14109d = C9544i.m14109d(new C7327u0((InterfaceC11920f1) m14033q0));
            return C7267h0.m21101g(m21197h, m6652a, m14109d);
        }
    }

    /* renamed from: ng.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C10883c extends AbstractC9614s implements Function0<InterfaceC0194h> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC11928h0 f28406j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10883c(InterfaceC11928h0 interfaceC11928h0) {
            super(0);
            this.f28406j = interfaceC11928h0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC0194h invoke() {
            return this.f28406j.mo4210H0(C10884k.f28425r).mo4237o();
        }
    }

    public C10880j(InterfaceC11928h0 module, C11938k0 notFoundClasses) {
        Lazy m7600b;
        C9612q.m13917h(module, "module");
        C9612q.m13917h(notFoundClasses, "notFoundClasses");
        this.f28395a = notFoundClasses;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C10883c(module));
        this.f28396b = m7600b;
        this.f28397c = new C10881a(1);
        this.f28398d = new C10881a(1);
        this.f28399e = new C10881a(1);
        this.f28400f = new C10881a(2);
        this.f28401g = new C10881a(3);
        this.f28402h = new C10881a(1);
        this.f28403i = new C10881a(2);
        this.f28404j = new C10881a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final InterfaceC11914e m9762b(String str, int i) {
        InterfaceC11914e interfaceC11914e;
        List<Integer> m14109d;
        C11638f m7422f = C11638f.m7422f(str);
        C9612q.m13918g(m7422f, "identifier(className)");
        InterfaceC11927h mo16932g = m9760d().mo16932g(m7422f, EnumC14023d.FROM_REFLECTION);
        if (mo16932g instanceof InterfaceC11914e) {
            interfaceC11914e = (InterfaceC11914e) mo16932g;
        } else {
            interfaceC11914e = null;
        }
        if (interfaceC11914e == null) {
            C11938k0 c11938k0 = this.f28395a;
            C11632b c11632b = new C11632b(C10884k.f28425r, m7422f);
            m14109d = C9544i.m14109d(Integer.valueOf(i));
            return c11938k0.m6700d(c11632b, m14109d);
        }
        return interfaceC11914e;
    }

    /* renamed from: d */
    private final InterfaceC0194h m9760d() {
        return (InterfaceC0194h) this.f28396b.getValue();
    }

    /* renamed from: c */
    public final InterfaceC11914e m9761c() {
        return this.f28397c.m9759a(this, f28394l[0]);
    }
}
