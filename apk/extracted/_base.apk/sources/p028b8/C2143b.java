package p028b8;

import java.util.Collections;
import java.util.List;
import p195k8.C9149a;
import p195k8.C9191p0;
import p383v7.C13127b;
import p383v7.InterfaceC13133f;

/* renamed from: b8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2143b implements InterfaceC13133f {

    /* renamed from: j */
    private final C13127b[] f6044j;

    /* renamed from: k */
    private final long[] f6045k;

    public C2143b(C13127b[] c13127bArr, long[] jArr) {
        this.f6044j = c13127bArr;
        this.f6045k = jArr;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: a */
    public int mo1152a(long j) {
        int m16253e = C9191p0.m16253e(this.f6045k, j, false, false);
        if (m16253e >= this.f6045k.length) {
            return -1;
        }
        return m16253e;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: b */
    public List<C13127b> mo1151b(long j) {
        C13127b c13127b;
        int m16245i = C9191p0.m16245i(this.f6045k, j, true, false);
        if (m16245i != -1 && (c13127b = this.f6044j[m16245i]) != C13127b.f34101q) {
            return Collections.singletonList(c13127b);
        }
        return Collections.emptyList();
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
        if (i >= this.f6045k.length) {
            z2 = false;
        }
        C9149a.m16452a(z2);
        return this.f6045k[i];
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: d */
    public int mo1149d() {
        return this.f6045k.length;
    }
}
