package p269og;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.C10884k;
import ph.C11633c;
import ph.C11638f;

/* renamed from: og.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EnumC11102c {

    /* renamed from: n */
    public static final C11103a f29060n;

    /* renamed from: o */
    public static final EnumC11102c f29061o = new EnumC11102c("Function", 0, C10884k.f28428u, "Function", false, false);

    /* renamed from: p */
    public static final EnumC11102c f29062p = new EnumC11102c("SuspendFunction", 1, C10884k.f28420m, "SuspendFunction", true, false);

    /* renamed from: q */
    public static final EnumC11102c f29063q;

    /* renamed from: r */
    public static final EnumC11102c f29064r;

    /* renamed from: s */
    private static final /* synthetic */ EnumC11102c[] f29065s;

    /* renamed from: j */
    private final C11633c f29066j;

    /* renamed from: k */
    private final String f29067k;

    /* renamed from: l */
    private final boolean f29068l;

    /* renamed from: m */
    private final boolean f29069m;

    /* renamed from: og.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11103a {

        /* renamed from: og.c$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C11104a {

            /* renamed from: a */
            private final EnumC11102c f29070a;

            /* renamed from: b */
            private final int f29071b;

            public C11104a(EnumC11102c kind, int i) {
                C9612q.m13917h(kind, "kind");
                this.f29070a = kind;
                this.f29071b = i;
            }

            /* renamed from: a */
            public final EnumC11102c m9157a() {
                return this.f29070a;
            }

            /* renamed from: b */
            public final int m9156b() {
                return this.f29071b;
            }

            /* renamed from: c */
            public final EnumC11102c m9155c() {
                return this.f29070a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C11104a) {
                    C11104a c11104a = (C11104a) obj;
                    return this.f29070a == c11104a.f29070a && this.f29071b == c11104a.f29071b;
                }
                return false;
            }

            public int hashCode() {
                return (this.f29070a.hashCode() * 31) + this.f29071b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f29070a + ", arity=" + this.f29071b + ')';
            }
        }

        private C11103a() {
        }

        public /* synthetic */ C11103a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final Integer m9158d(String str) {
            boolean z;
            boolean z2;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = str.charAt(i2) - '0';
                if (charAt >= 0 && charAt < 10) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return null;
                }
                i = (i * 10) + charAt;
            }
            return Integer.valueOf(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0032 A[LOOP:0: B:21:0x0011->B:31:0x0032, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0030 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p269og.EnumC11102c m9161a(ph.C11633c r9, java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "packageFqName"
                kotlin.jvm.internal.C9612q.m13917h(r9, r0)
                java.lang.String r0 = "className"
                kotlin.jvm.internal.C9612q.m13917h(r10, r0)
                og.c[] r0 = p269og.EnumC11102c.values()
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L11:
                r4 = 0
                if (r3 >= r1) goto L35
                r5 = r0[r3]
                ph.c r6 = r5.m9163c()
                boolean r6 = kotlin.jvm.internal.C9612q.m13922c(r6, r9)
                if (r6 == 0) goto L2d
                java.lang.String r6 = r5.m9164b()
                r7 = 2
                boolean r4 = kotlin.text.C9642f.m13835H(r10, r6, r2, r7, r4)
                if (r4 == 0) goto L2d
                r4 = 1
                goto L2e
            L2d:
                r4 = r2
            L2e:
                if (r4 == 0) goto L32
                r4 = r5
                goto L35
            L32:
                int r3 = r3 + 1
                goto L11
            L35:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p269og.EnumC11102c.C11103a.m9161a(ph.c, java.lang.String):og.c");
        }

        /* renamed from: b */
        public final EnumC11102c m9160b(String className, C11633c packageFqName) {
            C9612q.m13917h(className, "className");
            C9612q.m13917h(packageFqName, "packageFqName");
            C11104a m9159c = m9159c(className, packageFqName);
            if (m9159c != null) {
                return m9159c.m9155c();
            }
            return null;
        }

        /* renamed from: c */
        public final C11104a m9159c(String className, C11633c packageFqName) {
            C9612q.m13917h(className, "className");
            C9612q.m13917h(packageFqName, "packageFqName");
            EnumC11102c m9161a = m9161a(packageFqName, className);
            if (m9161a == null) {
                return null;
            }
            String substring = className.substring(m9161a.m9164b().length());
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            Integer m9158d = m9158d(substring);
            if (m9158d == null) {
                return null;
            }
            return new C11104a(m9161a, m9158d.intValue());
        }
    }

    static {
        C11633c c11633c = C10884k.f28425r;
        f29063q = new EnumC11102c("KFunction", 2, c11633c, "KFunction", false, true);
        f29064r = new EnumC11102c("KSuspendFunction", 3, c11633c, "KSuspendFunction", true, true);
        f29065s = m9165a();
        f29060n = new C11103a(null);
    }

    private EnumC11102c(String str, int i, C11633c c11633c, String str2, boolean z, boolean z2) {
        super(str, i);
        this.f29066j = c11633c;
        this.f29067k = str2;
        this.f29068l = z;
        this.f29069m = z2;
    }

    /* renamed from: a */
    private static final /* synthetic */ EnumC11102c[] m9165a() {
        return new EnumC11102c[]{f29061o, f29062p, f29063q, f29064r};
    }

    public static EnumC11102c valueOf(String str) {
        return (EnumC11102c) Enum.valueOf(EnumC11102c.class, str);
    }

    public static EnumC11102c[] values() {
        return (EnumC11102c[]) f29065s.clone();
    }

    /* renamed from: b */
    public final String m9164b() {
        return this.f29067k;
    }

    /* renamed from: c */
    public final C11633c m9163c() {
        return this.f29066j;
    }

    /* renamed from: d */
    public final C11638f m9162d(int i) {
        C11638f m7422f = C11638f.m7422f(this.f29067k + i);
        C9612q.m13918g(m7422f, "identifier(\"$classNamePrefix$arity\")");
        return m7422f;
    }
}