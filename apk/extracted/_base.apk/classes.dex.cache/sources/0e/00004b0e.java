package p305qg;

import java.util.Collection;
import java.util.List;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7297n1;
import p142hi.C7307p1;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11902b;
import p325rg.InterfaceC12155g;
import ph.C11638f;

/* renamed from: qg.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC11998y extends InterfaceC11902b {

    /* renamed from: qg.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public interface InterfaceC11999a<D extends InterfaceC11998y> {
        /* renamed from: a */
        InterfaceC11999a<D> mo4270a();

        /* renamed from: b */
        InterfaceC11999a<D> mo4269b(List<InterfaceC11936j1> list);

        D build();

        /* renamed from: c */
        InterfaceC11999a<D> mo4268c(InterfaceC11902b interfaceC11902b);

        /* renamed from: d */
        InterfaceC11999a<D> mo4267d(C11638f c11638f);

        /* renamed from: e */
        InterfaceC11999a<D> mo4266e(InterfaceC11947m interfaceC11947m);

        /* renamed from: f */
        InterfaceC11999a<D> mo4265f();

        /* renamed from: g */
        InterfaceC11999a<D> mo4264g(AbstractC11988u abstractC11988u);

        /* renamed from: h */
        InterfaceC11999a<D> mo4263h();

        /* renamed from: i */
        InterfaceC11999a<D> mo4262i(InterfaceC11997x0 interfaceC11997x0);

        /* renamed from: j */
        InterfaceC11999a<D> mo4261j();

        /* renamed from: k */
        InterfaceC11999a<D> mo4260k(InterfaceC11997x0 interfaceC11997x0);

        /* renamed from: l */
        InterfaceC11999a<D> mo4259l(AbstractC7264g0 abstractC7264g0);

        /* renamed from: m */
        InterfaceC11999a<D> mo4258m(boolean z);

        /* renamed from: n */
        InterfaceC11999a<D> mo4257n(AbstractC7297n1 abstractC7297n1);

        /* renamed from: o */
        InterfaceC11999a<D> mo4256o(List<InterfaceC11920f1> list);

        /* renamed from: p */
        InterfaceC11999a<D> mo4255p(InterfaceC12155g interfaceC12155g);

        /* renamed from: q */
        <V> InterfaceC11999a<D> mo4254q(InterfaceC11897a.InterfaceC11898a<V> interfaceC11898a, V v);

        /* renamed from: r */
        InterfaceC11999a<D> mo4253r(InterfaceC11902b.EnumC11903a enumC11903a);

        /* renamed from: s */
        InterfaceC11999a<D> mo4252s(EnumC11915e0 enumC11915e0);

        /* renamed from: t */
        InterfaceC11999a<D> mo4251t();
    }

    /* renamed from: B */
    boolean mo4338B();

    /* renamed from: C0 */
    boolean mo4337C0();

    /* renamed from: F0 */
    boolean mo4334F0();

    @Override // p305qg.InterfaceC11902b, p305qg.InterfaceC11897a, p305qg.InterfaceC11947m
    /* renamed from: a */
    InterfaceC11998y mo4221a();

    @Override // p305qg.InterfaceC11959n, p305qg.InterfaceC11947m
    /* renamed from: b */
    InterfaceC11947m mo4163b();

    /* renamed from: c */
    InterfaceC11998y mo4225c(C7307p1 c7307p1);

    @Override // p305qg.InterfaceC11902b, p305qg.InterfaceC11897a
    /* renamed from: d */
    Collection<? extends InterfaceC11998y> mo4310d();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    /* renamed from: s0 */
    InterfaceC11998y mo4297s0();

    /* renamed from: u */
    InterfaceC11999a<? extends InterfaceC11998y> mo4296u();
}