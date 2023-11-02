package p366u9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BinderC12893a extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC12893a(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    /* renamed from: b */
    protected boolean mo3656b(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo3656b(i, parcel, parcel2, i2);
    }
}
