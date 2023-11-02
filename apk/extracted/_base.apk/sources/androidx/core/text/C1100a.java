package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1100a {

    /* renamed from: d */
    static final InterfaceC1122s f3471d;

    /* renamed from: e */
    private static final String f3472e;

    /* renamed from: f */
    private static final String f3473f;

    /* renamed from: g */
    static final C1100a f3474g;

    /* renamed from: h */
    static final C1100a f3475h;

    /* renamed from: a */
    private final boolean f3476a;

    /* renamed from: b */
    private final int f3477b;

    /* renamed from: c */
    private final InterfaceC1122s f3478c;

    /* renamed from: androidx.core.text.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1101a {

        /* renamed from: a */
        private boolean f3479a;

        /* renamed from: b */
        private int f3480b;

        /* renamed from: c */
        private InterfaceC1122s f3481c;

        public C1101a() {
            m37881c(C1100a.m37890e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C1100a m37882b(boolean z) {
            return z ? C1100a.f3475h : C1100a.f3474g;
        }

        /* renamed from: c */
        private void m37881c(boolean z) {
            this.f3479a = z;
            this.f3481c = C1100a.f3471d;
            this.f3480b = 2;
        }

        /* renamed from: a */
        public C1100a m37883a() {
            if (this.f3480b == 2 && this.f3481c == C1100a.f3471d) {
                return m37882b(this.f3479a);
            }
            return new C1100a(this.f3479a, this.f3480b, this.f3481c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.text.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1102b {

        /* renamed from: f */
        private static final byte[] f3482f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f3483a;

        /* renamed from: b */
        private final boolean f3484b;

        /* renamed from: c */
        private final int f3485c;

        /* renamed from: d */
        private int f3486d;

        /* renamed from: e */
        private char f3487e;

        static {
            for (int i = 0; i < 1792; i++) {
                f3482f[i] = Character.getDirectionality(i);
            }
        }

        C1102b(CharSequence charSequence, boolean z) {
            this.f3483a = charSequence;
            this.f3484b = z;
            this.f3485c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m37878c(char c) {
            return c < 1792 ? f3482f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m37875f() {
            char charAt;
            int i = this.f3486d;
            do {
                int i2 = this.f3486d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3483a;
                int i3 = i2 - 1;
                this.f3486d = i3;
                charAt = charSequence.charAt(i3);
                this.f3487e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f3486d = i;
            this.f3487e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        private byte m37874g() {
            char charAt;
            do {
                int i = this.f3486d;
                if (i >= this.f3485c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f3483a;
                this.f3486d = i + 1;
                charAt = charSequence.charAt(i);
                this.f3487e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        private byte m37873h() {
            char charAt;
            int i = this.f3486d;
            while (true) {
                int i2 = this.f3486d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3483a;
                int i3 = i2 - 1;
                this.f3486d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f3487e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f3486d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f3483a;
                            int i5 = i4 - 1;
                            this.f3486d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f3487e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f3486d = i;
            this.f3487e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        private byte m37872i() {
            char charAt;
            int i = this.f3486d;
            while (true) {
                int i2 = this.f3486d;
                if (i2 < this.f3485c) {
                    CharSequence charSequence = this.f3483a;
                    this.f3486d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f3487e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f3486d;
                            if (i3 < this.f3485c) {
                                CharSequence charSequence2 = this.f3483a;
                                this.f3486d = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.f3487e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f3486d = i;
                    this.f3487e = '<';
                    return (byte) 13;
                }
            }
        }

        /* renamed from: a */
        byte m37880a() {
            char charAt = this.f3483a.charAt(this.f3486d - 1);
            this.f3487e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3483a, this.f3486d);
                this.f3486d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3486d--;
            byte m37878c = m37878c(this.f3487e);
            if (this.f3484b) {
                char c = this.f3487e;
                if (c == '>') {
                    return m37873h();
                }
                if (c == ';') {
                    return m37875f();
                }
                return m37878c;
            }
            return m37878c;
        }

        /* renamed from: b */
        byte m37879b() {
            char charAt = this.f3483a.charAt(this.f3486d);
            this.f3487e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f3483a, this.f3486d);
                this.f3486d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3486d++;
            byte m37878c = m37878c(this.f3487e);
            if (this.f3484b) {
                char c = this.f3487e;
                if (c == '<') {
                    return m37872i();
                }
                if (c == '&') {
                    return m37874g();
                }
                return m37878c;
            }
            return m37878c;
        }

        /* renamed from: d */
        int m37877d() {
            this.f3486d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f3486d < this.f3485c && i == 0) {
                byte m37879b = m37879b();
                if (m37879b != 0) {
                    if (m37879b != 1 && m37879b != 2) {
                        if (m37879b != 9) {
                            switch (m37879b) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                            }
                        }
                    } else if (i3 == 0) {
                        return 1;
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f3486d > 0) {
                switch (m37880a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        int m37876e() {
            this.f3486d = this.f3485c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f3486d > 0) {
                    byte m37880a = m37880a();
                    if (m37880a != 0) {
                        if (m37880a != 1 && m37880a != 2) {
                            if (m37880a != 9) {
                                switch (m37880a) {
                                    case 14:
                                    case 15:
                                        if (i2 == i) {
                                            return -1;
                                        }
                                        i--;
                                        break;
                                    case 16:
                                    case 17:
                                        if (i2 == i) {
                                            return 1;
                                        }
                                        i--;
                                        break;
                                    case 18:
                                        i++;
                                        break;
                                    default:
                                        if (i2 != 0) {
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            } else {
                                continue;
                            }
                        } else if (i == 0) {
                            return 1;
                        } else {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i2 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        InterfaceC1122s interfaceC1122s = C1123t.f3491c;
        f3471d = interfaceC1122s;
        f3472e = Character.toString((char) 8206);
        f3473f = Character.toString((char) 8207);
        f3474g = new C1100a(false, 2, interfaceC1122s);
        f3475h = new C1100a(true, 2, interfaceC1122s);
    }

    C1100a(boolean z, int i, InterfaceC1122s interfaceC1122s) {
        this.f3476a = z;
        this.f3477b = i;
        this.f3478c = interfaceC1122s;
    }

    /* renamed from: a */
    private static int m37894a(CharSequence charSequence) {
        return new C1102b(charSequence, false).m37877d();
    }

    /* renamed from: b */
    private static int m37893b(CharSequence charSequence) {
        return new C1102b(charSequence, false).m37876e();
    }

    /* renamed from: c */
    public static C1100a m37892c() {
        return new C1101a().m37883a();
    }

    /* renamed from: e */
    static boolean m37890e(Locale locale) {
        return C1130u.m37845a(locale) == 1;
    }

    /* renamed from: f */
    private String m37889f(CharSequence charSequence, InterfaceC1122s interfaceC1122s) {
        boolean isRtl = interfaceC1122s.isRtl(charSequence, 0, charSequence.length());
        if (!this.f3476a && (isRtl || m37893b(charSequence) == 1)) {
            return f3472e;
        }
        if (this.f3476a) {
            if (!isRtl || m37893b(charSequence) == -1) {
                return f3473f;
            }
            return "";
        }
        return "";
    }

    /* renamed from: g */
    private String m37888g(CharSequence charSequence, InterfaceC1122s interfaceC1122s) {
        boolean isRtl = interfaceC1122s.isRtl(charSequence, 0, charSequence.length());
        if (!this.f3476a && (isRtl || m37894a(charSequence) == 1)) {
            return f3472e;
        }
        if (this.f3476a) {
            if (!isRtl || m37894a(charSequence) == -1) {
                return f3473f;
            }
            return "";
        }
        return "";
    }

    /* renamed from: d */
    public boolean m37891d() {
        return (this.f3477b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence m37887h(CharSequence charSequence) {
        return m37886i(charSequence, this.f3478c, true);
    }

    /* renamed from: i */
    public CharSequence m37886i(CharSequence charSequence, InterfaceC1122s interfaceC1122s, boolean z) {
        InterfaceC1122s interfaceC1122s2;
        char c;
        InterfaceC1122s interfaceC1122s3;
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = interfaceC1122s.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m37891d() && z) {
            if (isRtl) {
                interfaceC1122s3 = C1123t.f3490b;
            } else {
                interfaceC1122s3 = C1123t.f3489a;
            }
            spannableStringBuilder.append((CharSequence) m37888g(charSequence, interfaceC1122s3));
        }
        if (isRtl != this.f3476a) {
            if (isRtl) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (isRtl) {
                interfaceC1122s2 = C1123t.f3490b;
            } else {
                interfaceC1122s2 = C1123t.f3489a;
            }
            spannableStringBuilder.append((CharSequence) m37889f(charSequence, interfaceC1122s2));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m37885j(String str) {
        return m37884k(str, this.f3478c, true);
    }

    /* renamed from: k */
    public String m37884k(String str, InterfaceC1122s interfaceC1122s, boolean z) {
        if (str == null) {
            return null;
        }
        return m37886i(str, interfaceC1122s, z).toString();
    }
}
