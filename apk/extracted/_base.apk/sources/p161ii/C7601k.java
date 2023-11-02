package p161ii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import li.EnumC10193b;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7272h1;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7267h0;
import p142hi.C7307p1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7288k1;
import p161ii.AbstractC7589f;
import p234mi.C10472a;
import p305qg.InterfaceC11920f1;

/* renamed from: ii.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7601k {
    /* renamed from: a */
    private static final List<InterfaceC7288k1> m20261a(AbstractC7333v1 abstractC7333v1, EnumC10193b enumC10193b) {
        boolean z;
        List<Pair> m14067J0;
        int m14093t;
        AbstractC7333v1 abstractC7333v12;
        if (abstractC7333v1.mo3566L0().size() != abstractC7333v1.mo3564N0().getParameters().size()) {
            return null;
        }
        List<InterfaceC7288k1> mo3566L0 = abstractC7333v1.mo3566L0();
        boolean z2 = true;
        if (!(mo3566L0 instanceof Collection) || !mo3566L0.isEmpty()) {
            Iterator<T> it = mo3566L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((InterfaceC7288k1) it.next()).mo20954b() == EnumC7336w1.INVARIANT) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return null;
        }
        List<InterfaceC11920f1> parameters = abstractC7333v1.mo3564N0().getParameters();
        C9612q.m13918g(parameters, "type.constructor.parameters");
        m14067J0 = C9553r.m14067J0(mo3566L0, parameters);
        m14093t = C9546k.m14093t(m14067J0, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (Pair pair : m14067J0) {
            InterfaceC7288k1 interfaceC7288k1 = (InterfaceC7288k1) pair.m14351a();
            InterfaceC11920f1 parameter = (InterfaceC11920f1) pair.m14350b();
            if (interfaceC7288k1.mo20954b() != EnumC7336w1.INVARIANT) {
                if (!interfaceC7288k1.mo20955a() && interfaceC7288k1.mo20954b() == EnumC7336w1.IN_VARIANCE) {
                    abstractC7333v12 = interfaceC7288k1.getType().mo20916Q0();
                } else {
                    abstractC7333v12 = null;
                }
                C9612q.m13918g(parameter, "parameter");
                interfaceC7288k1 = C10472a.m11457a(new C7595i(enumC10193b, abstractC7333v12, interfaceC7288k1, parameter));
            }
            arrayList.add(interfaceC7288k1);
        }
        C7307p1 m21051c = AbstractC7272h1.f19700c.m21087b(abstractC7333v1.mo3564N0(), arrayList).m21051c();
        int size = mo3566L0.size();
        for (int i = 0; i < size; i++) {
            InterfaceC7288k1 interfaceC7288k12 = mo3566L0.get(i);
            InterfaceC7288k1 interfaceC7288k13 = (InterfaceC7288k1) arrayList.get(i);
            if (interfaceC7288k12.mo20954b() != EnumC7336w1.INVARIANT) {
                List<AbstractC7264g0> upperBounds = abstractC7333v1.mo3564N0().getParameters().get(i).getUpperBounds();
                C9612q.m13918g(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC7264g0 abstractC7264g0 : upperBounds) {
                    arrayList2.add(AbstractC7589f.C7590a.f20881a.mo20287a(m21051c.m21020n(abstractC7264g0, EnumC7336w1.INVARIANT).mo20916Q0()));
                }
                if (!interfaceC7288k12.mo20955a() && interfaceC7288k12.mo20954b() == EnumC7336w1.OUT_VARIANCE) {
                    arrayList2.add(AbstractC7589f.C7590a.f20881a.mo20287a(interfaceC7288k12.getType().mo20916Q0()));
                }
                AbstractC7264g0 type = interfaceC7288k13.getType();
                C9612q.m13919f(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                ((C7595i) type).mo3564N0().m20263f(arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final AbstractC7302o0 m20260b(AbstractC7302o0 type, EnumC10193b status) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(status, "status");
        List<InterfaceC7288k1> m20261a = m20261a(type, status);
        if (m20261a != null) {
            return m20259c(type, m20261a);
        }
        return null;
    }

    /* renamed from: c */
    private static final AbstractC7302o0 m20259c(AbstractC7333v1 abstractC7333v1, List<? extends InterfaceC7288k1> list) {
        return C7267h0.m21098j(abstractC7333v1.mo3565M0(), abstractC7333v1.mo3564N0(), list, abstractC7333v1.mo3563O0(), null, 16, null);
    }
}
