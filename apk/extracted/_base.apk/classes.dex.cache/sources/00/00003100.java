package p069dh;

import ai.C0185d;
import ch.C2548g;
import gh.EnumC6767d0;
import gh.InterfaceC6770g;
import gh.InterfaceC6784u;
import gi.InterfaceC6814h;
import gi.InterfaceC6816j;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p069dh.InterfaceC5841b;
import p160ih.C7563q;
import p160ih.InterfaceC7559p;
import p160ih.InterfaceC7564r;
import p182jh.C8942a;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p327ri.C12251d;
import p448yg.InterfaceC14020b;
import p468zg.InterfaceC14247p;
import pf.C11581q;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;
import ph.C11640h;

/* renamed from: dh.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C5876i extends AbstractC5906m {

    /* renamed from: n */
    private final InterfaceC6784u f16791n;

    /* renamed from: o */
    private final C5871h f16792o;

    /* renamed from: p */
    private final InterfaceC6816j<Set<String>> f16793p;

    /* renamed from: q */
    private final InterfaceC6814h<C5877a, InterfaceC11914e> f16794q;

    /* renamed from: dh.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5877a {

        /* renamed from: a */
        private final C11638f f16795a;

        /* renamed from: b */
        private final InterfaceC6770g f16796b;

        public C5877a(C11638f name, InterfaceC6770g interfaceC6770g) {
            C9612q.m13917h(name, "name");
            this.f16795a = name;
            this.f16796b = interfaceC6770g;
        }

        /* renamed from: a */
        public final InterfaceC6770g m24263a() {
            return this.f16796b;
        }

        /* renamed from: b */
        public final C11638f m24262b() {
            return this.f16795a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C5877a) && C9612q.m13922c(this.f16795a, ((C5877a) obj).f16795a);
        }

        public int hashCode() {
            return this.f16795a.hashCode();
        }
    }

    /* renamed from: dh.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC5878b {

        /* renamed from: dh.i$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C5879a extends AbstractC5878b {

            /* renamed from: a */
            private final InterfaceC11914e f16797a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5879a(InterfaceC11914e descriptor) {
                super(null);
                C9612q.m13917h(descriptor, "descriptor");
                this.f16797a = descriptor;
            }

            /* renamed from: a */
            public final InterfaceC11914e m24261a() {
                return this.f16797a;
            }
        }

        /* renamed from: dh.i$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C5880b extends AbstractC5878b {

            /* renamed from: a */
            public static final C5880b f16798a = new C5880b();

            private C5880b() {
                super(null);
            }
        }

        /* renamed from: dh.i$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C5881c extends AbstractC5878b {

            /* renamed from: a */
            public static final C5881c f16799a = new C5881c();

            private C5881c() {
                super(null);
            }
        }

        private AbstractC5878b() {
        }

        public /* synthetic */ AbstractC5878b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5882c extends AbstractC9614s implements Function1<C5877a, InterfaceC11914e> {

        /* renamed from: k */
        final /* synthetic */ C2548g f16801k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5882c(C2548g c2548g) {
            super(1);
            C5876i.this = r1;
            this.f16801k = c2548g;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC11914e invoke(C5877a request) {
            InterfaceC7559p.AbstractC7560a mo2847c;
            InterfaceC7564r interfaceC7564r;
            C11632b c11632b;
            EnumC6767d0 enumC6767d0;
            C11633c c11633c;
            byte[] bArr;
            C9612q.m13917h(request, "request");
            C11632b c11632b2 = new C11632b(C5876i.this.mo24217C().mo4161e(), request.m24262b());
            if (request.m24263a() != null) {
                mo2847c = this.f16801k.m33014a().m33040j().mo2849a(request.m24263a());
            } else {
                mo2847c = this.f16801k.m33014a().m33040j().mo2847c(c11632b2);
            }
            if (mo2847c != null) {
                interfaceC7564r = mo2847c.m20404a();
            } else {
                interfaceC7564r = null;
            }
            if (interfaceC7564r != null) {
                c11632b = interfaceC7564r.mo2851n();
            } else {
                c11632b = null;
            }
            if (c11632b != null && (c11632b.m7461l() || c11632b.m7462k())) {
                return null;
            }
            AbstractC5878b m24264R = C5876i.this.m24264R(interfaceC7564r);
            if (m24264R instanceof AbstractC5878b.C5879a) {
                return ((AbstractC5878b.C5879a) m24264R).m24261a();
            }
            if (m24264R instanceof AbstractC5878b.C5881c) {
                return null;
            }
            if (m24264R instanceof AbstractC5878b.C5880b) {
                InterfaceC6770g m24263a = request.m24263a();
                if (m24263a == null) {
                    InterfaceC14247p m33046d = this.f16801k.m33014a().m33046d();
                    if (mo2847c != null) {
                        if (!(mo2847c instanceof InterfaceC7559p.AbstractC7560a.C7561a)) {
                            mo2847c = null;
                        }
                        InterfaceC7559p.AbstractC7560a.C7561a c7561a = (InterfaceC7559p.AbstractC7560a.C7561a) mo2847c;
                        if (c7561a != null) {
                            bArr = c7561a.m20403b();
                            m24263a = m33046d.mo324c(new InterfaceC14247p.C14248a(c11632b2, bArr, null, 4, null));
                        }
                    }
                    bArr = null;
                    m24263a = m33046d.mo324c(new InterfaceC14247p.C14248a(c11632b2, bArr, null, 4, null));
                }
                InterfaceC6770g interfaceC6770g = m24263a;
                if (interfaceC6770g != null) {
                    enumC6767d0 = interfaceC6770g.mo2219K();
                } else {
                    enumC6767d0 = null;
                }
                if (enumC6767d0 != EnumC6767d0.BINARY) {
                    if (interfaceC6770g != null) {
                        c11633c = interfaceC6770g.mo2210e();
                    } else {
                        c11633c = null;
                    }
                    if (c11633c == null || c11633c.m7456d() || !C9612q.m13922c(c11633c.m7455e(), C5876i.this.mo24217C().mo4161e())) {
                        return null;
                    }
                    C5850f c5850f = new C5850f(this.f16801k, C5876i.this.mo24217C(), interfaceC6770g, null, 8, null);
                    this.f16801k.m33014a().m33045e().mo322a(c5850f);
                    return c5850f;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + interfaceC6770g + "\nClassId: " + c11632b2 + "\nfindKotlinClass(JavaClass) = " + C7563q.m20401a(this.f16801k.m33014a().m33040j(), interfaceC6770g) + "\nfindKotlinClass(ClassId) = " + C7563q.m20400b(this.f16801k.m33014a().m33040j(), c11632b2) + '\n');
            }
            throw new C11581q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dh.i$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5883d extends AbstractC9614s implements Function0<Set<? extends String>> {

        /* renamed from: j */
        final /* synthetic */ C2548g f16802j;

        /* renamed from: k */
        final /* synthetic */ C5876i f16803k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5883d(C2548g c2548g, C5876i c5876i) {
            super(0);
            this.f16802j = c2548g;
            this.f16803k = c5876i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Set<String> invoke() {
            return this.f16802j.m33014a().m33046d().mo325b(this.f16803k.mo24217C().mo4161e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5876i(C2548g c, InterfaceC6784u jPackage, C5871h ownerDescriptor) {
        super(c);
        C9612q.m13917h(c, "c");
        C9612q.m13917h(jPackage, "jPackage");
        C9612q.m13917h(ownerDescriptor, "ownerDescriptor");
        this.f16791n = jPackage;
        this.f16792o = ownerDescriptor;
        this.f16793p = c.m33010e().mo21865e(new C5883d(c, this));
        this.f16794q = c.m33010e().mo21863g(new C5882c(c));
    }

    /* renamed from: N */
    private final InterfaceC11914e m24268N(C11638f c11638f, InterfaceC6770g interfaceC6770g) {
        if (!C11640h.f30217a.m7417a(c11638f)) {
            return null;
        }
        Set<String> invoke = this.f16793p.invoke();
        if (interfaceC6770g == null && invoke != null && !invoke.contains(c11638f.m7426b())) {
            return null;
        }
        return this.f16794q.invoke(new C5877a(c11638f, interfaceC6770g));
    }

    /* renamed from: R */
    public final AbstractC5878b m24264R(InterfaceC7564r interfaceC7564r) {
        if (interfaceC7564r == null) {
            return AbstractC5878b.C5880b.f16798a;
        }
        if (interfaceC7564r.mo2854c().m17013c() == C8942a.EnumC8943a.CLASS) {
            InterfaceC11914e m20447k = m24240w().m33014a().m33048b().m20447k(interfaceC7564r);
            if (m20447k != null) {
                return new AbstractC5878b.C5879a(m20447k);
            }
            return AbstractC5878b.C5880b.f16798a;
        }
        return AbstractC5878b.C5881c.f16799a;
    }

    /* renamed from: O */
    public final InterfaceC11914e m24267O(InterfaceC6770g javaClass) {
        C9612q.m13917h(javaClass, "javaClass");
        return m24268N(javaClass.getName(), javaClass);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: P */
    public InterfaceC11914e mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        return m24268N(name, null);
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: Q */
    public C5871h mo24217C() {
        return this.f16792o;
    }

    @Override // p069dh.AbstractC5884j, ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        List m14104i;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0033 A[SYNTHETIC] */
    @Override // p069dh.AbstractC5884j, ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection<p305qg.InterfaceC11947m> mo4358e(ai.C0185d r5, kotlin.jvm.functions.Function1<? super ph.C11638f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            ai.d$a r0 = ai.C0185d.f608c
            int r1 = r0.m40989c()
            int r0 = r0.m40987e()
            r0 = r0 | r1
            boolean r5 = r5.m41005a(r0)
            if (r5 != 0) goto L20
            java.util.List r5 = kotlin.collections.C9543h.m14145i()
            goto L65
        L20:
            gi.i r5 = r4.m24241v()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            r2 = r1
            qg.m r2 = (p305qg.InterfaceC11947m) r2
            boolean r3 = r2 instanceof p305qg.InterfaceC11914e
            if (r3 == 0) goto L5d
            qg.e r2 = (p305qg.InterfaceC11914e) r2
            ph.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            kotlin.jvm.internal.C9612q.m13918g(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5d
            r2 = 1
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L33
            r0.add(r1)
            goto L33
        L64:
            r5 = r0
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p069dh.C5876i.mo4358e(ai.d, kotlin.jvm.functions.Function1):java.util.Collection");
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: l */
    protected Set<C11638f> mo24209l(C0185d kindFilter, Function1<? super C11638f, Boolean> function1) {
        C11638f name;
        Set<C11638f> m14007d;
        C9612q.m13917h(kindFilter, "kindFilter");
        if (!kindFilter.m41005a(C0185d.f608c.m40987e())) {
            m14007d = C9560w.m14007d();
            return m14007d;
        }
        Set<String> invoke = this.f16793p.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            for (String str : invoke) {
                hashSet.add(C11638f.m7422f(str));
            }
            return hashSet;
        }
        InterfaceC6784u interfaceC6784u = this.f16791n;
        if (function1 == null) {
            function1 = C12251d.m5658a();
        }
        Collection<InterfaceC6770g> mo2167F = interfaceC6784u.mo2167F(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6770g interfaceC6770g : mo2167F) {
            if (interfaceC6770g.mo2219K() == EnumC6767d0.SOURCE) {
                name = null;
            } else {
                name = interfaceC6770g.getName();
            }
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: n */
    protected Set<C11638f> mo24208n(C0185d kindFilter, Function1<? super C11638f, Boolean> function1) {
        Set<C11638f> m14007d;
        C9612q.m13917h(kindFilter, "kindFilter");
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: p */
    protected InterfaceC5841b mo24206p() {
        return InterfaceC5841b.C5842a.f16714a;
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: r */
    protected void mo24205r(Collection<InterfaceC12005z0> result, C11638f name) {
        C9612q.m13917h(result, "result");
        C9612q.m13917h(name, "name");
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: t */
    protected Set<C11638f> mo24204t(C0185d kindFilter, Function1<? super C11638f, Boolean> function1) {
        Set<C11638f> m14007d;
        C9612q.m13917h(kindFilter, "kindFilter");
        m14007d = C9560w.m14007d();
        return m14007d;
    }
}