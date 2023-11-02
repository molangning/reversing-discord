package p305qg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import ph.C11633c;
import ph.C11638f;
import si.C12552o;

/* renamed from: qg.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11960n0 implements InterfaceC11967p0 {

    /* renamed from: a */
    private final Collection<InterfaceC11945l0> f30957a;

    /* renamed from: qg.n0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C11961a extends AbstractC9614s implements Function1<InterfaceC11945l0, C11633c> {

        /* renamed from: j */
        public static final C11961a f30958j = new C11961a();

        C11961a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C11633c invoke(InterfaceC11945l0 it) {
            C9612q.m13917h(it, "it");
            return it.mo4161e();
        }
    }

    /* renamed from: qg.n0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C11962b extends AbstractC9614s implements Function1<C11633c, Boolean> {

        /* renamed from: j */
        final /* synthetic */ C11633c f30959j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11962b(C11633c c11633c) {
            super(1);
            this.f30959j = c11633c;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C11633c it) {
            boolean z;
            C9612q.m13917h(it, "it");
            if (!it.m7456d() && C9612q.m13922c(it.m7455e(), this.f30959j)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11960n0(Collection<? extends InterfaceC11945l0> packageFragments) {
        C9612q.m13917h(packageFragments, "packageFragments");
        this.f30957a = packageFragments;
    }

    @Override // p305qg.InterfaceC11948m0
    /* renamed from: a */
    public List<InterfaceC11945l0> mo4427a(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        Collection<InterfaceC11945l0> collection = this.f30957a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (C9612q.m13922c(((InterfaceC11945l0) obj).mo4161e(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p305qg.InterfaceC11967p0
    /* renamed from: b */
    public void mo4426b(C11633c fqName, Collection<InterfaceC11945l0> packageFragments) {
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(packageFragments, "packageFragments");
        for (Object obj : this.f30957a) {
            if (C9612q.m13922c(((InterfaceC11945l0) obj).mo4161e(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // p305qg.InterfaceC11967p0
    /* renamed from: c */
    public boolean mo4425c(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        Collection<InterfaceC11945l0> collection = this.f30957a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (InterfaceC11945l0 interfaceC11945l0 : collection) {
            if (C9612q.m13922c(interfaceC11945l0.mo4161e(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p305qg.InterfaceC11948m0
    /* renamed from: t */
    public Collection<C11633c> mo4424t(C11633c fqName, Function1<? super C11638f, Boolean> nameFilter) {
        Sequence m14066K;
        Sequence m4851y;
        Sequence m4860p;
        List m4867E;
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(nameFilter, "nameFilter");
        m14066K = C9553r.m14066K(this.f30957a);
        m4851y = C12552o.m4851y(m14066K, C11961a.f30958j);
        m4860p = C12552o.m4860p(m4851y, new C11962b(fqName));
        m4867E = C12552o.m4867E(m4860p);
        return m4867E;
    }
}
