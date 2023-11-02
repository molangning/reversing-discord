package p070di;

import ai.InterfaceC0194h;
import fi.C6473i;
import fi.InterfaceC6449f;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import kh.C9419l;
import kh.C9422m;
import kh.C9428o;
import kh.C9436p;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import mh.AbstractC10456a;
import mh.C10464d;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11928h0;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;

/* renamed from: di.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC5947q extends AbstractC5946p {

    /* renamed from: q */
    private final AbstractC10456a f16947q;

    /* renamed from: r */
    private final InterfaceC6449f f16948r;

    /* renamed from: s */
    private final C10464d f16949s;

    /* renamed from: t */
    private final C5968y f16950t;

    /* renamed from: u */
    private C9422m f16951u;

    /* renamed from: v */
    private InterfaceC0194h f16952v;

    /* renamed from: di.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C5948a extends AbstractC9614s implements Function1<C11632b, InterfaceC11900a1> {
        C5948a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11900a1 invoke(C11632b it) {
            C9612q.m13917h(it, "it");
            InterfaceC6449f interfaceC6449f = AbstractC5947q.this.f16948r;
            if (interfaceC6449f == null) {
                InterfaceC11900a1 NO_SOURCE = InterfaceC11900a1.f30901a;
                C9612q.m13918g(NO_SOURCE, "NO_SOURCE");
                return NO_SOURCE;
            }
            return interfaceC6449f;
        }
    }

    /* renamed from: di.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C5949b extends AbstractC9614s implements Function0<Collection<? extends C11638f>> {
        C5949b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Collection<C11638f> invoke() {
            int m14093t;
            boolean z;
            Collection<C11632b> m24060b = AbstractC5947q.this.mo24089G0().m24060b();
            ArrayList<C11632b> arrayList = new ArrayList();
            for (Object obj : m24060b) {
                C11632b c11632b = (C11632b) obj;
                if (!c11632b.m7461l() && !C5932i.f16902c.m24135a().contains(c11632b)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            m14093t = C9546k.m14093t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            for (C11632b c11632b2 : arrayList) {
                arrayList2.add(c11632b2.m7463j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5947q(C11633c fqName, InterfaceC6821n storageManager, InterfaceC11928h0 module, C9422m proto, AbstractC10456a metadataVersion, InterfaceC6449f interfaceC6449f) {
        super(fqName, storageManager, module);
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(module, "module");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(metadataVersion, "metadataVersion");
        this.f16947q = metadataVersion;
        this.f16948r = interfaceC6449f;
        C9436p m15207P = proto.m15207P();
        C9612q.m13918g(m15207P, "proto.strings");
        C9428o m15208O = proto.m15208O();
        C9612q.m13918g(m15208O, "proto.qualifiedNames");
        C10464d c10464d = new C10464d(m15207P, m15208O);
        this.f16949s = c10464d;
        this.f16950t = new C5968y(proto, c10464d, metadataVersion, new C5948a());
        this.f16951u = proto;
    }

    @Override // p070di.AbstractC5946p
    /* renamed from: L0 */
    public void mo24088L0(C5939k components) {
        C9612q.m13917h(components, "components");
        C9422m c9422m = this.f16951u;
        if (c9422m != null) {
            this.f16951u = null;
            C9419l m15209N = c9422m.m15209N();
            C9612q.m13918g(m15209N, "proto.`package`");
            C10464d c10464d = this.f16949s;
            AbstractC10456a abstractC10456a = this.f16947q;
            InterfaceC6449f interfaceC6449f = this.f16948r;
            this.f16952v = new C6473i(this, m15209N, c10464d, abstractC10456a, interfaceC6449f, components, "scope of " + this, new C5949b());
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    @Override // p070di.AbstractC5946p
    /* renamed from: N0 */
    public C5968y mo24089G0() {
        return this.f16950t;
    }

    @Override // p305qg.InterfaceC11945l0
    /* renamed from: o */
    public InterfaceC0194h mo4368o() {
        InterfaceC0194h interfaceC0194h = this.f16952v;
        if (interfaceC0194h == null) {
            C9612q.m13900y("_memberScope");
            return null;
        }
        return interfaceC0194h;
    }
}
