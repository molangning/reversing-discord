package ga;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p029b9.C2198p;
import p119g9.C6582e;
import p119g9.C6589l;
import p119g9.C6591n;
import p119g9.InterfaceC6581d;
import p421x9.C13766b;
import p421x9.C13772h;
import p421x9.C13773i;

/* renamed from: ga.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6594a {

    /* renamed from: r */
    private static final long f18740r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f18741s = null;

    /* renamed from: t */
    private static final Object f18742t = new Object();

    /* renamed from: u */
    private static volatile InterfaceC6598e f18743u = new C6596c();

    /* renamed from: a */
    private final Object f18744a;

    /* renamed from: b */
    private final PowerManager.WakeLock f18745b;

    /* renamed from: c */
    private int f18746c;

    /* renamed from: d */
    private Future<?> f18747d;

    /* renamed from: e */
    private long f18748e;

    /* renamed from: f */
    private final Set<C6599f> f18749f;

    /* renamed from: g */
    private boolean f18750g;

    /* renamed from: h */
    private int f18751h;

    /* renamed from: i */
    C13766b f18752i;

    /* renamed from: j */
    private InterfaceC6581d f18753j;

    /* renamed from: k */
    private WorkSource f18754k;

    /* renamed from: l */
    private final String f18755l;

    /* renamed from: m */
    private final String f18756m;

    /* renamed from: n */
    private final Context f18757n;

    /* renamed from: o */
    private final Map<String, C6597d> f18758o;

    /* renamed from: p */
    private AtomicInteger f18759p;

    /* renamed from: q */
    private final ScheduledExecutorService f18760q;

    public C6594a(Context context, int i, String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f18744a = new Object();
        this.f18746c = 0;
        this.f18749f = new HashSet();
        this.f18750g = true;
        this.f18753j = C6582e.m22380c();
        this.f18758o = new HashMap();
        this.f18759p = new AtomicInteger(0);
        C2198p.m33984k(context, "WakeLock: context must not be null");
        C2198p.m33988g(str, "WakeLock: wakeLockName must not be empty");
        this.f18757n = context.getApplicationContext();
        this.f18756m = str;
        this.f18752i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f18755l = str2;
        } else {
            this.f18755l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f18745b = newWakeLock;
            if (C6591n.m22350c(context)) {
                WorkSource m22351b = C6591n.m22351b(context, C6589l.m22355a(packageName) ? context.getPackageName() : packageName);
                this.f18754k = m22351b;
                if (m22351b != null) {
                    m22339i(newWakeLock, m22351b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f18741s;
            if (scheduledExecutorService == null) {
                synchronized (f18742t) {
                    scheduledExecutorService = f18741s;
                    if (scheduledExecutorService == null) {
                        C13772h.m1571a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f18741s = scheduledExecutorService;
                    }
                }
            }
            this.f18760q = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new C13773i(sb2.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m22343e(C6594a c6594a) {
        synchronized (c6594a.f18744a) {
            if (!c6594a.m22346b()) {
                return;
            }
            Log.e("WakeLock", String.valueOf(c6594a.f18755l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
            c6594a.m22341g();
            if (!c6594a.m22346b()) {
                return;
            }
            c6594a.f18746c = 1;
            c6594a.m22340h(0);
        }
    }

    /* renamed from: f */
    private final String m22342f(String str) {
        if (this.f18750g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* renamed from: g */
    private final void m22341g() {
        if (this.f18749f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f18749f);
        this.f18749f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        C6599f c6599f = (C6599f) arrayList.get(0);
        throw null;
    }

    /* renamed from: h */
    private final void m22340h(int i) {
        synchronized (this.f18744a) {
            if (!m22346b()) {
                return;
            }
            if (this.f18750g) {
                int i2 = this.f18746c - 1;
                this.f18746c = i2;
                if (i2 > 0) {
                    return;
                }
            } else {
                this.f18746c = 0;
            }
            m22341g();
            for (C6597d c6597d : this.f18758o.values()) {
                c6597d.f18762a = 0;
            }
            this.f18758o.clear();
            Future<?> future = this.f18747d;
            if (future != null) {
                future.cancel(false);
                this.f18747d = null;
                this.f18748e = 0L;
            }
            this.f18751h = 0;
            if (this.f18745b.isHeld()) {
                try {
                    this.f18745b.release();
                    if (this.f18752i != null) {
                        this.f18752i = null;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass().equals(RuntimeException.class)) {
                        Log.e("WakeLock", String.valueOf(this.f18755l).concat(" failed to release!"), e);
                        if (this.f18752i != null) {
                            this.f18752i = null;
                        }
                    } else {
                        throw e;
                    }
                }
            } else {
                Log.e("WakeLock", String.valueOf(this.f18755l).concat(" should be held!"));
            }
        }
    }

    /* renamed from: i */
    private static void m22339i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    /* renamed from: a */
    public void m22347a(long j) {
        this.f18759p.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f18740r), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f18744a) {
            if (!m22346b()) {
                this.f18752i = C13766b.m1572a(false, null);
                this.f18745b.acquire();
                this.f18753j.mo22381b();
            }
            this.f18746c++;
            this.f18751h++;
            m22342f(null);
            C6597d c6597d = this.f18758o.get(null);
            if (c6597d == null) {
                c6597d = new C6597d(null);
                this.f18758o.put(null, c6597d);
            }
            c6597d.f18762a++;
            long mo22381b = this.f18753j.mo22381b();
            if (Long.MAX_VALUE - mo22381b > max) {
                j2 = mo22381b + max;
            }
            if (j2 > this.f18748e) {
                this.f18748e = j2;
                Future<?> future = this.f18747d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f18747d = this.f18760q.schedule(new Runnable() { // from class: ga.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6594a.m22343e(C6594a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean m22346b() {
        boolean z;
        synchronized (this.f18744a) {
            if (this.f18746c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void m22345c() {
        if (this.f18759p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f18755l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f18744a) {
            m22342f(null);
            if (this.f18758o.containsKey(null)) {
                C6597d c6597d = this.f18758o.get(null);
                if (c6597d != null) {
                    int i = c6597d.f18762a - 1;
                    c6597d.f18762a = i;
                    if (i == 0) {
                        this.f18758o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f18755l).concat(" counter does not exist"));
            }
            m22340h(0);
        }
    }

    /* renamed from: d */
    public void m22344d(boolean z) {
        synchronized (this.f18744a) {
            this.f18750g = z;
        }
    }
}