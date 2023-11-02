package ng;

import java.util.Set;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11914e;
import p429xh.C13801c;
import ph.C11632b;
import th.C12758e;

/* renamed from: ng.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10865d {
    /* renamed from: a */
    public static final boolean m9877a(C10864c c10864c, InterfaceC11914e classDescriptor) {
        C11632b c11632b;
        boolean m14064L;
        C9612q.m13917h(c10864c, "<this>");
        C9612q.m13917h(classDescriptor, "classDescriptor");
        if (C12758e.m4088x(classDescriptor)) {
            Set<C11632b> m9878b = c10864c.m9878b();
            C11632b m1504k = C13801c.m1504k(classDescriptor);
            if (m1504k != null) {
                c11632b = m1504k.m7466g();
            } else {
                c11632b = null;
            }
            m14064L = C9553r.m14064L(m9878b, c11632b);
            if (m14064L) {
                return true;
            }
        }
        return false;
    }
}
