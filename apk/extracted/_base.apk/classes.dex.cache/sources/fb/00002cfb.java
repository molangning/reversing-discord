package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ServiceConnectionC5084f1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p100f9.C6351b;
import p133h9.ThreadFactoryC7041b;
import p134ha.InterfaceC7046d;

/* renamed from: com.google.firebase.messaging.f1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class ServiceConnectionC5084f1 implements ServiceConnection {

    /* renamed from: j */
    private final Context f14339j;

    /* renamed from: k */
    private final Intent f14340k;

    /* renamed from: l */
    private final ScheduledExecutorService f14341l;

    /* renamed from: m */
    private final Queue<C5085a> f14342m;

    /* renamed from: n */
    private BinderC5074c1 f14343n;

    /* renamed from: o */
    private boolean f14344o;

    /* renamed from: com.google.firebase.messaging.f1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5085a {

        /* renamed from: a */
        final Intent f14345a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f14346b = new TaskCompletionSource<>();

        C5085a(Intent intent) {
            this.f14345a = intent;
        }

        /* renamed from: f */
        public /* synthetic */ void m26237f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f14345a.getAction() + " App may get closed.");
            m26239d();
        }

        /* renamed from: c */
        void m26240c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.d1
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC5084f1.C5085a.this.m26237f();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            m26238e().mo27981c(scheduledExecutorService, new InterfaceC7046d() { // from class: com.google.firebase.messaging.e1
                @Override // p134ha.InterfaceC7046d
                /* renamed from: a */
                public final void mo1614a(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* renamed from: d */
        public void m26239d() {
            this.f14346b.m28009e(null);
        }

        /* renamed from: e */
        Task<Void> m26238e() {
            return this.f14346b.m28013a();
        }
    }

    public ServiceConnectionC5084f1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC7041b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private void m26246a() {
        while (!this.f14342m.isEmpty()) {
            this.f14342m.poll().m26239d();
        }
    }

    /* renamed from: b */
    private synchronized void m26245b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f14342m.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC5074c1 binderC5074c1 = this.f14343n;
            if (binderC5074c1 != null && binderC5074c1.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f14343n.m26315c(this.f14342m.poll());
            } else {
                m26243d();
                return;
            }
        }
    }

    /* renamed from: d */
    private void m26243d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f14344o);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f14344o) {
            return;
        }
        this.f14344o = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (C6351b.m22870b().m22871a(this.f14339j, this.f14340k, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f14344o = false;
        m26246a();
    }

    /* renamed from: c */
    public synchronized Task<Void> m26244c(Intent intent) {
        C5085a c5085a;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        c5085a = new C5085a(intent);
        c5085a.m26240c(this.f14341l);
        this.f14342m.add(c5085a);
        m26245b();
        return c5085a.m26238e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f14344o = false;
        if (!(iBinder instanceof BinderC5074c1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m26246a();
            return;
        }
        this.f14343n = (BinderC5074c1) iBinder;
        m26245b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m26245b();
    }

    ServiceConnectionC5084f1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f14342m = new ArrayDeque();
        this.f14344o = false;
        Context applicationContext = context.getApplicationContext();
        this.f14339j = applicationContext;
        this.f14340k = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f14341l = scheduledExecutorService;
    }
}