package p366u9;

import android.os.IBinder;
import android.os.Parcel;
import p231m9.C10405p;
import p231m9.C10412s;

/* renamed from: u9.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12936v0 extends C12894a0 implements InterfaceC12932t0 {
    public C12936v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // p366u9.InterfaceC12932t0
    /* renamed from: D */
    public final void mo3652D(InterfaceC12928r0 interfaceC12928r0, C10405p c10405p) {
        Parcel m3696b = m3696b();
        C12922o0.m3664b(m3696b, interfaceC12928r0);
        C12922o0.m3663c(m3696b, c10405p);
        m3695c(1, m3696b);
    }

    @Override // p366u9.InterfaceC12932t0
    /* renamed from: W */
    public final void mo3651W(InterfaceC12928r0 interfaceC12928r0, C10412s c10412s) {
        Parcel m3696b = m3696b();
        C12922o0.m3664b(m3696b, interfaceC12928r0);
        C12922o0.m3663c(m3696b, c10412s);
        m3695c(2, m3696b);
    }
}