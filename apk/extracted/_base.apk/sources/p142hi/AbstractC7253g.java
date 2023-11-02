package p142hi;

import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p161ii.AbstractC7592g;
import p161ii.C7594h;
import p183ji.C8967k;
import p305qg.InterfaceC11912d1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import pf.C11577n;
import pf.EnumC11580p;

/* renamed from: hi.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7253g extends AbstractC7292m {

    /* renamed from: b */
    private final InterfaceC6815i<C7256b> f19669b;

    /* renamed from: c */
    private final boolean f19670c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hi.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C7254a implements InterfaceC7265g1 {

        /* renamed from: a */
        private final AbstractC7592g f19671a;

        /* renamed from: b */
        private final Lazy f19672b;

        /* renamed from: c */
        final /* synthetic */ AbstractC7253g f19673c;

        /* renamed from: hi.g$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static final class C7255a extends AbstractC9614s implements Function0<List<? extends AbstractC7264g0>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC7253g f19675k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7255a(AbstractC7253g abstractC7253g) {
                super(0);
                this.f19675k = abstractC7253g;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC7264g0> invoke() {
                return C7594h.m20273b(C7254a.this.f19671a, this.f19675k.mo2791m());
            }
        }

        public C7254a(AbstractC7253g abstractC7253g, AbstractC7592g kotlinTypeRefiner) {
            Lazy m7600b;
            C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f19673c = abstractC7253g;
            this.f19671a = kotlinTypeRefiner;
            m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C7255a(abstractC7253g));
            this.f19672b = m7600b;
        }

        /* renamed from: d */
        private final List<AbstractC7264g0> m21120d() {
            return (List) this.f19672b.getValue();
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: e */
        public List<AbstractC7264g0> mo2791m() {
            return m21120d();
        }

        public boolean equals(Object obj) {
            return this.f19673c.equals(obj);
        }

        @Override // p142hi.InterfaceC7265g1
        public List<InterfaceC11920f1> getParameters() {
            List<InterfaceC11920f1> parameters = this.f19673c.getParameters();
            C9612q.m13918g(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f19673c.hashCode();
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: n */
        public AbstractC10870h mo2790n() {
            AbstractC10870h mo2790n = this.f19673c.mo2790n();
            C9612q.m13918g(mo2790n, "this@AbstractTypeConstructor.builtIns");
            return mo2790n;
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: o */
        public InterfaceC7265g1 mo2789o(AbstractC7592g kotlinTypeRefiner) {
            C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f19673c.mo2789o(kotlinTypeRefiner);
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: p */
        public InterfaceC11927h mo2788p() {
            return this.f19673c.mo2788p();
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: q */
        public boolean mo2787q() {
            return this.f19673c.mo2787q();
        }

        public String toString() {
            return this.f19673c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hi.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7256b {

        /* renamed from: a */
        private final Collection<AbstractC7264g0> f19676a;

        /* renamed from: b */
        private List<? extends AbstractC7264g0> f19677b;

        /* JADX WARN: Multi-variable type inference failed */
        public C7256b(Collection<? extends AbstractC7264g0> allSupertypes) {
            List<? extends AbstractC7264g0> m14109d;
            C9612q.m13917h(allSupertypes, "allSupertypes");
            this.f19676a = allSupertypes;
            m14109d = C9544i.m14109d(C8967k.f23554a.m16937l());
            this.f19677b = m14109d;
        }

        /* renamed from: a */
        public final Collection<AbstractC7264g0> m21118a() {
            return this.f19676a;
        }

        /* renamed from: b */
        public final List<AbstractC7264g0> m21117b() {
            return this.f19677b;
        }

        /* renamed from: c */
        public final void m21116c(List<? extends AbstractC7264g0> list) {
            C9612q.m13917h(list, "<set-?>");
            this.f19677b = list;
        }
    }

    /* renamed from: hi.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C7257c extends AbstractC9614s implements Function0<C7256b> {
        C7257c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C7256b invoke() {
            return new C7256b(AbstractC7253g.this.mo4458h());
        }
    }

    /* renamed from: hi.g$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C7258d extends AbstractC9614s implements Function1<Boolean, C7256b> {

        /* renamed from: j */
        public static final C7258d f19679j = new C7258d();

        C7258d() {
            super(1);
        }

        /* renamed from: a */
        public final C7256b m21114a(boolean z) {
            List m14109d;
            m14109d = C9544i.m14109d(C8967k.f23554a.m16937l());
            return new C7256b(m14109d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C7256b invoke(Boolean bool) {
            return m21114a(bool.booleanValue());
        }
    }

    /* renamed from: hi.g$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C7259e extends AbstractC9614s implements Function1<C7256b, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hi.g$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7260a extends AbstractC9614s implements Function1<InterfaceC7265g1, Iterable<? extends AbstractC7264g0>> {

            /* renamed from: j */
            final /* synthetic */ AbstractC7253g f19681j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7260a(AbstractC7253g abstractC7253g) {
                super(1);
                this.f19681j = abstractC7253g;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Iterable<AbstractC7264g0> invoke(InterfaceC7265g1 it) {
                C9612q.m13917h(it, "it");
                return this.f19681j.m21126g(it, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hi.g$e$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7261b extends AbstractC9614s implements Function1<AbstractC7264g0, Unit> {

            /* renamed from: j */
            final /* synthetic */ AbstractC7253g f19682j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7261b(AbstractC7253g abstractC7253g) {
                super(1);
                this.f19682j = abstractC7253g;
            }

            /* renamed from: a */
            public final void m21111a(AbstractC7264g0 it) {
                C9612q.m13917h(it, "it");
                this.f19682j.m21122t(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC7264g0 abstractC7264g0) {
                m21111a(abstractC7264g0);
                return Unit.f25302a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hi.g$e$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7262c extends AbstractC9614s implements Function1<InterfaceC7265g1, Iterable<? extends AbstractC7264g0>> {

            /* renamed from: j */
            final /* synthetic */ AbstractC7253g f19683j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7262c(AbstractC7253g abstractC7253g) {
                super(1);
                this.f19683j = abstractC7253g;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Iterable<AbstractC7264g0> invoke(InterfaceC7265g1 it) {
                C9612q.m13917h(it, "it");
                return this.f19683j.m21126g(it, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hi.g$e$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7263d extends AbstractC9614s implements Function1<AbstractC7264g0, Unit> {

            /* renamed from: j */
            final /* synthetic */ AbstractC7253g f19684j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7263d(AbstractC7253g abstractC7253g) {
                super(1);
                this.f19684j = abstractC7253g;
            }

            /* renamed from: a */
            public final void m21109a(AbstractC7264g0 it) {
                C9612q.m13917h(it, "it");
                this.f19684j.mo4454u(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC7264g0 abstractC7264g0) {
                m21109a(abstractC7264g0);
                return Unit.f25302a;
            }
        }

        C7259e() {
            super(1);
        }

        /* renamed from: a */
        public final void m21113a(C7256b supertypes) {
            C9612q.m13917h(supertypes, "supertypes");
            Collection<AbstractC7264g0> mo6724a = AbstractC7253g.this.mo4456l().mo6724a(AbstractC7253g.this, supertypes.m21118a(), new C7262c(AbstractC7253g.this), new C7263d(AbstractC7253g.this));
            List<AbstractC7264g0> list = null;
            if (mo6724a.isEmpty()) {
                AbstractC7264g0 mo4457i = AbstractC7253g.this.mo4457i();
                if (mo4457i != null) {
                    mo6724a = C9544i.m14109d(mo4457i);
                } else {
                    mo6724a = null;
                }
                if (mo6724a == null) {
                    mo6724a = C9545j.m14104i();
                }
            }
            if (AbstractC7253g.this.m21124k()) {
                InterfaceC11912d1 mo4456l = AbstractC7253g.this.mo4456l();
                AbstractC7253g abstractC7253g = AbstractC7253g.this;
                mo4456l.mo6724a(abstractC7253g, mo6724a, new C7260a(abstractC7253g), new C7261b(AbstractC7253g.this));
            }
            AbstractC7253g abstractC7253g2 = AbstractC7253g.this;
            if (mo6724a instanceof List) {
                list = (List) mo6724a;
            }
            if (list == null) {
                list = C9553r.m14075C0(mo6724a);
            }
            supertypes.m21116c(abstractC7253g2.mo4455s(list));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C7256b c7256b) {
            m21113a(c7256b);
            return Unit.f25302a;
        }
    }

    public AbstractC7253g(InterfaceC6821n storageManager) {
        C9612q.m13917h(storageManager, "storageManager");
        this.f19669b = storageManager.mo21864f(new C7257c(), C7258d.f19679j, new C7259e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
        r4 = kotlin.collections.C9553r.m14036n0(r0.f19669b.invoke().m21118a(), r0.mo21125j(r4));
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection<p142hi.AbstractC7264g0> m21126g(p142hi.InterfaceC7265g1 r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p142hi.AbstractC7253g
            if (r0 == 0) goto L8
            r0 = r3
            hi.g r0 = (p142hi.AbstractC7253g) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L22
            gi.i<hi.g$b> r1 = r0.f19669b
            java.lang.Object r1 = r1.invoke()
            hi.g$b r1 = (p142hi.AbstractC7253g.C7256b) r1
            java.util.Collection r1 = r1.m21118a()
            java.util.Collection r4 = r0.mo21125j(r4)
            java.util.List r4 = kotlin.collections.C9543h.m14134n0(r1, r4)
            if (r4 == 0) goto L22
            goto L2b
        L22:
            java.util.Collection r4 = r3.mo2791m()
            java.lang.String r3 = "supertypes"
            kotlin.jvm.internal.C9612q.m13918g(r4, r3)
        L2b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hi.AbstractC7253g.m21126g(hi.g1, boolean):java.util.Collection");
    }

    /* renamed from: h */
    protected abstract Collection<AbstractC7264g0> mo4458h();

    /* renamed from: i */
    protected AbstractC7264g0 mo4457i() {
        return null;
    }

    /* renamed from: j */
    protected Collection<AbstractC7264g0> mo21125j(boolean z) {
        List m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: k */
    protected boolean m21124k() {
        return this.f19670c;
    }

    /* renamed from: l */
    protected abstract InterfaceC11912d1 mo4456l();

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: o */
    public InterfaceC7265g1 mo2789o(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C7254a(this, kotlinTypeRefiner);
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: r */
    public List<AbstractC7264g0> mo2791m() {
        return this.f19669b.invoke().m21117b();
    }

    /* renamed from: s */
    protected List<AbstractC7264g0> mo4455s(List<AbstractC7264g0> supertypes) {
        C9612q.m13917h(supertypes, "supertypes");
        return supertypes;
    }

    /* renamed from: t */
    protected void m21122t(AbstractC7264g0 type) {
        C9612q.m13917h(type, "type");
    }

    /* renamed from: u */
    protected void mo4454u(AbstractC7264g0 type) {
        C9612q.m13917h(type, "type");
    }
}
