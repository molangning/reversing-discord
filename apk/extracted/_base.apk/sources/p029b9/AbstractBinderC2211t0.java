package p029b9;

import android.os.Bundle;
import android.os.Parcel;
import p351t9.BinderC12606b;
import p351t9.C12607c;

/* renamed from: b9.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC2211t0 extends BinderC12606b implements InterfaceC2181k {
    public AbstractBinderC2211t0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p351t9.BinderC12606b
    /* renamed from: b */
    protected final boolean mo4722b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                mo34014n(parcel.readInt(), parcel.readStrongBinder(), (C2164e1) C12607c.m4721a(parcel, C2164e1.CREATOR));
            } else {
                mo34015M(parcel.readInt(), (Bundle) C12607c.m4721a(parcel, Bundle.CREATOR));
            }
        } else {
            mo34013r(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C12607c.m4721a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
