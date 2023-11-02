package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.C1138f;
import p145i0.C7373b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {

    /* renamed from: p */
    private static final Interpolator f5019p = new LinearInterpolator();

    /* renamed from: q */
    private static final Interpolator f5020q = new C7373b();

    /* renamed from: r */
    private static final int[] f5021r = {-16777216};

    /* renamed from: j */
    private final C1832c f5022j;

    /* renamed from: k */
    private float f5023k;

    /* renamed from: l */
    private Resources f5024l;

    /* renamed from: m */
    private Animator f5025m;

    /* renamed from: n */
    float f5026n;

    /* renamed from: o */
    boolean f5027o;

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1830a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1832c f5028a;

        C1830a(C1832c c1832c) {
            CircularProgressDrawable.this = r1;
            this.f5028a = c1832c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CircularProgressDrawable.this.m35267n(floatValue, this.f5028a);
            CircularProgressDrawable.this.m35279b(floatValue, this.f5028a, false);
            CircularProgressDrawable.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1831b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C1832c f5030a;

        C1831b(C1832c c1832c) {
            CircularProgressDrawable.this = r1;
            this.f5030a = c1832c;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            CircularProgressDrawable.this.m35279b(1.0f, this.f5030a, true);
            this.f5030a.m35266A();
            this.f5030a.m35254l();
            CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
            if (circularProgressDrawable.f5027o) {
                circularProgressDrawable.f5027o = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f5030a.m35242x(false);
                return;
            }
            circularProgressDrawable.f5026n += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CircularProgressDrawable.this.f5026n = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1832c {

        /* renamed from: a */
        final RectF f5032a = new RectF();

        /* renamed from: b */
        final Paint f5033b;

        /* renamed from: c */
        final Paint f5034c;

        /* renamed from: d */
        final Paint f5035d;

        /* renamed from: e */
        float f5036e;

        /* renamed from: f */
        float f5037f;

        /* renamed from: g */
        float f5038g;

        /* renamed from: h */
        float f5039h;

        /* renamed from: i */
        int[] f5040i;

        /* renamed from: j */
        int f5041j;

        /* renamed from: k */
        float f5042k;

        /* renamed from: l */
        float f5043l;

        /* renamed from: m */
        float f5044m;

        /* renamed from: n */
        boolean f5045n;

        /* renamed from: o */
        Path f5046o;

        /* renamed from: p */
        float f5047p;

        /* renamed from: q */
        float f5048q;

        /* renamed from: r */
        int f5049r;

        /* renamed from: s */
        int f5050s;

        /* renamed from: t */
        int f5051t;

        /* renamed from: u */
        int f5052u;

        C1832c() {
            Paint paint = new Paint();
            this.f5033b = paint;
            Paint paint2 = new Paint();
            this.f5034c = paint2;
            Paint paint3 = new Paint();
            this.f5035d = paint3;
            this.f5036e = 0.0f;
            this.f5037f = 0.0f;
            this.f5038g = 0.0f;
            this.f5039h = 5.0f;
            this.f5047p = 1.0f;
            this.f5051t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        void m35266A() {
            this.f5042k = this.f5036e;
            this.f5043l = this.f5037f;
            this.f5044m = this.f5038g;
        }

        /* renamed from: a */
        void m35265a(Canvas canvas, Rect rect) {
            RectF rectF = this.f5032a;
            float f = this.f5048q;
            float f2 = (this.f5039h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f5049r * this.f5047p) / 2.0f, this.f5039h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f5036e;
            float f4 = this.f5038g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f5037f + f4) * 360.0f) - f5;
            this.f5033b.setColor(this.f5052u);
            this.f5033b.setAlpha(this.f5051t);
            float f7 = this.f5039h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f5035d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f5033b);
            m35264b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        void m35264b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f5045n) {
                Path path = this.f5046o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f5046o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f5046o.moveTo(0.0f, 0.0f);
                this.f5046o.lineTo(this.f5049r * this.f5047p, 0.0f);
                Path path3 = this.f5046o;
                float f3 = this.f5047p;
                path3.lineTo((this.f5049r * f3) / 2.0f, this.f5050s * f3);
                this.f5046o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f5049r * this.f5047p) / 2.0f), rectF.centerY() + (this.f5039h / 2.0f));
                this.f5046o.close();
                this.f5034c.setColor(this.f5052u);
                this.f5034c.setAlpha(this.f5051t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f5046o, this.f5034c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m35263c() {
            return this.f5051t;
        }

        /* renamed from: d */
        float m35262d() {
            return this.f5037f;
        }

        /* renamed from: e */
        int m35261e() {
            return this.f5040i[m35260f()];
        }

        /* renamed from: f */
        int m35260f() {
            return (this.f5041j + 1) % this.f5040i.length;
        }

        /* renamed from: g */
        float m35259g() {
            return this.f5036e;
        }

        /* renamed from: h */
        int m35258h() {
            return this.f5040i[this.f5041j];
        }

        /* renamed from: i */
        float m35257i() {
            return this.f5043l;
        }

        /* renamed from: j */
        float m35256j() {
            return this.f5044m;
        }

        /* renamed from: k */
        float m35255k() {
            return this.f5042k;
        }

        /* renamed from: l */
        void m35254l() {
            m35246t(m35260f());
        }

        /* renamed from: m */
        void m35253m() {
            this.f5042k = 0.0f;
            this.f5043l = 0.0f;
            this.f5044m = 0.0f;
            m35241y(0.0f);
            m35244v(0.0f);
            m35243w(0.0f);
        }

        /* renamed from: n */
        void m35252n(int i) {
            this.f5051t = i;
        }

        /* renamed from: o */
        void m35251o(float f, float f2) {
            this.f5049r = (int) f;
            this.f5050s = (int) f2;
        }

        /* renamed from: p */
        void m35250p(float f) {
            if (f != this.f5047p) {
                this.f5047p = f;
            }
        }

        /* renamed from: q */
        void m35249q(float f) {
            this.f5048q = f;
        }

        /* renamed from: r */
        void m35248r(int i) {
            this.f5052u = i;
        }

        /* renamed from: s */
        void m35247s(ColorFilter colorFilter) {
            this.f5033b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        void m35246t(int i) {
            this.f5041j = i;
            this.f5052u = this.f5040i[i];
        }

        /* renamed from: u */
        void m35245u(int[] iArr) {
            this.f5040i = iArr;
            m35246t(0);
        }

        /* renamed from: v */
        void m35244v(float f) {
            this.f5037f = f;
        }

        /* renamed from: w */
        void m35243w(float f) {
            this.f5038g = f;
        }

        /* renamed from: x */
        void m35242x(boolean z) {
            if (this.f5045n != z) {
                this.f5045n = z;
            }
        }

        /* renamed from: y */
        void m35241y(float f) {
            this.f5036e = f;
        }

        /* renamed from: z */
        void m35240z(float f) {
            this.f5039h = f;
            this.f5033b.setStrokeWidth(f);
        }
    }

    public CircularProgressDrawable(Context context) {
        this.f5024l = ((Context) C1138f.m37824f(context)).getResources();
        C1832c c1832c = new C1832c();
        this.f5022j = c1832c;
        c1832c.m35245u(f5021r);
        m35270k(2.5f);
        m35268m();
    }

    /* renamed from: a */
    private void m35280a(float f, C1832c c1832c) {
        m35267n(f, c1832c);
        c1832c.m35241y(c1832c.m35255k() + (((c1832c.m35257i() - 0.01f) - c1832c.m35255k()) * f));
        c1832c.m35244v(c1832c.m35257i());
        c1832c.m35243w(c1832c.m35256j() + ((((float) (Math.floor(c1832c.m35256j() / 0.8f) + 1.0d)) - c1832c.m35256j()) * f));
    }

    /* renamed from: c */
    private int m35278c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    /* renamed from: h */
    private void m35273h(float f) {
        this.f5023k = f;
    }

    /* renamed from: i */
    private void m35272i(float f, float f2, float f3, float f4) {
        C1832c c1832c = this.f5022j;
        float f5 = this.f5024l.getDisplayMetrics().density;
        c1832c.m35240z(f2 * f5);
        c1832c.m35249q(f * f5);
        c1832c.m35246t(0);
        c1832c.m35251o(f3 * f5, f4 * f5);
    }

    /* renamed from: m */
    private void m35268m() {
        C1832c c1832c = this.f5022j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C1830a(c1832c));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f5019p);
        ofFloat.addListener(new C1831b(c1832c));
        this.f5025m = ofFloat;
    }

    /* renamed from: b */
    void m35279b(float f, C1832c c1832c, boolean z) {
        float interpolation;
        float f2;
        if (this.f5027o) {
            m35280a(f, c1832c);
        } else if (f != 1.0f || z) {
            float m35256j = c1832c.m35256j();
            if (f < 0.5f) {
                interpolation = c1832c.m35255k();
                f2 = (f5020q.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m35255k = c1832c.m35255k() + 0.79f;
                interpolation = m35255k - (((1.0f - f5020q.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = m35255k;
            }
            c1832c.m35241y(interpolation);
            c1832c.m35244v(f2);
            c1832c.m35243w(m35256j + (0.20999998f * f));
            m35273h((f + this.f5026n) * 216.0f);
        }
    }

    /* renamed from: d */
    public void m35277d(boolean z) {
        this.f5022j.m35242x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5023k, bounds.exactCenterX(), bounds.exactCenterY());
        this.f5022j.m35265a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m35276e(float f) {
        this.f5022j.m35250p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m35275f(int... iArr) {
        this.f5022j.m35245u(iArr);
        this.f5022j.m35246t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m35274g(float f) {
        this.f5022j.m35243w(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5022j.m35263c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5025m.isRunning();
    }

    /* renamed from: j */
    public void m35271j(float f, float f2) {
        this.f5022j.m35241y(f);
        this.f5022j.m35244v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m35270k(float f) {
        this.f5022j.m35240z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m35269l(int i) {
        if (i == 0) {
            m35272i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m35272i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: n */
    void m35267n(float f, C1832c c1832c) {
        if (f > 0.75f) {
            c1832c.m35248r(m35278c((f - 0.75f) / 0.25f, c1832c.m35258h(), c1832c.m35261e()));
        } else {
            c1832c.m35248r(c1832c.m35258h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5022j.m35252n(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5022j.m35247s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f5025m.cancel();
        this.f5022j.m35266A();
        if (this.f5022j.m35262d() != this.f5022j.m35259g()) {
            this.f5027o = true;
            this.f5025m.setDuration(666L);
            this.f5025m.start();
            return;
        }
        this.f5022j.m35246t(0);
        this.f5022j.m35253m();
        this.f5025m.setDuration(1332L);
        this.f5025m.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5025m.cancel();
        m35273h(0.0f);
        this.f5022j.m35242x(false);
        this.f5022j.m35246t(0);
        this.f5022j.m35253m();
        invalidateSelf();
    }
}