package p285pc;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import lc.C10121c;
import lc.C10123e;
import p136hc.C7060f;

/* renamed from: pc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C11491c {

    /* renamed from: b */
    private static final char[] f29821b;

    /* renamed from: d */
    private static final char[] f29823d;

    /* renamed from: a */
    private static final char[] f29820a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c */
    private static final char[] f29822c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e */
    private static final char[] f29824e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* renamed from: pc.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C11492a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29825a;

        static {
            int[] iArr = new int[EnumC11493b.values().length];
            f29825a = iArr;
            try {
                iArr[EnumC11493b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29825a[EnumC11493b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29825a[EnumC11493b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29825a[EnumC11493b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29825a[EnumC11493b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pc.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC11493b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f29821b = cArr;
        f29823d = cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10123e m7997a(byte[] bArr) {
        C10121c c10121c = new C10121c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        EnumC11493b enumC11493b = EnumC11493b.ASCII_ENCODE;
        do {
            EnumC11493b enumC11493b2 = EnumC11493b.ASCII_ENCODE;
            if (enumC11493b == enumC11493b2) {
                enumC11493b = m7995c(c10121c, sb2, sb3);
            } else {
                int i = C11492a.f29825a[enumC11493b.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    m7994d(c10121c, sb2, arrayList);
                                } else {
                                    throw C7060f.m21471a();
                                }
                            } else {
                                m7992f(c10121c, sb2);
                            }
                        } else {
                            m7996b(c10121c, sb2);
                        }
                    } else {
                        m7991g(c10121c, sb2);
                    }
                } else {
                    m7993e(c10121c, sb2);
                }
                enumC11493b = enumC11493b2;
            }
            if (enumC11493b == EnumC11493b.PAD_ENCODE) {
                break;
            }
        } while (c10121c.m12240a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String sb4 = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C10123e(bArr, sb4, arrayList, null);
    }

    /* renamed from: b */
    private static void m7996b(C10121c c10121c, StringBuilder sb2) {
        int m12237d;
        int[] iArr = new int[3];
        while (c10121c.m12240a() != 8 && (m12237d = c10121c.m12237d(8)) != 254) {
            m7990h(m12237d, c10121c.m12237d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 < 14) {
                                    sb2.append((char) (i2 + 44));
                                } else if (i2 < 40) {
                                    sb2.append((char) (i2 + 51));
                                } else {
                                    throw C7060f.m21471a();
                                }
                            } else {
                                sb2.append(' ');
                            }
                        } else {
                            sb2.append('>');
                        }
                    } else {
                        sb2.append('*');
                    }
                } else {
                    sb2.append('\r');
                }
            }
            if (c10121c.m12240a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static EnumC11493b m7995c(C10121c c10121c, StringBuilder sb2, StringBuilder sb3) {
        boolean z = false;
        do {
            int m12237d = c10121c.m12237d(8);
            if (m12237d != 0) {
                if (m12237d <= 128) {
                    if (z) {
                        m12237d += 128;
                    }
                    sb2.append((char) (m12237d - 1));
                    return EnumC11493b.ASCII_ENCODE;
                } else if (m12237d == 129) {
                    return EnumC11493b.PAD_ENCODE;
                } else {
                    if (m12237d <= 229) {
                        int i = m12237d - 130;
                        if (i < 10) {
                            sb2.append('0');
                        }
                        sb2.append(i);
                    } else {
                        switch (m12237d) {
                            case 230:
                                return EnumC11493b.C40_ENCODE;
                            case 231:
                                return EnumC11493b.BASE256_ENCODE;
                            case 232:
                                sb2.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z = true;
                                break;
                            case 236:
                                sb2.append("[)>\u001e05\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb2.append("[)>\u001e06\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return EnumC11493b.ANSIX12_ENCODE;
                            case 239:
                                return EnumC11493b.TEXT_ENCODE;
                            case 240:
                                return EnumC11493b.EDIFACT_ENCODE;
                            default:
                                if (m12237d != 254 || c10121c.m12240a() != 0) {
                                    throw C7060f.m21471a();
                                }
                                break;
                        }
                    }
                }
            } else {
                throw C7060f.m21471a();
            }
        } while (c10121c.m12240a() > 0);
        return EnumC11493b.ASCII_ENCODE;
    }

    /* renamed from: d */
    private static void m7994d(C10121c c10121c, StringBuilder sb2, Collection<byte[]> collection) {
        int m12238c = c10121c.m12238c() + 1;
        int i = m12238c + 1;
        int m7989i = m7989i(c10121c.m12237d(8), m12238c);
        if (m7989i == 0) {
            m7989i = c10121c.m12240a() / 8;
        } else if (m7989i >= 250) {
            m7989i = ((m7989i - 249) * ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION) + m7989i(c10121c.m12237d(8), i);
            i++;
        }
        if (m7989i >= 0) {
            byte[] bArr = new byte[m7989i];
            int i2 = 0;
            while (i2 < m7989i) {
                if (c10121c.m12240a() >= 8) {
                    bArr[i2] = (byte) m7989i(c10121c.m12237d(8), i);
                    i2++;
                    i++;
                } else {
                    throw C7060f.m21471a();
                }
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e)));
            }
        }
        throw C7060f.m21471a();
    }

    /* renamed from: e */
    private static void m7993e(C10121c c10121c, StringBuilder sb2) {
        int m12237d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c10121c.m12240a() != 8 && (m12237d = c10121c.m12237d(8)) != 254) {
            m7990h(m12237d, c10121c.m12237d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (z) {
                                    sb2.append((char) (i3 + 224));
                                    z = false;
                                    i = 0;
                                } else {
                                    sb2.append((char) (i3 + 96));
                                    i = 0;
                                }
                            } else {
                                throw C7060f.m21471a();
                            }
                        } else {
                            char[] cArr = f29821b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb2.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb2.append(c);
                                }
                            } else if (i3 != 27) {
                                if (i3 == 30) {
                                    z = true;
                                } else {
                                    throw C7060f.m21471a();
                                }
                            } else {
                                sb2.append((char) 29);
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb2.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb2.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f29820a;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb2.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb2.append(c2);
                        }
                    } else {
                        throw C7060f.m21471a();
                    }
                }
            }
            if (c10121c.m12240a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m7992f(C10121c c10121c, StringBuilder sb2) {
        while (c10121c.m12240a() > 16) {
            for (int i = 0; i < 4; i++) {
                int m12237d = c10121c.m12237d(6);
                if (m12237d == 31) {
                    int m12239b = 8 - c10121c.m12239b();
                    if (m12239b != 8) {
                        c10121c.m12237d(m12239b);
                        return;
                    }
                    return;
                }
                if ((m12237d & 32) == 0) {
                    m12237d |= 64;
                }
                sb2.append((char) m12237d);
            }
            if (c10121c.m12240a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    private static void m7991g(C10121c c10121c, StringBuilder sb2) {
        int m12237d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c10121c.m12240a() != 8 && (m12237d = c10121c.m12237d(8)) != 254) {
            m7990h(m12237d, c10121c.m12237d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                char[] cArr = f29824e;
                                if (i3 < cArr.length) {
                                    char c = cArr[i3];
                                    if (z) {
                                        sb2.append((char) (c + 128));
                                        z = false;
                                        i = 0;
                                    } else {
                                        sb2.append(c);
                                        i = 0;
                                    }
                                } else {
                                    throw C7060f.m21471a();
                                }
                            } else {
                                throw C7060f.m21471a();
                            }
                        } else {
                            char[] cArr2 = f29823d;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb2.append((char) (c2 + 128));
                                    z = false;
                                } else {
                                    sb2.append(c2);
                                }
                            } else if (i3 != 27) {
                                if (i3 == 30) {
                                    z = true;
                                } else {
                                    throw C7060f.m21471a();
                                }
                            } else {
                                sb2.append((char) 29);
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb2.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb2.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f29822c;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb2.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb2.append(c3);
                        }
                    } else {
                        throw C7060f.m21471a();
                    }
                }
            }
            if (c10121c.m12240a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    private static void m7990h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    private static int m7989i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
