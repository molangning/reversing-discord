package p160ih;

import java.util.Collection;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11914e;

/* renamed from: ih.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7521a0 implements InterfaceC7580z<AbstractC7551m> {

    /* renamed from: a */
    public static final C7521a0 f20776a = new C7521a0();

    private C7521a0() {
    }

    @Override // p160ih.InterfaceC7580z
    /* renamed from: a */
    public String mo20368a(InterfaceC11914e classDescriptor) {
        C9612q.m13917h(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // p160ih.InterfaceC7580z
    /* renamed from: c */
    public String mo20366c(InterfaceC11914e classDescriptor) {
        C9612q.m13917h(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // p160ih.InterfaceC7580z
    /* renamed from: d */
    public AbstractC7264g0 mo20365d(AbstractC7264g0 kotlinType) {
        C9612q.m13917h(kotlinType, "kotlinType");
        return null;
    }

    @Override // p160ih.InterfaceC7580z
    /* renamed from: e */
    public AbstractC7264g0 mo20364e(Collection<? extends AbstractC7264g0> types) {
        String m14046d0;
        C9612q.m13917h(types, "types");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("There should be no intersection type in existing descriptors, but found: ");
        m14046d0 = C9553r.m14046d0(types, null, null, null, 0, null, null, 63, null);
        sb2.append(m14046d0);
        throw new AssertionError(sb2.toString());
    }

    @Override // p160ih.InterfaceC7580z
    /* renamed from: f */
    public void mo20363f(AbstractC7264g0 kotlinType, InterfaceC11914e descriptor) {
        C9612q.m13917h(kotlinType, "kotlinType");
        C9612q.m13917h(descriptor, "descriptor");
    }

    @Override // p160ih.InterfaceC7580z
    /* renamed from: g */
    public AbstractC7551m mo20367b(InterfaceC11914e classDescriptor) {
        C9612q.m13917h(classDescriptor, "classDescriptor");
        return null;
    }
}