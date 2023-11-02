package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.C3681j;
import com.facebook.hermes.intl.InterfaceC3644a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p077e5.InterfaceC6107a;
import p128h4.C6890a;
import p128h4.C6935j;
import p128h4.C6971p3;
import p128h4.InterfaceC6895b;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Collator {

    /* renamed from: a */
    private InterfaceC3644a.EnumC3648d f10031a;

    /* renamed from: b */
    private InterfaceC3644a.EnumC3647c f10032b;

    /* renamed from: c */
    private boolean f10033c;

    /* renamed from: d */
    private String f10034d = "default";

    /* renamed from: e */
    private boolean f10035e;

    /* renamed from: f */
    private InterfaceC3644a.EnumC3646b f10036f;

    /* renamed from: g */
    private InterfaceC6895b<?> f10037g;

    /* renamed from: h */
    private InterfaceC6895b<?> f10038h;

    /* renamed from: i */
    private InterfaceC3644a f10039i;

    @InterfaceC6107a
    public Collator(List<String> list, Map<String, Object> map) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f10039i = new C3687m();
        } else {
            this.f10039i = new C3685l();
        }
        m31336a(list, map);
        this.f10039i.mo31253c(this.f10037g).mo31250f(this.f10035e).mo31251e(this.f10036f).mo31249g(this.f10032b).mo31252d(this.f10033c);
    }

    /* renamed from: a */
    private void m31336a(List<String> list, Map<String, Object> map) {
        C3681j.EnumC3682a enumC3682a = C3681j.EnumC3682a.STRING;
        this.f10031a = (InterfaceC3644a.EnumC3648d) C3681j.m31256d(InterfaceC3644a.EnumC3648d.class, C6935j.m21637h(C3681j.m31257c(map, "usage", enumC3682a, C6890a.f19183e, "sort")));
        Object m21628q = C6935j.m21628q();
        C6935j.m21642c(m21628q, "localeMatcher", C3681j.m31257c(map, "localeMatcher", enumC3682a, C6890a.f19179a, "best fit"));
        Object m31257c = C3681j.m31257c(map, "numeric", C3681j.EnumC3682a.BOOLEAN, C6935j.m21641d(), C6935j.m21641d());
        if (!C6935j.m21631n(m31257c)) {
            m31257c = C6935j.m21627r(String.valueOf(C6935j.m21640e(m31257c)));
        }
        C6935j.m21642c(m21628q, "kn", m31257c);
        C6935j.m21642c(m21628q, "kf", C3681j.m31257c(map, "caseFirst", enumC3682a, C6890a.f19182d, C6935j.m21641d()));
        HashMap<String, Object> m31260a = C3680i.m31260a(list, m21628q, Arrays.asList("co", "kf", "kn"));
        InterfaceC6895b<?> interfaceC6895b = (InterfaceC6895b) C6935j.m21638g(m31260a).get("locale");
        this.f10037g = interfaceC6895b;
        this.f10038h = interfaceC6895b.mo21548d();
        Object m21644a = C6935j.m21644a(m31260a, "co");
        if (C6935j.m21635j(m21644a)) {
            m21644a = C6935j.m21627r("default");
        }
        this.f10034d = C6935j.m21637h(m21644a);
        Object m21644a2 = C6935j.m21644a(m31260a, "kn");
        if (C6935j.m21635j(m21644a2)) {
            this.f10035e = false;
        } else {
            this.f10035e = Boolean.parseBoolean(C6935j.m21637h(m21644a2));
        }
        Object m21644a3 = C6935j.m21644a(m31260a, "kf");
        if (C6935j.m21635j(m21644a3)) {
            m21644a3 = C6935j.m21627r("false");
        }
        this.f10036f = (InterfaceC3644a.EnumC3646b) C3681j.m31256d(InterfaceC3644a.EnumC3646b.class, C6935j.m21637h(m21644a3));
        if (this.f10031a == InterfaceC3644a.EnumC3648d.SEARCH) {
            ArrayList<String> mo21550b = this.f10037g.mo21550b("collation");
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = mo21550b.iterator();
            while (it.hasNext()) {
                arrayList.add(C6971p3.m21590e(it.next()));
            }
            arrayList.add(C6971p3.m21590e("search"));
            this.f10037g.mo21546f("co", arrayList);
        }
        Object m31257c2 = C3681j.m31257c(map, "sensitivity", C3681j.EnumC3682a.STRING, C6890a.f19181c, C6935j.m21641d());
        if (!C6935j.m21631n(m31257c2)) {
            this.f10032b = (InterfaceC3644a.EnumC3647c) C3681j.m31256d(InterfaceC3644a.EnumC3647c.class, C6935j.m21637h(m31257c2));
        } else if (this.f10031a == InterfaceC3644a.EnumC3648d.SORT) {
            this.f10032b = InterfaceC3644a.EnumC3647c.VARIANT;
        } else {
            this.f10032b = InterfaceC3644a.EnumC3647c.LOCALE;
        }
        this.f10033c = C6935j.m21640e(C3681j.m31257c(map, "ignorePunctuation", C3681j.EnumC3682a.BOOLEAN, C6935j.m21641d(), Boolean.FALSE));
    }

    @InterfaceC6107a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String m21637h = C6935j.m21637h(C3681j.m31257c(map, "localeMatcher", C3681j.EnumC3682a.STRING, C6890a.f19179a, "best fit"));
        if (Build.VERSION.SDK_INT >= 24 && m21637h.equals("best fit")) {
            return Arrays.asList(C3677g.m31272d((String[]) list.toArray(new String[list.size()])));
        }
        return Arrays.asList(C3677g.m31268h((String[]) list.toArray(new String[list.size()])));
    }

    @InterfaceC6107a
    public double compare(String str, String str2) {
        return this.f10039i.mo31255a(str, str2);
    }

    @InterfaceC6107a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f10038h.mo21545g().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f10031a.toString());
        InterfaceC3644a.EnumC3647c enumC3647c = this.f10032b;
        if (enumC3647c == InterfaceC3644a.EnumC3647c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f10039i.mo31254b().toString());
        } else {
            linkedHashMap.put("sensitivity", enumC3647c.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f10033c));
        linkedHashMap.put("collation", this.f10034d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f10035e));
        linkedHashMap.put("caseFirst", this.f10036f.toString());
        return linkedHashMap;
    }
}