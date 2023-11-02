package p087ei;

import gi.InterfaceC6821n;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KDeclarationContainer;
import ng.C10884k;
import ng.InterfaceC10860a;
import p070di.C5917d;
import p070di.C5939k;
import p070di.C5945o;
import p070di.InterfaceC5936j;
import p070di.InterfaceC5940l;
import p070di.InterfaceC5950r;
import p070di.InterfaceC5952s;
import p070di.InterfaceC5956v;
import p305qg.C11938k0;
import p305qg.C11960n0;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11948m0;
import p326rh.C12183g;
import p448yg.InterfaceC14021c;
import p469zh.C14269b;
import ph.C11633c;
import sg.InterfaceC12471a;
import sg.InterfaceC12473b;
import sg.InterfaceC12474c;

/* renamed from: ei.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6238b implements InterfaceC10860a {

    /* renamed from: b */
    private final C6242d f17664b = new C6242d();

    /* renamed from: ei.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    /* synthetic */ class C6239a extends C9605m implements Function1<String, InputStream> {
        C6239a(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InputStream invoke(String p0) {
            C9612q.m13917h(p0, "p0");
            return ((C6242d) this.receiver).m23172a(p0);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C6242d.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }
    }

    @Override // ng.InterfaceC10860a
    /* renamed from: a */
    public InterfaceC11948m0 mo9882a(InterfaceC6821n storageManager, InterfaceC11928h0 builtInsModule, Iterable<? extends InterfaceC12473b> classDescriptorFactories, InterfaceC12474c platformDependentDeclarationFilter, InterfaceC12471a additionalClassPartsProvider, boolean z) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(builtInsModule, "builtInsModule");
        C9612q.m13917h(classDescriptorFactories, "classDescriptorFactories");
        C9612q.m13917h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C9612q.m13917h(additionalClassPartsProvider, "additionalClassPartsProvider");
        return m23175b(storageManager, builtInsModule, C10884k.f28407A, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z, new C6239a(this.f17664b));
    }

    /* renamed from: b */
    public final InterfaceC11948m0 m23175b(InterfaceC6821n storageManager, InterfaceC11928h0 module, Set<C11633c> packageFqNames, Iterable<? extends InterfaceC12473b> classDescriptorFactories, InterfaceC12474c platformDependentDeclarationFilter, InterfaceC12471a additionalClassPartsProvider, boolean z, Function1<? super String, ? extends InputStream> loadResource) {
        int m14093t;
        List m14104i;
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(module, "module");
        C9612q.m13917h(packageFqNames, "packageFqNames");
        C9612q.m13917h(classDescriptorFactories, "classDescriptorFactories");
        C9612q.m13917h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C9612q.m13917h(additionalClassPartsProvider, "additionalClassPartsProvider");
        C9612q.m13917h(loadResource, "loadResource");
        m14093t = C9546k.m14093t(packageFqNames, 10);
        ArrayList<C6240c> arrayList = new ArrayList(m14093t);
        for (C11633c c11633c : packageFqNames) {
            String m23177n = C6237a.f17663n.m23177n(c11633c);
            InputStream invoke = loadResource.invoke(m23177n);
            if (invoke != null) {
                arrayList.add(C6240c.f17665x.m23173a(c11633c, storageManager, module, invoke, z));
            } else {
                throw new IllegalStateException("Resource not found in classpath: " + m23177n);
            }
        }
        C11960n0 c11960n0 = new C11960n0(arrayList);
        C11938k0 c11938k0 = new C11938k0(storageManager, module);
        InterfaceC5940l.C5941a c5941a = InterfaceC5940l.C5941a.f16933a;
        C5945o c5945o = new C5945o(c11960n0);
        C6237a c6237a = C6237a.f17663n;
        C5917d c5917d = new C5917d(module, c11938k0, c6237a);
        InterfaceC5956v.C5957a c5957a = InterfaceC5956v.C5957a.f16961a;
        InterfaceC5950r DO_NOTHING = InterfaceC5950r.f16955a;
        C9612q.m13918g(DO_NOTHING, "DO_NOTHING");
        InterfaceC14021c.C14022a c14022a = InterfaceC14021c.C14022a.f36015a;
        InterfaceC5952s.C5953a c5953a = InterfaceC5952s.C5953a.f16956a;
        InterfaceC5936j m24133a = InterfaceC5936j.f16909a.m24133a();
        C12183g m32994e = c6237a.m32994e();
        m14104i = C9545j.m14104i();
        C5939k c5939k = new C5939k(storageManager, module, c5941a, c5945o, c5917d, c11960n0, c5957a, DO_NOTHING, c14022a, c5953a, classDescriptorFactories, c11938k0, m24133a, additionalClassPartsProvider, platformDependentDeclarationFilter, m32994e, null, new C14269b(storageManager, m14104i), null, null, 851968, null);
        for (C6240c c6240c : arrayList) {
            c6240c.mo24088L0(c5939k);
        }
        return c11960n0;
    }
}
