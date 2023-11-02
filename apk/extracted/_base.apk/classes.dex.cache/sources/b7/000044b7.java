package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p162ij.AbstractC7635e;
import p162ij.AbstractC7665q;
import p162ij.C7672x;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7667s;
import p162ij.InterfaceC7668t;
import p162ij.InterfaceC7676z;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9014t;

/* renamed from: net.time4j.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10768k {

    /* renamed from: d */
    private static final SortedMap<C10711g0, String> f28105d;

    /* renamed from: e */
    private static C10768k f28106e;

    /* renamed from: f */
    private static final InterfaceC7631c<C10768k> f28107f;

    /* renamed from: a */
    private final transient Locale f28108a;

    /* renamed from: b */
    private final transient String f28109b;

    /* renamed from: c */
    private final transient SortedMap<C10711g0, String> f28110c;

    /* renamed from: net.time4j.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C10769a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28111a;

        static {
            int[] iArr = new int[EnumC9016v.values().length];
            f28111a = iArr;
            try {
                iArr[EnumC9016v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28111a[EnumC9016v.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: net.time4j.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10770b extends AbstractC7635e<String> implements InterfaceC9014t<String>, InterfaceC7676z<AbstractC7665q<?>, String> {
        private static final long serialVersionUID = 5589976208326940032L;

        /* renamed from: j */
        private final transient boolean f28112j;

        /* renamed from: k */
        private final transient C10768k f28113k;

        public C10770b(boolean z, Locale locale, String str) {
            this(z, C10768k.m10286r(locale, str));
        }

        /* renamed from: R */
        private String m10272R(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d, EnumC9003m enumC9003m) {
            Map map;
            String str;
            Map map2;
            String str2;
            String str3;
            String str4;
            boolean z;
            String m10293k;
            EnumC9003m enumC9003m2 = enumC9003m;
            ArrayList arrayList = new ArrayList();
            String str5 = "pm";
            String str6 = "am";
            if (this.f28112j) {
                arrayList.add("am");
                arrayList.add("pm");
                arrayList.add("midnight");
                arrayList.add("noon");
            } else {
                arrayList.addAll(new LinkedHashSet(this.f28113k.f28110c.values()));
                if (this.f28113k.m10288p()) {
                    arrayList.add("midnight");
                    arrayList.add("noon");
                }
            }
            if (this.f28113k.m10288p()) {
                map = C10768k.m10287q(m10279F(), m10269x());
            } else {
                map = null;
            }
            EnumC9016v enumC9016v = (EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE);
            boolean booleanValue = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23569j, Boolean.FALSE)).booleanValue();
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            Iterator it = arrayList.iterator();
            String str7 = null;
            int i = 0;
            while (it.hasNext()) {
                Iterator it2 = it;
                String str8 = (String) it.next();
                if (this.f28113k.m10288p()) {
                    if (this.f28112j) {
                        m10293k = C10768k.m10293k(map, enumC9016v, enumC9003m2, str8);
                        if (!map.containsKey(m10293k)) {
                            if (str8.equals("midnight")) {
                                m10293k = C10768k.m10293k(map, enumC9016v, enumC9003m2, str6);
                            } else if (str8.equals("noon")) {
                                m10293k = C10768k.m10293k(map, enumC9016v, enumC9003m2, str5);
                            }
                        }
                    } else {
                        m10293k = C10768k.m10293k(map, enumC9016v, enumC9003m2, str8);
                    }
                    if (map.containsKey(m10293k)) {
                        str = (String) map.get(m10293k);
                    } else {
                        str = null;
                    }
                } else {
                    str = str8;
                }
                if (str != null) {
                    int length2 = str.length();
                    map2 = map;
                    int i2 = index;
                    int i3 = 0;
                    boolean z2 = true;
                    while (z2 && i3 < length2) {
                        String str9 = str5;
                        int i4 = index + i3;
                        if (i4 >= length) {
                            str4 = str6;
                            z2 = false;
                        } else {
                            str4 = str6;
                            char charAt = charSequence.charAt(i4);
                            char charAt2 = str.charAt(i3);
                            if (booleanValue) {
                                z = m10270w(charAt, charAt2);
                            } else if (charAt == charAt2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                i2++;
                            }
                            z2 = z;
                        }
                        i3++;
                        str5 = str9;
                        str6 = str4;
                    }
                    str2 = str5;
                    str3 = str6;
                    if (!booleanValue2 && length2 != 1) {
                        if (z2) {
                            if (str7 != null) {
                                if (this.f28112j) {
                                    i = length2;
                                    str7 = null;
                                } else {
                                    str7 = str7 + "|" + str8;
                                    i = length2;
                                }
                            }
                            i = length2;
                            str7 = str8;
                        }
                    } else {
                        length2 = i2 - index;
                        if (i >= length2) {
                            if (str7 != null && i == length2) {
                                if (!this.f28112j) {
                                    str7 = str7 + "|" + str8;
                                }
                                str7 = null;
                            }
                        }
                        i = length2;
                        str7 = str8;
                    }
                } else {
                    map2 = map;
                    str2 = str5;
                    str3 = str6;
                }
                enumC9003m2 = enumC9003m;
                map = map2;
                it = it2;
                str5 = str2;
                str6 = str3;
            }
            if (str7 == null) {
                parsePosition.setErrorIndex(index);
            } else {
                parsePosition.setIndex(index + i);
            }
            return str7;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Serialization proxy required.");
        }

        /* renamed from: w */
        private boolean m10270w(char c, char c2) {
            if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a') + 65);
            }
            if (c2 >= 'a' && c2 <= 'z') {
                c2 = (char) ((c2 - 'a') + 65);
            }
            if (c >= 'A' && c <= 'Z') {
                if (c == c2) {
                    return true;
                }
                return false;
            }
            Locale m10279F = m10279F();
            return String.valueOf(c).toUpperCase(m10279F).equals(String.valueOf(c2).toUpperCase(m10279F));
        }

        private Object writeReplace() {
            return new SPX(this, 7);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: B */
        public InterfaceC7664p<?> mo9925c(AbstractC7665q<?> abstractC7665q) {
            return null;
        }

        /* renamed from: C */
        public Object m10282C() {
            return this.f28113k.f28110c;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: D */
        public String mo9551e() {
            if (this.f28112j) {
                return "pm";
            }
            return (String) this.f28113k.f28110c.get((C10711g0) this.f28113k.f28110c.lastKey());
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: E */
        public String mo9554U() {
            if (this.f28112j) {
                return "am";
            }
            return (String) this.f28113k.f28110c.get((C10711g0) this.f28113k.f28110c.firstKey());
        }

        /* renamed from: F */
        public Locale m10279F() {
            return this.f28113k.f28108a;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: I */
        public String mo9922f(AbstractC7665q<?> abstractC7665q) {
            return mo9551e();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: K */
        public String mo9917l(AbstractC7665q<?> abstractC7665q) {
            return mo9554U();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: L */
        public String mo9915o(AbstractC7665q<?> abstractC7665q) {
            String str;
            C10711g0 c10711g0 = (C10711g0) abstractC7665q.mo10212i(C10711g0.f27967y);
            if (this.f28112j) {
                return C10768k.m10290n(c10711g0);
            }
            if (this.f28113k.m10288p()) {
                Map m10287q = C10768k.m10287q(m10279F(), m10269x());
                if (c10711g0.m10618F0()) {
                    str = "midnight";
                } else if (c10711g0.m10617G0(C10711g0.m10613K0(12))) {
                    str = "noon";
                } else {
                    str = null;
                }
                if (str != null && m10287q.containsKey(C10768k.m10293k(m10287q, EnumC9016v.ABBREVIATED, EnumC9003m.FORMAT, str))) {
                    return str;
                }
            }
            return (String) this.f28113k.f28110c.get(this.f28113k.m10289o(c10711g0));
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: M */
        public boolean mo9555M() {
            return false;
        }

        /* renamed from: N */
        public boolean m10275N() {
            return this.f28112j;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: O */
        public boolean mo9920i(AbstractC7665q<?> abstractC7665q, String str) {
            return false;
        }

        @Override // p184jj.InterfaceC9014t
        /* renamed from: P */
        public String mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
            int index = parsePosition.getIndex();
            InterfaceC7631c<EnumC9003m> interfaceC7631c = C8969a.f23567h;
            EnumC9003m enumC9003m = EnumC9003m.FORMAT;
            EnumC9003m enumC9003m2 = (EnumC9003m) interfaceC7633d.mo14441b(interfaceC7631c, enumC9003m);
            String m10272R = m10272R(charSequence, parsePosition, interfaceC7633d, enumC9003m2);
            if (m10272R == null && ((Boolean) interfaceC7633d.mo14441b(C8969a.f23570k, Boolean.TRUE)).booleanValue()) {
                parsePosition.setErrorIndex(-1);
                parsePosition.setIndex(index);
                if (enumC9003m2 == enumC9003m) {
                    enumC9003m = EnumC9003m.STANDALONE;
                }
                return m10272R(charSequence, parsePosition, interfaceC7633d, enumC9003m);
            }
            return m10272R;
        }

        @Override // p184jj.InterfaceC9014t
        /* renamed from: Q */
        public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
            String apply;
            EnumC9016v enumC9016v = (EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE);
            EnumC9003m enumC9003m = (EnumC9003m) interfaceC7633d.mo14441b(C8969a.f23567h, EnumC9003m.FORMAT);
            if (this.f28112j) {
                apply = this.f28113k.m10292l(enumC9016v, enumC9003m).apply(interfaceC7662o);
            } else {
                apply = this.f28113k.m10294j(enumC9016v, enumC9003m).apply(interfaceC7662o);
            }
            appendable.append(apply);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: S */
        public AbstractC7665q<?> mo9916n(AbstractC7665q<?> abstractC7665q, String str, boolean z) {
            throw new IllegalArgumentException("Day period element cannot be set.");
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: V */
        public boolean mo9553V() {
            return true;
        }

        @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
        /* renamed from: a */
        public char mo9552a() {
            return this.f28112j ? 'b' : 'B';
        }

        @Override // p162ij.InterfaceC7664p
        public Class<String> getType() {
            return String.class;
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: p */
        public <T extends AbstractC7665q<T>> InterfaceC7676z<T, String> mo9901p(C7672x<T> c7672x) {
            if (c7672x.m20107w(C10711g0.f27967y)) {
                return this;
            }
            return null;
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: q */
        protected boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
            return this.f28113k.equals(((C10770b) abstractC7635e).f28113k);
        }

        @Override // p162ij.AbstractC7635e
        public String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(name());
            sb2.append('@');
            sb2.append(this.f28113k);
            return sb2.toString();
        }

        /* renamed from: x */
        public String m10269x() {
            return this.f28113k.f28109b;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: y */
        public InterfaceC7664p<?> mo9926b(AbstractC7665q<?> abstractC7665q) {
            return null;
        }

        public C10770b(boolean z, C10768k c10768k) {
            super(z ? "FIXED_DAY_PERIOD" : "APPROXIMATE_DAY_PERIOD");
            this.f28112j = z;
            this.f28113k = c10768k;
        }
    }

    /* renamed from: net.time4j.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10771c implements InterfaceC7667s {
        /* renamed from: e */
        private static C10768k m10267e(Locale locale, InterfaceC7633d interfaceC7633d) {
            if (interfaceC7633d.mo14442a(C10768k.f28107f)) {
                return (C10768k) interfaceC7633d.mo14440c(C10768k.f28107f);
            }
            return C10768k.m10286r(locale, (String) interfaceC7633d.mo14441b(C8969a.f23561b, "iso8601"));
        }

        /* renamed from: f */
        private static int m10266f(AbstractC7665q<?> abstractC7665q) {
            InterfaceC10622c<Integer, C10711g0> interfaceC10622c = C10711g0.f27932A;
            if (abstractC7665q.mo10210q(interfaceC10622c)) {
                int intValue = ((Integer) abstractC7665q.mo10212i(interfaceC10622c)).intValue();
                if (intValue == 12) {
                    return 0;
                }
                return intValue;
            }
            InterfaceC10773k0<Integer, C10711g0> interfaceC10773k0 = C10711g0.f27934C;
            if (abstractC7665q.mo10210q(interfaceC10773k0)) {
                return ((Integer) abstractC7665q.mo10212i(interfaceC10773k0)).intValue();
            }
            return -1;
        }

        @Override // p162ij.InterfaceC7667s
        /* renamed from: a */
        public boolean mo9075a(InterfaceC7664p<?> interfaceC7664p) {
            return interfaceC7664p instanceof C10770b;
        }

        @Override // p162ij.InterfaceC7667s
        /* renamed from: b */
        public Set<InterfaceC7664p<?>> mo9074b(Locale locale, InterfaceC7633d interfaceC7633d) {
            C10768k m10267e = m10267e(locale, interfaceC7633d);
            HashSet hashSet = new HashSet();
            hashSet.add(new C10770b(false, m10267e));
            if (!interfaceC7633d.mo14442a(C10768k.f28107f)) {
                hashSet.add(new C10770b(true, m10267e));
            }
            return Collections.unmodifiableSet(hashSet);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:159:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x012b A[LOOP:0: B:117:0x003f->B:180:0x012b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:192:0x011a A[EDGE_INSN: B:192:0x011a->B:176:0x011a ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:196:0x0115 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v2, types: [ij.q] */
        /* JADX WARN: Type inference failed for: r0v5, types: [ij.q, ij.q<?>] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        @Override // p162ij.InterfaceC7667s
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p162ij.AbstractC7665q<?> mo9073c(p162ij.AbstractC7665q<?> r17, java.util.Locale r18, p162ij.InterfaceC7633d r19) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10768k.C10771c.mo9073c(ij.q, java.util.Locale, ij.d):ij.q");
        }

        @Override // p162ij.InterfaceC7667s
        /* renamed from: d */
        public boolean mo9072d(Class<?> cls) {
            return C10711g0.class.isAssignableFrom(cls);
        }
    }

    /* renamed from: net.time4j.k$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C10772d implements InterfaceC7668t<InterfaceC7662o, String> {

        /* renamed from: a */
        private final boolean f28114a;

        /* renamed from: b */
        private final EnumC9016v f28115b;

        /* renamed from: c */
        private final EnumC9003m f28116c;

        C10772d(boolean z, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
            C10768k.this = r1;
            if (enumC9016v != null) {
                if (enumC9003m != null) {
                    this.f28114a = z;
                    this.f28115b = enumC9016v;
                    this.f28116c = enumC9003m;
                    return;
                }
                throw new NullPointerException("Missing output context.");
            }
            throw new NullPointerException("Missing text width.");
        }

        @Override // p162ij.InterfaceC7668t
        /* renamed from: a */
        public String apply(InterfaceC7662o interfaceC7662o) {
            C10711g0 c10711g0 = (C10711g0) interfaceC7662o.mo10212i(C10711g0.f27967y);
            C10768k c10768k = C10768k.this;
            Locale locale = c10768k.f28108a;
            if (this.f28114a) {
                String m10290n = C10768k.m10290n(c10711g0);
                if (c10768k.m10288p()) {
                    Map m10287q = C10768k.m10287q(locale, c10768k.f28109b);
                    String m10293k = C10768k.m10293k(m10287q, this.f28115b, this.f28116c, m10290n);
                    if (!m10287q.containsKey(m10293k)) {
                        if (m10290n.equals("midnight")) {
                            m10293k = C10768k.m10293k(m10287q, this.f28115b, this.f28116c, "am");
                        } else if (m10290n.equals("noon")) {
                            m10293k = C10768k.m10293k(m10287q, this.f28115b, this.f28116c, "pm");
                        }
                    }
                    if (m10287q.containsKey(m10293k)) {
                        return (String) m10287q.get(m10293k);
                    }
                } else {
                    return m10290n;
                }
            } else if (c10768k.m10288p()) {
                Map m10287q2 = C10768k.m10287q(locale, c10768k.f28109b);
                if (c10711g0.m10618F0()) {
                    String m10293k2 = C10768k.m10293k(m10287q2, this.f28115b, this.f28116c, "midnight");
                    if (m10287q2.containsKey(m10293k2)) {
                        return (String) m10287q2.get(m10293k2);
                    }
                } else if (c10711g0.m10617G0(C10711g0.m10613K0(12))) {
                    String m10293k3 = C10768k.m10293k(m10287q2, this.f28115b, this.f28116c, "noon");
                    if (m10287q2.containsKey(m10293k3)) {
                        return (String) m10287q2.get(m10293k3);
                    }
                }
                String m10293k4 = C10768k.m10293k(m10287q2, this.f28115b, this.f28116c, (String) c10768k.f28110c.get(c10768k.m10289o(c10711g0)));
                if (m10287q2.containsKey(m10293k4)) {
                    return (String) m10287q2.get(m10293k4);
                }
            } else {
                return (String) c10768k.f28110c.get(c10768k.m10289o(c10711g0));
            }
            EnumC10851z enumC10851z = (EnumC10851z) c10711g0.mo10212i(C10711g0.f27968z);
            if (locale == null) {
                locale = Locale.ROOT;
            }
            return enumC10851z.m9982a(locale);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        treeMap.put(C10711g0.m10614J0(), "am");
        treeMap.put(C10711g0.m10613K0(12), "pm");
        SortedMap<C10711g0, String> unmodifiableSortedMap = Collections.unmodifiableSortedMap(treeMap);
        f28105d = unmodifiableSortedMap;
        f28106e = new C10768k(Locale.ROOT, "iso8601", unmodifiableSortedMap);
        f28107f = C8969a.m16928e("CUSTOM_DAY_PERIOD", C10768k.class);
    }

    private C10768k(Locale locale, String str, SortedMap<C10711g0, String> sortedMap) {
        this.f28108a = locale;
        this.f28109b = str;
        this.f28110c = Collections.unmodifiableSortedMap(sortedMap);
    }

    /* renamed from: a */
    private static boolean m10303a(String str) {
        return str.charAt(0) == 'T' && str.length() == 5 && Character.isDigit(str.charAt(1));
    }

    /* renamed from: k */
    public static String m10293k(Map<String, String> map, EnumC9016v enumC9016v, EnumC9003m enumC9003m, String str) {
        if (enumC9016v == EnumC9016v.SHORT) {
            enumC9016v = EnumC9016v.ABBREVIATED;
        }
        String str2 = m10284t(enumC9016v, enumC9003m) + str;
        if (!map.containsKey(str2)) {
            if (enumC9003m == EnumC9003m.STANDALONE) {
                EnumC9016v enumC9016v2 = EnumC9016v.ABBREVIATED;
                if (enumC9016v == enumC9016v2) {
                    return m10293k(map, enumC9016v, EnumC9003m.FORMAT, str);
                }
                return m10293k(map, enumC9016v2, enumC9003m, str);
            }
            EnumC9016v enumC9016v3 = EnumC9016v.ABBREVIATED;
            if (enumC9016v != enumC9016v3) {
                return m10293k(map, enumC9016v3, enumC9003m, str);
            }
            return str2;
        }
        return str2;
    }

    /* renamed from: n */
    public static String m10290n(C10711g0 c10711g0) {
        int intValue = ((Integer) c10711g0.mo10212i(C10711g0.f27938G)).intValue();
        return (intValue == 0 || intValue == 1440) ? "midnight" : intValue < 720 ? "am" : intValue == 720 ? "noon" : "pm";
    }

    /* renamed from: p */
    public boolean m10288p() {
        return this.f28108a != null;
    }

    /* renamed from: q */
    public static Map<String, String> m10287q(Locale locale, String str) {
        Map<String, String> m16905m = C8972b.m16915c(str, locale).m16905m();
        if (!str.equals("iso8601") && !"true".equals(m16905m.get("hasDayPeriods"))) {
            return C8972b.m16914d(locale).m16905m();
        }
        return m16905m;
    }

    /* renamed from: r */
    static C10768k m10286r(Locale locale, String str) {
        String language = locale.getLanguage();
        if (language.equals("nn")) {
            locale = new Locale("nb");
        }
        Map<String, String> m10287q = m10287q(locale, str);
        TreeMap treeMap = new TreeMap();
        for (String str2 : m10287q.keySet()) {
            if (m10303a(str2)) {
                int parseInt = Integer.parseInt(str2.substring(1, 3));
                int parseInt2 = Integer.parseInt(str2.substring(3, 5));
                C10711g0 m10614J0 = C10711g0.m10614J0();
                if (parseInt == 24) {
                    if (parseInt2 != 0) {
                        throw new IllegalStateException("Invalid time key: " + str2);
                    }
                } else if (parseInt >= 0 && parseInt < 24 && parseInt2 >= 0 && parseInt2 < 60) {
                    m10614J0 = m10614J0.m20145L((parseInt * 60) + parseInt2, EnumC10704g.f27925k);
                } else {
                    throw new IllegalStateException("Invalid time key: " + str2);
                }
                treeMap.put(m10614J0, m10287q.get(str2));
            }
        }
        if (!treeMap.isEmpty() && !language.isEmpty()) {
            Iterator it = treeMap.keySet().iterator();
            String str3 = "";
            while (it.hasNext()) {
                String str4 = (String) treeMap.get((C10711g0) it.next());
                if (str4.equals(str3)) {
                    it.remove();
                } else {
                    str3 = str4;
                }
            }
            return new C10768k(locale, str, treeMap);
        }
        return f28106e;
    }

    /* renamed from: s */
    public static C10768k m10285s(Map<C10711g0, String> map) {
        if (!map.isEmpty()) {
            TreeMap treeMap = new TreeMap(map);
            for (C10711g0 c10711g0 : map.keySet()) {
                if (c10711g0.mo10479s() == 24) {
                    treeMap.put(C10711g0.m10614J0(), map.get(c10711g0));
                    treeMap.remove(c10711g0);
                } else if (map.get(c10711g0).isEmpty()) {
                    throw new IllegalArgumentException("Map has empty label: " + map);
                }
            }
            return new C10768k(null, "", treeMap);
        }
        throw new IllegalArgumentException("Label map is empty.");
    }

    /* renamed from: t */
    private static String m10284t(EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        char c;
        int i = C10769a.f28111a[enumC9016v.ordinal()];
        if (i != 1) {
            if (i != 2) {
                c = 'a';
            } else {
                c = 'n';
            }
        } else {
            c = 'w';
        }
        if (enumC9003m == EnumC9003m.STANDALONE) {
            c = Character.toUpperCase(c);
        }
        return "P(" + c + ")_";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10768k)) {
            return false;
        }
        C10768k c10768k = (C10768k) obj;
        Locale locale = this.f28108a;
        if (locale == null) {
            if (c10768k.f28108a != null) {
                return false;
            }
        } else if (!locale.equals(c10768k.f28108a)) {
            return false;
        }
        if (this.f28110c.equals(c10768k.f28110c) && this.f28109b.equals(c10768k.f28109b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f28110c.hashCode();
    }

    /* renamed from: j */
    public InterfaceC7668t<InterfaceC7662o, String> m10294j(EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return new C10772d(false, enumC9016v, enumC9003m);
    }

    /* renamed from: l */
    public InterfaceC7668t<InterfaceC7662o, String> m10292l(EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return new C10772d(true, enumC9016v, enumC9003m);
    }

    /* renamed from: m */
    public C10711g0 m10291m(C10711g0 c10711g0) {
        if (c10711g0.mo10479s() == 24) {
            c10711g0 = C10711g0.m10614J0();
        }
        for (C10711g0 c10711g02 : this.f28110c.keySet()) {
            if (c10711g0.m10621C0(c10711g02)) {
                return c10711g02;
            }
        }
        return this.f28110c.firstKey();
    }

    /* renamed from: o */
    public C10711g0 m10289o(C10711g0 c10711g0) {
        if (c10711g0.mo10479s() == 24) {
            c10711g0 = C10711g0.m10614J0();
        }
        C10711g0 lastKey = this.f28110c.lastKey();
        for (C10711g0 c10711g02 : this.f28110c.keySet()) {
            if (c10711g0.m10617G0(c10711g02)) {
                return c10711g02;
            }
            if (c10711g0.m10621C0(c10711g02)) {
                break;
            }
            lastKey = c10711g02;
        }
        return lastKey;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayPeriod[");
        if (m10288p()) {
            sb2.append("locale=");
            sb2.append(this.f28108a);
            sb2.append(',');
            if (!this.f28109b.equals("iso8601")) {
                sb2.append(",calendar-type=");
                sb2.append(this.f28109b);
                sb2.append(',');
            }
        }
        sb2.append(this.f28110c);
        sb2.append(']');
        return sb2.toString();
    }
}