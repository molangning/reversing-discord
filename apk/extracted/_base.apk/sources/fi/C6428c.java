package fi;

import kh.C9391d;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.C10468g;
import mh.C10469h;
import mh.InterfaceC10463c;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11998y;
import p325rg.InterfaceC12155g;
import ph.C11638f;
import tg.C12698f;

/* renamed from: fi.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6428c extends C12698f implements InterfaceC6427b {

    /* renamed from: O */
    private final C9391d f18060O;

    /* renamed from: P */
    private final InterfaceC10463c f18061P;

    /* renamed from: Q */
    private final C10468g f18062Q;

    /* renamed from: R */
    private final C10469h f18063R;

    /* renamed from: S */
    private final InterfaceC6449f f18064S;

    public /* synthetic */ C6428c(InterfaceC11914e interfaceC11914e, InterfaceC11944l interfaceC11944l, InterfaceC12155g interfaceC12155g, boolean z, InterfaceC11902b.EnumC11903a enumC11903a, C9391d c9391d, InterfaceC10463c interfaceC10463c, C10468g c10468g, C10469h c10469h, InterfaceC6449f interfaceC6449f, InterfaceC11900a1 interfaceC11900a1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11914e, interfaceC11944l, interfaceC12155g, z, enumC11903a, c9391d, interfaceC10463c, c10468g, c10469h, interfaceC6449f, (i & 1024) != 0 ? null : interfaceC11900a1);
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11998y
    /* renamed from: B */
    public boolean mo4338B() {
        return false;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: D */
    public C10468g mo22650D() {
        return this.f18062Q;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: G */
    public InterfaceC10463c mo22649G() {
        return this.f18061P;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: H */
    public InterfaceC6449f mo22648H() {
        return this.f18064S;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11911d0
    public boolean isExternal() {
        return false;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11998y
    public boolean isInline() {
        return false;
    }

    @Override // tg.AbstractC12727p, p305qg.InterfaceC11998y
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.C12698f
    /* renamed from: s1 */
    public C6428c mo4442o1(InterfaceC11947m newOwner, InterfaceC11998y interfaceC11998y, InterfaceC11902b.EnumC11903a kind, C11638f c11638f, InterfaceC12155g annotations, InterfaceC11900a1 source) {
        C9612q.m13917h(newOwner, "newOwner");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(source, "source");
        C6428c c6428c = new C6428c((InterfaceC11914e) newOwner, (InterfaceC11944l) interfaceC11998y, annotations, this.f32931N, kind, mo22653e0(), mo22649G(), mo22650D(), m22777u1(), mo22648H(), source);
        c6428c.mo4315Y0(mo4324Q0());
        return c6428c;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: t1 */
    public C9391d mo22653e0() {
        return this.f18060O;
    }

    /* renamed from: u1 */
    public C10469h m22777u1() {
        return this.f18063R;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6428c(InterfaceC11914e containingDeclaration, InterfaceC11944l interfaceC11944l, InterfaceC12155g annotations, boolean z, InterfaceC11902b.EnumC11903a kind, C9391d proto, InterfaceC10463c nameResolver, C10468g typeTable, C10469h versionRequirementTable, InterfaceC6449f interfaceC6449f, InterfaceC11900a1 interfaceC11900a1) {
        super(containingDeclaration, interfaceC11944l, annotations, z, kind, interfaceC11900a1 == null ? InterfaceC11900a1.f30901a : interfaceC11900a1);
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        C9612q.m13917h(versionRequirementTable, "versionRequirementTable");
        this.f18060O = proto;
        this.f18061P = nameResolver;
        this.f18062Q = typeTable;
        this.f18063R = versionRequirementTable;
        this.f18064S = interfaceC6449f;
    }
}
