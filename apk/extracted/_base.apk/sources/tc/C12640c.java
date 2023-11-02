package tc;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.text.TypefaceStyle;
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

/* renamed from: tc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12640c extends AbstractC12648k {

    /* renamed from: e */
    static final int[] f32756e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, TypefaceStyle.NORMAL, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    private final boolean f32757a;

    /* renamed from: b */
    private final boolean f32758b;

    /* renamed from: c */
    private final StringBuilder f32759c;

    /* renamed from: d */
    private final int[] f32760d;

    public C12640c() {
        this(false);
    }

    /* renamed from: g */
    private static String m4652g(CharSequence charSequence) {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt != '+' && charAt != '$' && charAt != '%' && charAt != '/') {
                sb2.append(charAt);
            } else {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    c = ':';
                                    sb2.append(c);
                                } else {
                                    throw C7060f.m21471a();
                                }
                            }
                            c = 0;
                            sb2.append(c);
                        } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 + ' ';
                        } else {
                            throw C7060f.m21471a();
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                c = '@';
                            } else if (charAt2 == 'W') {
                                c = '`';
                            } else if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                throw C7060f.m21471a();
                            } else {
                                c = 127;
                            }
                            sb2.append(c);
                        }
                        c = 0;
                        sb2.append(c);
                    }
                } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                    i = charAt2 - '@';
                } else {
                    throw C7060f.m21471a();
                }
                c = (char) i;
                sb2.append(c);
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: h */
    private static int[] m4651h(C10119a c10119a, int[] iArr) {
        int m12261j = c10119a.m12261j();
        int m12263f = c10119a.m12263f(0);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = m12263f;
        while (m12263f < m12261j) {
            if (c10119a.m12265d(m12263f) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == length - 1) {
                    if (m4649j(iArr) == 148 && c10119a.m12260k(Math.max(0, i2 - ((m12263f - i2) / 2)), i2, false)) {
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

    /* renamed from: i */
    private static char m4650i(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f32756e;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw C7064j.m21461a();
            }
        }
    }

    /* renamed from: j */
    private static int m4649j(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = ViewDefaults.NUMBER_OF_LINES;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    @Override // tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        int[] m4651h;
        String sb2;
        int[] iArr = this.f32760d;
        Arrays.fill(iArr, 0);
        StringBuilder sb3 = this.f32759c;
        sb3.setLength(0);
        int m12263f = c10119a.m12263f(m4651h(c10119a, iArr)[1]);
        int m12261j = c10119a.m12261j();
        while (true) {
            AbstractC12648k.m4629e(c10119a, m12263f, iArr);
            int m4649j = m4649j(iArr);
            if (m4649j >= 0) {
                char m4650i = m4650i(m4649j);
                sb3.append(m4650i);
                int i2 = m12263f;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int m12263f2 = c10119a.m12263f(i2);
                if (m4650i == '*') {
                    sb3.setLength(sb3.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    int i6 = (m12263f2 - m12263f) - i4;
                    if (m12263f2 != m12261j && (i6 << 1) < i4) {
                        throw C7064j.m21461a();
                    }
                    if (this.f32757a) {
                        int length = sb3.length() - 1;
                        int i7 = 0;
                        for (int i8 = 0; i8 < length; i8++) {
                            i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f32759c.charAt(i8));
                        }
                        if (sb3.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i7 % 43)) {
                            sb3.setLength(length);
                        } else {
                            throw C7058d.m21472a();
                        }
                    }
                    if (sb3.length() != 0) {
                        if (this.f32758b) {
                            sb2 = m4652g(sb3);
                        } else {
                            sb2 = sb3.toString();
                        }
                        float f = i;
                        return new Result(sb2, null, new C7069o[]{new C7069o((m4651h[1] + m4651h[0]) / 2.0f, f), new C7069o(m12263f + (i4 / 2.0f), f)}, EnumC7055a.CODE_39);
                    }
                    throw C7064j.m21461a();
                }
                m12263f = m12263f2;
            } else {
                throw C7064j.m21461a();
            }
        }
    }

    public C12640c(boolean z) {
        this(z, false);
    }

    public C12640c(boolean z, boolean z2) {
        this.f32757a = z;
        this.f32758b = z2;
        this.f32759c = new StringBuilder(20);
        this.f32760d = new int[9];
    }
}
