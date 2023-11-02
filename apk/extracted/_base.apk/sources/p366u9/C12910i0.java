package p366u9;

/* renamed from: u9.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12910i0 extends C12908h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12910i0(String str, String str2, Character ch2) {
        this(new C12906g0(str, str2.toCharArray()), ch2);
    }

    @Override // p366u9.C12908h0, p366u9.AbstractC12900d0
    /* renamed from: e */
    final void mo3682e(Appendable appendable, byte[] bArr, int i, int i2) {
        C12919n.m3674b(appendable);
        int i3 = i2 + 0;
        int i4 = 0;
        C12919n.m3672d(0, i3, bArr.length);
        while (i2 >= 3) {
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i5] & 255) << 8) | ((bArr[i4] & 255) << 16);
            i4 = i6 + 1;
            int i8 = i7 | (bArr[i6] & 255);
            appendable.append(this.f33600f.m3690a(i8 >>> 18));
            appendable.append(this.f33600f.m3690a((i8 >>> 12) & 63));
            appendable.append(this.f33600f.m3690a((i8 >>> 6) & 63));
            appendable.append(this.f33600f.m3690a(i8 & 63));
            i2 -= 3;
        }
        if (i4 < i3) {
            m3686f(appendable, bArr, i4, i3 - i4);
        }
    }

    private C12910i0(C12906g0 c12906g0, Character ch2) {
        super(c12906g0, ch2);
        char[] cArr;
        cArr = c12906g0.f33593b;
        C12919n.m3671e(cArr.length == 64);
    }
}
