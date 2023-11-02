package p278p4;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p380v4.C13065e;
import p394w2.C13379j;
import p414x2.C13677a;
import p455z2.InterfaceC14078g;

/* renamed from: p4.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11418w {

    /* renamed from: b */
    private static final Class<?> f29717b = C11418w.class;

    /* renamed from: a */
    private Map<CacheKey, C13065e> f29718a = new HashMap();

    private C11418w() {
    }

    /* renamed from: d */
    public static C11418w m8086d() {
        return new C11418w();
    }

    /* renamed from: e */
    private synchronized void m8085e() {
        C13677a.m1840x(f29717b, "Count = %d", Integer.valueOf(this.f29718a.size()));
    }

    /* renamed from: a */
    public void m8089a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f29718a.values());
            this.f29718a.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C13065e c13065e = (C13065e) arrayList.get(i);
            if (c13065e != null) {
                c13065e.close();
            }
        }
    }

    /* renamed from: b */
    public synchronized boolean m8088b(CacheKey cacheKey) {
        C13379j.m2677g(cacheKey);
        if (!this.f29718a.containsKey(cacheKey)) {
            return false;
        }
        C13065e c13065e = this.f29718a.get(cacheKey);
        synchronized (c13065e) {
            if (C13065e.m3333j0(c13065e)) {
                return true;
            }
            this.f29718a.remove(cacheKey);
            C13677a.m1872F(f29717b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c13065e)), cacheKey.mo714a(), Integer.valueOf(System.identityHashCode(cacheKey)));
            return false;
        }
    }

    /* renamed from: c */
    public synchronized C13065e m8087c(CacheKey cacheKey) {
        C13379j.m2677g(cacheKey);
        C13065e c13065e = this.f29718a.get(cacheKey);
        if (c13065e != null) {
            synchronized (c13065e) {
                if (!C13065e.m3333j0(c13065e)) {
                    this.f29718a.remove(cacheKey);
                    C13677a.m1872F(f29717b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c13065e)), cacheKey.mo714a(), Integer.valueOf(System.identityHashCode(cacheKey)));
                    return null;
                }
                c13065e = C13065e.m3336h(c13065e);
            }
        }
        return c13065e;
    }

    /* renamed from: f */
    public synchronized void m8084f(CacheKey cacheKey, C13065e c13065e) {
        C13379j.m2677g(cacheKey);
        C13379j.m2682b(Boolean.valueOf(C13065e.m3333j0(c13065e)));
        C13065e.m3335i(this.f29718a.put(cacheKey, C13065e.m3336h(c13065e)));
        m8085e();
    }

    /* renamed from: g */
    public boolean m8083g(CacheKey cacheKey) {
        C13065e remove;
        C13379j.m2677g(cacheKey);
        synchronized (this) {
            remove = this.f29718a.remove(cacheKey);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.m3337e0();
        } finally {
            remove.close();
        }
    }

    /* renamed from: h */
    public synchronized boolean m8082h(CacheKey cacheKey, C13065e c13065e) {
        C13379j.m2677g(cacheKey);
        C13379j.m2677g(c13065e);
        C13379j.m2682b(Boolean.valueOf(C13065e.m3333j0(c13065e)));
        C13065e c13065e2 = this.f29718a.get(cacheKey);
        if (c13065e2 == null) {
            return false;
        }
        CloseableReference<InterfaceC14078g> m3332m = c13065e2.m3332m();
        CloseableReference<InterfaceC14078g> m3332m2 = c13065e.m3332m();
        if (m3332m != null && m3332m2 != null && m3332m.m31730D() == m3332m2.m31730D()) {
            this.f29718a.remove(cacheKey);
            CloseableReference.m31715v(m3332m2);
            CloseableReference.m31715v(m3332m);
            C13065e.m3335i(c13065e2);
            m8085e();
            return true;
        }
        CloseableReference.m31715v(m3332m2);
        CloseableReference.m31715v(m3332m);
        C13065e.m3335i(c13065e2);
        return false;
    }
}
