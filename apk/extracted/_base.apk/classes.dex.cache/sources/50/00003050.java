package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.C0539m;
import p354te.C12670c;
import se.InterfaceC12461b;
import ve.C13256a;
import ve.C13259d;
import ve.C13265g;

/* renamed from: com.yalantis.ucrop.view.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5702b extends C0539m {

    /* renamed from: j */
    protected final float[] f15997j;

    /* renamed from: k */
    protected final float[] f15998k;

    /* renamed from: l */
    private final float[] f15999l;

    /* renamed from: m */
    protected Matrix f16000m;

    /* renamed from: n */
    protected int f16001n;

    /* renamed from: o */
    protected int f16002o;

    /* renamed from: p */
    protected InterfaceC5704b f16003p;

    /* renamed from: q */
    private float[] f16004q;

    /* renamed from: r */
    private float[] f16005r;

    /* renamed from: s */
    protected boolean f16006s;

    /* renamed from: t */
    protected boolean f16007t;

    /* renamed from: u */
    private int f16008u;

    /* renamed from: v */
    private String f16009v;

    /* renamed from: w */
    private String f16010w;

    /* renamed from: x */
    private C12670c f16011x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.view.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5703a implements InterfaceC12461b {
        C5703a() {
            C5702b.this = r1;
        }

        @Override // se.InterfaceC12461b
        /* renamed from: a */
        public void mo5218a(Bitmap bitmap, C12670c c12670c, String str, String str2) {
            C5702b.this.f16009v = str;
            C5702b.this.f16010w = str2;
            C5702b.this.f16011x = c12670c;
            C5702b c5702b = C5702b.this;
            c5702b.f16006s = true;
            c5702b.setImageBitmap(bitmap);
        }

        @Override // se.InterfaceC12461b
        public void onFailure(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            InterfaceC5704b interfaceC5704b = C5702b.this.f16003p;
            if (interfaceC5704b != null) {
                interfaceC5704b.mo24639b(exc);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5704b {
        /* renamed from: a */
        void mo24640a();

        /* renamed from: b */
        void mo24639b(Exception exc);

        /* renamed from: c */
        void mo24638c(float f);

        /* renamed from: d */
        void mo24637d(float f);
    }

    public C5702b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: o */
    private void m24641o() {
        this.f16000m.mapPoints(this.f15997j, this.f16004q);
        this.f16000m.mapPoints(this.f15998k, this.f16005r);
    }

    /* renamed from: f */
    public float m24650f(Matrix matrix) {
        return (float) (-(Math.atan2(m24648h(matrix, 1), m24648h(matrix, 0)) * 57.29577951308232d));
    }

    /* renamed from: g */
    public float m24649g(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(m24648h(matrix, 0), 2.0d) + Math.pow(m24648h(matrix, 3), 2.0d));
    }

    public float getCurrentAngle() {
        return m24650f(this.f16000m);
    }

    public float getCurrentScale() {
        return m24649g(this.f16000m);
    }

    public C12670c getExifInfo() {
        return this.f16011x;
    }

    public String getImageInputPath() {
        return this.f16009v;
    }

    public String getImageOutputPath() {
        return this.f16010w;
    }

    public int getMaxBitmapSize() {
        if (this.f16008u <= 0) {
            this.f16008u = C13256a.m2915b(getContext());
        }
        return this.f16008u;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() != null && (getDrawable() instanceof C13259d)) {
            return ((C13259d) getDrawable()).m2904a();
        }
        return null;
    }

    /* renamed from: h */
    protected float m24648h(Matrix matrix, int i) {
        matrix.getValues(this.f15999l);
        return this.f15999l[i];
    }

    /* renamed from: i */
    public void mo24647i() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: j */
    public void mo24646j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.f16004q = C13265g.m2885b(rectF);
        this.f16005r = C13265g.m2886a(rectF);
        this.f16007t = true;
        InterfaceC5704b interfaceC5704b = this.f16003p;
        if (interfaceC5704b != null) {
            interfaceC5704b.mo24640a();
        }
    }

    /* renamed from: k */
    public void m24645k(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f16000m.postRotate(f, f2, f3);
            setImageMatrix(this.f16000m);
            InterfaceC5704b interfaceC5704b = this.f16003p;
            if (interfaceC5704b != null) {
                interfaceC5704b.mo24637d(m24650f(this.f16000m));
            }
        }
    }

    /* renamed from: l */
    public void mo24644l(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f16000m.postScale(f, f, f2, f3);
            setImageMatrix(this.f16000m);
            InterfaceC5704b interfaceC5704b = this.f16003p;
            if (interfaceC5704b != null) {
                interfaceC5704b.mo24638c(m24649g(this.f16000m));
            }
        }
    }

    /* renamed from: m */
    public void m24643m(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f16000m.postTranslate(f, f2);
            setImageMatrix(this.f16000m);
        }
    }

    /* renamed from: n */
    public void m24642n(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        C13256a.m2913d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new C5703a());
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.f16006s && !this.f16007t)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f16001n = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f16002o = (getHeight() - getPaddingBottom()) - paddingTop;
            mo24646j();
        }
    }

    @Override // androidx.appcompat.widget.C0539m, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C13259d(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f16000m.set(matrix);
        m24641o();
    }

    public void setMaxBitmapSize(int i) {
        this.f16008u = i;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(InterfaceC5704b interfaceC5704b) {
        this.f16003p = interfaceC5704b;
    }

    public C5702b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15997j = new float[8];
        this.f15998k = new float[2];
        this.f15999l = new float[9];
        this.f16000m = new Matrix();
        this.f16006s = false;
        this.f16007t = false;
        this.f16008u = 0;
        mo24647i();
    }
}