package p164j$.util.stream;

import p164j$.util.InterfaceC8362J;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.m1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8695m1 extends C8589O2 implements InterfaceC8538D0, InterfaceC8759z0 {
    @Override // p164j$.util.stream.InterfaceC8543E0, p164j$.util.stream.InterfaceC8548F0
    /* renamed from: a */
    public final InterfaceC8543E0 mo17392a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC8548F0 mo17392a(int i) {
        mo17392a(i);
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2, p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        AbstractC8744w0.m17335p0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(int i) {
        AbstractC8744w0.m17322w0();
        throw null;
    }

    @Override // p164j$.util.stream.C8589O2, p164j$.util.function.InterfaceC8468f0
    public final void accept(long j) {
        super.accept(j);
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17315m((Long) obj);
    }

    @Override // p164j$.util.stream.AbstractC8597Q2, p164j$.util.stream.InterfaceC8543E0
    /* renamed from: b */
    public final Object mo17430b() {
        return (long[]) super.mo17430b();
    }

    @Override // p164j$.util.stream.InterfaceC8759z0, p164j$.util.stream.InterfaceC8523A0
    public final InterfaceC8538D0 build() {
        return this;
    }

    @Override // p164j$.util.stream.InterfaceC8523A0
    public final InterfaceC8548F0 build() {
        return this;
    }

    @Override // p164j$.util.stream.AbstractC8597Q2, p164j$.util.stream.InterfaceC8543E0
    /* renamed from: c */
    public final void mo17429c(int i, Object obj) {
        super.mo17429c(i, (long[]) obj);
    }

    @Override // p164j$.util.stream.AbstractC8597Q2, p164j$.util.stream.InterfaceC8543E0
    /* renamed from: d */
    public final void mo17428d(Object obj) {
        super.mo17428d((InterfaceC8468f0) obj);
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final void end() {
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        clear();
        m17552v(j);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo17301i() {
        return false;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: k */
    public final /* synthetic */ int mo17390k() {
        return 0;
    }

    @Override // p164j$.util.stream.InterfaceC8666g2
    /* renamed from: m */
    public final /* synthetic */ void mo17315m(Long l) {
        AbstractC8744w0.m17325u0(this, l);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: p */
    public final /* synthetic */ Object[] mo17389p(IntFunction intFunction) {
        return AbstractC8744w0.m17317y0(this, intFunction);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17371H0(this, j, j2);
    }

    @Override // p164j$.util.stream.C8589O2, p164j$.util.stream.AbstractC8597Q2, java.lang.Iterable
    public final InterfaceC8365M spliterator() {
        return super.spliterator();
    }

    @Override // p164j$.util.stream.C8589O2, p164j$.util.stream.AbstractC8597Q2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // p164j$.util.stream.C8589O2
    /* renamed from: y */
    public final InterfaceC8362J mo17427y() {
        return super.spliterator();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: z */
    public final /* synthetic */ void mo17391f(Long[] lArr, int i) {
        AbstractC8744w0.m17377B0(this, lArr, i);
    }
}