package com.budiyev.android.codescanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* renamed from: com.budiyev.android.codescanner.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C2818o extends View {

    /* renamed from: j */
    private final Paint f7680j;

    /* renamed from: k */
    private final Paint f7681k;

    /* renamed from: l */
    private final Path f7682l;

    /* renamed from: m */
    private C2812l f7683m;

    /* renamed from: n */
    private int f7684n;

    /* renamed from: o */
    private int f7685o;

    /* renamed from: p */
    private float f7686p;

    /* renamed from: q */
    private float f7687q;

    /* renamed from: r */
    private float f7688r;

    /* renamed from: s */
    private float f7689s;

    /* renamed from: t */
    private boolean f7690t;

    /* renamed from: u */
    private boolean f7691u;

    public C2818o(Context context) {
        super(context);
        this.f7684n = 0;
        this.f7685o = 0;
        this.f7686p = 1.0f;
        this.f7687q = 1.0f;
        this.f7688r = 0.75f;
        this.f7689s = 0.5f;
        this.f7690t = true;
        this.f7691u = true;
        Paint paint = new Paint(1);
        this.f7680j = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f7681k = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f7682l = path;
    }

    /* renamed from: k */
    private void m32144k() {
        m32143l(getWidth(), getHeight());
    }

    /* renamed from: l */
    private void m32143l(int i, int i2) {
        int round;
        int round2;
        if (i > 0 && i2 > 0) {
            float f = i;
            float f2 = i2;
            float f3 = this.f7686p / this.f7687q;
            float f4 = this.f7688r;
            if (f / f2 <= f3) {
                round2 = Math.round(f * f4);
                round = Math.round(round2 / f3);
            } else {
                round = Math.round(f2 * f4);
                round2 = Math.round(round * f3);
            }
            int i3 = (i - round2) / 2;
            int round3 = Math.round((i2 - round) * this.f7689s);
            this.f7683m = new C2812l(i3, round3, round2 + i3, round + round3);
        }
    }

    /* renamed from: a */
    public float m32154a() {
        return this.f7687q;
    }

    /* renamed from: b */
    public float m32153b() {
        return this.f7686p;
    }

    /* renamed from: c */
    public int m32152c() {
        return this.f7681k.getColor();
    }

    /* renamed from: d */
    public int m32151d() {
        return this.f7685o;
    }

    /* renamed from: e */
    public int m32150e() {
        return this.f7684n;
    }

    /* renamed from: f */
    public C2812l m32149f() {
        return this.f7683m;
    }

    /* renamed from: g */
    public float m32148g() {
        return this.f7688r;
    }

    /* renamed from: h */
    public int m32147h() {
        return (int) this.f7681k.getStrokeWidth();
    }

    /* renamed from: i */
    public float m32146i() {
        return this.f7689s;
    }

    /* renamed from: j */
    public int m32145j() {
        return this.f7680j.getColor();
    }

    /* renamed from: m */
    public void m32142m(float f, float f2) {
        this.f7686p = f;
        this.f7687q = f2;
        m32144k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: n */
    public void m32141n(float f) {
        this.f7687q = f;
        m32144k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: o */
    public void m32140o(float f) {
        this.f7686p = f;
        m32144k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C2812l c2812l = this.f7683m;
        if (c2812l == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float m32180g = c2812l.m32180g();
        float m32182e = c2812l.m32182e();
        float m32181f = c2812l.m32181f();
        float m32184c = c2812l.m32184c();
        float f = this.f7684n;
        float f2 = this.f7685o;
        boolean z = this.f7690t;
        boolean z2 = this.f7691u;
        Path path = this.f7682l;
        if (f2 > 0.0f) {
            float min = Math.min(f2, Math.max(f - 1.0f, 0.0f));
            if (z) {
                path.reset();
                float f3 = m32180g + min;
                path.moveTo(m32182e, f3);
                float f4 = m32182e + min;
                path.quadTo(m32182e, m32180g, f4, m32180g);
                float f5 = m32181f - min;
                path.lineTo(f5, m32180g);
                path.quadTo(m32181f, m32180g, m32181f, f3);
                float f6 = m32184c - min;
                path.lineTo(m32181f, f6);
                path.quadTo(m32181f, m32184c, f5, m32184c);
                path.lineTo(f4, m32184c);
                path.quadTo(m32182e, m32184c, m32182e, f6);
                path.lineTo(m32182e, f3);
                path.moveTo(0.0f, 0.0f);
                float f7 = width;
                path.lineTo(f7, 0.0f);
                float f8 = height;
                path.lineTo(f7, f8);
                path.lineTo(0.0f, f8);
                path.lineTo(0.0f, 0.0f);
                canvas.drawPath(path, this.f7680j);
            }
            if (z2) {
                path.reset();
                float f9 = m32180g + f;
                path.moveTo(m32182e, f9);
                float f10 = m32180g + min;
                path.lineTo(m32182e, f10);
                float f11 = m32182e + min;
                path.quadTo(m32182e, m32180g, f11, m32180g);
                float f12 = m32182e + f;
                path.lineTo(f12, m32180g);
                float f13 = m32181f - f;
                path.moveTo(f13, m32180g);
                float f14 = m32181f - min;
                path.lineTo(f14, m32180g);
                path.quadTo(m32181f, m32180g, m32181f, f10);
                path.lineTo(m32181f, f9);
                float f15 = m32184c - f;
                path.moveTo(m32181f, f15);
                float f16 = m32184c - min;
                path.lineTo(m32181f, f16);
                path.quadTo(m32181f, m32184c, f14, m32184c);
                path.lineTo(f13, m32184c);
                path.moveTo(f12, m32184c);
                path.lineTo(f11, m32184c);
                path.quadTo(m32182e, m32184c, m32182e, f16);
                path.lineTo(m32182e, f15);
                canvas.drawPath(path, this.f7681k);
                return;
            }
            return;
        }
        if (z) {
            path.reset();
            path.moveTo(m32182e, m32180g);
            path.lineTo(m32181f, m32180g);
            path.lineTo(m32181f, m32184c);
            path.lineTo(m32182e, m32184c);
            path.lineTo(m32182e, m32180g);
            path.moveTo(0.0f, 0.0f);
            float f17 = width;
            path.lineTo(f17, 0.0f);
            float f18 = height;
            path.lineTo(f17, f18);
            path.lineTo(0.0f, f18);
            path.lineTo(0.0f, 0.0f);
            canvas.drawPath(path, this.f7680j);
        }
        if (z2) {
            path.reset();
            float f19 = m32180g + f;
            path.moveTo(m32182e, f19);
            path.lineTo(m32182e, m32180g);
            float f20 = m32182e + f;
            path.lineTo(f20, m32180g);
            float f21 = m32181f - f;
            path.moveTo(f21, m32180g);
            path.lineTo(m32181f, m32180g);
            path.lineTo(m32181f, f19);
            float f22 = m32184c - f;
            path.moveTo(m32181f, f22);
            path.lineTo(m32181f, m32184c);
            path.lineTo(f21, m32184c);
            path.moveTo(f20, m32184c);
            path.lineTo(m32182e, m32184c);
            path.lineTo(m32182e, f22);
            canvas.drawPath(path, this.f7681k);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m32143l(i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m32143l(getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: p */
    public void m32139p(int i) {
        this.f7681k.setColor(i);
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: q */
    public void m32138q(boolean z) {
        Paint.Cap cap;
        Paint paint = this.f7681k;
        if (z) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        invalidate();
    }

    /* renamed from: r */
    public void m32137r(int i) {
        this.f7685o = i;
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: s */
    public void m32136s(int i) {
        this.f7684n = i;
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: t */
    public void m32135t(float f) {
        this.f7688r = f;
        m32144k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: u */
    public void m32134u(int i) {
        this.f7681k.setStrokeWidth(i);
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: v */
    public void m32133v(float f) {
        this.f7689s = f;
        m32144k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: w */
    public void m32132w(boolean z) {
        this.f7691u = z;
    }

    /* renamed from: x */
    public void m32131x(int i) {
        this.f7680j.setColor(i);
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: y */
    public void m32130y(boolean z) {
        this.f7690t = z;
        if (isLaidOut()) {
            invalidate();
        }
    }
}