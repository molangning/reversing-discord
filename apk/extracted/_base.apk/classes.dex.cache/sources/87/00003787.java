package p160ih;

import ch.C2540b;
import ch.C2546f;
import ch.InterfaceC2541c;
import ch.InterfaceC2551i;
import gh.InterfaceC6760a;
import gi.InterfaceC6821n;
import java.util.List;
import ki.C9473a;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import ng.C10880j;
import p013ah.InterfaceC0168f;
import p013ah.InterfaceC0170g;
import p013ah.InterfaceC0176j;
import p070di.InterfaceC5936j;
import p070di.InterfaceC5940l;
import p070di.InterfaceC5950r;
import p108fh.InterfaceC6425b;
import p141hh.C7161d;
import p141hh.C7200l;
import p142hi.C7301o;
import p160ih.InterfaceC7576x;
import p161ii.C7604m;
import p161ii.InterfaceC7602l;
import p305qg.C11938k0;
import p305qg.InterfaceC11912d1;
import p305qg.InterfaceC11928h0;
import p448yg.InterfaceC14021c;
import p468zg.C14211d;
import p468zg.C14262x;
import p468zg.InterfaceC14247p;
import p468zg.InterfaceC14249q;
import p468zg.InterfaceC14258u;
import p469zh.C14269b;
import ph.C11632b;

/* renamed from: ih.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7542g {

    /* renamed from: ih.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7543a implements InterfaceC14258u {
        C7543a() {
        }

        @Override // p468zg.InterfaceC14258u
        /* renamed from: a */
        public List<InterfaceC6760a> mo299a(C11632b classId) {
            C9612q.m13917h(classId, "classId");
            return null;
        }
    }

    /* renamed from: a */
    public static final C7539f m20460a(InterfaceC11928h0 module, InterfaceC6821n storageManager, C11938k0 notFoundClasses, C2546f lazyJavaPackageFragmentProvider, InterfaceC7559p reflectKotlinClassFinder, C7544h deserializedDescriptorResolver, InterfaceC5950r errorReporter) {
        List m14109d;
        C9612q.m13917h(module, "module");
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(notFoundClasses, "notFoundClasses");
        C9612q.m13917h(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        C9612q.m13917h(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        C9612q.m13917h(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        C9612q.m13917h(errorReporter, "errorReporter");
        C7547i c7547i = new C7547i(reflectKotlinClassFinder, deserializedDescriptorResolver);
        C7532d c7532d = new C7532d(module, notFoundClasses, storageManager, reflectKotlinClassFinder);
        InterfaceC5940l.C5941a c5941a = InterfaceC5940l.C5941a.f16933a;
        InterfaceC14021c.C14022a c14022a = InterfaceC14021c.C14022a.f36015a;
        InterfaceC5936j m24133a = InterfaceC5936j.f16909a.m24133a();
        C7604m m20258a = InterfaceC7602l.f20900b.m20258a();
        m14109d = C9544i.m14109d(C7301o.f19732a);
        return new C7539f(storageManager, module, c5941a, c7547i, c7532d, lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, c14022a, m24133a, m20258a, new C9473a(m14109d));
    }

    /* renamed from: b */
    public static final C2546f m20459b(InterfaceC14247p javaClassFinder, InterfaceC11928h0 module, InterfaceC6821n storageManager, C11938k0 notFoundClasses, InterfaceC7559p reflectKotlinClassFinder, C7544h deserializedDescriptorResolver, InterfaceC5950r errorReporter, InterfaceC6425b javaSourceElementFactory, InterfaceC2551i singleModuleClassResolver, InterfaceC7576x packagePartProvider) {
        List m14104i;
        C9612q.m13917h(javaClassFinder, "javaClassFinder");
        C9612q.m13917h(module, "module");
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(notFoundClasses, "notFoundClasses");
        C9612q.m13917h(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        C9612q.m13917h(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        C9612q.m13917h(errorReporter, "errorReporter");
        C9612q.m13917h(javaSourceElementFactory, "javaSourceElementFactory");
        C9612q.m13917h(singleModuleClassResolver, "singleModuleClassResolver");
        C9612q.m13917h(packagePartProvider, "packagePartProvider");
        InterfaceC0176j DO_NOTHING = InterfaceC0176j.f595a;
        C9612q.m13918g(DO_NOTHING, "DO_NOTHING");
        InterfaceC0170g EMPTY = InterfaceC0170g.f588a;
        C9612q.m13918g(EMPTY, "EMPTY");
        InterfaceC0168f.C0169a c0169a = InterfaceC0168f.C0169a.f587a;
        m14104i = C9545j.m14104i();
        C14269b c14269b = new C14269b(storageManager, m14104i);
        InterfaceC11912d1.C11913a c11913a = InterfaceC11912d1.C11913a.f30912a;
        InterfaceC14021c.C14022a c14022a = InterfaceC14021c.C14022a.f36015a;
        C10880j c10880j = new C10880j(module, notFoundClasses);
        C14262x.C14264b c14264b = C14262x.f36662d;
        C14211d c14211d = new C14211d(c14264b.m280a());
        InterfaceC2541c.C2542a c2542a = InterfaceC2541c.C2542a.f6971a;
        return new C2546f(new C2540b(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, c0169a, c14269b, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, c11913a, c14022a, module, c10880j, c14211d, new C7200l(new C7161d(c2542a)), InterfaceC14249q.C14250a.f36641a, c2542a, InterfaceC7602l.f20900b.m20258a(), c14264b.m280a(), new C7543a(), null, 8388608, null));
    }

    /* renamed from: c */
    public static /* synthetic */ C2546f m20458c(InterfaceC14247p interfaceC14247p, InterfaceC11928h0 interfaceC11928h0, InterfaceC6821n interfaceC6821n, C11938k0 c11938k0, InterfaceC7559p interfaceC7559p, C7544h c7544h, InterfaceC5950r interfaceC5950r, InterfaceC6425b interfaceC6425b, InterfaceC2551i interfaceC2551i, InterfaceC7576x interfaceC7576x, int i, Object obj) {
        InterfaceC7576x.C7577a c7577a;
        if ((i & 512) != 0) {
            c7577a = InterfaceC7576x.C7577a.f20875a;
        } else {
            c7577a = interfaceC7576x;
        }
        return m20459b(interfaceC14247p, interfaceC11928h0, interfaceC6821n, c11938k0, interfaceC7559p, c7544h, interfaceC5950r, interfaceC6425b, interfaceC2551i, c7577a);
    }
}