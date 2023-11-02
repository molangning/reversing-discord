package p164j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.F2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8550F2 extends AbstractC8731t2 {

    /* renamed from: c */
    private int[] f22673c;

    /* renamed from: d */
    private int f22674d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8550F2(InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
    }

    @Override // p164j$.util.stream.InterfaceC8661f2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        int[] iArr = this.f22673c;
        int i2 = this.f22674d;
        this.f22674d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // p164j$.util.stream.AbstractC8641b2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f22673c, 0, this.f22674d);
        InterfaceC8671h2 interfaceC8671h2 = this.f22822a;
        interfaceC8671h2.mo17302g(this.f22674d);
        if (this.f22949b) {
            while (i < this.f22674d && !interfaceC8671h2.mo17301i()) {
                interfaceC8671h2.accept(this.f22673c[i]);
                i++;
            }
        } else {
            while (i < this.f22674d) {
                interfaceC8671h2.accept(this.f22673c[i]);
                i++;
            }
        }
        interfaceC8671h2.end();
        this.f22673c = null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22673c = new int[(int) j];
    }
}
