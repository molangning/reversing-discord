package p164j$.util.stream;

import java.util.ArrayDeque;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.h1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8670h1 extends AbstractC8680j1 implements InterfaceC8365M {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8670h1(InterfaceC8543E0 interfaceC8543E0) {
        super(interfaceC8543E0);
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: forEachRemaining */
    public final void m17462d(Object obj) {
        if (this.f22871a == null) {
            return;
        }
        if (this.f22874d != null) {
            do {
            } while (m17459p(obj));
            return;
        }
        Spliterator spliterator = this.f22873c;
        if (spliterator != null) {
            ((InterfaceC8365M) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque m17454g = m17454g();
        while (true) {
            InterfaceC8543E0 interfaceC8543E0 = (InterfaceC8543E0) AbstractC8680j1.m17455e(m17454g);
            if (interfaceC8543E0 == null) {
                this.f22871a = null;
                return;
            }
            interfaceC8543E0.mo17428d(obj);
        }
    }

    @Override // p164j$.util.InterfaceC8365M
    /* renamed from: tryAdvance */
    public final boolean m17459p(Object obj) {
        InterfaceC8543E0 interfaceC8543E0;
        if (m17453h()) {
            boolean tryAdvance = ((InterfaceC8365M) this.f22874d).tryAdvance(obj);
            if (!tryAdvance) {
                if (this.f22873c == null && (interfaceC8543E0 = (InterfaceC8543E0) AbstractC8680j1.m17455e(this.f22875e)) != null) {
                    InterfaceC8365M spliterator = interfaceC8543E0.spliterator();
                    this.f22874d = spliterator;
                    return spliterator.tryAdvance(obj);
                }
                this.f22871a = null;
            }
            return tryAdvance;
        }
        return false;
    }
}
