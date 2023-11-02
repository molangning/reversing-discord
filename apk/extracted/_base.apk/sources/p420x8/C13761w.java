package p420x8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p133h9.ThreadFactoryC7041b;
import p339s9.C12441e;

/* renamed from: x8.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13761w {

    /* renamed from: e */
    private static C13761w f35497e;

    /* renamed from: a */
    private final Context f35498a;

    /* renamed from: b */
    private final ScheduledExecutorService f35499b;

    /* renamed from: c */
    private ServiceConnectionC13755q f35500c = new ServiceConnectionC13755q(this, null);

    /* renamed from: d */
    private int f35501d = 1;

    C13761w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f35499b = scheduledExecutorService;
        this.f35498a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m1582a(C13761w c13761w) {
        return c13761w.f35498a;
    }

    /* renamed from: b */
    public static synchronized C13761w m1581b(Context context) {
        C13761w c13761w;
        synchronized (C13761w.class) {
            if (f35497e == null) {
                C12441e.m5279a();
                f35497e = new C13761w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC7041b("MessengerIpcClient"))));
            }
            c13761w = f35497e;
        }
        return c13761w;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ ScheduledExecutorService m1578e(C13761w c13761w) {
        return c13761w.f35499b;
    }

    /* renamed from: f */
    private final synchronized int m1577f() {
        int i;
        i = this.f35501d;
        this.f35501d = i + 1;
        return i;
    }

    /* renamed from: g */
    private final synchronized <T> Task<T> m1576g(AbstractC13758t<T> abstractC13758t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(abstractC13758t);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f35500c.m1588g(abstractC13758t)) {
            ServiceConnectionC13755q serviceConnectionC13755q = new ServiceConnectionC13755q(this, null);
            this.f35500c = serviceConnectionC13755q;
            serviceConnectionC13755q.m1588g(abstractC13758t);
        }
        return abstractC13758t.f35494b.m28013a();
    }

    /* renamed from: c */
    public final Task<Void> m1580c(int i, Bundle bundle) {
        return m1576g(new C13757s(m1577f(), 2, bundle));
    }

    /* renamed from: d */
    public final Task<Bundle> m1579d(int i, Bundle bundle) {
        return m1576g(new C13760v(m1577f(), 1, bundle));
    }
}
