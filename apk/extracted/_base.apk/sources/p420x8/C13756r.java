package p420x8;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: x8.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13756r {

    /* renamed from: a */
    private final Messenger f35491a;

    /* renamed from: b */
    private final C13746h f35492b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13756r(IBinder iBinder) {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f35491a = new Messenger(iBinder);
            this.f35492b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f35492b = new C13746h(iBinder);
            this.f35491a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1587a(Message message) {
        Messenger messenger = this.f35491a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C13746h c13746h = this.f35492b;
        if (c13746h != null) {
            c13746h.m1595b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
