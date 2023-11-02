package kotlin.jvm.internal;

import bg.InterfaceC2280a;
import bg.InterfaceC2281b;
import bg.InterfaceC2282c;
import bg.InterfaceC2283d;
import bg.InterfaceC2284e;
import bg.InterfaceC2285f;
import bg.InterfaceC2286g;
import bg.InterfaceC2287h;
import bg.InterfaceC2288i;
import bg.InterfaceC2289j;
import bg.InterfaceC2290k;
import bg.InterfaceC2291l;
import bg.InterfaceC2292m;
import bg.InterfaceC2293n;
import bg.InterfaceC2294o;
import bg.InterfaceC2295p;
import bg.InterfaceC2296q;
import bg.InterfaceC2297r;
import cg.InterfaceC2533a;
import cg.InterfaceC2534b;
import cg.InterfaceC2535c;
import cg.InterfaceC2536d;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import pf.InterfaceC11562g;

/* renamed from: kotlin.jvm.internal.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9604l0 {
    /* renamed from: a */
    public static Collection m13941a(Object obj) {
        if ((obj instanceof InterfaceC2533a) && !(obj instanceof InterfaceC2534b)) {
            m13929m(obj, "kotlin.collections.MutableCollection");
        }
        return m13937e(obj);
    }

    /* renamed from: b */
    public static List m13940b(Object obj) {
        if ((obj instanceof InterfaceC2533a) && !(obj instanceof InterfaceC2535c)) {
            m13929m(obj, "kotlin.collections.MutableList");
        }
        return m13936f(obj);
    }

    /* renamed from: c */
    public static Set m13939c(Object obj) {
        if ((obj instanceof InterfaceC2533a) && !(obj instanceof InterfaceC2536d)) {
            m13929m(obj, "kotlin.collections.MutableSet");
        }
        return m13935g(obj);
    }

    /* renamed from: d */
    public static Object m13938d(Object obj, int i) {
        if (obj != null && !m13933i(obj, i)) {
            m13929m(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: e */
    public static Collection m13937e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m13930l(e);
        }
    }

    /* renamed from: f */
    public static List m13936f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m13930l(e);
        }
    }

    /* renamed from: g */
    public static Set m13935g(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m13930l(e);
        }
    }

    /* renamed from: h */
    public static int m13934h(Object obj) {
        if (obj instanceof InterfaceC9603l) {
            return ((InterfaceC9603l) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Function3) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof InterfaceC2293n) {
            return 5;
        }
        if (obj instanceof InterfaceC2294o) {
            return 6;
        }
        if (obj instanceof InterfaceC2295p) {
            return 7;
        }
        if (obj instanceof InterfaceC2296q) {
            return 8;
        }
        if (obj instanceof InterfaceC2297r) {
            return 9;
        }
        if (obj instanceof InterfaceC2280a) {
            return 10;
        }
        if (obj instanceof InterfaceC2281b) {
            return 11;
        }
        if (obj instanceof InterfaceC2282c) {
            return 12;
        }
        if (obj instanceof InterfaceC2283d) {
            return 13;
        }
        if (obj instanceof InterfaceC2284e) {
            return 14;
        }
        if (obj instanceof InterfaceC2285f) {
            return 15;
        }
        if (obj instanceof InterfaceC2286g) {
            return 16;
        }
        if (obj instanceof InterfaceC2287h) {
            return 17;
        }
        if (obj instanceof InterfaceC2288i) {
            return 18;
        }
        if (obj instanceof InterfaceC2289j) {
            return 19;
        }
        if (obj instanceof InterfaceC2290k) {
            return 20;
        }
        if (obj instanceof InterfaceC2291l) {
            return 21;
        }
        if (obj instanceof InterfaceC2292m) {
            return 22;
        }
        return -1;
    }

    /* renamed from: i */
    public static boolean m13933i(Object obj, int i) {
        return (obj instanceof InterfaceC11562g) && m13934h(obj) == i;
    }

    /* renamed from: j */
    public static boolean m13932j(Object obj) {
        return (obj instanceof List) && (!(obj instanceof InterfaceC2533a) || (obj instanceof InterfaceC2535c));
    }

    /* renamed from: k */
    private static <T extends Throwable> T m13931k(T t) {
        return (T) C9612q.m13910o(t, C9604l0.class.getName());
    }

    /* renamed from: l */
    public static ClassCastException m13930l(ClassCastException classCastException) {
        throw ((ClassCastException) m13931k(classCastException));
    }

    /* renamed from: m */
    public static void m13929m(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        m13928n(name + " cannot be cast to " + str);
    }

    /* renamed from: n */
    public static void m13928n(String str) {
        throw m13930l(new ClassCastException(str));
    }
}