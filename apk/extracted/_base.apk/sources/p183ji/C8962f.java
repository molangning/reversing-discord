package p183ji;

import ai.C0185d;
import ai.InterfaceC0194h;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9559v;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p448yg.InterfaceC14020b;
import ph.C11638f;

/* renamed from: ji.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C8962f implements InterfaceC0194h {

    /* renamed from: b */
    private final EnumC8963g f23443b;

    /* renamed from: c */
    private final String f23444c;

    public C8962f(EnumC8963g kind, String... formatParams) {
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(formatParams, "formatParams");
        this.f23443b = kind;
        String m16957b = kind.m16957b();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(m16957b, Arrays.copyOf(copyOf, copyOf.length));
        C9612q.m13918g(format, "format(this, *args)");
        this.f23444c = format;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: b */
    public Set<C11638f> mo4361b() {
        Set<C11638f> m14007d;
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: d */
    public Set<C11638f> mo4359d() {
        Set<C11638f> m14007d;
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List m14104i;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: f */
    public Set<C11638f> mo4357f() {
        Set<C11638f> m14007d;
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    @Override // ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        String format = String.format(EnumC8957b.ERROR_CLASS.m16962b(), Arrays.copyOf(new Object[]{name}, 1));
        C9612q.m13918g(format, "format(this, *args)");
        C11638f m7419i = C11638f.m7419i(format);
        C9612q.m13918g(m7419i, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new C8956a(m7419i);
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: h */
    public Set<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        Set<InterfaceC12005z0> m14008c;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m14008c = C9559v.m14008c(new C8958c(C8967k.f23554a.m16941h()));
        return m14008c;
    }

    @Override // ai.InterfaceC0194h
    /* renamed from: i */
    public Set<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return C8967k.f23554a.m16939j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final String m16959j() {
        return this.f23444c;
    }

    public String toString() {
        return "ErrorScope{" + this.f23444c + '}';
    }
}
