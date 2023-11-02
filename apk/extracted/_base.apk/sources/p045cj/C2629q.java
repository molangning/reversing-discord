package p045cj;

import ag.C0156a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import p164j$.util.concurrent.ConcurrentHashMap;
import pf.C11583s;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR:\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m14357d2 = {"Lcj/q;", "T", "Lcj/k1;", "Lkotlin/reflect/KClass;", "", "key", "", "Lkotlin/reflect/KType;", "types", "Lpf/s;", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "compute", "Lcj/r;", "Lcj/j1;", "b", "Lcj/r;", "classValue", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2629q<T> implements InterfaceC2608k1<T> {

    /* renamed from: a */
    private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> f7107a;

    /* renamed from: b */
    private final C2633r<C2603j1<T>> f7108b;

    @Metadata(m14358d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: cj.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2630a extends AbstractC9614s implements Function0<T> {
        public C2630a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new C2603j1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2629q(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> compute) {
        C9612q.m13917h(compute, "compute");
        this.f7107a = compute;
        this.f7108b = new C2633r<>();
    }

    @Override // p045cj.InterfaceC2608k1
    /* renamed from: a */
    public Object mo32801a(KClass<Object> key, List<? extends KType> types) {
        int m14093t;
        ConcurrentHashMap concurrentHashMap;
        Object m7596b;
        C9612q.m13917h(key, "key");
        C9612q.m13917h(types, "types");
        Object obj = this.f7108b.get(C0156a.m41055b(key));
        C9612q.m13918g(obj, "get(key)");
        C2559a1 c2559a1 = (C2559a1) obj;
        T t = c2559a1.f7012a.get();
        if (t == null) {
            t = (T) c2559a1.m32981a(new C2630a());
        }
        C2603j1 c2603j1 = (C2603j1) t;
        m14093t = C9546k.m14093t(types, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (KType kType : types) {
            arrayList.add(new C2623o0(kType));
        }
        concurrentHashMap = c2603j1.f7076a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                C11583s.C11584a c11584a = C11583s.f30090k;
                m7596b = C11583s.m7596b(this.f7107a.invoke(key, types));
            } catch (Throwable th2) {
                C11583s.C11584a c11584a2 = C11583s.f30090k;
                m7596b = C11583s.m7596b(C11586t.m7587a(th2));
            }
            C11583s m7597a = C11583s.m7597a(m7596b);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, m7597a);
            if (putIfAbsent == null) {
                obj2 = m7597a;
            } else {
                obj2 = putIfAbsent;
            }
        }
        C9612q.m13918g(obj2, "serializers.getOrPut(wra… { producer() }\n        }");
        return ((C11583s) obj2).m7588j();
    }
}
