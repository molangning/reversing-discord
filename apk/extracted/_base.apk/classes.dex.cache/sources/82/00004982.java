package pg;

import gi.C6820m;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9544i;
import kotlin.collections.C9553r;
import kotlin.collections.C9559v;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import ng.C10884k;
import ng.InterfaceC10863b;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import ph.C11632b;
import ph.C11633c;
import ph.C11634d;
import ph.C11638f;
import sg.InterfaceC12473b;
import tg.C12702h;

/* renamed from: pg.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11602e implements InterfaceC12473b {

    /* renamed from: g */
    private static final C11638f f30134g;

    /* renamed from: h */
    private static final C11632b f30135h;

    /* renamed from: a */
    private final InterfaceC11928h0 f30136a;

    /* renamed from: b */
    private final Function1<InterfaceC11928h0, InterfaceC11947m> f30137b;

    /* renamed from: c */
    private final InterfaceC6815i f30138c;

    /* renamed from: e */
    static final /* synthetic */ KProperty<Object>[] f30132e = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C11602e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d */
    public static final C11604b f30131d = new C11604b(null);

    /* renamed from: f */
    private static final C11633c f30133f = C10884k.f28428u;

    /* renamed from: pg.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11603a extends AbstractC9614s implements Function1<InterfaceC11928h0, InterfaceC10863b> {

        /* renamed from: j */
        public static final C11603a f30139j = new C11603a();

        C11603a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC10863b invoke(InterfaceC11928h0 module) {
            Object m14056T;
            C9612q.m13917h(module, "module");
            List<InterfaceC11945l0> mo4238h0 = module.mo4210H0(C11602e.f30133f).mo4238h0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo4238h0) {
                if (obj instanceof InterfaceC10863b) {
                    arrayList.add(obj);
                }
            }
            m14056T = C9553r.m14056T(arrayList);
            return (InterfaceC10863b) m14056T;
        }
    }

    /* renamed from: pg.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11604b {
        private C11604b() {
        }

        public /* synthetic */ C11604b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11632b m7530a() {
            return C11602e.f30135h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pg.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11605c extends AbstractC9614s implements Function0<C12702h> {

        /* renamed from: k */
        final /* synthetic */ InterfaceC6821n f30141k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11605c(InterfaceC6821n interfaceC6821n) {
            super(0);
            C11602e.this = r1;
            this.f30141k = interfaceC6821n;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C12702h invoke() {
            List m14109d;
            Set<InterfaceC11910d> m14007d;
            InterfaceC11947m interfaceC11947m = (InterfaceC11947m) C11602e.this.f30137b.invoke(C11602e.this.f30136a);
            C11638f c11638f = C11602e.f30134g;
            EnumC11915e0 enumC11915e0 = EnumC11915e0.ABSTRACT;
            EnumC11918f enumC11918f = EnumC11918f.INTERFACE;
            m14109d = C9544i.m14109d(C11602e.this.f30136a.mo4194n().m9810i());
            C12702h c12702h = new C12702h(interfaceC11947m, c11638f, enumC11915e0, enumC11918f, m14109d, InterfaceC11900a1.f30901a, false, this.f30141k);
            C11595a c11595a = new C11595a(this.f30141k, c12702h);
            m14007d = C9560w.m14007d();
            c12702h.m4429K0(c11595a, m14007d, null);
            return c12702h;
        }
    }

    static {
        C11634d c11634d = C10884k.C10885a.f28476d;
        C11638f m7440i = c11634d.m7440i();
        C9612q.m13918g(m7440i, "cloneable.shortName()");
        f30134g = m7440i;
        C11632b m7460m = C11632b.m7460m(c11634d.m7437l());
        C9612q.m13918g(m7460m, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f30135h = m7460m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11602e(InterfaceC6821n storageManager, InterfaceC11928h0 moduleDescriptor, Function1<? super InterfaceC11928h0, ? extends InterfaceC11947m> computeContainingDeclaration) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(moduleDescriptor, "moduleDescriptor");
        C9612q.m13917h(computeContainingDeclaration, "computeContainingDeclaration");
        this.f30136a = moduleDescriptor;
        this.f30137b = computeContainingDeclaration;
        this.f30138c = storageManager.mo21867c(new C11605c(storageManager));
    }

    /* renamed from: i */
    private final C12702h m7532i() {
        return (C12702h) C6820m.m21871a(this.f30138c, this, f30132e[0]);
    }

    @Override // sg.InterfaceC12473b
    /* renamed from: a */
    public InterfaceC11914e mo5200a(C11632b classId) {
        C9612q.m13917h(classId, "classId");
        if (C9612q.m13922c(classId, f30135h)) {
            return m7532i();
        }
        return null;
    }

    @Override // sg.InterfaceC12473b
    /* renamed from: b */
    public boolean mo5199b(C11633c packageFqName, C11638f name) {
        C9612q.m13917h(packageFqName, "packageFqName");
        C9612q.m13917h(name, "name");
        if (C9612q.m13922c(name, f30134g) && C9612q.m13922c(packageFqName, f30133f)) {
            return true;
        }
        return false;
    }

    @Override // sg.InterfaceC12473b
    /* renamed from: c */
    public Collection<InterfaceC11914e> mo5198c(C11633c packageFqName) {
        Set m14007d;
        Set m14008c;
        C9612q.m13917h(packageFqName, "packageFqName");
        if (C9612q.m13922c(packageFqName, f30133f)) {
            m14008c = C9559v.m14008c(m7532i());
            return m14008c;
        }
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    public /* synthetic */ C11602e(InterfaceC6821n interfaceC6821n, InterfaceC11928h0 interfaceC11928h0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6821n, interfaceC11928h0, (i & 4) != 0 ? C11603a.f30139j : function1);
    }
}