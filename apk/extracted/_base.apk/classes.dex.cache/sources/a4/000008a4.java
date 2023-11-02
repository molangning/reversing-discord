package p019b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public interface InterfaceC1956a extends IInterface {

    /* renamed from: b */
    public static final String f5400b = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: b.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractBinderC1957a extends Binder implements InterfaceC1956a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C1958a implements InterfaceC1956a {

            /* renamed from: c */
            private IBinder f5401c;

            C1958a(IBinder iBinder) {
                this.f5401c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5401c;
            }
        }

        public AbstractBinderC1957a() {
            attachInterface(this, InterfaceC1956a.f5400b);
        }

        /* renamed from: b */
        public static InterfaceC1956a m34891b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC1956a.f5400b);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1956a)) {
                return (InterfaceC1956a) queryLocalInterface;
            }
            return new C1958a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = InterfaceC1956a.f5400b;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                mo34885E(parcel.readInt(), (Bundle) C1959b.m34889b(parcel, Bundle.CREATOR));
                return true;
            }
            parcel2.writeString(str);
            return true;
        }
    }

    /* renamed from: b.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1959b {
        /* renamed from: b */
        public static <T> T m34889b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* renamed from: E */
    void mo34885E(int i, Bundle bundle);
}