package p366u9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u9.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12894a0 implements IInterface {

    /* renamed from: c */
    private final IBinder f33582c;

    /* renamed from: d */
    private final String f33583d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C12894a0(IBinder iBinder, String str) {
        this.f33582c = iBinder;
        this.f33583d = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f33582c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m3696b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f33583d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m3695c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f33582c.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
