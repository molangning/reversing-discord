package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.SVGLength;
import p414x2.C13677a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.horcrux.svg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5201a {

    /* renamed from: a */
    private final EnumC5202a f14580a;

    /* renamed from: b */
    private final SVGLength[] f14581b;

    /* renamed from: c */
    private ReadableArray f14582c;

    /* renamed from: d */
    private final boolean f14583d;

    /* renamed from: e */
    private boolean f14584e;

    /* renamed from: f */
    private Matrix f14585f;

    /* renamed from: g */
    private Rect f14586g;

    /* renamed from: h */
    private C5247v f14587h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5202a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5203b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5201a(EnumC5202a enumC5202a, SVGLength[] sVGLengthArr, EnumC5203b enumC5203b) {
        boolean z;
        this.f14580a = enumC5202a;
        this.f14581b = sVGLengthArr;
        if (enumC5203b == EnumC5203b.OBJECT_BOUNDING_BOX) {
            z = true;
        } else {
            z = false;
        }
        this.f14583d = z;
    }

    /* renamed from: a */
    private RectF m25971a(RectF rectF) {
        float f;
        float f2;
        if (!this.f14583d) {
            rectF = new RectF(this.f14586g);
        }
        float width = rectF.width();
        float height = rectF.height();
        if (this.f14583d) {
            f = rectF.left;
            f2 = rectF.top;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new RectF(f, f2, width + f, height + f2);
    }

    /* renamed from: b */
    private double m25970b(SVGLength sVGLength, double d, float f, float f2) {
        double d2;
        if (this.f14583d && sVGLength.f14535b == SVGLength.UnitType.NUMBER) {
            d2 = d;
        } else {
            d2 = f;
        }
        return C5250x.m25663a(sVGLength, d, 0.0d, d2, f2);
    }

    /* renamed from: c */
    private static void m25969c(ReadableArray readableArray, int i, float[] fArr, int[] iArr, float f) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            fArr[i2] = (float) readableArray.getDouble(i3);
            int i4 = readableArray.getInt(i3 + 1);
            iArr[i2] = (i4 & 16777215) | (Math.round((i4 >>> 24) * f) << 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m25968d(EnumC5203b enumC5203b) {
        this.f14584e = enumC5203b == EnumC5203b.OBJECT_BOUNDING_BOX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m25967e(ReadableArray readableArray) {
        this.f14582c = readableArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m25966f(Matrix matrix) {
        this.f14585f = matrix;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m25965g(C5247v c5247v) {
        this.f14587h = c5247v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m25964h(Rect rect) {
        this.f14586g = rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m25963i(Paint paint, RectF rectF, float f, float f2) {
        int[] iArr;
        float[] fArr;
        RectF m25971a = m25971a(rectF);
        float width = m25971a.width();
        float height = m25971a.height();
        float f3 = m25971a.left;
        float f4 = m25971a.top;
        float textSize = paint.getTextSize();
        if (this.f14580a == EnumC5202a.PATTERN) {
            double d = width;
            double m25970b = m25970b(this.f14581b[0], d, f, textSize);
            double d2 = height;
            double m25970b2 = m25970b(this.f14581b[1], d2, f, textSize);
            double m25970b3 = m25970b(this.f14581b[2], d, f, textSize);
            double m25970b4 = m25970b(this.f14581b[3], d2, f, textSize);
            if (m25970b3 > 1.0d && m25970b4 > 1.0d) {
                Bitmap createBitmap = Bitmap.createBitmap((int) m25970b3, (int) m25970b4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                RectF viewBox = this.f14587h.getViewBox();
                if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                    RectF rectF2 = new RectF((float) m25970b, (float) m25970b2, (float) m25970b3, (float) m25970b4);
                    C5247v c5247v = this.f14587h;
                    canvas.concat(C5248v0.m25664a(viewBox, rectF2, c5247v.f14872v, c5247v.f14873w));
                }
                if (this.f14584e) {
                    canvas.scale(width / f, height / f);
                }
                this.f14587h.draw(canvas, new Paint(), f2);
                Matrix matrix = new Matrix();
                Matrix matrix2 = this.f14585f;
                if (matrix2 != null) {
                    matrix.preConcat(matrix2);
                }
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                return;
            }
            return;
        }
        int size = this.f14582c.size();
        if (size == 0) {
            C13677a.m1870H(ReactConstants.TAG, "Gradient contains no stops");
            return;
        }
        int i = size / 2;
        int[] iArr2 = new int[i];
        float[] fArr2 = new float[i];
        m25969c(this.f14582c, i, fArr2, iArr2, f2);
        if (i == 1) {
            int[] iArr3 = {iArr2[0], iArr2[0]};
            float[] fArr3 = {fArr2[0], fArr2[0]};
            C13677a.m1870H(ReactConstants.TAG, "Gradient contains only one stop");
            iArr = iArr3;
            fArr = fArr3;
        } else {
            iArr = iArr2;
            fArr = fArr2;
        }
        EnumC5202a enumC5202a = this.f14580a;
        if (enumC5202a == EnumC5202a.LINEAR_GRADIENT) {
            double d3 = width;
            double m25970b5 = m25970b(this.f14581b[0], d3, f, textSize);
            double d4 = f3;
            double d5 = height;
            double d6 = f4;
            LinearGradient linearGradient = new LinearGradient((float) (m25970b5 + d4), (float) (m25970b(this.f14581b[1], d5, f, textSize) + d6), (float) (m25970b(this.f14581b[2], d3, f, textSize) + d4), (float) (m25970b(this.f14581b[3], d5, f, textSize) + d6), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f14585f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f14585f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
        } else if (enumC5202a == EnumC5202a.RADIAL_GRADIENT) {
            double d7 = width;
            double m25970b6 = m25970b(this.f14581b[2], d7, f, textSize);
            double d8 = height;
            double m25970b7 = m25970b(this.f14581b[3], d8, f, textSize) / m25970b6;
            RadialGradient radialGradient = new RadialGradient((float) (m25970b(this.f14581b[4], d7, f, textSize) + f3), (float) (m25970b(this.f14581b[5], d8 / m25970b7, f, textSize) + (f4 / m25970b7)), (float) m25970b6, iArr, fArr, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) m25970b7);
            Matrix matrix5 = this.f14585f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
