package p045cj;

import ag.C0156a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import p470zi.C14272c;
import p470zi.C14278g;
import p470zi.InterfaceC14271b;
import p470zi.InterfaceC14277f;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001aM\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0005*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\r\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u000eH\u0000\u001aO\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0010\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\t\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\"\u0010\u0010\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\t\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a\u001c\u0010\u0017\u001a\u00020\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001aQ\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\"\u0010\u0010\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\t\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u0014\u001a\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u000eH\u0002\u001a\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a\u0016\u0010\u001f\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¨\u0006 "}, m14357d2 = {"", "T", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "b", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "", "n", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "", "l", "Ljava/lang/Class;", "m", "args", "d", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "c", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "i", "j", "g", "jClass", "h", "a", "e", "f", "rootClass", "k", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: cj.l1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2612l1 {
    /* renamed from: a */
    private static final Object m32868a(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final <T> KSerializer<T> m32867b(KClass<T> kClass) {
        C9612q.m13917h(kClass, "<this>");
        return m32865d(kClass, new KSerializer[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r3 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> kotlinx.serialization.KSerializer<T> m32866c(java.lang.Class<T> r8, kotlinx.serialization.KSerializer<java.lang.Object>... r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r8, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.C9612q.m13917h(r9, r0)
            boolean r0 = r8.isEnum()
            if (r0 == 0) goto L1b
            boolean r0 = m32860i(r8)
            if (r0 == 0) goto L1b
            kotlinx.serialization.KSerializer r8 = m32864e(r8)
            return r8
        L1b:
            boolean r0 = r8.isInterface()
            if (r0 == 0) goto L28
            kotlinx.serialization.KSerializer r0 = m32862g(r8)
            if (r0 == 0) goto L28
            return r0
        L28:
            int r0 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)
            kotlinx.serialization.KSerializer[] r9 = (kotlinx.serialization.KSerializer[]) r9
            kotlinx.serialization.KSerializer r9 = m32861h(r8, r9)
            if (r9 == 0) goto L36
            return r9
        L36:
            kotlinx.serialization.KSerializer r9 = m32863f(r8)
            if (r9 == 0) goto L3d
            return r9
        L3d:
            r9 = 0
            java.lang.Class[] r0 = r8.getDeclaredClasses()     // Catch: java.lang.NoSuchFieldException -> L7f
            java.lang.String r1 = "declaredClasses"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L7f
            int r1 = r0.length     // Catch: java.lang.NoSuchFieldException -> L7f
            r2 = 0
            r4 = r9
            r3 = r2
        L4b:
            if (r2 >= r1) goto L63
            r5 = r0[r2]     // Catch: java.lang.NoSuchFieldException -> L7f
            java.lang.String r6 = r5.getSimpleName()     // Catch: java.lang.NoSuchFieldException -> L7f
            java.lang.String r7 = "$serializer"
            boolean r6 = kotlin.jvm.internal.C9612q.m13922c(r6, r7)     // Catch: java.lang.NoSuchFieldException -> L7f
            if (r6 == 0) goto L60
            if (r3 == 0) goto L5e
            goto L65
        L5e:
            r3 = 1
            r4 = r5
        L60:
            int r2 = r2 + 1
            goto L4b
        L63:
            if (r3 != 0) goto L66
        L65:
            r4 = r9
        L66:
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.NoSuchFieldException -> L7f
            if (r4 == 0) goto L77
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r4.getField(r0)     // Catch: java.lang.NoSuchFieldException -> L7f
            if (r0 == 0) goto L77
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.NoSuchFieldException -> L7f
            goto L78
        L77:
            r0 = r9
        L78:
            boolean r1 = r0 instanceof kotlinx.serialization.KSerializer     // Catch: java.lang.NoSuchFieldException -> L7f
            if (r1 == 0) goto L7f
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0     // Catch: java.lang.NoSuchFieldException -> L7f
            goto L80
        L7f:
            r0 = r9
        L80:
            if (r0 == 0) goto L83
            return r0
        L83:
            boolean r0 = m32859j(r8)
            if (r0 == 0) goto L92
            zi.c r9 = new zi.c
            kotlin.reflect.KClass r8 = ag.C0156a.m41052e(r8)
            r9.<init>(r8)
        L92:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p045cj.C2612l1.m32866c(java.lang.Class, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    /* renamed from: d */
    public static final <T> KSerializer<T> m32865d(KClass<T> kClass, KSerializer<Object>... args) {
        C9612q.m13917h(kClass, "<this>");
        C9612q.m13917h(args, "args");
        return m32866c(C0156a.m41055b(kClass), (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    /* renamed from: e */
    private static final <T> KSerializer<T> m32864e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        C9612q.m13918g(canonicalName, "canonicalName");
        C9612q.m13919f(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C2562b0(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r5 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
        if (r5 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> kotlinx.serialization.KSerializer<T> m32863f(java.lang.Class<T> r11) {
        /*
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r1 = "declaredFields"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Lf:
            r7 = 1
            if (r4 >= r1) goto L41
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.C9612q.m13922c(r9, r10)
            if (r9 == 0) goto L36
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.C9612q.m13922c(r9, r11)
            if (r9 == 0) goto L36
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L36
            r9 = r7
            goto L37
        L36:
            r9 = r3
        L37:
            if (r9 == 0) goto L3e
            if (r5 == 0) goto L3c
            goto L43
        L3c:
            r5 = r7
            r6 = r8
        L3e:
            int r4 = r4 + 1
            goto Lf
        L41:
            if (r5 != 0) goto L44
        L43:
            r6 = r2
        L44:
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 != 0) goto L49
            return r2
        L49:
            java.lang.Object r0 = r6.get(r2)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r1 = "methods"
            kotlin.jvm.internal.C9612q.m13918g(r11, r1)
            int r1 = r11.length
            r6 = r2
            r4 = r3
            r5 = r4
        L5a:
            if (r4 >= r1) goto L94
            r8 = r11[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "serializer"
            boolean r9 = kotlin.jvm.internal.C9612q.m13922c(r9, r10)
            if (r9 == 0) goto L89
            java.lang.Class[] r9 = r8.getParameterTypes()
            java.lang.String r10 = "it.parameterTypes"
            kotlin.jvm.internal.C9612q.m13918g(r9, r10)
            int r9 = r9.length
            if (r9 != 0) goto L78
            r9 = r7
            goto L79
        L78:
            r9 = r3
        L79:
            if (r9 == 0) goto L89
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r10 = kotlinx.serialization.KSerializer.class
            boolean r9 = kotlin.jvm.internal.C9612q.m13922c(r9, r10)
            if (r9 == 0) goto L89
            r9 = r7
            goto L8a
        L89:
            r9 = r3
        L8a:
            if (r9 == 0) goto L91
            if (r5 == 0) goto L8f
            goto L96
        L8f:
            r5 = r7
            r6 = r8
        L91:
            int r4 = r4 + 1
            goto L5a
        L94:
            if (r5 != 0) goto L97
        L96:
            r6 = r2
        L97:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L9c
            return r2
        L9c:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.Object r11 = r6.invoke(r0, r11)
            boolean r0 = r11 instanceof kotlinx.serialization.KSerializer
            if (r0 == 0) goto La9
            r2 = r11
            kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
        La9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p045cj.C2612l1.m32863f(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    /* renamed from: g */
    private static final <T> KSerializer<T> m32862g(Class<T> cls) {
        InterfaceC14277f interfaceC14277f = (InterfaceC14277f) cls.getAnnotation(InterfaceC14277f.class);
        if (interfaceC14277f != null && !C9612q.m13922c(C9591f0.m13969b(interfaceC14277f.with()), C9591f0.m13969b(C14272c.class))) {
            return null;
        }
        return new C14272c(C0156a.m41052e(cls));
    }

    /* renamed from: h */
    private static final <T> KSerializer<T> m32861h(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        boolean z;
        Class[] clsArr;
        Object m32868a = m32868a(cls);
        if (m32868a == null) {
            return null;
        }
        try {
            if (kSerializerArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = m32868a.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(m32868a, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (!(invoke instanceof KSerializer)) {
                return null;
            }
            return (KSerializer) invoke;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    /* renamed from: i */
    private static final <T> boolean m32860i(Class<T> cls) {
        if (cls.getAnnotation(InterfaceC14277f.class) == null && cls.getAnnotation(InterfaceC14271b.class) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static final <T> boolean m32859j(Class<T> cls) {
        if (cls.getAnnotation(InterfaceC14271b.class) != null) {
            return true;
        }
        InterfaceC14277f interfaceC14277f = (InterfaceC14277f) cls.getAnnotation(InterfaceC14277f.class);
        if (interfaceC14277f != null && C9612q.m13922c(C9591f0.m13969b(interfaceC14277f.with()), C9591f0.m13969b(C14272c.class))) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m32858k(KClass<Object> rootClass) {
        C9612q.m13917h(rootClass, "rootClass");
        return C0156a.m41055b(rootClass).isArray();
    }

    /* renamed from: l */
    public static final Void m32857l(KClass<?> kClass) {
        C9612q.m13917h(kClass, "<this>");
        C2616m1.m32843f(kClass);
        throw new C11568i();
    }

    /* renamed from: m */
    public static final Void m32856m(Class<?> cls) {
        C9612q.m13917h(cls, "<this>");
        throw new C14278g(C2616m1.m32844e(C0156a.m41052e(cls)));
    }

    /* renamed from: n */
    public static final <T, E extends T> E[] m32855n(ArrayList<E> arrayList, KClass<T> eClass) {
        C9612q.m13917h(arrayList, "<this>");
        C9612q.m13917h(eClass, "eClass");
        Object newInstance = Array.newInstance(C0156a.m41055b(eClass), arrayList.size());
        C9612q.m13919f(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) newInstance);
        C9612q.m13918g(eArr, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return eArr;
    }
}
