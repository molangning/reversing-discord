package p305qg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p142hi.AbstractC7264g0;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p183ji.C8967k;
import p429xh.C13801c;
import si.C12552o;
import th.C12758e;

/* renamed from: qg.g1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11923g1 {

    /* renamed from: qg.g1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11924a extends AbstractC9614s implements Function1<InterfaceC11947m, Boolean> {

        /* renamed from: j */
        public static final C11924a f30928j = new C11924a();

        C11924a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11947m it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(it instanceof InterfaceC11897a);
        }
    }

    /* renamed from: qg.g1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11925b extends AbstractC9614s implements Function1<InterfaceC11947m, Boolean> {

        /* renamed from: j */
        public static final C11925b f30929j = new C11925b();

        C11925b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11947m it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(!(it instanceof InterfaceC11944l));
        }
    }

    /* renamed from: qg.g1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11926c extends AbstractC9614s implements Function1<InterfaceC11947m, Sequence<? extends InterfaceC11920f1>> {

        /* renamed from: j */
        public static final C11926c f30930j = new C11926c();

        C11926c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Sequence<InterfaceC11920f1> invoke(InterfaceC11947m it) {
            Sequence<InterfaceC11920f1> m14066K;
            C9612q.m13917h(it, "it");
            List<InterfaceC11920f1> typeParameters = ((InterfaceC11897a) it).getTypeParameters();
            C9612q.m13918g(typeParameters, "it as CallableDescriptor).typeParameters");
            m14066K = C9553r.m14066K(typeParameters);
            return m14066K;
        }
    }

    /* renamed from: a */
    public static final C11973s0 m6715a(AbstractC7264g0 abstractC7264g0) {
        InterfaceC11931i interfaceC11931i;
        C9612q.m13917h(abstractC7264g0, "<this>");
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11931i) {
            interfaceC11931i = (InterfaceC11931i) mo2788p;
        } else {
            interfaceC11931i = null;
        }
        return m6714b(abstractC7264g0, interfaceC11931i, 0);
    }

    /* renamed from: b */
    private static final C11973s0 m6714b(AbstractC7264g0 abstractC7264g0, InterfaceC11931i interfaceC11931i, int i) {
        InterfaceC11931i interfaceC11931i2 = null;
        if (interfaceC11931i == null || C8967k.m16936m(interfaceC11931i)) {
            return null;
        }
        int size = interfaceC11931i.mo4168q().size() + i;
        if (!interfaceC11931i.mo4164z()) {
            if (size != abstractC7264g0.mo3566L0().size()) {
                C12758e.m4120E(interfaceC11931i);
            }
            return new C11973s0(interfaceC11931i, abstractC7264g0.mo3566L0().subList(i, abstractC7264g0.mo3566L0().size()), null);
        }
        List<InterfaceC7288k1> subList = abstractC7264g0.mo3566L0().subList(i, size);
        InterfaceC11947m mo4163b = interfaceC11931i.mo4163b();
        if (mo4163b instanceof InterfaceC11931i) {
            interfaceC11931i2 = (InterfaceC11931i) mo4163b;
        }
        return new C11973s0(interfaceC11931i, subList, m6714b(abstractC7264g0, interfaceC11931i2, size));
    }

    /* renamed from: c */
    private static final C11907c m6713c(InterfaceC11920f1 interfaceC11920f1, InterfaceC11947m interfaceC11947m, int i) {
        return new C11907c(interfaceC11920f1, interfaceC11947m, i);
    }

    /* renamed from: d */
    public static final List<InterfaceC11920f1> m6712d(InterfaceC11931i interfaceC11931i) {
        Sequence m4869C;
        Sequence m4860p;
        Sequence m4856t;
        List m4867E;
        List<InterfaceC11920f1> list;
        InterfaceC11947m interfaceC11947m;
        List<InterfaceC11920f1> m14036n0;
        int m14093t;
        List<InterfaceC11920f1> m14036n02;
        InterfaceC7265g1 mo4173k;
        C9612q.m13917h(interfaceC11931i, "<this>");
        List<InterfaceC11920f1> declaredTypeParameters = interfaceC11931i.mo4168q();
        C9612q.m13918g(declaredTypeParameters, "declaredTypeParameters");
        if (!interfaceC11931i.mo4164z() && !(interfaceC11931i.mo4163b() instanceof InterfaceC11897a)) {
            return declaredTypeParameters;
        }
        m4869C = C12552o.m4869C(C13801c.m1498q(interfaceC11931i), C11924a.f30928j);
        m4860p = C12552o.m4860p(m4869C, C11925b.f30929j);
        m4856t = C12552o.m4856t(m4860p, C11926c.f30930j);
        m4867E = C12552o.m4867E(m4856t);
        Iterator<InterfaceC11947m> it = C13801c.m1498q(interfaceC11931i).iterator();
        while (true) {
            list = null;
            if (it.hasNext()) {
                interfaceC11947m = it.next();
                if (interfaceC11947m instanceof InterfaceC11914e) {
                    break;
                }
            } else {
                interfaceC11947m = null;
                break;
            }
        }
        InterfaceC11914e interfaceC11914e = (InterfaceC11914e) interfaceC11947m;
        if (interfaceC11914e != null && (mo4173k = interfaceC11914e.mo4173k()) != null) {
            list = mo4173k.getParameters();
        }
        if (list == null) {
            list = C9545j.m14104i();
        }
        if (m4867E.isEmpty() && list.isEmpty()) {
            List<InterfaceC11920f1> declaredTypeParameters2 = interfaceC11931i.mo4168q();
            C9612q.m13918g(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        m14036n0 = C9553r.m14036n0(m4867E, list);
        m14093t = C9546k.m14093t(m14036n0, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11920f1 it2 : m14036n0) {
            C9612q.m13918g(it2, "it");
            arrayList.add(m6713c(it2, interfaceC11931i, declaredTypeParameters.size()));
        }
        m14036n02 = C9553r.m14036n0(declaredTypeParameters, arrayList);
        return m14036n02;
    }
}