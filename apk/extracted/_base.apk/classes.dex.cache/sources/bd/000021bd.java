package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p394w2.C13379j;

/* renamed from: com.facebook.drawee.drawable.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3619k extends C3614f implements InterfaceC3617i {

    /* renamed from: j */
    EnumC3621b f9901j;

    /* renamed from: k */
    private final RectF f9902k;

    /* renamed from: l */
    private RectF f9903l;

    /* renamed from: m */
    private Matrix f9904m;

    /* renamed from: n */
    private final float[] f9905n;

    /* renamed from: o */
    final float[] f9906o;

    /* renamed from: p */
    final Paint f9907p;

    /* renamed from: q */
    private boolean f9908q;

    /* renamed from: r */
    private float f9909r;

    /* renamed from: s */
    private int f9910s;

    /* renamed from: t */
    private int f9911t;

    /* renamed from: u */
    private float f9912u;

    /* renamed from: v */
    private boolean f9913v;

    /* renamed from: w */
    private boolean f9914w;

    /* renamed from: x */
    private final Path f9915x;

    /* renamed from: y */
    private final Path f9916y;

    /* renamed from: z */
    private final RectF f9917z;

    /* renamed from: com.facebook.drawee.drawable.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C3620a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9918a;

        static {
            int[] iArr = new int[EnumC3621b.values().length];
            f9918a = iArr;
            try {
                iArr[EnumC3621b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9918a[EnumC3621b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.facebook.drawee.drawable.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3621b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public C3619k(Drawable drawable) {
        super((Drawable) C13379j.m2677g(drawable));
        this.f9901j = EnumC3621b.OVERLAY_COLOR;
        this.f9902k = new RectF();
        this.f9905n = new float[8];
        this.f9906o = new float[8];
        this.f9907p = new Paint(1);
        this.f9908q = false;
        this.f9909r = 0.0f;
        this.f9910s = 0;
        this.f9911t = 0;
        this.f9912u = 0.0f;
        this.f9913v = false;
        this.f9914w = false;
        this.f9915x = new Path();
        this.f9916y = new Path();
        this.f9917z = new RectF();
    }

    /* renamed from: j */
    private void m31500j() {
        float[] fArr;
        this.f9915x.reset();
        this.f9916y.reset();
        this.f9917z.set(getBounds());
        RectF rectF = this.f9917z;
        float f = this.f9912u;
        rectF.inset(f, f);
        if (this.f9901j == EnumC3621b.OVERLAY_COLOR) {
            this.f9915x.addRect(this.f9917z, Path.Direction.CW);
        }
        if (this.f9908q) {
            this.f9915x.addCircle(this.f9917z.centerX(), this.f9917z.centerY(), Math.min(this.f9917z.width(), this.f9917z.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f9915x.addRoundRect(this.f9917z, this.f9905n, Path.Direction.CW);
        }
        RectF rectF2 = this.f9917z;
        float f2 = this.f9912u;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f9917z;
        float f3 = this.f9909r;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f9908q) {
            this.f9916y.addCircle(this.f9917z.centerX(), this.f9917z.centerY(), Math.min(this.f9917z.width(), this.f9917z.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f9906o;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f9905n[i] + this.f9912u) - (this.f9909r / 2.0f);
                i++;
            }
            this.f9916y.addRoundRect(this.f9917z, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f9917z;
        float f4 = this.f9909r;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: a */
    public void mo31499a(boolean z) {
        this.f9908q = z;
        m31500j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: b */
    public void mo31498b(float f) {
        this.f9912u = f;
        m31500j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: c */
    public void mo31497c(float f) {
        Arrays.fill(this.f9905n, f);
        m31500j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: d */
    public void mo31496d(boolean z) {
        if (this.f9914w != z) {
            this.f9914w = z;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f9902k.set(getBounds());
        int i = C3620a.f9918a[this.f9901j.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.f9913v) {
                    RectF rectF = this.f9903l;
                    if (rectF == null) {
                        this.f9903l = new RectF(this.f9902k);
                        this.f9904m = new Matrix();
                    } else {
                        rectF.set(this.f9902k);
                    }
                    RectF rectF2 = this.f9903l;
                    float f = this.f9909r;
                    rectF2.inset(f, f);
                    this.f9904m.setRectToRect(this.f9902k, this.f9903l, Matrix.ScaleToFit.FILL);
                    int save = canvas.save();
                    canvas.clipRect(this.f9902k);
                    canvas.concat(this.f9904m);
                    super.draw(canvas);
                    canvas.restoreToCount(save);
                } else {
                    super.draw(canvas);
                }
                this.f9907p.setStyle(Paint.Style.FILL);
                this.f9907p.setColor(this.f9911t);
                this.f9907p.setStrokeWidth(0.0f);
                this.f9907p.setFilterBitmap(m31502h());
                this.f9915x.setFillType(Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f9915x, this.f9907p);
                if (this.f9908q) {
                    float width = ((this.f9902k.width() - this.f9902k.height()) + this.f9909r) / 2.0f;
                    float height = ((this.f9902k.height() - this.f9902k.width()) + this.f9909r) / 2.0f;
                    if (width > 0.0f) {
                        RectF rectF3 = this.f9902k;
                        float f2 = rectF3.left;
                        canvas.drawRect(f2, rectF3.top, f2 + width, rectF3.bottom, this.f9907p);
                        RectF rectF4 = this.f9902k;
                        float f3 = rectF4.right;
                        canvas.drawRect(f3 - width, rectF4.top, f3, rectF4.bottom, this.f9907p);
                    }
                    if (height > 0.0f) {
                        RectF rectF5 = this.f9902k;
                        float f4 = rectF5.left;
                        float f5 = rectF5.top;
                        canvas.drawRect(f4, f5, rectF5.right, f5 + height, this.f9907p);
                        RectF rectF6 = this.f9902k;
                        float f6 = rectF6.left;
                        float f7 = rectF6.bottom;
                        canvas.drawRect(f6, f7 - height, rectF6.right, f7, this.f9907p);
                    }
                }
            }
        } else {
            int save2 = canvas.save();
            canvas.clipPath(this.f9915x);
            super.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.f9910s != 0) {
            this.f9907p.setStyle(Paint.Style.STROKE);
            this.f9907p.setColor(this.f9910s);
            this.f9907p.setStrokeWidth(this.f9909r);
            this.f9915x.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f9916y, this.f9907p);
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: e */
    public void mo31495e(boolean z) {
        this.f9913v = z;
        m31500j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    /* renamed from: g */
    public void mo31493g(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f9905n, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13379j.m2681c(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f9905n, 0, 8);
        }
        m31500j();
        invalidateSelf();
    }

    /* renamed from: h */
    public boolean m31502h() {
        return this.f9914w;
    }

    /* renamed from: i */
    public void m31501i(int i) {
        this.f9911t = i;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m31500j();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3617i
    public void setBorder(int i, float f) {
        this.f9910s = i;
        this.f9909r = f;
        m31500j();
        invalidateSelf();
    }
}