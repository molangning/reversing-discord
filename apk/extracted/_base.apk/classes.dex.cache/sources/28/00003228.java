package p080e8;

import java.util.Collections;
import java.util.List;
import p195k8.C9149a;
import p383v7.C13127b;
import p383v7.InterfaceC13133f;

/* renamed from: e8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C6172c implements InterfaceC13133f {

    /* renamed from: j */
    private final List<C13127b> f17452j;

    public C6172c(List<C13127b> list) {
        this.f17452j = Collections.unmodifiableList(list);
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: a */
    public int mo1152a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: b */
    public List<C13127b> mo1151b(long j) {
        return j >= 0 ? this.f17452j : Collections.emptyList();
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
}