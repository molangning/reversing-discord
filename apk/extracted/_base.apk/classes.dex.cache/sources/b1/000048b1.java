package p278p4;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import p278p4.InterfaceC11396i;
import p278p4.InterfaceC11413s;
import p380v4.AbstractC13063c;
import p455z2.InterfaceC14074c;

/* renamed from: p4.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11393g implements InterfaceC11382a {

    /* renamed from: p4.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C11394a implements InterfaceC11419x<AbstractC13063c> {
        C11394a() {
            C11393g.this = r1;
        }

        @Override // p278p4.InterfaceC11419x
        /* renamed from: b */
        public int mo8081a(AbstractC13063c abstractC13063c) {
            return abstractC13063c.mo3364h();
        }
    }

    @Override // p278p4.InterfaceC11382a
    /* renamed from: a */
    public InterfaceC11396i<CacheKey, AbstractC13063c> mo8166a(Supplier<MemoryCacheParams> supplier, InterfaceC14074c interfaceC14074c, InterfaceC11413s.InterfaceC11414a interfaceC11414a, InterfaceC11396i.InterfaceC11398b<CacheKey> interfaceC11398b) {
        C11410r c11410r = new C11410r(new C11394a(), interfaceC11414a, supplier, interfaceC11398b);
        interfaceC14074c.mo729a(c11410r);
        return c11410r;
    }
}