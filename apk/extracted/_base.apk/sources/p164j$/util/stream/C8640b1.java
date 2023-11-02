package p164j$.util.stream;

import java.util.Arrays;
import p164j$.util.AbstractC8383c0;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8437K;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8640b1 implements InterfaceC8533C0 {

    /* renamed from: a */
    final int[] f22820a;

    /* renamed from: b */
    int f22821b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8640b1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22820a = new int[(int) j];
        this.f22821b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8640b1(int[] iArr) {
        this.f22820a = iArr;
        this.f22821b = iArr.length;
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
        int[] iArr = this.f22820a;
        int length = iArr.length;
        int i = this.f22821b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: c */
    public final void mo17429c(int i, Object obj) {
        int i2 = this.f22821b;
        System.arraycopy(this.f22820a, 0, (int[]) obj, i, i2);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final long count() {
        return this.f22821b;
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: d */
    public final void mo17428d(Object obj) {
        InterfaceC8437K interfaceC8437K = (InterfaceC8437K) obj;
        for (int i = 0; i < this.f22821b; i++) {
            interfaceC8437K.accept(this.f22820a[i]);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC8744w0.m17375D0(this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: j */
    public final /* synthetic */ void mo17391f(Integer[] numArr, int i) {
        AbstractC8744w0.m17378A0(this, numArr, i);
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
        return AbstractC8744w0.m17372G0(this, j, j2);
    }

    @Override // p164j$.util.stream.InterfaceC8543E0, p164j$.util.stream.InterfaceC8548F0
    public final InterfaceC8365M spliterator() {
        return AbstractC8383c0.m17753k(this.f22820a, 0, this.f22821b);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        return AbstractC8383c0.m17753k(this.f22820a, 0, this.f22821b);
    }

    public String toString() {
        int[] iArr = this.f22820a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f22821b), Arrays.toString(iArr));
    }
}
