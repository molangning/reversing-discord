package p366u9;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: u9.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC12934u0 extends BinderC12893a implements InterfaceC12928r0 {
    public AbstractBinderC12934u0() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // p366u9.BinderC12893a
    /* renamed from: b */
    protected final boolean mo3656b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo3659x((Status) C12922o0.m3665a(parcel, Status.CREATOR), (PendingIntent) C12922o0.m3665a(parcel, PendingIntent.CREATOR));
            return true;
        }
        return false;
    }
}
