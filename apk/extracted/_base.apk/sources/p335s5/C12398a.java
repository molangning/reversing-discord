package p335s5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: s5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12398a implements IInterface {

    /* renamed from: c */
    private final IBinder f32198c;

    /* renamed from: d */
    private final String f32199d = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    /* JADX INFO: Access modifiers changed from: protected */
    public C12398a(IBinder iBinder) {
        this.f32198c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32198c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m5410b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32199d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel m5409c(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f32198c.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
