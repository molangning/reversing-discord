package p366u9;

/* renamed from: u9.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12904f0 extends C12908h0 {

    /* renamed from: h */
    private final char[] f33591h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12904f0(String str, String str2) {
        this(new C12906g0(str, str2.toCharArray()));
    }

    @Override // p366u9.C12908h0, p366u9.AbstractC12900d0
    /* renamed from: e */
    final void mo3682e(Appendable appendable, byte[] bArr, int i, int i2) {
        C12919n.m3674b(appendable);
        C12919n.m3672d(0, i2 + 0, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3 + 0] & 255;
            appendable.append(this.f33591h[i4]);
            appendable.append(this.f33591h[i4 | 256]);
        }
    }

    private C12904f0(C12906g0 c12906g0) {
        super(c12906g0, null);
        char[] cArr;
        this.f33591h = new char[512];
        cArr = c12906g0.f33593b;
        C12919n.m3671e(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f33591h[i] = c12906g0.m3690a(i >>> 4);
            this.f33591h[i | 256] = c12906g0.m3690a(i & 15);
        }
    }
}
