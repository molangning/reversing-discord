package p028b8;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p195k8.C9149a;
import p195k8.C9197r;
import p195k8.C9198s;
import p195k8.C9208y;
import p383v7.AbstractC13131d;
import p383v7.C13127b;
import p383v7.InterfaceC13133f;

/* renamed from: b8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2142a extends AbstractC13131d {

    /* renamed from: q */
    private static final Pattern f6040q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    private static final Pattern f6041r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    private final StringBuilder f6042o;

    /* renamed from: p */
    private final ArrayList<String> f6043p;

    public C2142a() {
        super("SubripDecoder");
        this.f6042o = new StringBuilder();
        this.f6043p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: B */
    private C13127b m34128B(Spanned spanned, String str) {
        char c;
        char c2;
        C13127b.C13129b m3142n = new C13127b.C13129b().m3142n(spanned);
        if (str == null) {
            return m3142n.m3155a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1 && c != 2) {
            if (c != 3 && c != 4 && c != 5) {
                m3142n.m3145k(1);
            } else {
                m3142n.m3145k(2);
            }
        } else {
            m3142n.m3145k(0);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0 && c2 != 1 && c2 != 2) {
            if (c2 != 3 && c2 != 4 && c2 != 5) {
                m3142n.m3147i(1);
            } else {
                m3142n.m3147i(0);
            }
        } else {
            m3142n.m3147i(2);
        }
        return m3142n.m3146j(m34127C(m3142n.m3152d())).m3148h(m34127C(m3142n.m3153c()), 0).m3155a();
    }

    /* renamed from: C */
    static float m34127C(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    /* renamed from: D */
    private static long m34126D(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        long parseLong = j + (Long.parseLong((String) C9149a.m16448e(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) C9149a.m16448e(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* renamed from: E */
    private String m34125E(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f6041r.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i += length;
        }
        return sb2.toString();
    }

    @Override // p383v7.AbstractC13131d
    /* renamed from: z */
    protected InterfaceC13133f mo1161z(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        C9198s c9198s = new C9198s();
        C9208y c9208y = new C9208y(bArr, i);
        while (true) {
            String m16082p = c9208y.m16082p();
            int i2 = 0;
            if (m16082p == null) {
                break;
            } else if (m16082p.length() != 0) {
                try {
                    Integer.parseInt(m16082p);
                    String m16082p2 = c9208y.m16082p();
                    if (m16082p2 == null) {
                        C9197r.m16178h("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f6040q.matcher(m16082p2);
                    if (matcher.matches()) {
                        c9198s.m16176a(m34126D(matcher, 1));
                        c9198s.m16176a(m34126D(matcher, 6));
                        this.f6042o.setLength(0);
                        this.f6043p.clear();
                        for (String m16082p3 = c9208y.m16082p(); !TextUtils.isEmpty(m16082p3); m16082p3 = c9208y.m16082p()) {
                            if (this.f6042o.length() > 0) {
                                this.f6042o.append("<br>");
                            }
                            this.f6042o.append(m34125E(m16082p3, this.f6043p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f6042o.toString());
                        while (true) {
                            if (i2 < this.f6043p.size()) {
                                str = this.f6043p.get(i2);
                                if (str.matches("\\{\\\\an[1-9]\\}")) {
                                    break;
                                }
                                i2++;
                            } else {
                                str = null;
                                break;
                            }
                        }
                        arrayList.add(m34128B(fromHtml, str));
                        arrayList.add(C13127b.f34101q);
                    } else {
                        C9197r.m16178h("SubripDecoder", "Skipping invalid timing: " + m16082p2);
                    }
                } catch (NumberFormatException unused) {
                    C9197r.m16178h("SubripDecoder", "Skipping invalid index: " + m16082p);
                }
            }
        }
        return new C2143b((C13127b[]) arrayList.toArray(new C13127b[0]), c9198s.m16173d());
    }
}