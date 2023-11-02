package p164j$.util.stream;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8359G;
import p164j$.util.InterfaceC8362J;
import p164j$.util.InterfaceC8365M;

/* renamed from: j$.util.stream.P2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8593P2 implements InterfaceC8365M {

    /* renamed from: a */
    int f22737a;

    /* renamed from: b */
    final int f22738b;

    /* renamed from: c */
    int f22739c;

    /* renamed from: d */
    final int f22740d;

    /* renamed from: e */
    Object f22741e;

    /* renamed from: f */
    final /* synthetic */ AbstractC8597Q2 f22742f;

    public AbstractC8593P2(AbstractC8597Q2 abstractC8597Q2, int i, int i2, int i3, int i4) {
        this.f22742f = abstractC8597Q2;
        this.f22737a = i;
        this.f22738b = i2;
        this.f22739c = i3;
        this.f22740d = i4;
        Object[] objArr = abstractC8597Q2.f22746f;
        this.f22741e = objArr == null ? abstractC8597Q2.f22745e : objArr[i];
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    /* renamed from: e */
    abstract void mo17561e(int i, Object obj, Object obj2);

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        int i = this.f22737a;
        int i2 = this.f22740d;
        int i3 = this.f22738b;
        if (i == i3) {
            return i2 - this.f22739c;
        }
        long[] jArr = this.f22742f.f22844d;
        return ((jArr[i3] + i2) - jArr[i]) - this.f22739c;
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: forEachRemaining */
    public final void m17562d(Object obj) {
        AbstractC8597Q2 abstractC8597Q2;
        obj.getClass();
        int i = this.f22737a;
        int i2 = this.f22740d;
        int i3 = this.f22738b;
        if (i < i3 || (i == i3 && this.f22739c < i2)) {
            int i4 = this.f22739c;
            while (true) {
                abstractC8597Q2 = this.f22742f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = abstractC8597Q2.f22746f[i];
                abstractC8597Q2.mo17555s(obj2, i4, abstractC8597Q2.mo17554t(obj2), obj);
                i++;
                i4 = 0;
            }
            abstractC8597Q2.mo17555s(this.f22737a == i3 ? this.f22741e : abstractC8597Q2.f22746f[i3], i4, i2, obj);
            this.f22737a = i3;
            this.f22739c = i2;
        }
    }

    /* renamed from: g */
    abstract InterfaceC8365M mo17559g(Object obj, int i, int i2);

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC8516n.m17606i(this);
    }

    /* renamed from: h */
    abstract InterfaceC8365M mo17558h(int i, int i2, int i3, int i4);

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC8516n.m17605j(this, i);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: tryAdvance */
    public final boolean m17556p(Object obj) {
        obj.getClass();
        int i = this.f22737a;
        int i2 = this.f22738b;
        if (i < i2 || (i == i2 && this.f22739c < this.f22740d)) {
            Object obj2 = this.f22741e;
            int i3 = this.f22739c;
            this.f22739c = i3 + 1;
            mo17561e(i3, obj2, obj);
            int i4 = this.f22739c;
            Object obj3 = this.f22741e;
            AbstractC8597Q2 abstractC8597Q2 = this.f22742f;
            if (i4 == abstractC8597Q2.mo17554t(obj3)) {
                this.f22739c = 0;
                int i5 = this.f22737a + 1;
                this.f22737a = i5;
                Object[] objArr = abstractC8597Q2.f22746f;
                if (objArr != null && i5 <= i2) {
                    this.f22741e = objArr[i5];
                }
            }
            return true;
        }
        return false;
    }

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC8356D trySplit() {
        return (InterfaceC8356D) trySplit();
    }

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC8359G trySplit() {
        return (InterfaceC8359G) trySplit();
    }

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC8362J trySplit() {
        return (InterfaceC8362J) trySplit();
    }

    @Override // p164j$.util.Spliterator
    public final InterfaceC8365M trySplit() {
        int i = this.f22737a;
        int i2 = this.f22738b;
        if (i < i2) {
            int i3 = this.f22739c;
            AbstractC8597Q2 abstractC8597Q2 = this.f22742f;
            InterfaceC8365M mo17558h = mo17558h(i, i2 - 1, i3, abstractC8597Q2.mo17554t(abstractC8597Q2.f22746f[i2 - 1]));
            this.f22737a = i2;
            this.f22739c = 0;
            this.f22741e = abstractC8597Q2.f22746f[i2];
            return mo17558h;
        } else if (i == i2) {
            int i4 = this.f22739c;
            int i5 = (this.f22740d - i4) / 2;
            if (i5 == 0) {
                return null;
            }
            InterfaceC8365M mo17559g = mo17559g(this.f22741e, i4, i5);
            this.f22739c += i5;
            return mo17559g;
        } else {
            return null;
        }
    }
}