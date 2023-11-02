package p029b9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: b9.l1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2186l1 implements Handler.Callback {

    /* renamed from: j */
    final /* synthetic */ C2189m1 f6164j;

    public /* synthetic */ C2186l1(C2189m1 c2189m1, C2183k1 c2183k1) {
        this.f6164j = c2189m1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            hashMap4 = this.f6164j.f6174f;
            synchronized (hashMap4) {
                C2176i1 c2176i1 = (C2176i1) message.obj;
                hashMap5 = this.f6164j.f6174f;
                ServiceConnectionC2180j1 serviceConnectionC2180j1 = (ServiceConnectionC2180j1) hashMap5.get(c2176i1);
                if (serviceConnectionC2180j1 != null && serviceConnectionC2180j1.m34025a() == 3) {
                    String valueOf = String.valueOf(c2176i1);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName m34024b = serviceConnectionC2180j1.m34024b();
                    if (m34024b == null) {
                        m34024b = c2176i1.m34029b();
                    }
                    if (m34024b == null) {
                        String m34027d = c2176i1.m34027d();
                        C2198p.m33985j(m34027d);
                        m34024b = new ComponentName(m34027d, "unknown");
                    }
                    serviceConnectionC2180j1.onServiceDisconnected(m34024b);
                }
            }
            return true;
        }
        hashMap = this.f6164j.f6174f;
        synchronized (hashMap) {
            C2176i1 c2176i12 = (C2176i1) message.obj;
            hashMap2 = this.f6164j.f6174f;
            ServiceConnectionC2180j1 serviceConnectionC2180j12 = (ServiceConnectionC2180j1) hashMap2.get(c2176i12);
            if (serviceConnectionC2180j12 != null && serviceConnectionC2180j12.m34017i()) {
                if (serviceConnectionC2180j12.m34016j()) {
                    serviceConnectionC2180j12.m34019g("GmsClientSupervisor");
                }
                hashMap3 = this.f6164j.f6174f;
                hashMap3.remove(c2176i12);
            }
        }
        return true;
    }
}