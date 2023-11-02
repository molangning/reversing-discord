package tc;

import lc.C10119a;
import p136hc.C7064j;
import p136hc.EnumC7055a;

/* renamed from: tc.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12654q extends AbstractC12653p {

    /* renamed from: j */
    private static final int[] f32795j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    static final int[][] f32796k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    private final int[] f32797i = new int[4];

    /* renamed from: r */
    public static String m4605r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    /* renamed from: s */
    private static void m4604s(StringBuilder sb2, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f32796k[i2][i3]) {
                    sb2.insert(0, (char) (i2 + 48));
                    sb2.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C7064j.m21461a();
    }

    @Override // tc.AbstractC12653p
    /* renamed from: g */
    public boolean mo4609g(String str) {
        return super.mo4609g(m4605r(str));
    }

    @Override // tc.AbstractC12653p
    /* renamed from: j */
    protected int[] mo4608j(C10119a c10119a, int i) {
        return AbstractC12653p.m4613m(c10119a, i, true, f32795j);
    }

    @Override // tc.AbstractC12653p
    /* renamed from: k */
    public int mo4607k(C10119a c10119a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f32797i;
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
        m4604s(sb2, i2);
        return i;
    }

    @Override // tc.AbstractC12653p
    /* renamed from: p */
    EnumC7055a mo4606p() {
        return EnumC7055a.UPC_E;
    }
}