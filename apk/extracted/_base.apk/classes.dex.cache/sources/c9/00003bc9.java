package p164j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.G2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8555G2 extends AbstractC8736u2 {

    /* renamed from: c */
    private long[] f22679c;

    /* renamed from: d */
    private int f22680d;

    public C8555G2(InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
    }

    @Override // p164j$.util.stream.InterfaceC8666g2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(long j) {
        long[] jArr = this.f22679c;
        int i = this.f22680d;
        this.f22680d = i + 1;
        jArr[i] = j;
    }

    @Override // p164j$.util.stream.AbstractC8646c2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f22679c, 0, this.f22680d);
        InterfaceC8671h2 interfaceC8671h2 = this.f22835a;
        interfaceC8671h2.mo17302g(this.f22680d);
        if (this.f22961b) {
            while (i < this.f22680d && !interfaceC8671h2.mo17301i()) {
                interfaceC8671h2.accept(this.f22679c[i]);
                i++;
            }
        } else {
            while (i < this.f22680d) {
                interfaceC8671h2.accept(this.f22679c[i]);
                i++;
            }
        }
        interfaceC8671h2.end();
        this.f22679c = null;
    }

    @Override // p164j$.util.stream.InterfaceC8671h2
    /* renamed from: g */
    public final void mo17302g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f22679c = new long[(int) j];
    }
}