package p029b9;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p029b9.AbstractC2150c;
import p351t9.HandlerC12609e;
import p441y8.C13930a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b9.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class HandlerC2222y0 extends HandlerC12609e {

    /* renamed from: a */
    final /* synthetic */ AbstractC2150c f6222a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2222y0(AbstractC2150c abstractC2150c, Looper looper) {
        super(looper);
        this.f6222a = abstractC2150c;
    }

    /* renamed from: a */
    private static final void m33952a(Message message) {
        AbstractC2224z0 abstractC2224z0 = (AbstractC2224z0) message.obj;
        abstractC2224z0.mo33949b();
        abstractC2224z0.m33946e();
    }

    /* renamed from: b */
    private static final boolean m33951b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC2150c.InterfaceC2151a interfaceC2151a;
        AbstractC2150c.InterfaceC2151a interfaceC2151a2;
        C13930a c13930a;
        C13930a c13930a2;
        C13930a c13930a3;
        C13930a c13930a4;
        boolean z;
        if (this.f6222a.f6066L.get() != message.arg1) {
            if (m33951b(message)) {
                m33952a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i != 1 && i != 7 && ((i != 4 || this.f6222a.m34077s()) && message.what != 5)) || this.f6222a.m34090c()) {
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                this.f6222a.f6063I = new C13930a(message.arg2);
                if (AbstractC2150c.m34084f0(this.f6222a)) {
                    AbstractC2150c abstractC2150c = this.f6222a;
                    z = abstractC2150c.f6064J;
                    if (!z) {
                        abstractC2150c.m34083g0(3, null);
                        return;
                    }
                }
                AbstractC2150c abstractC2150c2 = this.f6222a;
                c13930a3 = abstractC2150c2.f6063I;
                if (c13930a3 != null) {
                    c13930a4 = abstractC2150c2.f6063I;
                } else {
                    c13930a4 = new C13930a(8);
                }
                this.f6222a.f6082y.mo28068a(c13930a4);
                this.f6222a.m34108K(c13930a4);
                return;
            } else if (i2 == 5) {
                AbstractC2150c abstractC2150c3 = this.f6222a;
                c13930a = abstractC2150c3.f6063I;
                if (c13930a != null) {
                    c13930a2 = abstractC2150c3.f6063I;
                } else {
                    c13930a2 = new C13930a(8);
                }
                this.f6222a.f6082y.mo28068a(c13930a2);
                this.f6222a.m34108K(c13930a2);
                return;
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C13930a c13930a5 = new C13930a(message.arg2, pendingIntent);
                this.f6222a.f6082y.mo28068a(c13930a5);
                this.f6222a.m34108K(c13930a5);
                return;
            } else if (i2 == 6) {
                this.f6222a.m34083g0(5, null);
                AbstractC2150c abstractC2150c4 = this.f6222a;
                interfaceC2151a = abstractC2150c4.f6058D;
                if (interfaceC2151a != null) {
                    interfaceC2151a2 = abstractC2150c4.f6058D;
                    interfaceC2151a2.mo34046e(message.arg2);
                }
                this.f6222a.mo3026L(message.arg2);
                AbstractC2150c.m34086e0(this.f6222a, 5, 1, null);
                return;
            } else if (i2 == 2 && !this.f6222a.m34094a()) {
                m33952a(message);
                return;
            } else if (m33951b(message)) {
                ((AbstractC2224z0) message.obj).m33948c();
                return;
            } else {
                int i3 = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i3);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
                return;
            }
        }
        m33952a(message);
    }
}
