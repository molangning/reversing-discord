package tc;

import com.facebook.react.views.image.ReactImageView;
import com.google.zxing.Result;
import java.util.Arrays;
import java.util.Map;
import lc.C10119a;
import p136hc.C7058d;
import p136hc.C7060f;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;

/* renamed from: tc.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12641d extends AbstractC12648k {

    /* renamed from: c */
    private static final char[] f32761c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f32762d;

    /* renamed from: e */
    private static final int f32763e;

    /* renamed from: a */
    private final StringBuilder f32764a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f32765b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f32762d = iArr;
        f32763e = iArr[47];
    }

    /* renamed from: g */
    private static void m4648g(CharSequence charSequence) {
        int length = charSequence.length();
        m4647h(charSequence, length - 2, 20);
        m4647h(charSequence, length - 1, 15);
    }

    /* renamed from: h */
    private static void m4647h(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) == f32761c[i3 % 47]) {
            return;
        }
        throw C7058d.m21472a();
    }

    /* renamed from: i */
    private static String m4646i(CharSequence charSequence) {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i2 < length - 1) {
                    i2++;
                    char charAt2 = charSequence.charAt(i2);
                    switch (charAt) {
                        case 'a':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 - '@';
                                c = (char) i;
                                break;
                            } else {
                                throw C7060f.m21471a();
                            }
                            break;
                        case 'b':
                            if (charAt2 >= 'A' && charAt2 <= 'E') {
                                i = charAt2 - '&';
                            } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                                i = charAt2 - 11;
                            } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                                i = charAt2 + 16;
                            } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                                i = charAt2 + '+';
                            } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                                c = 127;
                                break;
                            } else {
                                throw C7060f.m21471a();
                            }
                            c = (char) i;
                            break;
                        case 'c':
                            if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                                c = (char) i;
                                break;
                            } else if (charAt2 == 'Z') {
                                c = ':';
                                break;
                            } else {
                                throw C7060f.m21471a();
                            }
                        case 'd':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 + ' ';
                                c = (char) i;
                                break;
                            } else {
                                throw C7060f.m21471a();
                            }
                        default:
                            c = 0;
                            break;
                    }
                    sb2.append(c);
                } else {
                    throw C7060f.m21471a();
                }
            } else {
                sb2.append(charAt);
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: j */
    private int[] m4645j(C10119a c10119a) {
        int m12261j = c10119a.m12261j();
        int m12263f = c10119a.m12263f(0);
        Arrays.fill(this.f32765b, 0);
        int[] iArr = this.f32765b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = m12263f;
        while (m12263f < m12261j) {
            if (c10119a.m12265d(m12263f) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == length - 1) {
                    if (m4643l(iArr) == f32763e) {
                        return new int[]{i2, m12263f};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            m12263f++;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: k */
    private static char m4644k(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f32762d;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return f32761c[i2];
                }
                i2++;
            } else {
                throw C7064j.m21461a();
            }
        }
    }

    /* renamed from: l */
    private static int m4643l(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((iArr[i4] * 9.0f) / i);
            if (round > 0 && round <= 4) {
                if ((i4 & 1) == 0) {
                    for (int i5 = 0; i5 < round; i5++) {
                        i3 = (i3 << 1) | 1;
                    }
                } else {
                    i3 <<= round;
                }
            } else {
                return -1;
            }
        }
        return i3;
    }

    @Override // tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        int[] m4645j;
        int m12263f = c10119a.m12263f(m4645j(c10119a)[1]);
        int m12261j = c10119a.m12261j();
        int[] iArr = this.f32765b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f32764a;
        sb2.setLength(0);
        while (true) {
            AbstractC12648k.m4629e(c10119a, m12263f, iArr);
            int m4643l = m4643l(iArr);
            if (m4643l >= 0) {
                char m4644k = m4644k(m4643l);
                sb2.append(m4644k);
                int i2 = m12263f;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int m12263f2 = c10119a.m12263f(i2);
                if (m4644k == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (m12263f2 != m12261j && c10119a.m12265d(m12263f2)) {
                        if (sb2.length() >= 2) {
                            m4648g(sb2);
                            sb2.setLength(sb2.length() - 2);
                            float f = i;
                            return new Result(m4646i(sb2), null, new C7069o[]{new C7069o((m4645j[1] + m4645j[0]) / 2.0f, f), new C7069o(m12263f + (i4 / 2.0f), f)}, EnumC7055a.CODE_93);
                        }
                        throw C7064j.m21461a();
                    }
                    throw C7064j.m21461a();
                }
                m12263f = m12263f2;
            } else {
                throw C7064j.m21461a();
            }
        }
    }
}
