package p161ii;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7333v1;
import p142hi.InterfaceC7288k1;
import p234mi.C10472a;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p372uh.InterfaceC12974b;
import pf.C11577n;
import pf.EnumC11580p;

/* renamed from: ii.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7596j implements InterfaceC12974b {

    /* renamed from: a */
    private final InterfaceC7288k1 f20890a;

    /* renamed from: b */
    private Function0<? extends List<? extends AbstractC7333v1>> f20891b;

    /* renamed from: c */
    private final C7596j f20892c;

    /* renamed from: d */
    private final InterfaceC11920f1 f20893d;

    /* renamed from: e */
    private final Lazy f20894e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ii.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7597a extends AbstractC9614s implements Function0<List<? extends AbstractC7333v1>> {

        /* renamed from: j */
        final /* synthetic */ List<AbstractC7333v1> f20895j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7597a(List<? extends AbstractC7333v1> list) {
            super(0);
            this.f20895j = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC7333v1> invoke() {
            return this.f20895j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ii.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7598b extends AbstractC9614s implements Function0<List<? extends AbstractC7333v1>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7598b() {
            super(0);
            C7596j.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC7333v1> invoke() {
            Function0 function0 = C7596j.this.f20891b;
            if (function0 != null) {
                return (List) function0.invoke();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ii.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7599c extends AbstractC9614s implements Function0<List<? extends AbstractC7333v1>> {

        /* renamed from: j */
        final /* synthetic */ List<AbstractC7333v1> f20897j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7599c(List<? extends AbstractC7333v1> list) {
            super(0);
            this.f20897j = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC7333v1> invoke() {
            return this.f20897j;
        }
    }

    /* renamed from: ii.j$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7600d extends AbstractC9614s implements Function0<List<? extends AbstractC7333v1>> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7592g f20899k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7600d(AbstractC7592g abstractC7592g) {
            super(0);
            C7596j.this = r1;
            this.f20899k = abstractC7592g;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC7333v1> invoke() {
            int m14093t;
            List<AbstractC7333v1> mo2791m = C7596j.this.mo2791m();
            AbstractC7592g abstractC7592g = this.f20899k;
            m14093t = C9546k.m14093t(mo2791m, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (AbstractC7333v1 abstractC7333v1 : mo2791m) {
                arrayList.add(abstractC7333v1.mo3560S0(abstractC7592g));
            }
            return arrayList;
        }
    }

    public C7596j(InterfaceC7288k1 projection, Function0<? extends List<? extends AbstractC7333v1>> function0, C7596j c7596j, InterfaceC11920f1 interfaceC11920f1) {
        Lazy m7600b;
        C9612q.m13917h(projection, "projection");
        this.f20890a = projection;
        this.f20891b = function0;
        this.f20892c = c7596j;
        this.f20893d = interfaceC11920f1;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C7598b());
        this.f20894e = m7600b;
    }

    /* renamed from: e */
    private final List<AbstractC7333v1> m20264e() {
        return (List) this.f20894e.getValue();
    }

    @Override // p372uh.InterfaceC12974b
    /* renamed from: b */
    public InterfaceC7288k1 mo3552b() {
        return this.f20890a;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: d */
    public List<AbstractC7333v1> mo2791m() {
        List<AbstractC7333v1> m14104i;
        List<AbstractC7333v1> m20264e = m20264e();
        if (m20264e == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return m20264e;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C9612q.m13922c(C7596j.class, cls)) {
            return false;
        }
        C9612q.m13919f(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C7596j c7596j = (C7596j) obj;
        C7596j c7596j2 = this.f20892c;
        if (c7596j2 == null) {
            c7596j2 = this;
        }
        C7596j c7596j3 = c7596j.f20892c;
        if (c7596j3 != null) {
            c7596j = c7596j3;
        }
        if (c7596j2 == c7596j) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m20263f(List<? extends AbstractC7333v1> supertypes) {
        C9612q.m13917h(supertypes, "supertypes");
        this.f20891b = new C7599c(supertypes);
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: g */
    public C7596j mo2789o(AbstractC7592g kotlinTypeRefiner) {
        C7600d c7600d;
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        InterfaceC7288k1 mo20951o = mo3552b().mo20951o(kotlinTypeRefiner);
        C9612q.m13918g(mo20951o, "projection.refine(kotlinTypeRefiner)");
        if (this.f20891b != null) {
            c7600d = new C7600d(kotlinTypeRefiner);
        } else {
            c7600d = null;
        }
        C7596j c7596j = this.f20892c;
        if (c7596j == null) {
            c7596j = this;
        }
        return new C7596j(mo20951o, c7600d, c7596j, this.f20893d);
    }

    @Override // p142hi.InterfaceC7265g1
    public List<InterfaceC11920f1> getParameters() {
        List<InterfaceC11920f1> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    public int hashCode() {
        C7596j c7596j = this.f20892c;
        return c7596j != null ? c7596j.hashCode() : super.hashCode();
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: n */
    public AbstractC10870h mo2790n() {
        AbstractC7264g0 type = mo3552b().getType();
        C9612q.m13918g(type, "projection.type");
        return C10472a.m11449i(type);
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: p */
    public InterfaceC11927h mo2788p() {
        return null;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: q */
    public boolean mo2787q() {
        return false;
    }

    public String toString() {
        return "CapturedType(" + mo3552b() + ')';
    }

    public /* synthetic */ C7596j(InterfaceC7288k1 interfaceC7288k1, Function0 function0, C7596j c7596j, InterfaceC11920f1 interfaceC11920f1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7288k1, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : c7596j, (i & 8) != 0 ? null : interfaceC11920f1);
    }

    public /* synthetic */ C7596j(InterfaceC7288k1 interfaceC7288k1, List list, C7596j c7596j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7288k1, list, (i & 4) != 0 ? null : c7596j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7596j(InterfaceC7288k1 projection, List<? extends AbstractC7333v1> supertypes, C7596j c7596j) {
        this(projection, new C7597a(supertypes), c7596j, null, 8, null);
        C9612q.m13917h(projection, "projection");
        C9612q.m13917h(supertypes, "supertypes");
    }
}