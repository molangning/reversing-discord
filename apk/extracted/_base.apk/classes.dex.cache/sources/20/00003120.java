package p070di;

import gi.InterfaceC6814h;
import gi.InterfaceC6821n;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11967p0;
import p327ri.C12242a;
import ph.C11633c;
import ph.C11638f;

/* renamed from: di.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC5908a implements InterfaceC11967p0 {

    /* renamed from: a */
    private final InterfaceC6821n f16852a;

    /* renamed from: b */
    private final InterfaceC5955u f16853b;

    /* renamed from: c */
    private final InterfaceC11928h0 f16854c;

    /* renamed from: d */
    protected C5939k f16855d;

    /* renamed from: e */
    private final InterfaceC6814h<C11633c, InterfaceC11945l0> f16856e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: di.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5909a extends AbstractC9614s implements Function1<C11633c, InterfaceC11945l0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5909a() {
            super(1);
            AbstractC5908a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11945l0 invoke(C11633c fqName) {
            C9612q.m13917h(fqName, "fqName");
            AbstractC5946p mo7484d = AbstractC5908a.this.mo7484d(fqName);
            if (mo7484d != null) {
                mo7484d.mo24088L0(AbstractC5908a.this.m24193e());
                return mo7484d;
            }
            return null;
        }
    }

    public AbstractC5908a(InterfaceC6821n storageManager, InterfaceC5955u finder, InterfaceC11928h0 moduleDescriptor) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(finder, "finder");
        C9612q.m13917h(moduleDescriptor, "moduleDescriptor");
        this.f16852a = storageManager;
        this.f16853b = finder;
        this.f16854c = moduleDescriptor;
        this.f16856e = storageManager.mo21863g(new C5909a());
    }

    @Override // p305qg.InterfaceC11948m0
    /* renamed from: a */
    public List<InterfaceC11945l0> mo4427a(C11633c fqName) {
        List<InterfaceC11945l0> m14100m;
        C9612q.m13917h(fqName, "fqName");
        m14100m = C9545j.m14100m(this.f16856e.invoke(fqName));
        return m14100m;
    }

    @Override // p305qg.InterfaceC11967p0
    /* renamed from: b */
    public void mo4426b(C11633c fqName, Collection<InterfaceC11945l0> packageFragments) {
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(packageFragments, "packageFragments");
        C12242a.m5675a(packageFragments, this.f16856e.invoke(fqName));
    }

    @Override // p305qg.InterfaceC11967p0
    /* renamed from: c */
    public boolean mo4425c(C11633c fqName) {
        InterfaceC11947m mo7484d;
        C9612q.m13917h(fqName, "fqName");
        if (this.f16856e.mo21876t(fqName)) {
            mo7484d = (InterfaceC11945l0) this.f16856e.invoke(fqName);
        } else {
            mo7484d = mo7484d(fqName);
        }
        if (mo7484d == null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    protected abstract AbstractC5946p mo7484d(C11633c c11633c);

    /* renamed from: e */
    protected final C5939k m24193e() {
        C5939k c5939k = this.f16855d;
        if (c5939k != null) {
            return c5939k;
        }
        C9612q.m13900y("components");
        return null;
    }

    /* renamed from: f */
    public final InterfaceC5955u m24192f() {
        return this.f16853b;
    }

    /* renamed from: g */
    public final InterfaceC11928h0 m24191g() {
        return this.f16854c;
    }

    /* renamed from: h */
    public final InterfaceC6821n m24190h() {
        return this.f16852a;
    }

    /* renamed from: i */
    public final void m24189i(C5939k c5939k) {
        C9612q.m13917h(c5939k, "<set-?>");
        this.f16855d = c5939k;
    }

    @Override // p305qg.InterfaceC11948m0
    /* renamed from: t */
    public Collection<C11633c> mo4424t(C11633c fqName, Function1<? super C11638f, Boolean> nameFilter) {
        Set m14007d;
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(nameFilter, "nameFilter");
        m14007d = C9560w.m14007d();
        return m14007d;
    }
}