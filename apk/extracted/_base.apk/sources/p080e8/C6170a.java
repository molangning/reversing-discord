package p080e8;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p195k8.C9149a;
import p195k8.C9159e;
import p195k8.C9191p0;
import p195k8.C9208y;

/* renamed from: e8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C6170a {

    /* renamed from: c */
    private static final Pattern f17448c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a */
    private final C9208y f17449a = new C9208y();

    /* renamed from: b */
    private final StringBuilder f17450b = new StringBuilder();

    /* renamed from: a */
    private void m23408a(C6173d c6173d, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f17448c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c6173d.m23371x((String) C9149a.m16448e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] m16286N0 = C9191p0.m16286N0(str, "\\.");
        String str2 = m16286N0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c6173d.m23372w(str2.substring(0, indexOf2));
            c6173d.m23373v(str2.substring(indexOf2 + 1));
        } else {
            c6173d.m23372w(str2);
        }
        if (m16286N0.length > 1) {
            c6173d.m23374u((String[]) C9191p0.m16308C0(m16286N0, 1, m16286N0.length));
        }
    }

    /* renamed from: b */
    private static boolean m23407b(C9208y c9208y) {
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        byte[] m16094d = c9208y.m16094d();
        if (m16093e + 2 <= m16092f) {
            int i = m16093e + 1;
            if (m16094d[m16093e] == 47) {
                int i2 = i + 1;
                if (m16094d[i] != 42) {
                    return false;
                }
                while (true) {
                    int i3 = i2 + 1;
                    if (i3 < m16092f) {
                        if (((char) m16094d[i2]) == '*' && ((char) m16094d[i3]) == '/') {
                            i2 = i3 + 1;
                            m16092f = i2;
                        } else {
                            i2 = i3;
                        }
                    } else {
                        c9208y.m16098Q(m16092f - c9208y.m16093e());
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m23406c(C9208y c9208y) {
        char m23399j = m23399j(c9208y, c9208y.m16093e());
        if (m23399j != '\t' && m23399j != '\n' && m23399j != '\f' && m23399j != '\r' && m23399j != ' ') {
            return false;
        }
        c9208y.m16098Q(1);
        return true;
    }

    /* renamed from: e */
    private static String m23404e(C9208y c9208y, StringBuilder sb2) {
        boolean z = false;
        sb2.setLength(0);
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        while (m16093e < m16092f && !z) {
            char c = (char) c9208y.m16094d()[m16093e];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && ((c < '0' || c > '9') && c != '#' && c != '-' && c != '.' && c != '_'))) {
                z = true;
            } else {
                m16093e++;
                sb2.append(c);
            }
        }
        c9208y.m16098Q(m16093e - c9208y.m16093e());
        return sb2.toString();
    }

    /* renamed from: f */
    static String m23403f(C9208y c9208y, StringBuilder sb2) {
        m23396m(c9208y);
        if (c9208y.m16097a() == 0) {
            return null;
        }
        String m23404e = m23404e(c9208y, sb2);
        if (!"".equals(m23404e)) {
            return m23404e;
        }
        return "" + ((char) c9208y.m16111D());
    }

    /* renamed from: g */
    private static String m23402g(C9208y c9208y, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int m16093e = c9208y.m16093e();
            String m23403f = m23403f(c9208y, sb2);
            if (m23403f == null) {
                return null;
            }
            if (!"}".equals(m23403f) && !";".equals(m23403f)) {
                sb3.append(m23403f);
            } else {
                c9208y.m16099P(m16093e);
                z = true;
            }
        }
        return sb3.toString();
    }

    /* renamed from: h */
    private static String m23401h(C9208y c9208y, StringBuilder sb2) {
        String str;
        m23396m(c9208y);
        if (c9208y.m16097a() < 5 || !"::cue".equals(c9208y.m16114A(5))) {
            return null;
        }
        int m16093e = c9208y.m16093e();
        String m23403f = m23403f(c9208y, sb2);
        if (m23403f == null) {
            return null;
        }
        if ("{".equals(m23403f)) {
            c9208y.m16099P(m16093e);
            return "";
        }
        if ("(".equals(m23403f)) {
            str = m23398k(c9208y);
        } else {
            str = null;
        }
        if (!")".equals(m23403f(c9208y, sb2))) {
            return null;
        }
        return str;
    }

    /* renamed from: i */
    private static void m23400i(C9208y c9208y, C6173d c6173d, StringBuilder sb2) {
        m23396m(c9208y);
        String m23404e = m23404e(c9208y, sb2);
        if ("".equals(m23404e) || !":".equals(m23403f(c9208y, sb2))) {
            return;
        }
        m23396m(c9208y);
        String m23402g = m23402g(c9208y, sb2);
        if (m23402g != null && !"".equals(m23402g)) {
            int m16093e = c9208y.m16093e();
            String m23403f = m23403f(c9208y, sb2);
            if (!";".equals(m23403f)) {
                if ("}".equals(m23403f)) {
                    c9208y.m16099P(m16093e);
                } else {
                    return;
                }
            }
            if (ViewProps.COLOR.equals(m23404e)) {
                c6173d.m23378q(C9159e.m16421b(m23402g));
            } else if ("background-color".equals(m23404e)) {
                c6173d.m23381n(C9159e.m16421b(m23402g));
            } else {
                boolean z = true;
                if ("ruby-position".equals(m23404e)) {
                    if ("over".equals(m23402g)) {
                        c6173d.m23375t(1);
                    } else if ("under".equals(m23402g)) {
                        c6173d.m23375t(2);
                    }
                } else if ("text-combine-upright".equals(m23404e)) {
                    if (!"all".equals(m23402g) && !m23402g.startsWith("digits")) {
                        z = false;
                    }
                    c6173d.m23379p(z);
                } else if ("text-decoration".equals(m23404e)) {
                    if ("underline".equals(m23402g)) {
                        c6173d.m23370y(true);
                    }
                } else if ("font-family".equals(m23404e)) {
                    c6173d.m23377r(m23402g);
                } else if ("font-weight".equals(m23404e)) {
                    if ("bold".equals(m23402g)) {
                        c6173d.m23380o(true);
                    }
                } else if ("font-style".equals(m23404e) && "italic".equals(m23402g)) {
                    c6173d.m23376s(true);
                }
            }
        }
    }

    /* renamed from: j */
    private static char m23399j(C9208y c9208y, int i) {
        return (char) c9208y.m16094d()[i];
    }

    /* renamed from: k */
    private static String m23398k(C9208y c9208y) {
        int m16093e = c9208y.m16093e();
        int m16092f = c9208y.m16092f();
        boolean z = false;
        while (m16093e < m16092f && !z) {
            int i = m16093e + 1;
            if (((char) c9208y.m16094d()[m16093e]) == ')') {
                z = true;
            } else {
                z = false;
            }
            m16093e = i;
        }
        return c9208y.m16114A((m16093e - 1) - c9208y.m16093e()).trim();
    }

    /* renamed from: l */
    static void m23397l(C9208y c9208y) {
        do {
        } while (!TextUtils.isEmpty(c9208y.m16082p()));
    }

    /* renamed from: m */
    static void m23396m(C9208y c9208y) {
        while (true) {
            for (boolean z = true; c9208y.m16097a() > 0 && z; z = false) {
                if (!m23406c(c9208y) && !m23407b(c9208y)) {
                }
            }
            return;
        }
    }

    /* renamed from: d */
    public List<C6173d> m23405d(C9208y c9208y) {
        boolean z;
        this.f17450b.setLength(0);
        int m16093e = c9208y.m16093e();
        m23397l(c9208y);
        this.f17449a.m16101N(c9208y.m16094d(), c9208y.m16093e());
        this.f17449a.m16099P(m16093e);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String m23401h = m23401h(this.f17449a, this.f17450b);
            if (m23401h != null) {
                if (!"{".equals(m23403f(this.f17449a, this.f17450b))) {
                    return arrayList;
                }
                C6173d c6173d = new C6173d();
                m23408a(c6173d, m23401h);
                String str = null;
                boolean z2 = false;
                while (!z2) {
                    int m16093e2 = this.f17449a.m16093e();
                    String m23403f = m23403f(this.f17449a, this.f17450b);
                    if (m23403f != null && !"}".equals(m23403f)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        this.f17449a.m16099P(m16093e2);
                        m23400i(this.f17449a, c6173d, this.f17450b);
                    }
                    str = m23403f;
                    z2 = z;
                }
                if ("}".equals(str)) {
                    arrayList.add(c6173d);
                }
            } else {
                return arrayList;
            }
        }
    }
}
