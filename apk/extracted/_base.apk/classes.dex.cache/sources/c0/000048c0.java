package p278p4;

import com.facebook.cache.common.CacheKey;
import p380v4.AbstractC13063c;

/* renamed from: p4.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11408q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11409a implements InterfaceC11415t<CacheKey> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11406o f29702a;

        C11409a(InterfaceC11406o interfaceC11406o) {
            this.f29702a = interfaceC11406o;
        }

        @Override // p278p4.InterfaceC11415t
        /* renamed from: d */
        public void mo8107a(CacheKey cacheKey) {
            this.f29702a.mo8096i(cacheKey);
        }

        @Override // p278p4.InterfaceC11415t
        /* renamed from: e */
        public void mo8106b(CacheKey cacheKey) {
            this.f29702a.mo8104a(cacheKey);
        }

        @Override // p278p4.InterfaceC11415t
        /* renamed from: f */
        public void mo8105c(CacheKey cacheKey) {
            this.f29702a.mo8092m(cacheKey);
        }
    }

    /* renamed from: a */
    public static C11407p<CacheKey, AbstractC13063c> m8138a(InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, InterfaceC11406o interfaceC11406o) {
        interfaceC11406o.mo8101d(interfaceC11413s);
        return new C11407p<>(interfaceC11413s, new C11409a(interfaceC11406o));
    }
}