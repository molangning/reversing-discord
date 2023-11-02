package fi;

import kh.C9425n;
import kotlin.jvm.internal.C9612q;
import mh.C10458b;
import mh.C10468g;
import mh.C10469h;
import mh.InterfaceC10463c;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p325rg.InterfaceC12155g;
import ph.C11638f;
import tg.C12685c0;

/* renamed from: fi.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6474j extends C12685c0 implements InterfaceC6427b {

    /* renamed from: L */
    private final C9425n f18172L;

    /* renamed from: M */
    private final InterfaceC10463c f18173M;

    /* renamed from: N */
    private final C10468g f18174N;

    /* renamed from: O */
    private final C10469h f18175O;

    /* renamed from: P */
    private final InterfaceC6449f f18176P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6474j(InterfaceC11947m containingDeclaration, InterfaceC11989u0 interfaceC11989u0, InterfaceC12155g annotations, EnumC11915e0 modality, AbstractC11988u visibility, boolean z, C11638f name, InterfaceC11902b.EnumC11903a kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C9425n proto, InterfaceC10463c nameResolver, C10468g typeTable, C10469h versionRequirementTable, InterfaceC6449f interfaceC6449f) {
        super(containingDeclaration, interfaceC11989u0, annotations, modality, visibility, z, name, kind, InterfaceC11900a1.f30901a, z2, z3, z6, false, z4, z5);
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(modality, "modality");
        C9612q.m13917h(visibility, "visibility");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        C9612q.m13917h(versionRequirementTable, "versionRequirementTable");
        this.f18172L = proto;
        this.f18173M = nameResolver;
        this.f18174N = typeTable;
        this.f18175O = versionRequirementTable;
        this.f18176P = interfaceC6449f;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: D */
    public C10468g mo22650D() {
        return this.f18174N;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: G */
    public InterfaceC10463c mo22649G() {
        return this.f18173M;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: H */
    public InterfaceC6449f mo22648H() {
        return this.f18176P;
    }

    @Override // tg.C12685c0
    /* renamed from: P0 */
    protected C12685c0 mo4526P0(InterfaceC11947m newOwner, EnumC11915e0 newModality, AbstractC11988u newVisibility, InterfaceC11989u0 interfaceC11989u0, InterfaceC11902b.EnumC11903a kind, C11638f newName, InterfaceC11900a1 source) {
        C9612q.m13917h(newOwner, "newOwner");
        C9612q.m13917h(newModality, "newModality");
        C9612q.m13917h(newVisibility, "newVisibility");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(newName, "newName");
        C9612q.m13917h(source, "source");
        return new C6474j(newOwner, interfaceC11989u0, getAnnotations(), newModality, newVisibility, mo4342L(), newName, kind, mo4504y0(), mo4516Z(), isExternal(), mo4531A(), mo4172k0(), mo22653e0(), mo22649G(), mo22650D(), m22654g1(), mo22648H());
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: f1 */
    public C9425n mo22653e0() {
        return this.f18172L;
    }

    /* renamed from: g1 */
    public C10469h m22654g1() {
        return this.f18175O;
    }

    @Override // tg.C12685c0, p305qg.InterfaceC11911d0
    public boolean isExternal() {
        Boolean mo11488d = C10458b.f27305D.mo11488d(mo22653e0().m15154b0());
        C9612q.m13918g(mo11488d, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return mo11488d.booleanValue();
    }
}
