package p061d8;

import java.util.Collections;
import java.util.List;
import p195k8.C9149a;
import p383v7.C13127b;
import p383v7.InterfaceC13133f;

/* renamed from: d8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C5782b implements InterfaceC13133f {

    /* renamed from: k */
    public static final C5782b f16608k = new C5782b();

    /* renamed from: j */
    private final List<C13127b> f16609j;

    public C5782b(C13127b c13127b) {
        this.f16609j = Collections.singletonList(c13127b);
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: a */
    public int mo1152a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: b */
    public List<C13127b> mo1151b(long j) {
        return j >= 0 ? this.f16609j : Collections.emptyList();
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: c */
    public long mo1150c(int i) {
        C9149a.m16452a(i == 0);
        return 0L;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: d */
    public int mo1149d() {
        return 1;
    }

    private C5782b() {
        this.f16609j = Collections.emptyList();
    }
}