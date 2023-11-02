package pe;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: pe.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11538u {

    /* renamed from: a */
    private final Context f30006a;

    /* renamed from: b */
    private final InterfaceC11540b f30007b;

    /* renamed from: c */
    private float f30008c;

    /* renamed from: d */
    private float f30009d;

    /* renamed from: e */
    private boolean f30010e;

    /* renamed from: f */
    private boolean f30011f;

    /* renamed from: g */
    private float f30012g;

    /* renamed from: h */
    private float f30013h;

    /* renamed from: i */
    private float f30014i;

    /* renamed from: j */
    private float f30015j;

    /* renamed from: k */
    private float f30016k;

    /* renamed from: l */
    private float f30017l;

    /* renamed from: m */
    private float f30018m;

    /* renamed from: n */
    private long f30019n;

    /* renamed from: o */
    private long f30020o;

    /* renamed from: p */
    private boolean f30021p;

    /* renamed from: q */
    private int f30022q;

    /* renamed from: r */
    private int f30023r;

    /* renamed from: s */
    private final Handler f30024s;

    /* renamed from: t */
    private float f30025t;

    /* renamed from: u */
    private float f30026u;

    /* renamed from: v */
    private int f30027v;

    /* renamed from: w */
    private GestureDetector f30028w;

    /* renamed from: x */
    private boolean f30029x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pe.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11539a extends GestureDetector.SimpleOnGestureListener {
        C11539a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            C11538u.this.f30025t = motionEvent.getX();
            C11538u.this.f30026u = motionEvent.getY();
            C11538u.this.f30027v = 1;
            return true;
        }
    }

    /* renamed from: pe.u$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11540b {
        /* renamed from: a */
        void mo7730a(C11538u c11538u);

        /* renamed from: b */
        boolean mo7729b(C11538u c11538u);

        /* renamed from: c */
        boolean mo7728c(C11538u c11538u);
    }

    public C11538u(Context context, InterfaceC11540b interfaceC11540b) {
        this(context, interfaceC11540b, null);
    }

    /* renamed from: i */
    private boolean m7734i() {
        return this.f30027v != 0;
    }

    /* renamed from: d */
    public float m7739d() {
        return this.f30012g;
    }

    /* renamed from: e */
    public float m7738e() {
        return this.f30008c;
    }

    /* renamed from: f */
    public float m7737f() {
        return this.f30009d;
    }

    /* renamed from: g */
    public float m7736g() {
        boolean z;
        if (m7734i()) {
            boolean z2 = this.f30029x;
            if ((z2 && this.f30012g < this.f30013h) || (!z2 && this.f30012g > this.f30013h)) {
                z = true;
            } else {
                z = false;
            }
            float abs = Math.abs(1.0f - (this.f30012g / this.f30013h)) * 0.5f;
            if (this.f30013h <= this.f30022q) {
                return 1.0f;
            }
            if (z) {
                return 1.0f + abs;
            }
            return 1.0f - abs;
        }
        float f = this.f30013h;
        if (f <= 0.0f) {
            return 1.0f;
        }
        return this.f30012g / f;
    }

    /* renamed from: h */
    public long m7735h() {
        return this.f30019n - this.f30020o;
    }

    /* renamed from: j */
    public boolean m7733j(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        float f;
        float f2;
        float hypot;
        int i2;
        boolean z6;
        this.f30019n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f30010e) {
            this.f30028w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getButtonState() & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f30027v == 2 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (actionMasked != 1 && actionMasked != 3 && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        float f3 = 0.0f;
        if (actionMasked == 0 || z3) {
            if (this.f30021p) {
                this.f30007b.mo7730a(this);
                this.f30021p = false;
                this.f30014i = 0.0f;
                this.f30027v = 0;
            } else if (m7734i() && z3) {
                this.f30021p = false;
                this.f30014i = 0.0f;
                this.f30027v = 0;
            }
            if (z3) {
                return true;
            }
        }
        if (!this.f30021p && this.f30011f && !m7734i() && !z3 && z) {
            this.f30025t = motionEvent.getX();
            this.f30026u = motionEvent.getY();
            this.f30027v = 2;
            this.f30014i = 0.0f;
        }
        if (actionMasked != 0 && actionMasked != 6 && actionMasked != 5 && !z2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (actionMasked == 6) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i = motionEvent.getActionIndex();
        } else {
            i = -1;
        }
        int i3 = z5 ? pointerCount - 1 : pointerCount;
        if (m7734i()) {
            f2 = this.f30025t;
            f = this.f30026u;
            if (motionEvent.getY() < f) {
                this.f30029x = true;
            } else {
                this.f30029x = false;
            }
        } else {
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i4 = 0; i4 < pointerCount; i4++) {
                if (i != i4) {
                    f4 += motionEvent.getX(i4);
                    f5 += motionEvent.getY(i4);
                }
            }
            float f6 = i3;
            float f7 = f4 / f6;
            f = f5 / f6;
            f2 = f7;
        }
        float f8 = 0.0f;
        for (int i5 = 0; i5 < pointerCount; i5++) {
            if (i != i5) {
                f3 += Math.abs(motionEvent.getX(i5) - f2);
                f8 += Math.abs(motionEvent.getY(i5) - f);
            }
        }
        float f9 = i3;
        float f10 = (f3 / f9) * 2.0f;
        float f11 = (f8 / f9) * 2.0f;
        if (m7734i()) {
            hypot = f11;
        } else {
            hypot = (float) Math.hypot(f10, f11);
        }
        boolean z7 = this.f30021p;
        this.f30008c = f2;
        this.f30009d = f;
        if (!m7734i() && this.f30021p && (hypot < this.f30023r || z4)) {
            this.f30007b.mo7730a(this);
            this.f30021p = false;
            this.f30014i = hypot;
        }
        if (z4) {
            this.f30015j = f10;
            this.f30017l = f10;
            this.f30016k = f11;
            this.f30018m = f11;
            this.f30012g = hypot;
            this.f30013h = hypot;
            this.f30014i = hypot;
        }
        if (m7734i()) {
            i2 = this.f30022q;
        } else {
            i2 = this.f30023r;
        }
        if (!this.f30021p && hypot >= i2 && (z7 || Math.abs(hypot - this.f30014i) > this.f30022q)) {
            this.f30015j = f10;
            this.f30017l = f10;
            this.f30016k = f11;
            this.f30018m = f11;
            this.f30012g = hypot;
            this.f30013h = hypot;
            this.f30020o = this.f30019n;
            this.f30021p = this.f30007b.mo7729b(this);
        }
        if (actionMasked == 2) {
            this.f30015j = f10;
            this.f30016k = f11;
            this.f30012g = hypot;
            if (this.f30021p) {
                z6 = this.f30007b.mo7728c(this);
            } else {
                z6 = true;
            }
            if (z6) {
                this.f30017l = this.f30015j;
                this.f30018m = this.f30016k;
                this.f30013h = this.f30012g;
                this.f30020o = this.f30019n;
            }
        }
        return true;
    }

    /* renamed from: k */
    public void m7732k(boolean z) {
        this.f30010e = z;
        if (z && this.f30028w == null) {
            this.f30028w = new GestureDetector(this.f30006a, new C11539a(), this.f30024s);
        }
    }

    /* renamed from: l */
    public void m7731l(boolean z) {
        this.f30011f = z;
    }

    public C11538u(Context context, InterfaceC11540b interfaceC11540b, Handler handler) {
        this.f30027v = 0;
        this.f30006a = context;
        this.f30007b = interfaceC11540b;
        this.f30022q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f30023r = 0;
        this.f30024s = handler;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            m7732k(true);
        }
        if (i > 22) {
            m7731l(true);
        }
    }
}
