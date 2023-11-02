package p160ih;

import ai.InterfaceC0194h;
import fi.C6473i;
import fi.EnumC6448e;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kh.C9386c;
import kh.C9419l;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9559v;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070di.C5930g;
import p070di.C5939k;
import p070di.C5954t;
import p182jh.C8942a;
import p270oh.C11115e;
import p270oh.C11117f;
import p270oh.C11122i;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11945l0;
import p326rh.C12199k;
import ph.C11638f;

/* renamed from: ih.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7544h {

    /* renamed from: b */
    public static final C7545a f20833b = new C7545a(null);

    /* renamed from: c */
    private static final Set<C8942a.EnumC8943a> f20834c;

    /* renamed from: d */
    private static final Set<C8942a.EnumC8943a> f20835d;

    /* renamed from: e */
    private static final C11115e f20836e;

    /* renamed from: f */
    private static final C11115e f20837f;

    /* renamed from: g */
    private static final C11115e f20838g;

    /* renamed from: a */
    public C5939k f20839a;

    /* renamed from: ih.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7545a {
        private C7545a() {
        }

        public /* synthetic */ C7545a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11115e m20444a() {
            return C7544h.f20838g;
        }
    }

    /* renamed from: ih.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7546b extends AbstractC9614s implements Function0<Collection<? extends C11638f>> {

        /* renamed from: j */
        public static final C7546b f20840j = new C7546b();

        C7546b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Collection<C11638f> invoke() {
            List m14104i;
            m14104i = C9545j.m14104i();
            return m14104i;
        }
    }

    static {
        Set<C8942a.EnumC8943a> m14008c;
        Set<C8942a.EnumC8943a> m14002i;
        m14008c = C9559v.m14008c(C8942a.EnumC8943a.CLASS);
        f20834c = m14008c;
        m14002i = C9560w.m14002i(C8942a.EnumC8943a.FILE_FACADE, C8942a.EnumC8943a.MULTIFILE_CLASS_PART);
        f20835d = m14002i;
        f20836e = new C11115e(1, 1, 2);
        f20837f = new C11115e(1, 1, 11);
        f20838g = new C11115e(1, 1, 13);
    }

    /* renamed from: c */
    private final EnumC6448e m20455c(InterfaceC7564r interfaceC7564r) {
        if (m20454d().m24125g().mo24106d()) {
            return EnumC6448e.STABLE;
        }
        if (interfaceC7564r.mo2854c().m17006j()) {
            return EnumC6448e.FIR_UNSTABLE;
        }
        if (interfaceC7564r.mo2854c().m17005k()) {
            return EnumC6448e.IR_UNSTABLE;
        }
        return EnumC6448e.STABLE;
    }

    /* renamed from: e */
    private final C5954t<C11115e> m20453e(InterfaceC7564r interfaceC7564r) {
        if (!m20452f() && !interfaceC7564r.mo2854c().m17012d().m9137h()) {
            return new C5954t<>(interfaceC7564r.mo2854c().m17012d(), C11115e.f29087i, interfaceC7564r.mo2856a(), interfaceC7564r.mo2851n());
        }
        return null;
    }

    /* renamed from: f */
    private final boolean m20452f() {
        return m20454d().m24125g().mo24105e();
    }

    /* renamed from: g */
    private final boolean m20451g(InterfaceC7564r interfaceC7564r) {
        if (!m20454d().m24125g().mo24108b() && interfaceC7564r.mo2854c().m17007i() && C9612q.m13922c(interfaceC7564r.mo2854c().m17012d(), f20837f)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m20450h(InterfaceC7564r interfaceC7564r) {
        if ((m20454d().m24125g().mo24104f() && (interfaceC7564r.mo2854c().m17007i() || C9612q.m13922c(interfaceC7564r.mo2854c().m17012d(), f20836e))) || m20451g(interfaceC7564r)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final String[] m20448j(InterfaceC7564r interfaceC7564r, Set<? extends C8942a.EnumC8943a> set) {
        C8942a mo2854c = interfaceC7564r.mo2854c();
        String[] m17015a = mo2854c.m17015a();
        if (m17015a == null) {
            m17015a = mo2854c.m17014b();
        }
        if (m17015a == null || !set.contains(mo2854c.m17013c())) {
            return null;
        }
        return m17015a;
    }

    /* renamed from: b */
    public final InterfaceC0194h m20456b(InterfaceC11945l0 descriptor, InterfaceC7564r kotlinClass) {
        String[] m17009g;
        Pair<C11117f, C9419l> pair;
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(kotlinClass, "kotlinClass");
        String[] m20448j = m20448j(kotlinClass, f20835d);
        if (m20448j == null || (m17009g = kotlinClass.mo2854c().m17009g()) == null) {
            return null;
        }
        try {
            try {
                pair = C11122i.m9121m(m20448j, m17009g);
            } catch (C12199k e) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.mo2856a(), e);
            }
        } catch (Throwable th2) {
            if (!m20452f() && !kotlinClass.mo2854c().m17012d().m9137h()) {
                pair = null;
            } else {
                throw th2;
            }
        }
        if (pair == null) {
            return null;
        }
        C11117f m14351a = pair.m14351a();
        C9419l m14350b = pair.m14350b();
        C7550l c7550l = new C7550l(kotlinClass, m14350b, m14351a, m20453e(kotlinClass), m20450h(kotlinClass), m20455c(kotlinClass));
        return new C6473i(descriptor, m14350b, m14351a, kotlinClass.mo2854c().m17012d(), c7550l, m20454d(), "scope for " + c7550l + " in " + descriptor, C7546b.f20840j);
    }

    /* renamed from: d */
    public final C5939k m20454d() {
        C5939k c5939k = this.f20839a;
        if (c5939k != null) {
            return c5939k;
        }
        C9612q.m13900y("components");
        return null;
    }

    /* renamed from: i */
    public final C5930g m20449i(InterfaceC7564r kotlinClass) {
        String[] m17009g;
        Pair<C11117f, C9386c> pair;
        C9612q.m13917h(kotlinClass, "kotlinClass");
        String[] m20448j = m20448j(kotlinClass, f20834c);
        if (m20448j == null || (m17009g = kotlinClass.mo2854c().m17009g()) == null) {
            return null;
        }
        try {
            try {
                pair = C11122i.m9125i(m20448j, m17009g);
            } catch (C12199k e) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.mo2856a(), e);
            }
        } catch (Throwable th2) {
            if (!m20452f() && !kotlinClass.mo2854c().m17012d().m9137h()) {
                pair = null;
            } else {
                throw th2;
            }
        }
        if (pair == null) {
            return null;
        }
        return new C5930g(pair.m14351a(), pair.m14350b(), kotlinClass.mo2854c().m17012d(), new C7571t(kotlinClass, m20453e(kotlinClass), m20450h(kotlinClass), m20455c(kotlinClass)));
    }

    /* renamed from: k */
    public final InterfaceC11914e m20447k(InterfaceC7564r kotlinClass) {
        C9612q.m13917h(kotlinClass, "kotlinClass");
        C5930g m20449i = m20449i(kotlinClass);
        if (m20449i == null) {
            return null;
        }
        return m20454d().m24126f().m24139d(kotlinClass.mo2851n(), m20449i);
    }

    /* renamed from: l */
    public final void m20446l(C5939k c5939k) {
        C9612q.m13917h(c5939k, "<set-?>");
        this.f20839a = c5939k;
    }

    /* renamed from: m */
    public final void m20445m(C7539f components) {
        C9612q.m13917h(components, "components");
        m20446l(components.m20464a());
    }
}