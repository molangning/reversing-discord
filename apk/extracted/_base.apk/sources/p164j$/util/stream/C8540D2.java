package p164j$.util.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import p164j$.util.AbstractC8516n;

/* renamed from: j$.util.stream.D2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8540D2 extends AbstractC8741v2 {

    /* renamed from: d */
    private ArrayList f22659d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8540D2(InterfaceC8671h2 interfaceC8671h2, Comparator comparator) {
        super(interfaceC8671h2, comparator);
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f22659d.add(obj);
    }

    @Override // p164j$.util.stream.AbstractC8651d2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        AbstractC8516n.m17599r(this.f22659d, this.f22968b);
        InterfaceC8671h2 interfaceC8671h2 = this.f22839a;
        interfaceC8671h2.mo17302g(this.f22659d.size());
        if (this.f22969c) {
            Iterator it = this.f22659d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC8671h2.mo17301i()) {
                    break;
                }
                interfaceC8671h2.accept(next);
            }
        } else {
            ArrayList arrayList = this.f22659d;
            interfaceC8671h2.getClass();
            AbstractC8516n.m17600q(arrayList, new C8633a(3, interfaceC8671h2));
        }
        interfaceC8671h2.end();
        this.f22659d = null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22659d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
