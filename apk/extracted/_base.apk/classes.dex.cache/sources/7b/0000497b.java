package pg;

import ai.AbstractC0188e;
import gi.InterfaceC6821n;
import java.util.List;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import ph.C11638f;
import tg.C12701g0;

/* renamed from: pg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11595a extends AbstractC0188e {

    /* renamed from: e */
    public static final C11596a f30106e = new C11596a(null);

    /* renamed from: f */
    private static final C11638f f30107f;

    /* renamed from: pg.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11596a {
        private C11596a() {
        }

        public /* synthetic */ C11596a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11638f m7568a() {
            return C11595a.f30107f;
        }
    }

    static {
        C11638f m7422f = C11638f.m7422f("clone");
        C9612q.m13918g(m7422f, "identifier(\"clone\")");
        f30107f = m7422f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11595a(InterfaceC6821n storageManager, InterfaceC11914e containingClass) {
        super(storageManager, containingClass);
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(containingClass, "containingClass");
    }

    @Override // ai.AbstractC0188e
    /* renamed from: i */
    protected List<InterfaceC11998y> mo7570i() {
        List<InterfaceC11997x0> m14104i;
        List<? extends InterfaceC11920f1> m14104i2;
        List<InterfaceC11936j1> m14104i3;
        List<InterfaceC11998y> m14109d;
        C12701g0 m4434l1 = C12701g0.m4434l1(m40976l(), InterfaceC12155g.f31603f.m6037b(), f30107f, InterfaceC11902b.EnumC11903a.DECLARATION, InterfaceC11900a1.f30901a);
        InterfaceC11997x0 mo4233J0 = m40976l().mo4233J0();
        m14104i = C9545j.m14104i();
        m14104i2 = C9545j.m14104i();
        m14104i3 = C9545j.m14104i();
        m4434l1.mo4323R0(null, mo4233J0, m14104i, m14104i2, m14104i3, C13801c.m1505j(m40976l()).m9810i(), EnumC11915e0.OPEN, C11974t.f30968c);
        m14109d = C9544i.m14109d(m4434l1);
        return m14109d;
    }
}