package p069dh;

import bh.InterfaceC2307g;
import ch.C2548g;
import gh.InterfaceC6760a;
import gh.InterfaceC6762b;
import gh.InterfaceC6764c;
import gh.InterfaceC6768e;
import gh.InterfaceC6770g;
import gh.InterfaceC6771h;
import gh.InterfaceC6776m;
import gh.InterfaceC6778o;
import gh.InterfaceC6787x;
import gi.C6820m;
import gi.InterfaceC6815i;
import gi.InterfaceC6816j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p013ah.C0158a;
import p086eh.C6225b;
import p108fh.InterfaceC6424a;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7276i0;
import p142hi.EnumC7317r1;
import p142hi.EnumC7336w1;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p304qf.C11889v;
import p305qg.C11994x;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11936j1;
import p325rg.InterfaceC12149c;
import p389vh.AbstractC13301g;
import p389vh.C13294a;
import p389vh.C13302h;
import p389vh.C13306j;
import p389vh.C13320q;
import p389vh.C13326s;
import p429xh.C13801c;
import p468zg.C14208b0;
import pf.C11591x;
import pg.C11601d;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;
import sh.AbstractC12485c;

/* renamed from: dh.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C5846e implements InterfaceC12149c, InterfaceC2307g {

    /* renamed from: i */
    static final /* synthetic */ KProperty<Object>[] f16721i = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C5846e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C5846e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C5846e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a */
    private final C2548g f16722a;

    /* renamed from: b */
    private final InterfaceC6760a f16723b;

    /* renamed from: c */
    private final InterfaceC6816j f16724c;

    /* renamed from: d */
    private final InterfaceC6815i f16725d;

    /* renamed from: e */
    private final InterfaceC6424a f16726e;

    /* renamed from: f */
    private final InterfaceC6815i f16727f;

    /* renamed from: g */
    private final boolean f16728g;

    /* renamed from: h */
    private final boolean f16729h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5847a extends AbstractC9614s implements Function0<Map<C11638f, ? extends AbstractC13301g<?>>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5847a() {
            super(0);
            C5846e.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map<C11638f, AbstractC13301g<?>> invoke() {
            Map<C11638f, AbstractC13301g<?>> m6744r;
            Pair pair;
            Collection<InterfaceC6762b> mo2231k = C5846e.this.f16723b.mo2231k();
            C5846e c5846e = C5846e.this;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC6762b interfaceC6762b : mo2231k) {
                C11638f name = interfaceC6762b.getName();
                if (name == null) {
                    name = C14208b0.f36534c;
                }
                AbstractC13301g m24361m = c5846e.m24361m(interfaceC6762b);
                if (m24361m != null) {
                    pair = C11591x.m7577a(name, m24361m);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            m6744r = C11889v.m6744r(arrayList);
            return m6744r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5848b extends AbstractC9614s implements Function0<C11633c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5848b() {
            super(0);
            C5846e.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C11633c invoke() {
            C11632b mo2230n = C5846e.this.f16723b.mo2230n();
            if (mo2230n != null) {
                return mo2230n.m7471b();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5849c extends AbstractC9614s implements Function0<AbstractC7302o0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5849c() {
            super(0);
            C5846e.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AbstractC7302o0 invoke() {
            C11633c mo6030e = C5846e.this.mo6030e();
            if (mo6030e == null) {
                return C8967k.m16945d(EnumC8966j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, C5846e.this.f16723b.toString());
            }
            InterfaceC11914e m7539f = C11601d.m7539f(C11601d.f30130a, mo6030e, C5846e.this.f16722a.m33011d().mo4194n(), null, 4, null);
            if (m7539f == null) {
                InterfaceC6770g mo2233d = C5846e.this.f16723b.mo2233d();
                if (mo2233d != null) {
                    m7539f = C5846e.this.f16722a.m33014a().m33036n().mo33002a(mo2233d);
                } else {
                    m7539f = null;
                }
                if (m7539f == null) {
                    m7539f = C5846e.this.m24365h(mo6030e);
                }
            }
            return m7539f.mo4224p();
        }
    }

    public C5846e(C2548g c, InterfaceC6760a javaAnnotation, boolean z) {
        C9612q.m13917h(c, "c");
        C9612q.m13917h(javaAnnotation, "javaAnnotation");
        this.f16722a = c;
        this.f16723b = javaAnnotation;
        this.f16724c = c.m33010e().mo21865e(new C5848b());
        this.f16725d = c.m33010e().mo21867c(new C5849c());
        this.f16726e = c.m33014a().m33030t().mo2836a(javaAnnotation);
        this.f16727f = c.m33010e().mo21867c(new C5847a());
        this.f16728g = javaAnnotation.mo2232f();
        this.f16729h = javaAnnotation.mo2236G() || z;
    }

    /* renamed from: h */
    public final InterfaceC11914e m24365h(C11633c c11633c) {
        InterfaceC11928h0 m33011d = this.f16722a.m33011d();
        C11632b m7460m = C11632b.m7460m(c11633c);
        C9612q.m13918g(m7460m, "topLevel(fqName)");
        return C11994x.m6650c(m33011d, m7460m, this.f16722a.m33014a().m33048b().m20454d().m24115q());
    }

    /* renamed from: m */
    public final AbstractC13301g<?> m24361m(InterfaceC6762b interfaceC6762b) {
        if (interfaceC6762b instanceof InterfaceC6778o) {
            return C13302h.f34379a.m2818c(((InterfaceC6778o) interfaceC6762b).getValue());
        }
        if (interfaceC6762b instanceof InterfaceC6776m) {
            InterfaceC6776m interfaceC6776m = (InterfaceC6776m) interfaceC6762b;
            return m24358p(interfaceC6776m.mo2183d(), interfaceC6776m.mo2182e());
        } else if (interfaceC6762b instanceof InterfaceC6768e) {
            InterfaceC6768e interfaceC6768e = (InterfaceC6768e) interfaceC6762b;
            C11638f name = interfaceC6768e.getName();
            if (name == null) {
                name = C14208b0.f36534c;
            }
            C9612q.m13918g(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            return m24359o(name, interfaceC6768e.mo2225c());
        } else if (interfaceC6762b instanceof InterfaceC6764c) {
            return m24360n(((InterfaceC6764c) interfaceC6762b).mo2228a());
        } else {
            if (interfaceC6762b instanceof InterfaceC6771h) {
                return m24357q(((InterfaceC6771h) interfaceC6762b).mo2191b());
            }
            return null;
        }
    }

    /* renamed from: n */
    private final AbstractC13301g<?> m24360n(InterfaceC6760a interfaceC6760a) {
        return new C13294a(new C5846e(this.f16722a, interfaceC6760a, false, 4, null));
    }

    /* renamed from: o */
    private final AbstractC13301g<?> m24359o(C11638f c11638f, List<? extends InterfaceC6762b> list) {
        AbstractC7264g0 m9804l;
        int m14093t;
        AbstractC7302o0 type = getType();
        C9612q.m13918g(type, "type");
        if (C7276i0.m21083a(type)) {
            return null;
        }
        InterfaceC11914e m1506i = C13801c.m1506i(this);
        C9612q.m13920e(m1506i);
        InterfaceC11936j1 m41050b = C0158a.m41050b(c11638f, m1506i);
        if (m41050b == null || (m9804l = m41050b.getType()) == null) {
            m9804l = this.f16722a.m33014a().m33037m().mo4194n().m9804l(EnumC7336w1.INVARIANT, C8967k.m16945d(EnumC8966j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        C9612q.m13918g(m9804l, "DescriptorResolverUtils.…GUMENT)\n                )");
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC6762b interfaceC6762b : list) {
            AbstractC13301g<?> m24361m = m24361m(interfaceC6762b);
            if (m24361m == null) {
                m24361m = new C13326s();
            }
            arrayList.add(m24361m);
        }
        return C13302h.f34379a.m2820a(arrayList, m9804l);
    }

    /* renamed from: p */
    private final AbstractC13301g<?> m24358p(C11632b c11632b, C11638f c11638f) {
        if (c11632b == null || c11638f == null) {
            return null;
        }
        return new C13306j(c11632b, c11638f);
    }

    /* renamed from: q */
    private final AbstractC13301g<?> m24357q(InterfaceC6787x interfaceC6787x) {
        return C13320q.f34401b.m2785a(this.f16722a.m33008g().m23194o(interfaceC6787x, C6225b.m23210b(EnumC7317r1.COMMON, false, false, null, 7, null)));
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: a */
    public Map<C11638f, AbstractC13301g<?>> mo6032a() {
        return (Map) C6820m.m21871a(this.f16727f, this, f16721i[2]);
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: e */
    public C11633c mo6030e() {
        return (C11633c) C6820m.m21870b(this.f16724c, this, f16721i[0]);
    }

    @Override // bh.InterfaceC2307g
    /* renamed from: f */
    public boolean mo24367f() {
        return this.f16728g;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: i */
    public InterfaceC6424a mo6029j() {
        return this.f16726e;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: k */
    public AbstractC7302o0 getType() {
        return (AbstractC7302o0) C6820m.m21871a(this.f16725d, this, f16721i[1]);
    }

    /* renamed from: l */
    public final boolean m24362l() {
        return this.f16729h;
    }

    public String toString() {
        return AbstractC12485c.m5188s(AbstractC12485c.f32441g, this, null, 2, null);
    }

    public /* synthetic */ C5846e(C2548g c2548g, InterfaceC6760a interfaceC6760a, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2548g, interfaceC6760a, (i & 4) != 0 ? false : z);
    }
}