package p183ji;

import ai.C0185d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p448yg.InterfaceC14020b;
import ph.C11638f;

/* renamed from: ji.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C8968l extends C8962f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8968l(EnumC8963g kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(formatParams, "formatParams");
    }

    @Override // p183ji.C8962f, ai.InterfaceC0194h
    /* renamed from: b */
    public Set<C11638f> mo4361b() {
        throw new IllegalStateException();
    }

    @Override // p183ji.C8962f, ai.InterfaceC0194h
    /* renamed from: d */
    public Set<C11638f> mo4359d() {
        throw new IllegalStateException();
    }

    @Override // p183ji.C8962f, ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        throw new IllegalStateException(m16959j());
    }

    @Override // p183ji.C8962f, ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        throw new IllegalStateException();
    }

    @Override // p183ji.C8962f, ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        throw new IllegalStateException(m16959j() + ", required name: " + name);
    }

    @Override // p183ji.C8962f, ai.InterfaceC0194h
    /* renamed from: h */
    public Set<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        throw new IllegalStateException(m16959j() + ", required name: " + name);
    }

    @Override // p183ji.C8962f, ai.InterfaceC0194h
    /* renamed from: i */
    public Set<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        throw new IllegalStateException(m16959j() + ", required name: " + name);
    }

    @Override // p183ji.C8962f
    public String toString() {
        return "ThrowingScope{" + m16959j() + '}';
    }
}
