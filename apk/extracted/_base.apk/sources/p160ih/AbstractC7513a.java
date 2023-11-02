package p160ih;

import gi.InterfaceC6813g;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kh.C9425n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import mg.C10454a;
import mh.C10458b;
import ng.C10889o;
import p070di.AbstractC5969z;
import p070di.EnumC5912b;
import p070di.InterfaceC5915c;
import p142hi.AbstractC7264g0;
import p160ih.AbstractC7522b;
import p160ih.C7572u;
import p160ih.InterfaceC7564r;
import p270oh.C11122i;
import p305qg.InterfaceC11900a1;
import p389vh.AbstractC13301g;
import p389vh.C13320q;
import ph.C11632b;
import ph.C11638f;

/* renamed from: ih.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC7513a<A, C> extends AbstractC7522b<A, C7514a<? extends A, ? extends C>> implements InterfaceC5915c<A, C> {

    /* renamed from: b */
    private final InterfaceC6813g<InterfaceC7564r, C7514a<A, C>> f20760b;

    /* renamed from: ih.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7514a<A, C> extends AbstractC7522b.AbstractC7523a<A> {

        /* renamed from: a */
        private final Map<C7572u, List<A>> f20761a;

        /* renamed from: b */
        private final Map<C7572u, C> f20762b;

        /* renamed from: c */
        private final Map<C7572u, C> f20763c;

        /* JADX WARN: Multi-variable type inference failed */
        public C7514a(Map<C7572u, ? extends List<? extends A>> memberAnnotations, Map<C7572u, ? extends C> propertyConstants, Map<C7572u, ? extends C> annotationParametersDefaultValues) {
            C9612q.m13917h(memberAnnotations, "memberAnnotations");
            C9612q.m13917h(propertyConstants, "propertyConstants");
            C9612q.m13917h(annotationParametersDefaultValues, "annotationParametersDefaultValues");
            this.f20761a = memberAnnotations;
            this.f20762b = propertyConstants;
            this.f20763c = annotationParametersDefaultValues;
        }

        @Override // p160ih.AbstractC7522b.AbstractC7523a
        /* renamed from: a */
        public Map<C7572u, List<A>> mo20495a() {
            return this.f20761a;
        }

        /* renamed from: b */
        public final Map<C7572u, C> m20524b() {
            return this.f20763c;
        }

        /* renamed from: c */
        public final Map<C7572u, C> m20523c() {
            return this.f20762b;
        }
    }

    /* renamed from: ih.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C7515b extends AbstractC9614s implements Function2<C7514a<? extends A, ? extends C>, C7572u, C> {

        /* renamed from: j */
        public static final C7515b f20764j = new C7515b();

        C7515b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final C invoke(C7514a<? extends A, ? extends C> loadConstantFromProperty, C7572u it) {
            C9612q.m13917h(loadConstantFromProperty, "$this$loadConstantFromProperty");
            C9612q.m13917h(it, "it");
            return loadConstantFromProperty.m20524b().get(it);
        }
    }

    /* renamed from: ih.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7516c implements InterfaceC7564r.InterfaceC7568d {

        /* renamed from: a */
        final /* synthetic */ AbstractC7513a<A, C> f20765a;

        /* renamed from: b */
        final /* synthetic */ HashMap<C7572u, List<A>> f20766b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC7564r f20767c;

        /* renamed from: d */
        final /* synthetic */ HashMap<C7572u, C> f20768d;

        /* renamed from: e */
        final /* synthetic */ HashMap<C7572u, C> f20769e;

        /* renamed from: ih.a$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public final class C7517a extends C7518b implements InterfaceC7564r.InterfaceC7569e {

            /* renamed from: d */
            final /* synthetic */ C7516c f20770d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7517a(C7516c c7516c, C7572u signature) {
                super(c7516c, signature);
                C9612q.m13917h(signature, "signature");
                this.f20770d = c7516c;
            }

            @Override // p160ih.InterfaceC7564r.InterfaceC7569e
            /* renamed from: b */
            public InterfaceC7564r.InterfaceC7565a mo20397b(int i, C11632b classId, InterfaceC11900a1 source) {
                C9612q.m13917h(classId, "classId");
                C9612q.m13917h(source, "source");
                C7572u m20389e = C7572u.f20873b.m20389e(m20521d(), i);
                List<A> list = this.f20770d.f20766b.get(m20389e);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f20770d.f20766b.put(m20389e, list);
                }
                return this.f20770d.f20765a.m20498w(classId, source, list);
            }
        }

        /* renamed from: ih.a$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C7518b implements InterfaceC7564r.InterfaceC7567c {

            /* renamed from: a */
            private final C7572u f20771a;

            /* renamed from: b */
            private final ArrayList<A> f20772b;

            /* renamed from: c */
            final /* synthetic */ C7516c f20773c;

            public C7518b(C7516c c7516c, C7572u signature) {
                C9612q.m13917h(signature, "signature");
                this.f20773c = c7516c;
                this.f20771a = signature;
                this.f20772b = new ArrayList<>();
            }

            @Override // p160ih.InterfaceC7564r.InterfaceC7567c
            /* renamed from: a */
            public void mo11509a() {
                if (!this.f20772b.isEmpty()) {
                    this.f20773c.f20766b.put(this.f20771a, this.f20772b);
                }
            }

            @Override // p160ih.InterfaceC7564r.InterfaceC7567c
            /* renamed from: c */
            public InterfaceC7564r.InterfaceC7565a mo11508c(C11632b classId, InterfaceC11900a1 source) {
                C9612q.m13917h(classId, "classId");
                C9612q.m13917h(source, "source");
                return this.f20773c.f20765a.m20498w(classId, source, this.f20772b);
            }

            /* renamed from: d */
            protected final C7572u m20521d() {
                return this.f20771a;
            }
        }

        C7516c(AbstractC7513a<A, C> abstractC7513a, HashMap<C7572u, List<A>> hashMap, InterfaceC7564r interfaceC7564r, HashMap<C7572u, C> hashMap2, HashMap<C7572u, C> hashMap3) {
            this.f20765a = abstractC7513a;
            this.f20766b = hashMap;
            this.f20767c = interfaceC7564r;
            this.f20768d = hashMap2;
            this.f20769e = hashMap3;
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7568d
        /* renamed from: a */
        public InterfaceC7564r.InterfaceC7569e mo20399a(C11638f name, String desc) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(desc, "desc");
            C7572u.C7573a c7573a = C7572u.f20873b;
            String m7426b = name.m7426b();
            C9612q.m13918g(m7426b, "name.asString()");
            return new C7517a(this, c7573a.m20390d(m7426b, desc));
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7568d
        /* renamed from: b */
        public InterfaceC7564r.InterfaceC7567c mo20398b(C11638f name, String desc, Object obj) {
            C mo20482E;
            C9612q.m13917h(name, "name");
            C9612q.m13917h(desc, "desc");
            C7572u.C7573a c7573a = C7572u.f20873b;
            String m7426b = name.m7426b();
            C9612q.m13918g(m7426b, "name.asString()");
            C7572u m20393a = c7573a.m20393a(m7426b, desc);
            if (obj != null && (mo20482E = this.f20765a.mo20482E(desc, obj)) != null) {
                this.f20769e.put(m20393a, mo20482E);
            }
            return new C7518b(this, m20393a);
        }
    }

    /* renamed from: ih.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C7519d extends AbstractC9614s implements Function2<C7514a<? extends A, ? extends C>, C7572u, C> {

        /* renamed from: j */
        public static final C7519d f20774j = new C7519d();

        C7519d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final C invoke(C7514a<? extends A, ? extends C> loadConstantFromProperty, C7572u it) {
            C9612q.m13917h(loadConstantFromProperty, "$this$loadConstantFromProperty");
            C9612q.m13917h(it, "it");
            return loadConstantFromProperty.m20523c().get(it);
        }
    }

    /* renamed from: ih.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C7520e extends AbstractC9614s implements Function1<InterfaceC7564r, C7514a<? extends A, ? extends C>> {

        /* renamed from: j */
        final /* synthetic */ AbstractC7513a<A, C> f20775j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7520e(AbstractC7513a<A, C> abstractC7513a) {
            super(1);
            this.f20775j = abstractC7513a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C7514a<A, C> invoke(InterfaceC7564r kotlinClass) {
            C9612q.m13917h(kotlinClass, "kotlinClass");
            return this.f20775j.m20528D(kotlinClass);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7513a(InterfaceC6821n storageManager, InterfaceC7559p kotlinClassFinder) {
        super(kotlinClassFinder);
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(kotlinClassFinder, "kotlinClassFinder");
        this.f20760b = storageManager.mo21861i(new C7520e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final C7514a<A, C> m20528D(InterfaceC7564r interfaceC7564r) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        interfaceC7564r.mo2855b(new C7516c(this, hashMap, interfaceC7564r, hashMap3, hashMap2), m20503q(interfaceC7564r));
        return new C7514a<>(hashMap, hashMap2, hashMap3);
    }

    /* renamed from: F */
    private final C m20527F(AbstractC5969z abstractC5969z, C9425n c9425n, EnumC5912b enumC5912b, AbstractC7264g0 abstractC7264g0, Function2<? super C7514a<? extends A, ? extends C>, ? super C7572u, ? extends C> function2) {
        C invoke;
        InterfaceC7564r m20505o = m20505o(abstractC5969z, m20500t(abstractC5969z, true, true, C10458b.f27302A.mo11488d(c9425n.m15154b0()), C11122i.m9128f(c9425n)));
        if (m20505o == null) {
            return null;
        }
        C7572u m20502r = m20502r(c9425n, abstractC5969z.m24059b(), abstractC5969z.m24057d(), enumC5912b, m20505o.mo2854c().m17012d().m11504d(C7544h.f20833b.m20444a()));
        if (m20502r == null || (invoke = function2.invoke(this.f20760b.invoke(m20505o), m20502r)) == null) {
            return null;
        }
        if (C10889o.m9735d(abstractC7264g0)) {
            return mo20481G(invoke);
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p160ih.AbstractC7522b
    /* renamed from: B */
    public C7514a<A, C> mo20504p(InterfaceC7564r binaryClass) {
        C9612q.m13917h(binaryClass, "binaryClass");
        return this.f20760b.invoke(binaryClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final boolean m20529C(C11632b annotationClassId, Map<C11638f, ? extends AbstractC13301g<?>> arguments) {
        C13320q c13320q;
        C9612q.m13917h(annotationClassId, "annotationClassId");
        C9612q.m13917h(arguments, "arguments");
        if (!C9612q.m13922c(annotationClassId, C10454a.f27292a.m11512a())) {
            return false;
        }
        AbstractC13301g<?> abstractC13301g = arguments.get(C11638f.m7422f("value"));
        C13320q.AbstractC13322b.C13324b c13324b = null;
        if (abstractC13301g instanceof C13320q) {
            c13320q = (C13320q) abstractC13301g;
        } else {
            c13320q = null;
        }
        if (c13320q == null) {
            return false;
        }
        C13320q.AbstractC13322b mo2813b = c13320q.mo2813b();
        if (mo2813b instanceof C13320q.AbstractC13322b.C13324b) {
            c13324b = (C13320q.AbstractC13322b.C13324b) mo2813b;
        }
        if (c13324b == null) {
            return false;
        }
        return m20499u(c13324b.m2782b());
    }

    /* renamed from: E */
    protected abstract C mo20482E(String str, Object obj);

    /* renamed from: G */
    protected abstract C mo20481G(C c);

    @Override // p070di.InterfaceC5915c
    /* renamed from: c */
    public C mo20526c(AbstractC5969z container, C9425n proto, AbstractC7264g0 expectedType) {
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(expectedType, "expectedType");
        return m20527F(container, proto, EnumC5912b.PROPERTY, expectedType, C7519d.f20774j);
    }

    @Override // p070di.InterfaceC5915c
    /* renamed from: g */
    public C mo20525g(AbstractC5969z container, C9425n proto, AbstractC7264g0 expectedType) {
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(expectedType, "expectedType");
        return m20527F(container, proto, EnumC5912b.PROPERTY_GETTER, expectedType, C7515b.f20764j);
    }
}
