package p312r2;

import com.facebook.cache.common.CacheKey;
import java.io.IOException;
import p292q2.InterfaceC11687b;
import p292q2.InterfaceC11688c;

/* renamed from: r2.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12046i implements InterfaceC11687b {

    /* renamed from: i */
    private static final Object f31099i = new Object();

    /* renamed from: j */
    private static C12046i f31100j;

    /* renamed from: k */
    private static int f31101k;

    /* renamed from: a */
    private CacheKey f31102a;

    /* renamed from: b */
    private String f31103b;

    /* renamed from: c */
    private long f31104c;

    /* renamed from: d */
    private long f31105d;

    /* renamed from: e */
    private long f31106e;

    /* renamed from: f */
    private IOException f31107f;

    /* renamed from: g */
    private InterfaceC11688c.EnumC11689a f31108g;

    /* renamed from: h */
    private C12046i f31109h;

    private C12046i() {
    }

    /* renamed from: a */
    public static C12046i m6490a() {
        synchronized (f31099i) {
            C12046i c12046i = f31100j;
            if (c12046i != null) {
                f31100j = c12046i.f31109h;
                c12046i.f31109h = null;
                f31101k--;
                return c12046i;
            }
            return new C12046i();
        }
    }

    /* renamed from: c */
    private void m6488c() {
        this.f31102a = null;
        this.f31103b = null;
        this.f31104c = 0L;
        this.f31105d = 0L;
        this.f31106e = 0L;
        this.f31107f = null;
        this.f31108g = null;
    }

    /* renamed from: b */
    public void m6489b() {
        synchronized (f31099i) {
            if (f31101k < 5) {
                m6488c();
                f31101k++;
                C12046i c12046i = f31100j;
                if (c12046i != null) {
                    this.f31109h = c12046i;
                }
                f31100j = this;
            }
        }
    }

    /* renamed from: d */
    public C12046i m6487d(CacheKey cacheKey) {
        this.f31102a = cacheKey;
        return this;
    }

    /* renamed from: e */
    public C12046i m6486e(long j) {
        this.f31105d = j;
        return this;
    }

    /* renamed from: f */
    public C12046i m6485f(long j) {
        this.f31106e = j;
        return this;
    }

    /* renamed from: g */
    public C12046i m6484g(InterfaceC11688c.EnumC11689a enumC11689a) {
        this.f31108g = enumC11689a;
        return this;
    }

    /* renamed from: h */
    public C12046i m6483h(IOException iOException) {
        this.f31107f = iOException;
        return this;
    }

    /* renamed from: i */
    public C12046i m6482i(long j) {
        this.f31104c = j;
        return this;
    }

    /* renamed from: j */
    public C12046i m6481j(String str) {
        this.f31103b = str;
        return this;
    }
}
