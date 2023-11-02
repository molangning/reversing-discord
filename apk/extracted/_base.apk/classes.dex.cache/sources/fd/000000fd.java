package android.support.p016v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public interface InterfaceC0231b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractBinderC0232a extends Binder implements InterfaceC0231b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0233a implements InterfaceC0231b {

            /* renamed from: d */
            public static InterfaceC0231b f733d;

            /* renamed from: c */
            private IBinder f734c;

            C0233a(IBinder iBinder) {
                this.f734c = iBinder;
            }

            @Override // android.support.p016v4.media.session.InterfaceC0231b
            /* renamed from: G */
            public void mo40856G(InterfaceC0229a interfaceC0229a) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (interfaceC0229a != null) {
                        iBinder = interfaceC0229a.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f734c.transact(3, obtain, obtain2, 0) && AbstractBinderC0232a.m40857c() != null) {
                        AbstractBinderC0232a.m40857c().mo40856G(interfaceC0229a);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f734c;
            }
        }

        /* renamed from: b */
        public static InterfaceC0231b m40858b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0231b)) {
                return (InterfaceC0231b) queryLocalInterface;
            }
            return new C0233a(iBinder);
        }

        /* renamed from: c */
        public static InterfaceC0231b m40857c() {
            return C0233a.f733d;
        }
    }

    /* renamed from: G */
    void mo40856G(InterfaceC0229a interfaceC0229a);
}