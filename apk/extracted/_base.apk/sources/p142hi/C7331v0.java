package p142hi;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11931i;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11998y;
import p429xh.C13801c;

/* renamed from: hi.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7331v0 {

    /* renamed from: hi.v0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7332a extends AbstractC7272h1 {

        /* renamed from: d */
        final /* synthetic */ List<InterfaceC7265g1> f19769d;

        /* JADX WARN: Multi-variable type inference failed */
        C7332a(List<? extends InterfaceC7265g1> list) {
            this.f19769d = list;
        }

        @Override // p142hi.AbstractC7272h1
        /* renamed from: k */
        public InterfaceC7288k1 mo9561k(InterfaceC7265g1 key) {
            C9612q.m13917h(key, "key");
            if (this.f19769d.contains(key)) {
                InterfaceC11927h mo2788p = key.mo2788p();
                C9612q.m13919f(mo2788p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return C7320s1.m20976s((InterfaceC11920f1) mo2788p);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static final AbstractC7264g0 m20940a(List<? extends InterfaceC7265g1> list, List<? extends AbstractC7264g0> list2, AbstractC10870h abstractC10870h) {
        Object m14056T;
        C7307p1 m21027g = C7307p1.m21027g(new C7332a(list));
        m14056T = C9553r.m14056T(list2);
        AbstractC7264g0 m21018p = m21027g.m21018p((AbstractC7264g0) m14056T, EnumC7336w1.OUT_VARIANCE);
        if (m21018p == null) {
            m21018p = abstractC10870h.m9779y();
        }
        C9612q.m13918g(m21018p, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return m21018p;
    }

    /* renamed from: b */
    public static final AbstractC7264g0 m20939b(InterfaceC11920f1 interfaceC11920f1) {
        int m14093t;
        int m14093t2;
        C9612q.m13917h(interfaceC11920f1, "<this>");
        InterfaceC11947m mo4163b = interfaceC11920f1.mo4163b();
        C9612q.m13918g(mo4163b, "this.containingDeclaration");
        if (mo4163b instanceof InterfaceC11931i) {
            List<InterfaceC11920f1> parameters = ((InterfaceC11931i) mo4163b).mo4173k().getParameters();
            C9612q.m13918g(parameters, "descriptor.typeConstructor.parameters");
            m14093t2 = C9546k.m14093t(parameters, 10);
            ArrayList arrayList = new ArrayList(m14093t2);
            for (InterfaceC11920f1 interfaceC11920f12 : parameters) {
                InterfaceC7265g1 mo4173k = interfaceC11920f12.mo4173k();
                C9612q.m13918g(mo4173k, "it.typeConstructor");
                arrayList.add(mo4173k);
            }
            List<AbstractC7264g0> upperBounds = interfaceC11920f1.getUpperBounds();
            C9612q.m13918g(upperBounds, "upperBounds");
            return m20940a(arrayList, upperBounds, C13801c.m1505j(interfaceC11920f1));
        } else if (mo4163b instanceof InterfaceC11998y) {
            List<InterfaceC11920f1> typeParameters = ((InterfaceC11998y) mo4163b).getTypeParameters();
            C9612q.m13918g(typeParameters, "descriptor.typeParameters");
            m14093t = C9546k.m14093t(typeParameters, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            for (InterfaceC11920f1 interfaceC11920f13 : typeParameters) {
                InterfaceC7265g1 mo4173k2 = interfaceC11920f13.mo4173k();
                C9612q.m13918g(mo4173k2, "it.typeConstructor");
                arrayList2.add(mo4173k2);
            }
            List<AbstractC7264g0> upperBounds2 = interfaceC11920f1.getUpperBounds();
            C9612q.m13918g(upperBounds2, "upperBounds");
            return m20940a(arrayList2, upperBounds2, C13801c.m1505j(interfaceC11920f1));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }
}
