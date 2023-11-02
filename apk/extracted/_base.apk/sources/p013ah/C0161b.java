package p013ah;

import bh.InterfaceC2307g;
import ch.C2548g;
import gh.InterfaceC6760a;
import gh.InterfaceC6762b;
import gi.C6820m;
import gi.InterfaceC6815i;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import p142hi.AbstractC7302o0;
import p304qf.C11889v;
import p305qg.InterfaceC11900a1;
import p325rg.InterfaceC12149c;
import p389vh.AbstractC13301g;
import ph.C11633c;
import ph.C11638f;

/* renamed from: ah.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C0161b implements InterfaceC12149c, InterfaceC2307g {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f567f = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C0161b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    private final C11633c f568a;

    /* renamed from: b */
    private final InterfaceC11900a1 f569b;

    /* renamed from: c */
    private final InterfaceC6815i f570c;

    /* renamed from: d */
    private final InterfaceC6762b f571d;

    /* renamed from: e */
    private final boolean f572e;

    /* renamed from: ah.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C0162a extends AbstractC9614s implements Function0<AbstractC7302o0> {

        /* renamed from: j */
        final /* synthetic */ C2548g f573j;

        /* renamed from: k */
        final /* synthetic */ C0161b f574k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0162a(C2548g c2548g, C0161b c0161b) {
            super(0);
            this.f573j = c2548g;
            this.f574k = c0161b;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AbstractC7302o0 invoke() {
            AbstractC7302o0 mo4224p = this.f573j.m33011d().mo4194n().m9798o(this.f574k.mo6030e()).mo4224p();
            C9612q.m13918g(mo4224p, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return mo4224p;
        }
    }

    public C0161b(C2548g c, InterfaceC6760a interfaceC6760a, C11633c fqName) {
        InterfaceC11900a1 NO_SOURCE;
        InterfaceC6762b interfaceC6762b;
        Collection<InterfaceC6762b> mo2231k;
        Object m14055U;
        C9612q.m13917h(c, "c");
        C9612q.m13917h(fqName, "fqName");
        this.f568a = fqName;
        if (interfaceC6760a == null || (NO_SOURCE = c.m33014a().m33030t().mo2836a(interfaceC6760a)) == null) {
            NO_SOURCE = InterfaceC11900a1.f30901a;
            C9612q.m13918g(NO_SOURCE, "NO_SOURCE");
        }
        this.f569b = NO_SOURCE;
        this.f570c = c.m33010e().mo21867c(new C0162a(c, this));
        if (interfaceC6760a != null && (mo2231k = interfaceC6760a.mo2231k()) != null) {
            m14055U = C9553r.m14055U(mo2231k);
            interfaceC6762b = (InterfaceC6762b) m14055U;
        } else {
            interfaceC6762b = null;
        }
        this.f571d = interfaceC6762b;
        boolean z = false;
        if (interfaceC6760a != null && interfaceC6760a.mo2232f()) {
            z = true;
        }
        this.f572e = z;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: a */
    public Map<C11638f, AbstractC13301g<?>> mo6032a() {
        Map<C11638f, AbstractC13301g<?>> m6754h;
        m6754h = C11889v.m6754h();
        return m6754h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final InterfaceC6762b m41043b() {
        return this.f571d;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: c */
    public AbstractC7302o0 getType() {
        return (AbstractC7302o0) C6820m.m21871a(this.f570c, this, f567f[0]);
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: e */
    public C11633c mo6030e() {
        return this.f568a;
    }

    @Override // bh.InterfaceC2307g
    /* renamed from: f */
    public boolean mo24367f() {
        return this.f572e;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: j */
    public InterfaceC11900a1 mo6029j() {
        return this.f569b;
    }
}
