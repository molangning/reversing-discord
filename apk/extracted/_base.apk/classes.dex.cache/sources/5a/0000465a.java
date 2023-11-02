package p272oj;

import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import java.util.MissingResourceException;
import net.time4j.EnumC10846x0;
import p184jj.EnumC9004n;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9012r;

/* renamed from: oj.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C11185h implements InterfaceC9012r {

    /* renamed from: oj.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C11186a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29233a;

        static {
            int[] iArr = new int[EnumC9016v.values().length];
            f29233a = iArr;
            try {
                iArr[EnumC9016v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29233a[EnumC9016v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29233a[EnumC9016v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29233a[EnumC9016v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: F */
    private static String m9019F(char c, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c);
        int i = C11186a.f29233a[enumC9016v.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    sb2.append('n');
                } else {
                    throw new UnsupportedOperationException(enumC9016v.name());
                }
            } else {
                sb2.append('s');
            }
        } else {
            sb2.append('w');
        }
        sb2.append(enumC9004n.ordinal());
        return sb2.toString();
    }

    /* renamed from: G */
    private static String m9018G(char c, boolean z, EnumC9004n enumC9004n) {
        char c2;
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c);
        if (z) {
            c2 = '+';
        } else {
            c2 = '-';
        }
        sb2.append(c2);
        sb2.append(enumC9004n.ordinal());
        return sb2.toString();
    }

    /* renamed from: H */
    private static String m9017H(EnumC9016v enumC9016v, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('L');
        int i = C11186a.f29233a[enumC9016v.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    sb2.append('n');
                } else {
                    throw new UnsupportedOperationException(enumC9016v.name());
                }
            } else {
                sb2.append('s');
            }
        } else {
            sb2.append('w');
        }
        sb2.append('-');
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: I */
    private String m9016I(Locale locale, String str) {
        C11180e m9040h;
        boolean z = true;
        C11180e c11180e = null;
        for (Locale locale2 : C11180e.m9045c(locale)) {
            if (z && c11180e != null) {
                m9040h = c11180e;
            } else {
                m9040h = C11180e.m9040h("i18n/reltime/relpattern", locale2);
            }
            if (z) {
                if (locale2.equals(m9040h.m9043e())) {
                    z = false;
                } else {
                    c11180e = m9040h;
                }
            }
            if (m9040h.m9044d().contains(str)) {
                return m9040h.m9042f(str);
            }
        }
        return "";
    }

    /* renamed from: J */
    private String m9015J(Locale locale, String str, String str2, String str3, EnumC9004n enumC9004n) {
        C11180e m9040h;
        boolean z = true;
        C11180e c11180e = null;
        for (Locale locale2 : C11180e.m9045c(locale)) {
            if (z && c11180e != null) {
                m9040h = c11180e;
            } else {
                m9040h = C11180e.m9040h("i18n/" + str, locale2);
            }
            if (z) {
                if (locale2.equals(m9040h.m9043e())) {
                    z = false;
                } else {
                    c11180e = m9040h;
                }
            }
            if (m9040h.m9044d().contains(str2)) {
                return m9040h.m9042f(str2);
            }
            if (enumC9004n != EnumC9004n.OTHER && m9040h.m9044d().contains(str3)) {
                return m9040h.m9042f(str3);
            }
        }
        throw new MissingResourceException("Can't find resource for bundle " + str + ".properties, key " + str2, str + ".properties", str2);
    }

    /* renamed from: K */
    private String m9014K(Locale locale, char c, boolean z, EnumC9004n enumC9004n) {
        return m9015J(locale, "reltime/relpattern", m9018G(c, z, enumC9004n), m9018G(c, z, EnumC9004n.OTHER), enumC9004n);
    }

    /* renamed from: L */
    private String m9013L(Locale locale, char c, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9015J(locale, "units/upattern", m9019F(c, enumC9016v, enumC9004n), m9019F(c, enumC9016v, EnumC9004n.OTHER), enumC9004n);
    }

    /* renamed from: M */
    private static String m9012M(String str, char c, int i) {
        int length = str.length() - 2;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '{') {
                int i3 = i2 + 1;
                if (str.charAt(i3) == c) {
                    int i4 = i2 + 2;
                    if (str.charAt(i4) == '}') {
                        StringBuilder sb2 = new StringBuilder(length + 10);
                        sb2.append(str);
                        sb2.replace(i3, i4, String.valueOf(i));
                        return sb2.toString();
                    }
                } else {
                    continue;
                }
            }
        }
        return str;
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: A */
    public String mo9024A(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, 'W', enumC9016v, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: B */
    public String mo9023B(EnumC10846x0 enumC10846x0, Locale locale) {
        return m9016I(locale, enumC10846x0.name().substring(0, 3).toLowerCase() + "+");
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: C */
    public String mo9022C(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'W', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: D */
    public String mo9021D(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, '9', enumC9016v, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: E */
    public String mo9020E(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'h', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: a */
    public String mo9011a(Locale locale) {
        return m9015J(locale, "reltime/relpattern", "yesterday", null, EnumC9004n.OTHER);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: b */
    public String mo9010b(Locale locale) {
        return m9015J(locale, "reltime/relpattern", "now", null, EnumC9004n.OTHER);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: c */
    public String mo9009c(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'Y', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: d */
    public String mo9008d(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, 'N', enumC9016v, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: e */
    public String mo9007e(Locale locale) {
        return m9015J(locale, "reltime/relpattern", "tomorrow", null, EnumC9004n.OTHER);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: f */
    public String mo9006f(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, '6', enumC9016v, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: g */
    public String mo9005g(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'H', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: h */
    public String mo9004h(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'n', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: i */
    public String mo9003i(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'y', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: j */
    public String mo9002j(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'w', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: k */
    public String mo9001k(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'S', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: l */
    public String mo9000l(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'd', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: m */
    public String mo8999m(EnumC10846x0 enumC10846x0, Locale locale) {
        return m9016I(locale, enumC10846x0.name().substring(0, 3).toLowerCase() + "-");
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: n */
    public String mo8998n(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'm', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: o */
    public String mo8997o(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, 'H', enumC9016v, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: p */
    public String mo8996p(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, 'D', enumC9016v, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: q */
    public String mo8995q(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 's', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: r */
    public String mo8994r(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'N', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: s */
    public String mo8993s(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'D', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: t */
    public String mo8992t(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, 'S', enumC9016v, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: u */
    public String mo8991u(Locale locale, EnumC9016v enumC9016v, int i) {
        String str;
        int i2;
        if (i >= 2) {
            C11180e m9040h = C11180e.m9040h("i18n/units/upattern", locale);
            String m9017H = m9017H(enumC9016v, String.valueOf(i));
            if (m9040h.m9046b(m9017H)) {
                return m9040h.m9042f(m9017H);
            }
            String m9042f = m9040h.m9042f(m9017H(enumC9016v, ViewProps.END));
            if (i == 2) {
                return m9042f;
            }
            String m9042f2 = m9040h.m9042f(m9017H(enumC9016v, ViewProps.START));
            String m9042f3 = m9040h.m9042f(m9017H(enumC9016v, "middle"));
            String m9012M = m9012M(m9012M(m9042f, '1', i - 1), '0', i - 2);
            String str2 = m9012M;
            for (int i3 = i - 3; i3 >= 0; i3--) {
                if (i3 == 0) {
                    str = m9042f2;
                } else {
                    str = m9042f3;
                }
                int length = str.length();
                int i4 = length - 1;
                while (true) {
                    if (i4 >= 0) {
                        if (i4 >= 2 && str.charAt(i4) == '}' && str.charAt(i4 - 1) == '1') {
                            i2 = i4 - 2;
                            if (str.charAt(i2) == '{') {
                                break;
                            }
                        }
                        i4--;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 > -1) {
                    m9012M = str.substring(0, i2) + str2;
                    if (i2 < length - 3) {
                        m9012M = m9012M + str.substring(i2 + 3);
                    }
                }
                if (i3 > 0) {
                    str2 = m9012M(m9012M, '0', i3);
                }
            }
            return m9012M;
        }
        throw new IllegalArgumentException("Size must be greater than 1.");
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: v */
    public String mo8990v(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, 'M', enumC9016v, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: w */
    public String mo8989w(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, '3', enumC9016v, enumC9004n);
    }

    @Override // p184jj.InterfaceC9012r
    /* renamed from: x */
    public String mo8988x(Locale locale) {
        return m9015J(locale, "reltime/relpattern", "today", null, EnumC9004n.OTHER);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: y */
    public String mo8987y(Locale locale, boolean z, EnumC9004n enumC9004n) {
        return m9014K(locale, 'M', z, enumC9004n);
    }

    @Override // p184jj.InterfaceC9028x
    /* renamed from: z */
    public String mo8986z(Locale locale, EnumC9016v enumC9016v, EnumC9004n enumC9004n) {
        return m9013L(locale, 'Y', enumC9016v, enumC9004n);
    }
}