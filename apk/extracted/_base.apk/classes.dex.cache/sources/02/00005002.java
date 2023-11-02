package ve;

import android.view.MotionEvent;

/* renamed from: ve.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13266h {

    /* renamed from: a */
    private float f34332a;

    /* renamed from: b */
    private float f34333b;

    /* renamed from: c */
    private float f34334c;

    /* renamed from: d */
    private float f34335d;

    /* renamed from: e */
    private int f34336e = -1;

    /* renamed from: f */
    private int f34337f = -1;

    /* renamed from: g */
    private float f34338g;

    /* renamed from: h */
    private boolean f34339h;

    /* renamed from: i */
    private InterfaceC13267a f34340i;

    /* renamed from: ve.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC13267a {
        /* renamed from: a */
        boolean mo2878a(C13266h c13266h);
    }

    /* renamed from: ve.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13268b implements InterfaceC13267a {
    }

    public C13266h(InterfaceC13267a interfaceC13267a) {
        this.f34340i = interfaceC13267a;
    }

    /* renamed from: a */
    private float m2882a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m2881b((float) Math.toDegrees((float) Math.atan2(f2 - f4, f - f3)), (float) Math.toDegrees((float) Math.atan2(f6 - f8, f5 - f7)));
    }

    /* renamed from: b */
    private float m2881b(float f, float f2) {
        float f3 = (f2 % 360.0f) - (f % 360.0f);
        this.f34338g = f3;
        if (f3 < -180.0f) {
            this.f34338g = f3 + 360.0f;
        } else if (f3 > 180.0f) {
            this.f34338g = f3 - 360.0f;
        }
        return this.f34338g;
    }

    /* renamed from: c */
    public float m2880c() {
        return this.f34338g;
    }

    /* renamed from: d */
    public boolean m2879d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            this.f34337f = -1;
                        }
                    } else {
                        this.f34332a = motionEvent.getX();
                        this.f34333b = motionEvent.getY();
                        this.f34337f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                        this.f34338g = 0.0f;
                        this.f34339h = true;
                    }
                } else if (this.f34336e != -1 && this.f34337f != -1 && motionEvent.getPointerCount() > this.f34337f) {
                    float x = motionEvent.getX(this.f34336e);
                    float y = motionEvent.getY(this.f34336e);
                    float x2 = motionEvent.getX(this.f34337f);
                    float y2 = motionEvent.getY(this.f34337f);
                    if (this.f34339h) {
                        this.f34338g = 0.0f;
                        this.f34339h = false;
                    } else {
                        m2882a(this.f34332a, this.f34333b, this.f34334c, this.f34335d, x2, y2, x, y);
                    }
                    InterfaceC13267a interfaceC13267a = this.f34340i;
                    if (interfaceC13267a != null) {
                        interfaceC13267a.mo2878a(this);
                    }
                    this.f34332a = x2;
                    this.f34333b = y2;
                    this.f34334c = x;
                    this.f34335d = y;
                }
            } else {
                this.f34336e = -1;
            }
        } else {
            this.f34334c = motionEvent.getX();
            this.f34335d = motionEvent.getY();
            this.f34336e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.f34338g = 0.0f;
            this.f34339h = true;
        }
        return true;
    }
}