package tg;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9612q;

/* renamed from: tg.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12743w implements InterfaceC12742v {

    /* renamed from: a */
    private final List<C12744x> f33064a;

    /* renamed from: b */
    private final Set<C12744x> f33065b;

    /* renamed from: c */
    private final List<C12744x> f33066c;

    /* renamed from: d */
    private final Set<C12744x> f33067d;

    public C12743w(List<C12744x> allDependencies, Set<C12744x> modulesWhoseInternalsAreVisible, List<C12744x> directExpectedByDependencies, Set<C12744x> allExpectedByDependencies) {
        C9612q.m13917h(allDependencies, "allDependencies");
        C9612q.m13917h(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        C9612q.m13917h(directExpectedByDependencies, "directExpectedByDependencies");
        C9612q.m13917h(allExpectedByDependencies, "allExpectedByDependencies");
        this.f33064a = allDependencies;
        this.f33065b = modulesWhoseInternalsAreVisible;
        this.f33066c = directExpectedByDependencies;
        this.f33067d = allExpectedByDependencies;
    }

    @Override // tg.InterfaceC12742v
    /* renamed from: a */
    public List<C12744x> mo4215a() {
        return this.f33064a;
    }

    @Override // tg.InterfaceC12742v
    /* renamed from: b */
    public List<C12744x> mo4214b() {
        return this.f33066c;
    }

    @Override // tg.InterfaceC12742v
    /* renamed from: c */
    public Set<C12744x> mo4213c() {
        return this.f33065b;
    }
}
