package p272oj;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.AbstractC10617d;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: oj.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C11180e {

    /* renamed from: e */
    private static final ConcurrentMap<C11182b, C11181a> f29218e = new ConcurrentHashMap(32);

    /* renamed from: f */
    private static final ReferenceQueue<Object> f29219f = new ReferenceQueue<>();

    /* renamed from: a */
    private final C11180e f29220a;

    /* renamed from: b */
    private final Map<String, String> f29221b;

    /* renamed from: c */
    private final String f29222c;

    /* renamed from: d */
    private final Locale f29223d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oj.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C11181a extends SoftReference<C11180e> {

        /* renamed from: a */
        private C11182b f29224a;

        C11181a(C11180e c11180e, C11182b c11182b) {
            super(c11180e, C11180e.f29219f);
            this.f29224a = c11182b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oj.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C11182b {

        /* renamed from: a */
        private final String f29225a;

        /* renamed from: b */
        private final Locale f29226b;

        C11182b(String str, Locale locale) {
            this.f29225a = str;
            this.f29226b = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11182b)) {
                return false;
            }
            C11182b c11182b = (C11182b) obj;
            if (this.f29225a.equals(c11182b.f29225a) && this.f29226b.equals(c11182b.f29226b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f29225a.hashCode() << 3) ^ this.f29226b.hashCode();
        }

        public String toString() {
            return this.f29225a + "/" + this.f29226b;
        }
    }

    private C11180e(C11184g c11184g, String str, Locale locale) {
        int i;
        this.f29220a = null;
        this.f29222c = str;
        this.f29223d = locale;
        HashMap hashMap = new HashMap();
        while (true) {
            String m9025h = c11184g.m9025h();
            if (m9025h != null) {
                String trim = m9025h.trim();
                if (!trim.isEmpty() && trim.charAt(0) != '#') {
                    int length = trim.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (trim.charAt(i2) == '=' && (i = i2 + 1) < length) {
                                hashMap.put(trim.substring(0, i2), trim.substring(i));
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                }
            } else {
                this.f29221b = Collections.unmodifiableMap(hashMap);
                return;
            }
        }
    }

    /* renamed from: c */
    public static List<Locale> m9045c(Locale locale) {
        String m9048a = EnumC11179d.m9048a(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        LinkedList linkedList = new LinkedList();
        if (!variant.isEmpty()) {
            linkedList.add(new Locale(m9048a, country, variant));
        }
        if (!country.isEmpty()) {
            linkedList.add(new Locale(m9048a, country, ""));
        }
        if (!m9048a.isEmpty()) {
            linkedList.add(new Locale(m9048a, "", ""));
            if (m9048a.equals("nn")) {
                linkedList.add(new Locale("nb", "", ""));
            }
        }
        linkedList.add(Locale.ROOT);
        return linkedList;
    }

    /* renamed from: h */
    public static C11180e m9040h(String str, Locale locale) {
        C11180e c11180e;
        if (!str.isEmpty()) {
            if (locale != null) {
                C11182b c11182b = new C11182b(str, locale);
                C11181a c11181a = f29218e.get(c11182b);
                if (c11181a != null && (c11180e = c11181a.get()) != null) {
                    return c11180e;
                }
                while (true) {
                    Reference<? extends Object> poll = f29219f.poll();
                    if (poll == null) {
                        break;
                    }
                    f29218e.remove(((C11181a) poll).f29224a);
                }
                ArrayList arrayList = new ArrayList();
                for (Locale locale2 : m9045c(locale)) {
                    try {
                        C11180e m9039i = m9039i(str, locale2);
                        if (m9039i != null) {
                            arrayList.add(m9039i);
                        }
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (int size = arrayList.size() - 1; size >= 1; size--) {
                        int i = size - 1;
                        arrayList.set(i, ((C11180e) arrayList.get(i)).m9037k((C11180e) arrayList.get(size)));
                    }
                    C11180e c11180e2 = (C11180e) arrayList.get(0);
                    f29218e.putIfAbsent(c11182b, new C11181a(c11180e2, c11182b));
                    return c11180e2;
                }
                throw new MissingResourceException("Cannot find resource bundle for: " + m9038j(str, locale), C11180e.class.getName(), "");
            }
            throw new NullPointerException("Missing locale.");
        }
        throw new IllegalArgumentException("Base name must not be empty.");
    }

    /* renamed from: i */
    private static C11180e m9039i(String str, Locale locale) {
        C11184g c11184g;
        int indexOf = str.indexOf(47);
        String substring = str.substring(0, indexOf);
        String m9038j = m9038j(str.substring(indexOf + 1), locale);
        InputStream mo11024e = AbstractC10617d.m11026c().mo11024e(AbstractC10617d.m11026c().mo11023f(substring, C11180e.class, m9038j), true);
        C11180e c11180e = null;
        C11184g c11184g2 = null;
        if (mo11024e == null) {
            try {
                mo11024e = AbstractC10617d.m11026c().m11025d(C11180e.class, m9038j, true);
            } catch (IOException unused) {
                return null;
            }
        }
        if (mo11024e != null) {
            try {
                c11184g = new C11184g(mo11024e);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                c11180e = new C11180e(c11184g, str, locale);
                c11184g.close();
            } catch (Throwable th3) {
                th = th3;
                c11184g2 = c11184g;
                if (c11184g2 != null) {
                    c11184g2.close();
                }
                throw th;
            }
        }
        return c11180e;
    }

    /* renamed from: j */
    private static String m9038j(String str, Locale locale) {
        String m9048a = EnumC11179d.m9048a(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        StringBuilder sb2 = new StringBuilder(str.length() + 20);
        sb2.append(str.replace('.', '/'));
        if (!m9048a.isEmpty()) {
            sb2.append('_');
            sb2.append(m9048a);
            if (!variant.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
                sb2.append('_');
                sb2.append(variant);
            } else if (!country.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
            }
        }
        sb2.append(".properties");
        return sb2.toString();
    }

    /* renamed from: k */
    private C11180e m9037k(C11180e c11180e) {
        return c11180e == null ? this : new C11180e(this, c11180e);
    }

    /* renamed from: b */
    public boolean m9046b(String str) {
        if (str != null) {
            C11180e c11180e = this;
            while (c11180e.f29221b.get(str) == null) {
                c11180e = c11180e.f29220a;
                if (c11180e == null) {
                    return false;
                }
            }
            return true;
        }
        throw new NullPointerException("Missing resource key.");
    }

    /* renamed from: d */
    public Set<String> m9044d() {
        return this.f29221b.keySet();
    }

    /* renamed from: e */
    public Locale m9043e() {
        return this.f29223d;
    }

    /* renamed from: f */
    public String m9042f(String str) {
        if (str != null) {
            C11180e c11180e = this;
            do {
                String str2 = c11180e.f29221b.get(str);
                if (str2 != null) {
                    return str2;
                }
                c11180e = c11180e.f29220a;
            } while (c11180e != null);
            throw new MissingResourceException("Cannot find property resource for: " + m9038j(this.f29222c, this.f29223d) + "=>" + str, C11180e.class.getName(), str);
        }
        throw new NullPointerException("Missing resource key.");
    }

    /* renamed from: g */
    public Set<String> m9041g() {
        HashSet hashSet = new HashSet(this.f29221b.keySet());
        C11180e c11180e = this;
        while (true) {
            c11180e = c11180e.f29220a;
            if (c11180e != null) {
                hashSet.addAll(c11180e.f29221b.keySet());
            } else {
                return Collections.unmodifiableSet(hashSet);
            }
        }
    }

    private C11180e(C11180e c11180e, C11180e c11180e2) {
        this.f29220a = c11180e2;
        this.f29222c = c11180e.f29222c;
        this.f29223d = c11180e.f29223d;
        this.f29221b = c11180e.f29221b;
    }
}