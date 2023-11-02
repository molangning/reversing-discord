package p278p4;

import com.facebook.cache.common.CacheKey;
import p455z2.InterfaceC14078g;

/* renamed from: p4.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11404n {

    /* renamed from: p4.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C11405a implements InterfaceC11415t<CacheKey> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11406o f29699a;

        C11405a(InterfaceC11406o interfaceC11406o) {
            this.f29699a = interfaceC11406o;
        }

        @Override // p278p4.InterfaceC11415t
        /* renamed from: d */
        public void mo8107a(CacheKey cacheKey) {
            this.f29699a.mo8094k(cacheKey);
        }

        @Override // p278p4.InterfaceC11415t
        /* renamed from: e */
        public void mo8106b(CacheKey cacheKey) {
            this.f29699a.mo8097h(cacheKey);
        }

        @Override // p278p4.InterfaceC11415t
        /* renamed from: f */
        public void mo8105c(CacheKey cacheKey) {
            this.f29699a.mo8099f(cacheKey);
        }
    }

    /* renamed from: a */
    public static C11407p<CacheKey, InterfaceC14078g> m8142a(InterfaceC11413s<CacheKey, InterfaceC14078g> interfaceC11413s, InterfaceC11406o interfaceC11406o) {
        interfaceC11406o.mo8103b(interfaceC11413s);
        return new C11407p<>(interfaceC11413s, new C11405a(interfaceC11406o));
    }
}
