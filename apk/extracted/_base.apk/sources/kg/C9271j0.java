package kg;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* renamed from: kg.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C9271j0 {

    /* renamed from: kg.j0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static class C9272a<T> extends AbstractC9274c<T> implements Function0<T> {

        /* renamed from: k */
        private final Function0<T> f24337k;

        /* renamed from: l */
        private volatile SoftReference<Object> f24338l;

        public C9272a(T t, Function0<T> function0) {
            if (function0 == null) {
                m15967d(0);
            }
            this.f24338l = null;
            this.f24337k = function0;
            if (t != null) {
                this.f24338l = new SoftReference<>(m15965a(t));
            }
        }

        /* renamed from: d */
        private static /* synthetic */ void m15967d(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kg.C9271j0.AbstractC9274c, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f24338l;
            if (softReference != null && (obj = softReference.get()) != null) {
                return m15963c(obj);
            }
            T invoke = this.f24337k.invoke();
            this.f24338l = new SoftReference<>(m15965a(invoke));
            return invoke;
        }
    }

    /* renamed from: kg.j0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static class C9273b<T> extends AbstractC9274c<T> {

        /* renamed from: k */
        private final Function0<T> f24339k;

        /* renamed from: l */
        private volatile Object f24340l;

        public C9273b(Function0<T> function0) {
            if (function0 == null) {
                m15966d(0);
            }
            this.f24340l = null;
            this.f24339k = function0;
        }

        /* renamed from: d */
        private static /* synthetic */ void m15966d(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // kg.C9271j0.AbstractC9274c, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj = this.f24340l;
            if (obj != null) {
                return m15963c(obj);
            }
            T invoke = this.f24339k.invoke();
            this.f24340l = m15965a(invoke);
            return invoke;
        }
    }

    /* renamed from: kg.j0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC9274c<T> {

        /* renamed from: j */
        private static final Object f24341j = new C9275a();

        /* renamed from: kg.j0$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static class C9275a {
            C9275a() {
            }
        }

        /* renamed from: a */
        protected Object m15965a(T t) {
            return t == null ? f24341j : t;
        }

        /* renamed from: b */
        public final T m15964b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        protected T m15963c(Object obj) {
            if (obj == f24341j) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    /* renamed from: a */
    private static /* synthetic */ void m15971a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <T> C9273b<T> m15970b(Function0<T> function0) {
        if (function0 == null) {
            m15971a(0);
        }
        return new C9273b<>(function0);
    }

    /* renamed from: c */
    public static <T> C9272a<T> m15969c(T t, Function0<T> function0) {
        if (function0 == null) {
            m15971a(1);
        }
        return new C9272a<>(t, function0);
    }

    /* renamed from: d */
    public static <T> C9272a<T> m15968d(Function0<T> function0) {
        if (function0 == null) {
            m15971a(2);
        }
        return m15969c(null, function0);
    }
}
