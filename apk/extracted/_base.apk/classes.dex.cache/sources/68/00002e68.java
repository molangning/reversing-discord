package com.msc.p051sa.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.msc.sa.aidl.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC5344a extends IInterface {

    /* renamed from: com.msc.sa.aidl.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractBinderC5345a extends Binder implements InterfaceC5344a {

        /* renamed from: com.msc.sa.aidl.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static class C5346a implements InterfaceC5344a {

            /* renamed from: d */
            public static InterfaceC5344a f15155d;

            /* renamed from: c */
            private IBinder f15156c;

            C5346a(IBinder iBinder) {
                this.f15156c = iBinder;
            }

            @Override // com.msc.p051sa.aidl.InterfaceC5344a
            /* renamed from: R */
            public String mo25474R(String str, String str2, String str3, ISACallback iSACallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (iSACallback != null) {
                        iBinder = iSACallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f15156c.transact(1, obtain, obtain2, 0) && AbstractBinderC5345a.m25475c() != null) {
                        return AbstractBinderC5345a.m25475c().mo25474R(str, str2, str3, iSACallback);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.msc.p051sa.aidl.InterfaceC5344a
            /* renamed from: V */
            public boolean mo25473V(int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f15156c.transact(6, obtain, obtain2, 0) && AbstractBinderC5345a.m25475c() != null) {
                        return AbstractBinderC5345a.m25475c().mo25473V(i, str, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15156c;
            }
        }

        /* renamed from: b */
        public static InterfaceC5344a m25476b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.msc.sa.aidl.ISAService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC5344a)) {
                return (InterfaceC5344a) queryLocalInterface;
            }
            return new C5346a(iBinder);
        }

        /* renamed from: c */
        public static InterfaceC5344a m25475c() {
            return C5346a.f15155d;
        }
    }

    /* renamed from: R */
    String mo25474R(String str, String str2, String str3, ISACallback iSACallback);

    /* renamed from: V */
    boolean mo25473V(int i, String str, Bundle bundle);
}