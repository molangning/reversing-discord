package p178jc;

import com.discord.nearby.NearbyManager;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Arrays;
import lc.C10120b;
import lc.C10123e;
import nc.C10568a;
import nc.C10570c;
import nc.C10571d;
import p136hc.C7060f;
import p157ic.C7494a;

/* renamed from: jc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8894a {

    /* renamed from: b */
    private static final String[] f23286b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f23287c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f23288d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f23289e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f23290f = {"CTRL_PS", " ", "0", NearbyManager.PERMISSION_DENIED, "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C7494a f23291a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C8895a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23292a;

        static {
            int[] iArr = new int[EnumC8896b.values().length];
            f23292a = iArr;
            try {
                iArr[EnumC8896b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23292a[EnumC8896b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23292a[EnumC8896b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23292a[EnumC8896b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23292a[EnumC8896b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jc.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC8896b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    static byte[] m17063a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m17056h(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean[] m17062b(boolean[] zArr) {
        int i;
        C10568a c10568a;
        boolean z;
        boolean z2;
        if (this.f23291a.m20592d() <= 2) {
            c10568a = C10568a.f27573j;
            i = 6;
        } else {
            i = 8;
            if (this.f23291a.m20592d() <= 8) {
                c10568a = C10568a.f27577n;
            } else if (this.f23291a.m20592d() <= 22) {
                c10568a = C10568a.f27572i;
                i = 10;
            } else {
                c10568a = C10568a.f27571h;
                i = 12;
            }
        }
        int m20593c = this.f23291a.m20593c();
        int length = zArr.length / i;
        if (length >= m20593c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m17055i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C10570c(c10568a).m11203a(iArr, length - m20593c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < m20593c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 != 0 && i6 != i3) {
                        if (i6 == 1 || i6 == i3 - 1) {
                            i4++;
                        }
                    } else {
                        throw C7060f.m21471a();
                    }
                }
                boolean[] zArr2 = new boolean[(m20593c * i) - i4];
                int i7 = 0;
                for (int i8 = 0; i8 < m20593c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 != 1 && i9 != i3 - 1) {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            if (((1 << i10) & i9) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i7] = z2;
                            i10--;
                            i7 = i11;
                        }
                    } else {
                        int i12 = (i7 + i) - 1;
                        if (i9 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i7, i12, z);
                        i7 += i - 1;
                    }
                }
                return zArr2;
            } catch (C10571d e) {
                throw C7060f.m21470b(e);
            }
        }
        throw C7060f.m21471a();
    }

    /* renamed from: d */
    private boolean[] m17060d(C10120b c10120b) {
        int i;
        int i2;
        boolean m20591e = this.f23291a.m20591e();
        int m20592d = this.f23291a.m20592d();
        if (m20591e) {
            i = 11;
        } else {
            i = 14;
        }
        int i3 = i + (m20592d << 2);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[m17054j(m20592d, m20591e)];
        int i4 = 2;
        if (m20591e) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) * 2)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < m20592d) {
            int i12 = (m20592d - i10) << i4;
            if (m20591e) {
                i2 = 9;
            } else {
                i2 = 12;
            }
            int i13 = i12 + i2;
            int i14 = i10 << 1;
            int i15 = (i3 - 1) - i14;
            int i16 = 0;
            while (i16 < i13) {
                int i17 = i16 << 1;
                int i18 = 0;
                while (i18 < i4) {
                    int i19 = i14 + i18;
                    int i20 = i14 + i16;
                    zArr[i11 + i17 + i18] = c10120b.m12252e(iArr[i19], iArr[i20]);
                    int i21 = iArr[i20];
                    int i22 = i15 - i18;
                    boolean z = m20591e;
                    zArr[(i13 * 2) + i11 + i17 + i18] = c10120b.m12252e(i21, iArr[i22]);
                    int i23 = iArr[i22];
                    int i24 = i15 - i16;
                    zArr[(i13 * 4) + i11 + i17 + i18] = c10120b.m12252e(i23, iArr[i24]);
                    zArr[(i13 * 6) + i11 + i17 + i18] = c10120b.m12252e(iArr[i24], iArr[i19]);
                    i18++;
                    m20592d = m20592d;
                    m20591e = z;
                    i4 = 2;
                }
                i16++;
                i4 = 2;
            }
            i11 += i13 << 3;
            i10++;
            i4 = 2;
        }
        return zArr;
    }

    /* renamed from: e */
    private static String m17059e(EnumC8896b enumC8896b, int i) {
        int i2 = C8895a.f23292a[enumC8896b.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return f23290f[i];
                        }
                        throw new IllegalStateException("Bad table");
                    }
                    return f23289e[i];
                }
                return f23288d[i];
            }
            return f23287c[i];
        }
        return f23286b[i];
    }

    /* renamed from: f */
    private static String m17058f(boolean[] zArr) {
        int i;
        int length = zArr.length;
        EnumC8896b enumC8896b = EnumC8896b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        EnumC8896b enumC8896b2 = enumC8896b;
        int i2 = 0;
        while (i2 < length) {
            if (enumC8896b == EnumC8896b.BINARY) {
                if (length - i2 < 5) {
                    break;
                }
                int m17055i = m17055i(zArr, i2, 5);
                i2 += 5;
                if (m17055i == 0) {
                    if (length - i2 < 11) {
                        break;
                    }
                    m17055i = m17055i(zArr, i2, 11) + 31;
                    i2 += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= m17055i) {
                        break;
                    } else if (length - i2 < 8) {
                        i2 = length;
                        break;
                    } else {
                        sb2.append((char) m17055i(zArr, i2, 8));
                        i2 += 8;
                        i3++;
                    }
                }
                enumC8896b = enumC8896b2;
            } else {
                if (enumC8896b == EnumC8896b.DIGIT) {
                    i = 4;
                } else {
                    i = 5;
                }
                if (length - i2 < i) {
                    break;
                }
                int m17055i2 = m17055i(zArr, i2, i);
                i2 += i;
                String m17059e = m17059e(enumC8896b, m17055i2);
                if (m17059e.startsWith("CTRL_")) {
                    enumC8896b2 = m17057g(m17059e.charAt(5));
                    if (m17059e.charAt(6) != 'L') {
                        enumC8896b2 = enumC8896b;
                        enumC8896b = enumC8896b2;
                    }
                } else {
                    sb2.append(m17059e);
                }
                enumC8896b = enumC8896b2;
            }
        }
        return sb2.toString();
    }

    /* renamed from: g */
    private static EnumC8896b m17057g(char c) {
        if (c != 'B') {
            if (c != 'D') {
                if (c != 'P') {
                    if (c != 'L') {
                        if (c != 'M') {
                            return EnumC8896b.UPPER;
                        }
                        return EnumC8896b.MIXED;
                    }
                    return EnumC8896b.LOWER;
                }
                return EnumC8896b.PUNCT;
            }
            return EnumC8896b.DIGIT;
        }
        return EnumC8896b.BINARY;
    }

    /* renamed from: h */
    private static byte m17056h(boolean[] zArr, int i) {
        int m17055i;
        int length = zArr.length - i;
        if (length >= 8) {
            m17055i = m17055i(zArr, i, 8);
        } else {
            m17055i = m17055i(zArr, i, length) << (8 - length);
        }
        return (byte) m17055i;
    }

    /* renamed from: i */
    private static int m17055i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: j */
    private static int m17054j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: c */
    public C10123e m17061c(C7494a c7494a) {
        this.f23291a = c7494a;
        boolean[] m17062b = m17062b(m17060d(c7494a.m12222a()));
        C10123e c10123e = new C10123e(m17063a(m17062b), m17058f(m17062b), null, null);
        c10123e.m12224l(m17062b.length);
        return c10123e;
    }
}
