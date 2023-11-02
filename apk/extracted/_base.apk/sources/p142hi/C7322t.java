package p142hi;

import java.util.HashMap;
import java.util.List;
import p234mi.C10472a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import tg.C12711k0;

/* renamed from: hi.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7322t {
    /* renamed from: a */
    private static /* synthetic */ void m20966a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static C7307p1 m20965b(List<InterfaceC11920f1> list, AbstractC7297n1 abstractC7297n1, InterfaceC11947m interfaceC11947m, List<InterfaceC11920f1> list2) {
        if (list == null) {
            m20966a(0);
        }
        if (abstractC7297n1 == null) {
            m20966a(1);
        }
        if (interfaceC11947m == null) {
            m20966a(2);
        }
        if (list2 == null) {
            m20966a(3);
        }
        C7307p1 m20964c = m20964c(list, abstractC7297n1, interfaceC11947m, list2, null);
        if (m20964c != null) {
            return m20964c;
        }
        throw new AssertionError("Substitution failed");
    }

    /* renamed from: c */
    public static C7307p1 m20964c(List<InterfaceC11920f1> list, AbstractC7297n1 abstractC7297n1, InterfaceC11947m interfaceC11947m, List<InterfaceC11920f1> list2, boolean[] zArr) {
        C7307p1 c7307p1;
        if (list == null) {
            m20966a(5);
        }
        if (abstractC7297n1 == null) {
            m20966a(6);
        }
        if (interfaceC11947m == null) {
            m20966a(7);
        }
        if (list2 == null) {
            m20966a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        for (InterfaceC11920f1 interfaceC11920f1 : list) {
            C12711k0 m4401P0 = C12711k0.m4401P0(interfaceC11947m, interfaceC11920f1.getAnnotations(), interfaceC11920f1.mo4463x(), interfaceC11920f1.mo4464m(), interfaceC11920f1.getName(), i, InterfaceC11900a1.f30901a, interfaceC11920f1.mo4467J());
            hashMap.put(interfaceC11920f1.mo4173k(), new C7294m1(m4401P0.mo4224p()));
            hashMap2.put(interfaceC11920f1, m4401P0);
            list2.add(m4401P0);
            i++;
        }
        AbstractC7272h1 m21089j = AbstractC7272h1.m21089j(hashMap);
        C7307p1 m21026h = C7307p1.m21026h(abstractC7297n1, m21089j);
        C7307p1 m21026h2 = C7307p1.m21026h(abstractC7297n1.m21050h(), m21089j);
        for (InterfaceC11920f1 interfaceC11920f12 : list) {
            C12711k0 c12711k0 = (C12711k0) hashMap2.get(interfaceC11920f12);
            for (AbstractC7264g0 abstractC7264g0 : interfaceC11920f12.getUpperBounds()) {
                InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
                if ((mo2788p instanceof InterfaceC11920f1) && C10472a.m11447k((InterfaceC11920f1) mo2788p)) {
                    c7307p1 = m21026h;
                } else {
                    c7307p1 = m21026h2;
                }
                AbstractC7264g0 m21018p = c7307p1.m21018p(abstractC7264g0, EnumC7336w1.OUT_VARIANCE);
                if (m21018p == null) {
                    return null;
                }
                if (m21018p != abstractC7264g0 && zArr != null) {
                    zArr[0] = true;
                }
                c12711k0.m4404M0(m21018p);
            }
            c12711k0.m4395V0();
        }
        return m21026h;
    }
}
