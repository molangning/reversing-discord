package kg;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p164j$.util.concurrent.ConcurrentHashMap;
import p407wg.C13548d;
import vg.C13289k;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0006¨\u0006\b"}, m14357d2 = {"Ljava/lang/Class;", "Lvg/k;", "a", "Ljava/util/concurrent/ConcurrentMap;", "Lkg/q0;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kg.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9261i0 {

    /* renamed from: a */
    private static final ConcurrentMap<C9342q0, WeakReference<C13289k>> f24326a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C13289k m15981a(Class<?> cls) {
        C9612q.m13917h(cls, "<this>");
        ClassLoader m2241f = C13548d.m2241f(cls);
        C9342q0 c9342q0 = new C9342q0(m2241f);
        ConcurrentMap<C9342q0, WeakReference<C13289k>> concurrentMap = f24326a;
        WeakReference<C13289k> weakReference = concurrentMap.get(c9342q0);
        if (weakReference != null) {
            C13289k c13289k = weakReference.get();
            if (c13289k != null) {
                return c13289k;
            }
            concurrentMap.remove(c9342q0, weakReference);
        }
        C13289k m2837a = C13289k.f34369c.m2837a(m2241f);
        while (true) {
            try {
                ConcurrentMap<C9342q0, WeakReference<C13289k>> concurrentMap2 = f24326a;
                WeakReference<C13289k> putIfAbsent = concurrentMap2.putIfAbsent(c9342q0, new WeakReference<>(m2837a));
                if (putIfAbsent == null) {
                    return m2837a;
                }
                C13289k c13289k2 = putIfAbsent.get();
                if (c13289k2 != null) {
                    return c13289k2;
                }
                concurrentMap2.remove(c9342q0, putIfAbsent);
            } finally {
                c9342q0.m15821a(null);
            }
        }
    }
}
