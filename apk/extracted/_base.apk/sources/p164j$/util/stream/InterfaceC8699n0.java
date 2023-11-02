package p164j$.util.stream;

import p164j$.util.C8509g;
import p164j$.util.C8512j;
import p164j$.util.C8514l;
import p164j$.util.InterfaceC8362J;
import p164j$.util.InterfaceC8768y;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.InterfaceC8426E0;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8460b0;
import p164j$.util.function.InterfaceC8468f0;
import p164j$.util.function.InterfaceC8474i0;
import p164j$.util.function.InterfaceC8480l0;
import p164j$.util.function.InterfaceC8486o0;
import p164j$.util.function.InterfaceC8492r0;
import p164j$.util.function.InterfaceC8500v0;

/* renamed from: j$.util.stream.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface InterfaceC8699n0 extends InterfaceC8673i {
    /* renamed from: A */
    Object mo17424A(InterfaceC8438K0 interfaceC8438K0, InterfaceC8426E0 interfaceC8426E0, BiConsumer biConsumer);

    /* renamed from: B */
    boolean mo17423B(InterfaceC8480l0 interfaceC8480l0);

    /* renamed from: G */
    void mo17422G(InterfaceC8468f0 interfaceC8468f0);

    /* renamed from: M */
    InterfaceC8552G mo17421M(InterfaceC8486o0 interfaceC8486o0);

    /* renamed from: Q */
    InterfaceC8699n0 mo17420Q(InterfaceC8500v0 interfaceC8500v0);

    /* renamed from: X */
    IntStream mo17419X(InterfaceC8492r0 interfaceC8492r0);

    /* renamed from: Y */
    Stream mo17418Y(InterfaceC8474i0 interfaceC8474i0);

    /* renamed from: a */
    boolean mo17417a(InterfaceC8480l0 interfaceC8480l0);

    InterfaceC8552G asDoubleStream();

    C8512j average();

    Stream boxed();

    long count();

    InterfaceC8699n0 distinct();

    /* renamed from: e */
    C8514l mo17416e(InterfaceC8460b0 interfaceC8460b0);

    /* renamed from: f */
    InterfaceC8699n0 mo17415f(InterfaceC8468f0 interfaceC8468f0);

    C8514l findAny();

    C8514l findFirst();

    /* renamed from: g */
    InterfaceC8699n0 mo17414g(InterfaceC8474i0 interfaceC8474i0);

    /* renamed from: h0 */
    boolean mo17413h0(InterfaceC8480l0 interfaceC8480l0);

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    InterfaceC8768y iterator();

    /* renamed from: k0 */
    InterfaceC8699n0 mo17412k0(InterfaceC8480l0 interfaceC8480l0);

    InterfaceC8699n0 limit(long j);

    /* renamed from: m */
    long mo17411m(long j, InterfaceC8460b0 interfaceC8460b0);

    C8514l max();

    C8514l min();

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    InterfaceC8699n0 parallel();

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    InterfaceC8699n0 sequential();

    InterfaceC8699n0 skip(long j);

    InterfaceC8699n0 sorted();

    @Override // p164j$.util.stream.InterfaceC8673i, p164j$.util.stream.InterfaceC8552G
    InterfaceC8362J spliterator();

    long sum();

    C8509g summaryStatistics();

    long[] toArray();

    /* renamed from: z */
    void mo17410z(InterfaceC8468f0 interfaceC8468f0);
}
