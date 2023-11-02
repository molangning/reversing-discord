package th;

import java.util.Collection;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11911d0;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import th.C12766k;

/* renamed from: th.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12752c {

    /* renamed from: a */
    public static final C12752c f33094a = new C12752c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12753a extends AbstractC9614s implements Function2<InterfaceC11947m, InterfaceC11947m, Boolean> {

        /* renamed from: j */
        public static final C12753a f33095j = new C12753a();

        C12753a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12754b extends AbstractC9614s implements Function2<InterfaceC11947m, InterfaceC11947m, Boolean> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC11897a f33096j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC11897a f33097k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12754b(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2) {
            super(2);
            this.f33096j = interfaceC11897a;
            this.f33097k = interfaceC11897a2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2) {
            return Boolean.valueOf(C9612q.m13922c(interfaceC11947m, this.f33096j) && C9612q.m13922c(interfaceC11947m2, this.f33097k));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12755c extends AbstractC9614s implements Function2<InterfaceC11947m, InterfaceC11947m, Boolean> {

        /* renamed from: j */
        public static final C12755c f33098j = new C12755c();

        C12755c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2) {
            return Boolean.FALSE;
        }
    }

    private C12752c() {
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m4155c(C12752c c12752c, InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2, boolean z, boolean z2, boolean z3, AbstractC7592g abstractC7592g, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return c12752c.m4156b(interfaceC11897a, interfaceC11897a2, z, z4, z3, abstractC7592g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m4154d(boolean z, InterfaceC11897a a, InterfaceC11897a b, InterfaceC7265g1 c1, InterfaceC7265g1 c2) {
        C9612q.m13917h(a, "$a");
        C9612q.m13917h(b, "$b");
        C9612q.m13917h(c1, "c1");
        C9612q.m13917h(c2, "c2");
        if (C9612q.m13922c(c1, c2)) {
            return true;
        }
        InterfaceC11927h mo2788p = c1.mo2788p();
        InterfaceC11927h mo2788p2 = c2.mo2788p();
        if ((mo2788p instanceof InterfaceC11920f1) && (mo2788p2 instanceof InterfaceC11920f1)) {
            return f33094a.m4149i((InterfaceC11920f1) mo2788p, (InterfaceC11920f1) mo2788p2, z, new C12754b(a, b));
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m4153e(InterfaceC11914e interfaceC11914e, InterfaceC11914e interfaceC11914e2) {
        return C9612q.m13922c(interfaceC11914e.mo4173k(), interfaceC11914e2.mo4173k());
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m4151g(C12752c c12752c, InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c12752c.m4152f(interfaceC11947m, interfaceC11947m2, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static /* synthetic */ boolean m4148j(C12752c c12752c, InterfaceC11920f1 interfaceC11920f1, InterfaceC11920f1 interfaceC11920f12, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = C12755c.f33098j;
        }
        return c12752c.m4149i(interfaceC11920f1, interfaceC11920f12, z, function2);
    }

    /* renamed from: k */
    private final boolean m4147k(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2, Function2<? super InterfaceC11947m, ? super InterfaceC11947m, Boolean> function2, boolean z) {
        InterfaceC11947m mo4163b = interfaceC11947m.mo4163b();
        InterfaceC11947m mo4163b2 = interfaceC11947m2.mo4163b();
        if (!(mo4163b instanceof InterfaceC11902b) && !(mo4163b2 instanceof InterfaceC11902b)) {
            return m4151g(this, mo4163b, mo4163b2, z, false, 8, null);
        }
        return function2.invoke(mo4163b, mo4163b2).booleanValue();
    }

    /* renamed from: l */
    private final InterfaceC11900a1 m4146l(InterfaceC11897a interfaceC11897a) {
        Object m14032r0;
        while (interfaceC11897a instanceof InterfaceC11902b) {
            InterfaceC11902b interfaceC11902b = (InterfaceC11902b) interfaceC11897a;
            if (interfaceC11902b.mo4305g() != InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends InterfaceC11902b> overriddenDescriptors = interfaceC11902b.mo4310d();
            C9612q.m13918g(overriddenDescriptors, "overriddenDescriptors");
            m14032r0 = C9553r.m14032r0(overriddenDescriptors);
            interfaceC11897a = (InterfaceC11902b) m14032r0;
            if (interfaceC11897a == null) {
                return null;
            }
        }
        return interfaceC11897a.mo4160j();
    }

    /* renamed from: b */
    public final boolean m4156b(InterfaceC11897a a, InterfaceC11897a b, boolean z, boolean z2, boolean z3, AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(a, "a");
        C9612q.m13917h(b, "b");
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (C9612q.m13922c(a, b)) {
            return true;
        }
        if (!C9612q.m13922c(a.getName(), b.getName())) {
            return false;
        }
        if (z2 && (a instanceof InterfaceC11911d0) && (b instanceof InterfaceC11911d0) && ((InterfaceC11911d0) a).mo4172k0() != ((InterfaceC11911d0) b).mo4172k0()) {
            return false;
        }
        if ((C9612q.m13922c(a.mo4163b(), b.mo4163b()) && (!z || !C9612q.m13922c(m4146l(a), m4146l(b)))) || C12758e.m4120E(a) || C12758e.m4120E(b) || !m4147k(a, b, C12753a.f33095j, z)) {
            return false;
        }
        C12766k m4052i = C12766k.m4052i(kotlinTypeRefiner, new C12751b(z, a, b));
        C9612q.m13918g(m4052i, "create(kotlinTypeRefiner…= a && y == b }\n        }");
        C12766k.C12775i.EnumC12776a m4024c = m4052i.m4068E(a, b, null, !z3).m4024c();
        C12766k.C12775i.EnumC12776a enumC12776a = C12766k.C12775i.EnumC12776a.OVERRIDABLE;
        if (m4024c == enumC12776a && m4052i.m4068E(b, a, null, !z3).m4024c() == enumC12776a) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m4152f(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2, boolean z, boolean z2) {
        if ((interfaceC11947m instanceof InterfaceC11914e) && (interfaceC11947m2 instanceof InterfaceC11914e)) {
            return m4153e((InterfaceC11914e) interfaceC11947m, (InterfaceC11914e) interfaceC11947m2);
        }
        if ((interfaceC11947m instanceof InterfaceC11920f1) && (interfaceC11947m2 instanceof InterfaceC11920f1)) {
            return m4148j(this, (InterfaceC11920f1) interfaceC11947m, (InterfaceC11920f1) interfaceC11947m2, z, null, 8, null);
        }
        if ((interfaceC11947m instanceof InterfaceC11897a) && (interfaceC11947m2 instanceof InterfaceC11897a)) {
            return m4155c(this, (InterfaceC11897a) interfaceC11947m, (InterfaceC11897a) interfaceC11947m2, z, z2, false, AbstractC7592g.C7593a.f20882a, 16, null);
        }
        if ((interfaceC11947m instanceof InterfaceC11945l0) && (interfaceC11947m2 instanceof InterfaceC11945l0)) {
            return C9612q.m13922c(((InterfaceC11945l0) interfaceC11947m).mo4161e(), ((InterfaceC11945l0) interfaceC11947m2).mo4161e());
        }
        return C9612q.m13922c(interfaceC11947m, interfaceC11947m2);
    }

    /* renamed from: h */
    public final boolean m4150h(InterfaceC11920f1 a, InterfaceC11920f1 b, boolean z) {
        C9612q.m13917h(a, "a");
        C9612q.m13917h(b, "b");
        return m4148j(this, a, b, z, null, 8, null);
    }

    /* renamed from: i */
    public final boolean m4149i(InterfaceC11920f1 a, InterfaceC11920f1 b, boolean z, Function2<? super InterfaceC11947m, ? super InterfaceC11947m, Boolean> equivalentCallables) {
        C9612q.m13917h(a, "a");
        C9612q.m13917h(b, "b");
        C9612q.m13917h(equivalentCallables, "equivalentCallables");
        if (C9612q.m13922c(a, b)) {
            return true;
        }
        if (!C9612q.m13922c(a.mo4163b(), b.mo4163b()) && m4147k(a, b, equivalentCallables, z) && a.getIndex() == b.getIndex()) {
            return true;
        }
        return false;
    }
}
