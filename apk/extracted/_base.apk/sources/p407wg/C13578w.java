package p407wg;

import gh.InterfaceC6760a;
import gh.InterfaceC6770g;
import gh.InterfaceC6784u;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import ph.C11633c;
import ph.C11638f;

/* renamed from: wg.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13578w extends AbstractC13571p implements InterfaceC6784u {

    /* renamed from: a */
    private final C11633c f34961a;

    public C13578w(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        this.f34961a = fqName;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: D */
    public boolean mo2164D() {
        return false;
    }

    @Override // gh.InterfaceC6784u
    /* renamed from: F */
    public Collection<InterfaceC6770g> mo2167F(Function1<? super C11638f, Boolean> nameFilter) {
        List m14104i;
        C9612q.m13917h(nameFilter, "nameFilter");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: b */
    public InterfaceC6760a mo2159b(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        return null;
    }

    @Override // gh.InterfaceC6784u
    /* renamed from: e */
    public C11633c mo2166e() {
        return this.f34961a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13578w) && C9612q.m13922c(mo2166e(), ((C13578w) obj).mo2166e());
    }

    public int hashCode() {
        return mo2166e().hashCode();
    }

    public String toString() {
        return C13578w.class.getName() + ": " + mo2166e();
    }

    @Override // gh.InterfaceC6784u
    /* renamed from: u */
    public Collection<InterfaceC6784u> mo2165u() {
        List m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // gh.InterfaceC6766d
    public List<InterfaceC6760a> getAnnotations() {
        List<InterfaceC6760a> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }
}
