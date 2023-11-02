package vg;

import java.util.List;
import kotlin.jvm.internal.C9612q;
import p070di.InterfaceC5950r;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;

/* renamed from: vg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13288j implements InterfaceC5950r {

    /* renamed from: b */
    public static final C13288j f34368b = new C13288j();

    private C13288j() {
    }

    @Override // p070di.InterfaceC5950r
    /* renamed from: a */
    public void mo2842a(InterfaceC11914e descriptor, List<String> unresolvedSuperClasses) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }

    @Override // p070di.InterfaceC5950r
    /* renamed from: b */
    public void mo2841b(InterfaceC11902b descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }
}