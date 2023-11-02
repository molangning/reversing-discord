package p271oi;

import kotlin.jvm.internal.C9612q;
import ng.C10880j;
import p142hi.AbstractC7264g0;
import p234mi.C10472a;
import p271oi.InterfaceC11132f;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11998y;
import p429xh.C13801c;

/* renamed from: oi.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C11144j implements InterfaceC11132f {

    /* renamed from: a */
    public static final C11144j f29122a = new C11144j();

    /* renamed from: b */
    private static final String f29123b = "second parameter must be of type KProperty<*> or its supertype";

    private C11144j() {
    }

    @Override // p271oi.InterfaceC11132f
    /* renamed from: a */
    public boolean mo9079a(InterfaceC11998y functionDescriptor) {
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        InterfaceC11936j1 secondParameter = functionDescriptor.mo4301i().get(1);
        C10880j.C10882b c10882b = C10880j.f28393k;
        C9612q.m13918g(secondParameter, "secondParameter");
        AbstractC7264g0 m9758a = c10882b.m9758a(C13801c.m1499p(secondParameter));
        if (m9758a != null) {
            AbstractC7264g0 type = secondParameter.getType();
            C9612q.m13918g(type, "secondParameter.type");
            return C10472a.m11442p(m9758a, C10472a.m11438t(type));
        }
        return false;
    }

    @Override // p271oi.InterfaceC11132f
    /* renamed from: b */
    public String mo9080b(InterfaceC11998y interfaceC11998y) {
        return InterfaceC11132f.C11133a.m9112a(this, interfaceC11998y);
    }

    @Override // p271oi.InterfaceC11132f
    public String getDescription() {
        return f29123b;
    }
}