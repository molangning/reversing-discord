package p164j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.x2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8751x2 extends AbstractC8731t2 {

    /* renamed from: c */
    private C8581M2 f22991c;

    public C8751x2(InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
    }

    @Override // p164j$.util.stream.InterfaceC8661f2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(int i) {
        this.f22991c.accept(i);
    }

    @Override // p164j$.util.stream.AbstractC8641b2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        int[] iArr = (int[]) this.f22991c.mo17430b();
        Arrays.sort(iArr);
        InterfaceC8671h2 interfaceC8671h2 = this.f22822a;
        interfaceC8671h2.mo17302g(iArr.length);
        int i = 0;
        if (this.f22949b) {
            int length = iArr.length;
            while (i < length) {
                int i2 = iArr[i];
                if (interfaceC8671h2.mo17301i()) {
                    break;
                }
                interfaceC8671h2.accept(i2);
                i++;
            }
        } else {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC8671h2.accept(iArr[i]);
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
        this.f22991c = j > 0 ? new C8581M2((int) j) : new C8581M2();
    }
}