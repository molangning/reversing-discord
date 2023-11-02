package io.sentry.android.core.internal.threaddump;

import io.sentry.C8032n4;
import io.sentry.C8132r4;
import io.sentry.C8166t4;
import io.sentry.EnumC8021m4;
import io.sentry.protocol.C8108u;
import io.sentry.protocol.C8110v;
import io.sentry.protocol.C8112w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: io.sentry.android.core.internal.threaddump.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7757c {

    /* renamed from: d */
    private static final Pattern f21240d = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: e */
    private static final Pattern f21241e = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: f */
    private static final Pattern f21242f = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");

    /* renamed from: g */
    private static final Pattern f21243g = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");

    /* renamed from: h */
    private static final Pattern f21244h = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* renamed from: i */
    private static final Pattern f21245i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* renamed from: j */
    private static final Pattern f21246j = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: k */
    private static final Pattern f21247k = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: l */
    private static final Pattern f21248l = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: m */
    private static final Pattern f21249m = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: n */
    private static final Pattern f21250n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: o */
    private static final Pattern f21251o = Pattern.compile(" *- waiting to lock an unknown object");

    /* renamed from: p */
    private static final Pattern f21252p = Pattern.compile("\\s+");

    /* renamed from: a */
    private final C8132r4 f21253a;

    /* renamed from: b */
    private final boolean f21254b;

    /* renamed from: c */
    private final C8166t4 f21255c;

    public C7757c(C8132r4 c8132r4, boolean z) {
        this.f21253a = c8132r4;
        this.f21254b = z;
        this.f21255c = new C8166t4(c8132r4);
    }

    /* renamed from: a */
    private void m19787a(C8112w c8112w, C8032n4 c8032n4) {
        Map<String, C8032n4> m18512k = c8112w.m18512k();
        if (m18512k == null) {
            m18512k = new HashMap<>();
        }
        C8032n4 c8032n42 = m18512k.get(c8032n4.m18937f());
        if (c8032n42 != null) {
            c8032n42.m18931l(Math.max(c8032n42.m18936g(), c8032n4.m18936g()));
        } else {
            m18512k.put(c8032n4.m18937f(), new C8032n4(c8032n4));
        }
        c8112w.m18503t(m18512k);
    }

    /* renamed from: b */
    private Integer m19786b(Matcher matcher, int i, Integer num) {
        String group = matcher.group(i);
        if (group != null && group.length() != 0) {
            return Integer.valueOf(Integer.parseInt(group));
        }
        return num;
    }

    /* renamed from: c */
    private Long m19785c(Matcher matcher, int i, Long l) {
        String group = matcher.group(i);
        if (group != null && group.length() != 0) {
            return Long.valueOf(Long.parseLong(group));
        }
        return l;
    }

    /* renamed from: d */
    private Integer m19784d(Matcher matcher, int i, Integer num) {
        String group = matcher.group(i);
        if (group != null && group.length() != 0) {
            Integer valueOf = Integer.valueOf(Integer.parseInt(group));
            if (valueOf.intValue() >= 0) {
                return valueOf;
            }
            return num;
        }
        return num;
    }

    /* renamed from: e */
    private boolean m19783e(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* renamed from: g */
    private C8110v m19781g(C7756b c7756b, C8112w c8112w) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f21242f.matcher("");
        Matcher matcher3 = f21243g.matcher("");
        Matcher matcher4 = f21244h.matcher("");
        Matcher matcher5 = f21245i.matcher("");
        Matcher matcher6 = f21246j.matcher("");
        Matcher matcher7 = f21248l.matcher("");
        Matcher matcher8 = f21247k.matcher("");
        Matcher matcher9 = f21250n.matcher("");
        Matcher matcher10 = f21249m.matcher("");
        Matcher matcher11 = f21251o.matcher("");
        Matcher matcher12 = f21252p.matcher("");
        C8108u c8108u = null;
        while (true) {
            if (!c7756b.m19791a()) {
                break;
            }
            C7755a m19790b = c7756b.m19790b();
            Matcher matcher13 = matcher12;
            if (m19790b == null) {
                this.f21253a.getLogger().mo18135c(EnumC8021m4.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = m19790b.f21235b;
            if (m19783e(matcher2, str)) {
                C8108u c8108u2 = new C8108u();
                c8108u2.m18533y(matcher2.group(1));
                c8108u2.m18539s(matcher2.group(2));
                c8108u2.m18537u(m19786b(matcher2, 3, null));
                arrayList.add(c8108u2);
            } else if (m19783e(matcher3, str)) {
                C8108u c8108u3 = new C8108u();
                c8108u3.m18533y(matcher3.group(1));
                c8108u3.m18539s(matcher3.group(2));
                arrayList.add(c8108u3);
            } else {
                matcher = matcher2;
                if (m19783e(matcher4, str)) {
                    c8108u = new C8108u();
                    String format = String.format("%s.%s", matcher4.group(1), matcher4.group(2));
                    c8108u.m18535w(format);
                    c8108u.m18539s(matcher4.group(3));
                    c8108u.m18540r(matcher4.group(4));
                    c8108u.m18537u(m19784d(matcher4, 5, null));
                    c8108u.m18538t(this.f21255c.m18351b(format));
                    arrayList.add(c8108u);
                } else if (m19783e(matcher5, str)) {
                    c8108u = new C8108u();
                    String format2 = String.format("%s.%s", matcher5.group(1), matcher5.group(2));
                    c8108u.m18535w(format2);
                    c8108u.m18539s(matcher5.group(3));
                    c8108u.m18538t(this.f21255c.m18351b(format2));
                    arrayList.add(c8108u);
                } else if (m19783e(matcher6, str)) {
                    if (c8108u != null) {
                        C8032n4 c8032n4 = new C8032n4();
                        c8032n4.m18931l(1);
                        c8032n4.m18935h(matcher6.group(1));
                        c8032n4.m18933j(matcher6.group(2));
                        c8032n4.m18934i(matcher6.group(3));
                        c8108u.m18536v(c8032n4);
                        m19787a(c8112w, c8032n4);
                    }
                } else if (m19783e(matcher7, str)) {
                    if (c8108u != null) {
                        C8032n4 c8032n42 = new C8032n4();
                        c8032n42.m18931l(2);
                        c8032n42.m18935h(matcher7.group(1));
                        c8032n42.m18933j(matcher7.group(2));
                        c8032n42.m18934i(matcher7.group(3));
                        c8108u.m18536v(c8032n42);
                        m19787a(c8112w, c8032n42);
                    }
                } else if (m19783e(matcher8, str)) {
                    if (c8108u != null) {
                        C8032n4 c8032n43 = new C8032n4();
                        c8032n43.m18931l(4);
                        c8032n43.m18935h(matcher8.group(1));
                        c8032n43.m18933j(matcher8.group(2));
                        c8032n43.m18934i(matcher8.group(3));
                        c8108u.m18536v(c8032n43);
                        m19787a(c8112w, c8032n43);
                    }
                } else {
                    if (m19783e(matcher9, str)) {
                        if (c8108u != null) {
                            C8032n4 c8032n44 = new C8032n4();
                            c8032n44.m18931l(8);
                            c8032n44.m18935h(matcher9.group(1));
                            c8032n44.m18933j(matcher9.group(2));
                            c8032n44.m18934i(matcher9.group(3));
                            c8032n44.m18932k(m19785c(matcher9, 4, null));
                            c8108u.m18536v(c8032n44);
                            m19787a(c8112w, c8032n44);
                        }
                    } else if (m19783e(matcher10, str)) {
                        if (c8108u != null) {
                            C8032n4 c8032n45 = new C8032n4();
                            c8032n45.m18931l(8);
                            c8032n45.m18935h(matcher10.group(1));
                            c8032n45.m18933j(matcher10.group(2));
                            c8032n45.m18934i(matcher10.group(3));
                            c8108u.m18536v(c8032n45);
                            m19787a(c8112w, c8032n45);
                        }
                    } else if (m19783e(matcher11, str)) {
                        if (c8108u != null) {
                            C8032n4 c8032n46 = new C8032n4();
                            c8032n46.m18931l(8);
                            c8108u.m18536v(c8032n46);
                            m19787a(c8112w, c8032n46);
                        }
                    } else if (str.length() == 0) {
                        break;
                    } else {
                        matcher12 = matcher13;
                        if (m19783e(matcher12, str)) {
                            break;
                        }
                        matcher2 = matcher;
                    }
                    matcher12 = matcher13;
                    matcher2 = matcher;
                }
                matcher12 = matcher13;
                matcher2 = matcher;
            }
            matcher = matcher2;
            matcher12 = matcher13;
            c8108u = null;
            matcher2 = matcher;
        }
        Collections.reverse(arrayList);
        C8110v c8110v = new C8110v(arrayList);
        c8110v.m18526e(Boolean.TRUE);
        return c8110v;
    }

    /* renamed from: h */
    private C8112w m19780h(C7756b c7756b) {
        C8112w c8112w = new C8112w();
        Matcher matcher = f21240d.matcher("");
        Matcher matcher2 = f21241e.matcher("");
        if (!c7756b.m19791a()) {
            return null;
        }
        C7755a m19790b = c7756b.m19790b();
        boolean z = false;
        if (m19790b == null) {
            this.f21253a.getLogger().mo18135c(EnumC8021m4.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (m19783e(matcher, m19790b.f21235b)) {
            Long m19785c = m19785c(matcher, 4, null);
            if (m19785c == null) {
                this.f21253a.getLogger().mo18135c(EnumC8021m4.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            c8112w.m18502u(m19785c);
            c8112w.m18500w(matcher.group(1));
            String group = matcher.group(5);
            if (group != null) {
                if (group.contains(" ")) {
                    c8112w.m18497z(group.substring(0, group.indexOf(32)));
                } else {
                    c8112w.m18497z(group);
                }
            }
        } else if (m19783e(matcher2, m19790b.f21235b)) {
            Long m19785c2 = m19785c(matcher2, 3, null);
            if (m19785c2 == null) {
                this.f21253a.getLogger().mo18135c(EnumC8021m4.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            c8112w.m18502u(m19785c2);
            c8112w.m18500w(matcher2.group(1));
        }
        String m18510m = c8112w.m18510m();
        if (m18510m != null) {
            boolean equals = m18510m.equals("main");
            c8112w.m18501v(Boolean.valueOf(equals));
            c8112w.m18506q(Boolean.valueOf(equals));
            if (equals && !this.f21254b) {
                z = true;
            }
            c8112w.m18505r(Boolean.valueOf(z));
        }
        c8112w.m18498y(m19781g(c7756b, c8112w));
        return c8112w;
    }

    /* renamed from: f */
    public List<C8112w> m19782f(C7756b c7756b) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f21240d.matcher("");
        Matcher matcher2 = f21241e.matcher("");
        while (c7756b.m19791a()) {
            C7755a m19790b = c7756b.m19790b();
            if (m19790b == null) {
                this.f21253a.getLogger().mo18135c(EnumC8021m4.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList;
            }
            String str = m19790b.f21235b;
            if (m19783e(matcher, str) || m19783e(matcher2, str)) {
                c7756b.m19788d();
                C8112w m19780h = m19780h(c7756b);
                if (m19780h != null) {
                    arrayList.add(m19780h);
                }
            }
        }
        return arrayList;
    }
}
