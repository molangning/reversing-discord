package ag;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.InterfaceC9592g;
import kotlin.reflect.KClass;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u001b\n\u0002\b\u0004\"-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018G¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"-\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004\"+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00028G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"'\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0010*\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m14357d2 = {"T", "Lkotlin/reflect/KClass;", "Ljava/lang/Class;", "b", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "java", "", "d", "javaPrimitiveType", "c", "javaObjectType", "e", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "kotlin", "", "a", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "annotationClass", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: ag.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0156a {
    /* renamed from: a */
    public static final <T extends Annotation> KClass<? extends T> m41056a(T t) {
        C9612q.m13917h(t, "<this>");
        Class<? extends Annotation> annotationType = t.annotationType();
        C9612q.m13918g(annotationType, "this as java.lang.annota…otation).annotationType()");
        KClass<? extends T> m41052e = m41052e(annotationType);
        C9612q.m13919f(m41052e, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return m41052e;
    }

    /* renamed from: b */
    public static final <T> Class<T> m41055b(KClass<T> kClass) {
        C9612q.m13917h(kClass, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC9592g) kClass).mo13896e();
        C9612q.m13919f(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    /* renamed from: c */
    public static final <T> Class<T> m41054c(KClass<T> kClass) {
        C9612q.m13917h(kClass, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC9592g) kClass).mo13896e();
        if (!cls.isPrimitive()) {
            C9612q.m13919f(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        C9612q.m13919f(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* renamed from: d */
    public static final <T> Class<T> m41053d(KClass<T> kClass) {
        C9612q.m13917h(kClass, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC9592g) kClass).mo13896e();
        if (cls.isPrimitive()) {
            C9612q.m13919f(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    /* renamed from: e */
    public static final <T> KClass<T> m41052e(Class<T> cls) {
        C9612q.m13917h(cls, "<this>");
        return C9591f0.m13969b(cls);
    }
}