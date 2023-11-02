package p271oi;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import p271oi.InterfaceC11132f;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11998y;
import p429xh.C13801c;

/* renamed from: oi.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C11150m implements InterfaceC11132f {

    /* renamed from: a */
    public static final C11150m f29128a = new C11150m();

    /* renamed from: b */
    private static final String f29129b = "should not have varargs or parameters with default values";

    private C11150m() {
    }

    @Override // p271oi.InterfaceC11132f
    /* renamed from: a */
    public boolean mo9079a(InterfaceC11998y functionDescriptor) {
        boolean z;
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        List<InterfaceC11936j1> mo4301i = functionDescriptor.mo4301i();
        C9612q.m13918g(mo4301i, "functionDescriptor.valueParameters");
        if ((mo4301i instanceof Collection) && mo4301i.isEmpty()) {
            return true;
        }
        for (InterfaceC11936j1 it : mo4301i) {
            C9612q.m13918g(it, "it");
            if (!C13801c.m1512c(it) && it.mo4373v0() == null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // p271oi.InterfaceC11132f
    /* renamed from: b */
    public String mo9080b(InterfaceC11998y interfaceC11998y) {
        return InterfaceC11132f.C11133a.m9112a(this, interfaceC11998y);
    }

    @Override // p271oi.InterfaceC11132f
    public String getDescription() {
        return f29129b;
    }
}