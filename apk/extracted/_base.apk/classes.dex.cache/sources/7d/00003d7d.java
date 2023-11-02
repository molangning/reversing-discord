package p184jj;

import com.facebook.react.views.text.TypefaceStyle;
import com.reactnativecommunity.webview.RNCWebViewManager;
import net.time4j.base.C10616c;

/* renamed from: jj.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class EnumC8985j {

    /* renamed from: A */
    private static final int[] f23620A;

    /* renamed from: B */
    private static final /* synthetic */ EnumC8985j[] f23621B;

    /* renamed from: j */
    public static final EnumC8985j f23622j;

    /* renamed from: k */
    public static final EnumC8985j f23623k;

    /* renamed from: l */
    public static final EnumC8985j f23624l;

    /* renamed from: m */
    public static final EnumC8985j f23625m;

    /* renamed from: n */
    public static final EnumC8985j f23626n;

    /* renamed from: o */
    public static final EnumC8985j f23627o;

    /* renamed from: p */
    public static final EnumC8985j f23628p;

    /* renamed from: q */
    public static final EnumC8985j f23629q;

    /* renamed from: r */
    public static final EnumC8985j f23630r;

    /* renamed from: s */
    public static final EnumC8985j f23631s;

    /* renamed from: t */
    public static final EnumC8985j f23632t;

    /* renamed from: u */
    public static final EnumC8985j f23633u;

    /* renamed from: v */
    public static final EnumC8985j f23634v;

    /* renamed from: w */
    public static final EnumC8985j f23635w;

    /* renamed from: x */
    public static final EnumC8985j f23636x;

    /* renamed from: y */
    private static final int[] f23637y;

    /* renamed from: z */
    private static final String[] f23638z;
    private final String code;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.j$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public enum C8992g extends EnumC8985j {
        C8992g(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // p184jj.EnumC8985j
        /* renamed from: h */
        public boolean mo16874h(char c) {
            return c >= '0' && c <= '9';
        }

        @Override // p184jj.EnumC8985j
        /* renamed from: k */
        public String mo16873k() {
            return "0123456789";
        }

        @Override // p184jj.EnumC8985j
        /* renamed from: m */
        public boolean mo16872m() {
            return true;
        }

        @Override // p184jj.EnumC8985j
        /* renamed from: o */
        public int mo16871o(String str, EnumC8981g enumC8981g) {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                return parseInt;
            }
            throw new NumberFormatException("Cannot convert negative number: " + str);
        }

        @Override // p184jj.EnumC8985j
        /* renamed from: q */
        public String mo16870q(int i) {
            if (i >= 0) {
                return Integer.toString(i);
            }
            throw new IllegalArgumentException("Cannot convert: " + i);
        }
    }

    static {
        C8992g c8992g = new C8992g("ARABIC", 0, "latn");
        f23622j = c8992g;
        EnumC8985j enumC8985j = new EnumC8985j("ARABIC_INDIC", 1, "arab") { // from class: jj.j.h
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "٠١٢٣٤٥٦٧٨٩";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23623k = enumC8985j;
        EnumC8985j enumC8985j2 = new EnumC8985j("ARABIC_INDIC_EXT", 2, "arabext") { // from class: jj.j.i
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "۰۱۲۳۴۵۶۷۸۹";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23624l = enumC8985j2;
        EnumC8985j enumC8985j3 = new EnumC8985j("BENGALI", 3, "beng") { // from class: jj.j.j
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "০১২৩৪৫৬৭৮৯";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23625m = enumC8985j3;
        EnumC8985j enumC8985j4 = new EnumC8985j("DEVANAGARI", 4, "deva") { // from class: jj.j.k
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "०१२३४५६७८९";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23626n = enumC8985j4;
        EnumC8985j enumC8985j5 = new EnumC8985j("DOZENAL", 5, "dozenal") { // from class: jj.j.l
            @Override // p184jj.EnumC8985j
            /* renamed from: h */
            public boolean mo16874h(char c) {
                return (c >= '0' && c <= '9') || c == 8586 || c == 8587;
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "0123456789↊↋";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return false;
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: o */
            public int mo16871o(String str, EnumC8981g enumC8981g) {
                int parseInt = Integer.parseInt(str.replace((char) 8586, 'a').replace((char) 8587, 'b'), 12);
                if (parseInt >= 0) {
                    return parseInt;
                }
                throw new NumberFormatException("Cannot convert negative number: " + str);
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: p */
            public int mo16875p(int i, Appendable appendable) {
                char c;
                if (i >= 0) {
                    int i2 = 1;
                    while (true) {
                        if (i2 <= 4) {
                            if (i < EnumC8985j.f23620A[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = 0;
                            break;
                        }
                    }
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        do {
                            int i4 = i / EnumC8985j.f23620A[i3];
                            if (i4 == 11) {
                                c = 8587;
                            } else if (i4 == 10) {
                                c = 8586;
                            } else {
                                c = (char) (i4 + 48);
                            }
                            appendable.append(c);
                            i -= i4 * EnumC8985j.f23620A[i3];
                            i3--;
                        } while (i3 >= 0);
                        return i2;
                    }
                }
                return super.mo16875p(i, appendable);
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: q */
            public String mo16870q(int i) {
                if (i >= 0) {
                    return Integer.toString(i, 12).replace('a', (char) 8586).replace('b', (char) 8587);
                }
                throw new IllegalArgumentException("Cannot convert: " + i);
            }
        };
        f23627o = enumC8985j5;
        EnumC8985j enumC8985j6 = new EnumC8985j("ETHIOPIC", 6, "ethiopic") { // from class: jj.j.m
            @Override // p184jj.EnumC8985j
            /* renamed from: h */
            public boolean mo16874h(char c) {
                return c >= 4969 && c <= 4988;
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "፩፪፫፬፭፮፯፰፱፲፳፴፵፶፷፸፹፺፻፼";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return false;
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: o */
            public int mo16871o(String str, EnumC8981g enumC8981g) {
                int i;
                int i2 = 1;
                int i3 = 1;
                boolean z = false;
                boolean z2 = false;
                int i4 = 0;
                int i5 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    if (charAt >= 4969 && charAt < 4978) {
                        i = (charAt + 1) - 4969;
                    } else if (charAt >= 4978 && charAt < 4987) {
                        i = ((charAt + 1) - 4978) * 10;
                    } else {
                        if (charAt == 4988) {
                            if (z && i5 == 0) {
                                i5 = 1;
                            }
                            i4 = EnumC8985j.m16879g(i4, i5, i3);
                            if (z) {
                                i3 *= 100;
                            } else {
                                i3 *= 10000;
                            }
                            z2 = true;
                            z = false;
                            i5 = 0;
                        } else if (charAt == 4987) {
                            i4 = EnumC8985j.m16879g(i4, i5, i3);
                            i3 *= 100;
                            z = true;
                            z2 = false;
                            i5 = 0;
                        }
                    }
                    i5 += i;
                }
                if ((!z && !z2) || i5 != 0) {
                    i2 = i5;
                }
                return EnumC8985j.m16879g(i4, i2, i3);
            }

            /* JADX WARN: Removed duplicated region for block: B:81:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x007a  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x007d A[SYNTHETIC] */
            @Override // p184jj.EnumC8985j
            /* renamed from: q */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.String mo16870q(int r11) {
                /*
                    r10 = this;
                    r0 = 1
                    if (r11 < r0) goto L85
                    java.lang.String r11 = java.lang.String.valueOf(r11)
                    int r1 = r11.length()
                    int r1 = r1 - r0
                    int r2 = r1 % 2
                    if (r2 != 0) goto L23
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "0"
                    r2.append(r3)
                    r2.append(r11)
                    java.lang.String r11 = r2.toString()
                    int r1 = r1 + 1
                L23:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r3 = r1
                L29:
                    if (r3 < 0) goto L80
                    int r4 = r1 - r3
                    char r4 = r11.charAt(r4)
                    int r3 = r3 + (-1)
                    int r5 = r1 - r3
                    char r5 = r11.charAt(r5)
                    r6 = 48
                    r7 = 0
                    if (r5 == r6) goto L42
                    int r5 = r5 + 4920
                    char r5 = (char) r5
                    goto L43
                L42:
                    r5 = r7
                L43:
                    if (r4 == r6) goto L49
                    int r4 = r4 + 4929
                    char r4 = (char) r4
                    goto L4a
                L49:
                    r4 = r7
                L4a:
                    int r6 = r3 % 4
                    int r6 = r6 / 2
                    r8 = 4987(0x137b, float:6.988E-42)
                    if (r3 == 0) goto L5d
                    if (r6 == 0) goto L5a
                    if (r5 != 0) goto L58
                    if (r4 == 0) goto L5d
                L58:
                    r6 = r8
                    goto L5e
                L5a:
                    r6 = 4988(0x137c, float:6.99E-42)
                    goto L5e
                L5d:
                    r6 = r7
                L5e:
                    r9 = 4969(0x1369, float:6.963E-42)
                    if (r5 != r9) goto L6d
                    if (r4 != 0) goto L6d
                    if (r1 <= r0) goto L6d
                    if (r6 == r8) goto L6e
                    int r8 = r3 + 1
                    if (r8 != r1) goto L6d
                    goto L6e
                L6d:
                    r7 = r5
                L6e:
                    if (r4 == 0) goto L73
                    r2.append(r4)
                L73:
                    if (r7 == 0) goto L78
                    r2.append(r7)
                L78:
                    if (r6 == 0) goto L7d
                    r2.append(r6)
                L7d:
                    int r3 = r3 + (-1)
                    goto L29
                L80:
                    java.lang.String r11 = r2.toString()
                    return r11
                L85:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Can only convert positive numbers: "
                    r1.append(r2)
                    r1.append(r11)
                    java.lang.String r11 = r1.toString()
                    r0.<init>(r11)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p184jj.EnumC8985j.C8998m.mo16870q(int):java.lang.String");
            }
        };
        f23628p = enumC8985j6;
        EnumC8985j enumC8985j7 = new EnumC8985j("GUJARATI", 7, "gujr") { // from class: jj.j.n
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "૦૧૨૩૪૫૬૭૮૯";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23629q = enumC8985j7;
        EnumC8985j enumC8985j8 = new EnumC8985j("JAPANESE", 8, "jpan") { // from class: jj.j.o
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "一二三四五六七八九十百千";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return false;
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: o */
            public int mo16871o(String str, EnumC8981g enumC8981g) {
                boolean z;
                String mo16873k = mo16873k();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    if (charAt != 21313) {
                        if (charAt != 21315) {
                            if (charAt != 30334) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 < 9) {
                                        if (mo16873k.charAt(i5) == charAt) {
                                            int i6 = i5 + 1;
                                            if (i4 == 1) {
                                                i2 += i6 * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                                                i4 = -1;
                                            } else if (i3 == 1) {
                                                i2 += i6 * 100;
                                                i3 = -1;
                                            } else if (i == 1) {
                                                i2 += i6 * 10;
                                                i = -1;
                                            } else {
                                                i2 += i6;
                                            }
                                            z = true;
                                        } else {
                                            i5++;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (!z) {
                                    throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                                }
                            } else if (i3 == 0 && i4 == 0) {
                                i3++;
                            } else {
                                throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                            }
                        } else if (i4 == 0) {
                            i4++;
                        } else {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                    } else if (i == 0 && i3 == 0 && i4 == 0) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                    }
                }
                if (i == 1) {
                    i2 += 10;
                }
                if (i3 == 1) {
                    i2 += 100;
                }
                if (i4 == 1) {
                    return i2 + RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                }
                return i2;
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: q */
            public String mo16870q(int i) {
                if (i >= 1 && i <= 9999) {
                    String mo16873k = mo16873k();
                    int i2 = i / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                    int i3 = i % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                    int i4 = i3 / 100;
                    int i5 = i3 % 100;
                    int i6 = i5 / 10;
                    int i7 = i5 % 10;
                    StringBuilder sb2 = new StringBuilder();
                    if (i2 >= 1) {
                        if (i2 > 1) {
                            sb2.append(mo16873k.charAt(i2 - 1));
                        }
                        sb2.append((char) 21315);
                    }
                    if (i4 >= 1) {
                        if (i4 > 1) {
                            sb2.append(mo16873k.charAt(i4 - 1));
                        }
                        sb2.append((char) 30334);
                    }
                    if (i6 >= 1) {
                        if (i6 > 1) {
                            sb2.append(mo16873k.charAt(i6 - 1));
                        }
                        sb2.append((char) 21313);
                    }
                    if (i7 > 0) {
                        sb2.append(mo16873k.charAt(i7 - 1));
                    }
                    return sb2.toString();
                }
                throw new IllegalArgumentException("Cannot convert: " + i);
            }
        };
        f23630r = enumC8985j8;
        EnumC8985j enumC8985j9 = new EnumC8985j("KHMER", 9, "khmr") { // from class: jj.j.a
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "០១២៣៤៥៦៧៨៩";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23631s = enumC8985j9;
        EnumC8985j enumC8985j10 = new EnumC8985j("MYANMAR", 10, "mymr") { // from class: jj.j.b
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "၀၁၂၃၄၅၆၇၈၉";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23632t = enumC8985j10;
        EnumC8985j enumC8985j11 = new EnumC8985j("ORYA", 11, "orya") { // from class: jj.j.c
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "୦୧୨୩୪୫୬୭୮୯";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23633u = enumC8985j11;
        EnumC8985j enumC8985j12 = new EnumC8985j("ROMAN", 12, "roman") { // from class: jj.j.d
            @Override // p184jj.EnumC8985j
            /* renamed from: h */
            public boolean mo16874h(char c) {
                char upperCase = Character.toUpperCase(c);
                return upperCase == 'I' || upperCase == 'V' || upperCase == 'X' || upperCase == 'L' || upperCase == 'C' || upperCase == 'D' || upperCase == 'M';
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "IVXLCDM";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:150:0x0016, code lost:
                continue;
             */
            @Override // p184jj.EnumC8985j
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int mo16871o(java.lang.String r11, p184jj.EnumC8981g r12) {
                /*
                    Method dump skipped, instructions count: 222
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p184jj.EnumC8985j.C8989d.mo16871o(java.lang.String, jj.g):int");
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: q */
            public String mo16870q(int i) {
                if (i >= 1 && i <= 3999) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i2 = 0; i2 < EnumC8985j.f23637y.length; i2++) {
                        while (i >= EnumC8985j.f23637y[i2]) {
                            sb2.append(EnumC8985j.f23638z[i2]);
                            i -= EnumC8985j.f23637y[i2];
                        }
                    }
                    return sb2.toString();
                }
                throw new IllegalArgumentException("Out of range (1-3999): " + i);
            }
        };
        f23634v = enumC8985j12;
        EnumC8985j enumC8985j13 = new EnumC8985j("TELUGU", 13, "telu") { // from class: jj.j.e
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "౦౧౨౩౪౫౬౭౮౯";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23635w = enumC8985j13;
        EnumC8985j enumC8985j14 = new EnumC8985j("THAI", 14, "thai") { // from class: jj.j.f
            @Override // p184jj.EnumC8985j
            /* renamed from: k */
            public String mo16873k() {
                return "๐๑๒๓๔๕๖๗๘๙";
            }

            @Override // p184jj.EnumC8985j
            /* renamed from: m */
            public boolean mo16872m() {
                return true;
            }
        };
        f23636x = enumC8985j14;
        f23621B = new EnumC8985j[]{c8992g, enumC8985j, enumC8985j2, enumC8985j3, enumC8985j4, enumC8985j5, enumC8985j6, enumC8985j7, enumC8985j8, enumC8985j9, enumC8985j10, enumC8985j11, enumC8985j12, enumC8985j13, enumC8985j14};
        f23637y = new int[]{RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 900, 500, TypefaceStyle.NORMAL, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        f23638z = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        f23620A = new int[]{1, 12, 144, 1728, 20736};
    }

    /* synthetic */ EnumC8985j(String str, int i, String str2, C8992g c8992g) {
        this(str, i, str2);
    }

    /* renamed from: g */
    public static int m16879g(int i, int i2, int i3) {
        return C10616c.m11037e(i, C10616c.m11034h(i2, i3));
    }

    /* renamed from: l */
    public static int m16877l(char c) {
        if (c != 'C') {
            if (c != 'D') {
                if (c != 'I') {
                    if (c != 'V') {
                        if (c != 'X') {
                            if (c != 'L') {
                                if (c == 'M') {
                                    return RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                                }
                                throw new NumberFormatException("Invalid Roman digit: " + c);
                            }
                            return 50;
                        }
                        return 10;
                    }
                    return 5;
                }
                return 1;
            }
            return 500;
        }
        return 100;
    }

    /* renamed from: n */
    public static boolean m16876n(char c, char c2) {
        if (c == 'C') {
            return c2 == 'M' || c2 == 'D';
        } else if (c == 'I') {
            return c2 == 'X' || c2 == 'V';
        } else if (c != 'X') {
            return false;
        } else {
            return c2 == 'C' || c2 == 'L';
        }
    }

    public static EnumC8985j valueOf(String str) {
        return (EnumC8985j) Enum.valueOf(EnumC8985j.class, str);
    }

    public static EnumC8985j[] values() {
        return (EnumC8985j[]) f23621B.clone();
    }

    /* renamed from: h */
    public boolean mo16874h(char c) {
        String mo16873k = mo16873k();
        int length = mo16873k.length();
        for (int i = 0; i < length; i++) {
            if (mo16873k.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public String m16878i() {
        return this.code;
    }

    /* renamed from: k */
    public String mo16873k() {
        throw new AbstractMethodError();
    }

    /* renamed from: m */
    public boolean mo16872m() {
        throw new AbstractMethodError();
    }

    /* renamed from: o */
    public int mo16871o(String str, EnumC8981g enumC8981g) {
        if (mo16872m()) {
            int charAt = mo16873k().charAt(0) - '0';
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                sb2.append((char) (str.charAt(i) - charAt));
            }
            int parseInt = Integer.parseInt(sb2.toString());
            if (parseInt >= 0) {
                return parseInt;
            }
            throw new NumberFormatException("Cannot convert negative number: " + str);
        }
        throw new NumberFormatException("Cannot convert: " + str);
    }

    /* renamed from: p */
    public int mo16875p(int i, Appendable appendable) {
        String mo16870q = mo16870q(i);
        appendable.append(mo16870q);
        return mo16870q.length();
    }

    /* renamed from: q */
    public String mo16870q(int i) {
        if (mo16872m() && i >= 0) {
            int charAt = mo16873k().charAt(0) - '0';
            String num = Integer.toString(i);
            StringBuilder sb2 = new StringBuilder();
            int length = num.length();
            for (int i2 = 0; i2 < length; i2++) {
                sb2.append((char) (num.charAt(i2) + charAt));
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Cannot convert: " + i);
    }

    private EnumC8985j(String str, int i, String str2) {
        super(str, i);
        this.code = str2;
    }
}