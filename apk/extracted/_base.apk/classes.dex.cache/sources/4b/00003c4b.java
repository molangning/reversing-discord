package p164j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8359G;
import p164j$.util.InterfaceC8362J;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.j1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8680j1 implements Spliterator {

    /* renamed from: a */
    InterfaceC8548F0 f22871a;

    /* renamed from: b */
    int f22872b;

    /* renamed from: c */
    Spliterator f22873c;

    /* renamed from: d */
    Spliterator f22874d;

    /* renamed from: e */
    ArrayDeque f22875e;

    public AbstractC8680j1(InterfaceC8548F0 interfaceC8548F0) {
        this.f22871a = interfaceC8548F0;
    }

    /* renamed from: e */
    public static InterfaceC8548F0 m17455e(ArrayDeque arrayDeque) {
        while (true) {
            InterfaceC8548F0 interfaceC8548F0 = (InterfaceC8548F0) arrayDeque.pollFirst();
            if (interfaceC8548F0 == null) {
                return null;
            }
            if (interfaceC8548F0.mo17390k() != 0) {
                int mo17390k = interfaceC8548F0.mo17390k();
                while (true) {
                    mo17390k--;
                    if (mo17390k >= 0) {
                        arrayDeque.addFirst(interfaceC8548F0.mo17392a(mo17390k));
                    }
                }
            } else if (interfaceC8548F0.count() > 0) {
                return interfaceC8548F0;
            }
        }
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.f22871a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f22873c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.f22872b; i < this.f22871a.mo17390k(); i++) {
            j += this.f22871a.mo17392a(i).count();
        }
        return j;
    }

    /* renamed from: g */
    public final ArrayDeque m17454g() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int mo17390k = this.f22871a.mo17390k();
        while (true) {
            mo17390k--;
            if (mo17390k < this.f22872b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f22871a.mo17392a(mo17390k));
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

    /* renamed from: h */
    public final boolean m17453h() {
        if (this.f22871a == null) {
            return false;
        }
        if (this.f22874d == null) {
            Spliterator spliterator = this.f22873c;
            if (spliterator == null) {
                ArrayDeque m17454g = m17454g();
                this.f22875e = m17454g;
                InterfaceC8548F0 m17455e = m17455e(m17454g);
                if (m17455e == null) {
                    this.f22871a = null;
                    return false;
                }
                spliterator = m17455e.spliterator();
            }
            this.f22874d = spliterator;
            return true;
        }
        return true;
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC8516n.m17605j(this, i);
    }

    @Override // p164j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC8356D trySplit() {
        return (InterfaceC8356D) trySplit();
    }

    @Override // p164j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC8359G trySplit() {
        return (InterfaceC8359G) trySplit();
    }

    @Override // p164j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC8362J trySplit() {
        return (InterfaceC8362J) trySplit();
    }

    @Override // p164j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC8365M trySplit() {
        return (InterfaceC8365M) trySplit();
    }

    @Override // p164j$.util.Spliterator
    public final Spliterator trySplit() {
        InterfaceC8548F0 interfaceC8548F0 = this.f22871a;
        if (interfaceC8548F0 == null || this.f22874d != null) {
            return null;
        }
        Spliterator spliterator = this.f22873c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f22872b < interfaceC8548F0.mo17390k() - 1) {
            InterfaceC8548F0 interfaceC8548F02 = this.f22871a;
            int i = this.f22872b;
            this.f22872b = i + 1;
            return interfaceC8548F02.mo17392a(i).spliterator();
        }
        InterfaceC8548F0 mo17392a = this.f22871a.mo17392a(this.f22872b);
        this.f22871a = mo17392a;
        if (mo17392a.mo17390k() == 0) {
            Spliterator spliterator2 = this.f22871a.spliterator();
            this.f22873c = spliterator2;
            return spliterator2.trySplit();
        }
        InterfaceC8548F0 interfaceC8548F03 = this.f22871a;
        this.f22872b = 0 + 1;
        return interfaceC8548F03.mo17392a(0).spliterator();
    }
}