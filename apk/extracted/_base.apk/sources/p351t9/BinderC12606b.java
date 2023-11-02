package p351t9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: t9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BinderC12606b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC12606b(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: b */
    protected boolean mo4722b(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo4722b(i, parcel, parcel2, i2);
    }
}
