package p160ih;

import ch.C2546f;
import ch.C2552j;
import gi.C6795f;
import gi.InterfaceC6821n;
import java.util.List;
import ki.C9473a;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC10870h;
import p013ah.InterfaceC0170g;
import p070di.C5939k;
import p070di.InterfaceC5936j;
import p070di.InterfaceC5940l;
import p070di.InterfaceC5950r;
import p070di.InterfaceC5956v;
import p108fh.InterfaceC6425b;
import p161ii.C7604m;
import p161ii.InterfaceC7602l;
import p270oh.C11122i;
import p305qg.C11938k0;
import p305qg.InterfaceC11928h0;
import p326rh.C12183g;
import p448yg.InterfaceC14021c;
import p449yh.C14026c;
import p468zg.InterfaceC14247p;
import p469zh.C14269b;
import pg.C11606f;
import pg.C11615i;
import pg.C11626j;
import ph.C11638f;
import sg.InterfaceC12471a;
import sg.InterfaceC12474c;
import tg.C12704i;
import tg.C12744x;

/* renamed from: ih.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7539f {

    /* renamed from: b */
    public static final C7540a f20829b = new C7540a(null);

    /* renamed from: a */
    private final C5939k f20830a;

    /* renamed from: ih.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7540a {

        /* renamed from: ih.f$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C7541a {

            /* renamed from: a */
            private final C7539f f20831a;

            /* renamed from: b */
            private final C7544h f20832b;

            public C7541a(C7539f deserializationComponentsForJava, C7544h deserializedDescriptorResolver) {
                C9612q.m13917h(deserializationComponentsForJava, "deserializationComponentsForJava");
                C9612q.m13917h(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f20831a = deserializationComponentsForJava;
                this.f20832b = deserializedDescriptorResolver;
            }

            /* renamed from: a */
            public final C7539f m20462a() {
                return this.f20831a;
            }

            /* renamed from: b */
            public final C7544h m20461b() {
                return this.f20832b;
            }
        }

        private C7540a() {
        }

        public /* synthetic */ C7540a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7541a m20463a(InterfaceC7559p kotlinClassFinder, InterfaceC7559p jvmBuiltInsKotlinClassFinder, InterfaceC14247p javaClassFinder, String moduleName, InterfaceC5950r errorReporter, InterfaceC6425b javaSourceElementFactory) {
            List m14104i;
            List m14101l;
            C9612q.m13917h(kotlinClassFinder, "kotlinClassFinder");
            C9612q.m13917h(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            C9612q.m13917h(javaClassFinder, "javaClassFinder");
            C9612q.m13917h(moduleName, "moduleName");
            C9612q.m13917h(errorReporter, "errorReporter");
            C9612q.m13917h(javaSourceElementFactory, "javaSourceElementFactory");
            C6795f c6795f = new C6795f("DeserializationComponentsForJava.ModuleData");
            C11606f c11606f = new C11606f(c6795f, C11606f.EnumC11607a.FROM_DEPENDENCIES);
            C11638f m7419i = C11638f.m7419i('<' + moduleName + '>');
            C9612q.m13918g(m7419i, "special(\"<$moduleName>\")");
            C12744x c12744x = new C12744x(m7419i, c6795f, c11606f, null, null, null, 56, null);
            c11606f.m9847D0(c12744x);
            c11606f.m7524I0(c12744x, true);
            C7544h c7544h = new C7544h();
            C2552j c2552j = new C2552j();
            C11938k0 c11938k0 = new C11938k0(c6795f, c12744x);
            C2546f m20458c = C7542g.m20458c(javaClassFinder, c12744x, c6795f, c11938k0, kotlinClassFinder, c7544h, errorReporter, javaSourceElementFactory, c2552j, null, 512, null);
            C7539f m20460a = C7542g.m20460a(c12744x, c6795f, c11938k0, m20458c, kotlinClassFinder, c7544h, errorReporter);
            c7544h.m20445m(m20460a);
            InterfaceC0170g EMPTY = InterfaceC0170g.f588a;
            C9612q.m13918g(EMPTY, "EMPTY");
            C14026c c14026c = new C14026c(m20458c, EMPTY);
            c2552j.m33000c(c14026c);
            C11615i m7525H0 = c11606f.m7525H0();
            C11615i m7525H02 = c11606f.m7525H0();
            InterfaceC5940l.C5941a c5941a = InterfaceC5940l.C5941a.f16933a;
            C7604m m20258a = InterfaceC7602l.f20900b.m20258a();
            m14104i = C9545j.m14104i();
            C11626j c11626j = new C11626j(c6795f, jvmBuiltInsKotlinClassFinder, c12744x, c11938k0, m7525H0, m7525H02, c5941a, m20258a, new C14269b(c6795f, m14104i));
            c12744x.m4195Y0(c12744x);
            m14101l = C9545j.m14101l(c14026c.m889a(), c11626j);
            c12744x.m4201S0(new C12704i(m14101l, "CompositeProvider@RuntimeModuleData for " + c12744x));
            return new C7541a(m20460a, c7544h);
        }
    }

    public C7539f(InterfaceC6821n storageManager, InterfaceC11928h0 moduleDescriptor, InterfaceC5940l configuration, C7547i classDataFinder, C7532d annotationAndConstantLoader, C2546f packageFragmentProvider, C11938k0 notFoundClasses, InterfaceC5950r errorReporter, InterfaceC14021c lookupTracker, InterfaceC5936j contractDeserializer, InterfaceC7602l kotlinTypeChecker, C9473a typeAttributeTranslators) {
        C11606f c11606f;
        List m14104i;
        InterfaceC12471a interfaceC12471a;
        List m14104i2;
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(moduleDescriptor, "moduleDescriptor");
        C9612q.m13917h(configuration, "configuration");
        C9612q.m13917h(classDataFinder, "classDataFinder");
        C9612q.m13917h(annotationAndConstantLoader, "annotationAndConstantLoader");
        C9612q.m13917h(packageFragmentProvider, "packageFragmentProvider");
        C9612q.m13917h(notFoundClasses, "notFoundClasses");
        C9612q.m13917h(errorReporter, "errorReporter");
        C9612q.m13917h(lookupTracker, "lookupTracker");
        C9612q.m13917h(contractDeserializer, "contractDeserializer");
        C9612q.m13917h(kotlinTypeChecker, "kotlinTypeChecker");
        C9612q.m13917h(typeAttributeTranslators, "typeAttributeTranslators");
        AbstractC10870h mo4194n = moduleDescriptor.mo4194n();
        if (mo4194n instanceof C11606f) {
            c11606f = (C11606f) mo4194n;
        } else {
            c11606f = null;
        }
        InterfaceC5956v.C5957a c5957a = InterfaceC5956v.C5957a.f16961a;
        C7548j c7548j = C7548j.f20843a;
        m14104i = C9545j.m14104i();
        InterfaceC12471a interfaceC12471a2 = (c11606f == null || (interfaceC12471a = c11606f.m7525H0()) == null) ? InterfaceC12471a.C12472a.f32421a : interfaceC12471a;
        InterfaceC12474c interfaceC12474c = (c11606f == null || (interfaceC12474c = c11606f.m7525H0()) == null) ? InterfaceC12474c.C12476b.f32423a : interfaceC12474c;
        C12183g m9133a = C11122i.f29099a.m9133a();
        m14104i2 = C9545j.m14104i();
        this.f20830a = new C5939k(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, c5957a, errorReporter, lookupTracker, c7548j, m14104i, notFoundClasses, contractDeserializer, interfaceC12471a2, interfaceC12474c, m9133a, kotlinTypeChecker, new C14269b(storageManager, m14104i2), null, typeAttributeTranslators.m14684a(), 262144, null);
    }

    /* renamed from: a */
    public final C5939k m20464a() {
        return this.f20830a;
    }
}