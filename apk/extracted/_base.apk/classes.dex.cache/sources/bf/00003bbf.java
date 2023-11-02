package p164j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.E2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8545E2 extends AbstractC8726s2 {

    /* renamed from: c */
    private double[] f22666c;

    /* renamed from: d */
    private int f22667d;

    public C8545E2(InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
    }

    @Override // p164j$.util.stream.InterfaceC8656e2, p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        double[] dArr = this.f22666c;
        int i = this.f22667d;
        this.f22667d = i + 1;
        dArr[i] = d;
    }

    @Override // p164j$.util.stream.AbstractC8636a2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f22666c, 0, this.f22667d);
        InterfaceC8671h2 interfaceC8671h2 = this.f22817a;
        interfaceC8671h2.mo17302g(this.f22667d);
        if (this.f22943b) {
            while (i < this.f22667d && !interfaceC8671h2.mo17301i()) {
                interfaceC8671h2.accept(this.f22666c[i]);
                i++;
            }
        } else {
            while (i < this.f22667d) {
                interfaceC8671h2.accept(this.f22666c[i]);
                i++;
            }
        }
        interfaceC8671h2.end();
        this.f22666c = null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22666c = new double[(int) j];
    }
}