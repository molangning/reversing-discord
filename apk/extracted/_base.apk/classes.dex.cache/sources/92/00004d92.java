package tc;

import lc.C10119a;
import p136hc.C7064j;
import p136hc.EnumC7055a;

/* renamed from: tc.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12642e extends AbstractC12653p {

    /* renamed from: j */
    static final int[] f32766j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f32767i = new int[4];

    /* renamed from: r */
    private static void m4642r(StringBuilder sb2, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f32766j[i2]) {
                sb2.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C7064j.m21461a();
    }

    @Override // tc.AbstractC12653p
    /* renamed from: k */
    public int mo4607k(C10119a c10119a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f32767i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m12261j = c10119a.m12261j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < m12261j; i3++) {
            int m4615i = AbstractC12653p.m4615i(c10119a, iArr2, i, AbstractC12653p.f32791h);
            sb2.append((char) ((m4615i % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m4615i >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m4642r(sb2, i2);
        int i5 = AbstractC12653p.m4613m(c10119a, i, true, AbstractC12653p.f32788e)[1];
        for (int i6 = 0; i6 < 6 && i5 < m12261j; i6++) {
            sb2.append((char) (AbstractC12653p.m4615i(c10119a, iArr2, i5, AbstractC12653p.f32790g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // tc.AbstractC12653p
    /* renamed from: p */
    EnumC7055a mo4606p() {
        return EnumC7055a.EAN_13;
    }
}