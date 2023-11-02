package p132h8;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p132h8.C7027a;

/* renamed from: h8.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class View$OnTouchListenerC7038i extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C7027a.InterfaceC7028a {

    /* renamed from: l */
    private final InterfaceC7039a f19291l;

    /* renamed from: m */
    private final float f19292m;

    /* renamed from: n */
    private final GestureDetector f19293n;

    /* renamed from: p */
    private InterfaceC7033e f19295p;

    /* renamed from: j */
    private final PointF f19289j = new PointF();

    /* renamed from: k */
    private final PointF f19290k = new PointF();

    /* renamed from: o */
    private volatile float f19294o = 3.1415927f;

    /* renamed from: h8.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    interface InterfaceC7039a {
        /* renamed from: b */
        void mo21489b(PointF pointF);
    }

    public View$OnTouchListenerC7038i(Context context, InterfaceC7039a interfaceC7039a, float f) {
        this.f19291l = interfaceC7039a;
        this.f19292m = f;
        this.f19293n = new GestureDetector(context, this);
    }

    @Override // p132h8.C7027a.InterfaceC7028a
    /* renamed from: a */
    public void mo21491a(float[] fArr, float f) {
        this.f19294o = -f;
    }

    /* renamed from: b */
    public void m21490b(InterfaceC7033e interfaceC7033e) {
        this.f19295p = interfaceC7033e;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f19289j.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f19289j.x) / this.f19292m;
        float y = motionEvent2.getY();
        PointF pointF = this.f19289j;
        float f3 = (y - pointF.y) / this.f19292m;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f19294o;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f19290k;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = pointF2.y + (sin * x) + (cos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.f19291l.mo21489b(this.f19290k);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        InterfaceC7033e interfaceC7033e = this.f19295p;
        if (interfaceC7033e != null) {
            return interfaceC7033e.onSingleTapUp(motionEvent);
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f19293n.onTouchEvent(motionEvent);
    }
}
