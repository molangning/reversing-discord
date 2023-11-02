package p012ab;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.C0995a;

/* renamed from: ab.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0137a {

    /* renamed from: i */
    private static final int[] f509i = new int[3];

    /* renamed from: j */
    private static final float[] f510j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f511k = new int[4];

    /* renamed from: l */
    private static final float[] f512l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f513a;

    /* renamed from: b */
    private final Paint f514b;

    /* renamed from: c */
    private final Paint f515c;

    /* renamed from: d */
    private int f516d;

    /* renamed from: e */
    private int f517e;

    /* renamed from: f */
    private int f518f;

    /* renamed from: g */
    private final Path f519g;

    /* renamed from: h */
    private Paint f520h;

    public C0137a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m41115a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z;
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f519g;
        if (z) {
            int[] iArr = f511k;
            iArr[0] = 0;
            iArr[1] = this.f518f;
            iArr[2] = this.f517e;
            iArr[3] = this.f516d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f511k;
            iArr2[0] = 0;
            iArr2[1] = this.f516d;
            iArr2[2] = this.f517e;
            iArr2[3] = this.f518f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = f512l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f514b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f511k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f520h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f514b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m41114b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f509i;
        iArr[0] = this.f518f;
        iArr[1] = this.f517e;
        iArr[2] = this.f516d;
        Paint paint = this.f515c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f510j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f515c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m41113c() {
        return this.f513a;
    }

    /* renamed from: d */
    public void m41112d(int i) {
        this.f516d = C0995a.m38177k(i, 68);
        this.f517e = C0995a.m38177k(i, 20);
        this.f518f = C0995a.m38177k(i, 0);
        this.f513a.setColor(this.f516d);
    }

    public C0137a(int i) {
        this.f519g = new Path();
        this.f520h = new Paint();
        this.f513a = new Paint();
        m41112d(i);
        this.f520h.setColor(0);
        Paint paint = new Paint(4);
        this.f514b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f515c = new Paint(paint);
    }
}
