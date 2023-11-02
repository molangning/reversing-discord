package tg;

import ai.C0180b;
import ai.C0192g;
import ai.InterfaceC0194h;
import gi.C6820m;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import p305qg.C11965o0;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11969q0;
import p325rg.InterfaceC12155g;
import ph.C11633c;

/* renamed from: tg.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12732r extends AbstractC12706j implements InterfaceC11969q0 {

    /* renamed from: q */
    static final /* synthetic */ KProperty<Object>[] f33046q = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C12732r.class), "fragments", "getFragments()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C12732r.class), "empty", "getEmpty()Z"))};

    /* renamed from: l */
    private final C12744x f33047l;

    /* renamed from: m */
    private final C11633c f33048m;

    /* renamed from: n */
    private final InterfaceC6815i f33049n;

    /* renamed from: o */
    private final InterfaceC6815i f33050o;

    /* renamed from: p */
    private final InterfaceC0194h f33051p;

    /* renamed from: tg.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C12733a extends AbstractC9614s implements Function0<Boolean> {
        C12733a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C11965o0.m6686b(C12732r.this.mo4243B0().m4203Q0(), C12732r.this.mo4239e()));
        }
    }

    /* renamed from: tg.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C12734b extends AbstractC9614s implements Function0<List<? extends InterfaceC11945l0>> {
        C12734b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC11945l0> invoke() {
            return C11965o0.m6685c(C12732r.this.mo4243B0().m4203Q0(), C12732r.this.mo4239e());
        }
    }

    /* renamed from: tg.r$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C12735c extends AbstractC9614s implements Function0<InterfaceC0194h> {
        C12735c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC0194h invoke() {
            int m14093t;
            List m14035o0;
            if (C12732r.this.isEmpty()) {
                return InterfaceC0194h.C0197b.f649b;
            }
            List<InterfaceC11945l0> mo4238h0 = C12732r.this.mo4238h0();
            m14093t = C9546k.m14093t(mo4238h0, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (InterfaceC11945l0 interfaceC11945l0 : mo4238h0) {
                arrayList.add(interfaceC11945l0.mo4368o());
            }
            m14035o0 = C9553r.m14035o0(arrayList, new C12703h0(C12732r.this.mo4243B0(), C12732r.this.mo4239e()));
            C0180b.C0181a c0181a = C0180b.f602d;
            return c0181a.m41008a("package view scope for " + C12732r.this.mo4239e() + " in " + C12732r.this.mo4243B0().getName(), m14035o0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12732r(C12744x module, C11633c fqName, InterfaceC6821n storageManager) {
        super(InterfaceC12155g.f31603f.m6037b(), fqName.m7452h());
        C9612q.m13917h(module, "module");
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(storageManager, "storageManager");
        this.f33047l = module;
        this.f33048m = fqName;
        this.f33049n = storageManager.mo21867c(new C12734b());
        this.f33050o = storageManager.mo21867c(new C12733a());
        this.f33051p = new C0192g(storageManager, new C12735c());
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: E0 */
    public InterfaceC11969q0 mo4163b() {
        if (mo4239e().m7456d()) {
            return null;
        }
        C12744x mo4243B0 = mo4243B0();
        C11633c m7455e = mo4239e().m7455e();
        C9612q.m13918g(m7455e, "fqName.parent()");
        return mo4243B0.mo4210H0(m7455e);
    }

    /* renamed from: G0 */
    protected final boolean m4241G0() {
        return ((Boolean) C6820m.m21871a(this.f33050o, this, f33046q[1])).booleanValue();
    }

    @Override // p305qg.InterfaceC11969q0
    /* renamed from: K0 */
    public C12744x mo4243B0() {
        return this.f33047l;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> visitor, D d) {
        C9612q.m13917h(visitor, "visitor");
        return visitor.mo4392c(this, d);
    }

    @Override // p305qg.InterfaceC11969q0
    /* renamed from: e */
    public C11633c mo4239e() {
        return this.f33048m;
    }

    public boolean equals(Object obj) {
        InterfaceC11969q0 interfaceC11969q0;
        if (obj instanceof InterfaceC11969q0) {
            interfaceC11969q0 = (InterfaceC11969q0) obj;
        } else {
            interfaceC11969q0 = null;
        }
        if (interfaceC11969q0 == null || !C9612q.m13922c(mo4239e(), interfaceC11969q0.mo4239e()) || !C9612q.m13922c(mo4243B0(), interfaceC11969q0.mo4243B0())) {
            return false;
        }
        return true;
    }

    @Override // p305qg.InterfaceC11969q0
    /* renamed from: h0 */
    public List<InterfaceC11945l0> mo4238h0() {
        return (List) C6820m.m21871a(this.f33049n, this, f33046q[0]);
    }

    public int hashCode() {
        return (mo4243B0().hashCode() * 31) + mo4239e().hashCode();
    }

    @Override // p305qg.InterfaceC11969q0
    public boolean isEmpty() {
        return m4241G0();
    }

    @Override // p305qg.InterfaceC11969q0
    /* renamed from: o */
    public InterfaceC0194h mo4237o() {
        return this.f33051p;
    }
}
