package p285pc;

import lc.C10120b;
import lc.C10123e;
import nc.C10568a;
import nc.C10570c;
import nc.C10571d;
import p136hc.C7058d;

/* renamed from: pc.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11494d {

    /* renamed from: a */
    private final C10570c f29834a = new C10570c(C10568a.f27576m);

    /* renamed from: a */
    private void m7988a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f29834a.m11203a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C10571d unused) {
            throw C7058d.m21472a();
        }
    }

    /* renamed from: b */
    public C10123e m7987b(C10120b c10120b) {
        C11489a c11489a = new C11489a(c10120b);
        C11490b[] m7999b = C11490b.m7999b(c11489a.m8008c(), c11489a.m8009b());
        int i = 0;
        for (C11490b c11490b : m7999b) {
            i += c11490b.m7998c();
        }
        byte[] bArr = new byte[i];
        int length = m7999b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C11490b c11490b2 = m7999b[i2];
            byte[] m8000a = c11490b2.m8000a();
            int m7998c = c11490b2.m7998c();
            m7988a(m8000a, m7998c);
            for (int i3 = 0; i3 < m7998c; i3++) {
                bArr[(i3 * length) + i2] = m8000a[i3];
            }
        }
        return C11491c.m7997a(bArr);
    }
}
