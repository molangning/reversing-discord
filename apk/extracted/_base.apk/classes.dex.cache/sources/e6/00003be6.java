package p164j$.util.stream;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Arrays;
import java.util.Iterator;
import p164j$.util.AbstractC8383c0;
import p164j$.util.InterfaceC8359G;
import p164j$.util.function.C8431H;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.stream.M2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8581M2 extends AbstractC8597Q2 implements InterfaceC8437K {
    public C8581M2() {
    }

    public C8581M2(int i) {
        super(i);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    public void accept(int i) {
        m17550x();
        int i2 = this.f22842b;
        this.f22842b = i2 + 1;
        ((int[]) this.f22745e)[i2] = i;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof InterfaceC8437K) {
            mo17428d((InterfaceC8437K) consumer);
        } else if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC8383c0.m17757g(spliterator());
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    /* renamed from: s */
    public final void mo17555s(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        InterfaceC8437K interfaceC8437K = (InterfaceC8437K) obj2;
        while (i < i2) {
            interfaceC8437K.accept(iArr[i]);
            i++;
        }
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    /* renamed from: t */
    public final int mo17554t(Object obj) {
        return ((int[]) obj).length;
    }

    public final String toString() {
        int[] iArr = (int[]) mo17430b();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f22843c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f22843c), Arrays.toString(Arrays.copyOf(iArr, (int) ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION)));
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    /* renamed from: w */
    protected final Object[] mo17551w() {
        return new int[8];
    }

    @Override // p164j$.util.stream.AbstractC8597Q2, java.lang.Iterable
    /* renamed from: y */
    public InterfaceC8359G spliterator() {
        return new C8577L2(this, 0, this.f22843c, 0, this.f22842b);
    }
}