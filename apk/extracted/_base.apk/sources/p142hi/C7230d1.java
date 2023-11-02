package p142hi;

import kotlin.jvm.internal.C9612q;
import p142hi.InterfaceC7222b1;
import p325rg.InterfaceC12155g;

/* renamed from: hi.d1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7230d1 {
    /* renamed from: a */
    public static final C7226c1 m21189a(C7226c1 c7226c1, InterfaceC12155g newAnnotations) {
        C7226c1 m21200s;
        C9612q.m13917h(c7226c1, "<this>");
        C9612q.m13917h(newAnnotations, "newAnnotations");
        if (C7286k.m21059a(c7226c1) == newAnnotations) {
            return c7226c1;
        }
        C7278j m21058b = C7286k.m21058b(c7226c1);
        if (m21058b != null && (m21200s = c7226c1.m21200s(m21058b)) != null) {
            c7226c1 = m21200s;
        }
        if (!newAnnotations.iterator().hasNext() && newAnnotations.isEmpty()) {
            return c7226c1;
        }
        return c7226c1.m21201r(new C7278j(newAnnotations));
    }

    /* renamed from: b */
    public static final C7226c1 m21188b(InterfaceC12155g interfaceC12155g) {
        C9612q.m13917h(interfaceC12155g, "<this>");
        return InterfaceC7222b1.C7223a.m21213a(C7301o.f19732a, interfaceC12155g, null, null, 6, null);
    }
}
