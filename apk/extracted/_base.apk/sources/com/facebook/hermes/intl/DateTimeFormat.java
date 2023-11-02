package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.C3681j;
import com.facebook.hermes.intl.InterfaceC3649b;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p077e5.InterfaceC6107a;
import p128h4.C6890a;
import p128h4.C6925h;
import p128h4.C6935j;
import p128h4.C6947l;
import p128h4.InterfaceC6895b;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DateTimeFormat {

    /* renamed from: a */
    InterfaceC3649b f10040a;

    /* renamed from: d */
    private boolean f10043d;

    /* renamed from: e */
    private String f10044e;

    /* renamed from: f */
    private boolean f10045f;

    /* renamed from: g */
    private String f10046g;

    /* renamed from: h */
    private InterfaceC3649b.EnumC3655f f10047h;

    /* renamed from: i */
    private InterfaceC3649b.EnumC3653d f10048i;

    /* renamed from: j */
    private InterfaceC3649b.EnumC3660k f10049j;

    /* renamed from: k */
    private InterfaceC3649b.EnumC3652c f10050k;

    /* renamed from: l */
    private InterfaceC3649b.EnumC3661l f10051l;

    /* renamed from: m */
    private InterfaceC3649b.EnumC3657h f10052m;

    /* renamed from: n */
    private InterfaceC3649b.EnumC3651b f10053n;

    /* renamed from: o */
    private InterfaceC3649b.EnumC3654e f10054o;

    /* renamed from: p */
    private InterfaceC3649b.EnumC3656g f10055p;

    /* renamed from: q */
    private InterfaceC3649b.EnumC3658i f10056q;

    /* renamed from: r */
    private InterfaceC3649b.EnumC3659j f10057r;

    /* renamed from: b */
    private InterfaceC6895b<?> f10041b = null;

    /* renamed from: c */
    private InterfaceC6895b<?> f10042c = null;

    /* renamed from: s */
    private Object f10058s = null;

    @InterfaceC6107a
    public DateTimeFormat(List<String> list, Map<String, Object> map) {
        String str;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f10040a = new C3691o();
        } else {
            this.f10040a = new C3689n();
        }
        m31333c(list, map);
        InterfaceC3649b interfaceC3649b = this.f10040a;
        InterfaceC6895b<?> interfaceC6895b = this.f10041b;
        if (this.f10043d) {
            str = "";
        } else {
            str = this.f10044e;
        }
        interfaceC3649b.mo31242f(interfaceC6895b, str, this.f10045f ? "" : this.f10046g, this.f10048i, this.f10049j, this.f10050k, this.f10051l, this.f10052m, this.f10053n, this.f10054o, this.f10055p, this.f10056q, this.f10057r, this.f10047h, this.f10058s);
    }

    /* renamed from: a */
    private Object m31335a() {
        return this.f10040a.mo31240h(this.f10041b);
    }

    /* renamed from: b */
    private Object m31334b(Object obj, String str, String str2) {
        if (C6935j.m21633l(obj)) {
            boolean z = true;
            if (str.equals("date") || str.equals("any")) {
                String[] strArr = {"weekday", "year", "month", "day"};
                for (int i = 0; i < 4; i++) {
                    if (!C6935j.m21631n(C6935j.m21644a(obj, strArr[i]))) {
                        z = false;
                    }
                }
            }
            if (str.equals("time") || str.equals("any")) {
                String[] strArr2 = {"hour", "minute", "second"};
                for (int i2 = 0; i2 < 3; i2++) {
                    if (!C6935j.m21631n(C6935j.m21644a(obj, strArr2[i2]))) {
                        z = false;
                    }
                }
            }
            if (z && (str2.equals("date") || str2.equals("all"))) {
                String[] strArr3 = {"year", "month", "day"};
                for (int i3 = 0; i3 < 3; i3++) {
                    C6935j.m21642c(obj, strArr3[i3], "numeric");
                }
            }
            if (z && (str2.equals("time") || str2.equals("all"))) {
                String[] strArr4 = {"hour", "minute", "second"};
                for (int i4 = 0; i4 < 3; i4++) {
                    C6935j.m21642c(obj, strArr4[i4], "numeric");
                }
            }
            return obj;
        }
        throw new C6947l("Invalid options object !");
    }

    /* renamed from: c */
    private void m31333c(List<String> list, Map<String, Object> map) {
        Object m31331e;
        InterfaceC3649b.EnumC3655f enumC3655f;
        List asList = Arrays.asList("ca", "nu", "hc");
        Object m31334b = m31334b(map, "any", "date");
        Object m21628q = C6935j.m21628q();
        C3681j.EnumC3682a enumC3682a = C3681j.EnumC3682a.STRING;
        C6935j.m21642c(m21628q, "localeMatcher", C3681j.m31257c(m31334b, "localeMatcher", enumC3682a, C6890a.f19179a, "best fit"));
        Object m31257c = C3681j.m31257c(m31334b, "calendar", enumC3682a, C6935j.m21641d(), C6935j.m21641d());
        if (!C6935j.m21631n(m31257c) && !m31332d(C6935j.m21637h(m31257c))) {
            throw new C6947l("Invalid calendar option !");
        }
        C6935j.m21642c(m21628q, "ca", m31257c);
        Object m31257c2 = C3681j.m31257c(m31334b, "numberingSystem", enumC3682a, C6935j.m21641d(), C6935j.m21641d());
        if (!C6935j.m21631n(m31257c2) && !m31332d(C6935j.m21637h(m31257c2))) {
            throw new C6947l("Invalid numbering system !");
        }
        C6935j.m21642c(m21628q, "nu", m31257c2);
        Object m31257c3 = C3681j.m31257c(m31334b, "hour12", C3681j.EnumC3682a.BOOLEAN, C6935j.m21641d(), C6935j.m21641d());
        Object m31257c4 = C3681j.m31257c(m31334b, "hourCycle", enumC3682a, new String[]{"h11", "h12", "h23", "h24"}, C6935j.m21641d());
        if (!C6935j.m21631n(m31257c3)) {
            m31257c4 = C6935j.m21643b();
        }
        C6935j.m21642c(m21628q, "hc", m31257c4);
        HashMap<String, Object> m31260a = C3680i.m31260a(list, m21628q, asList);
        InterfaceC6895b<?> interfaceC6895b = (InterfaceC6895b) C6935j.m21638g(m31260a).get("locale");
        this.f10041b = interfaceC6895b;
        this.f10042c = interfaceC6895b.mo21548d();
        Object m21644a = C6935j.m21644a(m31260a, "ca");
        if (!C6935j.m21635j(m21644a)) {
            this.f10043d = false;
            this.f10044e = C6935j.m21637h(m21644a);
        } else {
            this.f10043d = true;
            this.f10044e = this.f10040a.mo31244d(this.f10041b);
        }
        Object m21644a2 = C6935j.m21644a(m31260a, "nu");
        if (!C6935j.m21635j(m21644a2)) {
            this.f10045f = false;
            this.f10046g = C6935j.m21637h(m21644a2);
        } else {
            this.f10045f = true;
            this.f10046g = this.f10040a.mo31245c(this.f10041b);
        }
        Object m21644a3 = C6935j.m21644a(m31260a, "hc");
        Object m21644a4 = C6935j.m21644a(m31334b, "timeZone");
        if (C6935j.m21631n(m21644a4)) {
            m31331e = m31335a();
        } else {
            m31331e = m31331e(m21644a4.toString());
        }
        this.f10058s = m31331e;
        this.f10048i = (InterfaceC3649b.EnumC3653d) C3681j.m31256d(InterfaceC3649b.EnumC3653d.class, C6935j.m21637h(C3681j.m31257c(m31334b, "formatMatcher", enumC3682a, new String[]{"basic", "best fit"}, "best fit")));
        this.f10049j = (InterfaceC3649b.EnumC3660k) C3681j.m31256d(InterfaceC3649b.EnumC3660k.class, C3681j.m31257c(m31334b, "weekday", enumC3682a, new String[]{"long", "short", "narrow"}, C6935j.m21641d()));
        this.f10050k = (InterfaceC3649b.EnumC3652c) C3681j.m31256d(InterfaceC3649b.EnumC3652c.class, C3681j.m31257c(m31334b, "era", enumC3682a, new String[]{"long", "short", "narrow"}, C6935j.m21641d()));
        this.f10051l = (InterfaceC3649b.EnumC3661l) C3681j.m31256d(InterfaceC3649b.EnumC3661l.class, C3681j.m31257c(m31334b, "year", enumC3682a, new String[]{"numeric", "2-digit"}, C6935j.m21641d()));
        this.f10052m = (InterfaceC3649b.EnumC3657h) C3681j.m31256d(InterfaceC3649b.EnumC3657h.class, C3681j.m31257c(m31334b, "month", enumC3682a, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, C6935j.m21641d()));
        this.f10053n = (InterfaceC3649b.EnumC3651b) C3681j.m31256d(InterfaceC3649b.EnumC3651b.class, C3681j.m31257c(m31334b, "day", enumC3682a, new String[]{"numeric", "2-digit"}, C6935j.m21641d()));
        Object m31257c5 = C3681j.m31257c(m31334b, "hour", enumC3682a, new String[]{"numeric", "2-digit"}, C6935j.m21641d());
        this.f10054o = (InterfaceC3649b.EnumC3654e) C3681j.m31256d(InterfaceC3649b.EnumC3654e.class, m31257c5);
        this.f10055p = (InterfaceC3649b.EnumC3656g) C3681j.m31256d(InterfaceC3649b.EnumC3656g.class, C3681j.m31257c(m31334b, "minute", enumC3682a, new String[]{"numeric", "2-digit"}, C6935j.m21641d()));
        this.f10056q = (InterfaceC3649b.EnumC3658i) C3681j.m31256d(InterfaceC3649b.EnumC3658i.class, C3681j.m31257c(m31334b, "second", enumC3682a, new String[]{"numeric", "2-digit"}, C6935j.m21641d()));
        this.f10057r = (InterfaceC3649b.EnumC3659j) C3681j.m31256d(InterfaceC3649b.EnumC3659j.class, C3681j.m31257c(m31334b, "timeZoneName", enumC3682a, new String[]{"long", "short"}, C6935j.m21641d()));
        if (C6935j.m21631n(m31257c5)) {
            this.f10047h = InterfaceC3649b.EnumC3655f.UNDEFINED;
            return;
        }
        InterfaceC3649b.EnumC3655f mo31243e = this.f10040a.mo31243e(this.f10041b);
        if (C6935j.m21635j(m21644a3)) {
            enumC3655f = mo31243e;
        } else {
            enumC3655f = (InterfaceC3649b.EnumC3655f) C3681j.m31256d(InterfaceC3649b.EnumC3655f.class, m21644a3);
        }
        if (!C6935j.m21631n(m31257c3)) {
            if (C6935j.m21640e(m31257c3)) {
                enumC3655f = InterfaceC3649b.EnumC3655f.H11;
                if (mo31243e != enumC3655f && mo31243e != InterfaceC3649b.EnumC3655f.H23) {
                    enumC3655f = InterfaceC3649b.EnumC3655f.H12;
                }
            } else {
                enumC3655f = (mo31243e == InterfaceC3649b.EnumC3655f.H11 || mo31243e == InterfaceC3649b.EnumC3655f.H23) ? InterfaceC3649b.EnumC3655f.H23 : InterfaceC3649b.EnumC3655f.H24;
            }
        }
        this.f10047h = enumC3655f;
    }

    /* renamed from: d */
    private boolean m31332d(String str) {
        return C6925h.m21657o(str, 0, str.length() - 1);
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

    /* renamed from: e */
    public String m31331e(String str) {
        String[] availableIDs;
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (m31330f(str2).equals(m31330f(str))) {
                return str2;
            }
        }
        throw new C6947l("Invalid timezone name!");
    }

    /* renamed from: f */
    public String m31330f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                sb2.append((char) (charAt + ' '));
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    @InterfaceC6107a
    public String format(double d) {
        return this.f10040a.mo31246b(d);
    }

    @InterfaceC6107a
    public List<Map<String, String>> formatToParts(double d) {
        String str;
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator mo31247a = this.f10040a.mo31247a(d);
        StringBuilder sb2 = new StringBuilder();
        for (char first = mo31247a.first(); first != 65535; first = mo31247a.next()) {
            sb2.append(first);
            if (mo31247a.getIndex() + 1 == mo31247a.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = mo31247a.getAttributes().keySet().iterator();
                if (it.hasNext()) {
                    str = this.f10040a.mo31241g(it.next(), sb2.toString());
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
        linkedHashMap.put("locale", this.f10042c.mo21545g());
        linkedHashMap.put("numberingSystem", this.f10046g);
        linkedHashMap.put("calendar", this.f10044e);
        linkedHashMap.put("timeZone", this.f10058s);
        InterfaceC3649b.EnumC3655f enumC3655f = this.f10047h;
        if (enumC3655f != InterfaceC3649b.EnumC3655f.UNDEFINED) {
            linkedHashMap.put("hourCycle", enumC3655f.toString());
            InterfaceC3649b.EnumC3655f enumC3655f2 = this.f10047h;
            if (enumC3655f2 != InterfaceC3649b.EnumC3655f.H11 && enumC3655f2 != InterfaceC3649b.EnumC3655f.H12) {
                linkedHashMap.put("hour12", Boolean.FALSE);
            } else {
                linkedHashMap.put("hour12", Boolean.TRUE);
            }
        }
        InterfaceC3649b.EnumC3660k enumC3660k = this.f10049j;
        if (enumC3660k != InterfaceC3649b.EnumC3660k.UNDEFINED) {
            linkedHashMap.put("weekday", enumC3660k.toString());
        }
        InterfaceC3649b.EnumC3652c enumC3652c = this.f10050k;
        if (enumC3652c != InterfaceC3649b.EnumC3652c.UNDEFINED) {
            linkedHashMap.put("era", enumC3652c.toString());
        }
        InterfaceC3649b.EnumC3661l enumC3661l = this.f10051l;
        if (enumC3661l != InterfaceC3649b.EnumC3661l.UNDEFINED) {
            linkedHashMap.put("year", enumC3661l.toString());
        }
        InterfaceC3649b.EnumC3657h enumC3657h = this.f10052m;
        if (enumC3657h != InterfaceC3649b.EnumC3657h.UNDEFINED) {
            linkedHashMap.put("month", enumC3657h.toString());
        }
        InterfaceC3649b.EnumC3651b enumC3651b = this.f10053n;
        if (enumC3651b != InterfaceC3649b.EnumC3651b.UNDEFINED) {
            linkedHashMap.put("day", enumC3651b.toString());
        }
        InterfaceC3649b.EnumC3654e enumC3654e = this.f10054o;
        if (enumC3654e != InterfaceC3649b.EnumC3654e.UNDEFINED) {
            linkedHashMap.put("hour", enumC3654e.toString());
        }
        InterfaceC3649b.EnumC3656g enumC3656g = this.f10055p;
        if (enumC3656g != InterfaceC3649b.EnumC3656g.UNDEFINED) {
            linkedHashMap.put("minute", enumC3656g.toString());
        }
        InterfaceC3649b.EnumC3658i enumC3658i = this.f10056q;
        if (enumC3658i != InterfaceC3649b.EnumC3658i.UNDEFINED) {
            linkedHashMap.put("second", enumC3658i.toString());
        }
        InterfaceC3649b.EnumC3659j enumC3659j = this.f10057r;
        if (enumC3659j != InterfaceC3649b.EnumC3659j.UNDEFINED) {
            linkedHashMap.put("timeZoneName", enumC3659j.toString());
        }
        return linkedHashMap;
    }
}
