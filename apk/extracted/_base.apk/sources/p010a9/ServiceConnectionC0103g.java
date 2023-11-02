package p010a9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p029b9.AbstractC2150c;
import p029b9.AbstractC2171h;
import p029b9.C2198p;
import p029b9.InterfaceC2177j;
import p441y8.C13930a;
import p441y8.C13932c;
import p461z8.C14107a;

/* renamed from: a9.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ServiceConnectionC0103g implements C14107a.InterfaceC14116f, ServiceConnection {

    /* renamed from: j */
    private final String f451j;

    /* renamed from: k */
    private final String f452k;

    /* renamed from: l */
    private final ComponentName f453l;

    /* renamed from: m */
    private final Context f454m;

    /* renamed from: n */
    private final InterfaceC0097d f455n;

    /* renamed from: o */
    private final Handler f456o;

    /* renamed from: p */
    private final InterfaceC0105h f457p;

    /* renamed from: q */
    private IBinder f458q;

    /* renamed from: r */
    private boolean f459r;

    /* renamed from: s */
    private String f460s;

    /* renamed from: t */
    private String f461t;

    /* renamed from: s */
    private final void m41140s() {
        if (Thread.currentThread() == this.f456o.getLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    /* renamed from: t */
    private final void m41139t(String str) {
        String.valueOf(this.f458q);
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: a */
    public final boolean mo648a() {
        m41140s();
        return this.f458q != null;
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: b */
    public final void mo647b(String str) {
        m41140s();
        this.f460s = str;
        mo639l();
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: c */
    public final boolean mo646c() {
        m41140s();
        return this.f459r;
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: d */
    public final String mo645d() {
        String str = this.f451j;
        if (str != null) {
            return str;
        }
        C2198p.m33985j(this.f453l);
        return this.f453l.getPackageName();
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: e */
    public final boolean mo644e() {
        return false;
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: f */
    public final void mo643f(AbstractC2150c.InterfaceC2153c interfaceC2153c) {
        m41140s();
        m41139t("Connect started.");
        if (mo648a()) {
            try {
                mo647b("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f453l;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f451j).setAction(this.f452k);
            }
            boolean bindService = this.f454m.bindService(intent, this, AbstractC2171h.m34038a());
            this.f459r = bindService;
            if (!bindService) {
                this.f458q = null;
                this.f457p.mo28094c(new C13930a(16));
            }
            m41139t("Finished connect.");
        } catch (SecurityException e) {
            this.f459r = false;
            this.f458q = null;
            throw e;
        }
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: g */
    public final boolean mo642g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m41143h() {
        this.f459r = false;
        this.f458q = null;
        m41139t("Disconnected.");
        this.f455n.mo28092e(1);
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: i */
    public final Set<Scope> mo641i() {
        return Collections.emptySet();
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: j */
    public final void mo640j(InterfaceC2177j interfaceC2177j, Set<Scope> set) {
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: l */
    public final void mo639l() {
        m41140s();
        m41139t("Disconnect called.");
        try {
            this.f454m.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f459r = false;
        this.f458q = null;
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: m */
    public final int mo638m() {
        return 0;
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: n */
    public final C13932c[] mo637n() {
        return new C13932c[0];
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: o */
    public final void mo636o(AbstractC2150c.InterfaceC2155e interfaceC2155e) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f456o.post(new Runnable() { // from class: a9.v
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC0103g.this.m41142q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f456o.post(new Runnable() { // from class: a9.u
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC0103g.this.m41143h();
            }
        });
    }

    @Override // p461z8.C14107a.InterfaceC14116f
    /* renamed from: p */
    public final String mo635p() {
        return this.f460s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m41142q(IBinder iBinder) {
        this.f459r = false;
        this.f458q = iBinder;
        m41139t("Connected.");
        this.f455n.mo28095b(new Bundle());
    }

    /* renamed from: r */
    public final void m41141r(String str) {
        this.f461t = str;
    }
}
