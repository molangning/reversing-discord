package p029b9;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b9.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2213u0 implements InterfaceC2184l {

    /* renamed from: c */
    private final IBinder f6214c;

    public C2213u0(IBinder iBinder) {
        this.f6214c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6214c;
    }

    @Override // p029b9.InterfaceC2184l
    /* renamed from: j */
    public final void mo33958j(InterfaceC2181k interfaceC2181k, C2165f c2165f) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (interfaceC2181k != null) {
                iBinder = interfaceC2181k.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (c2165f != null) {
                obtain.writeInt(1);
                C2173h1.m34031a(c2165f, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6214c.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}