package p070di;

import fi.InterfaceC6449f;
import gi.InterfaceC6821n;
import java.util.List;
import kh.C9450s;
import kotlin.jvm.internal.C9612q;
import mh.AbstractC10456a;
import mh.C10468g;
import mh.C10469h;
import mh.C10471i;
import mh.InterfaceC10463c;
import p305qg.InterfaceC11947m;

/* renamed from: di.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5942m {

    /* renamed from: a */
    private final C5939k f16934a;

    /* renamed from: b */
    private final InterfaceC10463c f16935b;

    /* renamed from: c */
    private final InterfaceC11947m f16936c;

    /* renamed from: d */
    private final C10468g f16937d;

    /* renamed from: e */
    private final C10469h f16938e;

    /* renamed from: f */
    private final AbstractC10456a f16939f;

    /* renamed from: g */
    private final InterfaceC6449f f16940g;

    /* renamed from: h */
    private final C5919d0 f16941h;

    /* renamed from: i */
    private final C5958w f16942i;

    public C5942m(C5939k components, InterfaceC10463c nameResolver, InterfaceC11947m containingDeclaration, C10468g typeTable, C10469h versionRequirementTable, AbstractC10456a metadataVersion, InterfaceC6449f interfaceC6449f, C5919d0 c5919d0, List<C9450s> typeParameters) {
        C9612q.m13917h(components, "components");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(typeTable, "typeTable");
        C9612q.m13917h(versionRequirementTable, "versionRequirementTable");
        C9612q.m13917h(metadataVersion, "metadataVersion");
        C9612q.m13917h(typeParameters, "typeParameters");
        this.f16934a = components;
        this.f16935b = nameResolver;
        this.f16936c = containingDeclaration;
        this.f16937d = typeTable;
        this.f16938e = versionRequirementTable;
        this.f16939f = metadataVersion;
        this.f16940g = interfaceC6449f;
        this.f16941h = new C5919d0(this, c5919d0, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (interfaceC6449f == null || (r2 = interfaceC6449f.mo20396a()) == null) ? "[container not found]" : "[container not found]");
        this.f16942i = new C5958w(this);
    }

    /* renamed from: b */
    public static /* synthetic */ C5942m m24102b(C5942m c5942m, InterfaceC11947m interfaceC11947m, List list, InterfaceC10463c interfaceC10463c, C10468g c10468g, C10469h c10469h, AbstractC10456a abstractC10456a, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC10463c = c5942m.f16935b;
        }
        InterfaceC10463c interfaceC10463c2 = interfaceC10463c;
        if ((i & 8) != 0) {
            c10468g = c5942m.f16937d;
        }
        C10468g c10468g2 = c10468g;
        if ((i & 16) != 0) {
            c10469h = c5942m.f16938e;
        }
        C10469h c10469h2 = c10469h;
        if ((i & 32) != 0) {
            abstractC10456a = c5942m.f16939f;
        }
        return c5942m.m24103a(interfaceC11947m, list, interfaceC10463c2, c10468g2, c10469h2, abstractC10456a);
    }

    /* renamed from: a */
    public final C5942m m24103a(InterfaceC11947m descriptor, List<C9450s> typeParameterProtos, InterfaceC10463c nameResolver, C10468g typeTable, C10469h c10469h, AbstractC10456a metadataVersion) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(typeParameterProtos, "typeParameterProtos");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        C10469h versionRequirementTable = c10469h;
        C9612q.m13917h(versionRequirementTable, "versionRequirementTable");
        C9612q.m13917h(metadataVersion, "metadataVersion");
        C5939k c5939k = this.f16934a;
        if (!C10471i.m11458b(metadataVersion)) {
            versionRequirementTable = this.f16938e;
        }
        return new C5942m(c5939k, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, this.f16940g, this.f16941h, typeParameterProtos);
    }

    /* renamed from: c */
    public final C5939k m24101c() {
        return this.f16934a;
    }

    /* renamed from: d */
    public final InterfaceC6449f m24100d() {
        return this.f16940g;
    }

    /* renamed from: e */
    public final InterfaceC11947m m24099e() {
        return this.f16936c;
    }

    /* renamed from: f */
    public final C5958w m24098f() {
        return this.f16942i;
    }

    /* renamed from: g */
    public final InterfaceC10463c m24097g() {
        return this.f16935b;
    }

    /* renamed from: h */
    public final InterfaceC6821n m24096h() {
        return this.f16934a.m24111u();
    }

    /* renamed from: i */
    public final C5919d0 m24095i() {
        return this.f16941h;
    }

    /* renamed from: j */
    public final C10468g m24094j() {
        return this.f16937d;
    }

    /* renamed from: k */
    public final C10469h m24093k() {
        return this.f16938e;
    }
}
