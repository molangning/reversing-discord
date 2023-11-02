package p164j$.util.stream;

import java.util.Arrays;
import p164j$.util.AbstractC8383c0;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8468f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8685k1 implements InterfaceC8538D0 {

    /* renamed from: a */
    final long[] f22881a;

    /* renamed from: b */
    int f22882b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8685k1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22881a = new long[(int) j];
        this.f22882b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8685k1(long[] jArr) {
        this.f22881a = jArr;
        this.f22882b = jArr.length;
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
        long[] jArr = this.f22881a;
        int length = jArr.length;
        int i = this.f22882b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: c */
    public final void mo17429c(int i, Object obj) {
        int i2 = this.f22882b;
        System.arraycopy(this.f22881a, 0, (long[]) obj, i, i2);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final long count() {
        return this.f22882b;
    }

    @Override // p164j$.util.stream.InterfaceC8543E0
    /* renamed from: d */
    public final void mo17428d(Object obj) {
        InterfaceC8468f0 interfaceC8468f0 = (InterfaceC8468f0) obj;
        for (int i = 0; i < this.f22882b; i++) {
            interfaceC8468f0.accept(this.f22881a[i]);
        }
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC8744w0.m17374E0(this, consumer);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: k */
    public final /* synthetic */ int mo17390k() {
        return 0;
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    /* renamed from: n */
    public final /* synthetic */ void mo17391f(Long[] lArr, int i) {
        AbstractC8744w0.m17377B0(this, lArr, i);
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

    @Override // p164j$.util.stream.InterfaceC8543E0, p164j$.util.stream.InterfaceC8548F0
    public final InterfaceC8365M spliterator() {
        return AbstractC8383c0.m17752l(this.f22881a, 0, this.f22882b);
    }

    @Override // p164j$.util.stream.InterfaceC8548F0
    public final Spliterator spliterator() {
        return AbstractC8383c0.m17752l(this.f22881a, 0, this.f22882b);
    }

    public String toString() {
        long[] jArr = this.f22881a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f22882b), Arrays.toString(jArr));
    }
}
