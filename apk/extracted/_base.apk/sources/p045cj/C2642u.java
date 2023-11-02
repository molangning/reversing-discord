package p045cj;

import ag.C0156a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import p164j$.util.concurrent.ConcurrentHashMap;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\n\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R,\u0010\n\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR*\u0010\u0010\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Lcj/u;", "T", "Lcj/x1;", "Lkotlin/reflect/KClass;", "", "key", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "compute", "j$/util/concurrent/ConcurrentHashMap", "Ljava/lang/Class;", "Lcj/k;", "b", "Lj$/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C2642u<T> implements InterfaceC2655x1<T> {

    /* renamed from: a */
    private final Function1<KClass<?>, KSerializer<T>> f7116a;

    /* renamed from: b */
    private final ConcurrentHashMap<Class<?>, C2605k<T>> f7117b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2642u(Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        C9612q.m13917h(compute, "compute");
        this.f7116a = compute;
        this.f7117b = new ConcurrentHashMap<>();
    }

    @Override // p045cj.InterfaceC2655x1
    /* renamed from: a */
    public KSerializer<T> mo32770a(KClass<Object> key) {
        C2605k<T> putIfAbsent;
        C9612q.m13917h(key, "key");
        ConcurrentHashMap<Class<?>, C2605k<T>> concurrentHashMap = this.f7117b;
        Class<?> m41055b = C0156a.m41055b(key);
        C2605k<T> c2605k = concurrentHashMap.get(m41055b);
        if (c2605k == null && (putIfAbsent = concurrentHashMap.putIfAbsent(m41055b, (c2605k = new C2605k<>(this.f7116a.invoke(key))))) != null) {
            c2605k = putIfAbsent;
        }
        return c2605k.f7079a;
    }
}
