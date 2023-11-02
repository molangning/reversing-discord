package p202kj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.time4j.base.InterfaceC10620f;
import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.EnumC10801d;
import net.time4j.p249tz.InterfaceC10808k;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p164j$.util.concurrent.ConcurrentHashMap;
import p184jj.C8969a;
import p184jj.EnumC8981g;
import p202kj.C9497g0;

/* renamed from: kj.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9489d0 implements InterfaceC9500h<InterfaceC10808k> {

    /* renamed from: p */
    private static final ConcurrentMap<Locale, C9490a> f25135p = new ConcurrentHashMap();

    /* renamed from: q */
    private static final ConcurrentMap<Locale, C9490a> f25136q = new ConcurrentHashMap();

    /* renamed from: j */
    private final boolean f25137j;

    /* renamed from: k */
    private final InterfaceC9500h<InterfaceC10808k> f25138k;

    /* renamed from: l */
    private final Set<InterfaceC10808k> f25139l;

    /* renamed from: m */
    private final EnumC8981g f25140m;

    /* renamed from: n */
    private final Locale f25141n;

    /* renamed from: o */
    private final int f25142o;

    /* renamed from: kj.d0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C9490a {

        /* renamed from: a */
        private final C9497g0 f25143a;

        /* renamed from: b */
        private final C9497g0 f25144b;

        C9490a(C9497g0 c9497g0, C9497g0 c9497g02) {
            this.f25143a = c9497g0;
            this.f25144b = c9497g02;
        }

        /* renamed from: a */
        void m14547a(CharSequence charSequence, int i, List<InterfaceC10808k> list, List<InterfaceC10808k> list2, int[] iArr) {
            String m14530f = this.f25143a.m14530f(charSequence, i);
            int length = m14530f.length();
            iArr[0] = i + length;
            String m14530f2 = this.f25144b.m14530f(charSequence, i);
            int length2 = m14530f2.length();
            iArr[1] = i + length2;
            if (length2 > length) {
                list2.addAll(this.f25144b.m14534b(m14530f2));
            } else if (length2 < length) {
                list.addAll(this.f25143a.m14534b(m14530f));
            } else if (length > 0) {
                list.addAll(this.f25143a.m14534b(m14530f));
                list2.addAll(this.f25144b.m14534b(m14530f2));
            }
        }
    }

    public C9489d0(boolean z) {
        this.f25137j = z;
        this.f25138k = new C9511n(z);
        this.f25139l = null;
        this.f25140m = EnumC8981g.SMART;
        this.f25141n = Locale.ROOT;
        this.f25142o = 0;
    }

    /* renamed from: a */
    private C9497g0 m14553a(Locale locale, boolean z) {
        EnumC10801d m14550j = m14550j(z);
        C9497g0.C9499b c9499b = null;
        for (InterfaceC10808k interfaceC10808k : AbstractC10809l.m10131t()) {
            String m10127x = AbstractC10809l.m10127x(interfaceC10808k, m14550j, locale);
            if (!m10127x.equals(interfaceC10808k.mo10035a())) {
                c9499b = C9497g0.m14532d(c9499b, m10127x, interfaceC10808k);
            }
        }
        return new C9497g0(c9499b);
    }

    /* renamed from: b */
    private static List<InterfaceC10808k> m14552b(List<InterfaceC10808k> list) {
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            int size = list.size();
            for (int i = 1; i < size; i++) {
                InterfaceC10808k interfaceC10808k = list.get(i);
                if (interfaceC10808k.mo10035a().startsWith("WINDOWS~")) {
                    arrayList.remove(interfaceC10808k);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    /* renamed from: i */
    private String m14551i(CharSequence charSequence, int i, int i2) {
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = charSequence.charAt(i3);
            if (!Character.isLetter(charAt) && (this.f25137j || i3 <= i || Character.isDigit(charAt))) {
                break;
            }
            sb2.append(charAt);
        }
        return sb2.toString().trim();
    }

    /* renamed from: j */
    private EnumC10801d m14550j(boolean z) {
        if (z) {
            if (this.f25137j) {
                return EnumC10801d.SHORT_DAYLIGHT_TIME;
            }
            return EnumC10801d.LONG_DAYLIGHT_TIME;
        } else if (this.f25137j) {
            return EnumC10801d.SHORT_STANDARD_TIME;
        } else {
            return EnumC10801d.LONG_STANDARD_TIME;
        }
    }

    /* renamed from: k */
    private List<InterfaceC10808k> m14549k(List<InterfaceC10808k> list, Locale locale, EnumC8981g enumC8981g) {
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("DEFAULT", new ArrayList());
        Iterator<InterfaceC10808k> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String mo10035a = it.next().mo10035a();
            Set<InterfaceC10808k> set = this.f25139l;
            int indexOf = mo10035a.indexOf(126);
            if (indexOf < 0) {
                str = "DEFAULT";
            } else {
                str = mo10035a.substring(0, indexOf);
            }
            if (set == null) {
                set = AbstractC10809l.m10160C(locale, enumC8981g.m16888b(), str);
            }
            Iterator<InterfaceC10808k> it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC10808k next = it2.next();
                    if (next.mo10035a().equals(mo10035a)) {
                        List list2 = (List) hashMap.get(str);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hashMap.put(str, list2);
                        }
                        list2.add(next);
                    }
                }
            }
        }
        List<InterfaceC10808k> list3 = (List) hashMap.get("DEFAULT");
        if (list3.isEmpty()) {
            hashMap.remove("DEFAULT");
            Iterator it3 = hashMap.keySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                List<InterfaceC10808k> list4 = (List) hashMap.get((String) it3.next());
                if (!list4.isEmpty()) {
                    z = true;
                    list = list4;
                    break;
                }
            }
            if (!z) {
                list = Collections.emptyList();
            }
            return list;
        }
        return list3;
    }

    /* renamed from: l */
    private static String m14548l(List<InterfaceC10808k> list) {
        StringBuilder sb2 = new StringBuilder(list.size() * 16);
        sb2.append('{');
        boolean z = true;
        for (InterfaceC10808k interfaceC10808k : list) {
            if (z) {
                z = false;
            } else {
                sb2.append(',');
            }
            sb2.append(interfaceC10808k.mo10035a());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<InterfaceC10808k> mo14365c() {
        return EnumC9478b0.TIMEZONE_ID;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        Locale locale;
        int i;
        if (interfaceC7662o.mo10217d()) {
            InterfaceC10808k mo10209t = interfaceC7662o.mo10209t();
            if (mo10209t instanceof C10835p) {
                return this.f25138k.mo14364d(interfaceC7662o, appendable, interfaceC7633d, set, z);
            }
            if (interfaceC7662o instanceof InterfaceC10620f) {
                AbstractC10809l m10149N = AbstractC10809l.m10149N(mo10209t);
                EnumC10801d m14550j = m14550j(m10149N.mo10154I((InterfaceC10620f) InterfaceC10620f.class.cast(interfaceC7662o)));
                if (z) {
                    locale = this.f25141n;
                } else {
                    locale = (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT);
                }
                String mo10128w = m10149N.mo10128w(m14550j, locale);
                if (appendable instanceof CharSequence) {
                    i = ((CharSequence) appendable).length();
                } else {
                    i = -1;
                }
                appendable.append(mo10128w);
                int length = mo10128w.length();
                if (i != -1 && length > 0 && set != null) {
                    set.add(new C9496g(EnumC9478b0.TIMEZONE_ID, i, i + length));
                }
                return length;
            }
            throw new IllegalArgumentException("Cannot extract timezone name from: " + interfaceC7662o);
        }
        throw new IllegalArgumentException("Cannot extract timezone name from: " + interfaceC7662o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0216, code lost:
        if (r4 != false) goto L88;
     */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo14363e(java.lang.CharSequence r19, p202kj.C9518s r20, p162ij.InterfaceC7633d r21, p202kj.AbstractC9519t<?> r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9489d0.mo14363e(java.lang.CharSequence, kj.s, ij.d, kj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9489d0)) {
            return false;
        }
        C9489d0 c9489d0 = (C9489d0) obj;
        if (this.f25137j == c9489d0.f25137j) {
            Set<InterfaceC10808k> set = this.f25139l;
            Set<InterfaceC10808k> set2 = c9489d0.f25139l;
            if (set == null) {
                if (set2 == null) {
                    return true;
                }
            } else if (set.equals(set2)) {
                return true;
            }
        }
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<InterfaceC10808k> mo14361g(InterfaceC7664p<InterfaceC10808k> interfaceC7664p) {
        return this;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<InterfaceC10808k> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        return new C9489d0(this.f25137j, this.f25138k, this.f25139l, (EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART), (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT), ((Integer) interfaceC7633d.mo14441b(C8969a.f23578s, 0)).intValue());
    }

    public int hashCode() {
        Set<InterfaceC10808k> set = this.f25139l;
        return (set == null ? 0 : set.hashCode()) + (this.f25137j ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9489d0.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f25137j);
        sb2.append(", preferredZones=");
        sb2.append(this.f25139l);
        sb2.append(']');
        return sb2.toString();
    }

    private C9489d0(boolean z, InterfaceC9500h<InterfaceC10808k> interfaceC9500h, Set<InterfaceC10808k> set, EnumC8981g enumC8981g, Locale locale, int i) {
        this.f25137j = z;
        this.f25138k = interfaceC9500h;
        this.f25139l = set;
        this.f25140m = enumC8981g;
        this.f25141n = locale;
        this.f25142o = i;
    }
}