package p164j$.util.stream;

import java.util.Arrays;
import p164j$.util.AbstractC8383c0;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8483n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.S0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8602S0 implements InterfaceC8528B0 {

    /* renamed from: a */
    final double[] f22751a;

    /* renamed from: b */
    int f22752b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8602S0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22751a = new double[(int) j];
        this.f22752b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8602S0(double[] dArr) {
        this.f22751a = dArr;
        this.f22752b = dArr.length;
    }

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

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: b */
    public final Object mo17430b() {
        double[] dArr = this.f22751a;
        int length = dArr.length;
        int i = this.f22752b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: c */
    public final void mo17429c(int i, Object obj) {
        int i2 = this.f22752b;
        System.arraycopy(this.f22751a, 0, (double[]) obj, i, i2);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final long count() {
        return this.f22752b;
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: d */
    public final void mo17428d(Object obj) {
        InterfaceC8483n interfaceC8483n = (InterfaceC8483n) obj;
        for (int i = 0; i < this.f22752b; i++) {
            interfaceC8483n.accept(this.f22751a[i]);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC8744w0.m17376C0(this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: j */
    public final /* synthetic */ void mo17391f(Double[] dArr, int i) {
        AbstractC8744w0.m17316z0(this, dArr, i);
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

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: r */
    public final /* synthetic */ InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction) {
        return AbstractC8744w0.m17373F0(this, j, j2);
    }

    @Override // p164j$.util.stream.InterfaceC8543E0, p164j$.util.stream.InterfaceC8548F0
    public final InterfaceC8365M spliterator() {
        return AbstractC8383c0.m17754j(this.f22751a, 0, this.f22752b);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        return AbstractC8383c0.m17754j(this.f22751a, 0, this.f22752b);
    }

    public String toString() {
        double[] dArr = this.f22751a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f22752b), Arrays.toString(dArr));
    }
}
