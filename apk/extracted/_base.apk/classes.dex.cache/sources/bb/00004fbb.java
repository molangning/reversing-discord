package p385v9;

import p011aa.AbstractC0132d;
import p011aa.C0133e;

/* renamed from: v9.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13195k extends AbstractC13207q {

    /* renamed from: a */
    final /* synthetic */ C13179e0 f34217a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13195k(BinderC13201n binderC13201n, C13179e0 c13179e0) {
        super(null);
        this.f34217a = c13179e0;
    }

    @Override // com.google.android.gms.common.api.internal.C4616d.InterfaceC4618b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3008a(Object obj) {
        boolean m3033g0;
        AbstractC0132d abstractC0132d = (AbstractC0132d) obj;
        m3033g0 = BinderC13201n.m3033g0(this.f34217a);
        if (m3033g0) {
            C0133e c0133e = new C0133e();
            c0133e.m41117d(this.f34217a.m3056G());
            c0133e.m41120a(this.f34217a.m3054r());
            abstractC0132d.m41122a("__UNRECOGNIZED_BLUETOOTH_DEVICE__", c0133e.m41116e());
            return;
        }
        String m3053z = this.f34217a.m3053z();
        C0133e c0133e2 = new C0133e();
        c0133e2.m41117d(this.f34217a.m3056G());
        c0133e2.m41118c(this.f34217a.m3057A());
        c0133e2.m41119b(this.f34217a.m3055H());
        abstractC0132d.m41122a(m3053z, c0133e2.m41116e());
    }
}