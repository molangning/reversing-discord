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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p133h9.ThreadFactoryC7041b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RunnableC5117u0 implements Runnable {

    /* renamed from: j */
    private final long f14395j;

    /* renamed from: k */
    private final PowerManager.WakeLock f14396k;

    /* renamed from: l */
    private final FirebaseMessaging f14397l;

    /* renamed from: m */
    ExecutorService f14398m = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC7041b("firebase-iid-executor"));

    /* renamed from: com.google.firebase.messaging.u0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C5118a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC5117u0 f14399a;

        public C5118a(RunnableC5117u0 runnableC5117u0) {
            this.f14399a = runnableC5117u0;
        }

        /* renamed from: a */
        public void m26165a() {
            if (RunnableC5117u0.m26168c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f14399a.m26169b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC5117u0 runnableC5117u0 = this.f14399a;
            if (runnableC5117u0 == null || !runnableC5117u0.m26167d()) {
                return;
            }
            if (RunnableC5117u0.m26168c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f14399a.f14397l.m26374j(this.f14399a, 0L);
            this.f14399a.m26169b().unregisterReceiver(this);
            this.f14399a = null;
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public RunnableC5117u0(FirebaseMessaging firebaseMessaging, long j) {
        this.f14397l = firebaseMessaging;
        this.f14395j = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m26169b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f14396k = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m26168c() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    Context m26169b() {
        return this.f14397l.m26373k();
    }

    /* renamed from: d */
    boolean m26167d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m26169b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    boolean m26166e() {
        try {
            if (this.f14397l.m26375i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            if (C5127z.m26132g(e.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C5108q0.m26194b().m26191e(m26169b())) {
            this.f14396k.acquire();
        }
        try {
            try {
                this.f14397l.m26388A(true);
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                this.f14397l.m26388A(false);
                if (!C5108q0.m26194b().m26191e(m26169b())) {
                    return;
                }
            }
            if (!this.f14397l.m26364t()) {
                this.f14397l.m26388A(false);
                if (C5108q0.m26194b().m26191e(m26169b())) {
                    this.f14396k.release();
                }
            } else if (C5108q0.m26194b().m26192d(m26169b()) && !m26167d()) {
                new C5118a(this).m26165a();
                if (C5108q0.m26194b().m26191e(m26169b())) {
                    this.f14396k.release();
                }
            } else {
                if (m26166e()) {
                    this.f14397l.m26388A(false);
                } else {
                    this.f14397l.m26385D(this.f14395j);
                }
                if (!C5108q0.m26194b().m26191e(m26169b())) {
                    return;
                }
                this.f14396k.release();
            }
        } catch (Throwable th2) {
            if (C5108q0.m26194b().m26191e(m26169b())) {
                this.f14396k.release();
            }
            throw th2;
        }
    }
}
