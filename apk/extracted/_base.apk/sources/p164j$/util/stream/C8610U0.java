package p164j$.util.stream;

import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8483n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.U0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8610U0 extends C8573K2 implements InterfaceC8528B0, InterfaceC8749x0 {
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

    @Override // p164j$.util.stream.C8573K2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        super.accept(d);
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(int i) {
        AbstractC8744w0.m17322w0();
        throw null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    public final /* synthetic */ void accept(long j) {
        AbstractC8744w0.m17320x0();
        throw null;
    }

    @Override // p164j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo17298q((Double) obj);
    }

    @Override // p164j$.util.stream.AbstractC8597Q2, p164j$.util.stream.InterfaceC8543E0
    /* renamed from: b */
    public final Object mo17430b() {
        return (double[]) super.mo17430b();
    }

    @Override // p164j$.util.stream.InterfaceC8749x0, p164j$.util.stream.InterfaceC8523A0
    public final InterfaceC8528B0 build() {
        return this;
    }

    @Override // p164j$.util.stream.InterfaceC8523A0
    public final InterfaceC8548F0 build() {
        return this;
    }

    @Override // p164j$.util.stream.AbstractC8597Q2, p164j$.util.stream.InterfaceC8543E0
    /* renamed from: c */
    public final void mo17429c(int i, Object obj) {
        super.mo17429c(i, (double[]) obj);
    }

    @Override // p164j$.util.stream.AbstractC8597Q2, p164j$.util.stream.InterfaceC8543E0
    /* renamed from: d */
    public final void mo17428d(Object obj) {
        super.mo17428d((InterfaceC8483n) obj);
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

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: p */
    public final /* synthetic */ Object[] mo17389p(IntFunction intFunction) {
        return AbstractC8744w0.m17317y0(this, intFunction);
    }

    @Override // p164j$.util.stream.InterfaceC8656e2
    /* renamed from: q */
    public final /* synthetic */ void mo17298q(Double d) {
        AbstractC8744w0.m17333q0(this, d);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17373F0(this, j, j2);
    }

    @Override // p164j$.util.stream.C8573K2, p164j$.util.stream.AbstractC8597Q2, java.lang.Iterable
    public final InterfaceC8365M spliterator() {
        return super.spliterator();
    }

    @Override // p164j$.util.stream.C8573K2, p164j$.util.stream.AbstractC8597Q2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // p164j$.util.stream.C8573K2
    /* renamed from: y */
    public final InterfaceC8356D mo17543y() {
        return super.spliterator();
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: z */
    public final /* synthetic */ void mo17391f(Double[] dArr, int i) {
        AbstractC8744w0.m17316z0(this, dArr, i);
    }
}
