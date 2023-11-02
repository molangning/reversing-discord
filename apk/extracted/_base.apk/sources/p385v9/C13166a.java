package p385v9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: v9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13166a implements IInterface {

    /* renamed from: c */
    private final IBinder f34179c;

    /* renamed from: d */
    private final String f34180d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C13166a(IBinder iBinder, String str) {
        this.f34179c = iBinder;
        this.f34180d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34179c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m3071b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f34180d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m3070c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f34179c.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m3069e(int i, Parcel parcel) {
        try {
            this.f34179c.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
