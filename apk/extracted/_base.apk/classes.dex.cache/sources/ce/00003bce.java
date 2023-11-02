package p164j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: j$.util.stream.H2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8560H2 extends AbstractC8741v2 {

    /* renamed from: d */
    private Object[] f22691d;

    /* renamed from: e */
    private int f22692e;

    public C8560H2(InterfaceC8671h2 interfaceC8671h2, Comparator comparator) {
        super(interfaceC8671h2, comparator);
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f22691d;
        int i = this.f22692e;
        this.f22692e = i + 1;
        objArr[i] = obj;
    }

    @Override // p164j$.util.stream.AbstractC8651d2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f22691d, 0, this.f22692e, this.f22968b);
        InterfaceC8671h2 interfaceC8671h2 = this.f22839a;
        interfaceC8671h2.mo17302g(this.f22692e);
        if (this.f22969c) {
            while (i < this.f22692e && !interfaceC8671h2.mo17301i()) {
                interfaceC8671h2.accept(this.f22691d[i]);
                i++;
            }
        } else {
            while (i < this.f22692e) {
                interfaceC8671h2.accept(this.f22691d[i]);
                i++;
            }
        }
        interfaceC8671h2.end();
        this.f22691d = null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22691d = new Object[(int) j];
    }
}