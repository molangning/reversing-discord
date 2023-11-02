package p164j$.util.stream;

import p164j$.util.C8414e;
import p164j$.util.C8512j;
import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8519q;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.InterfaceC8421C;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8475j;
import p164j$.util.function.InterfaceC8483n;
import p164j$.util.function.InterfaceC8489q;
import p164j$.util.function.InterfaceC8495t;
import p164j$.util.function.InterfaceC8501w;
import p164j$.util.function.InterfaceC8506y0;
import p164j$.util.function.InterfaceC8507z;

/* renamed from: j$.util.stream.G */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface InterfaceC8552G extends InterfaceC8673i {
    /* renamed from: D */
    IntStream mo17586D(InterfaceC8501w interfaceC8501w);

    /* renamed from: J */
    void mo17585J(InterfaceC8483n interfaceC8483n);

    /* renamed from: R */
    C8512j mo17584R(InterfaceC8475j interfaceC8475j);

    /* renamed from: U */
    double mo17583U(double d, InterfaceC8475j interfaceC8475j);

    /* renamed from: V */
    boolean mo17582V(InterfaceC8495t interfaceC8495t);

    /* renamed from: Z */
    boolean mo17581Z(InterfaceC8495t interfaceC8495t);

    C8512j average();

    /* renamed from: b */
    InterfaceC8552G mo17580b(InterfaceC8483n interfaceC8483n);

    Stream boxed();

    long count();

    InterfaceC8552G distinct();

    C8512j findAny();

    C8512j findFirst();

    /* renamed from: h */
    InterfaceC8552G mo17579h(InterfaceC8495t interfaceC8495t);

    /* renamed from: i */
    InterfaceC8552G mo17578i(InterfaceC8489q interfaceC8489q);

    @Override // 
    InterfaceC8519q iterator();

    /* renamed from: j */
    InterfaceC8699n0 mo17577j(InterfaceC8507z interfaceC8507z);

    InterfaceC8552G limit(long j);

    /* renamed from: m0 */
    void mo17576m0(InterfaceC8483n interfaceC8483n);

    C8512j max();

    C8512j min();

    /* renamed from: o */
    Object mo17575o(InterfaceC8438K0 interfaceC8438K0, InterfaceC8506y0 interfaceC8506y0, BiConsumer biConsumer);

    /* renamed from: p */
    InterfaceC8552G mo17574p(InterfaceC8421C interfaceC8421C);

    @Override // 
    InterfaceC8552G parallel();

    /* renamed from: q */
    Stream mo17573q(InterfaceC8489q interfaceC8489q);

    @Override // 
    InterfaceC8552G sequential();

    InterfaceC8552G skip(long j);

    InterfaceC8552G sorted();

    @Override // 
    InterfaceC8356D spliterator();

    double sum();

    C8414e summaryStatistics();

    double[] toArray();

    /* renamed from: x */
    boolean mo17572x(InterfaceC8495t interfaceC8495t);
}
