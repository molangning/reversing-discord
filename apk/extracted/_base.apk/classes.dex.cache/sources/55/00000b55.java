package p045cj;

import ag.C0156a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import p164j$.util.concurrent.ConcurrentHashMap;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR:\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR*\u0010\u0015\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m14357d2 = {"Lcj/v;", "T", "Lcj/k1;", "Lkotlin/reflect/KClass;", "", "key", "", "Lkotlin/reflect/KType;", "types", "Lpf/s;", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "compute", "j$/util/concurrent/ConcurrentHashMap", "Ljava/lang/Class;", "Lcj/j1;", "b", "Lj$/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2645v<T> implements InterfaceC2608k1<T> {

    /* renamed from: a */
    private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> f7121a;

    /* renamed from: b */
    private final ConcurrentHashMap<Class<?>, C2603j1<T>> f7122b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2645v(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> compute) {
        C9612q.m13917h(compute, "compute");
        this.f7121a = compute;
        this.f7122b = new ConcurrentHashMap<>();
    }

    @Override // p045cj.InterfaceC2608k1
    /* renamed from: a */
    public Object mo32801a(KClass<Object> key, List<? extends KType> types) {
        int m14093t;
        ConcurrentHashMap concurrentHashMap;
        Object m7596b;
        C2603j1<T> putIfAbsent;
        C9612q.m13917h(key, "key");
        C9612q.m13917h(types, "types");
        ConcurrentHashMap<Class<?>, C2603j1<T>> concurrentHashMap2 = this.f7122b;
        Class<?> m41055b = C0156a.m41055b(key);
        C2603j1<T> c2603j1 = concurrentHashMap2.get(m41055b);
        if (c2603j1 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(m41055b, (c2603j1 = new C2603j1<>()))) != null) {
            c2603j1 = putIfAbsent;
        }
        C2603j1<T> c2603j12 = c2603j1;
        m14093t = C9546k.m14093t(types, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (KType kType : types) {
            arrayList.add(new C2623o0(kType));
        }
        concurrentHashMap = ((C2603j1) c2603j12).f7076a;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                C11583s.C11584a c11584a = C11583s.f30090k;
                m7596b = C11583s.m7596b(this.f7121a.invoke(key, types));
            } catch (Throwable th2) {
                C11583s.C11584a c11584a2 = C11583s.f30090k;
                m7596b = C11583s.m7596b(C11586t.m7587a(th2));
            }
            C11583s m7597a = C11583s.m7597a(m7596b);
            Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, m7597a);
            if (putIfAbsent2 == null) {
                obj = m7597a;
            } else {
                obj = putIfAbsent2;
            }
        }
        C9612q.m13918g(obj, "serializers.getOrPut(wra… { producer() }\n        }");
        return ((C11583s) obj).m7588j();
    }
}