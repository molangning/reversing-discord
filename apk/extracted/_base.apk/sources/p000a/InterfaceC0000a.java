package p000a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public interface InterfaceC0000a extends IInterface {

    /* renamed from: a */
    public static final String f0a = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: a.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractBinderC0001a extends Binder implements InterfaceC0000a {

        /* renamed from: a.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        private static class C0002a implements InterfaceC0000a {

            /* renamed from: c */
            private IBinder f1c;

            C0002a(IBinder iBinder) {
                this.f1c = iBinder;
            }

            @Override // p000a.InterfaceC0000a
            /* renamed from: a0 */
            public void mo41410a0(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0000a.f0a);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C0003b.m41408b(obtain, notification, 0);
                    this.f1c.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1c;
            }
        }

        /* renamed from: b */
        public static InterfaceC0000a m41411b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0000a.f0a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0000a)) {
                return (InterfaceC0000a) queryLocalInterface;
            }
            return new C0002a(iBinder);
        }
    }

    /* renamed from: a.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0003b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static <T extends Parcelable> void m41408b(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: a0 */
    void mo41410a0(String str, int i, String str2, Notification notification);
}
