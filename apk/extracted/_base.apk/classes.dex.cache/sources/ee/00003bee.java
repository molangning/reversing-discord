package p164j$.util.stream;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Arrays;
import java.util.Iterator;
import p164j$.util.AbstractC8383c0;
import p164j$.util.InterfaceC8362J;
import p164j$.util.function.C8462c0;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.stream.O2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8589O2 extends AbstractC8597Q2 implements InterfaceC8468f0 {
    public C8589O2() {
    }

    public C8589O2(int i) {
        super(i);
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    public void accept(long j) {
        m17550x();
        int i = this.f22842b;
        this.f22842b = i + 1;
        ((long[]) this.f22745e)[i] = j;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof InterfaceC8468f0) {
            mo17428d((InterfaceC8468f0) consumer);
        } else if (AbstractC8561H3.f22693a) {
            AbstractC8561H3.m17571a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC8383c0.m17756h(spliterator());
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    /* renamed from: s */
    public final void mo17555s(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        InterfaceC8468f0 interfaceC8468f0 = (InterfaceC8468f0) obj2;
        while (i < i2) {
            interfaceC8468f0.accept(jArr[i]);
            i++;
        }
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    /* renamed from: t */
    public final int mo17554t(Object obj) {
        return ((long[]) obj).length;
    }

    public final String toString() {
        long[] jArr = (long[]) mo17430b();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f22843c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f22843c), Arrays.toString(Arrays.copyOf(jArr, (int) ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION)));
    }

    @Override // p164j$.util.stream.AbstractC8597Q2
    /* renamed from: w */
    protected final Object[] mo17551w() {
        return new long[8];
    }

    @Override // p164j$.util.stream.AbstractC8597Q2, java.lang.Iterable
    /* renamed from: y */
    public InterfaceC8362J spliterator() {
        return new C8585N2(this, 0, this.f22843c, 0, this.f22842b);
    }
}