package sc;

import java.util.Map;
import lc.C10120b;
import lc.C10123e;
import nc.C10568a;
import nc.C10570c;
import nc.C10571d;
import p136hc.C7058d;
import p136hc.C7060f;
import p136hc.EnumC7059e;

/* renamed from: sc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12453c {

    /* renamed from: a */
    private final C10570c f32404a = new C10570c(C10568a.f27578o);

    /* renamed from: a */
    private void m5230a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i2 + i3;
        if (i4 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int[] iArr = new int[i6 / i5];
        for (int i7 = 0; i7 < i6; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i5] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f32404a.m11203a(iArr, i3 / i5);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i5];
                }
            }
        } catch (C10571d unused) {
            throw C7058d.m21472a();
        }
    }

    /* renamed from: b */
    public C10123e m5229b(C10120b c10120b, Map<EnumC7059e, ?> map) {
        byte[] bArr;
        byte[] m5240a = new C12451a(c10120b).m5240a();
        m5230a(m5240a, 0, 10, 10, 0);
        int i = m5240a[0] & 15;
        if (i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                m5230a(m5240a, 20, 68, 56, 1);
                m5230a(m5240a, 20, 68, 56, 2);
                bArr = new byte[78];
            } else {
                throw C7060f.m21471a();
            }
        } else {
            m5230a(m5240a, 20, 84, 40, 1);
            m5230a(m5240a, 20, 84, 40, 2);
            bArr = new byte[94];
        }
        System.arraycopy(m5240a, 0, bArr, 0, 10);
        System.arraycopy(m5240a, 20, bArr, 10, bArr.length - 10);
        return C12452b.m5239a(bArr, i);
    }
}
