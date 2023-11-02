package p164j$.util.stream;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.x3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8752x3 extends AbstractC8526A3 implements InterfaceC8365M {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8752x3(InterfaceC8365M interfaceC8365M, long j, long j2) {
        super(interfaceC8365M, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8752x3(InterfaceC8365M interfaceC8365M, AbstractC8752x3 abstractC8752x3) {
        super(interfaceC8365M, abstractC8752x3);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: forEachRemaining */
    public final void m17312d(Object obj) {
        obj.getClass();
        AbstractC8642b3 abstractC8642b3 = null;
        while (true) {
            EnumC8762z3 m17591t = m17591t();
            if (m17591t == EnumC8762z3.NO_MORE) {
                return;
            }
            EnumC8762z3 enumC8762z3 = EnumC8762z3.MAYBE_MORE;
            Spliterator spliterator = this.f22642a;
            if (m17591t != enumC8762z3) {
                ((InterfaceC8365M) spliterator).forEachRemaining(obj);
                return;
            }
            if (abstractC8642b3 == null) {
                abstractC8642b3 = mo17307v();
            } else {
                abstractC8642b3.f22823b = 0;
            }
            long j = 0;
            while (((InterfaceC8365M) spliterator).tryAdvance(abstractC8642b3)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            abstractC8642b3.mo17504a(obj, m17592r(j));
        }
    }

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
    public final boolean m17309p(Object obj) {
        obj.getClass();
        while (m17591t() != EnumC8762z3.NO_MORE && ((InterfaceC8365M) this.f22642a).tryAdvance(this)) {
            if (m17592r(1L) == 1) {
                mo17308u(obj);
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    protected abstract void mo17308u(Object obj);

    /* renamed from: v */
    protected abstract AbstractC8642b3 mo17307v();
}
