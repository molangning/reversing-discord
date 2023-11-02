package p468zg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KDeclarationContainer;
import ph.C11633c;

/* renamed from: zg.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14262x {

    /* renamed from: d */
    public static final C14264b f36662d = new C14264b(null);

    /* renamed from: e */
    private static final C14262x f36663e = new C14262x(C14259v.m297b(null, 1, null), C14263a.f36667j);

    /* renamed from: a */
    private final C14266z f36664a;

    /* renamed from: b */
    private final Function1<C11633c, EnumC14223g0> f36665b;

    /* renamed from: c */
    private final boolean f36666c;

    /* renamed from: zg.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    /* synthetic */ class C14263a extends C9605m implements Function1<C11633c, EnumC14223g0> {

        /* renamed from: j */
        public static final C14263a f36667j = new C14263a();

        C14263a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final EnumC14223g0 invoke(C11633c p0) {
            C9612q.m13917h(p0, "p0");
            return C14259v.m295d(p0);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13967d(C14259v.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }
    }

    /* renamed from: zg.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14264b {
        private C14264b() {
        }

        public /* synthetic */ C14264b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14262x m280a() {
            return C14262x.f36663e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14262x(C14266z jsr305, Function1<? super C11633c, ? extends EnumC14223g0> getReportLevelForAnnotation) {
        boolean z;
        C9612q.m13917h(jsr305, "jsr305");
        C9612q.m13917h(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f36664a = jsr305;
        this.f36665b = getReportLevelForAnnotation;
        if (!jsr305.m274d() && getReportLevelForAnnotation.invoke(C14259v.m294e()) != EnumC14223g0.IGNORE) {
            z = false;
        } else {
            z = true;
        }
        this.f36666c = z;
    }

    /* renamed from: b */
    public final boolean m284b() {
        return this.f36666c;
    }

    /* renamed from: c */
    public final Function1<C11633c, EnumC14223g0> m283c() {
        return this.f36665b;
    }

    /* renamed from: d */
    public final C14266z m282d() {
        return this.f36664a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f36664a + ", getReportLevelForAnnotation=" + this.f36665b + ')';
    }
}
