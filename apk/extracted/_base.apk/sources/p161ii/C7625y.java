package p161ii;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import ni.C10910b;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7272h1;
import p142hi.C7320s1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p305qg.InterfaceC11947m;
import p372uh.C12976d;
import sh.AbstractC12485c;

/* renamed from: ii.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7625y {
    /* renamed from: a */
    private static final AbstractC7264g0 m20225a(AbstractC7264g0 abstractC7264g0) {
        return C10910b.m9571a(abstractC7264g0).m9572d();
    }

    /* renamed from: b */
    private static final String m20224b(InterfaceC7265g1 interfaceC7265g1) {
        StringBuilder sb2 = new StringBuilder();
        m20223c("type: " + interfaceC7265g1, sb2);
        m20223c("hashCode: " + interfaceC7265g1.hashCode(), sb2);
        m20223c("javaClass: " + interfaceC7265g1.getClass().getCanonicalName(), sb2);
        for (InterfaceC11947m mo2788p = interfaceC7265g1.mo2788p(); mo2788p != null; mo2788p = mo2788p.mo4163b()) {
            m20223c("fqName: " + AbstractC12485c.f32441g.mo5061q(mo2788p), sb2);
            m20223c("javaClass: " + mo2788p.getClass().getCanonicalName(), sb2);
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: c */
    private static final StringBuilder m20223c(String str, StringBuilder sb2) {
        C9612q.m13917h(str, "<this>");
        sb2.append(str);
        C9612q.m13918g(sb2, "append(value)");
        sb2.append('\n');
        C9612q.m13918g(sb2, "append('\\n')");
        return sb2;
    }

    /* renamed from: d */
    public static final AbstractC7264g0 m20222d(AbstractC7264g0 subtype, AbstractC7264g0 supertype, InterfaceC7613v typeCheckingProcedureCallbacks) {
        InterfaceC7265g1 mo3564N0;
        boolean z;
        boolean z2;
        C9612q.m13917h(subtype, "subtype");
        C9612q.m13917h(supertype, "supertype");
        C9612q.m13917h(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C7610s(subtype, null));
        InterfaceC7265g1 mo3564N02 = supertype.mo3564N0();
        while (!arrayDeque.isEmpty()) {
            C7610s c7610s = (C7610s) arrayDeque.poll();
            AbstractC7264g0 m20244b = c7610s.m20244b();
            InterfaceC7265g1 mo3564N03 = m20244b.mo3564N0();
            if (typeCheckingProcedureCallbacks.mo20239a(mo3564N03, mo3564N02)) {
                boolean mo3563O0 = m20244b.mo3563O0();
                for (C7610s m20245a = c7610s.m20245a(); m20245a != null; m20245a = m20245a.m20245a()) {
                    AbstractC7264g0 m20244b2 = m20245a.m20244b();
                    List<InterfaceC7288k1> mo3566L0 = m20244b2.mo3566L0();
                    if (!(mo3566L0 instanceof Collection) || !mo3566L0.isEmpty()) {
                        for (InterfaceC7288k1 interfaceC7288k1 : mo3566L0) {
                            if (interfaceC7288k1.mo20954b() != EnumC7336w1.INVARIANT) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        AbstractC7264g0 m21020n = C12976d.m3542f(AbstractC7272h1.f19700c.m21088a(m20244b2), false, 1, null).m21051c().m21020n(m20244b, EnumC7336w1.INVARIANT);
                        C9612q.m13918g(m21020n, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        m20244b = m20225a(m21020n);
                    } else {
                        m20244b = AbstractC7272h1.f19700c.m21088a(m20244b2).m21051c().m21020n(m20244b, EnumC7336w1.INVARIANT);
                        C9612q.m13918g(m20244b, "{\n                    Ty…ARIANT)\n                }");
                    }
                    if (!mo3563O0 && !m20244b2.mo3563O0()) {
                        mo3563O0 = false;
                    } else {
                        mo3563O0 = true;
                    }
                }
                if (typeCheckingProcedureCallbacks.mo20239a(m20244b.mo3564N0(), mo3564N02)) {
                    return C7320s1.m20979p(m20244b, mo3563O0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + m20224b(mo3564N0) + ", \n\nsupertype: " + m20224b(mo3564N02) + " \n" + typeCheckingProcedureCallbacks.mo20239a(mo3564N0, mo3564N02));
            }
            for (AbstractC7264g0 immediateSupertype : mo3564N03.mo2791m()) {
                C9612q.m13918g(immediateSupertype, "immediateSupertype");
                arrayDeque.add(new C7610s(immediateSupertype, c7610s));
            }
        }
        return null;
    }
}
