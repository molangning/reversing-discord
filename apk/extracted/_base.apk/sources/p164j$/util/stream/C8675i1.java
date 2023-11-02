package p164j$.util.stream;

import java.util.ArrayDeque;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.i1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8675i1 extends AbstractC8680j1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8675i1(InterfaceC8548F0 interfaceC8548F0) {
        super(interfaceC8548F0);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        InterfaceC8548F0 m17455e;
        if (m17453h()) {
            boolean mo17305a = this.f22874d.mo17305a(consumer);
            if (!mo17305a) {
                if (this.f22873c == null && (m17455e = AbstractC8680j1.m17455e(this.f22875e)) != null) {
                    Spliterator spliterator = m17455e.spliterator();
                    this.f22874d = spliterator;
                    return spliterator.mo17305a(consumer);
                }
                this.f22871a = null;
            }
            return mo17305a;
        }
        return false;
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f22871a == null) {
            return;
        }
        if (this.f22874d != null) {
            do {
            } while (mo17305a(consumer));
            return;
        }
        Spliterator spliterator = this.f22873c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque m17454g = m17454g();
        while (true) {
            InterfaceC8548F0 m17455e = AbstractC8680j1.m17455e(m17454g);
            if (m17455e == null) {
                this.f22871a = null;
                return;
            }
            m17455e.forEach(consumer);
        }
    }
}
