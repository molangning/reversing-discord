package p468zg;

import java.util.Collection;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p305qg.InterfaceC11902b;
import p429xh.C13801c;
import ph.C11638f;

/* renamed from: zg.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14230i {

    /* renamed from: a */
    public static final C14230i f36603a = new C14230i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zg.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14231a extends AbstractC9614s implements Function1<InterfaceC11902b, Boolean> {

        /* renamed from: j */
        public static final C14231a f36604j = new C14231a();

        C14231a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11902b it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(C14230i.f36603a.m369b(it));
        }
    }

    private C14230i() {
    }

    /* renamed from: c */
    private final boolean m368c(InterfaceC11902b interfaceC11902b) {
        boolean m14064L;
        m14064L = C9553r.m14064L(C14222g.f36589a.m391c(), C13801c.m1507h(interfaceC11902b));
        if (m14064L && interfaceC11902b.mo4301i().isEmpty()) {
            return true;
        }
        if (!AbstractC10870h.m9814f0(interfaceC11902b)) {
            return false;
        }
        Collection<? extends InterfaceC11902b> overriddenDescriptors = interfaceC11902b.mo4310d();
        C9612q.m13918g(overriddenDescriptors, "overriddenDescriptors");
        if (!overriddenDescriptors.isEmpty()) {
            for (InterfaceC11902b it : overriddenDescriptors) {
                C14230i c14230i = f36603a;
                C9612q.m13918g(it, "it");
                if (c14230i.m369b(it)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String m370a(InterfaceC11902b interfaceC11902b) {
        C11638f c11638f;
        C9612q.m13917h(interfaceC11902b, "<this>");
        AbstractC10870h.m9814f0(interfaceC11902b);
        InterfaceC11902b m1509f = C13801c.m1509f(C13801c.m1496s(interfaceC11902b), false, C14231a.f36604j, 1, null);
        if (m1509f == null || (c11638f = C14222g.f36589a.m393a().get(C13801c.m1503l(m1509f))) == null) {
            return null;
        }
        return c11638f.m7426b();
    }

    /* renamed from: b */
    public final boolean m369b(InterfaceC11902b callableMemberDescriptor) {
        C9612q.m13917h(callableMemberDescriptor, "callableMemberDescriptor");
        if (!C14222g.f36589a.m390d().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        return m368c(callableMemberDescriptor);
    }
}
