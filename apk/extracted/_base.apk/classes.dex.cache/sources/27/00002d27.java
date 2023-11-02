package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.z0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RunnableC5128z0 implements Runnable {

    /* renamed from: o */
    private static final Object f14433o = new Object();

    /* renamed from: p */
    private static Boolean f14434p;

    /* renamed from: q */
    private static Boolean f14435q;

    /* renamed from: j */
    private final Context f14436j;

    /* renamed from: k */
    private final C5080e0 f14437k;

    /* renamed from: l */
    private final PowerManager.WakeLock f14438l;

    /* renamed from: m */
    private final C5126y0 f14439m;

    /* renamed from: n */
    private final long f14440n;

    /* renamed from: com.google.firebase.messaging.z0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5129a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC5128z0 f14441a;

        public C5129a(RunnableC5128z0 runnableC5128z0) {
            RunnableC5128z0.this = r1;
            this.f14441a = runnableC5128z0;
        }

        /* renamed from: a */
        public void m26116a() {
            if (RunnableC5128z0.m26125b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC5128z0.this.f14436j.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC5128z0 runnableC5128z0 = this.f14441a;
            if (runnableC5128z0 == null) {
                return;
            }
            if (!runnableC5128z0.m26118i()) {
                return;
            }
            if (RunnableC5128z0.m26125b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f14441a.f14439m.m26144l(this.f14441a, 0L);
            context.unregisterReceiver(this);
            this.f14441a = null;
        }
    }

    public RunnableC5128z0(C5126y0 c5126y0, Context context, C5080e0 c5080e0, long j) {
        this.f14439m = c5126y0;
        this.f14436j = context;
        this.f14440n = j;
        this.f14437k = c5080e0;
        this.f14438l = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: b */
    static /* synthetic */ boolean m26125b() {
        return m26117j();
    }

    /* renamed from: e */
    private static String m26122e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    private static boolean m26121f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f14433o) {
            Boolean bool = f14435q;
            if (bool == null) {
                booleanValue = m26120g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f14435q = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* renamed from: g */
    private static boolean m26120g(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m26122e(str));
        }
        return z;
    }

    /* renamed from: h */
    private static boolean m26119h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f14433o) {
            Boolean bool = f14434p;
            if (bool == null) {
                booleanValue = m26120g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f14434p = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* renamed from: i */
    public synchronized boolean m26118i() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f14436j.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: j */
    private static boolean m26117j() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m26119h(this.f14436j)) {
            this.f14438l.acquire(C5071c.f14323a);
        }
        try {
            try {
                try {
                    this.f14439m.m26143m(true);
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    this.f14439m.m26143m(false);
                    if (m26119h(this.f14436j)) {
                        wakeLock = this.f14438l;
                    } else {
                        return;
                    }
                }
                if (!this.f14437k.m26274g()) {
                    this.f14439m.m26143m(false);
                    if (m26119h(this.f14436j)) {
                        try {
                            this.f14438l.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (m26121f(this.f14436j) && !m26118i()) {
                    new C5129a(this).m26116a();
                    if (m26119h(this.f14436j)) {
                        try {
                            this.f14438l.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    if (this.f14439m.m26140p()) {
                        this.f14439m.m26143m(false);
                    } else {
                        this.f14439m.m26139q(this.f14440n);
                    }
                    if (m26119h(this.f14436j)) {
                        wakeLock = this.f14438l;
                        wakeLock.release();
                    }
                }
            } catch (Throwable th2) {
                if (m26119h(this.f14436j)) {
                    try {
                        this.f14438l.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th2;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}