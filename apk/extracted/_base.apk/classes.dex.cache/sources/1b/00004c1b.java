package p327ri;

/* renamed from: ri.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12267g {

    /* renamed from: a */
    private static final Object f31871a = new C12268a();

    /* renamed from: b */
    public static volatile boolean f31872b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ri.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12268a {
        C12268a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: ri.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12269b {

        /* renamed from: a */
        private final Throwable f31873a;

        /* synthetic */ C12269b(Throwable th2, C12268a c12268a) {
            this(th2);
        }

        /* renamed from: a */
        private static /* synthetic */ void m5631a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format);
            }
        }

        /* renamed from: b */
        public Throwable m5630b() {
            Throwable th2 = this.f31873a;
            if (th2 == null) {
                m5631a(1);
            }
            return th2;
        }

        public String toString() {
            return this.f31873a.toString();
        }

        private C12269b(Throwable th2) {
            if (th2 == null) {
                m5631a(0);
            }
            this.f31873a = th2;
        }
    }

    /* renamed from: ri.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12270c extends RuntimeException {
        public C12270c(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m5637a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    public static <V> Object m5636b(V v) {
        if (v == null && (v = (V) f31871a) == null) {
            m5637a(1);
        }
        return v;
    }

    /* renamed from: c */
    public static Object m5635c(Throwable th2) {
        if (th2 == null) {
            m5637a(3);
        }
        return new C12269b(th2, null);
    }

    /* renamed from: d */
    public static <V> V m5634d(Object obj) {
        if (obj == null) {
            m5637a(4);
        }
        return (V) m5633e(m5632f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <V> V m5633e(Object obj) {
        if (obj == 0) {
            m5637a(0);
        }
        if (obj == f31871a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <V> V m5632f(Object obj) {
        if (obj instanceof C12269b) {
            Throwable m5630b = ((C12269b) obj).m5630b();
            if (f31872b && C12250c.m5660a(m5630b)) {
                throw new C12270c(m5630b);
            }
            throw C12250c.m5659b(m5630b);
        }
        return obj;
    }
}