package gi;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.C9654p;
import p164j$.util.concurrent.ConcurrentHashMap;
import p327ri.C12250c;
import p327ri.C12267g;

/* renamed from: gi.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C6795f implements InterfaceC6821n {

    /* renamed from: d */
    private static final String f19002d;

    /* renamed from: e */
    public static final InterfaceC6821n f19003e;

    /* renamed from: a */
    protected final InterfaceC6817k f19004a;

    /* renamed from: b */
    private final InterfaceC6802f f19005b;

    /* renamed from: c */
    private final String f19006c;

    /* renamed from: gi.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C6796a extends C6795f {
        C6796a(String str, InterfaceC6802f interfaceC6802f, InterfaceC6817k interfaceC6817k) {
            super(str, interfaceC6802f, interfaceC6817k, null);
        }

        /* renamed from: j */
        private static /* synthetic */ void m21902j(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // gi.C6795f
        /* renamed from: p */
        protected <K, V> C6812o<V> mo21901p(String str, K k) {
            if (str == null) {
                m21902j(0);
            }
            C6812o<V> m21880a = C6812o.m21880a();
            if (m21880a == null) {
                m21902j(1);
            }
            return m21880a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: gi.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    class C6797b<T> extends C6807j<T> {

        /* renamed from: m */
        final /* synthetic */ Object f19007m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6797b(C6795f c6795f, Function0 function0, Object obj) {
            super(c6795f, function0);
            this.f19007m = obj;
        }

        /* renamed from: a */
        private static /* synthetic */ void m21900a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // gi.C6795f.C6805h
        /* renamed from: c */
        protected C6812o<T> mo21891c(boolean z) {
            C6812o<T> m21877d = C6812o.m21877d(this.f19007m);
            if (m21877d == null) {
                m21900a(0);
            }
            return m21877d;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: gi.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    class C6798c<T> extends AbstractC6808k<T> {

        /* renamed from: n */
        final /* synthetic */ Function1 f19009n;

        /* renamed from: o */
        final /* synthetic */ Function1 f19010o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6798c(C6795f c6795f, Function0 function0, Function1 function1, Function1 function12) {
            super(c6795f, function0);
            this.f19009n = function1;
            this.f19010o = function12;
        }

        /* renamed from: a */
        private static /* synthetic */ void m21899a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // gi.C6795f.C6805h
        /* renamed from: c */
        protected C6812o<T> mo21891c(boolean z) {
            Function1 function1 = this.f19009n;
            if (function1 == null) {
                C6812o<T> mo21891c = super.mo21891c(z);
                if (mo21891c == null) {
                    m21899a(0);
                }
                return mo21891c;
            }
            C6812o<T> m21877d = C6812o.m21877d(function1.invoke(Boolean.valueOf(z)));
            if (m21877d == null) {
                m21899a(1);
            }
            return m21877d;
        }

        @Override // gi.C6795f.AbstractC6806i
        /* renamed from: d */
        protected void mo21887d(T t) {
            if (t == null) {
                m21899a(2);
            }
            this.f19010o.invoke(t);
        }
    }

    /* renamed from: gi.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C6799d<K, V> extends C6800e<K, V> implements InterfaceC6790a<K, V> {
        /* synthetic */ C6799d(C6795f c6795f, ConcurrentMap concurrentMap, C6796a c6796a) {
            this(c6795f, concurrentMap);
        }

        /* renamed from: b */
        private static /* synthetic */ void m21898b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // gi.C6795f.C6800e, gi.InterfaceC6790a
        /* renamed from: a */
        public V mo21897a(K k, Function0<? extends V> function0) {
            if (function0 == null) {
                m21898b(2);
            }
            V v = (V) super.mo21897a(k, function0);
            if (v == null) {
                m21898b(3);
            }
            return v;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C6799d(C6795f c6795f, ConcurrentMap<C6804g<K, V>, Object> concurrentMap) {
            super(c6795f, concurrentMap, null);
            if (c6795f == null) {
                m21898b(0);
            }
            if (concurrentMap == null) {
                m21898b(1);
            }
        }
    }

    /* renamed from: gi.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C6800e<K, V> extends C6809l<C6804g<K, V>, V> implements InterfaceC6791b<K, V> {

        /* renamed from: gi.f$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        class C6801a implements Function1<C6804g<K, V>, V> {
            C6801a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public V invoke(C6804g<K, V> c6804g) {
                return (V) ((C6804g) c6804g).f19014b.invoke();
            }
        }

        /* synthetic */ C6800e(C6795f c6795f, ConcurrentMap concurrentMap, C6796a c6796a) {
            this(c6795f, concurrentMap);
        }

        /* renamed from: b */
        private static /* synthetic */ void m21896b(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public V mo21897a(K k, Function0<? extends V> function0) {
            if (function0 == null) {
                m21896b(2);
            }
            return invoke(new C6804g(k, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C6800e(C6795f c6795f, ConcurrentMap<C6804g<K, V>, Object> concurrentMap) {
            super(c6795f, concurrentMap, new C6801a());
            if (c6795f == null) {
                m21896b(0);
            }
            if (concurrentMap == null) {
                m21896b(1);
            }
        }
    }

    /* renamed from: gi.f$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC6802f {

        /* renamed from: a */
        public static final InterfaceC6802f f19012a = new C6803a();

        /* renamed from: gi.f$f$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static class C6803a implements InterfaceC6802f {
            C6803a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m21894a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // gi.C6795f.InterfaceC6802f
            public RuntimeException handleException(Throwable th2) {
                if (th2 == null) {
                    m21894a(0);
                }
                throw C12250c.m5659b(th2);
            }
        }

        RuntimeException handleException(Throwable th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gi.f$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C6804g<K, V> {

        /* renamed from: a */
        private final K f19013a;

        /* renamed from: b */
        private final Function0<? extends V> f19014b;

        public C6804g(K k, Function0<? extends V> function0) {
            this.f19013a = k;
            this.f19014b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && this.f19013a.equals(((C6804g) obj).f19013a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f19013a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gi.f$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C6805h<T> implements InterfaceC6816j<T> {

        /* renamed from: j */
        private final C6795f f19015j;

        /* renamed from: k */
        private final Function0<? extends T> f19016k;

        /* renamed from: l */
        private volatile Object f19017l;

        public C6805h(C6795f c6795f, Function0<? extends T> function0) {
            if (c6795f == null) {
                m21892a(0);
            }
            if (function0 == null) {
                m21892a(1);
            }
            this.f19017l = EnumC6811n.NOT_COMPUTED;
            this.f19015j = c6795f;
            this.f19016k = function0;
        }

        /* renamed from: a */
        private static /* synthetic */ void m21892a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: b */
        protected void mo21888b(T t) {
        }

        /* renamed from: c */
        protected C6812o<T> mo21891c(boolean z) {
            C6812o<T> mo21901p = this.f19015j.mo21901p("in a lazy value", null);
            if (mo21901p == null) {
                m21892a(2);
            }
            return mo21901p;
        }

        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T invoke;
            Object obj = this.f19017l;
            if (!(obj instanceof EnumC6811n)) {
                return (T) C12267g.m5632f(obj);
            }
            this.f19015j.f19004a.lock();
            try {
                Object obj2 = this.f19017l;
                if (!(obj2 instanceof EnumC6811n)) {
                    invoke = (T) C12267g.m5632f(obj2);
                } else {
                    EnumC6811n enumC6811n = EnumC6811n.COMPUTING;
                    if (obj2 == enumC6811n) {
                        this.f19017l = EnumC6811n.RECURSION_WAS_DETECTED;
                        C6812o<T> mo21891c = mo21891c(true);
                        if (!mo21891c.m21878c()) {
                            invoke = mo21891c.m21879b();
                        }
                    }
                    if (obj2 == EnumC6811n.RECURSION_WAS_DETECTED) {
                        C6812o<T> mo21891c2 = mo21891c(false);
                        if (!mo21891c2.m21878c()) {
                            invoke = mo21891c2.m21879b();
                        }
                    }
                    this.f19017l = enumC6811n;
                    invoke = this.f19016k.invoke();
                    mo21888b(invoke);
                    this.f19017l = invoke;
                }
                return invoke;
            } finally {
                this.f19015j.f19004a.unlock();
            }
        }

        /* renamed from: o */
        public boolean m21890o() {
            return (this.f19017l == EnumC6811n.NOT_COMPUTED || this.f19017l == EnumC6811n.COMPUTING) ? false : true;
        }
    }

    /* renamed from: gi.f$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static abstract class AbstractC6806i<T> extends C6805h<T> {

        /* renamed from: m */
        private volatile C6819l<T> f19018m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC6806i(C6795f c6795f, Function0<? extends T> function0) {
            super(c6795f, function0);
            if (c6795f == null) {
                m21889a(0);
            }
            if (function0 == null) {
                m21889a(1);
            }
            this.f19018m = null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m21889a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gi.C6795f.C6805h
        /* renamed from: b */
        protected final void mo21888b(T t) {
            this.f19018m = new C6819l<>(t);
            try {
                mo21887d(t);
            } finally {
                this.f19018m = null;
            }
        }

        /* renamed from: d */
        protected abstract void mo21887d(T t);

        @Override // gi.C6795f.C6805h, kotlin.jvm.functions.Function0
        public T invoke() {
            C6819l<T> c6819l = this.f19018m;
            if (c6819l != null && c6819l.m21872b()) {
                return c6819l.m21873a();
            }
            return (T) super.invoke();
        }
    }

    /* renamed from: gi.f$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C6807j<T> extends C6805h<T> implements InterfaceC6815i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6807j(C6795f c6795f, Function0<? extends T> function0) {
            super(c6795f, function0);
            if (c6795f == null) {
                m21886a(0);
            }
            if (function0 == null) {
                m21886a(1);
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m21886a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // gi.C6795f.C6805h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m21886a(2);
            }
            return t;
        }
    }

    /* renamed from: gi.f$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static abstract class AbstractC6808k<T> extends AbstractC6806i<T> implements InterfaceC6815i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC6808k(C6795f c6795f, Function0<? extends T> function0) {
            super(c6795f, function0);
            if (c6795f == null) {
                m21885a(0);
            }
            if (function0 == null) {
                m21885a(1);
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m21885a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // gi.C6795f.AbstractC6806i, gi.C6795f.C6805h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m21885a(2);
            }
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gi.f$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C6809l<K, V> implements InterfaceC6814h<K, V> {

        /* renamed from: j */
        private final C6795f f19019j;

        /* renamed from: k */
        private final ConcurrentMap<K, Object> f19020k;

        /* renamed from: l */
        private final Function1<? super K, ? extends V> f19021l;

        public C6809l(C6795f c6795f, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            if (c6795f == null) {
                m21884b(0);
            }
            if (concurrentMap == null) {
                m21884b(1);
            }
            if (function1 == null) {
                m21884b(2);
            }
            this.f19019j = c6795f;
            this.f19020k = concurrentMap;
            this.f19021l = function1;
        }

        /* renamed from: b */
        private static /* synthetic */ void m21884b(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: c */
        private AssertionError m21883c(K k, Object obj) {
            AssertionError assertionError = (AssertionError) C6795f.m21903q(new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f19019j));
            if (assertionError == null) {
                m21884b(4);
            }
            return assertionError;
        }

        /* renamed from: d */
        protected C6812o<V> m21882d(K k, boolean z) {
            C6812o<V> mo21901p = this.f19019j.mo21901p("", k);
            if (mo21901p == null) {
                m21884b(3);
            }
            return mo21901p;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(K k) {
            V v;
            Object obj = this.f19020k.get(k);
            if (obj != null && obj != EnumC6811n.COMPUTING) {
                return (V) C12267g.m5634d(obj);
            }
            this.f19019j.f19004a.lock();
            try {
                Object obj2 = this.f19020k.get(k);
                EnumC6811n enumC6811n = EnumC6811n.COMPUTING;
                if (obj2 == enumC6811n) {
                    obj2 = EnumC6811n.RECURSION_WAS_DETECTED;
                    C6812o<V> m21882d = m21882d(k, true);
                    if (!m21882d.m21878c()) {
                        v = m21882d.m21879b();
                        return v;
                    }
                }
                if (obj2 == EnumC6811n.RECURSION_WAS_DETECTED) {
                    C6812o<V> m21882d2 = m21882d(k, false);
                    if (!m21882d2.m21878c()) {
                        v = m21882d2.m21879b();
                        return v;
                    }
                }
                if (obj2 != null) {
                    v = (V) C12267g.m5634d(obj2);
                    return v;
                }
                this.f19020k.put(k, enumC6811n);
                V invoke = this.f19021l.invoke(k);
                Object put = this.f19020k.put(k, C12267g.m5636b(invoke));
                if (put == enumC6811n) {
                    return invoke;
                }
                throw m21883c(k, put);
            } finally {
                this.f19019j.f19004a.unlock();
            }
        }

        @Override // gi.InterfaceC6814h
        /* renamed from: t */
        public boolean mo21876t(K k) {
            Object obj = this.f19020k.get(k);
            if (obj != null && obj != EnumC6811n.COMPUTING) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gi.f$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C6810m<K, V> extends C6809l<K, V> implements InterfaceC6813g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6810m(C6795f c6795f, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            super(c6795f, concurrentMap, function1);
            if (c6795f == null) {
                m21881b(0);
            }
            if (concurrentMap == null) {
                m21881b(1);
            }
            if (function1 == null) {
                m21881b(2);
            }
        }

        /* renamed from: b */
        private static /* synthetic */ void m21881b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // gi.C6795f.C6809l, kotlin.jvm.functions.Function1
        public V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v == null) {
                m21881b(3);
            }
            return v;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gi.f$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC6811n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gi.f$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C6812o<T> {

        /* renamed from: a */
        private final T f19026a;

        /* renamed from: b */
        private final boolean f19027b;

        private C6812o(T t, boolean z) {
            this.f19026a = t;
            this.f19027b = z;
        }

        /* renamed from: a */
        public static <T> C6812o<T> m21880a() {
            return new C6812o<>(null, true);
        }

        /* renamed from: d */
        public static <T> C6812o<T> m21877d(T t) {
            return new C6812o<>(t, false);
        }

        /* renamed from: b */
        public T m21879b() {
            return this.f19026a;
        }

        /* renamed from: c */
        public boolean m21878c() {
            return this.f19027b;
        }

        public String toString() {
            return m21878c() ? "FALL_THROUGH" : String.valueOf(this.f19026a);
        }
    }

    static {
        String m13718S0;
        m13718S0 = C9654p.m13718S0(C6795f.class.getCanonicalName(), ".", "");
        f19002d = m13718S0;
        f19003e = new C6796a("NO_LOCKS", InterfaceC6802f.f19012a, C6794e.f19001b);
    }

    /* synthetic */ C6795f(String str, InterfaceC6802f interfaceC6802f, InterfaceC6817k interfaceC6817k, C6796a c6796a) {
        this(str, interfaceC6802f, interfaceC6817k);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m21909j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.C6795f.m21909j(int):void");
    }

    /* renamed from: k */
    static /* synthetic */ InterfaceC6802f m21908k(C6795f c6795f) {
        return c6795f.f19005b;
    }

    /* renamed from: m */
    private static <K> ConcurrentMap<K, Object> m21906m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static <T extends Throwable> T m21903q(T t) {
        if (t == null) {
            m21909j(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (!stackTrace[i].getClassName().startsWith(f19002d)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    @Override // gi.InterfaceC6821n
    /* renamed from: a */
    public <K, V> InterfaceC6790a<K, V> mo21869a() {
        return new C6799d(this, m21906m(), null);
    }

    @Override // gi.InterfaceC6821n
    /* renamed from: b */
    public <T> InterfaceC6815i<T> mo21868b(Function0<? extends T> function0, T t) {
        if (function0 == null) {
            m21909j(26);
        }
        if (t == null) {
            m21909j(27);
        }
        return new C6797b(this, function0, t);
    }

    @Override // gi.InterfaceC6821n
    /* renamed from: c */
    public <T> InterfaceC6815i<T> mo21867c(Function0<? extends T> function0) {
        if (function0 == null) {
            m21909j(23);
        }
        return new C6807j(this, function0);
    }

    @Override // gi.InterfaceC6821n
    /* renamed from: d */
    public <T> T mo21866d(Function0<? extends T> function0) {
        if (function0 == null) {
            m21909j(34);
        }
        this.f19004a.lock();
        try {
            return function0.invoke();
        } finally {
        }
    }

    @Override // gi.InterfaceC6821n
    /* renamed from: e */
    public <T> InterfaceC6816j<T> mo21865e(Function0<? extends T> function0) {
        if (function0 == null) {
            m21909j(30);
        }
        return new C6805h(this, function0);
    }

    @Override // gi.InterfaceC6821n
    /* renamed from: f */
    public <T> InterfaceC6815i<T> mo21864f(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, Unit> function12) {
        if (function0 == null) {
            m21909j(28);
        }
        if (function12 == null) {
            m21909j(29);
        }
        return new C6798c(this, function0, function1, function12);
    }

    @Override // gi.InterfaceC6821n
    /* renamed from: g */
    public <K, V> InterfaceC6814h<K, V> mo21863g(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m21909j(19);
        }
        InterfaceC6814h<K, V> m21904o = m21904o(function1, m21906m());
        if (m21904o == null) {
            m21909j(20);
        }
        return m21904o;
    }

    @Override // gi.InterfaceC6821n
    /* renamed from: h */
    public <K, V> InterfaceC6791b<K, V> mo21862h() {
        return new C6800e(this, m21906m(), null);
    }

    @Override // gi.InterfaceC6821n
    /* renamed from: i */
    public <K, V> InterfaceC6813g<K, V> mo21861i(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m21909j(9);
        }
        InterfaceC6813g<K, V> m21905n = m21905n(function1, m21906m());
        if (m21905n == null) {
            m21909j(10);
        }
        return m21905n;
    }

    /* renamed from: n */
    public <K, V> InterfaceC6813g<K, V> m21905n(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m21909j(14);
        }
        if (concurrentMap == null) {
            m21909j(15);
        }
        return new C6810m(this, concurrentMap, function1);
    }

    /* renamed from: o */
    public <K, V> InterfaceC6814h<K, V> m21904o(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m21909j(21);
        }
        if (concurrentMap == null) {
            m21909j(22);
        }
        return new C6809l(this, concurrentMap, function1);
    }

    /* renamed from: p */
    protected <K, V> C6812o<V> mo21901p(String str, K k) {
        String str2;
        if (str == null) {
            m21909j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) m21903q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f19006c + ")";
    }

    private C6795f(String str, InterfaceC6802f interfaceC6802f, InterfaceC6817k interfaceC6817k) {
        if (str == null) {
            m21909j(4);
        }
        if (interfaceC6802f == null) {
            m21909j(5);
        }
        if (interfaceC6817k == null) {
            m21909j(6);
        }
        this.f19004a = interfaceC6817k;
        this.f19005b = interfaceC6802f;
        this.f19006c = str;
    }

    public C6795f(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public C6795f(String str, Runnable runnable, Function1<InterruptedException, Unit> function1) {
        this(str, InterfaceC6802f.f19012a, InterfaceC6817k.f19028a.m21874a(runnable, function1));
    }
}
