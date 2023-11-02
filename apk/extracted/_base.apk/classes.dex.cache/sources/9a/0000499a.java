package pg;

import gi.InterfaceC6821n;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070di.AbstractC5908a;
import p070di.AbstractC5946p;
import p070di.C5917d;
import p070di.C5939k;
import p070di.C5945o;
import p070di.InterfaceC5936j;
import p070di.InterfaceC5940l;
import p070di.InterfaceC5950r;
import p070di.InterfaceC5952s;
import p070di.InterfaceC5956v;
import p087ei.C6237a;
import p087ei.C6240c;
import p160ih.InterfaceC7559p;
import p161ii.InterfaceC7602l;
import p269og.C11097a;
import p305qg.C11938k0;
import p305qg.InterfaceC11928h0;
import p448yg.InterfaceC14021c;
import p469zh.InterfaceC14268a;
import ph.C11633c;
import sg.InterfaceC12471a;
import sg.InterfaceC12474c;

/* renamed from: pg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11626j extends AbstractC5908a {

    /* renamed from: f */
    public static final C11627a f30184f = new C11627a(null);

    /* renamed from: pg.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11627a {
        private C11627a() {
        }

        public /* synthetic */ C11627a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11626j(InterfaceC6821n storageManager, InterfaceC7559p finder, InterfaceC11928h0 moduleDescriptor, C11938k0 notFoundClasses, InterfaceC12471a additionalClassPartsProvider, InterfaceC12474c platformDependentDeclarationFilter, InterfaceC5940l deserializationConfiguration, InterfaceC7602l kotlinTypeChecker, InterfaceC14268a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        List m14101l;
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(finder, "finder");
        C9612q.m13917h(moduleDescriptor, "moduleDescriptor");
        C9612q.m13917h(notFoundClasses, "notFoundClasses");
        C9612q.m13917h(additionalClassPartsProvider, "additionalClassPartsProvider");
        C9612q.m13917h(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C9612q.m13917h(deserializationConfiguration, "deserializationConfiguration");
        C9612q.m13917h(kotlinTypeChecker, "kotlinTypeChecker");
        C9612q.m13917h(samConversionResolver, "samConversionResolver");
        C5945o c5945o = new C5945o(this);
        C6237a c6237a = C6237a.f17663n;
        C5917d c5917d = new C5917d(moduleDescriptor, notFoundClasses, c6237a);
        InterfaceC5956v.C5957a c5957a = InterfaceC5956v.C5957a.f16961a;
        InterfaceC5950r DO_NOTHING = InterfaceC5950r.f16955a;
        C9612q.m13918g(DO_NOTHING, "DO_NOTHING");
        InterfaceC14021c.C14022a c14022a = InterfaceC14021c.C14022a.f36015a;
        InterfaceC5952s.C5953a c5953a = InterfaceC5952s.C5953a.f16956a;
        m14101l = C9545j.m14101l(new C11097a(storageManager, moduleDescriptor), new C11602e(storageManager, moduleDescriptor, null, 4, null));
        m24189i(new C5939k(storageManager, moduleDescriptor, deserializationConfiguration, c5945o, c5917d, this, c5957a, DO_NOTHING, c14022a, c5953a, m14101l, notFoundClasses, InterfaceC5936j.f16909a.m24133a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c6237a.m32994e(), kotlinTypeChecker, samConversionResolver, null, null, 786432, null));
    }

    @Override // p070di.AbstractC5908a
    /* renamed from: d */
    protected AbstractC5946p mo7484d(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        InputStream mo2848b = m24192f().mo2848b(fqName);
        if (mo2848b != null) {
            return C6240c.f17665x.m23173a(fqName, m24190h(), m24191g(), mo2848b, false);
        }
        return null;
    }
}