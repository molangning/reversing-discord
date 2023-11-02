package sh;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.C9618w;
import kotlin.properties.AbstractC9624c;
import kotlin.properties.C9622a;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.text.C9653o;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11936j1;
import p325rg.InterfaceC12149c;
import ph.C11633c;
import sh.AbstractC12485c;
import sh.InterfaceC12481b;
import sh.InterfaceC12513f;

/* renamed from: sh.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12515g implements InterfaceC12513f {

    /* renamed from: X */
    static final /* synthetic */ KProperty<Object>[] f32490X = {C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "withDefinedIn", "getWithDefinedIn()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "modifiers", "getModifiers()Ljava/util/Set;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "startFromName", "getStartFromName()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "debugMode", "getDebugMode()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "verbose", "getVerbose()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "unitReturnType", "getUnitReturnType()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "withoutReturnType", "getWithoutReturnType()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "enhancedTypes", "getEnhancedTypes()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "receiverAfterName", "getReceiverAfterName()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), C9591f0.m13966e(new C9618w(C9591f0.m13969b(C12515g.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* renamed from: A */
    private final ReadWriteProperty f32491A;

    /* renamed from: B */
    private final ReadWriteProperty f32492B;

    /* renamed from: C */
    private final ReadWriteProperty f32493C;

    /* renamed from: D */
    private final ReadWriteProperty f32494D;

    /* renamed from: E */
    private final ReadWriteProperty f32495E;

    /* renamed from: F */
    private final ReadWriteProperty f32496F;

    /* renamed from: G */
    private final ReadWriteProperty f32497G;

    /* renamed from: H */
    private final ReadWriteProperty f32498H;

    /* renamed from: I */
    private final ReadWriteProperty f32499I;

    /* renamed from: J */
    private final ReadWriteProperty f32500J;

    /* renamed from: K */
    private final ReadWriteProperty f32501K;

    /* renamed from: L */
    private final ReadWriteProperty f32502L;

    /* renamed from: M */
    private final ReadWriteProperty f32503M;

    /* renamed from: N */
    private final ReadWriteProperty f32504N;

    /* renamed from: O */
    private final ReadWriteProperty f32505O;

    /* renamed from: P */
    private final ReadWriteProperty f32506P;

    /* renamed from: Q */
    private final ReadWriteProperty f32507Q;

    /* renamed from: R */
    private final ReadWriteProperty f32508R;

    /* renamed from: S */
    private final ReadWriteProperty f32509S;

    /* renamed from: T */
    private final ReadWriteProperty f32510T;

    /* renamed from: U */
    private final ReadWriteProperty f32511U;

    /* renamed from: V */
    private final ReadWriteProperty f32512V;

    /* renamed from: W */
    private final ReadWriteProperty f32513W;

    /* renamed from: a */
    private boolean f32514a;

    /* renamed from: b */
    private final ReadWriteProperty f32515b = m4957m0(InterfaceC12481b.C12484c.f32434a);

    /* renamed from: c */
    private final ReadWriteProperty f32516c;

    /* renamed from: d */
    private final ReadWriteProperty f32517d;

    /* renamed from: e */
    private final ReadWriteProperty f32518e;

    /* renamed from: f */
    private final ReadWriteProperty f32519f;

    /* renamed from: g */
    private final ReadWriteProperty f32520g;

    /* renamed from: h */
    private final ReadWriteProperty f32521h;

    /* renamed from: i */
    private final ReadWriteProperty f32522i;

    /* renamed from: j */
    private final ReadWriteProperty f32523j;

    /* renamed from: k */
    private final ReadWriteProperty f32524k;

    /* renamed from: l */
    private final ReadWriteProperty f32525l;

    /* renamed from: m */
    private final ReadWriteProperty f32526m;

    /* renamed from: n */
    private final ReadWriteProperty f32527n;

    /* renamed from: o */
    private final ReadWriteProperty f32528o;

    /* renamed from: p */
    private final ReadWriteProperty f32529p;

    /* renamed from: q */
    private final ReadWriteProperty f32530q;

    /* renamed from: r */
    private final ReadWriteProperty f32531r;

    /* renamed from: s */
    private final ReadWriteProperty f32532s;

    /* renamed from: t */
    private final ReadWriteProperty f32533t;

    /* renamed from: u */
    private final ReadWriteProperty f32534u;

    /* renamed from: v */
    private final ReadWriteProperty f32535v;

    /* renamed from: w */
    private final ReadWriteProperty f32536w;

    /* renamed from: x */
    private final ReadWriteProperty f32537x;

    /* renamed from: y */
    private final ReadWriteProperty f32538y;

    /* renamed from: z */
    private final ReadWriteProperty f32539z;

    /* renamed from: sh.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C12516a extends AbstractC9614s implements Function1<InterfaceC11936j1, String> {

        /* renamed from: j */
        public static final C12516a f32540j = new C12516a();

        C12516a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(InterfaceC11936j1 it) {
            C9612q.m13917h(it, "it");
            return "...";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: sh.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12517b<T> extends AbstractC9624c<T> {

        /* renamed from: a */
        final /* synthetic */ C12515g f32541a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12517b(Object obj, C12515g c12515g) {
            super(obj);
            this.f32541a = c12515g;
        }

        @Override // kotlin.properties.AbstractC9624c
        protected boolean beforeChange(KProperty<?> property, T t, T t2) {
            C9612q.m13917h(property, "property");
            if (!this.f32541a.m4961k0()) {
                return true;
            }
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }

    /* renamed from: sh.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C12518c extends AbstractC9614s implements Function1<AbstractC7264g0, AbstractC7264g0> {

        /* renamed from: j */
        public static final C12518c f32542j = new C12518c();

        C12518c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(AbstractC7264g0 it) {
            C9612q.m13917h(it, "it");
            return it;
        }
    }

    public C12515g() {
        Set m14007d;
        Boolean bool = Boolean.TRUE;
        this.f32516c = m4957m0(bool);
        this.f32517d = m4957m0(bool);
        this.f32518e = m4957m0(EnumC12511e.f32474l);
        Boolean bool2 = Boolean.FALSE;
        this.f32519f = m4957m0(bool2);
        this.f32520g = m4957m0(bool2);
        this.f32521h = m4957m0(bool2);
        this.f32522i = m4957m0(bool2);
        this.f32523j = m4957m0(bool2);
        this.f32524k = m4957m0(bool);
        this.f32525l = m4957m0(bool2);
        this.f32526m = m4957m0(bool2);
        this.f32527n = m4957m0(bool2);
        this.f32528o = m4957m0(bool);
        this.f32529p = m4957m0(bool);
        this.f32530q = m4957m0(bool2);
        this.f32531r = m4957m0(bool2);
        this.f32532s = m4957m0(bool2);
        this.f32533t = m4957m0(bool2);
        this.f32534u = m4957m0(bool2);
        this.f32535v = m4957m0(bool2);
        this.f32536w = m4957m0(bool2);
        this.f32537x = m4957m0(C12518c.f32542j);
        this.f32538y = m4957m0(C12516a.f32540j);
        this.f32539z = m4957m0(bool);
        this.f32491A = m4957m0(EnumC12521j.RENDER_OPEN);
        this.f32492B = m4957m0(AbstractC12485c.InterfaceC12498l.C12499a.f32457a);
        this.f32493C = m4957m0(EnumC12524m.PLAIN);
        this.f32494D = m4957m0(EnumC12522k.ALL);
        this.f32495E = m4957m0(bool2);
        this.f32496F = m4957m0(bool2);
        this.f32497G = m4957m0(EnumC12523l.DEBUG);
        this.f32498H = m4957m0(bool2);
        this.f32499I = m4957m0(bool2);
        m14007d = C9560w.m14007d();
        this.f32500J = m4957m0(m14007d);
        this.f32501K = m4957m0(C12519h.f32543a.m4941a());
        this.f32502L = m4957m0(null);
        this.f32503M = m4957m0(EnumC12480a.NO_ARGUMENTS);
        this.f32504N = m4957m0(bool2);
        this.f32505O = m4957m0(bool);
        this.f32506P = m4957m0(bool);
        this.f32507Q = m4957m0(bool2);
        this.f32508R = m4957m0(bool);
        this.f32509S = m4957m0(bool);
        this.f32510T = m4957m0(bool2);
        this.f32511U = m4957m0(bool2);
        this.f32512V = m4957m0(bool2);
        this.f32513W = m4957m0(bool);
    }

    /* renamed from: m0 */
    private final <T> ReadWriteProperty<C12515g, T> m4957m0(T t) {
        C9622a c9622a = C9622a.f25358a;
        return new C12517b(t, this);
    }

    /* renamed from: A */
    public boolean m5008A() {
        return ((Boolean) this.f32508R.getValue(this, f32490X[42])).booleanValue();
    }

    /* renamed from: B */
    public boolean m5007B() {
        return InterfaceC12513f.C12514a.m5010a(this);
    }

    /* renamed from: C */
    public boolean m5006C() {
        return InterfaceC12513f.C12514a.m5009b(this);
    }

    /* renamed from: D */
    public boolean m5005D() {
        return ((Boolean) this.f32534u.getValue(this, f32490X[19])).booleanValue();
    }

    /* renamed from: E */
    public boolean m5004E() {
        return ((Boolean) this.f32513W.getValue(this, f32490X[47])).booleanValue();
    }

    /* renamed from: F */
    public Set<EnumC12511e> m5003F() {
        return (Set) this.f32518e.getValue(this, f32490X[3]);
    }

    /* renamed from: G */
    public boolean m5002G() {
        return ((Boolean) this.f32527n.getValue(this, f32490X[12])).booleanValue();
    }

    /* renamed from: H */
    public EnumC12521j m5001H() {
        return (EnumC12521j) this.f32491A.getValue(this, f32490X[25]);
    }

    /* renamed from: I */
    public EnumC12522k m5000I() {
        return (EnumC12522k) this.f32494D.getValue(this, f32490X[28]);
    }

    /* renamed from: J */
    public boolean m4999J() {
        return ((Boolean) this.f32509S.getValue(this, f32490X[43])).booleanValue();
    }

    /* renamed from: K */
    public boolean m4998K() {
        return ((Boolean) this.f32511U.getValue(this, f32490X[45])).booleanValue();
    }

    /* renamed from: L */
    public EnumC12523l m4997L() {
        return (EnumC12523l) this.f32497G.getValue(this, f32490X[31]);
    }

    /* renamed from: M */
    public boolean m4996M() {
        return ((Boolean) this.f32495E.getValue(this, f32490X[29])).booleanValue();
    }

    /* renamed from: N */
    public boolean m4995N() {
        return ((Boolean) this.f32496F.getValue(this, f32490X[30])).booleanValue();
    }

    /* renamed from: O */
    public boolean m4994O() {
        return ((Boolean) this.f32530q.getValue(this, f32490X[15])).booleanValue();
    }

    /* renamed from: P */
    public boolean m4993P() {
        return ((Boolean) this.f32505O.getValue(this, f32490X[39])).booleanValue();
    }

    /* renamed from: Q */
    public boolean m4992Q() {
        return ((Boolean) this.f32498H.getValue(this, f32490X[32])).booleanValue();
    }

    /* renamed from: R */
    public boolean m4991R() {
        return ((Boolean) this.f32529p.getValue(this, f32490X[14])).booleanValue();
    }

    /* renamed from: S */
    public boolean m4990S() {
        return ((Boolean) this.f32528o.getValue(this, f32490X[13])).booleanValue();
    }

    /* renamed from: T */
    public boolean m4989T() {
        return ((Boolean) this.f32531r.getValue(this, f32490X[16])).booleanValue();
    }

    /* renamed from: U */
    public boolean m4988U() {
        return ((Boolean) this.f32507Q.getValue(this, f32490X[41])).booleanValue();
    }

    /* renamed from: V */
    public boolean m4987V() {
        return ((Boolean) this.f32506P.getValue(this, f32490X[40])).booleanValue();
    }

    /* renamed from: W */
    public boolean m4986W() {
        return ((Boolean) this.f32539z.getValue(this, f32490X[24])).booleanValue();
    }

    /* renamed from: X */
    public boolean m4985X() {
        return ((Boolean) this.f32520g.getValue(this, f32490X[5])).booleanValue();
    }

    /* renamed from: Y */
    public boolean m4984Y() {
        return ((Boolean) this.f32519f.getValue(this, f32490X[4])).booleanValue();
    }

    /* renamed from: Z */
    public EnumC12524m m4983Z() {
        return (EnumC12524m) this.f32493C.getValue(this, f32490X[27]);
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: a */
    public void mo4982a(EnumC12522k enumC12522k) {
        C9612q.m13917h(enumC12522k, "<set-?>");
        this.f32494D.setValue(this, f32490X[28], enumC12522k);
    }

    /* renamed from: a0 */
    public Function1<AbstractC7264g0, AbstractC7264g0> m4981a0() {
        return (Function1) this.f32537x.getValue(this, f32490X[22]);
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: b */
    public void mo4980b(boolean z) {
        this.f32519f.setValue(this, f32490X[4], Boolean.valueOf(z));
    }

    /* renamed from: b0 */
    public boolean m4979b0() {
        return ((Boolean) this.f32533t.getValue(this, f32490X[18])).booleanValue();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: c */
    public void mo4978c(EnumC12524m enumC12524m) {
        C9612q.m13917h(enumC12524m, "<set-?>");
        this.f32493C.setValue(this, f32490X[27], enumC12524m);
    }

    /* renamed from: c0 */
    public boolean m4977c0() {
        return ((Boolean) this.f32524k.getValue(this, f32490X[9])).booleanValue();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: d */
    public void mo4976d(boolean z) {
        this.f32516c.setValue(this, f32490X[1], Boolean.valueOf(z));
    }

    /* renamed from: d0 */
    public AbstractC12485c.InterfaceC12498l m4975d0() {
        return (AbstractC12485c.InterfaceC12498l) this.f32492B.getValue(this, f32490X[26]);
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: e */
    public boolean mo4974e() {
        return ((Boolean) this.f32526m.getValue(this, f32490X[11])).booleanValue();
    }

    /* renamed from: e0 */
    public boolean m4973e0() {
        return ((Boolean) this.f32523j.getValue(this, f32490X[8])).booleanValue();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: f */
    public void mo4972f(boolean z) {
        this.f32536w.setValue(this, f32490X[21], Boolean.valueOf(z));
    }

    /* renamed from: f0 */
    public boolean m4971f0() {
        return ((Boolean) this.f32516c.getValue(this, f32490X[1])).booleanValue();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: g */
    public void mo4970g(boolean z) {
        this.f32495E.setValue(this, f32490X[29], Boolean.valueOf(z));
    }

    /* renamed from: g0 */
    public boolean m4969g0() {
        return ((Boolean) this.f32517d.getValue(this, f32490X[2])).booleanValue();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: h */
    public Set<C11633c> mo4968h() {
        return (Set) this.f32501K.getValue(this, f32490X[35]);
    }

    /* renamed from: h0 */
    public boolean m4967h0() {
        return ((Boolean) this.f32525l.getValue(this, f32490X[10])).booleanValue();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: i */
    public boolean mo4966i() {
        return ((Boolean) this.f32521h.getValue(this, f32490X[6])).booleanValue();
    }

    /* renamed from: i0 */
    public boolean m4965i0() {
        return ((Boolean) this.f32536w.getValue(this, f32490X[21])).booleanValue();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: j */
    public EnumC12480a mo4964j() {
        return (EnumC12480a) this.f32503M.getValue(this, f32490X[37]);
    }

    /* renamed from: j0 */
    public boolean m4963j0() {
        return ((Boolean) this.f32535v.getValue(this, f32490X[20])).booleanValue();
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: k */
    public void mo4962k(Set<C11633c> set) {
        C9612q.m13917h(set, "<set-?>");
        this.f32501K.setValue(this, f32490X[35], set);
    }

    /* renamed from: k0 */
    public final boolean m4961k0() {
        return this.f32514a;
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: l */
    public void mo4960l(InterfaceC12481b interfaceC12481b) {
        C9612q.m13917h(interfaceC12481b, "<set-?>");
        this.f32515b.setValue(this, f32490X[0], interfaceC12481b);
    }

    /* renamed from: l0 */
    public final void m4959l0() {
        this.f32514a = true;
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: m */
    public void mo4958m(Set<? extends EnumC12511e> set) {
        C9612q.m13917h(set, "<set-?>");
        this.f32518e.setValue(this, f32490X[3], set);
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: n */
    public void mo4956n(boolean z) {
        this.f32521h.setValue(this, f32490X[6], Boolean.valueOf(z));
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: o */
    public void mo4955o(boolean z) {
        this.f32496F.setValue(this, f32490X[30], Boolean.valueOf(z));
    }

    @Override // sh.InterfaceC12513f
    /* renamed from: p */
    public void mo4954p(boolean z) {
        this.f32535v.setValue(this, f32490X[20], Boolean.valueOf(z));
    }

    /* renamed from: q */
    public final C12515g m4953q() {
        AbstractC9624c abstractC9624c;
        boolean z;
        C12515g c12515g = new C12515g();
        Field[] declaredFields = C12515g.class.getDeclaredFields();
        C9612q.m13918g(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                if (obj instanceof AbstractC9624c) {
                    abstractC9624c = (AbstractC9624c) obj;
                } else {
                    abstractC9624c = null;
                }
                if (abstractC9624c != null) {
                    String name = field.getName();
                    C9612q.m13918g(name, "field.name");
                    C9653o.m13758H(name, "is", false, 2, null);
                    KClass m13969b = C9591f0.m13969b(C12515g.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    C9612q.m13918g(name3, "field.name");
                    if (name3.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    sb2.append(name3);
                    field.set(c12515g, c12515g.m4957m0(abstractC9624c.getValue(this, new C9584c0(m13969b, name2, sb2.toString()))));
                }
            }
        }
        return c12515g;
    }

    /* renamed from: r */
    public boolean m4952r() {
        return ((Boolean) this.f32532s.getValue(this, f32490X[17])).booleanValue();
    }

    /* renamed from: s */
    public boolean m4951s() {
        return ((Boolean) this.f32504N.getValue(this, f32490X[38])).booleanValue();
    }

    /* renamed from: t */
    public Function1<InterfaceC12149c, Boolean> m4950t() {
        return (Function1) this.f32502L.getValue(this, f32490X[36]);
    }

    /* renamed from: u */
    public boolean m4949u() {
        return ((Boolean) this.f32512V.getValue(this, f32490X[46])).booleanValue();
    }

    /* renamed from: v */
    public boolean m4948v() {
        return ((Boolean) this.f32522i.getValue(this, f32490X[7])).booleanValue();
    }

    /* renamed from: w */
    public InterfaceC12481b m4947w() {
        return (InterfaceC12481b) this.f32515b.getValue(this, f32490X[0]);
    }

    /* renamed from: x */
    public Function1<InterfaceC11936j1, String> m4946x() {
        return (Function1) this.f32538y.getValue(this, f32490X[23]);
    }

    /* renamed from: y */
    public boolean m4945y() {
        return ((Boolean) this.f32499I.getValue(this, f32490X[33])).booleanValue();
    }

    /* renamed from: z */
    public Set<C11633c> m4944z() {
        return (Set) this.f32500J.getValue(this, f32490X[34]);
    }
}
