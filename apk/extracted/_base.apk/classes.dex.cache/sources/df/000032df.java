package p100f9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import p029b9.C2198p;
import p029b9.InterfaceC2193n1;
import p119g9.C6587j;
import p154i9.C7478d;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: f9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6351b {

    /* renamed from: b */
    private static final Object f17992b = new Object();

    /* renamed from: c */
    private static volatile C6351b f17993c;

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f17994a = new ConcurrentHashMap<>();

    private C6351b() {
    }

    /* renamed from: b */
    public static C6351b m22870b() {
        if (f17993c == null) {
            synchronized (f17992b) {
                if (f17993c == null) {
                    f17993c = new C6351b();
                }
            }
        }
        C6351b c6351b = f17993c;
        C2198p.m33985j(c6351b);
        return c6351b;
    }

    /* renamed from: e */
    private static void m22867e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m22866f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C7478d.m20598a(context).m20602c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (m22865g(serviceConnection)) {
            ServiceConnection putIfAbsent = this.f17994a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean m22864h = m22864h(context, intent, serviceConnection, i, executor);
                if (!m22864h) {
                    return false;
                }
                return m22864h;
            } finally {
                this.f17994a.remove(serviceConnection, serviceConnection);
            }
        }
        return m22864h(context, intent, serviceConnection, i, executor);
    }

    /* renamed from: g */
    private static boolean m22865g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC2193n1);
    }

    /* renamed from: h */
    private static final boolean m22864h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean bindService;
        if (C6587j.m22358j() && executor != null) {
            bindService = context.bindService(intent, i, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i);
    }

    /* renamed from: a */
    public boolean m22871a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m22866f(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    /* renamed from: c */
    public void m22869c(Context context, ServiceConnection serviceConnection) {
        if (m22865g(serviceConnection) && this.f17994a.containsKey(serviceConnection)) {
            try {
                m22867e(context, this.f17994a.get(serviceConnection));
                return;
            } finally {
                this.f17994a.remove(serviceConnection);
            }
        }
        m22867e(context, serviceConnection);
    }

    /* renamed from: d */
    public final boolean m22868d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return m22866f(context, str, intent, serviceConnection, i, true, executor);
    }
}