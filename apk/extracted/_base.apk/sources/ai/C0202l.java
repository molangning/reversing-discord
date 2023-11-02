package ai;

import gi.C6820m;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p327ri.C12258e;
import p448yg.InterfaceC14020b;
import ph.C11638f;
import th.C12756d;

/* renamed from: ai.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C0202l extends AbstractC0198i {

    /* renamed from: e */
    static final /* synthetic */ KProperty<Object>[] f650e = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C0202l.class), "functions", "getFunctions()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C0202l.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b */
    private final InterfaceC11914e f651b;

    /* renamed from: c */
    private final InterfaceC6815i f652c;

    /* renamed from: d */
    private final InterfaceC6815i f653d;

    /* renamed from: ai.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C0203a extends AbstractC9614s implements Function0<List<? extends InterfaceC12005z0>> {
        C0203a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC12005z0> invoke() {
            List<? extends InterfaceC12005z0> m14101l;
            m14101l = C9545j.m14101l(C12756d.m4136g(C0202l.this.f651b), C12756d.m4135h(C0202l.this.f651b));
            return m14101l;
        }
    }

    /* renamed from: ai.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C0204b extends AbstractC9614s implements Function0<List<? extends InterfaceC11989u0>> {
        C0204b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC11989u0> invoke() {
            List<? extends InterfaceC11989u0> m14100m;
            m14100m = C9545j.m14100m(C12756d.m4137f(C0202l.this.f651b));
            return m14100m;
        }
    }

    public C0202l(InterfaceC6821n storageManager, InterfaceC11914e containingClass) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(containingClass, "containingClass");
        this.f651b = containingClass;
        containingClass.mo4175g();
        EnumC11918f enumC11918f = EnumC11918f.CLASS;
        this.f652c = storageManager.mo21867c(new C0203a());
        this.f653d = storageManager.mo21867c(new C0204b());
    }

    /* renamed from: l */
    private final List<InterfaceC12005z0> m40965l() {
        return (List) C6820m.m21871a(this.f652c, this, f650e[0]);
    }

    /* renamed from: m */
    private final List<InterfaceC11989u0> m40964m() {
        return (List) C6820m.m21871a(this.f653d, this, f650e[1]);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        List<InterfaceC11989u0> m40964m = m40964m();
        C12258e c12258e = new C12258e();
        for (Object obj : m40964m) {
            if (C9612q.m13922c(((InterfaceC11989u0) obj).getName(), name)) {
                c12258e.add(obj);
            }
        }
        return c12258e;
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC11927h mo16932g(C11638f c11638f, InterfaceC14020b interfaceC14020b) {
        return (InterfaceC11927h) m40968i(c11638f, interfaceC14020b);
    }

    /* renamed from: i */
    public Void m40968i(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return null;
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: j */
    public List<InterfaceC11902b> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List<InterfaceC11902b> m14036n0;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        m14036n0 = C9553r.m14036n0(m40965l(), m40964m());
        return m14036n0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: k */
    public C12258e<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        List<InterfaceC12005z0> m40965l = m40965l();
        C12258e<InterfaceC12005z0> c12258e = new C12258e<>();
        for (Object obj : m40965l) {
            if (C9612q.m13922c(((InterfaceC12005z0) obj).getName(), name)) {
                c12258e.add(obj);
            }
        }
        return c12258e;
    }
}
