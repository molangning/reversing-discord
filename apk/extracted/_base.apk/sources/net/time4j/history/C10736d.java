package net.time4j.history;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.C10697f0;
import net.time4j.EnumC10686f;
import p162ij.EnumC7627a0;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7663o0;
import p162ij.InterfaceC7664p;
import p184jj.C8969a;
import p184jj.InterfaceC9014t;
import p202kj.C9504l;
import p235mj.EnumC10476a;
import p251nj.EnumC10916b;

/* renamed from: net.time4j.history.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10736d implements InterfaceC7663o0, Serializable {

    /* renamed from: A */
    public static final C10736d f28011A;

    /* renamed from: B */
    public static final C10736d f28012B;

    /* renamed from: C */
    private static final long f28013C;

    /* renamed from: D */
    private static final C10736d f28014D;

    /* renamed from: E */
    private static final C10736d f28015E;

    /* renamed from: F */
    private static final Map<String, C10736d> f28016F;
    private static final long serialVersionUID = 4100690610730913643L;

    /* renamed from: y */
    public static final InterfaceC7631c<EnumC10476a> f28017y = C8969a.m16928e("YEAR_DEFINITION", EnumC10476a.class);

    /* renamed from: z */
    public static final C10736d f28018z;

    /* renamed from: j */
    private final transient EnumC10916b f28019j;

    /* renamed from: k */
    private final transient List<C10739f> f28020k;

    /* renamed from: l */
    private final transient C10729a f28021l;

    /* renamed from: m */
    private final transient C10761o f28022m;

    /* renamed from: n */
    private final transient C10740g f28023n;

    /* renamed from: o */
    private final transient InterfaceC7664p<C10741h> f28024o;

    /* renamed from: p */
    private final transient InterfaceC7664p<EnumC10744j> f28025p;

    /* renamed from: q */
    private final transient InterfaceC9014t<Integer> f28026q;

    /* renamed from: r */
    private final transient InterfaceC7664p<Integer> f28027r;

    /* renamed from: s */
    private final transient InterfaceC7664p<Integer> f28028s;

    /* renamed from: t */
    private final transient InterfaceC9014t<Integer> f28029t;

    /* renamed from: u */
    private final transient InterfaceC9014t<Integer> f28030u;

    /* renamed from: v */
    private final transient InterfaceC9014t<Integer> f28031v;

    /* renamed from: w */
    private final transient InterfaceC7664p<Integer> f28032w;

    /* renamed from: x */
    private final transient Set<InterfaceC7664p<?>> f28033x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.history.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C10737a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28034a;

        /* renamed from: b */
        static final /* synthetic */ int[] f28035b;

        /* renamed from: c */
        static final /* synthetic */ int[] f28036c;

        static {
            int[] iArr = new int[EnumC10476a.values().length];
            f28036c = iArr;
            try {
                iArr[EnumC10476a.DUAL_DATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28036c[EnumC10476a.AFTER_NEW_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28036c[EnumC10476a.BEFORE_NEW_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC10744j.values().length];
            f28035b = iArr2;
            try {
                iArr2[EnumC10744j.HISPANIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28035b[EnumC10744j.BYZANTINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28035b[EnumC10744j.AB_URBE_CONDITA.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[EnumC10916b.values().length];
            f28034a = iArr3;
            try {
                iArr3[EnumC10916b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28034a[EnumC10916b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28034a[EnumC10916b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28034a[EnumC10916b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28034a[EnumC10916b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28034a[EnumC10916b.SINGLE_CUTOVER_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        EnumC10916b enumC10916b = EnumC10916b.PROLEPTIC_GREGORIAN;
        EnumC10732c enumC10732c = EnumC10732c.f28007j;
        f28018z = new C10736d(enumC10916b, Collections.singletonList(new C10739f(Long.MIN_VALUE, enumC10732c, enumC10732c)));
        EnumC10916b enumC10916b2 = EnumC10916b.PROLEPTIC_JULIAN;
        EnumC10732c enumC10732c2 = EnumC10732c.f28008k;
        C10736d c10736d = new C10736d(enumC10916b2, Collections.singletonList(new C10739f(Long.MIN_VALUE, enumC10732c2, enumC10732c2)));
        f28011A = c10736d;
        EnumC10916b enumC10916b3 = EnumC10916b.PROLEPTIC_BYZANTINE;
        List singletonList = Collections.singletonList(new C10739f(Long.MIN_VALUE, enumC10732c2, enumC10732c2));
        EnumC10751n enumC10751n = EnumC10751n.f28070l;
        f28012B = new C10736d(enumC10916b3, singletonList, null, new C10761o(enumC10751n, ViewDefaults.NUMBER_OF_LINES), C10740g.m10391c(C10697f0.m10673w0().m20171N()));
        long longValue = ((Long) C10697f0.m10713M0(1582, 10, 15).mo10212i(EnumC7627a0.MODIFIED_JULIAN_DATE)).longValue();
        f28013C = longValue;
        f28014D = m10428F(longValue);
        ArrayList arrayList = new ArrayList();
        EnumC10732c enumC10732c3 = EnumC10732c.f28009l;
        arrayList.add(new C10739f(-57959L, enumC10732c2, enumC10732c3));
        arrayList.add(new C10739f(-53575L, enumC10732c3, enumC10732c2));
        arrayList.add(new C10739f(-38611L, enumC10732c2, enumC10732c));
        C10736d c10736d2 = new C10736d(EnumC10916b.SWEDEN, Collections.unmodifiableList(arrayList));
        f28015E = c10736d2;
        HashMap hashMap = new HashMap();
        EnumC10744j enumC10744j = EnumC10744j.AD;
        C10697f0 m10417d = c10736d.m10417d(C10741h.m10379g(enumC10744j, 988, 3, 1));
        C10697f0 m10417d2 = c10736d.m10417d(C10741h.m10379g(enumC10744j, 1382, 12, 24));
        C10697f0 m10417d3 = c10736d.m10417d(C10741h.m10379g(enumC10744j, 1421, 12, 24));
        C10697f0 m10417d4 = c10736d.m10417d(C10741h.m10379g(enumC10744j, 1699, 12, 31));
        C10736d m10429E = m10429E();
        EnumC10751n enumC10751n2 = EnumC10751n.f28068j;
        C10761o m10326d = enumC10751n2.m10326d(1383);
        EnumC10751n enumC10751n3 = EnumC10751n.f28071m;
        hashMap.put("ES", m10429E.m10423K(m10326d.m10321b(enumC10751n3.m10326d(1556))).m10424J(C10740g.m10388f(m10417d2)));
        hashMap.put("PT", m10429E().m10423K(enumC10751n2.m10326d(1422).m10321b(enumC10751n3.m10326d(1556))).m10424J(C10740g.m10388f(m10417d3)));
        hashMap.put("FR", m10427G(C10697f0.m10713M0(1582, 12, 20)).m10423K(EnumC10751n.f28072n.m10326d(1567)));
        hashMap.put("DE", m10429E().m10423K(enumC10751n3.m10326d(1544)));
        hashMap.put("DE-BAYERN", m10427G(C10697f0.m10713M0(1583, 10, 16)).m10423K(enumC10751n3.m10326d(1544)));
        hashMap.put("DE-PREUSSEN", m10427G(C10697f0.m10713M0(1610, 9, 2)).m10423K(enumC10751n3.m10326d(1559)));
        hashMap.put("DE-PROTESTANT", m10427G(C10697f0.m10713M0(1700, 3, 1)).m10423K(enumC10751n3.m10326d(1559)));
        hashMap.put("NL", m10427G(C10697f0.m10713M0(1583, 1, 1)));
        hashMap.put("AT", m10427G(C10697f0.m10713M0(1584, 1, 17)));
        hashMap.put("CH", m10427G(C10697f0.m10713M0(1584, 1, 22)));
        hashMap.put("HU", m10427G(C10697f0.m10713M0(1587, 11, 1)));
        C10736d m10427G = m10427G(C10697f0.m10713M0(1700, 3, 1));
        EnumC10751n enumC10751n4 = EnumC10751n.f28074p;
        hashMap.put("DK", m10427G.m10423K(enumC10751n4.m10326d(1623)));
        hashMap.put("NO", m10427G(C10697f0.m10713M0(1700, 3, 1)).m10423K(enumC10751n4.m10326d(1623)));
        hashMap.put("IT", m10429E().m10423K(enumC10751n3.m10326d(1583)));
        hashMap.put("IT-FLORENCE", m10429E().m10423K(enumC10751n4.m10326d(1749)));
        hashMap.put("IT-PISA", m10429E().m10423K(EnumC10751n.f28075q.m10326d(1749)));
        C10736d m10429E2 = m10429E();
        EnumC10751n enumC10751n5 = EnumC10751n.f28069k;
        hashMap.put("IT-VENICE", m10429E2.m10423K(enumC10751n5.m10326d(1798)));
        hashMap.put("GB", m10427G(C10697f0.m10713M0(1752, 9, 14)).m10423K(enumC10751n3.m10326d(1087).m10321b(enumC10751n2.m10326d(1155)).m10321b(enumC10751n4.m10326d(1752))));
        hashMap.put("GB-SCT", m10427G(C10697f0.m10713M0(1752, 9, 14)).m10423K(enumC10751n3.m10326d(1087).m10321b(enumC10751n2.m10326d(1155)).m10321b(enumC10751n4.m10326d(1600))));
        hashMap.put("RU", m10427G(C10697f0.m10713M0(1918, 2, 14)).m10423K(enumC10751n2.m10326d(988).m10321b(enumC10751n5.m10326d(1493)).m10321b(enumC10751n.m10326d(1700))).m10424J(C10740g.m10392b(m10417d, m10417d4)));
        hashMap.put("SE", c10736d2);
        f28016F = Collections.unmodifiableMap(hashMap);
    }

    private C10736d(EnumC10916b enumC10916b, List<C10739f> list) {
        this(enumC10916b, list, null, null, C10740g.f28044d);
    }

    /* renamed from: A */
    private boolean m10433A(C10741h c10741h) {
        int m10367a = c10741h.m10383c().m10367a(c10741h.m10381e());
        if (this == f28012B) {
            if (m10367a >= -5508 && ((m10367a != -5508 || c10741h.m10382d() >= 9) && m10367a <= 999979465)) {
                return false;
            }
            return true;
        } else if (this == f28011A) {
            if (Math.abs(m10367a) <= 999979465) {
                return false;
            }
            return true;
        } else if (this == f28018z) {
            if (Math.abs(m10367a) <= 999999999) {
                return false;
            }
            return true;
        } else if (m10367a >= -44 && m10367a <= 9999) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: D */
    public static C10736d m10430D(Locale locale) {
        C10736d c10736d;
        String country = locale.getCountry();
        if (!locale.getVariant().isEmpty()) {
            country = country + "-" + locale.getVariant();
            c10736d = f28016F.get(country);
        } else {
            c10736d = null;
        }
        if (c10736d == null) {
            c10736d = f28016F.get(country);
        }
        if (c10736d == null) {
            return m10429E();
        }
        return c10736d;
    }

    /* renamed from: E */
    public static C10736d m10429E() {
        return f28014D;
    }

    /* renamed from: F */
    private static C10736d m10428F(long j) {
        EnumC10916b enumC10916b;
        if (j == f28013C) {
            enumC10916b = EnumC10916b.INTRODUCTION_ON_1582_10_15;
        } else {
            enumC10916b = EnumC10916b.SINGLE_CUTOVER_DATE;
        }
        return new C10736d(enumC10916b, Collections.singletonList(new C10739f(j, EnumC10732c.f28008k, EnumC10732c.f28007j)));
    }

    /* renamed from: G */
    public static C10736d m10427G(C10697f0 c10697f0) {
        if (c10697f0.equals(C10697f0.m10673w0().m20171N())) {
            return f28011A;
        }
        if (c10697f0.equals(C10697f0.m10673w0().m20170O())) {
            return f28018z;
        }
        long longValue = ((Long) c10697f0.mo10212i(EnumC7627a0.MODIFIED_JULIAN_DATE)).longValue();
        m10418c(longValue);
        if (longValue == f28013C) {
            return f28014D;
        }
        return m10428F(longValue);
    }

    /* renamed from: H */
    public static C10736d m10426H() {
        return f28015E;
    }

    /* renamed from: c */
    private static void m10418c(long j) {
        if (j >= f28013C) {
            return;
        }
        throw new IllegalArgumentException("Gregorian calendar did not exist before 1582-10-15");
    }

    /* renamed from: j */
    public static C10736d m10411j(String str) {
        C10736d m10426H;
        int i;
        C10736d m10424J;
        int i2;
        if (str.startsWith("historic-")) {
            String[] split = str.substring(9).split(":");
            if (split.length != 0) {
                EnumC10916b valueOf = EnumC10916b.valueOf(split[0]);
                switch (C10737a.f28034a[valueOf.ordinal()]) {
                    case 1:
                        return f28018z;
                    case 2:
                        return f28011A;
                    case 3:
                        return f28012B;
                    case 4:
                        m10426H = m10426H();
                        i = 1;
                        break;
                    case 5:
                        if (m10402s(split, str).equals(C10697f0.m10713M0(1582, 10, 15))) {
                            m10426H = m10429E();
                            i = 2;
                            break;
                        } else {
                            throw new IllegalArgumentException("Inconsistent cutover date: " + str);
                        }
                    case 6:
                        m10426H = m10427G(m10402s(split, str));
                        i = 2;
                        break;
                    default:
                        throw new UnsupportedOperationException(valueOf.name());
                }
                String[] split2 = split[i].split("=");
                if (split2[0].equals("ancient-julian-leap-years")) {
                    String str2 = split2[1];
                    String substring = str2.substring(1, str2.length() - 1);
                    if (!substring.isEmpty()) {
                        String[] split3 = substring.split(",");
                        int[] iArr = new int[split3.length];
                        for (int i3 = 0; i3 < split3.length; i3++) {
                            iArr[i3] = 1 - Integer.parseInt(split3[i3]);
                        }
                        m10426H = m10426H.m10425I(C10729a.m10443f(iArr));
                    }
                }
                String[] split4 = split[i + 1].split("=");
                if (split4[0].equals("new-year-strategy")) {
                    String str3 = split4[1];
                    C10761o c10761o = null;
                    for (String str4 : str3.substring(1, str3.length() - 1).split(",")) {
                        String[] split5 = str4.split("->");
                        EnumC10751n valueOf2 = EnumC10751n.valueOf(split5[0]);
                        if (split5.length == 2) {
                            i2 = Integer.parseInt(split5[1]);
                        } else {
                            i2 = ViewDefaults.NUMBER_OF_LINES;
                        }
                        if (c10761o == null) {
                            if (valueOf2 != EnumC10751n.f28068j || i2 != 567) {
                                c10761o = valueOf2.m10326d(i2);
                            }
                        } else {
                            c10761o = c10761o.m10321b(valueOf2.m10326d(i2));
                        }
                    }
                    m10426H = m10426H.m10423K(c10761o);
                }
                String[] split6 = split[i + 2].split("=");
                if (split6[0].equals("era-preference")) {
                    String str5 = split6[1];
                    String substring2 = str5.substring(1, str5.length() - 1);
                    if (!substring2.equals("default")) {
                        String[] split7 = substring2.split(",");
                        try {
                            EnumC10744j valueOf3 = EnumC10744j.valueOf(split7[0].substring(5));
                            C10697f0 m14477i = C9504l.m14477i(split7[1].substring(7));
                            C10697f0 m14477i2 = C9504l.m14477i(split7[2].substring(5));
                            int i4 = C10737a.f28035b[valueOf3.ordinal()];
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 == 3) {
                                        m10424J = m10426H.m10424J(C10740g.m10393a(m14477i, m14477i2));
                                    } else {
                                        throw new IllegalArgumentException("BC/AD not allowed as era preference: " + str);
                                    }
                                } else {
                                    m10424J = m10426H.m10424J(C10740g.m10392b(m14477i, m14477i2));
                                }
                            } else {
                                m10424J = m10426H.m10424J(C10740g.m10389e(m14477i, m14477i2));
                            }
                            return m10424J;
                        } catch (ParseException unused) {
                            throw new IllegalArgumentException("Invalid date syntax: " + str);
                        }
                    }
                    return m10426H;
                }
                return m10426H;
            }
            throw new IllegalArgumentException("Invalid variant description.");
        }
        throw new IllegalArgumentException("Variant does not start with \"historic-\": " + str);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: s */
    private static C10697f0 m10402s(String[] strArr, String str) {
        String[] split = strArr[1].split("=");
        if (split.length == 2) {
            if (split[0].equals("cutover")) {
                try {
                    return C9504l.f25205m.m14659D(split[1]);
                } catch (ParseException unused) {
                }
            }
            throw new IllegalArgumentException("Invalid cutover definition: " + str);
        }
        throw new IllegalArgumentException("Invalid syntax in variant description: " + str);
    }

    /* renamed from: u */
    private InterfaceC10731b m10400u() {
        C10729a c10729a = this.f28021l;
        if (c10729a != null) {
            return c10729a.m10445d();
        }
        return EnumC10732c.f28008k;
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    /* renamed from: z */
    private static boolean m10395z(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: B */
    public boolean m10432B(C10741h c10741h) {
        InterfaceC10731b m10410k;
        if (c10741h == null || m10433A(c10741h) || (m10410k = m10410k(c10741h)) == null || !m10410k.mo10434d(c10741h)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public InterfaceC9014t<Integer> m10431C() {
        return this.f28029t;
    }

    /* renamed from: I */
    public C10736d m10425I(C10729a c10729a) {
        if (c10729a != null) {
            if (!m10396y()) {
                return this;
            }
            return new C10736d(this.f28019j, this.f28020k, c10729a, this.f28022m, this.f28023n);
        }
        throw new NullPointerException("Missing ancient julian leap years.");
    }

    /* renamed from: J */
    public C10736d m10424J(C10740g c10740g) {
        if (!c10740g.equals(this.f28023n) && m10396y()) {
            return new C10736d(this.f28019j, this.f28020k, this.f28021l, this.f28022m, c10740g);
        }
        return this;
    }

    /* renamed from: K */
    public C10736d m10423K(C10761o c10761o) {
        if (c10761o.equals(C10761o.f28078d)) {
            if (this.f28022m == null) {
                return this;
            }
            return new C10736d(this.f28019j, this.f28020k, this.f28021l, null, this.f28023n);
        } else if (!m10396y()) {
            return this;
        } else {
            return new C10736d(this.f28019j, this.f28020k, this.f28021l, c10761o, this.f28023n);
        }
    }

    /* renamed from: L */
    public InterfaceC7664p<Integer> m10422L(EnumC10476a enumC10476a) {
        int i = C10737a.f28036c[enumC10476a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.f28028s;
                }
                throw new UnsupportedOperationException(enumC10476a.name());
            }
            return this.f28027r;
        }
        return this.f28026q;
    }

    /* renamed from: M */
    public InterfaceC9014t<Integer> m10421M() {
        return this.f28026q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C10741h m10420a(C10741h c10741h) {
        InterfaceC10731b m10410k = m10410k(c10741h);
        if (m10410k == null) {
            return c10741h;
        }
        int mo10436b = m10410k.mo10436b(c10741h);
        if (mo10436b < c10741h.m10384b()) {
            return C10741h.m10379g(c10741h.m10383c(), c10741h.m10381e(), c10741h.m10382d(), mo10436b);
        }
        return c10741h;
    }

    /* renamed from: b */
    public InterfaceC7664p<Integer> m10419b() {
        return this.f28032w;
    }

    /* renamed from: d */
    public C10697f0 m10417d(C10741h c10741h) {
        if (!m10433A(c10741h)) {
            InterfaceC10731b m10410k = m10410k(c10741h);
            if (m10410k != null) {
                return C10697f0.m10707R0(m10410k.mo10437a(c10741h), EnumC7627a0.MODIFIED_JULIAN_DATE);
            }
            throw new IllegalArgumentException("Invalid historic date: " + c10741h);
        }
        throw new IllegalArgumentException("Out of supported range: " + c10741h);
    }

    /* renamed from: e */
    public C10741h m10416e(C10697f0 c10697f0) {
        C10741h c10741h;
        long longValue = ((Long) c10697f0.mo10212i(EnumC7627a0.MODIFIED_JULIAN_DATE)).longValue();
        int size = this.f28020k.size() - 1;
        while (true) {
            if (size >= 0) {
                C10739f c10739f = this.f28020k.get(size);
                if (longValue >= c10739f.f28040a) {
                    c10741h = c10739f.f28041b.mo10435c(longValue);
                    break;
                }
                size--;
            } else {
                c10741h = null;
                break;
            }
        }
        if (c10741h == null) {
            c10741h = m10400u().mo10435c(longValue);
        }
        EnumC10744j m10390d = this.f28023n.m10390d(c10741h, c10697f0);
        if (m10390d != c10741h.m10383c()) {
            c10741h = C10741h.m10379g(m10390d, m10390d.m10366b(c10741h.m10383c(), c10741h.m10381e()), c10741h.m10382d(), c10741h.m10384b());
        }
        if (!m10433A(c10741h)) {
            return c10741h;
        }
        throw new IllegalArgumentException("Out of supported range: " + c10741h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10736d) {
            C10736d c10736d = (C10736d) obj;
            if (this.f28019j == c10736d.f28019j && m10395z(this.f28021l, c10736d.f28021l) && m10395z(this.f28022m, c10736d.f28022m) && this.f28023n.equals(c10736d.f28023n)) {
                if (this.f28019j != EnumC10916b.SINGLE_CUTOVER_DATE || this.f28020k.get(0).f28040a == c10736d.f28020k.get(0).f28040a) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    public InterfaceC7664p<C10741h> m10415f() {
        return this.f28024o;
    }

    /* renamed from: g */
    public InterfaceC7664p<Integer> m10414g() {
        return this.f28030u;
    }

    /* renamed from: h */
    public InterfaceC7664p<Integer> m10413h() {
        return this.f28031v;
    }

    public int hashCode() {
        EnumC10916b enumC10916b = this.f28019j;
        if (enumC10916b == EnumC10916b.SINGLE_CUTOVER_DATE) {
            long j = this.f28020k.get(0).f28040a;
            return (int) (j ^ (j << 32));
        }
        return enumC10916b.hashCode();
    }

    /* renamed from: i */
    public InterfaceC7664p<EnumC10744j> m10412i() {
        return this.f28025p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public InterfaceC10731b m10410k(C10741h c10741h) {
        for (int size = this.f28020k.size() - 1; size >= 0; size--) {
            C10739f c10739f = this.f28020k.get(size);
            if (c10741h.compareTo(c10739f.f28042c) >= 0) {
                return c10739f.f28041b;
            }
            if (c10741h.compareTo(c10739f.f28043d) > 0) {
                return null;
            }
        }
        return m10400u();
    }

    /* renamed from: l */
    public C10729a m10409l() {
        C10729a c10729a = this.f28021l;
        if (c10729a != null) {
            return c10729a;
        }
        throw new UnsupportedOperationException("No historic julian leap years were defined.");
    }

    /* renamed from: m */
    public C10741h m10408m(EnumC10744j enumC10744j, int i) {
        C10741h m10319d = m10398w().m10319d(enumC10744j, i);
        if (m10432B(m10319d)) {
            EnumC10744j m10390d = this.f28023n.m10390d(m10319d, m10417d(m10319d));
            if (m10390d != enumC10744j) {
                return C10741h.m10379g(m10390d, m10390d.m10366b(m10319d.m10383c(), m10319d.m10381e()), m10319d.m10382d(), m10319d.m10384b());
            }
            return m10319d;
        }
        throw new IllegalArgumentException("Cannot determine valid New Year: " + enumC10744j + "-" + i);
    }

    @Override // p162ij.InterfaceC7663o0
    /* renamed from: n */
    public String mo10407n() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("historic-");
        sb2.append(this.f28019j.name());
        int i = C10737a.f28034a[this.f28019j.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 5 || i == 6) {
                sb2.append(":cutover=");
                sb2.append(m10403r());
            }
            sb2.append(":ancient-julian-leap-years=");
            C10729a c10729a = this.f28021l;
            if (c10729a != null) {
                int[] m10444e = c10729a.m10444e();
                sb2.append('[');
                sb2.append(m10444e[0]);
                for (int i2 = 1; i2 < m10444e.length; i2++) {
                    sb2.append(',');
                    sb2.append(m10444e[i2]);
                }
                sb2.append(']');
            } else {
                sb2.append("[]");
            }
            sb2.append(":new-year-strategy=");
            sb2.append(m10398w());
            sb2.append(":era-preference=");
            sb2.append(m10405p());
        } else {
            sb2.append(":no-cutover");
        }
        return sb2.toString();
    }

    /* renamed from: o */
    public Set<InterfaceC7664p<?>> m10406o() {
        return this.f28033x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C10740g m10405p() {
        return this.f28023n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public List<C10739f> m10404q() {
        return this.f28020k;
    }

    /* renamed from: r */
    public C10697f0 m10403r() {
        List<C10739f> list = this.f28020k;
        long j = list.get(list.size() - 1).f28040a;
        if (j != Long.MIN_VALUE) {
            return C10697f0.m10707R0(j, EnumC7627a0.MODIFIED_JULIAN_DATE);
        }
        throw new UnsupportedOperationException("Proleptic history without any gregorian reform date.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public EnumC10916b m10401t() {
        return this.f28019j;
    }

    public String toString() {
        return "ChronoHistory[" + mo10407n() + "]";
    }

    /* renamed from: v */
    public int m10399v(EnumC10744j enumC10744j, int i) {
        C10741h m10319d;
        C10741h c10741h;
        try {
            C10761o c10761o = this.f28022m;
            int i2 = 1;
            if (c10761o == null) {
                m10319d = C10741h.m10379g(enumC10744j, i, 1, 1);
                c10741h = C10741h.m10379g(enumC10744j, i, 12, 31);
            } else {
                m10319d = c10761o.m10319d(enumC10744j, i);
                if (enumC10744j == EnumC10744j.BC) {
                    if (i == 1) {
                        c10741h = this.f28022m.m10319d(EnumC10744j.AD, 1);
                    } else {
                        c10741h = this.f28022m.m10319d(enumC10744j, i - 1);
                    }
                } else {
                    C10741h m10319d2 = this.f28022m.m10319d(enumC10744j, i + 1);
                    if (enumC10744j == EnumC10744j.BYZANTINE) {
                        c10741h = this.f28022m.m10319d(EnumC10744j.AD, enumC10744j.m10367a(i));
                        if (c10741h.compareTo(m10319d) > 0) {
                        }
                    }
                    c10741h = m10319d2;
                }
                i2 = 0;
            }
            return (int) (EnumC10686f.f27878q.m10731c(m10417d(m10319d), m10417d(c10741h)) + i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    /* renamed from: w */
    public C10761o m10398w() {
        C10761o c10761o = this.f28022m;
        return c10761o == null ? C10761o.f28078d : c10761o;
    }

    /* renamed from: x */
    public boolean m10397x() {
        return this.f28021l != null;
    }

    /* renamed from: y */
    public boolean m10396y() {
        List<C10739f> list = this.f28020k;
        return list.get(list.size() - 1).f28040a > Long.MIN_VALUE;
    }

    private C10736d(EnumC10916b enumC10916b, List<C10739f> list, C10729a c10729a, C10761o c10761o, C10740g c10740g) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one cutover event must be present in chronological history.");
        }
        if (enumC10916b == null) {
            throw new NullPointerException("Missing historic variant.");
        }
        if (c10740g != null) {
            this.f28019j = enumC10916b;
            this.f28020k = list;
            this.f28021l = c10729a;
            this.f28022m = c10761o;
            this.f28023n = c10740g;
            C10742i c10742i = new C10742i(this);
            this.f28024o = c10742i;
            C10746k c10746k = new C10746k(this);
            this.f28025p = c10746k;
            C10748l c10748l = new C10748l('y', 1, 999999999, this, 2);
            this.f28026q = c10748l;
            C10748l c10748l2 = new C10748l((char) 0, 1, 999999999, this, 6);
            this.f28027r = c10748l2;
            C10748l c10748l3 = new C10748l((char) 0, 1, 999999999, this, 7);
            this.f28028s = c10748l3;
            C10748l c10748l4 = new C10748l('M', 1, 12, this, 3);
            this.f28029t = c10748l4;
            C10748l c10748l5 = new C10748l('d', 1, 31, this, 4);
            this.f28030u = c10748l5;
            C10748l c10748l6 = new C10748l('D', 1, 365, this, 5);
            this.f28031v = c10748l6;
            C10748l c10748l7 = new C10748l((char) 0, 1, 10000000, this, 8);
            this.f28032w = c10748l7;
            HashSet hashSet = new HashSet();
            hashSet.add(c10742i);
            hashSet.add(c10746k);
            hashSet.add(c10748l);
            hashSet.add(c10748l2);
            hashSet.add(c10748l3);
            hashSet.add(c10748l4);
            hashSet.add(c10748l5);
            hashSet.add(c10748l6);
            hashSet.add(c10748l7);
            this.f28033x = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw new NullPointerException("Missing era preference.");
    }
}
