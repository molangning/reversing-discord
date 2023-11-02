package p283p9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: p9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11466a implements IInterface {

    /* renamed from: c */
    private final IBinder f29801c;

    /* renamed from: d */
    private final String f29802d;

    public C11466a(IBinder iBinder, String str) {
        this.f29801c = iBinder;
        this.f29802d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29801c;
    }

    /* renamed from: b */
    public final Parcel m8033b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29802d);
        return obtain;
    }

    /* renamed from: c */
    public final void m8032c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f29801c.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}