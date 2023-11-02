package p041c8;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p195k8.C9191p0;
import p383v7.C13127b;
import p383v7.InterfaceC13133f;

/* renamed from: c8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2460h implements InterfaceC13133f {

    /* renamed from: j */
    private final C2456d f6803j;

    /* renamed from: k */
    private final long[] f6804k;

    /* renamed from: l */
    private final Map<String, C2459g> f6805l;

    /* renamed from: m */
    private final Map<String, C2457e> f6806m;

    /* renamed from: n */
    private final Map<String, String> f6807n;

    public C2460h(C2456d c2456d, Map<String, C2459g> map, Map<String, C2457e> map2, Map<String, String> map3) {
        Map<String, C2459g> emptyMap;
        this.f6803j = c2456d;
        this.f6806m = map2;
        this.f6807n = map3;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.f6805l = emptyMap;
        this.f6804k = c2456d.m33257j();
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: a */
    public int mo1152a(long j) {
        int m16253e = C9191p0.m16253e(this.f6804k, j, false, false);
        if (m16253e >= this.f6804k.length) {
            return -1;
        }
        return m16253e;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: b */
    public List<C13127b> mo1151b(long j) {
        return this.f6803j.m33259h(j, this.f6805l, this.f6806m, this.f6807n);
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: c */
    public long mo1150c(int i) {
        return this.f6804k[i];
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: d */
    public int mo1149d() {
        return this.f6804k.length;
    }
}
