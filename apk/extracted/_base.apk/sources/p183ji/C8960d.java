package p183ji;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import ng.C10866e;
import p305qg.C11922g0;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11969q0;
import p325rg.InterfaceC12155g;
import ph.C11633c;
import ph.C11638f;

/* renamed from: ji.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C8960d implements InterfaceC11928h0 {

    /* renamed from: j */
    public static final C8960d f23436j = new C8960d();

    /* renamed from: k */
    private static final C11638f f23437k;

    /* renamed from: l */
    private static final List<InterfaceC11928h0> f23438l;

    /* renamed from: m */
    private static final List<InterfaceC11928h0> f23439m;

    /* renamed from: n */
    private static final Set<InterfaceC11928h0> f23440n;

    /* renamed from: o */
    private static final AbstractC10870h f23441o;

    static {
        List<InterfaceC11928h0> m14104i;
        List<InterfaceC11928h0> m14104i2;
        Set<InterfaceC11928h0> m14007d;
        C11638f m7419i = C11638f.m7419i(EnumC8957b.ERROR_MODULE.m16962b());
        C9612q.m13918g(m7419i, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f23437k = m7419i;
        m14104i = C9545j.m14104i();
        f23438l = m14104i;
        m14104i2 = C9545j.m14104i();
        f23439m = m14104i2;
        m14007d = C9560w.m14007d();
        f23440n = m14007d;
        f23441o = C10866e.f28359h.m9875a();
    }

    private C8960d() {
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: H0 */
    public InterfaceC11969q0 mo4210H0(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: a */
    public InterfaceC11947m mo4221a() {
        return this;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: b */
    public InterfaceC11947m mo4163b() {
        return null;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> visitor, D d) {
        C9612q.m13917h(visitor, "visitor");
        return null;
    }

    /* renamed from: g0 */
    public C11638f m16960g0() {
        return f23437k;
    }

    @Override // p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        return InterfaceC12155g.f31603f.m6037b();
    }

    @Override // p305qg.InterfaceC11935j0
    public C11638f getName() {
        return m16960g0();
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: n */
    public AbstractC10870h mo4194n() {
        return f23441o;
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: t */
    public Collection<C11633c> mo4193t(C11633c fqName, Function1<? super C11638f, Boolean> nameFilter) {
        List m14104i;
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(nameFilter, "nameFilter");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: u0 */
    public boolean mo4192u0(InterfaceC11928h0 targetModule) {
        C9612q.m13917h(targetModule, "targetModule");
        return false;
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: w */
    public <T> T mo4191w(C11922g0<T> capability) {
        C9612q.m13917h(capability, "capability");
        return null;
    }

    @Override // p305qg.InterfaceC11928h0
    /* renamed from: z0 */
    public List<InterfaceC11928h0> mo4190z0() {
        return f23439m;
    }
}
