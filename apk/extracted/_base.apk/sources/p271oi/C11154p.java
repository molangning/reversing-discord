package p271oi;

import bi.C2313e;
import bi.InterfaceC2315g;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p234mi.C10472a;
import p271oi.AbstractC11145k;
import p271oi.AbstractC11159r;
import p271oi.AbstractC11168t;
import p305qg.C11994x;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p429xh.C13801c;
import ph.C11632b;
import ph.C11638f;

/* renamed from: oi.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11154p extends AbstractC11126b {

    /* renamed from: a */
    public static final C11154p f29134a = new C11154p();

    /* renamed from: b */
    private static final List<C11138h> f29135b;

    /* renamed from: oi.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C11155a extends AbstractC9614s implements Function1<InterfaceC11998y, String> {

        /* renamed from: j */
        public static final C11155a f29136j = new C11155a();

        C11155a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(InterfaceC11998y $receiver) {
            Object m14042h0;
            boolean z;
            C9612q.m13917h($receiver, "$this$$receiver");
            List<InterfaceC11936j1> valueParameters = $receiver.mo4301i();
            C9612q.m13918g(valueParameters, "valueParameters");
            m14042h0 = C9553r.m14042h0(valueParameters);
            InterfaceC11936j1 interfaceC11936j1 = (InterfaceC11936j1) m14042h0;
            boolean z2 = false;
            if (interfaceC11936j1 != null) {
                if (!C13801c.m1512c(interfaceC11936j1) && interfaceC11936j1.mo4373v0() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            C11154p c11154p = C11154p.f29134a;
            if (!z2) {
                return "last parameter should not have a default value or be a vararg";
            }
            return null;
        }
    }

    /* renamed from: oi.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C11156b extends AbstractC9614s implements Function1<InterfaceC11998y, String> {

        /* renamed from: j */
        public static final C11156b f29137j = new C11156b();

        C11156b() {
            super(1);
        }

        /* renamed from: b */
        private static final boolean m9091b(InterfaceC11947m interfaceC11947m) {
            return (interfaceC11947m instanceof InterfaceC11914e) && AbstractC10870h.m9824a0((InterfaceC11914e) interfaceC11947m);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(InterfaceC11998y $receiver) {
            boolean z;
            C9612q.m13917h($receiver, "$this$$receiver");
            C11154p c11154p = C11154p.f29134a;
            InterfaceC11947m containingDeclaration = $receiver.mo4163b();
            C9612q.m13918g(containingDeclaration, "containingDeclaration");
            boolean z2 = true;
            if (!m9091b(containingDeclaration)) {
                Collection<? extends InterfaceC11998y> overriddenDescriptors = $receiver.mo4310d();
                C9612q.m13918g(overriddenDescriptors, "overriddenDescriptors");
                if (!overriddenDescriptors.isEmpty()) {
                    for (InterfaceC11998y interfaceC11998y : overriddenDescriptors) {
                        InterfaceC11947m mo4163b = interfaceC11998y.mo4163b();
                        C9612q.m13918g(mo4163b, "it.containingDeclaration");
                        if (m9091b(mo4163b)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
            }
            if (!z2) {
                return "must override ''equals()'' in Any";
            }
            return null;
        }
    }

    /* renamed from: oi.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C11157c extends AbstractC9614s implements Function1<InterfaceC11998y, String> {

        /* renamed from: j */
        public static final C11157c f29138j = new C11157c();

        C11157c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(InterfaceC11998y $receiver) {
            boolean z;
            C9612q.m13917h($receiver, "$this$$receiver");
            InterfaceC11997x0 mo4332I = $receiver.mo4332I();
            if (mo4332I == null) {
                mo4332I = $receiver.mo4329M();
            }
            C11154p c11154p = C11154p.f29134a;
            boolean z2 = false;
            if (mo4332I != null) {
                AbstractC7264g0 returnType = $receiver.getReturnType();
                if (returnType != null) {
                    AbstractC7264g0 type = mo4332I.getType();
                    C9612q.m13918g(type, "receiver.type");
                    z = C10472a.m11442p(returnType, type);
                } else {
                    z = false;
                }
                if (z || c11154p.m9094d($receiver, mo4332I)) {
                    z2 = true;
                }
            }
            if (!z2) {
                return "receiver must be a supertype of the return type";
            }
            return null;
        }
    }

    static {
        List m14101l;
        List<C11138h> m14101l2;
        C11638f c11638f = C11158q.f29170k;
        AbstractC11145k.C11147b c11147b = AbstractC11145k.C11147b.f29126b;
        InterfaceC11132f[] interfaceC11132fArr = {c11147b, new AbstractC11168t.C11169a(1)};
        C11638f c11638f2 = C11158q.f29171l;
        InterfaceC11132f[] interfaceC11132fArr2 = {c11147b, new AbstractC11168t.C11169a(2)};
        C11638f c11638f3 = C11158q.f29161b;
        C11150m c11150m = C11150m.f29128a;
        C11144j c11144j = C11144j.f29122a;
        C11638f c11638f4 = C11158q.f29167h;
        AbstractC11168t.C11172d c11172d = AbstractC11168t.C11172d.f29202b;
        AbstractC11159r.C11160a c11160a = AbstractC11159r.C11160a.f29189d;
        C11638f c11638f5 = C11158q.f29169j;
        AbstractC11168t.C11171c c11171c = AbstractC11168t.C11171c.f29201b;
        m14101l = C9545j.m14101l(C11158q.f29183x, C11158q.f29184y);
        m14101l2 = C9545j.m14101l(new C11138h(c11638f, interfaceC11132fArr, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(c11638f2, interfaceC11132fArr2, C11155a.f29136j), new C11138h(c11638f3, new InterfaceC11132f[]{c11147b, c11150m, new AbstractC11168t.C11169a(2), c11144j}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29162c, new InterfaceC11132f[]{c11147b, c11150m, new AbstractC11168t.C11169a(3), c11144j}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29163d, new InterfaceC11132f[]{c11147b, c11150m, new AbstractC11168t.C11170b(2), c11144j}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29168i, new InterfaceC11132f[]{c11147b}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(c11638f4, new InterfaceC11132f[]{c11147b, c11172d, c11150m, c11160a}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(c11638f5, new InterfaceC11132f[]{c11147b, c11171c}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29172m, new InterfaceC11132f[]{c11147b, c11171c}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29173n, new InterfaceC11132f[]{c11147b, c11171c, c11160a}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29147I, new InterfaceC11132f[]{c11147b, c11172d, c11150m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29148J, new InterfaceC11132f[]{c11147b, c11172d, c11150m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29164e, new InterfaceC11132f[]{AbstractC11145k.C11146a.f29125b}, C11156b.f29137j), new C11138h(C11158q.f29166g, new InterfaceC11132f[]{c11147b, AbstractC11159r.C11162b.f29191d, c11172d, c11150m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29157S, new InterfaceC11132f[]{c11147b, c11172d, c11150m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29156R, new InterfaceC11132f[]{c11147b, c11171c}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(m14101l, new InterfaceC11132f[]{c11147b}, C11157c.f29138j), new C11138h(C11158q.f29158T, new InterfaceC11132f[]{c11147b, AbstractC11159r.C11164c.f29193d, c11172d, c11150m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C11138h(C11158q.f29175p, new InterfaceC11132f[]{c11147b, c11171c}, (Function1) null, 4, (DefaultConstructorMarker) null));
        f29135b = m14101l2;
    }

    private C11154p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m9094d(InterfaceC11998y interfaceC11998y, InterfaceC11997x0 interfaceC11997x0) {
        C11632b m1504k;
        AbstractC7264g0 returnType;
        InterfaceC2315g value = interfaceC11997x0.getValue();
        C9612q.m13918g(value, "receiver.value");
        if (!(value instanceof C2313e)) {
            return false;
        }
        InterfaceC11914e mo33657s = ((C2313e) value).mo33657s();
        if (!mo33657s.mo4172k0() || (m1504k = C13801c.m1504k(mo33657s)) == null) {
            return false;
        }
        InterfaceC11927h m6651b = C11994x.m6651b(C13801c.m1499p(mo33657s), m1504k);
        if (!(m6651b instanceof InterfaceC11917e1)) {
            m6651b = null;
        }
        InterfaceC11917e1 interfaceC11917e1 = (InterfaceC11917e1) m6651b;
        if (interfaceC11917e1 == null || (returnType = interfaceC11998y.getReturnType()) == null) {
            return false;
        }
        return C10472a.m11442p(returnType, interfaceC11917e1.mo6721F());
    }

    @Override // p271oi.AbstractC11126b
    /* renamed from: b */
    public List<C11138h> mo9096b() {
        return f29135b;
    }
}
