package p351t9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: t9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12605a implements IInterface {

    /* renamed from: c */
    private final IBinder f32698c;

    /* renamed from: d */
    private final String f32699d;

    public C12605a(IBinder iBinder, String str) {
        this.f32698c = iBinder;
        this.f32699d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32698c;
    }

    /* renamed from: b */
    public final Parcel m4724b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f32698c.transact(i, parcel, obtain, 0);
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

    /* renamed from: c */
    public final Parcel m4723c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32699d);
        return obtain;
    }
}