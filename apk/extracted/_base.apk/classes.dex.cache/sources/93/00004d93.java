package tc;

import lc.C10119a;
import p136hc.EnumC7055a;

/* renamed from: tc.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12643f extends AbstractC12653p {

    /* renamed from: i */
    private final int[] f32768i = new int[4];

    @Override // tc.AbstractC12653p
    /* renamed from: k */
    public int mo4607k(C10119a c10119a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f32768i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m12261j = c10119a.m12261j();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < m12261j; i2++) {
            sb2.append((char) (AbstractC12653p.m4615i(c10119a, iArr2, i, AbstractC12653p.f32790g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = AbstractC12653p.m4613m(c10119a, i, true, AbstractC12653p.f32788e)[1];
        for (int i5 = 0; i5 < 4 && i4 < m12261j; i5++) {
            sb2.append((char) (AbstractC12653p.m4615i(c10119a, iArr2, i4, AbstractC12653p.f32790g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // tc.AbstractC12653p
    /* renamed from: p */
    EnumC7055a mo4606p() {
        return EnumC7055a.EAN_8;
    }
}