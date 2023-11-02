package p141hh;

import ch.C2537a;
import ch.C2548g;
import gh.InterfaceC6760a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p069dh.C5846e;
import p069dh.C5850f;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7333v1;
import p142hi.C7320s1;
import p142hi.InterfaceC7296n0;
import p234mi.C10472a;
import p305qg.C11972s;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11997x0;
import p325rg.InterfaceC12147a;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import p468zg.EnumC14207b;
import pg.C11599c;
import ph.C11638f;

/* renamed from: hh.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7200l {

    /* renamed from: a */
    private final C7161d f19586a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hh.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7201a extends AbstractC9614s implements Function1<AbstractC7333v1, Boolean> {

        /* renamed from: j */
        public static final C7201a f19587j = new C7201a();

        C7201a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC7333v1 abstractC7333v1) {
            boolean z;
            InterfaceC11927h mo2788p = abstractC7333v1.mo3564N0().mo2788p();
            if (mo2788p == null) {
                return Boolean.FALSE;
            }
            C11638f name = mo2788p.getName();
            C11599c c11599c = C11599c.f30110a;
            if (C9612q.m13922c(name, c11599c.m7557h().m7453g()) && C9612q.m13922c(C13801c.m1507h(mo2788p), c11599c.m7557h())) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hh.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7202b extends AbstractC9614s implements Function1<InterfaceC11902b, AbstractC7264g0> {

        /* renamed from: j */
        public static final C7202b f19588j = new C7202b();

        C7202b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(InterfaceC11902b it) {
            C9612q.m13917h(it, "it");
            InterfaceC11997x0 mo4329M = it.mo4329M();
            C9612q.m13920e(mo4329M);
            AbstractC7264g0 type = mo4329M.getType();
            C9612q.m13918g(type, "it.extensionReceiverParameter!!.type");
            return type;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hh.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7203c extends AbstractC9614s implements Function1<InterfaceC11902b, AbstractC7264g0> {

        /* renamed from: j */
        public static final C7203c f19589j = new C7203c();

        C7203c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(InterfaceC11902b it) {
            C9612q.m13917h(it, "it");
            AbstractC7264g0 returnType = it.getReturnType();
            C9612q.m13920e(returnType);
            return returnType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hh.l$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7204d extends AbstractC9614s implements Function1<InterfaceC11902b, AbstractC7264g0> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC11936j1 f19590j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7204d(InterfaceC11936j1 interfaceC11936j1) {
            super(1);
            this.f19590j = interfaceC11936j1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(InterfaceC11902b it) {
            C9612q.m13917h(it, "it");
            AbstractC7264g0 type = it.mo4301i().get(this.f19590j.getIndex()).getType();
            C9612q.m13918g(type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    /* renamed from: hh.l$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C7205e extends AbstractC9614s implements Function1<AbstractC7333v1, Boolean> {

        /* renamed from: j */
        public static final C7205e f19591j = new C7205e();

        C7205e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC7333v1 it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(it instanceof InterfaceC7296n0);
        }
    }

    public C7200l(C7161d typeEnhancement) {
        C9612q.m13917h(typeEnhancement, "typeEnhancement");
        this.f19586a = typeEnhancement;
    }

    /* renamed from: a */
    private final boolean m21285a(AbstractC7264g0 abstractC7264g0) {
        return C7320s1.m20992c(abstractC7264g0, C7201a.f19587j);
    }

    /* renamed from: b */
    private final AbstractC7264g0 m21284b(C7209n c7209n, AbstractC7264g0 abstractC7264g0, List<? extends AbstractC7264g0> list, C7212q c7212q, boolean z) {
        return this.f19586a.m21344a(abstractC7264g0, c7209n.m21361b(abstractC7264g0, list, c7212q, z), c7209n.mo21246u());
    }

    /* renamed from: c */
    private final AbstractC7264g0 m21283c(InterfaceC11902b interfaceC11902b, InterfaceC12147a interfaceC12147a, boolean z, C2548g c2548g, EnumC14207b enumC14207b, C7212q c7212q, boolean z2, Function1<? super InterfaceC11902b, ? extends AbstractC7264g0> function1) {
        int m14093t;
        C7209n c7209n = new C7209n(interfaceC12147a, z, c2548g, enumC14207b, false, 16, null);
        AbstractC7264g0 invoke = function1.invoke(interfaceC11902b);
        Collection<? extends InterfaceC11902b> overriddenDescriptors = interfaceC11902b.mo4310d();
        C9612q.m13918g(overriddenDescriptors, "overriddenDescriptors");
        m14093t = C9546k.m14093t(overriddenDescriptors, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC11902b it : overriddenDescriptors) {
            C9612q.m13918g(it, "it");
            arrayList.add(function1.invoke(it));
        }
        return m21284b(c7209n, invoke, arrayList, c7212q, z2);
    }

    /* renamed from: d */
    static /* synthetic */ AbstractC7264g0 m21282d(C7200l c7200l, C7209n c7209n, AbstractC7264g0 abstractC7264g0, List list, C7212q c7212q, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            c7212q = null;
        }
        C7212q c7212q2 = c7212q;
        if ((i & 8) != 0) {
            z = false;
        }
        return c7200l.m21284b(c7209n, abstractC7264g0, list, c7212q2, z);
    }

    /* renamed from: e */
    static /* synthetic */ AbstractC7264g0 m21281e(C7200l c7200l, InterfaceC11902b interfaceC11902b, InterfaceC12147a interfaceC12147a, boolean z, C2548g c2548g, EnumC14207b enumC14207b, C7212q c7212q, boolean z2, Function1 function1, int i, Object obj) {
        return c7200l.m21283c(interfaceC11902b, interfaceC12147a, z, c2548g, enumC14207b, c7212q, (i & 32) != 0 ? false : z2, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <D extends p305qg.InterfaceC11902b> D m21280f(D r21, ch.C2548g r22) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p141hh.C7200l.m21280f(qg.b, ch.g):qg.b");
    }

    /* renamed from: j */
    private final AbstractC7264g0 m21276j(InterfaceC11902b interfaceC11902b, InterfaceC11936j1 interfaceC11936j1, C2548g c2548g, C7212q c7212q, boolean z, Function1<? super InterfaceC11902b, ? extends AbstractC7264g0> function1) {
        C2548g c2548g2;
        C2548g m33053h;
        if (interfaceC11936j1 != null && (m33053h = C2537a.m33053h(c2548g, interfaceC11936j1.getAnnotations())) != null) {
            c2548g2 = m33053h;
        } else {
            c2548g2 = c2548g;
        }
        return m21283c(interfaceC11902b, interfaceC11936j1, false, c2548g2, EnumC14207b.VALUE_PARAMETER, c7212q, z, function1);
    }

    /* renamed from: k */
    private final <D extends InterfaceC11902b> InterfaceC12155g m21275k(D d, C2548g c2548g) {
        C5850f c5850f;
        boolean z;
        int m14093t;
        List<? extends InterfaceC12149c> m14038l0;
        InterfaceC11927h m6684a = C11972s.m6684a(d);
        if (m6684a == null) {
            return d.getAnnotations();
        }
        List<InterfaceC6760a> list = null;
        if (m6684a instanceof C5850f) {
            c5850f = (C5850f) m6684a;
        } else {
            c5850f = null;
        }
        if (c5850f != null) {
            list = c5850f.m24347Q0();
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return d.getAnnotations();
        }
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC6760a interfaceC6760a : list) {
            arrayList.add(new C5846e(c2548g, interfaceC6760a, true));
        }
        InterfaceC12155g.C12156a c12156a = InterfaceC12155g.f31603f;
        m14038l0 = C9553r.m14038l0(d.getAnnotations(), arrayList);
        return c12156a.m6038a(m14038l0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final <D extends InterfaceC11902b> Collection<D> m21279g(C2548g c, Collection<? extends D> platformSignatures) {
        int m14093t;
        C9612q.m13917h(c, "c");
        C9612q.m13917h(platformSignatures, "platformSignatures");
        m14093t = C9546k.m14093t(platformSignatures, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<T> it = platformSignatures.iterator();
        while (it.hasNext()) {
            arrayList.add(m21280f((InterfaceC11902b) it.next(), c));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final AbstractC7264g0 m21278h(AbstractC7264g0 type, C2548g context) {
        List m14104i;
        C9612q.m13917h(type, "type");
        C9612q.m13917h(context, "context");
        C7209n c7209n = new C7209n(null, false, context, EnumC14207b.TYPE_USE, true);
        m14104i = C9545j.m14104i();
        AbstractC7264g0 m21282d = m21282d(this, c7209n, type, m14104i, null, false, 12, null);
        if (m21282d != null) {
            return m21282d;
        }
        return type;
    }

    /* renamed from: i */
    public final List<AbstractC7264g0> m21277i(InterfaceC11920f1 typeParameter, List<? extends AbstractC7264g0> bounds, C2548g context) {
        int m14093t;
        List m14104i;
        C9612q.m13917h(typeParameter, "typeParameter");
        C9612q.m13917h(bounds, "bounds");
        C9612q.m13917h(context, "context");
        m14093t = C9546k.m14093t(bounds, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (AbstractC7264g0 abstractC7264g0 : bounds) {
            if (!C10472a.m11456b(abstractC7264g0, C7205e.f19591j)) {
                C7209n c7209n = new C7209n(typeParameter, false, context, EnumC14207b.TYPE_PARAMETER_BOUNDS, false, 16, null);
                m14104i = C9545j.m14104i();
                AbstractC7264g0 m21282d = m21282d(this, c7209n, abstractC7264g0, m14104i, null, false, 12, null);
                if (m21282d != null) {
                    abstractC7264g0 = m21282d;
                }
            }
            arrayList.add(abstractC7264g0);
        }
        return arrayList;
    }
}
