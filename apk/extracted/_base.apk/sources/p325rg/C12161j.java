package p325rg;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11900a1;
import p389vh.AbstractC13301g;
import pf.C11577n;
import pf.EnumC11580p;
import ph.C11633c;
import ph.C11638f;

/* renamed from: rg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12161j implements InterfaceC12149c {

    /* renamed from: a */
    private final AbstractC10870h f31607a;

    /* renamed from: b */
    private final C11633c f31608b;

    /* renamed from: c */
    private final Map<C11638f, AbstractC13301g<?>> f31609c;

    /* renamed from: d */
    private final Lazy f31610d;

    /* renamed from: rg.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C12162a extends AbstractC9614s implements Function0<AbstractC7302o0> {
        C12162a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AbstractC7302o0 invoke() {
            return C12161j.this.f31607a.m9798o(C12161j.this.mo6030e()).mo4224p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12161j(AbstractC10870h builtIns, C11633c fqName, Map<C11638f, ? extends AbstractC13301g<?>> allValueArguments) {
        Lazy m7600b;
        C9612q.m13917h(builtIns, "builtIns");
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(allValueArguments, "allValueArguments");
        this.f31607a = builtIns;
        this.f31608b = fqName;
        this.f31609c = allValueArguments;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C12162a());
        this.f31610d = m7600b;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: a */
    public Map<C11638f, AbstractC13301g<?>> mo6032a() {
        return this.f31609c;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: e */
    public C11633c mo6030e() {
        return this.f31608b;
    }

    @Override // p325rg.InterfaceC12149c
    public AbstractC7264g0 getType() {
        Object value = this.f31610d.getValue();
        C9612q.m13918g(value, "<get-type>(...)");
        return (AbstractC7264g0) value;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: j */
    public InterfaceC11900a1 mo6029j() {
        InterfaceC11900a1 NO_SOURCE = InterfaceC11900a1.f30901a;
        C9612q.m13918g(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }
}
