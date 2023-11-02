package p470zi;

import ag.C0156a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import p014aj.C0213a;
import p045cj.C2612l1;
import p045cj.C2644u1;
import p088ej.AbstractC6257c;
import p088ej.C6258d;
import pf.C11568i;
import pf.C11590w;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000\u001a-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u000f*\u00020\u0003*\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\f*\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m14357d2 = {"Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "", "e", "Lej/c;", "d", "h", "", "failOnMissingTypeArgSerializer", "f", "(Lej/c;Ljava/lang/reflect/Type;Z)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "i", "(Lej/c;Ljava/lang/Class;Z)Lkotlinx/serialization/KSerializer;", "T", "jClass", "", "typeArgumentsSerializers", "c", "(Lej/c;Ljava/lang/Class;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Ljava/lang/reflect/GenericArrayType;", "a", "(Lej/c;Ljava/lang/reflect/GenericArrayType;Z)Lkotlinx/serialization/KSerializer;", "b", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "kotlinx-serialization-core"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlinx/serialization/SerializersKt")
/* renamed from: zi.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C14286k {
    /* renamed from: a */
    private static final KSerializer<Object> m250a(AbstractC6257c abstractC6257c, GenericArrayType genericArrayType, boolean z) {
        KSerializer<Object> m254e;
        KClass kClass;
        Object m14249D;
        Type eType = genericArrayType.getGenericComponentType();
        if (eType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) eType).getUpperBounds();
            C9612q.m13918g(upperBounds, "it.upperBounds");
            m14249D = C9538f.m14249D(upperBounds);
            eType = (Type) m14249D;
        }
        C9612q.m13918g(eType, "eType");
        if (z) {
            m254e = C14285j.m257b(abstractC6257c, eType);
        } else {
            m254e = C14285j.m254e(abstractC6257c, eType);
            if (m254e == null) {
                return null;
            }
        }
        if (eType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) eType).getRawType();
            C9612q.m13919f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kClass = C0156a.m41052e((Class) rawType);
        } else if (eType instanceof KClass) {
            kClass = (KClass) eType;
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + C9591f0.m13969b(eType.getClass()));
        }
        C9612q.m13919f(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> m40940a = C0213a.m40940a(kClass, m254e);
        C9612q.m13919f(m40940a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return m40940a;
    }

    /* renamed from: b */
    private static final Class<?> m249b(Type type) {
        Object m14249D;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C9612q.m13918g(rawType, "it.rawType");
            return m249b(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            C9612q.m13918g(upperBounds, "it.upperBounds");
            m14249D = C9538f.m14249D(upperBounds);
            C9612q.m13918g(m14249D, "it.upperBounds.first()");
            return m249b((Type) m14249D);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            C9612q.m13918g(genericComponentType, "it.genericComponentType");
            return m249b(genericComponentType);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + C9591f0.m13969b(type.getClass()));
        }
    }

    /* renamed from: c */
    private static final <T> KSerializer<T> m248c(AbstractC6257c abstractC6257c, Class<T> cls, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> m32866c = C2612l1.m32866c(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (m32866c != null) {
            return m32866c;
        }
        KClass<T> m41052e = C0156a.m41052e(cls);
        KSerializer<T> m32804b = C2644u1.m32804b(m41052e);
        if (m32804b == null) {
            return abstractC6257c.mo23144b(m41052e, list);
        }
        return m32804b;
    }

    /* renamed from: d */
    public static final KSerializer<Object> m247d(AbstractC6257c abstractC6257c, Type type) {
        C9612q.m13917h(abstractC6257c, "<this>");
        C9612q.m13917h(type, "type");
        KSerializer<Object> m245f = m245f(abstractC6257c, type, true);
        if (m245f != null) {
            return m245f;
        }
        C2612l1.m32856m(m249b(type));
        throw new C11568i();
    }

    /* renamed from: e */
    public static final KSerializer<Object> m246e(Type type) {
        C9612q.m13917h(type, "type");
        return C14285j.m257b(C6258d.m23140a(), type);
    }

    /* renamed from: f */
    private static final KSerializer<Object> m245f(AbstractC6257c abstractC6257c, Type type, boolean z) {
        Object m14249D;
        ArrayList<KSerializer> arrayList;
        int m14093t;
        if (type instanceof GenericArrayType) {
            return m250a(abstractC6257c, (GenericArrayType) type, z);
        }
        if (type instanceof Class) {
            return m242i(abstractC6257c, (Class) type, z);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            C9612q.m13919f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) rawType;
            Type[] args = parameterizedType.getActualTypeArguments();
            C9612q.m13918g(args, "args");
            if (z) {
                arrayList = new ArrayList(args.length);
                for (Type it : args) {
                    C9612q.m13918g(it, "it");
                    arrayList.add(C14285j.m257b(abstractC6257c, it));
                }
            } else {
                arrayList = new ArrayList(args.length);
                for (Type it2 : args) {
                    C9612q.m13918g(it2, "it");
                    KSerializer<Object> m254e = C14285j.m254e(abstractC6257c, it2);
                    if (m254e == null) {
                        return null;
                    }
                    arrayList.add(m254e);
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                KSerializer<Object> m40927n = C0213a.m40927n((KSerializer) arrayList.get(0));
                C9612q.m13919f(m40927n, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return m40927n;
            } else if (!List.class.isAssignableFrom(cls) && !Collection.class.isAssignableFrom(cls)) {
                if (Map.class.isAssignableFrom(cls)) {
                    KSerializer<Object> m40930k = C0213a.m40930k((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    C9612q.m13919f(m40930k, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return m40930k;
                } else if (Map.Entry.class.isAssignableFrom(cls)) {
                    KSerializer<Object> m40931j = C0213a.m40931j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    C9612q.m13919f(m40931j, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return m40931j;
                } else if (Pair.class.isAssignableFrom(cls)) {
                    KSerializer<Object> m40928m = C0213a.m40928m((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    C9612q.m13919f(m40928m, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return m40928m;
                } else if (C11590w.class.isAssignableFrom(cls)) {
                    KSerializer<Object> m40925p = C0213a.m40925p((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
                    C9612q.m13919f(m40925p, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return m40925p;
                } else {
                    m14093t = C9546k.m14093t(arrayList, 10);
                    ArrayList arrayList2 = new ArrayList(m14093t);
                    for (KSerializer kSerializer : arrayList) {
                        C9612q.m13919f(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                        arrayList2.add(kSerializer);
                    }
                    return m248c(abstractC6257c, cls, arrayList2);
                }
            } else {
                KSerializer<Object> m40933h = C0213a.m40933h((KSerializer) arrayList.get(0));
                C9612q.m13919f(m40933h, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return m40933h;
            }
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            C9612q.m13918g(upperBounds, "type.upperBounds");
            m14249D = C9538f.m14249D(upperBounds);
            C9612q.m13918g(m14249D, "type.upperBounds.first()");
            return m244g(abstractC6257c, (Type) m14249D, false, 2, null);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + C9591f0.m13969b(type.getClass()));
        }
    }

    /* renamed from: g */
    static /* synthetic */ KSerializer m244g(AbstractC6257c abstractC6257c, Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m245f(abstractC6257c, type, z);
    }

    /* renamed from: h */
    public static final KSerializer<Object> m243h(AbstractC6257c abstractC6257c, Type type) {
        C9612q.m13917h(abstractC6257c, "<this>");
        C9612q.m13917h(type, "type");
        return m245f(abstractC6257c, type, false);
    }

    /* renamed from: i */
    private static final KSerializer<Object> m242i(AbstractC6257c abstractC6257c, Class<?> cls, boolean z) {
        List m14104i;
        KSerializer<Object> m254e;
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            Class<?> componentType = cls.getComponentType();
            C9612q.m13918g(componentType, "type.componentType");
            if (z) {
                m254e = C14285j.m257b(abstractC6257c, componentType);
            } else {
                m254e = C14285j.m254e(abstractC6257c, componentType);
                if (m254e == null) {
                    return null;
                }
            }
            KClass m41052e = C0156a.m41052e(componentType);
            C9612q.m13919f(m41052e, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            KSerializer<Object> m40940a = C0213a.m40940a(m41052e, m254e);
            C9612q.m13919f(m40940a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return m40940a;
        }
        C9612q.m13919f(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
        m14104i = C9545j.m14104i();
        return m248c(abstractC6257c, cls, m14104i);
    }
}