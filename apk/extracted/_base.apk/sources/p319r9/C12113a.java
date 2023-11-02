package p319r9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: r9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12113a implements IInterface {

    /* renamed from: c */
    private final IBinder f31423c;

    /* renamed from: d */
    private final String f31424d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C12113a(IBinder iBinder, String str) {
        this.f31423c = iBinder;
        this.f31424d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31423c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel m6140b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f31424d);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m6139c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f31423c.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m6138e(int i, Parcel parcel) {
        try {
            this.f31423c.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
