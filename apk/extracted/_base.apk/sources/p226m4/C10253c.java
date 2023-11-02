package p226m4;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p278p4.InterfaceC11396i;
import p380v4.AbstractC13063c;
import p394w2.C13375i;

/* renamed from: m4.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10253c {

    /* renamed from: a */
    private final CacheKey f26698a;

    /* renamed from: b */
    private final InterfaceC11396i<CacheKey, AbstractC13063c> f26699b;

    /* renamed from: d */
    private final LinkedHashSet<CacheKey> f26701d = new LinkedHashSet<>();

    /* renamed from: c */
    private final InterfaceC11396i.InterfaceC11398b<CacheKey> f26700c = new C10254a();

    /* renamed from: m4.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C10254a implements InterfaceC11396i.InterfaceC11398b<CacheKey> {
        C10254a() {
        }

        @Override // p278p4.InterfaceC11396i.InterfaceC11398b
        /* renamed from: b */
        public void mo8153a(CacheKey cacheKey, boolean z) {
            C10253c.this.m12008f(cacheKey, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10255b implements CacheKey {

        /* renamed from: a */
        private final CacheKey f26703a;

        /* renamed from: b */
        private final int f26704b;

        public C10255b(CacheKey cacheKey, int i) {
            this.f26703a = cacheKey;
            this.f26704b = i;
        }

        @Override // com.facebook.cache.common.CacheKey
        /* renamed from: a */
        public String mo714a() {
            return null;
        }

        @Override // com.facebook.cache.common.CacheKey
        /* renamed from: b */
        public boolean mo713b(Uri uri) {
            return this.f26703a.mo713b(uri);
        }

        @Override // com.facebook.cache.common.CacheKey
        /* renamed from: c */
        public boolean mo712c() {
            return false;
        }

        @Override // com.facebook.cache.common.CacheKey
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C10255b)) {
                return false;
            }
            C10255b c10255b = (C10255b) obj;
            if (this.f26704b == c10255b.f26704b && this.f26703a.equals(c10255b.f26703a)) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.cache.common.CacheKey
        public int hashCode() {
            return (this.f26703a.hashCode() * 1013) + this.f26704b;
        }

        public String toString() {
            return C13375i.m2689c(this).m2687b("imageCacheKey", this.f26703a).m2688a("frameIndex", this.f26704b).toString();
        }
    }

    public C10253c(CacheKey cacheKey, InterfaceC11396i<CacheKey, AbstractC13063c> interfaceC11396i) {
        this.f26698a = cacheKey;
        this.f26699b = interfaceC11396i;
    }

    /* renamed from: e */
    private C10255b m12009e(int i) {
        return new C10255b(this.f26698a, i);
    }

    /* renamed from: g */
    private synchronized CacheKey m12007g() {
        CacheKey cacheKey;
        Iterator<CacheKey> it = this.f26701d.iterator();
        if (it.hasNext()) {
            cacheKey = it.next();
            it.remove();
        } else {
            cacheKey = null;
        }
        return cacheKey;
    }

    /* renamed from: a */
    public CloseableReference<AbstractC13063c> m12013a(int i, CloseableReference<AbstractC13063c> closeableReference) {
        return this.f26699b.mo8134e(m12009e(i), closeableReference, this.f26700c);
    }

    /* renamed from: b */
    public boolean m12012b(int i) {
        return this.f26699b.contains(m12009e(i));
    }

    /* renamed from: c */
    public CloseableReference<AbstractC13063c> m12011c(int i) {
        return this.f26699b.get(m12009e(i));
    }

    /* renamed from: d */
    public CloseableReference<AbstractC13063c> m12010d() {
        CloseableReference<AbstractC13063c> mo8133f;
        do {
            CacheKey m12007g = m12007g();
            if (m12007g == null) {
                return null;
            }
            mo8133f = this.f26699b.mo8133f(m12007g);
        } while (mo8133f == null);
        return mo8133f;
    }

    /* renamed from: f */
    public synchronized void m12008f(CacheKey cacheKey, boolean z) {
        if (z) {
            this.f26701d.add(cacheKey);
        } else {
            this.f26701d.remove(cacheKey);
        }
    }
}
