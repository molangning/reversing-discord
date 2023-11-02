package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p245n8.InterfaceC10513a;
import p358u1.C12817b;
import p358u1.InterfaceC12816a;
import p377v1.C13051a;

/* renamed from: com.android.installreferrer.api.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2761a extends InstallReferrerClient {

    /* renamed from: a */
    private int f7428a = 0;

    /* renamed from: b */
    private final Context f7429b;

    /* renamed from: c */
    private InterfaceC10513a f7430c;

    /* renamed from: d */
    private ServiceConnection f7431d;

    /* renamed from: com.android.installreferrer.api.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private final class ServiceConnectionC2763b implements ServiceConnection {

        /* renamed from: j */
        private final InterfaceC12816a f7432j;

        private ServiceConnectionC2763b(InterfaceC12816a interfaceC12816a) {
            C2761a.this = r1;
            if (interfaceC12816a != null) {
                this.f7432j = interfaceC12816a;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C13051a.m3389a("InstallReferrerClient", "Install Referrer service connected.");
            C2761a.this.f7430c = InterfaceC10513a.AbstractBinderC10514a.m11330b(iBinder);
            C2761a.this.f7428a = 2;
            this.f7432j.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C13051a.m3388b("InstallReferrerClient", "Install Referrer service disconnected.");
            C2761a.this.f7430c = null;
            C2761a.this.f7428a = 0;
            this.f7432j.onInstallReferrerServiceDisconnected();
        }
    }

    public C2761a(Context context) {
        this.f7429b = context.getApplicationContext();
    }

    /* renamed from: g */
    private boolean m32433g() {
        if (this.f7429b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode < 80837300) {
            return false;
        }
        return true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public void mo32438a() {
        this.f7428a = 3;
        if (this.f7431d != null) {
            C13051a.m3389a("InstallReferrerClient", "Unbinding from service.");
            this.f7429b.unbindService(this.f7431d);
            this.f7431d = null;
        }
        this.f7430c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: b */
    public C12817b mo32437b() {
        if (m32432h()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f7429b.getPackageName());
            try {
                return new C12817b(this.f7430c.mo11329o(bundle));
            } catch (RemoteException e) {
                C13051a.m3388b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f7428a = 0;
                throw e;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: d */
    public void mo32436d(InterfaceC12816a interfaceC12816a) {
        ServiceInfo serviceInfo;
        if (m32432h()) {
            C13051a.m3389a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            interfaceC12816a.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f7428a;
        if (i == 1) {
            C13051a.m3388b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            interfaceC12816a.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            C13051a.m3388b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            interfaceC12816a.onInstallReferrerSetupFinished(3);
        } else {
            C13051a.m3389a("InstallReferrerClient", "Starting install referrer service setup.");
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f7429b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null && m32433g()) {
                    Intent intent2 = new Intent(intent);
                    ServiceConnectionC2763b serviceConnectionC2763b = new ServiceConnectionC2763b(interfaceC12816a);
                    this.f7431d = serviceConnectionC2763b;
                    try {
                        if (this.f7429b.bindService(intent2, serviceConnectionC2763b, 1)) {
                            C13051a.m3389a("InstallReferrerClient", "Service was bonded successfully.");
                            return;
                        }
                        C13051a.m3388b("InstallReferrerClient", "Connection to service is blocked.");
                        this.f7428a = 0;
                        interfaceC12816a.onInstallReferrerSetupFinished(1);
                        return;
                    } catch (SecurityException unused) {
                        C13051a.m3388b("InstallReferrerClient", "No permission to connect to service.");
                        this.f7428a = 0;
                        interfaceC12816a.onInstallReferrerSetupFinished(4);
                        return;
                    }
                }
                C13051a.m3388b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f7428a = 0;
                interfaceC12816a.onInstallReferrerSetupFinished(2);
                return;
            }
            this.f7428a = 0;
            C13051a.m3389a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            interfaceC12816a.onInstallReferrerSetupFinished(2);
        }
    }

    /* renamed from: h */
    public boolean m32432h() {
        return (this.f7428a != 2 || this.f7430c == null || this.f7431d == null) ? false : true;
    }
}