package p468zg;

import bh.C2302e;
import ch.C2543d;
import ch.C2548g;
import gh.InterfaceC6765c0;
import java.util.Iterator;
import kotlin.jvm.internal.C9612q;
import p305qg.AbstractC11963n1;
import p305qg.AbstractC11988u;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11998y;
import p325rg.InterfaceC12149c;
import ph.C11633c;

/* renamed from: zg.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14239j0 {
    /* renamed from: a */
    public static final InterfaceC12149c m340a(C2548g c, InterfaceC6765c0 wildcardType) {
        boolean z;
        InterfaceC12149c interfaceC12149c;
        boolean z2;
        C9612q.m13917h(c, "c");
        C9612q.m13917h(wildcardType, "wildcardType");
        if (wildcardType.mo2247w() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Iterator<InterfaceC12149c> it = new C2543d(c, wildcardType, false, 4, null).iterator();
            while (true) {
                if (it.hasNext()) {
                    interfaceC12149c = it.next();
                    InterfaceC12149c interfaceC12149c2 = interfaceC12149c;
                    C11633c[] m293f = C14259v.m293f();
                    int length = m293f.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (C9612q.m13922c(interfaceC12149c2.mo6030e(), m293f[i])) {
                                z2 = true;
                                continue;
                                break;
                            }
                            i++;
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    interfaceC12149c = null;
                    break;
                }
            }
            return interfaceC12149c;
        }
        throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
    }

    /* renamed from: b */
    public static final boolean m339b(InterfaceC11902b memberDescriptor) {
        C9612q.m13917h(memberDescriptor, "memberDescriptor");
        if ((memberDescriptor instanceof InterfaceC11998y) && C9612q.m13922c(memberDescriptor.mo4300i0(C2302e.f6402Q), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m338c(C14262x javaTypeEnhancementState) {
        C9612q.m13917h(javaTypeEnhancementState, "javaTypeEnhancementState");
        if (javaTypeEnhancementState.m283c().invoke(C14259v.m294e()) == EnumC14223g0.STRICT) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final AbstractC11988u m337d(AbstractC11963n1 abstractC11963n1) {
        C9612q.m13917h(abstractC11963n1, "<this>");
        AbstractC11988u m310g = C14252s.m310g(abstractC11963n1);
        C9612q.m13918g(m310g, "toDescriptorVisibility(this)");
        return m310g;
    }
}