package p270oh;

/* renamed from: oh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C11109a {

    /* renamed from: a */
    private static final boolean f29074a;

    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        f29074a = "true".equals(str);
    }

    /* renamed from: a */
    private static /* synthetic */ void m9151a(int i) {
        String str = (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? 2 : 3];
        if (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i == 1) {
            objArr[1] = "encodeBytes";
        } else if (i == 3) {
            objArr[1] = "encode8to7";
        } else if (i == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i == 8) {
            objArr[1] = "decodeBytes";
        } else if (i == 10) {
            objArr[1] = "dropMarker";
        } else if (i == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 6 && i != 8 && i != 10 && i != 12 && i != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    private static void m9150b(byte[] bArr, int i) {
        if (bArr == null) {
            m9151a(4);
        }
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((bArr[i2] + i) & 127);
        }
    }

    /* renamed from: c */
    private static byte[] m9149c(String[] strArr) {
        if (strArr == null) {
            m9151a(11);
        }
        int i = 0;
        for (String str : strArr) {
            i += str.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i3 = 0;
            while (i3 < length) {
                bArr[i2] = (byte) str2.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }

    /* renamed from: d */
    private static byte[] m9148d(byte[] bArr) {
        if (bArr == null) {
            m9151a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i++;
            int i4 = i2 + 1;
            bArr2[i3] = (byte) (((bArr[i] & 255) >>> i2) + ((bArr[i] & ((1 << i4) - 1)) << (7 - i2)));
            if (i2 == 6) {
                i++;
                i2 = 0;
            } else {
                i2 = i4;
            }
        }
        return bArr2;
    }

    /* renamed from: e */
    public static byte[] m9147e(String[] strArr) {
        if (strArr == null) {
            m9151a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                byte[] m9120a = C11123j.m9120a(m9146f(strArr));
                if (m9120a == null) {
                    m9151a(8);
                }
                return m9120a;
            } else if (charAt == 65535) {
                strArr = m9146f(strArr);
            }
        }
        byte[] m9149c = m9149c(strArr);
        m9150b(m9149c, 127);
        return m9148d(m9149c);
    }

    /* renamed from: f */
    private static String[] m9146f(String[] strArr) {
        if (strArr == null) {
            m9151a(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
