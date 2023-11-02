package cd;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import lc.C10121c;
import lc.C10123e;
import lc.C10130l;
import lc.EnumC10122d;
import p136hc.C7060f;
import p136hc.EnumC7059e;

/* renamed from: cd.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2500d {

    /* renamed from: a */
    private static final char[] f6860a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: cd.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C2501a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6861a;

        static {
            int[] iArr = new int[EnumC2505h.values().length];
            f6861a = iArr;
            try {
                iArr[EnumC2505h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6861a[EnumC2505h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6861a[EnumC2505h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6861a[EnumC2505h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6861a[EnumC2505h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6861a[EnumC2505h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6861a[EnumC2505h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6861a[EnumC2505h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6861a[EnumC2505h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6861a[EnumC2505h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C10123e m33130a(byte[] bArr, C2507j c2507j, EnumC2503f enumC2503f, Map<EnumC7059e, ?> map) {
        EnumC2505h m33113a;
        EnumC2505h enumC2505h;
        ArrayList arrayList;
        String obj;
        C10121c c10121c = new C10121c(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        boolean z = true;
        ArrayList arrayList2 = new ArrayList(1);
        int i = -1;
        int i2 = -1;
        boolean z2 = false;
        EnumC10122d enumC10122d = null;
        while (true) {
            try {
                if (c10121c.m12240a() < 4) {
                    m33113a = EnumC2505h.TERMINATOR;
                } else {
                    m33113a = EnumC2505h.m33113a(c10121c.m12237d(4));
                }
                EnumC2505h enumC2505h2 = m33113a;
                int[] iArr = C2501a.f6861a;
                switch (iArr[enumC2505h2.ordinal()]) {
                    case 5:
                        enumC2505h = enumC2505h2;
                        break;
                    case 6:
                    case 7:
                        z2 = z;
                        enumC2505h = enumC2505h2;
                        break;
                    case 8:
                        if (c10121c.m12240a() >= 16) {
                            int m12237d = c10121c.m12237d(8);
                            i2 = c10121c.m12237d(8);
                            i = m12237d;
                            enumC2505h = enumC2505h2;
                            break;
                        } else {
                            throw C7060f.m21471a();
                        }
                    case 9:
                        enumC10122d = EnumC10122d.m12236a(m33124g(c10121c));
                        if (enumC10122d == null) {
                            throw C7060f.m21471a();
                        }
                        enumC2505h = enumC2505h2;
                        break;
                    case 10:
                        int m12237d2 = c10121c.m12237d(4);
                        int m12237d3 = c10121c.m12237d(enumC2505h2.m33112b(c2507j));
                        if (m12237d2 == z) {
                            m33127d(c10121c, sb2, m12237d3);
                        }
                        enumC2505h = enumC2505h2;
                        break;
                    default:
                        int m12237d4 = c10121c.m12237d(enumC2505h2.m33112b(c2507j));
                        int i3 = iArr[enumC2505h2.ordinal()];
                        if (i3 != z) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4) {
                                        m33126e(c10121c, sb2, m12237d4);
                                        enumC2505h = enumC2505h2;
                                        break;
                                    } else {
                                        throw C7060f.m21471a();
                                    }
                                } else {
                                    enumC2505h = enumC2505h2;
                                    m33128c(c10121c, sb2, m12237d4, enumC10122d, arrayList2, map);
                                    break;
                                }
                            } else {
                                enumC2505h = enumC2505h2;
                                m33129b(c10121c, sb2, m12237d4, z2);
                                break;
                            }
                        } else {
                            enumC2505h = enumC2505h2;
                            m33125f(c10121c, sb2, m12237d4);
                            break;
                        }
                }
                if (enumC2505h == EnumC2505h.TERMINATOR) {
                    String sb3 = sb2.toString();
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    if (enumC2503f == null) {
                        obj = null;
                    } else {
                        obj = enumC2503f.toString();
                    }
                    return new C10123e(bArr, sb3, arrayList, obj, i, i2);
                }
                z = true;
            } catch (IllegalArgumentException unused) {
                throw C7060f.m21471a();
            }
        }
    }

    /* renamed from: b */
    private static void m33129b(C10121c c10121c, StringBuilder sb2, int i, boolean z) {
        while (i > 1) {
            if (c10121c.m12240a() >= 11) {
                int m12237d = c10121c.m12237d(11);
                sb2.append(m33123h(m12237d / 45));
                sb2.append(m33123h(m12237d % 45));
                i -= 2;
            } else {
                throw C7060f.m21471a();
            }
        }
        if (i == 1) {
            if (c10121c.m12240a() >= 6) {
                sb2.append(m33123h(c10121c.m12237d(6)));
            } else {
                throw C7060f.m21471a();
            }
        }
        if (z) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i2 = length + 1;
                        if (sb2.charAt(i2) == '%') {
                            sb2.deleteCharAt(i2);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m33128c(C10121c c10121c, StringBuilder sb2, int i, EnumC10122d enumC10122d, Collection<byte[]> collection, Map<EnumC7059e, ?> map) {
        String name;
        if ((i << 3) <= c10121c.m12240a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) c10121c.m12237d(8);
            }
            if (enumC10122d == null) {
                name = C10130l.m12201a(bArr, map);
            } else {
                name = enumC10122d.name();
            }
            try {
                sb2.append(new String(bArr, name));
                collection.add(bArr);
                return;
            } catch (UnsupportedEncodingException unused) {
                throw C7060f.m21471a();
            }
        }
        throw C7060f.m21471a();
    }

    /* renamed from: d */
    private static void m33127d(C10121c c10121c, StringBuilder sb2, int i) {
        int i2;
        if (i * 13 <= c10121c.m12240a()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int m12237d = c10121c.m12237d(13);
                int i4 = (m12237d % 96) | ((m12237d / 96) << 8);
                if (i4 < 959) {
                    i2 = 41377;
                } else {
                    i2 = 42657;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, "GB2312"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw C7060f.m21471a();
            }
        }
        throw C7060f.m21471a();
    }

    /* renamed from: e */
    private static void m33126e(C10121c c10121c, StringBuilder sb2, int i) {
        int i2;
        if (i * 13 <= c10121c.m12240a()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int m12237d = c10121c.m12237d(13);
                int i4 = (m12237d % 192) | ((m12237d / 192) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, "SJIS"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw C7060f.m21471a();
            }
        }
        throw C7060f.m21471a();
    }

    /* renamed from: f */
    private static void m33125f(C10121c c10121c, StringBuilder sb2, int i) {
        while (i >= 3) {
            if (c10121c.m12240a() >= 10) {
                int m12237d = c10121c.m12237d(10);
                if (m12237d < 1000) {
                    sb2.append(m33123h(m12237d / 100));
                    sb2.append(m33123h((m12237d / 10) % 10));
                    sb2.append(m33123h(m12237d % 10));
                    i -= 3;
                } else {
                    throw C7060f.m21471a();
                }
            } else {
                throw C7060f.m21471a();
            }
        }
        if (i == 2) {
            if (c10121c.m12240a() >= 7) {
                int m12237d2 = c10121c.m12237d(7);
                if (m12237d2 < 100) {
                    sb2.append(m33123h(m12237d2 / 10));
                    sb2.append(m33123h(m12237d2 % 10));
                    return;
                }
                throw C7060f.m21471a();
            }
            throw C7060f.m21471a();
        } else if (i == 1) {
            if (c10121c.m12240a() >= 4) {
                int m12237d3 = c10121c.m12237d(4);
                if (m12237d3 < 10) {
                    sb2.append(m33123h(m12237d3));
                    return;
                }
                throw C7060f.m21471a();
            }
            throw C7060f.m21471a();
        }
    }

    /* renamed from: g */
    private static int m33124g(C10121c c10121c) {
        int m12237d = c10121c.m12237d(8);
        if ((m12237d & 128) == 0) {
            return m12237d & 127;
        }
        if ((m12237d & 192) == 128) {
            return c10121c.m12237d(8) | ((m12237d & 63) << 8);
        }
        if ((m12237d & 224) == 192) {
            return c10121c.m12237d(16) | ((m12237d & 31) << 16);
        }
        throw C7060f.m21471a();
    }

    /* renamed from: h */
    private static char m33123h(int i) {
        char[] cArr = f6860a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C7060f.m21471a();
    }
}
