package p470zi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import p014aj.C0213a;
import p045cj.C2581f;
import p045cj.C2591h0;
import p045cj.C2602j0;
import p045cj.C2612l1;
import p045cj.C2616m1;
import p045cj.C2634r0;
import p045cj.C2640t0;
import p045cj.C2644u1;
import p088ej.AbstractC6257c;
import p140hg.C7142j;
import p140hg.InterfaceC7130c;
import pf.C11568i;
import pf.C11583s;
import pf.C11590w;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001a\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a-\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0018\u00010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u000e*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0007\u001a@\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u000bH\u0000\u001a9\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aG\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\"\b\b\u0000\u0010\u000e*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m14357d2 = {"Lej/c;", "Lkotlin/reflect/KType;", "type", "Lkotlinx/serialization/KSerializer;", "", "e", "g", "", "failOnMissingTypeArgSerializer", "f", "(Lej/c;Lkotlin/reflect/KType;Z)Lkotlinx/serialization/KSerializer;", "", "typeArguments", "i", "T", "Lkotlin/reflect/KClass;", "h", "types", "serializers", "d", "b", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "shouldBeNullable", "c", "(Lkotlinx/serialization/KSerializer;Z)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlinx/serialization/SerializersKt")
/* renamed from: zi.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C14287l {
    /* renamed from: a */
    private static final KSerializer<? extends Object> m241a(KClass<Object> kClass, List<? extends KType> list, List<? extends KSerializer<Object>> list2) {
        boolean m13922c;
        boolean m13922c2;
        boolean m13922c3;
        boolean m13922c4;
        boolean m13922c5;
        boolean m13922c6;
        boolean m13922c7;
        if (C9612q.m13922c(kClass, C9591f0.m13969b(Collection.class))) {
            m13922c = true;
        } else {
            m13922c = C9612q.m13922c(kClass, C9591f0.m13969b(List.class));
        }
        if (m13922c) {
            m13922c2 = true;
        } else {
            m13922c2 = C9612q.m13922c(kClass, C9591f0.m13969b(List.class));
        }
        if (m13922c2) {
            m13922c3 = true;
        } else {
            m13922c3 = C9612q.m13922c(kClass, C9591f0.m13969b(ArrayList.class));
        }
        if (m13922c3) {
            return new C2581f(list2.get(0));
        }
        if (C9612q.m13922c(kClass, C9591f0.m13969b(HashSet.class))) {
            return new C2602j0(list2.get(0));
        }
        if (C9612q.m13922c(kClass, C9591f0.m13969b(Set.class))) {
            m13922c4 = true;
        } else {
            m13922c4 = C9612q.m13922c(kClass, C9591f0.m13969b(Set.class));
        }
        if (m13922c4) {
            m13922c5 = true;
        } else {
            m13922c5 = C9612q.m13922c(kClass, C9591f0.m13969b(LinkedHashSet.class));
        }
        if (m13922c5) {
            return new C2640t0(list2.get(0));
        }
        if (C9612q.m13922c(kClass, C9591f0.m13969b(HashMap.class))) {
            return new C2591h0(list2.get(0), list2.get(1));
        }
        if (C9612q.m13922c(kClass, C9591f0.m13969b(Map.class))) {
            m13922c6 = true;
        } else {
            m13922c6 = C9612q.m13922c(kClass, C9591f0.m13969b(Map.class));
        }
        if (m13922c6) {
            m13922c7 = true;
        } else {
            m13922c7 = C9612q.m13922c(kClass, C9591f0.m13969b(LinkedHashMap.class));
        }
        if (m13922c7) {
            return new C2634r0(list2.get(0), list2.get(1));
        }
        if (C9612q.m13922c(kClass, C9591f0.m13969b(Map.Entry.class))) {
            return C0213a.m40931j(list2.get(0), list2.get(1));
        }
        if (C9612q.m13922c(kClass, C9591f0.m13969b(Pair.class))) {
            return C0213a.m40928m(list2.get(0), list2.get(1));
        }
        if (C9612q.m13922c(kClass, C9591f0.m13969b(C11590w.class))) {
            return C0213a.m40925p(list2.get(0), list2.get(1), list2.get(2));
        }
        if (C2612l1.m32858k(kClass)) {
            InterfaceC7130c mo13879j = list.get(0).mo13879j();
            C9612q.m13919f(mo13879j, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return C0213a.m40940a((KClass) mo13879j, list2.get(0));
        }
        return null;
    }

    /* renamed from: b */
    private static final KSerializer<? extends Object> m240b(KClass<Object> kClass, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return C2612l1.m32865d(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    /* renamed from: c */
    private static final <T> KSerializer<T> m239c(KSerializer<T> kSerializer, boolean z) {
        if (z) {
            return C0213a.m40920u(kSerializer);
        }
        C9612q.m13919f(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    /* renamed from: d */
    public static final KSerializer<? extends Object> m238d(KClass<Object> kClass, List<? extends KType> types, List<? extends KSerializer<Object>> serializers) {
        C9612q.m13917h(kClass, "<this>");
        C9612q.m13917h(types, "types");
        C9612q.m13917h(serializers, "serializers");
        KSerializer<? extends Object> m241a = m241a(kClass, types, serializers);
        if (m241a == null) {
            return m240b(kClass, serializers);
        }
        return m241a;
    }

    /* renamed from: e */
    public static final KSerializer<Object> m237e(AbstractC6257c abstractC6257c, KType type) {
        C9612q.m13917h(abstractC6257c, "<this>");
        C9612q.m13917h(type, "type");
        KSerializer<Object> m236f = m236f(abstractC6257c, type, true);
        if (m236f != null) {
            return m236f;
        }
        C2612l1.m32857l(C2616m1.m32846c(type));
        throw new C11568i();
    }

    /* renamed from: f */
    private static final KSerializer<Object> m236f(AbstractC6257c abstractC6257c, KType kType, boolean z) {
        int m14093t;
        KSerializer<Object> kSerializer;
        KSerializer<? extends Object> kSerializer2;
        KClass<Object> m32846c = C2616m1.m32846c(kType);
        boolean mo13880b = kType.mo13880b();
        List<C7142j> mo13878k = kType.mo13878k();
        m14093t = C9546k.m14093t(mo13878k, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C7142j c7142j : mo13878k) {
            KType m21383c = c7142j.m21383c();
            if (m21383c != null) {
                arrayList.add(m21383c);
            } else {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kType).toString());
            }
        }
        if (arrayList.isEmpty()) {
            kSerializer = C14280i.m264a(m32846c, mo13880b);
        } else {
            Object m263b = C14280i.m263b(m32846c, arrayList, mo13880b);
            if (z) {
                if (C11583s.m7591g(m263b)) {
                    m263b = null;
                }
                kSerializer = (KSerializer) m263b;
            } else if (C11583s.m7593e(m263b) != null) {
                return null;
            } else {
                kSerializer = (KSerializer) m263b;
            }
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        if (arrayList.isEmpty()) {
            kSerializer2 = AbstractC6257c.m23143c(abstractC6257c, m32846c, null, 2, null);
        } else {
            List<KSerializer<Object>> m251h = C14285j.m251h(abstractC6257c, arrayList, z);
            if (m251h == null) {
                return null;
            }
            KSerializer<? extends Object> m258a = C14285j.m258a(m32846c, arrayList, m251h);
            if (m258a == null) {
                kSerializer2 = abstractC6257c.mo23144b(m32846c, m251h);
            } else {
                kSerializer2 = m258a;
            }
        }
        if (kSerializer2 == null) {
            return null;
        }
        return m239c(kSerializer2, mo13880b);
    }

    /* renamed from: g */
    public static final KSerializer<Object> m235g(AbstractC6257c abstractC6257c, KType type) {
        C9612q.m13917h(abstractC6257c, "<this>");
        C9612q.m13917h(type, "type");
        return m236f(abstractC6257c, type, false);
    }

    /* renamed from: h */
    public static final <T> KSerializer<T> m234h(KClass<T> kClass) {
        C9612q.m13917h(kClass, "<this>");
        KSerializer<T> m32867b = C2612l1.m32867b(kClass);
        if (m32867b == null) {
            return C2644u1.m32804b(kClass);
        }
        return m32867b;
    }

    /* renamed from: i */
    public static final List<KSerializer<Object>> m233i(AbstractC6257c abstractC6257c, List<? extends KType> typeArguments, boolean z) {
        ArrayList arrayList;
        int m14093t;
        int m14093t2;
        C9612q.m13917h(abstractC6257c, "<this>");
        C9612q.m13917h(typeArguments, "typeArguments");
        if (z) {
            m14093t2 = C9546k.m14093t(typeArguments, 10);
            arrayList = new ArrayList(m14093t2);
            for (KType kType : typeArguments) {
                arrayList.add(C14285j.m256c(abstractC6257c, kType));
            }
        } else {
            m14093t = C9546k.m14093t(typeArguments, 10);
            arrayList = new ArrayList(m14093t);
            for (KType kType2 : typeArguments) {
                KSerializer<Object> m253f = C14285j.m253f(abstractC6257c, kType2);
                if (m253f == null) {
                    return null;
                }
                arrayList.add(m253f);
            }
        }
        return arrayList;
    }
}
