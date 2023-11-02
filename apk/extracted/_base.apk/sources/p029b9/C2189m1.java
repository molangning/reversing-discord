package p029b9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p100f9.C6351b;
import p351t9.HandlerC12609e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b9.m1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2189m1 extends AbstractC2171h {

    /* renamed from: f */
    private final HashMap<C2176i1, ServiceConnectionC2180j1> f6174f = new HashMap<>();

    /* renamed from: g */
    private final Context f6175g;

    /* renamed from: h */
    private volatile Handler f6176h;

    /* renamed from: i */
    private final C2186l1 f6177i;

    /* renamed from: j */
    private final C6351b f6178j;

    /* renamed from: k */
    private final long f6179k;

    /* renamed from: l */
    private final long f6180l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2189m1(Context context, Looper looper) {
        C2186l1 c2186l1 = new C2186l1(this, null);
        this.f6177i = c2186l1;
        this.f6175g = context.getApplicationContext();
        this.f6176h = new HandlerC12609e(looper, c2186l1);
        this.f6178j = C6351b.m22870b();
        this.f6179k = 5000L;
        this.f6180l = 300000L;
    }

    @Override // p029b9.AbstractC2171h
    /* renamed from: d */
    protected final void mo34012d(C2176i1 c2176i1, ServiceConnection serviceConnection, String str) {
        C2198p.m33984k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6174f) {
            ServiceConnectionC2180j1 serviceConnectionC2180j1 = this.f6174f.get(c2176i1);
            if (serviceConnectionC2180j1 != null) {
                if (serviceConnectionC2180j1.m34018h(serviceConnection)) {
                    serviceConnectionC2180j1.m34020f(serviceConnection, str);
                    if (serviceConnectionC2180j1.m34017i()) {
                        this.f6176h.sendMessageDelayed(this.f6176h.obtainMessage(0, c2176i1), this.f6179k);
                    }
                } else {
                    String obj = c2176i1.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                String obj2 = c2176i1.toString();
                StringBuilder sb3 = new StringBuilder(obj2.length() + 50);
                sb3.append("Nonexistent connection status for service config: ");
                sb3.append(obj2);
                throw new IllegalStateException(sb3.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p029b9.AbstractC2171h
    /* renamed from: f */
    public final boolean mo34011f(C2176i1 c2176i1, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m34016j;
        C2198p.m33984k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6174f) {
            ServiceConnectionC2180j1 serviceConnectionC2180j1 = this.f6174f.get(c2176i1);
            if (serviceConnectionC2180j1 == null) {
                serviceConnectionC2180j1 = new ServiceConnectionC2180j1(this, c2176i1);
                serviceConnectionC2180j1.m34022d(serviceConnection, serviceConnection, str);
                serviceConnectionC2180j1.m34021e(str, executor);
                this.f6174f.put(c2176i1, serviceConnectionC2180j1);
            } else {
                this.f6176h.removeMessages(0, c2176i1);
                if (!serviceConnectionC2180j1.m34018h(serviceConnection)) {
                    serviceConnectionC2180j1.m34022d(serviceConnection, serviceConnection, str);
                    int m34025a = serviceConnectionC2180j1.m34025a();
                    if (m34025a != 1) {
                        if (m34025a == 2) {
                            serviceConnectionC2180j1.m34021e(str, executor);
                        }
                    } else {
                        serviceConnection.onServiceConnected(serviceConnectionC2180j1.m34024b(), serviceConnectionC2180j1.m34023c());
                    }
                } else {
                    String obj = c2176i1.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 81);
                    sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            m34016j = serviceConnectionC2180j1.m34016j();
        }
        return m34016j;
    }
}
