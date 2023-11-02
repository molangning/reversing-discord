package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import ve.C13266h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class GestureCropImageView extends C5699a {

    /* renamed from: K */
    private ScaleGestureDetector f15925K;

    /* renamed from: L */
    private C13266h f15926L;

    /* renamed from: M */
    private GestureDetector f15927M;

    /* renamed from: N */
    private float f15928N;

    /* renamed from: O */
    private float f15929O;

    /* renamed from: P */
    private boolean f15930P;

    /* renamed from: Q */
    private boolean f15931Q;

    /* renamed from: R */
    private int f15932R;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5694b extends GestureDetector.SimpleOnGestureListener {
        private C5694b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.m24669B(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.m24643m(-f, -f2);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5695c extends C13266h.C13268b {
        private C5695c() {
        }

        @Override // ve.C13266h.InterfaceC13267a
        /* renamed from: a */
        public boolean mo2878a(C13266h c13266h) {
            GestureCropImageView.this.m24645k(c13266h.m2880c(), GestureCropImageView.this.f15928N, GestureCropImageView.this.f15929O);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5696d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C5696d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.mo24644l(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.f15928N, GestureCropImageView.this.f15929O);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: I */
    private void m24684I() {
        this.f15927M = new GestureDetector(getContext(), new C5694b(), null, true);
        this.f15925K = new ScaleGestureDetector(getContext(), new C5696d());
        this.f15926L = new C13266h(new C5695c());
    }

    public int getDoubleTapScaleSteps() {
        return this.f15932R;
    }

    protected float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.f15932R));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yalantis.ucrop.view.C5702b
    /* renamed from: i */
    public void mo24647i() {
        super.mo24647i();
        m24684I();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            m24660t();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f15928N = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.f15929O = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        this.f15927M.onTouchEvent(motionEvent);
        if (this.f15931Q) {
            this.f15925K.onTouchEvent(motionEvent);
        }
        if (this.f15930P) {
            this.f15926L.m2879d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            m24654z();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.f15932R = i;
    }

    public void setRotateEnabled(boolean z) {
        this.f15930P = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f15931Q = z;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15930P = true;
        this.f15931Q = true;
        this.f15932R = 5;
    }
}
