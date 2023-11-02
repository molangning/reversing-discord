package vg;

import ag.C0156a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import ng.EnumC10876i;
import p160ih.InterfaceC7564r;
import p389vh.C13300f;
import p407wg.C13548d;
import p449yh.EnumC14028e;
import pg.C11599c;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;
import ph.C11640h;

/* renamed from: vg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C13280c {

    /* renamed from: a */
    public static final C13280c f34360a = new C13280c();

    private C13280c() {
    }

    /* renamed from: a */
    private final C13300f m2866a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            C9612q.m13918g(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (C9612q.m13922c(cls, Void.TYPE)) {
                C11632b m7460m = C11632b.m7460m(C10884k.C10885a.f28480f.m7437l());
                C9612q.m13918g(m7460m, "topLevel(StandardNames.FqNames.unit.toSafe())");
                return new C13300f(m7460m, i);
            }
            EnumC10876i m875f = EnumC14028e.m879b(cls.getName()).m875f();
            C9612q.m13918g(m875f, "get(currentClass.name).primitiveType");
            if (i > 0) {
                C11632b m7460m2 = C11632b.m7460m(m875f.m9769b());
                C9612q.m13918g(m7460m2, "topLevel(primitiveType.arrayTypeFqName)");
                return new C13300f(m7460m2, i - 1);
            }
            C11632b m7460m3 = C11632b.m7460m(m875f.m9767d());
            C9612q.m13918g(m7460m3, "topLevel(primitiveType.typeFqName)");
            return new C13300f(m7460m3, i);
        }
        C11632b m2246a = C13548d.m2246a(cls);
        C11599c c11599c = C11599c.f30110a;
        C11633c m7471b = m2246a.m7471b();
        C9612q.m13918g(m7471b, "javaClassId.asSingleFqName()");
        C11632b m7552m = c11599c.m7552m(m7471b);
        if (m7552m != null) {
            m2246a = m7552m;
        }
        return new C13300f(m2246a, i);
    }

    /* renamed from: c */
    private final void m2864c(Class<?> cls, InterfaceC7564r.InterfaceC7568d interfaceC7568d) {
        boolean z;
        Constructor<?>[] constructorArr;
        int i;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        C9612q.m13918g(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor<?> constructor = declaredConstructors[i2];
            C11638f c11638f = C11640h.f30226j;
            C13293m c13293m = C13293m.f34374a;
            C9612q.m13918g(constructor, "constructor");
            InterfaceC7564r.InterfaceC7569e mo20399a = interfaceC7568d.mo20399a(c11638f, c13293m.m2832a(constructor));
            if (mo20399a == null) {
                constructorArr = declaredConstructors;
                i = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                C9612q.m13918g(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9612q.m13918g(annotation, "annotation");
                    m2861f(mo20399a, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C9612q.m13918g(parameterAnnotations, "parameterAnnotations");
                if (parameterAnnotations.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        Annotation[] annotations = parameterAnnotations[i3];
                        C9612q.m13918g(annotations, "annotations");
                        int length4 = annotations.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            Annotation annotation2 = annotations[i4];
                            Class<?> m41055b = C0156a.m41055b(C0156a.m41056a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i5 = length;
                            C11632b m2246a = C13548d.m2246a(m41055b);
                            int i6 = length2;
                            C9612q.m13918g(annotation2, "annotation");
                            InterfaceC7564r.InterfaceC7565a mo20397b = mo20399a.mo20397b(i3 + length2, m2246a, new C13279b(annotation2));
                            if (mo20397b != null) {
                                f34360a.m2859h(mo20397b, annotation2, m41055b);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i5;
                            length2 = i6;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                mo20399a.mo11509a();
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    /* renamed from: d */
    private final void m2863d(Class<?> cls, InterfaceC7564r.InterfaceC7568d interfaceC7568d) {
        Field[] declaredFields = cls.getDeclaredFields();
        C9612q.m13918g(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            C11638f m7422f = C11638f.m7422f(field.getName());
            C9612q.m13918g(m7422f, "identifier(field.name)");
            C13293m c13293m = C13293m.f34374a;
            C9612q.m13918g(field, "field");
            InterfaceC7564r.InterfaceC7567c mo20398b = interfaceC7568d.mo20398b(m7422f, c13293m.m2831b(field), null);
            if (mo20398b != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                C9612q.m13918g(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9612q.m13918g(annotation, "annotation");
                    m2861f(mo20398b, annotation);
                }
                mo20398b.mo11509a();
            }
        }
    }

    /* renamed from: e */
    private final void m2862e(Class<?> cls, InterfaceC7564r.InterfaceC7568d interfaceC7568d) {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        C9612q.m13918g(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            C11638f m7422f = C11638f.m7422f(method.getName());
            C9612q.m13918g(m7422f, "identifier(method.name)");
            C13293m c13293m = C13293m.f34374a;
            C9612q.m13918g(method, "method");
            InterfaceC7564r.InterfaceC7569e mo20399a = interfaceC7568d.mo20399a(m7422f, c13293m.m2830c(method));
            if (mo20399a == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                C9612q.m13918g(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9612q.m13918g(annotation, "annotation");
                    m2861f(mo20399a, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C9612q.m13918g(parameterAnnotations, "method.parameterAnnotations");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    Annotation[] annotations = annotationArr[i2];
                    C9612q.m13918g(annotations, "annotations");
                    int length3 = annotations.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        Annotation annotation2 = annotations[i3];
                        Class<?> m41055b = C0156a.m41055b(C0156a.m41056a(annotation2));
                        C11632b m2246a = C13548d.m2246a(m41055b);
                        Method[] methodArr2 = declaredMethods;
                        C9612q.m13918g(annotation2, "annotation");
                        InterfaceC7564r.InterfaceC7565a mo20397b = mo20399a.mo20397b(i2, m2246a, new C13279b(annotation2));
                        if (mo20397b != null) {
                            f34360a.m2859h(mo20397b, annotation2, m41055b);
                        }
                        i3++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                mo20399a.mo11509a();
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    /* renamed from: f */
    private final void m2861f(InterfaceC7564r.InterfaceC7567c interfaceC7567c, Annotation annotation) {
        Class<?> m41055b = C0156a.m41055b(C0156a.m41056a(annotation));
        InterfaceC7564r.InterfaceC7565a mo11508c = interfaceC7567c.mo11508c(C13548d.m2246a(m41055b), new C13279b(annotation));
        if (mo11508c != null) {
            f34360a.m2859h(mo11508c, annotation, m41055b);
        }
    }

    /* renamed from: g */
    private final void m2860g(InterfaceC7564r.InterfaceC7565a interfaceC7565a, C11638f c11638f, Object obj) {
        Set set;
        Object m14212h0;
        Class<?> cls = obj.getClass();
        if (C9612q.m13922c(cls, Class.class)) {
            C9612q.m13919f(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            interfaceC7565a.mo16973c(c11638f, m2866a((Class) obj));
            return;
        }
        set = C13287i.f34367a;
        if (set.contains(cls)) {
            interfaceC7565a.mo16970f(c11638f, obj);
        } else if (C13548d.m2239h(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            C9612q.m13918g(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            C11632b m2246a = C13548d.m2246a(cls);
            C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            C11638f m7422f = C11638f.m7422f(((Enum) obj).name());
            C9612q.m13918g(m7422f, "identifier((value as Enum<*>).name)");
            interfaceC7565a.mo16972d(c11638f, m2246a, m7422f);
        } else if (Annotation.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            C9612q.m13918g(interfaces, "clazz.interfaces");
            m14212h0 = C9538f.m14212h0(interfaces);
            Class<?> annotationClass = (Class) m14212h0;
            C9612q.m13918g(annotationClass, "annotationClass");
            InterfaceC7564r.InterfaceC7565a mo16971e = interfaceC7565a.mo16971e(c11638f, C13548d.m2246a(annotationClass));
            if (mo16971e == null) {
                return;
            }
            C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Annotation");
            m2859h(mo16971e, (Annotation) obj, annotationClass);
        } else if (cls.isArray()) {
            InterfaceC7564r.InterfaceC7566b mo16974b = interfaceC7565a.mo16974b(c11638f);
            if (mo16974b == null) {
                return;
            }
            Class<?> componentType = cls.getComponentType();
            int i = 0;
            if (componentType.isEnum()) {
                C9612q.m13918g(componentType, "componentType");
                C11632b m2246a2 = C13548d.m2246a(componentType);
                C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                while (i < length) {
                    Object obj2 = objArr[i];
                    C9612q.m13919f(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                    C11638f m7422f2 = C11638f.m7422f(((Enum) obj2).name());
                    C9612q.m13918g(m7422f2, "identifier((element as Enum<*>).name)");
                    mo16974b.mo16987c(m2246a2, m7422f2);
                    i++;
                }
            } else if (C9612q.m13922c(componentType, Class.class)) {
                C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr2 = (Object[]) obj;
                int length2 = objArr2.length;
                while (i < length2) {
                    Object obj3 = objArr2[i];
                    C9612q.m13919f(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                    mo16974b.mo16986d(m2866a((Class) obj3));
                    i++;
                }
            } else if (Annotation.class.isAssignableFrom(componentType)) {
                C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr3 = (Object[]) obj;
                int length3 = objArr3.length;
                while (i < length3) {
                    Object obj4 = objArr3[i];
                    C9612q.m13918g(componentType, "componentType");
                    InterfaceC7564r.InterfaceC7565a mo16988b = mo16974b.mo16988b(C13548d.m2246a(componentType));
                    if (mo16988b != null) {
                        C9612q.m13919f(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                        m2859h(mo16988b, (Annotation) obj4, componentType);
                    }
                    i++;
                }
            } else {
                C9612q.m13919f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr4 = (Object[]) obj;
                int length4 = objArr4.length;
                while (i < length4) {
                    mo16974b.mo16985e(objArr4[i]);
                    i++;
                }
            }
            mo16974b.mo16989a();
        } else {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        }
    }

    /* renamed from: h */
    private final void m2859h(InterfaceC7564r.InterfaceC7565a interfaceC7565a, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        C9612q.m13918g(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                C9612q.m13920e(invoke);
                C11638f m7422f = C11638f.m7422f(method.getName());
                C9612q.m13918g(m7422f, "identifier(method.name)");
                m2860g(interfaceC7565a, m7422f, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC7565a.mo16975a();
    }

    /* renamed from: b */
    public final void m2865b(Class<?> klass, InterfaceC7564r.InterfaceC7567c visitor) {
        C9612q.m13917h(klass, "klass");
        C9612q.m13917h(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        C9612q.m13918g(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            C9612q.m13918g(annotation, "annotation");
            m2861f(visitor, annotation);
        }
        visitor.mo11509a();
    }

    /* renamed from: i */
    public final void m2858i(Class<?> klass, InterfaceC7564r.InterfaceC7568d memberVisitor) {
        C9612q.m13917h(klass, "klass");
        C9612q.m13917h(memberVisitor, "memberVisitor");
        m2862e(klass, memberVisitor);
        m2864c(klass, memberVisitor);
        m2863d(klass, memberVisitor);
    }
}
