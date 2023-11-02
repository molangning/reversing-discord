package th;

import java.util.Collection;
import kotlin.jvm.internal.C9612q;
import p305qg.C11974t;
import p305qg.InterfaceC11902b;

/* renamed from: th.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12784q {
    /* renamed from: a */
    public static final InterfaceC11902b m3930a(Collection<? extends InterfaceC11902b> descriptors) {
        Integer m6675d;
        C9612q.m13917h(descriptors, "descriptors");
        descriptors.isEmpty();
        InterfaceC11902b interfaceC11902b = null;
        for (InterfaceC11902b interfaceC11902b2 : descriptors) {
            if (interfaceC11902b == null || ((m6675d = C11974t.m6675d(interfaceC11902b.getVisibility(), interfaceC11902b2.getVisibility())) != null && m6675d.intValue() < 0)) {
                interfaceC11902b = interfaceC11902b2;
            }
        }
        C9612q.m13920e(interfaceC11902b);
        return interfaceC11902b;
    }
}
