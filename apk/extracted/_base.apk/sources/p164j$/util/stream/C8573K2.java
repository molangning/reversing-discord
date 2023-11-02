package p164j$.util.stream;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Arrays;
import java.util.Iterator;
import p164j$.util.AbstractC8383c0;
import p164j$.util.InterfaceC8356D;
import p164j$.util.function.C8477k;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.K2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8573K2 extends AbstractC8597Q2 implements InterfaceC8483n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8573K2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8573K2(int i) {
        super(i);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    public void accept(double d) {
        m17550x();
        int i = this.f22842b;
        this.f22842b = i + 1;
        ((double[]) this.f22745e)[i] = d;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof InterfaceC8483n) {
            mo17428d((InterfaceC8483n) consumer);
        } else if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC8383c0.m17758f(spliterator());
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    public final Object newArray(int i) {
        return new double[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8597Q2
    /* renamed from: s */
    public final void mo17555s(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        InterfaceC8483n interfaceC8483n = (InterfaceC8483n) obj2;
        while (i < i2) {
            interfaceC8483n.accept(dArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8597Q2
    /* renamed from: t */
    public final int mo17554t(Object obj) {
        return ((double[]) obj).length;
    }

    public final String toString() {
        double[] dArr = (double[]) mo17430b();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f22843c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f22843c), Arrays.toString(Arrays.copyOf(dArr, (int) ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION)));
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    /* renamed from: w */
    protected final Object[] mo17551w() {
        return new double[8];
    }

    @Override // p164j$.util.stream.AbstractC8597Q2, java.lang.Iterable
    /* renamed from: y */
    public InterfaceC8356D spliterator() {
        return new C8569J2(this, 0, this.f22843c, 0, this.f22842b);
    }
}
