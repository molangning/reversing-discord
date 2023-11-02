package p070di;

import kotlin.jvm.internal.C9612q;
import p305qg.C11965o0;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11948m0;
import ph.C11632b;
import ph.C11633c;

/* renamed from: di.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5945o implements InterfaceC5931h {

    /* renamed from: a */
    private final InterfaceC11948m0 f16945a;

    public C5945o(InterfaceC11948m0 packageFragmentProvider) {
        C9612q.m13917h(packageFragmentProvider, "packageFragmentProvider");
        this.f16945a = packageFragmentProvider;
    }

    @Override // p070di.InterfaceC5931h
    /* renamed from: a */
    public C5930g mo20442a(C11632b classId) {
        C5930g mo20442a;
        C9612q.m13917h(classId, "classId");
        InterfaceC11948m0 interfaceC11948m0 = this.f16945a;
        C11633c m7465h = classId.m7465h();
        C9612q.m13918g(m7465h, "classId.packageFqName");
        for (InterfaceC11945l0 interfaceC11945l0 : C11965o0.m6685c(interfaceC11948m0, m7465h)) {
            if ((interfaceC11945l0 instanceof AbstractC5946p) && (mo20442a = ((AbstractC5946p) interfaceC11945l0).mo24089G0().mo20442a(classId)) != null) {
                return mo20442a;
            }
        }
        return null;
    }
}
