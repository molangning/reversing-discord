package p069dh;

import ch.C2543d;
import ch.C2548g;
import gh.InterfaceC6773j;
import gh.InterfaceC6788y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9544i;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import p086eh.C6225b;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7267h0;
import p142hi.EnumC7317r1;
import p142hi.EnumC7336w1;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11947m;
import tg.AbstractC12682b;

/* renamed from: dh.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C5907n extends AbstractC12682b {

    /* renamed from: t */
    private final C2548g f16850t;

    /* renamed from: u */
    private final InterfaceC6788y f16851u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5907n(C2548g c, InterfaceC6788y javaTypeParameter, int i, InterfaceC11947m containingDeclaration) {
        super(c.m33010e(), containingDeclaration, new C2543d(c, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), EnumC7336w1.INVARIANT, false, i, InterfaceC11900a1.f30901a, c.m33014a().m33028v());
        C9612q.m13917h(c, "c");
        C9612q.m13917h(javaTypeParameter, "javaTypeParameter");
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        this.f16850t = c;
        this.f16851u = javaTypeParameter;
    }

    /* renamed from: M0 */
    private final List<AbstractC7264g0> m24194M0() {
        int m14093t;
        List<AbstractC7264g0> m14109d;
        Collection<InterfaceC6773j> upperBounds = this.f16851u.getUpperBounds();
        if (upperBounds.isEmpty()) {
            AbstractC7302o0 m9810i = this.f16850t.m33011d().mo4194n().m9810i();
            C9612q.m13918g(m9810i, "c.module.builtIns.anyType");
            AbstractC7302o0 m9842I = this.f16850t.m33011d().mo4194n().m9842I();
            C9612q.m13918g(m9842I, "c.module.builtIns.nullableAnyType");
            m14109d = C9544i.m14109d(C7267h0.m21104d(m9810i, m9842I));
            return m14109d;
        }
        m14093t = C9546k.m14093t(upperBounds, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC6773j interfaceC6773j : upperBounds) {
            arrayList.add(this.f16850t.m33008g().m23194o(interfaceC6773j, C6225b.m23210b(EnumC7317r1.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // tg.AbstractC12692e
    /* renamed from: G0 */
    protected List<AbstractC7264g0> mo4468G0(List<? extends AbstractC7264g0> bounds) {
        C9612q.m13917h(bounds, "bounds");
        return this.f16850t.m33014a().m33032r().m21277i(this, bounds, this.f16850t);
    }

    @Override // tg.AbstractC12692e
    /* renamed from: K0 */
    protected void mo4406K0(AbstractC7264g0 type) {
        C9612q.m13917h(type, "type");
    }

    @Override // tg.AbstractC12692e
    /* renamed from: L0 */
    protected List<AbstractC7264g0> mo4405L0() {
        return m24194M0();
    }
}
