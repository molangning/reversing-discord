package p420x8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p029b9.C2198p;
import p100f9.C6351b;
import p339s9.HandlerC12442f;

/* renamed from: x8.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ServiceConnectionC13755q implements ServiceConnection {

    /* renamed from: l */
    C13756r f35487l;

    /* renamed from: o */
    final /* synthetic */ C13761w f35490o;

    /* renamed from: j */
    int f35485j = 0;

    /* renamed from: k */
    final Messenger f35486k = new Messenger(new HandlerC12442f(Looper.getMainLooper(), new Handler.Callback() { // from class: x8.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC13755q serviceConnectionC13755q = ServiceConnectionC13755q.this;
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (serviceConnectionC13755q) {
                AbstractC13758t<?> abstractC13758t = serviceConnectionC13755q.f35489n.get(i);
                if (abstractC13758t == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                serviceConnectionC13755q.f35489n.remove(i);
                serviceConnectionC13755q.m1589f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    abstractC13758t.m1586c(new C13759u(4, "Not supported by GmsCore", null));
                    return true;
                }
                abstractC13758t.mo1584a(data);
                return true;
            }
        }
    }));

    /* renamed from: m */
    final Queue<AbstractC13758t<?>> f35488m = new ArrayDeque();

    /* renamed from: n */
    final SparseArray<AbstractC13758t<?>> f35489n = new SparseArray<>();

    public /* synthetic */ ServiceConnectionC13755q(C13761w c13761w, C13754p c13754p) {
        this.f35490o = c13761w;
    }

    /* renamed from: a */
    public final synchronized void m1594a(int i, String str) {
        m1593b(i, str, null);
    }

    /* renamed from: b */
    final synchronized void m1593b(int i, String str, Throwable th2) {
        Context context;
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i2 = this.f35485j;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f35485j = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f35485j = 4;
            C6351b m22870b = C6351b.m22870b();
            context = this.f35490o.f35498a;
            m22870b.m22869c(context, this);
            C13759u c13759u = new C13759u(i, str, th2);
            for (AbstractC13758t<?> abstractC13758t : this.f35488m) {
                abstractC13758t.m1586c(c13759u);
            }
            this.f35488m.clear();
            for (int i3 = 0; i3 < this.f35489n.size(); i3++) {
                this.f35489n.valueAt(i3).m1586c(c13759u);
            }
            this.f35489n.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final void m1592c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f35490o.f35499b;
        scheduledExecutorService.execute(new Runnable() { // from class: x8.l
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC13758t poll;
                final ServiceConnectionC13755q serviceConnectionC13755q = ServiceConnectionC13755q.this;
                while (true) {
                    synchronized (serviceConnectionC13755q) {
                        if (serviceConnectionC13755q.f35485j != 2) {
                            return;
                        }
                        if (serviceConnectionC13755q.f35488m.isEmpty()) {
                            serviceConnectionC13755q.m1589f();
                            return;
                        }
                        poll = serviceConnectionC13755q.f35488m.poll();
                        serviceConnectionC13755q.f35489n.put(poll.f35493a, poll);
                        C13761w.m1578e(serviceConnectionC13755q.f35490o).schedule(new Runnable() { // from class: x8.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                ServiceConnectionC13755q.this.m1590e(poll.f35493a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    Context m1582a = C13761w.m1582a(serviceConnectionC13755q.f35490o);
                    Messenger messenger = serviceConnectionC13755q.f35486k;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f35495c;
                    obtain.arg1 = poll.f35493a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo1583b());
                    bundle.putString("pkg", m1582a.getPackageName());
                    bundle.putBundle("data", poll.f35496d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC13755q.f35487l.m1587a(obtain);
                    } catch (RemoteException e) {
                        serviceConnectionC13755q.m1594a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public final synchronized void m1591d() {
        if (this.f35485j == 1) {
            m1594a(1, "Timed out while binding");
        }
    }

    /* renamed from: e */
    public final synchronized void m1590e(int i) {
        AbstractC13758t<?> abstractC13758t = this.f35489n.get(i);
        if (abstractC13758t != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f35489n.remove(i);
            abstractC13758t.m1586c(new C13759u(3, "Timed out waiting for response", null));
            m1589f();
        }
    }

    /* renamed from: f */
    public final synchronized void m1589f() {
        Context context;
        if (this.f35485j == 2 && this.f35488m.isEmpty() && this.f35489n.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f35485j = 3;
            C6351b m22870b = C6351b.m22870b();
            context = this.f35490o.f35498a;
            m22870b.m22869c(context, this);
        }
    }

    /* renamed from: g */
    public final synchronized boolean m1588g(AbstractC13758t<?> abstractC13758t) {
        boolean z;
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.f35485j;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.f35488m.add(abstractC13758t);
                m1592c();
                return true;
            }
            this.f35488m.add(abstractC13758t);
            return true;
        }
        this.f35488m.add(abstractC13758t);
        if (this.f35485j == 0) {
            z = true;
        } else {
            z = false;
        }
        C2198p.m33983l(z);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f35485j = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            C6351b m22870b = C6351b.m22870b();
            context = this.f35490o.f35498a;
            if (!m22870b.m22871a(context, intent, this, 1)) {
                m1594a(0, "Unable to bind to service");
            } else {
                scheduledExecutorService = this.f35490o.f35499b;
                scheduledExecutorService.schedule(new Runnable() { // from class: x8.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC13755q.this.m1591d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            m1593b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f35490o.f35499b;
        scheduledExecutorService.execute(new Runnable() { // from class: x8.n
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC13755q serviceConnectionC13755q = ServiceConnectionC13755q.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC13755q) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC13755q.m1594a(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC13755q.f35487l = new C13756r(iBinder2);
                            serviceConnectionC13755q.f35485j = 2;
                            serviceConnectionC13755q.m1592c();
                        } catch (RemoteException e) {
                            serviceConnectionC13755q.m1594a(0, e.getMessage());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f35490o.f35499b;
        scheduledExecutorService.execute(new Runnable() { // from class: x8.k
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC13755q.this.m1594a(2, "Service disconnected");
            }
        });
    }
}