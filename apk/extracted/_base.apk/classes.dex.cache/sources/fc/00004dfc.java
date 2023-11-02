package tg;

import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11964o;
import p325rg.InterfaceC12155g;
import ph.C11633c;

/* renamed from: tg.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12748z extends AbstractC12710k implements InterfaceC11945l0 {

    /* renamed from: n */
    private final C11633c f33088n;

    /* renamed from: o */
    private final String f33089o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12748z(InterfaceC11928h0 module, C11633c fqName) {
        super(module, InterfaceC12155g.f31603f.m6037b(), fqName.m7452h(), InterfaceC11900a1.f30901a);
        C9612q.m13917h(module, "module");
        C9612q.m13917h(fqName, "fqName");
        this.f33088n = fqName;
        this.f33089o = "package " + fqName + " of " + module;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> visitor, D d) {
        C9612q.m13917h(visitor, "visitor");
        return visitor.mo4388g(this, d);
    }

    @Override // p305qg.InterfaceC11945l0
    /* renamed from: e */
    public final C11633c mo4161e() {
        return this.f33088n;
    }

    @Override // tg.AbstractC12710k, p305qg.InterfaceC11966p
    /* renamed from: j */
    public InterfaceC11900a1 mo4160j() {
        InterfaceC11900a1 NO_SOURCE = InterfaceC11900a1.f30901a;
        C9612q.m13918g(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // tg.AbstractC12706j
    public String toString() {
        return this.f33089o;
    }

    @Override // tg.AbstractC12710k, p305qg.InterfaceC11947m
    /* renamed from: b */
    public InterfaceC11928h0 mo4163b() {
        InterfaceC11947m mo4163b = super.mo4163b();
        C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC11928h0) mo4163b;
    }
}