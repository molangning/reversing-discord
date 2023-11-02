package p023b3;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p394w2.C13386n;

/* renamed from: b3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2117a {

    /* renamed from: h */
    private static C2117a f5969h;

    /* renamed from: i */
    private static final long f5970i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b */
    private volatile File f5972b;

    /* renamed from: d */
    private volatile File f5974d;

    /* renamed from: e */
    private long f5975e;

    /* renamed from: a */
    private volatile StatFs f5971a = null;

    /* renamed from: c */
    private volatile StatFs f5973c = null;

    /* renamed from: g */
    private volatile boolean f5977g = false;

    /* renamed from: f */
    private final Lock f5976f = new ReentrantLock();

    /* renamed from: b3.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC2118a {
        INTERNAL,
        EXTERNAL
    }

    protected C2117a() {
    }

    /* renamed from: a */
    protected static StatFs m34178a(String str) {
        return new StatFs(str);
    }

    /* renamed from: b */
    private void m34177b() {
        if (!this.f5977g) {
            this.f5976f.lock();
            try {
                if (!this.f5977g) {
                    this.f5972b = Environment.getDataDirectory();
                    this.f5974d = Environment.getExternalStorageDirectory();
                    m34172g();
                    this.f5977g = true;
                }
            } finally {
                this.f5976f.unlock();
            }
        }
    }

    /* renamed from: d */
    public static synchronized C2117a m34175d() {
        C2117a c2117a;
        synchronized (C2117a.class) {
            if (f5969h == null) {
                f5969h = new C2117a();
            }
            c2117a = f5969h;
        }
        return c2117a;
    }

    /* renamed from: e */
    private void m34174e() {
        if (this.f5976f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f5975e > f5970i) {
                    m34172g();
                }
            } finally {
                this.f5976f.unlock();
            }
        }
    }

    /* renamed from: g */
    private void m34172g() {
        this.f5971a = m34171h(this.f5971a, this.f5972b);
        this.f5973c = m34171h(this.f5973c, this.f5974d);
        this.f5975e = SystemClock.uptimeMillis();
    }

    /* renamed from: h */
    private StatFs m34171h(StatFs statFs, File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = m34178a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th2) {
            throw C13386n.m2666a(th2);
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    /* renamed from: c */
    public long m34176c(EnumC2118a enumC2118a) {
        StatFs statFs;
        m34177b();
        m34174e();
        if (enumC2118a == EnumC2118a.INTERNAL) {
            statFs = this.f5971a;
        } else {
            statFs = this.f5973c;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    /* renamed from: f */
    public boolean m34173f(EnumC2118a enumC2118a, long j) {
        m34177b();
        long m34176c = m34176c(enumC2118a);
        if (m34176c <= 0 || m34176c < j) {
            return true;
        }
        return false;
    }
}
