package p029b9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b9.b1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ServiceConnectionC2149b1 implements ServiceConnection {

    /* renamed from: j */
    private final int f6051j;

    /* renamed from: k */
    final /* synthetic */ AbstractC2150c f6052k;

    public ServiceConnectionC2149b1(AbstractC2150c abstractC2150c, int i) {
        this.f6052k = abstractC2150c;
        this.f6051j = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC2184l c2213u0;
        AbstractC2150c abstractC2150c = this.f6052k;
        if (iBinder == null) {
            AbstractC2150c.m34091b0(abstractC2150c, 16);
            return;
        }
        obj = abstractC2150c.f6080w;
        synchronized (obj) {
            AbstractC2150c abstractC2150c2 = this.f6052k;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2184l)) {
                c2213u0 = (InterfaceC2184l) queryLocalInterface;
            } else {
                c2213u0 = new C2213u0(iBinder);
            }
            abstractC2150c2.f6081x = c2213u0;
        }
        this.f6052k.m34089c0(0, null, this.f6051j);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f6052k.f6080w;
        synchronized (obj) {
            this.f6052k.f6081x = null;
        }
        Handler handler = this.f6052k.f6078u;
        handler.sendMessage(handler.obtainMessage(6, this.f6051j, 1));
    }
}
