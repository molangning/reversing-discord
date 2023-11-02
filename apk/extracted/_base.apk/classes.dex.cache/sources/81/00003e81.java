package kg;

import ag.C0156a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kg.C9271j0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC9613r;
import kotlin.reflect.KProperty;
import p140hg.C7142j;
import p140hg.InterfaceC7130c;
import p142hi.AbstractC7264g0;
import p142hi.C7320s1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7288k1;
import p181jg.C8938b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p407wg.C13548d;
import pf.C11577n;
import pf.C11581q;
import pf.C11582r;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010$¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u000e\u0010\u0018R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0014\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006(²\u0006\u0012\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\nX\u008a\u0084\u0002"}, m14357d2 = {"Lkg/e0;", "Lkotlin/jvm/internal/r;", "Lhi/g0;", "type", "Lhg/c;", "m", "", "other", "", "equals", "", "hashCode", "", "toString", "j", "Lhi/g0;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lkg/j0$a;", "Ljava/lang/reflect/Type;", "k", "Lkg/j0$a;", "computeJavaType", "l", "()Lhg/c;", "classifier", "", "Lhg/j;", "()Ljava/util/List;", "arguments", "c", "()Ljava/lang/reflect/Type;", "javaType", "b", "()Z", "isMarkedNullable", "Lkotlin/Function0;", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "parameterizedTypeArguments", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9245e0 implements InterfaceC9613r {

    /* renamed from: n */
    static final /* synthetic */ KProperty<Object>[] f24303n = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9245e0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9245e0.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: j */
    private final AbstractC7264g0 f24304j;

    /* renamed from: k */
    private final C9271j0.C9272a<Type> f24305k;

    /* renamed from: l */
    private final C9271j0.C9272a f24306l;

    /* renamed from: m */
    private final C9271j0.C9272a f24307m;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "Lhg/j;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.e0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9246a extends AbstractC9614s implements Function0<List<? extends C7142j>> {

        /* renamed from: k */
        final /* synthetic */ Function0<Type> f24309k;

        @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.e0$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C9247a extends AbstractC9614s implements Function0<Type> {

            /* renamed from: j */
            final /* synthetic */ C9245e0 f24310j;

            /* renamed from: k */
            final /* synthetic */ int f24311k;

            /* renamed from: l */
            final /* synthetic */ Lazy<List<Type>> f24312l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C9247a(C9245e0 c9245e0, int i, Lazy<? extends List<? extends Type>> lazy) {
                super(0);
                this.f24310j = c9245e0;
                this.f24311k = i;
                this.f24312l = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Type invoke() {
                Object m14247E;
                Object m14249D;
                Class<?> cls;
                Type mo13899c = this.f24310j.mo13899c();
                if (mo13899c instanceof Class) {
                    Class cls2 = (Class) mo13899c;
                    if (cls2.isArray()) {
                        cls = cls2.getComponentType();
                    } else {
                        cls = Object.class;
                    }
                    C9612q.m13918g(cls, "{\n                      …                        }");
                    return cls;
                } else if (mo13899c instanceof GenericArrayType) {
                    if (this.f24311k == 0) {
                        Type genericComponentType = ((GenericArrayType) mo13899c).getGenericComponentType();
                        C9612q.m13918g(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new C9258h0("Array type has been queried for a non-0th argument: " + this.f24310j);
                } else if (mo13899c instanceof ParameterizedType) {
                    Type type = (Type) C9246a.m15997b(this.f24312l).get(this.f24311k);
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        C9612q.m13918g(lowerBounds, "argument.lowerBounds");
                        m14247E = C9538f.m14247E(lowerBounds);
                        Type type2 = (Type) m14247E;
                        if (type2 == null) {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            C9612q.m13918g(upperBounds, "argument.upperBounds");
                            m14249D = C9538f.m14249D(upperBounds);
                            type = (Type) m14249D;
                        } else {
                            type = type2;
                        }
                    }
                    C9612q.m13918g(type, "{\n                      …                        }");
                    return type;
                } else {
                    throw new C9258h0("Non-generic type has been queried for arguments: " + this.f24310j);
                }
            }
        }

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: kg.e0$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public /* synthetic */ class C9248b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24313a;

            static {
                int[] iArr = new int[EnumC7336w1.values().length];
                try {
                    iArr[EnumC7336w1.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7336w1.IN_VARIANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7336w1.OUT_VARIANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f24313a = iArr;
            }
        }

        @Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Ljava/lang/reflect/Type;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: kg.e0$a$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C9249c extends AbstractC9614s implements Function0<List<? extends Type>> {

            /* renamed from: j */
            final /* synthetic */ C9245e0 f24314j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9249c(C9245e0 c9245e0) {
                super(0);
                this.f24314j = c9245e0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Type> invoke() {
                Type mo13899c = this.f24314j.mo13899c();
                C9612q.m13920e(mo13899c);
                return C13548d.m2243d(mo13899c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9246a(Function0<? extends Type> function0) {
            super(0);
            C9245e0.this = r1;
            this.f24309k = function0;
        }

        /* renamed from: b */
        public static final List<Type> m15997b(Lazy<? extends List<? extends Type>> lazy) {
            return (List) lazy.getValue();
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends C7142j> invoke() {
            Lazy m7600b;
            int m14093t;
            C7142j m21378d;
            List<? extends C7142j> m14104i;
            List<InterfaceC7288k1> mo3566L0 = C9245e0.this.m15999o().mo3566L0();
            if (mo3566L0.isEmpty()) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C9249c(C9245e0.this));
            Function0<Type> function0 = this.f24309k;
            C9245e0 c9245e0 = C9245e0.this;
            m14093t = C9546k.m14093t(mo3566L0, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            int i = 0;
            for (Object obj : mo3566L0) {
                int i2 = i + 1;
                if (i < 0) {
                    C9545j.m14094s();
                }
                InterfaceC7288k1 interfaceC7288k1 = (InterfaceC7288k1) obj;
                if (interfaceC7288k1.mo20955a()) {
                    m21378d = C7142j.f19494c.m21379c();
                } else {
                    AbstractC7264g0 type = interfaceC7288k1.getType();
                    C9612q.m13918g(type, "typeProjection.type");
                    C9245e0 c9245e02 = new C9245e0(type, function0 == null ? null : new C9247a(c9245e0, i, m7600b));
                    int i3 = C9248b.f24313a[interfaceC7288k1.mo20954b().ordinal()];
                    if (i3 == 1) {
                        m21378d = C7142j.f19494c.m21378d(c9245e02);
                    } else if (i3 == 2) {
                        m21378d = C7142j.f19494c.m21381a(c9245e02);
                    } else if (i3 != 3) {
                        throw new C11581q();
                    } else {
                        m21378d = C7142j.f19494c.m21380b(c9245e02);
                    }
                }
                arrayList.add(m21378d);
                i = i2;
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Lhg/c;", "a", "()Lhg/c;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.e0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9250b extends AbstractC9614s implements Function0<InterfaceC7130c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9250b() {
            super(0);
            C9245e0.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC7130c invoke() {
            C9245e0 c9245e0 = C9245e0.this;
            return c9245e0.m16000m(c9245e0.m15999o());
        }
    }

    public C9245e0(AbstractC7264g0 type, Function0<? extends Type> function0) {
        C9612q.m13917h(type, "type");
        this.f24304j = type;
        C9271j0.C9272a<Type> c9272a = null;
        C9271j0.C9272a<Type> c9272a2 = function0 instanceof C9271j0.C9272a ? (C9271j0.C9272a) function0 : null;
        if (c9272a2 != null) {
            c9272a = c9272a2;
        } else if (function0 != null) {
            c9272a = C9271j0.m15968d(function0);
        }
        this.f24305k = c9272a;
        this.f24306l = C9271j0.m15968d(new C9250b());
        this.f24307m = C9271j0.m15968d(new C9246a(function0));
    }

    /* renamed from: m */
    public final InterfaceC7130c m16000m(AbstractC7264g0 abstractC7264g0) {
        Object m14031s0;
        AbstractC7264g0 type;
        InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11914e) {
            Class<?> m15844p = C9336p0.m15844p((InterfaceC11914e) mo2788p);
            if (m15844p == null) {
                return null;
            }
            if (m15844p.isArray()) {
                m14031s0 = C9553r.m14031s0(abstractC7264g0.mo3566L0());
                InterfaceC7288k1 interfaceC7288k1 = (InterfaceC7288k1) m14031s0;
                if (interfaceC7288k1 != null && (type = interfaceC7288k1.getType()) != null) {
                    InterfaceC7130c m16000m = m16000m(type);
                    if (m16000m != null) {
                        return new C9296m(C9336p0.m15854f(C0156a.m41055b(C8938b.m17025a(m16000m))));
                    }
                    throw new C9258h0("Cannot determine classifier for array element type: " + this);
                }
                return new C9296m(m15844p);
            } else if (!C7320s1.m20983l(abstractC7264g0)) {
                Class<?> m2242e = C13548d.m2242e(m15844p);
                if (m2242e != null) {
                    m15844p = m2242e;
                }
                return new C9296m(m15844p);
            } else {
                return new C9296m(m15844p);
            }
        } else if (mo2788p instanceof InterfaceC11920f1) {
            return new C9252f0(null, (InterfaceC11920f1) mo2788p);
        } else {
            if (!(mo2788p instanceof InterfaceC11917e1)) {
                return null;
            }
            throw new C11582r("An operation is not implemented: Type alias classifiers are not yet supported");
        }
    }

    @Override // kotlin.reflect.KType
    /* renamed from: b */
    public boolean mo13880b() {
        return this.f24304j.mo3563O0();
    }

    @Override // kotlin.jvm.internal.InterfaceC9613r
    /* renamed from: c */
    public Type mo13899c() {
        C9271j0.C9272a<Type> c9272a = this.f24305k;
        if (c9272a != null) {
            return c9272a.invoke();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9245e0) {
            C9245e0 c9245e0 = (C9245e0) obj;
            if (C9612q.m13922c(this.f24304j, c9245e0.f24304j) && C9612q.m13922c(mo13879j(), c9245e0.mo13879j()) && C9612q.m13922c(mo13878k(), c9245e0.mo13878k())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f24304j.hashCode() * 31;
        InterfaceC7130c mo13879j = mo13879j();
        return ((hashCode + (mo13879j != null ? mo13879j.hashCode() : 0)) * 31) + mo13878k().hashCode();
    }

    @Override // kotlin.reflect.KType
    /* renamed from: j */
    public InterfaceC7130c mo13879j() {
        return (InterfaceC7130c) this.f24306l.m15964b(this, f24303n[0]);
    }

    @Override // kotlin.reflect.KType
    /* renamed from: k */
    public List<C7142j> mo13878k() {
        T m15964b = this.f24307m.m15964b(this, f24303n[1]);
        C9612q.m13918g(m15964b, "<get-arguments>(...)");
        return (List) m15964b;
    }

    /* renamed from: o */
    public final AbstractC7264g0 m15999o() {
        return this.f24304j;
    }

    public String toString() {
        return C9292l0.f24366a.m15930h(this.f24304j);
    }

    public /* synthetic */ C9245e0(AbstractC7264g0 abstractC7264g0, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7264g0, (i & 2) != 0 ? null : function0);
    }
}