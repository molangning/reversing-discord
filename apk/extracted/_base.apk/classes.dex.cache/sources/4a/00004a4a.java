package p299q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11802a implements IInterface {

    /* renamed from: c */
    private final IBinder f30792c;

    /* renamed from: d */
    private final String f30793d = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public C11802a(IBinder iBinder, String str) {
        this.f30792c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30792c;
    }

    /* renamed from: b */
    public final Parcel m6840b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f30793d);
        return obtain;
    }

    /* renamed from: c */
    public final void m6839c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f30792c.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}