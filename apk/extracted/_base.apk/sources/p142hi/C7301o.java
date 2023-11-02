package p142hi;

import java.util.List;
import kotlin.collections.C9544i;
import kotlin.jvm.internal.C9612q;
import p142hi.C7226c1;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12155g;

/* renamed from: hi.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7301o implements InterfaceC7222b1 {

    /* renamed from: a */
    public static final C7301o f19732a = new C7301o();

    private C7301o() {
    }

    @Override // p142hi.InterfaceC7222b1
    /* renamed from: a */
    public C7226c1 mo21048a(InterfaceC12155g annotations, InterfaceC7265g1 interfaceC7265g1, InterfaceC11947m interfaceC11947m) {
        List<? extends AbstractC7218a1<?>> m14109d;
        C9612q.m13917h(annotations, "annotations");
        if (annotations.isEmpty()) {
            return C7226c1.f19622k.m21197h();
        }
        C7226c1.C7227a c7227a = C7226c1.f19622k;
        m14109d = C9544i.m14109d(new C7278j(annotations));
        return c7227a.m21198g(m14109d);
    }
}
