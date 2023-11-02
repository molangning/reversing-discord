package fi;

import kh.C9412i;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.C10468g;
import mh.C10469h;
import mh.InterfaceC10463c;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11998y;
import p305qg.InterfaceC12005z0;
import p325rg.InterfaceC12155g;
import ph.C11638f;
import tg.AbstractC12727p;
import tg.C12701g0;

/* renamed from: fi.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6475k extends C12701g0 implements InterfaceC6427b {

    /* renamed from: N */
    private final C9412i f18177N;

    /* renamed from: O */
    private final InterfaceC10463c f18178O;

    /* renamed from: P */
    private final C10468g f18179P;

    /* renamed from: Q */
    private final C10469h f18180Q;

    /* renamed from: R */
    private final InterfaceC6449f f18181R;

    public /* synthetic */ C6475k(InterfaceC11947m interfaceC11947m, InterfaceC12005z0 interfaceC12005z0, InterfaceC12155g interfaceC12155g, C11638f c11638f, InterfaceC11902b.EnumC11903a enumC11903a, C9412i c9412i, InterfaceC10463c interfaceC10463c, C10468g c10468g, C10469h c10469h, InterfaceC6449f interfaceC6449f, InterfaceC11900a1 interfaceC11900a1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11947m, interfaceC12005z0, interfaceC12155g, c11638f, enumC11903a, c9412i, interfaceC10463c, c10468g, c10469h, interfaceC6449f, (i & 1024) != 0 ? null : interfaceC11900a1);
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: D */
    public C10468g mo22650D() {
        return this.f18179P;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: G */
    public InterfaceC10463c mo22649G() {
        return this.f18178O;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: H */
    public InterfaceC6449f mo22648H() {
        return this.f18181R;
    }

    @Override // tg.C12701g0, tg.AbstractC12727p
    /* renamed from: L0 */
    protected AbstractC12727p mo4330L0(InterfaceC11947m newOwner, InterfaceC11998y interfaceC11998y, InterfaceC11902b.EnumC11903a kind, C11638f c11638f, InterfaceC12155g annotations, InterfaceC11900a1 source) {
        C11638f c11638f2;
        C9612q.m13917h(newOwner, "newOwner");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(source, "source");
        InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) interfaceC11998y;
        if (c11638f == null) {
            C11638f name = getName();
            C9612q.m13918g(name, "name");
            c11638f2 = name;
        } else {
            c11638f2 = c11638f;
        }
        C6475k c6475k = new C6475k(newOwner, interfaceC12005z0, annotations, c11638f2, kind, mo22653e0(), mo22649G(), mo22650D(), m22651q1(), mo22648H(), source);
        c6475k.mo4315Y0(mo4324Q0());
        return c6475k;
    }

    @Override // fi.InterfaceC6450g
    /* renamed from: p1 */
    public C9412i mo22653e0() {
        return this.f18177N;
    }

    /* renamed from: q1 */
    public C10469h m22651q1() {
        return this.f18180Q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6475k(InterfaceC11947m containingDeclaration, InterfaceC12005z0 interfaceC12005z0, InterfaceC12155g annotations, C11638f name, InterfaceC11902b.EnumC11903a kind, C9412i proto, InterfaceC10463c nameResolver, C10468g typeTable, C10469h versionRequirementTable, InterfaceC6449f interfaceC6449f, InterfaceC11900a1 interfaceC11900a1) {
        super(containingDeclaration, interfaceC12005z0, annotations, name, kind, interfaceC11900a1 == null ? InterfaceC11900a1.f30901a : interfaceC11900a1);
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        C9612q.m13917h(versionRequirementTable, "versionRequirementTable");
        this.f18177N = proto;
        this.f18178O = nameResolver;
        this.f18179P = typeTable;
        this.f18180Q = versionRequirementTable;
        this.f18181R = interfaceC6449f;
    }
}
