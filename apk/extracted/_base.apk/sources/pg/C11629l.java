package pg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7272h1;
import p142hi.AbstractC7302o0;
import p234mi.C10472a;
import p304qf.C11889v;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;

/* renamed from: pg.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11629l {
    /* renamed from: a */
    public static final AbstractC7272h1 m7473a(InterfaceC11914e from, InterfaceC11914e to) {
        int m14093t;
        int m14093t2;
        List m14067J0;
        Map m6744r;
        C9612q.m13917h(from, "from");
        C9612q.m13917h(to, "to");
        from.mo4168q().size();
        to.mo4168q().size();
        AbstractC7272h1.C7273a c7273a = AbstractC7272h1.f19700c;
        List<InterfaceC11920f1> mo4168q = from.mo4168q();
        C9612q.m13918g(mo4168q, "from.declaredTypeParameters");
        m14093t = C9546k.m14093t(mo4168q, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11920f1 interfaceC11920f1 : mo4168q) {
            arrayList.add(interfaceC11920f1.mo4173k());
        }
        List<InterfaceC11920f1> mo4168q2 = to.mo4168q();
        C9612q.m13918g(mo4168q2, "to.declaredTypeParameters");
        m14093t2 = C9546k.m14093t(mo4168q2, 10);
        ArrayList arrayList2 = new ArrayList(m14093t2);
        for (InterfaceC11920f1 interfaceC11920f12 : mo4168q2) {
            AbstractC7302o0 mo4224p = interfaceC11920f12.mo4224p();
            C9612q.m13918g(mo4224p, "it.defaultType");
            arrayList2.add(C10472a.m11457a(mo4224p));
        }
        m14067J0 = C9553r.m14067J0(arrayList, arrayList2);
        m6744r = C11889v.m6744r(m14067J0);
        return AbstractC7272h1.C7273a.m21084e(c7273a, m6744r, false, 2, null);
    }
}
