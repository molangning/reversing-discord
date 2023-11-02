package p164j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.y2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8756y2 extends AbstractC8736u2 {

    /* renamed from: c */
    private C8589O2 f22996c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8756y2(InterfaceC8671h2 interfaceC8671h2) {
        super(interfaceC8671h2);
    }

    @Override // p164j$.util.stream.InterfaceC8666g2, p164j$.util.stream.InterfaceC8671h2
    public final void accept(long j) {
        this.f22996c.accept(j);
    }

    @Override // p164j$.util.stream.AbstractC8646c2, p164j$.util.stream.InterfaceC8671h2
    public final void end() {
        long[] jArr = (long[]) this.f22996c.mo17430b();
        Arrays.sort(jArr);
        InterfaceC8671h2 interfaceC8671h2 = this.f22835a;
        interfaceC8671h2.mo17302g(jArr.length);
        int i = 0;
        if (this.f22961b) {
            int length = jArr.length;
            while (i < length) {
                long j = jArr[i];
                if (interfaceC8671h2.mo17301i()) {
                    break;
                }
                interfaceC8671h2.accept(j);
                i++;
            }
        } else {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC8671h2.accept(jArr[i]);
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
        this.f22996c = j > 0 ? new C8589O2((int) j) : new C8589O2();
    }
}
