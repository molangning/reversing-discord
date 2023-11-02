package p164j$.util;

import java.util.Comparator;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.Z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8377Z implements InterfaceC8359G {

    /* renamed from: a */
    private final int[] f22446a;

    /* renamed from: b */
    private int f22447b;

    /* renamed from: c */
    private final int f22448c;

    /* renamed from: d */
    private final int f22449d;

    public C8377Z(int[] iArr, int i, int i2, int i3) {
        this.f22446a = iArr;
        this.f22447b = i;
        this.f22448c = i2;
        this.f22449d = i3 | 64 | 16384;
    }

    @Override // p164j$.util.InterfaceC8359G, p164j$.util.Spliterator
    /* renamed from: a */
    public final /* synthetic */ boolean mo17305a(Consumer consumer) {
        return AbstractC8516n.m17603m(this, consumer);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: c */
    public final void forEachRemaining(InterfaceC8437K interfaceC8437K) {
        int i;
        interfaceC8437K.getClass();
        int[] iArr = this.f22446a;
        int length = iArr.length;
        int i2 = this.f22448c;
        if (length < i2 || (i = this.f22447b) < 0) {
            return;
        }
        this.f22447b = i2;
        if (i < i2) {
            do {
                interfaceC8437K.accept(iArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return this.f22449d;
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        return this.f22448c - this.f22447b;
    }

    @Override // p164j$.util.InterfaceC8359G, p164j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC8516n.m17608g(this, consumer);
    }

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC8516n.m17605j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC8516n.m17606i(this);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC8516n.m17605j(this, i);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: k */
    public final boolean tryAdvance(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        int i = this.f22447b;
        if (i < 0 || i >= this.f22448c) {
            return false;
        }
        this.f22447b = i + 1;
        interfaceC8437K.accept(this.f22446a[i]);
        return true;
    }

    @Override // p164j$.util.Spliterator
    public final InterfaceC8359G trySplit() {
        int i = this.f22447b;
        int i2 = (this.f22448c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f22447b = i2;
        return new C8377Z(this.f22446a, i, i2, this.f22449d);
    }
}