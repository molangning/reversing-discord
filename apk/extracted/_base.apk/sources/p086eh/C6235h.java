package p086eh;

import ai.InterfaceC0194h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import p142hi.AbstractC7217a0;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.InterfaceC7288k1;
import p142hi.InterfaceC7296n0;
import p161ii.AbstractC7592g;
import p161ii.InterfaceC7587e;
import p234mi.C10472a;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import sh.AbstractC12485c;
import sh.InterfaceC12513f;

/* renamed from: eh.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C6235h extends AbstractC7217a0 implements InterfaceC7296n0 {

    /* renamed from: eh.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C6236a extends AbstractC9614s implements Function1<String, CharSequence> {

        /* renamed from: j */
        public static final C6236a f17662j = new C6236a();

        C6236a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String it) {
            C9612q.m13917h(it, "it");
            return "(raw) " + it;
        }
    }

    private C6235h(AbstractC7302o0 abstractC7302o0, AbstractC7302o0 abstractC7302o02, boolean z) {
        super(abstractC7302o0, abstractC7302o02);
        if (z) {
            return;
        }
        InterfaceC7587e.f20880a.mo20256b(abstractC7302o0, abstractC7302o02);
    }

    /* renamed from: a1 */
    private static final boolean m23182a1(String str, String str2) {
        String m13692p0;
        m13692p0 = C9654p.m13692p0(str2, "out ");
        if (!C9612q.m13922c(str, m13692p0) && !C9612q.m13922c(str2, "*")) {
            return false;
        }
        return true;
    }

    /* renamed from: b1 */
    private static final List<String> m23181b1(AbstractC12485c abstractC12485c, AbstractC7264g0 abstractC7264g0) {
        int m14093t;
        List<InterfaceC7288k1> mo3566L0 = abstractC7264g0.mo3566L0();
        m14093t = C9546k.m14093t(mo3566L0, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC7288k1 interfaceC7288k1 : mo3566L0) {
            arrayList.add(abstractC12485c.mo5041x(interfaceC7288k1));
        }
        return arrayList;
    }

    /* renamed from: c1 */
    private static final String m23180c1(String str, String str2) {
        boolean m13733L;
        String m13724P0;
        String m13730M0;
        m13733L = C9654p.m13733L(str, '<', false, 2, null);
        if (!m13733L) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        m13724P0 = C9654p.m13724P0(str, '<', null, 2, null);
        sb2.append(m13724P0);
        sb2.append('<');
        sb2.append(str2);
        sb2.append('>');
        m13730M0 = C9654p.m13730M0(str, '>', null, 2, null);
        sb2.append(m13730M0);
        return sb2.toString();
    }

    @Override // p142hi.AbstractC7217a0
    /* renamed from: U0 */
    public AbstractC7302o0 mo20945U0() {
        return m21218V0();
    }

    @Override // p142hi.AbstractC7217a0
    /* renamed from: X0 */
    public String mo20944X0(AbstractC12485c renderer, InterfaceC12513f options) {
        String m14046d0;
        List m14067J0;
        C9612q.m13917h(renderer, "renderer");
        C9612q.m13917h(options, "options");
        String mo5044w = renderer.mo5044w(m21218V0());
        String mo5044w2 = renderer.mo5044w(m21217W0());
        if (options.mo4966i()) {
            return "raw (" + mo5044w + ".." + mo5044w2 + ')';
        } else if (m21217W0().mo3566L0().isEmpty()) {
            return renderer.mo5053t(mo5044w, mo5044w2, C10472a.m11449i(this));
        } else {
            List<String> m23181b1 = m23181b1(renderer, m21218V0());
            List<String> m23181b12 = m23181b1(renderer, m21217W0());
            m14046d0 = C9553r.m14046d0(m23181b1, ", ", null, null, 0, null, C6236a.f17662j, 30, null);
            m14067J0 = C9553r.m14067J0(m23181b1, m23181b12);
            boolean z = true;
            if (!(m14067J0 instanceof Collection) || !m14067J0.isEmpty()) {
                Iterator it = m14067J0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    if (!m23182a1((String) pair.m14349c(), (String) pair.m14348d())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                mo5044w2 = m23180c1(mo5044w2, m14046d0);
            }
            String m23180c1 = m23180c1(mo5044w, m14046d0);
            if (C9612q.m13922c(m23180c1, mo5044w2)) {
                return m23180c1;
            }
            return renderer.mo5053t(m23180c1, mo5044w2, C10472a.m11449i(this));
        }
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: Y0 */
    public C6235h mo3561R0(boolean z) {
        return new C6235h(m21218V0().mo3558U0(z), m21217W0().mo3558U0(z));
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: Z0 */
    public AbstractC7217a0 mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7264g0 mo20276h = kotlinTypeRefiner.mo20276h(m21218V0());
        C9612q.m13919f(mo20276h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC7264g0 mo20276h2 = kotlinTypeRefiner.mo20276h(m21217W0());
        C9612q.m13919f(mo20276h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C6235h((AbstractC7302o0) mo20276h, (AbstractC7302o0) mo20276h2, true);
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: d1 */
    public C6235h mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return new C6235h(m21218V0().mo3557V0(newAttributes), m21217W0().mo3557V0(newAttributes));
    }

    @Override // p142hi.AbstractC7217a0, p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        InterfaceC11914e interfaceC11914e;
        InterfaceC11927h mo2788p = mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11914e) {
            interfaceC11914e = (InterfaceC11914e) mo2788p;
        } else {
            interfaceC11914e = null;
        }
        if (interfaceC11914e != null) {
            InterfaceC0194h mo4232K = interfaceC11914e.mo4232K(new C6232g(null, 1, null));
            C9612q.m13918g(mo4232K, "classDescriptor.getMemberScope(RawSubstitution())");
            return mo4232K;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo3564N0().mo2788p()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6235h(AbstractC7302o0 lowerBound, AbstractC7302o0 upperBound) {
        this(lowerBound, upperBound, false);
        C9612q.m13917h(lowerBound, "lowerBound");
        C9612q.m13917h(upperBound, "upperBound");
    }
}
