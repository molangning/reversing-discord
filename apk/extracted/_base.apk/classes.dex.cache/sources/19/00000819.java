package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C1365w0;
import p290q0.C11668a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class CircleImageView extends ImageView {

    /* renamed from: j */
    private Animation.AnimationListener f5013j;

    /* renamed from: k */
    private int f5014k;

    /* renamed from: l */
    private int f5015l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.swiperefreshlayout.widget.CircleImageView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1829a extends OvalShape {

        /* renamed from: j */
        private Paint f5016j = new Paint();

        /* renamed from: k */
        private int f5017k;

        /* renamed from: l */
        private CircleImageView f5018l;

        C1829a(CircleImageView circleImageView, int i) {
            this.f5018l = circleImageView;
            this.f5017k = i;
            m35281b((int) rect().width());
        }

        /* renamed from: b */
        private void m35281b(int i) {
            float f = i / 2;
            this.f5016j.setShader(new RadialGradient(f, f, this.f5017k, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = this.f5018l.getWidth() / 2;
            float height = this.f5018l.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f5016j);
            canvas.drawCircle(width2, height, width - this.f5017k, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            m35281b((int) f);
        }
    }

    public CircleImageView(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f5014k = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C11668a.f30433f);
        this.f5015l = obtainStyledAttributes.getColor(C11668a.f30434g, -328966);
        obtainStyledAttributes.recycle();
        if (m35283a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1365w0.m37169y0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1829a(this, this.f5014k));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f5014k, i2, i, 503316480);
            int i3 = this.f5014k;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f5015l);
        C1365w0.m37177u0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m35283a() {
        return true;
    }

    /* renamed from: b */
    public void m35282b(Animation.AnimationListener animationListener) {
        this.f5013j = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f5013j;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f5013j;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m35283a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f5014k * 2), getMeasuredHeight() + (this.f5014k * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f5015l = i;
        }
    }
}