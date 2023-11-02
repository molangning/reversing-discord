package p029b9;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: b9.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class BinderC2146a1 extends AbstractBinderC2211t0 {

    /* renamed from: c */
    private AbstractC2150c f6047c;

    /* renamed from: d */
    private final int f6048d;

    public BinderC2146a1(AbstractC2150c abstractC2150c, int i) {
        this.f6047c = abstractC2150c;
        this.f6048d = i;
    }

    @Override // p029b9.InterfaceC2181k
    /* renamed from: M */
    public final void mo34015M(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p029b9.InterfaceC2181k
    /* renamed from: n */
    public final void mo34014n(int i, IBinder iBinder, C2164e1 c2164e1) {
        AbstractC2150c abstractC2150c = this.f6047c;
        C2198p.m33984k(abstractC2150c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C2198p.m33985j(c2164e1);
        AbstractC2150c.m34093a0(abstractC2150c, c2164e1);
        mo34013r(i, iBinder, c2164e1.f6114j);
    }

    @Override // p029b9.InterfaceC2181k
    /* renamed from: r */
    public final void mo34013r(int i, IBinder iBinder, Bundle bundle) {
        C2198p.m33984k(this.f6047c, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f6047c.m34107M(i, iBinder, bundle, this.f6048d);
        this.f6047c = null;
    }
}
