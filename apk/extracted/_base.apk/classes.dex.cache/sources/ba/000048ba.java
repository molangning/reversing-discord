package p278p4;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import p455z2.InterfaceC14074c;
import p455z2.InterfaceC14078g;

/* renamed from: p4.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11402m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11403a implements InterfaceC11419x<InterfaceC14078g> {
        C11403a() {
        }

        @Override // p278p4.InterfaceC11419x
        /* renamed from: b */
        public int mo8081a(InterfaceC14078g interfaceC14078g) {
            return interfaceC14078g.size();
        }
    }

    /* renamed from: a */
    public static InterfaceC11396i<CacheKey, InterfaceC14078g> m8144a(Supplier<MemoryCacheParams> supplier, InterfaceC14074c interfaceC14074c) {
        C11410r c11410r = new C11410r(new C11403a(), new C11416u(), supplier, null);
        interfaceC14074c.mo729a(c11410r);
        return c11410r;
    }
}