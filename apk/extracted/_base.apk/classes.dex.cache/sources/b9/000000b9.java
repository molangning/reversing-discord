package ai;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ai.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C0185d {

    /* renamed from: c */
    public static final C0186a f608c;

    /* renamed from: d */
    private static int f609d;

    /* renamed from: e */
    private static final int f610e;

    /* renamed from: f */
    private static final int f611f;

    /* renamed from: g */
    private static final int f612g;

    /* renamed from: h */
    private static final int f613h;

    /* renamed from: i */
    private static final int f614i;

    /* renamed from: j */
    private static final int f615j;

    /* renamed from: k */
    private static final int f616k;

    /* renamed from: l */
    private static final int f617l;

    /* renamed from: m */
    private static final int f618m;

    /* renamed from: n */
    private static final int f619n;

    /* renamed from: o */
    public static final C0185d f620o;

    /* renamed from: p */
    public static final C0185d f621p;

    /* renamed from: q */
    public static final C0185d f622q;

    /* renamed from: r */
    public static final C0185d f623r;

    /* renamed from: s */
    public static final C0185d f624s;

    /* renamed from: t */
    public static final C0185d f625t;

    /* renamed from: u */
    public static final C0185d f626u;

    /* renamed from: v */
    public static final C0185d f627v;

    /* renamed from: w */
    public static final C0185d f628w;

    /* renamed from: x */
    public static final C0185d f629x;

    /* renamed from: y */
    private static final List<C0186a.C0187a> f630y;

    /* renamed from: z */
    private static final List<C0186a.C0187a> f631z;

    /* renamed from: a */
    private final List<AbstractC0182c> f632a;

    /* renamed from: b */
    private final int f633b;

    /* renamed from: ai.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0186a {

        /* renamed from: ai.d$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        private static final class C0187a {

            /* renamed from: a */
            private final int f634a;

            /* renamed from: b */
            private final String f635b;

            public C0187a(int i, String name) {
                C9612q.m13917h(name, "name");
                this.f634a = i;
                this.f635b = name;
            }

            /* renamed from: a */
            public final int m40981a() {
                return this.f634a;
            }

            /* renamed from: b */
            public final String m40980b() {
                return this.f635b;
            }
        }

        private C0186a() {
        }

        public /* synthetic */ C0186a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: j */
        public final int m40982j() {
            int i = C0185d.f609d;
            C0185d.f609d <<= 1;
            return i;
        }

        /* renamed from: b */
        public final int m40990b() {
            return C0185d.f616k;
        }

        /* renamed from: c */
        public final int m40989c() {
            return C0185d.f617l;
        }

        /* renamed from: d */
        public final int m40988d() {
            return C0185d.f614i;
        }

        /* renamed from: e */
        public final int m40987e() {
            return C0185d.f610e;
        }

        /* renamed from: f */
        public final int m40986f() {
            return C0185d.f613h;
        }

        /* renamed from: g */
        public final int m40985g() {
            return C0185d.f611f;
        }

        /* renamed from: h */
        public final int m40984h() {
            return C0185d.f612g;
        }

        /* renamed from: i */
        public final int m40983i() {
            return C0185d.f615j;
        }
    }

    static {
        boolean z;
        C0186a.C0187a c0187a;
        C0185d c0185d;
        C0186a.C0187a c0187a2;
        C0186a c0186a = new C0186a(null);
        f608c = c0186a;
        f609d = 1;
        int m40982j = c0186a.m40982j();
        f610e = m40982j;
        int m40982j2 = c0186a.m40982j();
        f611f = m40982j2;
        int m40982j3 = c0186a.m40982j();
        f612g = m40982j3;
        int m40982j4 = c0186a.m40982j();
        f613h = m40982j4;
        int m40982j5 = c0186a.m40982j();
        f614i = m40982j5;
        int m40982j6 = c0186a.m40982j();
        f615j = m40982j6;
        int m40982j7 = c0186a.m40982j() - 1;
        f616k = m40982j7;
        int i = m40982j | m40982j2 | m40982j3;
        f617l = i;
        int i2 = m40982j2 | m40982j5 | m40982j6;
        f618m = i2;
        int i3 = m40982j5 | m40982j6;
        f619n = i3;
        f620o = new C0185d(m40982j7, null, 2, null);
        f621p = new C0185d(i3, null, 2, null);
        f622q = new C0185d(m40982j, null, 2, null);
        f623r = new C0185d(m40982j2, null, 2, null);
        f624s = new C0185d(m40982j3, null, 2, null);
        f625t = new C0185d(i, null, 2, null);
        f626u = new C0185d(m40982j4, null, 2, null);
        f627v = new C0185d(m40982j5, null, 2, null);
        f628w = new C0185d(m40982j6, null, 2, null);
        f629x = new C0185d(i2, null, 2, null);
        Field[] fields = C0185d.class.getFields();
        C9612q.m13918g(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            if (obj instanceof C0185d) {
                c0185d = (C0185d) obj;
            } else {
                c0185d = null;
            }
            if (c0185d != null) {
                int i4 = c0185d.f633b;
                String name = field2.getName();
                C9612q.m13918g(name, "field.name");
                c0187a2 = new C0186a.C0187a(i4, name);
            } else {
                c0187a2 = null;
            }
            if (c0187a2 != null) {
                arrayList2.add(c0187a2);
            }
        }
        f630y = arrayList2;
        Field[] fields2 = C0185d.class.getFields();
        C9612q.m13918g(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (C9612q.m13922c(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            C9612q.m13919f(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String name2 = field4.getName();
                C9612q.m13918g(name2, "field.name");
                c0187a = new C0186a.C0187a(intValue, name2);
            } else {
                c0187a = null;
            }
            if (c0187a != null) {
                arrayList5.add(c0187a);
            }
        }
        f631z = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0185d(int i, List<? extends AbstractC0182c> excludes) {
        C9612q.m13917h(excludes, "excludes");
        this.f632a = excludes;
        for (AbstractC0182c abstractC0182c : excludes) {
            i &= ~abstractC0182c.mo41006a();
        }
        this.f633b = i;
    }

    /* renamed from: a */
    public final boolean m41005a(int i) {
        return (i & this.f633b) != 0;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C9612q.m13922c(C0185d.class, cls)) {
            return false;
        }
        C9612q.m13919f(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C0185d c0185d = (C0185d) obj;
        if (C9612q.m13922c(this.f632a, c0185d.f632a) && this.f633b == c0185d.f633b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f632a.hashCode() * 31) + this.f633b;
    }

    /* renamed from: l */
    public final List<AbstractC0182c> m40994l() {
        return this.f632a;
    }

    /* renamed from: m */
    public final int m40993m() {
        return this.f633b;
    }

    /* renamed from: n */
    public final C0185d m40992n(int i) {
        int i2 = i & this.f633b;
        if (i2 == 0) {
            return null;
        }
        return new C0185d(i2, this.f632a);
    }

    public String toString() {
        Object obj;
        String str;
        String str2;
        boolean z;
        Iterator<T> it = f630y.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C0186a.C0187a) obj).m40981a() == this.f633b) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C0186a.C0187a c0187a = (C0186a.C0187a) obj;
        if (c0187a != null) {
            str = c0187a.m40980b();
        } else {
            str = null;
        }
        if (str == null) {
            List<C0186a.C0187a> list = f631z;
            ArrayList arrayList = new ArrayList();
            for (C0186a.C0187a c0187a2 : list) {
                if (m41005a(c0187a2.m40981a())) {
                    str2 = c0187a2.m40980b();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = C9553r.m14046d0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + str + ", " + this.f632a + ')';
    }

    public /* synthetic */ C0185d(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? C9545j.m14104i() : list);
    }
}