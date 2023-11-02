package p383v7;

import java.util.List;
import p195k8.C9149a;
import p228m6.AbstractC10273h;

/* renamed from: v7.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13139k extends AbstractC10273h implements InterfaceC13133f {

    /* renamed from: m */
    private InterfaceC13133f f34139m;

    /* renamed from: n */
    private long f34140n;

    @Override // p383v7.InterfaceC13133f
    /* renamed from: a */
    public int mo1152a(long j) {
        return ((InterfaceC13133f) C9149a.m16448e(this.f34139m)).mo1152a(j - this.f34140n);
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: b */
    public List<C13127b> mo1151b(long j) {
        return ((InterfaceC13133f) C9149a.m16448e(this.f34139m)).mo1151b(j - this.f34140n);
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: c */
    public long mo1150c(int i) {
        return ((InterfaceC13133f) C9149a.m16448e(this.f34139m)).mo1150c(i) + this.f34140n;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: d */
    public int mo1149d() {
        return ((InterfaceC13133f) C9149a.m16448e(this.f34139m)).mo1149d();
    }

    @Override // p228m6.AbstractC10263a
    /* renamed from: f */
    public void mo3126f() {
        super.mo3126f();
        this.f34139m = null;
    }

    /* renamed from: p */
    public void m3125p(long j, InterfaceC13133f interfaceC13133f, long j2) {
        this.f26751k = j;
        this.f34139m = interfaceC13133f;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f34140n = j;
    }
}
