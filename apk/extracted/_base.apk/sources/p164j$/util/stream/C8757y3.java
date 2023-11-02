package p164j$.util.stream;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.Spliterator;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.y3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8757y3 extends AbstractC8526A3 implements Spliterator, Consumer {

    /* renamed from: e */
    Object f22997e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8757y3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2);
    }

    C8757y3(Spliterator spliterator, C8757y3 c8757y3) {
        super(spliterator, c8757y3);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        consumer.getClass();
        while (m17591t() != EnumC8762z3.NO_MORE && this.f22642a.mo17305a(this)) {
            if (m17592r(1L) == 1) {
                consumer.accept(this.f22997e);
                this.f22997e = null;
                return true;
            }
        }
        return false;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f22997e = obj;
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C8647c3 c8647c3 = null;
        while (true) {
            EnumC8762z3 m17591t = m17591t();
            if (m17591t == EnumC8762z3.NO_MORE) {
                return;
            }
            EnumC8762z3 enumC8762z3 = EnumC8762z3.MAYBE_MORE;
            Spliterator spliterator = this.f22642a;
            if (m17591t != enumC8762z3) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (c8647c3 == null) {
                c8647c3 = new C8647c3();
            } else {
                c8647c3.f22840a = 0;
            }
            long j = 0;
            while (spliterator.mo17305a(c8647c3)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long m17592r = m17592r(j);
            for (int i = 0; i < m17592r; i++) {
                consumer.accept(c8647c3.f22836b[i]);
            }
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

    @Override // p164j$.util.stream.AbstractC8526A3
    /* renamed from: s */
    protected final Spliterator mo17304s(Spliterator spliterator) {
        return new C8757y3(spliterator, this);
    }
}
