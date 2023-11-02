package p009a8;

import java.util.Collections;
import java.util.List;
import p195k8.C9149a;
import p195k8.C9191p0;
import p383v7.C13127b;
import p383v7.InterfaceC13133f;

/* renamed from: a8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C0090d implements InterfaceC13133f {

    /* renamed from: j */
    private final List<List<C13127b>> f433j;

    /* renamed from: k */
    private final List<Long> f434k;

    public C0090d(List<List<C13127b>> list, List<Long> list2) {
        this.f433j = list;
        this.f434k = list2;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: a */
    public int mo1152a(long j) {
        int m16255d = C9191p0.m16255d(this.f434k, Long.valueOf(j), false, false);
        if (m16255d >= this.f434k.size()) {
            return -1;
        }
        return m16255d;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: b */
    public List<C13127b> mo1151b(long j) {
        int m16251f = C9191p0.m16251f(this.f434k, Long.valueOf(j), true, false);
        if (m16251f == -1) {
            return Collections.emptyList();
        }
        return this.f433j.get(m16251f);
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: c */
    public long mo1150c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        if (i >= this.f434k.size()) {
            z2 = false;
        }
        C9149a.m16452a(z2);
        return this.f434k.get(i).longValue();
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: d */
    public int mo1149d() {
        return this.f434k.size();
    }
}