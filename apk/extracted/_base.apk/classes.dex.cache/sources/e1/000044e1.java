package net.time4j.p249tz;

import android.util.TimeUtils;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;

/* renamed from: net.time4j.tz.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC10809l implements Serializable {

    /* renamed from: A */
    private static final LinkedList<AbstractC10809l> f28224A;

    /* renamed from: B */
    private static final ConcurrentMap<String, InterfaceC10837r> f28225B;

    /* renamed from: C */
    static final InterfaceC10838s f28226C;

    /* renamed from: D */
    private static final AbstractC10809l f28227D;

    /* renamed from: j */
    private static final String f28228j = System.getProperty("line.separator");

    /* renamed from: k */
    private static final String f28229k = System.getProperty("net.time4j.tz.repository.version");

    /* renamed from: l */
    private static final Comparator<InterfaceC10808k> f28230l = new C10810a();

    /* renamed from: m */
    public static final InterfaceC10834o f28231m;

    /* renamed from: n */
    public static final InterfaceC10834o f28232n;

    /* renamed from: o */
    private static final boolean f28233o;

    /* renamed from: p */
    private static final boolean f28234p;

    /* renamed from: q */
    private static volatile C10814e f28235q;

    /* renamed from: r */
    private static volatile AbstractC10809l f28236r;

    /* renamed from: s */
    private static volatile boolean f28237s;

    /* renamed from: t */
    private static int f28238t;

    /* renamed from: u */
    private static final Map<String, InterfaceC10808k> f28239u;

    /* renamed from: v */
    private static final Map<String, InterfaceC10808k> f28240v;

    /* renamed from: w */
    private static final InterfaceC10837r f28241w;

    /* renamed from: x */
    private static final InterfaceC10837r f28242x;

    /* renamed from: y */
    private static final ConcurrentMap<String, C10812c> f28243y;

    /* renamed from: z */
    private static final ReferenceQueue<AbstractC10809l> f28244z;

    /* renamed from: net.time4j.tz.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    static class C10810a implements Comparator<InterfaceC10808k> {
        C10810a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(InterfaceC10808k interfaceC10808k, InterfaceC10808k interfaceC10808k2) {
            return interfaceC10808k.mo10035a().compareTo(interfaceC10808k2.mo10035a());
        }
    }

    /* renamed from: net.time4j.tz.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C10811b {
        /* renamed from: a */
        public static void m10123a() {
            synchronized (AbstractC10809l.class) {
                while (AbstractC10809l.f28244z.poll() != null) {
                }
                AbstractC10809l.f28224A.clear();
            }
            C10814e unused = AbstractC10809l.f28235q = new C10814e();
            AbstractC10809l.f28243y.clear();
            if (AbstractC10809l.f28234p) {
                AbstractC10809l unused2 = AbstractC10809l.f28236r = AbstractC10809l.m10145f();
            }
        }
    }

    /* renamed from: net.time4j.tz.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C10812c extends SoftReference<AbstractC10809l> {

        /* renamed from: a */
        private final String f28245a;

        C10812c(AbstractC10809l abstractC10809l, ReferenceQueue<AbstractC10809l> referenceQueue) {
            super(abstractC10809l, referenceQueue);
            this.f28245a = abstractC10809l.mo10125z().mo10035a();
        }
    }

    /* renamed from: net.time4j.tz.l$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C10813d implements InterfaceC10837r, InterfaceC10838s {
        private C10813d() {
        }

        /* synthetic */ C10813d(C10810a c10810a) {
            this();
        }

        @Override // net.time4j.p249tz.InterfaceC10837r
        /* renamed from: a */
        public String mo6634a() {
            return "";
        }

        @Override // net.time4j.p249tz.InterfaceC10837r
        /* renamed from: b */
        public InterfaceC10838s mo6633b() {
            return this;
        }

        @Override // net.time4j.p249tz.InterfaceC10838s
        /* renamed from: c */
        public Set<String> mo6620c(Locale locale, boolean z) {
            return Collections.emptySet();
        }

        @Override // net.time4j.p249tz.InterfaceC10837r
        /* renamed from: d */
        public Map<String, String> mo6631d() {
            return Collections.emptyMap();
        }

        @Override // net.time4j.p249tz.InterfaceC10838s
        /* renamed from: e */
        public String mo6618e(boolean z, Locale locale) {
            return z ? "GMT" : "GMT±hh:mm";
        }

        @Override // net.time4j.p249tz.InterfaceC10837r
        /* renamed from: f */
        public String mo6629f() {
            return TimeUtils.getTimeZoneDatabaseVersion();
        }

        @Override // net.time4j.p249tz.InterfaceC10838s
        /* renamed from: g */
        public String mo6616g(String str, EnumC10801d enumC10801d, Locale locale) {
            if (locale != null) {
                if (str.isEmpty()) {
                    return "";
                }
                TimeZone m10169R = C10805h.m10169R(str);
                if (!m10169R.getID().equals(str)) {
                    return "";
                }
                return m10169R.getDisplayName(enumC10801d.m10170b(), !enumC10801d.m10171a(), locale);
            }
            throw new NullPointerException("Missing locale.");
        }

        @Override // net.time4j.p249tz.InterfaceC10837r
        public String getName() {
            return "java.util.TimeZone";
        }

        @Override // net.time4j.p249tz.InterfaceC10837r
        /* renamed from: h */
        public Set<String> mo6627h() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(TimeZone.getAvailableIDs()));
            return hashSet;
        }

        @Override // net.time4j.p249tz.InterfaceC10837r
        /* renamed from: i */
        public String mo6626i() {
            return "";
        }

        @Override // net.time4j.p249tz.InterfaceC10837r
        public InterfaceC10815m load(String str) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.tz.l$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C10814e {

        /* renamed from: a */
        private final List<InterfaceC10808k> f28246a;

        /* renamed from: b */
        private final List<InterfaceC10808k> f28247b;

        C10814e() {
            ArrayList arrayList = new ArrayList(1024);
            ArrayList arrayList2 = new ArrayList(1024);
            arrayList.add(C10835p.f28295t);
            for (Map.Entry entry : AbstractC10809l.f28225B.entrySet()) {
                InterfaceC10837r interfaceC10837r = (InterfaceC10837r) entry.getValue();
                if (interfaceC10837r != AbstractC10809l.f28241w || AbstractC10809l.f28242x == AbstractC10809l.f28241w) {
                    for (String str : interfaceC10837r.mo6627h()) {
                        InterfaceC10808k m10147P = AbstractC10809l.m10147P(str);
                        if (!arrayList.contains(m10147P)) {
                            arrayList.add(m10147P);
                        }
                    }
                    arrayList2.addAll(arrayList);
                    for (String str2 : interfaceC10837r.mo6631d().keySet()) {
                        InterfaceC10808k m10147P2 = AbstractC10809l.m10147P(str2);
                        if (!arrayList2.contains(m10147P2)) {
                            arrayList2.add(m10147P2);
                        }
                    }
                }
            }
            Collections.sort(arrayList, AbstractC10809l.f28230l);
            Collections.sort(arrayList2, AbstractC10809l.f28230l);
            this.f28246a = Collections.unmodifiableList(arrayList);
            this.f28247b = Collections.unmodifiableList(arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ab  */
    static {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.p249tz.AbstractC10809l.<clinit>():void");
    }

    /* renamed from: C */
    public static Set<InterfaceC10808k> m10160C(Locale locale, boolean z, String str) {
        InterfaceC10837r m10159D = m10159D(str);
        if (m10159D == null) {
            return Collections.emptySet();
        }
        InterfaceC10838s mo6633b = m10159D.mo6633b();
        if (mo6633b == null) {
            mo6633b = f28226C;
        }
        HashSet hashSet = new HashSet();
        for (String str2 : mo6633b.mo6620c(locale, z)) {
            hashSet.add(m10147P(str2));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: D */
    private static InterfaceC10837r m10159D(String str) {
        if (!str.isEmpty()) {
            if (str.equals("DEFAULT")) {
                return f28242x;
            }
            return f28225B.get(str);
        }
        throw new IllegalArgumentException("Missing zone model provider.");
    }

    /* renamed from: F */
    private static AbstractC10809l m10157F(InterfaceC10808k interfaceC10808k, String str, boolean z) {
        AbstractC10809l abstractC10809l;
        String str2;
        String str3;
        ConcurrentMap<String, C10812c> concurrentMap = f28243y;
        C10812c c10812c = concurrentMap.get(str);
        if (c10812c != null) {
            abstractC10809l = c10812c.get();
            if (abstractC10809l == null) {
                concurrentMap.remove(c10812c.f28245a);
            }
        } else {
            abstractC10809l = null;
        }
        if (abstractC10809l != null) {
            return abstractC10809l;
        }
        String str4 = "";
        int length = str.length();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (str.charAt(i) == '~') {
                    str4 = str.substring(0, i);
                    str2 = str.substring(i + 1);
                    break;
                }
                i++;
            } else {
                str2 = str;
                break;
            }
        }
        if (str2.isEmpty()) {
            if (!z) {
                return null;
            }
            throw new IllegalArgumentException("Timezone key is empty.");
        }
        InterfaceC10837r interfaceC10837r = f28242x;
        if (str4.isEmpty() || str4.equals("DEFAULT")) {
            z2 = true;
        }
        if (!z2 && (interfaceC10837r = f28225B.get(str4)) == null) {
            if (!z) {
                return null;
            }
            if (str4.equals("TZDB")) {
                str3 = "TZDB provider not available: ";
            } else {
                str3 = "Timezone model provider not registered: ";
            }
            throw new IllegalArgumentException(str3 + str);
        }
        if (interfaceC10808k == null) {
            if (z2) {
                interfaceC10808k = m10147P(str2);
                if (interfaceC10808k instanceof C10835p) {
                    return ((C10835p) interfaceC10808k).m10025l();
                }
            } else {
                interfaceC10808k = new C10802e(str);
            }
        }
        if (interfaceC10837r == f28241w) {
            C10805h c10805h = new C10805h(interfaceC10808k, str2);
            if (!c10805h.m10167T() || str2.equals("GMT") || str2.startsWith("UT") || str2.equals("Z")) {
                abstractC10809l = c10805h;
            }
        } else {
            InterfaceC10815m load = interfaceC10837r.load(str2);
            if (load == null) {
                abstractC10809l = m10155H(interfaceC10837r, interfaceC10808k, str2);
            } else {
                abstractC10809l = new C10800c(interfaceC10808k, load);
            }
        }
        if (abstractC10809l == null) {
            if (!z) {
                return null;
            }
            if (TimeZone.getDefault().getID().equals(str)) {
                return new C10805h(new C10802e(str));
            }
            throw new IllegalArgumentException("Unknown timezone: " + str);
        } else if (f28237s) {
            C10812c putIfAbsent = f28243y.putIfAbsent(str, new C10812c(abstractC10809l, f28244z));
            if (putIfAbsent == null) {
                synchronized (AbstractC10809l.class) {
                    f28224A.addFirst(abstractC10809l);
                    while (true) {
                        LinkedList<AbstractC10809l> linkedList = f28224A;
                        if (linkedList.size() >= f28238t) {
                            linkedList.removeLast();
                        }
                    }
                }
                return abstractC10809l;
            }
            AbstractC10809l abstractC10809l2 = putIfAbsent.get();
            if (abstractC10809l2 != null) {
                return abstractC10809l2;
            }
            return abstractC10809l;
        } else {
            return abstractC10809l;
        }
    }

    /* renamed from: G */
    private static AbstractC10809l m10156G(InterfaceC10808k interfaceC10808k, boolean z) {
        if (interfaceC10808k instanceof C10835p) {
            return ((C10835p) interfaceC10808k).m10025l();
        }
        return m10157F(interfaceC10808k, interfaceC10808k.mo10035a(), z);
    }

    /* renamed from: H */
    private static AbstractC10809l m10155H(InterfaceC10837r interfaceC10837r, InterfaceC10808k interfaceC10808k, String str) {
        Map<String, String> mo6631d = interfaceC10837r.mo6631d();
        String str2 = str;
        InterfaceC10815m interfaceC10815m = null;
        while (interfaceC10815m == null) {
            str2 = mo6631d.get(str2);
            if (str2 == null) {
                break;
            }
            interfaceC10815m = interfaceC10837r.load(str2);
        }
        if (interfaceC10815m == null) {
            String mo6626i = interfaceC10837r.mo6626i();
            if (mo6626i.isEmpty()) {
                return null;
            }
            if (!mo6626i.equals(interfaceC10837r.getName())) {
                return new C10798a(interfaceC10808k, m10150M(mo6626i + "~" + str));
            }
            throw new IllegalArgumentException("Circular zone model provider fallback: " + interfaceC10837r.getName());
        }
        return new C10800c(interfaceC10808k, interfaceC10815m);
    }

    /* renamed from: L */
    private static List<Class<? extends InterfaceC10808k>> m10151L(ClassLoader classLoader, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Class<?> cls = Class.forName("net.time4j.tz.olson." + str, true, classLoader);
            if (InterfaceC10808k.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: M */
    public static AbstractC10809l m10150M(String str) {
        return m10157F(null, str, true);
    }

    /* renamed from: N */
    public static AbstractC10809l m10149N(InterfaceC10808k interfaceC10808k) {
        return m10156G(interfaceC10808k, true);
    }

    /* renamed from: O */
    public static AbstractC10809l m10148O() {
        if (f28234p && f28236r != null) {
            return f28236r;
        }
        return f28227D;
    }

    /* renamed from: P */
    public static InterfaceC10808k m10147P(String str) {
        InterfaceC10808k interfaceC10808k = f28239u.get(str);
        if (interfaceC10808k == null) {
            if (str.startsWith("GMT")) {
                str = "UTC" + str.substring(3);
            }
            C10835p m10017t = C10835p.m10017t(str, false);
            if (m10017t == null) {
                return new C10802e(str);
            }
            return m10017t;
        }
        return interfaceC10808k;
    }

    /* renamed from: f */
    static /* synthetic */ AbstractC10809l m10145f() {
        return m10129v();
    }

    /* renamed from: r */
    private static InterfaceC10837r m10133r(InterfaceC10837r interfaceC10837r, InterfaceC10837r interfaceC10837r2) {
        String mo6629f = interfaceC10837r.mo6629f();
        if (!mo6629f.isEmpty()) {
            String str = f28229k;
            if (!mo6629f.equals(str)) {
                if (str == null) {
                    if (interfaceC10837r2 != null && mo6629f.compareTo(interfaceC10837r2.mo6629f()) <= 0) {
                        if (mo6629f.compareTo(interfaceC10837r2.mo6629f()) == 0 && !interfaceC10837r.mo6634a().contains("{java.home}")) {
                            return interfaceC10837r;
                        }
                    } else {
                        return interfaceC10837r;
                    }
                }
            } else {
                return interfaceC10837r;
            }
        }
        return interfaceC10837r2;
    }

    /* renamed from: s */
    private static void m10132s(Map<String, InterfaceC10808k> map) {
        C10835p c10835p = C10835p.f28295t;
        map.put("Etc/GMT", c10835p);
        map.put("Etc/Greenwich", c10835p);
        map.put("Etc/Universal", c10835p);
        map.put("Etc/Zulu", c10835p);
        map.put("Etc/GMT+0", c10835p);
        map.put("Etc/GMT-0", c10835p);
        map.put("Etc/GMT0", c10835p);
        map.put("Etc/UTC", c10835p);
        map.put("Etc/UCT", c10835p);
        map.put("Etc/GMT-14", C10835p.m10020q(50400));
        map.put("Etc/GMT-13", C10835p.m10020q(46800));
        map.put("Etc/GMT-12", C10835p.m10020q(43200));
        map.put("Etc/GMT-11", C10835p.m10020q(39600));
        map.put("Etc/GMT-10", C10835p.m10020q(36000));
        map.put("Etc/GMT-9", C10835p.m10020q(32400));
        map.put("Etc/GMT-8", C10835p.m10020q(28800));
        map.put("Etc/GMT-7", C10835p.m10020q(25200));
        map.put("Etc/GMT-6", C10835p.m10020q(21600));
        map.put("Etc/GMT-5", C10835p.m10020q(18000));
        map.put("Etc/GMT-4", C10835p.m10020q(14400));
        map.put("Etc/GMT-3", C10835p.m10020q(10800));
        map.put("Etc/GMT-2", C10835p.m10020q(7200));
        map.put("Etc/GMT-1", C10835p.m10020q(3600));
        map.put("Etc/GMT+1", C10835p.m10020q(-3600));
        map.put("Etc/GMT+2", C10835p.m10020q(-7200));
        map.put("Etc/GMT+3", C10835p.m10020q(-10800));
        map.put("Etc/GMT+4", C10835p.m10020q(-14400));
        map.put("Etc/GMT+5", C10835p.m10020q(-18000));
        map.put("Etc/GMT+6", C10835p.m10020q(-21600));
        map.put("Etc/GMT+7", C10835p.m10020q(-25200));
        map.put("Etc/GMT+8", C10835p.m10020q(-28800));
        map.put("Etc/GMT+9", C10835p.m10020q(-32400));
        map.put("Etc/GMT+10", C10835p.m10020q(-36000));
        map.put("Etc/GMT+11", C10835p.m10020q(-39600));
        map.put("Etc/GMT+12", C10835p.m10020q(-43200));
    }

    /* renamed from: t */
    public static List<InterfaceC10808k> m10131t() {
        return f28235q.f28246a;
    }

    /* renamed from: u */
    public static List<InterfaceC10808k> m10130u(String str) {
        if (str.equals("INCLUDE_ALIAS")) {
            return f28235q.f28247b;
        }
        InterfaceC10837r m10159D = m10159D(str);
        if (m10159D == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : m10159D.mo6627h()) {
            arrayList.add(m10147P(str2));
        }
        Collections.sort(arrayList, f28230l);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: v */
    private static AbstractC10809l m10129v() {
        String id2 = TimeZone.getDefault().getID();
        AbstractC10809l m10157F = m10157F(null, id2, false);
        if (m10157F == null) {
            return new C10805h(new C10802e(id2));
        }
        return m10157F;
    }

    /* renamed from: x */
    public static String m10127x(InterfaceC10808k interfaceC10808k, EnumC10801d enumC10801d, Locale locale) {
        String str;
        String mo10035a = interfaceC10808k.mo10035a();
        int indexOf = mo10035a.indexOf(126);
        InterfaceC10837r interfaceC10837r = f28242x;
        if (indexOf >= 0) {
            String substring = mo10035a.substring(0, indexOf);
            if (!substring.equals("DEFAULT") && (interfaceC10837r = f28225B.get(substring)) == null) {
                return mo10035a;
            }
            str = mo10035a.substring(indexOf + 1);
        } else {
            str = mo10035a;
        }
        InterfaceC10838s mo6633b = interfaceC10837r.mo6633b();
        if (mo6633b == null) {
            mo6633b = f28226C;
        }
        String mo6616g = mo6633b.mo6616g(str, enumC10801d, locale);
        if (mo6616g.isEmpty()) {
            InterfaceC10838s interfaceC10838s = f28226C;
            if (mo6633b != interfaceC10838s) {
                mo6616g = interfaceC10838s.mo6616g(str, enumC10801d, locale);
            }
            if (!mo6616g.isEmpty()) {
                mo10035a = mo6616g;
            }
            return mo10035a;
        }
        return mo6616g;
    }

    /* renamed from: A */
    public abstract C10835p mo10162A(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g);

    /* renamed from: B */
    public abstract C10835p mo10161B(InterfaceC10620f interfaceC10620f);

    /* renamed from: E */
    public abstract InterfaceC10834o mo10158E();

    /* renamed from: I */
    public abstract boolean mo10154I(InterfaceC10620f interfaceC10620f);

    /* renamed from: J */
    public abstract boolean mo10153J();

    /* renamed from: K */
    public abstract boolean mo10152K(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g);

    /* renamed from: Q */
    public abstract AbstractC10809l mo10146Q(InterfaceC10834o interfaceC10834o);

    /* renamed from: w */
    public String mo10128w(EnumC10801d enumC10801d, Locale locale) {
        return m10127x(mo10125z(), enumC10801d, locale);
    }

    /* renamed from: y */
    public abstract InterfaceC10815m mo10126y();

    /* renamed from: z */
    public abstract InterfaceC10808k mo10125z();
}