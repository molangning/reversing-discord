package p407wg;

import gh.EnumC6767d0;
import gh.InterfaceC6760a;
import gh.InterfaceC6770g;
import gh.InterfaceC6773j;
import gh.InterfaceC6786w;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9600j0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import p305qg.AbstractC11963n1;
import p305qg.C11949m1;
import ph.C11633c;
import ph.C11638f;
import si.C12552o;
import ug.C12970a;
import ug.C12971b;
import ug.C12972c;

/* renamed from: wg.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13559l extends AbstractC13571p implements InterfaceC13555h, InterfaceC13577v, InterfaceC6770g {

    /* renamed from: a */
    private final Class<?> f34944a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C13560a extends C9605m implements Function1<Member, Boolean> {

        /* renamed from: j */
        public static final C13560a f34945j = new C13560a();

        C13560a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final Boolean invoke(Member p0) {
            C9612q.m13917h(p0, "p0");
            return Boolean.valueOf(p0.isSynthetic());
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C13561b extends C9605m implements Function1<Constructor<?>, C13570o> {

        /* renamed from: j */
        public static final C13561b f34946j = new C13561b();

        C13561b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final C13570o invoke(Constructor<?> p0) {
            C9612q.m13917h(p0, "p0");
            return new C13570o(p0);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C13570o.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C13562c extends C9605m implements Function1<Member, Boolean> {

        /* renamed from: j */
        public static final C13562c f34947j = new C13562c();

        C13562c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final Boolean invoke(Member p0) {
            C9612q.m13917h(p0, "p0");
            return Boolean.valueOf(p0.isSynthetic());
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg.l$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C13563d extends C9605m implements Function1<Field, C13573r> {

        /* renamed from: j */
        public static final C13563d f34948j = new C13563d();

        C13563d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final C13573r invoke(Field p0) {
            C9612q.m13917h(p0, "p0");
            return new C13573r(p0);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C13573r.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg.l$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13564e extends AbstractC9614s implements Function1<Class<?>, Boolean> {

        /* renamed from: j */
        public static final C13564e f34949j = new C13564e();

        C13564e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            C9612q.m13918g(simpleName, "it.simpleName");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg.l$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13565f extends AbstractC9614s implements Function1<Class<?>, C11638f> {

        /* renamed from: j */
        public static final C13565f f34950j = new C13565f();

        C13565f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C11638f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!C11638f.m7420h(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return C11638f.m7422f(simpleName);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg.l$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13566g extends AbstractC9614s implements Function1<Method, Boolean> {
        C13566g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r0.m2211W(r5) == false) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
            /*
                r4 = this;
                boolean r0 = r5.isSynthetic()
                r1 = 0
                if (r0 == 0) goto L8
                goto L1f
            L8:
                wg.l r0 = p407wg.C13559l.this
                boolean r0 = r0.mo2202v()
                r2 = 1
                if (r0 == 0) goto L1e
                wg.l r0 = p407wg.C13559l.this
                java.lang.String r3 = "method"
                kotlin.jvm.internal.C9612q.m13918g(r5, r3)
                boolean r5 = p407wg.C13559l.m2218P(r0, r5)
                if (r5 != 0) goto L1f
            L1e:
                r1 = r2
            L1f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p407wg.C13559l.C13566g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg.l$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C13567h extends C9605m implements Function1<Method, C13576u> {

        /* renamed from: j */
        public static final C13567h f34952j = new C13567h();

        C13567h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final C13576u invoke(Method p0) {
            C9612q.m13917h(p0, "p0");
            return new C13576u(p0);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C13576u.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }
    }

    public C13559l(Class<?> klass) {
        C9612q.m13917h(klass, "klass");
        this.f34944a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final boolean m2211W(Method method) {
        String name = method.getName();
        if (C9612q.m13922c(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            C9612q.m13918g(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (C9612q.m13922c(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: C */
    public Collection<InterfaceC6773j> mo2221C() {
        List m14104i;
        Class<?>[] m2264c = C13542b.f34912a.m2264c(this.f34944a);
        if (m2264c != null) {
            ArrayList arrayList = new ArrayList(m2264c.length);
            for (Class<?> cls : m2264c) {
                arrayList.add(new C13569n(cls));
            }
            return arrayList;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: D */
    public boolean mo2164D() {
        return false;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: J */
    public boolean mo2220J() {
        return this.f34944a.isInterface();
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: K */
    public EnumC6767d0 mo2219K() {
        return null;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: Q */
    public List<C13570o> mo2209l() {
        Sequence m14198u;
        Sequence m4859q;
        Sequence m4851y;
        List<C13570o> m4867E;
        Constructor<?>[] declaredConstructors = this.f34944a.getDeclaredConstructors();
        C9612q.m13918g(declaredConstructors, "klass.declaredConstructors");
        m14198u = C9538f.m14198u(declaredConstructors);
        m4859q = C12552o.m4859q(m14198u, C13560a.f34945j);
        m4851y = C12552o.m4851y(m4859q, C13561b.f34946j);
        m4867E = C12552o.m4867E(m4851y);
        return m4867E;
    }

    @Override // p407wg.InterfaceC13555h
    /* renamed from: R */
    public Class<?> mo2174c() {
        return this.f34944a;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: S */
    public List<C13573r> mo2201x() {
        Sequence m14198u;
        Sequence m4859q;
        Sequence m4851y;
        List<C13573r> m4867E;
        Field[] declaredFields = this.f34944a.getDeclaredFields();
        C9612q.m13918g(declaredFields, "klass.declaredFields");
        m14198u = C9538f.m14198u(declaredFields);
        m4859q = C12552o.m4859q(m14198u, C13562c.f34947j);
        m4851y = C12552o.m4851y(m4859q, C13563d.f34948j);
        m4867E = C12552o.m4867E(m4851y);
        return m4867E;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: T */
    public List<C11638f> mo2223A() {
        Sequence m14198u;
        Sequence m4859q;
        Sequence m4850z;
        List<C11638f> m4867E;
        Class<?>[] declaredClasses = this.f34944a.getDeclaredClasses();
        C9612q.m13918g(declaredClasses, "klass.declaredClasses");
        m14198u = C9538f.m14198u(declaredClasses);
        m4859q = C12552o.m4859q(m14198u, C13564e.f34949j);
        m4850z = C12552o.m4850z(m4859q, C13565f.f34950j);
        m4867E = C12552o.m4867E(m4850z);
        return m4867E;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: U */
    public List<C13576u> mo2222B() {
        Sequence m14198u;
        Sequence m4860p;
        Sequence m4851y;
        List<C13576u> m4867E;
        Method[] declaredMethods = this.f34944a.getDeclaredMethods();
        C9612q.m13918g(declaredMethods, "klass.declaredMethods");
        m14198u = C9538f.m14198u(declaredMethods);
        m4860p = C12552o.m4860p(m14198u, new C13566g());
        m4851y = C12552o.m4851y(m4860p, C13567h.f34952j);
        m4867E = C12552o.m4867E(m4851y);
        return m4867E;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: V */
    public C13559l mo2207o() {
        Class<?> declaringClass = this.f34944a.getDeclaringClass();
        if (declaringClass != null) {
            return new C13559l(declaringClass);
        }
        return null;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC6760a mo2159b(C11633c c11633c) {
        return mo2159b(c11633c);
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: e */
    public C11633c mo2210e() {
        C11633c m7471b = C13548d.m2246a(this.f34944a).m7471b();
        C9612q.m13918g(m7471b, "klass.classId.asSingleFqName()");
        return m7471b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13559l) && C9612q.m13922c(this.f34944a, ((C13559l) obj).f34944a);
    }

    @Override // gh.InterfaceC6782s
    /* renamed from: g */
    public boolean mo2173g() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // gh.InterfaceC6766d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // p407wg.InterfaceC13577v
    public int getModifiers() {
        return this.f34944a.getModifiers();
    }

    @Override // gh.InterfaceC6783t
    public C11638f getName() {
        C11638f m7422f = C11638f.m7422f(this.f34944a.getSimpleName());
        C9612q.m13918g(m7422f, "identifier(klass.simpleName)");
        return m7422f;
    }

    @Override // gh.InterfaceC6789z
    public List<C13541a0> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f34944a.getTypeParameters();
        C9612q.m13918g(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new C13541a0(typeVariable));
        }
        return arrayList;
    }

    @Override // gh.InterfaceC6782s
    public AbstractC11963n1 getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return C11949m1.C11957h.f30955c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return C11949m1.C11954e.f30952c;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return C12972c.f33727c;
            }
            return C12971b.f33726c;
        }
        return C12970a.f33725c;
    }

    public int hashCode() {
        return this.f34944a.hashCode();
    }

    @Override // gh.InterfaceC6782s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // gh.InterfaceC6782s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: m */
    public Collection<InterfaceC6773j> mo2208m() {
        List<Type> m14101l;
        int m14093t;
        List m14104i;
        Object obj = Object.class;
        if (C9612q.m13922c(this.f34944a, obj)) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        C9600j0 c9600j0 = new C9600j0(2);
        Object genericSuperclass = this.f34944a.getGenericSuperclass();
        if (genericSuperclass != null) {
            obj = genericSuperclass;
        }
        c9600j0.m13945a(obj);
        Type[] genericInterfaces = this.f34944a.getGenericInterfaces();
        C9612q.m13918g(genericInterfaces, "klass.genericInterfaces");
        c9600j0.m13944b(genericInterfaces);
        m14101l = C9545j.m14101l(c9600j0.m13942d(new Type[c9600j0.m13943c()]));
        m14093t = C9546k.m14093t(m14101l, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (Type type : m14101l) {
            arrayList.add(new C13569n(type));
        }
        return arrayList;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: p */
    public Collection<InterfaceC6786w> mo2206p() {
        Object[] m2263d = C13542b.f34912a.m2263d(this.f34944a);
        if (m2263d == null) {
            m2263d = new Object[0];
        }
        ArrayList arrayList = new ArrayList(m2263d.length);
        for (Object obj : m2263d) {
            arrayList.add(new C13580y(obj));
        }
        return arrayList;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: q */
    public boolean mo2205q() {
        return this.f34944a.isAnnotation();
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: r */
    public boolean mo2204r() {
        Boolean m2262e = C13542b.f34912a.m2262e(this.f34944a);
        if (m2262e != null) {
            return m2262e.booleanValue();
        }
        return false;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: s */
    public boolean mo2203s() {
        return false;
    }

    public String toString() {
        return C13559l.class.getName() + ": " + this.f34944a;
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: v */
    public boolean mo2202v() {
        return this.f34944a.isEnum();
    }

    @Override // gh.InterfaceC6770g
    /* renamed from: y */
    public boolean mo2200y() {
        Boolean m2261f = C13542b.f34912a.m2261f(this.f34944a);
        if (m2261f != null) {
            return m2261f.booleanValue();
        }
        return false;
    }

    @Override // p407wg.InterfaceC13555h, gh.InterfaceC6766d
    /* renamed from: b */
    public C13551e mo2159b(C11633c fqName) {
        Annotation[] declaredAnnotations;
        C9612q.m13917h(fqName, "fqName");
        AnnotatedElement mo2174c = mo2174c();
        if (mo2174c == null || (declaredAnnotations = mo2174c.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C13556i.m2227a(declaredAnnotations, fqName);
    }

    @Override // p407wg.InterfaceC13555h, gh.InterfaceC6766d
    public List<C13551e> getAnnotations() {
        List<C13551e> m14104i;
        Annotation[] declaredAnnotations;
        List<C13551e> m2226b;
        AnnotatedElement mo2174c = mo2174c();
        if (mo2174c == null || (declaredAnnotations = mo2174c.getDeclaredAnnotations()) == null || (m2226b = C13556i.m2226b(declaredAnnotations)) == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return m2226b;
    }
}
