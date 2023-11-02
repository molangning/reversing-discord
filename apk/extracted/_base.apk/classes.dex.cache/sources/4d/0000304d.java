package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.yalantis.ucrop.task.BitmapCropTask;
import com.yalantis.ucrop.view.C5702b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p354te.C12669b;
import p354te.C12671d;
import re.C12131h;
import se.InterfaceC12460a;
import se.InterfaceC12462c;
import ve.C13257b;
import ve.C13265g;

/* renamed from: com.yalantis.ucrop.view.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5699a extends C5702b {

    /* renamed from: A */
    private float f15968A;

    /* renamed from: B */
    private float f15969B;

    /* renamed from: C */
    private InterfaceC12462c f15970C;

    /* renamed from: D */
    private Runnable f15971D;

    /* renamed from: E */
    private Runnable f15972E;

    /* renamed from: F */
    private float f15973F;

    /* renamed from: G */
    private float f15974G;

    /* renamed from: H */
    private int f15975H;

    /* renamed from: I */
    private int f15976I;

    /* renamed from: J */
    private long f15977J;

    /* renamed from: y */
    private final RectF f15978y;

    /* renamed from: z */
    private final Matrix f15979z;

    /* renamed from: com.yalantis.ucrop.view.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class RunnableC5700a implements Runnable {

        /* renamed from: j */
        private final WeakReference<C5699a> f15980j;

        /* renamed from: k */
        private final long f15981k;

        /* renamed from: l */
        private final long f15982l = System.currentTimeMillis();

        /* renamed from: m */
        private final float f15983m;

        /* renamed from: n */
        private final float f15984n;

        /* renamed from: o */
        private final float f15985o;

        /* renamed from: p */
        private final float f15986p;

        /* renamed from: q */
        private final float f15987q;

        /* renamed from: r */
        private final float f15988r;

        /* renamed from: s */
        private final boolean f15989s;

        public RunnableC5700a(C5699a c5699a, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f15980j = new WeakReference<>(c5699a);
            this.f15981k = j;
            this.f15983m = f;
            this.f15984n = f2;
            this.f15985o = f3;
            this.f15986p = f4;
            this.f15987q = f5;
            this.f15988r = f6;
            this.f15989s = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5699a c5699a = this.f15980j.get();
            if (c5699a == null) {
                return;
            }
            float min = (float) Math.min(this.f15981k, System.currentTimeMillis() - this.f15982l);
            float m2907b = C13257b.m2907b(min, 0.0f, this.f15985o, (float) this.f15981k);
            float m2907b2 = C13257b.m2907b(min, 0.0f, this.f15986p, (float) this.f15981k);
            float m2908a = C13257b.m2908a(min, 0.0f, this.f15988r, (float) this.f15981k);
            if (min < ((float) this.f15981k)) {
                float[] fArr = c5699a.f15998k;
                c5699a.m24643m(m2907b - (fArr[0] - this.f15983m), m2907b2 - (fArr[1] - this.f15984n));
                if (!this.f15989s) {
                    c5699a.m24667D(this.f15987q + m2908a, c5699a.f15978y.centerX(), c5699a.f15978y.centerY());
                }
                if (!c5699a.m24658v()) {
                    c5699a.post(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class RunnableC5701b implements Runnable {

        /* renamed from: j */
        private final WeakReference<C5699a> f15990j;

        /* renamed from: k */
        private final long f15991k;

        /* renamed from: l */
        private final long f15992l = System.currentTimeMillis();

        /* renamed from: m */
        private final float f15993m;

        /* renamed from: n */
        private final float f15994n;

        /* renamed from: o */
        private final float f15995o;

        /* renamed from: p */
        private final float f15996p;

        public RunnableC5701b(C5699a c5699a, long j, float f, float f2, float f3, float f4) {
            this.f15990j = new WeakReference<>(c5699a);
            this.f15991k = j;
            this.f15993m = f;
            this.f15994n = f2;
            this.f15995o = f3;
            this.f15996p = f4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5699a c5699a = this.f15990j.get();
            if (c5699a == null) {
                return;
            }
            float min = (float) Math.min(this.f15991k, System.currentTimeMillis() - this.f15992l);
            float m2908a = C13257b.m2908a(min, 0.0f, this.f15994n, (float) this.f15991k);
            if (min < ((float) this.f15991k)) {
                c5699a.m24667D(this.f15993m + m2908a, this.f15995o, this.f15996p);
                c5699a.post(this);
                return;
            }
            c5699a.m24654z();
        }
    }

    public C5699a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private void m24670A(float f, float f2) {
        float width = this.f15978y.width();
        float height = this.f15978y.height();
        float max = Math.max(this.f15978y.width() / f, this.f15978y.height() / f2);
        RectF rectF = this.f15978y;
        float f3 = ((height - (f2 * max)) / 2.0f) + rectF.top;
        this.f16000m.reset();
        this.f16000m.postScale(max, max);
        this.f16000m.postTranslate(((width - (f * max)) / 2.0f) + rectF.left, f3);
        setImageMatrix(this.f16000m);
    }

    /* renamed from: q */
    private float[] m24663q() {
        this.f15979z.reset();
        this.f15979z.setRotate(-getCurrentAngle());
        float[] fArr = this.f15997j;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] m2885b = C13265g.m2885b(this.f15978y);
        this.f15979z.mapPoints(copyOf);
        this.f15979z.mapPoints(m2885b);
        RectF m2883d = C13265g.m2883d(copyOf);
        RectF m2883d2 = C13265g.m2883d(m2885b);
        float f = m2883d.left - m2883d2.left;
        float f2 = m2883d.top - m2883d2.top;
        float f3 = m2883d.right - m2883d2.right;
        float f4 = m2883d.bottom - m2883d2.bottom;
        float[] fArr2 = new float[4];
        if (f <= 0.0f) {
            f = 0.0f;
        }
        fArr2[0] = f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        fArr2[1] = f2;
        if (f3 >= 0.0f) {
            f3 = 0.0f;
        }
        fArr2[2] = f3;
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        fArr2[3] = f4;
        this.f15979z.reset();
        this.f15979z.setRotate(getCurrentAngle());
        this.f15979z.mapPoints(fArr2);
        return fArr2;
    }

    /* renamed from: r */
    private void m24662r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        m24661s(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* renamed from: s */
    private void m24661s(float f, float f2) {
        float min = Math.min(Math.min(this.f15978y.width() / f, this.f15978y.width() / f2), Math.min(this.f15978y.height() / f2, this.f15978y.height() / f));
        this.f15974G = min;
        this.f15973F = min * this.f15969B;
    }

    /* renamed from: B */
    public void m24669B(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        RunnableC5701b runnableC5701b = new RunnableC5701b(this, j, currentScale, f - currentScale, f2, f3);
        this.f15972E = runnableC5701b;
        post(runnableC5701b);
    }

    /* renamed from: C */
    public void m24668C(float f) {
        m24667D(f, this.f15978y.centerX(), this.f15978y.centerY());
    }

    /* renamed from: D */
    public void m24667D(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            mo24644l(f / getCurrentScale(), f2, f3);
        }
    }

    /* renamed from: E */
    public void m24666E(float f) {
        m24665F(f, this.f15978y.centerX(), this.f15978y.centerY());
    }

    /* renamed from: F */
    public void m24665F(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            mo24644l(f / getCurrentScale(), f2, f3);
        }
    }

    public InterfaceC12462c getCropBoundsChangeListener() {
        return this.f15970C;
    }

    public float getMaxScale() {
        return this.f15973F;
    }

    public float getMinScale() {
        return this.f15974G;
    }

    public float getTargetAspectRatio() {
        return this.f15968A;
    }

    @Override // com.yalantis.ucrop.view.C5702b
    /* renamed from: j */
    public void mo24646j() {
        int i;
        int i2;
        int i3;
        super.mo24646j();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.f15968A == 0.0f) {
            this.f15968A = intrinsicWidth / intrinsicHeight;
        }
        int i4 = this.f16001n;
        float f = this.f15968A;
        int i5 = (int) (i4 / f);
        int i6 = this.f16002o;
        if (i5 > i6) {
            this.f15978y.set((i4 - ((int) (i6 * f))) / 2, 0.0f, i2 + i3, i6);
        } else {
            this.f15978y.set(0.0f, (i6 - i5) / 2, i4, i5 + i);
        }
        m24661s(intrinsicWidth, intrinsicHeight);
        m24670A(intrinsicWidth, intrinsicHeight);
        InterfaceC12462c interfaceC12462c = this.f15970C;
        if (interfaceC12462c != null) {
            interfaceC12462c.mo5217a(this.f15968A);
        }
        C5702b.InterfaceC5704b interfaceC5704b = this.f16003p;
        if (interfaceC5704b != null) {
            interfaceC5704b.mo24638c(getCurrentScale());
            this.f16003p.mo24637d(getCurrentAngle());
        }
    }

    @Override // com.yalantis.ucrop.view.C5702b
    /* renamed from: l */
    public void mo24644l(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.mo24644l(f, f2, f3);
        } else if (f < 1.0f && getCurrentScale() * f >= getMinScale()) {
            super.mo24644l(f, f2, f3);
        }
    }

    public void setCropBoundsChangeListener(InterfaceC12462c interfaceC12462c) {
        this.f15970C = interfaceC12462c;
    }

    public void setCropRect(RectF rectF) {
        this.f15968A = rectF.width() / rectF.height();
        this.f15978y.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        m24662r();
        m24654z();
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float max;
        float f2;
        if (this.f16007t && !m24658v()) {
            float[] fArr = this.f15998k;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.f15978y.centerX() - f3;
            float centerY = this.f15978y.centerY() - f4;
            this.f15979z.reset();
            this.f15979z.setTranslate(centerX, centerY);
            float[] fArr2 = this.f15997j;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.f15979z.mapPoints(copyOf);
            boolean m24657w = m24657w(copyOf);
            if (m24657w) {
                float[] m24663q = m24663q();
                f2 = -(m24663q[1] + m24663q[3]);
                f = -(m24663q[0] + m24663q[2]);
                max = 0.0f;
            } else {
                RectF rectF = new RectF(this.f15978y);
                this.f15979z.reset();
                this.f15979z.setRotate(getCurrentAngle());
                this.f15979z.mapRect(rectF);
                float[] m2884c = C13265g.m2884c(this.f15997j);
                f = centerX;
                max = (Math.max(rectF.width() / m2884c[0], rectF.height() / m2884c[1]) * currentScale) - currentScale;
                f2 = centerY;
            }
            if (z) {
                RunnableC5700a runnableC5700a = new RunnableC5700a(this, this.f15977J, f3, f4, f, f2, currentScale, max, m24657w);
                this.f15971D = runnableC5700a;
                post(runnableC5700a);
                return;
            }
            m24643m(f, f2);
            if (!m24657w) {
                m24667D(currentScale + max, this.f15978y.centerX(), this.f15978y.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j > 0) {
            this.f15977J = j;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(int i) {
        this.f15975H = i;
    }

    public void setMaxResultImageSizeY(int i) {
        this.f15976I = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.f15969B = f;
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f15968A = f;
            return;
        }
        if (f == 0.0f) {
            this.f15968A = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        } else {
            this.f15968A = f;
        }
        InterfaceC12462c interfaceC12462c = this.f15970C;
        if (interfaceC12462c != null) {
            interfaceC12462c.mo5217a(this.f15968A);
        }
    }

    /* renamed from: t */
    public void m24660t() {
        removeCallbacks(this.f15971D);
        removeCallbacks(this.f15972E);
    }

    /* renamed from: u */
    public void m24659u(Bitmap.CompressFormat compressFormat, int i, InterfaceC12460a interfaceC12460a) {
        m24660t();
        setImageToWrapCropBounds(false);
        new BitmapCropTask(getViewBitmap(), new C12671d(this.f15978y, C13265g.m2883d(this.f15997j), getCurrentScale(), getCurrentAngle()), new C12669b(this.f15975H, this.f15976I, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo()), interfaceC12460a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: v */
    protected boolean m24658v() {
        return m24657w(this.f15997j);
    }

    /* renamed from: w */
    protected boolean m24657w(float[] fArr) {
        this.f15979z.reset();
        this.f15979z.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f15979z.mapPoints(copyOf);
        float[] m2885b = C13265g.m2885b(this.f15978y);
        this.f15979z.mapPoints(m2885b);
        return C13265g.m2883d(copyOf).contains(C13265g.m2883d(m2885b));
    }

    /* renamed from: x */
    public void m24656x(float f) {
        m24645k(f, this.f15978y.centerX(), this.f15978y.centerY());
    }

    /* renamed from: y */
    public void m24655y(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(C12131h.f31513V, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(C12131h.f31514W, 0.0f));
        if (abs != 0.0f && abs2 != 0.0f) {
            this.f15968A = abs / abs2;
        } else {
            this.f15968A = 0.0f;
        }
    }

    /* renamed from: z */
    public void m24654z() {
        setImageToWrapCropBounds(true);
    }

    public C5699a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15978y = new RectF();
        this.f15979z = new Matrix();
        this.f15969B = 10.0f;
        this.f15972E = null;
        this.f15975H = 0;
        this.f15976I = 0;
        this.f15977J = 500L;
    }
}