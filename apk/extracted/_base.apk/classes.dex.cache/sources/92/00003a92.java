package p164j$.time;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.InterfaceC8483n;
import p164j$.util.function.Predicate;

/* renamed from: j$.time.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract /* synthetic */ class AbstractC8284a {
    /* renamed from: a */
    public static void m17905a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m17904b(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17903c(InterfaceC8483n interfaceC8483n, InterfaceC8483n interfaceC8483n2, double d) {
        interfaceC8483n.accept(d);
        interfaceC8483n2.accept(d);
    }

    /* renamed from: d */
    public static /* synthetic */ long m17902d(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* renamed from: e */
    public static /* synthetic */ long m17901e(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    /* renamed from: f */
    public static /* synthetic */ long m17900f(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }
}