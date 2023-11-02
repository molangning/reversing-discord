package p164j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.w2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8746w2 extends AbstractC8726s2 {

    /* renamed from: c */
    private C8573K2 f22984c;

    public C8746w2(InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
    }

    @Override // p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        this.f22984c.accept(d);
    }

    @Override // p164j$.util.stream.AbstractC8636a2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        double[] dArr = (double[]) this.f22984c.mo17430b();
        Arrays.sort(dArr);
        InterfaceC8671h2 interfaceC8671h2 = this.f22817a;
        interfaceC8671h2.mo17302g(dArr.length);
        int i = 0;
        if (this.f22943b) {
            int length = dArr.length;
            while (i < length) {
                double d = dArr[i];
                if (interfaceC8671h2.mo17301i()) {
                    break;
                }
                interfaceC8671h2.accept(d);
                i++;
            }
        } else {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC8671h2.accept(dArr[i]);
                i++;
            }
        }
        interfaceC8671h2.end();
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22984c = j > 0 ? new C8573K2((int) j) : new C8573K2();
    }
}