package p468zg;

import gg.C6759j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.collections.C9561x;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p160ih.C7578y;
import p304qf.C11888u;
import p304qf.C11889v;
import p449yh.EnumC14028e;
import pf.C11591x;
import ph.C11638f;

/* renamed from: zg.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C14232i0 {

    /* renamed from: a */
    public static final C14233a f36605a = new C14233a(null);

    /* renamed from: b */
    private static final List<C14233a.C14234a> f36606b;

    /* renamed from: c */
    private static final List<String> f36607c;

    /* renamed from: d */
    private static final List<String> f36608d;

    /* renamed from: e */
    private static final Map<C14233a.C14234a, EnumC14236c> f36609e;

    /* renamed from: f */
    private static final Map<String, EnumC14236c> f36610f;

    /* renamed from: g */
    private static final Set<C11638f> f36611g;

    /* renamed from: h */
    private static final Set<String> f36612h;

    /* renamed from: i */
    private static final C14233a.C14234a f36613i;

    /* renamed from: j */
    private static final Map<C14233a.C14234a, C11638f> f36614j;

    /* renamed from: k */
    private static final Map<String, C11638f> f36615k;

    /* renamed from: l */
    private static final List<C11638f> f36616l;

    /* renamed from: m */
    private static final Map<C11638f, C11638f> f36617m;

    /* renamed from: zg.i0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14233a {

        /* renamed from: zg.i0$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C14234a {

            /* renamed from: a */
            private final C11638f f36618a;

            /* renamed from: b */
            private final String f36619b;

            public C14234a(C11638f name, String signature) {
                C9612q.m13917h(name, "name");
                C9612q.m13917h(signature, "signature");
                this.f36618a = name;
                this.f36619b = signature;
            }

            /* renamed from: a */
            public final C11638f m345a() {
                return this.f36618a;
            }

            /* renamed from: b */
            public final String m344b() {
                return this.f36619b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C14234a) {
                    C14234a c14234a = (C14234a) obj;
                    return C9612q.m13922c(this.f36618a, c14234a.f36618a) && C9612q.m13922c(this.f36619b, c14234a.f36619b);
                }
                return false;
            }

            public int hashCode() {
                return (this.f36618a.hashCode() * 31) + this.f36619b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f36618a + ", signature=" + this.f36619b + ')';
            }
        }

        private C14233a() {
        }

        public /* synthetic */ C14233a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: m */
        public final C14234a m346m(String str, String str2, String str3, String str4) {
            C11638f m7422f = C11638f.m7422f(str2);
            C9612q.m13918g(m7422f, "identifier(name)");
            C7578y c7578y = C7578y.f20876a;
            return new C14234a(m7422f, c7578y.m20369k(str, str2 + '(' + str3 + ')' + str4));
        }

        /* renamed from: b */
        public final C11638f m357b(C11638f name) {
            C9612q.m13917h(name, "name");
            return m353f().get(name);
        }

        /* renamed from: c */
        public final List<String> m356c() {
            return C14232i0.f36607c;
        }

        /* renamed from: d */
        public final Set<C11638f> m355d() {
            return C14232i0.f36611g;
        }

        /* renamed from: e */
        public final Set<String> m354e() {
            return C14232i0.f36612h;
        }

        /* renamed from: f */
        public final Map<C11638f, C11638f> m353f() {
            return C14232i0.f36617m;
        }

        /* renamed from: g */
        public final List<C11638f> m352g() {
            return C14232i0.f36616l;
        }

        /* renamed from: h */
        public final C14234a m351h() {
            return C14232i0.f36613i;
        }

        /* renamed from: i */
        public final Map<String, EnumC14236c> m350i() {
            return C14232i0.f36610f;
        }

        /* renamed from: j */
        public final Map<String, C11638f> m349j() {
            return C14232i0.f36615k;
        }

        /* renamed from: k */
        public final boolean m348k(C11638f c11638f) {
            C9612q.m13917h(c11638f, "<this>");
            return m352g().contains(c11638f);
        }

        /* renamed from: l */
        public final EnumC14235b m347l(String builtinSignature) {
            Object m6753i;
            C9612q.m13917h(builtinSignature, "builtinSignature");
            if (m356c().contains(builtinSignature)) {
                return EnumC14235b.ONE_COLLECTION_PARAMETER;
            }
            m6753i = C11889v.m6753i(m350i(), builtinSignature);
            if (((EnumC14236c) m6753i) == EnumC14236c.f36626k) {
                return EnumC14235b.OBJECT_PARAMETER_GENERIC;
            }
            return EnumC14235b.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* renamed from: zg.i0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC14235b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        

        /* renamed from: j */
        private final String f36624j;

        /* renamed from: k */
        private final boolean f36625k;

        EnumC14235b(String str, boolean z) {
            this.f36624j = str;
            this.f36625k = z;
        }
    }

    /* renamed from: zg.i0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class EnumC14236c {

        /* renamed from: k */
        public static final EnumC14236c f36626k = new EnumC14236c("NULL", 0, null);

        /* renamed from: l */
        public static final EnumC14236c f36627l = new EnumC14236c("INDEX", 1, -1);

        /* renamed from: m */
        public static final EnumC14236c f36628m = new EnumC14236c("FALSE", 2, Boolean.FALSE);

        /* renamed from: n */
        public static final EnumC14236c f36629n = new C14237a("MAP_GET_OR_DEFAULT", 3);

        /* renamed from: o */
        private static final /* synthetic */ EnumC14236c[] f36630o = m342a();

        /* renamed from: j */
        private final Object f36631j;

        /* renamed from: zg.i0$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C14237a extends EnumC14236c {
            C14237a(String str, int i) {
                super(str, i, null, null);
            }
        }

        private EnumC14236c(String str, int i, Object obj) {
            super(str, i);
            this.f36631j = obj;
        }

        public /* synthetic */ EnumC14236c(String str, int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }

        /* renamed from: a */
        private static final /* synthetic */ EnumC14236c[] m342a() {
            return new EnumC14236c[]{f36626k, f36627l, f36628m, f36629n};
        }

        public static EnumC14236c valueOf(String str) {
            return (EnumC14236c) Enum.valueOf(EnumC14236c.class, str);
        }

        public static EnumC14236c[] values() {
            return (EnumC14236c[]) f36630o.clone();
        }
    }

    static {
        Set<String> m14002i;
        int m14093t;
        int m14093t2;
        int m14093t3;
        Map<C14233a.C14234a, EnumC14236c> m6751k;
        int m6758d;
        Set<C14233a.C14234a> m13999l;
        int m14093t4;
        Set<C11638f> m14071G0;
        int m14093t5;
        Set<String> m14071G02;
        Map<C14233a.C14234a, C11638f> m6751k2;
        int m6758d2;
        int m14093t6;
        int m14093t7;
        int m14093t8;
        int m6758d3;
        int m21930c;
        m14002i = C9560w.m14002i("containsAll", "removeAll", "retainAll");
        m14093t = C9546k.m14093t(m14002i, 10);
        ArrayList<C14233a.C14234a> arrayList = new ArrayList(m14093t);
        for (String str : m14002i) {
            C14233a c14233a = f36605a;
            String m877d = EnumC14028e.BOOLEAN.m877d();
            C9612q.m13918g(m877d, "BOOLEAN.desc");
            arrayList.add(c14233a.m346m("java/util/Collection", str, "Ljava/util/Collection;", m877d));
        }
        f36606b = arrayList;
        m14093t2 = C9546k.m14093t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m14093t2);
        for (C14233a.C14234a c14234a : arrayList) {
            arrayList2.add(c14234a.m344b());
        }
        f36607c = arrayList2;
        List<C14233a.C14234a> list = f36606b;
        m14093t3 = C9546k.m14093t(list, 10);
        ArrayList arrayList3 = new ArrayList(m14093t3);
        for (C14233a.C14234a c14234a2 : list) {
            arrayList3.add(c14234a2.m345a().m7426b());
        }
        f36608d = arrayList3;
        C7578y c7578y = C7578y.f20876a;
        C14233a c14233a2 = f36605a;
        String m20371i = c7578y.m20371i("Collection");
        EnumC14028e enumC14028e = EnumC14028e.BOOLEAN;
        String m877d2 = enumC14028e.m877d();
        C9612q.m13918g(m877d2, "BOOLEAN.desc");
        C14233a.C14234a m346m = c14233a2.m346m(m20371i, "contains", "Ljava/lang/Object;", m877d2);
        EnumC14236c enumC14236c = EnumC14236c.f36628m;
        String m20371i2 = c7578y.m20371i("Collection");
        String m877d3 = enumC14028e.m877d();
        C9612q.m13918g(m877d3, "BOOLEAN.desc");
        String m20371i3 = c7578y.m20371i("Map");
        String m877d4 = enumC14028e.m877d();
        C9612q.m13918g(m877d4, "BOOLEAN.desc");
        String m20371i4 = c7578y.m20371i("Map");
        String m877d5 = enumC14028e.m877d();
        C9612q.m13918g(m877d5, "BOOLEAN.desc");
        String m20371i5 = c7578y.m20371i("Map");
        String m877d6 = enumC14028e.m877d();
        C9612q.m13918g(m877d6, "BOOLEAN.desc");
        C14233a.C14234a m346m2 = c14233a2.m346m(c7578y.m20371i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        EnumC14236c enumC14236c2 = EnumC14236c.f36626k;
        String m20371i6 = c7578y.m20371i("List");
        EnumC14028e enumC14028e2 = EnumC14028e.INT;
        String m877d7 = enumC14028e2.m877d();
        C9612q.m13918g(m877d7, "INT.desc");
        C14233a.C14234a m346m3 = c14233a2.m346m(m20371i6, "indexOf", "Ljava/lang/Object;", m877d7);
        EnumC14236c enumC14236c3 = EnumC14236c.f36627l;
        String m20371i7 = c7578y.m20371i("List");
        String m877d8 = enumC14028e2.m877d();
        C9612q.m13918g(m877d8, "INT.desc");
        m6751k = C11889v.m6751k(C11591x.m7577a(m346m, enumC14236c), C11591x.m7577a(c14233a2.m346m(m20371i2, "remove", "Ljava/lang/Object;", m877d3), enumC14236c), C11591x.m7577a(c14233a2.m346m(m20371i3, "containsKey", "Ljava/lang/Object;", m877d4), enumC14236c), C11591x.m7577a(c14233a2.m346m(m20371i4, "containsValue", "Ljava/lang/Object;", m877d5), enumC14236c), C11591x.m7577a(c14233a2.m346m(m20371i5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", m877d6), enumC14236c), C11591x.m7577a(c14233a2.m346m(c7578y.m20371i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC14236c.f36629n), C11591x.m7577a(m346m2, enumC14236c2), C11591x.m7577a(c14233a2.m346m(c7578y.m20371i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), enumC14236c2), C11591x.m7577a(m346m3, enumC14236c3), C11591x.m7577a(c14233a2.m346m(m20371i7, "lastIndexOf", "Ljava/lang/Object;", m877d8), enumC14236c3));
        f36609e = m6751k;
        m6758d = C11888u.m6758d(m6751k.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m6758d);
        Iterator<T> it = m6751k.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((C14233a.C14234a) entry.getKey()).m344b(), entry.getValue());
        }
        f36610f = linkedHashMap;
        m13999l = C9561x.m13999l(f36609e.keySet(), f36606b);
        m14093t4 = C9546k.m14093t(m13999l, 10);
        ArrayList arrayList4 = new ArrayList(m14093t4);
        for (C14233a.C14234a c14234a3 : m13999l) {
            arrayList4.add(c14234a3.m345a());
        }
        m14071G0 = C9553r.m14071G0(arrayList4);
        f36611g = m14071G0;
        m14093t5 = C9546k.m14093t(m13999l, 10);
        ArrayList arrayList5 = new ArrayList(m14093t5);
        for (C14233a.C14234a c14234a4 : m13999l) {
            arrayList5.add(c14234a4.m344b());
        }
        m14071G02 = C9553r.m14071G0(arrayList5);
        f36612h = m14071G02;
        C14233a c14233a3 = f36605a;
        EnumC14028e enumC14028e3 = EnumC14028e.INT;
        String m877d9 = enumC14028e3.m877d();
        C9612q.m13918g(m877d9, "INT.desc");
        C14233a.C14234a m346m4 = c14233a3.m346m("java/util/List", "removeAt", m877d9, "Ljava/lang/Object;");
        f36613i = m346m4;
        C7578y c7578y2 = C7578y.f20876a;
        String m20372h = c7578y2.m20372h("Number");
        String m877d10 = EnumC14028e.BYTE.m877d();
        C9612q.m13918g(m877d10, "BYTE.desc");
        String m20372h2 = c7578y2.m20372h("Number");
        String m877d11 = EnumC14028e.SHORT.m877d();
        C9612q.m13918g(m877d11, "SHORT.desc");
        String m20372h3 = c7578y2.m20372h("Number");
        String m877d12 = enumC14028e3.m877d();
        C9612q.m13918g(m877d12, "INT.desc");
        String m20372h4 = c7578y2.m20372h("Number");
        String m877d13 = EnumC14028e.LONG.m877d();
        C9612q.m13918g(m877d13, "LONG.desc");
        String m20372h5 = c7578y2.m20372h("Number");
        String m877d14 = EnumC14028e.FLOAT.m877d();
        C9612q.m13918g(m877d14, "FLOAT.desc");
        String m20372h6 = c7578y2.m20372h("Number");
        String m877d15 = EnumC14028e.DOUBLE.m877d();
        C9612q.m13918g(m877d15, "DOUBLE.desc");
        String m20372h7 = c7578y2.m20372h("CharSequence");
        String m877d16 = enumC14028e3.m877d();
        C9612q.m13918g(m877d16, "INT.desc");
        String m877d17 = EnumC14028e.CHAR.m877d();
        C9612q.m13918g(m877d17, "CHAR.desc");
        m6751k2 = C11889v.m6751k(C11591x.m7577a(c14233a3.m346m(m20372h, "toByte", "", m877d10), C11638f.m7422f("byteValue")), C11591x.m7577a(c14233a3.m346m(m20372h2, "toShort", "", m877d11), C11638f.m7422f("shortValue")), C11591x.m7577a(c14233a3.m346m(m20372h3, "toInt", "", m877d12), C11638f.m7422f("intValue")), C11591x.m7577a(c14233a3.m346m(m20372h4, "toLong", "", m877d13), C11638f.m7422f("longValue")), C11591x.m7577a(c14233a3.m346m(m20372h5, "toFloat", "", m877d14), C11638f.m7422f("floatValue")), C11591x.m7577a(c14233a3.m346m(m20372h6, "toDouble", "", m877d15), C11638f.m7422f("doubleValue")), C11591x.m7577a(m346m4, C11638f.m7422f("remove")), C11591x.m7577a(c14233a3.m346m(m20372h7, "get", m877d16, m877d17), C11638f.m7422f("charAt")));
        f36614j = m6751k2;
        m6758d2 = C11888u.m6758d(m6751k2.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m6758d2);
        Iterator<T> it2 = m6751k2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(((C14233a.C14234a) entry2.getKey()).m344b(), entry2.getValue());
        }
        f36615k = linkedHashMap2;
        Set<C14233a.C14234a> keySet = f36614j.keySet();
        m14093t6 = C9546k.m14093t(keySet, 10);
        ArrayList arrayList6 = new ArrayList(m14093t6);
        for (C14233a.C14234a c14234a5 : keySet) {
            arrayList6.add(c14234a5.m345a());
        }
        f36616l = arrayList6;
        Set<Map.Entry<C14233a.C14234a, C11638f>> entrySet = f36614j.entrySet();
        m14093t7 = C9546k.m14093t(entrySet, 10);
        ArrayList<Pair> arrayList7 = new ArrayList(m14093t7);
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            arrayList7.add(new Pair(((C14233a.C14234a) entry3.getKey()).m345a(), entry3.getValue()));
        }
        m14093t8 = C9546k.m14093t(arrayList7, 10);
        m6758d3 = C11888u.m6758d(m14093t8);
        m21930c = C6759j.m21930c(m6758d3, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(m21930c);
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((C11638f) pair.m14348d(), (C11638f) pair.m14349c());
        }
        f36617m = linkedHashMap3;
    }
}