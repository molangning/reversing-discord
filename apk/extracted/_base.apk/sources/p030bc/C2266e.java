package p030bc;

import com.google.firebase.installations.C5058i;
import java.util.concurrent.TimeUnit;

/* renamed from: bc.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C2266e {

    /* renamed from: d */
    private static final long f6376d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f6377e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C5058i f6378a = C5058i.m26396c();

    /* renamed from: b */
    private long f6379b;

    /* renamed from: c */
    private int f6380c;

    /* renamed from: a */
    private synchronized long m33720a(int i) {
        if (!m33718c(i)) {
            return f6376d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f6380c) + this.f6378a.m26394e(), f6377e);
    }

    /* renamed from: c */
    private static boolean m33718c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m33717d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m33716e() {
        this.f6380c = 0;
    }

    /* renamed from: b */
    public synchronized boolean m33719b() {
        boolean z;
        if (this.f6380c != 0) {
            if (this.f6378a.m26398a() <= this.f6379b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: f */
    public synchronized void m33715f(int i) {
        if (m33717d(i)) {
            m33716e();
            return;
        }
        this.f6380c++;
        this.f6379b = this.f6378a.m26398a() + m33720a(i);
    }
}
