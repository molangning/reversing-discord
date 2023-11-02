package com.facebook.hermes.intl;

import android.os.Build;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.hermes.intl.C3681j;
import com.facebook.hermes.intl.InterfaceC3662c;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p077e5.InterfaceC6107a;
import p128h4.C6890a;
import p128h4.C6925h;
import p128h4.C6935j;
import p128h4.C6947l;
import p128h4.InterfaceC6895b;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NumberFormat {

    /* renamed from: v */
    private static String[] f10059v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* renamed from: a */
    private InterfaceC3662c.EnumC3670h f10060a;

    /* renamed from: f */
    private InterfaceC3662c.EnumC3671i f10065f;

    /* renamed from: m */
    private InterfaceC3662c.EnumC3668f f10072m;

    /* renamed from: o */
    private InterfaceC3662c f10074o;

    /* renamed from: p */
    private boolean f10075p;

    /* renamed from: s */
    private InterfaceC3662c.EnumC3664b f10078s;

    /* renamed from: b */
    private String f10061b = null;

    /* renamed from: c */
    private InterfaceC3662c.EnumC3665c f10062c = InterfaceC3662c.EnumC3665c.SYMBOL;

    /* renamed from: d */
    private InterfaceC3662c.EnumC3666d f10063d = InterfaceC3662c.EnumC3666d.STANDARD;

    /* renamed from: e */
    private String f10064e = null;

    /* renamed from: g */
    private boolean f10066g = true;

    /* renamed from: h */
    private int f10067h = -1;

    /* renamed from: i */
    private int f10068i = -1;

    /* renamed from: j */
    private int f10069j = -1;

    /* renamed from: k */
    private int f10070k = -1;

    /* renamed from: l */
    private int f10071l = -1;

    /* renamed from: n */
    private InterfaceC3662c.EnumC3669g f10073n = InterfaceC3662c.EnumC3669g.AUTO;

    /* renamed from: q */
    private String f10076q = null;

    /* renamed from: r */
    private InterfaceC3662c.EnumC3667e f10077r = null;

    /* renamed from: t */
    private InterfaceC6895b<?> f10079t = null;

    /* renamed from: u */
    private InterfaceC6895b<?> f10080u = null;

    @InterfaceC6107a
    public NumberFormat(List<String> list, Map<String, Object> map) {
        String str;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f10074o = new C3695q();
        } else {
            this.f10074o = new C3693p();
        }
        m31328a(list, map);
        InterfaceC3662c interfaceC3662c = this.f10074o;
        InterfaceC6895b<?> interfaceC6895b = this.f10079t;
        if (this.f10075p) {
            str = "";
        } else {
            str = this.f10076q;
        }
        interfaceC3662c.mo31216l(interfaceC6895b, str, this.f10060a, this.f10063d, this.f10077r, this.f10078s).mo31224d(this.f10061b, this.f10062c).mo31221g(this.f10066g).mo31222f(this.f10067h).mo31223e(this.f10072m, this.f10070k, this.f10071l).mo31220h(this.f10072m, this.f10068i, this.f10069j).mo31218j(this.f10073n).mo31219i(this.f10064e, this.f10065f);
    }

    /* renamed from: a */
    private void m31328a(List<String> list, Map<String, Object> map) {
        Object m21629p;
        Object m21629p2;
        int m31236n;
        Object m21628q = C6935j.m21628q();
        C3681j.EnumC3682a enumC3682a = C3681j.EnumC3682a.STRING;
        C6935j.m21642c(m21628q, "localeMatcher", C3681j.m31257c(map, "localeMatcher", enumC3682a, C6890a.f19179a, "best fit"));
        Object m31257c = C3681j.m31257c(map, "numberingSystem", enumC3682a, C6935j.m21641d(), C6935j.m21641d());
        if (!C6935j.m21631n(m31257c) && !m31327b(C6935j.m21637h(m31257c))) {
            throw new C6947l("Invalid numbering system !");
        }
        C6935j.m21642c(m21628q, "nu", m31257c);
        HashMap<String, Object> m31260a = C3680i.m31260a(list, m21628q, Collections.singletonList("nu"));
        InterfaceC6895b<?> interfaceC6895b = (InterfaceC6895b) C6935j.m21638g(m31260a).get("locale");
        this.f10079t = interfaceC6895b;
        this.f10080u = interfaceC6895b.mo21548d();
        Object m21644a = C6935j.m21644a(m31260a, "nu");
        if (!C6935j.m21635j(m21644a)) {
            this.f10075p = false;
            this.f10076q = C6935j.m21637h(m21644a);
        } else {
            this.f10075p = true;
            this.f10076q = this.f10074o.mo31225c(this.f10079t);
        }
        m31321h(map);
        if (this.f10060a == InterfaceC3662c.EnumC3670h.CURRENCY) {
            if (Build.VERSION.SDK_INT >= 24) {
                m31236n = C3695q.m31214n(this.f10061b);
            } else {
                m31236n = C3693p.m31236n(this.f10061b);
            }
            double d = m31236n;
            m21629p = C6935j.m21629p(d);
            m21629p2 = C6935j.m21629p(d);
        } else {
            m21629p = C6935j.m21629p(0.0d);
            if (this.f10060a == InterfaceC3662c.EnumC3670h.PERCENT) {
                m21629p2 = C6935j.m21629p(0.0d);
            } else {
                m21629p2 = C6935j.m21629p(3.0d);
            }
        }
        this.f10077r = (InterfaceC3662c.EnumC3667e) C3681j.m31256d(InterfaceC3662c.EnumC3667e.class, C6935j.m21637h(C3681j.m31257c(map, "notation", enumC3682a, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        m31322g(map, m21629p, m21629p2);
        Object m31257c2 = C3681j.m31257c(map, "compactDisplay", enumC3682a, new String[]{"short", "long"}, "short");
        if (this.f10077r == InterfaceC3662c.EnumC3667e.COMPACT) {
            this.f10078s = (InterfaceC3662c.EnumC3664b) C3681j.m31256d(InterfaceC3662c.EnumC3664b.class, C6935j.m21637h(m31257c2));
        }
        this.f10066g = C6935j.m21640e(C3681j.m31257c(map, "useGrouping", C3681j.EnumC3682a.BOOLEAN, C6935j.m21641d(), C6935j.m21630o(true)));
        this.f10073n = (InterfaceC3662c.EnumC3669g) C3681j.m31256d(InterfaceC3662c.EnumC3669g.class, C6935j.m21637h(C3681j.m31257c(map, "signDisplay", enumC3682a, new String[]{"auto", ReactScrollViewHelper.OVER_SCROLL_NEVER, ReactScrollViewHelper.OVER_SCROLL_ALWAYS, "exceptZero"}, "auto")));
    }

    /* renamed from: b */
    private boolean m31327b(String str) {
        return C6925h.m21657o(str, 0, str.length() - 1);
    }

    /* renamed from: c */
    private boolean m31326c(String str) {
        return Arrays.binarySearch(f10059v, str) >= 0;
    }

    /* renamed from: d */
    private boolean m31325d(String str) {
        return m31323f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    /* renamed from: e */
    private boolean m31324e(String str) {
        if (m31326c(str)) {
            return true;
        }
        int indexOf = str.indexOf("-per-");
        if (indexOf >= 0 && str.indexOf("-per-", indexOf + 1) < 0 && m31326c(str.substring(0, indexOf)) && m31326c(str.substring(indexOf + 5))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private String m31323f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                sb2.append((char) (charAt - ' '));
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    /* renamed from: g */
    private void m31322g(Map<String, Object> map, Object obj, Object obj2) {
        Object m31258b = C3681j.m31258b(map, "minimumIntegerDigits", C6935j.m21629p(1.0d), C6935j.m21629p(21.0d), C6935j.m21629p(1.0d));
        Object m21644a = C6935j.m21644a(map, "minimumFractionDigits");
        Object m21644a2 = C6935j.m21644a(map, "maximumFractionDigits");
        Object m21644a3 = C6935j.m21644a(map, "minimumSignificantDigits");
        Object m21644a4 = C6935j.m21644a(map, "maximumSignificantDigits");
        this.f10067h = (int) Math.floor(C6935j.m21639f(m31258b));
        if (C6935j.m21631n(m21644a3) && C6935j.m21631n(m21644a4)) {
            if (C6935j.m21631n(m21644a) && C6935j.m21631n(m21644a2)) {
                InterfaceC3662c.EnumC3667e enumC3667e = this.f10077r;
                if (enumC3667e == InterfaceC3662c.EnumC3667e.COMPACT) {
                    this.f10072m = InterfaceC3662c.EnumC3668f.COMPACT_ROUNDING;
                    return;
                } else if (enumC3667e == InterfaceC3662c.EnumC3667e.ENGINEERING) {
                    this.f10072m = InterfaceC3662c.EnumC3668f.FRACTION_DIGITS;
                    this.f10069j = 5;
                    return;
                } else {
                    this.f10072m = InterfaceC3662c.EnumC3668f.FRACTION_DIGITS;
                    this.f10068i = (int) Math.floor(C6935j.m21639f(obj));
                    this.f10069j = (int) Math.floor(C6935j.m21639f(obj2));
                    return;
                }
            }
            this.f10072m = InterfaceC3662c.EnumC3668f.FRACTION_DIGITS;
            Object m31259a = C3681j.m31259a(m21644a, C6935j.m21629p(0.0d), C6935j.m21629p(20.0d), obj);
            Object m31259a2 = C3681j.m31259a(m21644a2, m31259a, C6935j.m21629p(20.0d), C6935j.m21629p(Math.max(C6935j.m21639f(m31259a), C6935j.m21639f(obj2))));
            this.f10068i = (int) Math.floor(C6935j.m21639f(m31259a));
            this.f10069j = (int) Math.floor(C6935j.m21639f(m31259a2));
            return;
        }
        this.f10072m = InterfaceC3662c.EnumC3668f.SIGNIFICANT_DIGITS;
        Object m31259a3 = C3681j.m31259a(m21644a3, C6935j.m21629p(1.0d), C6935j.m21629p(21.0d), C6935j.m21629p(1.0d));
        Object m31259a4 = C3681j.m31259a(m21644a4, m31259a3, C6935j.m21629p(21.0d), C6935j.m21629p(21.0d));
        this.f10070k = (int) Math.floor(C6935j.m21639f(m31259a3));
        this.f10071l = (int) Math.floor(C6935j.m21639f(m31259a4));
    }

    /* renamed from: h */
    private void m31321h(Map<String, Object> map) {
        C3681j.EnumC3682a enumC3682a = C3681j.EnumC3682a.STRING;
        this.f10060a = (InterfaceC3662c.EnumC3670h) C3681j.m31256d(InterfaceC3662c.EnumC3670h.class, C6935j.m21637h(C3681j.m31257c(map, "style", enumC3682a, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object m31257c = C3681j.m31257c(map, "currency", enumC3682a, C6935j.m21641d(), C6935j.m21641d());
        if (C6935j.m21631n(m31257c)) {
            if (this.f10060a == InterfaceC3662c.EnumC3670h.CURRENCY) {
                throw new C6947l("Expected currency style !");
            }
        } else if (!m31325d(C6935j.m21637h(m31257c))) {
            throw new C6947l("Malformed currency code !");
        }
        Object m31257c2 = C3681j.m31257c(map, "currencyDisplay", enumC3682a, new String[]{"symbol", "narrowSymbol", "code", ZeroconfModule.KEY_SERVICE_NAME}, "symbol");
        Object m31257c3 = C3681j.m31257c(map, "currencySign", enumC3682a, new String[]{"accounting", "standard"}, "standard");
        Object m31257c4 = C3681j.m31257c(map, "unit", enumC3682a, C6935j.m21641d(), C6935j.m21641d());
        if (C6935j.m21631n(m31257c4)) {
            if (this.f10060a == InterfaceC3662c.EnumC3670h.UNIT) {
                throw new C6947l("Expected unit !");
            }
        } else if (!m31324e(C6935j.m21637h(m31257c4))) {
            throw new C6947l("Malformed unit identifier !");
        }
        Object m31257c5 = C3681j.m31257c(map, "unitDisplay", enumC3682a, new String[]{"long", "short", "narrow"}, "short");
        InterfaceC3662c.EnumC3670h enumC3670h = this.f10060a;
        if (enumC3670h == InterfaceC3662c.EnumC3670h.CURRENCY) {
            this.f10061b = m31323f(C6935j.m21637h(m31257c));
            this.f10062c = (InterfaceC3662c.EnumC3665c) C3681j.m31256d(InterfaceC3662c.EnumC3665c.class, C6935j.m21637h(m31257c2));
            this.f10063d = (InterfaceC3662c.EnumC3666d) C3681j.m31256d(InterfaceC3662c.EnumC3666d.class, C6935j.m21637h(m31257c3));
        } else if (enumC3670h == InterfaceC3662c.EnumC3670h.UNIT) {
            this.f10064e = C6935j.m21637h(m31257c4);
            this.f10065f = (InterfaceC3662c.EnumC3671i) C3681j.m31256d(InterfaceC3662c.EnumC3671i.class, C6935j.m21637h(m31257c5));
        }
    }

    @InterfaceC6107a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String m21637h = C6935j.m21637h(C3681j.m31257c(map, "localeMatcher", C3681j.EnumC3682a.STRING, C6890a.f19179a, "best fit"));
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24 && m21637h.equals("best fit")) {
            return Arrays.asList(C3677g.m31272d((String[]) list.toArray(strArr)));
        }
        return Arrays.asList(C3677g.m31268h((String[]) list.toArray(strArr)));
    }

    @InterfaceC6107a
    public String format(double d) {
        return this.f10074o.mo31226b(d);
    }

    @InterfaceC6107a
    public List<Map<String, String>> formatToParts(double d) {
        String str;
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator mo31227a = this.f10074o.mo31227a(d);
        StringBuilder sb2 = new StringBuilder();
        for (char first = mo31227a.first(); first != 65535; first = mo31227a.next()) {
            sb2.append(first);
            if (mo31227a.getIndex() + 1 == mo31227a.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = mo31227a.getAttributes().keySet().iterator();
                if (it.hasNext()) {
                    str = this.f10074o.mo31217k(it.next(), d);
                } else {
                    str = "literal";
                }
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", str);
                hashMap.put("value", sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @InterfaceC6107a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f10080u.mo21545g());
        linkedHashMap.put("numberingSystem", this.f10076q);
        linkedHashMap.put("style", this.f10060a.toString());
        InterfaceC3662c.EnumC3670h enumC3670h = this.f10060a;
        if (enumC3670h == InterfaceC3662c.EnumC3670h.CURRENCY) {
            linkedHashMap.put("currency", this.f10061b);
            linkedHashMap.put("currencyDisplay", this.f10062c.toString());
            linkedHashMap.put("currencySign", this.f10063d.toString());
        } else if (enumC3670h == InterfaceC3662c.EnumC3670h.UNIT) {
            linkedHashMap.put("unit", this.f10064e);
            linkedHashMap.put("unitDisplay", this.f10065f.toString());
        }
        int i = this.f10067h;
        if (i != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i));
        }
        InterfaceC3662c.EnumC3668f enumC3668f = this.f10072m;
        if (enumC3668f == InterfaceC3662c.EnumC3668f.SIGNIFICANT_DIGITS) {
            int i2 = this.f10071l;
            if (i2 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i2));
            }
            int i3 = this.f10070k;
            if (i3 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i3));
            }
        } else if (enumC3668f == InterfaceC3662c.EnumC3668f.FRACTION_DIGITS) {
            int i4 = this.f10068i;
            if (i4 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i4));
            }
            int i5 = this.f10069j;
            if (i5 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i5));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f10066g));
        linkedHashMap.put("notation", this.f10077r.toString());
        if (this.f10077r == InterfaceC3662c.EnumC3667e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f10078s.toString());
        }
        linkedHashMap.put("signDisplay", this.f10073n.toString());
        return linkedHashMap;
    }
}