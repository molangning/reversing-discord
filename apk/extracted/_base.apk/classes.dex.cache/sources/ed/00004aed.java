package p305qg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import ph.C11633c;

/* renamed from: qg.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11965o0 {
    /* renamed from: a */
    public static final void m6687a(InterfaceC11948m0 interfaceC11948m0, C11633c fqName, Collection<InterfaceC11945l0> packageFragments) {
        C9612q.m13917h(interfaceC11948m0, "<this>");
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(packageFragments, "packageFragments");
        if (interfaceC11948m0 instanceof InterfaceC11967p0) {
            ((InterfaceC11967p0) interfaceC11948m0).mo4426b(fqName, packageFragments);
        } else {
            packageFragments.addAll(interfaceC11948m0.mo4427a(fqName));
        }
    }

    /* renamed from: b */
    public static final boolean m6686b(InterfaceC11948m0 interfaceC11948m0, C11633c fqName) {
        C9612q.m13917h(interfaceC11948m0, "<this>");
        C9612q.m13917h(fqName, "fqName");
        if (interfaceC11948m0 instanceof InterfaceC11967p0) {
            return ((InterfaceC11967p0) interfaceC11948m0).mo4425c(fqName);
        }
        return m6685c(interfaceC11948m0, fqName).isEmpty();
    }

    /* renamed from: c */
    public static final List<InterfaceC11945l0> m6685c(InterfaceC11948m0 interfaceC11948m0, C11633c fqName) {
        C9612q.m13917h(interfaceC11948m0, "<this>");
        C9612q.m13917h(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        m6687a(interfaceC11948m0, fqName, arrayList);
        return arrayList;
    }
}