package p037c4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.DrawableProperties;
import p076e4.C6105a;
import p076e4.InterfaceC6106b;
import p169j3.InterfaceC8790a;
import p414x2.C13677a;
import p415x3.InterfaceC13680a;

/* renamed from: c4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2392a extends Drawable implements Animatable, InterfaceC8790a {

    /* renamed from: j */
    private InterfaceC13680a f6536j;

    /* renamed from: k */
    private InterfaceC6106b f6537k;

    /* renamed from: l */
    private volatile boolean f6538l;

    /* renamed from: m */
    private long f6539m;

    /* renamed from: n */
    private long f6540n;

    /* renamed from: o */
    private long f6541o;

    /* renamed from: p */
    private int f6542p;

    /* renamed from: q */
    private long f6543q;

    /* renamed from: r */
    private long f6544r;

    /* renamed from: s */
    private int f6545s;

    /* renamed from: t */
    private long f6546t;

    /* renamed from: u */
    private long f6547u;

    /* renamed from: v */
    private int f6548v;

    /* renamed from: w */
    private volatile InterfaceC2394b f6549w;

    /* renamed from: x */
    private DrawableProperties f6550x;

    /* renamed from: y */
    private final Runnable f6551y;

    /* renamed from: z */
    private static final Class<?> f6535z = C2392a.class;

    /* renamed from: A */
    private static final InterfaceC2394b f6534A = new C2395c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c4.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC2393a implements Runnable {
        RunnableC2393a() {
            C2392a.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2392a c2392a = C2392a.this;
            c2392a.unscheduleSelf(c2392a.f6551y);
            C2392a.this.invalidateSelf();
        }
    }

    public C2392a() {
        this(null);
    }

    /* renamed from: c */
    private static InterfaceC6106b m33529c(InterfaceC13680a interfaceC13680a) {
        if (interfaceC13680a == null) {
            return null;
        }
        return new C6105a(interfaceC13680a);
    }

    /* renamed from: d */
    private long m33528d() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: e */
    private void m33527e() {
        this.f6548v++;
        if (C13677a.m1842v(2)) {
            C13677a.m1840x(f6535z, "Dropped a frame. Count: %s", Integer.valueOf(this.f6548v));
        }
    }

    /* renamed from: f */
    private void m33526f(long j) {
        long j2 = this.f6539m + j;
        this.f6541o = j2;
        scheduleSelf(this.f6551y, j2);
    }

    @Override // p169j3.InterfaceC8790a
    /* renamed from: a */
    public void mo17244a() {
        InterfaceC13680a interfaceC13680a = this.f6536j;
        if (interfaceC13680a != null) {
            interfaceC13680a.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        long max;
        if (this.f6536j != null && this.f6537k != null) {
            long m33528d = m33528d();
            if (this.f6538l) {
                max = (m33528d - this.f6539m) + this.f6547u;
            } else {
                max = Math.max(this.f6540n, 0L);
            }
            int mo23552b = this.f6537k.mo23552b(max, this.f6540n);
            if (mo23552b == -1) {
                mo23552b = this.f6536j.mo1347a() - 1;
                this.f6549w.mo33525a(this);
                this.f6538l = false;
            } else if (mo23552b == 0 && this.f6542p != -1 && m33528d >= this.f6541o) {
                this.f6549w.mo33522d(this);
            }
            boolean mo1341g = this.f6536j.mo1341g(this, canvas, mo23552b);
            if (mo1341g) {
                this.f6549w.mo33524b(this, mo23552b);
                this.f6542p = mo23552b;
            }
            if (!mo1341g) {
                m33527e();
            }
            long m33528d2 = m33528d();
            if (this.f6538l) {
                long mo23553a = this.f6537k.mo23553a(m33528d2 - this.f6539m);
                if (mo23553a != -1) {
                    m33526f(mo23553a + this.f6546t);
                } else {
                    this.f6549w.mo33525a(this);
                    this.f6538l = false;
                }
            }
            this.f6540n = max;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        InterfaceC13680a interfaceC13680a = this.f6536j;
        if (interfaceC13680a == null) {
            return super.getIntrinsicHeight();
        }
        return interfaceC13680a.mo1345c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        InterfaceC13680a interfaceC13680a = this.f6536j;
        if (interfaceC13680a == null) {
            return super.getIntrinsicWidth();
        }
        return interfaceC13680a.mo1343e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f6538l;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        InterfaceC13680a interfaceC13680a = this.f6536j;
        if (interfaceC13680a != null) {
            interfaceC13680a.mo1344d(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f6538l) {
            return false;
        }
        long j = i;
        if (this.f6540n == j) {
            return false;
        }
        this.f6540n = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f6550x == null) {
            this.f6550x = new DrawableProperties();
        }
        this.f6550x.m31543b(i);
        InterfaceC13680a interfaceC13680a = this.f6536j;
        if (interfaceC13680a != null) {
            interfaceC13680a.mo1338j(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f6550x == null) {
            this.f6550x = new DrawableProperties();
        }
        this.f6550x.m31542c(colorFilter);
        InterfaceC13680a interfaceC13680a = this.f6536j;
        if (interfaceC13680a != null) {
            interfaceC13680a.mo1342f(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        InterfaceC13680a interfaceC13680a;
        if (!this.f6538l && (interfaceC13680a = this.f6536j) != null && interfaceC13680a.mo1347a() > 1) {
            this.f6538l = true;
            long m33528d = m33528d();
            long j = m33528d - this.f6543q;
            this.f6539m = j;
            this.f6541o = j;
            this.f6540n = m33528d - this.f6544r;
            this.f6542p = this.f6545s;
            invalidateSelf();
            this.f6549w.mo33523c(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (!this.f6538l) {
            return;
        }
        long m33528d = m33528d();
        this.f6543q = m33528d - this.f6539m;
        this.f6544r = m33528d - this.f6540n;
        this.f6545s = this.f6542p;
        this.f6538l = false;
        this.f6539m = 0L;
        this.f6541o = 0L;
        this.f6540n = -1L;
        this.f6542p = -1;
        unscheduleSelf(this.f6551y);
        this.f6549w.mo33525a(this);
    }

    public C2392a(InterfaceC13680a interfaceC13680a) {
        this.f6546t = 8L;
        this.f6547u = 0L;
        this.f6549w = f6534A;
        this.f6551y = new RunnableC2393a();
        this.f6536j = interfaceC13680a;
        this.f6537k = m33529c(interfaceC13680a);
    }
}