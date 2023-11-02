package sh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.collections.C9561x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9637b;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import kotlin.text.C9659r;
import ng.AbstractC10870h;
import ng.C10869g;
import ng.C10884k;
import p142hi.AbstractC7217a0;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.AbstractC7340x1;
import p142hi.C7216a;
import p142hi.C7239f0;
import p142hi.C7276i0;
import p142hi.C7304p;
import p142hi.C7319s0;
import p142hi.C7320s1;
import p142hi.C7335w0;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p183ji.C8964h;
import p183ji.C8965i;
import p183ji.C8967k;
import p234mi.C10472a;
import p287pi.C11644a;
import p305qg.AbstractC11988u;
import p305qg.C11923g1;
import p305qg.C11938k0;
import p305qg.C11973s0;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11911d0;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11931i;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11943k1;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11966p;
import p305qg.InterfaceC11969q0;
import p305qg.InterfaceC11987t0;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11991v0;
import p305qg.InterfaceC11992w;
import p305qg.InterfaceC11993w0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p325rg.EnumC12152e;
import p325rg.InterfaceC12147a;
import p325rg.InterfaceC12149c;
import p389vh.AbstractC13301g;
import p389vh.C13294a;
import p389vh.C13296b;
import p389vh.C13320q;
import p429xh.C13801c;
import pf.C11577n;
import pf.C11581q;
import ph.C11633c;
import ph.C11634d;
import ph.C11638f;
import ph.C11640h;
import sh.AbstractC12485c;
import th.C12758e;

/* renamed from: sh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12500d extends AbstractC12485c implements InterfaceC12513f {

    /* renamed from: l */
    private final C12515g f32458l;

    /* renamed from: m */
    private final Lazy f32459m;

    /* renamed from: sh.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private final class C12501a implements InterfaceC11964o<Unit, StringBuilder> {

        /* renamed from: sh.d$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public /* synthetic */ class C12502a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f32461a;

            static {
                int[] iArr = new int[EnumC12523l.values().length];
                try {
                    iArr[EnumC12523l.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC12523l.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC12523l.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f32461a = iArr;
            }
        }

        public C12501a() {
        }

        /* renamed from: t */
        private final void m5025t(InterfaceC11987t0 interfaceC11987t0, StringBuilder sb2, String str) {
            int i = C12502a.f32461a[C12500d.this.m5071l0().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    m5029p(interfaceC11987t0, sb2);
                    return;
                }
                return;
            }
            C12500d.this.m5118R0(interfaceC11987t0, sb2);
            sb2.append(str + " for ");
            C12500d c12500d = C12500d.this;
            InterfaceC11989u0 mo4535S = interfaceC11987t0.mo4535S();
            C9612q.m13918g(mo4535S, "descriptor.correspondingProperty");
            c12500d.m5168A1(mo4535S, sb2);
        }

        /* renamed from: A */
        public void m5033A(InterfaceC11936j1 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5114S1(descriptor, true, builder, true);
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Unit mo4393a(InterfaceC11991v0 interfaceC11991v0, StringBuilder sb2) {
            m5023v(interfaceC11991v0, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Unit mo5032b(InterfaceC11989u0 interfaceC11989u0, StringBuilder sb2) {
            m5024u(interfaceC11989u0, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Unit mo4392c(InterfaceC11969q0 interfaceC11969q0, StringBuilder sb2) {
            m5026s(interfaceC11969q0, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: d */
        public /* bridge */ /* synthetic */ Unit mo4391d(InterfaceC11936j1 interfaceC11936j1, StringBuilder sb2) {
            m5033A(interfaceC11936j1, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: e */
        public /* bridge */ /* synthetic */ Unit mo4390e(InterfaceC11993w0 interfaceC11993w0, StringBuilder sb2) {
            m5022w(interfaceC11993w0, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Unit mo4389f(InterfaceC11944l interfaceC11944l, StringBuilder sb2) {
            m5030o(interfaceC11944l, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: g */
        public /* bridge */ /* synthetic */ Unit mo4388g(InterfaceC11945l0 interfaceC11945l0, StringBuilder sb2) {
            m5027r(interfaceC11945l0, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Unit mo4387h(InterfaceC11998y interfaceC11998y, StringBuilder sb2) {
            m5029p(interfaceC11998y, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: i */
        public /* bridge */ /* synthetic */ Unit mo4386i(InterfaceC11914e interfaceC11914e, StringBuilder sb2) {
            m5031n(interfaceC11914e, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: j */
        public /* bridge */ /* synthetic */ Unit mo4385j(InterfaceC11920f1 interfaceC11920f1, StringBuilder sb2) {
            m5019z(interfaceC11920f1, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: k */
        public /* bridge */ /* synthetic */ Unit mo4384k(InterfaceC11928h0 interfaceC11928h0, StringBuilder sb2) {
            m5028q(interfaceC11928h0, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: l */
        public /* bridge */ /* synthetic */ Unit mo4383l(InterfaceC11917e1 interfaceC11917e1, StringBuilder sb2) {
            m5020y(interfaceC11917e1, sb2);
            return Unit.f25302a;
        }

        @Override // p305qg.InterfaceC11964o
        /* renamed from: m */
        public /* bridge */ /* synthetic */ Unit mo4382m(InterfaceC11997x0 interfaceC11997x0, StringBuilder sb2) {
            m5021x(interfaceC11997x0, sb2);
            return Unit.f25302a;
        }

        /* renamed from: n */
        public void m5031n(InterfaceC11914e descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5100X0(descriptor, builder);
        }

        /* renamed from: o */
        public void m5030o(InterfaceC11944l constructorDescriptor, StringBuilder builder) {
            C9612q.m13917h(constructorDescriptor, "constructorDescriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5088c1(constructorDescriptor, builder);
        }

        /* renamed from: p */
        public void m5029p(InterfaceC11998y descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5076i1(descriptor, builder);
        }

        /* renamed from: q */
        public void m5028q(InterfaceC11928h0 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5054s1(descriptor, builder, true);
        }

        /* renamed from: r */
        public void m5027r(InterfaceC11945l0 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5042w1(descriptor, builder);
        }

        /* renamed from: s */
        public void m5026s(InterfaceC11969q0 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5037y1(descriptor, builder);
        }

        /* renamed from: u */
        public void m5024u(InterfaceC11989u0 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5168A1(descriptor, builder);
        }

        /* renamed from: v */
        public void m5023v(InterfaceC11991v0 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            m5025t(descriptor, builder, "getter");
        }

        /* renamed from: w */
        public void m5022w(InterfaceC11993w0 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            m5025t(descriptor, builder, "setter");
        }

        /* renamed from: x */
        public void m5021x(InterfaceC11997x0 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            builder.append(descriptor.getName());
        }

        /* renamed from: y */
        public void m5020y(InterfaceC11917e1 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5144I1(descriptor, builder);
        }

        /* renamed from: z */
        public void m5019z(InterfaceC11920f1 descriptor, StringBuilder builder) {
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(builder, "builder");
            C12500d.this.m5129N1(descriptor, builder, true);
        }
    }

    /* renamed from: sh.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C12503b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32462a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f32463b;

        static {
            int[] iArr = new int[EnumC12524m.values().length];
            try {
                iArr[EnumC12524m.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12524m.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32462a = iArr;
            int[] iArr2 = new int[EnumC12522k.values().length];
            try {
                iArr2[EnumC12522k.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC12522k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC12522k.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f32463b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sh.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12504c extends AbstractC9614s implements Function1<InterfaceC7288k1, CharSequence> {
        C12504c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC7288k1 it) {
            C9612q.m13917h(it, "it");
            if (it.mo20955a()) {
                return "*";
            }
            C12500d c12500d = C12500d.this;
            AbstractC7264g0 type = it.getType();
            C9612q.m13918g(type, "it.type");
            String mo5044w = c12500d.mo5044w(type);
            if (it.mo20954b() == EnumC7336w1.INVARIANT) {
                return mo5044w;
            }
            return it.mo20954b() + ' ' + mo5044w;
        }
    }

    /* renamed from: sh.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C12505d extends AbstractC9614s implements Function0<C12500d> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sh.d$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C12506a extends AbstractC9614s implements Function1<InterfaceC12513f, Unit> {

            /* renamed from: j */
            public static final C12506a f32466j = new C12506a();

            C12506a() {
                super(1);
            }

            /* renamed from: a */
            public final void m5016a(InterfaceC12513f withOptions) {
                List m14101l;
                Set<C11633c> m13999l;
                C9612q.m13917h(withOptions, "$this$withOptions");
                Set<C11633c> mo4968h = withOptions.mo4968h();
                m14101l = C9545j.m14101l(C10884k.C10885a.f28438C, C10884k.C10885a.f28440D);
                m13999l = C9561x.m13999l(mo4968h, m14101l);
                withOptions.mo4962k(m13999l);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC12513f interfaceC12513f) {
                m5016a(interfaceC12513f);
                return Unit.f25302a;
            }
        }

        C12505d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C12500d invoke() {
            AbstractC12485c m5187y = C12500d.this.m5187y(C12506a.f32466j);
            C9612q.m13919f(m5187y, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            return (C12500d) m5187y;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sh.d$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12507e extends AbstractC9614s implements Function1<AbstractC13301g<?>, CharSequence> {
        C12507e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(AbstractC13301g<?> it) {
            C9612q.m13917h(it, "it");
            return C12500d.this.m5090b1(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sh.d$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12508f extends AbstractC9614s implements Function1<InterfaceC11936j1, CharSequence> {

        /* renamed from: j */
        public static final C12508f f32468j = new C12508f();

        C12508f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC11936j1 interfaceC11936j1) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sh.d$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12509g extends AbstractC9614s implements Function1<AbstractC7264g0, CharSequence> {
        C12509g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(AbstractC7264g0 it) {
            C12500d c12500d = C12500d.this;
            C9612q.m13918g(it, "it");
            return c12500d.mo5044w(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sh.d$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12510h extends AbstractC9614s implements Function1<AbstractC7264g0, Object> {

        /* renamed from: j */
        public static final C12510h f32470j = new C12510h();

        C12510h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(AbstractC7264g0 it) {
            C9612q.m13917h(it, "it");
            if (it instanceof C7335w0) {
                return ((C7335w0) it).m21187W0();
            }
            return it;
        }
    }

    public C12500d(C12515g options) {
        Lazy m7601a;
        C9612q.m13917h(options, "options");
        this.f32458l = options;
        options.m4961k0();
        m7601a = C11577n.m7601a(new C12505d());
        this.f32459m = m7601a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public final void m5168A1(InterfaceC11989u0 interfaceC11989u0, StringBuilder sb2) {
        boolean z;
        if (!m5038y0()) {
            if (!m5040x0()) {
                m5165B1(interfaceC11989u0, sb2);
                List<InterfaceC11997x0> mo4295x0 = interfaceC11989u0.mo4295x0();
                C9612q.m13918g(mo4295x0, "property.contextReceiverParameters");
                m5086d1(mo4295x0, sb2);
                AbstractC11988u visibility = interfaceC11989u0.getVisibility();
                C9612q.m13918g(visibility, "property.visibility");
                m5105V1(visibility, sb2);
                boolean z2 = false;
                if (m5085e0().contains(EnumC12511e.CONST) && interfaceC11989u0.mo4516Z()) {
                    z = true;
                } else {
                    z = false;
                }
                m5056r1(sb2, z, "const");
                m5066n1(interfaceC11989u0, sb2);
                m5059q1(interfaceC11989u0, sb2);
                m5045v1(interfaceC11989u0, sb2);
                if (m5085e0().contains(EnumC12511e.LATEINIT) && interfaceC11989u0.mo4504y0()) {
                    z2 = true;
                }
                m5056r1(sb2, z2, "lateinit");
                m5068m1(interfaceC11989u0, sb2);
            }
            m5117R1(this, interfaceC11989u0, sb2, false, 4, null);
            List<InterfaceC11920f1> typeParameters = interfaceC11989u0.getTypeParameters();
            C9612q.m13918g(typeParameters, "property.typeParameters");
            m5123P1(typeParameters, sb2, true);
            m5162C1(interfaceC11989u0, sb2);
        }
        m5054s1(interfaceC11989u0, sb2, true);
        sb2.append(": ");
        AbstractC7264g0 type = interfaceC11989u0.getType();
        C9612q.m13918g(type, "property.type");
        sb2.append(mo5044w(type));
        m5159D1(interfaceC11989u0, sb2);
        m5072k1(interfaceC11989u0, sb2);
        List<InterfaceC11920f1> typeParameters2 = interfaceC11989u0.getTypeParameters();
        C9612q.m13918g(typeParameters2, "property.typeParameters");
        m5102W1(typeParameters2, sb2);
    }

    /* renamed from: B1 */
    private final void m5165B1(InterfaceC11989u0 interfaceC11989u0, StringBuilder sb2) {
        Object m14033q0;
        if (!m5085e0().contains(EnumC12511e.ANNOTATIONS)) {
            return;
        }
        m5106V0(this, sb2, interfaceC11989u0, null, 2, null);
        InterfaceC11992w mo4505w0 = interfaceC11989u0.mo4505w0();
        if (mo4505w0 != null) {
            m5109U0(sb2, mo4505w0, EnumC12152e.FIELD);
        }
        InterfaceC11992w mo4529N = interfaceC11989u0.mo4529N();
        if (mo4529N != null) {
            m5109U0(sb2, mo4529N, EnumC12152e.PROPERTY_DELEGATE_FIELD);
        }
        if (m5071l0() == EnumC12523l.NONE) {
            InterfaceC11991v0 mo4509f = interfaceC11989u0.mo4509f();
            if (mo4509f != null) {
                m5109U0(sb2, mo4509f, EnumC12152e.PROPERTY_GETTER);
            }
            InterfaceC11993w0 mo4507h = interfaceC11989u0.mo4507h();
            if (mo4507h != null) {
                m5109U0(sb2, mo4507h, EnumC12152e.PROPERTY_SETTER);
                List<InterfaceC11936j1> mo4301i = mo4507h.mo4301i();
                C9612q.m13918g(mo4301i, "setter.valueParameters");
                m14033q0 = C9553r.m14033q0(mo4301i);
                InterfaceC11936j1 it = (InterfaceC11936j1) m14033q0;
                C9612q.m13918g(it, "it");
                m5109U0(sb2, it, EnumC12152e.SETTER_PARAMETER);
            }
        }
    }

    /* renamed from: C1 */
    private final void m5162C1(InterfaceC11897a interfaceC11897a, StringBuilder sb2) {
        InterfaceC11997x0 mo4329M = interfaceC11897a.mo4329M();
        if (mo4329M != null) {
            m5109U0(sb2, mo4329M, EnumC12152e.RECEIVER);
            AbstractC7264g0 type = mo4329M.getType();
            C9612q.m13918g(type, "receiver.type");
            sb2.append(m5080g1(type));
            sb2.append(".");
        }
    }

    /* renamed from: D1 */
    private final void m5159D1(InterfaceC11897a interfaceC11897a, StringBuilder sb2) {
        InterfaceC11997x0 mo4329M;
        if (m5069m0() && (mo4329M = interfaceC11897a.mo4329M()) != null) {
            sb2.append(" on ");
            AbstractC7264g0 type = mo4329M.getType();
            C9612q.m13918g(type, "receiver.type");
            sb2.append(mo5044w(type));
        }
    }

    /* renamed from: E1 */
    private final void m5156E1(StringBuilder sb2, AbstractC7302o0 abstractC7302o0) {
        if (!C9612q.m13922c(abstractC7302o0, C7320s1.f19757b) && !C7320s1.m20984k(abstractC7302o0)) {
            if (C8967k.m16934o(abstractC7302o0)) {
                if (m5166B0()) {
                    InterfaceC7265g1 mo3564N0 = abstractC7302o0.mo3564N0();
                    C9612q.m13919f(mo3564N0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                    sb2.append(m5082f1(((C8965i) mo3564N0).m16952d(0)));
                    return;
                }
                sb2.append("???");
                return;
            } else if (C7276i0.m21083a(abstractC7302o0)) {
                m5084e1(sb2, abstractC7302o0);
                return;
            } else if (m5099X1(abstractC7302o0)) {
                m5074j1(sb2, abstractC7302o0);
                return;
            } else {
                m5084e1(sb2, abstractC7302o0);
                return;
            }
        }
        sb2.append("???");
    }

    /* renamed from: F1 */
    private final void m5153F1(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    /* renamed from: G1 */
    private final void m5150G1(InterfaceC11914e interfaceC11914e, StringBuilder sb2) {
        if (m5145I0() || AbstractC10870h.m9801m0(interfaceC11914e.mo4224p())) {
            return;
        }
        Collection<AbstractC7264g0> mo2791m = interfaceC11914e.mo4173k().mo2791m();
        C9612q.m13918g(mo2791m, "klass.typeConstructor.supertypes");
        if (!mo2791m.isEmpty()) {
            if (mo2791m.size() != 1 || !AbstractC10870h.m9822b0(mo2791m.iterator().next())) {
                m5153F1(sb2);
                sb2.append(": ");
                C9553r.m14048b0(mo2791m, sb2, ", ", null, null, 0, null, new C12509g(), 60, null);
            }
        }
    }

    /* renamed from: H1 */
    private final void m5147H1(InterfaceC11998y interfaceC11998y, StringBuilder sb2) {
        m5056r1(sb2, interfaceC11998y.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public final void m5144I1(InterfaceC11917e1 interfaceC11917e1, StringBuilder sb2) {
        m5106V0(this, sb2, interfaceC11917e1, null, 2, null);
        AbstractC11988u visibility = interfaceC11917e1.getVisibility();
        C9612q.m13918g(visibility, "typeAlias.visibility");
        m5105V1(visibility, sb2);
        m5066n1(interfaceC11917e1, sb2);
        sb2.append(m5070l1("typealias"));
        sb2.append(" ");
        m5054s1(interfaceC11917e1, sb2, true);
        List<InterfaceC11920f1> mo4168q = interfaceC11917e1.mo4168q();
        C9612q.m13918g(mo4168q, "typeAlias.declaredTypeParameters");
        m5123P1(mo4168q, sb2, false);
        m5103W0(interfaceC11917e1, sb2);
        sb2.append(" = ");
        sb2.append(mo5044w(interfaceC11917e1.mo6719t0()));
    }

    /* renamed from: K0 */
    private final String m5139K0() {
        return m5128O(">");
    }

    /* renamed from: L */
    private final void m5137L(StringBuilder sb2, InterfaceC11947m interfaceC11947m) {
        InterfaceC11947m mo4163b;
        String mo5050u;
        String name;
        if (!(interfaceC11947m instanceof InterfaceC11945l0) && !(interfaceC11947m instanceof InterfaceC11969q0) && (mo4163b = interfaceC11947m.mo4163b()) != null && !(mo4163b instanceof InterfaceC11928h0)) {
            sb2.append(" ");
            sb2.append(m5064o1("defined in"));
            sb2.append(" ");
            C11634d m4099m = C12758e.m4099m(mo4163b);
            C9612q.m13918g(m4099m, "getFqName(containingDeclaration)");
            if (m4099m.m7444e()) {
                mo5050u = "root package";
            } else {
                mo5050u = mo5050u(m4099m);
            }
            sb2.append(mo5050u);
            if (m5151G0() && (mo4163b instanceof InterfaceC11945l0) && (interfaceC11947m instanceof InterfaceC11966p) && (name = ((InterfaceC11966p) interfaceC11947m).mo4160j().mo2835b().getName()) != null) {
                sb2.append(" ");
                sb2.append(m5064o1("in file"));
                sb2.append(" ");
                sb2.append(name);
            }
        }
    }

    /* renamed from: L0 */
    private final boolean m5136L0(AbstractC7264g0 abstractC7264g0) {
        return C10869g.m9858q(abstractC7264g0) || !abstractC7264g0.getAnnotations().isEmpty();
    }

    /* renamed from: L1 */
    private final void m5135L1(StringBuilder sb2, AbstractC7264g0 abstractC7264g0, InterfaceC7265g1 interfaceC7265g1) {
        C11973s0 m6715a = C11923g1.m6715a(abstractC7264g0);
        if (m6715a == null) {
            sb2.append(m5138K1(interfaceC7265g1));
            sb2.append(m5141J1(abstractC7264g0.mo3566L0()));
            return;
        }
        m5034z1(sb2, m6715a);
    }

    /* renamed from: M */
    private final void m5134M(StringBuilder sb2, List<? extends InterfaceC7288k1> list) {
        C9553r.m14048b0(list, sb2, ", ", null, null, 0, null, new C12504c(), 60, null);
    }

    /* renamed from: M0 */
    private final EnumC11915e0 m5133M0(InterfaceC11911d0 interfaceC11911d0) {
        InterfaceC11914e interfaceC11914e;
        if (interfaceC11911d0 instanceof InterfaceC11914e) {
            if (((InterfaceC11914e) interfaceC11911d0).mo4175g() == EnumC11918f.INTERFACE) {
                return EnumC11915e0.ABSTRACT;
            }
            return EnumC11915e0.FINAL;
        }
        InterfaceC11947m mo4163b = interfaceC11911d0.mo4163b();
        if (mo4163b instanceof InterfaceC11914e) {
            interfaceC11914e = (InterfaceC11914e) mo4163b;
        } else {
            interfaceC11914e = null;
        }
        if (interfaceC11914e == null) {
            return EnumC11915e0.FINAL;
        }
        if (!(interfaceC11911d0 instanceof InterfaceC11902b)) {
            return EnumC11915e0.FINAL;
        }
        InterfaceC11902b interfaceC11902b = (InterfaceC11902b) interfaceC11911d0;
        Collection<? extends InterfaceC11902b> mo4310d = interfaceC11902b.mo4310d();
        C9612q.m13918g(mo4310d, "this.overriddenDescriptors");
        if ((!mo4310d.isEmpty()) && interfaceC11914e.mo4167r() != EnumC11915e0.FINAL) {
            return EnumC11915e0.OPEN;
        }
        if (interfaceC11914e.mo4175g() == EnumC11918f.INTERFACE && !C9612q.m13922c(interfaceC11902b.getVisibility(), C11974t.f30966a)) {
            EnumC11915e0 mo4167r = interfaceC11902b.mo4167r();
            EnumC11915e0 enumC11915e0 = EnumC11915e0.ABSTRACT;
            if (mo4167r != enumC11915e0) {
                return EnumC11915e0.OPEN;
            }
            return enumC11915e0;
        }
        return EnumC11915e0.FINAL;
    }

    /* renamed from: M1 */
    static /* synthetic */ void m5132M1(C12500d c12500d, StringBuilder sb2, AbstractC7264g0 abstractC7264g0, InterfaceC7265g1 interfaceC7265g1, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC7265g1 = abstractC7264g0.mo3564N0();
        }
        c12500d.m5135L1(sb2, abstractC7264g0, interfaceC7265g1);
    }

    /* renamed from: N */
    private final String m5131N() {
        int i = C12503b.f32462a[m5035z0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "&rarr;";
            }
            throw new C11581q();
        }
        return m5128O("->");
    }

    /* renamed from: N0 */
    private final boolean m5130N0(InterfaceC12149c interfaceC12149c) {
        return C9612q.m13922c(interfaceC12149c.mo6030e(), C10884k.C10885a.f28442E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m5129N1(InterfaceC11920f1 interfaceC11920f1, StringBuilder sb2, boolean z) {
        boolean z2;
        if (z) {
            sb2.append(m5127O0());
        }
        if (m5157E0()) {
            sb2.append("/*");
            sb2.append(interfaceC11920f1.getIndex());
            sb2.append("*/ ");
        }
        m5056r1(sb2, interfaceC11920f1.mo4463x(), "reified");
        String m20934c = interfaceC11920f1.mo4464m().m20934c();
        boolean z3 = true;
        if (m20934c.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        m5056r1(sb2, z2, m20934c);
        m5106V0(this, sb2, interfaceC11920f1, null, 2, null);
        m5054s1(interfaceC11920f1, sb2, z);
        int size = interfaceC11920f1.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC7264g0 upperBound = interfaceC11920f1.getUpperBounds().iterator().next();
            if (!AbstractC10870h.m9809i0(upperBound)) {
                sb2.append(" : ");
                C9612q.m13918g(upperBound, "upperBound");
                sb2.append(mo5044w(upperBound));
            }
        } else if (z) {
            for (AbstractC7264g0 upperBound2 : interfaceC11920f1.getUpperBounds()) {
                if (!AbstractC10870h.m9809i0(upperBound2)) {
                    if (z3) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    C9612q.m13918g(upperBound2, "upperBound");
                    sb2.append(mo5044w(upperBound2));
                    z3 = false;
                }
            }
        }
        if (z) {
            sb2.append(m5139K0());
        }
    }

    /* renamed from: O */
    private final String m5128O(String str) {
        return m5035z0().mo4936b(str);
    }

    /* renamed from: O0 */
    private final String m5127O0() {
        return m5128O("<");
    }

    /* renamed from: O1 */
    private final void m5126O1(StringBuilder sb2, List<? extends InterfaceC11920f1> list) {
        Iterator<? extends InterfaceC11920f1> it = list.iterator();
        while (it.hasNext()) {
            m5129N1(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    /* renamed from: P0 */
    private final boolean m5124P0(InterfaceC11902b interfaceC11902b) {
        return !interfaceC11902b.mo4310d().isEmpty();
    }

    /* renamed from: P1 */
    private final void m5123P1(List<? extends InterfaceC11920f1> list, StringBuilder sb2, boolean z) {
        if (!m5142J0() && (!list.isEmpty())) {
            sb2.append(m5127O0());
            m5126O1(sb2, list);
            sb2.append(m5139K0());
            if (z) {
                sb2.append(" ");
            }
        }
    }

    /* renamed from: Q0 */
    private final void m5121Q0(StringBuilder sb2, C7216a c7216a) {
        EnumC12524m m5035z0 = m5035z0();
        EnumC12524m enumC12524m = EnumC12524m.HTML;
        if (m5035z0 == enumC12524m) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        m5048u1(sb2, c7216a.m21223F());
        sb2.append(" */");
        if (m5035z0() == enumC12524m) {
            sb2.append("</i></font>");
        }
    }

    /* renamed from: Q1 */
    private final void m5120Q1(InterfaceC11943k1 interfaceC11943k1, StringBuilder sb2, boolean z) {
        String str;
        if (z || !(interfaceC11943k1 instanceof InterfaceC11936j1)) {
            if (interfaceC11943k1.mo4342L()) {
                str = "var";
            } else {
                str = "val";
            }
            sb2.append(m5070l1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public final void m5118R0(InterfaceC11987t0 interfaceC11987t0, StringBuilder sb2) {
        m5066n1(interfaceC11987t0, sb2);
    }

    /* renamed from: R1 */
    static /* synthetic */ void m5117R1(C12500d c12500d, InterfaceC11943k1 interfaceC11943k1, StringBuilder sb2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c12500d.m5120Q1(interfaceC11943k1, sb2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m5115S0(p305qg.InterfaceC11998y r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.isOperator()
            java.lang.String r1 = "functionDescriptor.overriddenDescriptors"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3a
            java.util.Collection r0 = r6.mo4310d()
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L19
        L17:
            r0 = r3
            goto L30
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L17
            java.lang.Object r4 = r0.next()
            qg.y r4 = (p305qg.InterfaceC11998y) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L1d
            r0 = r2
        L30:
            if (r0 != 0) goto L38
            boolean r0 = r5.m5122Q()
            if (r0 == 0) goto L3a
        L38:
            r0 = r3
            goto L3b
        L3a:
            r0 = r2
        L3b:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L70
            java.util.Collection r4 = r6.mo4310d()
            kotlin.jvm.internal.C9612q.m13918g(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L50
        L4e:
            r1 = r3
            goto L67
        L50:
            java.util.Iterator r1 = r4.iterator()
        L54:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r1.next()
            qg.y r4 = (p305qg.InterfaceC11998y) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L54
            r1 = r2
        L67:
            if (r1 != 0) goto L6f
            boolean r1 = r5.m5122Q()
            if (r1 == 0) goto L70
        L6f:
            r2 = r3
        L70:
            boolean r1 = r6.mo4338B()
            java.lang.String r3 = "tailrec"
            r5.m5056r1(r7, r1, r3)
            r5.m5147H1(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r1 = "inline"
            r5.m5056r1(r7, r6, r1)
            java.lang.String r6 = "infix"
            r5.m5056r1(r7, r2, r6)
            java.lang.String r6 = "operator"
            r5.m5056r1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.C12500d.m5115S0(qg.y, java.lang.StringBuilder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r11 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: S1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5114S1(p305qg.InterfaceC11936j1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L10
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.m5070l1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L10:
            boolean r0 = r9.m5157E0()
            if (r0 == 0) goto L27
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r12.append(r0)
        L27:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            m5106V0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.mo4374q0()
            java.lang.String r1 = "crossinline"
            r9.m5056r1(r12, r0, r1)
            boolean r0 = r10.mo4375o0()
            java.lang.String r1 = "noinline"
            r9.m5056r1(r12, r0, r1)
            boolean r0 = r9.m5052t0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L65
            qg.a r0 = r10.mo4163b()
            boolean r3 = r0 instanceof p305qg.InterfaceC11910d
            if (r3 == 0) goto L55
            qg.d r0 = (p305qg.InterfaceC11910d) r0
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L60
            boolean r0 = r0.mo4419a0()
            if (r0 != r1) goto L60
            r0 = r1
            goto L61
        L60:
            r0 = r2
        L61:
            if (r0 == 0) goto L65
            r8 = r1
            goto L66
        L65:
            r8 = r2
        L66:
            if (r8 == 0) goto L71
            boolean r0 = r9.m5125P()
            java.lang.String r3 = "actual"
            r9.m5056r1(r12, r0, r3)
        L71:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.m5108U1(r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function1 r11 = r9.m5107V()
            if (r11 == 0) goto L91
            boolean r11 = r9.mo4966i()
            if (r11 == 0) goto L8a
            boolean r11 = r10.mo4379A0()
            goto L8e
        L8a:
            boolean r11 = p429xh.C13801c.m1512c(r10)
        L8e:
            if (r11 == 0) goto L91
            goto L92
        L91:
            r1 = r2
        L92:
            if (r1 == 0) goto Lb5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            kotlin.jvm.functions.Function1 r13 = r9.m5107V()
            kotlin.jvm.internal.C9612q.m13920e(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.C12500d.m5114S1(qg.j1, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* renamed from: T0 */
    private final List<String> m5112T0(InterfaceC12149c interfaceC12149c) {
        InterfaceC11914e interfaceC11914e;
        int m14093t;
        int m14093t2;
        List m14036n0;
        List<String> m14029u0;
        String str;
        InterfaceC11910d mo4187C;
        List<InterfaceC11936j1> mo4301i;
        int m14093t3;
        Map<C11638f, AbstractC13301g<?>> mo6032a = interfaceC12149c.mo6032a();
        List list = null;
        if (m5060q0()) {
            interfaceC11914e = C13801c.m1506i(interfaceC12149c);
        } else {
            interfaceC11914e = null;
        }
        if (interfaceC11914e != null && (mo4187C = interfaceC11914e.mo4187C()) != null && (mo4301i = mo4187C.mo4301i()) != null) {
            ArrayList<InterfaceC11936j1> arrayList = new ArrayList();
            for (Object obj : mo4301i) {
                if (((InterfaceC11936j1) obj).mo4379A0()) {
                    arrayList.add(obj);
                }
            }
            m14093t3 = C9546k.m14093t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m14093t3);
            for (InterfaceC11936j1 interfaceC11936j1 : arrayList) {
                arrayList2.add(interfaceC11936j1.getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = C9545j.m14104i();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            C11638f it = (C11638f) obj2;
            C9612q.m13918g(it, "it");
            if (!mo6032a.containsKey(it)) {
                arrayList3.add(obj2);
            }
        }
        m14093t = C9546k.m14093t(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(m14093t);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C11638f) it2.next()).m7426b() + " = ...");
        }
        Set<Map.Entry<C11638f, AbstractC13301g<?>>> entrySet = mo6032a.entrySet();
        m14093t2 = C9546k.m14093t(entrySet, 10);
        ArrayList arrayList5 = new ArrayList(m14093t2);
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C11638f c11638f = (C11638f) entry.getKey();
            AbstractC13301g<?> abstractC13301g = (AbstractC13301g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c11638f.m7426b());
            sb2.append(" = ");
            if (!list.contains(c11638f)) {
                str = m5090b1(abstractC13301g);
            } else {
                str = "...";
            }
            sb2.append(str);
            arrayList5.add(sb2.toString());
        }
        m14036n0 = C9553r.m14036n0(arrayList4, arrayList5);
        m14029u0 = C9553r.m14029u0(m14036n0);
        return m14029u0;
    }

    /* renamed from: T1 */
    private final void m5111T1(Collection<? extends InterfaceC11936j1> collection, boolean z, StringBuilder sb2) {
        boolean m5096Y1 = m5096Y1(z);
        int size = collection.size();
        m5160D0().mo5173b(size, sb2);
        int i = 0;
        for (InterfaceC11936j1 interfaceC11936j1 : collection) {
            m5160D0().mo5172c(interfaceC11936j1, i, size, sb2);
            m5114S1(interfaceC11936j1, m5096Y1, sb2, false);
            m5160D0().mo5174a(interfaceC11936j1, i, size, sb2);
            i++;
        }
        m5160D0().mo5171d(size, sb2);
    }

    /* renamed from: U0 */
    private final void m5109U0(StringBuilder sb2, InterfaceC12147a interfaceC12147a, EnumC12152e enumC12152e) {
        Set<C11633c> m5101X;
        boolean m14064L;
        if (!m5085e0().contains(EnumC12511e.ANNOTATIONS)) {
            return;
        }
        if (interfaceC12147a instanceof AbstractC7264g0) {
            m5101X = mo4968h();
        } else {
            m5101X = m5101X();
        }
        Function1<InterfaceC12149c, Boolean> m5119R = m5119R();
        for (InterfaceC12149c interfaceC12149c : interfaceC12147a.getAnnotations()) {
            m14064L = C9553r.m14064L(m5101X, interfaceC12149c.mo6030e());
            if (!m14064L && !m5130N0(interfaceC12149c) && (m5119R == null || m5119R.invoke(interfaceC12149c).booleanValue())) {
                sb2.append(mo5058r(interfaceC12149c, enumC12152e));
                if (m5104W()) {
                    sb2.append('\n');
                    C9612q.m13918g(sb2, "append('\\n')");
                } else {
                    sb2.append(" ");
                }
            }
        }
    }

    /* renamed from: U1 */
    private final void m5108U1(InterfaceC11943k1 interfaceC11943k1, boolean z, StringBuilder sb2, boolean z2, boolean z3) {
        InterfaceC11936j1 interfaceC11936j1;
        AbstractC7264g0 abstractC7264g0;
        boolean z4;
        AbstractC7264g0 type = interfaceC11943k1.getType();
        C9612q.m13918g(type, "variable.type");
        AbstractC7264g0 abstractC7264g02 = null;
        if (interfaceC11943k1 instanceof InterfaceC11936j1) {
            interfaceC11936j1 = (InterfaceC11936j1) interfaceC11943k1;
        } else {
            interfaceC11936j1 = null;
        }
        if (interfaceC11936j1 != null) {
            abstractC7264g02 = interfaceC11936j1.mo4373v0();
        }
        if (abstractC7264g02 == null) {
            abstractC7264g0 = type;
        } else {
            abstractC7264g0 = abstractC7264g02;
        }
        if (abstractC7264g02 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        m5056r1(sb2, z4, "vararg");
        if (z3 || (z2 && !m5038y0())) {
            m5120Q1(interfaceC11943k1, sb2, z3);
        }
        if (z) {
            m5054s1(interfaceC11943k1, sb2, z2);
            sb2.append(": ");
        }
        sb2.append(mo5044w(abstractC7264g0));
        m5072k1(interfaceC11943k1, sb2);
        if (m5157E0() && abstractC7264g02 != null) {
            sb2.append(" /*");
            sb2.append(mo5044w(type));
            sb2.append("*/");
        }
    }

    /* renamed from: V0 */
    static /* synthetic */ void m5106V0(C12500d c12500d, StringBuilder sb2, InterfaceC12147a interfaceC12147a, EnumC12152e enumC12152e, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC12152e = null;
        }
        c12500d.m5109U0(sb2, interfaceC12147a, enumC12152e);
    }

    /* renamed from: V1 */
    private final boolean m5105V1(AbstractC11988u abstractC11988u, StringBuilder sb2) {
        if (!m5085e0().contains(EnumC12511e.VISIBILITY)) {
            return false;
        }
        if (m5083f0()) {
            abstractC11988u = abstractC11988u.mo6653f();
        }
        if (!m5055s0() && C9612q.m13922c(abstractC11988u, C11974t.f30977l)) {
            return false;
        }
        sb2.append(m5070l1(abstractC11988u.mo6655c()));
        sb2.append(" ");
        return true;
    }

    /* renamed from: W0 */
    private final void m5103W0(InterfaceC11931i interfaceC11931i, StringBuilder sb2) {
        List<InterfaceC11920f1> mo4168q = interfaceC11931i.mo4168q();
        C9612q.m13918g(mo4168q, "classifier.declaredTypeParameters");
        List<InterfaceC11920f1> parameters = interfaceC11931i.mo4173k().getParameters();
        C9612q.m13918g(parameters, "classifier.typeConstructor.parameters");
        if (m5157E0() && interfaceC11931i.mo4164z() && parameters.size() > mo4168q.size()) {
            sb2.append(" /*captured type parameters: ");
            m5126O1(sb2, parameters.subList(mo4168q.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* renamed from: W1 */
    private final void m5102W1(List<? extends InterfaceC11920f1> list, StringBuilder sb2) {
        List<AbstractC7264g0> m14062N;
        if (m5142J0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC11920f1 interfaceC11920f1 : list) {
            List<AbstractC7264g0> upperBounds = interfaceC11920f1.getUpperBounds();
            C9612q.m13918g(upperBounds, "typeParameter.upperBounds");
            m14062N = C9553r.m14062N(upperBounds, 1);
            for (AbstractC7264g0 it : m14062N) {
                StringBuilder sb3 = new StringBuilder();
                C11638f name = interfaceC11920f1.getName();
                C9612q.m13918g(name, "typeParameter.name");
                sb3.append(mo5047v(name, false));
                sb3.append(" : ");
                C9612q.m13918g(it, "it");
                sb3.append(mo5044w(it));
                arrayList.add(sb3.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb2.append(" ");
            sb2.append(m5070l1("where"));
            sb2.append(" ");
            C9553r.m14048b0(arrayList, sb2, ", ", null, null, 0, null, null, 124, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public final void m5100X0(InterfaceC11914e interfaceC11914e, StringBuilder sb2) {
        boolean z;
        InterfaceC11910d mo4187C;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (interfaceC11914e.mo4175g() == EnumC11918f.ENUM_ENTRY) {
            z = true;
        } else {
            z = false;
        }
        if (!m5038y0()) {
            m5106V0(this, sb2, interfaceC11914e, null, 2, null);
            List<InterfaceC11997x0> mo4226V = interfaceC11914e.mo4226V();
            C9612q.m13918g(mo4226V, "klass.contextReceivers");
            m5086d1(mo4226V, sb2);
            if (!z) {
                AbstractC11988u visibility = interfaceC11914e.getVisibility();
                C9612q.m13918g(visibility, "klass.visibility");
                m5105V1(visibility, sb2);
            }
            if ((interfaceC11914e.mo4175g() != EnumC11918f.INTERFACE || interfaceC11914e.mo4167r() != EnumC11915e0.ABSTRACT) && (!interfaceC11914e.mo4175g().m6717b() || interfaceC11914e.mo4167r() != EnumC11915e0.FINAL)) {
                EnumC11915e0 mo4167r = interfaceC11914e.mo4167r();
                C9612q.m13918g(mo4167r, "klass.modality");
                m5062p1(mo4167r, sb2, m5133M0(interfaceC11914e));
            }
            m5066n1(interfaceC11914e, sb2);
            if (m5085e0().contains(EnumC12511e.INNER) && interfaceC11914e.mo4164z()) {
                z2 = true;
            } else {
                z2 = false;
            }
            m5056r1(sb2, z2, "inner");
            if (m5085e0().contains(EnumC12511e.DATA) && interfaceC11914e.mo4185I0()) {
                z3 = true;
            } else {
                z3 = false;
            }
            m5056r1(sb2, z3, "data");
            if (m5085e0().contains(EnumC12511e.INLINE) && interfaceC11914e.isInline()) {
                z4 = true;
            } else {
                z4 = false;
            }
            m5056r1(sb2, z4, "inline");
            if (m5085e0().contains(EnumC12511e.VALUE) && interfaceC11914e.mo4174j0()) {
                z5 = true;
            } else {
                z5 = false;
            }
            m5056r1(sb2, z5, "value");
            if (m5085e0().contains(EnumC12511e.FUN) && interfaceC11914e.mo4176c0()) {
                z6 = true;
            } else {
                z6 = false;
            }
            m5056r1(sb2, z6, "fun");
            m5097Y0(interfaceC11914e, sb2);
        }
        if (!C12758e.m4088x(interfaceC11914e)) {
            if (!m5038y0()) {
                m5153F1(sb2);
            }
            m5054s1(interfaceC11914e, sb2, true);
        } else {
            m5092a1(interfaceC11914e, sb2);
        }
        if (z) {
            return;
        }
        List<InterfaceC11920f1> mo4168q = interfaceC11914e.mo4168q();
        C9612q.m13918g(mo4168q, "klass.declaredTypeParameters");
        m5123P1(mo4168q, sb2, false);
        m5103W0(interfaceC11914e, sb2);
        if (!interfaceC11914e.mo4175g().m6717b() && m5113T() && (mo4187C = interfaceC11914e.mo4187C()) != null) {
            sb2.append(" ");
            m5106V0(this, sb2, mo4187C, null, 2, null);
            AbstractC11988u visibility2 = mo4187C.getVisibility();
            C9612q.m13918g(visibility2, "primaryConstructor.visibility");
            m5105V1(visibility2, sb2);
            sb2.append(m5070l1("constructor"));
            List<InterfaceC11936j1> mo4301i = mo4187C.mo4301i();
            C9612q.m13918g(mo4301i, "primaryConstructor.valueParameters");
            m5111T1(mo4301i, mo4187C.mo4307f0(), sb2);
        }
        m5150G1(interfaceC11914e, sb2);
        m5102W1(mo4168q, sb2);
    }

    /* renamed from: X1 */
    private final boolean m5099X1(AbstractC7264g0 abstractC7264g0) {
        boolean z;
        if (!C10869g.m9860o(abstractC7264g0)) {
            return false;
        }
        List<InterfaceC7288k1> mo3566L0 = abstractC7264g0.mo3566L0();
        if (!(mo3566L0 instanceof Collection) || !mo3566L0.isEmpty()) {
            for (InterfaceC7288k1 interfaceC7288k1 : mo3566L0) {
                if (interfaceC7288k1.mo20955a()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    private final C12500d m5098Y() {
        return (C12500d) this.f32459m.getValue();
    }

    /* renamed from: Y0 */
    private final void m5097Y0(InterfaceC11914e interfaceC11914e, StringBuilder sb2) {
        sb2.append(m5070l1(AbstractC12485c.f32435a.m5176a(interfaceC11914e)));
    }

    /* renamed from: Y1 */
    private final boolean m5096Y1(boolean z) {
        int i = C12503b.f32463b[m5077i0().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                throw new C11581q();
            }
        } else if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: a1 */
    private final void m5092a1(InterfaceC11947m interfaceC11947m, StringBuilder sb2) {
        if (m5067n0()) {
            if (m5038y0()) {
                sb2.append("companion object");
            }
            m5153F1(sb2);
            InterfaceC11947m mo4163b = interfaceC11947m.mo4163b();
            if (mo4163b != null) {
                sb2.append("of ");
                C11638f name = mo4163b.getName();
                C9612q.m13918g(name, "containingDeclaration.name");
                sb2.append(mo5047v(name, false));
            }
        }
        if (m5157E0() || !C9612q.m13922c(interfaceC11947m.getName(), C11640h.f30220d)) {
            if (!m5038y0()) {
                m5153F1(sb2);
            }
            C11638f name2 = interfaceC11947m.getName();
            C9612q.m13918g(name2, "descriptor.name");
            sb2.append(mo5047v(name2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public final String m5090b1(AbstractC13301g<?> abstractC13301g) {
        String m13692p0;
        String m14046d0;
        if (abstractC13301g instanceof C13296b) {
            m14046d0 = C9553r.m14046d0(((C13296b) abstractC13301g).mo2813b(), ", ", "{", "}", 0, null, new C12507e(), 24, null);
            return m14046d0;
        } else if (abstractC13301g instanceof C13294a) {
            m13692p0 = C9654p.m13692p0(AbstractC12485c.m5188s(this, ((C13294a) abstractC13301g).mo2813b(), null, 2, null), "@");
            return m13692p0;
        } else if (abstractC13301g instanceof C13320q) {
            C13320q.AbstractC13322b mo2813b = ((C13320q) abstractC13301g).mo2813b();
            if (mo2813b instanceof C13320q.AbstractC13322b.C13323a) {
                return ((C13320q.AbstractC13322b.C13323a) mo2813b).m2784a() + "::class";
            } else if (mo2813b instanceof C13320q.AbstractC13322b.C13324b) {
                C13320q.AbstractC13322b.C13324b c13324b = (C13320q.AbstractC13322b.C13324b) mo2813b;
                String m7458b = c13324b.m2782b().m7471b().m7458b();
                C9612q.m13918g(m7458b, "classValue.classId.asSingleFqName().asString()");
                for (int i = 0; i < c13324b.m2783a(); i++) {
                    m7458b = "kotlin.Array<" + m7458b + '>';
                }
                return m7458b + "::class";
            } else {
                throw new C11581q();
            }
        } else {
            return abstractC13301g.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: c1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5088c1(p305qg.InterfaceC11944l r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.C12500d.m5088c1(qg.l, java.lang.StringBuilder):void");
    }

    /* renamed from: d1 */
    private final void m5086d1(List<? extends InterfaceC11997x0> list, StringBuilder sb2) {
        int m14102k;
        if (!list.isEmpty()) {
            sb2.append("context(");
            int i = 0;
            for (InterfaceC11997x0 interfaceC11997x0 : list) {
                int i2 = i + 1;
                m5109U0(sb2, interfaceC11997x0, EnumC12152e.RECEIVER);
                AbstractC7264g0 type = interfaceC11997x0.getType();
                C9612q.m13918g(type, "contextReceiver.type");
                sb2.append(m5080g1(type));
                m14102k = C9545j.m14102k(list);
                if (i == m14102k) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i = i2;
            }
        }
    }

    /* renamed from: e1 */
    private final void m5084e1(StringBuilder sb2, AbstractC7264g0 abstractC7264g0) {
        C7304p c7304p;
        m5106V0(this, sb2, abstractC7264g0, null, 2, null);
        AbstractC7302o0 abstractC7302o0 = null;
        if (abstractC7264g0 instanceof C7304p) {
            c7304p = (C7304p) abstractC7264g0;
        } else {
            c7304p = null;
        }
        if (c7304p != null) {
            abstractC7302o0 = c7304p.m21040Z0();
        }
        if (C7276i0.m21083a(abstractC7264g0)) {
            if (C10472a.m11439s(abstractC7264g0) && m5073k0()) {
                sb2.append(m5082f1(C8967k.f23554a.m16933p(abstractC7264g0)));
            } else {
                if ((abstractC7264g0 instanceof C8964h) && !m5087d0()) {
                    sb2.append(((C8964h) abstractC7264g0).m16956W0());
                } else {
                    sb2.append(abstractC7264g0.mo3564N0().toString());
                }
                sb2.append(m5141J1(abstractC7264g0.mo3566L0()));
            }
        } else if (abstractC7264g0 instanceof C7335w0) {
            sb2.append(((C7335w0) abstractC7264g0).m21187W0().toString());
        } else if (abstractC7302o0 instanceof C7335w0) {
            sb2.append(((C7335w0) abstractC7302o0).m21187W0().toString());
        } else {
            m5132M1(this, sb2, abstractC7264g0, null, 2, null);
        }
        if (abstractC7264g0.mo3563O0()) {
            sb2.append("?");
        }
        if (C7319s0.m21003c(abstractC7264g0)) {
            sb2.append(" & Any");
        }
    }

    /* renamed from: f1 */
    private final String m5082f1(String str) {
        int i = C12503b.f32462a[m5035z0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "<font color=red><b>" + str + "</b></font>";
            }
            throw new C11581q();
        }
        return str;
    }

    /* renamed from: g1 */
    private final String m5080g1(AbstractC7264g0 abstractC7264g0) {
        String mo5044w = mo5044w(abstractC7264g0);
        if (m5099X1(abstractC7264g0) && !C7320s1.m20983l(abstractC7264g0)) {
            return '(' + mo5044w + ')';
        }
        return mo5044w;
    }

    /* renamed from: h1 */
    private final String m5078h1(List<C11638f> list) {
        return m5128O(C12527n.m4933c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public final void m5076i1(InterfaceC11998y interfaceC11998y, StringBuilder sb2) {
        String mo5044w;
        if (!m5038y0()) {
            if (!m5040x0()) {
                m5106V0(this, sb2, interfaceC11998y, null, 2, null);
                List<InterfaceC11997x0> mo4295x0 = interfaceC11998y.mo4295x0();
                C9612q.m13918g(mo4295x0, "function.contextReceiverParameters");
                m5086d1(mo4295x0, sb2);
                AbstractC11988u visibility = interfaceC11998y.getVisibility();
                C9612q.m13918g(visibility, "function.visibility");
                m5105V1(visibility, sb2);
                m5059q1(interfaceC11998y, sb2);
                if (m5095Z()) {
                    m5066n1(interfaceC11998y, sb2);
                }
                m5045v1(interfaceC11998y, sb2);
                if (m5095Z()) {
                    m5115S0(interfaceC11998y, sb2);
                } else {
                    m5147H1(interfaceC11998y, sb2);
                }
                m5068m1(interfaceC11998y, sb2);
                if (m5157E0()) {
                    if (interfaceC11998y.mo4337C0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC11998y.mo4334F0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(m5070l1("fun"));
            sb2.append(" ");
            List<InterfaceC11920f1> typeParameters = interfaceC11998y.getTypeParameters();
            C9612q.m13918g(typeParameters, "function.typeParameters");
            m5123P1(typeParameters, sb2, true);
            m5162C1(interfaceC11998y, sb2);
        }
        m5054s1(interfaceC11998y, sb2, true);
        List<InterfaceC11936j1> mo4301i = interfaceC11998y.mo4301i();
        C9612q.m13918g(mo4301i, "function.valueParameters");
        m5111T1(mo4301i, interfaceC11998y.mo4307f0(), sb2);
        m5159D1(interfaceC11998y, sb2);
        AbstractC7264g0 returnType = interfaceC11998y.getReturnType();
        if (!m5148H0() && (m5163C0() || returnType == null || !AbstractC10870h.m9851B0(returnType))) {
            sb2.append(": ");
            if (returnType == null) {
                mo5044w = "[NULL]";
            } else {
                mo5044w = mo5044w(returnType);
            }
            sb2.append(mo5044w);
        }
        List<InterfaceC11920f1> typeParameters2 = interfaceC11998y.getTypeParameters();
        C9612q.m13918g(typeParameters2, "function.typeParameters");
        m5102W1(typeParameters2, sb2);
    }

    /* renamed from: j1 */
    private final void m5074j1(StringBuilder sb2, AbstractC7264g0 abstractC7264g0) {
        boolean z;
        boolean z2;
        C11638f c11638f;
        boolean z3;
        char m13677X0;
        int m13717T;
        int m13717T2;
        int m14102k;
        Object m14044f0;
        int length = sb2.length();
        m5106V0(m5098Y(), sb2, abstractC7264g0, null, 2, null);
        if (sb2.length() != length) {
            z = true;
        } else {
            z = false;
        }
        AbstractC7264g0 m9865j = C10869g.m9865j(abstractC7264g0);
        List<AbstractC7264g0> m9870e = C10869g.m9870e(abstractC7264g0);
        if (!m9870e.isEmpty()) {
            sb2.append("context(");
            m14102k = C9545j.m14102k(m9870e);
            for (AbstractC7264g0 abstractC7264g02 : m9870e.subList(0, m14102k)) {
                m5051t1(sb2, abstractC7264g02);
                sb2.append(", ");
            }
            m14044f0 = C9553r.m14044f0(m9870e);
            m5051t1(sb2, (AbstractC7264g0) m14044f0);
            sb2.append(") ");
        }
        boolean m9858q = C10869g.m9858q(abstractC7264g0);
        boolean mo3563O0 = abstractC7264g0.mo3563O0();
        if (!mo3563O0 && (!z || m9865j == null)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (m9858q) {
                sb2.insert(length, '(');
            } else {
                if (z) {
                    m13677X0 = C9659r.m13677X0(sb2);
                    C9637b.m13852c(m13677X0);
                    m13717T = C9654p.m13717T(sb2);
                    if (sb2.charAt(m13717T - 1) != ')') {
                        m13717T2 = C9654p.m13717T(sb2);
                        sb2.insert(m13717T2, "()");
                    }
                }
                sb2.append("(");
            }
        }
        m5056r1(sb2, m9858q, "suspend");
        if (m9865j != null) {
            if ((m5099X1(m9865j) && !m9865j.mo3563O0()) || m5136L0(m9865j)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                sb2.append("(");
            }
            m5051t1(sb2, m9865j);
            if (z3) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (C10869g.m9862m(abstractC7264g0) && abstractC7264g0.mo3566L0().size() <= 1) {
            sb2.append("???");
        } else {
            int i = 0;
            for (InterfaceC7288k1 interfaceC7288k1 : C10869g.m9863l(abstractC7264g0)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb2.append(", ");
                }
                if (m5075j0()) {
                    AbstractC7264g0 type = interfaceC7288k1.getType();
                    C9612q.m13918g(type, "typeProjection.type");
                    c11638f = C10869g.m9871d(type);
                } else {
                    c11638f = null;
                }
                if (c11638f != null) {
                    sb2.append(mo5047v(c11638f, false));
                    sb2.append(": ");
                }
                sb2.append(mo5041x(interfaceC7288k1));
                i = i2;
            }
        }
        sb2.append(") ");
        sb2.append(m5131N());
        sb2.append(" ");
        m5051t1(sb2, C10869g.m9864k(abstractC7264g0));
        if (z2) {
            sb2.append(")");
        }
        if (mo3563O0) {
            sb2.append("?");
        }
    }

    /* renamed from: k1 */
    private final void m5072k1(InterfaceC11943k1 interfaceC11943k1, StringBuilder sb2) {
        AbstractC13301g<?> mo4339n0;
        if (m5089c0() && (mo4339n0 = interfaceC11943k1.mo4339n0()) != null) {
            sb2.append(" = ");
            sb2.append(m5128O(m5090b1(mo4339n0)));
        }
    }

    /* renamed from: l1 */
    private final String m5070l1(String str) {
        int i = C12503b.f32462a[m5035z0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (!m5116S()) {
                    return "<b>" + str + "</b>";
                }
                return str;
            }
            throw new C11581q();
        }
        return str;
    }

    /* renamed from: m1 */
    private final void m5068m1(InterfaceC11902b interfaceC11902b, StringBuilder sb2) {
        if (m5085e0().contains(EnumC12511e.MEMBER_KIND) && m5157E0() && interfaceC11902b.mo4305g() != InterfaceC11902b.EnumC11903a.DECLARATION) {
            sb2.append("/*");
            sb2.append(C11644a.m7375f(interfaceC11902b.mo4305g().name()));
            sb2.append("*/ ");
        }
    }

    /* renamed from: n1 */
    private final void m5066n1(InterfaceC11911d0 interfaceC11911d0, StringBuilder sb2) {
        boolean z;
        m5056r1(sb2, interfaceC11911d0.isExternal(), "external");
        boolean z2 = true;
        if (m5085e0().contains(EnumC12511e.EXPECT) && interfaceC11911d0.mo4172k0()) {
            z = true;
        } else {
            z = false;
        }
        m5056r1(sb2, z, "expect");
        if (!m5085e0().contains(EnumC12511e.ACTUAL) || !interfaceC11911d0.mo4178U()) {
            z2 = false;
        }
        m5056r1(sb2, z2, "actual");
    }

    /* renamed from: p1 */
    private final void m5062p1(EnumC11915e0 enumC11915e0, StringBuilder sb2, EnumC11915e0 enumC11915e02) {
        if (!m5057r0() && enumC11915e0 == enumC11915e02) {
            return;
        }
        m5056r1(sb2, m5085e0().contains(EnumC12511e.MODALITY), C11644a.m7375f(enumC11915e0.name()));
    }

    /* renamed from: q1 */
    private final void m5059q1(InterfaceC11902b interfaceC11902b, StringBuilder sb2) {
        if (!C12758e.m4115J(interfaceC11902b) || interfaceC11902b.mo4167r() != EnumC11915e0.FINAL) {
            if (m5079h0() == EnumC12521j.RENDER_OVERRIDE && interfaceC11902b.mo4167r() == EnumC11915e0.OPEN && m5124P0(interfaceC11902b)) {
                return;
            }
            EnumC11915e0 mo4167r = interfaceC11902b.mo4167r();
            C9612q.m13918g(mo4167r, "callable.modality");
            m5062p1(mo4167r, sb2, m5133M0(interfaceC11902b));
        }
    }

    /* renamed from: r1 */
    private final void m5056r1(StringBuilder sb2, boolean z, String str) {
        if (z) {
            sb2.append(m5070l1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m5054s1(InterfaceC11947m interfaceC11947m, StringBuilder sb2, boolean z) {
        C11638f name = interfaceC11947m.getName();
        C9612q.m13918g(name, "descriptor.name");
        sb2.append(mo5047v(name, z));
    }

    /* renamed from: t1 */
    private final void m5051t1(StringBuilder sb2, AbstractC7264g0 abstractC7264g0) {
        C7216a c7216a;
        AbstractC7333v1 mo20916Q0 = abstractC7264g0.mo20916Q0();
        if (mo20916Q0 instanceof C7216a) {
            c7216a = (C7216a) mo20916Q0;
        } else {
            c7216a = null;
        }
        if (c7216a != null) {
            if (m5049u0()) {
                m5048u1(sb2, c7216a.m21223F());
                return;
            }
            m5048u1(sb2, c7216a.m21222Z0());
            if (m5046v0()) {
                m5121Q0(sb2, c7216a);
                return;
            }
            return;
        }
        m5048u1(sb2, abstractC7264g0);
    }

    /* renamed from: u1 */
    private final void m5048u1(StringBuilder sb2, AbstractC7264g0 abstractC7264g0) {
        if ((abstractC7264g0 instanceof AbstractC7340x1) && mo4966i() && !((AbstractC7340x1) abstractC7264g0).mo20914S0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        AbstractC7333v1 mo20916Q0 = abstractC7264g0.mo20916Q0();
        if (mo20916Q0 instanceof AbstractC7217a0) {
            sb2.append(((AbstractC7217a0) mo20916Q0).mo20944X0(this, this));
        } else if (mo20916Q0 instanceof AbstractC7302o0) {
            m5156E1(sb2, (AbstractC7302o0) mo20916Q0);
        }
    }

    /* renamed from: v1 */
    private final void m5045v1(InterfaceC11902b interfaceC11902b, StringBuilder sb2) {
        if (m5085e0().contains(EnumC12511e.OVERRIDE) && m5124P0(interfaceC11902b) && m5079h0() != EnumC12521j.RENDER_OPEN) {
            m5056r1(sb2, true, "override");
            if (m5157E0()) {
                sb2.append("/*");
                sb2.append(interfaceC11902b.mo4310d().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public final void m5042w1(InterfaceC11945l0 interfaceC11945l0, StringBuilder sb2) {
        m5039x1(interfaceC11945l0.mo4161e(), "package-fragment", sb2);
        if (mo4966i()) {
            sb2.append(" in ");
            m5054s1(interfaceC11945l0.mo4163b(), sb2, false);
        }
    }

    /* renamed from: x1 */
    private final void m5039x1(C11633c c11633c, String str, StringBuilder sb2) {
        boolean z;
        sb2.append(m5070l1(str));
        C11634d m7450j = c11633c.m7450j();
        C9612q.m13918g(m7450j, "fqName.toUnsafe()");
        String mo5050u = mo5050u(m7450j);
        if (mo5050u.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb2.append(" ");
            sb2.append(mo5050u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m5037y1(InterfaceC11969q0 interfaceC11969q0, StringBuilder sb2) {
        m5039x1(interfaceC11969q0.mo4239e(), "package", sb2);
        if (mo4966i()) {
            sb2.append(" in context of ");
            m5054s1(interfaceC11969q0.mo4243B0(), sb2, false);
        }
    }

    /* renamed from: z1 */
    private final void m5034z1(StringBuilder sb2, C11973s0 c11973s0) {
        C11973s0 m6679c = c11973s0.m6679c();
        if (m6679c != null) {
            m5034z1(sb2, m6679c);
            sb2.append('.');
            C11638f name = c11973s0.m6680b().getName();
            C9612q.m13918g(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(mo5047v(name, false));
        } else {
            InterfaceC7265g1 mo4173k = c11973s0.m6680b().mo4173k();
            C9612q.m13918g(mo4173k, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(m5138K1(mo4173k));
        }
        sb2.append(m5141J1(c11973s0.m6681a()));
    }

    /* renamed from: A0 */
    public Function1<AbstractC7264g0, AbstractC7264g0> m5169A0() {
        return this.f32458l.m4981a0();
    }

    /* renamed from: B0 */
    public boolean m5166B0() {
        return this.f32458l.m4979b0();
    }

    /* renamed from: C0 */
    public boolean m5163C0() {
        return this.f32458l.m4977c0();
    }

    /* renamed from: D0 */
    public AbstractC12485c.InterfaceC12498l m5160D0() {
        return this.f32458l.m4975d0();
    }

    /* renamed from: E0 */
    public boolean m5157E0() {
        return this.f32458l.m4973e0();
    }

    /* renamed from: F0 */
    public boolean m5154F0() {
        return this.f32458l.m4971f0();
    }

    /* renamed from: G0 */
    public boolean m5151G0() {
        return this.f32458l.m4969g0();
    }

    /* renamed from: H0 */
    public boolean m5148H0() {
        return this.f32458l.m4967h0();
    }

    /* renamed from: I0 */
    public boolean m5145I0() {
        return this.f32458l.m4965i0();
    }

    /* renamed from: J0 */
    public boolean m5142J0() {
        return this.f32458l.m4963j0();
    }

    /* renamed from: J1 */
    public String m5141J1(List<? extends InterfaceC7288k1> typeArguments) {
        C9612q.m13917h(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5127O0());
        m5134M(sb2, typeArguments);
        sb2.append(m5139K0());
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: K1 */
    public String m5138K1(InterfaceC7265g1 typeConstructor) {
        boolean z;
        C9612q.m13917h(typeConstructor, "typeConstructor");
        InterfaceC11927h mo2788p = typeConstructor.mo2788p();
        boolean z2 = true;
        if (mo2788p instanceof InterfaceC11920f1) {
            z = true;
        } else {
            z = mo2788p instanceof InterfaceC11914e;
        }
        if (!z) {
            z2 = mo2788p instanceof InterfaceC11917e1;
        }
        if (z2) {
            return m5094Z0(mo2788p);
        }
        if (mo2788p == null) {
            if (typeConstructor instanceof C7239f0) {
                return ((C7239f0) typeConstructor).m21154f(C12510h.f32470j);
            }
            return typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + mo2788p.getClass()).toString());
    }

    /* renamed from: P */
    public boolean m5125P() {
        return this.f32458l.m4952r();
    }

    /* renamed from: Q */
    public boolean m5122Q() {
        return this.f32458l.m4951s();
    }

    /* renamed from: R */
    public Function1<InterfaceC12149c, Boolean> m5119R() {
        return this.f32458l.m4950t();
    }

    /* renamed from: S */
    public boolean m5116S() {
        return this.f32458l.m4949u();
    }

    /* renamed from: T */
    public boolean m5113T() {
        return this.f32458l.m4948v();
    }

    /* renamed from: U */
    public InterfaceC12481b m5110U() {
        return this.f32458l.m4947w();
    }

    /* renamed from: V */
    public Function1<InterfaceC11936j1, String> m5107V() {
        return this.f32458l.m4946x();
    }

    /* renamed from: W */
    public boolean m5104W() {
        return this.f32458l.m4945y();
    }

    /* renamed from: X */
    public Set<C11633c> m5101X() {
        return this.f32458l.m4944z();
    }

    /* renamed from: Z */
    public boolean m5095Z() {
        return this.f32458l.m5008A();
    }

    /* renamed from: Z0 */
    public String m5094Z0(InterfaceC11927h klass) {
        C9612q.m13917h(klass, "klass");
        if (C8967k.m16936m(klass)) {
            return klass.mo4173k().toString();
        }
        return m5110U().mo5191a(klass, this);
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: a */
    public void mo4982a(EnumC12522k enumC12522k) {
        C9612q.m13917h(enumC12522k, "<set-?>");
        this.f32458l.mo4982a(enumC12522k);
    }

    /* renamed from: a0 */
    public boolean m5093a0() {
        return this.f32458l.m5007B();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: b */
    public void mo4980b(boolean z) {
        this.f32458l.mo4980b(z);
    }

    /* renamed from: b0 */
    public boolean m5091b0() {
        return this.f32458l.m5006C();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: c */
    public void mo4978c(EnumC12524m enumC12524m) {
        C9612q.m13917h(enumC12524m, "<set-?>");
        this.f32458l.mo4978c(enumC12524m);
    }

    /* renamed from: c0 */
    public boolean m5089c0() {
        return this.f32458l.m5005D();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: d */
    public void mo4976d(boolean z) {
        this.f32458l.mo4976d(z);
    }

    /* renamed from: d0 */
    public boolean m5087d0() {
        return this.f32458l.m5004E();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: e */
    public boolean mo4974e() {
        return this.f32458l.mo4974e();
    }

    /* renamed from: e0 */
    public Set<EnumC12511e> m5085e0() {
        return this.f32458l.m5003F();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: f */
    public void mo4972f(boolean z) {
        this.f32458l.mo4972f(z);
    }

    /* renamed from: f0 */
    public boolean m5083f0() {
        return this.f32458l.m5002G();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: g */
    public void mo4970g(boolean z) {
        this.f32458l.mo4970g(z);
    }

    /* renamed from: g0 */
    public final C12515g m5081g0() {
        return this.f32458l;
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: h */
    public Set<C11633c> mo4968h() {
        return this.f32458l.mo4968h();
    }

    /* renamed from: h0 */
    public EnumC12521j m5079h0() {
        return this.f32458l.m5001H();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: i */
    public boolean mo4966i() {
        return this.f32458l.mo4966i();
    }

    /* renamed from: i0 */
    public EnumC12522k m5077i0() {
        return this.f32458l.m5000I();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: j */
    public EnumC12480a mo4964j() {
        return this.f32458l.mo4964j();
    }

    /* renamed from: j0 */
    public boolean m5075j0() {
        return this.f32458l.m4999J();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: k */
    public void mo4962k(Set<C11633c> set) {
        C9612q.m13917h(set, "<set-?>");
        this.f32458l.mo4962k(set);
    }

    /* renamed from: k0 */
    public boolean m5073k0() {
        return this.f32458l.m4998K();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: l */
    public void mo4960l(InterfaceC12481b interfaceC12481b) {
        C9612q.m13917h(interfaceC12481b, "<set-?>");
        this.f32458l.mo4960l(interfaceC12481b);
    }

    /* renamed from: l0 */
    public EnumC12523l m5071l0() {
        return this.f32458l.m4997L();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: m */
    public void mo4958m(Set<? extends EnumC12511e> set) {
        C9612q.m13917h(set, "<set-?>");
        this.f32458l.mo4958m(set);
    }

    /* renamed from: m0 */
    public boolean m5069m0() {
        return this.f32458l.m4996M();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: n */
    public void mo4956n(boolean z) {
        this.f32458l.mo4956n(z);
    }

    /* renamed from: n0 */
    public boolean m5067n0() {
        return this.f32458l.m4995N();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: o */
    public void mo4955o(boolean z) {
        this.f32458l.mo4955o(z);
    }

    /* renamed from: o0 */
    public boolean m5065o0() {
        return this.f32458l.m4994O();
    }

    /* renamed from: o1 */
    public String m5064o1(String message) {
        C9612q.m13917h(message, "message");
        int i = C12503b.f32462a[m5035z0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "<i>" + message + "</i>";
            }
            throw new C11581q();
        }
        return message;
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: p */
    public void mo4954p(boolean z) {
        this.f32458l.mo4954p(z);
    }

    /* renamed from: p0 */
    public boolean m5063p0() {
        return this.f32458l.m4993P();
    }

    @Override // sh.AbstractC12485c
    /* renamed from: q */
    public String mo5061q(InterfaceC11947m declarationDescriptor) {
        C9612q.m13917h(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.mo4162d0(new C12501a(), sb2);
        if (m5154F0()) {
            m5137L(sb2, declarationDescriptor);
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: q0 */
    public boolean m5060q0() {
        return this.f32458l.m4992Q();
    }

    @Override // sh.AbstractC12485c
    /* renamed from: r */
    public String mo5058r(InterfaceC12149c annotation, EnumC12152e enumC12152e) {
        C9612q.m13917h(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (enumC12152e != null) {
            sb2.append(enumC12152e.m6042b() + ':');
        }
        AbstractC7264g0 type = annotation.getType();
        sb2.append(mo5044w(type));
        if (m5093a0()) {
            List<String> m5112T0 = m5112T0(annotation);
            if (m5091b0() || (!m5112T0.isEmpty())) {
                C9553r.m14048b0(m5112T0, sb2, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (m5157E0() && (C7276i0.m21083a(type) || (type.mo3564N0().mo2788p() instanceof C11938k0.C11940b))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: r0 */
    public boolean m5057r0() {
        return this.f32458l.m4991R();
    }

    /* renamed from: s0 */
    public boolean m5055s0() {
        return this.f32458l.m4990S();
    }

    @Override // sh.AbstractC12485c
    /* renamed from: t */
    public String mo5053t(String lowerRendered, String upperRendered, AbstractC10870h builtIns) {
        String m13722Q0;
        String m13722Q02;
        boolean m13758H;
        C9612q.m13917h(lowerRendered, "lowerRendered");
        C9612q.m13917h(upperRendered, "upperRendered");
        C9612q.m13917h(builtIns, "builtIns");
        if (C12527n.m4930f(lowerRendered, upperRendered)) {
            m13758H = C9653o.m13758H(upperRendered, "(", false, 2, null);
            if (m13758H) {
                return '(' + lowerRendered + ")!";
            }
            return lowerRendered + '!';
        }
        InterfaceC12481b m5110U = m5110U();
        InterfaceC11914e m9783w = builtIns.m9783w();
        C9612q.m13918g(m9783w, "builtIns.collection");
        m13722Q0 = C9654p.m13722Q0(m5110U.mo5191a(m9783w, this), "Collection", null, 2, null);
        String m4932d = C12527n.m4932d(lowerRendered, m13722Q0 + "Mutable", upperRendered, m13722Q0, m13722Q0 + "(Mutable)");
        if (m4932d != null) {
            return m4932d;
        }
        String m4932d2 = C12527n.m4932d(lowerRendered, m13722Q0 + "MutableMap.MutableEntry", upperRendered, m13722Q0 + "Map.Entry", m13722Q0 + "(Mutable)Map.(Mutable)Entry");
        if (m4932d2 != null) {
            return m4932d2;
        }
        InterfaceC12481b m5110U2 = m5110U();
        InterfaceC11914e m9808j = builtIns.m9808j();
        C9612q.m13918g(m9808j, "builtIns.array");
        m13722Q02 = C9654p.m13722Q0(m5110U2.mo5191a(m9808j, this), "Array", null, 2, null);
        String m4932d3 = C12527n.m4932d(lowerRendered, m13722Q02 + m5128O("Array<"), upperRendered, m13722Q02 + m5128O("Array<out "), m13722Q02 + m5128O("Array<(out) "));
        if (m4932d3 != null) {
            return m4932d3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    /* renamed from: t0 */
    public boolean m5052t0() {
        return this.f32458l.m4989T();
    }

    @Override // sh.AbstractC12485c
    /* renamed from: u */
    public String mo5050u(C11634d fqName) {
        C9612q.m13917h(fqName, "fqName");
        List<C11638f> m7441h = fqName.m7441h();
        C9612q.m13918g(m7441h, "fqName.pathSegments()");
        return m5078h1(m7441h);
    }

    /* renamed from: u0 */
    public boolean m5049u0() {
        return this.f32458l.m4988U();
    }

    @Override // sh.AbstractC12485c
    /* renamed from: v */
    public String mo5047v(C11638f name, boolean z) {
        C9612q.m13917h(name, "name");
        String m5128O = m5128O(C12527n.m4934b(name));
        if (m5116S() && m5035z0() == EnumC12524m.HTML && z) {
            return "<b>" + m5128O + "</b>";
        }
        return m5128O;
    }

    /* renamed from: v0 */
    public boolean m5046v0() {
        return this.f32458l.m4987V();
    }

    @Override // sh.AbstractC12485c
    /* renamed from: w */
    public String mo5044w(AbstractC7264g0 type) {
        C9612q.m13917h(type, "type");
        StringBuilder sb2 = new StringBuilder();
        m5051t1(sb2, m5169A0().invoke(type));
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: w0 */
    public boolean m5043w0() {
        return this.f32458l.m4986W();
    }

    @Override // sh.AbstractC12485c
    /* renamed from: x */
    public String mo5041x(InterfaceC7288k1 typeProjection) {
        List<? extends InterfaceC7288k1> m14109d;
        C9612q.m13917h(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        m14109d = C9544i.m14109d(typeProjection);
        m5134M(sb2, m14109d);
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: x0 */
    public boolean m5040x0() {
        return this.f32458l.m4985X();
    }

    /* renamed from: y0 */
    public boolean m5038y0() {
        return this.f32458l.m4984Y();
    }

    /* renamed from: z0 */
    public EnumC12524m m5035z0() {
        return this.f32458l.m4983Z();
    }
}
