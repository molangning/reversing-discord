package p070di;

import fi.InterfaceC6449f;
import gi.InterfaceC6821n;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import mh.AbstractC10456a;
import mh.C10468g;
import mh.C10469h;
import mh.InterfaceC10463c;
import p142hi.InterfaceC7222b1;
import p161ii.InterfaceC7602l;
import p305qg.C11938k0;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11948m0;
import p325rg.InterfaceC12149c;
import p326rh.C12183g;
import p389vh.AbstractC13301g;
import p448yg.InterfaceC14021c;
import p469zh.InterfaceC14268a;
import ph.C11632b;
import sg.InterfaceC12471a;
import sg.InterfaceC12473b;
import sg.InterfaceC12474c;
import sg.InterfaceC12478e;

/* renamed from: di.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5939k {

    /* renamed from: a */
    private final InterfaceC6821n f16912a;

    /* renamed from: b */
    private final InterfaceC11928h0 f16913b;

    /* renamed from: c */
    private final InterfaceC5940l f16914c;

    /* renamed from: d */
    private final InterfaceC5931h f16915d;

    /* renamed from: e */
    private final InterfaceC5915c<InterfaceC12149c, AbstractC13301g<?>> f16916e;

    /* renamed from: f */
    private final InterfaceC11948m0 f16917f;

    /* renamed from: g */
    private final InterfaceC5956v f16918g;

    /* renamed from: h */
    private final InterfaceC5950r f16919h;

    /* renamed from: i */
    private final InterfaceC14021c f16920i;

    /* renamed from: j */
    private final InterfaceC5952s f16921j;

    /* renamed from: k */
    private final Iterable<InterfaceC12473b> f16922k;

    /* renamed from: l */
    private final C11938k0 f16923l;

    /* renamed from: m */
    private final InterfaceC5936j f16924m;

    /* renamed from: n */
    private final InterfaceC12471a f16925n;

    /* renamed from: o */
    private final InterfaceC12474c f16926o;

    /* renamed from: p */
    private final C12183g f16927p;

    /* renamed from: q */
    private final InterfaceC7602l f16928q;

    /* renamed from: r */
    private final InterfaceC14268a f16929r;

    /* renamed from: s */
    private final InterfaceC12478e f16930s;

    /* renamed from: t */
    private final List<InterfaceC7222b1> f16931t;

    /* renamed from: u */
    private final C5932i f16932u;

    /* JADX WARN: Multi-variable type inference failed */
    public C5939k(InterfaceC6821n storageManager, InterfaceC11928h0 moduleDescriptor, InterfaceC5940l configuration, InterfaceC5931h classDataFinder, InterfaceC5915c<? extends InterfaceC12149c, ? extends AbstractC13301g<?>> annotationAndConstantLoader, InterfaceC11948m0 packageFragmentProvider, InterfaceC5956v localClassifierTypeSettings, InterfaceC5950r errorReporter, InterfaceC14021c lookupTracker, InterfaceC5952s flexibleTypeDeserializer, Iterable<? extends InterfaceC12473b> fictitiousClassDescriptorFactories, C11938k0 notFoundClasses, InterfaceC5936j contractDeserializer, InterfaceC12471a additionalClassPartsProvider, InterfaceC12474c platformDependentDeclarationFilter, C12183g extensionRegistryLite, InterfaceC7602l kotlinTypeChecker, InterfaceC14268a samConversionResolver, InterfaceC12478e platformDependentTypeTransformer, List<? extends InterfaceC7222b1> typeAttributeTranslators) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(moduleDescriptor, "moduleDescriptor");
        C9612q.m13917h(configuration, "configuration");
        C9612q.m13917h(classDataFinder, "classDataFinder");
        C9612q.m13917h(annotationAndConstantLoader, "annotationAndConstantLoader");
        C9612q.m13917h(packageFragmentProvider, "packageFragmentProvider");
        C9612q.m13917h(localClassifierTypeSettings, "localClassifierTypeSettings");
        C9612q.m13917h(errorReporter, "errorReporter");
        C9612q.m13917h(lookupTracker, "lookupTracker");
        C9612q.m13917h(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        C9612q.m13917h(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        C9612q.m13917h(notFoundClasses, "notFoundClasses");
        C9612q.m13917h(contractDeserializer, "contractDeserializer");
        C9612q.m13917h(additionalClassPartsProvider, "additionalClassPartsProvider");
        C9612q.m13917h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C9612q.m13917h(extensionRegistryLite, "extensionRegistryLite");
        C9612q.m13917h(kotlinTypeChecker, "kotlinTypeChecker");
        C9612q.m13917h(samConversionResolver, "samConversionResolver");
        C9612q.m13917h(platformDependentTypeTransformer, "platformDependentTypeTransformer");
        C9612q.m13917h(typeAttributeTranslators, "typeAttributeTranslators");
        this.f16912a = storageManager;
        this.f16913b = moduleDescriptor;
        this.f16914c = configuration;
        this.f16915d = classDataFinder;
        this.f16916e = annotationAndConstantLoader;
        this.f16917f = packageFragmentProvider;
        this.f16918g = localClassifierTypeSettings;
        this.f16919h = errorReporter;
        this.f16920i = lookupTracker;
        this.f16921j = flexibleTypeDeserializer;
        this.f16922k = fictitiousClassDescriptorFactories;
        this.f16923l = notFoundClasses;
        this.f16924m = contractDeserializer;
        this.f16925n = additionalClassPartsProvider;
        this.f16926o = platformDependentDeclarationFilter;
        this.f16927p = extensionRegistryLite;
        this.f16928q = kotlinTypeChecker;
        this.f16929r = samConversionResolver;
        this.f16930s = platformDependentTypeTransformer;
        this.f16931t = typeAttributeTranslators;
        this.f16932u = new C5932i(this);
    }

    /* renamed from: a */
    public final C5942m m24131a(InterfaceC11945l0 descriptor, InterfaceC10463c nameResolver, C10468g typeTable, C10469h versionRequirementTable, AbstractC10456a metadataVersion, InterfaceC6449f interfaceC6449f) {
        List m14104i;
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        C9612q.m13917h(versionRequirementTable, "versionRequirementTable");
        C9612q.m13917h(metadataVersion, "metadataVersion");
        m14104i = C9545j.m14104i();
        return new C5942m(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, interfaceC6449f, null, m14104i);
    }

    /* renamed from: b */
    public final InterfaceC11914e m24130b(C11632b classId) {
        C9612q.m13917h(classId, "classId");
        return C5932i.m24138e(this.f16932u, classId, null, 2, null);
    }

    /* renamed from: c */
    public final InterfaceC12471a m24129c() {
        return this.f16925n;
    }

    /* renamed from: d */
    public final InterfaceC5915c<InterfaceC12149c, AbstractC13301g<?>> m24128d() {
        return this.f16916e;
    }

    /* renamed from: e */
    public final InterfaceC5931h m24127e() {
        return this.f16915d;
    }

    /* renamed from: f */
    public final C5932i m24126f() {
        return this.f16932u;
    }

    /* renamed from: g */
    public final InterfaceC5940l m24125g() {
        return this.f16914c;
    }

    /* renamed from: h */
    public final InterfaceC5936j m24124h() {
        return this.f16924m;
    }

    /* renamed from: i */
    public final InterfaceC5950r m24123i() {
        return this.f16919h;
    }

    /* renamed from: j */
    public final C12183g m24122j() {
        return this.f16927p;
    }

    /* renamed from: k */
    public final Iterable<InterfaceC12473b> m24121k() {
        return this.f16922k;
    }

    /* renamed from: l */
    public final InterfaceC5952s m24120l() {
        return this.f16921j;
    }

    /* renamed from: m */
    public final InterfaceC7602l m24119m() {
        return this.f16928q;
    }

    /* renamed from: n */
    public final InterfaceC5956v m24118n() {
        return this.f16918g;
    }

    /* renamed from: o */
    public final InterfaceC14021c m24117o() {
        return this.f16920i;
    }

    /* renamed from: p */
    public final InterfaceC11928h0 m24116p() {
        return this.f16913b;
    }

    /* renamed from: q */
    public final C11938k0 m24115q() {
        return this.f16923l;
    }

    /* renamed from: r */
    public final InterfaceC11948m0 m24114r() {
        return this.f16917f;
    }

    /* renamed from: s */
    public final InterfaceC12474c m24113s() {
        return this.f16926o;
    }

    /* renamed from: t */
    public final InterfaceC12478e m24112t() {
        return this.f16930s;
    }

    /* renamed from: u */
    public final InterfaceC6821n m24111u() {
        return this.f16912a;
    }

    /* renamed from: v */
    public final List<InterfaceC7222b1> m24110v() {
        return this.f16931t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C5939k(gi.InterfaceC6821n r24, p305qg.InterfaceC11928h0 r25, p070di.InterfaceC5940l r26, p070di.InterfaceC5931h r27, p070di.InterfaceC5915c r28, p305qg.InterfaceC11948m0 r29, p070di.InterfaceC5956v r30, p070di.InterfaceC5950r r31, p448yg.InterfaceC14021c r32, p070di.InterfaceC5952s r33, java.lang.Iterable r34, p305qg.C11938k0 r35, p070di.InterfaceC5936j r36, sg.InterfaceC12471a r37, sg.InterfaceC12474c r38, p326rh.C12183g r39, p161ii.InterfaceC7602l r40, p469zh.InterfaceC14268a r41, sg.InterfaceC12478e r42, java.util.List r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto Lb
            sg.a$a r1 = sg.InterfaceC12471a.C12472a.f32421a
            r16 = r1
            goto Ld
        Lb:
            r16 = r37
        Ld:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L16
            sg.c$a r1 = sg.InterfaceC12474c.C12475a.f32422a
            r17 = r1
            goto L18
        L16:
            r17 = r38
        L18:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L26
            ii.l$a r1 = p161ii.InterfaceC7602l.f20900b
            ii.m r1 = r1.m20258a()
            r19 = r1
            goto L28
        L26:
            r19 = r40
        L28:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L32
            sg.e$a r1 = sg.InterfaceC12478e.C12479a.f32425a
            r21 = r1
            goto L34
        L32:
            r21 = r42
        L34:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L42
            hi.o r0 = p142hi.C7301o.f19732a
            java.util.List r0 = kotlin.collections.C9543h.m14153d(r0)
            r22 = r0
            goto L44
        L42:
            r22 = r43
        L44:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p070di.C5939k.<init>(gi.n, qg.h0, di.l, di.h, di.c, qg.m0, di.v, di.r, yg.c, di.s, java.lang.Iterable, qg.k0, di.j, sg.a, sg.c, rh.g, ii.l, zh.a, sg.e, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}