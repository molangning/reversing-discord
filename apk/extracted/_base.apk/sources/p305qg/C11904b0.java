package p305qg;

import kotlin.Unit;
import kotlin.jvm.internal.C9612q;

/* renamed from: qg.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11904b0 {

    /* renamed from: a */
    private static final C11922g0<InterfaceC11908c0> f30907a = new C11922g0<>("InvalidModuleNotifier");

    /* renamed from: a */
    public static final void m6726a(InterfaceC11928h0 interfaceC11928h0) {
        Unit unit;
        C9612q.m13917h(interfaceC11928h0, "<this>");
        InterfaceC11908c0 interfaceC11908c0 = (InterfaceC11908c0) interfaceC11928h0.mo4191w(f30907a);
        if (interfaceC11908c0 != null) {
            interfaceC11908c0.m6725a(interfaceC11928h0);
            unit = Unit.f25302a;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new C11899a0("Accessing invalid module descriptor " + interfaceC11928h0);
    }
}
