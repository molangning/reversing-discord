package p164j$.util.stream;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8365M;

/* renamed from: j$.util.stream.r3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8722r3 extends AbstractC8732t3 implements InterfaceC8365M {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8722r3(InterfaceC8365M interfaceC8365M, long j, long j2) {
        super(interfaceC8365M, j, j2, 0L, Math.min(interfaceC8365M.estimateSize(), j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8722r3(InterfaceC8365M interfaceC8365M, long j, long j2, long j3, long j4) {
        super(interfaceC8365M, j, j2, j3, j4);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: forEachRemaining */
    public final void m17398d(Object obj) {
        obj.getClass();
        long j = this.f22954e;
        long j2 = this.f22950a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.f22953d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && ((InterfaceC8365M) this.f22952c).estimateSize() + j3 <= this.f22951b) {
            ((InterfaceC8365M) this.f22952c).forEachRemaining(obj);
            this.f22953d = this.f22954e;
            return;
        }
        while (j2 > this.f22953d) {
            ((InterfaceC8365M) this.f22952c).tryAdvance(mo17396g());
            this.f22953d++;
        }
        while (this.f22953d < this.f22954e) {
            ((InterfaceC8365M) this.f22952c).tryAdvance(obj);
            this.f22953d++;
        }
    }

    /* renamed from: g */
    protected abstract Object mo17396g();

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
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
    /* renamed from: tryAdvance */
    public final boolean m17394p(Object obj) {
        long j;
        obj.getClass();
        long j2 = this.f22954e;
        long j3 = this.f22950a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f22953d;
            if (j3 <= j) {
                break;
            }
            ((InterfaceC8365M) this.f22952c).tryAdvance(mo17396g());
            this.f22953d++;
        }
        if (j >= this.f22954e) {
            return false;
        }
        this.f22953d = j + 1;
        return ((InterfaceC8365M) this.f22952c).tryAdvance(obj);
    }
}
