package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* renamed from: com.reactnativecommunity.netinfo.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5390a {

    /* renamed from: b */
    private final Context f15275b;

    /* renamed from: c */
    private final InterfaceC5391a f15276c;

    /* renamed from: e */
    private Handler f15278e;

    /* renamed from: a */
    private final C5393c f15274a = new C5393c();

    /* renamed from: d */
    private final Runnable f15277d = new RunnableC5392b();

    /* renamed from: f */
    private boolean f15279f = false;

    /* renamed from: com.reactnativecommunity.netinfo.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5391a {
        void onAmazonFireDeviceConnectivityChanged(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.reactnativecommunity.netinfo.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC5392b implements Runnable {
        private RunnableC5392b() {
            C5390a.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C5390a.this.f15279f) {
                return;
            }
            C5390a.this.f15275b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
            C5390a.this.f15278e.postDelayed(C5390a.this.f15277d, 10000L);
        }
    }

    /* renamed from: com.reactnativecommunity.netinfo.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5393c extends BroadcastReceiver {

        /* renamed from: a */
        boolean f15281a;

        /* renamed from: b */
        private Boolean f15282b;

        private C5393c() {
            C5390a.this = r1;
            this.f15281a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            boolean z;
            if (intent == null) {
                action = null;
            } else {
                action = intent.getAction();
            }
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z = false;
            } else if ("com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                z = true;
            } else {
                return;
            }
            Boolean bool = this.f15282b;
            if (bool == null || bool.booleanValue() != z) {
                this.f15282b = Boolean.valueOf(z);
                C5390a.this.f15276c.onAmazonFireDeviceConnectivityChanged(z);
            }
        }
    }

    public C5390a(Context context, InterfaceC5391a interfaceC5391a) {
        this.f15275b = context;
        this.f15276c = interfaceC5391a;
    }

    /* renamed from: f */
    private boolean m25299f() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m25297h() {
        if (this.f15274a.f15281a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
        this.f15275b.registerReceiver(this.f15274a, intentFilter);
        this.f15274a.f15281a = true;
    }

    /* renamed from: i */
    private void m25296i() {
        if (this.f15279f) {
            return;
        }
        Handler handler = new Handler();
        this.f15278e = handler;
        this.f15279f = true;
        handler.post(this.f15277d);
    }

    /* renamed from: j */
    private void m25295j() {
        if (!this.f15279f) {
            return;
        }
        this.f15279f = false;
        this.f15278e.removeCallbacksAndMessages(null);
        this.f15278e = null;
    }

    /* renamed from: l */
    private void m25293l() {
        C5393c c5393c = this.f15274a;
        if (!c5393c.f15281a) {
            return;
        }
        this.f15275b.unregisterReceiver(c5393c);
        this.f15274a.f15281a = false;
    }

    /* renamed from: g */
    public void m25298g() {
        if (!m25299f()) {
            return;
        }
        m25297h();
        m25296i();
    }

    /* renamed from: k */
    public void m25294k() {
        if (!m25299f()) {
            return;
        }
        m25295j();
        m25293l();
    }
}