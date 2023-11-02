package p401w9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: w9.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13454o implements IInterface {

    /* renamed from: c */
    private final IBinder f34696c;

    /* renamed from: d */
    private final String f34697d = "com.android.vending.billing.IInAppBillingService";

    public C13454o(IBinder iBinder, String str) {
        this.f34696c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34696c;
    }

    /* renamed from: b */
    public final Parcel m2446b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f34697d);
        return obtain;
    }

    /* renamed from: c */
    public final Parcel m2445c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f34696c.transact(i, parcel, obtain, 0);
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