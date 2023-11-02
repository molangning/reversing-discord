package p366u9;

import java.io.IOException;

/* renamed from: u9.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12900d0 {

    /* renamed from: a */
    private static final AbstractC12900d0 f33586a = new C12910i0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final AbstractC12900d0 f33587b = new C12910i0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final AbstractC12900d0 f33588c = new C12908h0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final AbstractC12900d0 f33589d = new C12908h0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final AbstractC12900d0 f33590e = new C12904f0("base16()", "0123456789ABCDEF");

    /* renamed from: c */
    private final String m3693c(byte[] bArr, int i, int i2) {
        C12919n.m3672d(0, i2, bArr.length);
        StringBuilder sb2 = new StringBuilder(mo3687a(i2));
        try {
            mo3682e(sb2, bArr, 0, i2);
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public static AbstractC12900d0 m3692d() {
        return f33590e;
    }

    /* renamed from: a */
    abstract int mo3687a(int i);

    /* renamed from: b */
    public final String m3694b(byte[] bArr) {
        return m3693c(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    abstract void mo3682e(Appendable appendable, byte[] bArr, int i, int i2);
}