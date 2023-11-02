package p213l8;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.facebook.react.uimanager.ViewProps;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;

/* renamed from: l8.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10083o {

    /* renamed from: a */
    private final C10070e f26270a = new C10070e();

    /* renamed from: b */
    private final WindowManager f26271b;

    /* renamed from: c */
    private final Choreographer$FrameCallbackC10085b f26272c;

    /* renamed from: d */
    private final C10084a f26273d;

    /* renamed from: e */
    private boolean f26274e;

    /* renamed from: f */
    private Surface f26275f;

    /* renamed from: g */
    private float f26276g;

    /* renamed from: h */
    private float f26277h;

    /* renamed from: i */
    private float f26278i;

    /* renamed from: j */
    private float f26279j;

    /* renamed from: k */
    private long f26280k;

    /* renamed from: l */
    private long f26281l;

    /* renamed from: m */
    private long f26282m;

    /* renamed from: n */
    private long f26283n;

    /* renamed from: o */
    private long f26284o;

    /* renamed from: p */
    private long f26285p;

    /* renamed from: q */
    private long f26286q;

    /* renamed from: l8.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C10084a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f26287a;

        public C10084a(DisplayManager displayManager) {
            C10083o.this = r1;
            this.f26287a = displayManager;
        }

        /* renamed from: a */
        public void m12319a() {
            this.f26287a.registerDisplayListener(this, C9191p0.m16215x());
        }

        /* renamed from: b */
        public void m12318b() {
            this.f26287a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                C10083o.this.m12322r();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l8.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Choreographer$FrameCallbackC10085b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: o */
        private static final Choreographer$FrameCallbackC10085b f26289o = new Choreographer$FrameCallbackC10085b();

        /* renamed from: j */
        public volatile long f26290j = -9223372036854775807L;

        /* renamed from: k */
        private final Handler f26291k;

        /* renamed from: l */
        private final HandlerThread f26292l;

        /* renamed from: m */
        private Choreographer f26293m;

        /* renamed from: n */
        private int f26294n;

        private Choreographer$FrameCallbackC10085b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f26292l = handlerThread;
            handlerThread.start();
            Handler m16217w = C9191p0.m16217w(handlerThread.getLooper(), this);
            this.f26291k = m16217w;
            m16217w.sendEmptyMessage(0);
        }

        /* renamed from: b */
        private void m12316b() {
            int i = this.f26294n + 1;
            this.f26294n = i;
            if (i == 1) {
                ((Choreographer) C9149a.m16448e(this.f26293m)).postFrameCallback(this);
            }
        }

        /* renamed from: c */
        private void m12315c() {
            this.f26293m = Choreographer.getInstance();
        }

        /* renamed from: d */
        public static Choreographer$FrameCallbackC10085b m12314d() {
            return f26289o;
        }

        /* renamed from: f */
        private void m12312f() {
            int i = this.f26294n - 1;
            this.f26294n = i;
            if (i == 0) {
                ((Choreographer) C9149a.m16448e(this.f26293m)).removeFrameCallback(this);
                this.f26290j = -9223372036854775807L;
            }
        }

        /* renamed from: a */
        public void m12317a() {
            this.f26291k.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f26290j = j;
            ((Choreographer) C9149a.m16448e(this.f26293m)).postFrameCallbackDelayed(this, 500L);
        }

        /* renamed from: e */
        public void m12313e() {
            this.f26291k.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    m12312f();
                    return true;
                }
                m12316b();
                return true;
            }
            m12315c();
            return true;
        }
    }

    public C10083o(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f26271b = (WindowManager) context.getSystemService("window");
        } else {
            this.f26271b = null;
        }
        if (this.f26271b != null) {
            this.f26273d = C9191p0.f24171a >= 17 ? m12334f((Context) C9149a.m16448e(context)) : null;
            this.f26272c = Choreographer$FrameCallbackC10085b.m12314d();
        } else {
            this.f26273d = null;
            this.f26272c = null;
        }
        this.f26280k = -9223372036854775807L;
        this.f26281l = -9223372036854775807L;
        this.f26276g = -1.0f;
        this.f26279j = 1.0f;
    }

    /* renamed from: c */
    private static boolean m12337c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    /* renamed from: d */
    private void m12336d() {
        Surface surface;
        if (C9191p0.f24171a >= 30 && (surface = this.f26275f) != null && this.f26278i != 0.0f) {
            this.f26278i = 0.0f;
            m12323q(surface, 0.0f);
        }
    }

    /* renamed from: e */
    private static long m12335e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* renamed from: f */
    private C10084a m12334f(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
        if (displayManager == null) {
            return null;
        }
        return new C10084a(displayManager);
    }

    /* renamed from: p */
    private void m12324p() {
        this.f26282m = 0L;
        this.f26285p = -1L;
        this.f26283n = -1L;
    }

    /* renamed from: q */
    private static void m12323q(Surface surface, float f) {
        int i;
        if (f == 0.0f) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            C9197r.m16182d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* renamed from: r */
    public void m12322r() {
        Display defaultDisplay = ((WindowManager) C9149a.m16448e(this.f26271b)).getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.f26280k = refreshRate;
            this.f26281l = (refreshRate * 80) / 100;
            return;
        }
        C9197r.m16178h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f26280k = -9223372036854775807L;
        this.f26281l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r7.f26277h) >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x006a, code lost:
        if (r7.f26270a.m12420c() >= 30) goto L26;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m12321s() {
        /*
            r7 = this;
            int r0 = p195k8.C9191p0.f24171a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f26275f
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            l8.e r0 = r7.f26270a
            boolean r0 = r0.m12418e()
            if (r0 == 0) goto L1b
            l8.e r0 = r7.f26270a
            float r0 = r0.m12421b()
            goto L1d
        L1b:
            float r0 = r7.f26276g
        L1d:
            float r2 = r7.f26277h
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            l8.e r1 = r7.f26270a
            boolean r1 = r1.m12418e()
            if (r1 == 0) goto L49
            l8.e r1 = r7.f26270a
            long r1 = r1.m12419d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f26277h
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            l8.e r2 = r7.f26270a
            int r2 = r2.m12420c()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f26277h = r0
            r7.m12320t(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213l8.C10083o.m12321s():void");
    }

    /* renamed from: t */
    private void m12320t(boolean z) {
        Surface surface;
        float f;
        if (C9191p0.f24171a >= 30 && (surface = this.f26275f) != null) {
            if (this.f26274e) {
                float f2 = this.f26277h;
                if (f2 != -1.0f) {
                    f = f2 * this.f26279j;
                    if (z && this.f26278i == f) {
                        return;
                    }
                    this.f26278i = f;
                    m12323q(surface, f);
                }
            }
            f = 0.0f;
            if (z) {
            }
            this.f26278i = f;
            m12323q(surface, f);
        }
    }

    /* renamed from: b */
    public long m12338b(long j) {
        long j2;
        Choreographer$FrameCallbackC10085b choreographer$FrameCallbackC10085b;
        if (this.f26285p != -1 && this.f26270a.m12418e()) {
            long m12422a = this.f26286q + (((float) (this.f26270a.m12422a() * (this.f26282m - this.f26285p))) / this.f26279j);
            if (m12337c(j, m12422a)) {
                j2 = m12422a;
                this.f26283n = this.f26282m;
                this.f26284o = j2;
                choreographer$FrameCallbackC10085b = this.f26272c;
                if (choreographer$FrameCallbackC10085b == null && this.f26280k != -9223372036854775807L) {
                    long j3 = choreographer$FrameCallbackC10085b.f26290j;
                    if (j3 == -9223372036854775807L) {
                        return j2;
                    }
                    return m12335e(j2, j3, this.f26280k) - this.f26281l;
                }
                return j2;
            }
            m12324p();
        }
        j2 = j;
        this.f26283n = this.f26282m;
        this.f26284o = j2;
        choreographer$FrameCallbackC10085b = this.f26272c;
        if (choreographer$FrameCallbackC10085b == null) {
        }
        return j2;
    }

    @TargetApi(17)
    /* renamed from: g */
    public void m12333g() {
        if (this.f26271b != null) {
            C10084a c10084a = this.f26273d;
            if (c10084a != null) {
                c10084a.m12318b();
            }
            ((Choreographer$FrameCallbackC10085b) C9149a.m16448e(this.f26272c)).m12313e();
        }
    }

    @TargetApi(17)
    /* renamed from: h */
    public void m12332h() {
        if (this.f26271b != null) {
            ((Choreographer$FrameCallbackC10085b) C9149a.m16448e(this.f26272c)).m12317a();
            C10084a c10084a = this.f26273d;
            if (c10084a != null) {
                c10084a.m12319a();
            }
            m12322r();
        }
    }

    /* renamed from: i */
    public void m12331i(float f) {
        this.f26276g = f;
        this.f26270a.m12416g();
        m12321s();
    }

    /* renamed from: j */
    public void m12330j(long j) {
        long j2 = this.f26283n;
        if (j2 != -1) {
            this.f26285p = j2;
            this.f26286q = this.f26284o;
        }
        this.f26282m++;
        this.f26270a.m12417f(j * 1000);
        m12321s();
    }

    /* renamed from: k */
    public void m12329k(float f) {
        this.f26279j = f;
        m12324p();
        m12320t(false);
    }

    /* renamed from: l */
    public void m12328l() {
        m12324p();
    }

    /* renamed from: m */
    public void m12327m() {
        this.f26274e = true;
        m12324p();
        m12320t(false);
    }

    /* renamed from: n */
    public void m12326n() {
        this.f26274e = false;
        m12336d();
    }

    /* renamed from: o */
    public void m12325o(Surface surface) {
        if (surface instanceof C10067d) {
            surface = null;
        }
        if (this.f26275f == surface) {
            return;
        }
        m12336d();
        this.f26275f = surface;
        m12320t(true);
    }
}