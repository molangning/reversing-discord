package com.p046BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.PixelUtil;

/* renamed from: com.BV.LinearGradient.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2693b extends View {

    /* renamed from: j */
    private final Paint f7193j;

    /* renamed from: k */
    private Path f7194k;

    /* renamed from: l */
    private RectF f7195l;

    /* renamed from: m */
    private LinearGradient f7196m;

    /* renamed from: n */
    private float[] f7197n;

    /* renamed from: o */
    private float[] f7198o;

    /* renamed from: p */
    private float[] f7199p;

    /* renamed from: q */
    private int[] f7200q;

    /* renamed from: r */
    private boolean f7201r;

    /* renamed from: s */
    private float[] f7202s;

    /* renamed from: t */
    private float f7203t;

    /* renamed from: u */
    private int[] f7204u;

    /* renamed from: v */
    private float[] f7205v;

    public C2693b(Context context) {
        super(context);
        this.f7193j = new Paint(1);
        this.f7198o = new float[]{0.0f, 0.0f};
        this.f7199p = new float[]{0.0f, 1.0f};
        this.f7201r = false;
        this.f7202s = new float[]{0.5f, 0.5f};
        this.f7203t = 45.0f;
        this.f7204u = new int[]{0, 0};
        this.f7205v = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* renamed from: a */
    private float[] m32714a(float f) {
        float sqrt = (float) Math.sqrt(2.0d);
        double d = (f - 90.0f) * 0.017453292f;
        return new float[]{((float) Math.cos(d)) * sqrt, ((float) Math.sin(d)) * sqrt};
    }

    /* renamed from: b */
    private void m32713b() {
        int[] iArr = this.f7200q;
        if (iArr != null) {
            float[] fArr = this.f7197n;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f7198o;
                float[] fArr3 = this.f7199p;
                if (this.f7201r && this.f7202s != null) {
                    float[] m32714a = m32714a(this.f7203t);
                    float[] fArr4 = this.f7202s;
                    float[] fArr5 = {fArr4[0] - (m32714a[0] / 2.0f), fArr4[1] - (m32714a[1] / 2.0f)};
                    fArr3 = new float[]{fArr4[0] + (m32714a[0] / 2.0f), fArr4[1] + (m32714a[1] / 2.0f)};
                    fArr2 = fArr5;
                }
                float f = fArr2[0];
                int[] iArr2 = this.f7204u;
                int i = iArr2[0];
                float f2 = i * f;
                float f3 = fArr2[1];
                int i2 = iArr2[1];
                LinearGradient linearGradient = new LinearGradient(f2, f3 * i2, fArr3[0] * i, fArr3[1] * i2, this.f7200q, this.f7197n, Shader.TileMode.CLAMP);
                this.f7196m = linearGradient;
                this.f7193j.setShader(linearGradient);
                invalidate();
            }
        }
    }

    /* renamed from: c */
    private void m32712c() {
        if (this.f7194k == null) {
            this.f7194k = new Path();
            this.f7195l = new RectF();
        }
        this.f7194k.reset();
        RectF rectF = this.f7195l;
        int[] iArr = this.f7204u;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f7194k.addRoundRect(this.f7195l, this.f7205v, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f7194k;
        if (path == null) {
            canvas.drawPaint(this.f7193j);
        } else {
            canvas.drawPath(path, this.f7193j);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f7204u = new int[]{i, i2};
        m32712c();
        m32713b();
    }

    public void setAngle(float f) {
        this.f7203t = f;
        m32713b();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.f7202s = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m32713b();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i));
        }
        this.f7205v = fArr;
        m32712c();
        m32713b();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.f7200q = iArr;
        m32713b();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.f7199p = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m32713b();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.f7197n = fArr;
        m32713b();
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.f7198o = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m32713b();
    }

    public void setUseAngle(boolean z) {
        this.f7201r = z;
        m32713b();
    }
}
