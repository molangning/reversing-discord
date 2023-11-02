package kg;

import com.facebook.react.util.JSStackTrace;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p270oh.AbstractC11112d;
import p340sf.C12466c;
import p407wg.C13548d;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0003\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m14357d2 = {"Lkg/j;", "", "", "a", "<init>", "()V", "b", "c", "d", "e", "Lkg/j$a;", "Lkg/j$b;", "Lkg/j$c;", "Lkg/j$d;", "Lkg/j$e;", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC9262j {

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R%\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lkg/j$a;", "Lkg/j;", "", "a", "Ljava/lang/Class;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "()Ljava/util/List;", "methods", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9263a extends AbstractC9262j {

        /* renamed from: a */
        private final Class<?> f24327a;

        /* renamed from: b */
        private final List<Method> f24328b;

        @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.j$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9264a extends AbstractC9614s implements Function1<Method, CharSequence> {

            /* renamed from: j */
            public static final C9264a f24329j = new C9264a();

            C9264a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                C9612q.m13918g(returnType, "it.returnType");
                return C13548d.m2245b(returnType);
            }
        }

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.j$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C9265b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int m5209d;
                m5209d = C12466c.m5209d(((Method) t).getName(), ((Method) t2).getName());
                return m5209d;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9263a(Class<?> jClass) {
            super(null);
            List<Method> m14209k0;
            C9612q.m13917h(jClass, "jClass");
            this.f24327a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            C9612q.m13918g(declaredMethods, "jClass.declaredMethods");
            m14209k0 = C9538f.m14209k0(declaredMethods, new C9265b());
            this.f24328b = m14209k0;
        }

        @Override // kg.AbstractC9262j
        /* renamed from: a */
        public String mo15974a() {
            String m14046d0;
            m14046d0 = C9553r.m14046d0(this.f24328b, "", "<init>(", ")V", 0, null, C9264a.f24329j, 24, null);
            return m14046d0;
        }

        /* renamed from: b */
        public final List<Method> m15980b() {
            return this.f24328b;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"Lkg/j$b;", "Lkg/j;", "", "a", "Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Constructor;", "b", "()Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9266b extends AbstractC9262j {

        /* renamed from: a */
        private final Constructor<?> f24330a;

        @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.j$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9267a extends AbstractC9614s implements Function1<Class<?>, CharSequence> {

            /* renamed from: j */
            public static final C9267a f24331j = new C9267a();

            C9267a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final CharSequence invoke(Class<?> it) {
                C9612q.m13918g(it, "it");
                return C13548d.m2245b(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9266b(Constructor<?> constructor) {
            super(null);
            C9612q.m13917h(constructor, "constructor");
            this.f24330a = constructor;
        }

        @Override // kg.AbstractC9262j
        /* renamed from: a */
        public String mo15974a() {
            String m14217c0;
            Class<?>[] parameterTypes = this.f24330a.getParameterTypes();
            C9612q.m13918g(parameterTypes, "constructor.parameterTypes");
            m14217c0 = C9538f.m14217c0(parameterTypes, "", "<init>(", ")V", 0, null, C9267a.f24331j, 24, null);
            return m14217c0;
        }

        /* renamed from: b */
        public final Constructor<?> m15978b() {
            return this.f24330a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"Lkg/j$c;", "Lkg/j;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9268c extends AbstractC9262j {

        /* renamed from: a */
        private final Method f24332a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9268c(Method method) {
            super(null);
            C9612q.m13917h(method, "method");
            this.f24332a = method;
        }

        @Override // kg.AbstractC9262j
        /* renamed from: a */
        public String mo15974a() {
            String m15888b;
            m15888b = C9323n0.m15888b(this.f24332a);
            return m15888b;
        }

        /* renamed from: b */
        public final Method m15976b() {
            return this.f24332a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lkg/j$d;", "Lkg/j;", "", "a", "Loh/d$b;", "Loh/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "b", "Ljava/lang/String;", "_signature", "()Ljava/lang/String;", "constructorDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.j$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9269d extends AbstractC9262j {

        /* renamed from: a */
        private final AbstractC11112d.C11114b f24333a;

        /* renamed from: b */
        private final String f24334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9269d(AbstractC11112d.C11114b signature) {
            super(null);
            C9612q.m13917h(signature, "signature");
            this.f24333a = signature;
            this.f24334b = signature.mo9140a();
        }

        @Override // kg.AbstractC9262j
        /* renamed from: a */
        public String mo15974a() {
            return this.f24334b;
        }

        /* renamed from: b */
        public final String m15975b() {
            return this.f24333a.mo9139b();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\r¨\u0006\u0012"}, m14357d2 = {"Lkg/j$e;", "Lkg/j;", "", "a", "Loh/d$b;", "Loh/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "b", "Ljava/lang/String;", "_signature", "c", "()Ljava/lang/String;", JSStackTrace.METHOD_NAME_KEY, "methodDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.j$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9270e extends AbstractC9262j {

        /* renamed from: a */
        private final AbstractC11112d.C11114b f24335a;

        /* renamed from: b */
        private final String f24336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9270e(AbstractC11112d.C11114b signature) {
            super(null);
            C9612q.m13917h(signature, "signature");
            this.f24335a = signature;
            this.f24336b = signature.mo9140a();
        }

        @Override // kg.AbstractC9262j
        /* renamed from: a */
        public String mo15974a() {
            return this.f24336b;
        }

        /* renamed from: b */
        public final String m15973b() {
            return this.f24335a.mo9139b();
        }

        /* renamed from: c */
        public final String m15972c() {
            return this.f24335a.mo9138c();
        }
    }

    private AbstractC9262j() {
    }

    public /* synthetic */ AbstractC9262j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo15974a();
}