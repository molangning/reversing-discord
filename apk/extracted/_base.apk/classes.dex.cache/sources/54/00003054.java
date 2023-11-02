package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C0946a;
import re.C12124a;
import re.C12125b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class HorizontalProgressWheelView extends View {

    /* renamed from: j */
    private final Rect f16021j;

    /* renamed from: k */
    private InterfaceC5705a f16022k;

    /* renamed from: l */
    private float f16023l;

    /* renamed from: m */
    private Paint f16024m;

    /* renamed from: n */
    private Paint f16025n;

    /* renamed from: o */
    private int f16026o;

    /* renamed from: p */
    private int f16027p;

    /* renamed from: q */
    private int f16028q;

    /* renamed from: r */
    private boolean f16029r;

    /* renamed from: s */
    private float f16030s;

    /* renamed from: t */
    private int f16031t;

    /* renamed from: com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5705a {
        /* renamed from: a */
        void mo24629a();

        /* renamed from: b */
        void mo24628b();

        /* renamed from: c */
        void mo24627c(float f, float f2);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m24631a() {
        this.f16031t = C0946a.m38401c(getContext(), C12124a.f31443m);
        this.f16026o = getContext().getResources().getDimensionPixelSize(C12125b.f31452i);
        this.f16027p = getContext().getResources().getDimensionPixelSize(C12125b.f31449f);
        this.f16028q = getContext().getResources().getDimensionPixelSize(C12125b.f31450g);
        Paint paint = new Paint(1);
        this.f16024m = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f16024m.setStrokeWidth(this.f16026o);
        this.f16024m.setColor(getResources().getColor(C12124a.f31437g));
        Paint paint2 = new Paint(this.f16024m);
        this.f16025n = paint2;
        paint2.setColor(this.f16031t);
        this.f16025n.setStrokeCap(Paint.Cap.ROUND);
        this.f16025n.setStrokeWidth(getContext().getResources().getDimensionPixelSize(C12125b.f31453j));
    }

    /* renamed from: b */
    private void m24630b(MotionEvent motionEvent, float f) {
        this.f16030s -= f;
        postInvalidate();
        this.f16023l = motionEvent.getX();
        InterfaceC5705a interfaceC5705a = this.f16022k;
        if (interfaceC5705a != null) {
            interfaceC5705a.mo24627c(-f, this.f16030s);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.f16021j);
        int width = this.f16021j.width();
        int i = this.f16026o;
        int i2 = this.f16028q;
        int i3 = width / (i + i2);
        float f = this.f16030s % (i2 + i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i3 / 4;
            if (i4 < i5) {
                this.f16024m.setAlpha((int) ((i4 / i5) * 255.0f));
            } else if (i4 > (i3 * 3) / 4) {
                this.f16024m.setAlpha((int) (((i3 - i4) / i5) * 255.0f));
            } else {
                this.f16024m.setAlpha(255);
            }
            float f2 = -f;
            Rect rect = this.f16021j;
            float f3 = rect.left + f2 + ((this.f16026o + this.f16028q) * i4);
            float centerY = rect.centerY() - (this.f16027p / 4.0f);
            Rect rect2 = this.f16021j;
            canvas.drawLine(f3, centerY, f2 + rect2.left + ((this.f16026o + this.f16028q) * i4), rect2.centerY() + (this.f16027p / 4.0f), this.f16024m);
        }
        canvas.drawLine(this.f16021j.centerX(), this.f16021j.centerY() - (this.f16027p / 2.0f), this.f16021j.centerX(), (this.f16027p / 2.0f) + this.f16021j.centerY(), this.f16025n);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX() - this.f16023l;
                    if (x != 0.0f) {
                        if (!this.f16029r) {
                            this.f16029r = true;
                            InterfaceC5705a interfaceC5705a = this.f16022k;
                            if (interfaceC5705a != null) {
                                interfaceC5705a.mo24628b();
                            }
                        }
                        m24630b(motionEvent, x);
                    }
                }
            } else {
                InterfaceC5705a interfaceC5705a2 = this.f16022k;
                if (interfaceC5705a2 != null) {
                    this.f16029r = false;
                    interfaceC5705a2.mo24629a();
                }
            }
        } else {
            this.f16023l = motionEvent.getX();
        }
        return true;
    }

    public void setMiddleLineColor(int i) {
        this.f16031t = i;
        this.f16025n.setColor(i);
        invalidate();
    }

    public void setScrollingListener(InterfaceC5705a interfaceC5705a) {
        this.f16022k = interfaceC5705a;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16021j = new Rect();
        m24631a();
    }
}