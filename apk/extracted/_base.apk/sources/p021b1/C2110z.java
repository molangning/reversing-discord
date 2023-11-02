package p021b1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: b1.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2110z {

    /* renamed from: b1.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class ServiceConnectionC2111a implements ServiceConnection {

        /* renamed from: j */
        long f5946j;

        /* renamed from: k */
        boolean f5947k = false;

        /* renamed from: l */
        private final LinkedBlockingQueue<IBinder> f5948l = new LinkedBlockingQueue<>(1);

        public ServiceConnectionC2111a(long j) {
            this.f5946j = j;
        }

        /* renamed from: a */
        public IBinder m34184a() {
            if (!this.f5947k) {
                this.f5947k = true;
                return this.f5948l.poll(this.f5946j, TimeUnit.MILLISECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f5948l.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: b1.z$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2112b {

        /* renamed from: a */
        private final String f5949a;

        /* renamed from: b */
        private final Boolean f5950b;

        C2112b(String str, Boolean bool) {
            this.f5949a = str;
            this.f5950b = bool;
        }

        /* renamed from: a */
        public String m34183a() {
            return this.f5949a;
        }

        /* renamed from: b */
        public Boolean m34182b() {
            return this.f5950b;
        }
    }

    /* renamed from: b1.z$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C2113c implements IInterface {

        /* renamed from: c */
        private IBinder f5951c;

        public C2113c(IBinder iBinder) {
            this.f5951c = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f5951c;
        }

        /* renamed from: b */
        public String m34181b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f5951c.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: c */
        public Boolean m34180c(boolean z) {
            int i;
            Boolean valueOf;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = false;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                obtain.writeInt(i);
                this.f5951c.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z2 = true;
                }
                if (Boolean.valueOf(z2) != null) {
                    return Boolean.valueOf(!valueOf.booleanValue());
                }
                return null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: a */
    public static C2112b m34185a(Context context, long j) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ServiceConnectionC2111a serviceConnectionC2111a = new ServiceConnectionC2111a(j);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, serviceConnectionC2111a, 1)) {
                        try {
                            C2113c c2113c = new C2113c(serviceConnectionC2111a.m34184a());
                            return new C2112b(c2113c.m34181b(), c2113c.m34180c(true));
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    throw new IOException("Google Play connection failed");
                } finally {
                    context.unbindService(serviceConnectionC2111a);
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
    }
}
