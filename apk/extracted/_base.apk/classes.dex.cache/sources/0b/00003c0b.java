package p164j$.util.stream;

import java.util.EnumMap;
import java.util.Map;
import p164j$.util.Map;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.V2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class EnumC8616V2 {
    public static final EnumC8616V2 DISTINCT;
    public static final EnumC8616V2 ORDERED;
    public static final EnumC8616V2 SHORT_CIRCUIT;
    public static final EnumC8616V2 SIZED;
    public static final EnumC8616V2 SORTED;

    /* renamed from: f */
    static final int f22776f;

    /* renamed from: g */
    static final int f22777g;

    /* renamed from: h */
    static final int f22778h;

    /* renamed from: i */
    private static final int f22779i;

    /* renamed from: j */
    private static final int f22780j;

    /* renamed from: k */
    private static final int f22781k;

    /* renamed from: l */
    static final int f22782l;

    /* renamed from: m */
    static final int f22783m;

    /* renamed from: n */
    static final int f22784n;

    /* renamed from: o */
    static final int f22785o;

    /* renamed from: p */
    static final int f22786p;

    /* renamed from: q */
    static final int f22787q;

    /* renamed from: r */
    static final int f22788r;

    /* renamed from: s */
    static final int f22789s;

    /* renamed from: t */
    static final int f22790t;

    /* renamed from: u */
    static final int f22791u;

    /* renamed from: v */
    private static final /* synthetic */ EnumC8616V2[] f22792v;

    /* renamed from: a */
    private final Map f22793a;

    /* renamed from: b */
    private final int f22794b;

    /* renamed from: c */
    private final int f22795c;

    /* renamed from: d */
    private final int f22796d;

    /* renamed from: e */
    private final int f22797e;

    static {
        EnumC8612U2 enumC8612U2 = EnumC8612U2.SPLITERATOR;
        C8608T2 m17535f = m17535f(enumC8612U2);
        EnumC8612U2 enumC8612U22 = EnumC8612U2.STREAM;
        m17535f.m17544a(enumC8612U22);
        EnumC8612U2 enumC8612U23 = EnumC8612U2.OP;
        m17535f.f22759a.put(enumC8612U23, 3);
        EnumC8616V2 enumC8616V2 = new EnumC8616V2("DISTINCT", 0, 0, m17535f);
        DISTINCT = enumC8616V2;
        C8608T2 m17535f2 = m17535f(enumC8612U2);
        m17535f2.m17544a(enumC8612U22);
        m17535f2.f22759a.put(enumC8612U23, 3);
        EnumC8616V2 enumC8616V22 = new EnumC8616V2("SORTED", 1, 1, m17535f2);
        SORTED = enumC8616V22;
        C8608T2 m17535f3 = m17535f(enumC8612U2);
        m17535f3.m17544a(enumC8612U22);
        Map map = m17535f3.f22759a;
        map.put(enumC8612U23, 3);
        EnumC8612U2 enumC8612U24 = EnumC8612U2.TERMINAL_OP;
        map.put(enumC8612U24, 2);
        EnumC8612U2 enumC8612U25 = EnumC8612U2.UPSTREAM_TERMINAL_OP;
        map.put(enumC8612U25, 2);
        EnumC8616V2 enumC8616V23 = new EnumC8616V2("ORDERED", 2, 2, m17535f3);
        ORDERED = enumC8616V23;
        C8608T2 m17535f4 = m17535f(enumC8612U2);
        m17535f4.m17544a(enumC8612U22);
        m17535f4.f22759a.put(enumC8612U23, 2);
        EnumC8616V2 enumC8616V24 = new EnumC8616V2("SIZED", 3, 3, m17535f4);
        SIZED = enumC8616V24;
        C8608T2 m17535f5 = m17535f(enumC8612U23);
        m17535f5.m17544a(enumC8612U24);
        EnumC8616V2 enumC8616V25 = new EnumC8616V2("SHORT_CIRCUIT", 4, 12, m17535f5);
        SHORT_CIRCUIT = enumC8616V25;
        f22792v = new EnumC8616V2[]{enumC8616V2, enumC8616V22, enumC8616V23, enumC8616V24, enumC8616V25};
        f22776f = m17539b(enumC8612U2);
        f22777g = m17539b(enumC8612U22);
        f22778h = m17539b(enumC8612U23);
        m17539b(enumC8612U24);
        m17539b(enumC8612U25);
        int i = 0;
        for (EnumC8616V2 enumC8616V26 : values()) {
            i |= enumC8616V26.f22797e;
        }
        f22779i = i;
        int i2 = f22777g;
        f22780j = i2;
        int i3 = i2 << 1;
        f22781k = i3;
        f22782l = i2 | i3;
        EnumC8616V2 enumC8616V27 = DISTINCT;
        f22783m = enumC8616V27.f22795c;
        f22784n = enumC8616V27.f22796d;
        EnumC8616V2 enumC8616V28 = SORTED;
        f22785o = enumC8616V28.f22795c;
        f22786p = enumC8616V28.f22796d;
        EnumC8616V2 enumC8616V29 = ORDERED;
        f22787q = enumC8616V29.f22795c;
        f22788r = enumC8616V29.f22796d;
        EnumC8616V2 enumC8616V210 = SIZED;
        f22789s = enumC8616V210.f22795c;
        f22790t = enumC8616V210.f22796d;
        f22791u = SHORT_CIRCUIT.f22795c;
    }

    private EnumC8616V2(String str, int i, int i2, C8608T2 c8608t2) {
        super(str, i);
        EnumC8612U2[] values = EnumC8612U2.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            Map map = c8608t2.f22759a;
            if (i3 >= length) {
                this.f22793a = map;
                int i4 = i2 * 2;
                this.f22794b = i4;
                this.f22795c = 1 << i4;
                this.f22796d = 2 << i4;
                this.f22797e = 3 << i4;
                return;
            }
            Map.EL.putIfAbsent(map, values[i3], 0);
            i3++;
        }
    }

    /* renamed from: a */
    public static int m17540a(int i, int i2) {
        return i | (i2 & (i == 0 ? f22779i : ~(((f22780j & i) << 1) | i | ((f22781k & i) >> 1))));
    }

    /* renamed from: b */
    private static int m17539b(EnumC8612U2 enumC8612U2) {
        EnumC8616V2[] values;
        int i = 0;
        for (EnumC8616V2 enumC8616V2 : values()) {
            i |= ((Integer) enumC8616V2.f22793a.get(enumC8612U2)).intValue() << enumC8616V2.f22794b;
        }
        return i;
    }

    /* renamed from: c */
    public static int m17538c(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i = characteristics & 4;
        int i2 = f22776f;
        return (i == 0 || spliterator.getComparator() == null) ? characteristics & i2 : characteristics & i2 & (-5);
    }

    /* renamed from: f */
    private static C8608T2 m17535f(EnumC8612U2 enumC8612U2) {
        C8608T2 c8608t2 = new C8608T2(new EnumMap(EnumC8612U2.class));
        c8608t2.m17544a(enumC8612U2);
        return c8608t2;
    }

    /* renamed from: g */
    public static int m17534g(int i) {
        return i & ((~i) >> 1) & f22780j;
    }

    public static EnumC8616V2 valueOf(String str) {
        return (EnumC8616V2) Enum.valueOf(EnumC8616V2.class, str);
    }

    public static EnumC8616V2[] values() {
        return (EnumC8616V2[]) f22792v.clone();
    }

    /* renamed from: d */
    public final boolean m17537d(int i) {
        return (i & this.f22797e) == this.f22795c;
    }

    /* renamed from: e */
    public final boolean m17536e(int i) {
        int i2 = this.f22797e;
        return (i & i2) == i2;
    }
}