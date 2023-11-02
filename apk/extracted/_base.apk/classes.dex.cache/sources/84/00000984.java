package p029b9;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p100f9.C6351b;

/* renamed from: b9.j1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ServiceConnectionC2180j1 implements ServiceConnection, InterfaceC2193n1 {

    /* renamed from: j */
    private final Map<ServiceConnection, ServiceConnection> f6152j = new HashMap();

    /* renamed from: k */
    private int f6153k = 2;

    /* renamed from: l */
    private boolean f6154l;

    /* renamed from: m */
    private IBinder f6155m;

    /* renamed from: n */
    private final C2176i1 f6156n;

    /* renamed from: o */
    private ComponentName f6157o;

    /* renamed from: p */
    final /* synthetic */ C2189m1 f6158p;

    public ServiceConnectionC2180j1(C2189m1 c2189m1, C2176i1 c2176i1) {
        this.f6158p = c2189m1;
        this.f6156n = c2176i1;
    }

    /* renamed from: a */
    public final int m34025a() {
        return this.f6153k;
    }

    /* renamed from: b */
    public final ComponentName m34024b() {
        return this.f6157o;
    }

    /* renamed from: c */
    public final IBinder m34023c() {
        return this.f6155m;
    }

    /* renamed from: d */
    public final void m34022d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f6152j.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m34021e(String str, Executor executor) {
        C6351b c6351b;
        Context context;
        Context context2;
        C6351b c6351b2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.f6153k = 3;
        C2189m1 c2189m1 = this.f6158p;
        c6351b = c2189m1.f6178j;
        context = c2189m1.f6175g;
        C2176i1 c2176i1 = this.f6156n;
        context2 = c2189m1.f6175g;
        boolean m22868d = c6351b.m22868d(context, str, c2176i1.m34028c(context2), this, this.f6156n.m34030a(), executor);
        this.f6154l = m22868d;
        if (m22868d) {
            handler = this.f6158p.f6176h;
            Message obtainMessage = handler.obtainMessage(1, this.f6156n);
            handler2 = this.f6158p.f6176h;
            j = this.f6158p.f6180l;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.f6153k = 2;
        try {
            C2189m1 c2189m12 = this.f6158p;
            c6351b2 = c2189m12.f6178j;
            context3 = c2189m12.f6175g;
            c6351b2.m22869c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: f */
    public final void m34020f(ServiceConnection serviceConnection, String str) {
        this.f6152j.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m34019g(String str) {
        Handler handler;
        C6351b c6351b;
        Context context;
        handler = this.f6158p.f6176h;
        handler.removeMessages(1, this.f6156n);
        C2189m1 c2189m1 = this.f6158p;
        c6351b = c2189m1.f6178j;
        context = c2189m1.f6175g;
        c6351b.m22869c(context, this);
        this.f6154l = false;
        this.f6153k = 2;
    }

    /* renamed from: h */
    public final boolean m34018h(ServiceConnection serviceConnection) {
        return this.f6152j.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m34017i() {
        return this.f6152j.isEmpty();
    }

    /* renamed from: j */
    public final boolean m34016j() {
        return this.f6154l;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f6158p.f6174f;
        synchronized (hashMap) {
            handler = this.f6158p.f6176h;
            handler.removeMessages(1, this.f6156n);
            this.f6155m = iBinder;
            this.f6157o = componentName;
            for (ServiceConnection serviceConnection : this.f6152j.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f6153k = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f6158p.f6174f;
        synchronized (hashMap) {
            handler = this.f6158p.f6176h;
            handler.removeMessages(1, this.f6156n);
            this.f6155m = null;
            this.f6157o = componentName;
            for (ServiceConnection serviceConnection : this.f6152j.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f6153k = 2;
        }
    }
}