package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C1365w0;
import java.util.ArrayList;
import java.util.List;
import p155ia.C7480b;
import p155ia.C7482d;
import p155ia.C7488j;
import p155ia.C7489k;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ClockHandView extends View {

    /* renamed from: j */
    private ValueAnimator f14149j;

    /* renamed from: k */
    private boolean f14150k;

    /* renamed from: l */
    private float f14151l;

    /* renamed from: m */
    private float f14152m;

    /* renamed from: n */
    private boolean f14153n;

    /* renamed from: o */
    private int f14154o;

    /* renamed from: p */
    private final List<InterfaceC5022c> f14155p;

    /* renamed from: q */
    private final int f14156q;

    /* renamed from: r */
    private final float f14157r;

    /* renamed from: s */
    private final Paint f14158s;

    /* renamed from: t */
    private final RectF f14159t;

    /* renamed from: u */
    private final int f14160u;

    /* renamed from: v */
    private float f14161v;

    /* renamed from: w */
    private boolean f14162w;

    /* renamed from: x */
    private double f14163x;

    /* renamed from: y */
    private int f14164y;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5020a implements ValueAnimator.AnimatorUpdateListener {
        C5020a() {
            ClockHandView.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m26506m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5021b extends AnimatorListenerAdapter {
        C5021b() {
            ClockHandView.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5022c {
        /* renamed from: a */
        void mo26505a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20120w);
    }

    /* renamed from: c */
    private void m26516c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.f14158s.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f14164y * ((float) Math.cos(this.f14163x))) + width2, (this.f14164y * ((float) Math.sin(this.f14163x))) + f, this.f14156q, this.f14158s);
        double sin = Math.sin(this.f14163x);
        double cos = Math.cos(this.f14163x);
        this.f14158s.setStrokeWidth(this.f14160u);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f14158s);
        canvas.drawCircle(width2, f, this.f14157r, this.f14158s);
    }

    /* renamed from: e */
    private int m26514e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    /* renamed from: h */
    private Pair<Float, Float> m26511h(float f) {
        float m26513f = m26513f();
        if (Math.abs(m26513f - f) > 180.0f) {
            if (m26513f > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (m26513f < 180.0f && f > 180.0f) {
                m26513f += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(m26513f), Float.valueOf(f));
    }

    /* renamed from: i */
    private boolean m26510i(float f, float f2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float m26514e = m26514e(f, f2);
        boolean z5 = false;
        if (m26513f() != m26514e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        if (z3 && this.f14150k) {
            z5 = true;
        }
        m26507l(m26514e, z5);
        return true;
    }

    /* renamed from: m */
    public void m26506m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f14161v = f2;
        this.f14163x = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.f14164y * ((float) Math.cos(this.f14163x)));
        float height = (getHeight() / 2) + (this.f14164y * ((float) Math.sin(this.f14163x)));
        RectF rectF = this.f14159t;
        int i = this.f14156q;
        rectF.set(width - i, height - i, width + i, height + i);
        for (InterfaceC5022c interfaceC5022c : this.f14155p) {
            interfaceC5022c.mo26505a(f2, z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void m26517b(InterfaceC5022c interfaceC5022c) {
        this.f14155p.add(interfaceC5022c);
    }

    /* renamed from: d */
    public RectF m26515d() {
        return this.f14159t;
    }

    /* renamed from: f */
    public float m26513f() {
        return this.f14161v;
    }

    /* renamed from: g */
    public int m26512g() {
        return this.f14156q;
    }

    /* renamed from: j */
    public void m26509j(int i) {
        this.f14164y = i;
        invalidate();
    }

    /* renamed from: k */
    public void m26508k(float f) {
        m26507l(f, false);
    }

    /* renamed from: l */
    public void m26507l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f14149j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m26506m(f, false);
            return;
        }
        Pair<Float, Float> m26511h = m26511h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) m26511h.first).floatValue(), ((Float) m26511h.second).floatValue());
        this.f14149j = ofFloat;
        ofFloat.setDuration(200L);
        this.f14149j.addUpdateListener(new C5020a());
        this.f14149j.addListener(new C5021b());
        this.f14149j.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m26516c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m26508k(m26513f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z2 = false;
                z = false;
                z3 = false;
            } else {
                int i = (int) (x - this.f14151l);
                int i2 = (int) (y - this.f14152m);
                if ((i * i) + (i2 * i2) > this.f14154o) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f14153n = z4;
                z2 = this.f14162w;
                if (actionMasked == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z3 = z5;
                z = false;
            }
        } else {
            this.f14151l = x;
            this.f14152m = y;
            this.f14153n = true;
            this.f14162w = false;
            z = true;
            z2 = false;
            z3 = false;
        }
        this.f14162w |= m26510i(x, y, z2, z, z3);
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14155p = new ArrayList();
        Paint paint = new Paint();
        this.f14158s = paint;
        this.f14159t = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20636s1, i, C7488j.f20284u);
        this.f14164y = obtainStyledAttributes.getDimensionPixelSize(C7489k.f20652u1, 0);
        this.f14156q = obtainStyledAttributes.getDimensionPixelSize(C7489k.f20660v1, 0);
        Resources resources = getResources();
        this.f14160u = resources.getDimensionPixelSize(C7482d.f20162k);
        this.f14157r = resources.getDimensionPixelSize(C7482d.f20160i);
        int color = obtainStyledAttributes.getColor(C7489k.f20644t1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m26508k(0.0f);
        this.f14154o = ViewConfiguration.get(context).getScaledTouchSlop();
        C1365w0.m37259A0(this, 2);
        obtainStyledAttributes.recycle();
    }
}