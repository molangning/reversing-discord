package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import re.C12124a;
import re.C12125b;
import re.C12131h;
import se.InterfaceC12463d;
import ve.C13265g;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class OverlayView extends View {

    /* renamed from: A */
    private Paint f15936A;

    /* renamed from: B */
    private Paint f15937B;

    /* renamed from: C */
    private int f15938C;

    /* renamed from: D */
    private float f15939D;

    /* renamed from: E */
    private float f15940E;

    /* renamed from: F */
    private int f15941F;

    /* renamed from: G */
    private int f15942G;

    /* renamed from: H */
    private int f15943H;

    /* renamed from: I */
    private int f15944I;

    /* renamed from: J */
    private InterfaceC12463d f15945J;

    /* renamed from: K */
    private boolean f15946K;

    /* renamed from: j */
    private final RectF f15947j;

    /* renamed from: k */
    private final RectF f15948k;

    /* renamed from: l */
    protected int f15949l;

    /* renamed from: m */
    protected int f15950m;

    /* renamed from: n */
    protected float[] f15951n;

    /* renamed from: o */
    protected float[] f15952o;

    /* renamed from: p */
    private int f15953p;

    /* renamed from: q */
    private int f15954q;

    /* renamed from: r */
    private float f15955r;

    /* renamed from: s */
    private float[] f15956s;

    /* renamed from: t */
    private boolean f15957t;

    /* renamed from: u */
    private boolean f15958u;

    /* renamed from: v */
    private boolean f15959v;

    /* renamed from: w */
    private int f15960w;

    /* renamed from: x */
    private Path f15961x;

    /* renamed from: y */
    private Paint f15962y;

    /* renamed from: z */
    private Paint f15963z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private int m24681c(float f, float f2) {
        double d = this.f15942G;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double sqrt = Math.sqrt(Math.pow(f - this.f15951n[i2], 2.0d) + Math.pow(f2 - this.f15951n[i2 + 1], 2.0d));
            if (sqrt < d) {
                i = i2 / 2;
                d = sqrt;
            }
        }
        if (this.f15938C == 1 && i < 0 && this.f15947j.contains(f, f2)) {
            return 4;
        }
        return i;
    }

    /* renamed from: e */
    private void m24679e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C12131h.f31519a0, getResources().getDimensionPixelSize(C12125b.f31444a));
        int color = typedArray.getColor(C12131h.f31517Z, getResources().getColor(C12124a.f31433c));
        this.f15936A.setStrokeWidth(dimensionPixelSize);
        this.f15936A.setColor(color);
        this.f15936A.setStyle(Paint.Style.STROKE);
        this.f15937B.setStrokeWidth(dimensionPixelSize * 3);
        this.f15937B.setColor(color);
        this.f15937B.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: f */
    private void m24678f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C12131h.f31527e0, getResources().getDimensionPixelSize(C12125b.f31445b));
        int color = typedArray.getColor(C12131h.f31521b0, getResources().getColor(C12124a.f31434d));
        this.f15963z.setStrokeWidth(dimensionPixelSize);
        this.f15963z.setColor(color);
        this.f15953p = typedArray.getInt(C12131h.f31525d0, 2);
        this.f15954q = typedArray.getInt(C12131h.f31523c0, 2);
    }

    /* renamed from: i */
    private void m24675i(float f, float f2) {
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        this.f15948k.set(this.f15947j);
        int i = this.f15941F;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.f15948k.offset(f - this.f15939D, f2 - this.f15940E);
                            if (this.f15948k.left > getLeft() && this.f15948k.top > getTop() && this.f15948k.right < getRight() && this.f15948k.bottom < getBottom()) {
                                this.f15947j.set(this.f15948k);
                                m24674j();
                                postInvalidate();
                                return;
                            }
                            return;
                        }
                    } else {
                        RectF rectF = this.f15948k;
                        RectF rectF2 = this.f15947j;
                        rectF.set(f, rectF2.top, rectF2.right, f2);
                    }
                } else {
                    RectF rectF3 = this.f15948k;
                    RectF rectF4 = this.f15947j;
                    rectF3.set(rectF4.left, rectF4.top, f, f2);
                }
            } else {
                RectF rectF5 = this.f15948k;
                RectF rectF6 = this.f15947j;
                rectF5.set(rectF6.left, f2, f, rectF6.bottom);
            }
        } else {
            RectF rectF7 = this.f15948k;
            RectF rectF8 = this.f15947j;
            rectF7.set(f, f2, rectF8.right, rectF8.bottom);
        }
        if (this.f15948k.height() >= this.f15943H) {
            z = true;
        } else {
            z = false;
        }
        if (this.f15948k.width() < this.f15943H) {
            z2 = false;
        }
        RectF rectF9 = this.f15947j;
        if (z2) {
            f3 = this.f15948k.left;
        } else {
            f3 = rectF9.left;
        }
        if (z) {
            f4 = this.f15948k.top;
        } else {
            f4 = rectF9.top;
        }
        if (z2) {
            f5 = this.f15948k.right;
        } else {
            f5 = rectF9.right;
        }
        if (z) {
            f6 = this.f15948k.bottom;
        } else {
            f6 = rectF9.bottom;
        }
        rectF9.set(f3, f4, f5, f6);
        if (z || z2) {
            m24674j();
            postInvalidate();
        }
    }

    /* renamed from: j */
    private void m24674j() {
        this.f15951n = C13265g.m2885b(this.f15947j);
        this.f15952o = C13265g.m2886a(this.f15947j);
        this.f15956s = null;
        this.f15961x.reset();
        this.f15961x.addCircle(this.f15947j.centerX(), this.f15947j.centerY(), Math.min(this.f15947j.width(), this.f15947j.height()) / 2.0f, Path.Direction.CW);
    }

    /* renamed from: a */
    protected void m24683a(Canvas canvas) {
        int i;
        int i2;
        if (this.f15958u) {
            if (this.f15956s == null && !this.f15947j.isEmpty()) {
                this.f15956s = new float[(this.f15953p * 4) + (this.f15954q * 4)];
                int i3 = 0;
                for (int i4 = 0; i4 < this.f15953p; i4++) {
                    float[] fArr = this.f15956s;
                    int i5 = i3 + 1;
                    RectF rectF = this.f15947j;
                    fArr[i3] = rectF.left;
                    int i6 = i5 + 1;
                    float f = i4 + 1.0f;
                    float height = rectF.height() * (f / (this.f15953p + 1));
                    RectF rectF2 = this.f15947j;
                    fArr[i5] = height + rectF2.top;
                    float[] fArr2 = this.f15956s;
                    int i7 = i6 + 1;
                    fArr2[i6] = rectF2.right;
                    i3 = i7 + 1;
                    fArr2[i7] = (rectF2.height() * (f / (this.f15953p + 1))) + this.f15947j.top;
                }
                for (int i8 = 0; i8 < this.f15954q; i8++) {
                    float[] fArr3 = this.f15956s;
                    int i9 = i3 + 1;
                    float f2 = i8 + 1.0f;
                    float width = this.f15947j.width() * (f2 / (this.f15954q + 1));
                    RectF rectF3 = this.f15947j;
                    fArr3[i3] = width + rectF3.left;
                    float[] fArr4 = this.f15956s;
                    int i10 = i9 + 1;
                    fArr4[i9] = rectF3.top;
                    int i11 = i10 + 1;
                    float width2 = rectF3.width() * (f2 / (this.f15954q + 1));
                    RectF rectF4 = this.f15947j;
                    fArr4[i10] = width2 + rectF4.left;
                    i3 = i11 + 1;
                    this.f15956s[i11] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f15956s;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f15963z);
            }
        }
        if (this.f15957t) {
            canvas.drawRect(this.f15947j, this.f15936A);
        }
        if (this.f15938C != 0) {
            canvas.save();
            this.f15948k.set(this.f15947j);
            this.f15948k.inset(this.f15944I, -i);
            canvas.clipRect(this.f15948k, Region.Op.DIFFERENCE);
            this.f15948k.set(this.f15947j);
            this.f15948k.inset(-i2, this.f15944I);
            canvas.clipRect(this.f15948k, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f15947j, this.f15937B);
            canvas.restore();
        }
    }

    /* renamed from: b */
    protected void m24682b(Canvas canvas) {
        canvas.save();
        if (this.f15959v) {
            canvas.clipPath(this.f15961x, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f15947j, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f15960w);
        canvas.restore();
        if (this.f15959v) {
            canvas.drawCircle(this.f15947j.centerX(), this.f15947j.centerY(), Math.min(this.f15947j.width(), this.f15947j.height()) / 2.0f, this.f15962y);
        }
    }

    /* renamed from: d */
    protected void m24680d() {
    }

    /* renamed from: g */
    public void m24677g(TypedArray typedArray) {
        this.f15959v = typedArray.getBoolean(C12131h.f31515X, false);
        int color = typedArray.getColor(C12131h.f31516Y, getResources().getColor(C12124a.f31435e));
        this.f15960w = color;
        this.f15962y.setColor(color);
        this.f15962y.setStyle(Paint.Style.STROKE);
        this.f15962y.setStrokeWidth(1.0f);
        m24679e(typedArray);
        this.f15957t = typedArray.getBoolean(C12131h.f31529f0, true);
        m24678f(typedArray);
        this.f15958u = typedArray.getBoolean(C12131h.f31531g0, true);
    }

    public RectF getCropViewRect() {
        return this.f15947j;
    }

    public int getFreestyleCropMode() {
        return this.f15938C;
    }

    public InterfaceC12463d getOverlayViewChangeListener() {
        return this.f15945J;
    }

    /* renamed from: h */
    public void m24676h() {
        int i = this.f15949l;
        float f = this.f15955r;
        int i2 = (int) (i / f);
        int i3 = this.f15950m;
        if (i2 > i3) {
            int i4 = (int) (i3 * f);
            int i5 = (i - i4) / 2;
            this.f15947j.set(getPaddingLeft() + i5, getPaddingTop(), getPaddingLeft() + i4 + i5, getPaddingTop() + this.f15950m);
        } else {
            int i6 = (i3 - i2) / 2;
            this.f15947j.set(getPaddingLeft(), getPaddingTop() + i6, getPaddingLeft() + this.f15949l, getPaddingTop() + i2 + i6);
        }
        InterfaceC12463d interfaceC12463d = this.f15945J;
        if (interfaceC12463d != null) {
            interfaceC12463d.mo5216a(this.f15947j);
        }
        m24674j();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m24682b(canvas);
        m24683a(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f15949l = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f15950m = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.f15946K) {
                this.f15946K = false;
                setTargetAspectRatio(this.f15955r);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f15947j.isEmpty() && this.f15938C != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int m24681c = m24681c(x, y);
                this.f15941F = m24681c;
                if (m24681c != -1) {
                    z = true;
                }
                if (!z) {
                    this.f15939D = -1.0f;
                    this.f15940E = -1.0f;
                } else if (this.f15939D < 0.0f) {
                    this.f15939D = x;
                    this.f15940E = y;
                }
                return z;
            } else if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.f15941F != -1) {
                float min = Math.min(Math.max(x, getPaddingLeft()), getWidth() - getPaddingRight());
                float min2 = Math.min(Math.max(y, getPaddingTop()), getHeight() - getPaddingBottom());
                m24675i(min, min2);
                this.f15939D = min;
                this.f15940E = min2;
                return true;
            } else if ((motionEvent.getAction() & 255) == 1) {
                this.f15939D = -1.0f;
                this.f15940E = -1.0f;
                this.f15941F = -1;
                InterfaceC12463d interfaceC12463d = this.f15945J;
                if (interfaceC12463d != null) {
                    interfaceC12463d.mo5216a(this.f15947j);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z) {
        this.f15959v = z;
    }

    public void setCropFrameColor(int i) {
        this.f15936A.setColor(i);
    }

    public void setCropFrameStrokeWidth(int i) {
        this.f15936A.setStrokeWidth(i);
    }

    public void setCropGridColor(int i) {
        this.f15963z.setColor(i);
    }

    public void setCropGridColumnCount(int i) {
        this.f15954q = i;
        this.f15956s = null;
    }

    public void setCropGridCornerColor(int i) {
        this.f15937B.setColor(i);
    }

    public void setCropGridRowCount(int i) {
        this.f15953p = i;
        this.f15956s = null;
    }

    public void setCropGridStrokeWidth(int i) {
        this.f15963z.setStrokeWidth(i);
    }

    public void setDimmedColor(int i) {
        this.f15960w = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.f15938C = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.f15938C = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(InterfaceC12463d interfaceC12463d) {
        this.f15945J = interfaceC12463d;
    }

    public void setShowCropFrame(boolean z) {
        this.f15957t = z;
    }

    public void setShowCropGrid(boolean z) {
        this.f15958u = z;
    }

    public void setTargetAspectRatio(float f) {
        this.f15955r = f;
        if (this.f15949l > 0) {
            m24676h();
            postInvalidate();
            return;
        }
        this.f15946K = true;
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15947j = new RectF();
        this.f15948k = new RectF();
        this.f15956s = null;
        this.f15961x = new Path();
        this.f15962y = new Paint(1);
        this.f15963z = new Paint(1);
        this.f15936A = new Paint(1);
        this.f15937B = new Paint(1);
        this.f15938C = 0;
        this.f15939D = -1.0f;
        this.f15940E = -1.0f;
        this.f15941F = -1;
        this.f15942G = getResources().getDimensionPixelSize(C12125b.f31447d);
        this.f15943H = getResources().getDimensionPixelSize(C12125b.f31448e);
        this.f15944I = getResources().getDimensionPixelSize(C12125b.f31446c);
        m24680d();
    }
}