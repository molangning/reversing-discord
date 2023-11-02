package tg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p305qg.C11965o0;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11948m0;
import p305qg.InterfaceC11967p0;
import ph.C11633c;
import ph.C11638f;

/* renamed from: tg.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12704i implements InterfaceC11967p0 {

    /* renamed from: a */
    private final List<InterfaceC11948m0> f32945a;

    /* renamed from: b */
    private final String f32946b;

    /* JADX WARN: Multi-variable type inference failed */
    public C12704i(List<? extends InterfaceC11948m0> providers, String debugName) {
        Set m14071G0;
        C9612q.m13917h(providers, "providers");
        C9612q.m13917h(debugName, "debugName");
        this.f32945a = providers;
        this.f32946b = debugName;
        providers.size();
        m14071G0 = C9553r.m14071G0(providers);
        m14071G0.size();
    }

    @Override // p305qg.InterfaceC11948m0
    /* renamed from: a */
    public List<InterfaceC11945l0> mo4427a(C11633c fqName) {
        List<InterfaceC11945l0> m14075C0;
        C9612q.m13917h(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC11948m0 interfaceC11948m0 : this.f32945a) {
            C11965o0.m6687a(interfaceC11948m0, fqName, arrayList);
        }
        m14075C0 = C9553r.m14075C0(arrayList);
        return m14075C0;
    }

    @Override // p305qg.InterfaceC11967p0
    /* renamed from: b */
    public void mo4426b(C11633c fqName, Collection<InterfaceC11945l0> packageFragments) {
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(packageFragments, "packageFragments");
        for (InterfaceC11948m0 interfaceC11948m0 : this.f32945a) {
            C11965o0.m6687a(interfaceC11948m0, fqName, packageFragments);
        }
    }

    @Override // p305qg.InterfaceC11967p0
    /* renamed from: c */
    public boolean mo4425c(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        List<InterfaceC11948m0> list = this.f32945a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (InterfaceC11948m0 interfaceC11948m0 : list) {
            if (!C11965o0.m6686b(interfaceC11948m0, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p305qg.InterfaceC11948m0
    /* renamed from: t */
    public Collection<C11633c> mo4424t(C11633c fqName, Function1<? super C11638f, Boolean> nameFilter) {
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        for (InterfaceC11948m0 interfaceC11948m0 : this.f32945a) {
            hashSet.addAll(interfaceC11948m0.mo4424t(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f32946b;
    }
}