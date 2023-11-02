package ch;

import ch.InterfaceC2553k;
import gh.InterfaceC6784u;
import gi.InterfaceC6790a;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p069dh.C5871h;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11967p0;
import p327ri.C12242a;
import p468zg.C14246o;
import pf.C11579o;
import ph.C11633c;
import ph.C11638f;

/* renamed from: ch.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C2546f implements InterfaceC11967p0 {

    /* renamed from: a */
    private final C2548g f6977a;

    /* renamed from: b */
    private final InterfaceC6790a<C11633c, C5871h> f6978b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C2547a extends AbstractC9614s implements Function0<C5871h> {

        /* renamed from: k */
        final /* synthetic */ InterfaceC6784u f6980k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2547a(InterfaceC6784u interfaceC6784u) {
            super(0);
            this.f6980k = interfaceC6784u;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C5871h invoke() {
            return new C5871h(C2546f.this.f6977a, this.f6980k);
        }
    }

    public C2546f(C2540b components) {
        Lazy m7599c;
        C9612q.m13917h(components, "components");
        InterfaceC2553k.C2554a c2554a = InterfaceC2553k.C2554a.f6993a;
        m7599c = C11579o.m7599c(null);
        C2548g c2548g = new C2548g(components, c2554a, m7599c);
        this.f6977a = c2548g;
        this.f6978b = c2548g.m33010e().mo21869a();
    }

    /* renamed from: e */
    private final C5871h m33017e(C11633c c11633c) {
        InterfaceC6784u m327a = C14246o.m327a(this.f6977a.m33014a().m33046d(), c11633c, false, 2, null);
        if (m327a == null) {
            return null;
        }
        return this.f6978b.mo21897a(c11633c, new C2547a(m327a));
    }

    @Override // p305qg.InterfaceC11948m0
    /* renamed from: a */
    public List<C5871h> mo4427a(C11633c fqName) {
        List<C5871h> m14100m;
        C9612q.m13917h(fqName, "fqName");
        m14100m = C9545j.m14100m(m33017e(fqName));
        return m14100m;
    }

    @Override // p305qg.InterfaceC11967p0
    /* renamed from: b */
    public void mo4426b(C11633c fqName, Collection<InterfaceC11945l0> packageFragments) {
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(packageFragments, "packageFragments");
        C12242a.m5675a(packageFragments, m33017e(fqName));
    }

    @Override // p305qg.InterfaceC11967p0
    /* renamed from: c */
    public boolean mo4425c(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        if (C14246o.m327a(this.f6977a.m33014a().m33046d(), fqName, false, 2, null) != null) {
            return false;
        }
        return true;
    }

    @Override // p305qg.InterfaceC11948m0
    /* renamed from: f */
    public List<C11633c> mo4424t(C11633c fqName, Function1<? super C11638f, Boolean> nameFilter) {
        List<C11633c> list;
        List<C11633c> m14104i;
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(nameFilter, "nameFilter");
        C5871h m33017e = m33017e(fqName);
        if (m33017e != null) {
            list = m33017e.m24272O0();
        } else {
            list = null;
        }
        if (list == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return list;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f6977a.m33014a().m33037m();
    }
}
